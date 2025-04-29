.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.super Lu2/a;
.source "SourceFile"

# interfaces
.implements La3/l$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
    }
.end annotation


# instance fields
.field private final A:J

.field private final B:Ls1/v1;

.field private C:Ls1/v1$g;

.field private D:Lo3/p0;

.field private final q:Lz2/h;

.field private final r:Ls1/v1$h;

.field private final s:Lz2/g;

.field private final t:Lu2/h;

.field private final u:Lw1/y;

.field private final v:Lo3/g0;

.field private final w:Z

.field private final x:I

.field private final y:Z

.field private final z:La3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.hls"

    invoke-static {v0}, Ls1/k1;->a(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ls1/v1;Lz2/g;Lz2/h;Lu2/h;Lw1/y;Lo3/g0;La3/l;JZIZ)V
    .locals 1

    invoke-direct {p0}, Lu2/a;-><init>()V

    iget-object v0, p1, Ls1/v1;->k:Ls1/v1$h;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/v1$h;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Ls1/v1$h;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Ls1/v1;

    iget-object p1, p1, Ls1/v1;->m:Ls1/v1$g;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Ls1/v1$g;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lz2/g;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:Lz2/h;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Lu2/h;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lw1/y;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Lo3/g0;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:La3/l;

    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:J

    iput-boolean p10, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Z

    iput p11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:I

    iput-boolean p12, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Z

    return-void
.end method

.method synthetic constructor <init>(Ls1/v1;Lz2/g;Lz2/h;Lu2/h;Lw1/y;Lo3/g0;La3/l;JZIZLcom/google/android/exoplayer2/source/hls/HlsMediaSource$a;)V
    .locals 0

    invoke-direct/range {p0 .. p12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;-><init>(Ls1/v1;Lz2/g;Lz2/h;Lu2/h;Lw1/y;Lo3/g0;La3/l;JZIZ)V

    return-void
.end method

.method private F(La3/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lu2/q0;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v1, La3/g;->h:J

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:La3/l;

    invoke-interface {v4}, La3/l;->m()J

    move-result-wide v4

    sub-long v17, v2, v4

    iget-boolean v2, v1, La3/g;->o:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_0

    iget-wide v5, v1, La3/g;->u:J

    add-long v5, v17, v5

    move-wide v13, v5

    goto :goto_0

    :cond_0
    move-wide v13, v3

    :goto_0
    invoke-direct/range {p0 .. p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->J(La3/g;)J

    move-result-wide v11

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Ls1/v1$g;

    iget-wide v5, v2, Ls1/v1$g;->j:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_1

    invoke-static {v5, v6}, Lp3/n0;->B0(J)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    invoke-static {v1, v11, v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->L(La3/g;J)J

    move-result-wide v2

    :goto_1
    move-wide v5, v2

    iget-wide v2, v1, La3/g;->u:J

    add-long v9, v2, v11

    move-wide v7, v11

    invoke-static/range {v5 .. v10}, Lp3/n0;->r(JJJ)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->M(La3/g;J)V

    invoke-direct {v0, v1, v11, v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->K(La3/g;J)J

    move-result-wide v19

    iget v2, v1, La3/g;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    iget-boolean v2, v1, La3/g;->f:Z

    if-eqz v2, :cond_2

    const/16 v23, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    const/16 v23, 0x0

    :goto_2
    new-instance v2, Lu2/q0;

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v9, v1, La3/g;->u:J

    const/16 v21, 0x1

    iget-boolean v1, v1, La3/g;->o:Z

    xor-int/lit8 v22, v1, 0x1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Ls1/v1;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Ls1/v1$g;

    move-object/from16 v26, v1

    move-object v6, v2

    move-wide/from16 v7, p2

    move-wide v3, v9

    move-wide/from16 v9, p4

    move-wide v15, v3

    move-object/from16 v24, p6

    invoke-direct/range {v6 .. v26}, Lu2/q0;-><init>(JJJJJJJZZZLjava/lang/Object;Ls1/v1;Ls1/v1$g;)V

    return-object v2
.end method

.method private G(La3/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lu2/q0;
    .locals 24

    move-object/from16 v0, p1

    iget-wide v1, v0, La3/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    iget-object v1, v0, La3/g;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v1, v0, La3/g;->g:Z

    if-nez v1, :cond_2

    iget-wide v1, v0, La3/g;->e:J

    iget-wide v3, v0, La3/g;->u:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v0, La3/g;->r:Ljava/util/List;

    invoke-static {v3, v1, v2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->I(Ljava/util/List;J)La3/g$d;

    move-result-object v1

    iget-wide v1, v1, La3/g$e;->n:J

    goto :goto_2

    :cond_2
    :goto_0
    iget-wide v1, v0, La3/g;->e:J

    goto :goto_2

    :cond_3
    :goto_1
    const-wide/16 v1, 0x0

    :goto_2
    move-wide/from16 v16, v1

    new-instance v1, Lu2/q0;

    move-object v3, v1

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v10, v0, La3/g;->u:J

    move-wide v12, v10

    const-wide/16 v14, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Ls1/v1;

    move-object/from16 v22, v2

    const/16 v23, 0x0

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-object/from16 v21, p6

    invoke-direct/range {v3 .. v23}, Lu2/q0;-><init>(JJJJJJJZZZLjava/lang/Object;Ls1/v1;Ls1/v1$g;)V

    return-object v1
.end method

.method private static H(Ljava/util/List;J)La3/g$b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La3/g$b;",
            ">;J)",
            "La3/g$b;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/g$b;

    iget-wide v3, v2, La3/g$e;->n:J

    cmp-long v5, v3, p1

    if-gtz v5, :cond_0

    iget-boolean v5, v2, La3/g$b;->u:Z

    if-eqz v5, :cond_0

    move-object v0, v2

    goto :goto_1

    :cond_0
    cmp-long v2, v3, p1

    if-lez v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v0
.end method

.method private static I(Ljava/util/List;J)La3/g$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La3/g$d;",
            ">;J)",
            "La3/g$d;"
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p0, p1, p2, p2}, Lp3/n0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La3/g$d;

    return-object p0
.end method

.method private J(La3/g;)J
    .locals 4

    iget-boolean v0, p1, La3/g;->p:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:J

    invoke-static {v0, v1}, Lp3/n0;->a0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp3/n0;->B0(J)J

    move-result-wide v0

    invoke-virtual {p1}, La3/g;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method private K(La3/g;J)J
    .locals 5

    iget-wide v0, p1, La3/g;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p1, La3/g;->u:J

    add-long/2addr v0, p2

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Ls1/v1$g;

    iget-wide p2, p2, Ls1/v1$g;->j:J

    invoke-static {p2, p3}, Lp3/n0;->B0(J)J

    move-result-wide p2

    sub-long/2addr v0, p2

    :goto_0
    iget-boolean p2, p1, La3/g;->g:Z

    if-eqz p2, :cond_1

    return-wide v0

    :cond_1
    iget-object p2, p1, La3/g;->s:Ljava/util/List;

    invoke-static {p2, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H(Ljava/util/List;J)La3/g$b;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-wide p1, p2, La3/g$e;->n:J

    return-wide p1

    :cond_2
    iget-object p2, p1, La3/g;->r:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_3
    iget-object p1, p1, La3/g;->r:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->I(Ljava/util/List;J)La3/g$d;

    move-result-object p1

    iget-object p2, p1, La3/g$d;->v:Ljava/util/List;

    invoke-static {p2, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H(Ljava/util/List;J)La3/g$b;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-wide p1, p2, La3/g$e;->n:J

    return-wide p1

    :cond_4
    iget-wide p1, p1, La3/g$e;->n:J

    return-wide p1
.end method

.method private static L(La3/g;J)J
    .locals 8

    iget-object v0, p0, La3/g;->v:La3/g$f;

    iget-wide v1, p0, La3/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v3, p0, La3/g;->u:J

    sub-long/2addr v3, v1

    goto :goto_0

    :cond_0
    iget-wide v1, v0, La3/g$f;->d:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, p0, La3/g;->n:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_1

    move-wide v3, v1

    goto :goto_0

    :cond_1
    iget-wide v0, v0, La3/g$f;->c:J

    cmp-long v2, v0, v3

    if-eqz v2, :cond_2

    move-wide v3, v0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x3

    iget-wide v2, p0, La3/g;->m:J

    mul-long v3, v2, v0

    :goto_0
    add-long/2addr v3, p1

    return-wide v3
.end method

.method private M(La3/g;J)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Ls1/v1;

    iget-object v0, v0, Ls1/v1;->m:Ls1/v1$g;

    iget v1, v0, Ls1/v1$g;->m:F

    const v2, -0x800001

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    iget v0, v0, Ls1/v1$g;->n:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    iget-object p1, p1, La3/g;->v:La3/g$f;

    iget-wide v0, p1, La3/g$f;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p1, La3/g$f;->d:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Ls1/v1$g$a;

    invoke-direct {v0}, Ls1/v1$g$a;-><init>()V

    invoke-static {p2, p3}, Lp3/n0;->Y0(J)J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Ls1/v1$g$a;->k(J)Ls1/v1$g$a;

    move-result-object p2

    const/high16 p3, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Ls1/v1$g;

    iget v0, v0, Ls1/v1$g;->m:F

    :goto_1
    invoke-virtual {p2, v0}, Ls1/v1$g$a;->j(F)Ls1/v1$g$a;

    move-result-object p2

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Ls1/v1$g;

    iget p3, p1, Ls1/v1$g;->n:F

    :goto_2
    invoke-virtual {p2, p3}, Ls1/v1$g$a;->h(F)Ls1/v1$g$a;

    move-result-object p1

    invoke-virtual {p1}, Ls1/v1$g$a;->f()Ls1/v1$g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Ls1/v1$g;

    return-void
.end method


# virtual methods
.method protected C(Lo3/p0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lo3/p0;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lw1/y;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Lu2/a;->A()Lt1/t1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lw1/y;->e(Landroid/os/Looper;Lt1/t1;)V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lw1/y;

    invoke-interface {p1}, Lw1/y;->b()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lu2/a;->w(Lu2/u$b;)Lu2/b0$a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:La3/l;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Ls1/v1$h;

    iget-object v1, v1, Ls1/v1$h;->a:Landroid/net/Uri;

    invoke-interface {v0, v1, p1, p0}, La3/l;->g(Landroid/net/Uri;Lu2/b0$a;La3/l$e;)V

    return-void
.end method

.method protected E()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:La3/l;

    invoke-interface {v0}, La3/l;->stop()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lw1/y;

    invoke-interface {v0}, Lw1/y;->a()V

    return-void
.end method

.method public a()Ls1/v1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Ls1/v1;

    return-object v0
.end method

.method public b(Lu2/r;)V
    .locals 0

    check-cast p1, Lz2/k;

    invoke-virtual {p1}, Lz2/k;->B()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:La3/l;

    invoke-interface {v0}, La3/l;->f()V

    return-void
.end method

.method public m(La3/g;)V
    .locals 12

    iget-boolean v0, p1, La3/g;->p:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    iget-wide v3, p1, La3/g;->h:J

    invoke-static {v3, v4}, Lp3/n0;->Y0(J)J

    move-result-wide v3

    move-wide v9, v3

    goto :goto_0

    :cond_0
    move-wide v9, v1

    :goto_0
    iget v0, p1, La3/g;->d:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move-wide v7, v1

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v7, v9

    :goto_2
    new-instance v11, Lcom/google/android/exoplayer2/source/hls/a;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:La3/l;

    invoke-interface {v0}, La3/l;->b()La3/h;

    move-result-object v0

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/h;

    invoke-direct {v11, v0, p1}, Lcom/google/android/exoplayer2/source/hls/a;-><init>(La3/h;La3/g;)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:La3/l;

    invoke-interface {v0}, La3/l;->a()Z

    move-result v0

    move-object v5, p0

    move-object v6, p1

    if-eqz v0, :cond_3

    invoke-direct/range {v5 .. v11}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F(La3/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lu2/q0;

    move-result-object p1

    goto :goto_3

    :cond_3
    invoke-direct/range {v5 .. v11}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G(La3/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lu2/q0;

    move-result-object p1

    :goto_3
    invoke-virtual {p0, p1}, Lu2/a;->D(Ls1/y3;)V

    return-void
.end method

.method public n(Lu2/u$b;Lo3/b;J)Lu2/r;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p1}, Lu2/a;->w(Lu2/u$b;)Lu2/b0$a;

    move-result-object v9

    invoke-virtual/range {p0 .. p1}, Lu2/a;->t(Lu2/u$b;)Lw1/w$a;

    move-result-object v7

    new-instance v16, Lz2/k;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:Lz2/h;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:La3/l;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lz2/g;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lo3/p0;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lw1/y;

    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Lo3/g0;

    iget-object v11, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Lu2/h;

    iget-boolean v12, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Z

    iget v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:I

    iget-boolean v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Z

    invoke-virtual/range {p0 .. p0}, Lu2/a;->A()Lt1/t1;

    move-result-object v15

    move-object/from16 v1, v16

    move-object/from16 v10, p2

    invoke-direct/range {v1 .. v15}, Lz2/k;-><init>(Lz2/h;La3/l;Lz2/g;Lo3/p0;Lw1/y;Lw1/w$a;Lo3/g0;Lu2/b0$a;Lo3/b;Lu2/h;ZIZLt1/t1;)V

    return-object v16
.end method
