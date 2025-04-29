package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final i0 f6202a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final i0 f6203b = new c();

    /* loaded from: classes.dex */
    private static final class b extends i0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f6204c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) s1.C(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j10, int i10) {
            List<L> c10;
            g0 g0Var;
            List<L> f10 = f(obj, j10);
            if (!f10.isEmpty()) {
                if (f6204c.isAssignableFrom(f10.getClass())) {
                    ArrayList arrayList = new ArrayList(f10.size() + i10);
                    arrayList.addAll(f10);
                    g0Var = arrayList;
                } else if (f10 instanceof r1) {
                    g0 g0Var2 = new g0(f10.size() + i10);
                    g0Var2.addAll((r1) f10);
                    g0Var = g0Var2;
                } else if (!(f10 instanceof b1) || !(f10 instanceof b0.i)) {
                    return f10;
                } else {
                    b0.i iVar = (b0.i) f10;
                    if (iVar.h()) {
                        return f10;
                    }
                    c10 = iVar.c(f10.size() + i10);
                }
                s1.R(obj, j10, g0Var);
                return g0Var;
            }
            c10 = f10 instanceof h0 ? new g0(i10) : ((f10 instanceof b1) && (f10 instanceof b0.i)) ? ((b0.i) f10).c(i10) : new ArrayList<>(i10);
            s1.R(obj, j10, c10);
            return c10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        void c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) s1.C(obj, j10);
            if (list instanceof h0) {
                unmodifiableList = ((h0) list).d();
            } else if (f6204c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof b1) && (list instanceof b0.i)) {
                    b0.i iVar = (b0.i) list;
                    if (iVar.h()) {
                        iVar.a();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            s1.R(obj, j10, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
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
            s1.R(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends i0 {
        private c() {
            super();
        }

        static <E> b0.i<E> f(Object obj, long j10) {
            return (b0.i) s1.C(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        void c(Object obj, long j10) {
            f(obj, j10).a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        <E> void d(Object obj, Object obj2, long j10) {
            b0.i<E> f10 = f(obj, j10);
            b0.i<E> f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            b0.i<E> iVar = f10;
            iVar = f10;
            if (size > 0 && size2 > 0) {
                boolean h10 = f10.h();
                b0.i<E> iVar2 = f10;
                if (!h10) {
                    iVar2 = f10.c(size2 + size);
                }
                iVar2.addAll(f11);
                iVar = iVar2;
            }
            if (size > 0) {
                f11 = iVar;
            }
            s1.R(obj, j10, f11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        <L> List<L> e(Object obj, long j10) {
            b0.i f10 = f(obj, j10);
            if (f10.h()) {
                return f10;
            }
            int size = f10.size();
            b0.i c10 = f10.c(size == 0 ? 10 : size * 2);
            s1.R(obj, j10, c10);
            return c10;
        }
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 a() {
        return f6202a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 b() {
        return f6203b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j10);
}
