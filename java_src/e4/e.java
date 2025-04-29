package e4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c4.h;
import c4.z;
import com.google.android.gms.common.api.internal.m;
import o4.f;
/* loaded from: classes.dex */
public final class e extends h {
    private final z R;

    public e(Context context, Looper looper, c4.e eVar, z zVar, com.google.android.gms.common.api.internal.e eVar2, m mVar) {
        super(context, looper, 270, eVar, eVar2, mVar);
        this.R = zVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // c4.c
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // c4.c
    protected final boolean H() {
        return true;
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // c4.c
    public final b4.d[] u() {
        return f.f14626b;
    }

    @Override // c4.c
    protected final Bundle z() {
        return this.R.b();
    }
}
