package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.recaptcha.internal.zzaa;
import com.google.android.recaptcha.internal.zzw;
import da.p;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import s9.o;
import s9.u;
import v9.d;
/* loaded from: classes.dex */
final class Recaptcha$getTasksClient$1 extends l implements p<k0, d<? super zzaa>, Object> {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getTasksClient$1(Application application, String str, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new Recaptcha$getTasksClient$1(this.zzb, this.zzc, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(k0 k0Var, d<? super zzaa> dVar) {
        return ((Recaptcha$getTasksClient$1) create(k0Var, dVar)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = w9.d.c();
        int i10 = this.zza;
        o.b(obj);
        if (i10 == 0) {
            zzw zzwVar = zzaa.zza;
            Application application = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzw.zzb(zzwVar, application, str, null, null, this, 12, null);
            if (obj == c10) {
                return c10;
            }
        }
        return obj;
    }
}
