package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final k<?> f2286a;

    private i(k<?> kVar) {
        this.f2286a = kVar;
    }

    public static i b(k<?> kVar) {
        return new i((k) androidx.core.util.d.d(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.f2286a;
        kVar.f2292n.k(kVar, kVar, fragment);
    }

    public void c() {
        this.f2286a.f2292n.z();
    }

    public void d(Configuration configuration) {
        this.f2286a.f2292n.B(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f2286a.f2292n.C(menuItem);
    }

    public void f() {
        this.f2286a.f2292n.D();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f2286a.f2292n.E(menu, menuInflater);
    }

    public void h() {
        this.f2286a.f2292n.F();
    }

    public void i() {
        this.f2286a.f2292n.H();
    }

    public void j(boolean z10) {
        this.f2286a.f2292n.I(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f2286a.f2292n.K(menuItem);
    }

    public void l(Menu menu) {
        this.f2286a.f2292n.L(menu);
    }

    public void m() {
        this.f2286a.f2292n.N();
    }

    public void n(boolean z10) {
        this.f2286a.f2292n.O(z10);
    }

    public boolean o(Menu menu) {
        return this.f2286a.f2292n.P(menu);
    }

    public void p() {
        this.f2286a.f2292n.R();
    }

    public void q() {
        this.f2286a.f2292n.S();
    }

    public void r() {
        this.f2286a.f2292n.U();
    }

    public boolean s() {
        return this.f2286a.f2292n.b0(true);
    }

    public n t() {
        return this.f2286a.f2292n;
    }

    public void u() {
        this.f2286a.f2292n.R0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2286a.f2292n.v0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.f2286a;
        if (!(kVar instanceof androidx.lifecycle.b0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        kVar.f2292n.d1(parcelable);
    }

    public Parcelable x() {
        return this.f2286a.f2292n.f1();
    }
}
