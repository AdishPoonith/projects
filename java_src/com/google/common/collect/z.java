package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
/* loaded from: classes.dex */
public interface z<K, V> {
    Map<K, Collection<V>> a();

    void clear();

    boolean put(K k10, V v10);

    int size();

    Collection<V> values();
}
