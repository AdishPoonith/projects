package t0;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f17946a = new h();

    /* loaded from: classes.dex */
    public static final class a implements View.OnTouchListener {

        /* renamed from: j  reason: collision with root package name */
        private final u0.a f17947j;

        /* renamed from: k  reason: collision with root package name */
        private final WeakReference<View> f17948k;

        /* renamed from: l  reason: collision with root package name */
        private final WeakReference<View> f17949l;

        /* renamed from: m  reason: collision with root package name */
        private final View.OnTouchListener f17950m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f17951n;

        public a(u0.a mapping, View rootView, View hostView) {
            kotlin.jvm.internal.l.e(mapping, "mapping");
            kotlin.jvm.internal.l.e(rootView, "rootView");
            kotlin.jvm.internal.l.e(hostView, "hostView");
            this.f17947j = mapping;
            this.f17948k = new WeakReference<>(hostView);
            this.f17949l = new WeakReference<>(rootView);
            u0.f fVar = u0.f.f18452a;
            this.f17950m = u0.f.h(hostView);
            this.f17951n = true;
        }

        public final boolean a() {
            return this.f17951n;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            kotlin.jvm.internal.l.e(view, "view");
            kotlin.jvm.internal.l.e(motionEvent, "motionEvent");
            View view2 = this.f17949l.get();
            View view3 = this.f17948k.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                b bVar = b.f17907a;
                b.d(this.f17947j, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f17950m;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private h() {
    }

    public static final a a(u0.a mapping, View rootView, View hostView) {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(mapping, "mapping");
            kotlin.jvm.internal.l.e(rootView, "rootView");
            kotlin.jvm.internal.l.e(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }
}
