package h8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import f9.h;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    private FlutterMutatorsStack f9531j;

    /* renamed from: k  reason: collision with root package name */
    private float f9532k;

    /* renamed from: l  reason: collision with root package name */
    private int f9533l;

    /* renamed from: m  reason: collision with root package name */
    private int f9534m;

    /* renamed from: n  reason: collision with root package name */
    private int f9535n;

    /* renamed from: o  reason: collision with root package name */
    private int f9536o;

    /* renamed from: p  reason: collision with root package name */
    private final io.flutter.embedding.android.a f9537p;

    /* renamed from: q  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f9538q;

    /* renamed from: h8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalFocusChangeListenerC0154a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f9539j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ View f9540k;

        ViewTreeObserver$OnGlobalFocusChangeListenerC0154a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f9539j = onFocusChangeListener;
            this.f9540k = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f9539j;
            View view3 = this.f9540k;
            onFocusChangeListener.onFocusChange(view3, h.c(view3));
        }
    }

    public a(Context context, float f10, io.flutter.embedding.android.a aVar) {
        super(context, null);
        this.f9532k = f10;
        this.f9537p = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f9531j.getFinalMatrix());
        float f10 = this.f9532k;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.f9533l, -this.f9534m);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i10, int i11, int i12, int i13) {
        this.f9531j = flutterMutatorsStack;
        this.f9533l = i10;
        this.f9534m = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f9538q) == null) {
            return;
        }
        this.f9538q = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f9531j.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.f9533l, -this.f9534m);
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (this.f9537p == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i11 = this.f9533l;
            this.f9535n = i11;
            i10 = this.f9534m;
            this.f9536o = i10;
            f10 = i11;
        } else if (action == 2) {
            matrix.postTranslate(this.f9535n, this.f9536o);
            this.f9535n = this.f9533l;
            this.f9536o = this.f9534m;
            return this.f9537p.g(motionEvent, matrix);
        } else {
            f10 = this.f9533l;
            i10 = this.f9534m;
        }
        matrix.postTranslate(f10, i10);
        return this.f9537p.g(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f9538q == null) {
            ViewTreeObserver$OnGlobalFocusChangeListenerC0154a viewTreeObserver$OnGlobalFocusChangeListenerC0154a = new ViewTreeObserver$OnGlobalFocusChangeListenerC0154a(onFocusChangeListener, this);
            this.f9538q = viewTreeObserver$OnGlobalFocusChangeListenerC0154a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserver$OnGlobalFocusChangeListenerC0154a);
        }
    }
}
