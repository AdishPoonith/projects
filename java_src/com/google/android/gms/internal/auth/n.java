package com.google.android.gms.internal.auth;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
final class n extends l0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4177a;

    /* renamed from: b  reason: collision with root package name */
    private final u0 f4178b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context, u0 u0Var) {
        Objects.requireNonNull(context, "Null context");
        this.f4177a = context;
        this.f4178b = u0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.l0
    public final Context a() {
        return this.f4177a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.l0
    public final u0 b() {
        return this.f4178b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            if (this.f4177a.equals(l0Var.a())) {
                u0 u0Var = this.f4178b;
                u0 b10 = l0Var.b();
                if (u0Var != null ? u0Var.equals(b10) : b10 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4177a.hashCode() ^ 1000003) * 1000003;
        u0 u0Var = this.f4178b;
        return hashCode ^ (u0Var == null ? 0 : u0Var.hashCode());
    }

    public final String toString() {
        String obj = this.f4177a.toString();
        String valueOf = String.valueOf(this.f4178b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
