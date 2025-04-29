.class final La3/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/h0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo3/h0$b<",
        "Lo3/j0<",
        "La3/i;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final j:Landroid/net/Uri;

.field private final k:Lo3/h0;

.field private final l:Lo3/l;

.field private m:La3/g;

.field private n:J

.field private o:J

.field private p:J

.field private q:J

.field private r:Z

.field private s:Ljava/io/IOException;

.field final synthetic t:La3/c;


# direct methods
.method public constructor <init>(La3/c;Landroid/net/Uri;)V
    .locals 1

    iput-object p1, p0, La3/c$c;->t:La3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La3/c$c;->j:Landroid/net/Uri;

    new-instance p2, Lo3/h0;

    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    invoke-direct {p2, v0}, Lo3/h0;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, La3/c$c;->k:Lo3/h0;

    invoke-static {p1}, La3/c;->B(La3/c;)Lz2/g;

    move-result-object p1

    const/4 p2, 0x4

    invoke-interface {p1, p2}, Lz2/g;->a(I)Lo3/l;

    move-result-object p1

    iput-object p1, p0, La3/c$c;->l:Lo3/l;

    return-void
.end method

.method public static synthetic a(La3/c$c;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, La3/c$c;->m(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic b(La3/c$c;J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, La3/c$c;->h(J)Z

    move-result p0

    return p0
.end method

.method static synthetic c(La3/c$c;La3/g;Lu2/n;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La3/c$c;->w(La3/g;Lu2/n;)V

    return-void
.end method

.method static synthetic d(La3/c$c;)J
    .locals 2

    iget-wide v0, p0, La3/c$c;->q:J

    return-wide v0
.end method

.method static synthetic e(La3/c$c;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, La3/c$c;->j:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic f(La3/c$c;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, La3/c$c;->q(Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic g(La3/c$c;)La3/g;
    .locals 0

    iget-object p0, p0, La3/c$c;->m:La3/g;

    return-object p0
.end method

.method private h(J)Z
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p1

    iput-wide v0, p0, La3/c$c;->q:J

    iget-object p1, p0, La3/c$c;->j:Landroid/net/Uri;

    iget-object p2, p0, La3/c$c;->t:La3/c;

    invoke-static {p2}, La3/c;->w(La3/c;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, La3/c$c;->t:La3/c;

    invoke-static {p1}, La3/c;->x(La3/c;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private j()Landroid/net/Uri;
    .locals 7

    iget-object v0, p0, La3/c$c;->m:La3/g;

    if-eqz v0, :cond_5

    iget-object v0, v0, La3/g;->v:La3/g$f;

    iget-wide v1, v0, La3/g$f;->a:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    iget-boolean v0, v0, La3/g$f;->e:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La3/c$c;->j:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    iget-object v1, p0, La3/c$c;->m:La3/g;

    iget-object v2, v1, La3/g;->v:La3/g$f;

    iget-boolean v2, v2, La3/g$f;->e:Z

    if-eqz v2, :cond_2

    iget-wide v5, v1, La3/g;->k:J

    iget-object v1, v1, La3/g;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-long v1, v1

    add-long/2addr v5, v1

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_HLS_msn"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    iget-object v1, p0, La3/c$c;->m:La3/g;

    iget-wide v5, v1, La3/g;->n:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_2

    iget-object v1, v1, La3/g;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v1}, Lcom/google/common/collect/t;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La3/g$b;

    iget-boolean v1, v1, La3/g$b;->v:Z

    if-eqz v1, :cond_1

    add-int/lit8 v2, v2, -0x1

    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_HLS_part"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_2
    iget-object v1, p0, La3/c$c;->m:La3/g;

    iget-object v1, v1, La3/g;->v:La3/g$f;

    iget-wide v5, v1, La3/g$f;->a:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_4

    iget-boolean v1, v1, La3/g$f;->b:Z

    if-eqz v1, :cond_3

    const-string v1, "v2"

    goto :goto_0

    :cond_3
    const-string v1, "YES"

    :goto_0
    const-string v2, "_HLS_skip"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_5
    :goto_1
    iget-object v0, p0, La3/c$c;->j:Landroid/net/Uri;

    return-object v0
.end method

.method private synthetic m(Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, La3/c$c;->r:Z

    invoke-direct {p0, p1}, La3/c$c;->p(Landroid/net/Uri;)V

    return-void
.end method

.method private p(Landroid/net/Uri;)V
    .locals 8

    iget-object v0, p0, La3/c$c;->t:La3/c;

    invoke-static {v0}, La3/c;->r(La3/c;)La3/k;

    move-result-object v0

    iget-object v1, p0, La3/c$c;->t:La3/c;

    invoke-static {v1}, La3/c;->q(La3/c;)La3/h;

    move-result-object v1

    iget-object v2, p0, La3/c$c;->m:La3/g;

    invoke-interface {v0, v1, v2}, La3/k;->a(La3/h;La3/g;)Lo3/j0$a;

    move-result-object v0

    new-instance v1, Lo3/j0;

    iget-object v2, p0, La3/c$c;->l:Lo3/l;

    const/4 v3, 0x4

    invoke-direct {v1, v2, p1, v3, v0}, Lo3/j0;-><init>(Lo3/l;Landroid/net/Uri;ILo3/j0$a;)V

    iget-object p1, p0, La3/c$c;->k:Lo3/h0;

    iget-object v0, p0, La3/c$c;->t:La3/c;

    invoke-static {v0}, La3/c;->D(La3/c;)Lo3/g0;

    move-result-object v0

    iget v2, v1, Lo3/j0;->c:I

    invoke-interface {v0, v2}, Lo3/g0;->d(I)I

    move-result v0

    invoke-virtual {p1, v1, p0, v0}, Lo3/h0;->n(Lo3/h0$e;Lo3/h0$b;I)J

    move-result-wide v6

    iget-object p1, p0, La3/c$c;->t:La3/c;

    invoke-static {p1}, La3/c;->C(La3/c;)Lu2/b0$a;

    move-result-object p1

    new-instance v0, Lu2/n;

    iget-wide v3, v1, Lo3/j0;->a:J

    iget-object v5, v1, Lo3/j0;->b:Lo3/p;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lu2/n;-><init>(JLo3/p;J)V

    iget v1, v1, Lo3/j0;->c:I

    invoke-virtual {p1, v0, v1}, Lu2/b0$a;->z(Lu2/n;I)V

    return-void
.end method

.method private q(Landroid/net/Uri;)V
    .locals 6

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La3/c$c;->q:J

    iget-boolean v0, p0, La3/c$c;->r:Z

    if-nez v0, :cond_2

    iget-object v0, p0, La3/c$c;->k:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->j()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, La3/c$c;->k:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, La3/c$c;->p:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, La3/c$c;->r:Z

    iget-object v2, p0, La3/c$c;->t:La3/c;

    invoke-static {v2}, La3/c;->p(La3/c;)Landroid/os/Handler;

    move-result-object v2

    new-instance v3, La3/d;

    invoke-direct {v3, p0, p1}, La3/d;-><init>(La3/c$c;Landroid/net/Uri;)V

    iget-wide v4, p0, La3/c$c;->p:J

    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, La3/c$c;->p(Landroid/net/Uri;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private w(La3/g;Lu2/n;)V
    .locals 13

    iget-object v0, p0, La3/c$c;->m:La3/g;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, La3/c$c;->n:J

    iget-object v3, p0, La3/c$c;->t:La3/c;

    invoke-static {v3, v0, p1}, La3/c;->s(La3/c;La3/g;La3/g;)La3/g;

    move-result-object v3

    iput-object v3, p0, La3/c$c;->m:La3/g;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v0, :cond_0

    iput-object v5, p0, La3/c$c;->s:Ljava/io/IOException;

    iput-wide v1, p0, La3/c$c;->o:J

    iget-object p1, p0, La3/c$c;->t:La3/c;

    iget-object p2, p0, La3/c$c;->j:Landroid/net/Uri;

    invoke-static {p1, p2, v3}, La3/c;->t(La3/c;Landroid/net/Uri;La3/g;)V

    goto :goto_1

    :cond_0
    iget-boolean v3, v3, La3/g;->o:Z

    if-nez v3, :cond_3

    iget-wide v7, p1, La3/g;->k:J

    iget-object p1, p1, La3/g;->r:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    int-to-long v9, p1

    add-long/2addr v7, v9

    iget-object p1, p0, La3/c$c;->m:La3/g;

    iget-wide v9, p1, La3/g;->k:J

    cmp-long v3, v7, v9

    if-gez v3, :cond_1

    new-instance v5, La3/l$c;

    iget-object p1, p0, La3/c$c;->j:Landroid/net/Uri;

    invoke-direct {v5, p1}, La3/l$c;-><init>(Landroid/net/Uri;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    iget-wide v7, p0, La3/c$c;->o:J

    sub-long v7, v1, v7

    long-to-double v7, v7

    iget-wide v9, p1, La3/g;->m:J

    invoke-static {v9, v10}, Lp3/n0;->Y0(J)J

    move-result-wide v9

    long-to-double v9, v9

    iget-object p1, p0, La3/c$c;->t:La3/c;

    invoke-static {p1}, La3/c;->v(La3/c;)D

    move-result-wide v11

    mul-double v9, v9, v11

    cmpl-double p1, v7, v9

    if-lez p1, :cond_2

    new-instance v5, La3/l$d;

    iget-object p1, p0, La3/c$c;->j:Landroid/net/Uri;

    invoke-direct {v5, p1}, La3/l$d;-><init>(Landroid/net/Uri;)V

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz v5, :cond_3

    iput-object v5, p0, La3/c$c;->s:Ljava/io/IOException;

    iget-object v3, p0, La3/c$c;->t:La3/c;

    iget-object v7, p0, La3/c$c;->j:Landroid/net/Uri;

    new-instance v8, Lo3/g0$c;

    new-instance v9, Lu2/q;

    const/4 v10, 0x4

    invoke-direct {v9, v10}, Lu2/q;-><init>(I)V

    invoke-direct {v8, p2, v9, v5, v6}, Lo3/g0$c;-><init>(Lu2/n;Lu2/q;Ljava/io/IOException;I)V

    invoke-static {v3, v7, v8, p1}, La3/c;->n(La3/c;Landroid/net/Uri;Lo3/g0$c;Z)Z

    :cond_3
    :goto_1
    const-wide/16 p1, 0x0

    iget-object v3, p0, La3/c$c;->m:La3/g;

    iget-object v5, v3, La3/g;->v:La3/g$f;

    iget-boolean v5, v5, La3/g$f;->e:Z

    if-nez v5, :cond_5

    iget-wide p1, v3, La3/g;->m:J

    if-eq v3, v0, :cond_4

    goto :goto_2

    :cond_4
    const-wide/16 v7, 0x2

    div-long/2addr p1, v7

    :cond_5
    :goto_2
    invoke-static {p1, p2}, Lp3/n0;->Y0(J)J

    move-result-wide p1

    add-long/2addr v1, p1

    iput-wide v1, p0, La3/c$c;->p:J

    iget-object p1, p0, La3/c$c;->m:La3/g;

    iget-wide p1, p1, La3/g;->n:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_6

    iget-object p1, p0, La3/c$c;->j:Landroid/net/Uri;

    iget-object p2, p0, La3/c$c;->t:La3/c;

    invoke-static {p2}, La3/c;->w(La3/c;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    const/4 v4, 0x1

    :cond_7
    if-eqz v4, :cond_8

    iget-object p1, p0, La3/c$c;->m:La3/g;

    iget-boolean p1, p1, La3/g;->o:Z

    if-nez p1, :cond_8

    invoke-direct {p0}, La3/c$c;->j()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {p0, p1}, La3/c$c;->q(Landroid/net/Uri;)V

    :cond_8
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lo3/h0$e;JJZ)V
    .locals 0

    check-cast p1, Lo3/j0;

    invoke-virtual/range {p0 .. p6}, La3/c$c;->s(Lo3/j0;JJZ)V

    return-void
.end method

.method public k()La3/g;
    .locals 1

    iget-object v0, p0, La3/c$c;->m:La3/g;

    return-object v0
.end method

.method public l()Z
    .locals 10

    iget-object v0, p0, La3/c$c;->m:La3/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/16 v4, 0x7530

    iget-object v0, p0, La3/c$c;->m:La3/g;

    iget-wide v6, v0, La3/g;->u:J

    invoke-static {v6, v7}, Lp3/n0;->Y0(J)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iget-object v0, p0, La3/c$c;->m:La3/g;

    iget-boolean v6, v0, La3/g;->o:Z

    const/4 v7, 0x1

    if-nez v6, :cond_1

    iget v0, v0, La3/g;->d:I

    const/4 v6, 0x2

    if-eq v0, v6, :cond_1

    if-eq v0, v7, :cond_1

    iget-wide v8, p0, La3/c$c;->n:J

    add-long/2addr v8, v4

    cmp-long v0, v8, v2

    if-lez v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, La3/c$c;->j:Landroid/net/Uri;

    invoke-direct {p0, v0}, La3/c$c;->q(Landroid/net/Uri;)V

    return-void
.end method

.method public bridge synthetic o(Lo3/h0$e;JJ)V
    .locals 0

    check-cast p1, Lo3/j0;

    invoke-virtual/range {p0 .. p5}, La3/c$c;->t(Lo3/j0;JJ)V

    return-void
.end method

.method public r()V
    .locals 1

    iget-object v0, p0, La3/c$c;->k:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->b()V

    iget-object v0, p0, La3/c$c;->s:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public s(Lo3/j0;JJZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/j0<",
            "La3/i;",
            ">;JJZ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    new-instance v14, Lu2/n;

    iget-wide v3, v1, Lo3/j0;->a:J

    iget-object v5, v1, Lo3/j0;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->a()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, La3/c$c;->t:La3/c;

    invoke-static {v2}, La3/c;->D(La3/c;)Lo3/g0;

    move-result-object v2

    iget-wide v3, v1, Lo3/j0;->a:J

    invoke-interface {v2, v3, v4}, Lo3/g0;->a(J)V

    iget-object v1, v0, La3/c$c;->t:La3/c;

    invoke-static {v1}, La3/c;->C(La3/c;)Lu2/b0$a;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v14, v2}, Lu2/b0$a;->q(Lu2/n;I)V

    return-void
.end method

.method public t(Lo3/j0;JJ)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/j0<",
            "La3/i;",
            ">;JJ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/i;

    new-instance v15, Lu2/n;

    iget-wide v4, v1, Lo3/j0;->a:J

    iget-object v6, v1, Lo3/j0;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->d()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->a()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    instance-of v3, v2, La3/g;

    const/4 v4, 0x4

    if-eqz v3, :cond_0

    check-cast v2, La3/g;

    invoke-direct {v0, v2, v15}, La3/c$c;->w(La3/g;Lu2/n;)V

    iget-object v2, v0, La3/c$c;->t:La3/c;

    invoke-static {v2}, La3/c;->C(La3/c;)Lu2/b0$a;

    move-result-object v2

    invoke-virtual {v2, v15, v4}, Lu2/b0$a;->t(Lu2/n;I)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const-string v3, "Loaded playlist has unexpected type."

    invoke-static {v3, v2}, Ls1/u2;->c(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object v2

    iput-object v2, v0, La3/c$c;->s:Ljava/io/IOException;

    iget-object v2, v0, La3/c$c;->t:La3/c;

    invoke-static {v2}, La3/c;->C(La3/c;)Lu2/b0$a;

    move-result-object v2

    iget-object v3, v0, La3/c$c;->s:Ljava/io/IOException;

    const/4 v5, 0x1

    invoke-virtual {v2, v15, v4, v3, v5}, Lu2/b0$a;->x(Lu2/n;ILjava/io/IOException;Z)V

    :goto_0
    iget-object v2, v0, La3/c$c;->t:La3/c;

    invoke-static {v2}, La3/c;->D(La3/c;)Lo3/g0;

    move-result-object v2

    iget-wide v3, v1, Lo3/j0;->a:J

    invoke-interface {v2, v3, v4}, Lo3/g0;->a(J)V

    return-void
.end method

.method public bridge synthetic u(Lo3/h0$e;JJLjava/io/IOException;I)Lo3/h0$c;
    .locals 0

    check-cast p1, Lo3/j0;

    invoke-virtual/range {p0 .. p7}, La3/c$c;->v(Lo3/j0;JJLjava/io/IOException;I)Lo3/h0$c;

    move-result-object p1

    return-object p1
.end method

.method public v(Lo3/j0;JJLjava/io/IOException;I)Lo3/h0$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/j0<",
            "La3/i;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lo3/h0$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    new-instance v15, Lu2/n;

    iget-wide v4, v1, Lo3/j0;->a:J

    iget-object v6, v1, Lo3/j0;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->d()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->a()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->f()Landroid/net/Uri;

    move-result-object v3

    const-string v4, "_HLS_msn"

    invoke-virtual {v3, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    instance-of v6, v2, La3/j$a;

    if-nez v3, :cond_1

    if-eqz v6, :cond_3

    :cond_1
    const v3, 0x7fffffff

    instance-of v7, v2, Lo3/c0;

    if-eqz v7, :cond_2

    move-object v3, v2

    check-cast v3, Lo3/c0;

    iget v3, v3, Lo3/c0;->m:I

    :cond_2
    if-nez v6, :cond_7

    const/16 v6, 0x190

    if-eq v3, v6, :cond_7

    const/16 v6, 0x1f7

    if-ne v3, v6, :cond_3

    goto :goto_2

    :cond_3
    new-instance v3, Lu2/q;

    iget v6, v1, Lo3/j0;->c:I

    invoke-direct {v3, v6}, Lu2/q;-><init>(I)V

    new-instance v6, Lo3/g0$c;

    move/from16 v7, p7

    invoke-direct {v6, v15, v3, v2, v7}, Lo3/g0$c;-><init>(Lu2/n;Lu2/q;Ljava/io/IOException;I)V

    iget-object v3, v0, La3/c$c;->t:La3/c;

    iget-object v7, v0, La3/c$c;->j:Landroid/net/Uri;

    invoke-static {v3, v7, v6, v5}, La3/c;->n(La3/c;Landroid/net/Uri;Lo3/g0$c;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v0, La3/c$c;->t:La3/c;

    invoke-static {v3}, La3/c;->D(La3/c;)Lo3/g0;

    move-result-object v3

    invoke-interface {v3, v6}, Lo3/g0;->b(Lo3/g0$c;)J

    move-result-wide v6

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v6, v8

    if-eqz v3, :cond_4

    invoke-static {v5, v6, v7}, Lo3/h0;->h(ZJ)Lo3/h0$c;

    move-result-object v3

    goto :goto_1

    :cond_4
    sget-object v3, Lo3/h0;->g:Lo3/h0$c;

    goto :goto_1

    :cond_5
    sget-object v3, Lo3/h0;->f:Lo3/h0$c;

    :goto_1
    invoke-virtual {v3}, Lo3/h0$c;->c()Z

    move-result v5

    xor-int/2addr v4, v5

    iget-object v5, v0, La3/c$c;->t:La3/c;

    invoke-static {v5}, La3/c;->C(La3/c;)Lu2/b0$a;

    move-result-object v5

    iget v6, v1, Lo3/j0;->c:I

    invoke-virtual {v5, v15, v6, v2, v4}, Lu2/b0$a;->x(Lu2/n;ILjava/io/IOException;Z)V

    if-eqz v4, :cond_6

    iget-object v2, v0, La3/c$c;->t:La3/c;

    invoke-static {v2}, La3/c;->D(La3/c;)Lo3/g0;

    move-result-object v2

    iget-wide v4, v1, Lo3/j0;->a:J

    invoke-interface {v2, v4, v5}, Lo3/g0;->a(J)V

    :cond_6
    return-object v3

    :cond_7
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iput-wide v5, v0, La3/c$c;->p:J

    invoke-virtual/range {p0 .. p0}, La3/c$c;->n()V

    iget-object v3, v0, La3/c$c;->t:La3/c;

    invoke-static {v3}, La3/c;->C(La3/c;)Lu2/b0$a;

    move-result-object v3

    invoke-static {v3}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/b0$a;

    iget v1, v1, Lo3/j0;->c:I

    invoke-virtual {v3, v15, v1, v2, v4}, Lu2/b0$a;->x(Lu2/n;ILjava/io/IOException;Z)V

    sget-object v1, Lo3/h0;->f:Lo3/h0$c;

    return-object v1
.end method

.method public x()V
    .locals 1

    iget-object v0, p0, La3/c$c;->k:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->l()V

    return-void
.end method
