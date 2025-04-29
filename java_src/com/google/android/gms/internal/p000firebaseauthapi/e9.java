package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Set;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e9  reason: invalid package */
/* loaded from: classes.dex */
public abstract class e9 extends h7 implements Set {

    /* renamed from: k  reason: collision with root package name */
    private transient a9 f4540k;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return m9.a(this);
    }

    public final a9 m() {
        a9 a9Var = this.f4540k;
        if (a9Var == null) {
            a9 p10 = p();
            this.f4540k = p10;
            return p10;
        }
        return a9Var;
    }

    a9 p() {
        Object[] array = toArray();
        int i10 = a9.f4341l;
        return a9.p(array, array.length);
    }
}
