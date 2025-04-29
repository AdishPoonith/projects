package i9;

import i9.a1;
import i9.r0;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class s0 extends r0.c {

    /* renamed from: a  reason: collision with root package name */
    private static final a1.c f10045a = a1.c.a(new a());

    /* loaded from: classes.dex */
    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public a1.c e(Map<String, ?> map) {
        return f10045a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return b5.h.c(this).d("policy", b()).b("priority", c()).e("available", d()).toString();
    }
}
