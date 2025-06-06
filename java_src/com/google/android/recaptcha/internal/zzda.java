package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.d;
import la.k0;
import la.u;
import la.v2;
import s9.q;
import t9.g0;
/* loaded from: classes.dex */
public final class zzda {
    public static final zzct zza = new zzct(null);
    public u zzb;
    private final WebView zzc;
    private final String zzd;
    private final Context zze;
    private final zzr zzf;
    private final String zzg;
    private final String zzh;
    private final zzaj zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;
    private final zzas zzm;
    private final zzdk zzn;
    private final b zzo;
    private final zzcu zzp;

    public zzda(WebView webView, String str, Context context, zzr zzrVar, String str2, String str3, zzaj zzajVar, k0 k0Var) {
        this.zzc = webView;
        this.zzd = str;
        this.zze = context;
        this.zzf = zzrVar;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzajVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzk = linkedHashMap;
        this.zzl = linkedHashMap;
        zzbc zzbcVar = new zzbc(webView, k0Var);
        zzp zzpVar = zzp.zza;
        this.zzm = new zzba(zzbcVar, zzp.zzc(), context);
        this.zzn = zzdk.zzc();
        this.zzo = d.b(false, 1, null);
        zzcu zzcuVar = new zzcu(this);
        this.zzp = zzcuVar;
        this.zzj = zzq();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzcuVar, "RN");
        webView.setWebViewClient(new zzcs(this));
    }

    private final zzh zzo(Exception exc) {
        return exc instanceof v2 ? new zzh(zzf.zzc, zzd.zzj) : exc instanceof zzh ? (zzh) exc : new zzh(zzf.zzc, zzd.zzu);
    }

    private final void zzp(List list, zzh zzhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzkw zzkwVar = (zzkw) it.next();
            zzai zzaiVar = zzai.zza;
            String str = this.zzg;
            String str2 = this.zzh;
            zzai.zzd(new zzaf(zzkwVar, str, str2, str2, null), String.valueOf(zzhVar.zzb().zza()), zzhVar.zza().zza(), this.zze, this.zzf, null);
        }
    }

    private static final Map zzq() {
        Map g10;
        g10 = g0.g(q.a(-4, zzd.zzA), q.a(-12, zzd.zzB), q.a(-6, zzd.zzw), q.a(-11, zzd.zzy), q.a(-13, zzd.zzC), q.a(-14, zzd.zzD), q.a(-2, zzd.zzx), q.a(-7, zzd.zzE), q.a(-5, zzd.zzF), q.a(-9, zzd.zzG), q.a(-8, zzd.zzQ), q.a(-15, zzd.zzz), q.a(-1, zzd.zzH), q.a(-3, zzd.zzJ), q.a(-10, zzd.zzK));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            g10.put(-16, zzd.zzI);
        }
        if (i10 >= 27) {
            g10.put(1, zzd.zzM);
            g10.put(2, zzd.zzN);
            g10.put(0, zzd.zzO);
            g10.put(3, zzd.zzP);
        }
        if (i10 >= 29) {
            g10.put(4, zzd.zzL);
        }
        return g10;
    }

    public final WebView zzb() {
        return this.zzc;
    }

    public final zzas zzd() {
        return this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(com.google.android.recaptcha.RecaptchaAction r12, v9.d r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzf(com.google.android.recaptcha.RecaptchaAction, v9.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(v9.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzcx
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zza
            java.lang.Object r1 = w9.b.c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzda r0 = r0.zzd
            s9.o.b(r11)     // Catch: java.lang.Exception -> L2b
            goto L76
        L2b:
            r11 = move-exception
            goto L80
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            s9.o.b(r11)
            com.google.android.recaptcha.internal.zzai r11 = com.google.android.recaptcha.internal.zzai.zza
            com.google.android.recaptcha.internal.zzaf r11 = new com.google.android.recaptcha.internal.zzaf
            com.google.android.recaptcha.internal.zzkw r5 = com.google.android.recaptcha.internal.zzkw.INIT_NATIVE
            java.lang.String r6 = r10.zzg
            java.lang.String r8 = r10.zzh
            r9 = 0
            r4 = r11
            r7 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r2 = r10.zzd
            com.google.android.recaptcha.internal.zzs r4 = new com.google.android.recaptcha.internal.zzs
            r4.<init>()
            com.google.android.recaptcha.internal.zzai.zzb(r11, r2, r4)
            r11 = 0
            la.u r2 = la.w.b(r11, r3, r11)
            r10.zzb = r2
            la.u r2 = r10.zzm()
            int r2 = r2.hashCode()
            kotlin.coroutines.jvm.internal.b.b(r2)
            com.google.android.recaptcha.internal.zzcz r2 = new com.google.android.recaptcha.internal.zzcz     // Catch: java.lang.Exception -> L7e
            r2.<init>(r10, r11)     // Catch: java.lang.Exception -> L7e
            r0.zzd = r10     // Catch: java.lang.Exception -> L7e
            r0.zzc = r3     // Catch: java.lang.Exception -> L7e
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r11 = la.x2.c(r4, r2, r0)     // Catch: java.lang.Exception -> L7e
            if (r11 == r1) goto L7d
            r0 = r10
        L76:
            s9.n r11 = (s9.n) r11     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = r11.i()     // Catch: java.lang.Exception -> L2b
            goto Ld3
        L7d:
            return r1
        L7e:
            r11 = move-exception
            r0 = r10
        L80:
            r11.getMessage()
            boolean r1 = r11 instanceof la.v2
            if (r1 == 0) goto L98
            r2 = 2
            com.google.android.recaptcha.internal.zzkw[] r2 = new com.google.android.recaptcha.internal.zzkw[r2]
            r4 = 0
            com.google.android.recaptcha.internal.zzkw r5 = com.google.android.recaptcha.internal.zzkw.INIT_TOTAL
            r2[r4] = r5
            com.google.android.recaptcha.internal.zzkw r4 = com.google.android.recaptcha.internal.zzkw.INIT_NETWORK
            r2[r3] = r4
            java.util.List r2 = t9.n.g(r2)
            goto L9e
        L98:
            com.google.android.recaptcha.internal.zzkw r2 = com.google.android.recaptcha.internal.zzkw.INIT_TOTAL
            java.util.List r2 = t9.n.b(r2)
        L9e:
            com.google.android.recaptcha.internal.zzcu r3 = r0.zzp
            java.lang.Long r3 = r3.zza()
            if (r1 != 0) goto La7
            goto Lbe
        La7:
            if (r3 != 0) goto Laa
            goto Lb4
        Laa:
            long r3 = r3.longValue()
            r5 = 8000(0x1f40, double:3.9525E-320)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lbe
        Lb4:
            com.google.android.recaptcha.internal.zzh r11 = new com.google.android.recaptcha.internal.zzh
            com.google.android.recaptcha.internal.zzf r1 = com.google.android.recaptcha.internal.zzf.zze
            com.google.android.recaptcha.internal.zzd r3 = com.google.android.recaptcha.internal.zzd.zzT
            r11.<init>(r1, r3)
            goto Lc2
        Lbe:
            com.google.android.recaptcha.internal.zzh r11 = r0.zzo(r11)
        Lc2:
            r0.zzp(r2, r11)
            s9.n$a r0 = s9.n.f17870k
            com.google.android.recaptcha.RecaptchaException r11 = r11.zzc()
            java.lang.Object r11 = s9.o.a(r11)
            java.lang.Object r11 = s9.n.b(r11)
        Ld3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzg(v9.d):java.lang.Object");
    }

    public final u zzm() {
        u uVar = this.zzb;
        if (uVar != null) {
            return uVar;
        }
        return null;
    }
}
