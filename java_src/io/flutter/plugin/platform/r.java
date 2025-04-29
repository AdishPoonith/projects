package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    SingleViewPresentation f10505a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10506b;

    /* renamed from: c  reason: collision with root package name */
    private final io.flutter.plugin.platform.a f10507c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10508d;

    /* renamed from: e  reason: collision with root package name */
    private final e.c f10509e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f10510f;

    /* renamed from: g  reason: collision with root package name */
    private final Surface f10511g;

    /* renamed from: h  reason: collision with root package name */
    private VirtualDisplay f10512h;

    /* renamed from: i  reason: collision with root package name */
    private int f10513i;

    /* renamed from: j  reason: collision with root package name */
    private int f10514j;

    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View f10515j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Runnable f10516k;

        /* renamed from: io.flutter.plugin.platform.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0167a implements Runnable {
            RunnableC0167a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f10515j.postDelayed(aVar.f10516k, 128L);
            }
        }

        a(View view, Runnable runnable) {
            this.f10515j = view;
            this.f10516k = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.a(this.f10515j, new RunnableC0167a());
            this.f10515j.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: j  reason: collision with root package name */
        final View f10519j;

        /* renamed from: k  reason: collision with root package name */
        Runnable f10520k;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f10519j.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f10519j = view;
            this.f10520k = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f10520k;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f10520k = null;
            this.f10519j.post(new a());
        }
    }

    private r(Context context, io.flutter.plugin.platform.a aVar, VirtualDisplay virtualDisplay, f fVar, Surface surface, e.c cVar, View.OnFocusChangeListener onFocusChangeListener, int i10, Object obj) {
        this.f10506b = context;
        this.f10507c = aVar;
        this.f10509e = cVar;
        this.f10510f = onFocusChangeListener;
        this.f10511g = surface;
        this.f10512h = virtualDisplay;
        this.f10508d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f10512h.getDisplay(), fVar, aVar, i10, onFocusChangeListener);
        this.f10505a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static r a(Context context, io.flutter.plugin.platform.a aVar, f fVar, e.c cVar, int i10, int i11, int i12, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        context.getResources().getDisplayMetrics();
        if (i10 == 0 || i11 == 0) {
            return null;
        }
        cVar.d().setDefaultBufferSize(i10, i11);
        Surface surface = new Surface(cVar.d());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i10, i11, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        r rVar = new r(context, aVar, createVirtualDisplay, fVar, surface, cVar, onFocusChangeListener, i12, obj);
        rVar.f10513i = i10;
        rVar.f10514j = i11;
        return rVar;
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public int c() {
        return this.f10514j;
    }

    public int d() {
        return this.f10513i;
    }

    public View e() {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(View view) {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f10505a.getView().A(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f10505a.getView().Q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        SingleViewPresentation singleViewPresentation = this.f10505a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f10505a.getView().x();
    }

    public void i(int i10, int i11, Runnable runnable) {
        boolean isFocused = e().isFocused();
        SingleViewPresentation.e detachState = this.f10505a.detachState();
        this.f10512h.setSurface(null);
        this.f10512h.release();
        this.f10513i = i10;
        this.f10514j = i11;
        this.f10509e.d().setDefaultBufferSize(i10, i11);
        this.f10512h = ((DisplayManager) this.f10506b.getSystemService("display")).createVirtualDisplay("flutter-vd", i10, i11, this.f10508d, this.f10511g, 0);
        View e10 = e();
        e10.addOnAttachStateChangeListener(new a(e10, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f10506b, this.f10512h.getDisplay(), this.f10507c, detachState, this.f10510f, isFocused);
        singleViewPresentation.show();
        this.f10505a.cancel();
        this.f10505a = singleViewPresentation;
    }
}
