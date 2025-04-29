.class final Ls1/e2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls1/y3$b;

.field private final b:Ls1/y3$d;

.field private final c:Lt1/a;

.field private final d:Lp3/n;

.field private e:J

.field private f:I

.field private g:Z

.field private h:Ls1/b2;

.field private i:Ls1/b2;

.field private j:Ls1/b2;

.field private k:I

.field private l:Ljava/lang/Object;

.field private m:J


# direct methods
.method public constructor <init>(Lt1/a;Lp3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/e2;->c:Lt1/a;

    iput-object p2, p0, Ls1/e2;->d:Lp3/n;

    new-instance p1, Ls1/y3$b;

    invoke-direct {p1}, Ls1/y3$b;-><init>()V

    iput-object p1, p0, Ls1/e2;->a:Ls1/y3$b;

    new-instance p1, Ls1/y3$d;

    invoke-direct {p1}, Ls1/y3$d;-><init>()V

    iput-object p1, p0, Ls1/e2;->b:Ls1/y3$d;

    return-void
.end method

.method private static A(Ls1/y3;Ljava/lang/Object;JJLs1/y3$d;Ls1/y3$b;)Lu2/u$b;
    .locals 7

    invoke-virtual {p0, p1, p7}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    iget v0, p7, Ls1/y3$b;->l:I

    invoke-virtual {p0, v0, p6}, Ls1/y3;->r(ILs1/y3$d;)Ls1/y3$d;

    invoke-virtual {p0, p1}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result v0

    move-object v2, p1

    :goto_0
    iget-wide v3, p7, Ls1/y3$b;->m:J

    const/4 p1, -0x1

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_0

    invoke-virtual {p7}, Ls1/y3$b;->f()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p7}, Ls1/y3$b;->r()I

    move-result v1

    invoke-virtual {p7, v1}, Ls1/y3$b;->t(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p7, v5, v6}, Ls1/y3$b;->h(J)I

    move-result v1

    if-ne v1, p1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iget v3, p6, Ls1/y3$d;->y:I

    if-ge v0, v3, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, v1, p7, p1}, Ls1/y3;->k(ILs1/y3$b;Z)Ls1/y3$b;

    iget-object p1, p7, Ls1/y3$b;->k:Ljava/lang/Object;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, p7}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    invoke-virtual {p7, p2, p3}, Ls1/y3$b;->h(J)I

    move-result v3

    if-ne v3, p1, :cond_1

    invoke-virtual {p7, p2, p3}, Ls1/y3$b;->g(J)I

    move-result p0

    new-instance p1, Lu2/u$b;

    invoke-direct {p1, v2, p4, p5, p0}, Lu2/u$b;-><init>(Ljava/lang/Object;JI)V

    return-object p1

    :cond_1
    invoke-virtual {p7, v3}, Ls1/y3$b;->n(I)I

    move-result v4

    new-instance p0, Lu2/u$b;

    move-object v1, p0

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lu2/u$b;-><init>(Ljava/lang/Object;IIJ)V

    return-object p0
.end method

.method private C(Ls1/y3;Ljava/lang/Object;)J
    .locals 5

    iget-object v0, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {p1, p2, v0}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    move-result-object v0

    iget v0, v0, Ls1/y3$b;->l:I

    iget-object v1, p0, Ls1/e2;->l:Ljava/lang/Object;

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v2, :cond_0

    iget-object v3, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {p1, v1, v3}, Ls1/y3;->j(ILs1/y3$b;)Ls1/y3$b;

    move-result-object v1

    iget v1, v1, Ls1/y3$b;->l:I

    if-ne v1, v0, :cond_0

    iget-wide p1, p0, Ls1/e2;->m:J

    return-wide p1

    :cond_0
    iget-object v1, p0, Ls1/e2;->h:Ls1/b2;

    :goto_0
    if-eqz v1, :cond_2

    iget-object v3, v1, Ls1/b2;->b:Ljava/lang/Object;

    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    iget-object p1, v1, Ls1/b2;->f:Ls1/c2;

    iget-object p1, p1, Ls1/c2;->a:Lu2/u$b;

    iget-wide p1, p1, Lu2/s;->d:J

    return-wide p1

    :cond_1
    invoke-virtual {v1}, Ls1/b2;->j()Ls1/b2;

    move-result-object v1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ls1/e2;->h:Ls1/b2;

    :goto_2
    if-eqz v1, :cond_4

    iget-object v3, v1, Ls1/b2;->b:Ljava/lang/Object;

    invoke-virtual {p1, v3}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result v3

    if-eq v3, v2, :cond_3

    iget-object v4, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {p1, v3, v4}, Ls1/y3;->j(ILs1/y3$b;)Ls1/y3$b;

    move-result-object v3

    iget v3, v3, Ls1/y3$b;->l:I

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ls1/b2;->j()Ls1/b2;

    move-result-object v1

    goto :goto_2

    :cond_4
    iget-wide v0, p0, Ls1/e2;->e:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Ls1/e2;->e:J

    iget-object p1, p0, Ls1/e2;->h:Ls1/b2;

    if-nez p1, :cond_5

    iput-object p2, p0, Ls1/e2;->l:Ljava/lang/Object;

    iput-wide v0, p0, Ls1/e2;->m:J

    :cond_5
    return-wide v0
.end method

.method private E(Ls1/y3;)Z
    .locals 8

    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, v0, Ls1/b2;->b:Ljava/lang/Object;

    invoke-virtual {p1, v2}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result v2

    move v3, v2

    :goto_0
    iget-object v4, p0, Ls1/e2;->a:Ls1/y3$b;

    iget-object v5, p0, Ls1/e2;->b:Ls1/y3$d;

    iget v6, p0, Ls1/e2;->f:I

    iget-boolean v7, p0, Ls1/e2;->g:Z

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Ls1/y3;->h(ILs1/y3$b;Ls1/y3$d;IZ)I

    move-result v3

    :goto_1
    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Ls1/b2;->f:Ls1/c2;

    iget-boolean v2, v2, Ls1/c2;->g:Z

    if-nez v2, :cond_1

    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v2

    const/4 v4, -0x1

    if-eq v3, v4, :cond_4

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v4, v2, Ls1/b2;->b:Ljava/lang/Object;

    invoke-virtual {p1, v4}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v2

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {p0, v0}, Ls1/e2;->z(Ls1/b2;)Z

    move-result v2

    iget-object v3, v0, Ls1/b2;->f:Ls1/c2;

    invoke-virtual {p0, p1, v3}, Ls1/e2;->r(Ls1/y3;Ls1/c2;)Ls1/c2;

    move-result-object p1

    iput-object p1, v0, Ls1/b2;->f:Ls1/c2;

    xor-int/lit8 p1, v2, 0x1

    return p1
.end method

.method public static synthetic a(Ls1/e2;Lcom/google/common/collect/q$a;Lu2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/e2;->w(Lcom/google/common/collect/q$a;Lu2/u$b;)V

    return-void
.end method

.method private d(JJ)Z
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-eqz v2, :cond_1

    cmp-long v0, p1, p3

    if-nez v0, :cond_0

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

.method private e(Ls1/c2;Ls1/c2;)Z
    .locals 5

    iget-wide v0, p1, Ls1/c2;->b:J

    iget-wide v2, p2, Ls1/c2;->b:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object p1, p1, Ls1/c2;->a:Lu2/u$b;

    iget-object p2, p2, Ls1/c2;->a:Lu2/u$b;

    invoke-virtual {p1, p2}, Lu2/s;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private h(Ls1/z2;)Ls1/c2;
    .locals 7

    iget-object v1, p1, Ls1/z2;->a:Ls1/y3;

    iget-object v2, p1, Ls1/z2;->b:Lu2/u$b;

    iget-wide v3, p1, Ls1/z2;->c:J

    iget-wide v5, p1, Ls1/z2;->r:J

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ls1/e2;->k(Ls1/y3;Lu2/u$b;JJ)Ls1/c2;

    move-result-object p1

    return-object p1
.end method

.method private i(Ls1/y3;Ls1/b2;J)Ls1/c2;
    .locals 19

    move-object/from16 v9, p0

    move-object/from16 v8, p1

    move-object/from16 v10, p2

    iget-object v11, v10, Ls1/b2;->f:Ls1/c2;

    invoke-virtual/range {p2 .. p2}, Ls1/b2;->l()J

    move-result-wide v0

    iget-wide v2, v11, Ls1/c2;->e:J

    add-long/2addr v0, v2

    sub-long v6, v0, p3

    iget-boolean v0, v11, Ls1/c2;->g:Z

    const/4 v13, -0x1

    const/4 v14, 0x1

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v17, 0x0

    if-eqz v0, :cond_7

    iget-object v0, v11, Ls1/c2;->a:Lu2/u$b;

    iget-object v0, v0, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {v8, v0}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, v9, Ls1/e2;->a:Ls1/y3$b;

    iget-object v3, v9, Ls1/e2;->b:Ls1/y3$d;

    iget v0, v9, Ls1/e2;->f:I

    iget-boolean v5, v9, Ls1/e2;->g:Z

    move v4, v0

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Ls1/y3;->h(ILs1/y3$b;Ls1/y3$d;IZ)I

    move-result v0

    if-ne v0, v13, :cond_0

    return-object v17

    :cond_0
    iget-object v1, v9, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v8, v0, v1, v14}, Ls1/y3;->k(ILs1/y3$b;Z)Ls1/y3$b;

    move-result-object v1

    iget v3, v1, Ls1/y3$b;->l:I

    iget-object v1, v9, Ls1/e2;->a:Ls1/y3$b;

    iget-object v1, v1, Ls1/y3$b;->k:Ljava/lang/Object;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v11, Ls1/c2;->a:Lu2/u$b;

    iget-wide v4, v2, Lu2/s;->d:J

    iget-object v2, v9, Ls1/e2;->b:Ls1/y3$d;

    invoke-virtual {v8, v3, v2}, Ls1/y3;->r(ILs1/y3$d;)Ls1/y3$d;

    move-result-object v2

    iget v2, v2, Ls1/y3$d;->x:I

    if-ne v2, v0, :cond_3

    iget-object v1, v9, Ls1/e2;->b:Ls1/y3$d;

    iget-object v2, v9, Ls1/e2;->a:Ls1/y3$b;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v7}, Ls1/y3;->o(Ls1/y3$d;Ls1/y3$b;IJJ)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v17

    :cond_1
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual/range {p2 .. p2}, Ls1/b2;->j()Ls1/b2;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v2, v0, Ls1/b2;->b:Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Ls1/b2;->f:Ls1/c2;

    iget-object v0, v0, Ls1/c2;->a:Lu2/u$b;

    iget-wide v2, v0, Lu2/s;->d:J

    goto :goto_0

    :cond_2
    iget-wide v2, v9, Ls1/e2;->e:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v2

    iput-wide v6, v9, Ls1/e2;->e:J

    :goto_0
    move-wide v12, v4

    move-wide/from16 v17, v15

    move-wide v4, v2

    goto :goto_1

    :cond_3
    const-wide/16 v12, 0x0

    move-wide/from16 v17, v12

    :goto_1
    iget-object v6, v9, Ls1/e2;->b:Ls1/y3$d;

    iget-object v7, v9, Ls1/e2;->a:Ls1/y3$b;

    move-object/from16 v0, p1

    move-wide v2, v12

    invoke-static/range {v0 .. v7}, Ls1/e2;->A(Ls1/y3;Ljava/lang/Object;JJLs1/y3$d;Ls1/y3$b;)Lu2/u$b;

    move-result-object v2

    cmp-long v0, v17, v15

    if-eqz v0, :cond_6

    iget-wide v0, v11, Ls1/c2;->c:J

    cmp-long v3, v0, v15

    if-eqz v3, :cond_6

    iget-object v0, v11, Ls1/c2;->a:Lu2/u$b;

    iget-object v0, v0, Lu2/s;->a:Ljava/lang/Object;

    iget-object v1, v9, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v8, v0, v1}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    move-result-object v0

    invoke-virtual {v0}, Ls1/y3$b;->f()I

    move-result v0

    if-lez v0, :cond_4

    iget-object v0, v9, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v0}, Ls1/y3$b;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Ls1/y3$b;->t(I)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const/4 v14, 0x0

    :goto_2
    invoke-virtual {v2}, Lu2/s;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v14, :cond_5

    iget-wide v0, v11, Ls1/c2;->c:J

    move-wide v3, v0

    move-wide v5, v12

    goto :goto_4

    :cond_5
    if-eqz v14, :cond_6

    iget-wide v0, v11, Ls1/c2;->c:J

    move-wide v5, v0

    goto :goto_3

    :cond_6
    move-wide v5, v12

    :goto_3
    move-wide/from16 v3, v17

    :goto_4
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v6}, Ls1/e2;->k(Ls1/y3;Lu2/u$b;JJ)Ls1/c2;

    move-result-object v0

    return-object v0

    :cond_7
    const/4 v0, -0x1

    const-wide/16 v12, 0x0

    iget-object v10, v11, Ls1/c2;->a:Lu2/u$b;

    iget-object v1, v10, Lu2/s;->a:Ljava/lang/Object;

    iget-object v2, v9, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v8, v1, v2}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    invoke-virtual {v10}, Lu2/s;->b()Z

    move-result v1

    if-eqz v1, :cond_c

    iget v3, v10, Lu2/s;->b:I

    iget-object v1, v9, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v1, v3}, Ls1/y3$b;->d(I)I

    move-result v1

    if-ne v1, v0, :cond_8

    return-object v17

    :cond_8
    iget-object v0, v9, Ls1/e2;->a:Ls1/y3$b;

    iget v2, v10, Lu2/s;->c:I

    invoke-virtual {v0, v3, v2}, Ls1/y3$b;->o(II)I

    move-result v4

    if-ge v4, v1, :cond_9

    iget-object v2, v10, Lu2/s;->a:Ljava/lang/Object;

    iget-wide v5, v11, Ls1/c2;->c:J

    iget-wide v10, v10, Lu2/s;->d:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v10

    invoke-direct/range {v0 .. v8}, Ls1/e2;->l(Ls1/y3;Ljava/lang/Object;IIJJ)Ls1/c2;

    move-result-object v0

    return-object v0

    :cond_9
    iget-wide v0, v11, Ls1/c2;->c:J

    cmp-long v2, v0, v15

    if-nez v2, :cond_b

    iget-object v1, v9, Ls1/e2;->b:Ls1/y3$d;

    iget-object v2, v9, Ls1/e2;->a:Ls1/y3$b;

    iget v3, v2, Ls1/y3$b;->l:I

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v7}, Ls1/y3;->o(Ls1/y3$d;Ls1/y3$b;IJJ)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_a

    return-object v17

    :cond_a
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :cond_b
    iget-object v2, v10, Lu2/s;->a:Ljava/lang/Object;

    iget v3, v10, Lu2/s;->b:I

    invoke-direct {v9, v8, v2, v3}, Ls1/e2;->n(Ls1/y3;Ljava/lang/Object;I)J

    move-result-wide v2

    iget-object v4, v10, Lu2/s;->a:Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-wide v11, v11, Ls1/c2;->c:J

    iget-wide v13, v10, Lu2/s;->d:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v4

    move-wide v3, v5

    move-wide v5, v11

    move-wide v7, v13

    invoke-direct/range {v0 .. v8}, Ls1/e2;->m(Ls1/y3;Ljava/lang/Object;JJJ)Ls1/c2;

    move-result-object v0

    return-object v0

    :cond_c
    iget-object v0, v9, Ls1/e2;->a:Ls1/y3$b;

    iget v1, v10, Lu2/s;->e:I

    invoke-virtual {v0, v1}, Ls1/y3$b;->n(I)I

    move-result v4

    iget-object v0, v9, Ls1/e2;->a:Ls1/y3$b;

    iget v1, v10, Lu2/s;->e:I

    invoke-virtual {v0, v1}, Ls1/y3$b;->t(I)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, v9, Ls1/e2;->a:Ls1/y3$b;

    iget v1, v10, Lu2/s;->e:I

    invoke-virtual {v0, v1, v4}, Ls1/y3$b;->k(II)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_d

    const/4 v12, 0x1

    goto :goto_5

    :cond_d
    const/4 v12, 0x0

    :goto_5
    iget-object v0, v9, Ls1/e2;->a:Ls1/y3$b;

    iget v1, v10, Lu2/s;->e:I

    invoke-virtual {v0, v1}, Ls1/y3$b;->d(I)I

    move-result v0

    if-eq v4, v0, :cond_f

    if-eqz v12, :cond_e

    goto :goto_6

    :cond_e
    iget-object v2, v10, Lu2/s;->a:Ljava/lang/Object;

    iget v3, v10, Lu2/s;->e:I

    iget-wide v5, v11, Ls1/c2;->e:J

    iget-wide v10, v10, Lu2/s;->d:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v10

    invoke-direct/range {v0 .. v8}, Ls1/e2;->l(Ls1/y3;Ljava/lang/Object;IIJJ)Ls1/c2;

    move-result-object v0

    return-object v0

    :cond_f
    :goto_6
    iget-object v0, v10, Lu2/s;->a:Ljava/lang/Object;

    iget v1, v10, Lu2/s;->e:I

    invoke-direct {v9, v8, v0, v1}, Ls1/e2;->n(Ls1/y3;Ljava/lang/Object;I)J

    move-result-wide v3

    iget-object v2, v10, Lu2/s;->a:Ljava/lang/Object;

    iget-wide v5, v11, Ls1/c2;->e:J

    iget-wide v10, v10, Lu2/s;->d:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v10

    invoke-direct/range {v0 .. v8}, Ls1/e2;->m(Ls1/y3;Ljava/lang/Object;JJJ)Ls1/c2;

    move-result-object v0

    return-object v0
.end method

.method private k(Ls1/y3;Lu2/u$b;JJ)Ls1/c2;
    .locals 12

    move-object v0, p2

    iget-object v1, v0, Lu2/s;->a:Ljava/lang/Object;

    move-object v11, p0

    iget-object v2, v11, Ls1/e2;->a:Ls1/y3$b;

    move-object v3, p1

    invoke-virtual {p1, v1, v2}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    invoke-virtual {p2}, Lu2/s;->b()Z

    move-result v1

    iget-object v4, v0, Lu2/s;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget v5, v0, Lu2/s;->b:I

    iget v6, v0, Lu2/s;->c:I

    iget-wide v9, v0, Lu2/s;->d:J

    move-object v2, p0

    move-object v3, p1

    move-wide v7, p3

    invoke-direct/range {v2 .. v10}, Ls1/e2;->l(Ls1/y3;Ljava/lang/Object;IIJJ)Ls1/c2;

    move-result-object v0

    return-object v0

    :cond_0
    iget-wide v9, v0, Lu2/s;->d:J

    move-object v2, p0

    move-object v3, p1

    move-wide/from16 v5, p5

    move-wide v7, p3

    invoke-direct/range {v2 .. v10}, Ls1/e2;->m(Ls1/y3;Ljava/lang/Object;JJJ)Ls1/c2;

    move-result-object v0

    return-object v0
.end method

.method private l(Ls1/y3;Ljava/lang/Object;IIJJ)Ls1/c2;
    .locals 18

    move-object/from16 v0, p0

    new-instance v7, Lu2/u$b;

    move-object v1, v7

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-wide/from16 v5, p7

    invoke-direct/range {v1 .. v6}, Lu2/u$b;-><init>(Ljava/lang/Object;IIJ)V

    iget-object v1, v7, Lu2/s;->a:Ljava/lang/Object;

    iget-object v2, v0, Ls1/e2;->a:Ls1/y3$b;

    move-object/from16 v3, p1

    invoke-virtual {v3, v1, v2}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    move-result-object v1

    iget v2, v7, Lu2/s;->b:I

    iget v3, v7, Lu2/s;->c:I

    invoke-virtual {v1, v2, v3}, Ls1/y3$b;->e(II)J

    move-result-wide v9

    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    move/from16 v2, p3

    invoke-virtual {v1, v2}, Ls1/y3$b;->n(I)I

    move-result v1

    const-wide/16 v2, 0x0

    if-ne v4, v1, :cond_0

    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v1}, Ls1/y3$b;->j()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    move-wide v4, v2

    :goto_0
    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    iget v6, v7, Lu2/s;->b:I

    invoke-virtual {v1, v6}, Ls1/y3$b;->t(I)Z

    move-result v11

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v9, v12

    if-eqz v1, :cond_1

    cmp-long v1, v4, v9

    if-ltz v1, :cond_1

    const-wide/16 v4, 0x1

    sub-long v4, v9, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    move-wide v3, v1

    goto :goto_1

    :cond_1
    move-wide v3, v4

    :goto_1
    new-instance v15, Ls1/c2;

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v1, v15

    move-object v2, v7

    move-wide/from16 v5, p5

    move-wide v7, v12

    move v12, v14

    move/from16 v13, v16

    move/from16 v14, v17

    invoke-direct/range {v1 .. v14}, Ls1/c2;-><init>(Lu2/u$b;JJJJZZZZ)V

    return-object v15
.end method

.method private m(Ls1/y3;Ljava/lang/Object;JJJ)Ls1/c2;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    iget-object v5, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v1, v2, v5}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    iget-object v5, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v5, v3, v4}, Ls1/y3$b;->g(J)I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, -0x1

    const/4 v8, 0x0

    iget-object v9, v0, Ls1/e2;->a:Ls1/y3$b;

    if-ne v5, v7, :cond_0

    invoke-virtual {v9}, Ls1/y3$b;->f()I

    move-result v9

    if-lez v9, :cond_1

    iget-object v9, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v9}, Ls1/y3$b;->r()I

    move-result v10

    invoke-virtual {v9, v10}, Ls1/y3$b;->t(I)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v5}, Ls1/y3$b;->t(I)Z

    move-result v9

    if-eqz v9, :cond_1

    iget-object v9, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v9, v5}, Ls1/y3$b;->i(I)J

    move-result-wide v9

    iget-object v11, v0, Ls1/e2;->a:Ls1/y3$b;

    iget-wide v12, v11, Ls1/y3$b;->m:J

    cmp-long v14, v9, v12

    if-nez v14, :cond_1

    invoke-virtual {v11, v5}, Ls1/y3$b;->s(I)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v5, -0x1

    :goto_0
    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    new-instance v11, Lu2/u$b;

    move-wide/from16 v12, p7

    invoke-direct {v11, v2, v12, v13, v5}, Lu2/u$b;-><init>(Ljava/lang/Object;JI)V

    invoke-direct {v0, v11}, Ls1/e2;->s(Lu2/u$b;)Z

    move-result v2

    invoke-direct {v0, v1, v11}, Ls1/e2;->u(Ls1/y3;Lu2/u$b;)Z

    move-result v22

    invoke-direct {v0, v1, v11, v2}, Ls1/e2;->t(Ls1/y3;Lu2/u$b;Z)Z

    move-result v23

    if-eq v5, v7, :cond_2

    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v1, v5}, Ls1/y3$b;->t(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v20, 0x1

    goto :goto_2

    :cond_2
    const/16 v20, 0x0

    :goto_2
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v5, v7, :cond_3

    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v1, v5}, Ls1/y3$b;->i(I)J

    move-result-wide v14

    :goto_3
    move-wide/from16 v16, v14

    goto :goto_4

    :cond_3
    if-eqz v9, :cond_4

    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    iget-wide v14, v1, Ls1/y3$b;->m:J

    goto :goto_3

    :cond_4
    move-wide/from16 v16, v12

    :goto_4
    cmp-long v1, v16, v12

    if-eqz v1, :cond_6

    const-wide/high16 v14, -0x8000000000000000L

    cmp-long v1, v16, v14

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    move-wide/from16 v18, v16

    goto :goto_6

    :cond_6
    :goto_5
    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    iget-wide v14, v1, Ls1/y3$b;->m:J

    move-wide/from16 v18, v14

    :goto_6
    cmp-long v1, v18, v12

    if-eqz v1, :cond_9

    cmp-long v1, v3, v18

    if-ltz v1, :cond_9

    if-nez v23, :cond_8

    if-nez v9, :cond_7

    goto :goto_7

    :cond_7
    const/4 v6, 0x0

    :cond_8
    :goto_7
    const-wide/16 v3, 0x0

    int-to-long v5, v6

    sub-long v5, v18, v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_9
    move-wide v12, v3

    new-instance v1, Ls1/c2;

    move-object v10, v1

    move-wide/from16 v14, p5

    move/from16 v21, v2

    invoke-direct/range {v10 .. v23}, Ls1/c2;-><init>(Lu2/u$b;JJJJZZZZ)V

    return-object v1
.end method

.method private n(Ls1/y3;Ljava/lang/Object;I)J
    .locals 3

    iget-object v0, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {p1, p2, v0}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    iget-object p1, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {p1, p3}, Ls1/y3$b;->i(I)J

    move-result-wide p1

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    iget-object p1, p0, Ls1/e2;->a:Ls1/y3$b;

    iget-wide p1, p1, Ls1/y3$b;->m:J

    return-wide p1

    :cond_0
    iget-object v0, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v0, p3}, Ls1/y3$b;->l(I)J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method

.method private s(Lu2/u$b;)Z
    .locals 1

    invoke-virtual {p1}, Lu2/s;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget p1, p1, Lu2/s;->e:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private t(Ls1/y3;Lu2/u$b;Z)Z
    .locals 6

    iget-object p2, p2, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result v1

    iget-object p2, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {p1, v1, p2}, Ls1/y3;->j(ILs1/y3$b;)Ls1/y3$b;

    move-result-object p2

    iget p2, p2, Ls1/y3$b;->l:I

    iget-object v0, p0, Ls1/e2;->b:Ls1/y3$d;

    invoke-virtual {p1, p2, v0}, Ls1/y3;->r(ILs1/y3$d;)Ls1/y3$d;

    move-result-object p2

    iget-boolean p2, p2, Ls1/y3$d;->r:Z

    if-nez p2, :cond_0

    iget-object v2, p0, Ls1/e2;->a:Ls1/y3$b;

    iget-object v3, p0, Ls1/e2;->b:Ls1/y3$d;

    iget v4, p0, Ls1/e2;->f:I

    iget-boolean v5, p0, Ls1/e2;->g:Z

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ls1/y3;->v(ILs1/y3$b;Ls1/y3$d;IZ)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private u(Ls1/y3;Lu2/u$b;)Z
    .locals 3

    invoke-direct {p0, p2}, Ls1/e2;->s(Lu2/u$b;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p2, Lu2/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {p1, v0, v2}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    move-result-object v0

    iget v0, v0, Ls1/y3$b;->l:I

    iget-object p2, p2, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result p2

    iget-object v2, p0, Ls1/e2;->b:Ls1/y3$d;

    invoke-virtual {p1, v0, v2}, Ls1/y3;->r(ILs1/y3$d;)Ls1/y3$d;

    move-result-object p1

    iget p1, p1, Ls1/y3$d;->y:I

    if-ne p1, p2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private synthetic w(Lcom/google/common/collect/q$a;Lu2/u$b;)V
    .locals 1

    iget-object v0, p0, Ls1/e2;->c:Lt1/a;

    invoke-virtual {p1}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lt1/a;->Z(Ljava/util/List;Lu2/u$b;)V

    return-void
.end method

.method private x()V
    .locals 4

    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object v0

    iget-object v1, p0, Ls1/e2;->h:Ls1/b2;

    :goto_0
    if-eqz v1, :cond_0

    iget-object v2, v1, Ls1/b2;->f:Ls1/c2;

    iget-object v2, v2, Ls1/c2;->a:Lu2/u$b;

    invoke-virtual {v0, v2}, Lcom/google/common/collect/q$a;->f(Ljava/lang/Object;)Lcom/google/common/collect/q$a;

    invoke-virtual {v1}, Ls1/b2;->j()Ls1/b2;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ls1/e2;->i:Ls1/b2;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v1, v1, Ls1/b2;->f:Ls1/c2;

    iget-object v1, v1, Ls1/c2;->a:Lu2/u$b;

    :goto_1
    iget-object v2, p0, Ls1/e2;->d:Lp3/n;

    new-instance v3, Ls1/d2;

    invoke-direct {v3, p0, v0, v1}, Ls1/d2;-><init>(Ls1/e2;Lcom/google/common/collect/q$a;Lu2/u$b;)V

    invoke-interface {v2, v3}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public B(Ls1/y3;Ljava/lang/Object;J)Lu2/u$b;
    .locals 10

    invoke-direct {p0, p1, p2}, Ls1/e2;->C(Ls1/y3;Ljava/lang/Object;)J

    move-result-wide v4

    iget-object v0, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {p1, p2, v0}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    iget-object v0, p0, Ls1/e2;->a:Ls1/y3$b;

    iget v0, v0, Ls1/y3$b;->l:I

    iget-object v1, p0, Ls1/e2;->b:Ls1/y3$d;

    invoke-virtual {p1, v0, v1}, Ls1/y3;->r(ILs1/y3$d;)Ls1/y3$d;

    invoke-virtual {p1, p2}, Ls1/y3;->f(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Ls1/e2;->b:Ls1/y3$d;

    iget v3, v3, Ls1/y3$d;->x:I

    if-lt v0, v3, :cond_3

    iget-object v3, p0, Ls1/e2;->a:Ls1/y3$b;

    const/4 v6, 0x1

    invoke-virtual {p1, v0, v3, v6}, Ls1/y3;->k(ILs1/y3$b;Z)Ls1/y3$b;

    iget-object v3, p0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v3}, Ls1/y3$b;->f()I

    move-result v3

    if-lez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    or-int/2addr v2, v6

    iget-object v3, p0, Ls1/e2;->a:Ls1/y3$b;

    iget-wide v7, v3, Ls1/y3$b;->m:J

    invoke-virtual {v3, v7, v8}, Ls1/y3$b;->h(J)I

    move-result v3

    const/4 v7, -0x1

    if-eq v3, v7, :cond_1

    iget-object p2, p0, Ls1/e2;->a:Ls1/y3$b;

    iget-object p2, p2, Ls1/y3$b;->k:Ljava/lang/Object;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :cond_1
    if-eqz v2, :cond_2

    if-eqz v6, :cond_3

    iget-object v3, p0, Ls1/e2;->a:Ls1/y3$b;

    iget-wide v6, v3, Ls1/y3$b;->m:J

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    :goto_2
    move-object v1, p2

    iget-object v6, p0, Ls1/e2;->b:Ls1/y3$d;

    iget-object v7, p0, Ls1/e2;->a:Ls1/y3$b;

    move-object v0, p1

    move-wide v2, p3

    invoke-static/range {v0 .. v7}, Ls1/e2;->A(Ls1/y3;Ljava/lang/Object;JJLs1/y3$d;Ls1/y3$b;)Lu2/u$b;

    move-result-object p1

    return-object p1
.end method

.method public D()Z
    .locals 5

    iget-object v0, p0, Ls1/e2;->j:Ls1/b2;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ls1/b2;->f:Ls1/c2;

    iget-boolean v1, v1, Ls1/c2;->i:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ls1/b2;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/e2;->j:Ls1/b2;

    iget-object v0, v0, Ls1/b2;->f:Ls1/c2;

    iget-wide v0, v0, Ls1/c2;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget v0, p0, Ls1/e2;->k:I

    const/16 v1, 0x64

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public F(Ls1/y3;JJ)Z
    .locals 8

    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    if-eqz v0, :cond_8

    iget-object v3, v0, Ls1/b2;->f:Ls1/c2;

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, v3}, Ls1/e2;->r(Ls1/y3;Ls1/c2;)Ls1/c2;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1, v1, p2, p3}, Ls1/e2;->i(Ls1/y3;Ls1/b2;J)Ls1/c2;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-virtual {p0, v1}, Ls1/e2;->z(Ls1/b2;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_1
    invoke-direct {p0, v3, v4}, Ls1/e2;->e(Ls1/c2;Ls1/c2;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {p0, v1}, Ls1/e2;->z(Ls1/b2;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_2
    move-object v1, v4

    :goto_1
    iget-wide v4, v3, Ls1/c2;->c:J

    invoke-virtual {v1, v4, v5}, Ls1/c2;->a(J)Ls1/c2;

    move-result-object v4

    iput-object v4, v0, Ls1/b2;->f:Ls1/c2;

    iget-wide v3, v3, Ls1/c2;->e:J

    iget-wide v5, v1, Ls1/c2;->e:J

    invoke-direct {p0, v3, v4, v5, v6}, Ls1/e2;->d(JJ)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {v0}, Ls1/b2;->A()V

    iget-wide p1, v1, Ls1/c2;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v3

    if-nez p3, :cond_3

    const-wide p1, 0x7fffffffffffffffL

    goto :goto_2

    :cond_3
    invoke-virtual {v0, p1, p2}, Ls1/b2;->z(J)J

    move-result-wide p1

    :goto_2
    iget-object p3, p0, Ls1/e2;->i:Ls1/b2;

    const/4 v1, 0x0

    if-ne v0, p3, :cond_5

    iget-object p3, v0, Ls1/b2;->f:Ls1/c2;

    iget-boolean p3, p3, Ls1/c2;->f:Z

    if-nez p3, :cond_5

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long p3, p4, v3

    if-eqz p3, :cond_4

    cmp-long p3, p4, p1

    if-ltz p3, :cond_5

    :cond_4
    const/4 p1, 0x1

    goto :goto_3

    :cond_5
    const/4 p1, 0x0

    :goto_3
    invoke-virtual {p0, v0}, Ls1/e2;->z(Ls1/b2;)Z

    move-result p2

    if-nez p2, :cond_6

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    return v2

    :cond_7
    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_0

    :cond_8
    return v2
.end method

.method public G(Ls1/y3;I)Z
    .locals 0

    iput p2, p0, Ls1/e2;->f:I

    invoke-direct {p0, p1}, Ls1/e2;->E(Ls1/y3;)Z

    move-result p1

    return p1
.end method

.method public H(Ls1/y3;Z)Z
    .locals 0

    iput-boolean p2, p0, Ls1/e2;->g:Z

    invoke-direct {p0, p1}, Ls1/e2;->E(Ls1/y3;)Z

    move-result p1

    return p1
.end method

.method public b()Ls1/b2;
    .locals 3

    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, p0, Ls1/e2;->i:Ls1/b2;

    if-ne v0, v2, :cond_1

    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v0

    iput-object v0, p0, Ls1/e2;->i:Ls1/b2;

    :cond_1
    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    invoke-virtual {v0}, Ls1/b2;->t()V

    iget v0, p0, Ls1/e2;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ls1/e2;->k:I

    if-nez v0, :cond_2

    iput-object v1, p0, Ls1/e2;->j:Ls1/b2;

    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    iget-object v1, v0, Ls1/b2;->b:Ljava/lang/Object;

    iput-object v1, p0, Ls1/e2;->l:Ljava/lang/Object;

    iget-object v0, v0, Ls1/b2;->f:Ls1/c2;

    iget-object v0, v0, Ls1/c2;->a:Lu2/u$b;

    iget-wide v0, v0, Lu2/s;->d:J

    iput-wide v0, p0, Ls1/e2;->m:J

    :cond_2
    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v0

    iput-object v0, p0, Ls1/e2;->h:Ls1/b2;

    invoke-direct {p0}, Ls1/e2;->x()V

    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    return-object v0
.end method

.method public c()Ls1/b2;
    .locals 1

    iget-object v0, p0, Ls1/e2;->i:Ls1/b2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Ls1/e2;->i:Ls1/b2;

    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v0

    iput-object v0, p0, Ls1/e2;->i:Ls1/b2;

    invoke-direct {p0}, Ls1/e2;->x()V

    iget-object v0, p0, Ls1/e2;->i:Ls1/b2;

    return-object v0
.end method

.method public f()V
    .locals 3

    iget v0, p0, Ls1/e2;->k:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/b2;

    iget-object v1, v0, Ls1/b2;->b:Ljava/lang/Object;

    iput-object v1, p0, Ls1/e2;->l:Ljava/lang/Object;

    iget-object v1, v0, Ls1/b2;->f:Ls1/c2;

    iget-object v1, v1, Ls1/c2;->a:Lu2/u$b;

    iget-wide v1, v1, Lu2/s;->d:J

    iput-wide v1, p0, Ls1/e2;->m:J

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ls1/b2;->t()V

    invoke-virtual {v0}, Ls1/b2;->j()Ls1/b2;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Ls1/e2;->h:Ls1/b2;

    iput-object v0, p0, Ls1/e2;->j:Ls1/b2;

    iput-object v0, p0, Ls1/e2;->i:Ls1/b2;

    const/4 v0, 0x0

    iput v0, p0, Ls1/e2;->k:I

    invoke-direct {p0}, Ls1/e2;->x()V

    return-void
.end method

.method public g([Ls1/n3;Ln3/c0;Lo3/b;Ls1/t2;Ls1/c2;Ln3/d0;)Ls1/b2;
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Ls1/e2;->j:Ls1/b2;

    if-nez v1, :cond_0

    const-wide v1, 0xe8d4a51000L

    move-object/from16 v10, p5

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ls1/b2;->l()J

    move-result-wide v1

    iget-object v3, v0, Ls1/e2;->j:Ls1/b2;

    iget-object v3, v3, Ls1/b2;->f:Ls1/c2;

    iget-wide v3, v3, Ls1/c2;->e:J

    add-long/2addr v1, v3

    move-object/from16 v10, p5

    iget-wide v3, v10, Ls1/c2;->b:J

    sub-long/2addr v1, v3

    :goto_0
    move-wide v5, v1

    new-instance v1, Ls1/b2;

    move-object v3, v1

    move-object v4, p1

    move-object v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    invoke-direct/range {v3 .. v11}, Ls1/b2;-><init>([Ls1/n3;JLn3/c0;Lo3/b;Ls1/t2;Ls1/c2;Ln3/d0;)V

    iget-object v2, v0, Ls1/e2;->j:Ls1/b2;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Ls1/b2;->w(Ls1/b2;)V

    goto :goto_1

    :cond_1
    iput-object v1, v0, Ls1/e2;->h:Ls1/b2;

    iput-object v1, v0, Ls1/e2;->i:Ls1/b2;

    :goto_1
    const/4 v2, 0x0

    iput-object v2, v0, Ls1/e2;->l:Ljava/lang/Object;

    iput-object v1, v0, Ls1/e2;->j:Ls1/b2;

    iget v2, v0, Ls1/e2;->k:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Ls1/e2;->k:I

    invoke-direct {p0}, Ls1/e2;->x()V

    return-object v1
.end method

.method public j()Ls1/b2;
    .locals 1

    iget-object v0, p0, Ls1/e2;->j:Ls1/b2;

    return-object v0
.end method

.method public o(JLs1/z2;)Ls1/c2;
    .locals 1

    iget-object v0, p0, Ls1/e2;->j:Ls1/b2;

    if-nez v0, :cond_0

    invoke-direct {p0, p3}, Ls1/e2;->h(Ls1/z2;)Ls1/c2;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p3, p3, Ls1/z2;->a:Ls1/y3;

    invoke-direct {p0, p3, v0, p1, p2}, Ls1/e2;->i(Ls1/y3;Ls1/b2;J)Ls1/c2;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public p()Ls1/b2;
    .locals 1

    iget-object v0, p0, Ls1/e2;->h:Ls1/b2;

    return-object v0
.end method

.method public q()Ls1/b2;
    .locals 1

    iget-object v0, p0, Ls1/e2;->i:Ls1/b2;

    return-object v0
.end method

.method public r(Ls1/y3;Ls1/c2;)Ls1/c2;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v2, Ls1/c2;->a:Lu2/u$b;

    invoke-direct {v0, v3}, Ls1/e2;->s(Lu2/u$b;)Z

    move-result v12

    invoke-direct {v0, v1, v3}, Ls1/e2;->u(Ls1/y3;Lu2/u$b;)Z

    move-result v13

    invoke-direct {v0, v1, v3, v12}, Ls1/e2;->t(Ls1/y3;Lu2/u$b;Z)Z

    move-result v14

    iget-object v4, v2, Ls1/c2;->a:Lu2/u$b;

    iget-object v4, v4, Lu2/s;->a:Ljava/lang/Object;

    iget-object v5, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v1, v4, v5}, Ls1/y3;->l(Ljava/lang/Object;Ls1/y3$b;)Ls1/y3$b;

    invoke-virtual {v3}, Lu2/s;->b()Z

    move-result v1

    const/4 v4, -0x1

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_1

    iget v1, v3, Lu2/s;->e:I

    if-ne v1, v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v7, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v7, v1}, Ls1/y3$b;->i(I)J

    move-result-wide v7

    goto :goto_1

    :cond_1
    :goto_0
    move-wide v7, v5

    :goto_1
    invoke-virtual {v3}, Lu2/s;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    iget v5, v3, Lu2/s;->b:I

    iget v6, v3, Lu2/s;->c:I

    invoke-virtual {v1, v5, v6}, Ls1/y3$b;->e(II)J

    move-result-wide v5

    :goto_2
    move-wide v9, v5

    goto :goto_4

    :cond_2
    cmp-long v1, v7, v5

    if-eqz v1, :cond_4

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v1, v7, v5

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    move-wide v9, v7

    goto :goto_4

    :cond_4
    :goto_3
    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v1}, Ls1/y3$b;->m()J

    move-result-wide v5

    goto :goto_2

    :goto_4
    invoke-virtual {v3}, Lu2/s;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Ls1/e2;->a:Ls1/y3$b;

    iget v4, v3, Lu2/s;->b:I

    invoke-virtual {v1, v4}, Ls1/y3$b;->t(I)Z

    move-result v1

    move v11, v1

    goto :goto_5

    :cond_5
    iget v1, v3, Lu2/s;->e:I

    if-eq v1, v4, :cond_6

    iget-object v4, v0, Ls1/e2;->a:Ls1/y3$b;

    invoke-virtual {v4, v1}, Ls1/y3$b;->t(I)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    const/4 v11, 0x1

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    const/4 v11, 0x0

    :goto_5
    new-instance v15, Ls1/c2;

    iget-wide v4, v2, Ls1/c2;->b:J

    iget-wide v1, v2, Ls1/c2;->c:J

    move-wide/from16 v16, v1

    move-object v1, v15

    move-object v2, v3

    move-wide v3, v4

    move-wide/from16 v5, v16

    invoke-direct/range {v1 .. v14}, Ls1/c2;-><init>(Lu2/u$b;JJJJZZZZ)V

    return-object v15
.end method

.method public v(Lu2/r;)Z
    .locals 1

    iget-object v0, p0, Ls1/e2;->j:Ls1/b2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ls1/b2;->a:Lu2/r;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public y(J)V
    .locals 1

    iget-object v0, p0, Ls1/e2;->j:Ls1/b2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ls1/b2;->s(J)V

    :cond_0
    return-void
.end method

.method public z(Ls1/b2;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lp3/a;->f(Z)V

    iget-object v2, p0, Ls1/e2;->j:Ls1/b2;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    iput-object p1, p0, Ls1/e2;->j:Ls1/b2;

    :goto_1
    invoke-virtual {p1}, Ls1/b2;->j()Ls1/b2;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ls1/b2;->j()Ls1/b2;

    move-result-object p1

    iget-object v2, p0, Ls1/e2;->i:Ls1/b2;

    if-ne p1, v2, :cond_2

    iget-object v1, p0, Ls1/e2;->h:Ls1/b2;

    iput-object v1, p0, Ls1/e2;->i:Ls1/b2;

    const/4 v1, 0x1

    :cond_2
    invoke-virtual {p1}, Ls1/b2;->t()V

    iget v2, p0, Ls1/e2;->k:I

    sub-int/2addr v2, v0

    iput v2, p0, Ls1/e2;->k:I

    goto :goto_1

    :cond_3
    iget-object p1, p0, Ls1/e2;->j:Ls1/b2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls1/b2;->w(Ls1/b2;)V

    invoke-direct {p0}, Ls1/e2;->x()V

    return v1
.end method
