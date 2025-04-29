package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.a implements b.a {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private final SparseBooleanArray G;
    e H;
    a I;
    RunnableC0015c J;
    private b K;
    final f L;
    int M;

    /* renamed from: t  reason: collision with root package name */
    d f1123t;

    /* renamed from: u  reason: collision with root package name */
    private Drawable f1124u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1125v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1126w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1127x;

    /* renamed from: y  reason: collision with root package name */
    private int f1128y;

    /* renamed from: z  reason: collision with root package name */
    private int f1129z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, f.a.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f1123t;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f822r : view2);
            }
            j(c.this.L);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.I = null;
            cVar.M = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public l.e a() {
            a aVar = c.this.I;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0015c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private e f1132j;

        public RunnableC0015c(e eVar) {
            this.f1132j = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f816l != null) {
                ((androidx.appcompat.view.menu.a) c.this).f816l.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f822r;
            if (view != null && view.getWindowToken() != null && this.f1132j.m()) {
                c.this.H = this.f1132j;
            }
            c.this.J = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: l  reason: collision with root package name */
        private final float[] f1134l;

        /* loaded from: classes.dex */
        class a extends g0 {

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ c f1136s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1136s = cVar;
            }

            @Override // androidx.appcompat.widget.g0
            public l.e b() {
                e eVar = c.this.H;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.g0
            public boolean c() {
                c.this.J();
                return true;
            }

            @Override // androidx.appcompat.widget.g0
            public boolean d() {
                c cVar = c.this;
                if (cVar.J != null) {
                    return false;
                }
                cVar.A();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, f.a.actionOverflowButtonStyle);
            this.f1134l = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            x0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.J();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, f.a.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.L);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f816l != null) {
                ((androidx.appcompat.view.menu.a) c.this).f816l.close();
            }
            c.this.H = null;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m10 = c.this.m();
            if (m10 != null) {
                m10.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == null) {
                return false;
            }
            c.this.M = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m10 = c.this.m();
            if (m10 != null) {
                return m10.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, f.g.abc_action_menu_layout, f.g.abc_action_menu_item_layout);
        this.G = new SparseBooleanArray();
        this.L = new f();
    }

    private View y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f822r;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0015c runnableC0015c = this.J;
        if (runnableC0015c != null && (kVar = this.f822r) != null) {
            ((View) kVar).removeCallbacks(runnableC0015c);
            this.J = null;
            return true;
        }
        e eVar = this.H;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean B() {
        a aVar = this.I;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean C() {
        return this.J != null || D();
    }

    public boolean D() {
        e eVar = this.H;
        return eVar != null && eVar.d();
    }

    public void E(Configuration configuration) {
        if (!this.B) {
            this.A = k.a.b(this.f815k).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f816l;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void F(boolean z10) {
        this.E = z10;
    }

    public void G(ActionMenuView actionMenuView) {
        this.f822r = actionMenuView;
        actionMenuView.b(this.f816l);
    }

    public void H(Drawable drawable) {
        d dVar = this.f1123t;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1125v = true;
        this.f1124u = drawable;
    }

    public void I(boolean z10) {
        this.f1126w = z10;
        this.f1127x = true;
    }

    public boolean J() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1126w || D() || (eVar = this.f816l) == null || this.f822r == null || this.J != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0015c runnableC0015c = new RunnableC0015c(new e(this.f815k, this.f816l, this.f1123t, true));
        this.J = runnableC0015c;
        ((View) this.f822r).post(runnableC0015c);
        super.e(null);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        x();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a
    public void c(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f822r);
        if (this.K == null) {
            this.K = new b();
        }
        actionMenuItemView.setPopupCallback(this.K);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(Context context, androidx.appcompat.view.menu.e eVar) {
        super.d(context, eVar);
        Resources resources = context.getResources();
        k.a b10 = k.a.b(context);
        if (!this.f1127x) {
            this.f1126w = b10.h();
        }
        if (!this.D) {
            this.f1128y = b10.c();
        }
        if (!this.B) {
            this.A = b10.d();
        }
        int i10 = this.f1128y;
        if (this.f1126w) {
            if (this.f1123t == null) {
                d dVar = new d(this.f814j);
                this.f1123t = dVar;
                if (this.f1125v) {
                    dVar.setImageDrawable(this.f1124u);
                    this.f1124u = null;
                    this.f1125v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1123t.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1123t.getMeasuredWidth();
        } else {
            this.f1123t = null;
        }
        this.f1129z = i10;
        this.F = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (mVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.m mVar2 = mVar;
            while (mVar2.e0() != this.f816l) {
                mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
            }
            View y10 = y(mVar2.getItem());
            if (y10 == null) {
                return false;
            }
            this.M = mVar.getItem().getItemId();
            int size = mVar.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                MenuItem item = mVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            a aVar = new a(this.f815k, mVar, y10);
            this.I = aVar;
            aVar.g(z10);
            this.I.k();
            super.e(mVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f822r).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f816l;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> s10 = eVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b b10 = s10.get(i10).b();
                if (b10 != null) {
                    b10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f816l;
        ArrayList<androidx.appcompat.view.menu.g> z12 = eVar2 != null ? eVar2.z() : null;
        if (this.f1126w && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !z12.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f1123t;
        if (z11) {
            if (dVar == null) {
                this.f1123t = new d(this.f814j);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1123t.getParent();
            if (viewGroup != this.f822r) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1123t);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f822r;
                actionMenuView.addView(this.f1123t, actionMenuView.D());
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            androidx.appcompat.view.menu.k kVar = this.f822r;
            if (parent == kVar) {
                ((ViewGroup) kVar).removeView(this.f1123t);
            }
        }
        ((ActionMenuView) this.f822r).setOverflowReserved(this.f1126w);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f816l;
        View view = null;
        int i14 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = cVar.A;
        int i16 = cVar.f1129z;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f822r;
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i19);
            if (gVar.o()) {
                i17++;
            } else if (gVar.n()) {
                i18++;
            } else {
                z10 = true;
            }
            if (cVar.E && gVar.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (cVar.f1126w && (z10 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = cVar.G;
        sparseBooleanArray.clear();
        if (cVar.C) {
            int i21 = cVar.F;
            i12 = i16 / i21;
            i11 = i21 + ((i16 % i21) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i22);
            if (gVar2.o()) {
                View n10 = cVar.n(gVar2, view, viewGroup);
                if (cVar.C) {
                    i12 -= ActionMenuView.J(n10, i11, i12, makeMeasureSpec, i14);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i20 > 0 || z11) && i16 > 0 && (!cVar.C || i12 > 0);
                boolean z13 = z12;
                i13 = i10;
                if (z12) {
                    View n11 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.C) {
                        int J = ActionMenuView.J(n11, i11, i12, makeMeasureSpec, 0);
                        i12 -= J;
                        if (J == 0) {
                            z13 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    z12 = z14 & (!cVar.C ? i16 + i23 <= 0 : i16 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i24 = 0; i24 < i22; i24++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i24);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i20++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z12) {
                    i20--;
                }
                gVar2.u(z12);
            } else {
                i13 = i10;
                gVar2.u(false);
                i22++;
                view = null;
                cVar = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            cVar = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1123t) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f822r;
        androidx.appcompat.view.menu.k o10 = super.o(viewGroup);
        if (kVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean x() {
        return A() | B();
    }

    public Drawable z() {
        d dVar = this.f1123t;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1125v) {
            return this.f1124u;
        }
        return null;
    }
}
