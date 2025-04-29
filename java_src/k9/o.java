package k9;

import io.grpc.internal.p2;
/* loaded from: classes.dex */
class o implements p2 {

    /* renamed from: a  reason: collision with root package name */
    private final okio.c f12787a;

    /* renamed from: b  reason: collision with root package name */
    private int f12788b;

    /* renamed from: c  reason: collision with root package name */
    private int f12789c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(okio.c cVar, int i10) {
        this.f12787a = cVar;
        this.f12788b = i10;
    }

    @Override // io.grpc.internal.p2
    public void a() {
    }

    @Override // io.grpc.internal.p2
    public void b(byte[] bArr, int i10, int i11) {
        this.f12787a.i0(bArr, i10, i11);
        this.f12788b -= i11;
        this.f12789c += i11;
    }

    @Override // io.grpc.internal.p2
    public int c() {
        return this.f12789c;
    }

    @Override // io.grpc.internal.p2
    public int d() {
        return this.f12788b;
    }

    @Override // io.grpc.internal.p2
    public void e(byte b10) {
        this.f12787a.D(b10);
        this.f12788b--;
        this.f12789c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public okio.c f() {
        return this.f12787a;
    }
}
