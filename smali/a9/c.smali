.class public final La9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/c$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    move-object v0, v7

    move v1, p1

    move v2, p1

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v7, p0, La9/c;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static synthetic a(Lcom/google/common/util/concurrent/h;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-static {p0, p1}, La9/c;->d(Lcom/google/common/util/concurrent/h;Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public static synthetic b(La9/c$a;Lcom/google/common/util/concurrent/d;)V
    .locals 0

    invoke-static {p0, p1}, La9/c;->c(La9/c$a;Lcom/google/common/util/concurrent/d;)V

    return-void
.end method

.method private static synthetic c(La9/c$a;Lcom/google/common/util/concurrent/d;)V
    .locals 0

    invoke-interface {p0, p1}, La9/c$a;->a(Ljava/util/concurrent/Future;)V

    return-void
.end method

.method private static synthetic d(Lcom/google/common/util/concurrent/h;Ljava/util/concurrent/Callable;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/util/concurrent/h;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/h;->B(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lcom/google/common/util/concurrent/h;->C(Ljava/lang/Throwable;)Z

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public e(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lcom/google/common/util/concurrent/d<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/util/concurrent/h;->D()Lcom/google/common/util/concurrent/h;

    move-result-object v0

    iget-object v1, p0, La9/c;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, La9/b;

    invoke-direct {v2, v0, p1}, La9/b;-><init>(Lcom/google/common/util/concurrent/h;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public f(Ljava/util/concurrent/Callable;La9/c$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;",
            "La9/c$a<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, La9/c;->e(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/d;

    move-result-object p1

    new-instance v0, La9/a;

    invoke-direct {v0, p2, p1}, La9/a;-><init>(La9/c$a;Lcom/google/common/util/concurrent/d;)V

    invoke-static {}, La9/d;->a()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/d;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
