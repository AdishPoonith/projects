package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import da.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import s9.o;
import s9.u;
import t9.x;
import v9.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzan extends l implements p {
    final /* synthetic */ zzkx zza;
    final /* synthetic */ zzao zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzkx zzkxVar, zzao zzaoVar, d dVar) {
        super(2, dVar);
        this.zza = zzkxVar;
        this.zzb = zzaoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzan(this.zza, this.zzb, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzad zzadVar;
        zzad zzadVar2;
        zzad zzadVar3;
        u uVar;
        zzad zzadVar4;
        List L;
        zzad zzadVar5;
        w9.d.c();
        o.b(obj);
        zzkx zzkxVar = this.zza;
        zzao zzaoVar = this.zzb;
        synchronized (zzaj.class) {
            byte[] zzd = zzkxVar.zzd();
            zzae zzaeVar = new zzae(zzeb.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
            zzadVar = zzaoVar.zze;
            ContentValues contentValues = new ContentValues();
            contentValues.put("ss", zzaeVar.zzc());
            contentValues.put("ts", Long.valueOf(zzaeVar.zzb()));
            zzadVar.getWritableDatabase().insert("ce", null, contentValues);
            zzadVar2 = zzaoVar.zze;
            int zzb = zzadVar2.zzb() - 500;
            if (zzb > 0) {
                zzadVar4 = zzaoVar.zze;
                L = x.L(zzadVar4.zzd(), zzb);
                zzadVar5 = zzaoVar.zze;
                zzadVar5.zza(L);
            }
            zzadVar3 = zzaoVar.zze;
            if (zzadVar3.zzb() >= 20) {
                zzaoVar.zzg();
            }
            uVar = u.f17878a;
        }
        return uVar;
    }
}
