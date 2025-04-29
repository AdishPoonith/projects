package com.google.android.recaptcha.internal;

import ha.f;
import ha.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import ka.d;
import t9.c0;
import t9.q;
import t9.x;
/* loaded from: classes.dex */
public final class zzco implements zzby {
    public static final zzco zza = new zzco();

    private zzco() {
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
        f h10;
        int j10;
        Object array;
        f h11;
        int j11;
        f h12;
        int j12;
        f h13;
        int j13;
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(d.f12805b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] ^ ((Number) obj2).byteValue())));
                    i10++;
                }
                array = x.M(arrayList);
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] ^ ((Number) obj2).intValue()));
                    i10++;
                }
                array = x.O(arrayList2);
            }
            return (Serializable) array;
        }
        if (z10 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b10 ^ ((Number) obj).byteValue())));
            }
            array = arrayList3.toArray(new Byte[0]);
        } else if (z11 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Short.valueOf((short) (s10 ^ ((Number) obj).shortValue())));
            }
            array = arrayList4.toArray(new Short[0]);
        } else if (z12 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 ^ ((Number) obj).intValue()));
            }
            array = arrayList5.toArray(new Integer[0]);
        } else if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j14 : jArr) {
                arrayList6.add(Long.valueOf(j14 ^ ((Number) obj).longValue()));
            }
            array = arrayList6.toArray(new Long[0]);
        } else {
            boolean z14 = obj instanceof byte[];
            if (z14 && (obj2 instanceof Byte)) {
                byte[] bArr2 = (byte[]) obj;
                ArrayList arrayList7 = new ArrayList(bArr2.length);
                for (byte b11 : bArr2) {
                    arrayList7.add(Byte.valueOf((byte) (b11 ^ ((Number) obj2).byteValue())));
                }
                array = arrayList7.toArray(new Byte[0]);
            } else {
                boolean z15 = obj instanceof short[];
                if (z15 && (obj2 instanceof Short)) {
                    short[] sArr2 = (short[]) obj;
                    ArrayList arrayList8 = new ArrayList(sArr2.length);
                    for (short s11 : sArr2) {
                        arrayList8.add(Short.valueOf((short) (s11 ^ ((Number) obj2).shortValue())));
                    }
                    array = arrayList8.toArray(new Short[0]);
                } else {
                    boolean z16 = obj instanceof int[];
                    if (z16 && (obj2 instanceof Integer)) {
                        int[] iArr2 = (int[]) obj;
                        ArrayList arrayList9 = new ArrayList(iArr2.length);
                        for (int i12 : iArr2) {
                            arrayList9.add(Integer.valueOf(i12 ^ ((Number) obj2).intValue()));
                        }
                        array = arrayList9.toArray(new Integer[0]);
                    } else {
                        boolean z17 = obj instanceof long[];
                        if (z17 && (obj2 instanceof Long)) {
                            long[] jArr2 = (long[]) obj;
                            ArrayList arrayList10 = new ArrayList(jArr2.length);
                            for (long j15 : jArr2) {
                                arrayList10.add(Long.valueOf(j15 ^ ((Number) obj2).longValue()));
                            }
                            array = arrayList10.toArray(new Long[0]);
                        } else if (z14 && (obj2 instanceof byte[])) {
                            byte[] bArr3 = (byte[]) obj;
                            int length3 = bArr3.length;
                            byte[] bArr4 = (byte[]) obj2;
                            zzbx.zzb(this, length3, bArr4.length);
                            h13 = i.h(0, length3);
                            j13 = q.j(h13, 10);
                            ArrayList arrayList11 = new ArrayList(j13);
                            Iterator<Integer> it = h13.iterator();
                            while (it.hasNext()) {
                                int a10 = ((c0) it).a();
                                arrayList11.add(Byte.valueOf((byte) (bArr4[a10] ^ bArr3[a10])));
                            }
                            array = arrayList11.toArray(new Byte[0]);
                        } else if (z15 && (obj2 instanceof short[])) {
                            short[] sArr3 = (short[]) obj;
                            int length4 = sArr3.length;
                            short[] sArr4 = (short[]) obj2;
                            zzbx.zzb(this, length4, sArr4.length);
                            h12 = i.h(0, length4);
                            j12 = q.j(h12, 10);
                            ArrayList arrayList12 = new ArrayList(j12);
                            Iterator<Integer> it2 = h12.iterator();
                            while (it2.hasNext()) {
                                int a11 = ((c0) it2).a();
                                arrayList12.add(Short.valueOf((short) (sArr4[a11] ^ sArr3[a11])));
                            }
                            array = arrayList12.toArray(new Short[0]);
                        } else if (z16 && (obj2 instanceof int[])) {
                            int[] iArr3 = (int[]) obj;
                            int length5 = iArr3.length;
                            int[] iArr4 = (int[]) obj2;
                            zzbx.zzb(this, length5, iArr4.length);
                            h11 = i.h(0, length5);
                            j11 = q.j(h11, 10);
                            ArrayList arrayList13 = new ArrayList(j11);
                            Iterator<Integer> it3 = h11.iterator();
                            while (it3.hasNext()) {
                                int a12 = ((c0) it3).a();
                                arrayList13.add(Integer.valueOf(iArr4[a12] ^ iArr3[a12]));
                            }
                            array = arrayList13.toArray(new Integer[0]);
                        } else if (!z17 || !(obj2 instanceof long[])) {
                            throw new zzt(4, 5, null);
                        } else {
                            long[] jArr3 = (long[]) obj;
                            int length6 = jArr3.length;
                            long[] jArr4 = (long[]) obj2;
                            zzbx.zzb(this, length6, jArr4.length);
                            h10 = i.h(0, length6);
                            j10 = q.j(h10, 10);
                            ArrayList arrayList14 = new ArrayList(j10);
                            Iterator<Integer> it4 = h10.iterator();
                            while (it4.hasNext()) {
                                int a13 = ((c0) it4).a();
                                arrayList14.add(Long.valueOf(jArr3[a13] ^ jArr4[a13]));
                            }
                            array = arrayList14.toArray(new Long[0]);
                        }
                    }
                }
            }
        }
        return (Serializable) array;
    }
}
