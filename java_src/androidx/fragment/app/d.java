package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: j0  reason: collision with root package name */
    private Handler f2240j0;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f2249s0;

    /* renamed from: u0  reason: collision with root package name */
    private Dialog f2251u0;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f2252v0;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f2253w0;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f2254x0;

    /* renamed from: k0  reason: collision with root package name */
    private Runnable f2241k0 = new a();

    /* renamed from: l0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f2242l0 = new b();

    /* renamed from: m0  reason: collision with root package name */
    private DialogInterface.OnDismissListener f2243m0 = new c();

    /* renamed from: n0  reason: collision with root package name */
    private int f2244n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    private int f2245o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f2246p0 = true;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f2247q0 = true;

    /* renamed from: r0  reason: collision with root package name */
    private int f2248r0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    private androidx.lifecycle.o<androidx.lifecycle.i> f2250t0 = new C0036d();

    /* renamed from: y0  reason: collision with root package name */
    private boolean f2255y0 = false;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f2243m0.onDismiss(d.this.f2251u0);
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.f2251u0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.f2251u0);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.f2251u0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.f2251u0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0036d implements androidx.lifecycle.o<androidx.lifecycle.i> {
        C0036d() {
        }

        @Override // androidx.lifecycle.o
        /* renamed from: b */
        public void a(androidx.lifecycle.i iVar) {
            if (iVar == null || !d.this.f2247q0) {
                return;
            }
            View r12 = d.this.r1();
            if (r12.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (d.this.f2251u0 != null) {
                if (n.F0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.f2251u0);
                }
                d.this.f2251u0.setContentView(r12);
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f2260a;

        e(g gVar) {
            this.f2260a = gVar;
        }

        @Override // androidx.fragment.app.g
        public View d(int i10) {
            View P1 = d.this.P1(i10);
            if (P1 != null) {
                return P1;
            }
            if (this.f2260a.e()) {
                return this.f2260a.d(i10);
            }
            return null;
        }

        @Override // androidx.fragment.app.g
        public boolean e() {
            return d.this.Q1() || this.f2260a.e();
        }
    }

    private void L1(boolean z10, boolean z11) {
        if (this.f2253w0) {
            return;
        }
        this.f2253w0 = true;
        this.f2254x0 = false;
        Dialog dialog = this.f2251u0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2251u0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f2240j0.getLooper()) {
                    onDismiss(this.f2251u0);
                } else {
                    this.f2240j0.post(this.f2241k0);
                }
            }
        }
        this.f2252v0 = true;
        if (this.f2248r0 >= 0) {
            G().T0(this.f2248r0, 1);
            this.f2248r0 = -1;
            return;
        }
        w m10 = G().m();
        m10.k(this);
        if (z10) {
            m10.g();
        } else {
            m10.f();
        }
    }

    private void R1(Bundle bundle) {
        if (this.f2247q0 && !this.f2255y0) {
            try {
                this.f2249s0 = true;
                Dialog O1 = O1(bundle);
                this.f2251u0 = O1;
                if (this.f2247q0) {
                    T1(O1, this.f2244n0);
                    Context u10 = u();
                    if (u10 instanceof Activity) {
                        this.f2251u0.setOwnerActivity((Activity) u10);
                    }
                    this.f2251u0.setCancelable(this.f2246p0);
                    this.f2251u0.setOnCancelListener(this.f2242l0);
                    this.f2251u0.setOnDismissListener(this.f2243m0);
                    this.f2255y0 = true;
                } else {
                    this.f2251u0 = null;
                }
            } finally {
                this.f2249s0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        Dialog dialog = this.f2251u0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f2244n0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2245o0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2246p0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2247q0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2248r0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void K0() {
        super.K0();
        Dialog dialog = this.f2251u0;
        if (dialog != null) {
            this.f2252v0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void L0() {
        super.L0();
        Dialog dialog = this.f2251u0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog M1() {
        return this.f2251u0;
    }

    @Override // androidx.fragment.app.Fragment
    public void N0(Bundle bundle) {
        Bundle bundle2;
        super.N0(bundle);
        if (this.f2251u0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2251u0.onRestoreInstanceState(bundle2);
    }

    public int N1() {
        return this.f2245o0;
    }

    public Dialog O1(Bundle bundle) {
        if (n.F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(q1(), N1());
    }

    View P1(int i10) {
        Dialog dialog = this.f2251u0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean Q1() {
        return this.f2255y0;
    }

    public void S1(boolean z10) {
        this.f2247q0 = z10;
    }

    public void T1(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public void U0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.U0(layoutInflater, viewGroup, bundle);
        if (this.Q != null || this.f2251u0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2251u0.onRestoreInstanceState(bundle2);
    }

    public void U1(n nVar, String str) {
        this.f2253w0 = false;
        this.f2254x0 = true;
        w m10 = nVar.m();
        m10.d(this, str);
        m10.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public g f() {
        return new e(super.f());
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(Context context) {
        super.k0(context);
        T().i(this.f2250t0);
        if (this.f2254x0) {
            return;
        }
        this.f2253w0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void n0(Bundle bundle) {
        super.n0(bundle);
        this.f2240j0 = new Handler();
        this.f2247q0 = this.G == 0;
        if (bundle != null) {
            this.f2244n0 = bundle.getInt("android:style", 0);
            this.f2245o0 = bundle.getInt("android:theme", 0);
            this.f2246p0 = bundle.getBoolean("android:cancelable", true);
            this.f2247q0 = bundle.getBoolean("android:showsDialog", this.f2247q0);
            this.f2248r0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2252v0) {
            return;
        }
        if (n.F0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        L1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void u0() {
        super.u0();
        Dialog dialog = this.f2251u0;
        if (dialog != null) {
            this.f2252v0 = true;
            dialog.setOnDismissListener(null);
            this.f2251u0.dismiss();
            if (!this.f2253w0) {
                onDismiss(this.f2251u0);
            }
            this.f2251u0 = null;
            this.f2255y0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void v0() {
        super.v0();
        if (!this.f2254x0 && !this.f2253w0) {
            this.f2253w0 = true;
        }
        T().m(this.f2250t0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater w0(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater w02 = super.w0(bundle);
        if (this.f2247q0 && !this.f2249s0) {
            R1(bundle);
            if (n.F0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2251u0;
            return dialog != null ? w02.cloneInContext(dialog.getContext()) : w02;
        }
        if (n.F0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f2247q0) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return w02;
    }
}
