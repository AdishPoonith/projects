package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.me  reason: invalid package */
/* loaded from: classes.dex */
final class me {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f5006a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f5007b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f5008c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f5009d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f5010e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5011f = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f5006a = b10;
        f5007b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.ie
        }, he.class, nk.class);
        f5008c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.je
        }, b10, nk.class);
        f5009d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.ke
        }, zd.class, mk.class);
        f5010e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.le
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                fe feVar;
                int i10 = me.f5011f;
                if (((mk) okVar).f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        ap F = ap.F(((mk) okVar).d(), e5.a());
                        if (F.C() == 0) {
                            ee eeVar = new ee(null);
                            eeVar.a(F.G().k());
                            ct c10 = ((mk) okVar).c();
                            ct ctVar = ct.UNKNOWN_PREFIX;
                            int ordinal = c10.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        feVar = fe.f4581d;
                                    } else if (ordinal != 4) {
                                        int zza = c10.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                                    }
                                }
                                feVar = fe.f4580c;
                            } else {
                                feVar = fe.f4579b;
                            }
                            eeVar.b(feVar);
                            he c11 = eeVar.c();
                            xd xdVar = new xd(null);
                            xdVar.c(c11);
                            xdVar.b(hv.b(F.G().z(), hbVar));
                            xdVar.a(((mk) okVar).e());
                            return xdVar.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (z5 unused) {
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
            }
        }, b10, mk.class);
    }

    public static void a(rj rjVar) {
        rjVar.f(f5007b);
        rjVar.e(f5008c);
        rjVar.d(f5009d);
        rjVar.c(f5010e);
    }
}
