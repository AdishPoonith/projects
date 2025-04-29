package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import c4.s;
import com.google.firebase.auth.FirebaseAuth;
import f4.a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import w5.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k  reason: invalid package */
/* loaded from: classes.dex */
public final class k extends AsyncTask {

    /* renamed from: g  reason: collision with root package name */
    private static final a f4840g = new a("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a  reason: collision with root package name */
    private final String f4841a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4842b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f4843c;

    /* renamed from: d  reason: collision with root package name */
    private final Uri.Builder f4844d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4845e;

    /* renamed from: f  reason: collision with root package name */
    private final f f4846f;

    public k(String str, String str2, Intent intent, f fVar, m mVar) {
        this.f4841a = s.f(str);
        this.f4846f = (f) s.j(fVar);
        s.f(str2);
        s.j(intent);
        String f10 = s.f(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(mVar.d(f10)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", f10).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) s.j(str2));
        this.f4842b = buildUpon.build().toString();
        this.f4843c = new WeakReference(mVar);
        this.f4844d = mVar.c(intent, str, str2);
        this.f4845e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(j jVar) {
        String str;
        Uri.Builder builder;
        m mVar = (m) this.f4843c.get();
        String str2 = null;
        if (jVar != null) {
            str2 = jVar.c();
            str = jVar.d();
        } else {
            str = null;
        }
        if (mVar == null) {
            f4840g.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.f4844d) == null) {
            mVar.q(this.f4841a, l.a(str));
        } else {
            builder.authority(str2);
            mVar.l(this.f4844d.build(), this.f4841a, FirebaseAuth.getInstance(this.f4846f).K());
        }
    }

    private static byte[] b(InputStream inputStream, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0077 A[Catch: sx -> 0x00fa, NullPointerException -> 0x0111, IOException -> 0x0128, TryCatch #1 {IOException -> 0x0128, blocks: (B:6:0x0014, B:8:0x0054, B:9:0x0071, B:11:0x0077, B:13:0x0085, B:15:0x008d, B:27:0x00dc, B:26:0x00ca), top: B:38:0x0014 }] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c7 -> B:27:0x00dc). Please submit an issue!!! */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r8) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.k.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(Object obj) {
        j jVar = (j) obj;
        onPostExecute(null);
    }
}
