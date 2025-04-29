package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.d;
import s9.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzx extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaa zzb;
    int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzaa zzaaVar, v9.d dVar) {
        super(dVar);
        this.zzb = zzaaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo9executegIAlus = this.zzb.mo9executegIAlus(null, this);
        c10 = w9.d.c();
        return mo9executegIAlus == c10 ? mo9executegIAlus : n.a(mo9executegIAlus);
    }
}
