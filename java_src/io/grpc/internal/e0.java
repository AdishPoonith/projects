package io.grpc.internal;

import io.grpc.internal.k;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class e0 implements k {

    /* renamed from: a  reason: collision with root package name */
    private Random f11143a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private long f11144b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c  reason: collision with root package name */
    private long f11145c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d  reason: collision with root package name */
    private double f11146d = 1.6d;

    /* renamed from: e  reason: collision with root package name */
    private double f11147e = 0.2d;

    /* renamed from: f  reason: collision with root package name */
    private long f11148f = this.f11144b;

    /* loaded from: classes.dex */
    public static final class a implements k.a {
        @Override // io.grpc.internal.k.a
        public k get() {
            return new e0();
        }
    }

    private long b(double d10, double d11) {
        b5.n.d(d11 >= d10);
        return (long) ((this.f11143a.nextDouble() * (d11 - d10)) + d10);
    }

    @Override // io.grpc.internal.k
    public long a() {
        long j10 = this.f11148f;
        double d10 = j10;
        this.f11148f = Math.min((long) (this.f11146d * d10), this.f11145c);
        double d11 = this.f11147e;
        return j10 + b((-d11) * d10, d11 * d10);
    }
}
