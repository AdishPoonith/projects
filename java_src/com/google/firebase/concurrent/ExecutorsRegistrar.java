package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import b6.f0;
import b6.x;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    static final x<ScheduledExecutorService> f6643a = new x<>(new s6.b() { // from class: c6.h
        @Override // s6.b
        public final Object get() {
            ScheduledExecutorService p10;
            p10 = ExecutorsRegistrar.p();
            return p10;
        }
    });

    /* renamed from: b  reason: collision with root package name */
    static final x<ScheduledExecutorService> f6644b = new x<>(new s6.b() { // from class: c6.g
        @Override // s6.b
        public final Object get() {
            ScheduledExecutorService q10;
            q10 = ExecutorsRegistrar.q();
            return q10;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    static final x<ScheduledExecutorService> f6645c = new x<>(new s6.b() { // from class: c6.f
        @Override // s6.b
        public final Object get() {
            ScheduledExecutorService r10;
            r10 = ExecutorsRegistrar.r();
            return r10;
        }
    });

    /* renamed from: d  reason: collision with root package name */
    static final x<ScheduledExecutorService> f6646d = new x<>(new s6.b() { // from class: c6.e
        @Override // s6.b
        public final Object get() {
            ScheduledExecutorService s10;
            s10 = ExecutorsRegistrar.s();
            return s10;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(b6.e eVar) {
        return f6643a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(b6.e eVar) {
        return f6645c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(b6.e eVar) {
        return f6644b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(b6.e eVar) {
        return c6.i.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f6646d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b6.c<?>> getComponents() {
        return Arrays.asList(b6.c.d(f0.a(x5.a.class, ScheduledExecutorService.class), f0.a(x5.a.class, ExecutorService.class), f0.a(x5.a.class, Executor.class)).d(new b6.h() { // from class: c6.d
            @Override // b6.h
            public final Object a(b6.e eVar) {
                ScheduledExecutorService l10;
                l10 = ExecutorsRegistrar.l(eVar);
                return l10;
            }
        }).c(), b6.c.d(f0.a(x5.b.class, ScheduledExecutorService.class), f0.a(x5.b.class, ExecutorService.class), f0.a(x5.b.class, Executor.class)).d(new b6.h() { // from class: c6.a
            @Override // b6.h
            public final Object a(b6.e eVar) {
                ScheduledExecutorService m10;
                m10 = ExecutorsRegistrar.m(eVar);
                return m10;
            }
        }).c(), b6.c.d(f0.a(x5.c.class, ScheduledExecutorService.class), f0.a(x5.c.class, ExecutorService.class), f0.a(x5.c.class, Executor.class)).d(new b6.h() { // from class: c6.c
            @Override // b6.h
            public final Object a(b6.e eVar) {
                ScheduledExecutorService n10;
                n10 = ExecutorsRegistrar.n(eVar);
                return n10;
            }
        }).c(), b6.c.c(f0.a(x5.d.class, Executor.class)).d(new b6.h() { // from class: c6.b
            @Override // b6.h
            public final Object a(b6.e eVar) {
                Executor o10;
                o10 = ExecutorsRegistrar.o(eVar);
                return o10;
            }
        }).c());
    }
}
