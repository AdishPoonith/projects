package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public final class zzlj extends zzgo implements zzhz {
    private static final zzlj zzb;
    private zzkp zze;
    private zzkj zzf;
    private zzks zzg;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzlj zzljVar = new zzlj();
        zzb = zzljVar;
        zzgo.zzC(zzlj.class, zzljVar);
    }

    private zzlj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzG(zzlj zzljVar, zzkj zzkjVar) {
        zzkjVar.getClass();
        zzljVar.zzf = zzkjVar;
    }

    public static zzli zzf() {
        return (zzli) zzb.zzp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzlj zzljVar, String str) {
        str.getClass();
        zzljVar.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzlj zzljVar, String str) {
        str.getClass();
        zzljVar.zzh = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzlj zzljVar, String str) {
        str.getClass();
        zzljVar.zzi = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzli(null);
                }
                return new zzlj();
            }
            return zzgo.zzz(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\t\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
