package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.h0;
import androidx.core.view.t;
import androidx.core.widget.NestedScrollView;
import f.j;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a  reason: collision with root package name */
    private final Context f564a;

    /* renamed from: b  reason: collision with root package name */
    final g.b f565b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f566c;

    /* renamed from: d  reason: collision with root package name */
    private final int f567d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f568e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f569f;

    /* renamed from: g  reason: collision with root package name */
    ListView f570g;

    /* renamed from: h  reason: collision with root package name */
    private View f571h;

    /* renamed from: i  reason: collision with root package name */
    private int f572i;

    /* renamed from: j  reason: collision with root package name */
    private int f573j;

    /* renamed from: k  reason: collision with root package name */
    private int f574k;

    /* renamed from: l  reason: collision with root package name */
    private int f575l;

    /* renamed from: m  reason: collision with root package name */
    private int f576m;

    /* renamed from: o  reason: collision with root package name */
    Button f578o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f579p;

    /* renamed from: q  reason: collision with root package name */
    Message f580q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f581r;

    /* renamed from: s  reason: collision with root package name */
    Button f582s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f583t;

    /* renamed from: u  reason: collision with root package name */
    Message f584u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f585v;

    /* renamed from: w  reason: collision with root package name */
    Button f586w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f587x;

    /* renamed from: y  reason: collision with root package name */
    Message f588y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f589z;

    /* renamed from: n  reason: collision with root package name */
    private boolean f577n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: j  reason: collision with root package name */
        private final int f590j;

        /* renamed from: k  reason: collision with root package name */
        private final int f591k;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8259f2);
            this.f591k = obtainStyledAttributes.getDimensionPixelOffset(j.f8264g2, -1);
            this.f590j = obtainStyledAttributes.getDimensionPixelOffset(j.f8269h2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f590j, getPaddingRight(), z11 ? getPaddingBottom() : this.f591k);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f578o || (message2 = alertController.f580q) == null) && (view != alertController.f582s || (message2 = alertController.f584u) == null)) ? (view != alertController.f586w || (message = alertController.f588y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f565b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f594b;

        b(View view, View view2) {
            this.f593a = view;
            this.f594b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.f(nestedScrollView, this.f593a, this.f594b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View f596j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ View f597k;

        c(View view, View view2) {
            this.f596j = view;
            this.f597k = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f596j, this.f597k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f600b;

        d(View view, View view2) {
            this.f599a = view;
            this.f600b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.f(absListView, this.f599a, this.f600b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View f602j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ View f603k;

        e(View view, View view2) {
            this.f602j = view;
            this.f603k = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f570g, this.f602j, this.f603k);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f605a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f606b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f608d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f610f;

        /* renamed from: g  reason: collision with root package name */
        public View f611g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f612h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f613i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f614j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f615k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f616l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f617m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f618n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f619o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f620p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f621q;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f623s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f624t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f625u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f626v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f627w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f628x;

        /* renamed from: y  reason: collision with root package name */
        public int f629y;

        /* renamed from: z  reason: collision with root package name */
        public View f630z;

        /* renamed from: c  reason: collision with root package name */
        public int f607c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f609e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r  reason: collision with root package name */
        public boolean f622r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ RecycleListView f631j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f631j = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f631j.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: j  reason: collision with root package name */
            private final int f633j;

            /* renamed from: k  reason: collision with root package name */
            private final int f634k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ RecycleListView f635l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ AlertController f636m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f635l = recycleListView;
                this.f636m = alertController;
                Cursor cursor2 = getCursor();
                this.f633j = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f634k = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f633j));
                this.f635l.setItemChecked(cursor.getPosition(), cursor.getInt(this.f634k) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f606b.inflate(this.f636m.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ AlertController f638j;

            c(AlertController alertController) {
                this.f638j = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f628x.onClick(this.f638j.f565b, i10);
                if (f.this.H) {
                    return;
                }
                this.f638j.f565b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ RecycleListView f640j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ AlertController f641k;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f640j = recycleListView;
                this.f641k = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f640j.isItemChecked(i10);
                }
                f.this.J.onClick(this.f641k.f565b, i10, this.f640j.isItemChecked(i10));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f605a = context;
            this.f606b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f606b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f605a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f626v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f605a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f605a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f627w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f605a
                java.lang.CharSequence[] r3 = r10.f626v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f628x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f570g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f611g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f610f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f608d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f607c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f609e;
                if (i11 != 0) {
                    alertController.m(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f612h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f613i;
            if (charSequence3 != null || this.f614j != null) {
                alertController.k(-1, charSequence3, this.f615k, null, this.f614j);
            }
            CharSequence charSequence4 = this.f616l;
            if (charSequence4 != null || this.f617m != null) {
                alertController.k(-2, charSequence4, this.f618n, null, this.f617m);
            }
            CharSequence charSequence5 = this.f619o;
            if (charSequence5 != null || this.f620p != null) {
                alertController.k(-3, charSequence5, this.f621q, null, this.f620p);
            }
            if (this.f626v != null || this.K != null || this.f627w != null) {
                b(alertController);
            }
            View view2 = this.f630z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i12 = this.f629y;
            if (i12 != 0) {
                alertController.r(i12);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f643a;

        public g(DialogInterface dialogInterface) {
            this.f643a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f643a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, g.b bVar, Window window) {
        this.f564a = context;
        this.f565b = bVar;
        this.f566c = window;
        this.R = new g(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.F, f.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(j.M, true);
        this.f567d = obtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        obtainStyledAttributes.recycle();
        bVar.d(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f566c.findViewById(f.f.scrollIndicatorUp);
        View findViewById2 = this.f566c.findViewById(f.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            t.L(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i10 & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i10 & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f569f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f570g;
            if (listView != null) {
                listView.setOnScrollListener(new d(findViewById, findViewById2));
                this.f570g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f578o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f579p) && this.f581r == null) {
            this.f578o.setVisibility(8);
            z10 = false;
        } else {
            this.f578o.setText(this.f579p);
            Drawable drawable = this.f581r;
            if (drawable != null) {
                int i10 = this.f567d;
                drawable.setBounds(0, 0, i10, i10);
                this.f578o.setCompoundDrawables(this.f581r, null, null, null);
            }
            this.f578o.setVisibility(0);
            z10 = true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f582s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f583t) && this.f585v == null) {
            this.f582s.setVisibility(8);
        } else {
            this.f582s.setText(this.f583t);
            Drawable drawable2 = this.f585v;
            if (drawable2 != null) {
                int i11 = this.f567d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f582s.setCompoundDrawables(this.f585v, null, null, null);
            }
            this.f582s.setVisibility(0);
            z10 |= true;
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f586w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f587x) && this.f589z == null) {
            this.f586w.setVisibility(8);
        } else {
            this.f586w.setText(this.f587x);
            Drawable drawable3 = this.f581r;
            if (drawable3 != null) {
                int i12 = this.f567d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f578o.setCompoundDrawables(this.f581r, null, null, null);
            }
            this.f586w.setVisibility(0);
            z10 |= true;
        }
        if (z(this.f564a)) {
            if (z10) {
                button = this.f578o;
            } else if (z10) {
                button = this.f582s;
            } else if (z10) {
                button = this.f586w;
            }
            b(button);
        }
        if (z10) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f566c.findViewById(f.f.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f569f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f570g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f570g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f571h;
        if (view == null) {
            view = this.f572i != 0 ? LayoutInflater.from(this.f564a).inflate(this.f572i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f566c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f566c.findViewById(f.f.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f577n) {
            frameLayout.setPadding(this.f573j, this.f574k, this.f575l, this.f576m);
        }
        if (this.f570g != null) {
            ((h0.a) viewGroup.getLayoutParams()).f1202a = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f566c.findViewById(f.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f566c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f568e)) || !this.P) {
            this.f566c.findViewById(f.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f566c.findViewById(f.f.alertTitle);
        this.E = textView;
        textView.setText(this.f568e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f566c.findViewById(f.f.parentPanel);
        int i10 = f.f.topPanel;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = f.f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = f.f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(f.f.customPanel);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup i13 = i(findViewById7, findViewById4);
        ViewGroup i14 = i(findViewById8, findViewById5);
        ViewGroup i15 = i(findViewById9, findViewById6);
        v(i14);
        u(i15);
        x(i13);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (i13 == null || i13.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (i15 == null || i15.getVisibility() == 8) ? false : true;
        if (!z12 && i14 != null && (findViewById2 = i14.findViewById(f.f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f569f != null || this.f570g != null) {
                view = i13.findViewById(f.f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (i14 != null && (findViewById = i14.findViewById(f.f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f570g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f570g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                p(i14, view2, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f570g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i16 = this.I;
        if (i16 > -1) {
            listView2.setItemChecked(i16, true);
            listView2.setSelection(i16);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f564a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f570g;
    }

    public void e() {
        this.f565b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f587x = charSequence;
            this.f588y = message;
            this.f589z = drawable;
        } else if (i10 == -2) {
            this.f583t = charSequence;
            this.f584u = message;
            this.f585v = drawable;
        } else if (i10 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f579p = charSequence;
            this.f580q = message;
            this.f581r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
        }
    }

    public void o(CharSequence charSequence) {
        this.f569f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f568e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f571h = null;
        this.f572i = i10;
        this.f577n = false;
    }

    public void s(View view) {
        this.f571h = view;
        this.f572i = 0;
        this.f577n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f571h = view;
        this.f572i = 0;
        this.f577n = true;
        this.f573j = i10;
        this.f574k = i11;
        this.f575l = i12;
        this.f576m = i13;
    }
}
