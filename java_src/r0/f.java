package r0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.q;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import q0.c0;
/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: n  reason: collision with root package name */
    public static final a f16629n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    private static final Map<Integer, f> f16630o = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Set<String> f16631j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f16632k;

    /* renamed from: l  reason: collision with root package name */
    private final WeakReference<Activity> f16633l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f16634m;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2) {
            return l.a("r2", str) ? new ka.f("[^\\d.]").b(str2, "") : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r7.equals("r5") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
            if (r7.equals("r4") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
            r8 = new ka.f("[^a-z]+").b(r8, "");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L57;
                    case 3586: goto L40;
                    case 3587: goto L37;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L7d
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L16
                goto L7d
            L16:
                java.lang.String r0 = "-"
                boolean r1 = ka.g.w(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L7d
                ka.f r1 = new ka.f
                r1.<init>(r0)
                java.util.List r8 = r1.c(r8, r3)
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r8, r0)
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L7d
            L37:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L49
                goto L7d
            L40:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L49
                goto L7d
            L49:
                ka.f r0 = new ka.f
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.b(r8, r1)
                goto L7d
            L57:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L60
                goto L7d
            L60:
                java.lang.String r0 = "m"
                boolean r4 = ka.g.t(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L7c
                java.lang.String r4 = "b"
                boolean r4 = ka.g.t(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L7c
                java.lang.String r4 = "ge"
                boolean r8 = ka.g.t(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L79
                goto L7c
            L79:
                java.lang.String r8 = "f"
                goto L7d
            L7c:
                r8 = r0
            L7d:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r0.f.a.d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        public final void e(Activity activity) {
            l.e(activity, "activity");
            int hashCode = activity.hashCode();
            Map b10 = f.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b10.get(valueOf);
            if (obj == null) {
                obj = new f(activity, null);
                b10.put(valueOf, obj);
            }
            f.c((f) obj);
        }
    }

    private f(Activity activity) {
        this.f16631j = new LinkedHashSet();
        this.f16632k = new Handler(Looper.getMainLooper());
        this.f16633l = new WeakReference<>(activity);
        this.f16634m = new AtomicBoolean(false);
    }

    public /* synthetic */ f(Activity activity, g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            return f16630o;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            fVar.h();
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    private final void d(final View view) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: r0.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(view, this);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(View view, f this$0) {
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            l.e(view, "$view");
            l.e(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.f(view);
            }
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    private final void f(View view) {
        CharSequence p02;
        String c10;
        if (k1.a.d(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            p02 = q.p0(obj);
            String obj2 = p02.toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            l.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.f16631j.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f16631j.add(lowerCase);
                HashMap hashMap = new HashMap();
                c cVar = c.f16621a;
                List<String> b10 = c.b(view);
                List<String> list = null;
                for (d dVar : d.f16622d.c()) {
                    a aVar = f16629n;
                    String c11 = aVar.c(dVar.c(), lowerCase);
                    if (dVar.d().length() > 0) {
                        c cVar2 = c.f16621a;
                        if (!c.f(c11, dVar.d())) {
                        }
                    }
                    c cVar3 = c.f16621a;
                    if (c.e(b10, dVar.b())) {
                        c10 = dVar.c();
                    } else {
                        if (list == null) {
                            list = c.a(view);
                        }
                        if (c.e(list, dVar.b())) {
                            c10 = dVar.c();
                        }
                    }
                    aVar.d(hashMap, c10, c11);
                }
                c0.f15905b.e(hashMap);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void g(Runnable runnable) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f16632k.post(runnable);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void h() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (this.f16634m.getAndSet(true)) {
                return;
            }
            y0.g gVar = y0.g.f20314a;
            View e10 = y0.g.e(this.f16633l.get());
            if (e10 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (k1.a.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th) {
                k1.a.b(th, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }
}
