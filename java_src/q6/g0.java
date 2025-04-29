package q6;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.z;
import i9.j1;
import i9.k1;
import i9.l1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Random f16273a = new SecureRandom();

    /* renamed from: b  reason: collision with root package name */
    private static final Continuation<Void, Void> f16274b = new Continuation() { // from class: q6.b0
        @Override // com.google.android.gms.tasks.Continuation
        public final Object then(Task task) {
            Void y10;
            y10 = g0.y(task);
            return y10;
        }
    };

    public static String A(com.google.protobuf.i iVar) {
        int size = iVar.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i10 = 0; i10 < size; i10++) {
            int l10 = iVar.l(i10) & 255;
            sb.append(Character.forDigit(l10 >>> 4, 16));
            sb.append(Character.forDigit(l10 & 15, 16));
        }
        return sb.toString();
    }

    public static String B(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    public static Continuation<Void, Void> C() {
        return f16274b;
    }

    private static <T> T e(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static List<Object> f(int i10, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 != 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            Collections.addAll(arrayList, objArr);
            for (int i11 = 0; i11 < arrayList.size(); i11 += 2) {
                Object obj3 = arrayList.get(i11);
                if (!(obj3 instanceof String) && !(obj3 instanceof com.google.firebase.firestore.q)) {
                    throw new IllegalArgumentException("Excepted field name at argument position " + (i11 + i10 + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
    }

    public static <T extends Comparable<T>> Comparator<T> g() {
        return new Comparator() { // from class: q6.f0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        };
    }

    public static int h(boolean z10, boolean z11) {
        if (z10 == z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public static int i(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = bArr2[i10] & 255;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        return l(bArr.length, bArr2.length);
    }

    public static int j(com.google.protobuf.i iVar, com.google.protobuf.i iVar2) {
        int min = Math.min(iVar.size(), iVar2.size());
        for (int i10 = 0; i10 < min; i10++) {
            int l10 = iVar.l(i10) & 255;
            int l11 = iVar2.l(i10) & 255;
            if (l10 < l11) {
                return -1;
            }
            if (l10 > l11) {
                return 1;
            }
        }
        return l(iVar.size(), iVar2.size());
    }

    public static int k(double d10, double d11) {
        return a5.a.c(d10, d11);
    }

    public static int l(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int m(long j10, long j11) {
        return a5.a.a(j10, j11);
    }

    public static int n(double d10, long j10) {
        return a5.a.b(d10, j10);
    }

    private static Exception o(Exception exc) {
        j1 a10;
        if (exc instanceof k1) {
            a10 = ((k1) exc).a();
        } else if (!(exc instanceof l1)) {
            return exc;
        } else {
            a10 = ((l1) exc).a();
        }
        return t(a10);
    }

    public static void p(final RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: q6.c0
            @Override // java.lang.Runnable
            public final void run() {
                g0.v(runtimeException);
            }
        });
    }

    public static <T> void q(Collection<T> collection, Collection<T> collection2, Comparator<T> comparator, n<T> nVar, n<T> nVar2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        r(arrayList.iterator(), arrayList2.iterator(), comparator, nVar, nVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r4 > 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
        r2 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029 A[EDGE_INSN: B:22:0x0029->B:25:0x0000 ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> void r(java.util.Iterator<T> r5, java.util.Iterator<T> r6, java.util.Comparator<? super T> r7, q6.n<T> r8, q6.n<T> r9) {
        /*
        L0:
            java.lang.Object r0 = e(r5)
        L4:
            java.lang.Object r1 = e(r6)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1e
            if (r1 == 0) goto L1e
            int r4 = r7.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L23
        L1b:
            if (r4 <= 0) goto L22
            goto L21
        L1e:
            if (r0 == 0) goto L21
            goto L23
        L21:
            r2 = 1
        L22:
            r3 = 0
        L23:
            if (r2 == 0) goto L29
            r8.accept(r1)
            goto L4
        L29:
            if (r3 == 0) goto L0
            r9.accept(r0)
            java.lang.Object r0 = e(r5)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.g0.r(java.util.Iterator, java.util.Iterator, java.util.Comparator, q6.n, q6.n):void");
    }

    public static <T extends Comparable<T>> void s(SortedSet<T> sortedSet, SortedSet<T> sortedSet2, n<T> nVar, n<T> nVar2) {
        r(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new Comparator() { // from class: q6.e0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareTo;
                compareTo = ((Comparable) obj).compareTo((Comparable) obj2);
                return compareTo;
            }
        }, nVar, nVar2);
    }

    public static com.google.firebase.firestore.z t(j1 j1Var) {
        k1 c10 = j1Var.c();
        return new com.google.firebase.firestore.z(c10.getMessage(), z.a.g(j1Var.m().h()), c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> u(Map<K, V> map, int i10, final Comparator<V> comparator) {
        if (map.size() <= i10) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: q6.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x10;
                x10 = g0.x(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                return x10;
            }
        });
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            hashMap.put(((Map.Entry) arrayList.get(i11)).getKey(), ((Map.Entry) arrayList.get(i11)).getValue());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int x(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return comparator.compare(entry.getValue(), entry2.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void y(Task task) {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception o10 = o(task.getException());
        if (o10 instanceof com.google.firebase.firestore.z) {
            throw o10;
        }
        throw new com.google.firebase.firestore.z(o10.getMessage(), z.a.UNKNOWN, o10);
    }

    public static StringBuilder z(CharSequence charSequence, int i10, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i10 != 0) {
            sb.append(charSequence);
            for (int i11 = 1; i11 < i10; i11++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }
}
