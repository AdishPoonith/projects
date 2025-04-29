.class final Le9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ls1/s;

.field private b:Landroid/view/Surface;

.field private final c:Lio/flutter/view/e$c;

.field private d:Le9/n;

.field private final e:Lr8/d;

.field f:Z

.field private final g:Le9/p;

.field private h:Lo3/u$b;


# direct methods
.method constructor <init>(Landroid/content/Context;Lr8/d;Lio/flutter/view/e$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Le9/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lr8/d;",
            "Lio/flutter/view/e$c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Le9/p;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Le9/o;->f:Z

    new-instance v0, Lo3/u$b;

    invoke-direct {v0}, Lo3/u$b;-><init>()V

    iput-object v0, p0, Le9/o;->h:Lo3/u$b;

    iput-object p2, p0, Le9/o;->e:Lr8/d;

    iput-object p3, p0, Le9/o;->c:Lio/flutter/view/e$c;

    iput-object p7, p0, Le9/o;->g:Le9/p;

    new-instance p2, Ls1/s$b;

    invoke-direct {p2, p1}, Ls1/s$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Ls1/s$b;->e()Ls1/s;

    move-result-object p2

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    invoke-virtual {p0, p6}, Le9/o;->a(Ljava/util/Map;)V

    new-instance p4, Lo3/t$a;

    iget-object p6, p0, Le9/o;->h:Lo3/u$b;

    invoke-direct {p4, p1, p6}, Lo3/t$a;-><init>(Landroid/content/Context;Lo3/l$a;)V

    invoke-direct {p0, p3, p4, p5}, Le9/o;->b(Landroid/net/Uri;Lo3/l$a;Ljava/lang/String;)Lu2/u;

    move-result-object p1

    invoke-interface {p2, p1}, Ls1/s;->y(Lu2/u;)V

    invoke-interface {p2}, Ls1/c3;->b()V

    new-instance p1, Le9/n;

    invoke-direct {p1}, Le9/n;-><init>()V

    invoke-direct {p0, p2, p1}, Le9/o;->m(Ls1/s;Le9/n;)V

    return-void
.end method

.method private b(Landroid/net/Uri;Lo3/l$a;Ljava/lang/String;)Lu2/u;
    .locals 6

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-nez p3, :cond_0

    invoke-static {p1}, Lp3/n0;->m0(Landroid/net/Uri;)I

    move-result v1

    goto :goto_2

    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    :goto_0
    const/4 p3, -0x1

    goto :goto_1

    :sswitch_0
    const-string v5, "other"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x3

    goto :goto_1

    :sswitch_1
    const-string v5, "dash"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 p3, 0x2

    goto :goto_1

    :sswitch_2
    const-string v5, "hls"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    const/4 p3, 0x1

    goto :goto_1

    :sswitch_3
    const-string v5, "ss"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_0

    :cond_4
    const/4 p3, 0x0

    :goto_1
    packed-switch p3, :pswitch_data_0

    const/4 v1, -0x1

    goto :goto_2

    :pswitch_0
    const/4 v1, 0x4

    goto :goto_2

    :pswitch_1
    const/4 v1, 0x2

    goto :goto_2

    :pswitch_2
    const/4 v1, 0x1

    :goto_2
    :pswitch_3
    if-eqz v1, :cond_8

    if-eq v1, v4, :cond_7

    if-eq v1, v3, :cond_6

    if-ne v1, v0, :cond_5

    new-instance p3, Lu2/i0$b;

    invoke-direct {p3, p2}, Lu2/i0$b;-><init>(Lo3/l$a;)V

    invoke-static {p1}, Ls1/v1;->d(Landroid/net/Uri;)Ls1/v1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lu2/i0$b;->b(Ls1/v1;)Lu2/i0;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unsupported type: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p3, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    invoke-direct {p3, p2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lo3/l$a;)V

    invoke-static {p1}, Ls1/v1;->d(Landroid/net/Uri;)Ls1/v1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a(Ls1/v1;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p3, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;

    invoke-direct {v0, p2}, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;-><init>(Lo3/l$a;)V

    invoke-direct {p3, v0, p2}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lo3/l$a;)V

    invoke-static {p1}, Ls1/v1;->d(Landroid/net/Uri;)Ls1/v1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->a(Ls1/v1;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p3, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    new-instance v0, Lcom/google/android/exoplayer2/source/dash/c$a;

    invoke-direct {v0, p2}, Lcom/google/android/exoplayer2/source/dash/c$a;-><init>(Lo3/l$a;)V

    invoke-direct {p3, v0, p2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/a$a;Lo3/l$a;)V

    invoke-static {p1}, Ls1/v1;->d(Landroid/net/Uri;)Ls1/v1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->a(Ls1/v1;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe60 -> :sswitch_3
        0x193ef -> :sswitch_2
        0x2eef92 -> :sswitch_1
        0x6527f10 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method private static j(Ls1/s;Z)V
    .locals 2

    new-instance v0, Lu1/e$e;

    invoke-direct {v0}, Lu1/e$e;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lu1/e$e;->c(I)Lu1/e$e;

    move-result-object v0

    invoke-virtual {v0}, Lu1/e$e;->a()Lu1/e;

    move-result-object v0

    xor-int/lit8 p1, p1, 0x1

    invoke-interface {p0, v0, p1}, Ls1/s;->d(Lu1/e;Z)V

    return-void
.end method

.method private m(Ls1/s;Le9/n;)V
    .locals 2

    iput-object p1, p0, Le9/o;->a:Ls1/s;

    iput-object p2, p0, Le9/o;->d:Le9/n;

    iget-object v0, p0, Le9/o;->e:Lr8/d;

    new-instance v1, Le9/o$a;

    invoke-direct {v1, p0, p2}, Le9/o$a;-><init>(Le9/o;Le9/n;)V

    invoke-virtual {v0, v1}, Lr8/d;->d(Lr8/d$d;)V

    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Le9/o;->c:Lio/flutter/view/e$c;

    invoke-interface {v1}, Lio/flutter/view/e$c;->d()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Le9/o;->b:Landroid/view/Surface;

    invoke-interface {p1, v0}, Ls1/c3;->h(Landroid/view/Surface;)V

    iget-object v0, p0, Le9/o;->g:Le9/p;

    iget-boolean v0, v0, Le9/p;->a:Z

    invoke-static {p1, v0}, Le9/o;->j(Ls1/s;Z)V

    new-instance v0, Le9/o$b;

    invoke-direct {v0, p0, p2}, Le9/o$b;-><init>(Le9/o;Le9/n;)V

    invoke-interface {p1, v0}, Ls1/c3;->k(Ls1/c3$d;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    const-string v2, "User-Agent"

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, "ExoPlayer"

    :goto_0
    iget-object v3, p0, Le9/o;->h:Lo3/u$b;

    invoke-virtual {v3, v2}, Lo3/u$b;->e(Ljava/lang/String;)Lo3/u$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lo3/u$b;->c(Z)Lo3/u$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Le9/o;->h:Lo3/u$b;

    invoke-virtual {v0, p1}, Lo3/u$b;->d(Ljava/util/Map;)Lo3/u$b;

    :cond_1
    return-void
.end method

.method c()V
    .locals 2

    iget-boolean v0, p0, Le9/o;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Le9/o;->a:Ls1/s;

    invoke-interface {v0}, Ls1/c3;->stop()V

    :cond_0
    iget-object v0, p0, Le9/o;->c:Lio/flutter/view/e$c;

    invoke-interface {v0}, Lio/flutter/view/e$c;->a()V

    iget-object v0, p0, Le9/o;->e:Lr8/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr8/d;->d(Lr8/d$d;)V

    iget-object v0, p0, Le9/o;->b:Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_1
    iget-object v0, p0, Le9/o;->a:Ls1/s;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ls1/c3;->a()V

    :cond_2
    return-void
.end method

.method d()J
    .locals 2

    iget-object v0, p0, Le9/o;->a:Ls1/s;

    invoke-interface {v0}, Ls1/c3;->H()J

    move-result-wide v0

    return-wide v0
.end method

.method e()V
    .locals 2

    iget-object v0, p0, Le9/o;->a:Ls1/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ls1/c3;->g(Z)V

    return-void
.end method

.method f()V
    .locals 2

    iget-object v0, p0, Le9/o;->a:Ls1/s;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ls1/c3;->g(Z)V

    return-void
.end method

.method g(I)V
    .locals 3

    iget-object v0, p0, Le9/o;->a:Ls1/s;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Ls1/c3;->G(J)V

    return-void
.end method

.method h()V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "bufferingUpdate"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Number;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    iget-object v2, p0, Le9/o;->a:Ls1/s;

    invoke-interface {v2}, Ls1/c3;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "values"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Le9/o;->d:Le9/n;

    invoke-virtual {v1, v0}, Le9/n;->a(Ljava/lang/Object;)V

    return-void
.end method

.method i()V
    .locals 5

    iget-boolean v0, p0, Le9/o;->f:Z

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "initialized"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Le9/o;->a:Ls1/s;

    invoke-interface {v1}, Ls1/c3;->D()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "duration"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Le9/o;->a:Ls1/s;

    invoke-interface {v1}, Ls1/s;->q()Ls1/n1;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Le9/o;->a:Ls1/s;

    invoke-interface {v1}, Ls1/s;->q()Ls1/n1;

    move-result-object v1

    iget v2, v1, Ls1/n1;->z:I

    iget v3, v1, Ls1/n1;->A:I

    iget v1, v1, Ls1/n1;->C:I

    const/16 v4, 0x5a

    if-eq v1, v4, :cond_0

    const/16 v4, 0x10e

    if-ne v1, v4, :cond_1

    :cond_0
    iget-object v2, p0, Le9/o;->a:Ls1/s;

    invoke-interface {v2}, Ls1/s;->q()Ls1/n1;

    move-result-object v2

    iget v2, v2, Ls1/n1;->A:I

    iget-object v3, p0, Le9/o;->a:Ls1/s;

    invoke-interface {v3}, Ls1/s;->q()Ls1/n1;

    move-result-object v3

    iget v3, v3, Ls1/n1;->z:I

    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "width"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "height"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0xb4

    if-ne v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "rotationCorrection"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Le9/o;->d:Le9/n;

    invoke-virtual {v1, v0}, Le9/n;->a(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method k(Z)V
    .locals 1

    iget-object v0, p0, Le9/o;->a:Ls1/s;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Ls1/c3;->w(I)V

    return-void
.end method

.method l(D)V
    .locals 1

    new-instance v0, Ls1/b3;

    double-to-float p1, p1

    invoke-direct {v0, p1}, Ls1/b3;-><init>(F)V

    iget-object p1, p0, Le9/o;->a:Ls1/s;

    invoke-interface {p1, v0}, Ls1/c3;->c(Ls1/b3;)V

    return-void
.end method

.method n(D)V
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    double-to-float p1, p1

    iget-object p2, p0, Le9/o;->a:Ls1/s;

    invoke-interface {p2, p1}, Ls1/c3;->e(F)V

    return-void
.end method
