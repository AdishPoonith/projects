package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vd  reason: invalid package */
/* loaded from: classes.dex */
final class vd {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f5523a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f5524b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f5525c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f5526d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f5527e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5528f = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f5523a = b10;
        f5524b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.qd
        }, pd.class, nk.class);
        f5525c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.rd
        }, b10, nk.class);
        f5526d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.td
        }, hd.class, mk.class);
        f5527e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.ud
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                nd ndVar;
                int i10 = vd.f5528f;
                if (((mk) okVar).f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        uo F = uo.F(((mk) okVar).d(), e5.a());
                        if (F.C() == 0) {
                            md mdVar = new md(null);
                            mdVar.b(F.G().k());
                            mdVar.a(12);
                            mdVar.c(16);
                            ct c10 = ((mk) okVar).c();
                            ct ctVar = ct.UNKNOWN_PREFIX;
                            int ordinal = c10.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        ndVar = nd.f5067d;
                                    } else if (ordinal != 4) {
                                        int zza = c10.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                                    }
                                }
                                ndVar = nd.f5066c;
                            } else {
                                ndVar = nd.f5065b;
                            }
                            mdVar.d(ndVar);
                            pd e10 = mdVar.e();
                            fd fdVar = new fd(null);
                            fdVar.c(e10);
                            fdVar.b(hv.b(F.G().z(), hbVar));
                            fdVar.a(((mk) okVar).e());
                            return fdVar.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (z5 unused) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
            }
        }, b10, mk.class);
    }

    public static void a(rj rjVar) {
        rjVar.f(f5524b);
        rjVar.e(f5525c);
        rjVar.d(f5526d);
        rjVar.c(f5527e);
    }
}
