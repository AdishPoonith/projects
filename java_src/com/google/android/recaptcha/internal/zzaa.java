package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.d;
import la.i;
import la.r0;
/* loaded from: classes.dex */
public final class zzaa implements RecaptchaClient, RecaptchaTasksClient {
    private static zzaa zzb;
    private static String zzd;
    private final zzda zzf;
    public static final zzw zza = new zzw(null);
    private static final String zzc = UUID.randomUUID().toString();
    private static final b zze = d.b(false, 1, null);

    public zzaa(zzda zzdaVar) {
        this.zzf = zzdaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo9executegIAlus(com.google.android.recaptcha.RecaptchaAction r6, v9.d<? super s9.n<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzx
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzx r0 = (com.google.android.recaptcha.internal.zzx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzx r0 = new com.google.android.recaptcha.internal.zzx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = w9.b.c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            s9.o.b(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            s9.o.b(r7)
            com.google.android.recaptcha.internal.zzp r7 = com.google.android.recaptcha.internal.zzp.zza
            la.k0 r7 = com.google.android.recaptcha.internal.zzp.zzb()
            v9.g r7 = r7.n()
            com.google.android.recaptcha.internal.zzy r2 = new com.google.android.recaptcha.internal.zzy
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.zzc = r3
            java.lang.Object r7 = la.h.e(r7, r2, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            s9.n r7 = (s9.n) r7
            java.lang.Object r6 = r7.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaa.mo9executegIAlus(com.google.android.recaptcha.RecaptchaAction, v9.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        r0 b10;
        zzp zzpVar = zzp.zza;
        b10 = i.b(zzp.zzb(), null, null, new zzz(this, recaptchaAction, null), 3, null);
        return zzb.zza(b10);
    }

    public final zzda zzb() {
        return this.zzf;
    }
}
