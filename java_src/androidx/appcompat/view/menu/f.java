package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: j  reason: collision with root package name */
    private e f893j;

    /* renamed from: k  reason: collision with root package name */
    private androidx.appcompat.app.b f894k;

    /* renamed from: l  reason: collision with root package name */
    c f895l;

    /* renamed from: m  reason: collision with root package name */
    private j.a f896m;

    public f(e eVar) {
        this.f893j = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f894k;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f893j) {
            a();
        }
        j.a aVar = this.f896m;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f896m;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f893j;
        b.a aVar = new b.a(eVar.u());
        c cVar = new c(aVar.b(), f.g.abc_list_menu_item_layout);
        this.f895l = cVar;
        cVar.k(this);
        this.f893j.b(this.f895l);
        aVar.c(this.f895l.a(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            aVar.d(y10);
        } else {
            aVar.e(eVar.w()).h(eVar.x());
        }
        aVar.f(this);
        androidx.appcompat.app.b a10 = aVar.a();
        this.f894k = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f894k.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f894k.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f893j.L((g) this.f895l.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f895l.b(this.f893j, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f894k.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f894k.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f893j.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f893j.performShortcut(i10, keyEvent, 0);
    }
}
