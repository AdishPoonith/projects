package a6;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.p000firebaseauthapi.pa;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: h  reason: collision with root package name */
    private static final f4.a f270h = new f4.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    private final w5.f f271a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f272b;

    /* renamed from: c  reason: collision with root package name */
    volatile long f273c;

    /* renamed from: d  reason: collision with root package name */
    final long f274d;

    /* renamed from: e  reason: collision with root package name */
    final HandlerThread f275e;

    /* renamed from: f  reason: collision with root package name */
    final Handler f276f;

    /* renamed from: g  reason: collision with root package name */
    final Runnable f277g;

    public p(w5.f fVar) {
        f270h.g("Initializing TokenRefresher", new Object[0]);
        w5.f fVar2 = (w5.f) c4.s.j(fVar);
        this.f271a = fVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f275e = handlerThread;
        handlerThread.start();
        this.f276f = new pa(handlerThread.getLooper());
        this.f277g = new o(this, fVar2.q());
        this.f274d = 300000L;
    }

    public final void b() {
        this.f276f.removeCallbacks(this.f277g);
    }

    public final void c() {
        f4.a aVar = f270h;
        long j10 = this.f272b - this.f274d;
        aVar.g("Scheduling refresh for " + j10, new Object[0]);
        b();
        this.f273c = Math.max((this.f272b - h4.f.c().b()) - this.f274d, 0L) / 1000;
        this.f276f.postDelayed(this.f277g, this.f273c * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        long j10;
        int i10 = (int) this.f273c;
        if (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) {
            long j11 = this.f273c;
            j10 = j11 + j11;
        } else {
            j10 = i10 != 960 ? 30L : 960L;
        }
        this.f273c = j10;
        this.f272b = h4.f.c().b() + (this.f273c * 1000);
        f4.a aVar = f270h;
        long j12 = this.f272b;
        aVar.g("Scheduling refresh for " + j12, new Object[0]);
        this.f276f.postDelayed(this.f277g, this.f273c * 1000);
    }
}
