.class public final Lh6/e;
.super Lh6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh6/a<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lq6/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq6/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lz5/b;

.field private c:Z

.field private final d:Lz5/a;


# direct methods
.method public constructor <init>(Ls6/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls6/a<",
            "Lz5/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lh6/a;-><init>()V

    new-instance v0, Lh6/d;

    invoke-direct {v0, p0}, Lh6/d;-><init>(Lh6/e;)V

    iput-object v0, p0, Lh6/e;->d:Lz5/a;

    new-instance v0, Lh6/c;

    invoke-direct {v0, p0}, Lh6/c;-><init>(Lh6/e;)V

    invoke-interface {p1, v0}, Ls6/a;->a(Ls6/a$a;)V

    return-void
.end method

.method public static synthetic e(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, Lh6/e;->g(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lh6/e;Ls6/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lh6/e;->h(Ls6/b;)V

    return-void
.end method

.method private static synthetic g(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly5/a;

    invoke-virtual {p0}, Ly5/a;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method private synthetic h(Ls6/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Ls6/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz5/b;

    iput-object p1, p0, Lh6/e;->b:Lz5/b;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lh6/e;->d:Lz5/a;

    invoke-interface {p1, v0}, Lz5/b;->b(Lz5/a;)V

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public declared-synchronized a()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lh6/e;->b:Lz5/b;

    if-nez v0, :cond_0

    new-instance v0, Lw5/c;

    const-string v1, "AppCheck is not available"

    invoke-direct {v0, v1}, Lw5/c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-boolean v1, p0, Lh6/e;->c:Z

    invoke-interface {v0, v1}, Lz5/b;->c(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lh6/e;->c:Z

    sget-object v1, Lq6/p;->b:Ljava/util/concurrent/Executor;

    sget-object v2, Lh6/b;->a:Lh6/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lh6/e;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lh6/e;->a:Lq6/u;

    iget-object v0, p0, Lh6/e;->b:Lz5/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lh6/e;->d:Lz5/a;

    invoke-interface {v0, v1}, Lz5/b;->a(Lz5/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d(Lq6/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/u<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lh6/e;->a:Lq6/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
