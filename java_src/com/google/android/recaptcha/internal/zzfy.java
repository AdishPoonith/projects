package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
final class zzfy {
    private final Object zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfy(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfy) {
            zzfy zzfyVar = (zzfy) obj;
            return this.zza == zzfyVar.zza && this.zzb == zzfyVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
