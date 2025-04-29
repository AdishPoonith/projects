package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.recaptcha.RecaptchaAction;
import da.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import la.m;
import s9.o;
import s9.u;
import v9.d;
import w9.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcw extends l implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzda zzf;
    final /* synthetic */ String zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(RecaptchaAction recaptchaAction, zzda zzdaVar, String str, d dVar) {
        super(2, dVar);
        this.zze = recaptchaAction;
        this.zzf = zzdaVar;
        this.zzg = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzcw(this.zze, this.zzf, this.zzg, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        d b10;
        Map map;
        String str;
        String str2;
        Context context;
        zzr zzrVar;
        Object c11;
        c10 = w9.d.c();
        int i10 = this.zzd;
        o.b(obj);
        if (i10 == 0) {
            zzda zzdaVar = this.zzf;
            String str3 = this.zzg;
            RecaptchaAction recaptchaAction = this.zze;
            this.zza = zzdaVar;
            this.zzb = str3;
            this.zzc = recaptchaAction;
            this.zzd = 1;
            b10 = c.b(this);
            m mVar = new m(b10, 1);
            mVar.z();
            map = zzdaVar.zzk;
            map.put(str3, mVar);
            zzma zzf = zzmb.zzf();
            zzf.zze(str3);
            zzf.zzd(recaptchaAction.getAction());
            byte[] zzd = ((zzmb) zzf.zzj()).zzd();
            String zzi = zzeb.zzh().zzi(zzd, 0, zzd.length);
            zzai zzaiVar = zzai.zza;
            zzkw zzkwVar = zzkw.EXECUTE_NATIVE;
            str = zzdaVar.zzg;
            str2 = zzdaVar.zzh;
            zzaf zzafVar = new zzaf(zzkwVar, str, str2, str3, null);
            context = zzdaVar.zze;
            zzrVar = zzdaVar.zzf;
            zzai.zzc(zzafVar, context, zzrVar);
            WebView zzb = zzdaVar.zzb();
            zzb.evaluateJavascript("recaptcha.m.Main.execute(\"" + zzi + "\")", null);
            obj = mVar.w();
            c11 = w9.d.c();
            if (obj == c11) {
                h.c(this);
            }
            if (obj == c10) {
                return c10;
            }
        }
        return obj;
    }
}
