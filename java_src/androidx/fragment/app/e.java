package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.b;
import androidx.lifecycle.e;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class e extends ComponentActivity implements b.f, b.h {
    boolean F;
    boolean G;
    final i D = i.b(new c());
    final androidx.lifecycle.j E = new androidx.lifecycle.j(this);
    boolean H = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.I();
            e.this.E.h(e.a.ON_STOP);
            Parcelable x10 = e.this.D.x();
            if (x10 != null) {
                bundle.putParcelable("android:support:fragments", x10);
            }
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements d.b {
        b() {
        }

        @Override // d.b
        public void a(Context context) {
            e.this.D.a(null);
            Bundle b10 = e.this.j().b("android:support:fragments");
            if (b10 != null) {
                e.this.D.w(b10.getParcelable("android:support:fragments"));
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends k<e> implements androidx.lifecycle.b0, androidx.activity.l, androidx.activity.result.d, r {
        public c() {
            super(e.this);
        }

        @Override // androidx.lifecycle.i
        public androidx.lifecycle.e a() {
            return e.this.E;
        }

        @Override // androidx.fragment.app.r
        public void b(n nVar, Fragment fragment) {
            e.this.K(fragment);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public View d(int i10) {
            return e.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public boolean e() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.l
        public OnBackPressedDispatcher i() {
            return e.this.i();
        }

        @Override // androidx.fragment.app.k
        public LayoutInflater l() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry m() {
            return e.this.m();
        }

        @Override // androidx.fragment.app.k
        public boolean n(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.lifecycle.b0
        public androidx.lifecycle.a0 p() {
            return e.this.p();
        }

        @Override // androidx.fragment.app.k
        public void q() {
            e.this.N();
        }

        @Override // androidx.fragment.app.k
        /* renamed from: r */
        public e k() {
            return e.this;
        }
    }

    public e() {
        H();
    }

    private void H() {
        j().h("android:support:fragments", new a());
        v(new b());
    }

    private static boolean J(n nVar, e.b bVar) {
        boolean z10 = false;
        for (Fragment fragment : nVar.t0()) {
            if (fragment != null) {
                if (fragment.A() != null) {
                    z10 |= J(fragment.t(), bVar);
                }
                a0 a0Var = fragment.f2088c0;
                if (a0Var != null && a0Var.a().b().g(e.b.STARTED)) {
                    fragment.f2088c0.g(bVar);
                    z10 = true;
                }
                if (fragment.f2087b0.b().g(e.b.STARTED)) {
                    fragment.f2087b0.n(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    final View E(View view, String str, Context context, AttributeSet attributeSet) {
        return this.D.v(view, str, context, attributeSet);
    }

    public n F() {
        return this.D.t();
    }

    @Deprecated
    public androidx.loader.app.a G() {
        return androidx.loader.app.a.b(this);
    }

    void I() {
        do {
        } while (J(F(), e.b.CREATED));
    }

    @Deprecated
    public void K(Fragment fragment) {
    }

    @Deprecated
    protected boolean L(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void M() {
        this.E.h(e.a.ON_RESUME);
        this.D.p();
    }

    @Deprecated
    public void N() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.b.h
    @Deprecated
    public final void b(int i10) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.F);
        printWriter.print(" mResumed=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.D.t().X(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.D.u();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.D.u();
        this.D.d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E.h(e.a.ON_CREATE);
        this.D.f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return i10 == 0 ? super.onCreatePanelMenu(i10, menu) | this.D.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View E = E(view, str, context, attributeSet);
        return E == null ? super.onCreateView(view, str, context, attributeSet) : E;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View E = E(null, str, context, attributeSet);
        return E == null ? super.onCreateView(str, context, attributeSet) : E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.D.h();
        this.E.h(e.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.D.i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            if (i10 != 6) {
                return false;
            }
            return this.D.e(menuItem);
        }
        return this.D.k(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.D.j(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.D.u();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.D.l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.G = false;
        this.D.m();
        this.E.h(e.a.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.D.n(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        M();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return i10 == 0 ? L(view, menu) | this.D.o(menu) : super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.D.u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.G = true;
        this.D.u();
        this.D.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.H = false;
        if (!this.F) {
            this.F = true;
            this.D.c();
        }
        this.D.u();
        this.D.s();
        this.E.h(e.a.ON_START);
        this.D.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.D.u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.H = true;
        I();
        this.D.r();
        this.E.h(e.a.ON_STOP);
    }
}
