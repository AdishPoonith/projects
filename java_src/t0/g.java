package t0;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import f1.l0;
import f1.r;
import f1.v;
import f1.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import ka.p;
import p0.f0;
import p0.s;
import t0.b;
import t0.h;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f17930f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f17931g = g.class.getCanonicalName();

    /* renamed from: h  reason: collision with root package name */
    private static g f17932h;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f17933a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Activity> f17934b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<c> f17935c;

    /* renamed from: d  reason: collision with root package name */
    private HashSet<String> f17936d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<Integer, HashSet<String>> f17937e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized g a() {
            g b10;
            if (g.b() == null) {
                g.d(new g(null));
            }
            b10 = g.b();
            if (b10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return b10;
        }

        public final Bundle b(u0.a aVar, View rootView, View hostView) {
            List<u0.b> c10;
            c.a aVar2;
            List<u0.c> b10;
            int i10;
            int i11;
            String simpleName;
            u0.a aVar3;
            View view;
            String k10;
            String a10;
            kotlin.jvm.internal.l.e(rootView, "rootView");
            kotlin.jvm.internal.l.e(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (aVar != null && (c10 = aVar.c()) != null) {
                for (u0.b bVar : c10) {
                    if (bVar.d() != null) {
                        if (bVar.d().length() > 0) {
                            a10 = bVar.a();
                            k10 = bVar.d();
                            bundle.putString(a10, k10);
                            break;
                        }
                    }
                    if (bVar.b().size() > 0) {
                        if (kotlin.jvm.internal.l.a(bVar.c(), "relative")) {
                            aVar2 = c.f17940o;
                            b10 = bVar.b();
                            i10 = 0;
                            i11 = -1;
                            simpleName = hostView.getClass().getSimpleName();
                            kotlin.jvm.internal.l.d(simpleName, "hostView.javaClass.simpleName");
                            aVar3 = aVar;
                            view = hostView;
                        } else {
                            aVar2 = c.f17940o;
                            b10 = bVar.b();
                            i10 = 0;
                            i11 = -1;
                            simpleName = rootView.getClass().getSimpleName();
                            kotlin.jvm.internal.l.d(simpleName, "rootView.javaClass.simpleName");
                            aVar3 = aVar;
                            view = rootView;
                        }
                        for (b bVar2 : aVar2.a(aVar3, view, b10, i10, i11, simpleName)) {
                            if (bVar2.a() != null) {
                                u0.f fVar = u0.f.f18452a;
                                k10 = u0.f.k(bVar2.a());
                                if (k10.length() > 0) {
                                    a10 = bVar.a();
                                    bundle.putString(a10, k10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<View> f17938a;

        /* renamed from: b  reason: collision with root package name */
        private final String f17939b;

        public b(View view, String viewMapKey) {
            kotlin.jvm.internal.l.e(view, "view");
            kotlin.jvm.internal.l.e(viewMapKey, "viewMapKey");
            this.f17938a = new WeakReference<>(view);
            this.f17939b = viewMapKey;
        }

        public final View a() {
            WeakReference<View> weakReference = this.f17938a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public final String b() {
            return this.f17939b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: o  reason: collision with root package name */
        public static final a f17940o = new a(null);

        /* renamed from: j  reason: collision with root package name */
        private final WeakReference<View> f17941j;

        /* renamed from: k  reason: collision with root package name */
        private List<u0.a> f17942k;

        /* renamed from: l  reason: collision with root package name */
        private final Handler f17943l;

        /* renamed from: m  reason: collision with root package name */
        private final HashSet<String> f17944m;

        /* renamed from: n  reason: collision with root package name */
        private final String f17945n;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            private final List<View> b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View child = viewGroup.getChildAt(i10);
                        if (child.getVisibility() == 0) {
                            kotlin.jvm.internal.l.d(child, "child");
                            arrayList.add(child);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
                if (kotlin.jvm.internal.l.a(r9.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final boolean c(android.view.View r9, u0.c r10, int r11) {
                /*
                    Method dump skipped, instructions count: 333
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t0.g.c.a.c(android.view.View, u0.c, int):boolean");
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00ce A[LOOP:0: B:36:0x00b5->B:39:0x00ce, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00d0 A[EDGE_INSN: B:41:0x00d0->B:40:0x00d0 ?: BREAK  , SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<t0.g.b> a(u0.a r10, android.view.View r11, java.util.List<u0.c> r12, int r13, int r14, java.lang.String r15) {
                /*
                    r9 = this;
                    java.lang.String r0 = "path"
                    kotlin.jvm.internal.l.e(r12, r0)
                    java.lang.String r0 = "mapKey"
                    kotlin.jvm.internal.l.e(r15, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r15)
                    r15 = 46
                    r0.append(r15)
                    r0.append(r14)
                    java.lang.String r15 = r0.toString()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    if (r11 != 0) goto L26
                    return r0
                L26:
                    int r1 = r12.size()
                    r2 = 0
                    if (r13 < r1) goto L37
                    t0.g$b r14 = new t0.g$b
                    r14.<init>(r11, r15)
                L32:
                    r0.add(r14)
                    goto La4
                L37:
                    java.lang.Object r1 = r12.get(r13)
                    u0.c r1 = (u0.c) r1
                    java.lang.String r3 = r1.a()
                    java.lang.String r4 = ".."
                    boolean r3 = kotlin.jvm.internal.l.a(r3, r4)
                    if (r3 == 0) goto L7a
                    android.view.ViewParent r11 = r11.getParent()
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto L79
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.b(r11)
                    int r14 = r11.size()
                    if (r14 <= 0) goto L79
                    r6 = 0
                L5e:
                    int r8 = r6 + 1
                    java.lang.Object r1 = r11.get(r6)
                    r3 = r1
                    android.view.View r3 = (android.view.View) r3
                    int r5 = r13 + 1
                    r1 = r9
                    r2 = r10
                    r4 = r12
                    r7 = r15
                    java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    r0.addAll(r1)
                    if (r8 < r14) goto L77
                    goto L79
                L77:
                    r6 = r8
                    goto L5e
                L79:
                    return r0
                L7a:
                    java.lang.String r3 = r1.a()
                    java.lang.String r4 = "."
                    boolean r3 = kotlin.jvm.internal.l.a(r3, r4)
                    if (r3 == 0) goto L8f
                    t0.g$b r10 = new t0.g$b
                    r10.<init>(r11, r15)
                    r0.add(r10)
                    return r0
                L8f:
                    boolean r14 = r9.c(r11, r1, r14)
                    if (r14 != 0) goto L96
                    return r0
                L96:
                    int r14 = r12.size()
                    int r14 = r14 + (-1)
                    if (r13 != r14) goto La4
                    t0.g$b r14 = new t0.g$b
                    r14.<init>(r11, r15)
                    goto L32
                La4:
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto Ld0
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.b(r11)
                    int r14 = r11.size()
                    if (r14 <= 0) goto Ld0
                    r6 = 0
                Lb5:
                    int r8 = r6 + 1
                    java.lang.Object r1 = r11.get(r6)
                    r3 = r1
                    android.view.View r3 = (android.view.View) r3
                    int r5 = r13 + 1
                    r1 = r9
                    r2 = r10
                    r4 = r12
                    r7 = r15
                    java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    r0.addAll(r1)
                    if (r8 < r14) goto Lce
                    goto Ld0
                Lce:
                    r6 = r8
                    goto Lb5
                Ld0:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: t0.g.c.a.a(u0.a, android.view.View, java.util.List, int, int, java.lang.String):java.util.List");
            }
        }

        public c(View view, Handler handler, HashSet<String> listenerSet, String activityName) {
            kotlin.jvm.internal.l.e(handler, "handler");
            kotlin.jvm.internal.l.e(listenerSet, "listenerSet");
            kotlin.jvm.internal.l.e(activityName, "activityName");
            this.f17941j = new WeakReference<>(view);
            this.f17943l = handler;
            this.f17944m = listenerSet;
            this.f17945n = activityName;
            handler.postDelayed(this, 200L);
        }

        private final void a(b bVar, View view, u0.a aVar) {
            boolean t10;
            if (aVar == null) {
                return;
            }
            try {
                View a10 = bVar.a();
                if (a10 == null) {
                    return;
                }
                u0.f fVar = u0.f.f18452a;
                View a11 = u0.f.a(a10);
                if (a11 != null && fVar.p(a10, a11)) {
                    d(bVar, view, aVar);
                    return;
                }
                String name = a10.getClass().getName();
                kotlin.jvm.internal.l.d(name, "view.javaClass.name");
                t10 = p.t(name, "com.facebook.react", false, 2, null);
                if (t10) {
                    return;
                }
                if (!(a10 instanceof AdapterView)) {
                    b(bVar, view, aVar);
                } else if (a10 instanceof ListView) {
                    c(bVar, view, aVar);
                }
            } catch (Exception e10) {
                l0 l0Var = l0.f8470a;
                l0.d0(g.c(), e10);
            }
        }

        private final void b(b bVar, View view, u0.a aVar) {
            boolean z10;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            String b10 = bVar.b();
            u0.f fVar = u0.f.f18452a;
            View.OnClickListener g10 = u0.f.g(a10);
            if (g10 instanceof b.a) {
                Objects.requireNonNull(g10, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                if (((b.a) g10).a()) {
                    z10 = true;
                    if (!this.f17944m.contains(b10) || z10) {
                    }
                    t0.b bVar2 = t0.b.f17907a;
                    a10.setOnClickListener(t0.b.b(aVar, view, a10));
                    this.f17944m.add(b10);
                    return;
                }
            }
            z10 = false;
            if (this.f17944m.contains(b10)) {
            }
        }

        private final void c(b bVar, View view, u0.a aVar) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String b10 = bVar.b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof b.C0259b) {
                Objects.requireNonNull(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                if (((b.C0259b) onItemClickListener).a()) {
                    z10 = true;
                    if (!this.f17944m.contains(b10) || z10) {
                    }
                    t0.b bVar2 = t0.b.f17907a;
                    adapterView.setOnItemClickListener(t0.b.c(aVar, view, adapterView));
                    this.f17944m.add(b10);
                    return;
                }
            }
            z10 = false;
            if (this.f17944m.contains(b10)) {
            }
        }

        private final void d(b bVar, View view, u0.a aVar) {
            boolean z10;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            String b10 = bVar.b();
            u0.f fVar = u0.f.f18452a;
            View.OnTouchListener h10 = u0.f.h(a10);
            if (h10 instanceof h.a) {
                Objects.requireNonNull(h10, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                if (((h.a) h10).a()) {
                    z10 = true;
                    if (!this.f17944m.contains(b10) || z10) {
                    }
                    h hVar = h.f17946a;
                    a10.setOnTouchListener(h.a(aVar, view, a10));
                    this.f17944m.add(b10);
                    return;
                }
            }
            z10 = false;
            if (this.f17944m.contains(b10)) {
            }
        }

        private final void e(u0.a aVar, View view) {
            if (aVar == null || view == null) {
                return;
            }
            String a10 = aVar.a();
            if ((a10 == null || a10.length() == 0) || kotlin.jvm.internal.l.a(aVar.a(), this.f17945n)) {
                List<u0.c> d10 = aVar.d();
                if (d10.size() > 25) {
                    return;
                }
                for (b bVar : f17940o.a(aVar, view, d10, 0, -1, this.f17945n)) {
                    a(bVar, view, aVar);
                }
            }
        }

        private final void f() {
            List<u0.a> list = this.f17942k;
            if (list == null || this.f17941j.get() == null) {
                return;
            }
            int i10 = 0;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                e(list.get(i10), this.f17941j.get());
                if (i11 > size) {
                    return;
                }
                i10 = i11;
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (k1.a.d(this)) {
                return;
            }
            try {
                f0 f0Var = f0.f14852a;
                String m10 = f0.m();
                v vVar = v.f8582a;
                r f10 = v.f(m10);
                if (f10 != null && f10.b()) {
                    List<u0.a> b10 = u0.a.f18410j.b(f10.d());
                    this.f17942k = b10;
                    if (b10 == null || (view = this.f17941j.get()) == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    f();
                }
            } catch (Throwable th) {
                k1.a.b(th, this);
            }
        }
    }

    private g() {
        this.f17933a = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        kotlin.jvm.internal.l.d(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f17934b = newSetFromMap;
        this.f17935c = new LinkedHashSet();
        this.f17936d = new HashSet<>();
        this.f17937e = new HashMap<>();
    }

    public /* synthetic */ g(kotlin.jvm.internal.g gVar) {
        this();
    }

    public static final /* synthetic */ g b() {
        if (k1.a.d(g.class)) {
            return null;
        }
        try {
            return f17932h;
        } catch (Throwable th) {
            k1.a.b(th, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (k1.a.d(g.class)) {
            return null;
        }
        try {
            return f17931g;
        } catch (Throwable th) {
            k1.a.b(th, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (k1.a.d(g.class)) {
            return;
        }
        try {
            f17932h = gVar;
        } catch (Throwable th) {
            k1.a.b(th, g.class);
        }
    }

    private final void g() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f17934b) {
                if (activity != null) {
                    y0.g gVar = y0.g.f20314a;
                    View e10 = y0.g.e(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f17933a;
                    HashSet<String> hashSet = this.f17936d;
                    kotlin.jvm.internal.l.d(activityName, "activityName");
                    this.f17935c.add(new c(e10, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void i() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.f17933a.post(new Runnable() { // from class: t0.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.j(g.this);
                    }
                });
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(g this$0) {
        if (k1.a.d(g.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(this$0, "this$0");
            this$0.g();
        } catch (Throwable th) {
            k1.a.b(th, g.class);
        }
    }

    public final void e(Activity activity) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(activity, "activity");
            z zVar = z.f8603a;
            if (z.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new s("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f17934b.add(activity);
            this.f17936d.clear();
            HashSet<String> hashSet = this.f17937e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f17936d = hashSet;
            }
            i();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void f(Activity activity) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(activity, "activity");
            this.f17937e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void h(Activity activity) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(activity, "activity");
            z zVar = z.f8603a;
            if (z.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new s("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f17934b.remove(activity);
            this.f17935c.clear();
            this.f17937e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f17936d.clone());
            this.f17936d.clear();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
