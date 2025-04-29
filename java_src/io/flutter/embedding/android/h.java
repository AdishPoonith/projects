package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
/* loaded from: classes.dex */
public class h extends SurfaceView implements p8.c {

    /* renamed from: j  reason: collision with root package name */
    private final boolean f10176j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10177k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10178l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10179m;

    /* renamed from: n  reason: collision with root package name */
    private p8.a f10180n;

    /* renamed from: o  reason: collision with root package name */
    private final SurfaceHolder.Callback f10181o;

    /* renamed from: p  reason: collision with root package name */
    private final p8.b f10182p;

    /* loaded from: classes.dex */
    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            d8.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (h.this.f10179m) {
                h.this.j(i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            d8.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            h.this.f10177k = true;
            if (h.this.f10179m) {
                h.this.k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d8.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            h.this.f10177k = false;
            if (h.this.f10179m) {
                h.this.l();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements p8.b {
        b() {
        }

        @Override // p8.b
        public void c() {
        }

        @Override // p8.b
        public void f() {
            d8.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            h.this.setAlpha(1.0f);
            if (h.this.f10180n != null) {
                h.this.f10180n.q(this);
            }
        }
    }

    private h(Context context, AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.f10177k = false;
        this.f10178l = false;
        this.f10179m = false;
        this.f10181o = new a();
        this.f10182p = new b();
        this.f10176j = z10;
        m();
    }

    public h(Context context, boolean z10) {
        this(context, null, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i10, int i11) {
        if (this.f10180n == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        d8.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
        this.f10180n.w(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f10180n == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f10180n.u(getHolder().getSurface(), this.f10178l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        p8.a aVar = this.f10180n;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.v();
    }

    private void m() {
        if (this.f10176j) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f10181o);
        setAlpha(0.0f);
    }

    @Override // p8.c
    public void d() {
        if (this.f10180n == null) {
            d8.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f10180n = null;
        this.f10178l = true;
        this.f10179m = false;
    }

    @Override // p8.c
    public void e() {
        if (this.f10180n == null) {
            d8.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            d8.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            l();
        }
        setAlpha(0.0f);
        this.f10180n.q(this.f10182p);
        this.f10180n = null;
        this.f10179m = false;
    }

    @Override // p8.c
    public void f(p8.a aVar) {
        d8.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f10180n != null) {
            d8.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f10180n.v();
            this.f10180n.q(this.f10182p);
        }
        this.f10180n = aVar;
        this.f10179m = true;
        aVar.g(this.f10182p);
        if (this.f10177k) {
            d8.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
        this.f10178l = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // p8.c
    public p8.a getAttachedRenderer() {
        return this.f10180n;
    }
}
