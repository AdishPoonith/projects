package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: i  reason: collision with root package name */
    private static l0 f1250i;

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, s.h<ColorStateList>> f1252a;

    /* renamed from: b  reason: collision with root package name */
    private s.a<String, d> f1253b;

    /* renamed from: c  reason: collision with root package name */
    private s.h<String> f1254c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, s.d<WeakReference<Drawable.ConstantState>>> f1255d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1256e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1257f;

    /* renamed from: g  reason: collision with root package name */
    private e f1258g;

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f1249h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    private static final c f1251j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.l0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.l0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends s.e<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int h(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i10, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i10, mode)));
        }

        PorterDuffColorFilter j(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(l0 l0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.l0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f1253b == null) {
            this.f1253b = new s.a<>();
        }
        this.f1253b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            s.d<WeakReference<Drawable.ConstantState>> dVar = this.f1255d.get(context);
            if (dVar == null) {
                dVar = new s.d<>();
                this.f1255d.put(context, dVar);
            }
            dVar.n(j10, new WeakReference<>(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1252a == null) {
            this.f1252a = new WeakHashMap<>();
        }
        s.h<ColorStateList> hVar = this.f1252a.get(context);
        if (hVar == null) {
            hVar = new s.h<>();
            this.f1252a.put(context, hVar);
        }
        hVar.a(i10, colorStateList);
    }

    private void d(Context context) {
        if (this.f1257f) {
            return;
        }
        this.f1257f = true;
        Drawable j10 = j(context, j.a.abc_vector_test);
        if (j10 == null || !q(j10)) {
            this.f1257f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i10) {
        if (this.f1256e == null) {
            this.f1256e = new TypedValue();
        }
        TypedValue typedValue = this.f1256e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        e eVar = this.f1258g;
        Drawable c10 = eVar == null ? null : eVar.c(this, context, i10);
        if (c10 != null) {
            c10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, c10);
        }
        return c10;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized l0 h() {
        l0 l0Var;
        synchronized (l0.class) {
            if (f1250i == null) {
                l0 l0Var2 = new l0();
                f1250i = l0Var2;
                p(l0Var2);
            }
            l0Var = f1250i;
        }
        return l0Var;
    }

    private synchronized Drawable i(Context context, long j10) {
        s.d<WeakReference<Drawable.ConstantState>> dVar = this.f1255d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> h10 = dVar.h(j10);
        if (h10 != null) {
            Drawable.ConstantState constantState = h10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.f(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter i11;
        synchronized (l0.class) {
            c cVar = f1251j;
            i11 = cVar.i(i10, mode);
            if (i11 == null) {
                i11 = new PorterDuffColorFilter(i10, mode);
                cVar.j(i10, mode, i11);
            }
        }
        return i11;
    }

    private ColorStateList n(Context context, int i10) {
        s.h<ColorStateList> hVar;
        WeakHashMap<Context, s.h<ColorStateList>> weakHashMap = this.f1252a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.g(i10);
    }

    private static void p(l0 l0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            l0Var.a("vector", new f());
            l0Var.a("animated-vector", new b());
            l0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i10) {
        int next;
        s.a<String, d> aVar = this.f1253b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        s.h<String> hVar = this.f1254c;
        if (hVar != null) {
            String g10 = hVar.g(i10);
            if ("appcompat_skip_skip".equals(g10) || (g10 != null && this.f1253b.get(g10) == null)) {
                return null;
            }
        } else {
            this.f1254c = new s.h<>();
        }
        if (this.f1256e == null) {
            this.f1256e = new TypedValue();
        }
        TypedValue typedValue = this.f1256e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1254c.a(i10, name);
                d dVar = this.f1253b.get(name);
                if (dVar != null) {
                    i11 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i11 != null) {
                    i11.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e10, i11);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (i11 == null) {
            this.f1254c.a(i10, "appcompat_skip_skip");
        }
        return i11;
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 == null) {
            e eVar = this.f1258g;
            if ((eVar == null || !eVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (d0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable p10 = androidx.core.graphics.drawable.a.p(drawable);
        androidx.core.graphics.drawable.a.n(p10, m10);
        PorterDuff.Mode o10 = o(i10);
        if (o10 != null) {
            androidx.core.graphics.drawable.a.o(p10, o10);
            return p10;
        }
        return p10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, t0 t0Var, int[] iArr) {
        if (d0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = t0Var.f1335d;
        if (z10 || t0Var.f1334c) {
            drawable.setColorFilter(g(z10 ? t0Var.f1332a : null, t0Var.f1334c ? t0Var.f1333b : f1249h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.a.d(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            d0.b(r10);
        }
        return r10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            e eVar = this.f1258g;
            n10 = eVar == null ? null : eVar.d(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    PorterDuff.Mode o(int i10) {
        e eVar = this.f1258g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i10);
    }

    public synchronized void s(Context context) {
        s.d<WeakReference<Drawable.ConstantState>> dVar = this.f1255d.get(context);
        if (dVar != null) {
            dVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, a1 a1Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = a1Var.c(i10);
        }
        if (r10 != null) {
            return v(context, i10, false, r10);
        }
        return null;
    }

    public synchronized void u(e eVar) {
        this.f1258g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(Context context, int i10, Drawable drawable) {
        e eVar = this.f1258g;
        return eVar != null && eVar.a(context, i10, drawable);
    }
}
