.class public Lm6/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lj6/q;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj6/q;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj6/a1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj6/g1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lj6/g1;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj6/g1;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lj6/g1;->n()Lm6/u;

    move-result-object v0

    invoke-virtual {v0}, Lm6/e;->l()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lm6/x;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lj6/g1;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm6/x;->d:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lm6/x;->b:Lj6/q;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm6/x;->c:Ljava/util/List;

    invoke-virtual {p1}, Lj6/g1;->h()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj6/r;

    check-cast v0, Lj6/q;

    invoke-virtual {v0}, Lj6/q;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lm6/x;->b:Lj6/q;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lj6/q;->g()Lm6/r;

    move-result-object v1

    invoke-virtual {v0}, Lj6/q;->g()Lm6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v1, 0x1

    :goto_3
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Only a single inequality is supported"

    invoke-static {v1, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object v0, p0, Lm6/x;->b:Lj6/q;

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lm6/x;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-void
.end method

.method private a(Lm6/q$c;)Z
    .locals 2

    iget-object v0, p0, Lm6/x;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/q;

    invoke-direct {p0, v1, p1}, Lm6/x;->b(Lj6/q;Lm6/q$c;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private b(Lj6/q;Lm6/q$c;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lj6/q;->g()Lm6/r;

    move-result-object v1

    invoke-virtual {p2}, Lm6/q$c;->h()Lm6/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lj6/q;->h()Lj6/q$b;

    move-result-object v1

    sget-object v2, Lj6/q$b;->q:Lj6/q$b;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lj6/q;->h()Lj6/q$b;

    move-result-object p1

    sget-object v1, Lj6/q$b;->r:Lj6/q$b;

    invoke-virtual {p1, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-virtual {p2}, Lm6/q$c;->i()Lm6/q$c$a;

    move-result-object p2

    sget-object v1, Lm6/q$c$a;->l:Lm6/q$c$a;

    invoke-virtual {p2, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-ne p2, p1, :cond_3

    const/4 v0, 0x1

    :cond_3
    :goto_2
    return v0
.end method

.method private c(Lj6/a1;Lm6/q$c;)Z
    .locals 3

    invoke-virtual {p1}, Lj6/a1;->c()Lm6/r;

    move-result-object v0

    invoke-virtual {p2}, Lm6/q$c;->h()Lm6/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p2}, Lm6/q$c;->i()Lm6/q$c$a;

    move-result-object v0

    sget-object v2, Lm6/q$c$a;->j:Lm6/q$c$a;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lj6/a1;->b()Lj6/a1$a;

    move-result-object v0

    sget-object v2, Lj6/a1$a;->k:Lj6/a1$a;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p2}, Lm6/q$c;->i()Lm6/q$c$a;

    move-result-object p2

    sget-object v0, Lm6/q$c$a;->k:Lm6/q$c$a;

    invoke-virtual {p2, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lj6/a1;->b()Lj6/a1$a;

    move-result-object p1

    sget-object p2, Lj6/a1$a;->l:Lj6/a1$a;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1
.end method


# virtual methods
.method public d(Lm6/q;)Z
    .locals 6

    invoke-virtual {p1}, Lm6/q;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm6/x;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Collection IDs do not match"

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm6/q;->c()Lm6/q$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lm6/x;->a(Lm6/q$c;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lm6/x;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {p1}, Lm6/q;->e()Ljava/util/List;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/q$c;

    invoke-direct {p0, v3}, Lm6/x;->a(Lm6/q$c;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v2, v3, :cond_3

    return v4

    :cond_3
    iget-object v3, p0, Lm6/x;->b:Lj6/q;

    if-eqz v3, :cond_6

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/q$c;

    iget-object v5, p0, Lm6/x;->b:Lj6/q;

    invoke-direct {p0, v5, v3}, Lm6/x;->b(Lj6/q;Lm6/q$c;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj6/a1;

    invoke-direct {p0, v5, v3}, Lm6/x;->c(Lj6/a1;Lm6/q$c;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    :goto_2
    return v1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_8

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/q$c;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj6/a1;

    invoke-direct {p0, v5, v3}, Lm6/x;->c(Lj6/a1;Lm6/q$c;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_7
    return v1

    :cond_8
    return v4
.end method
