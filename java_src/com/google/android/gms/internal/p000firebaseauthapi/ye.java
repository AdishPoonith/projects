package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ye  reason: invalid package */
/* loaded from: classes.dex */
final class ye {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f5704a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f5705b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f5706c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f5707d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f5708e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5709f = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f5704a = b10;
        f5705b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.ue
        }, se.class, nk.class);
        f5706c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.ve
        }, b10, nk.class);
        f5707d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.we
        }, ne.class, mk.class);
        f5708e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.xe
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                re reVar;
                int i10 = ye.f5709f;
                if (((mk) okVar).f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        np F = np.F(((mk) okVar).d(), e5.a());
                        if (F.C() == 0) {
                            ct c10 = ((mk) okVar).c();
                            ct ctVar = ct.UNKNOWN_PREFIX;
                            int ordinal = c10.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        reVar = re.f5288d;
                                    } else if (ordinal != 4) {
                                        int zza = c10.zza();
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                                    }
                                }
                                reVar = re.f5287c;
                            } else {
                                reVar = re.f5286b;
                            }
                            return ne.a(reVar, hv.b(F.G().z(), hbVar), ((mk) okVar).e());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (z5 unused) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
            }
        }, b10, mk.class);
    }

    public static void a(rj rjVar) {
        rjVar.f(f5705b);
        rjVar.e(f5706c);
        rjVar.d(f5707d);
        rjVar.c(f5708e);
    }
}
