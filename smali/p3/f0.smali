.class public final Lp3/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/t;


# instance fields
.field private final j:Lp3/d;

.field private k:Z

.field private l:J

.field private m:J

.field private n:Ls1/b3;


# direct methods
.method public constructor <init>(Lp3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/f0;->j:Lp3/d;

    sget-object p1, Ls1/b3;->m:Ls1/b3;

    iput-object p1, p0, Lp3/f0;->n:Ls1/b3;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lp3/f0;->l:J

    iget-boolean p1, p0, Lp3/f0;->k:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lp3/f0;->j:Lp3/d;

    invoke-interface {p1}, Lp3/d;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lp3/f0;->m:J

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-boolean v0, p0, Lp3/f0;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lp3/f0;->j:Lp3/d;

    invoke-interface {v0}, Lp3/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lp3/f0;->m:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp3/f0;->k:Z

    :cond_0
    return-void
.end method

.method public c(Ls1/b3;)V
    .locals 2

    iget-boolean v0, p0, Lp3/f0;->k:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lp3/f0;->x()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lp3/f0;->a(J)V

    :cond_0
    iput-object p1, p0, Lp3/f0;->n:Ls1/b3;

    return-void
.end method

.method public d()V
    .locals 2

    iget-boolean v0, p0, Lp3/f0;->k:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lp3/f0;->x()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lp3/f0;->a(J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp3/f0;->k:Z

    :cond_0
    return-void
.end method

.method public g()Ls1/b3;
    .locals 1

    iget-object v0, p0, Lp3/f0;->n:Ls1/b3;

    return-object v0
.end method

.method public x()J
    .locals 7

    iget-wide v0, p0, Lp3/f0;->l:J

    iget-boolean v2, p0, Lp3/f0;->k:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lp3/f0;->j:Lp3/d;

    invoke-interface {v2}, Lp3/d;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lp3/f0;->m:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lp3/f0;->n:Ls1/b3;

    iget v5, v4, Ls1/b3;->j:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Lp3/n0;->B0(J)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v2, v3}, Ls1/b3;->b(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method
