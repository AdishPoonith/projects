.class public final Lu2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/r;
.implements Lu2/r$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/d$a;
    }
.end annotation


# instance fields
.field public final j:Lu2/r;

.field private k:Lu2/r$a;

.field private l:[Lu2/d$a;

.field private m:J

.field n:J

.field o:J


# direct methods
.method public constructor <init>(Lu2/r;ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/d;->j:Lu2/r;

    const/4 p1, 0x0

    new-array p1, p1, [Lu2/d$a;

    iput-object p1, p0, Lu2/d;->l:[Lu2/d$a;

    if-eqz p2, :cond_0

    move-wide p1, p3

    goto :goto_0

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    iput-wide p1, p0, Lu2/d;->m:J

    iput-wide p3, p0, Lu2/d;->n:J

    iput-wide p5, p0, Lu2/d;->o:J

    return-void
.end method

.method private d(JLs1/q3;)Ls1/q3;
    .locals 9

    iget-wide v0, p3, Ls1/q3;->a:J

    iget-wide v2, p0, Lu2/d;->n:J

    sub-long v4, p1, v2

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lp3/n0;->r(JJJ)J

    move-result-wide v0

    iget-wide v2, p3, Ls1/q3;->b:J

    iget-wide v4, p0, Lu2/d;->o:J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v4, v6

    if-nez v8, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    move-wide v6, p1

    goto :goto_0

    :cond_0
    sub-long/2addr v4, p1

    move-wide v6, v4

    :goto_0
    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lp3/n0;->r(JJJ)J

    move-result-wide p1

    iget-wide v2, p3, Ls1/q3;->a:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    iget-wide v2, p3, Ls1/q3;->b:J

    cmp-long v4, p1, v2

    if-nez v4, :cond_1

    return-object p3

    :cond_1
    new-instance p3, Ls1/q3;

    invoke-direct {p3, v0, v1, p1, p2}, Ls1/q3;-><init>(JJ)V

    return-object p3
.end method

.method private static u(J[Ln3/t;)Z
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-eqz v3, :cond_1

    array-length p0, p2

    const/4 p1, 0x0

    :goto_0
    if-ge p1, p0, :cond_1

    aget-object v1, p2, p1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ln3/t;->m()Ls1/n1;

    move-result-object v1

    iget-object v2, v1, Ls1/n1;->u:Ljava/lang/String;

    iget-object v1, v1, Ls1/n1;->r:Ljava/lang/String;

    invoke-static {v2, v1}, Lp3/v;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0}, Lu2/r;->a()Z

    move-result v0

    return v0
.end method

.method public c()J
    .locals 7

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0}, Lu2/r;->c()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, p0, Lu2/d;->o:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v6, v0, v4

    if-ltz v6, :cond_0

    goto :goto_0

    :cond_0
    return-wide v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public e(JLs1/q3;)J
    .locals 3

    iget-wide v0, p0, Lu2/d;->n:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lu2/d;->d(JLs1/q3;)Ls1/q3;

    move-result-object p3

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0, p1, p2, p3}, Lu2/r;->e(JLs1/q3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()J
    .locals 7

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0}, Lu2/r;->f()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, p0, Lu2/d;->o:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v6, v0, v4

    if-ltz v6, :cond_0

    goto :goto_0

    :cond_0
    return-wide v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public g(J)Z
    .locals 1

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0, p1, p2}, Lu2/r;->g(J)Z

    move-result p1

    return p1
.end method

.method public h(J)V
    .locals 1

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0, p1, p2}, Lu2/r;->h(J)V

    return-void
.end method

.method public i(Lu2/r;)V
    .locals 0

    iget-object p1, p0, Lu2/d;->k:Lu2/r$a;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu2/r$a;

    invoke-interface {p1, p0}, Lu2/r$a;->i(Lu2/r;)V

    return-void
.end method

.method public j(Lu2/r$a;J)V
    .locals 0

    iput-object p1, p0, Lu2/d;->k:Lu2/r$a;

    iget-object p1, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {p1, p0, p2, p3}, Lu2/r;->j(Lu2/r$a;J)V

    return-void
.end method

.method public bridge synthetic l(Lu2/o0;)V
    .locals 0

    check-cast p1, Lu2/r;

    invoke-virtual {p0, p1}, Lu2/d;->t(Lu2/r;)V

    return-void
.end method

.method public m([Ln3/t;[Z[Lu2/n0;[ZJ)J
    .locals 12

    move-object v0, p0

    move-object v1, p3

    array-length v2, v1

    new-array v2, v2, [Lu2/d$a;

    iput-object v2, v0, Lu2/d;->l:[Lu2/d$a;

    array-length v2, v1

    new-array v9, v2, [Lu2/n0;

    const/4 v10, 0x0

    const/4 v2, 0x0

    :goto_0
    array-length v3, v1

    const/4 v11, 0x0

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Lu2/d;->l:[Lu2/d$a;

    aget-object v4, v1, v2

    check-cast v4, Lu2/d$a;

    aput-object v4, v3, v2

    aget-object v4, v3, v2

    if-eqz v4, :cond_0

    aget-object v3, v3, v2

    iget-object v11, v3, Lu2/d$a;->j:Lu2/n0;

    :cond_0
    aput-object v11, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lu2/d;->j:Lu2/r;

    move-object v3, p1

    move-object v4, p2

    move-object v5, v9

    move-object/from16 v6, p4

    move-wide/from16 v7, p5

    invoke-interface/range {v2 .. v8}, Lu2/r;->m([Ln3/t;[Z[Lu2/n0;[ZJ)J

    move-result-wide v2

    invoke-virtual {p0}, Lu2/d;->o()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lu2/d;->n:J

    cmp-long v6, p5, v4

    if-nez v6, :cond_2

    move-object v6, p1

    invoke-static {v4, v5, p1}, Lu2/d;->u(J[Ln3/t;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-wide v4, v2

    goto :goto_1

    :cond_2
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    iput-wide v4, v0, Lu2/d;->m:J

    cmp-long v4, v2, p5

    if-eqz v4, :cond_4

    iget-wide v4, v0, Lu2/d;->n:J

    cmp-long v6, v2, v4

    if-ltz v6, :cond_3

    iget-wide v4, v0, Lu2/d;->o:J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v4, v6

    if-eqz v8, :cond_4

    cmp-long v6, v2, v4

    if-gtz v6, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v4, 0x1

    :goto_3
    invoke-static {v4}, Lp3/a;->f(Z)V

    :goto_4
    array-length v4, v1

    if-ge v10, v4, :cond_8

    aget-object v4, v9, v10

    if-nez v4, :cond_5

    iget-object v4, v0, Lu2/d;->l:[Lu2/d$a;

    aput-object v11, v4, v10

    goto :goto_5

    :cond_5
    iget-object v4, v0, Lu2/d;->l:[Lu2/d$a;

    aget-object v5, v4, v10

    if-eqz v5, :cond_6

    aget-object v5, v4, v10

    iget-object v5, v5, Lu2/d$a;->j:Lu2/n0;

    aget-object v6, v9, v10

    if-eq v5, v6, :cond_7

    :cond_6
    new-instance v5, Lu2/d$a;

    aget-object v6, v9, v10

    invoke-direct {v5, p0, v6}, Lu2/d$a;-><init>(Lu2/d;Lu2/n0;)V

    aput-object v5, v4, v10

    :cond_7
    :goto_5
    iget-object v4, v0, Lu2/d;->l:[Lu2/d$a;

    aget-object v4, v4, v10

    aput-object v4, v1, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_8
    return-wide v2
.end method

.method public n()J
    .locals 9

    invoke-virtual {p0}, Lu2/d;->o()Z

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_1

    iget-wide v3, p0, Lu2/d;->m:J

    iput-wide v1, p0, Lu2/d;->m:J

    invoke-virtual {p0}, Lu2/d;->n()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-eqz v0, :cond_0

    move-wide v3, v5

    :cond_0
    return-wide v3

    :cond_1
    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0}, Lu2/r;->n()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    return-wide v1

    :cond_2
    iget-wide v0, p0, Lu2/d;->n:J

    const/4 v2, 0x1

    const/4 v5, 0x0

    cmp-long v6, v3, v0

    if-ltz v6, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-wide v0, p0, Lu2/d;->o:J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v0, v6

    if-eqz v8, :cond_5

    cmp-long v6, v3, v0

    if-gtz v6, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :cond_5
    :goto_1
    invoke-static {v2}, Lp3/a;->f(Z)V

    return-wide v3
.end method

.method o()Z
    .locals 5

    iget-wide v0, p0, Lu2/d;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p()Lu2/v0;
    .locals 1

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0}, Lu2/r;->p()Lu2/v0;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0}, Lu2/r;->q()V

    return-void
.end method

.method public r(JZ)V
    .locals 1

    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0, p1, p2, p3}, Lu2/r;->r(JZ)V

    return-void
.end method

.method public s(J)J
    .locals 6

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lu2/d;->m:J

    iget-object v0, p0, Lu2/d;->l:[Lu2/d$a;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lu2/d$a;->a()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu2/d;->j:Lu2/r;

    invoke-interface {v0, p1, p2}, Lu2/r;->s(J)J

    move-result-wide v0

    cmp-long v3, v0, p1

    if-eqz v3, :cond_2

    iget-wide p1, p0, Lu2/d;->n:J

    cmp-long v3, v0, p1

    if-ltz v3, :cond_3

    iget-wide p1, p0, Lu2/d;->o:J

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v5, p1, v3

    if-eqz v5, :cond_2

    cmp-long v3, v0, p1

    if-gtz v3, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    invoke-static {v2}, Lp3/a;->f(Z)V

    return-wide v0
.end method

.method public t(Lu2/r;)V
    .locals 0

    iget-object p1, p0, Lu2/d;->k:Lu2/r$a;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu2/r$a;

    invoke-interface {p1, p0}, Lu2/o0$a;->l(Lu2/o0;)V

    return-void
.end method

.method public v(JJ)V
    .locals 0

    iput-wide p1, p0, Lu2/d;->n:J

    iput-wide p3, p0, Lu2/d;->o:J

    return-void
.end method
