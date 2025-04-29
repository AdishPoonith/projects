package n6;

import m6.s;
import m6.w;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final m f14330c = new m(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final w f14331a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f14332b;

    private m(w wVar, Boolean bool) {
        q6.b.d(wVar == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f14331a = wVar;
        this.f14332b = bool;
    }

    public static m a(boolean z10) {
        return new m(null, Boolean.valueOf(z10));
    }

    public static m f(w wVar) {
        return new m(wVar, null);
    }

    public Boolean b() {
        return this.f14332b;
    }

    public w c() {
        return this.f14331a;
    }

    public boolean d() {
        return this.f14331a == null && this.f14332b == null;
    }

    public boolean e(s sVar) {
        if (this.f14331a != null) {
            return sVar.c() && sVar.j().equals(this.f14331a);
        }
        Boolean bool = this.f14332b;
        if (bool != null) {
            return bool.booleanValue() == sVar.c();
        }
        q6.b.d(d(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        w wVar = this.f14331a;
        if (wVar == null ? mVar.f14331a == null : wVar.equals(mVar.f14331a)) {
            Boolean bool = this.f14332b;
            Boolean bool2 = mVar.f14332b;
            return bool != null ? bool.equals(bool2) : bool2 == null;
        }
        return false;
    }

    public int hashCode() {
        w wVar = this.f14331a;
        int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        Boolean bool = this.f14332b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        if (d()) {
            return "Precondition{<none>}";
        }
        if (this.f14331a != null) {
            sb = new StringBuilder();
            sb.append("Precondition{updateTime=");
            obj = this.f14331a;
        } else if (this.f14332b == null) {
            throw q6.b.a("Invalid Precondition", new Object[0]);
        } else {
            sb = new StringBuilder();
            sb.append("Precondition{exists=");
            obj = this.f14332b;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
