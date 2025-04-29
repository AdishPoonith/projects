.class final Ls1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/l$a;
    }
.end annotation


# instance fields
.field private final j:Lp3/f0;

.field private final k:Ls1/l$a;

.field private l:Ls1/l3;

.field private m:Lp3/t;

.field private n:Z

.field private o:Z


# direct methods
.method public constructor <init>(Ls1/l$a;Lp3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/l;->k:Ls1/l$a;

    new-instance p1, Lp3/f0;

    invoke-direct {p1, p2}, Lp3/f0;-><init>(Lp3/d;)V

    iput-object p1, p0, Ls1/l;->j:Lp3/f0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls1/l;->n:Z

    return-void
.end method

.method private e(Z)Z
    .locals 1

    iget-object v0, p0, Ls1/l;->l:Ls1/l3;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ls1/l3;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ls1/l;->l:Ls1/l3;

    invoke-interface {v0}, Ls1/l3;->d()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    iget-object p1, p0, Ls1/l;->l:Ls1/l3;

    invoke-interface {p1}, Ls1/l3;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private j(Z)V
    .locals 5

    invoke-direct {p0, p1}, Ls1/l;->e(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls1/l;->n:Z

    iget-boolean p1, p0, Ls1/l;->o:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {p1}, Lp3/f0;->b()V

    :cond_0
    return-void

    :cond_1
    iget-object p1, p0, Ls1/l;->m:Lp3/t;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp3/t;

    invoke-interface {p1}, Lp3/t;->x()J

    move-result-wide v0

    iget-boolean v2, p0, Ls1/l;->n:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v2}, Lp3/f0;->x()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_2

    iget-object p1, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {p1}, Lp3/f0;->d()V

    return-void

    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, p0, Ls1/l;->n:Z

    iget-boolean v2, p0, Ls1/l;->o:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v2}, Lp3/f0;->b()V

    :cond_3
    iget-object v2, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v2, v0, v1}, Lp3/f0;->a(J)V

    invoke-interface {p1}, Lp3/t;->g()Ls1/b3;

    move-result-object p1

    iget-object v0, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v0}, Lp3/f0;->g()Ls1/b3;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls1/b3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v0, p1}, Lp3/f0;->c(Ls1/b3;)V

    iget-object v0, p0, Ls1/l;->k:Ls1/l$a;

    invoke-interface {v0, p1}, Ls1/l$a;->p(Ls1/b3;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Ls1/l3;)V
    .locals 1

    iget-object v0, p0, Ls1/l;->l:Ls1/l3;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ls1/l;->m:Lp3/t;

    iput-object p1, p0, Ls1/l;->l:Ls1/l3;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls1/l;->n:Z

    :cond_0
    return-void
.end method

.method public b(Ls1/l3;)V
    .locals 2

    invoke-interface {p1}, Ls1/l3;->v()Lp3/t;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ls1/l;->m:Lp3/t;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    iput-object v0, p0, Ls1/l;->m:Lp3/t;

    iput-object p1, p0, Ls1/l;->l:Ls1/l3;

    iget-object p1, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {p1}, Lp3/f0;->g()Ls1/b3;

    move-result-object p1

    invoke-interface {v0, p1}, Lp3/t;->c(Ls1/b3;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ls1/q;->h(Ljava/lang/RuntimeException;)Ls1/q;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Ls1/b3;)V
    .locals 1

    iget-object v0, p0, Ls1/l;->m:Lp3/t;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lp3/t;->c(Ls1/b3;)V

    iget-object p1, p0, Ls1/l;->m:Lp3/t;

    invoke-interface {p1}, Lp3/t;->g()Ls1/b3;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v0, p1}, Lp3/f0;->c(Ls1/b3;)V

    return-void
.end method

.method public d(J)V
    .locals 1

    iget-object v0, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v0, p1, p2}, Lp3/f0;->a(J)V

    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls1/l;->o:Z

    iget-object v0, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v0}, Lp3/f0;->b()V

    return-void
.end method

.method public g()Ls1/b3;
    .locals 1

    iget-object v0, p0, Ls1/l;->m:Lp3/t;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp3/t;->g()Ls1/b3;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v0}, Lp3/f0;->g()Ls1/b3;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls1/l;->o:Z

    iget-object v0, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v0}, Lp3/f0;->d()V

    return-void
.end method

.method public i(Z)J
    .locals 2

    invoke-direct {p0, p1}, Ls1/l;->j(Z)V

    invoke-virtual {p0}, Ls1/l;->x()J

    move-result-wide v0

    return-wide v0
.end method

.method public x()J
    .locals 2

    iget-boolean v0, p0, Ls1/l;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/l;->j:Lp3/f0;

    invoke-virtual {v0}, Lp3/f0;->x()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/l;->m:Lp3/t;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp3/t;

    invoke-interface {v0}, Lp3/t;->x()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
