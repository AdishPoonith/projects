package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import la.i;
import la.k0;
/* loaded from: classes.dex */
public final class zzal extends TimerTask {
    final /* synthetic */ zzao zza;

    public zzal(zzao zzaoVar) {
        this.zza = zzaoVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        k0 k0Var;
        k0Var = this.zza.zzd;
        i.d(k0Var, null, null, new zzam(this.zza, null), 3, null);
    }
}
