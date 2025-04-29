package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private n0 C;
    private int D;
    private int E;
    private int F;
    private CharSequence G;
    private CharSequence H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList<View> M;
    private final ArrayList<View> N;
    private final int[] O;
    f P;
    private final ActionMenuView.e Q;
    private w0 R;
    private androidx.appcompat.widget.c S;
    private d T;
    private j.a U;
    private e.a V;
    private boolean W;

    /* renamed from: a0  reason: collision with root package name */
    private final Runnable f1075a0;

    /* renamed from: j  reason: collision with root package name */
    private ActionMenuView f1076j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f1077k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f1078l;

    /* renamed from: m  reason: collision with root package name */
    private ImageButton f1079m;

    /* renamed from: n  reason: collision with root package name */
    private ImageView f1080n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f1081o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f1082p;

    /* renamed from: q  reason: collision with root package name */
    ImageButton f1083q;

    /* renamed from: r  reason: collision with root package name */
    View f1084r;

    /* renamed from: s  reason: collision with root package name */
    private Context f1085s;

    /* renamed from: t  reason: collision with root package name */
    private int f1086t;

    /* renamed from: u  reason: collision with root package name */
    private int f1087u;

    /* renamed from: v  reason: collision with root package name */
    private int f1088v;

    /* renamed from: w  reason: collision with root package name */
    int f1089w;

    /* renamed from: x  reason: collision with root package name */
    private int f1090x;

    /* renamed from: y  reason: collision with root package name */
    private int f1091y;

    /* renamed from: z  reason: collision with root package name */
    private int f1092z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.P;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.j {

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f1096j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.g f1097k;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1096j;
            if (eVar2 != null && (gVar = this.f1097k) != null) {
                eVar2.f(gVar);
            }
            this.f1096j = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(boolean z10) {
            if (this.f1097k != null) {
                androidx.appcompat.view.menu.e eVar = this.f1096j;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f1096j.getItem(i10) == this.f1097k) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                i(this.f1096j, this.f1097k);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f1084r;
            if (view instanceof k.c) {
                ((k.c) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1084r);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1083q);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1084r = null;
            toolbar3.a();
            this.f1097k = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1083q.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1083q);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1083q);
            }
            Toolbar.this.f1084r = gVar.getActionView();
            this.f1097k = gVar;
            ViewParent parent2 = Toolbar.this.f1084r.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1084r);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f653a = 8388611 | (toolbar4.f1089w & 112);
                generateDefaultLayoutParams.f1099b = 2;
                toolbar4.f1084r.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1084r);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f1084r;
            if (view instanceof k.c) {
                ((k.c) view).c();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0011a {

        /* renamed from: b  reason: collision with root package name */
        int f1099b;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f1099b = 0;
            this.f653a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1099b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1099b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1099b = 0;
            a(marginLayoutParams);
        }

        public e(a.C0011a c0011a) {
            super(c0011a);
            this.f1099b = 0;
        }

        public e(e eVar) {
            super((a.C0011a) eVar);
            this.f1099b = 0;
            this.f1099b = eVar.f1099b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends z.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: l  reason: collision with root package name */
        int f1100l;

        /* renamed from: m  reason: collision with root package name */
        boolean f1101m;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1100l = parcel.readInt();
            this.f1101m = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // z.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1100l);
            parcel.writeInt(this.f1101m ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.F = 8388627;
        this.M = new ArrayList<>();
        this.N = new ArrayList<>();
        this.O = new int[2];
        this.Q = new a();
        this.f1075a0 = new b();
        v0 t10 = v0.t(getContext(), attributeSet, f.j.W2, i10, 0);
        this.f1087u = t10.m(f.j.f8355y3, 0);
        this.f1088v = t10.m(f.j.f8310p3, 0);
        this.F = t10.k(f.j.X2, this.F);
        this.f1089w = t10.k(f.j.Y2, 48);
        int d10 = t10.d(f.j.f8325s3, 0);
        int i11 = f.j.f8350x3;
        d10 = t10.q(i11) ? t10.d(i11, d10) : d10;
        this.B = d10;
        this.A = d10;
        this.f1092z = d10;
        this.f1091y = d10;
        int d11 = t10.d(f.j.f8340v3, -1);
        if (d11 >= 0) {
            this.f1091y = d11;
        }
        int d12 = t10.d(f.j.f8335u3, -1);
        if (d12 >= 0) {
            this.f1092z = d12;
        }
        int d13 = t10.d(f.j.f8345w3, -1);
        if (d13 >= 0) {
            this.A = d13;
        }
        int d14 = t10.d(f.j.f8330t3, -1);
        if (d14 >= 0) {
            this.B = d14;
        }
        this.f1090x = t10.e(f.j.f8280j3, -1);
        int d15 = t10.d(f.j.f8260f3, Integer.MIN_VALUE);
        int d16 = t10.d(f.j.f8240b3, Integer.MIN_VALUE);
        int e10 = t10.e(f.j.f8250d3, 0);
        int e11 = t10.e(f.j.f8255e3, 0);
        h();
        this.C.e(e10, e11);
        if (d15 != Integer.MIN_VALUE || d16 != Integer.MIN_VALUE) {
            this.C.g(d15, d16);
        }
        this.D = t10.d(f.j.f8265g3, Integer.MIN_VALUE);
        this.E = t10.d(f.j.f8245c3, Integer.MIN_VALUE);
        this.f1081o = t10.f(f.j.f8235a3);
        this.f1082p = t10.o(f.j.Z2);
        CharSequence o10 = t10.o(f.j.f8320r3);
        if (!TextUtils.isEmpty(o10)) {
            setTitle(o10);
        }
        CharSequence o11 = t10.o(f.j.f8305o3);
        if (!TextUtils.isEmpty(o11)) {
            setSubtitle(o11);
        }
        this.f1085s = getContext();
        setPopupTheme(t10.m(f.j.f8300n3, 0));
        Drawable f10 = t10.f(f.j.f8295m3);
        if (f10 != null) {
            setNavigationIcon(f10);
        }
        CharSequence o12 = t10.o(f.j.f8290l3);
        if (!TextUtils.isEmpty(o12)) {
            setNavigationContentDescription(o12);
        }
        Drawable f11 = t10.f(f.j.f8270h3);
        if (f11 != null) {
            setLogo(f11);
        }
        CharSequence o13 = t10.o(f.j.f8275i3);
        if (!TextUtils.isEmpty(o13)) {
            setLogoDescription(o13);
        }
        int i12 = f.j.f8360z3;
        if (t10.q(i12)) {
            setTitleTextColor(t10.c(i12));
        }
        int i13 = f.j.f8315q3;
        if (t10.q(i13)) {
            setSubtitleTextColor(t10.c(i13));
        }
        int i14 = f.j.f8285k3;
        if (t10.q(i14)) {
            x(t10.m(i14, 0));
        }
        t10.u();
    }

    private int B(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.f1075a0);
        post(this.f1075a0);
    }

    private boolean L() {
        if (this.W) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = androidx.core.view.t.l(this) == 1;
        int childCount = getChildCount();
        int a10 = androidx.core.view.d.a(i10, androidx.core.view.t.l(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1099b == 0 && M(childAt) && p(eVar.f653a) == a10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1099b == 0 && M(childAt2) && p(eVar2.f653a) == a10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f1099b = 1;
        if (!z10 || this.f1084r == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.N.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new k.g(getContext());
    }

    private void h() {
        if (this.C == null) {
            this.C = new n0();
        }
    }

    private void i() {
        if (this.f1080n == null) {
            this.f1080n = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1076j.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1076j.getMenu();
            if (this.T == null) {
                this.T = new d();
            }
            this.f1076j.setExpandedActionViewsExclusive(true);
            eVar.c(this.T, this.f1085s);
        }
    }

    private void k() {
        if (this.f1076j == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1076j = actionMenuView;
            actionMenuView.setPopupTheme(this.f1086t);
            this.f1076j.setOnMenuItemClickListener(this.Q);
            this.f1076j.M(this.U, this.V);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f653a = 8388613 | (this.f1089w & 112);
            this.f1076j.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1076j, false);
        }
    }

    private void l() {
        if (this.f1079m == null) {
            this.f1079m = new m(getContext(), null, f.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f653a = 8388611 | (this.f1089w & 112);
            this.f1079m.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int l10 = androidx.core.view.t.l(this);
        int a10 = androidx.core.view.d.a(i10, l10) & 7;
        return (a10 == 1 || a10 == 3 || a10 == 5) ? a10 : l10 == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(eVar.f653a);
        if (r10 != 48) {
            if (r10 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.F & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.g.b(marginLayoutParams) + androidx.core.view.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.N.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1076j;
        return actionMenuView != null && actionMenuView.H();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1099b != 2 && childAt != this.f1076j) {
                removeViewAt(childCount);
                this.N.add(childAt);
            }
        }
    }

    public void H(int i10, int i11) {
        h();
        this.C.g(i10, i11);
    }

    public void I(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f1076j == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e L = this.f1076j.L();
        if (L == eVar) {
            return;
        }
        if (L != null) {
            L.O(this.S);
            L.O(this.T);
        }
        if (this.T == null) {
            this.T = new d();
        }
        cVar.F(true);
        if (eVar != null) {
            eVar.c(cVar, this.f1085s);
            eVar.c(this.T, this.f1085s);
        } else {
            cVar.d(this.f1085s, null);
            this.T.d(this.f1085s, null);
            cVar.f(true);
            this.T.f(true);
        }
        this.f1076j.setPopupTheme(this.f1086t);
        this.f1076j.setPresenter(cVar);
        this.S = cVar;
    }

    public void J(Context context, int i10) {
        this.f1088v = i10;
        TextView textView = this.f1078l;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void K(Context context, int i10) {
        this.f1087u = i10;
        TextView textView = this.f1077k;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f1076j;
        return actionMenuView != null && actionMenuView.N();
    }

    void a() {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            addView(this.N.get(size));
        }
        this.N.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1076j) != null && actionMenuView.I();
    }

    public void e() {
        d dVar = this.T;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f1097k;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1076j;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f1083q == null) {
            m mVar = new m(getContext(), null, f.a.toolbarNavigationButtonStyle);
            this.f1083q = mVar;
            mVar.setImageDrawable(this.f1081o);
            this.f1083q.setContentDescription(this.f1082p);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f653a = 8388611 | (this.f1089w & 112);
            generateDefaultLayoutParams.f1099b = 2;
            this.f1083q.setLayoutParams(generateDefaultLayoutParams);
            this.f1083q.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1083q;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1083q;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        n0 n0Var = this.C;
        if (n0Var != null) {
            return n0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.E;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        n0 n0Var = this.C;
        if (n0Var != null) {
            return n0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        n0 n0Var = this.C;
        if (n0Var != null) {
            return n0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        n0 n0Var = this.C;
        if (n0Var != null) {
            return n0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.D;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e L;
        ActionMenuView actionMenuView = this.f1076j;
        return actionMenuView != null && (L = actionMenuView.L()) != null && L.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.E, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.t.l(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.t.l(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.D, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1080n;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1080n;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1076j.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1079m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1079m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.S;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1076j.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1085s;
    }

    public int getPopupTheme() {
        return this.f1086t;
    }

    public CharSequence getSubtitle() {
        return this.H;
    }

    final TextView getSubtitleTextView() {
        return this.f1078l;
    }

    public CharSequence getTitle() {
        return this.G;
    }

    public int getTitleMarginBottom() {
        return this.B;
    }

    public int getTitleMarginEnd() {
        return this.f1092z;
    }

    public int getTitleMarginStart() {
        return this.f1091y;
    }

    public int getTitleMarginTop() {
        return this.A;
    }

    final TextView getTitleTextView() {
        return this.f1077k;
    }

    public c0 getWrapper() {
        if (this.R == null) {
            this.R = new w0(this, true);
        }
        return this.R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0011a ? new e((a.C0011a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1075a0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.L = false;
        }
        if (!this.L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.L = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.L = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.O;
        boolean b10 = b1.b(this);
        int i19 = !b10 ? 1 : 0;
        if (M(this.f1079m)) {
            E(this.f1079m, i10, 0, i11, 0, this.f1090x);
            i12 = this.f1079m.getMeasuredWidth() + s(this.f1079m);
            i13 = Math.max(0, this.f1079m.getMeasuredHeight() + t(this.f1079m));
            i14 = View.combineMeasuredStates(0, this.f1079m.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (M(this.f1083q)) {
            E(this.f1083q, i10, 0, i11, 0, this.f1090x);
            i12 = this.f1083q.getMeasuredWidth() + s(this.f1083q);
            i13 = Math.max(i13, this.f1083q.getMeasuredHeight() + t(this.f1083q));
            i14 = View.combineMeasuredStates(i14, this.f1083q.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (M(this.f1076j)) {
            E(this.f1076j, i10, max, i11, 0, this.f1090x);
            i15 = this.f1076j.getMeasuredWidth() + s(this.f1076j);
            i13 = Math.max(i13, this.f1076j.getMeasuredHeight() + t(this.f1076j));
            i14 = View.combineMeasuredStates(i14, this.f1076j.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (M(this.f1084r)) {
            max2 += D(this.f1084r, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1084r.getMeasuredHeight() + t(this.f1084r));
            i14 = View.combineMeasuredStates(i14, this.f1084r.getMeasuredState());
        }
        if (M(this.f1080n)) {
            max2 += D(this.f1080n, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1080n.getMeasuredHeight() + t(this.f1080n));
            i14 = View.combineMeasuredStates(i14, this.f1080n.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f1099b == 0 && M(childAt)) {
                max2 += D(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i21 = this.A + this.B;
        int i22 = this.f1091y + this.f1092z;
        if (M(this.f1077k)) {
            D(this.f1077k, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f1077k.getMeasuredWidth() + s(this.f1077k);
            i18 = this.f1077k.getMeasuredHeight() + t(this.f1077k);
            i16 = View.combineMeasuredStates(i14, this.f1077k.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = i14;
            i17 = 0;
            i18 = 0;
        }
        if (M(this.f1078l)) {
            i17 = Math.max(i17, D(this.f1078l, i10, max2 + i22, i11, i18 + i21, iArr));
            i18 += this.f1078l.getMeasuredHeight() + t(this.f1078l);
            i16 = View.combineMeasuredStates(i16, this.f1078l.getMeasuredState());
        }
        int max3 = Math.max(i13, i18);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i17 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i16), L() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i16 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f1076j;
        androidx.appcompat.view.menu.e L = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = gVar.f1100l;
        if (i10 != 0 && this.T != null && L != null && (findItem = L.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f1101m) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.C.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.T;
        if (dVar != null && (gVar = dVar.f1097k) != null) {
            gVar2.f1100l = gVar.getItemId();
        }
        gVar2.f1101m = A();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
        }
        if (!this.K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.K = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1083q;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(h.a.d(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1083q.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1083q;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1081o);
        }
    }

    public void setCollapsible(boolean z10) {
        this.W = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.E) {
            this.E = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.D) {
            this.D = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(h.a.d(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f1080n)) {
                c(this.f1080n, true);
            }
        } else {
            ImageView imageView = this.f1080n;
            if (imageView != null && y(imageView)) {
                removeView(this.f1080n);
                this.N.remove(this.f1080n);
            }
        }
        ImageView imageView2 = this.f1080n;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1080n;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1079m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(h.a.d(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f1079m)) {
                c(this.f1079m, true);
            }
        } else {
            ImageButton imageButton = this.f1079m;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f1079m);
                this.N.remove(this.f1079m);
            }
        }
        ImageButton imageButton2 = this.f1079m;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1079m.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.P = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1076j.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1086t != i10) {
            this.f1086t = i10;
            if (i10 == 0) {
                this.f1085s = getContext();
            } else {
                this.f1085s = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1078l;
            if (textView != null && y(textView)) {
                removeView(this.f1078l);
                this.N.remove(this.f1078l);
            }
        } else {
            if (this.f1078l == null) {
                Context context = getContext();
                y yVar = new y(context);
                this.f1078l = yVar;
                yVar.setSingleLine();
                this.f1078l.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1088v;
                if (i10 != 0) {
                    this.f1078l.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.f1078l.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1078l)) {
                c(this.f1078l, true);
            }
        }
        TextView textView2 = this.f1078l;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.H = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.J = colorStateList;
        TextView textView = this.f1078l;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1077k;
            if (textView != null && y(textView)) {
                removeView(this.f1077k);
                this.N.remove(this.f1077k);
            }
        } else {
            if (this.f1077k == null) {
                Context context = getContext();
                y yVar = new y(context);
                this.f1077k = yVar;
                yVar.setSingleLine();
                this.f1077k.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1087u;
                if (i10 != 0) {
                    this.f1077k.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.f1077k.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1077k)) {
                c(this.f1077k, true);
            }
        }
        TextView textView2 = this.f1077k;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.G = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.B = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1092z = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1091y = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.A = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        TextView textView = this.f1077k;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.T;
        return (dVar == null || dVar.f1097k == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1076j;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f1076j;
        return actionMenuView != null && actionMenuView.G();
    }
}
