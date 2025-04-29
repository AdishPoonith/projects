package p0;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class w0 extends OutputStream implements z0 {

    /* renamed from: j  reason: collision with root package name */
    private final Handler f15059j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<j0, b1> f15060k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private j0 f15061l;

    /* renamed from: m  reason: collision with root package name */
    private b1 f15062m;

    /* renamed from: n  reason: collision with root package name */
    private int f15063n;

    public w0(Handler handler) {
        this.f15059j = handler;
    }

    @Override // p0.z0
    public void a(j0 j0Var) {
        this.f15061l = j0Var;
        this.f15062m = j0Var != null ? this.f15060k.get(j0Var) : null;
    }

    public final void b(long j10) {
        j0 j0Var = this.f15061l;
        if (j0Var == null) {
            return;
        }
        if (this.f15062m == null) {
            b1 b1Var = new b1(this.f15059j, j0Var);
            this.f15062m = b1Var;
            this.f15060k.put(j0Var, b1Var);
        }
        b1 b1Var2 = this.f15062m;
        if (b1Var2 != null) {
            b1Var2.c(j10);
        }
        this.f15063n += (int) j10;
    }

    public final int e() {
        return this.f15063n;
    }

    public final Map<j0, b1> h() {
        return this.f15060k;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        b(1L);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        kotlin.jvm.internal.l.e(buffer, "buffer");
        b(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.l.e(buffer, "buffer");
        b(i11);
    }
}
