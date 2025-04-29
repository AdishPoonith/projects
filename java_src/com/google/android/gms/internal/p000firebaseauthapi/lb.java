package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lb  reason: invalid package */
/* loaded from: classes.dex */
public final class lb {

    /* renamed from: a  reason: collision with root package name */
    public static final as f4943a = b(16);

    /* renamed from: b  reason: collision with root package name */
    public static final as f4944b = b(32);

    /* renamed from: c  reason: collision with root package name */
    public static final as f4945c = a(16, 16);

    /* renamed from: d  reason: collision with root package name */
    public static final as f4946d = a(32, 16);

    /* renamed from: e  reason: collision with root package name */
    public static final as f4947e = c(16, 16, 32, 16, 5);

    /* renamed from: f  reason: collision with root package name */
    public static final as f4948f = c(32, 16, 32, 32, 5);

    /* renamed from: g  reason: collision with root package name */
    public static final as f4949g;

    /* renamed from: h  reason: collision with root package name */
    public static final as f4950h;

    static {
        zr C = as.C();
        new qe();
        C.s("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        ct ctVar = ct.TINK;
        C.r(ctVar);
        f4949g = (as) C.j();
        zr C2 = as.C();
        new jf();
        C2.s("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        C2.r(ctVar);
        f4950h = (as) C2.j();
    }

    public static as a(int i10, int i11) {
        no D = oo.D();
        D.r(i10);
        qo D2 = ro.D();
        D2.r(16);
        D.s((ro) D2.j());
        zr C = as.C();
        C.t(((oo) D.j()).zzo());
        new tc();
        C.s("type.googleapis.com/google.crypto.tink.AesEaxKey");
        C.r(ct.TINK);
        return (as) C.j();
    }

    public static as b(int i10) {
        wo D = xo.D();
        D.r(i10);
        zr C = as.C();
        C.t(((xo) D.j()).zzo());
        new kd();
        C.s("type.googleapis.com/google.crypto.tink.AesGcmKey");
        C.r(ct.TINK);
        return (as) C.j();
    }

    public static as c(int i10, int i11, int i12, int i13, int i14) {
        eo D = fo.D();
        ho D2 = io.D();
        D2.r(16);
        D.s((io) D2.j());
        D.r(i10);
        xq D3 = yq.D();
        ar D4 = br.D();
        D4.s(5);
        D4.r(i13);
        D3.s((br) D4.j());
        D3.r(32);
        xn C = yn.C();
        C.r((fo) D.j());
        C.s((yq) D3.j());
        zr C2 = as.C();
        C2.t(((yn) C.j()).zzo());
        new xb();
        C2.s("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        C2.r(ct.TINK);
        return (as) C2.j();
    }
}
