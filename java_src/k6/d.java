package k6;

import com.google.protobuf.i;
import m6.q;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final g f12592a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final a f12593b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final b f12594c = new b();

    /* loaded from: classes.dex */
    class a extends k6.b {
        a() {
        }

        @Override // k6.b
        public void a(i iVar) {
            d.this.f12592a.h(iVar);
        }

        @Override // k6.b
        public void b(double d10) {
            d.this.f12592a.j(d10);
        }

        @Override // k6.b
        public void c() {
            d.this.f12592a.n();
        }

        @Override // k6.b
        public void d(long j10) {
            d.this.f12592a.r(j10);
        }

        @Override // k6.b
        public void e(String str) {
            d.this.f12592a.v(str);
        }
    }

    /* loaded from: classes.dex */
    class b extends k6.b {
        b() {
        }

        @Override // k6.b
        public void a(i iVar) {
            d.this.f12592a.i(iVar);
        }

        @Override // k6.b
        public void b(double d10) {
            d.this.f12592a.k(d10);
        }

        @Override // k6.b
        public void c() {
            d.this.f12592a.o();
        }

        @Override // k6.b
        public void d(long j10) {
            d.this.f12592a.s(j10);
        }

        @Override // k6.b
        public void e(String str) {
            d.this.f12592a.w(str);
        }
    }

    public k6.b b(q.c.a aVar) {
        return aVar.equals(q.c.a.DESCENDING) ? this.f12594c : this.f12593b;
    }

    public byte[] c() {
        return this.f12592a.a();
    }

    public void d(byte[] bArr) {
        this.f12592a.c(bArr);
    }
}
