package com.google.android.recaptcha.internal;

import java.util.Collection;
import ka.d;
import t9.k;
import t9.x;
/* loaded from: classes.dex */
public final class zzbt implements zzby {
    public static final zzbt zza = new zzbt();

    private zzbt() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        String z10;
        String str;
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        if (obj instanceof int[]) {
            z10 = k.G((int[]) obj, ",", "[", "]", 0, null, null, 56, null);
        } else {
            if (obj instanceof byte[]) {
                str = new String((byte[]) obj, d.f12805b);
            } else if (obj instanceof long[]) {
                z10 = k.H((long[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof short[]) {
                z10 = k.J((short[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof float[]) {
                z10 = k.F((float[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof double[]) {
                z10 = k.E((double[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof char[]) {
                str = new String((char[]) obj);
            } else if (obj instanceof Object[]) {
                z10 = k.I((Object[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (!(obj instanceof Collection)) {
                throw new zzt(4, 5, null);
            } else {
                z10 = x.z((Iterable) obj, ",", "[", "]", 0, null, null, 56, null);
            }
            z10 = str;
        }
        zzblVar.zzc().zzf(i10, z10);
    }
}
