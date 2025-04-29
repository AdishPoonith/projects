package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jb  reason: invalid package */
/* loaded from: classes.dex */
public final class jb {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4808a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f4809b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    static final ft f4810c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    static final ft f4811d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    static final ft f4812e;

    static {
        new xb();
        f4808a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new kd();
        f4809b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new ce();
        new tc();
        new bf();
        new ff();
        new qe();
        new jf();
        ft D = ft.D();
        f4810c = D;
        f4811d = D;
        f4812e = D;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        pb.c();
        pm.a();
        gb.i(new xb(), true);
        int i10 = ic.f4748f;
        ic.a(rj.b());
        gb.i(new kd(), true);
        int i11 = vd.f5528f;
        vd.a(rj.b());
        if (fg.b()) {
            return;
        }
        gb.i(new tc(), true);
        int i12 = dd.f4502f;
        dd.a(rj.b());
        ce.k(true);
        gb.i(new qe(), true);
        int i13 = ye.f5709f;
        ye.a(rj.b());
        gb.i(new bf(), true);
        gb.i(new ff(), true);
        gb.i(new jf(), true);
        int i14 = qf.f5257f;
        qf.a(rj.b());
    }
}
