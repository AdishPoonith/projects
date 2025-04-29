package com.google.android.recaptcha.internal;

import java.util.List;
import t9.x;
/* loaded from: classes.dex */
public final class zzbf implements zzbi {
    private final zzdo zza;

    public zzbf() {
        this(1);
    }

    public zzbf(int i10) {
        this.zza = zzdo.zza(i10);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        List P;
        P = x.P(this.zza);
        return P;
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }
}
