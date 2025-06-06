package com.google.android.recaptcha.internal;

import java.util.Map;
/* loaded from: classes.dex */
final class zzgb extends zzga {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final int zza(Map.Entry entry) {
        return ((zzgl) entry.getKey()).zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final zzge zzb(Object obj) {
        return ((zzgk) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final zzge zzc(Object obj) {
        return ((zzgk) obj).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final Object zzd(zzfz zzfzVar, zzhy zzhyVar, int i10) {
        return zzfzVar.zza(zzhyVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final Object zze(Object obj, zzik zzikVar, Object obj2, zzfz zzfzVar, zzge zzgeVar, Object obj3, zzjf zzjfVar) {
        Object zze;
        long zzl;
        int zzg;
        zzgm zzgmVar = (zzgm) obj2;
        zzjv zzjvVar = zzgmVar.zzb.zzb;
        zzhy zzhyVar = null;
        if (zzjvVar == zzjv.zzn) {
            zzikVar.zzg();
            throw null;
        }
        switch (zzjvVar.ordinal()) {
            case 0:
                zzhyVar = Double.valueOf(zzikVar.zza());
                break;
            case 1:
                zzhyVar = Float.valueOf(zzikVar.zzb());
                break;
            case 2:
                zzl = zzikVar.zzl();
                zzhyVar = Long.valueOf(zzl);
                break;
            case 3:
                zzl = zzikVar.zzo();
                zzhyVar = Long.valueOf(zzl);
                break;
            case 4:
                zzg = zzikVar.zzg();
                zzhyVar = Integer.valueOf(zzg);
                break;
            case 5:
                zzl = zzikVar.zzk();
                zzhyVar = Long.valueOf(zzl);
                break;
            case 6:
                zzg = zzikVar.zzf();
                zzhyVar = Integer.valueOf(zzg);
                break;
            case 7:
                zzhyVar = Boolean.valueOf(zzikVar.zzN());
                break;
            case 8:
                zzhyVar = zzikVar.zzr();
                break;
            case 9:
                Object zze2 = zzgeVar.zze(zzgmVar.zzb);
                if (zze2 instanceof zzgo) {
                    zzil zzb = zzih.zza().zzb(zze2.getClass());
                    if (!((zzgo) zze2).zzF()) {
                        Object zze3 = zzb.zze();
                        zzb.zzg(zze3, zze2);
                        zzgeVar.zzi(zzgmVar.zzb, zze3);
                        zze2 = zze3;
                    }
                    zzikVar.zzt(zze2, zzb, zzfzVar);
                    return obj3;
                }
                throw null;
            case 10:
                Object zze4 = zzgeVar.zze(zzgmVar.zzb);
                if (zze4 instanceof zzgo) {
                    zzil zzb2 = zzih.zza().zzb(zze4.getClass());
                    if (!((zzgo) zze4).zzF()) {
                        Object zze5 = zzb2.zze();
                        zzb2.zzg(zze5, zze4);
                        zzgeVar.zzi(zzgmVar.zzb, zze5);
                        zze4 = zze5;
                    }
                    zzikVar.zzu(zze4, zzb2, zzfzVar);
                    return obj3;
                }
                throw null;
            case 11:
                zzhyVar = zzikVar.zzp();
                break;
            case 12:
                zzg = zzikVar.zzj();
                zzhyVar = Integer.valueOf(zzg);
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                zzg = zzikVar.zzh();
                zzhyVar = Integer.valueOf(zzg);
                break;
            case 15:
                zzl = zzikVar.zzm();
                zzhyVar = Long.valueOf(zzl);
                break;
            case 16:
                zzg = zzikVar.zzi();
                zzhyVar = Integer.valueOf(zzg);
                break;
            case 17:
                zzl = zzikVar.zzn();
                zzhyVar = Long.valueOf(zzl);
                break;
        }
        int ordinal = zzgmVar.zzb.zzb.ordinal();
        if ((ordinal == 9 || ordinal == 10) && (zze = zzgeVar.zze(zzgmVar.zzb)) != null) {
            byte[] bArr = zzgw.zzd;
            zzhyVar = ((zzhy) zze).zzW().zzc((zzhy) zzhyVar).zzk();
        }
        zzgeVar.zzi(zzgmVar.zzb, zzhyVar);
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzf(Object obj) {
        ((zzgk) obj).zzb.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzg(zzik zzikVar, Object obj, zzfz zzfzVar, zzge zzgeVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzh(zzez zzezVar, Object obj, zzfz zzfzVar, zzge zzgeVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final void zzi(zzjx zzjxVar, Map.Entry entry) {
        zzgl zzglVar = (zzgl) entry.getKey();
        zzjv zzjvVar = zzjv.zza;
        switch (zzglVar.zzb.ordinal()) {
            case 0:
                zzjxVar.zzf(zzglVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzjxVar.zzo(zzglVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzjxVar.zzt(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzjxVar.zzK(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzjxVar.zzr(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzjxVar.zzm(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzjxVar.zzk(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzjxVar.zzb(zzglVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzjxVar.zzG(zzglVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzjxVar.zzq(zzglVar.zza, entry.getValue(), zzih.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzjxVar.zzv(zzglVar.zza, entry.getValue(), zzih.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzjxVar.zzd(zzglVar.zza, (zzez) entry.getValue());
                return;
            case 12:
                zzjxVar.zzI(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzjxVar.zzr(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzjxVar.zzx(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzjxVar.zzz(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzjxVar.zzB(zzglVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzjxVar.zzD(zzglVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.recaptcha.internal.zzga
    public final boolean zzj(zzhy zzhyVar) {
        return zzhyVar instanceof zzgk;
    }
}
