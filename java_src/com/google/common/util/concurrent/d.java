package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public interface d<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}
