package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import b4.f;
/* loaded from: classes.dex */
public final class zzu {
    public static final zzu zza = new zzu();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final f zzc = f.e();

    private zzu() {
    }

    public static final String zza(Context context) {
        int f10 = zzc.f(context);
        return (f10 == 1 || f10 == 3 || f10 == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }

    public static final String zzb() {
        return zzb;
    }
}
