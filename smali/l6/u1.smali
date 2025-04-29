.class public Ll6/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/b;


# instance fields
.field private final a:Ll6/z2;

.field private final b:Ll6/o;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll6/z2;Ll6/o;Lh6/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/u1;->a:Ll6/z2;

    iput-object p2, p0, Ll6/u1;->b:Ll6/o;

    invoke-virtual {p3}, Lh6/j;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lh6/j;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    iput-object p1, p0, Ll6/u1;->c:Ljava/lang/String;

    return-void
.end method

.method public static synthetic g(Ll6/u1;Landroid/database/Cursor;)Ln6/k;
    .locals 0

    invoke-direct {p0, p1}, Ll6/u1;->n(Landroid/database/Cursor;)Ln6/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ll6/u1;[I[Ljava/lang/String;[Ljava/lang/String;Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Ll6/u1;->p([I[Ljava/lang/String;[Ljava/lang/String;Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic i(Ll6/u1;Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/u1;->o(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic j(Ll6/u1;[BILjava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/u1;->r([BILjava/util/Map;)V

    return-void
.end method

.method public static synthetic k(Ll6/u1;Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/u1;->q(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic l(Ll6/u1;Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/u1;->s(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private m([BI)Ln6/k;
    .locals 1

    :try_start_0
    invoke-static {p1}, Ld7/c0;->B0([B)Ld7/c0;

    move-result-object p1

    iget-object v0, p0, Ll6/u1;->b:Ll6/o;

    invoke-virtual {v0, p1}, Ll6/o;->e(Ld7/c0;)Ln6/f;

    move-result-object p1

    invoke-static {p2, p1}, Ln6/k;->a(ILn6/f;)Ln6/k;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const-string p1, "Overlay failed to parse: %s"

    invoke-static {p1, p2}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private synthetic n(Landroid/database/Cursor;)Ln6/k;
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    invoke-direct {p0, v0, p1}, Ll6/u1;->m([BI)Ln6/k;

    move-result-object p1

    return-object p1
.end method

.method private synthetic o(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/u1;->t(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private synthetic p([I[Ljava/lang/String;[Ljava/lang/String;Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 2

    const/4 v0, 0x1

    invoke-interface {p6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, p1, v1

    const/4 p1, 0x2

    invoke-interface {p6, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v1

    const/4 p1, 0x3

    invoke-interface {p6, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p3, v1

    invoke-direct {p0, p4, p5, p6}, Ll6/u1;->t(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private synthetic q(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/u1;->t(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private synthetic r([BILjava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ll6/u1;->m([BI)Ln6/k;

    move-result-object p1

    monitor-enter p3

    :try_start_0
    invoke-virtual {p1}, Ln6/k;->b()Lm6/l;

    move-result-object p2

    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p3

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic s(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/u1;->t(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method

.method private t(Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/m;",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/k;",
            ">;",
            "Landroid/database/Cursor;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-interface {p3}, Landroid/database/Cursor;->isLast()Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p1, Lq6/p;->b:Ljava/util/concurrent/Executor;

    :cond_0
    new-instance p3, Ll6/o1;

    invoke-direct {p3, p0, v0, v1, p2}, Ll6/o1;-><init>(Ll6/u1;[BILjava/util/Map;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private u(Ljava/util/Map;Lq6/m;Lm6/u;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/k;",
            ">;",
            "Lq6/m;",
            "Lm6/u;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll6/z2$b;

    iget-object v2, p0, Ll6/u1;->a:Ll6/z2;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Ll6/u1;->c:Ljava/lang/String;

    aput-object v4, v1, v3

    const/4 v3, 0x1

    invoke-static {p3}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object p3

    aput-object p3, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v3, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN ("

    const-string v6, ")"

    move-object v1, v0

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Ll6/z2$b;-><init>(Ll6/z2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Ll6/z2$b;->d()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {v0}, Ll6/z2$b;->e()Ll6/z2$d;

    move-result-object p3

    new-instance p4, Ll6/r1;

    invoke-direct {p4, p0, p2, p1}, Ll6/r1;-><init>(Ll6/u1;Lq6/m;Ljava/util/Map;)V

    invoke-virtual {p3, p4}, Ll6/z2$d;->e(Lq6/n;)I

    goto :goto_0

    :cond_1
    return-void
.end method

.method private v(ILm6/l;Ln6/f;)V
    .locals 6

    invoke-virtual {p2}, Lm6/l;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lm6/l;->r()Lm6/u;

    move-result-object v1

    invoke-virtual {v1}, Lm6/e;->s()Lm6/e;

    move-result-object v1

    check-cast v1, Lm6/u;

    invoke-static {v1}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lm6/l;->r()Lm6/u;

    move-result-object p2

    invoke-virtual {p2}, Lm6/e;->l()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Ll6/u1;->a:Ll6/z2;

    const/4 v3, 0x6

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Ll6/u1;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object p2, v3, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v3, p2

    iget-object p1, p0, Ll6/u1;->b:Ll6/o;

    invoke-virtual {p1, p3}, Ll6/o;->n(Ln6/f;)Ld7/c0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a;->f()[B

    move-result-object p1

    const/4 p2, 0x5

    aput-object p1, v3, p2

    const-string p1, "INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)"

    invoke-virtual {v2, p1, v3}, Ll6/z2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/SortedSet;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedSet<",
            "Lm6/l;",
            ">;)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/k;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOverlays() requires natural order"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lq6/m;

    invoke-direct {v1}, Lq6/m;-><init>()V

    sget-object v2, Lm6/u;->k:Lm6/u;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm6/l;

    invoke-virtual {v4}, Lm6/l;->p()Lm6/u;

    move-result-object v5

    invoke-virtual {v2, v5}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-direct {p0, v0, v1, v2, v3}, Ll6/u1;->u(Ljava/util/Map;Lq6/m;Lm6/u;Ljava/util/List;)V

    invoke-virtual {v4}, Lm6/l;->p()Lm6/u;

    move-result-object v2

    invoke-interface {v3}, Ljava/util/List;->clear()V

    :cond_1
    invoke-virtual {v4}, Lm6/l;->q()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0, v1, v2, v3}, Ll6/u1;->u(Ljava/util/Map;Lq6/m;Lm6/u;Ljava/util/List;)V

    invoke-virtual {v1}, Lq6/m;->b()V

    return-object v0
.end method

.method public b(I)V
    .locals 4

    iget-object v0, p0, Ll6/u1;->a:Ll6/z2;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Ll6/u1;->c:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string p1, "DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?"

    invoke-virtual {v0, p1, v1}, Ll6/z2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(ILjava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/f;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/l;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/f;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v3, "null value for key: %s"

    invoke-static {v0, v3, v2}, Lq6/x;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/f;

    invoke-direct {p0, p1, v1, v0}, Ll6/u1;->v(ILm6/l;Ln6/f;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Lm6/u;I)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/u;",
            "I)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lq6/m;

    invoke-direct {v1}, Lq6/m;-><init>()V

    iget-object v2, p0, Ll6/u1;->a:Ll6/z2;

    const-string v3, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?"

    invoke-virtual {v2, v3}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Ll6/u1;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {p1}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v3, p2

    invoke-virtual {v2, v3}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object p1

    new-instance p2, Ll6/p1;

    invoke-direct {p2, p0, v1, v0}, Ll6/p1;-><init>(Ll6/u1;Lq6/m;Ljava/util/Map;)V

    invoke-virtual {p1, p2}, Ll6/z2$d;->e(Lq6/n;)I

    invoke-virtual {v1}, Lq6/m;->b()V

    return-object v0
.end method

.method public e(Ljava/lang/String;II)Ljava/util/Map;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/k;",
            ">;"
        }
    .end annotation

    move-object/from16 v7, p0

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/String;

    new-array v11, v9, [Ljava/lang/String;

    new-array v12, v9, [I

    new-instance v13, Lq6/m;

    invoke-direct {v13}, Lq6/m;-><init>()V

    iget-object v0, v7, Ll6/u1;->a:Ll6/z2;

    const-string v1, "SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?"

    invoke-virtual {v0, v1}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v0

    const/4 v14, 0x4

    new-array v1, v14, [Ljava/lang/Object;

    iget-object v2, v7, Ll6/u1;->c:Ljava/lang/String;

    const/4 v15, 0x0

    aput-object v2, v1, v15

    aput-object p1, v1, v9

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v16, 0x2

    aput-object v2, v1, v16

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v17, 0x3

    aput-object v2, v1, v17

    invoke-virtual {v0, v1}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v6

    new-instance v5, Ll6/s1;

    move-object v0, v5

    move-object/from16 v1, p0

    move-object v2, v12

    move-object v3, v10

    move-object v4, v11

    move-object v14, v5

    move-object v5, v13

    move-object v9, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Ll6/s1;-><init>(Ll6/u1;[I[Ljava/lang/String;[Ljava/lang/String;Lq6/m;Ljava/util/Map;)V

    invoke-virtual {v9, v14}, Ll6/z2$d;->e(Lq6/n;)I

    aget-object v0, v10, v15

    if-nez v0, :cond_0

    return-object v8

    :cond_0
    iget-object v0, v7, Ll6/u1;->a:Ll6/z2;

    const-string v1, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?"

    invoke-virtual {v0, v1}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v0

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, v7, Ll6/u1;->c:Ljava/lang/String;

    aput-object v2, v1, v15

    const/4 v2, 0x1

    aput-object p1, v1, v2

    aget-object v2, v10, v15

    aput-object v2, v1, v16

    aget-object v2, v10, v15

    aput-object v2, v1, v17

    aget-object v2, v11, v15

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aget v3, v12, v15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v0

    new-instance v1, Ll6/q1;

    invoke-direct {v1, v7, v13, v8}, Ll6/q1;-><init>(Ll6/u1;Lq6/m;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Ll6/z2$d;->e(Lq6/n;)I

    invoke-virtual {v13}, Lq6/m;->b()V

    return-object v8
.end method

.method public f(Lm6/l;)Ln6/k;
    .locals 5

    invoke-virtual {p1}, Lm6/l;->r()Lm6/u;

    move-result-object v0

    invoke-virtual {v0}, Lm6/e;->s()Lm6/e;

    move-result-object v0

    check-cast v0, Lm6/u;

    invoke-static {v0}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lm6/l;->r()Lm6/u;

    move-result-object p1

    invoke-virtual {p1}, Lm6/e;->l()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Ll6/u1;->a:Ll6/z2;

    const-string v2, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?"

    invoke-virtual {v1, v2}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Ll6/u1;->c:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object p1, v2, v0

    invoke-virtual {v1, v2}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object p1

    new-instance v0, Ll6/t1;

    invoke-direct {v0, p0}, Ll6/t1;-><init>(Ll6/u1;)V

    invoke-virtual {p1, v0}, Ll6/z2$d;->d(Lq6/t;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln6/k;

    return-object p1
.end method
