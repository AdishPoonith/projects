package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.Set;
import ka.q;
import kotlin.jvm.internal.l;
import t9.x;
/* loaded from: classes.dex */
public final class zzbj {
    public static final zzbj zza = new zzbj();
    private static Set zzb;
    private static Set zzc;
    private static Long zzd;
    private static int zze;

    private zzbj() {
    }

    public static final void zza(zzlr zzlrVar) {
        Set T;
        Set T2;
        T = x.T(zzlrVar.zzf().zzi());
        zzb = T;
        T2 = x.T(zzlrVar.zzg().zzi());
        zzc = T2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object zzb(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, android.content.Context r22, com.google.android.recaptcha.internal.zzr r23, v9.d r24) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbj.zzb(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context, com.google.android.recaptcha.internal.zzr, v9.d):java.lang.Object");
    }

    public static final boolean zzc(String str) {
        Set set = zzb;
        if (set == null || zzc == null) {
            if (zzd == null) {
                zzd = Long.valueOf(System.currentTimeMillis());
            }
            zze++;
            return true;
        }
        l.c(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = zzc;
        l.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzd(str, set2)) {
            return false;
        }
        return zzd(str, set);
    }

    private static final boolean zzd(String str, Set set) {
        List<String> a02;
        a02 = q.a0(str, new char[]{'.'}, false, 0, 6, null);
        String str2 = "";
        for (String str3 : a02) {
            String concat = str2.concat(String.valueOf(str3));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }
}
