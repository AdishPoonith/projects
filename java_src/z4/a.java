package z4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c4.c;
import c4.r0;
import c4.s;
import com.google.android.gms.common.api.f;
/* loaded from: classes.dex */
public class a extends c4.h<g> implements y4.f {
    public static final /* synthetic */ int V = 0;
    private final boolean R;
    private final c4.e S;
    private final Bundle T;
    private final Integer U;

    public a(Context context, Looper looper, boolean z10, c4.e eVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.R = true;
        this.S = eVar;
        this.T = bundle;
        this.U = eVar.i();
    }

    public static Bundle k0(c4.e eVar) {
        eVar.h();
        Integer i10 = eVar.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (i10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // c4.c
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final int h() {
        return b4.j.f2913a;
    }

    @Override // y4.f
    public final void l(f fVar) {
        s.k(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c10 = this.S.c();
            ((g) C()).H2(new j(1, new r0(c10, ((Integer) s.j(this.U)).intValue(), "<<default account>>".equals(c10.name) ? z3.c.b(x()).c() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.w1(new l(1, new b4.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final boolean o() {
        return this.R;
    }

    @Override // y4.f
    public final void p() {
        b(new c.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // c4.c
    protected final Bundle z() {
        if (!x().getPackageName().equals(this.S.f())) {
            this.T.putString("com.google.android.gms.signin.internal.realClientPackageName", this.S.f());
        }
        return this.T;
    }
}
