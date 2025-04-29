package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.g;
import la.i;
import la.k0;
import t9.x;
/* loaded from: classes.dex */
public final class zzao implements zzaj {
    public static final zzak zza = new zzak(null);
    private static Timer zzb;
    private final zzap zzc;
    private final k0 zzd;
    private final zzad zze;

    public /* synthetic */ zzao(Context context, zzap zzapVar, k0 k0Var, int i10, g gVar) {
        zzad zzadVar;
        zzp zzpVar = zzp.zza;
        k0 zza2 = zzp.zza();
        this.zzc = zzapVar;
        this.zzd = zza2;
        zzadVar = zzad.zzb;
        zzadVar = zzadVar == null ? new zzad(context, null) : zzadVar;
        zzad.zzb = zzadVar;
        this.zze = zzadVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        List<List> U;
        U = x.U(this.zze.zzd(), 20, 20, true);
        for (List<zzae> list : U) {
            zzkz zzf = zzla.zzf();
            for (zzae zzaeVar : list) {
                zzf.zzd(zzkx.zzG(zzeb.zzg().zzj(zzaeVar.zzc())));
            }
            if (this.zzc.zza(((zzla) zzf.zzj()).zzd())) {
                for (zzae zzaeVar2 : list) {
                    this.zze.zzf(zzaeVar2);
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzal(this), 120000L, 120000L);
        }
    }

    public final void zzf(zzkx zzkxVar) {
        i.d(this.zzd, null, null, new zzan(zzkxVar, this, null), 3, null);
        zzh();
    }
}
