.class final Ls1/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu2/r;

.field public final b:Ljava/lang/Object;

.field public final c:[Lu2/n0;

.field public d:Z

.field public e:Z

.field public f:Ls1/c2;

.field public g:Z

.field private final h:[Z

.field private final i:[Ls1/n3;

.field private final j:Ln3/c0;

.field private final k:Ls1/t2;

.field private l:Ls1/b2;

.field private m:Lu2/v0;

.field private n:Ln3/d0;

.field private o:J


# direct methods
.method public constructor <init>([Ls1/n3;JLn3/c0;Lo3/b;Ls1/t2;Ls1/c2;Ln3/d0;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/b2;->i:[Ls1/n3;

    iput-wide p2, p0, Ls1/b2;->o:J

    iput-object p4, p0, Ls1/b2;->j:Ln3/c0;

    iput-object p6, p0, Ls1/b2;->k:Ls1/t2;

    iget-object v0, p7, Ls1/c2;->a:Lu2/u$b;

    iget-object p2, v0, Lu2/s;->a:Ljava/lang/Object;

    iput-object p2, p0, Ls1/b2;->b:Ljava/lang/Object;

    iput-object p7, p0, Ls1/b2;->f:Ls1/c2;

    sget-object p2, Lu2/v0;->m:Lu2/v0;

    iput-object p2, p0, Ls1/b2;->m:Lu2/v0;

    iput-object p8, p0, Ls1/b2;->n:Ln3/d0;

    array-length p2, p1

    new-array p2, p2, [Lu2/n0;

    iput-object p2, p0, Ls1/b2;->c:[Lu2/n0;

    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ls1/b2;->h:[Z

    iget-wide v3, p7, Ls1/c2;->b:J

    iget-wide v5, p7, Ls1/c2;->d:J

    move-object v1, p6

    move-object v2, p5

    invoke-static/range {v0 .. v6}, Ls1/b2;->e(Lu2/u$b;Ls1/t2;Lo3/b;JJ)Lu2/r;

    move-result-object p1

    iput-object p1, p0, Ls1/b2;->a:Lu2/r;

    return-void
.end method

.method private c([Lu2/n0;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ls1/b2;->i:[Ls1/n3;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-interface {v1}, Ls1/n3;->h()I

    move-result v1

    const/4 v2, -0x2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ls1/b2;->n:Ln3/d0;

    invoke-virtual {v1, v0}, Ln3/d0;->c(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lu2/k;

    invoke-direct {v1}, Lu2/k;-><init>()V

    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static e(Lu2/u$b;Ls1/t2;Lo3/b;JJ)Lu2/r;
    .locals 7

    invoke-virtual {p1, p0, p2, p3, p4}, Ls1/t2;->h(Lu2/u$b;Lo3/b;J)Lu2/r;

    move-result-object v1

    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, p5, p0

    if-eqz p2, :cond_0

    new-instance p0, Lu2/d;

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    move-object v0, p0

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lu2/d;-><init>(Lu2/r;ZJJ)V

    move-object v1, p0

    :cond_0
    return-object v1
.end method

.method private f()V
    .locals 3

    invoke-direct {p0}, Ls1/b2;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ls1/b2;->n:Ln3/d0;

    iget v2, v1, Ln3/d0;->a:I

    if-ge v0, v2, :cond_2

    invoke-virtual {v1, v0}, Ln3/d0;->c(I)Z

    move-result v1

    iget-object v2, p0, Ls1/b2;->n:Ln3/d0;

    iget-object v2, v2, Ln3/d0;->c:[Ln3/t;

    aget-object v2, v2, v0

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ln3/t;->e()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private g([Lu2/n0;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ls1/b2;->i:[Ls1/n3;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-interface {v1}, Ls1/n3;->h()I

    move-result v1

    const/4 v2, -0x2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private h()V
    .locals 3

    invoke-direct {p0}, Ls1/b2;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ls1/b2;->n:Ln3/d0;

    iget v2, v1, Ln3/d0;->a:I

    if-ge v0, v2, :cond_2

    invoke-virtual {v1, v0}, Ln3/d0;->c(I)Z

    move-result v1

    iget-object v2, p0, Ls1/b2;->n:Ln3/d0;

    iget-object v2, v2, Ln3/d0;->c:[Ln3/t;

    aget-object v2, v2, v0

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ln3/t;->i()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private r()Z
    .locals 1

    iget-object v0, p0, Ls1/b2;->l:Ls1/b2;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static u(Ls1/t2;Lu2/r;)V
    .locals 1

    :try_start_0
    instance-of v0, p1, Lu2/d;

    if-eqz v0, :cond_0

    check-cast p1, Lu2/d;

    iget-object p1, p1, Lu2/d;->j:Lu2/r;

    :cond_0
    invoke-virtual {p0, p1}, Ls1/t2;->z(Lu2/r;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "MediaPeriodHolder"

    const-string v0, "Period release failed."

    invoke-static {p1, v0, p0}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public A()V
    .locals 6

    iget-object v0, p0, Ls1/b2;->a:Lu2/r;

    instance-of v1, v0, Lu2/d;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls1/b2;->f:Ls1/c2;

    iget-wide v1, v1, Ls1/c2;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const-wide/high16 v1, -0x8000000000000000L

    :cond_0
    check-cast v0, Lu2/d;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lu2/d;->v(JJ)V

    :cond_1
    return-void
.end method

.method public a(Ln3/d0;JZ)J
    .locals 7

    iget-object v0, p0, Ls1/b2;->i:[Ls1/n3;

    array-length v0, v0

    new-array v6, v0, [Z

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Ls1/b2;->b(Ln3/d0;JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(Ln3/d0;JZ[Z)J
    .locals 13

    move-object v0, p0

    move-object v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget v4, v1, Ln3/d0;->a:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    iget-object v4, v0, Ls1/b2;->h:[Z

    if-nez p4, :cond_0

    iget-object v6, v0, Ls1/b2;->n:Ln3/d0;

    invoke-virtual {p1, v6, v3}, Ln3/d0;->b(Ln3/d0;I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Ls1/b2;->c:[Lu2/n0;

    invoke-direct {p0, v3}, Ls1/b2;->g([Lu2/n0;)V

    invoke-direct {p0}, Ls1/b2;->f()V

    iput-object v1, v0, Ls1/b2;->n:Ln3/d0;

    invoke-direct {p0}, Ls1/b2;->h()V

    iget-object v6, v0, Ls1/b2;->a:Lu2/r;

    iget-object v7, v1, Ln3/d0;->c:[Ln3/t;

    iget-object v8, v0, Ls1/b2;->h:[Z

    iget-object v9, v0, Ls1/b2;->c:[Lu2/n0;

    move-object/from16 v10, p5

    move-wide v11, p2

    invoke-interface/range {v6 .. v12}, Lu2/r;->m([Ln3/t;[Z[Lu2/n0;[ZJ)J

    move-result-wide v3

    iget-object v6, v0, Ls1/b2;->c:[Lu2/n0;

    invoke-direct {p0, v6}, Ls1/b2;->c([Lu2/n0;)V

    iput-boolean v2, v0, Ls1/b2;->e:Z

    const/4 v6, 0x0

    :goto_2
    iget-object v7, v0, Ls1/b2;->c:[Lu2/n0;

    array-length v8, v7

    if-ge v6, v8, :cond_5

    aget-object v7, v7, v6

    if-eqz v7, :cond_2

    invoke-virtual {p1, v6}, Ln3/d0;->c(I)Z

    move-result v7

    invoke-static {v7}, Lp3/a;->f(Z)V

    iget-object v7, v0, Ls1/b2;->i:[Ls1/n3;

    aget-object v7, v7, v6

    invoke-interface {v7}, Ls1/n3;->h()I

    move-result v7

    const/4 v8, -0x2

    if-eq v7, v8, :cond_4

    iput-boolean v5, v0, Ls1/b2;->e:Z

    goto :goto_4

    :cond_2
    iget-object v7, v1, Ln3/d0;->c:[Ln3/t;

    aget-object v7, v7, v6

    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    invoke-static {v7}, Lp3/a;->f(Z)V

    :cond_4
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    return-wide v3
.end method

.method public d(J)V
    .locals 1

    invoke-direct {p0}, Ls1/b2;->r()Z

    move-result v0

    invoke-static {v0}, Lp3/a;->f(Z)V

    invoke-virtual {p0, p1, p2}, Ls1/b2;->y(J)J

    move-result-wide p1

    iget-object v0, p0, Ls1/b2;->a:Lu2/r;

    invoke-interface {v0, p1, p2}, Lu2/r;->g(J)Z

    return-void
.end method

.method public i()J
    .locals 5

    iget-boolean v0, p0, Ls1/b2;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ls1/b2;->f:Ls1/c2;

    iget-wide v0, v0, Ls1/c2;->b:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Ls1/b2;->e:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls1/b2;->a:Lu2/r;

    invoke-interface {v0}, Lu2/r;->f()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Ls1/b2;->f:Ls1/c2;

    iget-wide v3, v0, Ls1/c2;->e:J

    :cond_2
    return-wide v3
.end method

.method public j()Ls1/b2;
    .locals 1

    iget-object v0, p0, Ls1/b2;->l:Ls1/b2;

    return-object v0
.end method

.method public k()J
    .locals 2

    iget-boolean v0, p0, Ls1/b2;->d:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/b2;->a:Lu2/r;

    invoke-interface {v0}, Lu2/r;->c()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Ls1/b2;->o:J

    return-wide v0
.end method

.method public m()J
    .locals 4

    iget-object v0, p0, Ls1/b2;->f:Ls1/c2;

    iget-wide v0, v0, Ls1/c2;->b:J

    iget-wide v2, p0, Ls1/b2;->o:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public n()Lu2/v0;
    .locals 1

    iget-object v0, p0, Ls1/b2;->m:Lu2/v0;

    return-object v0
.end method

.method public o()Ln3/d0;
    .locals 1

    iget-object v0, p0, Ls1/b2;->n:Ln3/d0;

    return-object v0
.end method

.method public p(FLs1/y3;)V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls1/b2;->d:Z

    iget-object v0, p0, Ls1/b2;->a:Lu2/r;

    invoke-interface {v0}, Lu2/r;->p()Lu2/v0;

    move-result-object v0

    iput-object v0, p0, Ls1/b2;->m:Lu2/v0;

    invoke-virtual {p0, p1, p2}, Ls1/b2;->v(FLs1/y3;)Ln3/d0;

    move-result-object p1

    iget-object p2, p0, Ls1/b2;->f:Ls1/c2;

    iget-wide v0, p2, Ls1/c2;->b:J

    iget-wide v2, p2, Ls1/c2;->e:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v2, v4

    if-eqz p2, :cond_0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_0

    const-wide/16 v0, 0x0

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, v1, p2}, Ls1/b2;->a(Ln3/d0;JZ)J

    move-result-wide p1

    iget-wide v0, p0, Ls1/b2;->o:J

    iget-object v2, p0, Ls1/b2;->f:Ls1/c2;

    iget-wide v3, v2, Ls1/c2;->b:J

    sub-long/2addr v3, p1

    add-long/2addr v0, v3

    iput-wide v0, p0, Ls1/b2;->o:J

    invoke-virtual {v2, p1, p2}, Ls1/c2;->b(J)Ls1/c2;

    move-result-object p1

    iput-object p1, p0, Ls1/b2;->f:Ls1/c2;

    return-void
.end method

.method public q()Z
    .locals 5

    iget-boolean v0, p0, Ls1/b2;->d:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ls1/b2;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/b2;->a:Lu2/r;

    invoke-interface {v0}, Lu2/r;->f()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s(J)V
    .locals 1

    invoke-direct {p0}, Ls1/b2;->r()Z

    move-result v0

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-boolean v0, p0, Ls1/b2;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/b2;->a:Lu2/r;

    invoke-virtual {p0, p1, p2}, Ls1/b2;->y(J)J

    move-result-wide p1

    invoke-interface {v0, p1, p2}, Lu2/r;->h(J)V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 2

    invoke-direct {p0}, Ls1/b2;->f()V

    iget-object v0, p0, Ls1/b2;->k:Ls1/t2;

    iget-object v1, p0, Ls1/b2;->a:Lu2/r;

    invoke-static {v0, v1}, Ls1/b2;->u(Ls1/t2;Lu2/r;)V

    return-void
.end method

.method public v(FLs1/y3;)Ln3/d0;
    .locals 4

    iget-object v0, p0, Ls1/b2;->j:Ln3/c0;

    iget-object v1, p0, Ls1/b2;->i:[Ls1/n3;

    invoke-virtual {p0}, Ls1/b2;->n()Lu2/v0;

    move-result-object v2

    iget-object v3, p0, Ls1/b2;->f:Ls1/c2;

    iget-object v3, v3, Ls1/c2;->a:Lu2/u$b;

    invoke-virtual {v0, v1, v2, v3, p2}, Ln3/c0;->g([Ls1/n3;Lu2/v0;Lu2/u$b;Ls1/y3;)Ln3/d0;

    move-result-object p2

    iget-object v0, p2, Ln3/d0;->c:[Ln3/t;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    invoke-interface {v3, p1}, Ln3/t;->q(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public w(Ls1/b2;)V
    .locals 1

    iget-object v0, p0, Ls1/b2;->l:Ls1/b2;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Ls1/b2;->f()V

    iput-object p1, p0, Ls1/b2;->l:Ls1/b2;

    invoke-direct {p0}, Ls1/b2;->h()V

    return-void
.end method

.method public x(J)V
    .locals 0

    iput-wide p1, p0, Ls1/b2;->o:J

    return-void
.end method

.method public y(J)J
    .locals 2

    invoke-virtual {p0}, Ls1/b2;->l()J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public z(J)J
    .locals 2

    invoke-virtual {p0}, Ls1/b2;->l()J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method
