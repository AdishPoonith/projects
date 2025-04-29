package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    private static int f1832d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f1833a;

    /* renamed from: b  reason: collision with root package name */
    public int f1834b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f1835c = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* renamed from: e  reason: collision with root package name */
        public static final a f1836e = new a(1, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f1837f = new a(2, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f1838g = new a(4, null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f1839h = new a(8, null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f1840i = new a(16, null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f1841j = new a(32, null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f1842k = new a(64, null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f1843l = new a(128, null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f1844m = new a(256, null, e.b.class);

        /* renamed from: n  reason: collision with root package name */
        public static final a f1845n = new a(512, null, e.b.class);

        /* renamed from: o  reason: collision with root package name */
        public static final a f1846o = new a(1024, null, e.c.class);

        /* renamed from: p  reason: collision with root package name */
        public static final a f1847p = new a(2048, null, e.c.class);

        /* renamed from: q  reason: collision with root package name */
        public static final a f1848q = new a(4096, null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f1849r = new a(8192, null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f1850s = new a(16384, null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f1851t = new a(32768, null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f1852u = new a(65536, null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f1853v = new a(131072, null, e.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f1854w = new a(262144, null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f1855x = new a(524288, null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f1856y = new a(1048576, null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f1857z = new a(2097152, null, e.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f1858a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1859b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends e.a> f1860c;

        /* renamed from: d  reason: collision with root package name */
        protected final e f1861d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, e.C0030e.class);
            C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, e.f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, e.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends e.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i10, CharSequence charSequence, e eVar, Class<? extends e.a> cls) {
            this.f1859b = i10;
            this.f1861d = eVar;
            this.f1858a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f1860c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1858a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1858a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            e.a newInstance;
            if (this.f1861d != null) {
                e.a aVar = null;
                Class<? extends e.a> cls = this.f1860c;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                    }
                    try {
                        newInstance.a(bundle);
                        aVar = newInstance;
                    } catch (Exception e11) {
                        e = e11;
                        aVar = newInstance;
                        Class<? extends e.a> cls2 = this.f1860c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                        return this.f1861d.a(view, aVar);
                    }
                }
                return this.f1861d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.f1858a;
                Object obj3 = ((a) obj).f1858a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f1858a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String g10 = b.g(this.f1859b);
            if (g10.equals("ACTION_UNKNOWN") && b() != null) {
                g10 = b().toString();
            }
            sb.append(g10);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.accessibility.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0029b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    private b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1833a = accessibilityNodeInfo;
    }

    private void G(View view) {
        SparseArray<WeakReference<ClickableSpan>> p10 = p(view);
        if (p10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < p10.size(); i10++) {
                if (p10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                p10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void H(int i10, boolean z10) {
        Bundle m10 = m();
        if (m10 != null) {
            int i11 = m10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            m10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public static b P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new b(accessibilityNodeInfo);
    }

    private void b(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void d() {
        C0029b.a(this.f1833a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        C0029b.a(this.f1833a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        C0029b.a(this.f1833a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        C0029b.a(this.f1833a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> e(String str) {
        ArrayList<Integer> integerArrayList = C0029b.a(this.f1833a).getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            C0029b.a(this.f1833a).putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    static String g(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                switch (i10) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i10) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i10) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i10) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] k(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> n(View view) {
        SparseArray<WeakReference<ClickableSpan>> p10 = p(view);
        if (p10 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(t.b.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return p10;
    }

    private SparseArray<WeakReference<ClickableSpan>> p(View view) {
        return (SparseArray) view.getTag(t.b.tag_accessibility_clickable_spans);
    }

    private boolean t() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int u(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f1832d;
        f1832d = i11 + 1;
        return i11;
    }

    public boolean A() {
        return this.f1833a.isFocused();
    }

    public boolean B() {
        return this.f1833a.isLongClickable();
    }

    public boolean C() {
        return this.f1833a.isPassword();
    }

    public boolean D() {
        return this.f1833a.isScrollable();
    }

    public boolean E() {
        return this.f1833a.isSelected();
    }

    public boolean F(int i10, Bundle bundle) {
        return this.f1833a.performAction(i10, bundle);
    }

    public void I(CharSequence charSequence) {
        this.f1833a.setClassName(charSequence);
    }

    public void J(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1833a.setHeading(z10);
        } else {
            H(2, z10);
        }
    }

    public void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1833a.setPaneTitle(charSequence);
        } else {
            C0029b.a(this.f1833a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void L(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1833a.setScreenReaderFocusable(z10);
        } else {
            H(1, z10);
        }
    }

    public void M(boolean z10) {
        this.f1833a.setScrollable(z10);
    }

    public void N(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f1833a.setStateDescription(charSequence);
        } else {
            C0029b.a(this.f1833a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo O() {
        return this.f1833a;
    }

    public void a(a aVar) {
        this.f1833a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1858a);
    }

    public void c(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            d();
            G(view);
            ClickableSpan[] k10 = k(charSequence);
            if (k10 == null || k10.length <= 0) {
                return;
            }
            m().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", t.b.accessibility_action_clickable_span);
            SparseArray<WeakReference<ClickableSpan>> n10 = n(view);
            for (int i10 = 0; i10 < k10.length; i10++) {
                int u10 = u(k10[i10], n10);
                n10.put(u10, new WeakReference<>(k10[i10]));
                b(k10[i10], (Spanned) charSequence, u10);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f1833a;
            if (accessibilityNodeInfo == null) {
                if (bVar.f1833a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(bVar.f1833a)) {
                return false;
            }
            return this.f1835c == bVar.f1835c && this.f1834b == bVar.f1834b;
        }
        return false;
    }

    public List<a> f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1833a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new a(actionList.get(i10)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Deprecated
    public void h(Rect rect) {
        this.f1833a.getBoundsInParent(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1833a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Rect rect) {
        this.f1833a.getBoundsInScreen(rect);
    }

    public CharSequence j() {
        return this.f1833a.getClassName();
    }

    public CharSequence l() {
        return this.f1833a.getContentDescription();
    }

    public Bundle m() {
        return C0029b.a(this.f1833a);
    }

    public CharSequence o() {
        return this.f1833a.getPackageName();
    }

    public CharSequence q() {
        if (t()) {
            List<Integer> e10 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> e11 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> e12 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> e13 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1833a.getText(), 0, this.f1833a.getText().length()));
            for (int i10 = 0; i10 < e10.size(); i10++) {
                spannableString.setSpan(new androidx.core.view.accessibility.a(e13.get(i10).intValue(), this, m().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), e10.get(i10).intValue(), e11.get(i10).intValue(), e12.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f1833a.getText();
    }

    public String r() {
        return androidx.core.os.a.c() ? this.f1833a.getUniqueId() : C0029b.a(this.f1833a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String s() {
        return this.f1833a.getViewIdResourceName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        h(rect);
        sb.append("; boundsInParent: " + rect);
        i(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(o());
        sb.append("; className: ");
        sb.append(j());
        sb.append("; text: ");
        sb.append(q());
        sb.append("; contentDescription: ");
        sb.append(l());
        sb.append("; viewId: ");
        sb.append(s());
        sb.append("; uniqueId: ");
        sb.append(r());
        sb.append("; checkable: ");
        sb.append(v());
        sb.append("; checked: ");
        sb.append(w());
        sb.append("; focusable: ");
        sb.append(z());
        sb.append("; focused: ");
        sb.append(A());
        sb.append("; selected: ");
        sb.append(E());
        sb.append("; clickable: ");
        sb.append(x());
        sb.append("; longClickable: ");
        sb.append(B());
        sb.append("; enabled: ");
        sb.append(y());
        sb.append("; password: ");
        sb.append(C());
        sb.append("; scrollable: " + D());
        sb.append("; [");
        List<a> f10 = f();
        for (int i10 = 0; i10 < f10.size(); i10++) {
            a aVar = f10.get(i10);
            String g10 = g(aVar.a());
            if (g10.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                g10 = aVar.b().toString();
            }
            sb.append(g10);
            if (i10 != f10.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean v() {
        return this.f1833a.isCheckable();
    }

    public boolean w() {
        return this.f1833a.isChecked();
    }

    public boolean x() {
        return this.f1833a.isClickable();
    }

    public boolean y() {
        return this.f1833a.isEnabled();
    }

    public boolean z() {
        return this.f1833a.isFocusable();
    }
}
