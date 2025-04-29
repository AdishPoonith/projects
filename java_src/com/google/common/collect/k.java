package com.google.common.collect;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static final k f6001a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final k f6002b = new b(-1);

    /* renamed from: c  reason: collision with root package name */
    private static final k f6003c = new b(1);

    /* loaded from: classes.dex */
    class a extends k {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.k
        public k d(int i10, int i11) {
            return k(e5.e.e(i10, i11));
        }

        @Override // com.google.common.collect.k
        public k e(long j10, long j11) {
            return k(e5.g.a(j10, j11));
        }

        @Override // com.google.common.collect.k
        public <T> k f(T t10, T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        @Override // com.google.common.collect.k
        public k g(boolean z10, boolean z11) {
            return k(e5.a.a(z10, z11));
        }

        @Override // com.google.common.collect.k
        public k h(boolean z10, boolean z11) {
            return k(e5.a.a(z11, z10));
        }

        @Override // com.google.common.collect.k
        public int i() {
            return 0;
        }

        k k(int i10) {
            return i10 < 0 ? k.f6002b : i10 > 0 ? k.f6003c : k.f6001a;
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends k {

        /* renamed from: d  reason: collision with root package name */
        final int f6004d;

        b(int i10) {
            super(null);
            this.f6004d = i10;
        }

        @Override // com.google.common.collect.k
        public k d(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.k
        public k e(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.k
        public <T> k f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.k
        public k g(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.k
        public k h(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.k
        public int i() {
            return this.f6004d;
        }
    }

    private k() {
    }

    /* synthetic */ k(a aVar) {
        this();
    }

    public static k j() {
        return f6001a;
    }

    public abstract k d(int i10, int i11);

    public abstract k e(long j10, long j11);

    public abstract <T> k f(T t10, T t11, Comparator<T> comparator);

    public abstract k g(boolean z10, boolean z11);

    public abstract k h(boolean z10, boolean z11);

    public abstract int i();
}
