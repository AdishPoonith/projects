package com.google.android.recaptcha.internal;

import da.p;
import java.util.Timer;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import s9.o;
import s9.u;
import v9.d;
/* loaded from: classes.dex */
final class zzam extends l implements p {
    final /* synthetic */ zzao zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzao zzaoVar, d dVar) {
        super(2, dVar);
        this.zza = zzaoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzam(this.zza, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzad zzadVar;
        u uVar;
        Timer timer;
        w9.d.c();
        o.b(obj);
        zzao zzaoVar = this.zza;
        synchronized (zzaj.class) {
            zzadVar = zzaoVar.zze;
            if (zzadVar.zzb() == 0) {
                timer = zzao.zzb;
                if (timer != null) {
                    timer.cancel();
                }
                zzao.zzb = null;
            }
            zzaoVar.zzg();
            uVar = u.f17878a;
        }
        return uVar;
    }
}
