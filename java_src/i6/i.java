package i6;

import j6.b1;
import j6.g1;
/* loaded from: classes.dex */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final g1 f9749a;

    /* renamed from: b  reason: collision with root package name */
    private final b1.a f9750b;

    public i(g1 g1Var, b1.a aVar) {
        this.f9749a = g1Var;
        this.f9750b = aVar;
    }

    public b1.a a() {
        return this.f9750b;
    }

    public g1 b() {
        return this.f9749a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f9749a.equals(iVar.f9749a) && this.f9750b == iVar.f9750b;
    }

    public int hashCode() {
        return (this.f9749a.hashCode() * 31) + this.f9750b.hashCode();
    }
}
