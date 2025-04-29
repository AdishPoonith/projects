.class public final Lh2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/q$a;
    }
.end annotation


# instance fields
.field private final a:Lh2/d0;

.field private b:Ljava/lang/String;

.field private c:Lx1/e0;

.field private d:Lh2/q$a;

.field private e:Z

.field private final f:[Z

.field private final g:Lh2/u;

.field private final h:Lh2/u;

.field private final i:Lh2/u;

.field private final j:Lh2/u;

.field private final k:Lh2/u;

.field private l:J

.field private m:J

.field private final n:Lp3/a0;


# direct methods
.method public constructor <init>(Lh2/d0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/q;->a:Lh2/d0;

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lh2/q;->f:[Z

    new-instance p1, Lh2/u;

    const/16 v0, 0x20

    const/16 v1, 0x80

    invoke-direct {p1, v0, v1}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/q;->g:Lh2/u;

    new-instance p1, Lh2/u;

    const/16 v0, 0x21

    invoke-direct {p1, v0, v1}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/q;->h:Lh2/u;

    new-instance p1, Lh2/u;

    const/16 v0, 0x22

    invoke-direct {p1, v0, v1}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/q;->i:Lh2/u;

    new-instance p1, Lh2/u;

    const/16 v0, 0x27

    invoke-direct {p1, v0, v1}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/q;->j:Lh2/u;

    new-instance p1, Lh2/u;

    const/16 v0, 0x28

    invoke-direct {p1, v0, v1}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/q;->k:Lh2/u;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/q;->m:J

    new-instance p1, Lp3/a0;

    invoke-direct {p1}, Lp3/a0;-><init>()V

    iput-object p1, p0, Lh2/q;->n:Lp3/a0;

    return-void
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Lh2/q;->c:Lx1/e0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh2/q;->d:Lh2/q$a;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g(JIIJ)V
    .locals 2

    iget-object v0, p0, Lh2/q;->d:Lh2/q$a;

    iget-boolean v1, p0, Lh2/q;->e:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lh2/q$a;->a(JIZ)V

    iget-boolean p1, p0, Lh2/q;->e:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lh2/q;->g:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->b(I)Z

    iget-object p1, p0, Lh2/q;->h:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->b(I)Z

    iget-object p1, p0, Lh2/q;->i:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->b(I)Z

    iget-object p1, p0, Lh2/q;->g:Lh2/u;

    invoke-virtual {p1}, Lh2/u;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh2/q;->h:Lh2/u;

    invoke-virtual {p1}, Lh2/u;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh2/q;->i:Lh2/u;

    invoke-virtual {p1}, Lh2/u;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh2/q;->c:Lx1/e0;

    iget-object p2, p0, Lh2/q;->b:Ljava/lang/String;

    iget-object p3, p0, Lh2/q;->g:Lh2/u;

    iget-object v0, p0, Lh2/q;->h:Lh2/u;

    iget-object v1, p0, Lh2/q;->i:Lh2/u;

    invoke-static {p2, p3, v0, v1}, Lh2/q;->i(Ljava/lang/String;Lh2/u;Lh2/u;Lh2/u;)Ls1/n1;

    move-result-object p2

    invoke-interface {p1, p2}, Lx1/e0;->e(Ls1/n1;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh2/q;->e:Z

    :cond_0
    iget-object p1, p0, Lh2/q;->j:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->b(I)Z

    move-result p1

    const/4 p2, 0x5

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh2/q;->j:Lh2/u;

    iget-object p3, p1, Lh2/u;->d:[B

    iget p1, p1, Lh2/u;->e:I

    invoke-static {p3, p1}, Lp3/w;->q([BI)I

    move-result p1

    iget-object p3, p0, Lh2/q;->n:Lp3/a0;

    iget-object v0, p0, Lh2/q;->j:Lh2/u;

    iget-object v0, v0, Lh2/u;->d:[B

    invoke-virtual {p3, v0, p1}, Lp3/a0;->R([BI)V

    iget-object p1, p0, Lh2/q;->n:Lp3/a0;

    invoke-virtual {p1, p2}, Lp3/a0;->U(I)V

    iget-object p1, p0, Lh2/q;->a:Lh2/d0;

    iget-object p3, p0, Lh2/q;->n:Lp3/a0;

    invoke-virtual {p1, p5, p6, p3}, Lh2/d0;->a(JLp3/a0;)V

    :cond_1
    iget-object p1, p0, Lh2/q;->k:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->b(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh2/q;->k:Lh2/u;

    iget-object p3, p1, Lh2/u;->d:[B

    iget p1, p1, Lh2/u;->e:I

    invoke-static {p3, p1}, Lp3/w;->q([BI)I

    move-result p1

    iget-object p3, p0, Lh2/q;->n:Lp3/a0;

    iget-object p4, p0, Lh2/q;->k:Lh2/u;

    iget-object p4, p4, Lh2/u;->d:[B

    invoke-virtual {p3, p4, p1}, Lp3/a0;->R([BI)V

    iget-object p1, p0, Lh2/q;->n:Lp3/a0;

    invoke-virtual {p1, p2}, Lp3/a0;->U(I)V

    iget-object p1, p0, Lh2/q;->a:Lh2/d0;

    iget-object p2, p0, Lh2/q;->n:Lp3/a0;

    invoke-virtual {p1, p5, p6, p2}, Lh2/d0;->a(JLp3/a0;)V

    :cond_2
    return-void
.end method

.method private h([BII)V
    .locals 1

    iget-object v0, p0, Lh2/q;->d:Lh2/q$a;

    invoke-virtual {v0, p1, p2, p3}, Lh2/q$a;->e([BII)V

    iget-boolean v0, p0, Lh2/q;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh2/q;->g:Lh2/u;

    invoke-virtual {v0, p1, p2, p3}, Lh2/u;->a([BII)V

    iget-object v0, p0, Lh2/q;->h:Lh2/u;

    invoke-virtual {v0, p1, p2, p3}, Lh2/u;->a([BII)V

    iget-object v0, p0, Lh2/q;->i:Lh2/u;

    invoke-virtual {v0, p1, p2, p3}, Lh2/u;->a([BII)V

    :cond_0
    iget-object v0, p0, Lh2/q;->j:Lh2/u;

    invoke-virtual {v0, p1, p2, p3}, Lh2/u;->a([BII)V

    iget-object v0, p0, Lh2/q;->k:Lh2/u;

    invoke-virtual {v0, p1, p2, p3}, Lh2/u;->a([BII)V

    return-void
.end method

.method private static i(Ljava/lang/String;Lh2/u;Lh2/u;Lh2/u;)Ls1/n1;
    .locals 8

    iget v0, p1, Lh2/u;->e:I

    iget v1, p2, Lh2/u;->e:I

    add-int/2addr v1, v0

    iget v2, p3, Lh2/u;->e:I

    add-int/2addr v1, v2

    new-array v1, v1, [B

    iget-object v2, p1, Lh2/u;->d:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p2, Lh2/u;->d:[B

    iget v2, p1, Lh2/u;->e:I

    iget v4, p2, Lh2/u;->e:I

    invoke-static {v0, v3, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p3, Lh2/u;->d:[B

    iget p1, p1, Lh2/u;->e:I

    iget v2, p2, Lh2/u;->e:I

    add-int/2addr p1, v2

    iget p3, p3, Lh2/u;->e:I

    invoke-static {v0, v3, v1, p1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p2, Lh2/u;->d:[B

    iget p2, p2, Lh2/u;->e:I

    const/4 p3, 0x3

    invoke-static {p1, p3, p2}, Lp3/w;->h([BII)Lp3/w$a;

    move-result-object p1

    iget v2, p1, Lp3/w$a;->a:I

    iget-boolean v3, p1, Lp3/w$a;->b:Z

    iget v4, p1, Lp3/w$a;->c:I

    iget v5, p1, Lp3/w$a;->d:I

    iget-object v6, p1, Lp3/w$a;->e:[I

    iget v7, p1, Lp3/w$a;->f:I

    invoke-static/range {v2 .. v7}, Lp3/e;->c(IZII[II)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ls1/n1$b;

    invoke-direct {p3}, Ls1/n1$b;-><init>()V

    invoke-virtual {p3, p0}, Ls1/n1$b;->U(Ljava/lang/String;)Ls1/n1$b;

    move-result-object p0

    const-string p3, "video/hevc"

    invoke-virtual {p0, p3}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object p0

    invoke-virtual {p0, p2}, Ls1/n1$b;->K(Ljava/lang/String;)Ls1/n1$b;

    move-result-object p0

    iget p2, p1, Lp3/w$a;->h:I

    invoke-virtual {p0, p2}, Ls1/n1$b;->n0(I)Ls1/n1$b;

    move-result-object p0

    iget p2, p1, Lp3/w$a;->i:I

    invoke-virtual {p0, p2}, Ls1/n1$b;->S(I)Ls1/n1$b;

    move-result-object p0

    iget p1, p1, Lp3/w$a;->j:F

    invoke-virtual {p0, p1}, Ls1/n1$b;->c0(F)Ls1/n1$b;

    move-result-object p0

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls1/n1$b;->V(Ljava/util/List;)Ls1/n1$b;

    move-result-object p0

    invoke-virtual {p0}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p0

    return-object p0
.end method

.method private j(JIIJ)V
    .locals 8

    iget-object v0, p0, Lh2/q;->d:Lh2/q$a;

    iget-boolean v7, p0, Lh2/q;->e:Z

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move-wide v5, p5

    invoke-virtual/range {v0 .. v7}, Lh2/q$a;->g(JIIJZ)V

    iget-boolean p1, p0, Lh2/q;->e:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lh2/q;->g:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->e(I)V

    iget-object p1, p0, Lh2/q;->h:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->e(I)V

    iget-object p1, p0, Lh2/q;->i:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->e(I)V

    :cond_0
    iget-object p1, p0, Lh2/q;->j:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->e(I)V

    iget-object p1, p0, Lh2/q;->k:Lh2/u;

    invoke-virtual {p1, p4}, Lh2/u;->e(I)V

    return-void
.end method


# virtual methods
.method public a(Lp3/a0;)V
    .locals 16

    move-object/from16 v7, p0

    invoke-direct/range {p0 .. p0}, Lh2/q;->f()V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lp3/a0;->a()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->f()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->g()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->e()[B

    move-result-object v9

    iget-wide v1, v7, Lh2/q;->l:J

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->a()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v7, Lh2/q;->l:J

    iget-object v1, v7, Lh2/q;->c:Lx1/e0;

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->a()I

    move-result v2

    move-object/from16 v10, p1

    invoke-interface {v1, v10, v2}, Lx1/e0;->d(Lp3/a0;I)V

    :goto_0
    if-ge v0, v8, :cond_0

    iget-object v1, v7, Lh2/q;->f:[Z

    invoke-static {v9, v0, v8, v1}, Lp3/w;->c([BII[Z)I

    move-result v11

    if-ne v11, v8, :cond_1

    invoke-direct {v7, v9, v0, v8}, Lh2/q;->h([BII)V

    return-void

    :cond_1
    invoke-static {v9, v11}, Lp3/w;->e([BI)I

    move-result v12

    sub-int v1, v11, v0

    if-lez v1, :cond_2

    invoke-direct {v7, v9, v0, v11}, Lh2/q;->h([BII)V

    :cond_2
    sub-int v13, v8, v11

    iget-wide v2, v7, Lh2/q;->l:J

    int-to-long v4, v13

    sub-long v14, v2, v4

    if-gez v1, :cond_3

    neg-int v0, v1

    move v4, v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_1
    iget-wide v5, v7, Lh2/q;->m:J

    move-object/from16 v0, p0

    move-wide v1, v14

    move v3, v13

    invoke-direct/range {v0 .. v6}, Lh2/q;->g(JIIJ)V

    iget-wide v5, v7, Lh2/q;->m:J

    move v4, v12

    invoke-direct/range {v0 .. v6}, Lh2/q;->j(JIIJ)V

    add-int/lit8 v0, v11, 0x3

    goto :goto_0

    :cond_4
    return-void
.end method

.method public b()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lh2/q;->l:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/q;->m:J

    iget-object v0, p0, Lh2/q;->f:[Z

    invoke-static {v0}, Lp3/w;->a([Z)V

    iget-object v0, p0, Lh2/q;->g:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    iget-object v0, p0, Lh2/q;->h:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    iget-object v0, p0, Lh2/q;->i:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    iget-object v0, p0, Lh2/q;->j:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    iget-object v0, p0, Lh2/q;->k:Lh2/u;

    invoke-virtual {v0}, Lh2/u;->d()V

    iget-object v0, p0, Lh2/q;->d:Lh2/q$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh2/q$a;->f()V

    :cond_0
    return-void
.end method

.method public c(Lx1/n;Lh2/i0$d;)V
    .locals 2

    invoke-virtual {p2}, Lh2/i0$d;->a()V

    invoke-virtual {p2}, Lh2/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh2/q;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lh2/i0$d;->c()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v0

    iput-object v0, p0, Lh2/q;->c:Lx1/e0;

    new-instance v1, Lh2/q$a;

    invoke-direct {v1, v0}, Lh2/q$a;-><init>(Lx1/e0;)V

    iput-object v1, p0, Lh2/q;->d:Lh2/q$a;

    iget-object v0, p0, Lh2/q;->a:Lh2/d0;

    invoke-virtual {v0, p1, p2}, Lh2/d0;->b(Lx1/n;Lh2/i0$d;)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lh2/q;->m:J

    :cond_0
    return-void
.end method
