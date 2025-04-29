package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f6649n = Executors.defaultThreadFactory();

    /* renamed from: j  reason: collision with root package name */
    private final AtomicLong f6650j = new AtomicLong();

    /* renamed from: k  reason: collision with root package name */
    private final String f6651k;

    /* renamed from: l  reason: collision with root package name */
    private final int f6652l;

    /* renamed from: m  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f6653m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f6651k = str;
        this.f6652l = i10;
        this.f6653m = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f6652l);
        StrictMode.ThreadPolicy threadPolicy = this.f6653m;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f6649n.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f6651k, Long.valueOf(this.f6650j.getAndIncrement())));
        return newThread;
    }
}
