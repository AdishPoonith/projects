package io.flutter.plugin.platform;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.android.u;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.q;
import io.flutter.view.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import q8.k;
/* loaded from: classes.dex */
public class q implements k {

    /* renamed from: w  reason: collision with root package name */
    private static Class[] f10481w = {SurfaceView.class};

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.android.a f10483b;

    /* renamed from: c  reason: collision with root package name */
    private Context f10484c;

    /* renamed from: d  reason: collision with root package name */
    private io.flutter.embedding.android.k f10485d;

    /* renamed from: e  reason: collision with root package name */
    private io.flutter.view.e f10486e;

    /* renamed from: f  reason: collision with root package name */
    private io.flutter.plugin.editing.f f10487f;

    /* renamed from: g  reason: collision with root package name */
    private q8.k f10488g;

    /* renamed from: o  reason: collision with root package name */
    private int f10496o = 0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10497p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10498q = true;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10502u = false;

    /* renamed from: v  reason: collision with root package name */
    private final k.g f10503v = new a();

    /* renamed from: a  reason: collision with root package name */
    private final i f10482a = new i();

    /* renamed from: i  reason: collision with root package name */
    final HashMap<Integer, r> f10490i = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final io.flutter.plugin.platform.a f10489h = new io.flutter.plugin.platform.a();

    /* renamed from: j  reason: collision with root package name */
    final HashMap<Context, View> f10491j = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private final SparseArray<b> f10494m = new SparseArray<>();

    /* renamed from: r  reason: collision with root package name */
    private final HashSet<Integer> f10499r = new HashSet<>();

    /* renamed from: s  reason: collision with root package name */
    private final HashSet<Integer> f10500s = new HashSet<>();

    /* renamed from: n  reason: collision with root package name */
    private final SparseArray<j> f10495n = new SparseArray<>();

    /* renamed from: k  reason: collision with root package name */
    private final SparseArray<f> f10492k = new SparseArray<>();

    /* renamed from: l  reason: collision with root package name */
    private final SparseArray<h8.a> f10493l = new SparseArray<>();

    /* renamed from: t  reason: collision with root package name */
    private final u f10501t = u.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements k.g {
        a() {
        }

        private void m(f fVar, k.d dVar) {
            d8.b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f16404a);
        }

        private long n(f fVar, final k.d dVar) {
            j jVar;
            long j10;
            q(23);
            d8.b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f16404a);
            int l02 = q.this.l0(dVar.f16406c);
            int l03 = q.this.l0(dVar.f16407d);
            if (q.this.f10502u) {
                jVar = new j(q.this.f10484c);
                j10 = -1;
            } else {
                e.c a10 = q.this.f10486e.a();
                j jVar2 = new j(q.this.f10484c, a10);
                long e10 = a10.e();
                jVar = jVar2;
                j10 = e10;
            }
            jVar.m(q.this.f10483b);
            jVar.i(l02, l03);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(l02, l03);
            int l04 = q.this.l0(dVar.f16408e);
            int l05 = q.this.l0(dVar.f16409f);
            layoutParams.topMargin = l04;
            layoutParams.leftMargin = l05;
            jVar.j(layoutParams);
            View w10 = fVar.w();
            w10.setLayoutParams(new FrameLayout.LayoutParams(l02, l03));
            w10.setImportantForAccessibility(4);
            jVar.addView(w10);
            jVar.k(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.n
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    q.a.this.s(dVar, view, z10);
                }
            });
            q.this.f10485d.addView(jVar);
            q.this.f10495n.append(dVar.f16404a, jVar);
            return j10;
        }

        private long o(f fVar, final k.d dVar) {
            q(20);
            d8.b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f16404a);
            e.c a10 = q.this.f10486e.a();
            r a11 = r.a(q.this.f10484c, q.this.f10489h, fVar, a10, q.this.l0(dVar.f16406c), q.this.l0(dVar.f16407d), dVar.f16404a, null, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.o
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    q.a.this.t(dVar, view, z10);
                }
            });
            if (a11 != null) {
                if (q.this.f10485d != null) {
                    a11.f(q.this.f10485d);
                }
                q.this.f10490i.put(Integer.valueOf(dVar.f16404a), a11);
                View w10 = fVar.w();
                q.this.f10491j.put(w10.getContext(), w10);
                return a10.e();
            }
            throw new IllegalStateException("Failed creating virtual display for a " + dVar.f16405b + " with id: " + dVar.f16404a);
        }

        private f p(k.d dVar, boolean z10) {
            g b10 = q.this.f10482a.b(dVar.f16405b);
            if (b10 == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f16405b);
            }
            f a10 = b10.a(z10 ? new MutableContextWrapper(q.this.f10484c) : q.this.f10484c, dVar.f16404a, dVar.f16412i != null ? b10.b().b(dVar.f16412i) : null);
            View w10 = a10.w();
            if (w10 != null) {
                w10.setLayoutDirection(dVar.f16410g);
                q.this.f10492k.put(dVar.f16404a, a10);
                return a10;
            }
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }

        private void q(int i10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= i10) {
                return;
            }
            throw new IllegalStateException("Trying to use platform views with API " + i11 + ", required API level is: " + i10);
        }

        private void r(k.d dVar) {
            if (q.n0(dVar.f16410g)) {
                return;
            }
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f16410g + "(view id: " + dVar.f16404a + ")");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(k.d dVar, View view, boolean z10) {
            q qVar = q.this;
            if (z10) {
                qVar.f10488g.d(dVar.f16404a);
            } else if (qVar.f10487f != null) {
                q.this.f10487f.l(dVar.f16404a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(k.d dVar, View view, boolean z10) {
            if (z10) {
                q.this.f10488g.d(dVar.f16404a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(r rVar, float f10, k.b bVar) {
            q.this.m0(rVar);
            if (q.this.f10484c != null) {
                f10 = q.this.O();
            }
            bVar.a(new k.c(q.this.j0(rVar.d(), f10), q.this.j0(rVar.c(), f10)));
        }

        @Override // q8.k.g
        public void a(boolean z10) {
            q.this.f10498q = z10;
        }

        @Override // q8.k.g
        public void b(int i10, double d10, double d11) {
            if (q.this.b(i10)) {
                return;
            }
            j jVar = (j) q.this.f10495n.get(i10);
            if (jVar == null) {
                d8.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i10);
                return;
            }
            int l02 = q.this.l0(d10);
            int l03 = q.this.l0(d11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            layoutParams.topMargin = l02;
            layoutParams.leftMargin = l03;
            jVar.j(layoutParams);
        }

        @Override // q8.k.g
        public void c(int i10, int i11) {
            View w10;
            StringBuilder sb;
            String str;
            if (!q.n0(i11)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i11 + "(view id: " + i10 + ")");
            }
            if (q.this.b(i10)) {
                w10 = q.this.f10490i.get(Integer.valueOf(i10)).e();
            } else {
                f fVar = (f) q.this.f10492k.get(i10);
                if (fVar == null) {
                    sb = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                    sb.append(str);
                    sb.append(i10);
                    d8.b.b("PlatformViewsController", sb.toString());
                }
                w10 = fVar.w();
            }
            if (w10 != null) {
                w10.setLayoutDirection(i11);
                return;
            }
            sb = new StringBuilder();
            str = "Setting direction to a null view with id: ";
            sb.append(str);
            sb.append(i10);
            d8.b.b("PlatformViewsController", sb.toString());
        }

        @Override // q8.k.g
        public long d(k.d dVar) {
            r(dVar);
            int i10 = dVar.f16404a;
            if (q.this.f10495n.get(i10) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i10);
            } else if (q.this.f10486e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i10);
            } else if (q.this.f10485d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i10);
            } else {
                boolean z10 = true;
                f p10 = p(dVar, true);
                View w10 = p10.w();
                if (w10.getParent() == null) {
                    if (!((Build.VERSION.SDK_INT < 23 || f9.h.f(w10, q.f10481w)) ? false : false)) {
                        if (dVar.f16411h == k.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                            m(p10, dVar);
                            return -2L;
                        } else if (!q.this.f10502u) {
                            return o(p10, dVar);
                        }
                    }
                    return n(p10, dVar);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }

        @Override // q8.k.g
        public void e(k.f fVar) {
            int i10 = fVar.f16420a;
            float f10 = q.this.f10484c.getResources().getDisplayMetrics().density;
            if (q.this.b(i10)) {
                q.this.f10490i.get(Integer.valueOf(i10)).b(q.this.k0(f10, fVar, true));
                return;
            }
            f fVar2 = (f) q.this.f10492k.get(i10);
            if (fVar2 == null) {
                d8.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i10);
                return;
            }
            View w10 = fVar2.w();
            if (w10 != null) {
                w10.dispatchTouchEvent(q.this.k0(f10, fVar, false));
                return;
            }
            d8.b.b("PlatformViewsController", "Sending touch to a null view with id: " + i10);
        }

        @Override // q8.k.g
        public void f(k.e eVar, final k.b bVar) {
            int l02 = q.this.l0(eVar.f16418b);
            int l03 = q.this.l0(eVar.f16419c);
            int i10 = eVar.f16417a;
            if (q.this.b(i10)) {
                final float O = q.this.O();
                final r rVar = q.this.f10490i.get(Integer.valueOf(i10));
                q.this.U(rVar);
                rVar.i(l02, l03, new Runnable() { // from class: io.flutter.plugin.platform.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.a.this.u(rVar, O, bVar);
                    }
                });
                return;
            }
            f fVar = (f) q.this.f10492k.get(i10);
            j jVar = (j) q.this.f10495n.get(i10);
            if (fVar == null || jVar == null) {
                d8.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i10);
                return;
            }
            if (l02 > jVar.e() || l03 > jVar.d()) {
                jVar.i(l02, l03);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = l02;
            layoutParams.height = l03;
            jVar.setLayoutParams(layoutParams);
            View w10 = fVar.w();
            if (w10 != null) {
                ViewGroup.LayoutParams layoutParams2 = w10.getLayoutParams();
                layoutParams2.width = l02;
                layoutParams2.height = l03;
                w10.setLayoutParams(layoutParams2);
            }
            bVar.a(new k.c(q.this.i0(jVar.e()), q.this.i0(jVar.d())));
        }

        @Override // q8.k.g
        public void g(int i10) {
            View w10;
            StringBuilder sb;
            String str;
            if (q.this.b(i10)) {
                w10 = q.this.f10490i.get(Integer.valueOf(i10)).e();
            } else {
                f fVar = (f) q.this.f10492k.get(i10);
                if (fVar == null) {
                    sb = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                    sb.append(str);
                    sb.append(i10);
                    d8.b.b("PlatformViewsController", sb.toString());
                }
                w10 = fVar.w();
            }
            if (w10 != null) {
                w10.clearFocus();
                return;
            }
            sb = new StringBuilder();
            str = "Clearing focus on a null view with id: ";
            sb.append(str);
            sb.append(i10);
            d8.b.b("PlatformViewsController", sb.toString());
        }

        @Override // q8.k.g
        public void h(k.d dVar) {
            q(19);
            r(dVar);
            m(p(dVar, false), dVar);
        }

        @Override // q8.k.g
        public void i(int i10) {
            f fVar = (f) q.this.f10492k.get(i10);
            if (fVar == null) {
                d8.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i10);
                return;
            }
            q.this.f10492k.remove(i10);
            try {
                fVar.b();
            } catch (RuntimeException e10) {
                d8.b.c("PlatformViewsController", "Disposing platform view threw an exception", e10);
            }
            if (q.this.b(i10)) {
                View e11 = q.this.f10490i.get(Integer.valueOf(i10)).e();
                if (e11 != null) {
                    q.this.f10491j.remove(e11.getContext());
                }
                q.this.f10490i.remove(Integer.valueOf(i10));
                return;
            }
            j jVar = (j) q.this.f10495n.get(i10);
            if (jVar != null) {
                jVar.removeAllViews();
                jVar.h();
                jVar.o();
                ViewGroup viewGroup = (ViewGroup) jVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(jVar);
                }
                q.this.f10495n.remove(i10);
                return;
            }
            h8.a aVar = (h8.a) q.this.f10493l.get(i10);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                q.this.f10493l.remove(i10);
            }
        }
    }

    private void M() {
        while (this.f10492k.size() > 0) {
            this.f10503v.i(this.f10492k.keyAt(0));
        }
    }

    private void N(boolean z10) {
        for (int i10 = 0; i10 < this.f10494m.size(); i10++) {
            int keyAt = this.f10494m.keyAt(i10);
            b valueAt = this.f10494m.valueAt(i10);
            if (this.f10499r.contains(Integer.valueOf(keyAt))) {
                this.f10485d.n(valueAt);
                z10 &= valueAt.a();
            } else {
                if (!this.f10497p) {
                    valueAt.e();
                }
                valueAt.setVisibility(8);
                this.f10485d.removeView(valueAt);
            }
        }
        for (int i11 = 0; i11 < this.f10493l.size(); i11++) {
            int keyAt2 = this.f10493l.keyAt(i11);
            h8.a aVar = this.f10493l.get(keyAt2);
            if (!this.f10500s.contains(Integer.valueOf(keyAt2)) || (!z10 && this.f10498q)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float O() {
        return this.f10484c.getResources().getDisplayMetrics().density;
    }

    private void R() {
        if (!this.f10498q || this.f10497p) {
            return;
        }
        this.f10485d.q();
        this.f10497p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(int i10, View view, boolean z10) {
        if (z10) {
            this.f10488g.d(i10);
            return;
        }
        io.flutter.plugin.editing.f fVar = this.f10487f;
        if (fVar != null) {
            fVar.l(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        N(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(r rVar) {
        io.flutter.plugin.editing.f fVar = this.f10487f;
        if (fVar == null) {
            return;
        }
        fVar.u();
        rVar.g();
    }

    private static MotionEvent.PointerCoords c0(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f10;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f10;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f10;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f10;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f10;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f10;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> d0(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(c0(obj2, f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties e0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> f0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(e0(obj2));
        }
        return arrayList;
    }

    private void g0() {
        if (this.f10485d == null) {
            d8.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i10 = 0; i10 < this.f10494m.size(); i10++) {
            this.f10485d.removeView(this.f10494m.valueAt(i10));
        }
        this.f10494m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i0(double d10) {
        return j0(d10, O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j0(double d10, float f10) {
        return (int) Math.round(d10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l0(double d10) {
        return (int) Math.round(d10 * O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(r rVar) {
        io.flutter.plugin.editing.f fVar = this.f10487f;
        if (fVar == null) {
            return;
        }
        fVar.G();
        rVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n0(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public void B(Context context, io.flutter.view.e eVar, e8.a aVar) {
        if (this.f10484c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f10484c = context;
        this.f10486e = eVar;
        q8.k kVar = new q8.k(aVar);
        this.f10488g = kVar;
        kVar.e(this.f10503v);
    }

    public void C(io.flutter.plugin.editing.f fVar) {
        this.f10487f = fVar;
    }

    public void D(p8.a aVar) {
        this.f10483b = new io.flutter.embedding.android.a(aVar, true);
    }

    public void E(io.flutter.embedding.android.k kVar) {
        this.f10485d = kVar;
        for (int i10 = 0; i10 < this.f10495n.size(); i10++) {
            this.f10485d.addView(this.f10495n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f10493l.size(); i11++) {
            this.f10485d.addView(this.f10493l.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.f10492k.size(); i12++) {
            this.f10492k.valueAt(i12).A(this.f10485d);
        }
    }

    public boolean F(View view) {
        if (view != null && this.f10491j.containsKey(view.getContext())) {
            View view2 = this.f10491j.get(view.getContext());
            if (view2 == view) {
                return true;
            }
            return view2.checkInputConnectionProxy(view);
        }
        return false;
    }

    public FlutterOverlaySurface G() {
        return H(new b(this.f10485d.getContext(), this.f10485d.getWidth(), this.f10485d.getHeight(), this.f10489h));
    }

    public FlutterOverlaySurface H(b bVar) {
        int i10 = this.f10496o;
        this.f10496o = i10 + 1;
        this.f10494m.put(i10, bVar);
        return new FlutterOverlaySurface(i10, bVar.getSurface());
    }

    public void I() {
        for (int i10 = 0; i10 < this.f10494m.size(); i10++) {
            b valueAt = this.f10494m.valueAt(i10);
            valueAt.e();
            valueAt.c();
        }
    }

    public void J() {
        q8.k kVar = this.f10488g;
        if (kVar != null) {
            kVar.e(null);
        }
        I();
        this.f10488g = null;
        this.f10484c = null;
        this.f10486e = null;
    }

    public void K() {
        for (int i10 = 0; i10 < this.f10495n.size(); i10++) {
            this.f10485d.removeView(this.f10495n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f10493l.size(); i11++) {
            this.f10485d.removeView(this.f10493l.valueAt(i11));
        }
        I();
        g0();
        this.f10485d = null;
        this.f10497p = false;
        for (int i12 = 0; i12 < this.f10492k.size(); i12++) {
            this.f10492k.valueAt(i12).H();
        }
    }

    public void L() {
        this.f10487f = null;
    }

    public h P() {
        return this.f10482a;
    }

    void Q(final int i10) {
        f fVar = this.f10492k.get(i10);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.f10493l.get(i10) != null) {
            return;
        }
        View w10 = fVar.w();
        if (w10 == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (w10.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f10484c;
        h8.a aVar = new h8.a(context, context.getResources().getDisplayMetrics().density, this.f10483b);
        aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                q.this.S(i10, view, z10);
            }
        });
        this.f10493l.put(i10, aVar);
        w10.setImportantForAccessibility(4);
        aVar.addView(w10);
        this.f10485d.addView(aVar);
    }

    public void V() {
    }

    public void W() {
        this.f10499r.clear();
        this.f10500s.clear();
    }

    public void X() {
        M();
    }

    public void Y(int i10, int i11, int i12, int i13, int i14) {
        if (this.f10494m.get(i10) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i10 + ") doesn't exist");
        }
        R();
        b bVar = this.f10494m.get(i10);
        if (bVar.getParent() == null) {
            this.f10485d.addView(bVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        layoutParams.leftMargin = i11;
        layoutParams.topMargin = i12;
        bVar.setLayoutParams(layoutParams);
        bVar.setVisibility(0);
        bVar.bringToFront();
        this.f10499r.add(Integer.valueOf(i10));
    }

    public void Z(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        R();
        Q(i10);
        h8.a aVar = this.f10493l.get(i10);
        aVar.a(flutterMutatorsStack, i11, i12, i13, i14);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
        View w10 = this.f10492k.get(i10).w();
        if (w10 != null) {
            w10.setLayoutParams(layoutParams);
            w10.bringToFront();
        }
        this.f10500s.add(Integer.valueOf(i10));
    }

    @Override // io.flutter.plugin.platform.k
    public void a(io.flutter.view.c cVar) {
        this.f10489h.c(cVar);
    }

    public void a0() {
        boolean z10 = false;
        if (this.f10497p && this.f10500s.isEmpty()) {
            this.f10497p = false;
            this.f10485d.D(new Runnable() { // from class: io.flutter.plugin.platform.m
                @Override // java.lang.Runnable
                public final void run() {
                    q.this.T();
                }
            });
            return;
        }
        if (this.f10497p && this.f10485d.k()) {
            z10 = true;
        }
        N(z10);
    }

    @Override // io.flutter.plugin.platform.k
    public boolean b(int i10) {
        return this.f10490i.containsKey(Integer.valueOf(i10));
    }

    public void b0() {
        M();
    }

    @Override // io.flutter.plugin.platform.k
    public View c(int i10) {
        if (b(i10)) {
            return this.f10490i.get(Integer.valueOf(i10)).e();
        }
        f fVar = this.f10492k.get(i10);
        if (fVar == null) {
            return null;
        }
        return fVar.w();
    }

    @Override // io.flutter.plugin.platform.k
    public void d() {
        this.f10489h.c(null);
    }

    public void h0(boolean z10) {
        this.f10502u = z10;
    }

    public MotionEvent k0(float f10, k.f fVar, boolean z10) {
        MotionEvent b10 = this.f10501t.b(u.a.c(fVar.f16435p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) f0(fVar.f16425f).toArray(new MotionEvent.PointerProperties[fVar.f16424e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) d0(fVar.f16426g, f10).toArray(new MotionEvent.PointerCoords[fVar.f16424e]);
        return (z10 || b10 == null) ? MotionEvent.obtain(fVar.f16421b.longValue(), fVar.f16422c.longValue(), fVar.f16423d, fVar.f16424e, pointerPropertiesArr, pointerCoordsArr, fVar.f16427h, fVar.f16428i, fVar.f16429j, fVar.f16430k, fVar.f16431l, fVar.f16432m, fVar.f16433n, fVar.f16434o) : MotionEvent.obtain(b10.getDownTime(), b10.getEventTime(), fVar.f16423d, fVar.f16424e, pointerPropertiesArr, pointerCoordsArr, b10.getMetaState(), b10.getButtonState(), b10.getXPrecision(), b10.getYPrecision(), b10.getDeviceId(), b10.getEdgeFlags(), b10.getSource(), b10.getFlags());
    }
}
