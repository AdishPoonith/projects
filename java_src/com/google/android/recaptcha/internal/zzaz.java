package com.google.android.recaptcha.internal;

import da.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import s9.o;
import s9.u;
import v9.d;
/* loaded from: classes.dex */
final class zzaz extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzba zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzn zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzba zzbaVar, String str, zzn zznVar, d dVar) {
        super(2, dVar);
        this.zzc = zzbaVar;
        this.zzd = str;
        this.zze = zznVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzaz(this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaz) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object zzu;
        zzmh zzy;
        Object zzt;
        c10 = w9.d.c();
        ?? r12 = this.zzb;
        try {
        } catch (Exception e10) {
            zzba zzbaVar = this.zzc;
            zzn zznVar = this.zze;
            this.zza = null;
            this.zzb = 2;
            zzu = zzbaVar.zzu(e10, "recaptcha.m.Main.rge", zznVar, r12, 0, this);
            if (zzu == c10) {
                return c10;
            }
        }
        if (r12 == 0) {
            o.b(obj);
            zzn zznVar2 = new zzn();
            zzmp zzg = zzmp.zzg(zzeb.zzh().zzj(this.zzd));
            zzdk zzb = zzdk.zzb();
            zzba zzbaVar2 = this.zzc;
            zzy = zzba.zzy(zzg.zzi(), zzg.zzj());
            zzb.zzf();
            long zza = zzb.zza(TimeUnit.MICROSECONDS);
            zzj zzjVar = zzj.zza;
            zzj.zza(zzl.zzm.zza(), zza);
            zzba zzbaVar3 = this.zzc;
            List zzi = zzy.zzi();
            zzn zznVar3 = this.zze;
            this.zza = zznVar2;
            this.zzb = 1;
            zzt = zzbaVar3.zzt(zzi, zznVar3, zznVar2, this);
            r12 = zznVar2;
            if (zzt == c10) {
                return c10;
            }
        } else if (r12 != 1) {
            o.b(obj);
            return u.f17878a;
        } else {
            Object obj2 = this.zza;
            o.b(obj);
            r12 = obj2;
        }
        return u.f17878a;
    }
}
