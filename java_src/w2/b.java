package w2;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class b implements o {

    /* renamed from: b  reason: collision with root package name */
    private final long f19768b;

    /* renamed from: c  reason: collision with root package name */
    private final long f19769c;

    /* renamed from: d  reason: collision with root package name */
    private long f19770d;

    public b(long j10, long j11) {
        this.f19768b = j10;
        this.f19769c = j11;
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        long j10 = this.f19770d;
        if (j10 < this.f19768b || j10 > this.f19769c) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d() {
        return this.f19770d;
    }

    public boolean e() {
        return this.f19770d > this.f19769c;
    }

    public void f() {
        this.f19770d = this.f19768b - 1;
    }

    @Override // w2.o
    public boolean next() {
        this.f19770d++;
        return !e();
    }
}
