.class public Ld6/k;
.super Ld6/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld6/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ld6/c<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private j:Ld6/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ld6/h;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/h<",
            "TK;TV;>;",
            "Ljava/util/Comparator<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ld6/c;-><init>()V

    iput-object p1, p0, Ld6/k;->j:Ld6/h;

    iput-object p2, p0, Ld6/k;->k:Ljava/util/Comparator;

    return-void
.end method

.method synthetic constructor <init>(Ld6/h;Ljava/util/Comparator;Ld6/k$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld6/k;-><init>(Ld6/h;Ljava/util/Comparator;)V

    return-void
.end method

.method public static s(Ljava/util/List;Ljava/util/Map;Ld6/c$a$a;Ljava/util/Comparator;)Ld6/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TA;>;",
            "Ljava/util/Map<",
            "TB;TC;>;",
            "Ld6/c$a$a<",
            "TA;TB;>;",
            "Ljava/util/Comparator<",
            "TA;>;)",
            "Ld6/k<",
            "TA;TC;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ld6/k$b;->b(Ljava/util/List;Ljava/util/Map;Ld6/c$a$a;Ljava/util/Comparator;)Ld6/k;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/util/Map;Ljava/util/Comparator;)Ld6/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TA;TB;>;",
            "Ljava/util/Comparator<",
            "TA;>;)",
            "Ld6/k<",
            "TA;TB;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Ld6/c$a;->d()Ld6/c$a$a;

    move-result-object v1

    invoke-static {v0, p0, v1, p1}, Ld6/k$b;->b(Ljava/util/List;Ljava/util/Map;Ld6/c$a$a;Ljava/util/Comparator;)Ld6/k;

    move-result-object p0

    return-object p0
.end method

.method private u(Ljava/lang/Object;)Ld6/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/k;->j:Ld6/h;

    :goto_0
    invoke-interface {v0}, Ld6/h;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ld6/k;->k:Ljava/util/Comparator;

    invoke-interface {v0}, Ld6/h;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_0

    invoke-interface {v0}, Ld6/h;->a()Ld6/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    return-object v0

    :cond_1
    invoke-interface {v0}, Ld6/h;->d()Ld6/h;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    invoke-direct {p0, p1}, Ld6/k;->u(Ljava/lang/Object;)Ld6/h;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-direct {p0, p1}, Ld6/k;->u(Ljava/lang/Object;)Ld6/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ld6/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    iget-object v0, p0, Ld6/k;->j:Ld6/h;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ld6/h;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Ld6/k;->k:Ljava/util/Comparator;

    invoke-interface {v0}, Ld6/h;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, p1, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Ld6/h;->a()Ld6/h;

    move-result-object p1

    invoke-interface {p1}, Ld6/h;->size()I

    move-result p1

    add-int/2addr v1, p1

    return v1

    :cond_0
    if-gez v2, :cond_1

    invoke-interface {v0}, Ld6/h;->a()Ld6/h;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ld6/h;->a()Ld6/h;

    move-result-object v2

    invoke-interface {v2}, Ld6/h;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    invoke-interface {v0}, Ld6/h;->d()Ld6/h;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Ld6/k;->j:Ld6/h;

    invoke-interface {v0}, Ld6/h;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Ld6/d;

    iget-object v1, p0, Ld6/k;->j:Ld6/h;

    iget-object v2, p0, Ld6/k;->k:Ljava/util/Comparator;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Ld6/d;-><init>(Ld6/h;Ljava/lang/Object;Ljava/util/Comparator;Z)V

    return-object v0
.end method

.method public k()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/k;->k:Ljava/util/Comparator;

    return-object v0
.end method

.method public l()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Ld6/k;->j:Ld6/h;

    invoke-interface {v0}, Ld6/h;->h()Ld6/h;

    move-result-object v0

    invoke-interface {v0}, Ld6/h;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Ld6/k;->j:Ld6/h;

    invoke-interface {v0}, Ld6/h;->f()Ld6/h;

    move-result-object v0

    invoke-interface {v0}, Ld6/h;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Ld6/c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/k;->j:Ld6/h;

    iget-object v1, p0, Ld6/k;->k:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2, v1}, Ld6/h;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ld6/h;

    move-result-object v2

    sget-object v5, Ld6/h$a;->k:Ld6/h$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v2 .. v7}, Ld6/h;->g(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/h;

    move-result-object p1

    new-instance p2, Ld6/k;

    iget-object v0, p0, Ld6/k;->k:Ljava/util/Comparator;

    invoke-direct {p2, p1, v0}, Ld6/k;-><init>(Ld6/h;Ljava/util/Comparator;)V

    return-object p2
.end method

.method public q(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Ld6/d;

    iget-object v1, p0, Ld6/k;->j:Ld6/h;

    iget-object v2, p0, Ld6/k;->k:Ljava/util/Comparator;

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v2, v3}, Ld6/d;-><init>(Ld6/h;Ljava/lang/Object;Ljava/util/Comparator;Z)V

    return-object v0
.end method

.method public r(Ljava/lang/Object;)Ld6/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ld6/c<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ld6/k;->b(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Ld6/k;->j:Ld6/h;

    iget-object v1, p0, Ld6/k;->k:Ljava/util/Comparator;

    invoke-interface {v0, p1, v1}, Ld6/h;->e(Ljava/lang/Object;Ljava/util/Comparator;)Ld6/h;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Ld6/h$a;->k:Ld6/h$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v2 .. v7}, Ld6/h;->g(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/h;

    move-result-object p1

    new-instance v0, Ld6/k;

    iget-object v1, p0, Ld6/k;->k:Ljava/util/Comparator;

    invoke-direct {v0, p1, v1}, Ld6/k;-><init>(Ld6/h;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Ld6/k;->j:Ld6/h;

    invoke-interface {v0}, Ld6/h;->size()I

    move-result v0

    return v0
.end method
