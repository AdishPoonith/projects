package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pk */
/* loaded from: classes.dex */
public final class pk {

    /* renamed from: a */
    private final Map f5201a;

    /* renamed from: b */
    private final Map f5202b;

    /* renamed from: c */
    private final Map f5203c;

    /* renamed from: d */
    private final Map f5204d;

    public pk() {
        this.f5201a = new HashMap();
        this.f5202b = new HashMap();
        this.f5203c = new HashMap();
        this.f5204d = new HashMap();
    }

    public pk(vk vkVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = vkVar.f5543a;
        this.f5201a = new HashMap(map);
        map2 = vkVar.f5544b;
        this.f5202b = new HashMap(map2);
        map3 = vkVar.f5545c;
        this.f5203c = new HashMap(map3);
        map4 = vkVar.f5546d;
        this.f5204d = new HashMap(map4);
    }

    public final pk a(aj ajVar) {
        rk rkVar = new rk(ajVar.d(), ajVar.c(), null);
        if (this.f5202b.containsKey(rkVar)) {
            aj ajVar2 = (aj) this.f5202b.get(rkVar);
            if (!ajVar2.equals(ajVar) || !ajVar.equals(ajVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(rkVar.toString()));
            }
        } else {
            this.f5202b.put(rkVar, ajVar);
        }
        return this;
    }

    public final pk b(ej ejVar) {
        tk tkVar = new tk(ejVar.b(), ejVar.c(), null);
        if (this.f5201a.containsKey(tkVar)) {
            ej ejVar2 = (ej) this.f5201a.get(tkVar);
            if (!ejVar2.equals(ejVar) || !ejVar.equals(ejVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(tkVar.toString()));
            }
        } else {
            this.f5201a.put(tkVar, ejVar);
        }
        return this;
    }

    public final pk c(vj vjVar) {
        rk rkVar = new rk(vjVar.c(), vjVar.b(), null);
        if (this.f5204d.containsKey(rkVar)) {
            vj vjVar2 = (vj) this.f5204d.get(rkVar);
            if (!vjVar2.equals(vjVar) || !vjVar.equals(vjVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(rkVar.toString()));
            }
        } else {
            this.f5204d.put(rkVar, vjVar);
        }
        return this;
    }

    public final pk d(ak akVar) {
        tk tkVar = new tk(akVar.b(), akVar.c(), null);
        if (this.f5203c.containsKey(tkVar)) {
            ak akVar2 = (ak) this.f5203c.get(tkVar);
            if (!akVar2.equals(akVar) || !akVar.equals(akVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(tkVar.toString()));
            }
        } else {
            this.f5203c.put(tkVar, akVar);
        }
        return this;
    }
}
