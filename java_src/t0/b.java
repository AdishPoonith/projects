package t0;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;
import p0.f0;
import q0.o;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f17907a = new b();

    /* loaded from: classes.dex */
    public static final class a implements View.OnClickListener {

        /* renamed from: j  reason: collision with root package name */
        private u0.a f17908j;

        /* renamed from: k  reason: collision with root package name */
        private WeakReference<View> f17909k;

        /* renamed from: l  reason: collision with root package name */
        private WeakReference<View> f17910l;

        /* renamed from: m  reason: collision with root package name */
        private View.OnClickListener f17911m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f17912n;

        public a(u0.a mapping, View rootView, View hostView) {
            kotlin.jvm.internal.l.e(mapping, "mapping");
            kotlin.jvm.internal.l.e(rootView, "rootView");
            kotlin.jvm.internal.l.e(hostView, "hostView");
            this.f17908j = mapping;
            this.f17909k = new WeakReference<>(hostView);
            this.f17910l = new WeakReference<>(rootView);
            u0.f fVar = u0.f.f18452a;
            this.f17911m = u0.f.g(hostView);
            this.f17912n = true;
        }

        public final boolean a() {
            return this.f17912n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (k1.a.d(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.l.e(view, "view");
                View.OnClickListener onClickListener = this.f17911m;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = this.f17910l.get();
                View view3 = this.f17909k.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                b bVar = b.f17907a;
                b.d(this.f17908j, view2, view3);
            } catch (Throwable th) {
                k1.a.b(th, this);
            }
        }
    }

    /* renamed from: t0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0259b implements AdapterView.OnItemClickListener {

        /* renamed from: j  reason: collision with root package name */
        private u0.a f17913j;

        /* renamed from: k  reason: collision with root package name */
        private WeakReference<AdapterView<?>> f17914k;

        /* renamed from: l  reason: collision with root package name */
        private WeakReference<View> f17915l;

        /* renamed from: m  reason: collision with root package name */
        private AdapterView.OnItemClickListener f17916m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f17917n;

        public C0259b(u0.a mapping, View rootView, AdapterView<?> hostView) {
            kotlin.jvm.internal.l.e(mapping, "mapping");
            kotlin.jvm.internal.l.e(rootView, "rootView");
            kotlin.jvm.internal.l.e(hostView, "hostView");
            this.f17913j = mapping;
            this.f17914k = new WeakReference<>(hostView);
            this.f17915l = new WeakReference<>(rootView);
            this.f17916m = hostView.getOnItemClickListener();
            this.f17917n = true;
        }

        public final boolean a() {
            return this.f17917n;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            kotlin.jvm.internal.l.e(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f17916m;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = this.f17915l.get();
            AdapterView<?> adapterView2 = this.f17914k.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            b bVar = b.f17907a;
            b.d(this.f17913j, view2, adapterView2);
        }
    }

    private b() {
    }

    public static final a b(u0.a mapping, View rootView, View hostView) {
        if (k1.a.d(b.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(mapping, "mapping");
            kotlin.jvm.internal.l.e(rootView, "rootView");
            kotlin.jvm.internal.l.e(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th) {
            k1.a.b(th, b.class);
            return null;
        }
    }

    public static final C0259b c(u0.a mapping, View rootView, AdapterView<?> hostView) {
        if (k1.a.d(b.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(mapping, "mapping");
            kotlin.jvm.internal.l.e(rootView, "rootView");
            kotlin.jvm.internal.l.e(hostView, "hostView");
            return new C0259b(mapping, rootView, hostView);
        } catch (Throwable th) {
            k1.a.b(th, b.class);
            return null;
        }
    }

    public static final void d(u0.a mapping, View rootView, View hostView) {
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(mapping, "mapping");
            kotlin.jvm.internal.l.e(rootView, "rootView");
            kotlin.jvm.internal.l.e(hostView, "hostView");
            final String b10 = mapping.b();
            final Bundle b11 = g.f17930f.b(mapping, rootView, hostView);
            f17907a.f(b11);
            f0 f0Var = f0.f14852a;
            f0.t().execute(new Runnable() { // from class: t0.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.e(b10, b11);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String eventName, Bundle parameters) {
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(eventName, "$eventName");
            kotlin.jvm.internal.l.e(parameters, "$parameters");
            f0 f0Var = f0.f14852a;
            o.f15963b.f(f0.l()).b(eventName, parameters);
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    public final void f(Bundle parameters) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                y0.g gVar = y0.g.f20314a;
                parameters.putDouble("_valueToSum", y0.g.g(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
