package z0;

import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f20673a = new i();

    private i() {
    }

    public static final void a(a x10, a b10) {
        if (k1.a.d(i.class)) {
            return;
        }
        try {
            l.e(x10, "x");
            l.e(b10, "b");
            int b11 = x10.b(0);
            int b12 = x10.b(1);
            int b13 = x10.b(2);
            float[] a10 = x10.a();
            float[] a11 = b10.a();
            if (b11 <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (b12 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        if (b13 > 0) {
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                int i16 = (i10 * b12 * b13) + (i12 * b13) + i14;
                                a10[i16] = a10[i16] + a11[i14];
                                if (i15 >= b13) {
                                    break;
                                }
                                i14 = i15;
                            }
                        }
                        if (i13 >= b12) {
                            break;
                        }
                        i12 = i13;
                    }
                }
                if (i11 >= b11) {
                    return;
                }
                i10 = i11;
            }
        } catch (Throwable th) {
            k1.a.b(th, i.class);
        }
    }

    public static final a b(a[] tensors) {
        int i10;
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            l.e(tensors, "tensors");
            int b10 = tensors[0].b(0);
            int length = tensors.length - 1;
            if (length >= 0) {
                int i11 = 0;
                i10 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    i10 += tensors[i11].b(1);
                    if (i12 > length) {
                        break;
                    }
                    i11 = i12;
                }
            } else {
                i10 = 0;
            }
            a aVar = new a(new int[]{b10, i10});
            float[] a10 = aVar.a();
            if (b10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    int i15 = i13 * i10;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            int i17 = i16 + 1;
                            float[] a11 = tensors[i16].a();
                            int b11 = tensors[i16].b(1);
                            System.arraycopy(a11, i13 * b11, a10, i15, b11);
                            i15 += b11;
                            if (i17 > length2) {
                                break;
                            }
                            i16 = i17;
                        }
                    }
                    if (i14 >= b10) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return aVar;
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final a c(a x10, a w10) {
        Class<i> cls;
        Class<i> cls2;
        a aVar;
        Class<i> cls3 = i.class;
        if (k1.a.d(cls3)) {
            return null;
        }
        try {
            l.e(x10, "x");
            l.e(w10, "w");
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            int b12 = x10.b(2);
            int b13 = w10.b(0);
            int i10 = (b11 - b13) + 1;
            int b14 = w10.b(2);
            a aVar2 = new a(new int[]{b10, i10, b14});
            float[] a10 = x10.a();
            float[] a11 = aVar2.a();
            float[] a12 = w10.a();
            if (b10 <= 0) {
                return aVar2;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (b14 > 0) {
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        if (i10 > 0) {
                            int i15 = 0;
                            while (true) {
                                int i16 = i15 + 1;
                                float f10 = 0.0f;
                                if (b13 > 0) {
                                    int i17 = 0;
                                    while (true) {
                                        cls2 = cls3;
                                        int i18 = i17 + 1;
                                        if (b12 > 0) {
                                            int i19 = 0;
                                            while (true) {
                                                aVar = aVar2;
                                                int i20 = i19 + 1;
                                                try {
                                                    f10 += a10[(b11 * b12 * i11) + ((i17 + i15) * b12) + i19] * a12[(((i17 * b12) + i19) * b14) + i13];
                                                    if (i20 >= b12) {
                                                        break;
                                                    }
                                                    i19 = i20;
                                                    aVar2 = aVar;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cls = cls2;
                                                    k1.a.b(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            aVar = aVar2;
                                        }
                                        if (i18 >= b13) {
                                            break;
                                        }
                                        i17 = i18;
                                        cls3 = cls2;
                                        aVar2 = aVar;
                                    }
                                } else {
                                    cls2 = cls3;
                                    aVar = aVar2;
                                }
                                a11[(i10 * b14 * i11) + (i15 * b14) + i13] = f10;
                                if (i16 >= i10) {
                                    break;
                                }
                                i15 = i16;
                                cls3 = cls2;
                                aVar2 = aVar;
                            }
                        } else {
                            cls2 = cls3;
                            aVar = aVar2;
                        }
                        if (i14 >= b14) {
                            break;
                        }
                        i13 = i14;
                        cls3 = cls2;
                        aVar2 = aVar;
                    }
                } else {
                    cls2 = cls3;
                    aVar = aVar2;
                }
                if (i12 >= b10) {
                    return aVar;
                }
                i11 = i12;
                cls3 = cls2;
                aVar2 = aVar;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls3;
        }
    }

    public static final a d(a x10, a w10, a b10) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            l.e(x10, "x");
            l.e(w10, "w");
            l.e(b10, "b");
            int b11 = x10.b(0);
            int b12 = b10.b(0);
            a h10 = h(x10, w10);
            float[] a10 = b10.a();
            float[] a11 = h10.a();
            if (b11 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (b12 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = (i10 * b12) + i12;
                            a11[i14] = a11[i14] + a10[i12];
                            if (i13 >= b12) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= b11) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return h10;
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final a e(String[] texts, int i10, a w10) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            l.e(texts, "texts");
            l.e(w10, "w");
            int length = texts.length;
            int b10 = w10.b(1);
            a aVar = new a(new int[]{length, i10, b10});
            float[] a10 = aVar.a();
            float[] a11 = w10.a();
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    int[] d10 = j.f20674a.d(texts[i11], i10);
                    if (i10 > 0) {
                        int i13 = 0;
                        while (true) {
                            int i14 = i13 + 1;
                            System.arraycopy(a11, d10[i13] * b10, a10, (b10 * i10 * i11) + (i13 * b10), b10);
                            if (i14 >= i10) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return aVar;
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final void f(a x10, int i10) {
        if (k1.a.d(i.class)) {
            return;
        }
        try {
            l.e(x10, "x");
            if (i10 >= x10.c()) {
                return;
            }
            int c10 = x10.c();
            int i11 = 1;
            if (i10 < c10) {
                int i12 = i10;
                while (true) {
                    int i13 = i12 + 1;
                    i11 *= x10.b(i12);
                    if (i13 >= c10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            int[] iArr = new int[i10 + 1];
            int i14 = 0;
            if (i10 > 0) {
                while (true) {
                    int i15 = i14 + 1;
                    iArr[i14] = x10.b(i14);
                    if (i15 >= i10) {
                        break;
                    }
                    i14 = i15;
                }
            }
            iArr[i10] = i11;
            x10.d(iArr);
        } catch (Throwable th) {
            k1.a.b(th, i.class);
        }
    }

    public static final a g(a x10, int i10) {
        int i11;
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            l.e(x10, "x");
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            int b12 = x10.b(2);
            int i12 = (b11 - i10) + 1;
            a aVar = new a(new int[]{b10, i12, b12});
            float[] a10 = x10.a();
            float[] a11 = aVar.a();
            if (b10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (b12 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    int i19 = i17 * b12;
                                    int i20 = (i13 * i12 * b12) + i19 + i15;
                                    int i21 = (i13 * b11 * b12) + i19 + i15;
                                    a11[i20] = Float.MIN_VALUE;
                                    if (i10 > 0) {
                                        int i22 = 0;
                                        while (true) {
                                            int i23 = i22 + 1;
                                            i11 = b11;
                                            a11[i20] = Math.max(a11[i20], a10[i21 + (i22 * b12)]);
                                            if (i23 >= i10) {
                                                break;
                                            }
                                            i22 = i23;
                                            b11 = i11;
                                        }
                                    } else {
                                        i11 = b11;
                                    }
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    i17 = i18;
                                    b11 = i11;
                                }
                            } else {
                                i11 = b11;
                            }
                            if (i16 >= b12) {
                                break;
                            }
                            i15 = i16;
                            b11 = i11;
                        }
                    } else {
                        i11 = b11;
                    }
                    if (i14 >= b10) {
                        break;
                    }
                    i13 = i14;
                    b11 = i11;
                }
            }
            return aVar;
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final a h(a x10, a w10) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            l.e(x10, "x");
            l.e(w10, "w");
            int b10 = x10.b(0);
            int b11 = w10.b(0);
            int b12 = w10.b(1);
            a aVar = new a(new int[]{b10, b12});
            float[] a10 = x10.a();
            float[] a11 = w10.a();
            float[] a12 = aVar.a();
            if (b10 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (b12 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = (i10 * b12) + i12;
                            a12[i14] = 0.0f;
                            if (b11 > 0) {
                                int i15 = 0;
                                while (true) {
                                    int i16 = i15 + 1;
                                    a12[i14] = a12[i14] + (a10[(i10 * b11) + i15] * a11[(i15 * b12) + i12]);
                                    if (i16 >= b11) {
                                        break;
                                    }
                                    i15 = i16;
                                }
                            }
                            if (i13 >= b12) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= b10) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final void i(a x10) {
        if (k1.a.d(i.class)) {
            return;
        }
        try {
            l.e(x10, "x");
            float[] a10 = x10.a();
            int i10 = 0;
            int length = a10.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                if (a10[i10] < 0.0f) {
                    a10[i10] = 0.0f;
                }
                if (i11 > length) {
                    return;
                }
                i10 = i11;
            }
        } catch (Throwable th) {
            k1.a.b(th, i.class);
        }
    }

    public static final void j(a x10) {
        if (k1.a.d(i.class)) {
            return;
        }
        try {
            l.e(x10, "x");
            int i10 = 0;
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            float[] a10 = x10.a();
            if (b10 <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                int i12 = i10 * b11;
                int i13 = i12 + b11;
                float f10 = Float.MIN_VALUE;
                float f11 = 0.0f;
                if (i12 < i13) {
                    int i14 = i12;
                    while (true) {
                        int i15 = i14 + 1;
                        if (a10[i14] > f10) {
                            f10 = a10[i14];
                        }
                        if (i15 >= i13) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                if (i12 < i13) {
                    int i16 = i12;
                    while (true) {
                        int i17 = i16 + 1;
                        a10[i16] = (float) Math.exp(a10[i16] - f10);
                        f11 += a10[i16];
                        if (i17 >= i13) {
                            break;
                        }
                        i16 = i17;
                    }
                }
                if (i12 < i13) {
                    while (true) {
                        int i18 = i12 + 1;
                        a10[i12] = a10[i12] / f11;
                        if (i18 >= i13) {
                            break;
                        }
                        i12 = i18;
                    }
                }
                if (i11 >= b10) {
                    return;
                }
                i10 = i11;
            }
        } catch (Throwable th) {
            k1.a.b(th, i.class);
        }
    }

    public static final a k(a x10) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            l.e(x10, "x");
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            a aVar = new a(new int[]{b11, b10});
            float[] a10 = x10.a();
            float[] a11 = aVar.a();
            if (b10 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (b11 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            a11[(i12 * b10) + i10] = a10[(i10 * b11) + i12];
                            if (i13 >= b11) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= b10) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }

    public static final a l(a x10) {
        if (k1.a.d(i.class)) {
            return null;
        }
        try {
            l.e(x10, "x");
            int b10 = x10.b(0);
            int b11 = x10.b(1);
            int b12 = x10.b(2);
            a aVar = new a(new int[]{b12, b11, b10});
            float[] a10 = x10.a();
            float[] a11 = aVar.a();
            if (b10 > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (b11 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (b12 > 0) {
                                int i14 = 0;
                                while (true) {
                                    int i15 = i14 + 1;
                                    a11[(i14 * b10 * b11) + (i12 * b10) + i10] = a10[(i10 * b11 * b12) + (i12 * b12) + i14];
                                    if (i15 >= b12) {
                                        break;
                                    }
                                    i14 = i15;
                                }
                            }
                            if (i13 >= b11) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= b10) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th) {
            k1.a.b(th, i.class);
            return null;
        }
    }
}
