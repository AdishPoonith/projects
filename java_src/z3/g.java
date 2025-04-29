package z3;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class g extends d0.a implements com.google.android.gms.common.api.internal.r {

    /* renamed from: p  reason: collision with root package name */
    private final Semaphore f20869p;

    /* renamed from: q  reason: collision with root package name */
    private final Set f20870q;

    public g(Context context, Set set) {
        super(context);
        this.f20869p = new Semaphore(0);
        this.f20870q = set;
    }

    @Override // d0.a
    public final /* bridge */ /* synthetic */ Object A() {
        int i10 = 0;
        for (com.google.android.gms.common.api.f fVar : this.f20870q) {
            if (fVar.e(this)) {
                i10++;
            }
        }
        try {
            this.f20869p.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // d0.b
    protected final void o() {
        this.f20869p.drainPermits();
        h();
    }
}
