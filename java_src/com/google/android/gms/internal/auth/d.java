package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class d extends c4.h {
    private final Bundle R;

    public d(Context context, Looper looper, c4.e eVar, u3.c cVar, com.google.android.gms.common.api.internal.e eVar2, com.google.android.gms.common.api.internal.m mVar) {
        super(context, looper, 16, eVar, eVar2, mVar);
        this.R = cVar == null ? new Bundle() : cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final String D() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // c4.c
    protected final String E() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // c4.c
    public final boolean Q() {
        return true;
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final int h() {
        return b4.j.f2913a;
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final boolean o() {
        c4.e h02 = h0();
        return (TextUtils.isEmpty(h02.b()) || h02.e(u3.b.f19030a).isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder);
    }

    @Override // c4.c
    protected final Bundle z() {
        return this.R;
    }
}
