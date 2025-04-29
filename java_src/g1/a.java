package g1;

import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f8882a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8883b;

    public a(String name, boolean z10) {
        l.e(name, "name");
        this.f8882a = name;
        this.f8883b = z10;
    }

    public final String a() {
        return this.f8882a;
    }

    public final boolean b() {
        return this.f8883b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f8882a, aVar.f8882a) && this.f8883b == aVar.f8883b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f8882a.hashCode() * 31;
        boolean z10 = this.f8883b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f8882a + ", value=" + this.f8883b + ')';
    }
}
