package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xg  reason: invalid package */
/* loaded from: classes.dex */
final class xg {

    /* renamed from: a  reason: collision with root package name */
    private static final gv f5650a;

    /* renamed from: b  reason: collision with root package name */
    private static final ak f5651b;

    /* renamed from: c  reason: collision with root package name */
    private static final vj f5652c;

    /* renamed from: d  reason: collision with root package name */
    private static final ej f5653d;

    /* renamed from: e  reason: collision with root package name */
    private static final aj f5654e;

    /* renamed from: f  reason: collision with root package name */
    private static final Map f5655f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map f5656g;

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f5657h = 0;

    static {
        gv b10 = xk.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        f5650a = b10;
        f5651b = ak.a(new xj() { // from class: com.google.android.gms.internal.firebase-auth-api.sg
        }, rg.class, nk.class);
        f5652c = vj.a(new tj() { // from class: com.google.android.gms.internal.firebase-auth-api.tg
        }, b10, nk.class);
        f5653d = ej.a(new cj() { // from class: com.google.android.gms.internal.firebase-auth-api.ug
        }, jg.class, mk.class);
        f5654e = aj.b(new yi() { // from class: com.google.android.gms.internal.firebase-auth-api.wg
            @Override // com.google.android.gms.internal.p000firebaseauthapi.yi
            public final aa a(ok okVar, hb hbVar) {
                return xg.a((mk) okVar, hbVar);
            }
        }, b10, mk.class);
        HashMap hashMap = new HashMap();
        pg pgVar = pg.f5188d;
        ct ctVar = ct.RAW;
        hashMap.put(pgVar, ctVar);
        pg pgVar2 = pg.f5186b;
        ct ctVar2 = ct.TINK;
        hashMap.put(pgVar2, ctVar2);
        pg pgVar3 = pg.f5187c;
        ct ctVar3 = ct.CRUNCHY;
        hashMap.put(pgVar3, ctVar3);
        f5655f = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(ct.class);
        enumMap.put((EnumMap) ctVar, (ct) pgVar);
        enumMap.put((EnumMap) ctVar2, (ct) pgVar2);
        enumMap.put((EnumMap) ctVar3, (ct) pgVar3);
        enumMap.put((EnumMap) ct.LEGACY, (ct) pgVar3);
        f5656g = Collections.unmodifiableMap(enumMap);
    }

    public static /* synthetic */ jg a(mk mkVar, hb hbVar) {
        if (mkVar.f().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                hp F = hp.F(mkVar.d(), e5.a());
                if (F.C() == 0) {
                    og ogVar = new og(null);
                    ogVar.a(F.G().k());
                    ct c10 = mkVar.c();
                    Map map = f5656g;
                    if (!map.containsKey(c10)) {
                        int zza = c10.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                    }
                    ogVar.b((pg) map.get(c10));
                    rg c11 = ogVar.c();
                    hg hgVar = new hg(null);
                    hgVar.c(c11);
                    hgVar.b(hv.b(F.G().z(), hbVar));
                    hgVar.a(mkVar.e());
                    return hgVar.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (z5 unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
    }

    public static void b(rj rjVar) {
        rjVar.f(f5651b);
        rjVar.e(f5652c);
        rjVar.d(f5653d);
        rjVar.c(f5654e);
    }
}
