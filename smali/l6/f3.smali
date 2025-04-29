.class final Ll6/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/k1;


# instance fields
.field private final a:Ll6/z2;

.field private final b:Ll6/o;

.field private c:Ll6/l;


# direct methods
.method constructor <init>(Ll6/z2;Ll6/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/f3;->a:Ll6/z2;

    iput-object p2, p0, Ll6/f3;->b:Ll6/o;

    return-void
.end method

.method public static synthetic g(Ll6/f3;[BIILq6/t;Ljava/util/Map;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ll6/f3;->p([BIILq6/t;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic h(Ll6/f3;Lq6/m;Ljava/util/Map;Lq6/t;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ll6/f3;->n(Lq6/m;Ljava/util/Map;Lq6/t;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic i(Lj6/b1;Ljava/util/Set;Lm6/s;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1, p2}, Ll6/f3;->o(Lj6/b1;Ljava/util/Set;Lm6/s;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ll6/f3;Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/f3;->m(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private k([BII)Lm6/s;
    .locals 4

    :try_start_0
    iget-object v0, p0, Ll6/f3;->b:Ll6/o;

    invoke-static {p1}, Lo6/a;->p0([B)Lo6/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll6/o;->d(Lo6/a;)Lm6/s;

    move-result-object p1

    new-instance v0, Lm6/w;

    new-instance v1, Lw5/q;

    int-to-long v2, p2

    invoke-direct {v1, v2, v3, p3}, Lw5/q;-><init>(JI)V

    invoke-direct {v0, v1}, Lm6/w;-><init>(Lw5/q;)V

    invoke-virtual {p1, v0}, Lm6/s;->v(Lm6/w;)Lm6/s;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    const-string p1, "MaybeDocument failed to parse: %s"

    invoke-static {p1, p2}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private l(Ljava/util/List;Lm6/q$a;ILq6/t;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm6/u;",
            ">;",
            "Lm6/q$a;",
            "I",
            "Lq6/t<",
            "Lm6/s;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lm6/q$a;->o()Lm6/w;

    move-result-object v0

    invoke-virtual {v0}, Lm6/w;->g()Lw5/q;

    move-result-object v0

    invoke-virtual {p2}, Lm6/q$a;->l()Lm6/l;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const-string v2, "SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) "

    const-string v3, " UNION "

    invoke-static {v2, v1, v3}, Lq6/g0;->z(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x9

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm6/u;

    invoke-static {v4}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v6, v3, 0x1

    aput-object v5, v2, v3

    add-int/lit8 v3, v6, 0x1

    invoke-static {v5}, Ll6/f;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v6

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {v4}, Lm6/e;->q()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v5, 0x1

    invoke-virtual {v0}, Lw5/q;->l()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v5

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v0}, Lw5/q;->l()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v3

    add-int/lit8 v3, v4, 0x1

    invoke-virtual {v0}, Lw5/q;->k()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v0}, Lw5/q;->l()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v2, v3

    add-int/lit8 v3, v4, 0x1

    invoke-virtual {v0}, Lw5/q;->k()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {p2}, Lm6/l;->r()Lm6/u;

    move-result-object v5

    invoke-static {v5}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v3

    move v3, v4

    goto :goto_0

    :cond_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    new-instance p1, Lq6/m;

    invoke-direct {p1}, Lq6/m;-><init>()V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iget-object p3, p0, Ll6/f3;->a:Ll6/z2;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object p3

    invoke-virtual {p3, v2}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object p3

    new-instance v0, Ll6/d3;

    invoke-direct {v0, p0, p1, p2, p4}, Ll6/d3;-><init>(Ll6/f3;Lq6/m;Ljava/util/Map;Lq6/t;)V

    invoke-virtual {p3, v0}, Ll6/z2$d;->e(Lq6/n;)I

    invoke-virtual {p1}, Lq6/m;->b()V

    return-object p2
.end method

.method private synthetic m(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Ll6/f3;->q(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;Lq6/t;)V

    return-void
.end method

.method private synthetic n(Lq6/m;Ljava/util/Map;Lq6/t;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p4, p3}, Ll6/f3;->q(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;Lq6/t;)V

    return-void
.end method

.method private static synthetic o(Lj6/b1;Ljava/util/Set;Lm6/s;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0, p2}, Lj6/b1;->v(Lm6/i;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {p2}, Lm6/s;->getKey()Lm6/l;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private synthetic p([BIILq6/t;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/f3;->k([BII)Lm6/s;

    move-result-object p1

    if-eqz p4, :cond_0

    invoke-interface {p4, p1}, Lq6/t;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    monitor-enter p5

    :try_start_0
    invoke-virtual {p1}, Lm6/s;->getKey()Lm6/l;

    move-result-object p2

    invoke-interface {p5, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p5

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    monitor-exit p5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private q(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;Lq6/t;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/m;",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;",
            "Landroid/database/Cursor;",
            "Lq6/t<",
            "Lm6/s;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v3

    const/4 v0, 0x1

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/4 v0, 0x2

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-interface {p3}, Landroid/database/Cursor;->isLast()Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p1, Lq6/p;->b:Ljava/util/concurrent/Executor;

    :cond_0
    new-instance p3, Ll6/b3;

    move-object v1, p3

    move-object v2, p0

    move-object v6, p4

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Ll6/b3;-><init>(Ll6/f3;[BIILq6/t;Ljava/util/Map;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Lj6/b1;Lm6/q$a;Ljava/util/Set;)Ljava/util/Map;
    .locals 2
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

    invoke-virtual {p1}, Lj6/b1;->n()Lm6/u;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll6/e3;

    invoke-direct {v1, p1, p3}, Ll6/e3;-><init>(Lj6/b1;Ljava/util/Set;)V

    const p1, 0x7fffffff

    invoke-direct {p0, v0, p2, p1, v1}, Ll6/f3;->l(Ljava/util/List;Lm6/q$a;ILq6/t;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public b(Ll6/l;)V
    .locals 0

    iput-object p1, p0, Ll6/f3;->c:Ll6/l;

    return-void
.end method

.method public c(Lm6/l;)Lm6/s;
    .locals 1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll6/f3;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm6/s;

    return-object p1
.end method

.method public d(Lm6/s;Lm6/w;)V
    .locals 7

    sget-object v0, Lm6/w;->k:Lm6/w;

    invoke-virtual {p2, v0}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Cannot add document to the RemoteDocumentCache with a read time of zero"

    invoke-static {v0, v4, v3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm6/s;->getKey()Lm6/l;

    move-result-object v0

    invoke-virtual {p2}, Lm6/w;->g()Lw5/q;

    move-result-object p2

    iget-object v3, p0, Ll6/f3;->b:Ll6/o;

    invoke-virtual {v3, p1}, Ll6/o;->m(Lm6/i;)Lo6/a;

    move-result-object v3

    iget-object v4, p0, Ll6/f3;->a:Ll6/z2;

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lm6/l;->r()Lm6/u;

    move-result-object v6

    invoke-static {v6}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {v0}, Lm6/l;->r()Lm6/u;

    move-result-object v0

    invoke-virtual {v0}, Lm6/e;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v1

    const/4 v0, 0x2

    invoke-virtual {p2}, Lw5/q;->l()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v0

    const/4 v0, 0x3

    invoke-virtual {p2}, Lw5/q;->k()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v5, v0

    const/4 p2, 0x4

    invoke-interface {v3}, Lcom/google/protobuf/v0;->f()[B

    move-result-object v0

    aput-object v0, v5, p2

    const-string p2, "INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)"

    invoke-virtual {v4, p2, v5}, Ll6/z2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Ll6/f3;->c:Ll6/l;

    invoke-virtual {p1}, Lm6/s;->getKey()Lm6/l;

    move-result-object p1

    invoke-virtual {p1}, Lm6/l;->p()Lm6/u;

    move-result-object p1

    invoke-interface {p2, p1}, Ll6/l;->g(Lm6/u;)V

    return-void
.end method

.method public e(Ljava/lang/String;Lm6/q$a;I)Ljava/util/Map;
    .locals 5
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

    iget-object v0, p0, Ll6/f3;->c:Ll6/l;

    invoke-interface {v0, p1}, Ll6/l;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/u;

    invoke-virtual {v2, p1}, Lm6/e;->b(Ljava/lang/String;)Lm6/e;

    move-result-object v2

    check-cast v2, Lm6/u;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x9

    const/16 v0, 0x384

    const/4 v2, 0x0

    if-ge p1, v0, :cond_2

    invoke-direct {p0, v1, p2, p3, v2}, Ll6/f3;->l(Ljava/util/List;Lm6/q$a;ILq6/t;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v4, v0, 0x64

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-interface {v1, v0, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3, v2}, Ll6/f3;->l(Ljava/util/List;Lm6/q$a;ILq6/t;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    move v0, v4

    goto :goto_1

    :cond_3
    sget-object p2, Lm6/q$a;->k:Ljava/util/Comparator;

    invoke-static {p1, p3, p2}, Lq6/g0;->u(Ljava/util/Map;ILjava/util/Comparator;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Iterable;)Ljava/util/Map;
    .locals 5
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

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    invoke-virtual {v2}, Lm6/l;->r()Lm6/u;

    move-result-object v3

    invoke-static {v3}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Lm6/s;->q(Lm6/l;)Lm6/s;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ll6/z2$b;

    iget-object v2, p0, Ll6/f3;->a:Ll6/z2;

    const-string v3, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN ("

    const-string v4, ") ORDER BY path"

    invoke-direct {p1, v2, v3, v1, v4}, Ll6/z2$b;-><init>(Ll6/z2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    new-instance v1, Lq6/m;

    invoke-direct {v1}, Lq6/m;-><init>()V

    :goto_1
    invoke-virtual {p1}, Ll6/z2$b;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ll6/z2$b;->e()Ll6/z2$d;

    move-result-object v2

    new-instance v3, Ll6/c3;

    invoke-direct {v3, p0, v1, v0}, Ll6/c3;-><init>(Ll6/f3;Lq6/m;Ljava/util/Map;)V

    invoke-virtual {v2, v3}, Ll6/z2$d;->e(Lq6/n;)I

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lq6/m;->b()V

    return-object v0
.end method

.method public removeAll(Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lm6/l;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lm6/j;->a()Ld6/c;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    invoke-virtual {v2}, Lm6/l;->r()Lm6/u;

    move-result-object v3

    invoke-static {v3}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Lm6/w;->k:Lm6/w;

    invoke-static {v2, v3}, Lm6/s;->r(Lm6/l;Lm6/w;)Lm6/s;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance p1, Ll6/z2$b;

    iget-object v2, p0, Ll6/f3;->a:Ll6/z2;

    const-string v3, "DELETE FROM remote_documents WHERE path IN ("

    const-string v4, ")"

    invoke-direct {p1, v2, v3, v0, v4}, Ll6/z2$b;-><init>(Ll6/z2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p1}, Ll6/z2$b;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll6/z2$b;->a()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Ll6/f3;->c:Ll6/l;

    invoke-interface {p1, v1}, Ll6/l;->i(Ld6/c;)V

    return-void
.end method
