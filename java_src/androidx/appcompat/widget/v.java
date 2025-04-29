package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
/* loaded from: classes.dex */
public class v extends Spinner {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f1343r = {16843505};

    /* renamed from: j  reason: collision with root package name */
    private final androidx.appcompat.widget.e f1344j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f1345k;

    /* renamed from: l  reason: collision with root package name */
    private g0 f1346l;

    /* renamed from: m  reason: collision with root package name */
    private SpinnerAdapter f1347m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f1348n;

    /* renamed from: o  reason: collision with root package name */
    private g f1349o;

    /* renamed from: p  reason: collision with root package name */
    int f1350p;

    /* renamed from: q  reason: collision with root package name */
    final Rect f1351q;

    /* loaded from: classes.dex */
    class a extends g0 {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ e f1352s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f1352s = eVar;
        }

        @Override // androidx.appcompat.widget.g0
        public l.e b() {
            return this.f1352s;
        }

        @Override // androidx.appcompat.widget.g0
        public boolean c() {
            if (v.this.getInternalPopup().c()) {
                return true;
            }
            v.this.b();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!v.this.getInternalPopup().c()) {
                v.this.b();
            }
            ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.app.b f1355j;

        /* renamed from: k  reason: collision with root package name */
        private ListAdapter f1356k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f1357l;

        c() {
        }

        @Override // androidx.appcompat.widget.v.g
        public boolean c() {
            androidx.appcompat.app.b bVar = this.f1355j;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.v.g
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f1355j;
            if (bVar != null) {
                bVar.dismiss();
                this.f1355j = null;
            }
        }

        @Override // androidx.appcompat.widget.v.g
        public Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.v.g
        public void h(CharSequence charSequence) {
            this.f1357l = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void m(int i10, int i11) {
            if (this.f1356k == null) {
                return;
            }
            b.a aVar = new b.a(v.this.getPopupContext());
            CharSequence charSequence = this.f1357l;
            if (charSequence != null) {
                aVar.h(charSequence);
            }
            androidx.appcompat.app.b a10 = aVar.g(this.f1356k, v.this.getSelectedItemPosition(), this).a();
            this.f1355j = a10;
            ListView f10 = a10.f();
            f10.setTextDirection(i10);
            f10.setTextAlignment(i11);
            this.f1355j.show();
        }

        @Override // androidx.appcompat.widget.v.g
        public int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence o() {
            return this.f1357l;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            v.this.setSelection(i10);
            if (v.this.getOnItemClickListener() != null) {
                v.this.performItemClick(null, i10, this.f1356k.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.v.g
        public void p(ListAdapter listAdapter) {
            this.f1356k = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: j  reason: collision with root package name */
        private SpinnerAdapter f1359j;

        /* renamed from: k  reason: collision with root package name */
        private ListAdapter f1360k;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1359j = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1360k = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof r0) {
                    r0 r0Var = (r0) spinnerAdapter;
                    if (r0Var.getDropDownViewTheme() == null) {
                        r0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1360k;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1359j;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1359j;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1359j;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1359j;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1359j;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1360k;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1359j;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1359j;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends i0 implements g {
        private CharSequence T;
        ListAdapter U;
        private final Rect V;
        private int W;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ v f1361j;

            a(v vVar) {
                this.f1361j = vVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                v.this.setSelection(i10);
                if (v.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    v.this.performItemClick(view, i10, eVar.U.getItemId(i10));
                }
                e.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(v.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.O();
                e.super.a();
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1364j;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1364j = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1364j);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.V = new Rect();
            z(v.this);
            F(true);
            K(0);
            H(new a(v.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void O() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.f()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.v r1 = androidx.appcompat.widget.v.this
                android.graphics.Rect r1 = r1.f1351q
                r0.getPadding(r1)
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                boolean r0 = androidx.appcompat.widget.b1.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                android.graphics.Rect r0 = r0.f1351q
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                android.graphics.Rect r0 = r0.f1351q
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                android.graphics.Rect r0 = r0.f1351q
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.v.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.v r2 = androidx.appcompat.widget.v.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.v r3 = androidx.appcompat.widget.v.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.v.this
                int r5 = r4.f1350p
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.U
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.f()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.v r5 = androidx.appcompat.widget.v.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.v r6 = androidx.appcompat.widget.v.this
                android.graphics.Rect r6 = r6.f1351q
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.B(r4)
                goto L85
            L82:
                r8.B(r5)
            L85:
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.v.this
                boolean r4 = androidx.appcompat.widget.b1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.v()
                int r3 = r3 - r0
                int r0 = r8.P()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.P()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.l(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.e.O():void");
        }

        public int P() {
            return this.W;
        }

        boolean Q(View view) {
            return androidx.core.view.t.t(view) && view.getGlobalVisibleRect(this.V);
        }

        @Override // androidx.appcompat.widget.v.g
        public void h(CharSequence charSequence) {
            this.T = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void k(int i10) {
            this.W = i10;
        }

        @Override // androidx.appcompat.widget.v.g
        public void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean c10 = c();
            O();
            E(2);
            super.a();
            ListView g10 = g();
            g10.setChoiceMode(1);
            g10.setTextDirection(i10);
            g10.setTextAlignment(i11);
            L(v.this.getSelectedItemPosition());
            if (c10 || (viewTreeObserver = v.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            G(new c(bVar));
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence o() {
            return this.T;
        }

        @Override // androidx.appcompat.widget.i0, androidx.appcompat.widget.v.g
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.U = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        boolean f1366j;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1366j = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1366j ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        boolean c();

        int d();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i10);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.spinnerStyle);
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public v(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1351q = r0
            int[] r0 = f.j.A2
            r1 = 0
            androidx.appcompat.widget.v0 r0 = androidx.appcompat.widget.v0.t(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1344j = r2
            if (r11 == 0) goto L22
            k.d r2 = new k.d
            r2.<init>(r7, r11)
        L1f:
            r6.f1345k = r2
            goto L32
        L22:
            int r11 = f.j.F2
            int r11 = r0.m(r11, r1)
            if (r11 == 0) goto L30
            k.d r2 = new k.d
            r2.<init>(r7, r11)
            goto L1f
        L30:
            r6.f1345k = r7
        L32:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L62
            int[] r11 = androidx.appcompat.widget.v.f1343r     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5a
            if (r3 == 0) goto L46
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5a
        L46:
            r11.recycle()
            goto L62
        L4a:
            r3 = move-exception
            goto L50
        L4c:
            r7 = move-exception
            goto L5c
        L4e:
            r3 = move-exception
            r11 = r2
        L50:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L5a
            if (r11 == 0) goto L62
            goto L46
        L5a:
            r7 = move-exception
            r2 = r11
        L5c:
            if (r2 == 0) goto L61
            r2.recycle()
        L61:
            throw r7
        L62:
            r11 = 1
            if (r10 == 0) goto L9f
            if (r10 == r11) goto L68
            goto Laf
        L68:
            androidx.appcompat.widget.v$e r10 = new androidx.appcompat.widget.v$e
            android.content.Context r3 = r6.f1345k
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1345k
            int[] r4 = f.j.A2
            androidx.appcompat.widget.v0 r1 = androidx.appcompat.widget.v0.t(r3, r8, r4, r9, r1)
            int r3 = f.j.E2
            r4 = -2
            int r3 = r1.l(r3, r4)
            r6.f1350p = r3
            int r3 = f.j.C2
            android.graphics.drawable.Drawable r3 = r1.f(r3)
            r10.i(r3)
            int r3 = f.j.D2
            java.lang.String r3 = r0.n(r3)
            r10.h(r3)
            r1.u()
            r6.f1349o = r10
            androidx.appcompat.widget.v$a r1 = new androidx.appcompat.widget.v$a
            r1.<init>(r6, r10)
            r6.f1346l = r1
            goto Laf
        L9f:
            androidx.appcompat.widget.v$c r10 = new androidx.appcompat.widget.v$c
            r10.<init>()
            r6.f1349o = r10
            int r1 = f.j.D2
            java.lang.String r1 = r0.n(r1)
            r10.h(r1)
        Laf:
            int r10 = f.j.B2
            java.lang.CharSequence[] r10 = r0.p(r10)
            if (r10 == 0) goto Lc7
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = f.g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lc7:
            r0.u()
            r6.f1348n = r11
            android.widget.SpinnerAdapter r7 = r6.f1347m
            if (r7 == 0) goto Ld5
            r6.setAdapter(r7)
            r6.f1347m = r2
        Ld5:
            androidx.appcompat.widget.e r7 = r6.f1344j
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1351q);
            Rect rect = this.f1351q;
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    void b() {
        this.f1349o.m(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1344j;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f1349o;
        return gVar != null ? gVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f1349o;
        return gVar != null ? gVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1349o != null ? this.f1350p : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f1349o;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f1349o;
        return gVar != null ? gVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1345k;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f1349o;
        return gVar != null ? gVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1344j;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1344j;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f1349o;
        if (gVar == null || !gVar.c()) {
            return;
        }
        this.f1349o.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1349o == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f1366j || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f1349o;
        fVar.f1366j = gVar != null && gVar.c();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var = this.f1346l;
        if (g0Var == null || !g0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f1349o;
        if (gVar != null) {
            if (gVar.c()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1348n) {
            this.f1347m = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1349o != null) {
            Context context = this.f1345k;
            if (context == null) {
                context = getContext();
            }
            this.f1349o.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1344j;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1344j;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f1349o;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
            return;
        }
        gVar.k(i10);
        this.f1349o.l(i10);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f1349o;
        if (gVar != null) {
            gVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1349o != null) {
            this.f1350p = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f1349o;
        if (gVar != null) {
            gVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(h.a.d(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f1349o;
        if (gVar != null) {
            gVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1344j;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1344j;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
