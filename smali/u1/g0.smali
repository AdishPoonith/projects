.class public Lu1/g0;
.super Lj2/o;
.source "SourceFile"

# interfaces
.implements Lp3/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu1/g0$b;,
        Lu1/g0$c;
    }
.end annotation


# instance fields
.field private final M0:Landroid/content/Context;

.field private final N0:Lu1/t$a;

.field private final O0:Lu1/v;

.field private P0:I

.field private Q0:Z

.field private R0:Ls1/n1;

.field private S0:Ls1/n1;

.field private T0:J

.field private U0:Z

.field private V0:Z

.field private W0:Z

.field private X0:Z

.field private Y0:Ls1/l3$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj2/l$b;Lj2/q;ZLandroid/os/Handler;Lu1/t;Lu1/v;)V
    .locals 6

    const/4 v1, 0x1

    const v5, 0x472c4400    # 44100.0f

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lj2/o;-><init>(ILj2/l$b;Lj2/q;ZF)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lu1/g0;->M0:Landroid/content/Context;

    iput-object p7, p0, Lu1/g0;->O0:Lu1/v;

    new-instance p1, Lu1/t$a;

    invoke-direct {p1, p5, p6}, Lu1/t$a;-><init>(Landroid/os/Handler;Lu1/t;)V

    iput-object p1, p0, Lu1/g0;->N0:Lu1/t$a;

    new-instance p1, Lu1/g0$c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lu1/g0$c;-><init>(Lu1/g0;Lu1/g0$a;)V

    invoke-interface {p7, p1}, Lu1/v;->f(Lu1/v$c;)V

    return-void
.end method

.method private A1()V
    .locals 5

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-virtual {p0}, Lu1/g0;->b()Z

    move-result v1

    invoke-interface {v0, v1}, Lu1/v;->q(Z)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-boolean v2, p0, Lu1/g0;->V0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lu1/g0;->T0:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lu1/g0;->T0:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu1/g0;->V0:Z

    :cond_1
    return-void
.end method

.method static synthetic r1(Lu1/g0;)Lu1/t$a;
    .locals 0

    iget-object p0, p0, Lu1/g0;->N0:Lu1/t$a;

    return-object p0
.end method

.method static synthetic s1(Lu1/g0;)Ls1/l3$a;
    .locals 0

    iget-object p0, p0, Lu1/g0;->Y0:Ls1/l3$a;

    return-object p0
.end method

.method private static t1(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.aac.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lp3/n0;->c:Ljava/lang/String;

    const-string v0, "samsung"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lp3/n0;->b:Ljava/lang/String;

    const-string v0, "zeroflte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "herolte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "heroqlte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static u1()Z
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x17

    if-ne v0, v1, :cond_1

    sget-object v0, Lp3/n0;->d:Ljava/lang/String;

    const-string v1, "ZTE B2017G"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "AXON 7 mini"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private v1(Lj2/n;Ls1/n1;)I
    .locals 1

    iget-object p1, p1, Lj2/n;->a:Ljava/lang/String;

    const-string v0, "OMX.google.raw.decoder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lp3/n0;->a:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lu1/g0;->M0:Landroid/content/Context;

    invoke-static {p1}, Lp3/n0;->w0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p2, Ls1/n1;->v:I

    return p1
.end method

.method private static x1(Lj2/q;Ls1/n1;ZLu1/v;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/q;",
            "Ls1/n1;",
            "Z",
            "Lu1/v;",
            ")",
            "Ljava/util/List<",
            "Lj2/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p1, Ls1/n1;->u:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p3, p1}, Lu1/v;->a(Ls1/n1;)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, Lj2/v;->v()Lj2/n;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-static {p3}, Lcom/google/common/collect/q;->A(Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p3, 0x0

    invoke-interface {p0, v0, p2, p3}, Lj2/q;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lj2/v;->m(Ls1/n1;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v0}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p0, p1, p2, p3}, Lj2/q;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/common/collect/q$a;->g(Ljava/lang/Iterable;)Lcom/google/common/collect/q$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/common/collect/q$a;->g(Ljava/lang/Iterable;)Lcom/google/common/collect/q$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected H()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/g0;->W0:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/g0;->R0:Ls1/n1;

    :try_start_0
    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-super {p0}, Lj2/o;->H()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lu1/g0;->N0:Lu1/t$a;

    iget-object v1, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {v0, v1}, Lu1/t$a;->o(Lv1/e;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lu1/g0;->N0:Lu1/t$a;

    iget-object v2, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {v1, v2}, Lu1/t$a;->o(Lv1/e;)V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-super {p0}, Lj2/o;->H()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v1, p0, Lu1/g0;->N0:Lu1/t$a;

    iget-object v2, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {v1, v2}, Lu1/t$a;->o(Lv1/e;)V

    throw v0

    :catchall_2
    move-exception v0

    iget-object v1, p0, Lu1/g0;->N0:Lu1/t$a;

    iget-object v2, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {v1, v2}, Lu1/t$a;->o(Lv1/e;)V

    throw v0
.end method

.method protected I(ZZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj2/o;->I(ZZ)V

    iget-object p1, p0, Lu1/g0;->N0:Lu1/t$a;

    iget-object p2, p0, Lj2/o;->H0:Lv1/e;

    invoke-virtual {p1, p2}, Lu1/t$a;->p(Lv1/e;)V

    invoke-virtual {p0}, Ls1/f;->B()Ls1/o3;

    move-result-object p1

    iget-boolean p1, p1, Ls1/o3;->a:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p1}, Lu1/v;->h()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p1}, Lu1/v;->s()V

    :goto_0
    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    invoke-virtual {p0}, Ls1/f;->E()Lt1/t1;

    move-result-object p2

    invoke-interface {p1, p2}, Lu1/v;->n(Lt1/t1;)V

    return-void
.end method

.method protected J(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lj2/o;->J(JZ)V

    iget-boolean p3, p0, Lu1/g0;->X0:Z

    if-eqz p3, :cond_0

    iget-object p3, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p3}, Lu1/v;->v()V

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p3}, Lu1/v;->flush()V

    :goto_0
    iput-wide p1, p0, Lu1/g0;->T0:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu1/g0;->U0:Z

    iput-boolean p1, p0, Lu1/g0;->V0:Z

    return-void
.end method

.method protected J0(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio codec error"

    invoke-static {v0, v1, p1}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lu1/g0;->N0:Lu1/t$a;

    invoke-virtual {v0, p1}, Lu1/t$a;->k(Ljava/lang/Exception;)V

    return-void
.end method

.method protected K()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Lj2/o;->K()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lu1/g0;->W0:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lu1/g0;->W0:Z

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->reset()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    iget-boolean v2, p0, Lu1/g0;->W0:Z

    if-eqz v2, :cond_1

    iput-boolean v0, p0, Lu1/g0;->W0:Z

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->reset()V

    :cond_1
    throw v1
.end method

.method protected K0(Ljava/lang/String;Lj2/l$a;JJ)V
    .locals 6

    iget-object v0, p0, Lu1/g0;->N0:Lu1/t$a;

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lu1/t$a;->m(Ljava/lang/String;JJ)V

    return-void
.end method

.method protected L()V
    .locals 1

    invoke-super {p0}, Lj2/o;->L()V

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->o()V

    return-void
.end method

.method protected L0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lu1/g0;->N0:Lu1/t$a;

    invoke-virtual {v0, p1}, Lu1/t$a;->n(Ljava/lang/String;)V

    return-void
.end method

.method protected M()V
    .locals 1

    invoke-direct {p0}, Lu1/g0;->A1()V

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->d()V

    invoke-super {p0}, Lj2/o;->M()V

    return-void
.end method

.method protected M0(Ls1/o1;)Lv1/i;
    .locals 2

    iget-object v0, p1, Ls1/o1;->b:Ls1/n1;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/n1;

    iput-object v0, p0, Lu1/g0;->R0:Ls1/n1;

    invoke-super {p0, p1}, Lj2/o;->M0(Ls1/o1;)Lv1/i;

    move-result-object p1

    iget-object v0, p0, Lu1/g0;->N0:Lu1/t$a;

    iget-object v1, p0, Lu1/g0;->R0:Ls1/n1;

    invoke-virtual {v0, v1, p1}, Lu1/t$a;->q(Ls1/n1;Lv1/i;)V

    return-object p1
.end method

.method protected N0(Ls1/n1;Landroid/media/MediaFormat;)V
    .locals 5

    iget-object v0, p0, Lu1/g0;->S0:Ls1/n1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Lj2/o;->p0()Lj2/l;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object v0, p1, Ls1/n1;->u:Ljava/lang/String;

    const-string v3, "audio/raw"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p1, Ls1/n1;->J:I

    goto :goto_0

    :cond_2
    sget v0, Lp3/n0;->a:I

    const/16 v4, 0x18

    if-lt v0, v4, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lp3/n0;->b0(I)I

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    :goto_0
    new-instance v4, Ls1/n1$b;

    invoke-direct {v4}, Ls1/n1$b;-><init>()V

    invoke-virtual {v4, v3}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Ls1/n1$b;->a0(I)Ls1/n1$b;

    move-result-object v0

    iget v3, p1, Ls1/n1;->K:I

    invoke-virtual {v0, v3}, Ls1/n1$b;->P(I)Ls1/n1$b;

    move-result-object v0

    iget v3, p1, Ls1/n1;->L:I

    invoke-virtual {v0, v3}, Ls1/n1$b;->Q(I)Ls1/n1$b;

    move-result-object v0

    const-string v3, "channel-count"

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Ls1/n1$b;->J(I)Ls1/n1$b;

    move-result-object v0

    const-string v3, "sample-rate"

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, Ls1/n1$b;->h0(I)Ls1/n1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p2

    iget-boolean v0, p0, Lu1/g0;->Q0:Z

    if-eqz v0, :cond_5

    iget v0, p2, Ls1/n1;->H:I

    const/4 v3, 0x6

    if-ne v0, v3, :cond_5

    iget v0, p1, Ls1/n1;->H:I

    if-ge v0, v3, :cond_5

    new-array v2, v0, [I

    const/4 v0, 0x0

    :goto_1
    iget v3, p1, Ls1/n1;->H:I

    if-ge v0, v3, :cond_5

    aput v0, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move-object p1, p2

    :goto_2
    :try_start_0
    iget-object p2, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p2, p1, v1, v2}, Lu1/v;->m(Ls1/n1;I[I)V
    :try_end_0
    .catch Lu1/v$a; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p1, Lu1/v$a;->j:Ls1/n1;

    const/16 v0, 0x1389

    invoke-virtual {p0, p1, p2, v0}, Ls1/f;->z(Ljava/lang/Throwable;Ls1/n1;I)Ls1/q;

    move-result-object p1

    throw p1
.end method

.method protected O0(J)V
    .locals 1

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0, p1, p2}, Lu1/v;->u(J)V

    return-void
.end method

.method protected Q0()V
    .locals 1

    invoke-super {p0}, Lj2/o;->Q0()V

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->x()V

    return-void
.end method

.method protected R0(Lv1/g;)V
    .locals 5

    iget-boolean v0, p0, Lu1/g0;->U0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lv1/a;->q()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Lv1/g;->n:J

    iget-wide v2, p0, Lu1/g0;->T0:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7a120

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-wide v0, p1, Lv1/g;->n:J

    iput-wide v0, p0, Lu1/g0;->T0:J

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lu1/g0;->U0:Z

    :cond_1
    return-void
.end method

.method protected T(Lj2/n;Ls1/n1;Ls1/n1;)Lv1/i;
    .locals 8

    invoke-virtual {p1, p2, p3}, Lj2/n;->f(Ls1/n1;Ls1/n1;)Lv1/i;

    move-result-object v0

    iget v1, v0, Lv1/i;->e:I

    invoke-direct {p0, p1, p3}, Lu1/g0;->v1(Lj2/n;Ls1/n1;)I

    move-result v2

    iget v3, p0, Lu1/g0;->P0:I

    if-le v2, v3, :cond_0

    or-int/lit8 v1, v1, 0x40

    :cond_0
    move v7, v1

    new-instance v1, Lv1/i;

    iget-object v3, p1, Lj2/n;->a:Ljava/lang/String;

    if-eqz v7, :cond_1

    const/4 p1, 0x0

    const/4 v6, 0x0

    goto :goto_0

    :cond_1
    iget p1, v0, Lv1/i;->d:I

    move v6, p1

    :goto_0
    move-object v2, v1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lv1/i;-><init>(Ljava/lang/String;Ls1/n1;Ls1/n1;II)V

    return-object v1
.end method

.method protected T0(JJLj2/l;Ljava/nio/ByteBuffer;IIIJZZLs1/n1;)Z
    .locals 0

    invoke-static {p6}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu1/g0;->S0:Ls1/n1;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-static {p5}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj2/l;

    invoke-interface {p1, p7, p3}, Lj2/l;->d(IZ)V

    return p2

    :cond_0
    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    invoke-interface {p5, p7, p3}, Lj2/l;->d(IZ)V

    :cond_1
    iget-object p1, p0, Lj2/o;->H0:Lv1/e;

    iget p3, p1, Lv1/e;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lv1/e;->f:I

    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p1}, Lu1/v;->x()V

    return p2

    :cond_2
    :try_start_0
    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p1, p6, p10, p11, p9}, Lu1/v;->p(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Lu1/v$b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lu1/v$e; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    invoke-interface {p5, p7, p3}, Lj2/l;->d(IZ)V

    :cond_3
    iget-object p1, p0, Lj2/o;->H0:Lv1/e;

    iget p3, p1, Lv1/e;->e:I

    add-int/2addr p3, p9

    iput p3, p1, Lv1/e;->e:I

    return p2

    :cond_4
    return p3

    :catch_0
    move-exception p1

    iget-boolean p2, p1, Lu1/v$e;->k:Z

    const/16 p3, 0x138a

    invoke-virtual {p0, p1, p14, p2, p3}, Ls1/f;->A(Ljava/lang/Throwable;Ls1/n1;ZI)Ls1/q;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    iget-object p2, p0, Lu1/g0;->R0:Ls1/n1;

    iget-boolean p3, p1, Lu1/v$b;->k:Z

    const/16 p4, 0x1389

    invoke-virtual {p0, p1, p2, p3, p4}, Ls1/f;->A(Ljava/lang/Throwable;Ls1/n1;ZI)Ls1/q;

    move-result-object p1

    throw p1
.end method

.method protected Y0()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->j()V
    :try_end_0
    .catch Lu1/v$e; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, v0, Lu1/v$e;->l:Ls1/n1;

    iget-boolean v2, v0, Lu1/v$e;->k:Z

    const/16 v3, 0x138a

    invoke-virtual {p0, v0, v1, v2, v3}, Ls1/f;->A(Ljava/lang/Throwable;Ls1/n1;ZI)Ls1/q;

    move-result-object v0

    throw v0
.end method

.method public b()Z
    .locals 1

    invoke-super {p0}, Lj2/o;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Ls1/b3;)V
    .locals 1

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0, p1}, Lu1/v;->c(Ls1/b3;)V

    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->k()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lj2/o;->d()Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public g()Ls1/b3;
    .locals 1

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0}, Lu1/v;->g()Ls1/b3;

    move-result-object v0

    return-object v0
.end method

.method protected l1(Ls1/n1;)Z
    .locals 1

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v0, p1}, Lu1/v;->a(Ls1/n1;)Z

    move-result p1

    return p1
.end method

.method public m(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ls1/f;->m(ILjava/lang/Object;)V

    goto :goto_0

    :pswitch_0
    sget p1, Lp3/n0;->a:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_3

    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    invoke-static {p1, p2}, Lu1/g0$b;->a(Lu1/v;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    check-cast p2, Ls1/l3$a;

    iput-object p2, p0, Lu1/g0;->Y0:Ls1/l3$a;

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lu1/v;->l(I)V

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lu1/v;->w(Z)V

    goto :goto_0

    :cond_0
    check-cast p2, Lu1/y;

    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p1, p2}, Lu1/v;->r(Lu1/y;)V

    goto :goto_0

    :cond_1
    check-cast p2, Lu1/e;

    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {p1, p2}, Lu1/v;->t(Lu1/e;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lu1/g0;->O0:Lu1/v;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, p2}, Lu1/v;->e(F)V

    :cond_3
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected m1(Lj2/q;Ls1/n1;)I
    .locals 10

    iget-object v0, p2, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0}, Lp3/v;->o(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_0
    sget v0, Lp3/n0;->a:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_1

    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v2, p2, Ls1/n1;->P:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-static {p2}, Lj2/o;->n1(Ls1/n1;)Z

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x4

    if-eqz v4, :cond_4

    iget-object v7, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v7, p2}, Lu1/v;->a(Ls1/n1;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v2, :cond_3

    invoke-static {}, Lj2/v;->v()Lj2/n;

    move-result-object v2

    if-eqz v2, :cond_4

    :cond_3
    invoke-static {v6, v5, v0}, Ls1/m3;->b(III)I

    move-result p1

    return p1

    :cond_4
    iget-object v2, p2, Ls1/n1;->u:Ljava/lang/String;

    const-string v7, "audio/raw"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lu1/g0;->O0:Lu1/v;

    invoke-interface {v2, p2}, Lu1/v;->a(Ls1/n1;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v3}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_5
    iget-object v2, p0, Lu1/g0;->O0:Lu1/v;

    iget v7, p2, Ls1/n1;->H:I

    iget v8, p2, Ls1/n1;->I:I

    const/4 v9, 0x2

    invoke-static {v9, v7, v8}, Lp3/n0;->c0(III)Ls1/n1;

    move-result-object v7

    invoke-interface {v2, v7}, Lu1/v;->a(Ls1/n1;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {v3}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_6
    iget-object v2, p0, Lu1/g0;->O0:Lu1/v;

    invoke-static {p1, p2, v1, v2}, Lu1/g0;->x1(Lj2/q;Ls1/n1;ZLu1/v;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v3}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_7
    if-nez v4, :cond_8

    invoke-static {v9}, Ls1/m3;->a(I)I

    move-result p1

    return p1

    :cond_8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj2/n;

    invoke-virtual {v2, p2}, Lj2/n;->o(Ls1/n1;)Z

    move-result v4

    if-nez v4, :cond_a

    const/4 v7, 0x1

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_a

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj2/n;

    invoke-virtual {v8, p2}, Lj2/n;->o(Ls1/n1;)Z

    move-result v9

    if-eqz v9, :cond_9

    move-object v2, v8

    const/4 p1, 0x0

    goto :goto_3

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_a
    move v3, v4

    const/4 p1, 0x1

    :goto_3
    if-eqz v3, :cond_b

    goto :goto_4

    :cond_b
    const/4 v6, 0x3

    :goto_4
    if-eqz v3, :cond_c

    invoke-virtual {v2, p2}, Lj2/n;->r(Ls1/n1;)Z

    move-result p2

    if-eqz p2, :cond_c

    const/16 v5, 0x10

    :cond_c
    iget-boolean p2, v2, Lj2/n;->h:Z

    if-eqz p2, :cond_d

    const/16 p2, 0x40

    goto :goto_5

    :cond_d
    const/4 p2, 0x0

    :goto_5
    if-eqz p1, :cond_e

    const/16 v1, 0x80

    :cond_e
    invoke-static {v6, v5, v0, p2, v1}, Ls1/m3;->c(IIIII)I

    move-result p1

    return p1
.end method

.method protected s0(FLs1/n1;[Ls1/n1;)F
    .locals 4

    array-length p2, p3

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v3, p3, v1

    iget v3, v3, Ls1/n1;->I:I

    if-eq v3, v0, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-ne v2, v0, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_1

    :cond_2
    int-to-float p2, v2

    mul-float p1, p1, p2

    :goto_1
    return p1
.end method

.method protected u0(Lj2/q;Ls1/n1;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/q;",
            "Ls1/n1;",
            "Z)",
            "Ljava/util/List<",
            "Lj2/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu1/g0;->O0:Lu1/v;

    invoke-static {p1, p2, p3, v0}, Lu1/g0;->x1(Lj2/q;Ls1/n1;ZLu1/v;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lj2/v;->u(Ljava/util/List;Ls1/n1;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public v()Lp3/t;
    .locals 0

    return-object p0
.end method

.method protected w0(Lj2/n;Ls1/n1;Landroid/media/MediaCrypto;F)Lj2/l$a;
    .locals 2

    invoke-virtual {p0}, Ls1/f;->F()[Ls1/n1;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lu1/g0;->w1(Lj2/n;Ls1/n1;[Ls1/n1;)I

    move-result v0

    iput v0, p0, Lu1/g0;->P0:I

    iget-object v0, p1, Lj2/n;->a:Ljava/lang/String;

    invoke-static {v0}, Lu1/g0;->t1(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lu1/g0;->Q0:Z

    iget-object v0, p1, Lj2/n;->c:Ljava/lang/String;

    iget v1, p0, Lu1/g0;->P0:I

    invoke-virtual {p0, p2, v0, v1, p4}, Lu1/g0;->y1(Ls1/n1;Ljava/lang/String;IF)Landroid/media/MediaFormat;

    move-result-object p4

    iget-object v0, p1, Lj2/n;->b:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p2, Ls1/n1;->u:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    move-object v0, p2

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lu1/g0;->S0:Ls1/n1;

    invoke-static {p1, p4, p2, p3}, Lj2/l$a;->a(Lj2/n;Landroid/media/MediaFormat;Ls1/n1;Landroid/media/MediaCrypto;)Lj2/l$a;

    move-result-object p1

    return-object p1
.end method

.method protected w1(Lj2/n;Ls1/n1;[Ls1/n1;)I
    .locals 5

    invoke-direct {p0, p1, p2}, Lu1/g0;->v1(Lj2/n;Ls1/n1;)I

    move-result v0

    array-length v1, p3

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    array-length v1, p3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p3, v2

    invoke-virtual {p1, p2, v3}, Lj2/n;->f(Ls1/n1;Ls1/n1;)Lv1/i;

    move-result-object v4

    iget v4, v4, Lv1/i;->d:I

    if-eqz v4, :cond_1

    invoke-direct {p0, p1, v3}, Lu1/g0;->v1(Lj2/n;Ls1/n1;)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public x()J
    .locals 2

    invoke-virtual {p0}, Ls1/f;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lu1/g0;->A1()V

    :cond_0
    iget-wide v0, p0, Lu1/g0;->T0:J

    return-wide v0
.end method

.method protected y1(Ls1/n1;Ljava/lang/String;IF)Landroid/media/MediaFormat;
    .locals 2

    new-instance v0, Landroid/media/MediaFormat;

    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    const-string v1, "mime"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget p2, p1, Ls1/n1;->H:I

    const-string v1, "channel-count"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p2, p1, Ls1/n1;->I:I

    const-string v1, "sample-rate"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p2, p1, Ls1/n1;->w:Ljava/util/List;

    invoke-static {v0, p2}, Lp3/u;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string p2, "max-input-size"

    invoke-static {v0, p2, p3}, Lp3/u;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    sget p2, Lp3/n0;->a:I

    const/16 p3, 0x17

    if-lt p2, p3, :cond_0

    const/4 p3, 0x0

    const-string v1, "priority"

    invoke-virtual {v0, v1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 p3, -0x40800000    # -1.0f

    cmpl-float p3, p4, p3

    if-eqz p3, :cond_0

    invoke-static {}, Lu1/g0;->u1()Z

    move-result p3

    if-nez p3, :cond_0

    const-string p3, "operating-rate"

    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_0
    const/16 p3, 0x1c

    if-gt p2, p3, :cond_1

    iget-object p3, p1, Ls1/n1;->u:Ljava/lang/String;

    const-string p4, "audio/ac4"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    const-string p4, "ac4-is-sync"

    invoke-virtual {v0, p4, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    const/16 p3, 0x18

    if-lt p2, p3, :cond_2

    iget-object p3, p0, Lu1/g0;->O0:Lu1/v;

    iget p4, p1, Ls1/n1;->H:I

    iget p1, p1, Ls1/n1;->I:I

    const/4 v1, 0x4

    invoke-static {v1, p4, p1}, Lp3/n0;->c0(III)Ls1/n1;

    move-result-object p1

    invoke-interface {p3, p1}, Lu1/v;->y(Ls1/n1;)I

    move-result p1

    const/4 p3, 0x2

    if-ne p1, p3, :cond_2

    const-string p1, "pcm-encoding"

    invoke-virtual {v0, p1, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_2
    const/16 p1, 0x20

    if-lt p2, p1, :cond_3

    const/16 p1, 0x63

    const-string p2, "max-output-channel-count"

    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_3
    return-object v0
.end method

.method protected z1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/g0;->V0:Z

    return-void
.end method
