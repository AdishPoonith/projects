package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f12851a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        l.e(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i12 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        l.d(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        l.d(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f12851a;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        l.e(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            l.c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i12 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                l.d(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                l.d(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i10 = i11;
        }
    }
}
