package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
@Deprecated
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f3766a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends com.google.android.gms.common.api.internal.e {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends com.google.android.gms.common.api.internal.m {
    }

    public static Set<f> c() {
        Set<f> set = f3766a;
        synchronized (set) {
        }
        return set;
    }

    public <A extends a.b, R extends m, T extends com.google.android.gms.common.api.internal.d<R, A>> T a(T t10) {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T b(T t10) {
        throw new UnsupportedOperationException();
    }

    public Looper d() {
        throw new UnsupportedOperationException();
    }

    public boolean e(com.google.android.gms.common.api.internal.r rVar) {
        throw new UnsupportedOperationException();
    }

    public void f() {
        throw new UnsupportedOperationException();
    }
}
