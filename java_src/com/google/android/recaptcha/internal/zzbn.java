package com.google.android.recaptcha.internal;

import fa.c;
import ha.f;
import ha.g;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzbn {
    private final zzbm zza;
    private byte zzb;
    private final HashMap zzc;

    public zzbn() {
        zzbm zzbmVar = new zzbm();
        this.zza = zzbmVar;
        this.zzb = (byte) g.g(new f(1, 127), c.f8872j);
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        zzbmVar.zze(173, hashMap);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final zzbm zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zzd();
        this.zza.zze(173, this.zzc);
    }

    public final void zzd(byte b10) {
        this.zzb = b10;
    }

    public final void zze(int i10, Object obj) {
        this.zzc.put(1, obj);
    }
}
