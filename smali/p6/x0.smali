.class public Lp6/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/x0$b;
    }
.end annotation


# instance fields
.field private final a:Lp6/x0$b;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lp6/t0;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp6/x0$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp6/x0;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp6/x0;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp6/x0;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lp6/x0;->e:Ljava/util/Set;

    iput-object p1, p0, Lp6/x0;->a:Lp6/x0$b;

    return-void
.end method

.method private a(ILm6/s;)V
    .locals 3

    invoke-direct {p0, p1}, Lp6/x0;->j(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lm6/s;->getKey()Lm6/l;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lp6/x0;->p(ILm6/l;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lj6/n$a;->l:Lj6/n$a;

    goto :goto_0

    :cond_1
    sget-object v0, Lj6/n$a;->k:Lj6/n$a;

    :goto_0
    invoke-direct {p0, p1}, Lp6/x0;->d(I)Lp6/t0;

    move-result-object v1

    invoke-virtual {p2}, Lm6/s;->getKey()Lm6/l;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lp6/t0;->a(Lm6/l;Lj6/n$a;)V

    iget-object v0, p0, Lp6/x0;->c:Ljava/util/Map;

    invoke-virtual {p2}, Lm6/s;->getKey()Lm6/l;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lm6/s;->getKey()Lm6/l;

    move-result-object p2

    invoke-direct {p0, p2}, Lp6/x0;->c(Lm6/l;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private c(Lm6/l;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/l;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp6/x0;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lp6/x0;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private d(I)Lp6/t0;
    .locals 2

    iget-object v0, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp6/t0;

    if-nez v0, :cond_0

    new-instance v0, Lp6/t0;

    invoke-direct {v0}, Lp6/t0;-><init>()V

    iget-object v1, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private e(I)I
    .locals 2

    invoke-direct {p0, p1}, Lp6/x0;->d(I)Lp6/t0;

    move-result-object v0

    invoke-virtual {v0}, Lp6/t0;->j()Lp6/s0;

    move-result-object v0

    iget-object v1, p0, Lp6/x0;->a:Lp6/x0$b;

    invoke-interface {v1, p1}, Lp6/x0$b;->b(I)Ld6/e;

    move-result-object p1

    invoke-virtual {p1}, Ld6/e;->size()I

    move-result p1

    invoke-virtual {v0}, Lp6/s0;->b()Ld6/e;

    move-result-object v1

    invoke-virtual {v1}, Ld6/e;->size()I

    move-result v1

    add-int/2addr p1, v1

    invoke-virtual {v0}, Lp6/s0;->d()Ld6/e;

    move-result-object v0

    invoke-virtual {v0}, Ld6/e;->size()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method private f(Lp6/w0$d;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp6/w0$d;",
            ")",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lp6/w0$d;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {p0, v2}, Lp6/x0;->j(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method private j(I)Z
    .locals 0

    invoke-direct {p0, p1}, Lp6/x0;->k(I)Ll6/h4;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private k(I)Ll6/h4;
    .locals 2

    iget-object v0, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp6/t0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp6/t0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp6/x0;->a:Lp6/x0$b;

    invoke-interface {v0, p1}, Lp6/x0$b;->a(I)Ll6/h4;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private m(ILm6/l;Lm6/s;)V
    .locals 2

    invoke-direct {p0, p1}, Lp6/x0;->j(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lp6/x0;->d(I)Lp6/t0;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lp6/x0;->p(ILm6/l;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lj6/n$a;->j:Lj6/n$a;

    invoke-virtual {v0, p2, v1}, Lp6/t0;->a(Lm6/l;Lj6/n$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p2}, Lp6/t0;->i(Lm6/l;)V

    :goto_0
    invoke-direct {p0, p2}, Lp6/x0;->c(Lm6/l;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_2

    iget-object p1, p0, Lp6/x0;->c:Ljava/util/Map;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method private o(I)V
    .locals 3

    iget-object v0, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp6/t0;

    invoke-virtual {v0}, Lp6/t0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Should only reset active targets"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lp6/t0;

    invoke-direct {v2}, Lp6/t0;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lp6/x0;->a:Lp6/x0$b;

    invoke-interface {v0, p1}, Lp6/x0$b;->b(I)Ld6/e;

    move-result-object v0

    invoke-virtual {v0}, Ld6/e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/l;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v2}, Lp6/x0;->m(ILm6/l;Lm6/s;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method private p(ILm6/l;)Z
    .locals 1

    iget-object v0, p0, Lp6/x0;->a:Lp6/x0$b;

    invoke-interface {v0, p1}, Lp6/x0$b;->b(I)Ld6/e;

    move-result-object p1

    invoke-virtual {p1, p2}, Ld6/e;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public b(Lm6/w;)Lp6/k0;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp6/t0;

    invoke-direct {p0, v3}, Lp6/x0;->k(I)Ll6/h4;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Lp6/t0;->d()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ll6/h4;->f()Lj6/g1;

    move-result-object v5

    invoke-virtual {v5}, Lj6/g1;->s()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ll6/h4;->f()Lj6/g1;

    move-result-object v4

    invoke-virtual {v4}, Lj6/g1;->n()Lm6/u;

    move-result-object v4

    invoke-static {v4}, Lm6/l;->l(Lm6/u;)Lm6/l;

    move-result-object v4

    iget-object v5, p0, Lp6/x0;->c:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    invoke-direct {p0, v3, v4}, Lp6/x0;->p(ILm6/l;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v4, p1}, Lm6/s;->r(Lm6/l;Lm6/w;)Lm6/s;

    move-result-object v5

    invoke-direct {p0, v3, v4, v5}, Lp6/x0;->m(ILm6/l;Lm6/s;)V

    :cond_1
    invoke-virtual {v2}, Lp6/t0;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2}, Lp6/t0;->j()Lp6/s0;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lp6/t0;->b()V

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p0, Lp6/x0;->d:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm6/l;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    const/4 v5, 0x1

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-direct {p0, v6}, Lp6/x0;->k(I)Ll6/h4;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ll6/h4;->b()Ll6/g1;

    move-result-object v6

    sget-object v7, Ll6/g1;->l:Ll6/g1;

    invoke-virtual {v6, v7}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    const/4 v5, 0x0

    :cond_5
    if-eqz v5, :cond_3

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object v2, p0, Lp6/x0;->c:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/s;

    invoke-virtual {v3, p1}, Lm6/s;->v(Lm6/w;)Lm6/s;

    goto :goto_2

    :cond_7
    new-instance v2, Lp6/k0;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    iget-object v0, p0, Lp6/x0;->e:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v7

    iget-object v0, p0, Lp6/x0;->c:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v9

    move-object v4, v2

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lp6/k0;-><init>(Lm6/w;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;Ljava/util/Set;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lp6/x0;->c:Ljava/util/Map;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lp6/x0;->d:Ljava/util/Map;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lp6/x0;->e:Ljava/util/Set;

    return-object v2
.end method

.method public g(Lp6/w0$b;)V
    .locals 5

    invoke-virtual {p1}, Lp6/w0$b;->b()Lm6/s;

    move-result-object v0

    invoke-virtual {p1}, Lp6/w0$b;->a()Lm6/l;

    move-result-object v1

    invoke-virtual {p1}, Lp6/w0$b;->d()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm6/s;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-direct {p0, v3, v0}, Lp6/x0;->a(ILm6/s;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, v3, v1, v0}, Lp6/x0;->m(ILm6/l;Lm6/s;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lp6/w0$b;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lp6/w0$b;->b()Lm6/s;

    move-result-object v3

    invoke-direct {p0, v2, v1, v3}, Lp6/x0;->m(ILm6/l;Lm6/s;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public h(Lp6/w0$c;)V
    .locals 6

    invoke-virtual {p1}, Lp6/w0$c;->b()I

    move-result v0

    invoke-virtual {p1}, Lp6/w0$c;->a()Lp6/p;

    move-result-object v1

    invoke-virtual {v1}, Lp6/p;->a()I

    move-result v1

    invoke-direct {p0, v0}, Lp6/x0;->k(I)Ll6/h4;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ll6/h4;->f()Lj6/g1;

    move-result-object v2

    invoke-virtual {v2}, Lj6/g1;->s()Z

    move-result v3

    if-eqz v3, :cond_2

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lj6/g1;->n()Lm6/u;

    move-result-object p1

    invoke-static {p1}, Lm6/l;->l(Lm6/u;)Lm6/l;

    move-result-object p1

    sget-object v1, Lm6/w;->k:Lm6/w;

    invoke-static {p1, v1}, Lm6/s;->r(Lm6/l;Lm6/w;)Lm6/s;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lp6/x0;->m(ILm6/l;Lm6/s;)V

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, p1

    const-string p1, "Single document existence filter with count: %d"

    invoke-static {v2, p1, v0}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0}, Lp6/x0;->e(I)I

    move-result v2

    int-to-long v2, v2

    int-to-long v4, v1

    cmp-long v1, v2, v4

    if-eqz v1, :cond_3

    invoke-direct {p0, v0}, Lp6/x0;->o(I)V

    iget-object v1, p0, Lp6/x0;->e:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lp6/v0;->b()Lp6/v0;

    move-result-object v0

    long-to-int v1, v2

    invoke-virtual {p1}, Lp6/w0$c;->a()Lp6/p;

    move-result-object p1

    invoke-static {v1, p1}, Lp6/v0$a;->c(ILp6/p;)Lp6/v0$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp6/v0;->d(Lp6/v0$a;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public i(Lp6/w0$d;)V
    .locals 7

    invoke-direct {p0, p1}, Lp6/x0;->f(Lp6/w0$d;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lp6/x0;->d(I)Lp6/t0;

    move-result-object v2

    sget-object v3, Lp6/x0$a;->a:[I

    invoke-virtual {p1}, Lp6/w0$d;->b()Lp6/w0$e;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_7

    const/4 v5, 0x2

    if-eq v3, v5, :cond_6

    const/4 v5, 0x3

    const/4 v6, 0x0

    if-eq v3, v5, :cond_3

    const/4 v5, 0x4

    if-eq v3, v5, :cond_2

    const/4 v5, 0x5

    if-ne v3, v5, :cond_1

    invoke-direct {p0, v1}, Lp6/x0;->j(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-direct {p0, v1}, Lp6/x0;->o(I)V

    goto :goto_2

    :cond_1
    new-array v0, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lp6/w0$d;->b()Lp6/w0$e;

    move-result-object p1

    aput-object p1, v0, v6

    const-string p1, "Unknown target watch change state: %s"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_2
    invoke-direct {p0, v1}, Lp6/x0;->j(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lp6/t0;->f()V

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lp6/t0;->h()V

    invoke-virtual {v2}, Lp6/t0;->e()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0, v1}, Lp6/x0;->n(I)V

    :cond_4
    invoke-virtual {p1}, Lp6/w0$d;->a()Li9/j1;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    new-array v1, v6, [Ljava/lang/Object;

    const-string v2, "WatchChangeAggregator does not handle errored targets"

    invoke-static {v4, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-virtual {v2}, Lp6/t0;->h()V

    invoke-virtual {v2}, Lp6/t0;->e()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v2}, Lp6/t0;->b()V

    goto :goto_2

    :cond_7
    invoke-direct {p0, v1}, Lp6/x0;->j(I)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_8
    :goto_2
    invoke-virtual {p1}, Lp6/w0$d;->c()Lcom/google/protobuf/i;

    move-result-object v1

    invoke-virtual {v2, v1}, Lp6/t0;->k(Lcom/google/protobuf/i;)V

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method l(I)V
    .locals 0

    invoke-direct {p0, p1}, Lp6/x0;->d(I)Lp6/t0;

    move-result-object p1

    invoke-virtual {p1}, Lp6/t0;->g()V

    return-void
.end method

.method n(I)V
    .locals 1

    iget-object v0, p0, Lp6/x0;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
