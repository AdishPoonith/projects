package g;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import androidx.core.view.e;
import k.b;
/* loaded from: classes.dex */
public class b extends Dialog implements g.a {

    /* renamed from: j  reason: collision with root package name */
    private d f8879j;

    /* renamed from: k  reason: collision with root package name */
    private final e.a f8880k;

    /* loaded from: classes.dex */
    class a implements e.a {
        a() {
        }

        @Override // androidx.core.view.e.a
        public boolean f(KeyEvent keyEvent) {
            return b.this.c(keyEvent);
        }
    }

    public b(Context context, int i10) {
        super(context, b(context, i10));
        this.f8880k = new a();
        d a10 = a();
        a10.C(b(context, i10));
        a10.q(null);
    }

    private static int b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(f.a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    public d a() {
        if (this.f8879j == null) {
            this.f8879j = d.f(this, this);
        }
        return this.f8879j;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i10) {
        return a().y(i10);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.e(this.f8880k, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // g.a
    public void e(k.b bVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) a().g(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().m();
    }

    @Override // g.a
    public k.b k(b.a aVar) {
        return null;
    }

    @Override // g.a
    public void o(k.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        a().z(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().A(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().B(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().D(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().D(charSequence);
    }
}
