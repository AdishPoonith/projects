package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f3924a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3925b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3926c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3927d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3928e;

    t0(f fVar, int i10, b bVar, long j10, long j11, String str, String str2) {
        this.f3924a = fVar;
        this.f3925b = i10;
        this.f3926c = bVar;
        this.f3927d = j10;
        this.f3928e = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t0 a(f fVar, int i10, b bVar) {
        boolean z10;
        if (fVar.g()) {
            c4.u a10 = c4.t.b().a();
            if (a10 == null) {
                z10 = true;
            } else if (!a10.D()) {
                return null;
            } else {
                z10 = a10.E();
                j0 x10 = fVar.x(bVar);
                if (x10 != null) {
                    if (!(x10.t() instanceof c4.c)) {
                        return null;
                    }
                    c4.c cVar = (c4.c) x10.t();
                    if (cVar.I() && !cVar.i()) {
                        c4.f b10 = b(x10, cVar, i10);
                        if (b10 == null) {
                            return null;
                        }
                        x10.F();
                        z10 = b10.F();
                    }
                }
            }
            return new t0(fVar, i10, bVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    private static c4.f b(j0 j0Var, c4.c cVar, int i10) {
        int[] C;
        int[] D;
        c4.f G = cVar.G();
        if (G == null || !G.E() || ((C = G.C()) != null ? !h4.b.a(C, i10) : !((D = G.D()) == null || !h4.b.a(D, i10))) || j0Var.q() >= G.B()) {
            return null;
        }
        return G;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        j0 x10;
        int i10;
        int i11;
        int i12;
        int i13;
        int B;
        long j10;
        long j11;
        int i14;
        if (this.f3924a.g()) {
            c4.u a10 = c4.t.b().a();
            if ((a10 == null || a10.D()) && (x10 = this.f3924a.x(this.f3926c)) != null && (x10.t() instanceof c4.c)) {
                c4.c cVar = (c4.c) x10.t();
                boolean z10 = true;
                boolean z11 = this.f3927d > 0;
                int y10 = cVar.y();
                if (a10 != null) {
                    z11 &= a10.E();
                    int B2 = a10.B();
                    int C = a10.C();
                    i10 = a10.F();
                    if (cVar.I() && !cVar.i()) {
                        c4.f b10 = b(x10, cVar, this.f3925b);
                        if (b10 == null) {
                            return;
                        }
                        z10 = (!b10.F() || this.f3927d <= 0) ? false : false;
                        C = b10.B();
                        z11 = z10;
                    }
                    i11 = B2;
                    i12 = C;
                } else {
                    i10 = 0;
                    i11 = 5000;
                    i12 = 100;
                }
                f fVar = this.f3924a;
                if (task.isSuccessful()) {
                    i13 = 0;
                    B = 0;
                } else {
                    if (task.isCanceled()) {
                        i13 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.b) {
                            Status status = ((com.google.android.gms.common.api.b) exception).getStatus();
                            int C2 = status.C();
                            b4.b B3 = status.B();
                            B = B3 == null ? -1 : B3.B();
                            i13 = C2;
                        } else {
                            i13 = 101;
                        }
                    }
                    B = -1;
                }
                if (z11) {
                    long j12 = this.f3927d;
                    j11 = System.currentTimeMillis();
                    j10 = j12;
                    i14 = (int) (SystemClock.elapsedRealtime() - this.f3928e);
                } else {
                    j10 = 0;
                    j11 = 0;
                    i14 = -1;
                }
                fVar.I(new c4.p(this.f3925b, i13, B, j10, j11, null, null, y10, i14), i10, i11, i12);
            }
        }
    }
}
