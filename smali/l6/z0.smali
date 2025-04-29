.class final Ll6/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/k1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll6/z0$b;
    }
.end annotation


# instance fields
.field private a:Ld6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ll6/l;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lm6/j;->a()Ld6/c;

    move-result-object v0

    iput-object v0, p0, Ll6/z0;->a:Ld6/c;

    return-void
.end method

.method static synthetic g(Ll6/z0;)Ld6/c;
    .locals 0

    iget-object p0, p0, Ll6/z0;->a:Ld6/c;

    return-object p0
.end method


# virtual methods
.method public a(Lj6/b1;Lm6/q$a;Ljava/util/Set;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Lm6/q$a;",
            "Ljava/util/Set<",
            "Lm6/l;",
            ">;)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lj6/b1;->n()Lm6/u;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Lm6/e;->b(Ljava/lang/String;)Lm6/e;

    move-result-object v1

    check-cast v1, Lm6/u;

    invoke-static {v1}, Lm6/l;->l(Lm6/u;)Lm6/l;

    move-result-object v1

    iget-object v2, p0, Ll6/z0;->a:Ld6/c;

    invoke-virtual {v2, v1}, Ld6/c;->q(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/i;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    invoke-virtual {p1}, Lj6/b1;->n()Lm6/u;

    move-result-object v4

    invoke-virtual {v2}, Lm6/l;->r()Lm6/u;

    move-result-object v5

    invoke-virtual {v4, v5}, Lm6/e;->p(Lm6/e;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lm6/l;->r()Lm6/u;

    move-result-object v2

    invoke-virtual {v2}, Lm6/e;->q()I

    move-result v2

    invoke-virtual {p1}, Lj6/b1;->n()Lm6/u;

    move-result-object v4

    invoke-virtual {v4}, Lm6/e;->q()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    if-le v2, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lm6/q$a;->k(Lm6/i;)Lm6/q$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Lm6/q$a;->g(Lm6/q$a;)I

    move-result v2

    if-gtz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lm6/i;->getKey()Lm6/l;

    move-result-object v2

    invoke-interface {p3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p1, v3}, Lj6/b1;->v(Lm6/i;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v3}, Lm6/i;->getKey()Lm6/l;

    move-result-object v2

    invoke-interface {v3}, Lm6/i;->a()Lm6/s;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method public b(Ll6/l;)V
    .locals 0

    iput-object p1, p0, Ll6/z0;->b:Ll6/l;

    return-void
.end method

.method public c(Lm6/l;)Lm6/s;
    .locals 1

    iget-object v0, p0, Ll6/z0;->a:Ld6/c;

    invoke-virtual {v0, p1}, Ld6/c;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm6/i;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm6/i;->a()Lm6/s;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lm6/s;->q(Lm6/l;)Lm6/s;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public d(Lm6/s;Lm6/w;)V
    .locals 5

    iget-object v0, p0, Ll6/z0;->b:Ll6/l;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "setIndexManager() not called"

    invoke-static {v0, v4, v3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lm6/w;->k:Lm6/w;

    invoke-virtual {p2, v0}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Cannot add document to the RemoteDocumentCache with a read time of zero"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Ll6/z0;->a:Ld6/c;

    invoke-virtual {p1}, Lm6/s;->getKey()Lm6/l;

    move-result-object v1

    invoke-virtual {p1}, Lm6/s;->a()Lm6/s;

    move-result-object v2

    invoke-virtual {v2, p2}, Lm6/s;->v(Lm6/w;)Lm6/s;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object p2

    iput-object p2, p0, Ll6/z0;->a:Ld6/c;

    iget-object p2, p0, Ll6/z0;->b:Ll6/l;

    invoke-virtual {p1}, Lm6/s;->getKey()Lm6/l;

    move-result-object p1

    invoke-virtual {p1}, Lm6/l;->p()Lm6/u;

    move-result-object p1

    invoke-interface {p2, p1}, Ll6/l;->g(Lm6/u;)V

    return-void
.end method

.method public e(Ljava/lang/String;Lm6/q$a;I)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm6/q$a;",
            "I)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "getAll(String, IndexOffset, int) is not supported."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/lang/Iterable;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lm6/l;",
            ">;)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/l;

    invoke-virtual {p0, v1}, Ll6/z0;->c(Lm6/l;)Lm6/s;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method h(Ll6/o;)J
    .locals 5

    new-instance v0, Ll6/z0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll6/z0$b;-><init>(Ll6/z0;Ll6/z0$a;)V

    invoke-virtual {v0}, Ll6/z0$b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/i;

    invoke-virtual {p1, v3}, Ll6/o;->m(Lm6/i;)Lo6/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/protobuf/z;->a()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method i()Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ll6/z0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll6/z0$b;-><init>(Ll6/z0;Ll6/z0$a;)V

    return-object v0
.end method

.method public removeAll(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lm6/l;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/z0;->b:Ll6/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setIndexManager() not called"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lm6/j;->a()Ld6/c;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/l;

    iget-object v2, p0, Ll6/z0;->a:Ld6/c;

    invoke-virtual {v2, v1}, Ld6/c;->r(Ljava/lang/Object;)Ld6/c;

    move-result-object v2

    iput-object v2, p0, Ll6/z0;->a:Ld6/c;

    sget-object v2, Lm6/w;->k:Lm6/w;

    invoke-static {v1, v2}, Lm6/s;->r(Lm6/l;Lm6/w;)Lm6/s;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object p1, p0, Ll6/z0;->b:Ll6/l;

    invoke-interface {p1, v0}, Ll6/l;->i(Ld6/c;)V

    return-void
.end method
