package com.google.android.recaptcha.internal;

import ka.q;
import u9.b;
/* loaded from: classes.dex */
public final class zzi implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String Q;
        String Q2;
        String Q3;
        String Q4;
        Q = q.Q(String.valueOf(this.zzb / this.zza), 10, (char) 0, 2, null);
        Q2 = q.Q(String.valueOf(this.zzc), 10, (char) 0, 2, null);
        Q3 = q.Q(String.valueOf(this.zzb), 10, (char) 0, 2, null);
        Q4 = q.Q(String.valueOf(this.zza), 5, (char) 0, 2, null);
        return "avgExecutionTime: " + Q + " us| maxExecutionTime: " + Q2 + " us| totalTime: " + Q3 + " us| #Usages: " + Q4;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzi zziVar) {
        int a10;
        a10 = b.a(Long.valueOf(this.zzb), Long.valueOf(zziVar.zzb));
        return a10;
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
