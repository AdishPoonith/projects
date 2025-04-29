package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import t9.k;
import t9.p;
import t9.x;
/* loaded from: classes.dex */
public final class zzcr {
    public static final zzcr zza = new zzcr();
    private static List zzb;

    static {
        List e10;
        e10 = p.e();
        zzb = e10;
    }

    private zzcr() {
    }

    public static final void acx(int[] iArr) {
        zzb(iArr);
    }

    public static final int zza(int[] iArr) {
        List S;
        List E;
        List list = zzb;
        S = k.S(iArr);
        E = x.E(list, S);
        Iterator it = E.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() ^ ((Number) it.next()).intValue());
            }
            return ((Number) next).intValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final void zzb(int[] iArr) {
        List S;
        S = k.S(iArr);
        zzb = S;
    }
}
