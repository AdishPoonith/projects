package l0;

import android.util.Log;
import i8.a;
/* loaded from: classes.dex */
public final class b implements i8.a {

    /* renamed from: j  reason: collision with root package name */
    private c f13037j;

    /* renamed from: k  reason: collision with root package name */
    private a f13038k;

    @Override // i8.a
    public void d(a.b bVar) {
        c cVar = this.f13037j;
        if (cVar == null) {
            Log.wtf("GeocodingPlugin", "Already detached from the engine.");
            return;
        }
        cVar.d();
        this.f13037j = null;
        this.f13038k = null;
    }

    @Override // i8.a
    public void m(a.b bVar) {
        a aVar = new a(bVar.a());
        this.f13038k = aVar;
        c cVar = new c(aVar);
        this.f13037j = cVar;
        cVar.c(bVar.b());
    }
}
