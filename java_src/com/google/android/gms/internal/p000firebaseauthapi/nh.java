package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nh  reason: invalid package */
/* loaded from: classes.dex */
public final class nh {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f5074a;

    /* renamed from: b  reason: collision with root package name */
    public static final as f5075b;

    /* renamed from: c  reason: collision with root package name */
    public static final as f5076c;

    /* renamed from: d  reason: collision with root package name */
    public static final as f5077d;

    static {
        byte[] bArr = new byte[0];
        f5074a = bArr;
        as asVar = lb.f4943a;
        ct ctVar = ct.TINK;
        f5075b = a(4, 5, 3, asVar, ctVar, bArr);
        f5076c = a(4, 5, 4, asVar, ct.RAW, bArr);
        f5077d = a(4, 5, 3, lb.f4947e, ctVar, bArr);
    }

    public static as a(int i10, int i11, int i12, as asVar, ct ctVar, byte[] bArr) {
        xp C = yp.C();
        kq C2 = lq.C();
        C2.s(4);
        C2.t(5);
        C2.r(m4.w(bArr, 0, 0));
        up C3 = vp.C();
        C3.r(asVar);
        aq D = bq.D();
        D.s((lq) C2.j());
        D.r((vp) C3.j());
        D.t(i12);
        C.r((bq) D.j());
        zr C4 = as.C();
        new fh();
        C4.s("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        C4.r(ctVar);
        C4.t(((yp) C.j()).zzo());
        return (as) C4.j();
    }
}
