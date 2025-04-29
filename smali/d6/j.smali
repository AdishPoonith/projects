.class public abstract Ld6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ld6/h<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private c:Ld6/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final d:Ld6/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ld6/h<",
            "TK;TV;>;",
            "Ld6/h<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/j;->a:Ljava/lang/Object;

    iput-object p2, p0, Ld6/j;->b:Ljava/lang/Object;

    if-nez p3, :cond_0

    invoke-static {}, Ld6/g;->i()Ld6/g;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Ld6/j;->c:Ld6/h;

    if-nez p4, :cond_1

    invoke-static {}, Ld6/g;->i()Ld6/g;

    move-result-object p4

    :cond_1
    iput-object p4, p0, Ld6/j;->d:Ld6/h;

    return-void
.end method

.method private i()Ld6/j;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/j<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-static {v0}, Ld6/j;->p(Ld6/h;)Ld6/h$a;

    move-result-object v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Ld6/h;->g(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/h;

    move-result-object v10

    iget-object v0, p0, Ld6/j;->d:Ld6/h;

    invoke-static {v0}, Ld6/j;->p(Ld6/h;)Ld6/h$a;

    move-result-object v3

    invoke-interface/range {v0 .. v5}, Ld6/h;->g(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/h;

    move-result-object v11

    invoke-static {p0}, Ld6/j;->p(Ld6/h;)Ld6/h$a;

    move-result-object v9

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p0

    invoke-virtual/range {v6 .. v11}, Ld6/j;->j(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object v0

    return-object v0
.end method

.method private l()Ld6/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/j<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->d:Ld6/h;

    invoke-interface {v0}, Ld6/h;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0}, Ld6/h;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ld6/j;->r()Ld6/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    iget-object v1, v0, Ld6/j;->c:Ld6/h;

    invoke-interface {v1}, Ld6/h;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Ld6/j;->c:Ld6/h;

    check-cast v1, Ld6/j;

    iget-object v1, v1, Ld6/j;->c:Ld6/h;

    invoke-interface {v1}, Ld6/h;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {v0}, Ld6/j;->s()Ld6/j;

    move-result-object v0

    :cond_1
    iget-object v1, v0, Ld6/j;->c:Ld6/h;

    invoke-interface {v1}, Ld6/h;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Ld6/j;->d:Ld6/h;

    invoke-interface {v1}, Ld6/h;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {v0}, Ld6/j;->i()Ld6/j;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method private n()Ld6/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/j<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-direct {p0}, Ld6/j;->i()Ld6/j;

    move-result-object v0

    invoke-virtual {v0}, Ld6/j;->d()Ld6/h;

    move-result-object v1

    invoke-interface {v1}, Ld6/h;->a()Ld6/h;

    move-result-object v1

    invoke-interface {v1}, Ld6/h;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ld6/j;->d()Ld6/h;

    move-result-object v1

    check-cast v1, Ld6/j;

    invoke-direct {v1}, Ld6/j;->s()Ld6/j;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v2, v1}, Ld6/j;->k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object v0

    invoke-direct {v0}, Ld6/j;->r()Ld6/j;

    move-result-object v0

    invoke-direct {v0}, Ld6/j;->i()Ld6/j;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private o()Ld6/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/j<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-direct {p0}, Ld6/j;->i()Ld6/j;

    move-result-object v0

    invoke-virtual {v0}, Ld6/j;->a()Ld6/h;

    move-result-object v1

    invoke-interface {v1}, Ld6/h;->a()Ld6/h;

    move-result-object v1

    invoke-interface {v1}, Ld6/h;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {v0}, Ld6/j;->s()Ld6/j;

    move-result-object v0

    invoke-direct {v0}, Ld6/j;->i()Ld6/j;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private static p(Ld6/h;)Ld6/h$a;
    .locals 0

    invoke-interface {p0}, Ld6/h;->c()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ld6/h$a;->k:Ld6/h$a;

    goto :goto_0

    :cond_0
    sget-object p0, Ld6/h$a;->j:Ld6/h$a;

    :goto_0
    return-object p0
.end method

.method private q()Ld6/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0}, Ld6/h;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ld6/g;->i()Ld6/g;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ld6/j;->a()Ld6/h;

    move-result-object v0

    invoke-interface {v0}, Ld6/h;->c()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ld6/j;->a()Ld6/h;

    move-result-object v0

    invoke-interface {v0}, Ld6/h;->a()Ld6/h;

    move-result-object v0

    invoke-interface {v0}, Ld6/h;->c()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Ld6/j;->n()Ld6/j;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, p0

    :goto_0
    iget-object v1, v0, Ld6/j;->c:Ld6/h;

    check-cast v1, Ld6/j;

    invoke-direct {v1}, Ld6/j;->q()Ld6/h;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, v2}, Ld6/j;->k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object v0

    invoke-direct {v0}, Ld6/j;->l()Ld6/j;

    move-result-object v0

    return-object v0
.end method

.method private r()Ld6/j;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/j<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v3, Ld6/h$a;->j:Ld6/h$a;

    iget-object v0, p0, Ld6/j;->d:Ld6/h;

    check-cast v0, Ld6/j;

    iget-object v5, v0, Ld6/j;->c:Ld6/h;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ld6/j;->j(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object v10

    iget-object v6, p0, Ld6/j;->d:Ld6/h;

    invoke-virtual {p0}, Ld6/j;->m()Ld6/h$a;

    move-result-object v9

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    invoke-interface/range {v6 .. v11}, Ld6/h;->g(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/h;

    move-result-object v0

    check-cast v0, Ld6/j;

    return-object v0
.end method

.method private s()Ld6/j;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/j<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v3, Ld6/h$a;->j:Ld6/h$a;

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    check-cast v0, Ld6/j;

    iget-object v4, v0, Ld6/j;->d:Ld6/h;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ld6/j;->j(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object v11

    iget-object v6, p0, Ld6/j;->c:Ld6/h;

    invoke-virtual {p0}, Ld6/j;->m()Ld6/h$a;

    move-result-object v9

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v6 .. v11}, Ld6/h;->g(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/h;

    move-result-object v0

    check-cast v0, Ld6/j;

    return-object v0
.end method


# virtual methods
.method public a()Ld6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    return-object v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ld6/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ljava/util/Comparator<",
            "TK;>;)",
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->a:Ljava/lang/Object;

    invoke-interface {p3, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0, p1, p2, p3}, Ld6/h;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ld6/h;

    move-result-object p1

    invoke-virtual {p0, v1, v1, p1, v1}, Ld6/j;->k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2, v1, v1}, Ld6/j;->k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld6/j;->d:Ld6/h;

    invoke-interface {v0, p1, p2, p3}, Ld6/h;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ld6/h;

    move-result-object p1

    invoke-virtual {p0, v1, v1, v1, p1}, Ld6/j;->k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object p1

    :goto_0
    invoke-direct {p1}, Ld6/j;->l()Ld6/j;

    move-result-object p1

    return-object p1
.end method

.method public d()Ld6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->d:Ld6/h;

    return-object v0
.end method

.method public e(Ljava/lang/Object;Ljava/util/Comparator;)Ld6/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Comparator<",
            "TK;>;)",
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->a:Ljava/lang/Object;

    invoke-interface {p2, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_1

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0}, Ld6/h;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0}, Ld6/h;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    check-cast v0, Ld6/j;

    iget-object v0, v0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0}, Ld6/h;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ld6/j;->n()Ld6/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    iget-object v2, v0, Ld6/j;->c:Ld6/h;

    invoke-interface {v2, p1, p2}, Ld6/h;->e(Ljava/lang/Object;Ljava/util/Comparator;)Ld6/h;

    move-result-object p1

    invoke-virtual {v0, v1, v1, p1, v1}, Ld6/j;->k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object p1

    goto :goto_2

    :cond_1
    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0}, Ld6/h;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Ld6/j;->s()Ld6/j;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, p0

    :goto_1
    iget-object v2, v0, Ld6/j;->d:Ld6/h;

    invoke-interface {v2}, Ld6/h;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, v0, Ld6/j;->d:Ld6/h;

    invoke-interface {v2}, Ld6/h;->c()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, v0, Ld6/j;->d:Ld6/h;

    check-cast v2, Ld6/j;

    iget-object v2, v2, Ld6/j;->c:Ld6/h;

    invoke-interface {v2}, Ld6/h;->c()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-direct {v0}, Ld6/j;->o()Ld6/j;

    move-result-object v0

    :cond_3
    iget-object v2, v0, Ld6/j;->a:Ljava/lang/Object;

    invoke-interface {p2, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, v0, Ld6/j;->d:Ld6/h;

    invoke-interface {v2}, Ld6/h;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {}, Ld6/g;->i()Ld6/g;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object v2, v0, Ld6/j;->d:Ld6/h;

    invoke-interface {v2}, Ld6/h;->f()Ld6/h;

    move-result-object v2

    invoke-interface {v2}, Ld6/h;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ld6/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    iget-object v4, v0, Ld6/j;->d:Ld6/h;

    check-cast v4, Ld6/j;

    invoke-direct {v4}, Ld6/j;->q()Ld6/h;

    move-result-object v4

    invoke-virtual {v0, v3, v2, v1, v4}, Ld6/j;->k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object v0

    :cond_5
    iget-object v2, v0, Ld6/j;->d:Ld6/h;

    invoke-interface {v2, p1, p2}, Ld6/h;->e(Ljava/lang/Object;Ljava/util/Comparator;)Ld6/h;

    move-result-object p1

    invoke-virtual {v0, v1, v1, v1, p1}, Ld6/j;->k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object p1

    :goto_2
    invoke-direct {p1}, Ld6/j;->l()Ld6/j;

    move-result-object p1

    return-object p1
.end method

.method public f()Ld6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0}, Ld6/h;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Ld6/j;->c:Ld6/h;

    invoke-interface {v0}, Ld6/h;->f()Ld6/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/h;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Ld6/j;->j(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/j;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public h()Ld6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ld6/j;->d:Ld6/h;

    invoke-interface {v0}, Ld6/h;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Ld6/j;->d:Ld6/h;

    invoke-interface {v0}, Ld6/h;->h()Ld6/h;

    move-result-object v0

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j(Ljava/lang/Object;Ljava/lang/Object;Ld6/h$a;Ld6/h;Ld6/h;)Ld6/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ld6/h$a;",
            "Ld6/h<",
            "TK;TV;>;",
            "Ld6/h<",
            "TK;TV;>;)",
            "Ld6/j<",
            "TK;TV;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Ld6/j;->a:Ljava/lang/Object;

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Ld6/j;->b:Ljava/lang/Object;

    :cond_1
    if-nez p4, :cond_2

    iget-object p4, p0, Ld6/j;->c:Ld6/h;

    :cond_2
    if-nez p5, :cond_3

    iget-object p5, p0, Ld6/j;->d:Ld6/h;

    :cond_3
    sget-object v0, Ld6/h$a;->j:Ld6/h$a;

    if-ne p3, v0, :cond_4

    new-instance p3, Ld6/i;

    invoke-direct {p3, p1, p2, p4, p5}, Ld6/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)V

    return-object p3

    :cond_4
    new-instance p3, Ld6/f;

    invoke-direct {p3, p1, p2, p4, p5}, Ld6/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)V

    return-object p3
.end method

.method protected abstract k(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)Ld6/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ld6/h<",
            "TK;TV;>;",
            "Ld6/h<",
            "TK;TV;>;)",
            "Ld6/j<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method protected abstract m()Ld6/h$a;
.end method

.method t(Ld6/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/h<",
            "TK;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ld6/j;->c:Ld6/h;

    return-void
.end method
