package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gk  reason: invalid package */
/* loaded from: classes.dex */
public final class gk {

    /* renamed from: a  reason: collision with root package name */
    private final Map f4644a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f4645b;

    public gk() {
        this.f4644a = new HashMap();
        this.f4645b = new HashMap();
    }

    public gk(kk kkVar) {
        this.f4644a = new HashMap(kk.d(kkVar));
        this.f4645b = new HashMap(kk.e(kkVar));
    }

    public final gk a(ek ekVar) {
        ik ikVar = new ik(ekVar.c(), ekVar.d(), null);
        if (this.f4644a.containsKey(ikVar)) {
            ek ekVar2 = (ek) this.f4644a.get(ikVar);
            if (!ekVar2.equals(ekVar) || !ekVar.equals(ekVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(ikVar.toString()));
            }
        } else {
            this.f4644a.put(ikVar, ekVar);
        }
        return this;
    }

    public final gk b(cb cbVar) {
        Objects.requireNonNull(cbVar, "wrapper must be non-null");
        Map map = this.f4645b;
        Class zzb = cbVar.zzb();
        if (map.containsKey(zzb)) {
            cb cbVar2 = (cb) this.f4645b.get(zzb);
            if (!cbVar2.equals(cbVar) || !cbVar.equals(cbVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.f4645b.put(zzb, cbVar);
        }
        return this;
    }
}
