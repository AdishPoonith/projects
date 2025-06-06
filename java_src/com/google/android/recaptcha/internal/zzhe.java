package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public class zzhe {
    private static final zzfz zzb = zzfz.zza;
    protected volatile zzhy zza;
    private volatile zzez zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhe) {
            zzhe zzheVar = (zzhe) obj;
            zzhy zzhyVar = this.zza;
            zzhy zzhyVar2 = zzheVar.zza;
            if (zzhyVar == null && zzhyVar2 == null) {
                return zzb().equals(zzheVar.zzb());
            }
            if (zzhyVar == null || zzhyVar2 == null) {
                if (zzhyVar != null) {
                    zzheVar.zzd(zzhyVar.zzX());
                    return zzhyVar.equals(zzheVar.zza);
                }
                zzd(zzhyVar2.zzX());
                return this.zza.equals(zzhyVar2);
            }
            return zzhyVar.equals(zzhyVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzew) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final zzez zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            this.zzc = this.zza == null ? zzez.zzb : this.zza.zzb();
            return this.zzc;
        }
    }

    public final zzhy zzc(zzhy zzhyVar) {
        zzhy zzhyVar2 = this.zza;
        this.zzc = null;
        this.zza = zzhyVar;
        return zzhyVar2;
    }

    protected final void zzd(zzhy zzhyVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzhyVar;
                    this.zzc = zzez.zzb;
                } catch (zzgy unused) {
                    this.zza = zzhyVar;
                    this.zzc = zzez.zzb;
                }
            }
        }
    }
}
