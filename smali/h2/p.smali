.class public final Lh2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/p$b;
    }
.end annotation


# instance fields
.field private final a:Lh2/d0;

.field private final b:Z

.field private final c:Z

.field private final d:Lh2/u;

.field private final e:Lh2/u;

.field private final f:Lh2/u;

.field private g:J

.field private final h:[Z

.field private i:Ljava/lang/String;

.field private j:Lx1/e0;

.field private k:Lh2/p$b;

.field private l:Z

.field private m:J

.field private n:Z

.field private final o:Lp3/a0;


# direct methods
.method public constructor <init>(Lh2/d0;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/p;->a:Lh2/d0;

    iput-boolean p2, p0, Lh2/p;->b:Z

    iput-boolean p3, p0, Lh2/p;->c:Z

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lh2/p;->h:[Z

    new-instance p1, Lh2/u;

    const/4 p2, 0x7

    const/16 p3, 0x80

    invoke-direct {p1, p2, p3}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/p;->d:Lh2/u;

    new-instance p1, Lh2/u;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/p;->e:Lh2/u;

    new-instance p1, Lh2/u;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/p;->f:Lh2/u;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lh2/p;->m:J

    new-instance p1, Lp3/a0;

    invoke-direct {p1}, Lp3/a0;-><init>()V

    iput-object p1, p0, Lh2/p;->o:Lp3/a0;

    return-void
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Lh2/p;->j:Lx1/e0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh2/p;->k:Lh2/p$b;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g(JIIJ)V
    .locals 7

    iget-boolean v0, p0, Lh2/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh2/p;->k:Lh2/p$b;

    invoke-virtual {v0}, Lh2/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    invoke-virtual {v0, p4}, Lh2/u;->b(I)Z

    iget-object v0, p0, Lh2/p;->e:Lh2/u;

    invoke-virtual {v0, p4}, Lh2/u;->b(I)Z

    iget-boolean v0, p0, Lh2/p;->l:Z

    const/4 v1, 0x3

    if-nez v0, :cond_1

    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lh2/p;->e:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lh2/p;->d:Lh2/u;

    iget-object v3, v2, Lh2/u;->d:[B

    iget v2, v2, Lh2/u;->e:I

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lh2/p;->e:Lh2/u;

    iget-object v3, v2, Lh2/u;->d:[B

    iget v2, v2, Lh2/u;->e:I

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lh2/p;->d:Lh2/u;

    iget-object v3, v2, Lh2/u;->d:[B

    iget v2, v2, Lh2/u;->e:I

    invoke-static {v3, v1, v2}, Lp3/w;->l([BII)Lp3/w$c;

    move-result-object v2

    iget-object v3, p0, Lh2/p;->e:Lh2/u;

    iget-object v4, v3, Lh2/u;->d:[B

    iget v3, v3, Lh2/u;->e:I

    invoke-static {v4, v1, v3}, Lp3/w;->j([BII)Lp3/w$b;

    move-result-object v1

    iget v3, v2, Lp3/w$c;->a:I

    iget v4, v2, Lp3/w$c;->b:I

    iget v5, v2, Lp3/w$c;->c:I

    invoke-static {v3, v4, v5}, Lp3/e;->a(III)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lh2/p;->j:Lx1/e0;

    new-instance v5, Ls1/n1$b;

    invoke-direct {v5}, Ls1/n1$b;-><init>()V

    iget-object v6, p0, Lh2/p;->i:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ls1/n1$b;->U(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v5

    const-string v6, "video/avc"

    invoke-virtual {v5, v6}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v5

    invoke-virtual {v5, v3}, Ls1/n1$b;->K(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v3

    iget v5, v2, Lp3/w$c;->f:I

    invoke-virtual {v3, v5}, Ls1/n1$b;->n0(I)Ls1/n1$b;

    move-result-object v3

    iget v5, v2, Lp3/w$c;->g:I

    invoke-virtual {v3, v5}, Ls1/n1$b;->S(I)Ls1/n1$b;

    move-result-object v3

    iget v5, v2, Lp3/w$c;->h:F

    invoke-virtual {v3, v5}, Ls1/n1$b;->c0(F)Ls1/n1$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Ls1/n1$b;->V(Ljava/util/List;)Ls1/n1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v0

    invoke-interface {v4, v0}, Lx1/e0;->e(Ls1/n1;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh2/p;->l:Z

    iget-object v0, p0, Lh2/p;->k:Lh2/p$b;

    invoke-virtual {v0, v2}, Lh2/p$b;->f(Lp3/w$c;)V

    iget-object v0, p0, Lh2/p;->k:Lh2/p$b;

    invoke-virtual {v0, v1}, Lh2/p$b;->e(Lp3/w$b;)V

    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    iget-object v2, v0, Lh2/u;->d:[B

    iget v0, v0, Lh2/u;->e:I

    invoke-static {v2, v1, v0}, Lp3/w;->l([BII)Lp3/w$c;

    move-result-object v0

    iget-object v1, p0, Lh2/p;->k:Lh2/p$b;

    invoke-virtual {v1, v0}, Lh2/p$b;->f(Lp3/w$c;)V

    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    :goto_0
    invoke-virtual {v0}, Lh2/u;->d()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lh2/p;->e:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lh2/p;->e:Lh2/u;

    iget-object v2, v0, Lh2/u;->d:[B

    iget v0, v0, Lh2/u;->e:I

    invoke-static {v2, v1, v0}, Lp3/w;->j([BII)Lp3/w$b;

    move-result-object v0

    iget-object v1, p0, Lh2/p;->k:Lh2/p$b;

    invoke-virtual {v1, v0}, Lh2/p$b;->e(Lp3/w$b;)V

    :goto_1
    iget-object v0, p0, Lh2/p;->e:Lh2/u;

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v0, p0, Lh2/p;->f:Lh2/u;

    invoke-virtual {v0, p4}, Lh2/u;->b(I)Z

    move-result p4

    if-eqz p4, :cond_4

    iget-object p4, p0, Lh2/p;->f:Lh2/u;

    iget-object v0, p4, Lh2/u;->d:[B

    iget p4, p4, Lh2/u;->e:I

    invoke-static {v0, p4}, Lp3/w;->q([BI)I

    move-result p4

    iget-object v0, p0, Lh2/p;->o:Lp3/a0;

    iget-object v1, p0, Lh2/p;->f:Lh2/u;

    iget-object v1, v1, Lh2/u;->d:[B

    invoke-virtual {v0, v1, p4}, Lp3/a0;->R([BI)V

    iget-object p4, p0, Lh2/p;->o:Lp3/a0;

    const/4 v0, 0x4

    invoke-virtual {p4, v0}, Lp3/a0;->T(I)V

    iget-object p4, p0, Lh2/p;->a:Lh2/d0;

    iget-object v0, p0, Lh2/p;->o:Lp3/a0;

    invoke-virtual {p4, p5, p6, v0}, Lh2/d0;->a(JLp3/a0;)V

    :cond_4
    iget-object v1, p0, Lh2/p;->k:Lh2/p$b;

    iget-boolean v5, p0, Lh2/p;->l:Z

    iget-boolean v6, p0, Lh2/p;->n:Z

    move-wide v2, p1

    move v4, p3

    invoke-virtual/range {v1 .. v6}, Lh2/p$b;->b(JIZZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    iput-boolean p1, p0, Lh2/p;->n:Z

    :cond_5
    return-void
.end method

.method private h([BII)V
    .locals 1

    iget-boolean v0, p0, Lh2/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh2/p;->k:Lh2/p$b;

    invoke-virtual {v0}, Lh2/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    invoke-virtual {v0, p1, p2, p3}, Lh2/u;->a([BII)V

    iget-object v0, p0, Lh2/p;->e:Lh2/u;

    invoke-virtual {v0, p1, p2, p3}, Lh2/u;->a([BII)V

    :cond_1
    iget-object v0, p0, Lh2/p;->f:Lh2/u;

    invoke-virtual {v0, p1, p2, p3}, Lh2/u;->a([BII)V

    iget-object v0, p0, Lh2/p;->k:Lh2/p$b;

    invoke-virtual {v0, p1, p2, p3}, Lh2/p$b;->a([BII)V

    return-void
.end method

.method private i(JIJ)V
    .locals 7

    iget-boolean v0, p0, Lh2/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh2/p;->k:Lh2/p$b;

    invoke-virtual {v0}, Lh2/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    invoke-virtual {v0, p3}, Lh2/u;->e(I)V

    iget-object v0, p0, Lh2/p;->e:Lh2/u;

    invoke-virtual {v0, p3}, Lh2/u;->e(I)V

    :cond_1
    iget-object v0, p0, Lh2/p;->f:Lh2/u;

    invoke-virtual {v0, p3}, Lh2/u;->e(I)V

    iget-object v1, p0, Lh2/p;->k:Lh2/p$b;

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lh2/p$b;->h(JIJ)V

    return-void
.end method


# virtual methods
.method public a(Lp3/a0;)V
    .locals 14

    invoke-direct {p0}, Lh2/p;->f()V

    invoke-virtual {p1}, Lp3/a0;->f()I

    move-result v0

    invoke-virtual {p1}, Lp3/a0;->g()I

    move-result v1

    invoke-virtual {p1}, Lp3/a0;->e()[B

    move-result-object v2

    iget-wide v3, p0, Lh2/p;->g:J

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Lh2/p;->g:J

    iget-object v3, p0, Lh2/p;->j:Lx1/e0;

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v4

    invoke-interface {v3, p1, v4}, Lx1/e0;->d(Lp3/a0;I)V

    :goto_0
    iget-object p1, p0, Lh2/p;->h:[Z

    invoke-static {v2, v0, v1, p1}, Lp3/w;->c([BII[Z)I

    move-result p1

    if-ne p1, v1, :cond_0

    invoke-direct {p0, v2, v0, v1}, Lh2/p;->h([BII)V

    return-void

    :cond_0
    invoke-static {v2, p1}, Lp3/w;->f([BI)I

    move-result v6

    sub-int v3, p1, v0

    if-lez v3, :cond_1

    invoke-direct {p0, v2, v0, p1}, Lh2/p;->h([BII)V

    :cond_1
    sub-int v10, v1, p1

    iget-wide v4, p0, Lh2/p;->g:J

    int-to-long v7, v10

    sub-long/2addr v4, v7

    if-gez v3, :cond_2

    neg-int v0, v3

    move v11, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_1
    iget-wide v12, p0, Lh2/p;->m:J

    move-object v7, p0

    move-wide v8, v4

    invoke-direct/range {v7 .. v13}, Lh2/p;->g(JIIJ)V

    iget-wide v7, p0, Lh2/p;->m:J

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lh2/p;->i(JIJ)V

    add-int/lit8 v0, p1, 0x3

    goto :goto_0
.end method

.method public b()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lh2/p;->g:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh2/p;->n:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/p;->m:J

    iget-object v0, p0, Lh2/p;->h:[Z

    invoke-static {v0}, Lp3/w;->a([Z)V

    iget-object v0, p0, Lh2/p;->d:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    iget-object v0, p0, Lh2/p;->e:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    iget-object v0, p0, Lh2/p;->f:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    iget-object v0, p0, Lh2/p;->k:Lh2/p$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh2/p$b;->g()V

    :cond_0
    return-void
.end method

.method public c(Lx1/n;Lh2/i0$d;)V
    .locals 4

    invoke-virtual {p2}, Lh2/i0$d;->a()V

    invoke-virtual {p2}, Lh2/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh2/p;->i:Ljava/lang/String;

    invoke-virtual {p2}, Lh2/i0$d;->c()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v0

    iput-object v0, p0, Lh2/p;->j:Lx1/e0;

    new-instance v1, Lh2/p$b;

    iget-boolean v2, p0, Lh2/p;->b:Z

    iget-boolean v3, p0, Lh2/p;->c:Z

    invoke-direct {v1, v0, v2, v3}, Lh2/p$b;-><init>(Lx1/e0;ZZ)V

    iput-object v1, p0, Lh2/p;->k:Lh2/p$b;

    iget-object v0, p0, Lh2/p;->a:Lh2/d0;

    invoke-virtual {v0, p1, p2}, Lh2/d0;->b(Lx1/n;Lh2/i0$d;)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(JI)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    iput-wide p1, p0, Lh2/p;->m:J

    :cond_0
    iget-boolean p1, p0, Lh2/p;->n:Z

    and-int/lit8 p2, p3, 0x2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p1, p2

    iput-boolean p1, p0, Lh2/p;->n:Z

    return-void
.end method
