package n6;

import java.util.HashSet;
import java.util.Set;
import m6.r;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static d f14309b = b(new HashSet());

    /* renamed from: a  reason: collision with root package name */
    private final Set<r> f14310a;

    private d(Set<r> set) {
        this.f14310a = set;
    }

    public static d b(Set<r> set) {
        return new d(set);
    }

    public boolean a(r rVar) {
        for (r rVar2 : this.f14310a) {
            if (rVar2.p(rVar)) {
                return true;
            }
        }
        return false;
    }

    public Set<r> c() {
        return this.f14310a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f14310a.equals(((d) obj).f14310a);
    }

    public int hashCode() {
        return this.f14310a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f14310a.toString() + "}";
    }
}
