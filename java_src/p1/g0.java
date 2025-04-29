package p1;

import java.util.Set;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final p0.a f15137a;

    /* renamed from: b  reason: collision with root package name */
    private final p0.i f15138b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f15139c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f15140d;

    public g0(p0.a accessToken, p0.i iVar, Set<String> recentlyGrantedPermissions, Set<String> recentlyDeniedPermissions) {
        kotlin.jvm.internal.l.e(accessToken, "accessToken");
        kotlin.jvm.internal.l.e(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.l.e(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f15137a = accessToken;
        this.f15138b = iVar;
        this.f15139c = recentlyGrantedPermissions;
        this.f15140d = recentlyDeniedPermissions;
    }

    public final p0.a a() {
        return this.f15137a;
    }

    public final Set<String> b() {
        return this.f15139c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return kotlin.jvm.internal.l.a(this.f15137a, g0Var.f15137a) && kotlin.jvm.internal.l.a(this.f15138b, g0Var.f15138b) && kotlin.jvm.internal.l.a(this.f15139c, g0Var.f15139c) && kotlin.jvm.internal.l.a(this.f15140d, g0Var.f15140d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f15137a.hashCode() * 31;
        p0.i iVar = this.f15138b;
        return ((((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.f15139c.hashCode()) * 31) + this.f15140d.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f15137a + ", authenticationToken=" + this.f15138b + ", recentlyGrantedPermissions=" + this.f15139c + ", recentlyDeniedPermissions=" + this.f15140d + ')';
    }
}
