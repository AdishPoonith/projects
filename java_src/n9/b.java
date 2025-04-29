package n9;

import l9.e;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final n9.a f14343a;

    /* renamed from: b  reason: collision with root package name */
    private final e f14344b;

    /* renamed from: n9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0210b {

        /* renamed from: a  reason: collision with root package name */
        private n9.a f14345a;

        /* renamed from: b  reason: collision with root package name */
        private e.b f14346b = new e.b();

        public b c() {
            if (this.f14345a != null) {
                return new b(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C0210b d(String str, String str2) {
            this.f14346b.f(str, str2);
            return this;
        }

        public C0210b e(n9.a aVar) {
            if (aVar != null) {
                this.f14345a = aVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    private b(C0210b c0210b) {
        this.f14343a = c0210b.f14345a;
        this.f14344b = c0210b.f14346b.c();
    }

    public e a() {
        return this.f14344b;
    }

    public n9.a b() {
        return this.f14343a;
    }

    public String toString() {
        return "Request{url=" + this.f14343a + '}';
    }
}
