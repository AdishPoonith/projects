package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzbw implements zzby {
    public static final zzbw zza = new zzbw();

    private zzbw() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        Object obj;
        if (objArr.length != 2) {
            throw new zzt(4, 3, null);
        }
        Object obj2 = objArr[0];
        if (true != (obj2 instanceof Object)) {
            obj2 = null;
        }
        if (obj2 == null) {
            throw new zzt(4, 5, null);
        }
        Object obj3 = objArr[1];
        if (true != (obj3 instanceof Integer)) {
            obj3 = null;
        }
        Integer num = (Integer) obj3;
        if (num == null) {
            throw new zzt(4, 5, null);
        }
        int intValue = num.intValue();
        try {
            if (obj2 instanceof Integer) {
                obj = Integer.valueOf(((Number) obj2).intValue() / intValue);
            } else if (!(obj2 instanceof int[])) {
                throw new zzt(4, 5, null);
            } else {
                int[] iArr = (int[]) obj2;
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i11 : iArr) {
                    arrayList.add(Integer.valueOf(i11 / intValue));
                }
                obj = (Serializable) arrayList.toArray(new Integer[0]);
            }
            zzblVar.zzc().zzf(i10, obj);
        } catch (ArithmeticException e10) {
            throw new zzt(4, 6, e10);
        }
    }
}
