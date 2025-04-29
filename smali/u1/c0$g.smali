.class final Lu1/c0$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field public final a:Ls1/n1;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:[Lu1/g;


# direct methods
.method public constructor <init>(Ls1/n1;IIIIIII[Lu1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/c0$g;->a:Ls1/n1;

    iput p2, p0, Lu1/c0$g;->b:I

    iput p3, p0, Lu1/c0$g;->c:I

    iput p4, p0, Lu1/c0$g;->d:I

    iput p5, p0, Lu1/c0$g;->e:I

    iput p6, p0, Lu1/c0$g;->f:I

    iput p7, p0, Lu1/c0$g;->g:I

    iput p8, p0, Lu1/c0$g;->h:I

    iput-object p9, p0, Lu1/c0$g;->i:[Lu1/g;

    return-void
.end method

.method private d(ZLu1/e;I)Landroid/media/AudioTrack;
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lu1/c0$g;->f(ZLu1/e;I)Landroid/media/AudioTrack;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    invoke-direct {p0, p1, p2, p3}, Lu1/c0$g;->e(ZLu1/e;I)Landroid/media/AudioTrack;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p2, p3}, Lu1/c0$g;->g(Lu1/e;I)Landroid/media/AudioTrack;

    move-result-object p1

    return-object p1
.end method

.method private e(ZLu1/e;I)Landroid/media/AudioTrack;
    .locals 7

    new-instance v6, Landroid/media/AudioTrack;

    invoke-static {p2, p1}, Lu1/c0$g;->i(Lu1/e;Z)Landroid/media/AudioAttributes;

    move-result-object v1

    iget p1, p0, Lu1/c0$g;->e:I

    iget p2, p0, Lu1/c0$g;->f:I

    iget v0, p0, Lu1/c0$g;->g:I

    invoke-static {p1, p2, v0}, Lu1/c0;->E(III)Landroid/media/AudioFormat;

    move-result-object v2

    iget v3, p0, Lu1/c0$g;->h:I

    const/4 v4, 0x1

    move-object v0, v6

    move v5, p3

    invoke-direct/range {v0 .. v5}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    return-object v6
.end method

.method private f(ZLu1/e;I)Landroid/media/AudioTrack;
    .locals 3

    iget v0, p0, Lu1/c0$g;->e:I

    iget v1, p0, Lu1/c0$g;->f:I

    iget v2, p0, Lu1/c0$g;->g:I

    invoke-static {v0, v1, v2}, Lu1/c0;->E(III)Landroid/media/AudioFormat;

    move-result-object v0

    invoke-static {p2, p1}, Lu1/c0$g;->i(Lu1/e;Z)Landroid/media/AudioAttributes;

    move-result-object p1

    new-instance p2, Landroid/media/AudioTrack$Builder;

    invoke-direct {p2}, Landroid/media/AudioTrack$Builder;-><init>()V

    invoke-virtual {p2, p1}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    iget v0, p0, Lu1/c0$g;->h:I

    invoke-virtual {p1, v0}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    iget p3, p0, Lu1/c0$g;->c:I

    if-ne p3, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack$Builder;->setOffloadedPlayback(Z)Landroid/media/AudioTrack$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    move-result-object p1

    return-object p1
.end method

.method private g(Lu1/e;I)Landroid/media/AudioTrack;
    .locals 8

    iget p1, p1, Lu1/e;->l:I

    invoke-static {p1}, Lp3/n0;->f0(I)I

    move-result v1

    new-instance p1, Landroid/media/AudioTrack;

    iget v2, p0, Lu1/c0$g;->e:I

    iget v3, p0, Lu1/c0$g;->f:I

    iget v4, p0, Lu1/c0$g;->g:I

    iget v5, p0, Lu1/c0$g;->h:I

    const/4 v6, 0x1

    move-object v0, p1

    if-nez p2, :cond_0

    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    return-object p1

    :cond_0
    move v7, p2

    invoke-direct/range {v0 .. v7}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    return-object p1
.end method

.method private static i(Lu1/e;Z)Landroid/media/AudioAttributes;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {}, Lu1/c0$g;->j()Landroid/media/AudioAttributes;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lu1/e;->b()Lu1/e$d;

    move-result-object p0

    iget-object p0, p0, Lu1/e$d;->a:Landroid/media/AudioAttributes;

    return-object p0
.end method

.method private static j()Landroid/media/AudioAttributes;
    .locals 2

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(ZLu1/e;I)Landroid/media/AudioTrack;
    .locals 8

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lu1/c0$g;->d(ZLu1/e;I)Landroid/media/AudioTrack;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getState()I

    move-result v1

    const/4 p2, 0x1

    if-ne v1, p2, :cond_0

    return-object p1

    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p1, Lu1/v$b;

    iget v2, p0, Lu1/c0$g;->e:I

    iget v3, p0, Lu1/c0$g;->f:I

    iget v4, p0, Lu1/c0$g;->h:I

    iget-object v5, p0, Lu1/c0$g;->a:Ls1/n1;

    invoke-virtual {p0}, Lu1/c0$g;->l()Z

    move-result v6

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lu1/v$b;-><init>(IIIILs1/n1;ZLjava/lang/Exception;)V

    throw p1

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    move-object v7, p1

    new-instance p1, Lu1/v$b;

    const/4 v1, 0x0

    iget v2, p0, Lu1/c0$g;->e:I

    iget v3, p0, Lu1/c0$g;->f:I

    iget v4, p0, Lu1/c0$g;->h:I

    iget-object v5, p0, Lu1/c0$g;->a:Ls1/n1;

    invoke-virtual {p0}, Lu1/c0$g;->l()Z

    move-result v6

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lu1/v$b;-><init>(IIIILs1/n1;ZLjava/lang/Exception;)V

    throw p1
.end method

.method public b(Lu1/c0$g;)Z
    .locals 2

    iget v0, p1, Lu1/c0$g;->c:I

    iget v1, p0, Lu1/c0$g;->c:I

    if-ne v0, v1, :cond_0

    iget v0, p1, Lu1/c0$g;->g:I

    iget v1, p0, Lu1/c0$g;->g:I

    if-ne v0, v1, :cond_0

    iget v0, p1, Lu1/c0$g;->e:I

    iget v1, p0, Lu1/c0$g;->e:I

    if-ne v0, v1, :cond_0

    iget v0, p1, Lu1/c0$g;->f:I

    iget v1, p0, Lu1/c0$g;->f:I

    if-ne v0, v1, :cond_0

    iget p1, p1, Lu1/c0$g;->d:I

    iget v0, p0, Lu1/c0$g;->d:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(I)Lu1/c0$g;
    .locals 11

    new-instance v10, Lu1/c0$g;

    iget-object v1, p0, Lu1/c0$g;->a:Ls1/n1;

    iget v2, p0, Lu1/c0$g;->b:I

    iget v3, p0, Lu1/c0$g;->c:I

    iget v4, p0, Lu1/c0$g;->d:I

    iget v5, p0, Lu1/c0$g;->e:I

    iget v6, p0, Lu1/c0$g;->f:I

    iget v7, p0, Lu1/c0$g;->g:I

    iget-object v9, p0, Lu1/c0$g;->i:[Lu1/g;

    move-object v0, v10

    move v8, p1

    invoke-direct/range {v0 .. v9}, Lu1/c0$g;-><init>(Ls1/n1;IIIIIII[Lu1/g;)V

    return-object v10
.end method

.method public h(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget v0, p0, Lu1/c0$g;->e:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public k(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget-object v0, p0, Lu1/c0$g;->a:Ls1/n1;

    iget v0, v0, Ls1/n1;->I:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public l()Z
    .locals 2

    iget v0, p0, Lu1/c0$g;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
