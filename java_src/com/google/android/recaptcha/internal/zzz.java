package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import da.p;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import s9.n;
import s9.o;
import s9.u;
import v9.d;
/* loaded from: classes.dex */
final class zzz extends l implements p {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ RecaptchaAction zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, RecaptchaAction recaptchaAction, d dVar) {
        super(2, dVar);
        this.zzb = zzaaVar;
        this.zzc = recaptchaAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzz(this.zzb, this.zzc, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzz) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object zzf;
        c10 = w9.d.c();
        int i10 = this.zza;
        o.b(obj);
        if (i10 != 0) {
            zzf = ((n) obj).i();
        } else {
            zzda zzb = this.zzb.zzb();
            RecaptchaAction recaptchaAction = this.zzc;
            this.zza = 1;
            zzf = zzb.zzf(recaptchaAction, this);
            if (zzf == c10) {
                return c10;
            }
        }
        o.b(zzf);
        return zzf;
    }
}
