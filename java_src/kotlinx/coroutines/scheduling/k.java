package kotlinx.coroutines.scheduling;

import la.o0;
/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f12966l;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f12966l = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f12966l.run();
        } finally {
            this.f12964k.a();
        }
    }

    public String toString() {
        return "Task[" + o0.a(this.f12966l) + '@' + o0.b(this.f12966l) + ", " + this.f12963j + ", " + this.f12964k + ']';
    }
}
