package y6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: k  reason: collision with root package name */
    public static final Uri f20497k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l  reason: collision with root package name */
    static z6.a f20498l = new z6.b();

    /* renamed from: m  reason: collision with root package name */
    private static String f20499m;

    /* renamed from: a  reason: collision with root package name */
    protected Exception f20500a;

    /* renamed from: b  reason: collision with root package name */
    private x6.h f20501b;

    /* renamed from: c  reason: collision with root package name */
    private Context f20502c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f20503d;

    /* renamed from: e  reason: collision with root package name */
    private int f20504e;

    /* renamed from: f  reason: collision with root package name */
    private String f20505f;

    /* renamed from: g  reason: collision with root package name */
    private int f20506g;

    /* renamed from: h  reason: collision with root package name */
    private InputStream f20507h;

    /* renamed from: i  reason: collision with root package name */
    private HttpURLConnection f20508i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, String> f20509j = new HashMap();

    public e(x6.h hVar, w5.f fVar) {
        s.j(hVar);
        s.j(fVar);
        this.f20501b = hVar;
        this.f20502c = fVar.m();
        H("x-firebase-gmpid", fVar.r().c());
    }

    private final void B(String str, String str2) {
        E(str, str2);
        try {
            F();
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + e() + " " + v(), e10);
            this.f20500a = e10;
            this.f20504e = -2;
        }
        D();
    }

    private void F() {
        if (w()) {
            A(this.f20507h);
        } else {
            x(this.f20507h);
        }
    }

    private void b(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] i10;
        int j10;
        String str3;
        s.j(httpURLConnection);
        if (TextUtils.isEmpty(str)) {
            Log.w("NetworkRequest", "no auth token for request");
        } else {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        }
        if (TextUtils.isEmpty(str2)) {
            Log.w("NetworkRequest", "No App Check token for request.");
        } else {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        }
        StringBuilder sb = new StringBuilder("Android/");
        String g10 = g(this.f20502c);
        if (!TextUtils.isEmpty(g10)) {
            sb.append(g10);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", sb.toString());
        for (Map.Entry<String, String> entry : this.f20509j.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject h10 = h();
        if (h10 != null) {
            i10 = h10.toString().getBytes("UTF-8");
            j10 = i10.length;
        } else {
            i10 = i();
            j10 = j();
            if (j10 == 0 && i10 != null) {
                j10 = i10.length;
            }
        }
        if (i10 == null || i10.length <= 0) {
            str3 = "0";
        } else {
            if (h10 != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            str3 = Integer.toString(j10);
        }
        httpURLConnection.setRequestProperty("Content-Length", str3);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (i10 == null || i10.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(i10, 0, j10);
        } finally {
            bufferedOutputStream.close();
        }
    }

    private HttpURLConnection c() {
        Uri v10 = v();
        Map<String, String> m10 = m();
        if (m10 != null) {
            Uri.Builder buildUpon = v10.buildUpon();
            for (Map.Entry<String, String> entry : m10.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            v10 = buildUpon.build();
        }
        return f20498l.a(new URL(v10.toString()));
    }

    private boolean d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f20500a = new SocketException("Network subsystem is unavailable");
            this.f20504e = -2;
            return false;
        }
        return true;
    }

    private static String g(Context context) {
        if (f20499m == null) {
            try {
                f20499m = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("NetworkRequest", "Unable to find gmscore in package manager", e10);
            }
            if (f20499m == null) {
                f20499m = "[No Gmscore]";
            }
        }
        return f20499m;
    }

    private static String l(Uri uri) {
        String path = uri.getPath();
        return path == null ? "" : path.startsWith("/") ? path.substring(1) : path;
    }

    private void y(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f20505f = sb.toString();
        if (w()) {
            return;
        }
        this.f20500a = new IOException(this.f20505f);
    }

    private void z(HttpURLConnection httpURLConnection) {
        s.j(httpURLConnection);
        this.f20504e = httpURLConnection.getResponseCode();
        this.f20503d = httpURLConnection.getHeaderFields();
        this.f20506g = httpURLConnection.getContentLength();
        this.f20507h = w() ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
    }

    protected void A(InputStream inputStream) {
        y(inputStream);
    }

    public void C(String str, String str2, Context context) {
        if (d(context)) {
            B(str, str2);
        }
    }

    public void D() {
        HttpURLConnection httpURLConnection = this.f20508i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void E(String str, String str2) {
        if (this.f20500a != null) {
            this.f20504e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + e() + " " + v());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f20502c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f20504e = -2;
            this.f20500a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection c10 = c();
            this.f20508i = c10;
            c10.setRequestMethod(e());
            b(this.f20508i, str, str2);
            z(this.f20508i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f20504e);
            }
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + e() + " " + v(), e10);
            this.f20500a = e10;
            this.f20504e = -2;
        }
    }

    public final void G() {
        this.f20500a = null;
        this.f20504e = 0;
    }

    public void H(String str, String str2) {
        this.f20509j.put(str, str2);
    }

    public <TResult> void a(TaskCompletionSource<TResult> taskCompletionSource, TResult tresult) {
        Exception f10 = f();
        if (w() && f10 == null) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(com.google.firebase.storage.j.e(f10, p()));
        }
    }

    protected abstract String e();

    public Exception f() {
        return this.f20500a;
    }

    protected JSONObject h() {
        return null;
    }

    protected byte[] i() {
        return null;
    }

    protected int j() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        return l(this.f20501b.a());
    }

    protected Map<String, String> m() {
        return null;
    }

    public String n() {
        return this.f20505f;
    }

    public JSONObject o() {
        if (TextUtils.isEmpty(this.f20505f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f20505f);
        } catch (JSONException e10) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f20505f, e10);
            return new JSONObject();
        }
    }

    public int p() {
        return this.f20504e;
    }

    public Map<String, List<String>> q() {
        return this.f20503d;
    }

    public String r(String str) {
        List<String> list;
        Map<String, List<String>> q10 = q();
        if (q10 == null || (list = q10.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public int s() {
        return this.f20506g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x6.h t() {
        return this.f20501b;
    }

    public InputStream u() {
        return this.f20507h;
    }

    public Uri v() {
        return this.f20501b.c();
    }

    public boolean w() {
        int i10 = this.f20504e;
        return i10 >= 200 && i10 < 300;
    }

    protected void x(InputStream inputStream) {
        y(inputStream);
    }
}
