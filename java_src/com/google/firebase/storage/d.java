package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final w5.f f6916a;

    /* renamed from: b  reason: collision with root package name */
    private final s6.b<a6.b> f6917b;

    /* renamed from: c  reason: collision with root package name */
    private final s6.b<z5.b> f6918c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6919d;

    /* renamed from: e  reason: collision with root package name */
    private long f6920e = 600000;

    /* renamed from: f  reason: collision with root package name */
    private long f6921f = 60000;

    /* renamed from: g  reason: collision with root package name */
    private long f6922g = 600000;

    /* renamed from: h  reason: collision with root package name */
    private long f6923h = 120000;

    /* renamed from: i  reason: collision with root package name */
    private f6.a f6924i;

    /* loaded from: classes.dex */
    class a implements z5.a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, w5.f fVar, s6.b<a6.b> bVar, s6.b<z5.b> bVar2) {
        this.f6919d = str;
        this.f6916a = fVar;
        this.f6917b = bVar;
        this.f6918c = bVar2;
        if (bVar2 == null || bVar2.get() == null) {
            return;
        }
        bVar2.get().b(new a());
    }

    private String d() {
        return this.f6919d;
    }

    public static d f(w5.f fVar) {
        c4.s.b(fVar != null, "Null is not a valid value for the FirebaseApp.");
        String h10 = fVar.r().h();
        if (h10 == null) {
            return h(fVar, null);
        }
        try {
            return h(fVar, x6.i.d(fVar, "gs://" + fVar.r().h()));
        } catch (UnsupportedEncodingException e10) {
            Log.e("FirebaseStorage", "Unable to parse bucket:" + h10, e10);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    public static d g(w5.f fVar, String str) {
        c4.s.b(fVar != null, "Null is not a valid value for the FirebaseApp.");
        c4.s.b(str != null, "Null is not a valid value for the Firebase Storage URL.");
        if (str.toLowerCase().startsWith("gs://")) {
            try {
                return h(fVar, x6.i.d(fVar, str));
            } catch (UnsupportedEncodingException e10) {
                Log.e("FirebaseStorage", "Unable to parse url:" + str, e10);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        }
        throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
    }

    private static d h(w5.f fVar, Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            c4.s.k(fVar, "Provided FirebaseApp must not be null.");
            e eVar = (e) fVar.k(e.class);
            c4.s.k(eVar, "Firebase Storage component is not present.");
            return eVar.a(host);
        }
        throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
    }

    private l n(Uri uri) {
        c4.s.k(uri, "uri must not be null");
        String d10 = d();
        c4.s.b(TextUtils.isEmpty(d10) || uri.getAuthority().equalsIgnoreCase(d10), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new l(uri, this);
    }

    public w5.f a() {
        return this.f6916a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z5.b b() {
        s6.b<z5.b> bVar = this.f6918c;
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a6.b c() {
        s6.b<a6.b> bVar = this.f6917b;
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f6.a e() {
        return this.f6924i;
    }

    public long i() {
        return this.f6921f;
    }

    public long j() {
        return this.f6922g;
    }

    public long k() {
        return this.f6923h;
    }

    public long l() {
        return this.f6920e;
    }

    public l m() {
        if (TextUtils.isEmpty(d())) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        return n(new Uri.Builder().scheme("gs").authority(d()).path("/").build());
    }

    public l o(String str) {
        c4.s.b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        return m().g(str);
    }

    public void p(long j10) {
        this.f6922g = j10;
    }

    public void q(long j10) {
        this.f6923h = j10;
    }

    public void r(long j10) {
        this.f6920e = j10;
    }

    public void s(String str, int i10) {
        this.f6924i = new f6.a(str, i10);
    }
}
