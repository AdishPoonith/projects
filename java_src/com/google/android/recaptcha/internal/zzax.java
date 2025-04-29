package com.google.android.recaptcha.internal;

import da.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import la.l0;
import s9.o;
import s9.u;
import t9.x;
import v9.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzax extends l implements p {
    int zza;
    final /* synthetic */ zzba zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ zzn zze;
    private /* synthetic */ Object zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, List list, zzn zznVar, zzn zznVar2, d dVar) {
        super(2, dVar);
        this.zzb = zzbaVar;
        this.zzc = list;
        this.zzd = zznVar;
        this.zze = zznVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzax zzaxVar = new zzax(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzaxVar.zzf = obj;
        return zzaxVar;
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object zzu;
        boolean zzw;
        c10 = w9.d.c();
        int i10 = this.zza;
        o.b(obj);
        if (i10 == 0) {
            k0 k0Var = (k0) this.zzf;
            zzbl zzblVar = new zzbl(this.zzb.zzb());
            zzdk zzb = zzdk.zzb();
            while (zzblVar.zzb() >= 0 && zzblVar.zzb() < this.zzc.size() && l0.d(k0Var)) {
                zzmv zzmvVar = (zzmv) this.zzc.get(zzblVar.zzb());
                try {
                    int zzk = zzmvVar.zzk();
                    int zzg = zzmvVar.zzg();
                    List zzj = zzmvVar.zzj();
                    zzw = this.zzb.zzw(zzmvVar, zzblVar);
                    if (!zzw) {
                        zzdk zzb2 = zzdk.zzb();
                        int i11 = zzk - 2;
                        if (i11 == 7) {
                            zzba.zzo(this.zzb, zzg, zzj);
                        } else if (i11 == 15) {
                            zzba.zzi(this.zzb, zzj);
                        } else if (i11 == 30) {
                            zzba.zzh(this.zzb, zzg, zzj);
                        } else if (i11 != 40) {
                            switch (i11) {
                                case 10:
                                    zzba.zzm(this.zzb, zzg, zzj);
                                    break;
                                case 11:
                                    zzba.zzn(this.zzb, zzg, zzj);
                                    break;
                                case 12:
                                    zzba.zzp(this.zzb, zzj);
                                    break;
                                case 13:
                                    zzba.zzq(this.zzb, zzj);
                                    break;
                                default:
                                    switch (i11) {
                                        case 18:
                                            zzba.zzk(this.zzb, zzg, zzj);
                                            break;
                                        case 19:
                                            zzba.zzl(this.zzb, zzg, zzj);
                                            break;
                                        case 20:
                                            zzba.zzj(this.zzb, zzj);
                                            break;
                                        default:
                                            throw new zzt(5, 2, null);
                                    }
                            }
                        } else {
                            zzba.zzr(this.zzb, this.zzd, zzg, zzj);
                        }
                        zzb2.zzf();
                        long zza = zzb2.zza(TimeUnit.MICROSECONDS);
                        zzj zzjVar = zzj.zza;
                        zzj.zza(zzms.zza(zzk), zza);
                        b.c(zza);
                        b.b(zzg);
                        x.z(zzj, null, null, null, 0, null, new zzaw(this.zzb), 31, null);
                        zzblVar.zzg(zzblVar.zzb() + 1);
                    }
                } catch (Exception e10) {
                    zzba zzbaVar = this.zzb;
                    String zzd = zzblVar.zzd();
                    zzn zznVar = this.zzd;
                    zzn zznVar2 = this.zze;
                    int zzb3 = zzblVar.zzb();
                    this.zza = 1;
                    zzu = zzbaVar.zzu(e10, zzd, zznVar, zznVar2, zzb3, this);
                    if (zzu == c10) {
                        return c10;
                    }
                }
            }
            zzb.zzf();
            b.c(zzb.zza(TimeUnit.MICROSECONDS));
            return u.f17878a;
        }
        return u.f17878a;
    }
}
