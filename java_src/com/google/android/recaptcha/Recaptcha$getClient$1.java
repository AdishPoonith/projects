package com.google.android.recaptcha;

import kotlin.coroutines.jvm.internal.d;
import s9.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, v9.d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m8getClient0E7RQCE = this.zzb.m8getClient0E7RQCE(null, null, this);
        c10 = w9.d.c();
        return m8getClient0E7RQCE == c10 ? m8getClient0E7RQCE : n.a(m8getClient0E7RQCE);
    }
}
