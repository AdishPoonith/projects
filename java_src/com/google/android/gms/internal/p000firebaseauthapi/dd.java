package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dd  reason: invalid package */
/* loaded from: classes.dex */
final class dd {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f4497a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f4498b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f4499c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f4500d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f4501e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f4502f = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f4497a = b10;
        f4498b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.zc
        }, yc.class, nk.class);
        f4499c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.ad
        }, b10, nk.class);
        f4500d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.bd
        }, pc.class, mk.class);
        f4501e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.cd
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                wc wcVar;
                int i10 = dd.f4502f;
                if (((mk) okVar).f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        lo F = lo.F(((mk) okVar).d(), e5.a());
                        if (F.C() == 0) {
                            vc vcVar = new vc(null);
                            vcVar.b(F.H().k());
                            vcVar.a(F.G().C());
                            vcVar.c(16);
                            ct c10 = ((mk) okVar).c();
                            ct ctVar = ct.UNKNOWN_PREFIX;
                            int ordinal = c10.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        wcVar = wc.f5594d;
                                    } else if (ordinal != 4) {
                                        int zza = c10.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                                    }
                                }
                                wcVar = wc.f5593c;
                            } else {
                                wcVar = wc.f5592b;
                            }
                            vcVar.d(wcVar);
                            yc e10 = vcVar.e();
                            nc ncVar = new nc(null);
                            ncVar.c(e10);
                            ncVar.b(hv.b(F.H().z(), hbVar));
                            ncVar.a(((mk) okVar).e());
                            return ncVar.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (z5 unused) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
            }
        }, b10, mk.class);
    }

    public static void a(rj rjVar) {
        rjVar.f(f4498b);
        rjVar.e(f4499c);
        rjVar.d(f4500d);
        rjVar.c(f4501e);
    }
}
