package p3;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final d f15364a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15365b;

    public g() {
        this(d.f15342a);
    }

    public g(d dVar) {
        this.f15364a = dVar;
    }

    public synchronized void a() {
        while (!this.f15365b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f15365b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f15365b;
        this.f15365b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f15365b;
    }

    public synchronized boolean e() {
        if (this.f15365b) {
            return false;
        }
        this.f15365b = true;
        notifyAll();
        return true;
    }
}
