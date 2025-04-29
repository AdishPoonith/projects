package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.om  reason: invalid package */
/* loaded from: classes.dex */
final class om {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f5140a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f5141b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f5142c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f5143d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f5144e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5145f = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f5140a = b10;
        f5141b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.km
        }, jm.class, nk.class);
        f5142c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.lm
        }, b10, nk.class);
        f5143d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.mm
        }, yl.class, mk.class);
        f5144e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.nm
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                gm gmVar;
                hm hmVar;
                int i10 = om.f5145f;
                if (((mk) okVar).f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        vq G = vq.G(((mk) okVar).d(), e5.a());
                        if (G.C() == 0) {
                            fm fmVar = new fm(null);
                            fmVar.b(G.I().k());
                            fmVar.c(G.H().C());
                            int H = G.H().H();
                            ct ctVar = ct.UNKNOWN_PREFIX;
                            int i11 = H - 2;
                            if (i11 == 1) {
                                gmVar = gm.f4647b;
                            } else if (i11 == 2) {
                                gmVar = gm.f4650e;
                            } else if (i11 == 3) {
                                gmVar = gm.f4649d;
                            } else if (i11 == 4) {
                                gmVar = gm.f4651f;
                            } else if (i11 != 5) {
                                throw new GeneralSecurityException("Unable to parse HashType: " + sq.a(H));
                            } else {
                                gmVar = gm.f4648c;
                            }
                            fmVar.a(gmVar);
                            ct c10 = ((mk) okVar).c();
                            int ordinal = c10.ordinal();
                            if (ordinal == 1) {
                                hmVar = hm.f4697b;
                            } else if (ordinal == 2) {
                                hmVar = hm.f4699d;
                            } else if (ordinal == 3) {
                                hmVar = hm.f4700e;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + c10.zza());
                            } else {
                                hmVar = hm.f4698c;
                            }
                            fmVar.d(hmVar);
                            jm e10 = fmVar.e();
                            wl wlVar = new wl(null);
                            wlVar.c(e10);
                            wlVar.b(hv.b(G.I().z(), hbVar));
                            wlVar.a(((mk) okVar).e());
                            return wlVar.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (z5 | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
            }
        }, b10, mk.class);
    }

    public static void a(rj rjVar) {
        rjVar.f(f5141b);
        rjVar.e(f5142c);
        rjVar.d(f5143d);
        rjVar.c(f5144e);
    }
}
