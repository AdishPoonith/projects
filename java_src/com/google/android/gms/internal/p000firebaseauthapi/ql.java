package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ql  reason: invalid package */
/* loaded from: classes.dex */
final class ql {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f5264a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f5265b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f5266c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f5267d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f5268e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5269f = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f5264a = b10;
        f5265b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.ml
        }, ll.class, nk.class);
        f5266c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.nl
        }, b10, nk.class);
        f5267d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.ol
        }, cl.class, mk.class);
        f5268e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.pl
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                jl jlVar;
                int i10 = ql.f5269f;
                if (((mk) okVar).f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        mn F = mn.F(((mk) okVar).d(), e5.a());
                        if (F.C() == 0) {
                            il ilVar = new il(null);
                            ilVar.a(F.H().k());
                            ilVar.b(F.G().C());
                            ct c10 = ((mk) okVar).c();
                            ct ctVar = ct.UNKNOWN_PREFIX;
                            int ordinal = c10.ordinal();
                            if (ordinal == 1) {
                                jlVar = jl.f4823b;
                            } else if (ordinal == 2) {
                                jlVar = jl.f4825d;
                            } else if (ordinal == 3) {
                                jlVar = jl.f4826e;
                            } else if (ordinal != 4) {
                                int zza = c10.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                            } else {
                                jlVar = jl.f4824c;
                            }
                            ilVar.c(jlVar);
                            ll d10 = ilVar.d();
                            al alVar = new al(null);
                            alVar.c(d10);
                            alVar.a(hv.b(F.H().z(), hbVar));
                            alVar.b(((mk) okVar).e());
                            return alVar.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (z5 | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
            }
        }, b10, mk.class);
    }

    public static void a(rj rjVar) {
        rjVar.f(f5265b);
        rjVar.e(f5266c);
        rjVar.d(f5267d);
        rjVar.c(f5268e);
    }
}
