package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final l0 f7240a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final l0 f7241b = new c();

    /* loaded from: classes.dex */
    private static final class b extends l0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f7242c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) z1.G(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j10, int i10) {
            List<L> c10;
            j0 j0Var;
            List<L> f10 = f(obj, j10);
            if (!f10.isEmpty()) {
                if (f7242c.isAssignableFrom(f10.getClass())) {
                    ArrayList arrayList = new ArrayList(f10.size() + i10);
                    arrayList.addAll(f10);
                    j0Var = arrayList;
                } else if (f10 instanceof y1) {
                    j0 j0Var2 = new j0(f10.size() + i10);
                    j0Var2.addAll((y1) f10);
                    j0Var = j0Var2;
                } else if (!(f10 instanceof g1) || !(f10 instanceof d0.i)) {
                    return f10;
                } else {
                    d0.i iVar = (d0.i) f10;
                    if (iVar.h()) {
                        return f10;
                    }
                    c10 = iVar.c(f10.size() + i10);
                }
                z1.V(obj, j10, j0Var);
                return j0Var;
            }
            c10 = f10 instanceof k0 ? new j0(i10) : ((f10 instanceof g1) && (f10 instanceof d0.i)) ? ((d0.i) f10).c(i10) : new ArrayList<>(i10);
            z1.V(obj, j10, c10);
            return c10;
        }

        @Override // com.google.protobuf.l0
        void c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) z1.G(obj, j10);
            if (list instanceof k0) {
                unmodifiableList = ((k0) list).d();
            } else if (f7242c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof g1) && (list instanceof d0.i)) {
                    d0.i iVar = (d0.i) list;
                    if (iVar.h()) {
                        iVar.a();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            z1.V(obj, j10, unmodifiableList);
        }

        @Override // com.google.protobuf.l0
        <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            z1.V(obj, j10, f10);
        }

        @Override // com.google.protobuf.l0
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends l0 {
        private c() {
            super();
        }

        static <E> d0.i<E> f(Object obj, long j10) {
            return (d0.i) z1.G(obj, j10);
        }

        @Override // com.google.protobuf.l0
        void c(Object obj, long j10) {
            f(obj, j10).a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.l0
        <E> void d(Object obj, Object obj2, long j10) {
            d0.i<E> f10 = f(obj, j10);
            d0.i<E> f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            d0.i<E> iVar = f10;
            iVar = f10;
            if (size > 0 && size2 > 0) {
                boolean h10 = f10.h();
                d0.i<E> iVar2 = f10;
                if (!h10) {
                    iVar2 = f10.c(size2 + size);
                }
                iVar2.addAll(f11);
                iVar = iVar2;
            }
            if (size > 0) {
                f11 = iVar;
            }
            z1.V(obj, j10, f11);
        }

        @Override // com.google.protobuf.l0
        <L> List<L> e(Object obj, long j10) {
            d0.i f10 = f(obj, j10);
            if (f10.h()) {
                return f10;
            }
            int size = f10.size();
            d0.i c10 = f10.c(size == 0 ? 10 : size * 2);
            z1.V(obj, j10, c10);
            return c10;
        }
    }

    private l0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0 a() {
        return f7240a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0 b() {
        return f7241b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j10);
}
