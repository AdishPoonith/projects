package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kk */
/* loaded from: classes.dex */
public final class kk {

    /* renamed from: a */
    private final Map f4888a;

    /* renamed from: b */
    private final Map f4889b;

    public /* synthetic */ kk(gk gkVar, jk jkVar) {
        Map map;
        Map map2;
        map = gkVar.f4644a;
        this.f4888a = new HashMap(map);
        map2 = gkVar.f4645b;
        this.f4889b = new HashMap(map2);
    }

    public final Class a(Class cls) {
        if (this.f4889b.containsKey(cls)) {
            return ((cb) this.f4889b.get(cls)).zza();
        }
        String obj = cls.toString();
        throw new GeneralSecurityException("No input primitive class for " + obj + " available");
    }

    public final Object b(aa aaVar, Class cls) {
        ik ikVar = new ik(aaVar.getClass(), cls, null);
        if (this.f4888a.containsKey(ikVar)) {
            return ((ek) this.f4888a.get(ikVar)).a(aaVar);
        }
        String obj = ikVar.toString();
        throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available");
    }

    public final Object c(bb bbVar, Class cls) {
        if (this.f4889b.containsKey(cls)) {
            cb cbVar = (cb) this.f4889b.get(cls);
            if (bbVar.c().equals(cbVar.zza()) && cbVar.zza().equals(bbVar.c())) {
                return cbVar.a(bbVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
