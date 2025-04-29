package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import t9.k;
import t9.q;
/* loaded from: classes.dex */
public final class zzbz implements zzby {
    public static final zzbz zza = new zzbz();

    private zzbz() {
    }

    public static final List zzc(Object obj) {
        List Q;
        List R;
        List T;
        List S;
        List V;
        List P;
        if (obj instanceof byte[]) {
            P = k.P((byte[]) obj);
            return P;
        } else if (obj instanceof short[]) {
            V = k.V((short[]) obj);
            return V;
        } else if (obj instanceof int[]) {
            S = k.S((int[]) obj);
            return S;
        } else if (obj instanceof long[]) {
            T = k.T((long[]) obj);
            return T;
        } else if (obj instanceof float[]) {
            R = k.R((float[]) obj);
            return R;
        } else if (obj instanceof double[]) {
            Q = k.Q((double[]) obj);
            return Q;
        } else {
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        if (objArr.length != 2) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        Object obj2 = objArr[1];
        if (true != (obj2 instanceof Object)) {
            obj2 = null;
        }
        if (obj2 == null) {
            throw new zzt(4, 5, null);
        }
        zzblVar.zzc().zzf(i10, zzb(obj, obj2));
    }

    public final Object zzb(Object obj, Object obj2) {
        int j10;
        Object[] array;
        int j11;
        List<Number> zzc = zzc(obj);
        List<Number> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                j11 = q.j(zzc2, 10);
                ArrayList arrayList = new ArrayList(j11);
                for (Number number : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(number.doubleValue(), ((Number) obj).doubleValue())));
                }
                array = arrayList.toArray(new Double[0]);
                return (Serializable) array;
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            j10 = q.j(zzc, 10);
            ArrayList arrayList2 = new ArrayList(j10);
            for (Number number2 : zzc) {
                arrayList2.add(Double.valueOf(Math.pow(number2.doubleValue(), ((Number) obj2).doubleValue())));
            }
            array = arrayList2.toArray(new Double[0]);
            return (Serializable) array;
        } else if (zzc == null || zzc2 == null) {
            throw new zzt(4, 5, null);
        } else {
            zzbx.zzb(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
            }
            return (Serializable) dArr;
        }
    }
}
