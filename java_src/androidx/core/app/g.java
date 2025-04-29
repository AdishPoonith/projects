package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.e;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public class g extends Activity implements androidx.lifecycle.i, e.a {

    /* renamed from: j  reason: collision with root package name */
    private s.g<Class<Object>, Object> f1532j = new s.g<>();

    /* renamed from: k  reason: collision with root package name */
    private androidx.lifecycle.j f1533k = new androidx.lifecycle.j(this);

    public androidx.lifecycle.e a() {
        return this.f1533k;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.e.d(decorView, keyEvent)) {
            return androidx.core.view.e.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.e.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.view.e.a
    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.q.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f1533k.j(e.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
