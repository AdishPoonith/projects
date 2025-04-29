package com.google.common.collect;

import java.io.Serializable;
/* loaded from: classes.dex */
class p<K, V> extends e<K, V> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    final K f6032j;

    /* renamed from: k  reason: collision with root package name */
    final V f6033k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(K k10, V v10) {
        this.f6032j = k10;
        this.f6033k = v10;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final K getKey() {
        return this.f6032j;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final V getValue() {
        return this.f6033k;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
