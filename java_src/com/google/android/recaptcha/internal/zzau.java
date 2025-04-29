package com.google.android.recaptcha.internal;

import da.p;
import kotlin.jvm.internal.m;
import s9.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzau extends m implements p {
    final /* synthetic */ zzba zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzba zzbaVar, String str, int i10) {
        super(2);
        this.zza = zzbaVar;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzv(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzb().zzb().zzf(i10, objArr);
        }
        return u.f17878a;
    }
}
