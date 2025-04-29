package b6;

import s6.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d0<T> implements s6.b<T>, s6.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final a.InterfaceC0257a<Object> f3006c = new a.InterfaceC0257a() { // from class: b6.b0
        @Override // s6.a.InterfaceC0257a
        public final void a(s6.b bVar) {
            d0.f(bVar);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final s6.b<Object> f3007d = new s6.b() { // from class: b6.c0
        @Override // s6.b
        public final Object get() {
            Object g10;
            g10 = d0.g();
            return g10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private a.InterfaceC0257a<T> f3008a;

    /* renamed from: b  reason: collision with root package name */
    private volatile s6.b<T> f3009b;

    private d0(a.InterfaceC0257a<T> interfaceC0257a, s6.b<T> bVar) {
        this.f3008a = interfaceC0257a;
        this.f3009b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> d0<T> e() {
        return new d0<>(f3006c, f3007d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(s6.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0257a interfaceC0257a, a.InterfaceC0257a interfaceC0257a2, s6.b bVar) {
        interfaceC0257a.a(bVar);
        interfaceC0257a2.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> d0<T> i(s6.b<T> bVar) {
        return new d0<>(null, bVar);
    }

    @Override // s6.a
    public void a(final a.InterfaceC0257a<T> interfaceC0257a) {
        s6.b<T> bVar;
        s6.b<T> bVar2 = this.f3009b;
        s6.b<Object> bVar3 = f3007d;
        if (bVar2 != bVar3) {
            interfaceC0257a.a(bVar2);
            return;
        }
        s6.b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f3009b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                final a.InterfaceC0257a<T> interfaceC0257a2 = this.f3008a;
                this.f3008a = new a.InterfaceC0257a() { // from class: b6.a0
                    @Override // s6.a.InterfaceC0257a
                    public final void a(s6.b bVar5) {
                        d0.h(a.InterfaceC0257a.this, interfaceC0257a, bVar5);
                    }
                };
            }
        }
        if (bVar4 != null) {
            interfaceC0257a.a(bVar);
        }
    }

    @Override // s6.b
    public T get() {
        return this.f3009b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(s6.b<T> bVar) {
        a.InterfaceC0257a<T> interfaceC0257a;
        if (this.f3009b != f3007d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0257a = this.f3008a;
            this.f3008a = null;
            this.f3009b = bVar;
        }
        interfaceC0257a.a(bVar);
    }
}
