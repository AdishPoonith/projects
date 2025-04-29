package ha;

import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class c extends ha.a {

    /* renamed from: n  reason: collision with root package name */
    public static final a f9552n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    private static final c f9553o = new c(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (b() != cVar.b() || e() != cVar.e()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + e();
    }

    public boolean isEmpty() {
        return l.f(b(), e()) > 0;
    }

    public String toString() {
        return b() + ".." + e();
    }
}
