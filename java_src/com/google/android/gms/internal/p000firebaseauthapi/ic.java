package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ic  reason: invalid package */
/* loaded from: classes.dex */
final class ic {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f4743a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f4744b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f4745c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f4746d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f4747e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f4748f = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f4743a = b10;
        f4744b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.ec
        }, dc.class, nk.class);
        f4745c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.fc
        }, b10, nk.class);
        f4746d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.gc
        }, ub.class, mk.class);
        f4747e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.hc
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                ac acVar;
                bc bcVar;
                int i10 = ic.f4748f;
                if (((mk) okVar).f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        vn F = vn.F(((mk) okVar).d(), e5.a());
                        if (F.C() == 0) {
                            zb zbVar = new zb(null);
                            zbVar.a(F.G().I().k());
                            zbVar.c(F.H().I().k());
                            zbVar.d(F.G().H().C());
                            zbVar.e(F.H().H().C());
                            int H = F.H().H().H();
                            ct ctVar = ct.UNKNOWN_PREFIX;
                            int i11 = H - 2;
                            if (i11 == 1) {
                                acVar = ac.f4342b;
                            } else if (i11 == 2) {
                                acVar = ac.f4345e;
                            } else if (i11 == 3) {
                                acVar = ac.f4344d;
                            } else if (i11 == 4) {
                                acVar = ac.f4346f;
                            } else if (i11 != 5) {
                                throw new GeneralSecurityException("Unable to parse HashType: " + sq.a(H));
                            } else {
                                acVar = ac.f4343c;
                            }
                            zbVar.b(acVar);
                            ct c10 = ((mk) okVar).c();
                            int ordinal = c10.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        bcVar = bc.f4395d;
                                    } else if (ordinal != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + c10.zza());
                                    }
                                }
                                bcVar = bc.f4394c;
                            } else {
                                bcVar = bc.f4393b;
                            }
                            zbVar.f(bcVar);
                            dc g10 = zbVar.g();
                            sb sbVar = new sb(null);
                            sbVar.d(g10);
                            sbVar.a(hv.b(F.G().I().z(), hbVar));
                            sbVar.b(hv.b(F.H().I().z(), hbVar));
                            sbVar.c(((mk) okVar).e());
                            return sbVar.e();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (z5 unused) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            }
        }, b10, mk.class);
    }

    public static void a(rj rjVar) {
        rjVar.f(f4744b);
        rjVar.e(f4745c);
        rjVar.d(f4746d);
        rjVar.c(f4747e);
    }
}
