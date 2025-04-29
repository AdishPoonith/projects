.class public final Lp6/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/x0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/p0$c;
    }
.end annotation


# instance fields
.field private final a:Lp6/p0$c;

.field private final b:Ll6/i0;

.field private final c:Lp6/o;

.field private final d:Lp6/l;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ll6/h4;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lp6/j0;

.field private g:Z

.field private final h:Lp6/y0;

.field private final i:Lp6/z0;

.field private j:Lp6/x0;

.field private final k:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ln6/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp6/p0$c;Ll6/i0;Lp6/o;Lq6/g;Lp6/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp6/p0;->g:Z

    iput-object p1, p0, Lp6/p0;->a:Lp6/p0$c;

    iput-object p2, p0, Lp6/p0;->b:Ll6/i0;

    iput-object p3, p0, Lp6/p0;->c:Lp6/o;

    iput-object p5, p0, Lp6/p0;->d:Lp6/l;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lp6/p0;->e:Ljava/util/Map;

    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p2, p0, Lp6/p0;->k:Ljava/util/Deque;

    new-instance p2, Lp6/j0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lp6/n0;

    invoke-direct {v0, p1}, Lp6/n0;-><init>(Lp6/p0$c;)V

    invoke-direct {p2, p4, v0}, Lp6/j0;-><init>(Lq6/g;Lp6/j0$a;)V

    iput-object p2, p0, Lp6/p0;->f:Lp6/j0;

    new-instance p1, Lp6/p0$a;

    invoke-direct {p1, p0}, Lp6/p0$a;-><init>(Lp6/p0;)V

    invoke-virtual {p3, p1}, Lp6/o;->f(Lp6/y0$a;)Lp6/y0;

    move-result-object p1

    iput-object p1, p0, Lp6/p0;->h:Lp6/y0;

    new-instance p1, Lp6/p0$b;

    invoke-direct {p1, p0}, Lp6/p0$b;-><init>(Lp6/p0;)V

    invoke-virtual {p3, p1}, Lp6/o;->g(Lp6/z0$a;)Lp6/z0;

    move-result-object p1

    iput-object p1, p0, Lp6/p0;->i:Lp6/z0;

    new-instance p1, Lp6/o0;

    invoke-direct {p1, p0, p4}, Lp6/o0;-><init>(Lp6/p0;Lq6/g;)V

    invoke-interface {p5, p1}, Lp6/l;->a(Lq6/n;)V

    return-void
.end method

.method private A(Li9/j1;)V
    .locals 3

    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lp6/p0;->N()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Write stream was stopped gracefully while still needed."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/z0;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lp6/p0;->y(Li9/j1;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lp6/p0;->z(Li9/j1;)V

    :cond_2
    :goto_0
    invoke-direct {p0}, Lp6/p0;->N()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lp6/p0;->R()V

    :cond_3
    return-void
.end method

.method private B()V
    .locals 3

    iget-object v0, p0, Lp6/p0;->b:Ll6/i0;

    iget-object v1, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v1}, Lp6/z0;->y()Lcom/google/protobuf/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll6/i0;->k0(Lcom/google/protobuf/i;)V

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/g;

    iget-object v2, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v1}, Ln6/g;->h()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Lp6/z0;->D(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private C(Lm6/w;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/w;",
            "Ljava/util/List<",
            "Ln6/i;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/g;

    iget-object v1, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v1}, Lp6/z0;->y()Lcom/google/protobuf/i;

    move-result-object v1

    invoke-static {v0, p1, p2, v1}, Ln6/h;->a(Ln6/g;Lm6/w;Ljava/util/List;Lcom/google/protobuf/i;)Ln6/h;

    move-result-object p1

    iget-object p2, p0, Lp6/p0;->a:Lp6/p0$c;

    invoke-interface {p2, p1}, Lp6/p0$c;->e(Ln6/h;)V

    invoke-virtual {p0}, Lp6/p0;->t()V

    return-void
.end method

.method private synthetic D(Lp6/l$a;)V
    .locals 2

    sget-object v0, Lp6/l$a;->k:Lp6/l$a;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->f:Lp6/j0;

    invoke-virtual {v0}, Lp6/j0;->c()Lj6/z0;

    move-result-object v0

    sget-object v1, Lj6/z0;->k:Lj6/z0;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lp6/l$a;->j:Lp6/l$a;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lp6/p0;->f:Lp6/j0;

    invoke-virtual {p1}, Lp6/j0;->c()Lj6/z0;

    move-result-object p1

    sget-object v0, Lj6/z0;->l:Lj6/z0;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lp6/p0;->n()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "RemoteStore"

    const-string v1, "Restarting streams for network reachability change."

    invoke-static {v0, v1, p1}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lp6/p0;->I()V

    return-void
.end method

.method private synthetic E(Lq6/g;Lp6/l$a;)V
    .locals 1

    new-instance v0, Lp6/m0;

    invoke-direct {v0, p0, p2}, Lp6/m0;-><init>(Lp6/p0;Lp6/l$a;)V

    invoke-virtual {p1, v0}, Lq6/g;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method private G(Lp6/w0$d;)V
    .locals 4

    invoke-virtual {p1}, Lp6/w0$d;->a()Li9/j1;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Processing target error without a cause"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lp6/w0$d;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lp6/p0;->j:Lp6/x0;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Lp6/x0;->n(I)V

    iget-object v2, p0, Lp6/p0;->a:Lp6/p0$c;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lp6/w0$d;->a()Li9/j1;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Lp6/p0$c;->c(ILi9/j1;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method private H(Lm6/w;)V
    .locals 9

    sget-object v0, Lm6/w;->k:Lm6/w;

    invoke-virtual {p1, v0}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Can\'t raise event for unknown SnapshotVersion"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/p0;->j:Lp6/x0;

    invoke-virtual {v0, p1}, Lp6/x0;->b(Lm6/w;)Lp6/k0;

    move-result-object v0

    invoke-virtual {v0}, Lp6/k0;->d()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp6/s0;

    invoke-virtual {v3}, Lp6/s0;->e()Lcom/google/protobuf/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/protobuf/i;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v4, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll6/h4;

    if-eqz v4, :cond_0

    iget-object v5, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3}, Lp6/s0;->e()Lcom/google/protobuf/i;

    move-result-object v3

    invoke-virtual {v4, v3, p1}, Ll6/h4;->i(Lcom/google/protobuf/i;Lm6/w;)Ll6/h4;

    move-result-object v3

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lp6/k0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v1, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll6/h4;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v5, Lcom/google/protobuf/i;->k:Lcom/google/protobuf/i;

    invoke-virtual {v1}, Ll6/h4;->e()Lm6/w;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ll6/h4;->i(Lcom/google/protobuf/i;Lm6/w;)Ll6/h4;

    move-result-object v5

    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v4}, Lp6/p0;->K(I)V

    new-instance v8, Ll6/h4;

    invoke-virtual {v1}, Ll6/h4;->f()Lj6/g1;

    move-result-object v3

    invoke-virtual {v1}, Ll6/h4;->d()J

    move-result-wide v5

    sget-object v7, Ll6/g1;->k:Ll6/g1;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Ll6/h4;-><init>(Lj6/g1;IJLl6/g1;)V

    invoke-direct {p0, v8}, Lp6/p0;->L(Ll6/h4;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lp6/p0;->a:Lp6/p0$c;

    invoke-interface {p1, v0}, Lp6/p0$c;->f(Lp6/k0;)V

    return-void
.end method

.method private I()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp6/p0;->g:Z

    invoke-direct {p0}, Lp6/p0;->r()V

    iget-object v0, p0, Lp6/p0;->f:Lp6/j0;

    sget-object v1, Lj6/z0;->j:Lj6/z0;

    invoke-virtual {v0, v1}, Lp6/j0;->i(Lj6/z0;)V

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/z0;->l()V

    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {v0}, Lp6/y0;->l()V

    invoke-virtual {p0}, Lp6/p0;->s()V

    return-void
.end method

.method private K(I)V
    .locals 1

    iget-object v0, p0, Lp6/p0;->j:Lp6/x0;

    invoke-virtual {v0, p1}, Lp6/x0;->l(I)V

    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {v0, p1}, Lp6/y0;->z(I)V

    return-void
.end method

.method private L(Ll6/h4;)V
    .locals 2

    iget-object v0, p0, Lp6/p0;->j:Lp6/x0;

    invoke-virtual {p1}, Ll6/h4;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lp6/x0;->l(I)V

    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {v0, p1}, Lp6/y0;->A(Ll6/h4;)V

    return-void
.end method

.method private M()Z
    .locals 1

    invoke-virtual {p0}, Lp6/p0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {v0}, Lp6/y0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private N()Z
    .locals 1

    invoke-virtual {p0}, Lp6/p0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/z0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private Q()V
    .locals 3

    invoke-direct {p0}, Lp6/p0;->M()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWatchStream() called when shouldStartWatchStream() is false."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lp6/x0;

    invoke-direct {v0, p0}, Lp6/x0;-><init>(Lp6/x0$b;)V

    iput-object v0, p0, Lp6/p0;->j:Lp6/x0;

    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {v0}, Lp6/y0;->u()V

    iget-object v0, p0, Lp6/p0;->f:Lp6/j0;

    invoke-virtual {v0}, Lp6/j0;->e()V

    return-void
.end method

.method private R()V
    .locals 3

    invoke-direct {p0}, Lp6/p0;->N()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWriteStream() called when shouldStartWriteStream() is false."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/z0;->u()V

    return-void
.end method

.method public static synthetic c(Lp6/p0;Lq6/g;Lp6/l$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp6/p0;->E(Lq6/g;Lp6/l$a;)V

    return-void
.end method

.method public static synthetic d(Lp6/p0;Lp6/l$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp6/p0;->D(Lp6/l$a;)V

    return-void
.end method

.method static synthetic e(Lp6/p0;)V
    .locals 0

    invoke-direct {p0}, Lp6/p0;->x()V

    return-void
.end method

.method static synthetic f(Lp6/p0;Lm6/w;Lp6/w0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp6/p0;->v(Lm6/w;Lp6/w0;)V

    return-void
.end method

.method static synthetic g(Lp6/p0;Li9/j1;)V
    .locals 0

    invoke-direct {p0, p1}, Lp6/p0;->w(Li9/j1;)V

    return-void
.end method

.method static synthetic h(Lp6/p0;)Lp6/z0;
    .locals 0

    iget-object p0, p0, Lp6/p0;->i:Lp6/z0;

    return-object p0
.end method

.method static synthetic i(Lp6/p0;)V
    .locals 0

    invoke-direct {p0}, Lp6/p0;->B()V

    return-void
.end method

.method static synthetic j(Lp6/p0;Lm6/w;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp6/p0;->C(Lm6/w;Ljava/util/List;)V

    return-void
.end method

.method static synthetic k(Lp6/p0;Li9/j1;)V
    .locals 0

    invoke-direct {p0, p1}, Lp6/p0;->A(Li9/j1;)V

    return-void
.end method

.method private l(Ln6/g;)V
    .locals 3

    invoke-direct {p0}, Lp6/p0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addToWritePipeline called when pipeline is full"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/z0;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/z0;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {p1}, Ln6/g;->h()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp6/z0;->D(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private m()Z
    .locals 2

    invoke-virtual {p0}, Lp6/p0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private o()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lp6/p0;->j:Lp6/x0;

    return-void
.end method

.method private r()V
    .locals 3

    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {v0}, Lp6/y0;->v()V

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/z0;->v()V

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v2}, Ljava/util/Deque;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "RemoteStore"

    const-string v2, "Stopping write stream with %d pending writes"

    invoke-static {v1, v2, v0}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->clear()V

    :cond_0
    invoke-direct {p0}, Lp6/p0;->o()V

    return-void
.end method

.method private v(Lm6/w;Lp6/w0;)V
    .locals 5

    iget-object v0, p0, Lp6/p0;->f:Lp6/j0;

    sget-object v1, Lj6/z0;->k:Lj6/z0;

    invoke-virtual {v0, v1}, Lp6/j0;->i(Lj6/z0;)V

    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->j:Lp6/x0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WatchStream and WatchStreamAggregator should both be non-null"

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    instance-of v0, p2, Lp6/w0$d;

    if-eqz v0, :cond_1

    move-object v2, p2

    check-cast v2, Lp6/w0$d;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lp6/w0$d;->b()Lp6/w0$e;

    move-result-object v3

    sget-object v4, Lp6/w0$e;->l:Lp6/w0$e;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lp6/w0$d;->a()Li9/j1;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v2}, Lp6/p0;->G(Lp6/w0$d;)V

    goto :goto_3

    :cond_2
    instance-of v2, p2, Lp6/w0$b;

    if-eqz v2, :cond_3

    iget-object v0, p0, Lp6/p0;->j:Lp6/x0;

    check-cast p2, Lp6/w0$b;

    invoke-virtual {v0, p2}, Lp6/x0;->g(Lp6/w0$b;)V

    goto :goto_2

    :cond_3
    instance-of v2, p2, Lp6/w0$c;

    if-eqz v2, :cond_4

    iget-object v0, p0, Lp6/p0;->j:Lp6/x0;

    check-cast p2, Lp6/w0$c;

    invoke-virtual {v0, p2}, Lp6/x0;->h(Lp6/w0$c;)V

    goto :goto_2

    :cond_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Expected watchChange to be an instance of WatchTargetChange"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/p0;->j:Lp6/x0;

    check-cast p2, Lp6/w0$d;

    invoke-virtual {v0, p2}, Lp6/x0;->i(Lp6/w0$d;)V

    :goto_2
    sget-object p2, Lm6/w;->k:Lm6/w;

    invoke-virtual {p1, p2}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lp6/p0;->b:Ll6/i0;

    invoke-virtual {p2}, Ll6/i0;->E()Lm6/w;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm6/w;->b(Lm6/w;)I

    move-result p2

    if-ltz p2, :cond_5

    invoke-direct {p0, p1}, Lp6/p0;->H(Lm6/w;)V

    :cond_5
    :goto_3
    return-void
.end method

.method private w(Li9/j1;)V
    .locals 3

    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lp6/p0;->M()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Watch stream was stopped gracefully while still needed."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lp6/p0;->o()V

    invoke-direct {p0}, Lp6/p0;->M()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp6/p0;->f:Lp6/j0;

    invoke-virtual {v0, p1}, Lp6/j0;->d(Li9/j1;)V

    invoke-direct {p0}, Lp6/p0;->Q()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lp6/p0;->f:Lp6/j0;

    sget-object v0, Lj6/z0;->j:Lj6/z0;

    invoke-virtual {p1, v0}, Lp6/j0;->i(Lj6/z0;)V

    :goto_0
    return-void
.end method

.method private x()V
    .locals 2

    iget-object v0, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll6/h4;

    invoke-direct {p0, v1}, Lp6/p0;->L(Ll6/h4;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private y(Li9/j1;)V
    .locals 3

    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handling write error with status OK."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lp6/o;->l(Li9/j1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/g;

    iget-object v1, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v1}, Lp6/z0;->l()V

    iget-object v1, p0, Lp6/p0;->a:Lp6/p0$c;

    invoke-virtual {v0}, Ln6/g;->e()I

    move-result v0

    invoke-interface {v1, v0, p1}, Lp6/p0$c;->d(ILi9/j1;)V

    invoke-virtual {p0}, Lp6/p0;->t()V

    :cond_0
    return-void
.end method

.method private z(Li9/j1;)V
    .locals 5

    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Handling write error with status OK."

    invoke-static {v0, v4, v3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lp6/o;->k(Li9/j1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/z0;->y()Lcom/google/protobuf/i;

    move-result-object v0

    invoke-static {v0}, Lq6/g0;->A(Lcom/google/protobuf/i;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    aput-object p1, v3, v1

    const-string p1, "RemoteStore"

    const-string v0, "RemoteStore error before completed handshake; resetting stream token %s: %s"

    invoke-static {p1, v0, v3}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lp6/p0;->i:Lp6/z0;

    sget-object v0, Lp6/z0;->v:Lcom/google/protobuf/i;

    invoke-virtual {p1, v0}, Lp6/z0;->B(Lcom/google/protobuf/i;)V

    iget-object p1, p0, Lp6/p0;->b:Ll6/i0;

    invoke-virtual {p1, v0}, Ll6/i0;->k0(Lcom/google/protobuf/i;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public F(Ll6/h4;)V
    .locals 2

    invoke-virtual {p1}, Ll6/h4;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lp6/p0;->M()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lp6/p0;->Q()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {v0}, Lp6/y0;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lp6/p0;->L(Ll6/h4;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public J(Lj6/b1;Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
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

    invoke-virtual {p0}, Lp6/p0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/p0;->c:Lp6/o;

    invoke-virtual {v0, p1, p2}, Lp6/o;->p(Lj6/b1;Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/firebase/firestore/z;

    sget-object p2, Lcom/google/firebase/firestore/z$a;->y:Lcom/google/firebase/firestore/z$a;

    const-string v0, "Failed to get result from server."

    invoke-direct {p1, v0, p2}, Lcom/google/firebase/firestore/z;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/z$a;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public O()V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "RemoteStore"

    const-string v3, "Shutting down"

    invoke-static {v2, v3, v1}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lp6/p0;->d:Lp6/l;

    invoke-interface {v1}, Lp6/l;->shutdown()V

    iput-boolean v0, p0, Lp6/p0;->g:Z

    invoke-direct {p0}, Lp6/p0;->r()V

    iget-object v0, p0, Lp6/p0;->c:Lp6/o;

    invoke-virtual {v0}, Lp6/o;->q()V

    iget-object v0, p0, Lp6/p0;->f:Lp6/j0;

    sget-object v1, Lj6/z0;->j:Lj6/z0;

    invoke-virtual {v0, v1}, Lp6/j0;->i(Lj6/z0;)V

    return-void
.end method

.method public P()V
    .locals 0

    invoke-virtual {p0}, Lp6/p0;->s()V

    return-void
.end method

.method public S(I)V
    .locals 4

    iget-object v0, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll6/h4;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "stopListening called on target no currently watched: %d"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {v0}, Lp6/y0;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lp6/p0;->K(I)V

    :cond_1
    iget-object p1, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {p1}, Lp6/y0;->m()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lp6/p0;->h:Lp6/y0;

    invoke-virtual {p1}, Lp6/c;->q()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lp6/p0;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lp6/p0;->f:Lp6/j0;

    sget-object v0, Lj6/z0;->j:Lj6/z0;

    invoke-virtual {p1, v0}, Lp6/j0;->i(Lj6/z0;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public a(I)Ll6/h4;
    .locals 1

    iget-object v0, p0, Lp6/p0;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll6/h4;

    return-object p1
.end method

.method public b(I)Ld6/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp6/p0;->a:Lp6/p0$c;

    invoke-interface {v0, p1}, Lp6/p0$c;->b(I)Ld6/e;

    move-result-object p1

    return-object p1
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lp6/p0;->g:Z

    return v0
.end method

.method public p()Lj6/k1;
    .locals 2

    new-instance v0, Lj6/k1;

    iget-object v1, p0, Lp6/p0;->c:Lp6/o;

    invoke-direct {v0, v1}, Lj6/k1;-><init>(Lp6/o;)V

    return-object v0
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp6/p0;->g:Z

    invoke-direct {p0}, Lp6/p0;->r()V

    iget-object v0, p0, Lp6/p0;->f:Lp6/j0;

    sget-object v1, Lj6/z0;->l:Lj6/z0;

    invoke-virtual {v0, v1}, Lp6/j0;->i(Lj6/z0;)V

    return-void
.end method

.method public s()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp6/p0;->g:Z

    invoke-virtual {p0}, Lp6/p0;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    iget-object v1, p0, Lp6/p0;->b:Ll6/i0;

    invoke-virtual {v1}, Ll6/i0;->F()Lcom/google/protobuf/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/z0;->B(Lcom/google/protobuf/i;)V

    invoke-direct {p0}, Lp6/p0;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lp6/p0;->Q()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp6/p0;->f:Lp6/j0;

    sget-object v1, Lj6/z0;->j:Lj6/z0;

    invoke-virtual {v0, v1}, Lp6/j0;->i(Lj6/z0;)V

    :goto_0
    invoke-virtual {p0}, Lp6/p0;->t()V

    :cond_1
    return-void
.end method

.method public t()V
    .locals 2

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/g;

    goto :goto_1

    :goto_0
    invoke-direct {p0}, Lp6/p0;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lp6/p0;->b:Ll6/i0;

    invoke-virtual {v1, v0}, Ll6/i0;->I(I)Ln6/g;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lp6/p0;->k:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lp6/p0;->i:Lp6/z0;

    invoke-virtual {v0}, Lp6/c;->q()V

    goto :goto_2

    :cond_1
    invoke-direct {p0, v0}, Lp6/p0;->l(Ln6/g;)V

    :goto_1
    invoke-virtual {v0}, Ln6/g;->e()I

    move-result v0

    goto :goto_0

    :cond_2
    :goto_2
    invoke-direct {p0}, Lp6/p0;->N()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lp6/p0;->R()V

    :cond_3
    return-void
.end method

.method public u()V
    .locals 3

    invoke-virtual {p0}, Lp6/p0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "RemoteStore"

    const-string v2, "Restarting streams for new credential."

    invoke-static {v1, v2, v0}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lp6/p0;->I()V

    :cond_0
    return-void
.end method
