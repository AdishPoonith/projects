.class public final Lla/p0;
.super Lla/h1;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static volatile _thread:Ljava/lang/Thread;

.field private static volatile debugStatus:I

.field public static final q:Lla/p0;

.field private static final r:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lla/p0;

    invoke-direct {v0}, Lla/p0;-><init>()V

    sput-object v0, Lla/p0;->q:Lla/p0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lla/g1;->p0(Lla/g1;ZILjava/lang/Object;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    :try_start_0
    const-string v3, "kotlinx.coroutines.DefaultExecutor.keepAlive"

    invoke-static {v3, v1, v2}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lla/p0;->r:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lla/h1;-><init>()V

    return-void
.end method

.method private final declared-synchronized L0()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lla/p0;->O0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x3

    :try_start_1
    sput v0, Lla/p0;->debugStatus:I

    invoke-virtual {p0}, Lla/h1;->F0()V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized M0()Ljava/lang/Thread;
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lla/p0;->_thread:Ljava/lang/Thread;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    const-string v1, "kotlinx.coroutines.DefaultExecutor"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    sput-object v0, Lla/p0;->_thread:Ljava/lang/Thread;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final N0()Z
    .locals 2

    sget v0, Lla/p0;->debugStatus:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final O0()Z
    .locals 2

    sget v0, Lla/p0;->debugStatus:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final declared-synchronized P0()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lla/p0;->O0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    sput v0, Lla/p0;->debugStatus:I

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final Q0()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/RejectedExecutionException;

    const-string v1, "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"

    invoke-direct {v0, v1}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public c0(JLjava/lang/Runnable;Lv9/g;)Lla/c1;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lla/h1;->I0(JLjava/lang/Runnable;)Lla/c1;

    move-result-object p1

    return-object p1
.end method

.method public run()V
    .locals 12

    sget-object v0, Lla/s2;->a:Lla/s2;

    invoke-virtual {v0, p0}, Lla/s2;->c(Lla/g1;)V

    invoke-static {}, Lla/c;->a()Lla/b;

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lla/p0;->P0()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    sput-object v0, Lla/p0;->_thread:Ljava/lang/Thread;

    invoke-direct {p0}, Lla/p0;->L0()V

    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-virtual {p0}, Lla/h1;->C0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lla/p0;->t0()Ljava/lang/Thread;

    :cond_0
    return-void

    :cond_1
    const-wide v1, 0x7fffffffffffffffL

    move-wide v3, v1

    :cond_2
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    invoke-virtual {p0}, Lla/h1;->D0()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v1

    if-nez v9, :cond_6

    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    cmp-long v11, v3, v1

    if-nez v11, :cond_3

    sget-wide v3, Lla/p0;->r:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-long/2addr v3, v9

    :cond_3
    sub-long v9, v3, v9

    cmp-long v11, v9, v7

    if-gtz v11, :cond_5

    sput-object v0, Lla/p0;->_thread:Ljava/lang/Thread;

    invoke-direct {p0}, Lla/p0;->L0()V

    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-virtual {p0}, Lla/h1;->C0()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lla/p0;->t0()Ljava/lang/Thread;

    :cond_4
    return-void

    :cond_5
    :try_start_2
    invoke-static {v5, v6, v9, v10}, Lha/g;->d(JJ)J

    move-result-wide v5

    goto :goto_1

    :cond_6
    move-wide v3, v1

    :goto_1
    cmp-long v9, v5, v7

    if-lez v9, :cond_2

    invoke-direct {p0}, Lla/p0;->O0()Z

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v7, :cond_8

    sput-object v0, Lla/p0;->_thread:Ljava/lang/Thread;

    invoke-direct {p0}, Lla/p0;->L0()V

    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-virtual {p0}, Lla/h1;->C0()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lla/p0;->t0()Ljava/lang/Thread;

    :cond_7
    return-void

    :cond_8
    :try_start_3
    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-static {p0, v5, v6}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sput-object v0, Lla/p0;->_thread:Ljava/lang/Thread;

    invoke-direct {p0}, Lla/p0;->L0()V

    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-virtual {p0}, Lla/h1;->C0()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lla/p0;->t0()Ljava/lang/Thread;

    :cond_9
    throw v1
.end method

.method public shutdown()V
    .locals 1

    const/4 v0, 0x4

    sput v0, Lla/p0;->debugStatus:I

    invoke-super {p0}, Lla/h1;->shutdown()V

    return-void
.end method

.method protected t0()Ljava/lang/Thread;
    .locals 1

    sget-object v0, Lla/p0;->_thread:Ljava/lang/Thread;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lla/p0;->M0()Ljava/lang/Thread;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected u0(JLla/h1$b;)V
    .locals 0

    invoke-direct {p0}, Lla/p0;->Q0()V

    return-void
.end method

.method public z0(Ljava/lang/Runnable;)V
    .locals 1

    invoke-direct {p0}, Lla/p0;->N0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lla/p0;->Q0()V

    :cond_0
    invoke-super {p0, p1}, Lla/h1;->z0(Ljava/lang/Runnable;)V

    return-void
.end method
