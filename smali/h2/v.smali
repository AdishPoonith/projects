.class public final Lh2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/b0;


# instance fields
.field private a:Ls1/n1;

.field private b:Lp3/j0;

.field private c:Lx1/e0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls1/n1$b;

    invoke-direct {v0}, Ls1/n1$b;-><init>()V

    invoke-virtual {v0, p1}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p1

    iput-object p1, p0, Lh2/v;->a:Ls1/n1;

    return-void
.end method

.method private b()V
    .locals 1

    iget-object v0, p0, Lh2/v;->b:Lp3/j0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh2/v;->c:Lx1/e0;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lp3/a0;)V
    .locals 8

    invoke-direct {p0}, Lh2/v;->b()V

    iget-object v0, p0, Lh2/v;->b:Lp3/j0;

    invoke-virtual {v0}, Lp3/j0;->d()J

    move-result-wide v2

    iget-object v0, p0, Lh2/v;->b:Lp3/j0;

    invoke-virtual {v0}, Lp3/j0;->e()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    cmp-long v6, v0, v4

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lh2/v;->a:Ls1/n1;

    iget-wide v5, v4, Ls1/n1;->y:J

    cmp-long v7, v0, v5

    if-eqz v7, :cond_1

    invoke-virtual {v4}, Ls1/n1;->b()Ls1/n1$b;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ls1/n1$b;->k0(J)Ls1/n1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v0

    iput-object v0, p0, Lh2/v;->a:Ls1/n1;

    iget-object v1, p0, Lh2/v;->c:Lx1/e0;

    invoke-interface {v1, v0}, Lx1/e0;->e(Ls1/n1;)V

    :cond_1
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v5

    iget-object v0, p0, Lh2/v;->c:Lx1/e0;

    invoke-interface {v0, p1, v5}, Lx1/e0;->d(Lp3/a0;I)V

    iget-object v1, p0, Lh2/v;->c:Lx1/e0;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lx1/e0;->c(JIIILx1/e0$a;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public c(Lp3/j0;Lx1/n;Lh2/i0$d;)V
    .locals 0

    iput-object p1, p0, Lh2/v;->b:Lp3/j0;

    invoke-virtual {p3}, Lh2/i0$d;->a()V

    invoke-virtual {p3}, Lh2/i0$d;->c()I

    move-result p1

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Lx1/n;->d(II)Lx1/e0;

    move-result-object p1

    iput-object p1, p0, Lh2/v;->c:Lx1/e0;

    iget-object p2, p0, Lh2/v;->a:Ls1/n1;

    invoke-interface {p1, p2}, Lx1/e0;->e(Ls1/n1;)V

    return-void
.end method
