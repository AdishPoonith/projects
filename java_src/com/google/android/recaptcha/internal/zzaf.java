package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class zzaf {
    private final zzkw zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze = null;

    public zzaf(zzkw zzkwVar, String str, String str2, String str3, String str4) {
        this.zza = zzkwVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaf) {
            zzaf zzafVar = (zzaf) obj;
            return zzafVar.zza == this.zza && l.a(zzafVar.zzb, this.zzb) && l.a(zzafVar.zzc, this.zzc) && l.a(zzafVar.zzd, this.zzd) && l.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, null});
    }

    public final zzkw zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
