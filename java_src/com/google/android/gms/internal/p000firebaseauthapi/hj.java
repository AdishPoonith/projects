package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hj  reason: invalid package */
/* loaded from: classes.dex */
public abstract class hj {

    /* renamed from: a  reason: collision with root package name */
    private final Class f4694a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f4695b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f4696c;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public hj(Class cls, fk... fkVarArr) {
        this.f4694a = cls;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            fk fkVar = fkVarArr[i10];
            if (hashMap.containsKey(fkVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(fkVar.b().getCanonicalName())));
            }
            hashMap.put(fkVar.b(), fkVar);
        }
        this.f4696c = fkVarArr[0].b();
        this.f4695b = Collections.unmodifiableMap(hashMap);
    }

    public gj a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract ur b();

    public abstract w6 c(m4 m4Var);

    public abstract String d();

    public abstract void e(w6 w6Var);

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.f4696c;
    }

    public final Class h() {
        return this.f4694a;
    }

    public final Object i(w6 w6Var, Class cls) {
        fk fkVar = (fk) this.f4695b.get(cls);
        if (fkVar != null) {
            return fkVar.a(w6Var);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set j() {
        return this.f4695b.keySet();
    }
}
