.class public final Lla/n1;
.super Lla/m1;
.source "SourceFile"

# interfaces
.implements Lla/t0;


# instance fields
.field private final m:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Lla/m1;-><init>()V

    iput-object p1, p0, Lla/n1;->m:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Lla/n1;->l0()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/internal/d;->a(Ljava/util/concurrent/Executor;)Z

    return-void
.end method

.method private final k0(Lv9/g;Ljava/util/concurrent/RejectedExecutionException;)V
    .locals 1

    const-string v0, "The task was rejected"

    invoke-static {v0, p2}, Lla/l1;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p2

    invoke-static {p1, p2}, Lla/z1;->c(Lv9/g;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method private final m0(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lv9/g;J)Ljava/util/concurrent/ScheduledFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Ljava/lang/Runnable;",
            "Lv9/g;",
            "J)",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, p4, p5, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p3, p1}, Lla/n1;->k0(Lv9/g;Ljava/util/concurrent/RejectedExecutionException;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public c0(JLjava/lang/Runnable;Lv9/g;)Lla/c1;
    .locals 9

    invoke-virtual {p0}, Lla/n1;->l0()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_1

    move-object v3, p0

    move-object v5, p3

    move-object v6, p4

    move-wide v7, p1

    invoke-direct/range {v3 .. v8}, Lla/n1;->m0(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lv9/g;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    new-instance p1, Lla/b1;

    invoke-direct {p1, v2}, Lla/b1;-><init>(Ljava/util/concurrent/Future;)V

    goto :goto_1

    :cond_2
    sget-object v0, Lla/p0;->q:Lla/p0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lla/p0;->c0(JLjava/lang/Runnable;Lv9/g;)Lla/c1;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public close()V
    .locals 2

    invoke-virtual {p0}, Lla/n1;->l0()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_1
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lla/n1;

    if-eqz v0, :cond_0

    check-cast p1, Lla/n1;

    invoke-virtual {p1}, Lla/n1;->l0()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0}, Lla/n1;->l0()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h0(Lv9/g;Ljava/lang/Runnable;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lla/n1;->l0()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-interface {v0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-direct {p0, p1, v0}, Lla/n1;->k0(Lv9/g;Ljava/util/concurrent/RejectedExecutionException;)V

    invoke-static {}, Lla/a1;->b()Lla/g0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lla/g0;->h0(Lv9/g;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lla/n1;->l0()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public l0()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lla/n1;->m:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lla/n1;->l0()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
