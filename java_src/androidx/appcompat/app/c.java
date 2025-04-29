package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.a1;
import androidx.core.app.s;
import k.b;
/* loaded from: classes.dex */
public class c extends androidx.fragment.app.e implements g.a, s.a {
    private d I;
    private Resources J;

    private boolean V(int i10, KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.fragment.app.e
    public void N() {
        O().m();
    }

    public d O() {
        if (this.I == null) {
            this.I = d.e(this, this);
        }
        return this.I;
    }

    public a P() {
        return O().k();
    }

    public void Q(s sVar) {
        sVar.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void R(int i10) {
    }

    public void S(s sVar) {
    }

    @Deprecated
    public void T() {
    }

    public boolean U() {
        Intent n10 = n();
        if (n10 != null) {
            if (!X(n10)) {
                W(n10);
                return true;
            }
            s l10 = s.l(this);
            Q(l10);
            S(l10);
            l10.m();
            try {
                androidx.core.app.b.k(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    public void W(Intent intent) {
        androidx.core.app.i.e(this, intent);
    }

    public boolean X(Intent intent) {
        return androidx.core.app.i.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        O().d(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a P = P();
        if (getWindow().hasFeature(0)) {
            if (P == null || !P.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a P = P();
        if (keyCode == 82 && P != null && P.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // g.a
    public void e(k.b bVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) O().g(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return O().j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.J == null && a1.b()) {
            this.J = new a1(this, super.getResources());
        }
        Resources resources = this.J;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        O().m();
    }

    @Override // g.a
    public k.b k(b.a aVar) {
        return null;
    }

    @Override // androidx.core.app.s.a
    public Intent n() {
        return androidx.core.app.i.a(this);
    }

    @Override // g.a
    public void o(k.b bVar) {
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.J != null) {
            this.J.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        O().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        d O = O();
        O.l();
        O.q(bundle);
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        O().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (V(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a P = P();
        if (menuItem.getItemId() != 16908332 || P == null || (P.j() & 4) == 0) {
            return false;
        }
        return U();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        O().s(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        O().t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        O().u(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onStart() {
        super.onStart();
        O().v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onStop() {
        super.onStop();
        O().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        O().D(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a P = P();
        if (getWindow().hasFeature(0)) {
            if (P == null || !P.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        O().z(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        O().A(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O().B(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        O().C(i10);
    }
}
