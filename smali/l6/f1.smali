.class public Ll6/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ll6/n;

.field private b:Ll6/l;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/Iterable;Lj6/b1;Lm6/q$a;)Ld6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lm6/i;",
            ">;",
            "Lj6/b1;",
            "Lm6/q$a;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/f1;->a:Ll6/n;

    invoke-virtual {v0, p2, p3}, Ll6/n;->h(Lj6/b1;Lm6/q$a;)Ld6/c;

    move-result-object p2

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lm6/i;

    invoke-interface {p3}, Lm6/i;->getKey()Lm6/l;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object p2

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method private b(Lj6/b1;Ld6/c;)Ld6/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;)",
            "Ld6/e<",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld6/e;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lj6/b1;->c()Ljava/util/Comparator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ld6/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {p2}, Ld6/c;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/i;

    invoke-virtual {p1, v1}, Lj6/b1;->v(Lm6/i;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ld6/e;->k(Ljava/lang/Object;)Ld6/e;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private c(Lj6/b1;)Ld6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lq6/v;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lj6/b1;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "QueryEngine"

    const-string v2, "Using full collection scan to execute query: %s"

    invoke-static {v1, v2, v0}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Ll6/f1;->a:Ll6/n;

    sget-object v1, Lm6/q$a;->j:Lm6/q$a;

    invoke-virtual {v0, p1, v1}, Ll6/n;->h(Lj6/b1;Lm6/q$a;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method private f(Lj6/b1;ILd6/e;Lm6/w;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "I",
            "Ld6/e<",
            "Lm6/i;",
            ">;",
            "Lm6/w;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p1}, Lj6/b1;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p3}, Ld6/e;->size()I

    move-result v0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Lj6/b1;->l()Lj6/b1$a;

    move-result-object p1

    sget-object p2, Lj6/b1$a;->j:Lj6/b1$a;

    if-ne p1, p2, :cond_2

    invoke-virtual {p3}, Ld6/e;->b()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Ld6/e;->e()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Lm6/i;

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-interface {p1}, Lm6/i;->f()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-interface {p1}, Lm6/i;->j()Lm6/w;

    move-result-object p1

    invoke-virtual {p1, p4}, Lm6/w;->b(Lm6/w;)I

    move-result p1

    if-lez p1, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    return v1
.end method

.method private g(Lj6/b1;)Ld6/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lj6/b1;->w()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lj6/b1;->D()Lj6/g1;

    move-result-object v0

    iget-object v2, p0, Ll6/f1;->b:Ll6/l;

    invoke-interface {v2, v0}, Ll6/l;->j(Lj6/g1;)Ll6/l$a;

    move-result-object v2

    sget-object v3, Ll6/l$a;->j:Ll6/l$a;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lj6/b1;->p()Z

    move-result v1

    const-wide/16 v3, -0x1

    if-eqz v1, :cond_2

    sget-object v1, Ll6/l$a;->k:Ll6/l$a;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    invoke-virtual {p1, v3, v4}, Lj6/b1;->t(J)Lj6/b1;

    move-result-object p1

    invoke-direct {p0, p1}, Ll6/f1;->g(Lj6/b1;)Ld6/c;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v1, p0, Ll6/f1;->b:Ll6/l;

    invoke-interface {v1, v0}, Ll6/l;->f(Lj6/g1;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v6, "index manager must return results for partial and full indexes."

    invoke-static {v5, v6, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, Ll6/f1;->a:Ll6/n;

    invoke-virtual {v2, v1}, Ll6/n;->d(Ljava/lang/Iterable;)Ld6/c;

    move-result-object v2

    iget-object v5, p0, Ll6/f1;->b:Ll6/l;

    invoke-interface {v5, v0}, Ll6/l;->c(Lj6/g1;)Lm6/q$a;

    move-result-object v0

    invoke-direct {p0, p1, v2}, Ll6/f1;->b(Lj6/b1;Ld6/c;)Ld6/e;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0}, Lm6/q$a;->o()Lm6/w;

    move-result-object v5

    invoke-direct {p0, p1, v1, v2, v5}, Ll6/f1;->f(Lj6/b1;ILd6/e;Lm6/w;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-direct {p0, v2, p1, v0}, Ll6/f1;->a(Ljava/lang/Iterable;Lj6/b1;Lm6/q$a;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method private h(Lj6/b1;Ld6/e;Lm6/w;)Ld6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Ld6/e<",
            "Lm6/l;",
            ">;",
            "Lm6/w;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lj6/b1;->w()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lm6/w;->k:Lm6/w;

    invoke-virtual {p3, v0}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Ll6/f1;->a:Ll6/n;

    invoke-virtual {v0, p2}, Ll6/n;->d(Ljava/lang/Iterable;)Ld6/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll6/f1;->b(Lj6/b1;Ld6/c;)Ld6/e;

    move-result-object v0

    invoke-virtual {p2}, Ld6/e;->size()I

    move-result p2

    invoke-direct {p0, p1, p2, v0, p3}, Ll6/f1;->f(Lj6/b1;ILd6/e;Lm6/w;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-object v1

    :cond_2
    invoke-static {}, Lq6/v;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p3}, Lm6/w;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p2, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Lj6/b1;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p2, v1

    const-string v1, "QueryEngine"

    const-string v2, "Re-using previous result from %s to execute query: %s"

    invoke-static {v1, v2, p2}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    const/4 p2, -0x1

    invoke-static {p3, p2}, Lm6/q$a;->i(Lm6/w;I)Lm6/q$a;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Ll6/f1;->a(Ljava/lang/Iterable;Lj6/b1;Lm6/q$a;)Ld6/c;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public d(Lj6/b1;Lm6/w;Ld6/e;)Ld6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Lm6/w;",
            "Ld6/e<",
            "Lm6/l;",
            ">;)",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Ll6/f1;->c:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initialize() not called"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Ll6/f1;->g(Lj6/b1;)Ld6/c;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1, p3, p2}, Ll6/f1;->h(Lj6/b1;Ld6/e;Lm6/w;)Ld6/c;

    move-result-object p2

    if-eqz p2, :cond_1

    return-object p2

    :cond_1
    invoke-direct {p0, p1}, Ll6/f1;->c(Lj6/b1;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method public e(Ll6/n;Ll6/l;)V
    .locals 0

    iput-object p1, p0, Ll6/f1;->a:Ll6/n;

    iput-object p2, p0, Ll6/f1;->b:Ll6/l;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll6/f1;->c:Z

    return-void
.end method
