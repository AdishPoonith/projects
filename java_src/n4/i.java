package n4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.m;
/* loaded from: classes.dex */
public final class i extends c4.h<f> {
    public i(Context context, Looper looper, c4.e eVar, com.google.android.gms.common.api.internal.e eVar2, m mVar) {
        super(context, looper, 126, eVar, eVar2, mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final String D() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // c4.c
    protected final String E() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // c4.c
    public final boolean Q() {
        return true;
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final int h() {
        return b4.j.f2913a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final /* bridge */ /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // c4.c
    public final b4.d[] u() {
        return c.f14279e;
    }
}
