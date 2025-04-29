package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import da.p;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import la.i;
import la.k0;
import s9.n;
import s9.o;
import s9.u;
import v9.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcz extends l implements p {
    int zza;
    final /* synthetic */ zzda zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzda zzdaVar, d dVar) {
        super(2, dVar);
        this.zzb = zzdaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzcz(this.zzb, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Context context;
        String str;
        Context context2;
        String str2;
        String str3;
        String str4;
        String str5;
        Context context3;
        zzr zzrVar;
        String str6;
        String str7;
        String str8;
        String str9;
        zzdk zzdkVar;
        zzdk zzdkVar2;
        zzr zzrVar2;
        c10 = w9.d.c();
        int i10 = this.zza;
        o.b(obj);
        if (i10 == 0) {
            zzu zzuVar = zzu.zza;
            context = this.zzb.zze;
            String zza = zzu.zza(context);
            str = this.zzb.zzd;
            context2 = this.zzb.zze;
            String packageName = context2.getPackageName();
            str2 = this.zzb.zzh;
            int i11 = Build.VERSION.SDK_INT;
            String encode = URLEncoder.encode(str, "UTF-8");
            String encode2 = URLEncoder.encode(packageName, "UTF-8");
            String encode3 = URLEncoder.encode(zza, "UTF-8");
            String encode4 = URLEncoder.encode("18.1.2", "UTF-8");
            String encode5 = URLEncoder.encode(str2, "UTF-8");
            byte[] bytes = ("k=" + encode + "&pk=" + encode2 + "&mst=" + encode3 + "&msv=" + encode4 + "&msi=" + encode5 + "&mov=" + i11).getBytes(Charset.forName("UTF-8"));
            zzai zzaiVar = zzai.zza;
            zzkw zzkwVar = zzkw.INIT_NATIVE;
            str3 = this.zzb.zzg;
            str4 = this.zzb.zzh;
            str5 = this.zzb.zzh;
            zzaf zzafVar = new zzaf(zzkwVar, str3, str4, str5, null);
            context3 = this.zzb.zze;
            zzrVar = this.zzb.zzf;
            zzai.zzc(zzafVar, context3, zzrVar);
            zzkw zzkwVar2 = zzkw.INIT_NETWORK;
            str6 = this.zzb.zzg;
            str7 = this.zzb.zzh;
            str8 = this.zzb.zzh;
            zzaf zzafVar2 = new zzaf(zzkwVar2, str6, str7, str8, null);
            str9 = this.zzb.zzd;
            zzai.zzb(zzafVar2, str9, new zzs());
            zzp zzpVar = zzp.zza;
            i.d(zzp.zza(), null, null, new zzcy(this.zzb, zza, null), 3, null);
            zzdkVar = this.zzb.zzn;
            zzdkVar.zzd();
            zzdkVar2 = this.zzb.zzn;
            zzdkVar2.zze();
            zzda zzdaVar = this.zzb;
            WebView zzb = zzdaVar.zzb();
            zzrVar2 = zzdaVar.zzf;
            zzb.postUrl(zzrVar2.zza(), bytes);
            b.b(this.zzb.zzm().hashCode());
            la.u zzm = this.zzb.zzm();
            this.zza = 1;
            if (zzm.e0(this) == c10) {
                return c10;
            }
        }
        return n.a(n.b(u.f17878a));
    }
}
