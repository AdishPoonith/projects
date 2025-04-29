package k4;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Bundle f12580a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f12581b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(a aVar, Bundle bundle) {
        this.f12581b = aVar;
        this.f12580a = bundle;
    }

    @Override // k4.k
    public final void a(c cVar) {
        c cVar2;
        cVar2 = this.f12581b.f12574a;
        cVar2.I(this.f12580a);
    }

    @Override // k4.k
    public final int b() {
        return 1;
    }
}
