package z3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
/* loaded from: classes.dex */
public final class i extends c4.h {
    private final GoogleSignInOptions R;

    public i(Context context, Looper looper, c4.e eVar, GoogleSignInOptions googleSignInOptions, f.a aVar, f.b bVar) {
        super(context, looper, 91, eVar, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.j(m4.c.a());
        if (!eVar.d().isEmpty()) {
            for (Scope scope : eVar.d()) {
                aVar2.f(scope, new Scope[0]);
            }
        }
        this.R = aVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final String D() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // c4.c
    protected final String E() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final int h() {
        return b4.j.f2913a;
    }

    public final GoogleSignInOptions k0() {
        return this.R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof w ? (w) queryLocalInterface : new w(iBinder);
    }
}
