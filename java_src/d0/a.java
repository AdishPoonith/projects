package d0;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.util.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: j  reason: collision with root package name */
    private final Executor f7553j;

    /* renamed from: k  reason: collision with root package name */
    volatile a<D>.RunnableC0111a f7554k;

    /* renamed from: l  reason: collision with root package name */
    volatile a<D>.RunnableC0111a f7555l;

    /* renamed from: m  reason: collision with root package name */
    long f7556m;

    /* renamed from: n  reason: collision with root package name */
    long f7557n;

    /* renamed from: o  reason: collision with root package name */
    Handler f7558o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0111a extends c<Void, Void, D> implements Runnable {

        /* renamed from: t  reason: collision with root package name */
        private final CountDownLatch f7559t = new CountDownLatch(1);

        /* renamed from: u  reason: collision with root package name */
        boolean f7560u;

        RunnableC0111a() {
        }

        @Override // d0.c
        protected void h(D d10) {
            try {
                a.this.x(this, d10);
            } finally {
                this.f7559t.countDown();
            }
        }

        @Override // d0.c
        protected void i(D d10) {
            try {
                a.this.y(this, d10);
            } finally {
                this.f7559t.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d0.c
        /* renamed from: n */
        public D b(Void... voidArr) {
            return (D) a.this.C();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7560u = false;
            a.this.z();
        }
    }

    public a(Context context) {
        this(context, c.f7573q);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.f7557n = -10000L;
        this.f7553j = executor;
    }

    public abstract D A();

    public void B(D d10) {
    }

    protected D C() {
        return A();
    }

    @Override // d0.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f7554k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f7554k);
            printWriter.print(" waiting=");
            printWriter.println(this.f7554k.f7560u);
        }
        if (this.f7555l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f7555l);
            printWriter.print(" waiting=");
            printWriter.println(this.f7555l.f7560u);
        }
        if (this.f7556m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            f.c(this.f7556m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            f.b(this.f7557n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // d0.b
    protected boolean k() {
        if (this.f7554k != null) {
            if (!this.f7566e) {
                this.f7569h = true;
            }
            if (this.f7555l != null) {
                if (this.f7554k.f7560u) {
                    this.f7554k.f7560u = false;
                    this.f7558o.removeCallbacks(this.f7554k);
                }
                this.f7554k = null;
                return false;
            } else if (this.f7554k.f7560u) {
                this.f7554k.f7560u = false;
                this.f7558o.removeCallbacks(this.f7554k);
                this.f7554k = null;
                return false;
            } else {
                boolean a10 = this.f7554k.a(false);
                if (a10) {
                    this.f7555l = this.f7554k;
                    w();
                }
                this.f7554k = null;
                return a10;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d0.b
    public void m() {
        super.m();
        b();
        this.f7554k = new RunnableC0111a();
        z();
    }

    public void w() {
    }

    void x(a<D>.RunnableC0111a runnableC0111a, D d10) {
        B(d10);
        if (this.f7555l == runnableC0111a) {
            s();
            this.f7557n = SystemClock.uptimeMillis();
            this.f7555l = null;
            e();
            z();
        }
    }

    void y(a<D>.RunnableC0111a runnableC0111a, D d10) {
        if (this.f7554k != runnableC0111a) {
            x(runnableC0111a, d10);
        } else if (i()) {
            B(d10);
        } else {
            c();
            this.f7557n = SystemClock.uptimeMillis();
            this.f7554k = null;
            f(d10);
        }
    }

    void z() {
        if (this.f7555l != null || this.f7554k == null) {
            return;
        }
        if (this.f7554k.f7560u) {
            this.f7554k.f7560u = false;
            this.f7558o.removeCallbacks(this.f7554k);
        }
        if (this.f7556m <= 0 || SystemClock.uptimeMillis() >= this.f7557n + this.f7556m) {
            this.f7554k.c(this.f7553j, null);
            return;
        }
        this.f7554k.f7560u = true;
        this.f7558o.postAtTime(this.f7554k, this.f7557n + this.f7556m);
    }
}
