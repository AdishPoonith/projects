package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import s9.q;
import t9.g0;
/* loaded from: classes.dex */
public final class zzh extends Exception {
    public static final zzg zza = new zzg(null);
    private static final Map zzb;
    private final zzf zzc;
    private final zzd zzd;
    private final Map zze;

    static {
        Map f10;
        zzmf zzmfVar = zzmf.JS_INTERNAL_ERROR;
        zzf zzfVar = zzf.zzc;
        f10 = g0.f(q.a(zzmf.JS_NETWORK_ERROR, new zzh(zzf.zze, zzd.zzm)), q.a(zzmfVar, new zzh(zzfVar, zzd.zzk)), q.a(zzmf.JS_INVALID_SITE_KEY, new zzh(zzf.zzf, zzd.zzn)), q.a(zzmf.JS_INVALID_SITE_KEY_TYPE, new zzh(zzf.zzg, zzd.zzo)), q.a(zzmf.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzh(zzf.zzh, zzd.zzp)), q.a(zzmf.JS_INVALID_ACTION, new zzh(zzf.zzi, zzd.zzq)), q.a(zzmf.JS_PROGRAM_ERROR, new zzh(zzfVar, zzd.zzv)));
        zzb = f10;
    }

    public zzh(zzf zzfVar, zzd zzdVar) {
        Map f10;
        this.zzc = zzfVar;
        this.zzd = zzdVar;
        f10 = g0.f(q.a(zzf.zze, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), q.a(zzf.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), q.a(zzf.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), q.a(zzf.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), q.a(zzf.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), q.a(zzf.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)));
        this.zze = f10;
    }

    public final zzd zza() {
        return this.zzd;
    }

    public final zzf zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        RecaptchaException recaptchaException = (RecaptchaException) this.zze.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.UNKNOWN_ERROR, null, 2, null) : recaptchaException;
    }
}
