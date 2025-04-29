package p1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p1.u;
/* loaded from: classes.dex */
public class y extends Fragment {

    /* renamed from: o0  reason: collision with root package name */
    public static final a f15272o0 = new a(null);

    /* renamed from: j0  reason: collision with root package name */
    private String f15273j0;

    /* renamed from: k0  reason: collision with root package name */
    private u.e f15274k0;

    /* renamed from: l0  reason: collision with root package name */
    private u f15275l0;

    /* renamed from: m0  reason: collision with root package name */
    private androidx.activity.result.c<Intent> f15276m0;

    /* renamed from: n0  reason: collision with root package name */
    private View f15277n0;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.m implements da.l<androidx.activity.result.a, s9.u> {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f15279k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.fragment.app.e eVar) {
            super(1);
            this.f15279k = eVar;
        }

        public final void a(androidx.activity.result.a result) {
            kotlin.jvm.internal.l.e(result, "result");
            if (result.b() == -1) {
                y.this.P1().G(u.f15222v.b(), result.b(), result.a());
            } else {
                this.f15279k.finish();
            }
        }

        @Override // da.l
        public /* bridge */ /* synthetic */ s9.u invoke(androidx.activity.result.a aVar) {
            a(aVar);
            return s9.u.f17878a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements u.a {
        c() {
        }

        @Override // p1.u.a
        public void a() {
            y.this.Y1();
        }

        @Override // p1.u.a
        public void b() {
            y.this.R1();
        }
    }

    private final da.l<androidx.activity.result.a, s9.u> Q1(androidx.fragment.app.e eVar) {
        return new b(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1() {
        View view = this.f15277n0;
        if (view == null) {
            kotlin.jvm.internal.l.p("progressBar");
            throw null;
        }
        view.setVisibility(8);
        W1();
    }

    private final void S1(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f15273j0 = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T1(y this$0, u.f outcome) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(outcome, "outcome");
        this$0.V1(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(da.l tmp0, androidx.activity.result.a aVar) {
        kotlin.jvm.internal.l.e(tmp0, "$tmp0");
        tmp0.invoke(aVar);
    }

    private final void V1(u.f fVar) {
        this.f15274k0 = null;
        int i10 = fVar.f15253j == u.f.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", fVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        androidx.fragment.app.e n10 = n();
        if (!X() || n10 == null) {
            return;
        }
        n10.setResult(i10, intent);
        n10.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1() {
        View view = this.f15277n0;
        if (view == null) {
            kotlin.jvm.internal.l.p("progressBar");
            throw null;
        }
        view.setVisibility(0);
        X1();
    }

    @Override // androidx.fragment.app.Fragment
    public void D0() {
        super.D0();
        View S = S();
        View findViewById = S == null ? null : S.findViewById(d1.b.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I0() {
        super.I0();
        if (this.f15273j0 != null) {
            P1().K(this.f15274k0);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        androidx.fragment.app.e n10 = n();
        if (n10 == null) {
            return;
        }
        n10.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void J0(Bundle outState) {
        kotlin.jvm.internal.l.e(outState, "outState");
        super.J0(outState);
        outState.putParcelable("loginClient", P1());
    }

    protected u M1() {
        return new u(this);
    }

    public final androidx.activity.result.c<Intent> N1() {
        androidx.activity.result.c<Intent> cVar = this.f15276m0;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.l.p("launcher");
        throw null;
    }

    protected int O1() {
        return d1.c.com_facebook_login_fragment;
    }

    public final u P1() {
        u uVar = this.f15275l0;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.l.p("loginClient");
        throw null;
    }

    protected void W1() {
    }

    protected void X1() {
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(int i10, int i11, Intent intent) {
        super.i0(i10, i11, intent);
        P1().G(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void n0(Bundle bundle) {
        Bundle bundleExtra;
        super.n0(bundle);
        u uVar = bundle == null ? null : (u) bundle.getParcelable("loginClient");
        if (uVar != null) {
            uVar.I(this);
        } else {
            uVar = M1();
        }
        this.f15275l0 = uVar;
        P1().J(new u.d() { // from class: p1.x
            @Override // p1.u.d
            public final void a(u.f fVar) {
                y.T1(y.this, fVar);
            }
        });
        androidx.fragment.app.e n10 = n();
        if (n10 == null) {
            return;
        }
        S1(n10);
        Intent intent = n10.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f15274k0 = (u.e) bundleExtra.getParcelable("request");
        }
        e.f fVar = new e.f();
        final da.l<androidx.activity.result.a, s9.u> Q1 = Q1(n10);
        androidx.activity.result.c<Intent> n12 = n1(fVar, new androidx.activity.result.b() { // from class: p1.w
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                y.U1(da.l.this, (androidx.activity.result.a) obj);
            }
        });
        kotlin.jvm.internal.l.d(n12, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f15276m0 = n12;
    }

    @Override // androidx.fragment.app.Fragment
    public View r0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        View inflate = inflater.inflate(O1(), viewGroup, false);
        View findViewById = inflate.findViewById(d1.b.com_facebook_login_fragment_progress_bar);
        kotlin.jvm.internal.l.d(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f15277n0 = findViewById;
        P1().H(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void s0() {
        P1().c();
        super.s0();
    }
}
