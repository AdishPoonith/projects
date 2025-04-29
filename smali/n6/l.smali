.class public final Ln6/l;
.super Ln6/f;
.source "SourceFile"


# instance fields
.field private final d:Lm6/t;

.field private final e:Ln6/d;


# direct methods
.method public constructor <init>(Lm6/l;Lm6/t;Ln6/d;Ln6/m;)V
    .locals 6

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Ln6/l;-><init>(Lm6/l;Lm6/t;Ln6/d;Ln6/m;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lm6/l;Lm6/t;Ln6/d;Ln6/m;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/l;",
            "Lm6/t;",
            "Ln6/d;",
            "Ln6/m;",
            "Ljava/util/List<",
            "Ln6/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p4, p5}, Ln6/f;-><init>(Lm6/l;Ln6/m;Ljava/util/List;)V

    iput-object p2, p0, Ln6/l;->d:Lm6/t;

    iput-object p3, p0, Ln6/l;->e:Ln6/d;

    return-void
.end method

.method private o()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm6/r;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ln6/f;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/e;

    invoke-virtual {v2}, Ln6/e;->a()Lm6/r;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private p()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lm6/r;",
            "Ld7/b0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Ln6/l;->e:Ln6/d;

    invoke-virtual {v1}, Ln6/d;->c()Ljava/util/Set;

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

    check-cast v2, Lm6/r;

    invoke-virtual {v2}, Lm6/e;->o()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Ln6/l;->d:Lm6/t;

    invoke-virtual {v3, v2}, Lm6/t;->j(Lm6/r;)Ld7/b0;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Lm6/s;Ln6/d;Lw5/q;)Ln6/d;
    .locals 2

    invoke-virtual {p0, p1}, Ln6/f;->n(Lm6/s;)V

    invoke-virtual {p0}, Ln6/f;->h()Ln6/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln6/m;->e(Lm6/s;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p0, p3, p1}, Ln6/f;->l(Lw5/q;Lm6/s;)Ljava/util/Map;

    move-result-object p3

    invoke-direct {p0}, Ln6/l;->p()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lm6/s;->k()Lm6/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lm6/t;->r(Ljava/util/Map;)V

    invoke-virtual {v1, p3}, Lm6/t;->r(Ljava/util/Map;)V

    invoke-virtual {p1}, Lm6/s;->j()Lm6/w;

    move-result-object p3

    invoke-virtual {p1}, Lm6/s;->k()Lm6/t;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lm6/s;->l(Lm6/w;Lm6/t;)Lm6/s;

    move-result-object p1

    invoke-virtual {p1}, Lm6/s;->u()Lm6/s;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance p1, Ljava/util/HashSet;

    invoke-virtual {p2}, Ln6/d;->c()Ljava/util/Set;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object p2, p0, Ln6/l;->e:Ln6/d;

    invoke-virtual {p2}, Ln6/d;->c()Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Ln6/l;->o()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    invoke-static {p1}, Ln6/d;->b(Ljava/util/Set;)Ln6/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Lm6/s;Ln6/i;)V
    .locals 3

    invoke-virtual {p0, p1}, Ln6/f;->n(Lm6/s;)V

    invoke-virtual {p0}, Ln6/f;->h()Ln6/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln6/m;->e(Lm6/s;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ln6/i;->b()Lm6/w;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm6/s;->n(Lm6/w;)Lm6/s;

    return-void

    :cond_0
    invoke-virtual {p2}, Ln6/i;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ln6/f;->m(Lm6/s;Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lm6/s;->k()Lm6/t;

    move-result-object v1

    invoke-direct {p0}, Ln6/l;->p()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lm6/t;->r(Ljava/util/Map;)V

    invoke-virtual {v1, v0}, Lm6/t;->r(Ljava/util/Map;)V

    invoke-virtual {p2}, Ln6/i;->b()Lm6/w;

    move-result-object p2

    invoke-virtual {p1}, Lm6/s;->k()Lm6/t;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lm6/s;->l(Lm6/w;Lm6/t;)Lm6/s;

    move-result-object p1

    invoke-virtual {p1}, Lm6/s;->t()Lm6/s;

    return-void
.end method

.method public e()Ln6/d;
    .locals 1

    iget-object v0, p0, Ln6/l;->e:Ln6/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ln6/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ln6/l;

    invoke-virtual {p0, p1}, Ln6/f;->i(Ln6/f;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ln6/l;->d:Lm6/t;

    iget-object v3, p1, Ln6/l;->d:Lm6/t;

    invoke-virtual {v2, v3}, Lm6/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Ln6/f;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Ln6/f;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ln6/f;->j()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln6/l;->d:Lm6/t;

    invoke-virtual {v1}, Lm6/t;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public q()Lm6/t;
    .locals 1

    iget-object v0, p0, Ln6/l;->d:Lm6/t;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PatchMutation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ln6/f;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln6/l;->e:Ln6/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln6/l;->d:Lm6/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
