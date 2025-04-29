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
public final class zzcg implements zzby {
    public static final zzcg zza = new zzcg();

    private zzcg() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        f h10;
        int j10;
        Object array;
        f h11;
        int j11;
        f h12;
        int j12;
        f h13;
        int j13;
        f h14;
        int j14;
        f h15;
        int j15;
        byte[] M;
        boolean z12 = obj instanceof Byte;
        if ((z12 && (obj2 instanceof Byte)) || ((((z10 = obj instanceof Short)) && (obj2 instanceof Short)) || (((z11 = obj instanceof Integer)) && (obj2 instanceof Integer)))) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z14 = obj instanceof Float;
        if (z14 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z15 = obj instanceof Double;
        if (z15 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(d.f12805b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] % ((Number) obj2).intValue())));
                    i10++;
                }
                M = x.M(arrayList);
                return new String(M, d.f12805b);
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] % ((Number) obj2).intValue()));
                    i10++;
                }
                array = x.O(arrayList2);
                return (Serializable) array;
            }
        }
        if (z12 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Integer.valueOf(b10 % ((Number) obj).intValue()));
            }
            array = arrayList3.toArray(new Integer[0]);
        } else if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Integer.valueOf(s10 % ((Number) obj).intValue()));
            }
            array = arrayList4.toArray(new Integer[0]);
        } else if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 % ((Number) obj).intValue()));
            }
            array = arrayList5.toArray(new Integer[0]);
        } else if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j16 : jArr) {
                arrayList6.add(Long.valueOf(j16 % ((Number) obj).longValue()));
            }
            array = arrayList6.toArray(new Long[0]);
        } else if (z14 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f10 : fArr) {
                arrayList7.add(Float.valueOf(f10 % ((Number) obj).floatValue()));
            }
            array = arrayList7.toArray(new Float[0]);
        } else if (z15 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d10 : dArr) {
                arrayList8.add(Double.valueOf(d10 % ((Number) obj).doubleValue()));
            }
            array = arrayList8.toArray(new Double[0]);
        } else {
            boolean z16 = obj instanceof byte[];
            if (z16 && (obj2 instanceof Byte)) {
                byte[] bArr2 = (byte[]) obj;
                ArrayList arrayList9 = new ArrayList(bArr2.length);
                for (byte b11 : bArr2) {
                    arrayList9.add(Integer.valueOf(b11 % ((Number) obj2).intValue()));
                }
                array = arrayList9.toArray(new Integer[0]);
            } else {
                boolean z17 = obj instanceof short[];
                if (z17 && (obj2 instanceof Short)) {
                    short[] sArr2 = (short[]) obj;
                    ArrayList arrayList10 = new ArrayList(sArr2.length);
                    for (short s11 : sArr2) {
                        arrayList10.add(Integer.valueOf(s11 % ((Number) obj2).intValue()));
                    }
                    array = arrayList10.toArray(new Integer[0]);
                } else {
                    boolean z18 = obj instanceof int[];
                    if (z18 && (obj2 instanceof Integer)) {
                        int[] iArr2 = (int[]) obj;
                        int length3 = iArr2.length;
                        ArrayList arrayList11 = new ArrayList(length3);
                        while (i10 < length3) {
                            arrayList11.add(Integer.valueOf(iArr2[i10] % ((Number) obj2).intValue()));
                            i10++;
                        }
                        array = x.O(arrayList11);
                    } else {
                        boolean z19 = obj instanceof long[];
                        if (z19 && (obj2 instanceof Long)) {
                            long[] jArr2 = (long[]) obj;
                            ArrayList arrayList12 = new ArrayList(jArr2.length);
                            for (long j17 : jArr2) {
                                arrayList12.add(Long.valueOf(j17 % ((Number) obj2).longValue()));
                            }
                            array = arrayList12.toArray(new Long[0]);
                        } else {
                            boolean z20 = obj instanceof float[];
                            if (z20 && (obj2 instanceof Float)) {
                                float[] fArr2 = (float[]) obj;
                                ArrayList arrayList13 = new ArrayList(fArr2.length);
                                for (float f11 : fArr2) {
                                    arrayList13.add(Float.valueOf(f11 % ((Number) obj2).floatValue()));
                                }
                                array = arrayList13.toArray(new Float[0]);
                            } else {
                                boolean z21 = obj instanceof double[];
                                if (z21 && (obj2 instanceof Double)) {
                                    double[] dArr2 = (double[]) obj;
                                    ArrayList arrayList14 = new ArrayList(dArr2.length);
                                    for (double d11 : dArr2) {
                                        arrayList14.add(Double.valueOf(d11 % ((Number) obj2).doubleValue()));
                                    }
                                    array = arrayList14.toArray(new Double[0]);
                                } else if (z16 && (obj2 instanceof byte[])) {
                                    byte[] bArr3 = (byte[]) obj;
                                    int length4 = bArr3.length;
                                    byte[] bArr4 = (byte[]) obj2;
                                    zzbx.zzb(this, length4, bArr4.length);
                                    h15 = i.h(0, length4);
                                    j15 = q.j(h15, 10);
                                    ArrayList arrayList15 = new ArrayList(j15);
                                    Iterator<Integer> it = h15.iterator();
                                    while (it.hasNext()) {
                                        int a10 = ((c0) it).a();
                                        arrayList15.add(Integer.valueOf(bArr3[a10] % bArr4[a10]));
                                    }
                                    array = arrayList15.toArray(new Integer[0]);
                                } else if (z17 && (obj2 instanceof short[])) {
                                    short[] sArr3 = (short[]) obj;
                                    int length5 = sArr3.length;
                                    short[] sArr4 = (short[]) obj2;
                                    zzbx.zzb(this, length5, sArr4.length);
                                    h14 = i.h(0, length5);
                                    j14 = q.j(h14, 10);
                                    ArrayList arrayList16 = new ArrayList(j14);
                                    Iterator<Integer> it2 = h14.iterator();
                                    while (it2.hasNext()) {
                                        int a11 = ((c0) it2).a();
                                        arrayList16.add(Integer.valueOf(sArr3[a11] % sArr4[a11]));
                                    }
                                    array = arrayList16.toArray(new Integer[0]);
                                } else if (z18 && (obj2 instanceof int[])) {
                                    int[] iArr3 = (int[]) obj;
                                    int length6 = iArr3.length;
                                    int[] iArr4 = (int[]) obj2;
                                    zzbx.zzb(this, length6, iArr4.length);
                                    h13 = i.h(0, length6);
                                    j13 = q.j(h13, 10);
                                    ArrayList arrayList17 = new ArrayList(j13);
                                    Iterator<Integer> it3 = h13.iterator();
                                    while (it3.hasNext()) {
                                        int a12 = ((c0) it3).a();
                                        arrayList17.add(Integer.valueOf(iArr3[a12] % iArr4[a12]));
                                    }
                                    array = arrayList17.toArray(new Integer[0]);
                                } else if (z19 && (obj2 instanceof long[])) {
                                    long[] jArr3 = (long[]) obj;
                                    int length7 = jArr3.length;
                                    long[] jArr4 = (long[]) obj2;
                                    zzbx.zzb(this, length7, jArr4.length);
                                    h12 = i.h(0, length7);
                                    j12 = q.j(h12, 10);
                                    ArrayList arrayList18 = new ArrayList(j12);
                                    Iterator<Integer> it4 = h12.iterator();
                                    while (it4.hasNext()) {
                                        int a13 = ((c0) it4).a();
                                        arrayList18.add(Long.valueOf(jArr3[a13] % jArr4[a13]));
                                    }
                                    array = arrayList18.toArray(new Long[0]);
                                } else if (z20 && (obj2 instanceof float[])) {
                                    float[] fArr3 = (float[]) obj;
                                    int length8 = fArr3.length;
                                    float[] fArr4 = (float[]) obj2;
                                    zzbx.zzb(this, length8, fArr4.length);
                                    h11 = i.h(0, length8);
                                    j11 = q.j(h11, 10);
                                    ArrayList arrayList19 = new ArrayList(j11);
                                    Iterator<Integer> it5 = h11.iterator();
                                    while (it5.hasNext()) {
                                        int a14 = ((c0) it5).a();
                                        arrayList19.add(Float.valueOf(fArr3[a14] % fArr4[a14]));
                                    }
                                    array = arrayList19.toArray(new Float[0]);
                                } else if (!z21 || !(obj2 instanceof double[])) {
                                    throw new zzt(4, 5, null);
                                } else {
                                    double[] dArr3 = (double[]) obj;
                                    int length9 = dArr3.length;
                                    double[] dArr4 = (double[]) obj2;
                                    zzbx.zzb(this, length9, dArr4.length);
                                    h10 = i.h(0, length9);
                                    j10 = q.j(h10, 10);
                                    ArrayList arrayList20 = new ArrayList(j10);
                                    Iterator<Integer> it6 = h10.iterator();
                                    while (it6.hasNext()) {
                                        int a15 = ((c0) it6).a();
                                        arrayList20.add(Double.valueOf(dArr3[a15] % dArr4[a15]));
                                    }
                                    array = arrayList20.toArray(new Double[0]);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (Serializable) array;
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
        try {
            zzblVar.zzc().zzf(i10, zzb(obj, obj2));
        } catch (ArithmeticException e10) {
            throw new zzt(4, 6, e10);
        }
    }
}
