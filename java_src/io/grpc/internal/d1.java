package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class d1 implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    private static final Logger f11135k = Logger.getLogger(d1.class.getName());

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f11136j;

    public d1(Runnable runnable) {
        this.f11136j = (Runnable) b5.n.o(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f11136j.run();
        } catch (Throwable th) {
            Logger logger = f11135k;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + this.f11136j, th);
            b5.u.f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f11136j + ")";
    }
}
