package com.google.android.recaptcha.internal;

import la.a1;
import la.i;
import la.k0;
import la.l0;
import la.u2;
/* loaded from: classes.dex */
public final class zzp {
    public static final zzp zza = new zzp();
    private static final k0 zzb = l0.b();
    private static final k0 zzc;
    private static final k0 zzd;

    static {
        k0 a10 = l0.a(u2.d("reCaptcha"));
        i.d(a10, null, null, new zzo(null), 3, null);
        zzc = a10;
        zzd = l0.a(a1.b());
    }

    private zzp() {
    }

    public static final k0 zza() {
        return zzd;
    }

    public static final k0 zzb() {
        return zzb;
    }

    public static final k0 zzc() {
        return zzc;
    }
}
