package i6;

import m6.l;
import m6.s;
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private s f9723a;

    public b(s sVar) {
        this.f9723a = sVar;
    }

    public s a() {
        return this.f9723a;
    }

    public l b() {
        return this.f9723a.getKey();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9723a.equals(((b) obj).f9723a);
    }

    public int hashCode() {
        return this.f9723a.hashCode();
    }
}
