.class public final Lu2/p;
.super Lu2/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/p$b;,
        Lu2/p$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private final v:Z

.field private final w:Ls1/y3$d;

.field private final x:Ls1/y3$b;

.field private y:Lu2/p$a;

.field private z:Lu2/o;


# direct methods
.method public constructor <init>(Lu2/u;Z)V
    .locals 1

    invoke-direct {p0, p1}, Lu2/x0;-><init>(Lu2/u;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lu2/u;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lu2/p;->v:Z

    new-instance p2, Ls1/y3$d;

    invoke-direct {p2}, Ls1/y3$d;-><init>()V

    iput-object p2, p0, Lu2/p;->w:Ls1/y3$d;

    new-instance p2, Ls1/y3$b;

    invoke-direct {p2}, Ls1/y3$b;-><init>()V

    iput-object p2, p0, Lu2/p;->x:Ls1/y3$b;

    invoke-interface {p1}, Lu2/u;->j()Ls1/y3;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p1, p1}, Lu2/p$a;->z(Ls1/y3;Ljava/lang/Object;Ljava/lang/Object;)Lu2/p$a;

    move-result-object p1

    iput-object p1, p0, Lu2/p;->y:Lu2/p$a;

    iput-boolean v0, p0, Lu2/p;->C:Z

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lu2/u;->a()Ls1/v1;

    move-result-object p1

    invoke-static {p1}, Lu2/p$a;->y(Ls1/v1;)Lu2/p$a;

    move-result-object p1

    iput-object p1, p0, Lu2/p;->y:Lu2/p$a;

    :goto_1
    return-void
.end method

.method private X(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu2/p;->y:Lu2/p$a;

    invoke-static {v0}, Lu2/p$a;->w(Lu2/p$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu2/p;->y:Lu2/p$a;

    invoke-static {v0}, Lu2/p$a;->w(Lu2/p$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lu2/p$a;->r:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method private Y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu2/p;->y:Lu2/p$a;

    invoke-static {v0}, Lu2/p$a;->w(Lu2/p$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lu2/p$a;->r:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lu2/p;->y:Lu2/p$a;

    invoke-static {p1}, Lu2/p$a;->w(Lu2/p$a;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private a0(J)V
    .locals 6

    iget-object v0, p0, Lu2/p;->z:Lu2/o;

    iget-object v1, p0, Lu2/p;->y:Lu2/p$a;

    iget-object v2, v0, Lu2/o;->j:Lu2/u$b;

    iget-object v2, v2, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lu2/p$a;->f(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lu2/p;->y:Lu2/p$a;

    iget-object v3, p0, Lu2/p;->x:Ls1/y3$b;

    invoke-virtual {v2, v1, v3}, Ls1/y3;->j(ILs1/y3$b;)Ls1/y3$b;

    move-result-object v1

    iget-wide v1, v1, Ls1/y3$b;->m:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x0

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    :cond_1
    invoke-virtual {v0, p1, p2}, Lu2/o;->w(J)V

    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu2/p;->B:Z

    iput-boolean v0, p0, Lu2/p;->A:Z

    invoke-super {p0}, Lu2/f;->E()V

    return-void
.end method

.method protected N(Lu2/u$b;)Lu2/u$b;
    .locals 1

    iget-object v0, p1, Lu2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lu2/p;->X(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lu2/u$b;->c(Ljava/lang/Object;)Lu2/u$b;

    move-result-object p1

    return-object p1
.end method

.method protected T(Ls1/y3;)V
    .locals 14

    iget-boolean v0, p0, Lu2/p;->B:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu2/p;->y:Lu2/p$a;

    invoke-virtual {v0, p1}, Lu2/p$a;->x(Ls1/y3;)Lu2/p$a;

    move-result-object p1

    iput-object p1, p0, Lu2/p;->y:Lu2/p$a;

    iget-object p1, p0, Lu2/p;->z:Lu2/o;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lu2/o;->o()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lu2/p;->a0(J)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Ls1/y3;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lu2/p;->C:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu2/p;->y:Lu2/p$a;

    invoke-virtual {v0, p1}, Lu2/p$a;->x(Ls1/y3;)Lu2/p$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Ls1/y3$d;->A:Ljava/lang/Object;

    sget-object v1, Lu2/p$a;->r:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lu2/p$a;->z(Ls1/y3;Ljava/lang/Object;Ljava/lang/Object;)Lu2/p$a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lu2/p;->y:Lu2/p$a;

    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lu2/p;->w:Ls1/y3$d;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ls1/y3;->r(ILs1/y3$d;)Ls1/y3$d;

    iget-object v0, p0, Lu2/p;->w:Ls1/y3$d;

    invoke-virtual {v0}, Ls1/y3$d;->e()J

    move-result-wide v2

    iget-object v0, p0, Lu2/p;->w:Ls1/y3$d;

    iget-object v0, v0, Ls1/y3$d;->j:Ljava/lang/Object;

    iget-object v4, p0, Lu2/p;->z:Lu2/o;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lu2/o;->t()J

    move-result-wide v4

    iget-object v6, p0, Lu2/p;->y:Lu2/p$a;

    iget-object v7, p0, Lu2/p;->z:Lu2/o;

    iget-object v7, v7, Lu2/o;->j:Lu2/u$b;

    iget-object v7, v7, Lu2/s;->a:Ljava/lang/Object;

    iget-object v8, p0, Lu2/p;->x:Ls1/y3$b;

    invoke-virtual {v6, v7, v8}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    iget-object v6, p0, Lu2/p;->x:Ls1/y3$b;

    invoke-virtual {v6}, Ls1/y3$b;->q()J

    move-result-wide v6

    add-long/2addr v6, v4

    iget-object v4, p0, Lu2/p;->y:Lu2/p$a;

    iget-object v5, p0, Lu2/p;->w:Ls1/y3$d;

    invoke-virtual {v4, v1, v5}, Ls1/y3;->r(ILs1/y3$d;)Ls1/y3$d;

    move-result-object v1

    invoke-virtual {v1}, Ls1/y3$d;->e()J

    move-result-wide v4

    cmp-long v1, v6, v4

    if-eqz v1, :cond_3

    move-wide v12, v6

    goto :goto_1

    :cond_3
    move-wide v12, v2

    :goto_1
    iget-object v9, p0, Lu2/p;->w:Ls1/y3$d;

    iget-object v10, p0, Lu2/p;->x:Ls1/y3$b;

    const/4 v11, 0x0

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Ls1/y3;->n(Ls1/y3$d;Ls1/y3$b;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-boolean v1, p0, Lu2/p;->C:Z

    if-eqz v1, :cond_4

    iget-object v0, p0, Lu2/p;->y:Lu2/p$a;

    invoke-virtual {v0, p1}, Lu2/p$a;->x(Ls1/y3;)Lu2/p$a;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1, v0, v2}, Lu2/p$a;->z(Ls1/y3;Ljava/lang/Object;Ljava/lang/Object;)Lu2/p$a;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lu2/p;->y:Lu2/p$a;

    iget-object p1, p0, Lu2/p;->z:Lu2/o;

    if-eqz p1, :cond_5

    invoke-direct {p0, v3, v4}, Lu2/p;->a0(J)V

    iget-object p1, p1, Lu2/o;->j:Lu2/u$b;

    iget-object v0, p1, Lu2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lu2/p;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lu2/u$b;->c(Ljava/lang/Object;)Lu2/u$b;

    move-result-object p1

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p1, 0x0

    :goto_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu2/p;->C:Z

    iput-boolean v0, p0, Lu2/p;->B:Z

    iget-object v0, p0, Lu2/p;->y:Lu2/p$a;

    invoke-virtual {p0, v0}, Lu2/a;->D(Ls1/y3;)V

    if-eqz p1, :cond_6

    iget-object v0, p0, Lu2/p;->z:Lu2/o;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/o;

    invoke-virtual {v0, p1}, Lu2/o;->d(Lu2/u$b;)V

    :cond_6
    return-void
.end method

.method public V()V
    .locals 1

    iget-boolean v0, p0, Lu2/p;->v:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu2/p;->A:Z

    invoke-virtual {p0}, Lu2/x0;->U()V

    :cond_0
    return-void
.end method

.method public W(Lu2/u$b;Lo3/b;J)Lu2/o;
    .locals 1

    new-instance v0, Lu2/o;

    invoke-direct {v0, p1, p2, p3, p4}, Lu2/o;-><init>(Lu2/u$b;Lo3/b;J)V

    iget-object p2, p0, Lu2/x0;->t:Lu2/u;

    invoke-virtual {v0, p2}, Lu2/o;->y(Lu2/u;)V

    iget-boolean p2, p0, Lu2/p;->B:Z

    if-eqz p2, :cond_0

    iget-object p2, p1, Lu2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lu2/p;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lu2/u$b;->c(Ljava/lang/Object;)Lu2/u$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu2/o;->d(Lu2/u$b;)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lu2/p;->z:Lu2/o;

    iget-boolean p1, p0, Lu2/p;->A:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu2/p;->A:Z

    invoke-virtual {p0}, Lu2/x0;->U()V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public Z()Ls1/y3;
    .locals 1

    iget-object v0, p0, Lu2/p;->y:Lu2/p$a;

    return-object v0
.end method

.method public b(Lu2/r;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lu2/o;

    invoke-virtual {v0}, Lu2/o;->x()V

    iget-object v0, p0, Lu2/p;->z:Lu2/o;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lu2/p;->z:Lu2/o;

    :cond_0
    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public bridge synthetic n(Lu2/u$b;Lo3/b;J)Lu2/r;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lu2/p;->W(Lu2/u$b;Lo3/b;J)Lu2/o;

    move-result-object p1

    return-object p1
.end method
