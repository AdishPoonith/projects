package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.h0;
/* loaded from: classes.dex */
public class o0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: s  reason: collision with root package name */
    private static final Interpolator f1277s = new DecelerateInterpolator();

    /* renamed from: j  reason: collision with root package name */
    Runnable f1278j;

    /* renamed from: k  reason: collision with root package name */
    private c f1279k;

    /* renamed from: l  reason: collision with root package name */
    h0 f1280l;

    /* renamed from: m  reason: collision with root package name */
    private Spinner f1281m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1282n;

    /* renamed from: o  reason: collision with root package name */
    int f1283o;

    /* renamed from: p  reason: collision with root package name */
    int f1284p;

    /* renamed from: q  reason: collision with root package name */
    private int f1285q;

    /* renamed from: r  reason: collision with root package name */
    private int f1286r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View f1287j;

        a(View view) {
            this.f1287j = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.this.smoothScrollTo(this.f1287j.getLeft() - ((o0.this.getWidth() - this.f1287j.getWidth()) / 2), 0);
            o0.this.f1278j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return o0.this.f1280l.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) o0.this.f1280l.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return o0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = o0.this.f1280l.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = o0.this.f1280l.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: j  reason: collision with root package name */
        private final int[] f1291j;

        /* renamed from: k  reason: collision with root package name */
        private a.c f1292k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f1293l;

        /* renamed from: m  reason: collision with root package name */
        private ImageView f1294m;

        /* renamed from: n  reason: collision with root package name */
        private View f1295n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.o0.this = r5
                int r5 = f.a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1291j = r1
                r4.f1292k = r7
                androidx.appcompat.widget.v0 r5 = androidx.appcompat.widget.v0.t(r6, r0, r1, r5, r3)
                boolean r6 = r5.q(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.f(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.u()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.d.<init>(androidx.appcompat.widget.o0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1292k = cVar;
            c();
        }

        public a.c b() {
            return this.f1292k;
        }

        public void c() {
            a.c cVar = this.f1292k;
            View b10 = cVar.b();
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f1295n = b10;
                TextView textView = this.f1293l;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1294m;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1294m.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1295n;
            if (view != null) {
                removeView(view);
                this.f1295n = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f1294m == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1294m = appCompatImageView;
                }
                this.f1294m.setImageDrawable(c10);
                this.f1294m.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1294m;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1294m.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f1293l == null) {
                    y yVar = new y(getContext(), null, f.a.actionBarTabTextStyle);
                    yVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    yVar.setLayoutParams(layoutParams2);
                    addView(yVar);
                    this.f1293l = yVar;
                }
                this.f1293l.setText(d10);
                this.f1293l.setVisibility(0);
            } else {
                TextView textView2 = this.f1293l;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1293l.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1294m;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            x0.a(this, z10 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (o0.this.f1283o > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = o0.this.f1283o;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        v vVar = new v(getContext(), null, f.a.actionDropDownStyle);
        vVar.setLayoutParams(new h0.a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    private boolean d() {
        Spinner spinner = this.f1281m;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1281m == null) {
            this.f1281m = b();
        }
        removeView(this.f1280l);
        addView(this.f1281m, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1281m.getAdapter() == null) {
            this.f1281m.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1278j;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1278j = null;
        }
        this.f1281m.setSelection(this.f1286r);
    }

    private boolean f() {
        if (d()) {
            removeView(this.f1281m);
            addView(this.f1280l, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1281m.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1280l.getChildAt(i10);
        Runnable runnable = this.f1278j;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1278j = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1285q));
        } else {
            dVar.setFocusable(true);
            if (this.f1279k == null) {
                this.f1279k = new c();
            }
            dVar.setOnClickListener(this.f1279k);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1278j;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k.a b10 = k.a.b(getContext());
        setContentHeight(b10.f());
        this.f1284p = b10.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1278j;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = true;
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.f1280l.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.f1283o = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1283o = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.f1283o, this.f1284p);
        }
        this.f1283o = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1285q, 1073741824);
        if ((z11 || !this.f1282n) ? false : false) {
            this.f1280l.measure(0, makeMeasureSpec);
            if (this.f1280l.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z11 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f1286r);
                return;
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z11) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1282n = z10;
    }

    public void setContentHeight(int i10) {
        this.f1285q = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1286r = i10;
        int childCount = this.f1280l.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1280l.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1281m;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
