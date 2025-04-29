package io.grpc.internal;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public interface l2 {

    /* renamed from: a  reason: collision with root package name */
    public static final l2 f11442a = new a();

    /* loaded from: classes.dex */
    class a implements l2 {
        a() {
        }

        @Override // io.grpc.internal.l2
        public long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
