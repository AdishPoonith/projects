package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class zzip implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
