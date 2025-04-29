package androidx.core.os;

import android.os.CancellationSignal;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1759a;

    /* renamed from: b  reason: collision with root package name */
    private b f1760b;

    /* renamed from: c  reason: collision with root package name */
    private Object f1761c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1762d;

    /* loaded from: classes.dex */
    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    private void d() {
        while (this.f1762d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f1759a) {
                return;
            }
            this.f1759a = true;
            this.f1762d = true;
            b bVar = this.f1760b;
            Object obj = this.f1761c;
            if (bVar != null) {
                try {
                    bVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f1762d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f1762d = false;
                notifyAll();
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f1759a;
        }
        return z10;
    }

    public void c(b bVar) {
        synchronized (this) {
            d();
            if (this.f1760b == bVar) {
                return;
            }
            this.f1760b = bVar;
            if (this.f1759a && bVar != null) {
                bVar.a();
            }
        }
    }
}
