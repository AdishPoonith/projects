package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import io.flutter.embedding.android.g;
import io.flutter.embedding.android.s;
import io.flutter.view.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p8.a;
import t8.a;
/* loaded from: classes.dex */
public class k extends FrameLayout implements a.c, s.e {
    private z A;
    private final a.g B;
    private final c.k C;
    private final ContentObserver D;
    private final p8.b E;
    private final androidx.core.util.a<WindowLayoutInfo> F;

    /* renamed from: j  reason: collision with root package name */
    private h f10193j;

    /* renamed from: k  reason: collision with root package name */
    private i f10194k;

    /* renamed from: l  reason: collision with root package name */
    private io.flutter.embedding.android.g f10195l;

    /* renamed from: m  reason: collision with root package name */
    p8.c f10196m;

    /* renamed from: n  reason: collision with root package name */
    private p8.c f10197n;

    /* renamed from: o  reason: collision with root package name */
    private final Set<p8.b> f10198o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10199p;

    /* renamed from: q  reason: collision with root package name */
    private io.flutter.embedding.engine.a f10200q;

    /* renamed from: r  reason: collision with root package name */
    private final Set<f> f10201r;

    /* renamed from: s  reason: collision with root package name */
    private t8.a f10202s;

    /* renamed from: t  reason: collision with root package name */
    private io.flutter.plugin.editing.f f10203t;

    /* renamed from: u  reason: collision with root package name */
    private io.flutter.plugin.editing.d f10204u;

    /* renamed from: v  reason: collision with root package name */
    private s8.a f10205v;

    /* renamed from: w  reason: collision with root package name */
    private s f10206w;

    /* renamed from: x  reason: collision with root package name */
    private io.flutter.embedding.android.a f10207x;

    /* renamed from: y  reason: collision with root package name */
    private io.flutter.view.c f10208y;

    /* renamed from: z  reason: collision with root package name */
    private TextServicesManager f10209z;

    /* loaded from: classes.dex */
    class a implements c.k {
        a() {
        }

        @Override // io.flutter.view.c.k
        public void a(boolean z10, boolean z11) {
            k.this.C(z10, z11);
        }
    }

    /* loaded from: classes.dex */
    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            if (k.this.f10200q == null) {
                return;
            }
            d8.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            k.this.E();
        }
    }

    /* loaded from: classes.dex */
    class c implements p8.b {
        c() {
        }

        @Override // p8.b
        public void c() {
            k.this.f10199p = false;
            for (p8.b bVar : k.this.f10198o) {
                bVar.c();
            }
        }

        @Override // p8.b
        public void f() {
            k.this.f10199p = true;
            for (p8.b bVar : k.this.f10198o) {
                bVar.f();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements androidx.core.util.a<WindowLayoutInfo> {
        d() {
        }

        @Override // androidx.core.util.a
        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            k.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements p8.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p8.a f10214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f10215b;

        e(p8.a aVar, Runnable runnable) {
            this.f10214a = aVar;
            this.f10215b = runnable;
        }

        @Override // p8.b
        public void c() {
        }

        @Override // p8.b
        public void f() {
            this.f10214a.q(this);
            this.f10215b.run();
            k kVar = k.this;
            if ((kVar.f10196m instanceof io.flutter.embedding.android.g) || kVar.f10195l == null) {
                return;
            }
            k.this.f10195l.e();
            k.this.z();
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private k(Context context, AttributeSet attributeSet, h hVar) {
        super(context, attributeSet);
        this.f10198o = new HashSet();
        this.f10201r = new HashSet();
        this.B = new a.g();
        this.C = new a();
        this.D = new b(new Handler(Looper.getMainLooper()));
        this.E = new c();
        this.F = new d();
        this.f10193j = hVar;
        this.f10196m = hVar;
        w();
    }

    private k(Context context, AttributeSet attributeSet, i iVar) {
        super(context, attributeSet);
        this.f10198o = new HashSet();
        this.f10201r = new HashSet();
        this.B = new a.g();
        this.C = new a();
        this.D = new b(new Handler(Looper.getMainLooper()));
        this.E = new c();
        this.F = new d();
        this.f10194k = iVar;
        this.f10196m = iVar;
        w();
    }

    public k(Context context, h hVar) {
        this(context, (AttributeSet) null, hVar);
    }

    public k(Context context, i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z10, boolean z11) {
        boolean z12 = false;
        if (!this.f10200q.q().l() && !z10 && !z11) {
            z12 = true;
        }
        setWillNotDraw(z12);
    }

    private void F() {
        if (!x()) {
            d8.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.B.f15815a = getResources().getDisplayMetrics().density;
        this.B.f15830p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f10200q.q().t(this.B);
    }

    private g p() {
        Context context = getContext();
        int i10 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            } else if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    private int u(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void w() {
        View view;
        d8.b.f("FlutterView", "Initializing FlutterView");
        if (this.f10193j != null) {
            d8.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f10193j;
        } else if (this.f10194k != null) {
            d8.b.f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f10194k;
        } else {
            d8.b.f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f10195l;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean y(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        io.flutter.embedding.android.g gVar = this.f10195l;
        if (gVar != null) {
            gVar.c();
            removeView(this.f10195l);
            this.f10195l = null;
        }
    }

    public void A(f fVar) {
        this.f10201r.remove(fVar);
    }

    public void B(p8.b bVar) {
        this.f10198o.remove(bVar);
    }

    public void D(Runnable runnable) {
        if (this.f10195l == null) {
            d8.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        p8.c cVar = this.f10197n;
        if (cVar == null) {
            d8.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f10196m = cVar;
        this.f10197n = null;
        p8.a q10 = this.f10200q.q();
        if (this.f10200q != null && q10 != null) {
            this.f10196m.f(q10);
            q10.g(new e(q10, runnable));
            return;
        }
        this.f10195l.e();
        z();
        runnable.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r3 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void E() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1a
            q8.m$b r0 = q8.m.b.dark
            goto L1c
        L1a:
            q8.m$b r0 = q8.m.b.light
        L1c:
            android.view.textservice.TextServicesManager r3 = r6.f10209z
            if (r3 == 0) goto L40
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3e
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r3 = r3.stream()
            io.flutter.embedding.android.j r4 = new java.util.function.Predicate() { // from class: io.flutter.embedding.android.j
                static {
                    /*
                        io.flutter.embedding.android.j r0 = new io.flutter.embedding.android.j
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:io.flutter.embedding.android.j) io.flutter.embedding.android.j.a io.flutter.embedding.android.j
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.j.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.j.<init>():void");
                }

                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object r1) {
                    /*
                        r0 = this;
                        android.view.textservice.SpellCheckerInfo r1 = (android.view.textservice.SpellCheckerInfo) r1
                        boolean r1 = io.flutter.embedding.android.k.d(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.j.test(java.lang.Object):boolean");
                }
            }
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f10209z
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L40
            if (r3 == 0) goto L40
        L3e:
            r3 = 1
            goto L41
        L40:
            r3 = 0
        L41:
            io.flutter.embedding.engine.a r4 = r6.f10200q
            q8.m r4 = r4.s()
            q8.m$a r4 = r4.a()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            q8.m$a r4 = r4.e(r5)
            q8.m$a r3 = r4.c(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L6e
            r1 = 1
        L6e:
            q8.m$a r1 = r3.b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            q8.m$a r1 = r1.f(r2)
            q8.m$a r0 = r1.d(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.k.E():void");
    }

    @Override // io.flutter.embedding.android.s.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f10203t.j(sparseArray);
    }

    @Override // t8.a.c
    public PointerIcon b(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    @Override // io.flutter.embedding.android.s.e
    public boolean c(KeyEvent keyEvent) {
        return this.f10203t.r(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f10200q;
        return aVar != null ? aVar.o().F(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (x() && this.f10206w.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.f10208y;
        if (cVar == null || !cVar.D()) {
            return null;
        }
        return this.f10208y;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f10200q;
    }

    @Override // io.flutter.embedding.android.s.e
    public r8.c getBinaryMessenger() {
        return this.f10200q.i();
    }

    public io.flutter.embedding.android.g getCurrentImageSurface() {
        return this.f10195l;
    }

    public boolean k() {
        io.flutter.embedding.android.g gVar = this.f10195l;
        if (gVar != null) {
            return gVar.a();
        }
        return false;
    }

    public void l(f fVar) {
        this.f10201r.add(fVar);
    }

    public void m(p8.b bVar) {
        this.f10198o.add(bVar);
    }

    public void n(io.flutter.embedding.android.g gVar) {
        io.flutter.embedding.engine.a aVar = this.f10200q;
        if (aVar != null) {
            gVar.f(aVar.q());
        }
    }

    public void o(io.flutter.embedding.engine.a aVar) {
        d8.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (x()) {
            if (aVar == this.f10200q) {
                d8.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                d8.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                t();
            }
        }
        this.f10200q = aVar;
        p8.a q10 = aVar.q();
        this.f10199p = q10.k();
        this.f10196m.f(q10);
        q10.g(this.E);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f10202s = new t8.a(this, this.f10200q.l());
        }
        this.f10203t = new io.flutter.plugin.editing.f(this, this.f10200q.v(), this.f10200q.o());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f10209z = textServicesManager;
            this.f10204u = new io.flutter.plugin.editing.d(textServicesManager, this.f10200q.t());
        } catch (Exception unused) {
            d8.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f10205v = this.f10200q.k();
        this.f10206w = new s(this);
        this.f10207x = new io.flutter.embedding.android.a(this.f10200q.q(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, aVar.g(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f10200q.o());
        this.f10208y = cVar;
        cVar.Y(this.C);
        C(this.f10208y.D(), this.f10208y.E());
        this.f10200q.o().a(this.f10208y);
        this.f10200q.o().D(this.f10200q.q());
        this.f10203t.q().restartInput(this);
        E();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.D);
        F();
        aVar.o().E(this);
        for (f fVar : this.f10201r) {
            fVar.b(aVar);
        }
        if (this.f10199p) {
            this.E.f();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            a.g gVar = this.B;
            gVar.f15826l = systemGestureInsets.top;
            gVar.f15827m = systemGestureInsets.right;
            gVar.f15828n = systemGestureInsets.bottom;
            gVar.f15829o = systemGestureInsets.left;
        }
        boolean z10 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z11 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i10 >= 30) {
            int navigationBars = z11 ? 0 | WindowInsets.Type.navigationBars() : 0;
            if (z10) {
                navigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(navigationBars);
            a.g gVar2 = this.B;
            gVar2.f15818d = insets.top;
            gVar2.f15819e = insets.right;
            gVar2.f15820f = insets.bottom;
            gVar2.f15821g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            a.g gVar3 = this.B;
            gVar3.f15822h = insets2.top;
            gVar3.f15823i = insets2.right;
            gVar3.f15824j = insets2.bottom;
            gVar3.f15825k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            a.g gVar4 = this.B;
            gVar4.f15826l = insets3.top;
            gVar4.f15827m = insets3.right;
            gVar4.f15828n = insets3.bottom;
            gVar4.f15829o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.g gVar5 = this.B;
                gVar5.f15818d = Math.max(Math.max(gVar5.f15818d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.g gVar6 = this.B;
                gVar6.f15819e = Math.max(Math.max(gVar6.f15819e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.g gVar7 = this.B;
                gVar7.f15820f = Math.max(Math.max(gVar7.f15820f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.g gVar8 = this.B;
                gVar8.f15821g = Math.max(Math.max(gVar8.f15821g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z11) {
                gVar9 = p();
            }
            this.B.f15818d = z10 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.B.f15819e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.B.f15820f = (z11 && u(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.B.f15821g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.g gVar10 = this.B;
            gVar10.f15822h = 0;
            gVar10.f15823i = 0;
            gVar10.f15824j = u(windowInsets);
            this.B.f15825k = 0;
        }
        d8.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.B.f15818d + ", Left: " + this.B.f15821g + ", Right: " + this.B.f15819e + "\nKeyboard insets: Bottom: " + this.B.f15824j + ", Left: " + this.B.f15825k + ", Right: " + this.B.f15823i + "System Gesture Insets - Left: " + this.B.f15829o + ", Top: " + this.B.f15826l + ", Right: " + this.B.f15827m + ", Bottom: " + this.B.f15824j);
        F();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = s();
        Activity e10 = f9.h.e(getContext());
        z zVar = this.A;
        if (zVar == null || e10 == null) {
            return;
        }
        zVar.a(e10, androidx.core.content.a.g(getContext()), this.F);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f10200q != null) {
            d8.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f10205v.d(configuration);
            E();
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !x() ? super.onCreateInputConnection(editorInfo) : this.f10203t.o(this, this.f10206w, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        z zVar = this.A;
        if (zVar != null) {
            zVar.b(this.F);
        }
        this.A = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (x() && this.f10207x.e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !x() ? super.onHoverEvent(motionEvent) : this.f10208y.J(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.f10203t.z(viewStructure, i10);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d8.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i12 + " x " + i13 + ", it is now " + i10 + " x " + i11);
        a.g gVar = this.B;
        gVar.f15816b = i10;
        gVar.f15817c = i11;
        F();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (x()) {
            requestUnbufferedDispatch(motionEvent);
            return this.f10207x.f(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void q() {
        this.f10196m.d();
        io.flutter.embedding.android.g gVar = this.f10195l;
        if (gVar == null) {
            io.flutter.embedding.android.g r10 = r();
            this.f10195l = r10;
            addView(r10);
        } else {
            gVar.j(getWidth(), getHeight());
        }
        this.f10197n = this.f10196m;
        io.flutter.embedding.android.g gVar2 = this.f10195l;
        this.f10196m = gVar2;
        io.flutter.embedding.engine.a aVar = this.f10200q;
        if (aVar != null) {
            gVar2.f(aVar.q());
        }
    }

    public io.flutter.embedding.android.g r() {
        return new io.flutter.embedding.android.g(getContext(), getWidth(), getHeight(), g.b.background);
    }

    protected z s() {
        try {
            return new z(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        p8.c cVar = this.f10196m;
        if (cVar instanceof h) {
            ((h) cVar).setVisibility(i10);
        }
    }

    protected void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            d8.b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new a.b(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? a.d.HINGE : a.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? a.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? a.c.POSTURE_HALF_OPENED : a.c.UNKNOWN));
            } else {
                arrayList.add(new a.b(displayFeature.getBounds(), a.d.UNKNOWN, a.c.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                d8.b.f("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new a.b(rect, a.d.CUTOUT));
            }
        }
        this.B.f15831q = arrayList;
        F();
    }

    public void t() {
        d8.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f10200q);
        if (!x()) {
            d8.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (f fVar : this.f10201r) {
            fVar.a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.D);
        this.f10200q.o().K();
        this.f10200q.o().d();
        this.f10208y.Q();
        this.f10208y = null;
        this.f10203t.q().restartInput(this);
        this.f10203t.p();
        this.f10206w.c();
        io.flutter.plugin.editing.d dVar = this.f10204u;
        if (dVar != null) {
            dVar.b();
        }
        t8.a aVar = this.f10202s;
        if (aVar != null) {
            aVar.c();
        }
        p8.a q10 = this.f10200q.q();
        this.f10199p = false;
        q10.q(this.E);
        q10.v();
        q10.s(false);
        p8.c cVar = this.f10197n;
        if (cVar != null && this.f10196m == this.f10195l) {
            this.f10196m = cVar;
        }
        this.f10196m.e();
        z();
        this.f10197n = null;
        this.f10200q = null;
    }

    public boolean v() {
        return this.f10199p;
    }

    public boolean x() {
        io.flutter.embedding.engine.a aVar = this.f10200q;
        return aVar != null && aVar.q() == this.f10196m.getAttachedRenderer();
    }
}
