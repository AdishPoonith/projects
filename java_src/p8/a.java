package p8;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.e;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class a implements io.flutter.view.e {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f15781a;

    /* renamed from: c  reason: collision with root package name */
    private Surface f15783c;

    /* renamed from: g  reason: collision with root package name */
    private final p8.b f15787g;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f15782b = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    private boolean f15784d = false;

    /* renamed from: e  reason: collision with root package name */
    private Handler f15785e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private final Set<WeakReference<e.b>> f15786f = new HashSet();

    /* renamed from: p8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0227a implements p8.b {
        C0227a() {
        }

        @Override // p8.b
        public void c() {
            a.this.f15784d = false;
        }

        @Override // p8.b
        public void f() {
            a.this.f15784d = true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f15789a;

        /* renamed from: b  reason: collision with root package name */
        public final d f15790b;

        /* renamed from: c  reason: collision with root package name */
        public final c f15791c;

        public b(Rect rect, d dVar) {
            this.f15789a = rect;
            this.f15790b = dVar;
            this.f15791c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f15789a = rect;
            this.f15790b = dVar;
            this.f15791c = cVar;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: j  reason: collision with root package name */
        public final int f15796j;

        c(int i10) {
            this.f15796j = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: j  reason: collision with root package name */
        public final int f15802j;

        d(int i10) {
            this.f15802j = i10;
        }
    }

    /* loaded from: classes.dex */
    static final class e implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final long f15803j;

        /* renamed from: k  reason: collision with root package name */
        private final FlutterJNI f15804k;

        e(long j10, FlutterJNI flutterJNI) {
            this.f15803j = j10;
            this.f15804k = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15804k.isAttached()) {
                d8.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f15803j + ").");
                this.f15804k.unregisterTexture(this.f15803j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class f implements e.c, e.b {

        /* renamed from: a  reason: collision with root package name */
        private final long f15805a;

        /* renamed from: b  reason: collision with root package name */
        private final SurfaceTextureWrapper f15806b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15807c;

        /* renamed from: d  reason: collision with root package name */
        private e.b f15808d;

        /* renamed from: e  reason: collision with root package name */
        private e.a f15809e;

        /* renamed from: f  reason: collision with root package name */
        private final Runnable f15810f;

        /* renamed from: g  reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f15811g;

        /* renamed from: p8.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0228a implements Runnable {
            RunnableC0228a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f15809e != null) {
                    f.this.f15809e.a();
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (f.this.f15807c || !a.this.f15781a.isAttached()) {
                    return;
                }
                f fVar = f.this;
                a.this.m(fVar.f15805a);
            }
        }

        f(long j10, SurfaceTexture surfaceTexture) {
            RunnableC0228a runnableC0228a = new RunnableC0228a();
            this.f15810f = runnableC0228a;
            this.f15811g = new b();
            this.f15805a = j10;
            this.f15806b = new SurfaceTextureWrapper(surfaceTexture, runnableC0228a);
            d().setOnFrameAvailableListener(this.f15811g, new Handler());
        }

        private void i() {
            a.this.r(this);
        }

        @Override // io.flutter.view.e.c
        public void a() {
            if (this.f15807c) {
                return;
            }
            d8.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f15805a + ").");
            this.f15806b.release();
            a.this.y(this.f15805a);
            i();
            this.f15807c = true;
        }

        @Override // io.flutter.view.e.c
        public void b(e.b bVar) {
            this.f15808d = bVar;
        }

        @Override // io.flutter.view.e.c
        public void c(e.a aVar) {
            this.f15809e = aVar;
        }

        @Override // io.flutter.view.e.c
        public SurfaceTexture d() {
            return this.f15806b.surfaceTexture();
        }

        @Override // io.flutter.view.e.c
        public long e() {
            return this.f15805a;
        }

        protected void finalize() {
            try {
                if (this.f15807c) {
                    return;
                }
                a.this.f15785e.post(new e(this.f15805a, a.this.f15781a));
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper j() {
            return this.f15806b;
        }

        @Override // io.flutter.view.e.b
        public void onTrimMemory(int i10) {
            e.b bVar = this.f15808d;
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public float f15815a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f15816b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f15817c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f15818d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f15819e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f15820f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f15821g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f15822h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f15823i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f15824j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f15825k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f15826l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f15827m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f15828n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f15829o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f15830p = -1;

        /* renamed from: q  reason: collision with root package name */
        public List<b> f15831q = new ArrayList();

        boolean a() {
            return this.f15816b > 0 && this.f15817c > 0 && this.f15815a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0227a c0227a = new C0227a();
        this.f15787g = c0227a;
        this.f15781a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0227a);
    }

    private void i() {
        Iterator<WeakReference<e.b>> it = this.f15786f.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(long j10) {
        this.f15781a.markTextureFrameAvailable(j10);
    }

    private void p(long j10, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f15781a.registerTexture(j10, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(long j10) {
        this.f15781a.unregisterTexture(j10);
    }

    @Override // io.flutter.view.e
    public e.c a() {
        d8.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return o(new SurfaceTexture(0));
    }

    public void g(p8.b bVar) {
        this.f15781a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f15784d) {
            bVar.f();
        }
    }

    void h(e.b bVar) {
        i();
        this.f15786f.add(new WeakReference<>(bVar));
    }

    public void j(ByteBuffer byteBuffer, int i10) {
        this.f15781a.dispatchPointerDataPacket(byteBuffer, i10);
    }

    public boolean k() {
        return this.f15784d;
    }

    public boolean l() {
        return this.f15781a.getIsSoftwareRenderingEnabled();
    }

    public void n(int i10) {
        Iterator<WeakReference<e.b>> it = this.f15786f.iterator();
        while (it.hasNext()) {
            e.b bVar = it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    public e.c o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(this.f15782b.getAndIncrement(), surfaceTexture);
        d8.b.f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.e());
        p(fVar.e(), fVar.j());
        h(fVar);
        return fVar;
    }

    public void q(p8.b bVar) {
        this.f15781a.removeIsDisplayingFlutterUiListener(bVar);
    }

    void r(e.b bVar) {
        for (WeakReference<e.b> weakReference : this.f15786f) {
            if (weakReference.get() == bVar) {
                this.f15786f.remove(weakReference);
                return;
            }
        }
    }

    public void s(boolean z10) {
        this.f15781a.setSemanticsEnabled(z10);
    }

    public void t(g gVar) {
        if (gVar.a()) {
            d8.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.f15816b + " x " + gVar.f15817c + "\nPadding - L: " + gVar.f15821g + ", T: " + gVar.f15818d + ", R: " + gVar.f15819e + ", B: " + gVar.f15820f + "\nInsets - L: " + gVar.f15825k + ", T: " + gVar.f15822h + ", R: " + gVar.f15823i + ", B: " + gVar.f15824j + "\nSystem Gesture Insets - L: " + gVar.f15829o + ", T: " + gVar.f15826l + ", R: " + gVar.f15827m + ", B: " + gVar.f15827m + "\nDisplay Features: " + gVar.f15831q.size());
            int[] iArr = new int[gVar.f15831q.size() * 4];
            int[] iArr2 = new int[gVar.f15831q.size()];
            int[] iArr3 = new int[gVar.f15831q.size()];
            for (int i10 = 0; i10 < gVar.f15831q.size(); i10++) {
                b bVar = gVar.f15831q.get(i10);
                int i11 = i10 * 4;
                Rect rect = bVar.f15789a;
                iArr[i11] = rect.left;
                iArr[i11 + 1] = rect.top;
                iArr[i11 + 2] = rect.right;
                iArr[i11 + 3] = rect.bottom;
                iArr2[i10] = bVar.f15790b.f15802j;
                iArr3[i10] = bVar.f15791c.f15796j;
            }
            this.f15781a.setViewportMetrics(gVar.f15815a, gVar.f15816b, gVar.f15817c, gVar.f15818d, gVar.f15819e, gVar.f15820f, gVar.f15821g, gVar.f15822h, gVar.f15823i, gVar.f15824j, gVar.f15825k, gVar.f15826l, gVar.f15827m, gVar.f15828n, gVar.f15829o, gVar.f15830p, iArr, iArr2, iArr3);
        }
    }

    public void u(Surface surface, boolean z10) {
        if (this.f15783c != null && !z10) {
            v();
        }
        this.f15783c = surface;
        this.f15781a.onSurfaceCreated(surface);
    }

    public void v() {
        this.f15781a.onSurfaceDestroyed();
        this.f15783c = null;
        if (this.f15784d) {
            this.f15787g.c();
        }
        this.f15784d = false;
    }

    public void w(int i10, int i11) {
        this.f15781a.onSurfaceChanged(i10, i11);
    }

    public void x(Surface surface) {
        this.f15783c = surface;
        this.f15781a.onSurfaceWindowChanged(surface);
    }
}
