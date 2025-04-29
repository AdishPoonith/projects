.class public final Ll6/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll6/i0$b;,
        Ll6/i0$c;
    }
.end annotation


# static fields
.field private static final n:J


# instance fields
.field private final a:Ll6/e1;

.field private b:Ll6/l;

.field private c:Ll6/b1;

.field private d:Ll6/b;

.field private final e:Ll6/k1;

.field private f:Ll6/n;

.field private final g:Ll6/f1;

.field private final h:Ll6/j1;

.field private final i:Ll6/g4;

.field private final j:Ll6/a;

.field private final k:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ll6/h4;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj6/g1;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lj6/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Ll6/i0;->n:J

    return-void
.end method

.method public constructor <init>(Ll6/e1;Ll6/f1;Lh6/j;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ll6/e1;->i()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LocalStore was passed an unstarted persistence implementation"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Ll6/i0;->a:Ll6/e1;

    iput-object p2, p0, Ll6/i0;->g:Ll6/f1;

    invoke-virtual {p1}, Ll6/e1;->h()Ll6/g4;

    move-result-object p2

    iput-object p2, p0, Ll6/i0;->i:Ll6/g4;

    invoke-virtual {p1}, Ll6/e1;->a()Ll6/a;

    move-result-object v0

    iput-object v0, p0, Ll6/i0;->j:Ll6/a;

    invoke-interface {p2}, Ll6/g4;->j()I

    move-result p2

    invoke-static {p2}, Lj6/h1;->b(I)Lj6/h1;

    move-result-object p2

    iput-object p2, p0, Ll6/i0;->m:Lj6/h1;

    invoke-virtual {p1}, Ll6/e1;->g()Ll6/k1;

    move-result-object p2

    iput-object p2, p0, Ll6/i0;->e:Ll6/k1;

    new-instance p2, Ll6/j1;

    invoke-direct {p2}, Ll6/j1;-><init>()V

    iput-object p2, p0, Ll6/i0;->h:Ll6/j1;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll6/i0;->l:Ljava/util/Map;

    invoke-virtual {p1}, Ll6/e1;->f()Ll6/i1;

    move-result-object p1

    invoke-interface {p1, p2}, Ll6/i1;->o(Ll6/j1;)V

    invoke-direct {p0, p3}, Ll6/i0;->M(Lh6/j;)V

    return-void
.end method

.method private D(Ln6/h;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln6/h;",
            ")",
            "Ljava/util/Set<",
            "Lm6/l;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ln6/h;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p1}, Ln6/h;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/i;

    invoke-virtual {v2}, Ln6/i;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Ln6/h;->b()Ln6/g;

    move-result-object v2

    invoke-virtual {v2}, Ln6/g;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/f;

    invoke-virtual {v2}, Ln6/f;->g()Lm6/l;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private M(Lh6/j;)V
    .locals 4

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v0, p1}, Ll6/e1;->c(Lh6/j;)Ll6/l;

    move-result-object v0

    iput-object v0, p0, Ll6/i0;->b:Ll6/l;

    iget-object v1, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v1, p1, v0}, Ll6/e1;->d(Lh6/j;Ll6/l;)Ll6/b1;

    move-result-object v0

    iput-object v0, p0, Ll6/i0;->c:Ll6/b1;

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v0, p1}, Ll6/e1;->b(Lh6/j;)Ll6/b;

    move-result-object p1

    iput-object p1, p0, Ll6/i0;->d:Ll6/b;

    new-instance v0, Ll6/n;

    iget-object v1, p0, Ll6/i0;->e:Ll6/k1;

    iget-object v2, p0, Ll6/i0;->c:Ll6/b1;

    iget-object v3, p0, Ll6/i0;->b:Ll6/l;

    invoke-direct {v0, v1, v2, p1, v3}, Ll6/n;-><init>(Ll6/k1;Ll6/b1;Ll6/b;Ll6/l;)V

    iput-object v0, p0, Ll6/i0;->f:Ll6/n;

    iget-object p1, p0, Ll6/i0;->e:Ll6/k1;

    iget-object v0, p0, Ll6/i0;->b:Ll6/l;

    invoke-interface {p1, v0}, Ll6/k1;->b(Ll6/l;)V

    iget-object p1, p0, Ll6/i0;->g:Ll6/f1;

    iget-object v0, p0, Ll6/i0;->f:Ll6/n;

    iget-object v1, p0, Ll6/i0;->b:Ll6/l;

    invoke-virtual {p1, v0, v1}, Ll6/f1;->e(Ll6/n;Ll6/l;)V

    return-void
.end method

.method private synthetic N(Ln6/h;)Ld6/c;
    .locals 3

    invoke-virtual {p1}, Ln6/h;->b()Ln6/g;

    move-result-object v0

    iget-object v1, p0, Ll6/i0;->c:Ll6/b1;

    invoke-virtual {p1}, Ln6/h;->f()Lcom/google/protobuf/i;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ll6/b1;->f(Ln6/g;Lcom/google/protobuf/i;)V

    invoke-direct {p0, p1}, Ll6/i0;->x(Ln6/h;)V

    iget-object v1, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v1}, Ll6/b1;->a()V

    iget-object v1, p0, Ll6/i0;->d:Ll6/b;

    invoke-virtual {p1}, Ln6/h;->b()Ln6/g;

    move-result-object v2

    invoke-virtual {v2}, Ln6/g;->e()I

    move-result v2

    invoke-interface {v1, v2}, Ll6/b;->b(I)V

    iget-object v1, p0, Ll6/i0;->f:Ll6/n;

    invoke-direct {p0, p1}, Ll6/i0;->D(Ln6/h;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll6/n;->n(Ljava/util/Set;)V

    iget-object p1, p0, Ll6/i0;->f:Ll6/n;

    invoke-virtual {v0}, Ln6/g;->f()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll6/n;->d(Ljava/lang/Iterable;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic O(Ll6/i0$b;Lj6/g1;)V
    .locals 7

    iget-object v0, p0, Ll6/i0;->m:Lj6/h1;

    invoke-virtual {v0}, Lj6/h1;->c()I

    move-result v3

    iput v3, p1, Ll6/i0$b;->b:I

    new-instance v0, Ll6/h4;

    iget-object v1, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v1}, Ll6/e1;->f()Ll6/i1;

    move-result-object v1

    invoke-interface {v1}, Ll6/i1;->p()J

    move-result-wide v4

    sget-object v6, Ll6/g1;->j:Ll6/g1;

    move-object v1, v0

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, Ll6/h4;-><init>(Lj6/g1;IJLl6/g1;)V

    iput-object v0, p1, Ll6/i0$b;->a:Ll6/h4;

    iget-object p1, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {p1, v0}, Ll6/g4;->d(Ll6/h4;)V

    return-void
.end method

.method private synthetic P(Ld6/c;Ll6/h4;)Ld6/c;
    .locals 5

    invoke-static {}, Lm6/l;->i()Ld6/e;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Ld6/c;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/l;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/s;

    invoke-virtual {v2}, Lm6/s;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Ld6/e;->k(Ljava/lang/Object;)Ld6/e;

    move-result-object v0

    :cond_0
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ll6/i0;->i:Ll6/g4;

    invoke-virtual {p2}, Ll6/h4;->g()I

    move-result v2

    invoke-interface {p1, v2}, Ll6/g4;->c(I)V

    iget-object p1, p0, Ll6/i0;->i:Ll6/g4;

    invoke-virtual {p2}, Ll6/h4;->g()I

    move-result p2

    invoke-interface {p1, v0, p2}, Ll6/g4;->g(Ld6/e;I)V

    invoke-direct {p0, v1}, Ll6/i0;->g0(Ljava/util/Map;)Ll6/i0$c;

    move-result-object p1

    invoke-static {p1}, Ll6/i0$c;->a(Ll6/i0$c;)Ljava/util/Map;

    move-result-object p2

    iget-object v0, p0, Ll6/i0;->f:Ll6/n;

    invoke-static {p1}, Ll6/i0$c;->b(Ll6/i0$c;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Ll6/n;->i(Ljava/util/Map;Ljava/util/Set;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic Q(Lp6/k0;Lm6/w;)Ld6/c;
    .locals 9

    invoke-virtual {p1}, Lp6/k0;->d()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v1}, Ll6/e1;->f()Ll6/i1;

    move-result-object v1

    invoke-interface {v1}, Ll6/i1;->p()J

    move-result-wide v1

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp6/s0;

    iget-object v5, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll6/h4;

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v6, p0, Ll6/i0;->i:Ll6/g4;

    invoke-virtual {v3}, Lp6/s0;->d()Ld6/e;

    move-result-object v7

    invoke-interface {v6, v7, v4}, Ll6/g4;->i(Ld6/e;I)V

    iget-object v6, p0, Ll6/i0;->i:Ll6/g4;

    invoke-virtual {v3}, Lp6/s0;->b()Ld6/e;

    move-result-object v7

    invoke-interface {v6, v7, v4}, Ll6/g4;->g(Ld6/e;I)V

    invoke-virtual {v5, v1, v2}, Ll6/h4;->j(J)Ll6/h4;

    move-result-object v6

    invoke-virtual {p1}, Lp6/k0;->e()Ljava/util/Set;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    sget-object v7, Lcom/google/protobuf/i;->k:Lcom/google/protobuf/i;

    sget-object v8, Lm6/w;->k:Lm6/w;

    invoke-virtual {v6, v7, v8}, Ll6/h4;->i(Lcom/google/protobuf/i;Lm6/w;)Ll6/h4;

    move-result-object v6

    invoke-virtual {v6, v8}, Ll6/h4;->h(Lm6/w;)Ll6/h4;

    move-result-object v6

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lp6/s0;->e()Lcom/google/protobuf/i;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/protobuf/i;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual {v3}, Lp6/s0;->e()Lcom/google/protobuf/i;

    move-result-object v7

    invoke-virtual {p1}, Lp6/k0;->c()Lm6/w;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ll6/h4;->i(Lcom/google/protobuf/i;Lm6/w;)Ll6/h4;

    move-result-object v6

    :cond_3
    :goto_1
    iget-object v7, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v7, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-static {v5, v6, v3}, Ll6/i0;->l0(Ll6/h4;Ll6/h4;Lp6/s0;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {v3, v6}, Ll6/g4;->f(Ll6/h4;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lp6/k0;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lp6/k0;->b()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v3}, Ll6/e1;->f()Ll6/i1;

    move-result-object v3

    invoke-interface {v3, v2}, Ll6/i1;->e(Lm6/l;)V

    goto :goto_2

    :cond_6
    invoke-direct {p0, v0}, Ll6/i0;->g0(Ljava/util/Map;)Ll6/i0$c;

    move-result-object p1

    invoke-static {p1}, Ll6/i0$c;->a(Ll6/i0$c;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {v1}, Ll6/g4;->b()Lm6/w;

    move-result-object v1

    sget-object v2, Lm6/w;->k:Lm6/w;

    invoke-virtual {p2, v2}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {p2, v1}, Lm6/w;->b(Lm6/w;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ltz v2, :cond_7

    const/4 v2, 0x1

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    :goto_3
    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p2, v5, v4

    aput-object v1, v5, v3

    const-string v1, "Watch stream reverted to previous snapshot?? (%s < %s)"

    invoke-static {v2, v1, v5}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {v1, p2}, Ll6/g4;->e(Lm6/w;)V

    :cond_8
    iget-object p2, p0, Ll6/i0;->f:Ll6/n;

    invoke-static {p1}, Ll6/i0$c;->b(Ll6/i0$c;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Ll6/n;->i(Ljava/util/Map;Ljava/util/Set;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic R(Ll6/o0;)Ll6/o0$c;
    .locals 1

    iget-object v0, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Ll6/o0;->f(Landroid/util/SparseArray;)Ll6/o0$c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic S(Ljava/util/List;)V
    .locals 5

    iget-object v0, p0, Ll6/i0;->b:Ll6/l;

    invoke-interface {v0}, Ll6/l;->k()Ljava/util/Collection;

    move-result-object v0

    sget-object v1, Lm6/q;->b:Ljava/util/Comparator;

    iget-object v2, p0, Ll6/i0;->b:Ll6/l;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ll6/h0;

    invoke-direct {v3, v2}, Ll6/h0;-><init>(Ll6/l;)V

    iget-object v2, p0, Ll6/i0;->b:Ll6/l;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ll6/q;

    invoke-direct {v4, v2}, Ll6/q;-><init>(Ll6/l;)V

    invoke-static {v0, p1, v1, v3, v4}, Lq6/g0;->q(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Comparator;Lq6/n;Lq6/n;)V

    return-void
.end method

.method private synthetic T(Ljava/lang/String;)Li6/j;
    .locals 1

    iget-object v0, p0, Ll6/i0;->j:Ll6/a;

    invoke-interface {v0, p1}, Ll6/a;->c(Ljava/lang/String;)Li6/j;

    move-result-object p1

    return-object p1
.end method

.method private synthetic U(Li6/e;)Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Ll6/i0;->j:Ll6/a;

    invoke-virtual {p1}, Li6/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll6/a;->b(Ljava/lang/String;)Li6/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li6/e;->b()Lm6/w;

    move-result-object v0

    invoke-virtual {p1}, Li6/e;->b()Lm6/w;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm6/w;->b(Lm6/w;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic V(Ljava/util/List;)V
    .locals 6

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll6/j0;

    invoke-virtual {v0}, Ll6/j0;->d()I

    move-result v1

    iget-object v2, p0, Ll6/i0;->h:Ll6/j1;

    invoke-virtual {v0}, Ll6/j0;->b()Ld6/e;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Ll6/j1;->b(Ld6/e;I)V

    invoke-virtual {v0}, Ll6/j0;->c()Ld6/e;

    move-result-object v2

    invoke-virtual {v2}, Ld6/e;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm6/l;

    iget-object v5, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v5}, Ll6/e1;->f()Ll6/i1;

    move-result-object v5

    invoke-interface {v5, v4}, Ll6/i1;->n(Lm6/l;)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Ll6/i0;->h:Ll6/j1;

    invoke-virtual {v3, v2, v1}, Ll6/j1;->g(Ld6/e;I)V

    invoke-virtual {v0}, Ll6/j0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll6/h4;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v3

    const-string v3, "Can\'t set limbo-free snapshot version for unknown target: %s"

    invoke-static {v4, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll6/h4;->e()Lm6/w;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll6/h4;->h(Lm6/w;)Ll6/h4;

    move-result-object v2

    iget-object v3, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v3, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Ll6/i0;->l0(Ll6/h4;Ll6/h4;Lp6/s0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {v0, v2}, Ll6/g4;->f(Ll6/h4;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private synthetic W(I)Ld6/c;
    .locals 4

    iget-object v0, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v0, p1}, Ll6/b1;->g(I)Ln6/g;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Attempt to reject nonexistent batch!"

    invoke-static {v2, v3, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v1, v0}, Ll6/b1;->d(Ln6/g;)V

    iget-object v1, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v1}, Ll6/b1;->a()V

    iget-object v1, p0, Ll6/i0;->d:Ll6/b;

    invoke-interface {v1, p1}, Ll6/b;->b(I)V

    iget-object p1, p0, Ll6/i0;->f:Ll6/n;

    invoke-virtual {v0}, Ln6/g;->f()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll6/n;->n(Ljava/util/Set;)V

    iget-object p1, p0, Ll6/i0;->f:Ll6/n;

    invoke-virtual {v0}, Ln6/g;->f()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll6/n;->d(Ljava/lang/Iterable;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic X(I)V
    .locals 5

    iget-object v0, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll6/h4;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    const-string v2, "Tried to release nonexistent target: %s"

    invoke-static {v3, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Ll6/i0;->h:Ll6/j1;

    invoke-virtual {v1, p1}, Ll6/j1;->h(I)Ld6/e;

    move-result-object v1

    invoke-virtual {v1}, Ld6/e;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    iget-object v3, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v3}, Ll6/e1;->f()Ll6/i1;

    move-result-object v3

    invoke-interface {v3, v2}, Ll6/i1;->n(Lm6/l;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v1}, Ll6/e1;->f()Ll6/i1;

    move-result-object v1

    invoke-interface {v1, v0}, Ll6/i1;->f(Ll6/h4;)V

    iget-object v1, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    iget-object p1, p0, Ll6/i0;->l:Ljava/util/Map;

    invoke-virtual {v0}, Ll6/h4;->f()Lj6/g1;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private synthetic Y(Li6/e;)V
    .locals 1

    iget-object v0, p0, Ll6/i0;->j:Ll6/a;

    invoke-interface {v0, p1}, Ll6/a;->d(Li6/e;)V

    return-void
.end method

.method private synthetic Z(Li6/j;Ll6/h4;ILd6/e;)V
    .locals 2

    invoke-virtual {p1}, Li6/j;->c()Lm6/w;

    move-result-object v0

    invoke-virtual {p2}, Ll6/h4;->e()Lm6/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm6/w;->b(Lm6/w;)I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/google/protobuf/i;->k:Lcom/google/protobuf/i;

    invoke-virtual {p1}, Li6/j;->c()Lm6/w;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ll6/h4;->i(Lcom/google/protobuf/i;Lm6/w;)Ll6/h4;

    move-result-object p2

    iget-object v0, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p3, p2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    iget-object v0, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {v0, p2}, Ll6/g4;->f(Ll6/h4;)V

    iget-object p2, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {p2, p3}, Ll6/g4;->c(I)V

    iget-object p2, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {p2, p4, p3}, Ll6/g4;->g(Ld6/e;I)V

    :cond_0
    iget-object p2, p0, Ll6/i0;->j:Ll6/a;

    invoke-interface {p2, p1}, Ll6/a;->a(Li6/j;)V

    return-void
.end method

.method private synthetic a0(Lcom/google/protobuf/i;)V
    .locals 1

    iget-object v0, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v0, p1}, Ll6/b1;->j(Lcom/google/protobuf/i;)V

    return-void
.end method

.method private synthetic b0()V
    .locals 1

    iget-object v0, p0, Ll6/i0;->b:Ll6/l;

    invoke-interface {v0}, Ll6/l;->start()V

    return-void
.end method

.method private synthetic c0()V
    .locals 1

    iget-object v0, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v0}, Ll6/b1;->start()V

    return-void
.end method

.method public static synthetic d(Ll6/i0;)V
    .locals 0

    invoke-direct {p0}, Ll6/i0;->c0()V

    return-void
.end method

.method private synthetic d0(Ljava/util/Set;Ljava/util/List;Lw5/q;)Ll6/m;
    .locals 8

    iget-object v0, p0, Ll6/i0;->e:Ll6/k1;

    invoke-interface {v0, p1}, Ll6/k1;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    check-cast v3, Lm6/s;

    invoke-virtual {v3}, Lm6/s;->o()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll6/i0;->f:Ll6/n;

    invoke-virtual {v1, p1}, Ll6/n;->k(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/f;

    invoke-virtual {v3}, Ln6/f;->g()Lm6/l;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll6/d1;

    invoke-virtual {v4}, Ll6/d1;->a()Lm6/i;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln6/f;->d(Lm6/i;)Lm6/t;

    move-result-object v4

    if-eqz v4, :cond_2

    new-instance v5, Ln6/l;

    invoke-virtual {v3}, Ln6/f;->g()Lm6/l;

    move-result-object v3

    invoke-virtual {v4}, Lm6/t;->n()Ln6/d;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v7}, Ln6/m;->a(Z)Ln6/m;

    move-result-object v7

    invoke-direct {v5, v3, v4, v6, v7}, Ln6/l;-><init>(Lm6/l;Lm6/t;Ln6/d;Ln6/m;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v2, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v2, p3, v1, p2}, Ll6/b1;->h(Lw5/q;Ljava/util/List;Ljava/util/List;)Ln6/g;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Ln6/g;->a(Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p3

    iget-object v0, p0, Ll6/i0;->d:Ll6/b;

    invoke-virtual {p2}, Ln6/g;->e()I

    move-result v1

    invoke-interface {v0, v1, p3}, Ll6/b;->c(ILjava/util/Map;)V

    invoke-virtual {p2}, Ln6/g;->e()I

    move-result p2

    invoke-static {p2, p1}, Ll6/m;->a(ILjava/util/Map;)Ll6/m;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic e(Ll6/i0;Li6/e;)V
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->Y(Li6/e;)V

    return-void
.end method

.method private static e0(Ljava/lang/String;)Lj6/g1;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "__bundle__/docs/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lm6/u;->v(Ljava/lang/String;)Lm6/u;

    move-result-object p0

    invoke-static {p0}, Lj6/b1;->b(Lm6/u;)Lj6/b1;

    move-result-object p0

    invoke-virtual {p0}, Lj6/b1;->D()Lj6/g1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ll6/i0;)V
    .locals 0

    invoke-direct {p0}, Ll6/i0;->b0()V

    return-void
.end method

.method public static synthetic g(Ll6/i0;Li6/j;Ll6/h4;ILd6/e;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ll6/i0;->Z(Li6/j;Ll6/h4;ILd6/e;)V

    return-void
.end method

.method private g0(Ljava/util/Map;)Ll6/i0$c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;)",
            "Ll6/i0$c;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v3, p0, Ll6/i0;->e:Ll6/k1;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v3, v4}, Ll6/k1;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm6/l;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm6/s;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm6/s;

    invoke-virtual {v4}, Lm6/s;->c()Z

    move-result v7

    invoke-virtual {v6}, Lm6/s;->c()Z

    move-result v8

    if-eq v7, v8, :cond_0

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {v4}, Lm6/s;->h()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v4}, Lm6/s;->j()Lm6/w;

    move-result-object v7

    sget-object v8, Lm6/w;->k:Lm6/w;

    invoke-virtual {v7, v8}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v4}, Lm6/s;->getKey()Lm6/l;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v6}, Lm6/s;->o()Z

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v7, :cond_3

    invoke-virtual {v4}, Lm6/s;->j()Lm6/w;

    move-result-object v7

    invoke-virtual {v6}, Lm6/s;->j()Lm6/w;

    move-result-object v10

    invoke-virtual {v7, v10}, Lm6/w;->b(Lm6/w;)I

    move-result v7

    if-gtz v7, :cond_3

    invoke-virtual {v4}, Lm6/s;->j()Lm6/w;

    move-result-object v7

    invoke-virtual {v6}, Lm6/s;->j()Lm6/w;

    move-result-object v10

    invoke-virtual {v7, v10}, Lm6/w;->b(Lm6/w;)I

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v6}, Lm6/s;->f()Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v8

    invoke-virtual {v6}, Lm6/s;->j()Lm6/w;

    move-result-object v5

    aput-object v5, v7, v9

    const/4 v5, 0x2

    invoke-virtual {v4}, Lm6/s;->j()Lm6/w;

    move-result-object v4

    aput-object v4, v7, v5

    const-string v4, "LocalStore"

    const-string v5, "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s"

    invoke-static {v4, v5, v7}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_3
    :goto_2
    sget-object v6, Lm6/w;->k:Lm6/w;

    invoke-virtual {v4}, Lm6/s;->g()Lm6/w;

    move-result-object v7

    invoke-virtual {v6, v7}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v6

    xor-int/2addr v6, v9

    new-array v7, v8, [Ljava/lang/Object;

    const-string v8, "Cannot add a document when the remote version is zero"

    invoke-static {v6, v8, v7}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v6, p0, Ll6/i0;->e:Ll6/k1;

    invoke-virtual {v4}, Lm6/s;->g()Lm6/w;

    move-result-object v7

    invoke-interface {v6, v4, v7}, Ll6/k1;->d(Lm6/s;Lm6/w;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Ll6/i0;->e:Ll6/k1;

    invoke-interface {p1, v1}, Ll6/k1;->removeAll(Ljava/util/Collection;)V

    new-instance p1, Ll6/i0$c;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v2, v1}, Ll6/i0$c;-><init>(Ljava/util/Map;Ljava/util/Set;Ll6/i0$a;)V

    return-object p1
.end method

.method public static synthetic h(Ll6/i0;I)V
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->X(I)V

    return-void
.end method

.method public static synthetic i(Ll6/i0;Ll6/o0;)Ll6/o0$c;
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->R(Ll6/o0;)Ll6/o0$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ll6/i0;Lcom/google/protobuf/i;)V
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->a0(Lcom/google/protobuf/i;)V

    return-void
.end method

.method public static synthetic k(Ll6/i0;Ld6/c;Ll6/h4;)Ld6/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Ll6/i0;->P(Ld6/c;Ll6/h4;)Ld6/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ll6/i0;Ll6/i0$b;Lj6/g1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ll6/i0;->O(Ll6/i0$b;Lj6/g1;)V

    return-void
.end method

.method private static l0(Ll6/h4;Ll6/h4;Lp6/s0;)Z
    .locals 6

    invoke-virtual {p0}, Ll6/h4;->c()Lcom/google/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/i;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Ll6/h4;->e()Lm6/w;

    move-result-object v0

    invoke-virtual {v0}, Lm6/w;->g()Lw5/q;

    move-result-object v0

    invoke-virtual {v0}, Lw5/q;->l()J

    move-result-wide v2

    invoke-virtual {p0}, Ll6/h4;->e()Lm6/w;

    move-result-object v0

    invoke-virtual {v0}, Lm6/w;->g()Lw5/q;

    move-result-object v0

    invoke-virtual {v0}, Lw5/q;->l()J

    move-result-wide v4

    sub-long/2addr v2, v4

    sget-wide v4, Ll6/i0;->n:J

    cmp-long v0, v2, v4

    if-ltz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ll6/h4;->a()Lm6/w;

    move-result-object p1

    invoke-virtual {p1}, Lm6/w;->g()Lw5/q;

    move-result-object p1

    invoke-virtual {p1}, Lw5/q;->l()J

    move-result-wide v2

    invoke-virtual {p0}, Ll6/h4;->a()Lm6/w;

    move-result-object p0

    invoke-virtual {p0}, Lm6/w;->g()Lw5/q;

    move-result-object p0

    invoke-virtual {p0}, Lw5/q;->l()J

    move-result-wide p0

    sub-long/2addr v2, p0

    cmp-long p0, v2, v4

    if-ltz p0, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x0

    if-nez p2, :cond_3

    return p0

    :cond_3
    invoke-virtual {p2}, Lp6/s0;->b()Ld6/e;

    move-result-object p1

    invoke-virtual {p1}, Ld6/e;->size()I

    move-result p1

    invoke-virtual {p2}, Lp6/s0;->c()Ld6/e;

    move-result-object v0

    invoke-virtual {v0}, Ld6/e;->size()I

    move-result v0

    add-int/2addr p1, v0

    invoke-virtual {p2}, Lp6/s0;->d()Ld6/e;

    move-result-object p2

    invoke-virtual {p2}, Ld6/e;->size()I

    move-result p2

    add-int/2addr p1, p2

    if-lez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static synthetic m(Ll6/i0;Li6/e;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->U(Li6/e;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ll6/i0;Ljava/util/Set;Ljava/util/List;Lw5/q;)Ll6/m;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/i0;->d0(Ljava/util/Set;Ljava/util/List;Lw5/q;)Ll6/m;

    move-result-object p0

    return-object p0
.end method

.method private n0()V
    .locals 3

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/z;

    invoke-direct {v1, p0}, Ll6/z;-><init>(Ll6/i0;)V

    const-string v2, "Start IndexManager"

    invoke-virtual {v0, v2, v1}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic o(Ll6/i0;Ljava/lang/String;)Li6/j;
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->T(Ljava/lang/String;)Li6/j;

    move-result-object p0

    return-object p0
.end method

.method private o0()V
    .locals 3

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/p;

    invoke-direct {v1, p0}, Ll6/p;-><init>(Ll6/i0;)V

    const-string v2, "Start MutationQueue"

    invoke-virtual {v0, v2, v1}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic p(Ll6/i0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->S(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic q(Ll6/i0;Ln6/h;)Ld6/c;
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->N(Ln6/h;)Ld6/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Ll6/i0;Lp6/k0;Lm6/w;)Ld6/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Ll6/i0;->Q(Lp6/k0;Lm6/w;)Ld6/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Ll6/i0;I)Ld6/c;
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->W(I)Ld6/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Ll6/i0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Ll6/i0;->V(Ljava/util/List;)V

    return-void
.end method

.method private x(Ln6/h;)V
    .locals 7

    invoke-virtual {p1}, Ln6/h;->b()Ln6/g;

    move-result-object v0

    invoke-virtual {v0}, Ln6/g;->f()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    iget-object v3, p0, Ll6/i0;->e:Ll6/k1;

    invoke-interface {v3, v2}, Ll6/k1;->c(Lm6/l;)Lm6/s;

    move-result-object v3

    invoke-virtual {p1}, Ln6/h;->d()Ld6/c;

    move-result-object v4

    invoke-virtual {v4, v2}, Ld6/c;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/w;

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v6, "docVersions should contain every doc in the write."

    invoke-static {v5, v6, v4}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm6/s;->j()Lm6/w;

    move-result-object v4

    invoke-virtual {v4, v2}, Lm6/w;->b(Lm6/w;)I

    move-result v2

    if-gez v2, :cond_0

    invoke-virtual {v0, v3, p1}, Ln6/g;->c(Lm6/s;Ln6/h;)V

    invoke-virtual {v3}, Lm6/s;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll6/i0;->e:Ll6/k1;

    invoke-virtual {p1}, Ln6/h;->c()Lm6/w;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ll6/k1;->d(Lm6/s;Lm6/w;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {p1, v0}, Ll6/b1;->d(Ln6/g;)V

    return-void
.end method


# virtual methods
.method public A(Lj6/b1;Z)Ll6/h1;
    .locals 4

    invoke-virtual {p1}, Lj6/b1;->D()Lj6/g1;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll6/i0;->J(Lj6/g1;)Ll6/h4;

    move-result-object v0

    sget-object v1, Lm6/w;->k:Lm6/w;

    invoke-static {}, Lm6/l;->i()Ld6/e;

    move-result-object v2

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll6/h4;->a()Lm6/w;

    move-result-object v2

    iget-object v3, p0, Ll6/i0;->i:Ll6/g4;

    invoke-virtual {v0}, Ll6/h4;->g()I

    move-result v0

    invoke-interface {v3, v0}, Ll6/g4;->a(I)Ld6/e;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    move-object v2, v1

    :goto_0
    iget-object v3, p0, Ll6/i0;->g:Ll6/f1;

    if-eqz p2, :cond_1

    move-object v1, v2

    :cond_1
    invoke-virtual {v3, p1, v1, v0}, Ll6/f1;->d(Lj6/b1;Lm6/w;Ld6/e;)Ld6/c;

    move-result-object p1

    new-instance p2, Ll6/h1;

    invoke-direct {p2, p1, v0}, Ll6/h1;-><init>(Ld6/c;Ld6/e;)V

    return-object p2
.end method

.method public B()I
    .locals 1

    iget-object v0, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v0}, Ll6/b1;->c()I

    move-result v0

    return v0
.end method

.method public C()Ll6/l;
    .locals 1

    iget-object v0, p0, Ll6/i0;->b:Ll6/l;

    return-object v0
.end method

.method public E()Lm6/w;
    .locals 1

    iget-object v0, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {v0}, Ll6/g4;->b()Lm6/w;

    move-result-object v0

    return-object v0
.end method

.method public F()Lcom/google/protobuf/i;
    .locals 1

    iget-object v0, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v0}, Ll6/b1;->i()Lcom/google/protobuf/i;

    move-result-object v0

    return-object v0
.end method

.method public G()Ll6/n;
    .locals 1

    iget-object v0, p0, Ll6/i0;->f:Ll6/n;

    return-object v0
.end method

.method public H(Ljava/lang/String;)Li6/j;
    .locals 2

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/u;

    invoke-direct {v1, p0, p1}, Ll6/u;-><init>(Ll6/i0;Ljava/lang/String;)V

    const-string p1, "Get named query"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->j(Ljava/lang/String;Lq6/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li6/j;

    return-object p1
.end method

.method public I(I)Ln6/g;
    .locals 1

    iget-object v0, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v0, p1}, Ll6/b1;->b(I)Ln6/g;

    move-result-object p1

    return-object p1
.end method

.method J(Lj6/g1;)Ll6/h4;
    .locals 1

    iget-object v0, p0, Ll6/i0;->l:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object p1, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll6/h4;

    return-object p1

    :cond_0
    iget-object v0, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {v0, p1}, Ll6/g4;->h(Lj6/g1;)Ll6/h4;

    move-result-object p1

    return-object p1
.end method

.method public K(Lh6/j;)Ld6/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/j;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {v0}, Ll6/b1;->k()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1}, Ll6/i0;->M(Lh6/j;)V

    invoke-direct {p0}, Ll6/i0;->n0()V

    invoke-direct {p0}, Ll6/i0;->o0()V

    iget-object p1, p0, Ll6/i0;->c:Ll6/b1;

    invoke-interface {p1}, Ll6/b1;->k()Ljava/util/List;

    move-result-object p1

    invoke-static {}, Lm6/l;->i()Ld6/e;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/util/List;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/g;

    invoke-virtual {v2}, Ln6/g;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/f;

    invoke-virtual {v3}, Ln6/f;->g()Lm6/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Ld6/e;->k(Ljava/lang/Object;)Ld6/e;

    move-result-object v1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ll6/i0;->f:Ll6/n;

    invoke-virtual {p1, v1}, Ll6/n;->d(Ljava/lang/Iterable;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method public L(Li6/e;)Z
    .locals 2

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/t;

    invoke-direct {v1, p0, p1}, Ll6/t;-><init>(Ll6/i0;Li6/e;)V

    const-string p1, "Has newer bundle"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->j(Ljava/lang/String;Lq6/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public a(Ld6/c;Ljava/lang/String;)Ld6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/s;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Ll6/i0;->e0(Ljava/lang/String;)Lj6/g1;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll6/i0;->v(Lj6/g1;)Ll6/h4;

    move-result-object p2

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/s;

    invoke-direct {v1, p0, p1, p2}, Ll6/s;-><init>(Ll6/i0;Ld6/c;Ll6/h4;)V

    const-string p1, "Apply bundle documents"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->j(Ljava/lang/String;Lq6/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld6/c;

    return-object p1
.end method

.method public b(Li6/e;)V
    .locals 2

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/c0;

    invoke-direct {v1, p0, p1}, Ll6/c0;-><init>(Ll6/i0;Li6/e;)V

    const-string p1, "Save bundle"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Li6/j;Ld6/e;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li6/j;",
            "Ld6/e<",
            "Lm6/l;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Li6/j;->a()Li6/i;

    move-result-object v0

    invoke-virtual {v0}, Li6/i;->b()Lj6/g1;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll6/i0;->v(Lj6/g1;)Ll6/h4;

    move-result-object v4

    invoke-virtual {v4}, Ll6/h4;->g()I

    move-result v5

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v7, Ll6/d0;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Ll6/d0;-><init>(Ll6/i0;Li6/j;Ll6/h4;ILd6/e;)V

    const-string p1, "Saved named query"

    invoke-virtual {v0, p1, v7}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public f0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll6/j0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/f0;

    invoke-direct {v1, p0, p1}, Ll6/f0;-><init>(Ll6/i0;Ljava/util/List;)V

    const-string p1, "notifyLocalViewChanges"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public h0(Lm6/l;)Lm6/i;
    .locals 1

    iget-object v0, p0, Ll6/i0;->f:Ll6/n;

    invoke-virtual {v0, p1}, Ll6/n;->c(Lm6/l;)Lm6/i;

    move-result-object p1

    return-object p1
.end method

.method public i0(I)Ld6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/r;

    invoke-direct {v1, p0, p1}, Ll6/r;-><init>(Ll6/i0;I)V

    const-string p1, "Reject batch"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->j(Ljava/lang/String;Lq6/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld6/c;

    return-object p1
.end method

.method public j0(I)V
    .locals 2

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/a0;

    invoke-direct {v1, p0, p1}, Ll6/a0;-><init>(Ll6/i0;I)V

    const-string p1, "Release target"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public k0(Lcom/google/protobuf/i;)V
    .locals 2

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/b0;

    invoke-direct {v1, p0, p1}, Ll6/b0;-><init>(Ll6/i0;Lcom/google/protobuf/i;)V

    const-string p1, "Set stream token"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public m0()V
    .locals 1

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    invoke-virtual {v0}, Ll6/e1;->e()Ll6/c1;

    move-result-object v0

    invoke-interface {v0}, Ll6/c1;->run()V

    invoke-direct {p0}, Ll6/i0;->n0()V

    invoke-direct {p0}, Ll6/i0;->o0()V

    return-void
.end method

.method public p0(Ljava/util/List;)Ll6/m;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln6/f;",
            ">;)",
            "Ll6/m;"
        }
    .end annotation

    invoke-static {}, Lw5/q;->p()Lw5/q;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/f;

    invoke-virtual {v3}, Ln6/f;->g()Lm6/l;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v3, Ll6/v;

    invoke-direct {v3, p0, v1, p1, v0}, Ll6/v;-><init>(Ll6/i0;Ljava/util/Set;Ljava/util/List;Lw5/q;)V

    const-string p1, "Locally write mutations"

    invoke-virtual {v2, p1, v3}, Ll6/e1;->j(Ljava/lang/String;Lq6/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll6/m;

    return-object p1
.end method

.method public u(Ln6/h;)Ld6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln6/h;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/x;

    invoke-direct {v1, p0, p1}, Ll6/x;-><init>(Ll6/i0;Ln6/h;)V

    const-string p1, "Acknowledge batch"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->j(Ljava/lang/String;Lq6/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld6/c;

    return-object p1
.end method

.method public v(Lj6/g1;)Ll6/h4;
    .locals 4

    iget-object v0, p0, Ll6/i0;->i:Ll6/g4;

    invoke-interface {v0, p1}, Ll6/g4;->h(Lj6/g1;)Ll6/h4;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll6/h4;->g()I

    move-result v1

    goto :goto_0

    :cond_0
    new-instance v0, Ll6/i0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll6/i0$b;-><init>(Ll6/i0$a;)V

    iget-object v1, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v2, Ll6/g0;

    invoke-direct {v2, p0, v0, p1}, Ll6/g0;-><init>(Ll6/i0;Ll6/i0$b;Lj6/g1;)V

    const-string v3, "Allocate target"

    invoke-virtual {v1, v3, v2}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    iget v1, v0, Ll6/i0$b;->b:I

    iget-object v0, v0, Ll6/i0$b;->a:Ll6/h4;

    :goto_0
    iget-object v2, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Ll6/i0;->k:Landroid/util/SparseArray;

    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v2, p0, Ll6/i0;->l:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public w(Lp6/k0;)Ld6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp6/k0;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lp6/k0;->c()Lm6/w;

    move-result-object v0

    iget-object v1, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v2, Ll6/y;

    invoke-direct {v2, p0, p1, v0}, Ll6/y;-><init>(Ll6/i0;Lp6/k0;Lm6/w;)V

    const-string p1, "Apply remote event"

    invoke-virtual {v1, p1, v2}, Ll6/e1;->j(Ljava/lang/String;Lq6/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld6/c;

    return-object p1
.end method

.method public y(Ll6/o0;)Ll6/o0$c;
    .locals 2

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/w;

    invoke-direct {v1, p0, p1}, Ll6/w;-><init>(Ll6/i0;Ll6/o0;)V

    const-string p1, "Collect garbage"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->j(Ljava/lang/String;Lq6/y;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll6/o0$c;

    return-object p1
.end method

.method public z(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm6/q;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/i0;->a:Ll6/e1;

    new-instance v1, Ll6/e0;

    invoke-direct {v1, p0, p1}, Ll6/e0;-><init>(Ll6/i0;Ljava/util/List;)V

    const-string p1, "Configure indexes"

    invoke-virtual {v0, p1, v1}, Ll6/e1;->k(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method
