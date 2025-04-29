package a8;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import q.e;
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: k  reason: collision with root package name */
    private final WeakReference<d> f352k;

    public c(d dVar) {
        this.f352k = new WeakReference<>(dVar);
    }

    @Override // q.e
    public void a(ComponentName componentName, q.c cVar) {
        d dVar = this.f352k.get();
        if (dVar != null) {
            dVar.b(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f352k.get();
        if (dVar != null) {
            dVar.a();
        }
    }
}
