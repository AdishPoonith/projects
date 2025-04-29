package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.view.e;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    private int f10452j;

    /* renamed from: k  reason: collision with root package name */
    private int f10453k;

    /* renamed from: l  reason: collision with root package name */
    private int f10454l;

    /* renamed from: m  reason: collision with root package name */
    private int f10455m;

    /* renamed from: n  reason: collision with root package name */
    private int f10456n;

    /* renamed from: o  reason: collision with root package name */
    private int f10457o;

    /* renamed from: p  reason: collision with root package name */
    private SurfaceTexture f10458p;

    /* renamed from: q  reason: collision with root package name */
    private Surface f10459q;

    /* renamed from: r  reason: collision with root package name */
    private io.flutter.embedding.android.a f10460r;

    /* renamed from: s  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f10461s;

    /* renamed from: t  reason: collision with root package name */
    private final AtomicLong f10462t;

    /* renamed from: u  reason: collision with root package name */
    private final e.a f10463u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f10464v;

    /* renamed from: w  reason: collision with root package name */
    private final e.b f10465w;

    /* loaded from: classes.dex */
    class a implements e.a {
        a() {
        }

        @Override // io.flutter.view.e.a
        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                j.this.f10462t.decrementAndGet();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements e.b {
        b() {
        }

        @Override // io.flutter.view.e.b
        public void onTrimMemory(int i10) {
            if (i10 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            j.this.f10464v = true;
        }
    }

    /* loaded from: classes.dex */
    class c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f10468j;

        c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f10468j = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f10468j;
            j jVar = j.this;
            onFocusChangeListener.onFocusChange(jVar, f9.h.c(jVar));
        }
    }

    public j(Context context) {
        super(context);
        this.f10462t = new AtomicLong(0L);
        this.f10463u = new a();
        this.f10464v = false;
        this.f10465w = new b();
        setWillNotDraw(false);
    }

    public j(Context context, e.c cVar) {
        this(context);
        cVar.c(this.f10463u);
        cVar.b(this.f10465w);
        l(cVar.d());
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f10462t.incrementAndGet();
        }
    }

    private void g() {
        if (this.f10464v) {
            Surface surface = this.f10459q;
            if (surface != null) {
                surface.release();
            }
            this.f10459q = c(this.f10458p);
            this.f10464v = false;
        }
    }

    private boolean n() {
        return Build.VERSION.SDK_INT != 29 || this.f10462t.get() <= 0;
    }

    protected Surface c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public int d() {
        return this.f10457o;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        String str;
        Surface surface = this.f10459q;
        if (surface == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (surface.isValid()) {
            SurfaceTexture surfaceTexture = this.f10458p;
            if (surfaceTexture != null && !surfaceTexture.isReleased()) {
                if (!n()) {
                    invalidate();
                    return;
                }
                g();
                Canvas lockHardwareCanvas = this.f10459q.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    f();
                    return;
                } finally {
                    this.f10459q.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            str = "Invalid texture. The platform view cannot be displayed.";
        } else {
            str = "Invalid surface. The platform view cannot be displayed.";
        }
        d8.b.b("PlatformViewWrapper", str);
    }

    public int e() {
        return this.f10456n;
    }

    public void h() {
        this.f10458p = null;
        Surface surface = this.f10459q;
        if (surface != null) {
            surface.release();
            this.f10459q = null;
        }
    }

    public void i(int i10, int i11) {
        this.f10456n = i10;
        this.f10457o = i11;
        SurfaceTexture surfaceTexture = this.f10458p;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f10454l = layoutParams.leftMargin;
        this.f10455m = layoutParams.topMargin;
    }

    public void k(View.OnFocusChangeListener onFocusChangeListener) {
        o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f10461s == null) {
            c cVar = new c(onFocusChangeListener);
            this.f10461s = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    public void l(SurfaceTexture surfaceTexture) {
        int i10;
        if (Build.VERSION.SDK_INT < 23) {
            d8.b.b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f10458p = surfaceTexture;
        int i11 = this.f10456n;
        if (i11 > 0 && (i10 = this.f10457o) > 0) {
            surfaceTexture.setDefaultBufferSize(i11, i10);
        }
        Surface surface = this.f10459q;
        if (surface != null) {
            surface.release();
        }
        Surface c10 = c(surfaceTexture);
        this.f10459q = c10;
        Canvas lockHardwareCanvas = c10.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            f();
        } finally {
            this.f10459q.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void m(io.flutter.embedding.android.a aVar) {
        this.f10460r = aVar;
    }

    public void o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f10461s) == null) {
            return;
        }
        this.f10461s = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (this.f10460r == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i11 = this.f10454l;
            this.f10452j = i11;
            i10 = this.f10455m;
            this.f10453k = i10;
            f10 = i11;
        } else if (action == 2) {
            matrix.postTranslate(this.f10452j, this.f10453k);
            this.f10452j = this.f10454l;
            this.f10453k = this.f10455m;
            return this.f10460r.g(motionEvent, matrix);
        } else {
            f10 = this.f10454l;
            i10 = this.f10455m;
        }
        matrix.postTranslate(f10, i10);
        return this.f10460r.g(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}
