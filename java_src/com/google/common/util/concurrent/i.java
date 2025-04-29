package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private String f6110a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f6111b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f6112c = null;

    /* renamed from: d  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f6113d = null;

    /* renamed from: e  reason: collision with root package name */
    private ThreadFactory f6114e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ThreadFactory f6115j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f6116k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ AtomicLong f6117l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Boolean f6118m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Integer f6119n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f6120o;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f6115j = threadFactory;
            this.f6116k = str;
            this.f6117l = atomicLong;
            this.f6118m = bool;
            this.f6119n = num;
            this.f6120o = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f6115j.newThread(runnable);
            Objects.requireNonNull(newThread);
            String str = this.f6116k;
            if (str != null) {
                AtomicLong atomicLong = this.f6117l;
                Objects.requireNonNull(atomicLong);
                newThread.setName(i.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f6118m;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f6119n;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6120o;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    private static ThreadFactory c(i iVar) {
        String str = iVar.f6110a;
        Boolean bool = iVar.f6111b;
        Integer num = iVar.f6112c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = iVar.f6113d;
        ThreadFactory threadFactory = iVar.f6114e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public i e(boolean z10) {
        this.f6111b = Boolean.valueOf(z10);
        return this;
    }

    public i f(String str) {
        d(str, 0);
        this.f6110a = str;
        return this;
    }
}
