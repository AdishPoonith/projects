package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.d0;
import androidx.core.view.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class t {

    /* renamed from: c  reason: collision with root package name */
    private static Field f1928c;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f1926a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap<View, z> f1927b = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f1929d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f1930e = {t.b.accessibility_custom_action_0, t.b.accessibility_custom_action_1, t.b.accessibility_custom_action_2, t.b.accessibility_custom_action_3, t.b.accessibility_custom_action_4, t.b.accessibility_custom_action_5, t.b.accessibility_custom_action_6, t.b.accessibility_custom_action_7, t.b.accessibility_custom_action_8, t.b.accessibility_custom_action_9, t.b.accessibility_custom_action_10, t.b.accessibility_custom_action_11, t.b.accessibility_custom_action_12, t.b.accessibility_custom_action_13, t.b.accessibility_custom_action_14, t.b.accessibility_custom_action_15, t.b.accessibility_custom_action_16, t.b.accessibility_custom_action_17, t.b.accessibility_custom_action_18, t.b.accessibility_custom_action_19, t.b.accessibility_custom_action_20, t.b.accessibility_custom_action_21, t.b.accessibility_custom_action_22, t.b.accessibility_custom_action_23, t.b.accessibility_custom_action_24, t.b.accessibility_custom_action_25, t.b.accessibility_custom_action_26, t.b.accessibility_custom_action_27, t.b.accessibility_custom_action_28, t.b.accessibility_custom_action_29, t.b.accessibility_custom_action_30, t.b.accessibility_custom_action_31};

    /* renamed from: f  reason: collision with root package name */
    private static final androidx.core.view.q f1931f = new androidx.core.view.q() { // from class: androidx.core.view.s
    };

    /* renamed from: g  reason: collision with root package name */
    private static final e f1932g = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.t.f
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(n.d(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.t.f
        /* renamed from: e */
        public CharSequence c(View view) {
            return n.b(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.t.f
        /* renamed from: e */
        public CharSequence c(View view) {
            return p.a(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.t.f
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(n.c(view));
        }
    }

    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: j  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f1933j = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                t.w(view, z11 ? 16 : 32);
                this.f1933j.put(view, Boolean.valueOf(z11));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f1933j.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f1934a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f1935b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1936c;

        /* renamed from: d  reason: collision with root package name */
        private final int f1937d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f1934a = i10;
            this.f1935b = cls;
            this.f1937d = i11;
            this.f1936c = i12;
        }

        private boolean a() {
            return true;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f1936c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (a()) {
                T t10 = (T) view.getTag(this.f1934a);
                if (this.f1935b.isInstance(t10)) {
                    return t10;
                }
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* loaded from: classes.dex */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    private static class l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            d0 f1938a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f1939b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.core.view.p f1940c;

            a(View view, androidx.core.view.p pVar) {
                this.f1939b = view;
                this.f1940c = pVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                d0 s10 = d0.s(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    l.a(windowInsets, this.f1939b);
                    if (s10.equals(this.f1938a)) {
                        return this.f1940c.a(view, s10).q();
                    }
                }
                this.f1938a = s10;
                d0 a10 = this.f1940c.a(view, s10);
                if (i10 >= 30) {
                    return a10.q();
                }
                t.C(view);
                return a10.q();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(t.b.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static d0 b(View view, d0 d0Var, Rect rect) {
            WindowInsets q10 = d0Var.q();
            if (q10 != null) {
                return d0.s(view.computeSystemWindowInsets(q10, rect), view);
            }
            rect.setEmpty();
            return d0Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static d0 j(View view) {
            return d0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, androidx.core.view.p pVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(t.b.tag_on_apply_window_listener, pVar);
            }
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(t.b.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, pVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    private static class m {
        public static d0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            d0 r10 = d0.r(rootWindowInsets);
            r10.o(r10);
            r10.d(view.getRootView());
            return r10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class n {
        static void a(View view, final q qVar) {
            int i10 = t.b.tag_unhandled_key_listeners;
            s.g gVar = (s.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new s.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.u
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return t.q.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            s.g gVar = (s.g) view.getTag(t.b.tag_unhandled_key_listeners);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class p {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    static class r {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f1941d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1942a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f1943b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f1944c = null;

        r() {
        }

        static r a(View view) {
            int i10 = t.b.tag_unhandled_key_event_manager;
            r rVar = (r) view.getTag(i10);
            if (rVar == null) {
                r rVar2 = new r();
                view.setTag(i10, rVar2);
                return rVar2;
            }
            return rVar;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1942a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f1943b == null) {
                this.f1943b = new SparseArray<>();
            }
            return this.f1943b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(t.b.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1942a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f1941d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f1942a == null) {
                    this.f1942a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f1941d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f1942a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f1942a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c10));
                }
            }
            return c10 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f1944c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f1944c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d10 = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d10.valueAt(indexOfKey);
                    d10.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d10.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && t.t(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public static void A(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static void B(View view, Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    public static void C(View view) {
        k.c(view);
    }

    private static f<Boolean> D() {
        return new a(t.b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void E(View view, androidx.core.view.a aVar) {
        if (aVar == null && (e(view) instanceof a.C0028a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void F(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static void G(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        l.q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static void H(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        l.r(view, mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (l.g(view) == null && l.h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static void I(View view, float f10) {
        l.s(view, f10);
    }

    public static void J(View view, int i10) {
        h.s(view, i10);
    }

    public static void K(View view, androidx.core.view.p pVar) {
        l.u(view, pVar);
    }

    public static void L(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.d(view, i10, i11);
        }
    }

    public static void M(View view, String str) {
        l.v(view, str);
    }

    private static void N(View view) {
        if (k(view) == 0) {
            J(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (k((View) parent) == 4) {
                J(view, 2);
                return;
            }
        }
    }

    private static f<CharSequence> O() {
        return new c(t.b.tag_state_description, CharSequence.class, 64, 30);
    }

    public static void P(View view) {
        l.z(view);
    }

    private static f<Boolean> a() {
        return new d(t.b.tag_accessibility_heading, Boolean.class, 28);
    }

    public static z b(View view) {
        if (f1927b == null) {
            f1927b = new WeakHashMap<>();
        }
        z zVar = f1927b.get(view);
        if (zVar == null) {
            z zVar2 = new z(view);
            f1927b.put(view, zVar2);
            return zVar2;
        }
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    private static View.AccessibilityDelegate e(View view) {
        return Build.VERSION.SDK_INT >= 29 ? o.a(view) : f(view);
    }

    private static View.AccessibilityDelegate f(View view) {
        if (f1929d) {
            return null;
        }
        if (f1928c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1928c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1929d = true;
                return null;
            }
        }
        try {
            Object obj = f1928c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1929d = true;
            return null;
        }
    }

    public static int g(View view) {
        return j.a(view);
    }

    public static CharSequence h(View view) {
        return y().d(view);
    }

    public static ColorStateList i(View view) {
        return l.g(view);
    }

    public static PorterDuff.Mode j(View view) {
        return l.h(view);
    }

    public static int k(View view) {
        return h.c(view);
    }

    public static int l(View view) {
        return i.d(view);
    }

    public static int m(View view) {
        return h.d(view);
    }

    public static d0 n(View view) {
        return Build.VERSION.SDK_INT >= 23 ? m.a(view) : l.j(view);
    }

    public static CharSequence o(View view) {
        return O().d(view);
    }

    public static String p(View view) {
        return l.k(view);
    }

    @Deprecated
    public static int q(View view) {
        return h.g(view);
    }

    public static boolean r(View view) {
        return g.a(view);
    }

    public static boolean s(View view) {
        Boolean d10 = a().d(view);
        return d10 != null && d10.booleanValue();
    }

    public static boolean t(View view) {
        return j.b(view);
    }

    public static boolean u(View view) {
        return j.c(view);
    }

    public static boolean v(View view) {
        Boolean d10 = D().d(view);
        return d10 != null && d10.booleanValue();
    }

    static void w(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = h(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (g(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                j.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(h(view));
                    N(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                j.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(h(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    j.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static d0 x(View view, d0 d0Var) {
        WindowInsets q10 = d0Var.q();
        if (q10 != null) {
            WindowInsets b10 = k.b(view, q10);
            if (!b10.equals(q10)) {
                return d0.s(b10, view);
            }
        }
        return d0Var;
    }

    private static f<CharSequence> y() {
        return new b(t.b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static void z(View view) {
        h.k(view);
    }
}
