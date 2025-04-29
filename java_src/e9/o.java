package e9;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import io.flutter.view.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o3.l;
import o3.t;
import o3.u;
import p3.n0;
import q3.z;
import r8.d;
import s1.a2;
import s1.b3;
import s1.c3;
import s1.d4;
import s1.e3;
import s1.n1;
import s1.s;
import s1.v1;
import s1.y2;
import s1.y3;
import u1.e;
import u2.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private s1.s f8206a;

    /* renamed from: b  reason: collision with root package name */
    private Surface f8207b;

    /* renamed from: c  reason: collision with root package name */
    private final e.c f8208c;

    /* renamed from: d  reason: collision with root package name */
    private n f8209d;

    /* renamed from: e  reason: collision with root package name */
    private final r8.d f8210e;

    /* renamed from: g  reason: collision with root package name */
    private final p f8212g;

    /* renamed from: f  reason: collision with root package name */
    boolean f8211f = false;

    /* renamed from: h  reason: collision with root package name */
    private u.b f8213h = new u.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.InterfaceC0247d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f8214a;

        a(n nVar) {
            this.f8214a = nVar;
        }

        @Override // r8.d.InterfaceC0247d
        public void b(Object obj, d.b bVar) {
            this.f8214a.f(bVar);
        }

        @Override // r8.d.InterfaceC0247d
        public void c(Object obj) {
            this.f8214a.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements c3.d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8216a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f8217b;

        b(n nVar) {
            this.f8217b = nVar;
        }

        @Override // s1.c3.d
        public /* synthetic */ void A(int i10) {
            e3.o(this, i10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void B(boolean z10, int i10) {
            e3.q(this, z10, i10);
        }

        public void C(boolean z10) {
            if (this.f8216a != z10) {
                this.f8216a = z10;
                HashMap hashMap = new HashMap();
                hashMap.put("event", this.f8216a ? "bufferingStart" : "bufferingEnd");
                this.f8217b.a(hashMap);
            }
        }

        @Override // s1.c3.d
        public /* synthetic */ void D(boolean z10) {
            e3.i(this, z10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void E(int i10) {
            e3.r(this, i10);
        }

        @Override // s1.c3.d
        public void F(y2 y2Var) {
            C(false);
            n nVar = this.f8217b;
            if (nVar != null) {
                nVar.b("VideoError", "Video player had error " + y2Var, null);
            }
        }

        @Override // s1.c3.d
        public /* synthetic */ void K(boolean z10) {
            e3.h(this, z10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void L() {
            e3.t(this);
        }

        @Override // s1.c3.d
        public /* synthetic */ void M() {
            e3.v(this);
        }

        @Override // s1.c3.d
        public /* synthetic */ void N(d4 d4Var) {
            e3.z(this, d4Var);
        }

        @Override // s1.c3.d
        public /* synthetic */ void O(c3.b bVar) {
            e3.b(this, bVar);
        }

        @Override // s1.c3.d
        public /* synthetic */ void R(a2 a2Var) {
            e3.k(this, a2Var);
        }

        @Override // s1.c3.d
        public /* synthetic */ void S(float f10) {
            e3.B(this, f10);
        }

        @Override // s1.c3.d
        public void W(int i10) {
            if (i10 == 2) {
                C(true);
                o.this.h();
            } else if (i10 == 3) {
                o oVar = o.this;
                if (!oVar.f8211f) {
                    oVar.f8211f = true;
                    oVar.i();
                }
            } else if (i10 == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "completed");
                this.f8217b.a(hashMap);
            }
            if (i10 != 2) {
                C(false);
            }
        }

        @Override // s1.c3.d
        public /* synthetic */ void X(boolean z10, int i10) {
            e3.m(this, z10, i10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void b(boolean z10) {
            e3.w(this, z10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void b0(c3.e eVar, c3.e eVar2, int i10) {
            e3.s(this, eVar, eVar2, i10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void d(d3.e eVar) {
            e3.c(this, eVar);
        }

        @Override // s1.c3.d
        public /* synthetic */ void d0(y2 y2Var) {
            e3.p(this, y2Var);
        }

        @Override // s1.c3.d
        public /* synthetic */ void g0(y3 y3Var, int i10) {
            e3.y(this, y3Var, i10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void h0(int i10, int i11) {
            e3.x(this, i10, i11);
        }

        @Override // s1.c3.d
        public /* synthetic */ void i(List list) {
            e3.d(this, list);
        }

        @Override // s1.c3.d
        public /* synthetic */ void i0(v1 v1Var, int i10) {
            e3.j(this, v1Var, i10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void j0(c3 c3Var, c3.c cVar) {
            e3.g(this, c3Var, cVar);
        }

        @Override // s1.c3.d
        public /* synthetic */ void l(int i10) {
            e3.u(this, i10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void l0(s1.o oVar) {
            e3.e(this, oVar);
        }

        @Override // s1.c3.d
        public /* synthetic */ void n0(u1.e eVar) {
            e3.a(this, eVar);
        }

        @Override // s1.c3.d
        public /* synthetic */ void o(z zVar) {
            e3.A(this, zVar);
        }

        @Override // s1.c3.d
        public /* synthetic */ void o0(int i10, boolean z10) {
            e3.f(this, i10, z10);
        }

        @Override // s1.c3.d
        public /* synthetic */ void p(b3 b3Var) {
            e3.n(this, b3Var);
        }

        @Override // s1.c3.d
        public void p0(boolean z10) {
            if (this.f8217b != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "isPlayingStateUpdate");
                hashMap.put("isPlaying", Boolean.valueOf(z10));
                this.f8217b.a(hashMap);
            }
        }

        @Override // s1.c3.d
        public /* synthetic */ void x(k2.a aVar) {
            e3.l(this, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Context context, r8.d dVar, e.c cVar, String str, String str2, Map<String, String> map, p pVar) {
        this.f8210e = dVar;
        this.f8208c = cVar;
        this.f8212g = pVar;
        s1.s e10 = new s.b(context).e();
        Uri parse = Uri.parse(str);
        a(map);
        e10.y(b(parse, new t.a(context, this.f8213h), str2));
        e10.b();
        m(e10, new n());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private u2.u b(Uri uri, l.a aVar, String str) {
        char c10;
        int i10 = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case 3680:
                    if (str.equals("ss")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 103407:
                    if (str.equals("hls")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3075986:
                    if (str.equals("dash")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 1;
                    break;
                case 1:
                    i10 = 2;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 4;
                    break;
                default:
                    i10 = -1;
                    break;
            }
        } else {
            i10 = n0.m0(uri);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 4) {
                        return new i0.b(aVar).b(v1.d(uri));
                    }
                    throw new IllegalStateException("Unsupported type: " + i10);
                }
                return new HlsMediaSource.Factory(aVar).a(v1.d(uri));
            }
            return new SsMediaSource.Factory(new a.C0084a(aVar), aVar).a(v1.d(uri));
        }
        return new DashMediaSource.Factory(new c.a(aVar), aVar).a(v1.d(uri));
    }

    private static void j(s1.s sVar, boolean z10) {
        sVar.d(new e.C0268e().c(3).a(), !z10);
    }

    private void m(s1.s sVar, n nVar) {
        this.f8206a = sVar;
        this.f8209d = nVar;
        this.f8210e.d(new a(nVar));
        Surface surface = new Surface(this.f8208c.d());
        this.f8207b = surface;
        sVar.h(surface);
        j(sVar, this.f8212g.f8219a);
        sVar.k(new b(nVar));
    }

    public void a(Map<String, String> map) {
        boolean z10 = !map.isEmpty();
        this.f8213h.e((z10 && map.containsKey("User-Agent")) ? map.get("User-Agent") : "ExoPlayer").c(true);
        if (z10) {
            this.f8213h.d(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f8211f) {
            this.f8206a.stop();
        }
        this.f8208c.a();
        this.f8210e.d(null);
        Surface surface = this.f8207b;
        if (surface != null) {
            surface.release();
        }
        s1.s sVar = this.f8206a;
        if (sVar != null) {
            sVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        return this.f8206a.H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f8206a.g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f8206a.g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10) {
        this.f8206a.G(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(this.f8206a.m()))));
        this.f8209d.a(hashMap);
    }

    void i() {
        if (this.f8211f) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "initialized");
            hashMap.put("duration", Long.valueOf(this.f8206a.D()));
            if (this.f8206a.q() != null) {
                n1 q10 = this.f8206a.q();
                int i10 = q10.f17424z;
                int i11 = q10.A;
                int i12 = q10.C;
                if (i12 == 90 || i12 == 270) {
                    i10 = this.f8206a.q().A;
                    i11 = this.f8206a.q().f17424z;
                }
                hashMap.put("width", Integer.valueOf(i10));
                hashMap.put("height", Integer.valueOf(i11));
                if (i12 == 180) {
                    hashMap.put("rotationCorrection", Integer.valueOf(i12));
                }
            }
            this.f8209d.a(hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(boolean z10) {
        this.f8206a.w(z10 ? 2 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(double d10) {
        this.f8206a.c(new b3((float) d10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(double d10) {
        this.f8206a.e((float) Math.max(0.0d, Math.min(1.0d, d10)));
    }
}
