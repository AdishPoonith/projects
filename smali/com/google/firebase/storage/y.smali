.class Lcom/google/firebase/storage/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/storage/y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "ListenerTypeT:Ljava/lang/Object;",
        "ResultT::",
        "Lcom/google/firebase/storage/s$a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "T",
            "ListenerTypeT;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "T",
            "ListenerTypeT;",
            "Lx6/g;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/firebase/storage/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/s<",
            "TResultT;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Lcom/google/firebase/storage/y$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/y$a<",
            "T",
            "ListenerTypeT;",
            "TResultT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/firebase/storage/s;ILcom/google/firebase/storage/y$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/s<",
            "TResultT;>;I",
            "Lcom/google/firebase/storage/y$a<",
            "T",
            "ListenerTypeT;",
            "TResultT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/storage/y;->a:Ljava/util/Queue;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/storage/y;->b:Ljava/util/HashMap;

    iput-object p1, p0, Lcom/google/firebase/storage/y;->c:Lcom/google/firebase/storage/s;

    iput p2, p0, Lcom/google/firebase/storage/y;->d:I

    iput-object p3, p0, Lcom/google/firebase/storage/y;->e:Lcom/google/firebase/storage/y$a;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/storage/y;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/storage/y;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/storage/y;Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/y;->g(Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method

.method public static synthetic c(Lcom/google/firebase/storage/y;Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/y;->f(Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V

    return-void
.end method

.method private synthetic e(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/storage/y;->i(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic f(Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/y;->e:Lcom/google/firebase/storage/y$a;

    invoke-interface {v0, p1, p2}, Lcom/google/firebase/storage/y$a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/y;->e:Lcom/google/firebase/storage/y$a;

    invoke-interface {v0, p1, p2}, Lcom/google/firebase/storage/y$a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public d(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/concurrent/Executor;",
            "T",
            "ListenerTypeT;",
            ")V"
        }
    .end annotation

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/storage/y;->c:Lcom/google/firebase/storage/s;

    invoke-virtual {v0}, Lcom/google/firebase/storage/s;->J()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/storage/y;->c:Lcom/google/firebase/storage/s;

    invoke-virtual {v1}, Lcom/google/firebase/storage/s;->B()I

    move-result v1

    iget v2, p0, Lcom/google/firebase/storage/y;->d:I

    and-int/2addr v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v4, p0, Lcom/google/firebase/storage/y;->a:Ljava/util/Queue;

    invoke-interface {v4, p3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    new-instance v4, Lx6/g;

    invoke-direct {v4, p2}, Lx6/g;-><init>(Ljava/util/concurrent/Executor;)V

    iget-object p2, p0, Lcom/google/firebase/storage/y;->b:Ljava/util/HashMap;

    invoke-virtual {p2, p3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const-string p2, "Activity is already destroyed!"

    invoke-static {v2, p2}, Lc4/s;->b(ZLjava/lang/Object;)V

    invoke-static {}, Lx6/a;->a()Lx6/a;

    move-result-object p2

    new-instance v2, Lcom/google/firebase/storage/v;

    invoke-direct {v2, p0, p3}, Lcom/google/firebase/storage/v;-><init>(Lcom/google/firebase/storage/y;Ljava/lang/Object;)V

    invoke-virtual {p2, p1, p3, v2}, Lx6/a;->c(Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/Runnable;)V

    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    iget-object p1, p0, Lcom/google/firebase/storage/y;->c:Lcom/google/firebase/storage/s;

    invoke-virtual {p1}, Lcom/google/firebase/storage/s;->g0()Lcom/google/firebase/storage/s$a;

    move-result-object p1

    new-instance p2, Lcom/google/firebase/storage/x;

    invoke-direct {p2, p0, p3, p1}, Lcom/google/firebase/storage/x;-><init>(Lcom/google/firebase/storage/y;Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V

    invoke-virtual {v4, p2}, Lx6/g;->a(Ljava/lang/Runnable;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h()V
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/storage/y;->c:Lcom/google/firebase/storage/s;

    invoke-virtual {v0}, Lcom/google/firebase/storage/s;->B()I

    move-result v0

    iget v1, p0, Lcom/google/firebase/storage/y;->d:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/storage/y;->c:Lcom/google/firebase/storage/s;

    invoke-virtual {v0}, Lcom/google/firebase/storage/s;->g0()Lcom/google/firebase/storage/s$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/storage/y;->a:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/y;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx6/g;

    if-eqz v3, :cond_0

    new-instance v4, Lcom/google/firebase/storage/w;

    invoke-direct {v4, p0, v2, v0}, Lcom/google/firebase/storage/w;-><init>(Lcom/google/firebase/storage/y;Ljava/lang/Object;Lcom/google/firebase/storage/s$a;)V

    invoke-virtual {v3, v4}, Lx6/g;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "ListenerTypeT;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/storage/y;->c:Lcom/google/firebase/storage/s;

    invoke-virtual {v0}, Lcom/google/firebase/storage/s;->J()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/storage/y;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/firebase/storage/y;->a:Ljava/util/Queue;

    invoke-interface {v1, p1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lx6/a;->a()Lx6/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lx6/a;->b(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
