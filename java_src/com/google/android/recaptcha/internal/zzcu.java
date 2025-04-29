package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import la.l;
import s9.n;
import s9.o;
import s9.u;
/* loaded from: classes.dex */
public final class zzcu {
    final /* synthetic */ zzda zza;
    private Long zzb;
    private final zzdk zzc = zzdk.zzb();

    public zzcu(zzda zzdaVar) {
        this.zza = zzdaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzoed(String str) {
        Map map;
        Object a10;
        zzb();
        zzlz zzg = zzlz.zzg(zzeb.zzh().zzj(str));
        zzg.zzi().name();
        zzg.zzk();
        map = this.zza.zzk;
        l lVar = (l) map.remove(zzg.zzj());
        String zzk = zzg.zzk();
        if (zzk == null || zzk.length() == 0) {
            zzg.zzi().name();
            zzg zzgVar = zzh.zza;
            zzh zza = zzg.zza(zzg.zzi());
            zzg.zzj();
            if (lVar == null) {
                return;
            }
            n.a aVar = n.f17870k;
            a10 = o.a(zza);
        } else if (lVar == null) {
            return;
        } else {
            a10 = zzg.zzk();
        }
        lVar.resumeWith(n.b(a10));
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzmd zzg = zzmd.zzg(zzeb.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzmf.JS_CODE_SUCCESS) {
            this.zza.zzm().hashCode();
            if (this.zza.zzm().C(u.f17878a)) {
                return;
            }
            this.zza.zzm().hashCode();
            return;
        }
        zzg.zzi().name();
        zzg zzgVar = zzh.zza;
        zzh zza = zzg.zza(zzg.zzi());
        this.zza.zzm().hashCode();
        this.zza.zzm().z(zza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        this.zza.zzd().zza(str);
    }
}
