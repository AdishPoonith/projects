package c4;

import android.app.PendingIntent;
import android.os.Bundle;
/* loaded from: classes.dex */
abstract class v0 extends d1 {

    /* renamed from: d  reason: collision with root package name */
    public final int f3405d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f3406e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f3407f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f3407f = cVar;
        this.f3405d = i10;
        this.f3406e = bundle;
    }

    @Override // c4.d1
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        b4.b bVar;
        if (this.f3405d != 0) {
            this.f3407f.g0(1, null);
            Bundle bundle = this.f3406e;
            bVar = new b4.b(this.f3405d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else if (g()) {
            return;
        } else {
            this.f3407f.g0(1, null);
            bVar = new b4.b(8, null);
        }
        f(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.d1
    public final void b() {
    }

    protected abstract void f(b4.b bVar);

    protected abstract boolean g();
}
