package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public abstract class zzdp implements Iterable {
    private final zzde zza = zzde.zza();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z10 = true;
        for (Object obj : this) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(obj);
            z10 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
