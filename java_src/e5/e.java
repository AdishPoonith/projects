package e5;

import b5.n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class e extends f {

    /* loaded from: classes.dex */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: j  reason: collision with root package name */
        final int[] f8119j;

        /* renamed from: k  reason: collision with root package name */
        final int f8120k;

        /* renamed from: l  reason: collision with root package name */
        final int f8121l;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        a(int[] iArr, int i10, int i11) {
            this.f8119j = iArr;
            this.f8120k = i10;
            this.f8121l = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public Integer get(int i10) {
            n.l(i10, size());
            return Integer.valueOf(this.f8119j[this.f8120k + i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && e.h(this.f8119j, ((Integer) obj).intValue(), this.f8120k, this.f8121l) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public Integer set(int i10, Integer num) {
            n.l(i10, size());
            int[] iArr = this.f8119j;
            int i11 = this.f8120k;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) n.n(num)).intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f8119j[this.f8120k + i10] != aVar.f8119j[aVar.f8120k + i10]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f8120k; i11 < this.f8121l; i11++) {
                i10 = (i10 * 31) + e.f(this.f8119j[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int h10;
            if (!(obj instanceof Integer) || (h10 = e.h(this.f8119j, ((Integer) obj).intValue(), this.f8120k, this.f8121l)) < 0) {
                return -1;
            }
            return h10 - this.f8120k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        int[] k() {
            return Arrays.copyOfRange(this.f8119j, this.f8120k, this.f8121l);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int i10;
            if (!(obj instanceof Integer) || (i10 = e.i(this.f8119j, ((Integer) obj).intValue(), this.f8120k, this.f8121l)) < 0) {
                return -1;
            }
            return i10 - this.f8120k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f8121l - this.f8120k;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            n.s(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f8119j;
            int i12 = this.f8120k;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f8119j[this.f8120k]);
            int i10 = this.f8120k;
            while (true) {
                i10++;
                if (i10 >= this.f8121l) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f8119j[i10]);
            }
        }
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        n.i(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int f(int i10) {
        return i10;
    }

    public static int g(int[] iArr, int i10) {
        return h(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int j(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] k(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).k();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) n.n(array[i10])).intValue();
        }
        return iArr;
    }
}
