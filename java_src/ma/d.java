package ma;

import android.os.Handler;
import android.os.Looper;
import ha.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import la.a1;
import la.c1;
import la.i2;
import la.z1;
/* loaded from: classes.dex */
public final class d extends e {
    private volatile d _immediate;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f13960l;

    /* renamed from: m  reason: collision with root package name */
    private final String f13961m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f13962n;

    /* renamed from: o  reason: collision with root package name */
    private final d f13963o;

    public d(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ d(Handler handler, String str, int i10, g gVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    private d(Handler handler, String str, boolean z10) {
        super(null);
        this.f13960l = handler;
        this.f13961m = str;
        this.f13962n = z10;
        this._immediate = z10 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f13963o = dVar;
    }

    private final void n0(v9.g gVar, Runnable runnable) {
        z1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        a1.b().h0(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(d dVar, Runnable runnable) {
        dVar.f13960l.removeCallbacks(runnable);
    }

    @Override // ma.e, la.t0
    public c1 c0(long j10, final Runnable runnable, v9.g gVar) {
        long d10;
        Handler handler = this.f13960l;
        d10 = i.d(j10, 4611686018427387903L);
        if (handler.postDelayed(runnable, d10)) {
            return new c1() { // from class: ma.c
                @Override // la.c1
                public final void b() {
                    d.p0(d.this, runnable);
                }
            };
        }
        n0(gVar, runnable);
        return i2.f13634j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f13960l == this.f13960l;
    }

    @Override // la.g0
    public void h0(v9.g gVar, Runnable runnable) {
        if (this.f13960l.post(runnable)) {
            return;
        }
        n0(gVar, runnable);
    }

    public int hashCode() {
        return System.identityHashCode(this.f13960l);
    }

    @Override // la.g0
    public boolean i0(v9.g gVar) {
        return (this.f13962n && l.a(Looper.myLooper(), this.f13960l.getLooper())) ? false : true;
    }

    @Override // la.g2
    /* renamed from: o0 */
    public d k0() {
        return this.f13963o;
    }

    @Override // la.g2, la.g0
    public String toString() {
        String l02 = l0();
        if (l02 == null) {
            String str = this.f13961m;
            if (str == null) {
                str = this.f13960l.toString();
            }
            if (this.f13962n) {
                return str + ".immediate";
            }
            return str;
        }
        return l02;
    }
}
