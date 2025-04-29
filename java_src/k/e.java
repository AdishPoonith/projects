package k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.b;
/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: l  reason: collision with root package name */
    private Context f12432l;

    /* renamed from: m  reason: collision with root package name */
    private ActionBarContextView f12433m;

    /* renamed from: n  reason: collision with root package name */
    private b.a f12434n;

    /* renamed from: o  reason: collision with root package name */
    private WeakReference<View> f12435o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12436p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12437q;

    /* renamed from: r  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f12438r;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f12432l = context;
        this.f12433m = actionBarContextView;
        this.f12434n = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f12438r = S;
        S.R(this);
        this.f12437q = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f12434n.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f12433m.l();
    }

    @Override // k.b
    public void c() {
        if (this.f12436p) {
            return;
        }
        this.f12436p = true;
        this.f12433m.sendAccessibilityEvent(32);
        this.f12434n.d(this);
    }

    @Override // k.b
    public View d() {
        WeakReference<View> weakReference = this.f12435o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // k.b
    public Menu e() {
        return this.f12438r;
    }

    @Override // k.b
    public MenuInflater f() {
        return new g(this.f12433m.getContext());
    }

    @Override // k.b
    public CharSequence g() {
        return this.f12433m.getSubtitle();
    }

    @Override // k.b
    public CharSequence i() {
        return this.f12433m.getTitle();
    }

    @Override // k.b
    public void k() {
        this.f12434n.c(this, this.f12438r);
    }

    @Override // k.b
    public boolean l() {
        return this.f12433m.j();
    }

    @Override // k.b
    public void m(View view) {
        this.f12433m.setCustomView(view);
        this.f12435o = view != null ? new WeakReference<>(view) : null;
    }

    @Override // k.b
    public void n(int i10) {
        o(this.f12432l.getString(i10));
    }

    @Override // k.b
    public void o(CharSequence charSequence) {
        this.f12433m.setSubtitle(charSequence);
    }

    @Override // k.b
    public void q(int i10) {
        r(this.f12432l.getString(i10));
    }

    @Override // k.b
    public void r(CharSequence charSequence) {
        this.f12433m.setTitle(charSequence);
    }

    @Override // k.b
    public void s(boolean z10) {
        super.s(z10);
        this.f12433m.setTitleOptional(z10);
    }
}
