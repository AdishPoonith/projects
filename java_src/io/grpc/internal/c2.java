package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
class c2 implements Executor {

    /* renamed from: l  reason: collision with root package name */
    private static final Logger f11121l = Logger.getLogger(c2.class.getName());

    /* renamed from: j  reason: collision with root package name */
    private boolean f11122j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayDeque<Runnable> f11123k;

    private void a() {
        while (true) {
            Runnable poll = this.f11123k.poll();
            if (poll == null) {
                return;
            }
            try {
                poll.run();
            } catch (Throwable th) {
                Logger logger = f11121l;
                Level level = Level.SEVERE;
                logger.log(level, "Exception while executing runnable " + poll, th);
            }
        }
    }

    private void b(Runnable runnable) {
        if (this.f11123k == null) {
            this.f11123k = new ArrayDeque<>(4);
        }
        this.f11123k.add(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r6.f11123k == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.lang.String r0 = "'task' must not be null."
            b5.n.o(r7, r0)
            boolean r0 = r6.f11122j
            if (r0 != 0) goto L43
            r0 = 1
            r6.f11122j = r0
            r0 = 0
            r7.run()     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f11123k
            if (r7 == 0) goto L17
        L14:
            r6.a()
        L17:
            r6.f11122j = r0
            goto L46
        L1a:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.internal.c2.f11121l     // Catch: java.lang.Throwable -> L38
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "Exception while executing runnable "
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            r4.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L38
            r2.log(r3, r7, r1)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f11123k
            if (r7 == 0) goto L17
            goto L14
        L38:
            r7 = move-exception
            java.util.ArrayDeque<java.lang.Runnable> r1 = r6.f11123k
            if (r1 == 0) goto L40
            r6.a()
        L40:
            r6.f11122j = r0
            throw r7
        L43:
            r6.b(r7)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.c2.execute(java.lang.Runnable):void");
    }
}
