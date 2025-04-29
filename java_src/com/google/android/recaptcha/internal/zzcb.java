package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import t9.q;
/* loaded from: classes.dex */
public final class zzcb implements zzby {
    public static final zzcb zza = new zzcb();

    private zzcb() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        int j10;
        int length = objArr.length;
        if (length == 0) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Class)) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls == null) {
            throw new zzt(4, 5, null);
        }
        ArrayList<Object> arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Object obj2 = objArr[i11];
            int i13 = i12 + 1;
            if (i12 > 0) {
                arrayList.add(obj2);
            }
            i11++;
            i12 = i13;
        }
        j10 = q.j(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(j10);
        for (Object obj3 : arrayList) {
            arrayList2.add(zzbk.zza(obj3));
        }
        Class[] clsArr = (Class[]) arrayList2.toArray(new Class[0]);
        try {
            zzblVar.zzc().zzf(i10, cls.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length)));
        } catch (Exception e10) {
            throw new zzt(6, 9, e10);
        }
    }
}
