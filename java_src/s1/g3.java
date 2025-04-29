package s1;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    private final b f17225a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17226b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.d f17227c;

    /* renamed from: d  reason: collision with root package name */
    private final y3 f17228d;

    /* renamed from: e  reason: collision with root package name */
    private int f17229e;

    /* renamed from: f  reason: collision with root package name */
    private Object f17230f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f17231g;

    /* renamed from: h  reason: collision with root package name */
    private int f17232h;

    /* renamed from: i  reason: collision with root package name */
    private long f17233i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f17234j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17235k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17236l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f17237m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17238n;

    /* loaded from: classes.dex */
    public interface a {
        void a(g3 g3Var);
    }

    /* loaded from: classes.dex */
    public interface b {
        void m(int i10, Object obj);
    }

    public g3(a aVar, b bVar, y3 y3Var, int i10, p3.d dVar, Looper looper) {
        this.f17226b = aVar;
        this.f17225a = bVar;
        this.f17228d = y3Var;
        this.f17231g = looper;
        this.f17227c = dVar;
        this.f17232h = i10;
    }

    public synchronized boolean a(long j10) {
        boolean z10;
        p3.a.f(this.f17235k);
        p3.a.f(this.f17231g.getThread() != Thread.currentThread());
        long a10 = this.f17227c.a() + j10;
        while (true) {
            z10 = this.f17237m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f17227c.d();
            wait(j10);
            j10 = a10 - this.f17227c.a();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f17236l;
    }

    public boolean b() {
        return this.f17234j;
    }

    public Looper c() {
        return this.f17231g;
    }

    public int d() {
        return this.f17232h;
    }

    public Object e() {
        return this.f17230f;
    }

    public long f() {
        return this.f17233i;
    }

    public b g() {
        return this.f17225a;
    }

    public y3 h() {
        return this.f17228d;
    }

    public int i() {
        return this.f17229e;
    }

    public synchronized boolean j() {
        return this.f17238n;
    }

    public synchronized void k(boolean z10) {
        this.f17236l = z10 | this.f17236l;
        this.f17237m = true;
        notifyAll();
    }

    public g3 l() {
        p3.a.f(!this.f17235k);
        if (this.f17233i == -9223372036854775807L) {
            p3.a.a(this.f17234j);
        }
        this.f17235k = true;
        this.f17226b.a(this);
        return this;
    }

    public g3 m(Object obj) {
        p3.a.f(!this.f17235k);
        this.f17230f = obj;
        return this;
    }

    public g3 n(int i10) {
        p3.a.f(!this.f17235k);
        this.f17229e = i10;
        return this;
    }
}
