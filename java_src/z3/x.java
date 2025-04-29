package z3;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
/* loaded from: classes.dex */
public final class x extends s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20881a;

    public x(Context context) {
        this.f20881a = context;
    }

    private final void x() {
        if (h4.m.a(this.f20881a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
    }

    @Override // z3.t
    public final void Q0() {
        x();
        c b10 = c.b(this.f20881a);
        GoogleSignInAccount c10 = b10.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f3695u;
        if (c10 != null) {
            googleSignInOptions = b10.d();
        }
        com.google.android.gms.auth.api.signin.b a10 = com.google.android.gms.auth.api.signin.a.a(this.f20881a, googleSignInOptions);
        if (c10 != null) {
            a10.A();
        } else {
            a10.B();
        }
    }

    @Override // z3.t
    public final void j0() {
        x();
        r.c(this.f20881a).d();
    }
}
