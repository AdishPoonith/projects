package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e2  reason: invalid package */
/* loaded from: classes.dex */
abstract class e2 extends p9 {

    /* renamed from: j  reason: collision with root package name */
    private final int f4526j;

    /* renamed from: k  reason: collision with root package name */
    private int f4527k;

    /* JADX INFO: Access modifiers changed from: protected */
    public e2(int i10, int i11) {
        ht.b(i11, i10, "index");
        this.f4526j = i10;
        this.f4527k = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4527k < this.f4526j;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4527k > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f4527k;
            this.f4527k = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4527k;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f4527k - 1;
            this.f4527k = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4527k - 1;
    }
}
