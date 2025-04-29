.class public Lp6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lj6/m;

.field private final b:Lp6/l0;

.field private final c:Lq6/g;

.field private final d:Lp6/w;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "date"

    const-string v2, "x-google-backends"

    const-string v3, "x-google-netmon-label"

    const-string v4, "x-google-service"

    const-string v5, "x-google-gfe-request-trace"

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lp6/o;->e:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lj6/m;Lq6/g;Lh6/a;Lh6/a;Landroid/content/Context;Lp6/g0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/m;",
            "Lq6/g;",
            "Lh6/a<",
            "Lh6/j;",
            ">;",
            "Lh6/a<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lp6/g0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/o;->a:Lj6/m;

    iput-object p2, p0, Lp6/o;->c:Lq6/g;

    new-instance v0, Lp6/l0;

    invoke-virtual {p1}, Lj6/m;->a()Lm6/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lp6/l0;-><init>(Lm6/f;)V

    iput-object v0, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual/range {p0 .. p6}, Lp6/o;->h(Lj6/m;Lq6/g;Lh6/a;Lh6/a;Landroid/content/Context;Lp6/g0;)Lp6/w;

    move-result-object p1

    iput-object p1, p0, Lp6/o;->d:Lp6/w;

    return-void
.end method

.method public static synthetic a(Lp6/o;Lcom/google/android/gms/tasks/Task;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1}, Lp6/o;->n(Lcom/google/android/gms/tasks/Task;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp6/o;Lcom/google/android/gms/tasks/Task;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lp6/o;->m(Lcom/google/android/gms/tasks/Task;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lp6/o;)Lp6/l0;
    .locals 0

    iget-object p0, p0, Lp6/o;->b:Lp6/l0;

    return-object p0
.end method

.method static synthetic d(Lp6/o;)Lp6/w;
    .locals 0

    iget-object p0, p0, Lp6/o;->d:Lp6/w;

    return-object p0
.end method

.method public static i(Li9/j1;)Z
    .locals 1

    invoke-virtual {p0}, Li9/j1;->m()Li9/j1$b;

    invoke-virtual {p0}, Li9/j1;->l()Ljava/lang/Throwable;

    move-result-object p0

    instance-of v0, p0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "no ciphers available"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static j(Lcom/google/firebase/firestore/z$a;)Z
    .locals 3

    sget-object v0, Lp6/o$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown gRPC status code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 p0, 0x1

    return p0

    :pswitch_1
    const/4 p0, 0x0

    return p0

    :pswitch_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Treated status OK as error"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static k(Li9/j1;)Z
    .locals 0

    invoke-virtual {p0}, Li9/j1;->m()Li9/j1$b;

    move-result-object p0

    invoke-virtual {p0}, Li9/j1$b;->h()I

    move-result p0

    invoke-static {p0}, Lcom/google/firebase/firestore/z$a;->g(I)Lcom/google/firebase/firestore/z$a;

    move-result-object p0

    invoke-static {p0}, Lp6/o;->j(Lcom/google/firebase/firestore/z$a;)Z

    move-result p0

    return p0
.end method

.method public static l(Li9/j1;)Z
    .locals 1

    invoke-static {p0}, Lp6/o;->k(Li9/j1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li9/j1;->m()Li9/j1$b;

    move-result-object p0

    sget-object v0, Li9/j1$b;->v:Li9/j1$b;

    invoke-virtual {p0, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private synthetic m(Lcom/google/android/gms/tasks/Task;)Ljava/util/List;
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Lcom/google/firebase/firestore/z;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/firestore/z;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/z;->a()Lcom/google/firebase/firestore/z$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/firestore/z$a;->A:Lcom/google/firebase/firestore/z$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lp6/o;->d:Lp6/w;

    invoke-virtual {v0}, Lp6/w;->h()V

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld7/g;

    iget-object v0, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual {p1}, Ld7/g;->f0()Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object v0

    invoke-virtual {p1}, Ld7/g;->i0()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Ld7/g;->h0(I)Ld7/f0;

    move-result-object v4

    iget-object v5, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual {v5, v4, v0}, Lp6/l0;->p(Ld7/f0;Lm6/w;)Ln6/i;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method private synthetic n(Lcom/google/android/gms/tasks/Task;)Ljava/util/Map;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Lcom/google/firebase/firestore/z;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/firestore/z;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/z;->a()Lcom/google/firebase/firestore/z$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/firestore/z$a;->A:Lcom/google/firebase/firestore/z$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lp6/o;->d:Lp6/w;

    invoke-virtual {v0}, Lp6/w;->h()V

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld7/v;

    invoke-virtual {p1}, Ld7/v;->g0()Ld7/a;

    move-result-object p1

    invoke-virtual {p1}, Ld7/a;->f0()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public e(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln6/f;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Ln6/i;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ld7/f;->k0()Ld7/f$b;

    move-result-object v0

    iget-object v1, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual {v1}, Lp6/l0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/f$b;->I(Ljava/lang/String;)Ld7/f$b;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/f;

    iget-object v2, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual {v2, v1}, Lp6/l0;->O(Ln6/f;)Ld7/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/f$b;->H(Ld7/c0;)Ld7/f$b;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp6/o;->d:Lp6/w;

    invoke-static {}, Ld7/p;->b()Li9/z0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v0

    check-cast v0, Ld7/f;

    invoke-virtual {p1, v1, v0}, Lp6/w;->n(Li9/z0;Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object v0, p0, Lp6/o;->c:Lq6/g;

    invoke-virtual {v0}, Lq6/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lp6/n;

    invoke-direct {v1, p0}, Lp6/n;-><init>(Lp6/o;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method f(Lp6/y0$a;)Lp6/y0;
    .locals 4

    new-instance v0, Lp6/y0;

    iget-object v1, p0, Lp6/o;->d:Lp6/w;

    iget-object v2, p0, Lp6/o;->c:Lq6/g;

    iget-object v3, p0, Lp6/o;->b:Lp6/l0;

    invoke-direct {v0, v1, v2, v3, p1}, Lp6/y0;-><init>(Lp6/w;Lq6/g;Lp6/l0;Lp6/y0$a;)V

    return-object v0
.end method

.method g(Lp6/z0$a;)Lp6/z0;
    .locals 4

    new-instance v0, Lp6/z0;

    iget-object v1, p0, Lp6/o;->d:Lp6/w;

    iget-object v2, p0, Lp6/o;->c:Lq6/g;

    iget-object v3, p0, Lp6/o;->b:Lp6/l0;

    invoke-direct {v0, v1, v2, v3, p1}, Lp6/z0;-><init>(Lp6/w;Lq6/g;Lp6/l0;Lp6/z0$a;)V

    return-object v0
.end method

.method h(Lj6/m;Lq6/g;Lh6/a;Lh6/a;Landroid/content/Context;Lp6/g0;)Lp6/w;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/m;",
            "Lq6/g;",
            "Lh6/a<",
            "Lh6/j;",
            ">;",
            "Lh6/a<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lp6/g0;",
            ")",
            "Lp6/w;"
        }
    .end annotation

    new-instance v7, Lp6/w;

    move-object v0, v7

    move-object v1, p2

    move-object v2, p5

    move-object v3, p3

    move-object v4, p4

    move-object v5, p1

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lp6/w;-><init>(Lq6/g;Landroid/content/Context;Lh6/a;Lh6/a;Lj6/m;Lp6/g0;)V

    return-object v7
.end method

.method public o(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm6/l;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Lm6/s;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ld7/d;->k0()Ld7/d$b;

    move-result-object v0

    iget-object v1, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual {v1}, Lp6/l0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/d$b;->I(Ljava/lang/String;)Ld7/d$b;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    iget-object v3, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual {v3, v2}, Lp6/l0;->L(Lm6/l;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ld7/d$b;->H(Ljava/lang/String;)Ld7/d$b;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v3, p0, Lp6/o;->d:Lp6/w;

    invoke-static {}, Ld7/p;->a()Li9/z0;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v0

    check-cast v0, Ld7/d;

    new-instance v5, Lp6/o$a;

    invoke-direct {v5, p0, v1, p1, v2}, Lp6/o$a;-><init>(Lp6/o;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v3, v4, v0, v5}, Lp6/w;->o(Li9/z0;Ljava/lang/Object;Lp6/w$e;)V

    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public p(Lj6/b1;Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 1
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

    iget-object v0, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual {p1}, Lj6/b1;->D()Lj6/g1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp6/l0;->S(Lj6/g1;)Ld7/y$d;

    move-result-object p1

    iget-object v0, p0, Lp6/o;->b:Lp6/l0;

    invoke-virtual {v0, p1, p2}, Lp6/l0;->U(Ld7/y$d;Ljava/util/List;)Ld7/w;

    move-result-object p2

    invoke-static {}, Ld7/u;->i0()Ld7/u$b;

    move-result-object v0

    invoke-virtual {p1}, Ld7/y$d;->i0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/u$b;->H(Ljava/lang/String;)Ld7/u$b;

    invoke-virtual {v0, p2}, Ld7/u$b;->I(Ld7/w;)Ld7/u$b;

    iget-object p1, p0, Lp6/o;->d:Lp6/w;

    invoke-static {}, Ld7/p;->d()Li9/z0;

    move-result-object p2

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v0

    check-cast v0, Ld7/u;

    invoke-virtual {p1, p2, v0}, Lp6/w;->n(Li9/z0;Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object p2, p0, Lp6/o;->c:Lq6/g;

    invoke-virtual {p2}, Lq6/g;->o()Ljava/util/concurrent/Executor;

    move-result-object p2

    new-instance v0, Lp6/m;

    invoke-direct {v0, p0}, Lp6/m;-><init>(Lp6/o;)V

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method q()V
    .locals 1

    iget-object v0, p0, Lp6/o;->d:Lp6/w;

    invoke-virtual {v0}, Lp6/w;->q()V

    return-void
.end method
