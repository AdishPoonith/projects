package a6;

import com.google.android.gms.tasks.OnFailureListener;
/* loaded from: classes.dex */
final class n implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f259a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar) {
        this.f259a = oVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        f4.a aVar;
        if (exc instanceof w5.m) {
            aVar = p.f270h;
            aVar.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f259a.f265k.d();
        }
    }
}
