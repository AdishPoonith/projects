package r8;

import java.nio.ByteBuffer;
import r8.c;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final r8.c f16779a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16780b;

    /* renamed from: c  reason: collision with root package name */
    private final l f16781c;

    /* renamed from: d  reason: collision with root package name */
    private final c.InterfaceC0246c f16782d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f16783a;

        /* renamed from: r8.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0248a implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f16785a;

            C0248a(c.b bVar) {
                this.f16785a = bVar;
            }

            @Override // r8.k.d
            public void a(Object obj) {
                this.f16785a.a(k.this.f16781c.a(obj));
            }

            @Override // r8.k.d
            public void b(String str, String str2, Object obj) {
                this.f16785a.a(k.this.f16781c.d(str, str2, obj));
            }

            @Override // r8.k.d
            public void c() {
                this.f16785a.a(null);
            }
        }

        a(c cVar) {
            this.f16783a = cVar;
        }

        @Override // r8.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f16783a.I(k.this.f16781c.e(byteBuffer), new C0248a(bVar));
            } catch (RuntimeException e10) {
                d8.b.c("MethodChannel#" + k.this.f16780b, "Failed to handle method call", e10);
                bVar.a(k.this.f16781c.b("error", e10.getMessage(), null, d8.b.d(e10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final d f16787a;

        b(d dVar) {
            this.f16787a = dVar;
        }

        @Override // r8.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f16787a.c();
                } else {
                    try {
                        this.f16787a.a(k.this.f16781c.f(byteBuffer));
                    } catch (e e10) {
                        this.f16787a.b(e10.f16773j, e10.getMessage(), e10.f16774k);
                    }
                }
            } catch (RuntimeException e11) {
                d8.b.c("MethodChannel#" + k.this.f16780b, "Failed to handle method call result", e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void I(j jVar, d dVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public k(r8.c cVar, String str) {
        this(cVar, str, s.f16792b);
    }

    public k(r8.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public k(r8.c cVar, String str, l lVar, c.InterfaceC0246c interfaceC0246c) {
        this.f16779a = cVar;
        this.f16780b = str;
        this.f16781c = lVar;
        this.f16782d = interfaceC0246c;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f16779a.e(this.f16780b, this.f16781c.c(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f16782d != null) {
            this.f16779a.b(this.f16780b, cVar != null ? new a(cVar) : null, this.f16782d);
        } else {
            this.f16779a.c(this.f16780b, cVar != null ? new a(cVar) : null);
        }
    }
}
