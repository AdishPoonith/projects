package com.google.android.recaptcha.internal;

import da.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import la.k0;
import la.l0;
import s9.o;
import s9.u;
import v9.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzay extends l implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzn zzc;
    final /* synthetic */ zzn zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzba zzf;
    private /* synthetic */ Object zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(Exception exc, int i10, zzn zznVar, zzn zznVar2, String str, zzba zzbaVar, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = i10;
        this.zzc = zznVar;
        this.zzd = zznVar2;
        this.zze = str;
        this.zzf = zzbaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        zzay zzayVar = new zzay(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dVar);
        zzayVar.zzg = obj;
        return zzayVar;
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzay) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzmi zzf;
        w9.d.c();
        o.b(obj);
        k0 k0Var = (k0) this.zzg;
        Exception exc = this.zza;
        if (exc instanceof zzt) {
            zzf = ((zzt) exc).zza();
            zzf.zzd(this.zzb);
        } else {
            zzf = zzmj.zzf();
            zzf.zzd(this.zzb);
            zzf.zzp(2);
            zzf.zze(2);
        }
        zzmj zzmjVar = (zzmj) zzf.zzj();
        zzmjVar.zzk();
        zzmjVar.zzj();
        t.b(this.zza.getClass()).a();
        this.zza.getMessage();
        zzlg zza = zzar.zza(this.zzc, this.zzd);
        String str = this.zze;
        if (str.length() == 0) {
            str = "recaptcha.m.Main.rge";
        }
        if (l0.d(k0Var)) {
            zzba zzbaVar = this.zzf;
            zzeb zzh = zzeb.zzh();
            byte[] zzd = zzmjVar.zzd();
            zzeb zzh2 = zzeb.zzh();
            byte[] zzd2 = zza.zzd();
            zzbaVar.zzv(str, zzh.zzi(zzd, 0, zzd.length), zzh2.zzi(zzd2, 0, zzd2.length));
        }
        return u.f17878a;
    }
}
