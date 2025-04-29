package d9;

import android.util.Log;
import i8.a;
/* loaded from: classes.dex */
public final class i implements i8.a, j8.a {

    /* renamed from: j  reason: collision with root package name */
    private h f7955j;

    @Override // i8.a
    public void d(a.b bVar) {
        if (this.f7955j == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        f.f(bVar.b(), null);
        this.f7955j = null;
    }

    @Override // j8.a
    public void e(j8.c cVar) {
        f(cVar);
    }

    @Override // j8.a
    public void f(j8.c cVar) {
        h hVar = this.f7955j;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.i(cVar.d());
        }
    }

    @Override // j8.a
    public void g() {
        h hVar = this.f7955j;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.i(null);
        }
    }

    @Override // j8.a
    public void j() {
        g();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        this.f7955j = new h(bVar.a());
        f.f(bVar.b(), this.f7955j);
    }
}
