package com.google.common.collect;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class b<T> extends s0<T> {

    /* renamed from: j  reason: collision with root package name */
    private EnumC0089b f5943j = EnumC0089b.NOT_READY;

    /* renamed from: k  reason: collision with root package name */
    private T f5944k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5945a;

        static {
            int[] iArr = new int[EnumC0089b.values().length];
            f5945a = iArr;
            try {
                iArr[EnumC0089b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5945a[EnumC0089b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0089b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean d() {
        this.f5943j = EnumC0089b.FAILED;
        this.f5944k = a();
        if (this.f5943j != EnumC0089b.DONE) {
            this.f5943j = EnumC0089b.READY;
            return true;
        }
        return false;
    }

    protected abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T c() {
        this.f5943j = EnumC0089b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b5.n.t(this.f5943j != EnumC0089b.FAILED);
        int i10 = a.f5945a[this.f5943j.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return d();
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f5943j = EnumC0089b.NOT_READY;
            T t10 = (T) f0.a(this.f5944k);
            this.f5944k = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
