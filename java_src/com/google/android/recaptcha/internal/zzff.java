package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public abstract class zzff {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzfg zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzff(zzfe zzfeVar) {
    }

    public static int zzF(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzG(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzff zzH(byte[] bArr, int i10, int i11, boolean z10) {
        zzfb zzfbVar = new zzfb(bArr, 0, 0, false, null);
        try {
            zzfbVar.zze(0);
            return zzfbVar;
        } catch (zzgy e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void zzA(int i10);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i10);

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i10);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzez zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i10);
}
