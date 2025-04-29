package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qb  reason: invalid package */
/* loaded from: classes.dex */
abstract class qb implements Iterator {

    /* renamed from: j  reason: collision with root package name */
    private Object f5249j;

    /* renamed from: k  reason: collision with root package name */
    private int f5250k = 2;

    protected abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object c() {
        this.f5250k = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f5250k;
        if (i10 != 4) {
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 != 0) {
                    if (i11 != 2) {
                        this.f5250k = 4;
                        this.f5249j = a();
                        if (this.f5250k != 3) {
                            this.f5250k = 1;
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f5250k = 2;
            Object obj = this.f5249j;
            this.f5249j = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
