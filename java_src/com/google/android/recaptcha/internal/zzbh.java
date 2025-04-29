package com.google.android.recaptcha.internal;

import s9.r;
/* loaded from: classes.dex */
public final /* synthetic */ class zzbh {
    public static String zza(zzbi zzbiVar, String str, byte b10) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append((char) r.b(r.b(str.charAt(i10)) ^ r.b(b10)));
        }
        return sb.toString();
    }
}
