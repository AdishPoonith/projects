package t6;

import c4.q;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f18328a;

    public b(String str) {
        this.f18328a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return q.b(this.f18328a, ((b) obj).f18328a);
        }
        return false;
    }

    public int hashCode() {
        return q.c(this.f18328a);
    }

    public String toString() {
        return q.d(this).a("token", this.f18328a).toString();
    }
}
