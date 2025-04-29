package p0;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;
import p0.n0;
/* loaded from: classes.dex */
public final class y0 extends FilterOutputStream implements z0 {

    /* renamed from: j  reason: collision with root package name */
    private final n0 f15068j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<j0, b1> f15069k;

    /* renamed from: l  reason: collision with root package name */
    private final long f15070l;

    /* renamed from: m  reason: collision with root package name */
    private final long f15071m;

    /* renamed from: n  reason: collision with root package name */
    private long f15072n;

    /* renamed from: o  reason: collision with root package name */
    private long f15073o;

    /* renamed from: p  reason: collision with root package name */
    private b1 f15074p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(OutputStream out, n0 requests, Map<j0, b1> progressMap, long j10) {
        super(out);
        kotlin.jvm.internal.l.e(out, "out");
        kotlin.jvm.internal.l.e(requests, "requests");
        kotlin.jvm.internal.l.e(progressMap, "progressMap");
        this.f15068j = requests;
        this.f15069k = progressMap;
        this.f15070l = j10;
        f0 f0Var = f0.f14852a;
        this.f15071m = f0.A();
    }

    private final void e(long j10) {
        b1 b1Var = this.f15074p;
        if (b1Var != null) {
            b1Var.b(j10);
        }
        long j11 = this.f15072n + j10;
        this.f15072n = j11;
        if (j11 >= this.f15073o + this.f15071m || j11 >= this.f15070l) {
            k();
        }
    }

    private final void k() {
        if (this.f15072n > this.f15073o) {
            for (final n0.a aVar : this.f15068j.v()) {
                if (aVar instanceof n0.c) {
                    Handler u10 = this.f15068j.u();
                    if ((u10 == null ? null : Boolean.valueOf(u10.post(new Runnable() { // from class: p0.x0
                        @Override // java.lang.Runnable
                        public final void run() {
                            y0.l(n0.a.this, this);
                        }
                    }))) == null) {
                        ((n0.c) aVar).a(this.f15068j, this.f15072n, this.f15070l);
                    }
                }
            }
            this.f15073o = this.f15072n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(n0.a callback, y0 this$0) {
        kotlin.jvm.internal.l.e(callback, "$callback");
        kotlin.jvm.internal.l.e(this$0, "this$0");
        ((n0.c) callback).a(this$0.f15068j, this$0.h(), this$0.i());
    }

    @Override // p0.z0
    public void a(j0 j0Var) {
        this.f15074p = j0Var != null ? this.f15069k.get(j0Var) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        for (b1 b1Var : this.f15069k.values()) {
            b1Var.d();
        }
        k();
    }

    public final long h() {
        return this.f15072n;
    }

    public final long i() {
        return this.f15070l;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        e(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) {
        kotlin.jvm.internal.l.e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        e(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.l.e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        e(i11);
    }
}
