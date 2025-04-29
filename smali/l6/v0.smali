.class Ll6/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/i1;
.implements Ll6/k0;


# instance fields
.field private final a:Ll6/y0;

.field private final b:Ll6/o;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ll6/j1;

.field private final e:Ll6/o0;

.field private final f:Lj6/v0;

.field private g:J


# direct methods
.method constructor <init>(Ll6/y0;Ll6/o0$b;Ll6/o;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/v0;->a:Ll6/y0;

    iput-object p3, p0, Ll6/v0;->b:Ll6/o;

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Ll6/v0;->c:Ljava/util/Map;

    new-instance p3, Lj6/v0;

    invoke-virtual {p1}, Ll6/y0;->s()Ll6/a1;

    move-result-object p1

    invoke-virtual {p1}, Ll6/a1;->n()J

    move-result-wide v0

    invoke-direct {p3, v0, v1}, Lj6/v0;-><init>(J)V

    iput-object p3, p0, Ll6/v0;->f:Lj6/v0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ll6/v0;->g:J

    new-instance p1, Ll6/o0;

    invoke-direct {p1, p0, p2}, Ll6/o0;-><init>(Ll6/k0;Ll6/o0$b;)V

    iput-object p1, p0, Ll6/v0;->e:Ll6/o0;

    return-void
.end method

.method public static synthetic q([JLjava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Ll6/v0;->s([JLjava/lang/Long;)V

    return-void
.end method

.method private r(Lm6/l;J)Z
    .locals 4

    invoke-direct {p0, p1}, Ll6/v0;->t(Lm6/l;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ll6/v0;->d:Ll6/j1;

    invoke-virtual {v0, p1}, Ll6/j1;->c(Lm6/l;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v0}, Ll6/y0;->s()Ll6/a1;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll6/a1;->k(Lm6/l;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Ll6/v0;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v2, p2

    if-lez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private static synthetic s([JLjava/lang/Long;)V
    .locals 4

    const/4 p1, 0x0

    aget-wide v0, p0, p1

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    aput-wide v0, p0, p1

    return-void
.end method

.method private t(Lm6/l;)Z
    .locals 2

    iget-object v0, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v0}, Ll6/y0;->q()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll6/w0;

    invoke-virtual {v1, p1}, Ll6/w0;->l(Lm6/l;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a()J
    .locals 5

    iget-object v0, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v0}, Ll6/y0;->s()Ll6/a1;

    move-result-object v0

    invoke-virtual {v0}, Ll6/a1;->o()J

    move-result-wide v0

    const/4 v2, 0x1

    new-array v2, v2, [J

    new-instance v3, Ll6/u0;

    invoke-direct {v3, v2}, Ll6/u0;-><init>([J)V

    invoke-virtual {p0, v3}, Ll6/v0;->b(Lq6/n;)V

    const/4 v3, 0x0

    aget-wide v3, v2, v3

    add-long/2addr v0, v3

    return-wide v0
.end method

.method public b(Lq6/n;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/n<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/v0;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-direct {p0, v2, v3, v4}, Ll6/v0;->r(Lm6/l;J)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-interface {p1, v1}, Lq6/n;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(JLandroid/util/SparseArray;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/util/SparseArray<",
            "*>;)I"
        }
    .end annotation

    iget-object v0, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v0}, Ll6/y0;->s()Ll6/a1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ll6/a1;->p(JLandroid/util/SparseArray;)I

    move-result p1

    return p1
.end method

.method public d(J)I
    .locals 5

    iget-object v0, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v0}, Ll6/y0;->r()Ll6/z0;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ll6/z0;->i()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/i;

    invoke-interface {v3}, Lm6/i;->getKey()Lm6/l;

    move-result-object v3

    invoke-direct {p0, v3, p1, p2}, Ll6/v0;->r(Lm6/l;J)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Ll6/v0;->c:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ll6/z0;->removeAll(Ljava/util/Collection;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public e(Lm6/l;)V
    .locals 3

    iget-object v0, p0, Ll6/v0;->c:Ljava/util/Map;

    invoke-virtual {p0}, Ll6/v0;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public f(Ll6/h4;)V
    .locals 2

    invoke-virtual {p0}, Ll6/v0;->p()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll6/h4;->j(J)Ll6/h4;

    move-result-object p1

    iget-object v0, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v0}, Ll6/y0;->s()Ll6/a1;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll6/a1;->f(Ll6/h4;)V

    return-void
.end method

.method public g()V
    .locals 6

    iget-wide v0, p0, Ll6/v0;->g:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Committing a transaction without having started one"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-wide v3, p0, Ll6/v0;->g:J

    return-void
.end method

.method public h(Lq6/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/n<",
            "Ll6/h4;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v0}, Ll6/y0;->s()Ll6/a1;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll6/a1;->l(Lq6/n;)V

    return-void
.end method

.method public i()Ll6/o0;
    .locals 1

    iget-object v0, p0, Ll6/v0;->e:Ll6/o0;

    return-object v0
.end method

.method public j()V
    .locals 6

    iget-wide v0, p0, Ll6/v0;->g:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Starting a transaction without committing the previous one"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Ll6/v0;->f:Lj6/v0;

    invoke-virtual {v0}, Lj6/v0;->a()J

    move-result-wide v0

    iput-wide v0, p0, Ll6/v0;->g:J

    return-void
.end method

.method public k(Lm6/l;)V
    .locals 3

    iget-object v0, p0, Ll6/v0;->c:Ljava/util/Map;

    invoke-virtual {p0}, Ll6/v0;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public l()J
    .locals 5

    iget-object v0, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v0}, Ll6/y0;->s()Ll6/a1;

    move-result-object v0

    iget-object v1, p0, Ll6/v0;->b:Ll6/o;

    invoke-virtual {v0, v1}, Ll6/a1;->m(Ll6/o;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    add-long/2addr v0, v2

    iget-object v2, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v2}, Ll6/y0;->r()Ll6/z0;

    move-result-object v2

    iget-object v3, p0, Ll6/v0;->b:Ll6/o;

    invoke-virtual {v2, v3}, Ll6/z0;->h(Ll6/o;)J

    move-result-wide v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll6/v0;->a:Ll6/y0;

    invoke-virtual {v2}, Ll6/y0;->q()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll6/w0;

    iget-object v4, p0, Ll6/v0;->b:Ll6/o;

    invoke-virtual {v3, v4}, Ll6/w0;->m(Ll6/o;)J

    move-result-wide v3

    add-long/2addr v0, v3

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public m(Lm6/l;)V
    .locals 3

    iget-object v0, p0, Ll6/v0;->c:Ljava/util/Map;

    invoke-virtual {p0}, Ll6/v0;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public n(Lm6/l;)V
    .locals 3

    iget-object v0, p0, Ll6/v0;->c:Ljava/util/Map;

    invoke-virtual {p0}, Ll6/v0;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public o(Ll6/j1;)V
    .locals 0

    iput-object p1, p0, Ll6/v0;->d:Ll6/j1;

    return-void
.end method

.method public p()J
    .locals 6

    iget-wide v0, p0, Ll6/v0;->g:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Attempting to get a sequence number outside of a transaction"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-wide v0, p0, Ll6/v0;->g:J

    return-wide v0
.end method
