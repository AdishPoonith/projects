.class public final Lh6/i;
.super Lh6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh6/a<",
        "Lh6/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:La6/a;

.field private b:La6/b;

.field private c:Lq6/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq6/u<",
            "Lh6/j;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>(Ls6/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls6/a<",
            "La6/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lh6/a;-><init>()V

    new-instance v0, Lh6/f;

    invoke-direct {v0, p0}, Lh6/f;-><init>(Lh6/i;)V

    iput-object v0, p0, Lh6/i;->a:La6/a;

    new-instance v0, Lh6/h;

    invoke-direct {v0, p0}, Lh6/h;-><init>(Lh6/i;)V

    invoke-interface {p1, v0}, Ls6/a;->a(Ls6/a$a;)V

    return-void
.end method

.method public static synthetic e(Lh6/i;ILcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1, p2}, Lh6/i;->i(ILcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lh6/i;Ls6/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lh6/i;->k(Ls6/b;)V

    return-void
.end method

.method public static synthetic g(Lh6/i;Lt6/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lh6/i;->j(Lt6/b;)V

    return-void
.end method

.method private declared-synchronized h()Lh6/j;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lh6/i;->b:La6/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, La6/b;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lh6/j;

    invoke-direct {v1, v0}, Lh6/j;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v1, Lh6/j;->b:Lh6/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private synthetic i(ILcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lh6/i;->d:I

    if-eq p1, v0, :cond_0

    const-string p1, "FirebaseAuthCredentialsProvider"

    const-string p2, "getToken aborted due to token change"

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lh6/i;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/c0;

    invoke-virtual {p1}, Lcom/google/firebase/auth/c0;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic j(Lt6/b;)V
    .locals 0

    invoke-direct {p0}, Lh6/i;->l()V

    return-void
.end method

.method private synthetic k(Ls6/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Ls6/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La6/b;

    iput-object p1, p0, Lh6/i;->b:La6/b;

    invoke-direct {p0}, Lh6/i;->l()V

    iget-object p1, p0, Lh6/i;->b:La6/b;

    iget-object v0, p0, Lh6/i;->a:La6/a;

    invoke-interface {p1, v0}, La6/b;->c(La6/a;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private declared-synchronized l()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lh6/i;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lh6/i;->d:I

    iget-object v0, p0, Lh6/i;->c:Lq6/u;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lh6/i;->h()Lh6/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lq6/u;->a(Ljava/lang/Object;)V
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


# virtual methods
.method public declared-synchronized a()Lcom/google/android/gms/tasks/Task;
    .locals 4
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
    iget-object v0, p0, Lh6/i;->b:La6/b;

    if-nez v0, :cond_0

    new-instance v0, Lw5/c;

    const-string v1, "auth is not available"

    invoke-direct {v0, v1}, Lw5/c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-boolean v1, p0, Lh6/i;->e:Z

    invoke-interface {v0, v1}, La6/b;->d(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lh6/i;->e:Z

    iget v1, p0, Lh6/i;->d:I

    sget-object v2, Lq6/p;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lh6/g;

    invoke-direct {v3, p0, v1}, Lh6/g;-><init>(Lh6/i;I)V

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

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
    iput-boolean v0, p0, Lh6/i;->e:Z
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
    iput-object v0, p0, Lh6/i;->c:Lq6/u;

    iget-object v0, p0, Lh6/i;->b:La6/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lh6/i;->a:La6/a;

    invoke-interface {v0, v1}, La6/b;->b(La6/a;)V
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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/u<",
            "Lh6/j;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lh6/i;->c:Lq6/u;

    invoke-direct {p0}, Lh6/i;->h()Lh6/j;

    move-result-object v0

    invoke-interface {p1, v0}, Lq6/u;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
