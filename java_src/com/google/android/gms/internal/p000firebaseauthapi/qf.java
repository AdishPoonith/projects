package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qf  reason: invalid package */
/* loaded from: classes.dex */
final class qf {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f5252a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f5253b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f5254c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f5255d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f5256e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5257f = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f5252a = b10;
        f5253b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.mf
        }, lf.class, nk.class);
        f5254c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.nf
        }, b10, nk.class);
        f5255d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.of
        }, gf.class, mk.class);
        f5256e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.pf
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                kf kfVar;
                int i10 = qf.f5257f;
                if (((mk) okVar).f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        jt F = jt.F(((mk) okVar).d(), e5.a());
                        if (F.C() == 0) {
                            ct c10 = ((mk) okVar).c();
                            ct ctVar = ct.UNKNOWN_PREFIX;
                            int ordinal = c10.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        kfVar = kf.f4882d;
                                    } else if (ordinal != 4) {
                                        int zza = c10.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                                    }
                                }
                                kfVar = kf.f4881c;
                            } else {
                                kfVar = kf.f4880b;
                            }
                            return gf.a(kfVar, hv.b(F.G().z(), hbVar), ((mk) okVar).e());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (z5 unused) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
            }
        }, b10, mk.class);
    }

    public static void a(rj rjVar) {
        rjVar.f(f5253b);
        rjVar.e(f5254c);
        rjVar.d(f5255d);
        rjVar.c(f5256e);
    }
}
