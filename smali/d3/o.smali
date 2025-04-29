.class public final Ld3/o;
.super Ls1/f;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:I

.field private E:Ls1/n1;

.field private F:Ld3/i;

.field private G:Ld3/l;

.field private H:Ld3/m;

.field private I:Ld3/m;

.field private J:I

.field private K:J

.field private L:J

.field private M:J

.field private final w:Landroid/os/Handler;

.field private final x:Ld3/n;

.field private final y:Ld3/k;

.field private final z:Ls1/o1;


# direct methods
.method public constructor <init>(Ld3/n;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Ld3/k;->a:Ld3/k;

    invoke-direct {p0, p1, p2, v0}, Ld3/o;-><init>(Ld3/n;Landroid/os/Looper;Ld3/k;)V

    return-void
.end method

.method public constructor <init>(Ld3/n;Landroid/os/Looper;Ld3/k;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Ls1/f;-><init>(I)V

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/n;

    iput-object p1, p0, Ld3/o;->x:Ld3/n;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lp3/n0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ld3/o;->w:Landroid/os/Handler;

    iput-object p3, p0, Ld3/o;->y:Ld3/k;

    new-instance p1, Ls1/o1;

    invoke-direct {p1}, Ls1/o1;-><init>()V

    iput-object p1, p0, Ld3/o;->z:Ls1/o1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ld3/o;->K:J

    iput-wide p1, p0, Ld3/o;->L:J

    iput-wide p1, p0, Ld3/o;->M:J

    return-void
.end method

.method private R()V
    .locals 4

    new-instance v0, Ld3/e;

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v1

    iget-wide v2, p0, Ld3/o;->M:J

    invoke-direct {p0, v2, v3}, Ld3/o;->U(J)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Ld3/e;-><init>(Ljava/util/List;J)V

    invoke-direct {p0, v0}, Ld3/o;->c0(Ld3/e;)V

    return-void
.end method

.method private S(J)J
    .locals 1

    iget-object v0, p0, Ld3/o;->H:Ld3/m;

    invoke-virtual {v0, p1, p2}, Ld3/m;->b(J)I

    move-result p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Ld3/o;->H:Ld3/m;

    invoke-virtual {p2}, Ld3/m;->i()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Ld3/o;->H:Ld3/m;

    invoke-virtual {p1}, Ld3/m;->i()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Ld3/m;->g(I)J

    move-result-wide p1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ld3/o;->H:Ld3/m;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Ld3/m;->g(I)J

    move-result-wide p1

    :goto_0
    return-wide p1

    :cond_2
    :goto_1
    iget-object p1, p0, Ld3/o;->H:Ld3/m;

    iget-wide p1, p1, Lv1/h;->k:J

    return-wide p1
.end method

.method private T()J
    .locals 4

    iget v0, p0, Ld3/o;->J:I

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Ld3/o;->H:Ld3/m;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Ld3/o;->J:I

    iget-object v3, p0, Ld3/o;->H:Ld3/m;

    invoke-virtual {v3}, Ld3/m;->i()I

    move-result v3

    if-lt v0, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld3/o;->H:Ld3/m;

    iget v1, p0, Ld3/o;->J:I

    invoke-virtual {v0, v1}, Ld3/m;->g(I)J

    move-result-wide v1

    :goto_0
    return-wide v1
.end method

.method private U(J)J
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

    iget-wide v4, p0, Ld3/o;->L:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-wide v0, p0, Ld3/o;->L:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method private V(Ld3/j;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subtitle decoding failed. streamFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld3/o;->E:Ls1/n1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TextRenderer"

    invoke-static {v1, v0, p1}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Ld3/o;->R()V

    invoke-direct {p0}, Ld3/o;->a0()V

    return-void
.end method

.method private W()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld3/o;->C:Z

    iget-object v0, p0, Ld3/o;->y:Ld3/k;

    iget-object v1, p0, Ld3/o;->E:Ls1/n1;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/n1;

    invoke-interface {v0, v1}, Ld3/k;->b(Ls1/n1;)Ld3/i;

    move-result-object v0

    iput-object v0, p0, Ld3/o;->F:Ld3/i;

    return-void
.end method

.method private X(Ld3/e;)V
    .locals 2

    iget-object v0, p0, Ld3/o;->x:Ld3/n;

    iget-object v1, p1, Ld3/e;->j:Lcom/google/common/collect/q;

    invoke-interface {v0, v1}, Ld3/n;->i(Ljava/util/List;)V

    iget-object v0, p0, Ld3/o;->x:Ld3/n;

    invoke-interface {v0, p1}, Ld3/n;->d(Ld3/e;)V

    return-void
.end method

.method private Y()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ld3/o;->G:Ld3/l;

    const/4 v1, -0x1

    iput v1, p0, Ld3/o;->J:I

    iget-object v1, p0, Ld3/o;->H:Ld3/m;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lv1/h;->w()V

    iput-object v0, p0, Ld3/o;->H:Ld3/m;

    :cond_0
    iget-object v1, p0, Ld3/o;->I:Ld3/m;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lv1/h;->w()V

    iput-object v0, p0, Ld3/o;->I:Ld3/m;

    :cond_1
    return-void
.end method

.method private Z()V
    .locals 1

    invoke-direct {p0}, Ld3/o;->Y()V

    iget-object v0, p0, Ld3/o;->F:Ld3/i;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/i;

    invoke-interface {v0}, Lv1/d;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld3/o;->F:Ld3/i;

    const/4 v0, 0x0

    iput v0, p0, Ld3/o;->D:I

    return-void
.end method

.method private a0()V
    .locals 0

    invoke-direct {p0}, Ld3/o;->Z()V

    invoke-direct {p0}, Ld3/o;->W()V

    return-void
.end method

.method private c0(Ld3/e;)V
    .locals 2

    iget-object v0, p0, Ld3/o;->w:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Ld3/o;->X(Ld3/e;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected H()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ld3/o;->E:Ls1/n1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ld3/o;->K:J

    invoke-direct {p0}, Ld3/o;->R()V

    iput-wide v0, p0, Ld3/o;->L:J

    iput-wide v0, p0, Ld3/o;->M:J

    invoke-direct {p0}, Ld3/o;->Z()V

    return-void
.end method

.method protected J(JZ)V
    .locals 0

    iput-wide p1, p0, Ld3/o;->M:J

    invoke-direct {p0}, Ld3/o;->R()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld3/o;->A:Z

    iput-boolean p1, p0, Ld3/o;->B:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ld3/o;->K:J

    iget p1, p0, Ld3/o;->D:I

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ld3/o;->a0()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Ld3/o;->Y()V

    iget-object p1, p0, Ld3/o;->F:Ld3/i;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/i;

    invoke-interface {p1}, Lv1/d;->flush()V

    :goto_0
    return-void
.end method

.method protected N([Ls1/n1;JJ)V
    .locals 0

    iput-wide p4, p0, Ld3/o;->L:J

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Ld3/o;->E:Ls1/n1;

    iget-object p1, p0, Ld3/o;->F:Ld3/i;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Ld3/o;->D:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Ld3/o;->W()V

    :goto_0
    return-void
.end method

.method public a(Ls1/n1;)I
    .locals 1

    iget-object v0, p0, Ld3/o;->y:Ld3/k;

    invoke-interface {v0, p1}, Ld3/k;->a(Ls1/n1;)Z

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
    iget-object p1, p1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {p1}, Lp3/v;->r(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    goto :goto_1
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ld3/o;->B:Z

    return v0
.end method

.method public b0(J)V
    .locals 1

    invoke-virtual {p0}, Ls1/f;->t()Z

    move-result v0

    invoke-static {v0}, Lp3/a;->f(Z)V

    iput-wide p1, p0, Ld3/o;->K:J

    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ld3/e;

    invoke-direct {p0, p1}, Ld3/o;->X(Ld3/e;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public l(JJ)V
    .locals 8

    iput-wide p1, p0, Ld3/o;->M:J

    invoke-virtual {p0}, Ls1/f;->t()Z

    move-result p3

    const/4 p4, 0x1

    if-eqz p3, :cond_0

    iget-wide v0, p0, Ld3/o;->K:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    invoke-direct {p0}, Ld3/o;->Y()V

    iput-boolean p4, p0, Ld3/o;->B:Z

    :cond_0
    iget-boolean p3, p0, Ld3/o;->B:Z

    if-eqz p3, :cond_1

    return-void

    :cond_1
    iget-object p3, p0, Ld3/o;->I:Ld3/m;

    if-nez p3, :cond_2

    iget-object p3, p0, Ld3/o;->F:Ld3/i;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld3/i;

    invoke-interface {p3, p1, p2}, Ld3/i;->b(J)V

    :try_start_0
    iget-object p3, p0, Ld3/o;->F:Ld3/i;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld3/i;

    invoke-interface {p3}, Lv1/d;->d()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld3/m;

    iput-object p3, p0, Ld3/o;->I:Ld3/m;
    :try_end_0
    .catch Ld3/j; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Ld3/o;->V(Ld3/j;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Ls1/f;->getState()I

    move-result p3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    return-void

    :cond_3
    iget-object p3, p0, Ld3/o;->H:Ld3/m;

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    invoke-direct {p0}, Ld3/o;->T()J

    move-result-wide v2

    const/4 p3, 0x0

    :goto_1
    cmp-long v4, v2, p1

    if-gtz v4, :cond_5

    iget p3, p0, Ld3/o;->J:I

    add-int/2addr p3, p4

    iput p3, p0, Ld3/o;->J:I

    invoke-direct {p0}, Ld3/o;->T()J

    move-result-wide v2

    const/4 p3, 0x1

    goto :goto_1

    :cond_4
    const/4 p3, 0x0

    :cond_5
    iget-object v2, p0, Ld3/o;->I:Ld3/m;

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lv1/a;->r()Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez p3, :cond_9

    invoke-direct {p0}, Ld3/o;->T()J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v4, v6

    if-nez v2, :cond_9

    iget v2, p0, Ld3/o;->D:I

    if-ne v2, v0, :cond_6

    invoke-direct {p0}, Ld3/o;->a0()V

    goto :goto_2

    :cond_6
    invoke-direct {p0}, Ld3/o;->Y()V

    iput-boolean p4, p0, Ld3/o;->B:Z

    goto :goto_2

    :cond_7
    iget-wide v4, v2, Lv1/h;->k:J

    cmp-long v6, v4, p1

    if-gtz v6, :cond_9

    iget-object p3, p0, Ld3/o;->H:Ld3/m;

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Lv1/h;->w()V

    :cond_8
    invoke-virtual {v2, p1, p2}, Ld3/m;->b(J)I

    move-result p3

    iput p3, p0, Ld3/o;->J:I

    iput-object v2, p0, Ld3/o;->H:Ld3/m;

    iput-object v3, p0, Ld3/o;->I:Ld3/m;

    const/4 p3, 0x1

    :cond_9
    :goto_2
    if-eqz p3, :cond_a

    iget-object p3, p0, Ld3/o;->H:Ld3/m;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Ld3/o;->S(J)J

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Ld3/o;->U(J)J

    move-result-wide v4

    new-instance p3, Ld3/e;

    iget-object v2, p0, Ld3/o;->H:Ld3/m;

    invoke-virtual {v2, p1, p2}, Ld3/m;->h(J)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p1, v4, v5}, Ld3/e;-><init>(Ljava/util/List;J)V

    invoke-direct {p0, p3}, Ld3/o;->c0(Ld3/e;)V

    :cond_a
    iget p1, p0, Ld3/o;->D:I

    if-ne p1, v0, :cond_b

    return-void

    :cond_b
    :goto_3
    :try_start_1
    iget-boolean p1, p0, Ld3/o;->A:Z

    if-nez p1, :cond_13

    iget-object p1, p0, Ld3/o;->G:Ld3/l;

    if-nez p1, :cond_d

    iget-object p1, p0, Ld3/o;->F:Ld3/i;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/i;

    invoke-interface {p1}, Lv1/d;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/l;

    if-nez p1, :cond_c

    return-void

    :cond_c
    iput-object p1, p0, Ld3/o;->G:Ld3/l;

    :cond_d
    iget p2, p0, Ld3/o;->D:I

    if-ne p2, p4, :cond_e

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Lv1/a;->v(I)V

    iget-object p2, p0, Ld3/o;->F:Ld3/i;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld3/i;

    invoke-interface {p2, p1}, Lv1/d;->c(Ljava/lang/Object;)V

    iput-object v3, p0, Ld3/o;->G:Ld3/l;

    iput v0, p0, Ld3/o;->D:I

    return-void

    :cond_e
    iget-object p2, p0, Ld3/o;->z:Ls1/o1;

    invoke-virtual {p0, p2, p1, v1}, Ls1/f;->O(Ls1/o1;Lv1/g;I)I

    move-result p2

    const/4 p3, -0x4

    if-ne p2, p3, :cond_12

    invoke-virtual {p1}, Lv1/a;->r()Z

    move-result p2

    if-eqz p2, :cond_f

    iput-boolean p4, p0, Ld3/o;->A:Z

    iput-boolean v1, p0, Ld3/o;->C:Z

    goto :goto_5

    :cond_f
    iget-object p2, p0, Ld3/o;->z:Ls1/o1;

    iget-object p2, p2, Ls1/o1;->b:Ls1/n1;

    if-nez p2, :cond_10

    return-void

    :cond_10
    iget-wide p2, p2, Ls1/n1;->y:J

    iput-wide p2, p1, Ld3/l;->r:J

    invoke-virtual {p1}, Lv1/g;->y()V

    iget-boolean p2, p0, Ld3/o;->C:Z

    invoke-virtual {p1}, Lv1/a;->t()Z

    move-result p3

    if-nez p3, :cond_11

    const/4 p3, 0x1

    goto :goto_4

    :cond_11
    const/4 p3, 0x0

    :goto_4
    and-int/2addr p2, p3

    iput-boolean p2, p0, Ld3/o;->C:Z

    :goto_5
    iget-boolean p2, p0, Ld3/o;->C:Z

    if-nez p2, :cond_b

    iget-object p2, p0, Ld3/o;->F:Ld3/i;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld3/i;

    invoke-interface {p2, p1}, Lv1/d;->c(Ljava/lang/Object;)V

    iput-object v3, p0, Ld3/o;->G:Ld3/l;
    :try_end_1
    .catch Ld3/j; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_12
    const/4 p1, -0x3

    if-ne p2, p1, :cond_b

    return-void

    :catch_1
    move-exception p1

    invoke-direct {p0, p1}, Ld3/o;->V(Ld3/j;)V

    :cond_13
    return-void
.end method
