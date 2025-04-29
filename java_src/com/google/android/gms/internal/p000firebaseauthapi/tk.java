package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tk  reason: invalid package */
/* loaded from: classes.dex */
final class tk {

    /* renamed from: a  reason: collision with root package name */
    private final Class f5384a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f5385b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ tk(Class cls, Class cls2, sk skVar) {
        this.f5384a = cls;
        this.f5385b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tk) {
            tk tkVar = (tk) obj;
            return tkVar.f5384a.equals(this.f5384a) && tkVar.f5385b.equals(this.f5385b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5384a, this.f5385b});
    }

    public final String toString() {
        String simpleName = this.f5384a.getSimpleName();
        String simpleName2 = this.f5385b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
