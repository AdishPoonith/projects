package com.google.android.recaptcha.internal;

import android.content.Context;
import da.p;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.sync.b;
import la.k0;
import s9.o;
import s9.u;
import v9.d;
/* loaded from: classes.dex */
final class zzcy extends l implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzda zze;
    final /* synthetic */ String zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzda zzdaVar, String str, d dVar) {
        super(2, dVar);
        this.zze = zzdaVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzcy(this.zze, this.zzf, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcy) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        b bVar;
        String str;
        Object obj2;
        b bVar2;
        zzr zzrVar;
        String str2;
        String str3;
        String str4;
        Context context;
        zzr zzrVar2;
        c10 = w9.d.c();
        int i10 = this.zzd;
        try {
            if (i10 == 0) {
                o.b(obj);
                zzda zzdaVar = this.zze;
                bVar = zzdaVar.zzo;
                str = this.zzf;
                this.zza = bVar;
                this.zzb = zzdaVar;
                this.zzc = str;
                this.zzd = 1;
                if (bVar.b(null, this) == c10) {
                    return c10;
                }
                obj2 = zzdaVar;
            } else if (i10 != 1) {
                bVar2 = this.zza;
                try {
                    o.b(obj);
                    bVar2 = bVar2;
                    u uVar = u.f17878a;
                    bVar2.a(null);
                    return uVar;
                } catch (Throwable th) {
                    th = th;
                    bVar2.a(null);
                    throw th;
                }
            } else {
                ?? r12 = this.zzc;
                obj2 = this.zzb;
                ?? r42 = this.zza;
                o.b(obj);
                str = r12;
                bVar = r42;
            }
            zzrVar = ((zzda) obj2).zzf;
            String zzb = zzrVar.zzb();
            str2 = ((zzda) obj2).zzd;
            str3 = ((zzda) obj2).zzh;
            str4 = ((zzda) obj2).zzg;
            context = ((zzda) obj2).zze;
            zzrVar2 = ((zzda) obj2).zzf;
            this.zza = bVar;
            this.zzb = null;
            this.zzc = null;
            this.zzd = 2;
            if (zzbj.zzb(zzb, str2, str, str3, str4, context, zzrVar2, this) != c10) {
                bVar2 = bVar;
                u uVar2 = u.f17878a;
                bVar2.a(null);
                return uVar2;
            }
            return c10;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            bVar2.a(null);
            throw th;
        }
    }
}
