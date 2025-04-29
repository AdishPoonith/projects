package r8;

import java.nio.ByteBuffer;
import r8.c;
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final r8.c f16753a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16754b;

    /* renamed from: c  reason: collision with root package name */
    private final i<T> f16755c;

    /* renamed from: d  reason: collision with root package name */
    private final c.InterfaceC0246c f16756d;

    /* loaded from: classes.dex */
    private final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f16757a;

        /* renamed from: r8.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0245a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f16759a;

            C0245a(c.b bVar) {
                this.f16759a = bVar;
            }

            @Override // r8.a.e
            public void a(T t10) {
                this.f16759a.a(a.this.f16755c.a(t10));
            }
        }

        private b(d<T> dVar) {
            this.f16757a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // r8.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f16757a.a(a.this.f16755c.b(byteBuffer), new C0245a(bVar));
            } catch (RuntimeException e10) {
                d8.b.c("BasicMessageChannel#" + a.this.f16754b, "Failed to handle message", e10);
                bVar.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final e<T> f16761a;

        private c(e<T> eVar) {
            this.f16761a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // r8.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f16761a.a(a.this.f16755c.b(byteBuffer));
            } catch (RuntimeException e10) {
                d8.b.c("BasicMessageChannel#" + a.this.f16754b, "Failed to handle message reply", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t10, e<T> eVar);
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t10);
    }

    public a(r8.c cVar, String str, i<T> iVar) {
        this(cVar, str, iVar, null);
    }

    public a(r8.c cVar, String str, i<T> iVar, c.InterfaceC0246c interfaceC0246c) {
        this.f16753a = cVar;
        this.f16754b = str;
        this.f16755c = iVar;
        this.f16756d = interfaceC0246c;
    }

    public void c(T t10) {
        d(t10, null);
    }

    public void d(T t10, e<T> eVar) {
        this.f16753a.e(this.f16754b, this.f16755c.a(t10), eVar != null ? new c(eVar) : null);
    }

    public void e(d<T> dVar) {
        if (this.f16756d != null) {
            this.f16753a.b(this.f16754b, dVar != null ? new b(dVar) : null, this.f16756d);
        } else {
            this.f16753a.c(this.f16754b, dVar != null ? new b(dVar) : null);
        }
    }
}
