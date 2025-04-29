.class public final Lj6/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj6/m;

.field private final b:Lh6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh6/a<",
            "Lh6/j;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lh6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh6/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lq6/g;

.field private final e:Li6/g;

.field private final f:Lp6/g0;

.field private g:Ll6/e1;

.field private h:Ll6/i0;

.field private i:Lp6/p0;

.field private j:Lj6/f1;

.field private k:Lj6/p;

.field private l:Ll6/f4;

.field private m:Ll6/f4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj6/m;Lcom/google/firebase/firestore/a0;Lh6/a;Lh6/a;Lq6/g;Lp6/g0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj6/m;",
            "Lcom/google/firebase/firestore/a0;",
            "Lh6/a<",
            "Lh6/j;",
            ">;",
            "Lh6/a<",
            "Ljava/lang/String;",
            ">;",
            "Lq6/g;",
            "Lp6/g0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj6/p0;->a:Lj6/m;

    iput-object p4, p0, Lj6/p0;->b:Lh6/a;

    iput-object p5, p0, Lj6/p0;->c:Lh6/a;

    iput-object p6, p0, Lj6/p0;->d:Lq6/g;

    iput-object p7, p0, Lj6/p0;->f:Lp6/g0;

    new-instance p7, Li6/g;

    new-instance v0, Lp6/l0;

    invoke-virtual {p2}, Lj6/m;->a()Lm6/f;

    move-result-object p2

    invoke-direct {v0, p2}, Lp6/l0;-><init>(Lm6/f;)V

    invoke-direct {p7, v0}, Li6/g;-><init>(Lp6/l0;)V

    iput-object p7, p0, Lj6/p0;->e:Li6/g;

    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance p7, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p7, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, Lj6/m0;

    invoke-direct {v0, p0, p2, p1, p3}, Lj6/m0;-><init>(Lj6/p0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lcom/google/firebase/firestore/a0;)V

    invoke-virtual {p6, v0}, Lq6/g;->l(Ljava/lang/Runnable;)V

    new-instance p1, Lj6/f0;

    invoke-direct {p1, p0, p7, p2, p6}, Lj6/f0;-><init>(Lj6/p0;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/android/gms/tasks/TaskCompletionSource;Lq6/g;)V

    invoke-virtual {p4, p1}, Lh6/a;->d(Lq6/u;)V

    sget-object p1, Lj6/g0;->a:Lj6/g0;

    invoke-virtual {p5, p1}, Lh6/a;->d(Lq6/u;)V

    return-void
.end method

.method private E(Landroid/content/Context;Lh6/j;Lcom/google/firebase/firestore/a0;)V
    .locals 11

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p2}, Lh6/j;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "FirestoreClient"

    const-string v2, "Initializing. user=%s"

    invoke-static {v1, v2, v0}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lp6/o;

    iget-object v4, p0, Lj6/p0;->a:Lj6/m;

    iget-object v5, p0, Lj6/p0;->d:Lq6/g;

    iget-object v6, p0, Lj6/p0;->b:Lh6/a;

    iget-object v7, p0, Lj6/p0;->c:Lh6/a;

    iget-object v9, p0, Lj6/p0;->f:Lp6/g0;

    move-object v3, v0

    move-object v8, p1

    invoke-direct/range {v3 .. v9}, Lp6/o;-><init>(Lj6/m;Lq6/g;Lh6/a;Lh6/a;Landroid/content/Context;Lp6/g0;)V

    new-instance v1, Lj6/j$a;

    iget-object v5, p0, Lj6/p0;->d:Lq6/g;

    iget-object v6, p0, Lj6/p0;->a:Lj6/m;

    const/16 v9, 0x64

    move-object v3, v1

    move-object v4, p1

    move-object v7, v0

    move-object v8, p2

    move-object v10, p3

    invoke-direct/range {v3 .. v10}, Lj6/j$a;-><init>(Landroid/content/Context;Lq6/g;Lj6/m;Lp6/o;Lh6/j;ILcom/google/firebase/firestore/a0;)V

    invoke-virtual {p3}, Lcom/google/firebase/firestore/a0;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lj6/e1;

    invoke-direct {p1}, Lj6/e1;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p1, Lj6/x0;

    invoke-direct {p1}, Lj6/x0;-><init>()V

    :goto_0
    invoke-virtual {p1, v1}, Lj6/j;->q(Lj6/j$a;)V

    invoke-virtual {p1}, Lj6/j;->n()Ll6/e1;

    move-result-object p2

    iput-object p2, p0, Lj6/p0;->g:Ll6/e1;

    invoke-virtual {p1}, Lj6/j;->k()Ll6/f4;

    move-result-object p2

    iput-object p2, p0, Lj6/p0;->m:Ll6/f4;

    invoke-virtual {p1}, Lj6/j;->m()Ll6/i0;

    move-result-object p2

    iput-object p2, p0, Lj6/p0;->h:Ll6/i0;

    invoke-virtual {p1}, Lj6/j;->o()Lp6/p0;

    move-result-object p2

    iput-object p2, p0, Lj6/p0;->i:Lp6/p0;

    invoke-virtual {p1}, Lj6/j;->p()Lj6/f1;

    move-result-object p2

    iput-object p2, p0, Lj6/p0;->j:Lj6/f1;

    invoke-virtual {p1}, Lj6/j;->j()Lj6/p;

    move-result-object p2

    iput-object p2, p0, Lj6/p0;->k:Lj6/p;

    invoke-virtual {p1}, Lj6/j;->l()Ll6/k;

    move-result-object p1

    iget-object p2, p0, Lj6/p0;->m:Ll6/f4;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ll6/f4;->start()V

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll6/k;->f()Ll6/k$a;

    move-result-object p1

    iput-object p1, p0, Lj6/p0;->l:Ll6/f4;

    invoke-interface {p1}, Ll6/f4;->start()V

    :cond_2
    return-void
.end method

.method private synthetic G(Lcom/google/firebase/firestore/o;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->k:Lj6/p;

    invoke-virtual {v0, p1}, Lj6/p;->e(Lcom/google/firebase/firestore/o;)V

    return-void
.end method

.method private synthetic H(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->h:Ll6/i0;

    invoke-virtual {v0, p1}, Ll6/i0;->z(Ljava/util/List;)V

    return-void
.end method

.method private synthetic I()V
    .locals 1

    iget-object v0, p0, Lj6/p0;->i:Lp6/p0;

    invoke-virtual {v0}, Lp6/p0;->q()V

    return-void
.end method

.method private synthetic J()V
    .locals 1

    iget-object v0, p0, Lj6/p0;->i:Lp6/p0;

    invoke-virtual {v0}, Lp6/p0;->s()V

    return-void
.end method

.method private static synthetic K(Lcom/google/android/gms/tasks/Task;)Lm6/i;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm6/i;

    invoke-interface {p0}, Lm6/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lm6/i;->h()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    new-instance p0, Lcom/google/firebase/firestore/z;

    sget-object v0, Lcom/google/firebase/firestore/z$a;->y:Lcom/google/firebase/firestore/z$a;

    const-string v1, "Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)"

    invoke-direct {p0, v1, v0}, Lcom/google/firebase/firestore/z;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/z$a;)V

    throw p0
.end method

.method private synthetic L(Lm6/l;)Lm6/i;
    .locals 1

    iget-object v0, p0, Lj6/p0;->h:Ll6/i0;

    invoke-virtual {v0, p1}, Ll6/i0;->h0(Lm6/l;)Lm6/i;

    move-result-object p1

    return-object p1
.end method

.method private synthetic M(Lj6/b1;)Lj6/y1;
    .locals 3

    iget-object v0, p0, Lj6/p0;->h:Ll6/i0;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll6/i0;->A(Lj6/b1;Z)Ll6/h1;

    move-result-object v0

    new-instance v1, Lj6/w1;

    invoke-virtual {v0}, Ll6/h1;->b()Ld6/e;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lj6/w1;-><init>(Lj6/b1;Ld6/e;)V

    invoke-virtual {v0}, Ll6/h1;->a()Ld6/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj6/w1;->g(Ld6/c;)Lj6/w1$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj6/w1;->b(Lj6/w1$b;)Lj6/x1;

    move-result-object p1

    invoke-virtual {p1}, Lj6/x1;->b()Lj6/y1;

    move-result-object p1

    return-object p1
.end method

.method private synthetic N(Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 12

    iget-object v0, p0, Lj6/p0;->h:Ll6/i0;

    invoke-virtual {v0, p1}, Ll6/i0;->H(Ljava/lang/String;)Li6/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Li6/j;->a()Li6/i;

    move-result-object v0

    invoke-virtual {v0}, Li6/i;->b()Lj6/g1;

    move-result-object v0

    new-instance v11, Lj6/b1;

    invoke-virtual {v0}, Lj6/g1;->n()Lm6/u;

    move-result-object v2

    invoke-virtual {v0}, Lj6/g1;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lj6/g1;->h()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0}, Lj6/g1;->m()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lj6/g1;->j()J

    move-result-wide v6

    invoke-virtual {p1}, Li6/j;->a()Li6/i;

    move-result-object p1

    invoke-virtual {p1}, Li6/i;->a()Lj6/b1$a;

    move-result-object v8

    invoke-virtual {v0}, Lj6/g1;->p()Lj6/i;

    move-result-object v9

    invoke-virtual {v0}, Lj6/g1;->f()Lj6/i;

    move-result-object v10

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lj6/b1;-><init>(Lm6/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLj6/b1$a;Lj6/i;Lj6/i;)V

    invoke-virtual {p2, v11}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private synthetic O(Lj6/c1;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->k:Lj6/p;

    invoke-virtual {v0, p1}, Lj6/p;->d(Lj6/c1;)I

    return-void
.end method

.method private synthetic P(Li6/f;Lcom/google/firebase/firestore/h0;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->j:Lj6/f1;

    invoke-virtual {v0, p1, p2}, Lj6/f1;->o(Li6/f;Lcom/google/firebase/firestore/h0;)V

    return-void
.end method

.method private synthetic Q(Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lcom/google/firebase/firestore/a0;)V
    .locals 0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh6/j;

    invoke-direct {p0, p2, p1, p3}, Lj6/p0;->E(Landroid/content/Context;Lh6/j;Lcom/google/firebase/firestore/a0;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method private synthetic R(Lh6/j;)V
    .locals 5

    iget-object v0, p0, Lj6/p0;->j:Lj6/f1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "SyncEngine not yet initialized"

    invoke-static {v0, v4, v3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lh6/j;->a()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "FirestoreClient"

    const-string v2, "Credential changed. Current user: %s"

    invoke-static {v1, v2, v0}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lj6/p0;->j:Lj6/f1;

    invoke-virtual {v0, p1}, Lj6/f1;->l(Lh6/j;)V

    return-void
.end method

.method private synthetic S(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/android/gms/tasks/TaskCompletionSource;Lq6/g;Lh6/j;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result p1

    xor-int/2addr p1, v1

    new-array p3, v0, [Ljava/lang/Object;

    const-string v0, "Already fulfilled first user task"

    invoke-static {p1, v0, p3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2, p4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lj6/t;

    invoke-direct {p1, p0, p4}, Lj6/t;-><init>(Lj6/p0;Lh6/j;)V

    invoke-virtual {p3, p1}, Lq6/g;->l(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method private static synthetic T(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private synthetic U(Lcom/google/firebase/firestore/o;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->k:Lj6/p;

    invoke-virtual {v0, p1}, Lj6/p;->h(Lcom/google/firebase/firestore/o;)V

    return-void
.end method

.method private static synthetic V(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/util/Map;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic W(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Exception;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic X(Lj6/b1;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->j:Lj6/f1;

    invoke-virtual {v0, p1, p2}, Lj6/f1;->w(Lj6/b1;Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lj6/h0;

    invoke-direct {p2, p3}, Lj6/h0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lj6/d0;

    invoke-direct {p2, p3}, Lj6/d0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private synthetic Y(Lj6/c1;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->k:Lj6/p;

    invoke-virtual {v0, p1}, Lj6/p;->g(Lj6/c1;)V

    return-void
.end method

.method private synthetic Z()V
    .locals 1

    iget-object v0, p0, Lj6/p0;->i:Lp6/p0;

    invoke-virtual {v0}, Lp6/p0;->O()V

    iget-object v0, p0, Lj6/p0;->g:Ll6/e1;

    invoke-virtual {v0}, Ll6/e1;->l()V

    iget-object v0, p0, Lj6/p0;->m:Ll6/f4;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll6/f4;->stop()V

    :cond_0
    iget-object v0, p0, Lj6/p0;->l:Ll6/f4;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ll6/f4;->stop()V

    :cond_1
    return-void
.end method

.method public static synthetic a(Lcom/google/android/gms/tasks/Task;)Lm6/i;
    .locals 0

    invoke-static {p0}, Lj6/p0;->K(Lcom/google/android/gms/tasks/Task;)Lm6/i;

    move-result-object p0

    return-object p0
.end method

.method private synthetic a0(Lcom/google/firebase/firestore/e1;Lq6/t;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    iget-object v0, p0, Lj6/p0;->j:Lj6/f1;

    iget-object v1, p0, Lj6/p0;->d:Lq6/g;

    invoke-virtual {v0, v1, p1, p2}, Lj6/f1;->A(Lq6/g;Lcom/google/firebase/firestore/e1;Lq6/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic b(Lj6/p0;Lj6/c1;)V
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->Y(Lj6/c1;)V

    return-void
.end method

.method private synthetic b0(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->j:Lj6/f1;

    invoke-virtual {v0, p1}, Lj6/f1;->s(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic c(Lj6/p0;)V
    .locals 0

    invoke-direct {p0}, Lj6/p0;->Z()V

    return-void
.end method

.method private synthetic c0(Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Lj6/p0;->j:Lj6/f1;

    invoke-virtual {v0, p1, p2}, Lj6/f1;->C(Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic d(Lj6/p0;Lj6/c1;)V
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->O(Lj6/c1;)V

    return-void
.end method

.method public static synthetic e(Lj6/p0;Lh6/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->R(Lh6/j;)V

    return-void
.end method

.method public static synthetic f(Lj6/p0;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj6/p0;->c0(Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic g(Lj6/p0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lcom/google/firebase/firestore/a0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj6/p0;->Q(Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lcom/google/firebase/firestore/a0;)V

    return-void
.end method

.method public static synthetic h(Lj6/p0;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj6/p0;->N(Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic i(Lj6/p0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->H(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic j(Lj6/p0;Lcom/google/firebase/firestore/e1;Lq6/t;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1, p2}, Lj6/p0;->a0(Lcom/google/firebase/firestore/e1;Lq6/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lj6/p0;->V(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/util/Map;)V

    return-void
.end method

.method private k0()V
    .locals 2

    invoke-virtual {p0}, Lj6/p0;->F()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The client has already been terminated"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic l(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lj6/p0;->T(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic m(Lj6/p0;Lcom/google/firebase/firestore/o;)V
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->G(Lcom/google/firebase/firestore/o;)V

    return-void
.end method

.method public static synthetic n(Lj6/p0;Lj6/b1;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj6/p0;->X(Lj6/b1;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic o(Lj6/p0;Lj6/b1;)Lj6/y1;
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->M(Lj6/b1;)Lj6/y1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lj6/p0;->W(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic q(Lj6/p0;Lcom/google/firebase/firestore/o;)V
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->U(Lcom/google/firebase/firestore/o;)V

    return-void
.end method

.method public static synthetic r(Lj6/p0;)V
    .locals 0

    invoke-direct {p0}, Lj6/p0;->I()V

    return-void
.end method

.method public static synthetic s(Lj6/p0;Lm6/l;)Lm6/i;
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->L(Lm6/l;)Lm6/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lj6/p0;)V
    .locals 0

    invoke-direct {p0}, Lj6/p0;->J()V

    return-void
.end method

.method public static synthetic u(Lj6/p0;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/android/gms/tasks/TaskCompletionSource;Lq6/g;Lh6/j;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lj6/p0;->S(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/android/gms/tasks/TaskCompletionSource;Lq6/g;Lh6/j;)V

    return-void
.end method

.method public static synthetic v(Lj6/p0;Li6/f;Lcom/google/firebase/firestore/h0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj6/p0;->P(Li6/f;Lcom/google/firebase/firestore/h0;)V

    return-void
.end method

.method public static synthetic w(Lj6/p0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1}, Lj6/p0;->b0(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public A()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/k0;

    invoke-direct {v1, p0}, Lj6/k0;-><init>(Lj6/p0;)V

    invoke-virtual {v0, v1}, Lq6/g;->i(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public B(Lm6/l;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/l;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/e0;

    invoke-direct {v1, p0, p1}, Lj6/e0;-><init>(Lj6/p0;Lm6/l;)V

    invoke-virtual {v0, v1}, Lq6/g;->j(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    sget-object v0, Lj6/s;->a:Lj6/s;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->continueWith(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public C(Lj6/b1;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lj6/y1;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/c0;

    invoke-direct {v1, p0, p1}, Lj6/c0;-><init>(Lj6/p0;Lj6/b1;)V

    invoke-virtual {v0, v1}, Lq6/g;->j(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public D(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lj6/b1;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v1, p0, Lj6/p0;->d:Lq6/g;

    new-instance v2, Lj6/y;

    invoke-direct {v2, p0, p1, v0}, Lj6/y;-><init>(Lj6/p0;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v1, v2}, Lq6/g;->l(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public F()Z
    .locals 1

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    invoke-virtual {v0}, Lq6/g;->p()Z

    move-result v0

    return v0
.end method

.method public d0(Lj6/b1;Lj6/p$a;Lcom/google/firebase/firestore/o;)Lj6/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Lj6/p$a;",
            "Lcom/google/firebase/firestore/o<",
            "Lj6/y1;",
            ">;)",
            "Lj6/c1;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    new-instance v0, Lj6/c1;

    invoke-direct {v0, p1, p2, p3}, Lj6/c1;-><init>(Lj6/b1;Lj6/p$a;Lcom/google/firebase/firestore/o;)V

    iget-object p1, p0, Lj6/p0;->d:Lq6/g;

    new-instance p2, Lj6/x;

    invoke-direct {p2, p0, v0}, Lj6/x;-><init>(Lj6/p0;Lj6/c1;)V

    invoke-virtual {p1, p2}, Lq6/g;->l(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public e0(Ljava/io/InputStream;Lcom/google/firebase/firestore/h0;)V
    .locals 2

    invoke-direct {p0}, Lj6/p0;->k0()V

    new-instance v0, Li6/f;

    iget-object v1, p0, Lj6/p0;->e:Li6/g;

    invoke-direct {v0, v1, p1}, Li6/f;-><init>(Li6/g;Ljava/io/InputStream;)V

    iget-object p1, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/u;

    invoke-direct {v1, p0, v0, p2}, Lj6/u;-><init>(Lj6/p0;Li6/f;Lcom/google/firebase/firestore/h0;)V

    invoke-virtual {p1, v1}, Lq6/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f0(Lcom/google/firebase/firestore/o;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/o<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lj6/p0;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/o0;

    invoke-direct {v1, p0, p1}, Lj6/o0;-><init>(Lj6/p0;Lcom/google/firebase/firestore/o;)V

    invoke-virtual {v0, v1}, Lq6/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g0(Lj6/b1;Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/a;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ld7/b0;",
            ">;>;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v1, p0, Lj6/p0;->d:Lq6/g;

    new-instance v2, Lj6/v;

    invoke-direct {v2, p0, p1, p2, v0}, Lj6/v;-><init>(Lj6/p0;Lj6/b1;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v1, v2}, Lq6/g;->l(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public h0(Lj6/c1;)V
    .locals 2

    invoke-virtual {p0}, Lj6/p0;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/w;

    invoke-direct {v1, p0, p1}, Lj6/w;-><init>(Lj6/p0;Lj6/c1;)V

    invoke-virtual {v0, v1}, Lq6/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public i0()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj6/p0;->b:Lh6/a;

    invoke-virtual {v0}, Lh6/a;->c()V

    iget-object v0, p0, Lj6/p0;->c:Lh6/a;

    invoke-virtual {v0}, Lh6/a;->c()V

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/i0;

    invoke-direct {v1, p0}, Lj6/i0;-><init>(Lj6/p0;)V

    invoke-virtual {v0, v1}, Lq6/g;->n(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public j0(Lcom/google/firebase/firestore/e1;Lq6/t;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/firebase/firestore/e1;",
            "Lq6/t<",
            "Lj6/k1;",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    invoke-virtual {v0}, Lq6/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lj6/b0;

    invoke-direct {v1, p0, p1, p2}, Lj6/b0;-><init>(Lj6/p0;Lcom/google/firebase/firestore/e1;Lq6/t;)V

    invoke-static {v0, v1}, Lq6/g;->g(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public l0()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v1, p0, Lj6/p0;->d:Lq6/g;

    new-instance v2, Lj6/l0;

    invoke-direct {v2, p0, v0}, Lj6/l0;-><init>(Lj6/p0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v1, v2}, Lq6/g;->l(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public m0(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln6/f;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v1, p0, Lj6/p0;->d:Lq6/g;

    new-instance v2, Lj6/a0;

    invoke-direct {v2, p0, p1, v0}, Lj6/a0;-><init>(Lj6/p0;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v1, v2}, Lq6/g;->l(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public x(Lcom/google/firebase/firestore/o;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/o<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/n0;

    invoke-direct {v1, p0, p1}, Lj6/n0;-><init>(Lj6/p0;Lcom/google/firebase/firestore/o;)V

    invoke-virtual {v0, v1}, Lq6/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public y(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm6/q;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/z;

    invoke-direct {v1, p0, p1}, Lj6/z;-><init>(Lj6/p0;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lq6/g;->i(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public z()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lj6/p0;->k0()V

    iget-object v0, p0, Lj6/p0;->d:Lq6/g;

    new-instance v1, Lj6/j0;

    invoke-direct {v1, p0}, Lj6/j0;-><init>(Lj6/p0;)V

    invoke-virtual {v0, v1}, Lq6/g;->i(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
