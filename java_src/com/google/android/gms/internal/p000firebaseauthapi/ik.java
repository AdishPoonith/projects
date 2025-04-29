package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ik  reason: invalid package */
/* loaded from: classes.dex */
final class ik {

    /* renamed from: a  reason: collision with root package name */
    private final Class f4758a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f4759b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ik(Class cls, Class cls2, hk hkVar) {
        this.f4758a = cls;
        this.f4759b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ik) {
            ik ikVar = (ik) obj;
            return ikVar.f4758a.equals(this.f4758a) && ikVar.f4759b.equals(this.f4759b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4758a, this.f4759b});
    }

    public final String toString() {
        String simpleName = this.f4758a.getSimpleName();
        String simpleName2 = this.f4759b.getSimpleName();
        return simpleName + " with primitive type: " + simpleName2;
    }
}
