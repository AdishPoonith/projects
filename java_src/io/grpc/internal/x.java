package io.grpc.internal;
/* loaded from: classes.dex */
abstract class x implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private final i9.r f11705j;

    /* JADX INFO: Access modifiers changed from: protected */
    public x(i9.r rVar) {
        this.f11705j = rVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        i9.r b10 = this.f11705j.b();
        try {
            a();
        } finally {
            this.f11705j.f(b10);
        }
    }
}
