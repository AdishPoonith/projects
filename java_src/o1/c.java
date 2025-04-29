package o1;

import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import ka.d;
import ka.p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import p0.f0;
import s9.u;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14390a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final String f14391b = "/.well-known/oauth/openid/keys/";

    private c() {
    }

    public static final PublicKey b(String key) {
        String r10;
        String r11;
        String r12;
        l.e(key, "key");
        r10 = p.r(key, "\n", "", false, 4, null);
        r11 = p.r(r10, "-----BEGIN PUBLIC KEY-----", "", false, 4, null);
        r12 = p.r(r11, "-----END PUBLIC KEY-----", "", false, 4, null);
        byte[] decode = Base64.decode(r12, 0);
        l.d(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        l.d(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    public static final String c(final String kid) {
        l.e(kid, "kid");
        f0 f0Var = f0.f14852a;
        final URL url = new URL("https", l.k("www.", f0.u()), f14391b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final s sVar = new s();
        f0.t().execute(new Runnable() { // from class: o1.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(url, sVar, kid, reentrantLock, newCondition);
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) sVar.f12857j;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final void d(URL openIdKeyUrl, s result, String kid, ReentrantLock lock, Condition condition) {
        l.e(openIdKeyUrl, "$openIdKeyUrl");
        l.e(result, "$result");
        l.e(kid, "$kid");
        l.e(lock, "$lock");
        URLConnection openConnection = openIdKeyUrl.openConnection();
        Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                l.d(inputStream, "connection.inputStream");
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, d.f12805b);
                String c10 = ba.b.c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                result.f12857j = new JSONObject(c10).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    u uVar = u.f17878a;
                } finally {
                }
            } catch (Exception e10) {
                String name = f14390a.getClass().getName();
                String message = e10.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    u uVar2 = u.f17878a;
                } finally {
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                u uVar3 = u.f17878a;
                throw th;
            } finally {
            }
        }
    }

    public static final boolean e(PublicKey publicKey, String data, String signature) {
        l.e(publicKey, "publicKey");
        l.e(data, "data");
        l.e(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(d.f12805b);
            l.d(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            l.d(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
