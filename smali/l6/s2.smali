.class final Ll6/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/b1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll6/s2$a;
    }
.end annotation


# instance fields
.field private final a:Ll6/z2;

.field private final b:Ll6/o;

.field private final c:Ll6/l;

.field private final d:Ljava/lang/String;

.field private e:I

.field private f:Lcom/google/protobuf/i;


# direct methods
.method constructor <init>(Ll6/z2;Ll6/o;Lh6/j;Ll6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/s2;->a:Ll6/z2;

    iput-object p2, p0, Ll6/s2;->b:Ll6/o;

    invoke-virtual {p3}, Lh6/j;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lh6/j;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    iput-object p1, p0, Ll6/s2;->d:Ljava/lang/String;

    sget-object p1, Lp6/z0;->v:Lcom/google/protobuf/i;

    iput-object p1, p0, Ll6/s2;->f:Lcom/google/protobuf/i;

    iput-object p4, p0, Ll6/s2;->c:Ll6/l;

    return-void
.end method

.method private static synthetic A(Landroid/database/Cursor;)Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private synthetic B(Landroid/database/Cursor;)Ln6/g;
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ll6/s2;->v(I[B)Ln6/g;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic C(Ljava/util/List;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic D(Landroid/database/Cursor;)V
    .locals 2

    iget v0, p0, Ll6/s2;->e:I

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll6/s2;->e:I

    return-void
.end method

.method private synthetic E(ILandroid/database/Cursor;)Ln6/g;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll6/s2;->v(I[B)Ln6/g;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic F(Ljava/util/List;Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll6/f;->b(Ljava/lang/String;)Lm6/u;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic G(Landroid/database/Cursor;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/protobuf/i;->u([B)Lcom/google/protobuf/i;

    move-result-object p1

    iput-object p1, p0, Ll6/s2;->f:Lcom/google/protobuf/i;

    return-void
.end method

.method private H()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ll6/s2;->a:Ll6/z2;

    const-string v2, "SELECT uid FROM mutation_queues"

    invoke-virtual {v1, v2}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v1

    new-instance v2, Ll6/k2;

    invoke-direct {v2, v0}, Ll6/k2;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v2}, Ll6/z2$d;->e(Lq6/n;)I

    const/4 v1, 0x0

    iput v1, p0, Ll6/s2;->e:I

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, p0, Ll6/s2;->a:Ll6/z2;

    const-string v5, "SELECT MAX(batch_id) FROM mutations WHERE uid = ?"

    invoke-virtual {v4, v5}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v1

    invoke-virtual {v4, v3}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v2

    new-instance v3, Ll6/l2;

    invoke-direct {v3, p0}, Ll6/l2;-><init>(Ll6/s2;)V

    invoke-virtual {v2, v3}, Ll6/z2$d;->e(Lq6/n;)I

    goto :goto_0

    :cond_0
    iget v0, p0, Ll6/s2;->e:I

    add-int/2addr v0, v3

    iput v0, p0, Ll6/s2;->e:I

    return-void
.end method

.method private I()V
    .locals 4

    iget-object v0, p0, Ll6/s2;->a:Ll6/z2;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Ll6/s2;->f:Lcom/google/protobuf/i;

    invoke-virtual {v2}, Lcom/google/protobuf/i;->L()[B

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)"

    invoke-virtual {v0, v2, v1}, Ll6/z2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Ll6/s2;Landroid/database/Cursor;)Ln6/g;
    .locals 0

    invoke-direct {p0, p1}, Ll6/s2;->B(Landroid/database/Cursor;)Ln6/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ll6/s2;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1}, Ll6/s2;->D(Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic n(Ll6/s2;Ljava/util/List;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ll6/s2;->x(Ljava/util/List;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic o(Ll6/s2;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1}, Ll6/s2;->G(Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic p(Ll6/s2;Ljava/util/Set;Ljava/util/List;Landroid/database/Cursor;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ll6/s2;->y(Ljava/util/Set;Ljava/util/List;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic q(Ljava/util/List;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Ll6/s2;->F(Ljava/util/List;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic r(Landroid/database/Cursor;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Ll6/s2;->A(Landroid/database/Cursor;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Ljava/util/List;Landroid/database/Cursor;)V
    .locals 0

    invoke-static {p0, p1}, Ll6/s2;->C(Ljava/util/List;Landroid/database/Cursor;)V

    return-void
.end method

.method public static synthetic t(Ln6/g;Ln6/g;)I
    .locals 0

    invoke-static {p0, p1}, Ll6/s2;->z(Ln6/g;Ln6/g;)I

    move-result p0

    return p0
.end method

.method public static synthetic u(Ll6/s2;ILandroid/database/Cursor;)Ln6/g;
    .locals 0

    invoke-direct {p0, p1, p2}, Ll6/s2;->E(ILandroid/database/Cursor;)Ln6/g;

    move-result-object p0

    return-object p0
.end method

.method private v(I[B)Ln6/g;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    array-length v2, p2

    const v3, 0xf4240

    if-ge v2, v3, :cond_0

    iget-object p1, p0, Ll6/s2;->b:Ll6/o;

    invoke-static {p2}, Lo6/e;->v0([B)Lo6/e;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll6/o;->f(Lo6/e;)Ln6/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v2, Ll6/s2$a;

    invoke-direct {v2, p2}, Ll6/s2$a;-><init>([B)V

    :goto_0
    invoke-static {v2}, Ll6/s2$a;->b(Ll6/s2$a;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Ll6/s2$a;->d()I

    move-result p2

    mul-int p2, p2, v3

    add-int/2addr p2, v1

    iget-object v4, p0, Ll6/s2;->a:Ll6/z2;

    const-string v5, "SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?"

    invoke-virtual {v4, v5}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v4

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v5, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v5, v1

    const/4 p2, 0x2

    iget-object v6, p0, Ll6/s2;->d:Ljava/lang/String;

    aput-object v6, v5, p2

    const/4 p2, 0x3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, p2

    invoke-virtual {v4, v5}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object p2

    invoke-virtual {p2, v2}, Ll6/z2$d;->c(Lq6/n;)I

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ll6/s2$a;->e()Lcom/google/protobuf/i;

    move-result-object p1

    iget-object p2, p0, Ll6/s2;->b:Ll6/o;

    invoke-static {p1}, Lo6/e;->u0(Lcom/google/protobuf/i;)Lo6/e;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll6/o;->f(Lo6/e;)Ln6/g;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/protobuf/e0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v0

    const-string p1, "MutationBatch failed to parse: %s"

    invoke-static {p1, p2}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private synthetic x(Ljava/util/List;Landroid/database/Cursor;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p2

    invoke-direct {p0, v0, p2}, Ll6/s2;->v(I[B)Ln6/g;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic y(Ljava/util/Set;Ljava/util/List;Landroid/database/Cursor;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    invoke-interface {p3, p1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ll6/s2;->v(I[B)Ln6/g;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private static synthetic z(Ln6/g;Ln6/g;)I
    .locals 0

    invoke-virtual {p0}, Ln6/g;->e()I

    move-result p0

    invoke-virtual {p1}, Ln6/g;->e()I

    move-result p1

    invoke-static {p0, p1}, Lq6/g0;->l(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public a()V
    .locals 6

    invoke-virtual {p0}, Ll6/s2;->w()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ll6/s2;->a:Ll6/z2;

    const-string v2, "SELECT path FROM document_mutations WHERE uid = ?"

    invoke-virtual {v1, v2}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v3}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v1

    new-instance v3, Ll6/j2;

    invoke-direct {v3, v0}, Ll6/j2;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v3}, Ll6/z2$d;->e(Lq6/n;)I

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v5

    const-string v0, "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s"

    invoke-static {v1, v0, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public b(I)Ln6/g;
    .locals 5

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iget-object v1, p0, Ll6/s2;->a:Ll6/z2;

    const-string v2, "SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1"

    invoke-virtual {v1, v2}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const v3, 0xf4240

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Ll6/s2;->d:Ljava/lang/String;

    aput-object v3, v2, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    aput-object p1, v2, v0

    invoke-virtual {v1, v2}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object p1

    new-instance v0, Ll6/p2;

    invoke-direct {v0, p0}, Ll6/p2;-><init>(Ll6/s2;)V

    invoke-virtual {p1, v0}, Ll6/z2$d;->d(Lq6/t;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln6/g;

    return-object p1
.end method

.method public c()I
    .locals 4

    iget-object v0, p0, Ll6/s2;->a:Ll6/z2;

    const-string v1, "SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?"

    invoke-virtual {v0, v1}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v0

    sget-object v1, Ll6/r2;->a:Ll6/r2;

    invoke-virtual {v0, v1}, Ll6/z2$d;->d(Lq6/t;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public d(Ln6/g;)V
    .locals 10

    iget-object v0, p0, Ll6/s2;->a:Ll6/z2;

    const-string v1, "DELETE FROM mutations WHERE uid = ? AND batch_id = ?"

    invoke-virtual {v0, v1}, Ll6/z2;->D(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    iget-object v1, p0, Ll6/s2;->a:Ll6/z2;

    const-string v2, "DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?"

    invoke-virtual {v1, v2}, Ll6/z2;->D(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v1

    invoke-virtual {p1}, Ln6/g;->e()I

    move-result v2

    iget-object v3, p0, Ll6/s2;->a:Ll6/z2;

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    invoke-virtual {v3, v0, v5}, Ll6/z2;->u(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v3, v4, [Ljava/lang/Object;

    iget-object v5, p0, Ll6/s2;->d:Ljava/lang/String;

    aput-object v5, v3, v7

    invoke-virtual {p1}, Ln6/g;->e()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v8

    const-string v5, "Mutation batch (%s, %d) did not exist"

    invoke-static {v0, v5, v3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln6/g;->h()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/f;

    invoke-virtual {v0}, Ln6/f;->g()Lm6/l;

    move-result-object v0

    invoke-virtual {v0}, Lm6/l;->r()Lm6/u;

    move-result-object v3

    invoke-static {v3}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Ll6/s2;->a:Ll6/z2;

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v9, p0, Ll6/s2;->d:Ljava/lang/String;

    aput-object v9, v6, v7

    aput-object v3, v6, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v6, v4

    invoke-virtual {v5, v1, v6}, Ll6/z2;->u(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)I

    iget-object v3, p0, Ll6/s2;->a:Ll6/z2;

    invoke-virtual {v3}, Ll6/z2;->z()Ll6/h2;

    move-result-object v3

    invoke-virtual {v3, v0}, Ll6/h2;->m(Lm6/l;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public e(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lm6/l;",
            ">;)",
            "Ljava/util/List<",
            "Ln6/g;",
            ">;"
        }
    .end annotation

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm6/l;

    invoke-virtual {v0}, Lm6/l;->r()Lm6/u;

    move-result-object v0

    invoke-static {v0}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ll6/z2$b;

    iget-object v1, p0, Ll6/s2;->a:Ll6/z2;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const v3, 0xf4240

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    iget-object v2, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v6, 0x1

    aput-object v2, v0, v6

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v2, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN ("

    const-string v5, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll6/z2$b;-><init>(Ll6/z2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :goto_1
    invoke-virtual {p1}, Ll6/z2$b;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ll6/z2$b;->e()Ll6/z2$d;

    move-result-object v2

    new-instance v3, Ll6/o2;

    invoke-direct {v3, p0, v1, v0}, Ll6/o2;-><init>(Ll6/s2;Ljava/util/Set;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Ll6/z2$d;->e(Lq6/n;)I

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ll6/z2$b;->c()I

    move-result p1

    if-le p1, v6, :cond_2

    sget-object p1, Ll6/i2;->j:Ll6/i2;

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_2
    return-object v0
.end method

.method public f(Ln6/g;Lcom/google/protobuf/i;)V
    .locals 0

    invoke-static {p2}, Lq6/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/i;

    iput-object p1, p0, Ll6/s2;->f:Lcom/google/protobuf/i;

    invoke-direct {p0}, Ll6/s2;->I()V

    return-void
.end method

.method public g(I)Ln6/g;
    .locals 4

    iget-object v0, p0, Ll6/s2;->a:Ll6/z2;

    const-string v1, "SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?"

    invoke-virtual {v0, v1}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0xf4240

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v0

    new-instance v1, Ll6/q2;

    invoke-direct {v1, p0, p1}, Ll6/q2;-><init>(Ll6/s2;I)V

    invoke-virtual {v0, v1}, Ll6/z2$d;->d(Lq6/t;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln6/g;

    return-object p1
.end method

.method public h(Lw5/q;Ljava/util/List;Ljava/util/List;)Ln6/g;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/q;",
            "Ljava/util/List<",
            "Ln6/f;",
            ">;",
            "Ljava/util/List<",
            "Ln6/f;",
            ">;)",
            "Ln6/g;"
        }
    .end annotation

    iget v0, p0, Ll6/s2;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll6/s2;->e:I

    new-instance v1, Ln6/g;

    invoke-direct {v1, v0, p1, p2, p3}, Ln6/g;-><init>(ILw5/q;Ljava/util/List;Ljava/util/List;)V

    iget-object p1, p0, Ll6/s2;->b:Ll6/o;

    invoke-virtual {p1, v1}, Ll6/o;->o(Ln6/g;)Lo6/e;

    move-result-object p1

    iget-object p2, p0, Ll6/s2;->a:Ll6/z2;

    const/4 v2, 0x3

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-interface {p1}, Lcom/google/protobuf/v0;->f()[B

    move-result-object p1

    const/4 v4, 0x2

    aput-object p1, v3, v4

    const-string p1, "INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)"

    invoke-virtual {p2, p1, v3}, Ll6/z2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iget-object p2, p0, Ll6/s2;->a:Ll6/z2;

    const-string v3, "INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)"

    invoke-virtual {p2, v3}, Ll6/z2;->D(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p2

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/f;

    invoke-virtual {v3}, Ln6/f;->g()Lm6/l;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lm6/l;->r()Lm6/u;

    move-result-object v7

    invoke-static {v7}, Ll6/f;->c(Lm6/e;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Ll6/s2;->a:Ll6/z2;

    new-array v9, v2, [Ljava/lang/Object;

    iget-object v10, p0, Ll6/s2;->d:Ljava/lang/String;

    aput-object v10, v9, v5

    aput-object v7, v9, v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v9, v4

    invoke-virtual {v8, p2, v9}, Ll6/z2;->u(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)I

    iget-object v7, p0, Ll6/s2;->c:Ll6/l;

    invoke-virtual {v3}, Lm6/l;->p()Lm6/u;

    move-result-object v3

    invoke-interface {v7, v3}, Ll6/l;->g(Lm6/u;)V

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public i()Lcom/google/protobuf/i;
    .locals 1

    iget-object v0, p0, Ll6/s2;->f:Lcom/google/protobuf/i;

    return-object v0
.end method

.method public j(Lcom/google/protobuf/i;)V
    .locals 0

    invoke-static {p1}, Lq6/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/i;

    iput-object p1, p0, Ll6/s2;->f:Lcom/google/protobuf/i;

    invoke-direct {p0}, Ll6/s2;->I()V

    return-void
.end method

.method public k()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln6/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ll6/s2;->a:Ll6/z2;

    const-string v2, "SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC"

    invoke-virtual {v1, v2}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const v3, 0xf4240

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v1

    new-instance v2, Ll6/n2;

    invoke-direct {v2, p0, v0}, Ll6/n2;-><init>(Ll6/s2;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Ll6/z2$d;->e(Lq6/n;)I

    return-object v0
.end method

.method public start()V
    .locals 4

    invoke-direct {p0}, Ll6/s2;->H()V

    iget-object v0, p0, Ll6/s2;->a:Ll6/z2;

    const-string v1, "SELECT last_stream_token FROM mutation_queues WHERE uid = ?"

    invoke-virtual {v0, v1}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v0

    new-instance v1, Ll6/m2;

    invoke-direct {v1, p0}, Ll6/m2;-><init>(Ll6/s2;)V

    invoke-virtual {v0, v1}, Ll6/z2$d;->c(Lq6/n;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll6/s2;->I()V

    :cond_0
    return-void
.end method

.method public w()Z
    .locals 4

    iget-object v0, p0, Ll6/s2;->a:Ll6/z2;

    const-string v1, "SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1"

    invoke-virtual {v0, v1}, Ll6/z2;->E(Ljava/lang/String;)Ll6/z2$d;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Ll6/s2;->d:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Ll6/z2$d;->b([Ljava/lang/Object;)Ll6/z2$d;

    move-result-object v0

    invoke-virtual {v0}, Ll6/z2$d;->f()Z

    move-result v0

    return v0
.end method
