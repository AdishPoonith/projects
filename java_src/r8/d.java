package r8;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import r8.c;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final r8.c f16764a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16765b;

    /* renamed from: c  reason: collision with root package name */
    private final l f16766c;

    /* renamed from: d  reason: collision with root package name */
    private final c.InterfaceC0246c f16767d;

    /* loaded from: classes.dex */
    public interface b {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0247d f16768a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicReference<b> f16769b = new AtomicReference<>(null);

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            final AtomicBoolean f16771a;

            private a() {
                this.f16771a = new AtomicBoolean(false);
            }

            @Override // r8.d.b
            public void a(Object obj) {
                if (this.f16771a.get() || c.this.f16769b.get() != this) {
                    return;
                }
                d.this.f16764a.f(d.this.f16765b, d.this.f16766c.a(obj));
            }

            @Override // r8.d.b
            public void b(String str, String str2, Object obj) {
                if (this.f16771a.get() || c.this.f16769b.get() != this) {
                    return;
                }
                d.this.f16764a.f(d.this.f16765b, d.this.f16766c.d(str, str2, obj));
            }

            @Override // r8.d.b
            public void c() {
                if (this.f16771a.getAndSet(true) || c.this.f16769b.get() != this) {
                    return;
                }
                d.this.f16764a.f(d.this.f16765b, null);
            }
        }

        c(InterfaceC0247d interfaceC0247d) {
            this.f16768a = interfaceC0247d;
        }

        private void c(Object obj, c.b bVar) {
            ByteBuffer d10;
            if (this.f16769b.getAndSet(null) != null) {
                try {
                    this.f16768a.c(obj);
                    bVar.a(d.this.f16766c.a(null));
                    return;
                } catch (RuntimeException e10) {
                    d8.b.c("EventChannel#" + d.this.f16765b, "Failed to close event stream", e10);
                    d10 = d.this.f16766c.d("error", e10.getMessage(), null);
                }
            } else {
                d10 = d.this.f16766c.d("error", "No active stream to cancel", null);
            }
            bVar.a(d10);
        }

        private void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (this.f16769b.getAndSet(aVar) != null) {
                try {
                    this.f16768a.c(null);
                } catch (RuntimeException e10) {
                    d8.b.c("EventChannel#" + d.this.f16765b, "Failed to close existing event stream", e10);
                }
            }
            try {
                this.f16768a.b(obj, aVar);
                bVar.a(d.this.f16766c.a(null));
            } catch (RuntimeException e11) {
                this.f16769b.set(null);
                d8.b.c("EventChannel#" + d.this.f16765b, "Failed to open event stream", e11);
                bVar.a(d.this.f16766c.d("error", e11.getMessage(), null));
            }
        }

        @Override // r8.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j e10 = d.this.f16766c.e(byteBuffer);
            if (e10.f16777a.equals("listen")) {
                d(e10.f16778b, bVar);
            } else if (e10.f16777a.equals("cancel")) {
                c(e10.f16778b, bVar);
            } else {
                bVar.a(null);
            }
        }
    }

    /* renamed from: r8.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0247d {
        void b(Object obj, b bVar);

        void c(Object obj);
    }

    public d(r8.c cVar, String str) {
        this(cVar, str, s.f16792b);
    }

    public d(r8.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public d(r8.c cVar, String str, l lVar, c.InterfaceC0246c interfaceC0246c) {
        this.f16764a = cVar;
        this.f16765b = str;
        this.f16766c = lVar;
        this.f16767d = interfaceC0246c;
    }

    public void d(InterfaceC0247d interfaceC0247d) {
        if (this.f16767d != null) {
            this.f16764a.b(this.f16765b, interfaceC0247d != null ? new c(interfaceC0247d) : null, this.f16767d);
        } else {
            this.f16764a.c(this.f16765b, interfaceC0247d != null ? new c(interfaceC0247d) : null);
        }
    }
}
