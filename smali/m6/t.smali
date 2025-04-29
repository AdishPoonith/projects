.class public final Lm6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private j:Ld7/b0;

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object v0

    invoke-static {}, Ld7/s;->g0()Ld7/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/b0$b;->Q(Ld7/s;)Ld7/b0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v0

    check-cast v0, Ld7/b0;

    invoke-direct {p0, v0}, Lm6/t;-><init>(Ld7/b0;)V

    return-void
.end method

.method public constructor <init>(Ld7/b0;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lm6/t;->k:Ljava/util/Map;

    invoke-virtual {p1}, Ld7/b0;->B0()Ld7/b0$c;

    move-result-object v0

    sget-object v1, Ld7/b0$c;->u:Ld7/b0$c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v3, [Ljava/lang/Object;

    const-string v4, "ObjectValues should be backed by a MapValue"

    invoke-static {v0, v4, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lm6/v;->c(Ld7/b0;)Z

    move-result v0

    xor-int/2addr v0, v2

    new-array v1, v3, [Ljava/lang/Object;

    const-string v2, "ServerTimestamps should not be used as an ObjectValue"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lm6/t;->j:Ld7/b0;

    return-void
.end method

.method private a(Lm6/r;Ljava/util/Map;)Ld7/s;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/r;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ld7/s;"
        }
    .end annotation

    iget-object v0, p0, Lm6/t;->j:Ld7/b0;

    invoke-direct {p0, v0, p1}, Lm6/t;->h(Ld7/b0;Lm6/r;)Ld7/b0;

    move-result-object v0

    invoke-static {v0}, Lm6/y;->w(Ld7/b0;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ld7/b0;->x0()Ld7/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/z;->d0()Lcom/google/protobuf/z$a;

    move-result-object v0

    check-cast v0, Ld7/s$b;

    goto :goto_0

    :cond_0
    invoke-static {}, Ld7/s;->o0()Ld7/s$b;

    move-result-object v0

    :goto_0
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/util/Map;

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    invoke-virtual {p1, v4}, Lm6/e;->b(Ljava/lang/String;)Lm6/e;

    move-result-object v5

    check-cast v5, Lm6/r;

    check-cast v3, Ljava/util/Map;

    invoke-direct {p0, v5, v3}, Lm6/t;->a(Lm6/r;Ljava/util/Map;)Ld7/s;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Ld7/b0$b;->Q(Ld7/s;)Ld7/b0$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v2

    check-cast v2, Ld7/b0;

    invoke-virtual {v0, v4, v2}, Ld7/s$b;->J(Ljava/lang/String;Ld7/b0;)Ld7/s$b;

    :goto_2
    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    instance-of v5, v3, Ld7/b0;

    if-eqz v5, :cond_3

    check-cast v3, Ld7/b0;

    invoke-virtual {v0, v4, v3}, Ld7/s$b;->J(Ljava/lang/String;Ld7/b0;)Ld7/s$b;

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v4}, Ld7/s$b;->H(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v3, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    new-array v3, v1, [Ljava/lang/Object;

    const-string v5, "Expected entry to be a Map, a Value or null"

    invoke-static {v2, v5, v3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Ld7/s$b;->K(Ljava/lang/String;)Ld7/s$b;

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/s;

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :goto_4
    return-object p1
.end method

.method private c()Ld7/b0;
    .locals 3

    iget-object v0, p0, Lm6/t;->k:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm6/r;->l:Lm6/r;

    iget-object v2, p0, Lm6/t;->k:Ljava/util/Map;

    invoke-direct {p0, v1, v2}, Lm6/t;->a(Lm6/r;Ljava/util/Map;)Ld7/s;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Ld7/b0$b;->Q(Ld7/s;)Ld7/b0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v1

    check-cast v1, Ld7/b0;

    iput-object v1, p0, Lm6/t;->j:Ld7/b0;

    iget-object v1, p0, Lm6/t;->k:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lm6/t;->j:Ld7/b0;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private g(Ld7/s;)Ln6/d;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Ld7/s;->i0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lm6/r;->w(Ljava/lang/String;)Lm6/r;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld7/b0;

    invoke-static {v3}, Lm6/y;->w(Ld7/b0;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld7/b0;

    invoke-virtual {v1}, Ld7/b0;->x0()Ld7/s;

    move-result-object v1

    invoke-direct {p0, v1}, Lm6/t;->g(Ld7/s;)Ln6/d;

    move-result-object v1

    invoke-virtual {v1}, Ln6/d;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/r;

    invoke-virtual {v2, v3}, Lm6/e;->g(Lm6/e;)Lm6/e;

    move-result-object v3

    check-cast v3, Lm6/r;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v0}, Ln6/d;->b(Ljava/util/Set;)Ln6/d;

    move-result-object p1

    return-object p1
.end method

.method private h(Ld7/b0;Lm6/r;)Ld7/b0;
    .locals 3

    invoke-virtual {p2}, Lm6/e;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Lm6/e;->q()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Ld7/b0;->x0()Ld7/s;

    move-result-object p1

    if-ge v0, v1, :cond_2

    invoke-virtual {p2, v0}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v2}, Ld7/s;->j0(Ljava/lang/String;Ld7/b0;)Ld7/b0;

    move-result-object p1

    invoke-static {p1}, Lm6/y;->w(Ld7/b0;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lm6/e;->l()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Ld7/s;->j0(Ljava/lang/String;Ld7/b0;)Ld7/b0;

    move-result-object p1

    return-object p1
.end method

.method public static i(Ljava/util/Map;)Lm6/t;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ld7/b0;",
            ">;)",
            "Lm6/t;"
        }
    .end annotation

    new-instance v0, Lm6/t;

    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object v1

    invoke-static {}, Ld7/s;->o0()Ld7/s$b;

    move-result-object v2

    invoke-virtual {v2, p0}, Ld7/s$b;->I(Ljava/util/Map;)Ld7/s$b;

    move-result-object p0

    invoke-virtual {v1, p0}, Ld7/b0$b;->P(Ld7/s$b;)Ld7/b0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p0

    check-cast p0, Ld7/b0;

    invoke-direct {v0, p0}, Lm6/t;-><init>(Ld7/b0;)V

    return-object v0
.end method

.method private s(Lm6/r;Ld7/b0;)V
    .locals 6

    iget-object v0, p0, Lm6/t;->k:Ljava/util/Map;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lm6/e;->q()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_2

    invoke-virtual {p1, v1}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/Map;

    if-eqz v4, :cond_0

    check-cast v3, Ljava/util/Map;

    :goto_1
    move-object v0, v3

    goto :goto_2

    :cond_0
    instance-of v4, v3, Ld7/b0;

    if-eqz v4, :cond_1

    check-cast v3, Ld7/b0;

    invoke-virtual {v3}, Ld7/b0;->B0()Ld7/b0$c;

    move-result-object v4

    sget-object v5, Ld7/b0$c;->u:Ld7/b0$c;

    if-ne v4, v5, :cond_1

    new-instance v4, Ljava/util/HashMap;

    invoke-virtual {v3}, Ld7/b0;->x0()Ld7/s;

    move-result-object v3

    invoke-virtual {v3}, Ld7/s;->i0()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v4

    goto :goto_2

    :cond_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lm6/e;->l()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm6/t;->d()Lm6/t;

    move-result-object v0

    return-object v0
.end method

.method public d()Lm6/t;
    .locals 2

    new-instance v0, Lm6/t;

    invoke-direct {p0}, Lm6/t;->c()Ld7/b0;

    move-result-object v1

    invoke-direct {v0, v1}, Lm6/t;-><init>(Ld7/b0;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lm6/t;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lm6/t;->c()Ld7/b0;

    move-result-object v0

    check-cast p1, Lm6/t;

    invoke-direct {p1}, Lm6/t;->c()Ld7/b0;

    move-result-object p1

    invoke-static {v0, p1}, Lm6/y;->q(Ld7/b0;Ld7/b0;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public f(Lm6/r;)V
    .locals 3

    invoke-virtual {p1}, Lm6/e;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cannot delete field for empty path on ObjectValue"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lm6/t;->s(Lm6/r;Ld7/b0;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    invoke-direct {p0}, Lm6/t;->c()Ld7/b0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/z;->hashCode()I

    move-result v0

    return v0
.end method

.method public j(Lm6/r;)Ld7/b0;
    .locals 1

    invoke-direct {p0}, Lm6/t;->c()Ld7/b0;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lm6/t;->h(Ld7/b0;Lm6/r;)Ld7/b0;

    move-result-object p1

    return-object p1
.end method

.method public n()Ln6/d;
    .locals 1

    invoke-direct {p0}, Lm6/t;->c()Ld7/b0;

    move-result-object v0

    invoke-virtual {v0}, Ld7/b0;->x0()Ld7/s;

    move-result-object v0

    invoke-direct {p0, v0}, Lm6/t;->g(Ld7/s;)Ln6/d;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ld7/b0;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lm6/t;->c()Ld7/b0;

    move-result-object v0

    invoke-virtual {v0}, Ld7/b0;->x0()Ld7/s;

    move-result-object v0

    invoke-virtual {v0}, Ld7/s;->i0()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public p(Lm6/r;Ld7/b0;)V
    .locals 3

    invoke-virtual {p1}, Lm6/e;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cannot set field for empty path on ObjectValue"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lm6/t;->s(Lm6/r;Ld7/b0;)V

    return-void
.end method

.method public r(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lm6/r;",
            "Ld7/b0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/r;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Lm6/t;->f(Lm6/r;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld7/b0;

    invoke-virtual {p0, v1, v0}, Lm6/t;->p(Lm6/r;Ld7/b0;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ObjectValue{internalValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lm6/t;->c()Ld7/b0;

    move-result-object v1

    invoke-static {v1}, Lm6/y;->b(Ld7/b0;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
