.class Ly8/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/h0$a;
    }
.end annotation


# static fields
.field static final l:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ly8/h0;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Ljava/util/concurrent/Executor;


# instance fields
.field private final a:Ly8/h0$a;

.field private final b:I

.field private final c:Lcom/google/firebase/storage/l;

.field private final d:[B

.field private final e:Landroid/net/Uri;

.field private final f:Lcom/google/firebase/storage/k;

.field private final g:Ljava/lang/Object;

.field private final h:Ljava/lang/Object;

.field private final i:Ljava/lang/Object;

.field private j:Lcom/google/firebase/storage/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/s<",
            "*>;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Ly8/h0;->l:Landroid/util/SparseArray;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ly8/h0;->m:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>(Ly8/h0$a;ILcom/google/firebase/storage/l;[BLandroid/net/Uri;Lcom/google/firebase/storage/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly8/h0;->g:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly8/h0;->h:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly8/h0;->i:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Ly8/h0;->k:Ljava/lang/Boolean;

    iput-object p1, p0, Ly8/h0;->a:Ly8/h0$a;

    iput p2, p0, Ly8/h0;->b:I

    iput-object p3, p0, Ly8/h0;->c:Lcom/google/firebase/storage/l;

    iput-object p4, p0, Ly8/h0;->d:[B

    iput-object p5, p0, Ly8/h0;->e:Landroid/net/Uri;

    iput-object p6, p0, Ly8/h0;->f:Lcom/google/firebase/storage/k;

    sget-object p1, Ly8/h0;->l:Landroid/util/SparseArray;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, p2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method private synthetic A(Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ly8/h0;->t(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    const-string v0, "Task#onProgress"

    invoke-virtual {p1, v0, p2}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic B(Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 2

    iget-object v0, p0, Ly8/h0;->k:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ly8/f0;

    invoke-direct {v1, p0, p1, p2}, Ly8/f0;-><init>(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Ly8/h0;->h:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Ly8/h0;->h:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method private synthetic C(Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ly8/h0;->t(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    const-string v0, "Task#onPaused"

    invoke-virtual {p1, v0, p2}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic D(Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 2

    iget-object v0, p0, Ly8/h0;->k:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ly8/e0;

    invoke-direct {v1, p0, p1, p2}, Ly8/e0;-><init>(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Ly8/h0;->g:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Ly8/h0;->g:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method private synthetic E(Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ly8/h0;->t(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    const-string v0, "Task#onSuccess"

    invoke-virtual {p1, v0, p2}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic F(Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 2

    iget-object v0, p0, Ly8/h0;->k:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ly8/g0;

    invoke-direct {v1, p0, p1, p2}, Ly8/g0;-><init>(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Ly8/h0;->p()V

    return-void
.end method

.method private synthetic G(Lr8/k;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Ly8/h0;->t(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "Task#onCanceled"

    invoke-virtual {p1, v1, v0}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly8/h0;->p()V

    return-void
.end method

.method public static H(Lcom/google/firebase/storage/c$a;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/c$a;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/storage/s$b;->b()Lcom/google/firebase/storage/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/storage/l;->t()Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/s$b;->c()Lcom/google/firebase/storage/s;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/storage/s;->isSuccessful()Z

    move-result v1

    const-string v2, "bytesTransferred"

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/storage/c$a;->e()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/storage/c$a;->d()J

    move-result-wide v3

    :goto_0
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/c$a;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const-string v1, "totalBytes"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method static I(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lcom/google/firebase/storage/c$a;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/firebase/storage/c$a;

    invoke-static {p0}, Ly8/h0;->H(Lcom/google/firebase/storage/c$a;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p0, Lcom/google/firebase/storage/a0$b;

    invoke-static {p0}, Ly8/h0;->J(Lcom/google/firebase/storage/a0$b;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static J(Lcom/google/firebase/storage/a0$b;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/a0$b;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/storage/s$b;->b()Lcom/google/firebase/storage/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/storage/l;->t()Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/a0$b;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "bytesTransferred"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/a0$b;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "totalBytes"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/a0$b;->e()Lcom/google/firebase/storage/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/storage/a0$b;->e()Lcom/google/firebase/storage/k;

    move-result-object p0

    invoke-static {p0}, Ly8/t;->U(Lcom/google/firebase/storage/k;)Ljava/util/Map;

    move-result-object p0

    const-string v1, "metadata"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static N(ILcom/google/firebase/storage/l;[BLcom/google/firebase/storage/k;)Ly8/h0;
    .locals 8

    new-instance v7, Ly8/h0;

    sget-object v1, Ly8/h0$a;->k:Ly8/h0$a;

    const/4 v5, 0x0

    move-object v0, v7

    move v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Ly8/h0;-><init>(Ly8/h0$a;ILcom/google/firebase/storage/l;[BLandroid/net/Uri;Lcom/google/firebase/storage/k;)V

    return-object v7
.end method

.method public static O(ILcom/google/firebase/storage/l;Landroid/net/Uri;Lcom/google/firebase/storage/k;)Ly8/h0;
    .locals 8

    new-instance v7, Ly8/h0;

    sget-object v1, Ly8/h0$a;->j:Ly8/h0$a;

    const/4 v4, 0x0

    move-object v0, v7

    move v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Ly8/h0;-><init>(Ly8/h0$a;ILcom/google/firebase/storage/l;[BLandroid/net/Uri;Lcom/google/firebase/storage/k;)V

    return-object v7
.end method

.method public static synthetic a(Ly8/h0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1}, Ly8/h0;->w(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic b(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/h0;->C(Lr8/k;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method

.method public static synthetic c(Ly8/h0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1}, Ly8/h0;->v(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic d(Ly8/h0;Lr8/k;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/h0;->z(Lr8/k;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic e(Ly8/h0;Lr8/k;)V
    .locals 0

    invoke-direct {p0, p1}, Ly8/h0;->x(Lr8/k;)V

    return-void
.end method

.method public static synthetic f(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/h0;->B(Lr8/k;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method

.method public static synthetic g(Ly8/h0;Lr8/k;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/h0;->y(Lr8/k;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic h(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/h0;->D(Lr8/k;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method

.method public static synthetic i(Ly8/h0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1}, Ly8/h0;->u(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic j(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/h0;->F(Lr8/k;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method

.method public static synthetic k(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/h0;->A(Lr8/k;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method

.method public static synthetic l(Ly8/h0;Lr8/k;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/h0;->E(Lr8/k;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method

.method public static synthetic m(Ly8/h0;Lr8/k;)V
    .locals 0

    invoke-direct {p0, p1}, Ly8/h0;->G(Lr8/k;)V

    return-void
.end method

.method static o()V
    .locals 4

    sget-object v0, Ly8/h0;->l:Landroid/util/SparseArray;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    sget-object v2, Ly8/h0;->l:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly8/h0;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ly8/h0;->p()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static q(ILcom/google/firebase/storage/l;Ljava/io/File;)Ly8/h0;
    .locals 8

    new-instance v7, Ly8/h0;

    sget-object v1, Ly8/h0$a;->l:Ly8/h0$a;

    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    move v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Ly8/h0;-><init>(Ly8/h0$a;ILcom/google/firebase/storage/l;[BLandroid/net/Uri;Lcom/google/firebase/storage/k;)V

    return-object v7
.end method

.method static r(I)Ly8/h0;
    .locals 1

    sget-object v0, Ly8/h0;->l:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly8/h0;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private t(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Exception;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget v1, p0, Ly8/h0;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "handle"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Ly8/h0;->c:Lcom/google/firebase/storage/l;

    invoke-virtual {v1}, Lcom/google/firebase/storage/l;->v()Lcom/google/firebase/storage/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/storage/d;->a()Lw5/f;

    move-result-object v1

    invoke-virtual {v1}, Lw5/f;->q()Ljava/lang/String;

    move-result-object v1

    const-string v2, "appName"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Ly8/h0;->c:Lcom/google/firebase/storage/l;

    invoke-virtual {v1}, Lcom/google/firebase/storage/l;->l()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bucket"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    invoke-static {p1}, Ly8/h0;->I(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "snapshot"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Ly8/t;->u(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "error"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method private synthetic u(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    invoke-virtual {v0}, Lcom/google/firebase/storage/s;->w()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic v(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    iget-object v0, p0, Ly8/h0;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    invoke-virtual {v1}, Lcom/google/firebase/storage/s;->a0()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Ly8/h0;->g:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private synthetic w(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    iget-object v0, p0, Ly8/h0;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    invoke-virtual {v1}, Lcom/google/firebase/storage/s;->d0()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Ly8/h0;->h:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private synthetic x(Lr8/k;)V
    .locals 2

    iget-object v0, p0, Ly8/h0;->k:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ly8/d0;

    invoke-direct {v1, p0, p1}, Ly8/d0;-><init>(Ly8/h0;Lr8/k;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private synthetic y(Lr8/k;Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Ly8/h0;->t(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    const-string v0, "Task#onFailure"

    invoke-virtual {p1, v0, p2}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly8/h0;->p()V

    return-void
.end method

.method private synthetic z(Lr8/k;Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Ly8/h0;->k:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ly8/v;

    invoke-direct {v1, p0, p1, p2}, Ly8/v;-><init>(Ly8/h0;Lr8/k;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method K()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ly8/b0;

    invoke-direct {v2, p0, v0}, Ly8/b0;-><init>(Ly8/h0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method L()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ly8/a0;

    invoke-direct {v2, p0, v0}, Ly8/a0;-><init>(Ly8/h0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method M(Lr8/k;)V
    .locals 3

    iget-object v0, p0, Ly8/h0;->a:Ly8/h0$a;

    sget-object v1, Ly8/h0$a;->k:Ly8/h0$a;

    if-ne v0, v1, :cond_1

    iget-object v1, p0, Ly8/h0;->d:[B

    if-eqz v1, :cond_1

    iget-object v0, p0, Ly8/h0;->f:Lcom/google/firebase/storage/k;

    if-nez v0, :cond_0

    iget-object v0, p0, Ly8/h0;->c:Lcom/google/firebase/storage/l;

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/l;->B([B)Lcom/google/firebase/storage/a0;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ly8/h0;->c:Lcom/google/firebase/storage/l;

    invoke-virtual {v2, v1, v0}, Lcom/google/firebase/storage/l;->C([BLcom/google/firebase/storage/k;)Lcom/google/firebase/storage/a0;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    goto :goto_1

    :cond_1
    sget-object v1, Ly8/h0$a;->j:Ly8/h0$a;

    if-ne v0, v1, :cond_3

    iget-object v1, p0, Ly8/h0;->e:Landroid/net/Uri;

    if-eqz v1, :cond_3

    iget-object v0, p0, Ly8/h0;->f:Lcom/google/firebase/storage/k;

    if-nez v0, :cond_2

    iget-object v0, p0, Ly8/h0;->c:Lcom/google/firebase/storage/l;

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/l;->D(Landroid/net/Uri;)Lcom/google/firebase/storage/a0;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v2, p0, Ly8/h0;->c:Lcom/google/firebase/storage/l;

    invoke-virtual {v2, v1, v0}, Lcom/google/firebase/storage/l;->E(Landroid/net/Uri;Lcom/google/firebase/storage/k;)Lcom/google/firebase/storage/a0;

    move-result-object v0

    goto :goto_0

    :cond_3
    sget-object v1, Ly8/h0$a;->l:Ly8/h0$a;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ly8/h0;->e:Landroid/net/Uri;

    if-eqz v0, :cond_4

    iget-object v1, p0, Ly8/h0;->c:Lcom/google/firebase/storage/l;

    invoke-virtual {v1, v0}, Lcom/google/firebase/storage/l;->p(Landroid/net/Uri;)Lcom/google/firebase/storage/c;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    sget-object v1, Ly8/h0;->m:Ljava/util/concurrent/Executor;

    new-instance v2, Ly8/x;

    invoke-direct {v2, p0, p1}, Ly8/x;-><init>(Ly8/h0;Lr8/k;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/storage/s;->s(Ljava/util/concurrent/Executor;Lw6/d;)Lcom/google/firebase/storage/s;

    iget-object v0, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    new-instance v2, Ly8/w;

    invoke-direct {v2, p0, p1}, Ly8/w;-><init>(Ly8/h0;Lr8/k;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/storage/s;->r(Ljava/util/concurrent/Executor;Lw6/c;)Lcom/google/firebase/storage/s;

    iget-object v0, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    new-instance v2, Ly8/z;

    invoke-direct {v2, p0, p1}, Ly8/z;-><init>(Ly8/h0;Lr8/k;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/storage/s;->v(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/firebase/storage/s;

    iget-object v0, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    new-instance v2, Ly8/u;

    invoke-direct {v2, p0, p1}, Ly8/u;-><init>(Ly8/h0;Lr8/k;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/storage/s;->k(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCanceledListener;)Lcom/google/firebase/storage/s;

    iget-object v0, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    new-instance v2, Ly8/y;

    invoke-direct {v2, p0, p1}, Ly8/y;-><init>(Ly8/h0;Lr8/k;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/storage/s;->q(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/firebase/storage/s;

    return-void

    :cond_4
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Unable to start task. Some arguments have no been initialized."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method n()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ly8/c0;

    invoke-direct {v2, p0, v0}, Ly8/c0;-><init>(Ly8/h0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method p()V
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Ly8/h0;->k:Ljava/lang/Boolean;

    sget-object v0, Ly8/h0;->l:Landroid/util/SparseArray;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    invoke-virtual {v1}, Lcom/google/firebase/storage/s;->K()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    invoke-virtual {v1}, Lcom/google/firebase/storage/s;->L()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    invoke-virtual {v1}, Lcom/google/firebase/storage/s;->w()Z

    :cond_1
    iget v1, p0, Ly8/h0;->b:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    iget-object v1, p0, Ly8/h0;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Ly8/h0;->i:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    iget-object v0, p0, Ly8/h0;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Ly8/h0;->g:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v1, p0, Ly8/h0;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_3
    iget-object v0, p0, Ly8/h0;->h:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0

    :catchall_3
    move-exception v1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v1
.end method

.method public s()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly8/h0;->j:Lcom/google/firebase/storage/s;

    invoke-virtual {v0}, Lcom/google/firebase/storage/s;->F()Lcom/google/firebase/storage/s$a;

    move-result-object v0

    return-object v0
.end method
