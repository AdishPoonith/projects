.class final Ll6/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/g4;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj6/g1;",
            "Ll6/h4;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ll6/j1;

.field private c:I

.field private d:Lm6/w;

.field private e:J

.field private final f:Ll6/y0;


# direct methods
.method constructor <init>(Ll6/y0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll6/a1;->a:Ljava/util/Map;

    new-instance v0, Ll6/j1;

    invoke-direct {v0}, Ll6/j1;-><init>()V

    iput-object v0, p0, Ll6/a1;->b:Ll6/j1;

    sget-object v0, Lm6/w;->k:Lm6/w;

    iput-object v0, p0, Ll6/a1;->d:Lm6/w;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ll6/a1;->e:J

    iput-object p1, p0, Ll6/a1;->f:Ll6/y0;

    return-void
.end method


# virtual methods
.method public a(I)Ld6/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/a1;->b:Ll6/j1;

    invoke-virtual {v0, p1}, Ll6/j1;->d(I)Ld6/e;

    move-result-object p1

    return-object p1
.end method

.method public b()Lm6/w;
    .locals 1

    iget-object v0, p0, Ll6/a1;->d:Lm6/w;

    return-object v0
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Ll6/a1;->b:Ll6/j1;

    invoke-virtual {v0, p1}, Ll6/j1;->h(I)Ld6/e;

    return-void
.end method

.method public d(Ll6/h4;)V
    .locals 5

    iget-object v0, p0, Ll6/a1;->a:Ljava/util/Map;

    invoke-virtual {p1}, Ll6/h4;->f()Lj6/g1;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ll6/h4;->g()I

    move-result v0

    iget v1, p0, Ll6/a1;->c:I

    if-le v0, v1, :cond_0

    iput v0, p0, Ll6/a1;->c:I

    :cond_0
    invoke-virtual {p1}, Ll6/h4;->d()J

    move-result-wide v0

    iget-wide v2, p0, Ll6/a1;->e:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    invoke-virtual {p1}, Ll6/h4;->d()J

    move-result-wide v0

    iput-wide v0, p0, Ll6/a1;->e:J

    :cond_1
    return-void
.end method

.method public e(Lm6/w;)V
    .locals 0

    iput-object p1, p0, Ll6/a1;->d:Lm6/w;

    return-void
.end method

.method public f(Ll6/h4;)V
    .locals 0

    invoke-virtual {p0, p1}, Ll6/a1;->d(Ll6/h4;)V

    return-void
.end method

.method public g(Ld6/e;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/e<",
            "Lm6/l;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/a1;->b:Ll6/j1;

    invoke-virtual {v0, p1, p2}, Ll6/j1;->b(Ld6/e;I)V

    iget-object p2, p0, Ll6/a1;->f:Ll6/y0;

    invoke-virtual {p2}, Ll6/y0;->f()Ll6/i1;

    move-result-object p2

    invoke-virtual {p1}, Ld6/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm6/l;

    invoke-interface {p2, v0}, Ll6/i1;->k(Lm6/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Lj6/g1;)Ll6/h4;
    .locals 1

    iget-object v0, p0, Ll6/a1;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll6/h4;

    return-object p1
.end method

.method public i(Ld6/e;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/e<",
            "Lm6/l;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/a1;->b:Ll6/j1;

    invoke-virtual {v0, p1, p2}, Ll6/j1;->g(Ld6/e;I)V

    iget-object p2, p0, Ll6/a1;->f:Ll6/y0;

    invoke-virtual {p2}, Ll6/y0;->f()Ll6/i1;

    move-result-object p2

    invoke-virtual {p1}, Ld6/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm6/l;

    invoke-interface {p2, v0}, Ll6/i1;->n(Lm6/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j()I
    .locals 1

    iget v0, p0, Ll6/a1;->c:I

    return v0
.end method

.method public k(Lm6/l;)Z
    .locals 1

    iget-object v0, p0, Ll6/a1;->b:Ll6/j1;

    invoke-virtual {v0, p1}, Ll6/j1;->c(Lm6/l;)Z

    move-result p1

    return p1
.end method

.method public l(Lq6/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/n<",
            "Ll6/h4;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/a1;->a:Ljava/util/Map;

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

    invoke-interface {p1, v1}, Lq6/n;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method m(Ll6/o;)J
    .locals 5

    iget-object v0, p0, Ll6/a1;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll6/h4;

    invoke-virtual {p1, v3}, Ll6/o;->q(Ll6/h4;)Lo6/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/protobuf/z;->a()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public n()J
    .locals 2

    iget-wide v0, p0, Ll6/a1;->e:J

    return-wide v0
.end method

.method public o()J
    .locals 2

    iget-object v0, p0, Ll6/a1;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method p(JLandroid/util/SparseArray;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/util/SparseArray<",
            "*>;)I"
        }
    .end annotation

    iget-object v0, p0, Ll6/a1;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll6/h4;

    invoke-virtual {v3}, Ll6/h4;->g()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll6/h4;

    invoke-virtual {v2}, Ll6/h4;->d()J

    move-result-wide v4

    cmp-long v2, v4, p1

    if-gtz v2, :cond_0

    invoke-virtual {p3, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    invoke-virtual {p0, v3}, Ll6/a1;->c(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public q(Ll6/h4;)V
    .locals 2

    iget-object v0, p0, Ll6/a1;->a:Ljava/util/Map;

    invoke-virtual {p1}, Ll6/h4;->f()Lj6/g1;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ll6/a1;->b:Ll6/j1;

    invoke-virtual {p1}, Ll6/h4;->g()I

    move-result p1

    invoke-virtual {v0, p1}, Ll6/j1;->h(I)Ld6/e;

    return-void
.end method
