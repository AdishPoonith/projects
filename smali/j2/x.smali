.class public final Lj2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj2/x$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/media/MediaCodec;

.field private b:[Ljava/nio/ByteBuffer;

.field private c:[Ljava/nio/ByteBuffer;


# direct methods
.method private constructor <init>(Landroid/media/MediaCodec;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lj2/x;->b:[Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lj2/x;->c:[Ljava/nio/ByteBuffer;

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Landroid/media/MediaCodec;Lj2/x$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lj2/x;-><init>(Landroid/media/MediaCodec;)V

    return-void
.end method

.method public static synthetic p(Lj2/x;Lj2/l$c;Landroid/media/MediaCodec;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lj2/x;->q(Lj2/l$c;Landroid/media/MediaCodec;JJ)V

    return-void
.end method

.method private synthetic q(Lj2/l$c;Landroid/media/MediaCodec;JJ)V
    .locals 6

    move-object v0, p1

    move-object v1, p0

    move-wide v2, p3

    move-wide v4, p5

    invoke-interface/range {v0 .. v5}, Lj2/l$c;->a(Lj2/l;JJ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lj2/x;->b:[Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lj2/x;->c:[Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    return-void
.end method

.method public b(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 4

    :cond_0
    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    sget v2, Lp3/n0;->a:I

    const/16 v3, 0x15

    if-ge v2, v3, :cond_1

    iget-object v2, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lj2/x;->c:[Ljava/nio/ByteBuffer;

    :cond_1
    if-eq v0, v1, :cond_0

    return v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d(IZ)V
    .locals 1

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public e(IILv1/c;JI)V
    .locals 7

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {p3}, Lv1/c;->a()Landroid/media/MediaCodec$CryptoInfo;

    move-result-object v3

    move v1, p1

    move v2, p2

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    return-void
.end method

.method public g()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method public h(I)Ljava/nio/ByteBuffer;
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lj2/x;->b:[Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/ByteBuffer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public i(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public j(Lj2/l$c;Landroid/os/Handler;)V
    .locals 2

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    new-instance v1, Lj2/w;

    invoke-direct {v1, p0, p1}, Lj2/w;-><init>(Lj2/x;Lj2/l$c;)V

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public k(IIIJI)V
    .locals 7

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    return-void
.end method

.method public l(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public m(I)Ljava/nio/ByteBuffer;
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lj2/x;->c:[Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/ByteBuffer;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public n(IJ)V
    .locals 1

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    return-void
.end method

.method public o()I
    .locals 3

    iget-object v0, p0, Lj2/x;->a:Landroid/media/MediaCodec;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v0

    return v0
.end method
