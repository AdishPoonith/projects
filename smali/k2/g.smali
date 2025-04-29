.class public final Lk2/g;
.super Ls1/f;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final A:Z

.field private B:Lk2/c;

.field private C:Z

.field private D:Z

.field private E:J

.field private F:Lk2/a;

.field private G:J

.field private final w:Lk2/d;

.field private final x:Lk2/f;

.field private final y:Landroid/os/Handler;

.field private final z:Lk2/e;


# direct methods
.method public constructor <init>(Lk2/f;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Lk2/d;->a:Lk2/d;

    invoke-direct {p0, p1, p2, v0}, Lk2/g;-><init>(Lk2/f;Landroid/os/Looper;Lk2/d;)V

    return-void
.end method

.method public constructor <init>(Lk2/f;Landroid/os/Looper;Lk2/d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lk2/g;-><init>(Lk2/f;Landroid/os/Looper;Lk2/d;Z)V

    return-void
.end method

.method public constructor <init>(Lk2/f;Landroid/os/Looper;Lk2/d;Z)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Ls1/f;-><init>(I)V

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk2/f;

    iput-object p1, p0, Lk2/g;->x:Lk2/f;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lp3/n0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lk2/g;->y:Landroid/os/Handler;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk2/d;

    iput-object p1, p0, Lk2/g;->w:Lk2/d;

    iput-boolean p4, p0, Lk2/g;->A:Z

    new-instance p1, Lk2/e;

    invoke-direct {p1}, Lk2/e;-><init>()V

    iput-object p1, p0, Lk2/g;->z:Lk2/e;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lk2/g;->G:J

    return-void
.end method

.method private R(Lk2/a;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/a;",
            "Ljava/util/List<",
            "Lk2/a$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lk2/a;->e()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Lk2/a;->d(I)Lk2/a$b;

    move-result-object v1

    invoke-interface {v1}, Lk2/a$b;->n()Ls1/n1;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lk2/g;->w:Lk2/d;

    invoke-interface {v2, v1}, Lk2/d;->a(Ls1/n1;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lk2/g;->w:Lk2/d;

    invoke-interface {v2, v1}, Lk2/d;->b(Ls1/n1;)Lk2/c;

    move-result-object v1

    invoke-virtual {p1, v0}, Lk2/a;->d(I)Lk2/a$b;

    move-result-object v2

    invoke-interface {v2}, Lk2/a$b;->w()[B

    move-result-object v2

    invoke-static {v2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v3, p0, Lk2/g;->z:Lk2/e;

    invoke-virtual {v3}, Lv1/g;->l()V

    iget-object v3, p0, Lk2/g;->z:Lk2/e;

    array-length v4, v2

    invoke-virtual {v3, v4}, Lv1/g;->x(I)V

    iget-object v3, p0, Lk2/g;->z:Lk2/e;

    iget-object v3, v3, Lv1/g;->l:Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lk2/g;->z:Lk2/e;

    invoke-virtual {v2}, Lv1/g;->y()V

    iget-object v2, p0, Lk2/g;->z:Lk2/e;

    invoke-interface {v1, v2}, Lk2/c;->a(Lk2/e;)Lk2/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v1, p2}, Lk2/g;->R(Lk2/a;Ljava/util/List;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, Lk2/a;->d(I)Lk2/a$b;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private S(J)J
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p1, v2

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Lp3/a;->f(Z)V

    iget-wide v4, p0, Lk2/g;->G:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-wide v0, p0, Lk2/g;->G:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method private T(Lk2/a;)V
    .locals 2

    iget-object v0, p0, Lk2/g;->y:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lk2/g;->U(Lk2/a;)V

    :goto_0
    return-void
.end method

.method private U(Lk2/a;)V
    .locals 1

    iget-object v0, p0, Lk2/g;->x:Lk2/f;

    invoke-interface {v0, p1}, Lk2/f;->x(Lk2/a;)V

    return-void
.end method

.method private V(J)Z
    .locals 4

    iget-object v0, p0, Lk2/g;->F:Lk2/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v2, p0, Lk2/g;->A:Z

    if-nez v2, :cond_0

    iget-wide v2, v0, Lk2/a;->k:J

    invoke-direct {p0, p1, p2}, Lk2/g;->S(J)J

    move-result-wide p1

    cmp-long v0, v2, p1

    if-gtz v0, :cond_1

    :cond_0
    iget-object p1, p0, Lk2/g;->F:Lk2/a;

    invoke-direct {p0, p1}, Lk2/g;->T(Lk2/a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lk2/g;->F:Lk2/a;

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-boolean p2, p0, Lk2/g;->C:Z

    if-eqz p2, :cond_2

    iget-object p2, p0, Lk2/g;->F:Lk2/a;

    if-nez p2, :cond_2

    iput-boolean v1, p0, Lk2/g;->D:Z

    :cond_2
    return p1
.end method

.method private W()V
    .locals 4

    iget-boolean v0, p0, Lk2/g;->C:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lk2/g;->F:Lk2/a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lk2/g;->z:Lk2/e;

    invoke-virtual {v0}, Lv1/g;->l()V

    invoke-virtual {p0}, Ls1/f;->C()Ls1/o1;

    move-result-object v0

    iget-object v1, p0, Lk2/g;->z:Lk2/e;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Ls1/f;->O(Ls1/o1;Lv1/g;I)I

    move-result v1

    const/4 v2, -0x4

    if-ne v1, v2, :cond_1

    iget-object v0, p0, Lk2/g;->z:Lk2/e;

    invoke-virtual {v0}, Lv1/a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk2/g;->C:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk2/g;->z:Lk2/e;

    iget-wide v1, p0, Lk2/g;->E:J

    iput-wide v1, v0, Lk2/e;->r:J

    invoke-virtual {v0}, Lv1/g;->y()V

    iget-object v0, p0, Lk2/g;->B:Lk2/c;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk2/c;

    iget-object v1, p0, Lk2/g;->z:Lk2/e;

    invoke-interface {v0, v1}, Lk2/c;->a(Lk2/e;)Lk2/a;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lk2/a;->e()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0, v1}, Lk2/g;->R(Lk2/a;Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lk2/a;

    iget-object v2, p0, Lk2/g;->z:Lk2/e;

    iget-wide v2, v2, Lv1/g;->n:J

    invoke-direct {p0, v2, v3}, Lk2/g;->S(J)J

    move-result-wide v2

    invoke-direct {v0, v2, v3, v1}, Lk2/a;-><init>(JLjava/util/List;)V

    iput-object v0, p0, Lk2/g;->F:Lk2/a;

    goto :goto_0

    :cond_1
    const/4 v2, -0x5

    if-ne v1, v2, :cond_2

    iget-object v0, v0, Ls1/o1;->b:Ls1/n1;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/n1;

    iget-wide v0, v0, Ls1/n1;->y:J

    iput-wide v0, p0, Lk2/g;->E:J

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method protected H()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lk2/g;->F:Lk2/a;

    iput-object v0, p0, Lk2/g;->B:Lk2/c;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lk2/g;->G:J

    return-void
.end method

.method protected J(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lk2/g;->F:Lk2/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk2/g;->C:Z

    iput-boolean p1, p0, Lk2/g;->D:Z

    return-void
.end method

.method protected N([Ls1/n1;JJ)V
    .locals 2

    iget-object p2, p0, Lk2/g;->w:Lk2/d;

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-interface {p2, p1}, Lk2/d;->b(Ls1/n1;)Lk2/c;

    move-result-object p1

    iput-object p1, p0, Lk2/g;->B:Lk2/c;

    iget-object p1, p0, Lk2/g;->F:Lk2/a;

    if-eqz p1, :cond_0

    iget-wide p2, p1, Lk2/a;->k:J

    iget-wide v0, p0, Lk2/g;->G:J

    add-long/2addr p2, v0

    sub-long/2addr p2, p4

    invoke-virtual {p1, p2, p3}, Lk2/a;->c(J)Lk2/a;

    move-result-object p1

    iput-object p1, p0, Lk2/g;->F:Lk2/a;

    :cond_0
    iput-wide p4, p0, Lk2/g;->G:J

    return-void
.end method

.method public a(Ls1/n1;)I
    .locals 1

    iget-object v0, p0, Lk2/g;->w:Lk2/d;

    invoke-interface {v0, p1}, Lk2/d;->a(Ls1/n1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Ls1/n1;->P:I

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-static {p1}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    invoke-static {p1}, Ls1/m3;->a(I)I

    move-result p1

    return p1
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lk2/g;->D:Z

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "MetadataRenderer"

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lk2/a;

    invoke-direct {p0, p1}, Lk2/g;->U(Lk2/a;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public l(JJ)V
    .locals 0

    const/4 p3, 0x1

    :goto_0
    if-eqz p3, :cond_0

    invoke-direct {p0}, Lk2/g;->W()V

    invoke-direct {p0, p1, p2}, Lk2/g;->V(J)Z

    move-result p3

    goto :goto_0

    :cond_0
    return-void
.end method
