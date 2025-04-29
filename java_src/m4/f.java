package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c4.h;
import com.google.android.gms.common.api.f;
import u3.a;
/* loaded from: classes.dex */
public final class f extends h {
    private final a.C0270a R;

    public f(Context context, Looper looper, c4.e eVar, a.C0270a c0270a, f.a aVar, f.b bVar) {
        super(context, looper, 68, eVar, aVar, bVar);
        a.C0270a.C0271a c0271a = new a.C0270a.C0271a(c0270a == null ? a.C0270a.f19024m : c0270a);
        c0271a.a(c.a());
        this.R = new a.C0270a(c0271a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final String D() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // c4.c
    protected final String E() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // c4.c
    protected final Bundle z() {
        return this.R.a();
    }
}
