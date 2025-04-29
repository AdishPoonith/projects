package z3;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
final class j extends e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f20871a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar) {
        this.f20871a = kVar;
    }

    @Override // z3.e, z3.v
    public final void C2(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            r.c(this.f20871a.f20872s).e(this.f20871a.f20873t, googleSignInAccount);
        }
        this.f20871a.f(new y3.b(googleSignInAccount, status));
    }
}
