.class public final Lu2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/r;
.implements Lu2/r$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/o$a;
    }
.end annotation


# instance fields
.field public final j:Lu2/u$b;

.field private final k:J

.field private final l:Lo3/b;

.field private m:Lu2/u;

.field private n:Lu2/r;

.field private o:Lu2/r$a;

.field private p:Lu2/o$a;

.field private q:Z

.field private r:J


# direct methods
.method public constructor <init>(Lu2/u$b;Lo3/b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/o;->j:Lu2/u$b;

    iput-object p2, p0, Lu2/o;->l:Lo3/b;

    iput-wide p3, p0, Lu2/o;->k:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lu2/o;->r:J

    return-void
.end method

.method private u(J)J
    .locals 5

    iget-wide v0, p0, Lu2/o;->r:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    move-wide p1, v0

    :cond_0
    return-wide p1
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu2/r;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-interface {v0}, Lu2/r;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Lu2/u$b;)V
    .locals 4

    iget-wide v0, p0, Lu2/o;->k:J

    invoke-direct {p0, v0, v1}, Lu2/o;->u(J)J

    move-result-wide v0

    iget-object v2, p0, Lu2/o;->m:Lu2/u;

    invoke-static {v2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/u;

    iget-object v3, p0, Lu2/o;->l:Lo3/b;

    invoke-interface {v2, p1, v3, v0, v1}, Lu2/u;->n(Lu2/u$b;Lo3/b;J)Lu2/r;

    move-result-object p1

    iput-object p1, p0, Lu2/o;->n:Lu2/r;

    iget-object v2, p0, Lu2/o;->o:Lu2/r$a;

    if-eqz v2, :cond_0

    invoke-interface {p1, p0, v0, v1}, Lu2/r;->j(Lu2/r$a;J)V

    :cond_0
    return-void
.end method

.method public e(JLs1/q3;)J
    .locals 1

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-interface {v0, p1, p2, p3}, Lu2/r;->e(JLs1/q3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-interface {v0}, Lu2/r;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)Z
    .locals 1

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lu2/r;->g(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h(J)V
    .locals 1

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-interface {v0, p1, p2}, Lu2/r;->h(J)V

    return-void
.end method

.method public i(Lu2/r;)V
    .locals 1

    iget-object p1, p0, Lu2/o;->o:Lu2/r$a;

    invoke-static {p1}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu2/r$a;

    invoke-interface {p1, p0}, Lu2/r$a;->i(Lu2/r;)V

    iget-object p1, p0, Lu2/o;->p:Lu2/o$a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lu2/o;->j:Lu2/u$b;

    invoke-interface {p1, v0}, Lu2/o$a;->a(Lu2/u$b;)V

    :cond_0
    return-void
.end method

.method public j(Lu2/r$a;J)V
    .locals 0

    iput-object p1, p0, Lu2/o;->o:Lu2/r$a;

    iget-object p1, p0, Lu2/o;->n:Lu2/r;

    if-eqz p1, :cond_0

    iget-wide p2, p0, Lu2/o;->k:J

    invoke-direct {p0, p2, p3}, Lu2/o;->u(J)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3}, Lu2/r;->j(Lu2/r$a;J)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Lu2/o0;)V
    .locals 0

    check-cast p1, Lu2/r;

    invoke-virtual {p0, p1}, Lu2/o;->v(Lu2/r;)V

    return-void
.end method

.method public m([Ln3/t;[Z[Lu2/n0;[ZJ)J
    .locals 15

    move-object v0, p0

    iget-wide v1, v0, Lu2/o;->r:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Lu2/o;->k:J

    cmp-long v7, p5, v5

    if-nez v7, :cond_0

    iput-wide v3, v0, Lu2/o;->r:J

    move-wide v13, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v13, p5

    :goto_0
    iget-object v1, v0, Lu2/o;->n:Lu2/r;

    invoke-static {v1}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lu2/r;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    invoke-interface/range {v8 .. v14}, Lu2/r;->m([Ln3/t;[Z[Lu2/n0;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public n()J
    .locals 2

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-interface {v0}, Lu2/r;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public o()J
    .locals 2

    iget-wide v0, p0, Lu2/o;->r:J

    return-wide v0
.end method

.method public p()Lu2/v0;
    .locals 1

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-interface {v0}, Lu2/r;->p()Lu2/v0;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu2/r;->q()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu2/o;->m:Lu2/u;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lu2/u;->f()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lu2/o;->p:Lu2/o$a;

    if-eqz v1, :cond_2

    iget-boolean v2, p0, Lu2/o;->q:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lu2/o;->q:Z

    iget-object v2, p0, Lu2/o;->j:Lu2/u$b;

    invoke-interface {v1, v2, v0}, Lu2/o$a;->b(Lu2/u$b;Ljava/io/IOException;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    throw v0
.end method

.method public r(JZ)V
    .locals 1

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-interface {v0, p1, p2, p3}, Lu2/r;->r(JZ)V

    return-void
.end method

.method public s(J)J
    .locals 1

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-interface {v0, p1, p2}, Lu2/r;->s(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public t()J
    .locals 2

    iget-wide v0, p0, Lu2/o;->k:J

    return-wide v0
.end method

.method public v(Lu2/r;)V
    .locals 0

    iget-object p1, p0, Lu2/o;->o:Lu2/r$a;

    invoke-static {p1}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu2/r$a;

    invoke-interface {p1, p0}, Lu2/o0$a;->l(Lu2/o0;)V

    return-void
.end method

.method public w(J)V
    .locals 0

    iput-wide p1, p0, Lu2/o;->r:J

    return-void
.end method

.method public x()V
    .locals 2

    iget-object v0, p0, Lu2/o;->n:Lu2/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu2/o;->m:Lu2/u;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/u;

    iget-object v1, p0, Lu2/o;->n:Lu2/r;

    invoke-interface {v0, v1}, Lu2/u;->b(Lu2/r;)V

    :cond_0
    return-void
.end method

.method public y(Lu2/u;)V
    .locals 1

    iget-object v0, p0, Lu2/o;->m:Lu2/u;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iput-object p1, p0, Lu2/o;->m:Lu2/u;

    return-void
.end method
