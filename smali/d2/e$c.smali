.class public final Ld2/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "c"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:F

.field public E:F

.field public F:F

.field public G:F

.field public H:F

.field public I:F

.field public J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:[B

.field public O:I

.field public P:I

.field public Q:I

.field public R:J

.field public S:J

.field public T:Lx1/f0;

.field public U:Z

.field public V:Z

.field private W:Ljava/lang/String;

.field public X:Lx1/e0;

.field public Y:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field private g:I

.field public h:Z

.field public i:[B

.field public j:Lx1/e0$a;

.field public k:[B

.field public l:Lw1/m;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:F

.field public t:F

.field public u:F

.field public v:[B

.field public w:I

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method protected constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ld2/e$c;->m:I

    iput v0, p0, Ld2/e$c;->n:I

    iput v0, p0, Ld2/e$c;->o:I

    iput v0, p0, Ld2/e$c;->p:I

    const/4 v1, 0x0

    iput v1, p0, Ld2/e$c;->q:I

    iput v0, p0, Ld2/e$c;->r:I

    const/4 v2, 0x0

    iput v2, p0, Ld2/e$c;->s:F

    iput v2, p0, Ld2/e$c;->t:F

    iput v2, p0, Ld2/e$c;->u:F

    const/4 v2, 0x0

    iput-object v2, p0, Ld2/e$c;->v:[B

    iput v0, p0, Ld2/e$c;->w:I

    iput-boolean v1, p0, Ld2/e$c;->x:Z

    iput v0, p0, Ld2/e$c;->y:I

    iput v0, p0, Ld2/e$c;->z:I

    iput v0, p0, Ld2/e$c;->A:I

    const/16 v1, 0x3e8

    iput v1, p0, Ld2/e$c;->B:I

    const/16 v1, 0xc8

    iput v1, p0, Ld2/e$c;->C:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Ld2/e$c;->D:F

    iput v1, p0, Ld2/e$c;->E:F

    iput v1, p0, Ld2/e$c;->F:F

    iput v1, p0, Ld2/e$c;->G:F

    iput v1, p0, Ld2/e$c;->H:F

    iput v1, p0, Ld2/e$c;->I:F

    iput v1, p0, Ld2/e$c;->J:F

    iput v1, p0, Ld2/e$c;->K:F

    iput v1, p0, Ld2/e$c;->L:F

    iput v1, p0, Ld2/e$c;->M:F

    const/4 v1, 0x1

    iput v1, p0, Ld2/e$c;->O:I

    iput v0, p0, Ld2/e$c;->P:I

    const/16 v0, 0x1f40

    iput v0, p0, Ld2/e$c;->Q:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Ld2/e$c;->R:J

    iput-wide v2, p0, Ld2/e$c;->S:J

    iput-boolean v1, p0, Ld2/e$c;->V:Z

    const-string v0, "eng"

    iput-object v0, p0, Ld2/e$c;->W:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Ld2/e$c;)V
    .locals 0

    invoke-direct {p0}, Ld2/e$c;->f()V

    return-void
.end method

.method static synthetic b(Ld2/e$c;)I
    .locals 0

    iget p0, p0, Ld2/e$c;->g:I

    return p0
.end method

.method static synthetic c(Ld2/e$c;I)I
    .locals 0

    iput p1, p0, Ld2/e$c;->g:I

    return p1
.end method

.method static synthetic d(Ld2/e$c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Ld2/e$c;->W:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Ld2/e$c;Z)Z
    .locals 0

    invoke-direct {p0, p1}, Ld2/e$c;->o(Z)Z

    move-result p0

    return p0
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Ld2/e$c;->X:Lx1/e0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g(Ljava/lang/String;)[B
    .locals 2

    iget-object v0, p0, Ld2/e$c;->k:[B

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Missing CodecPrivate for codec "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p1

    throw p1
.end method

.method private h()[B
    .locals 5

    iget v0, p0, Ld2/e$c;->D:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->E:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->F:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->G:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->H:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->I:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->J:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->K:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->L:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, Ld2/e$c;->M:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v0, 0x19

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->D:F

    const v3, 0x47435000    # 50000.0f

    mul-float v2, v2, v3

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->E:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->F:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->G:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->H:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->I:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->J:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->K:F

    mul-float v2, v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->L:F

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->M:F

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->B:I

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v2, p0, Ld2/e$c;->C:I

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static k(Lp3/a0;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp3/a0;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "[B>;>;"
        }
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lp3/a0;->U(I)V

    invoke-virtual {p0}, Lp3/a0;->w()J

    move-result-wide v2

    const-wide/32 v4, 0x58564944

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    new-instance p0, Landroid/util/Pair;

    const-string v0, "video/divx"

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    const-wide/32 v4, 0x33363248

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    new-instance p0, Landroid/util/Pair;

    const-string v0, "video/3gpp"

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_1
    const-wide/32 v4, 0x31435657

    cmp-long v0, v2, v4

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lp3/a0;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x14

    invoke-virtual {p0}, Lp3/a0;->e()[B

    move-result-object p0

    :goto_0
    array-length v2, p0

    add-int/lit8 v2, v2, -0x4

    if-ge v0, v2, :cond_3

    aget-byte v2, p0, v0

    if-nez v2, :cond_2

    add-int/lit8 v2, v0, 0x1

    aget-byte v2, p0, v2

    if-nez v2, :cond_2

    add-int/lit8 v2, v0, 0x2

    aget-byte v2, p0, v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    add-int/lit8 v2, v0, 0x3

    aget-byte v2, p0, v2

    const/16 v3, 0xf

    if-ne v2, v3, :cond_2

    array-length v2, p0

    invoke-static {p0, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    new-instance v0, Landroid/util/Pair;

    const-string v2, "video/wvc1"

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const-string p0, "Failed to find FourCC VC1 initialization data"

    invoke-static {p0, v1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    const-string p0, "MatroskaExtractor"

    const-string v0, "Unknown FourCC. Setting mimeType to video/x-unknown"

    invoke-static {p0, v0}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Landroid/util/Pair;

    const-string v0, "video/x-unknown"

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :catch_0
    const-string p0, "Error parsing FourCC private data"

    invoke-static {p0, v1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0
.end method

.method private static l(Lp3/a0;)Z
    .locals 8

    :try_start_0
    invoke-virtual {p0}, Lp3/a0;->y()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const v2, 0xfffe

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lp3/a0;->T(I)V

    invoke-virtual {p0}, Lp3/a0;->z()J

    move-result-wide v4

    invoke-static {}, Ld2/e;->g()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp3/a0;->z()J

    move-result-wide v4

    invoke-static {}, Ld2/e;->g()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p0, v4, v6

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_2
    return v3

    :catch_0
    const/4 p0, 0x0

    const-string v0, "Error parsing MS/ACM codec private"

    invoke-static {v0, p0}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0
.end method

.method private static m([B)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    const-string v0, "Error parsing vorbis codec private"

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    aget-byte v3, p0, v2

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    const/4 v3, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    :goto_0
    aget-byte v7, p0, v5

    const/16 v8, 0xff

    and-int/2addr v7, v8

    if-ne v7, v8, :cond_0

    add-int/lit16 v6, v6, 0xff

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v7, v5, 0x1

    aget-byte v5, p0, v5

    and-int/2addr v5, v8

    add-int/2addr v6, v5

    const/4 v5, 0x0

    :goto_1
    aget-byte v9, p0, v7

    and-int/2addr v9, v8

    if-ne v9, v8, :cond_1

    add-int/lit16 v5, v5, 0xff

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v7, 0x1

    aget-byte v7, p0, v7

    and-int/2addr v7, v8

    add-int/2addr v5, v7

    aget-byte v7, p0, v9

    if-ne v7, v3, :cond_4

    new-array v3, v6, [B

    invoke-static {p0, v9, v3, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v9, v6

    aget-byte v6, p0, v9

    const/4 v7, 0x3

    if-ne v6, v7, :cond_3

    add-int/2addr v9, v5

    aget-byte v5, p0, v9

    const/4 v6, 0x5

    if-ne v5, v6, :cond_2

    array-length v5, p0

    sub-int/2addr v5, v9

    new-array v5, v5, [B

    array-length v6, p0

    sub-int/2addr v6, v9

    invoke-static {p0, v9, v5, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_2
    invoke-static {v0, v1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0

    :cond_3
    invoke-static {v0, v1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {v0, v1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0

    :cond_5
    invoke-static {v0, v1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {v0, v1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0
.end method

.method private o(Z)Z
    .locals 2

    iget-object v0, p0, Ld2/e$c;->b:Ljava/lang/String;

    const-string v1, "A_OPUS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return p1

    :cond_0
    iget p1, p0, Ld2/e$c;->f:I

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public i(Lx1/n;I)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/16 v3, 0x20

    const/16 v4, 0x10

    const/16 v7, 0x8

    const/4 v9, 0x3

    sparse-switch v2, :sswitch_data_0

    :goto_0
    const/4 v1, -0x1

    goto/16 :goto_1

    :sswitch_0
    const-string v2, "A_OPUS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x20

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "A_FLAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x1f

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "A_EAC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v1, 0x1e

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "V_MPEG2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0x1d

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "S_TEXT/UTF8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/16 v1, 0x1c

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "S_TEXT/WEBVTT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/16 v1, 0x1b

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/16 v1, 0x1a

    goto/16 :goto_1

    :sswitch_7
    const-string v2, "S_TEXT/ASS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/16 v1, 0x19

    goto/16 :goto_1

    :sswitch_8
    const-string v2, "A_PCM/INT/LIT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/16 v1, 0x18

    goto/16 :goto_1

    :sswitch_9
    const-string v2, "A_PCM/INT/BIG"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v1, 0x17

    goto/16 :goto_1

    :sswitch_a
    const-string v2, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v1, 0x16

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "A_DTS/EXPRESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v1, 0x15

    goto/16 :goto_1

    :sswitch_c
    const-string v2, "V_THEORA"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v1, 0x14

    goto/16 :goto_1

    :sswitch_d
    const-string v2, "S_HDMV/PGS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v1, 0x13

    goto/16 :goto_1

    :sswitch_e
    const-string v2, "V_VP9"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v1, 0x12

    goto/16 :goto_1

    :sswitch_f
    const-string v2, "V_VP8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v1, 0x11

    goto/16 :goto_1

    :sswitch_10
    const-string v2, "V_AV1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v1, 0x10

    goto/16 :goto_1

    :sswitch_11
    const-string v2, "A_DTS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v1, 0xf

    goto/16 :goto_1

    :sswitch_12
    const-string v2, "A_AC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v1, 0xe

    goto/16 :goto_1

    :sswitch_13
    const-string v2, "A_AAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v1, 0xd

    goto/16 :goto_1

    :sswitch_14
    const-string v2, "A_DTS/LOSSLESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_15
    const-string v2, "S_VOBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_16
    const-string v2, "V_MPEG4/ISO/AVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_17
    const-string v2, "V_MPEG4/ISO/ASP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v1, 0x9

    goto/16 :goto_1

    :sswitch_18
    const-string v2, "S_DVBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v1, 0x8

    goto/16 :goto_1

    :sswitch_19
    const-string v2, "V_MS/VFW/FOURCC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_0

    :cond_19
    const/4 v1, 0x7

    goto :goto_1

    :sswitch_1a
    const-string v2, "A_MPEG/L3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/4 v1, 0x6

    goto :goto_1

    :sswitch_1b
    const-string v2, "A_MPEG/L2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/4 v1, 0x5

    goto :goto_1

    :sswitch_1c
    const-string v2, "A_VORBIS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/4 v1, 0x4

    goto :goto_1

    :sswitch_1d
    const-string v2, "A_TRUEHD"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/4 v1, 0x3

    goto :goto_1

    :sswitch_1e
    const-string v2, "A_MS/ACM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_1f
    const-string v2, "V_MPEG4/ISO/SP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_20
    const-string v2, "V_MPEG4/ISO/AP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    goto/16 :goto_0

    :cond_20
    const/4 v1, 0x0

    :goto_1
    const-string v2, "application/dvbsubs"

    const-string v12, "application/pgs"

    const-string v13, "application/vobsub"

    const-string v14, "text/vtt"

    const-string v15, "text/x-ssa"

    const-string v5, "application/x-subrip"

    const/16 v16, 0x1000

    const-string v6, ". Setting mimeType to "

    const-string v17, "audio/raw"

    const-string v11, "MatroskaExtractor"

    const-string v10, "audio/x-unknown"

    const/4 v8, 0x0

    packed-switch v1, :pswitch_data_0

    const-string v1, "Unrecognized codec identifier."

    invoke-static {v1, v8}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object v1

    throw v1

    :pswitch_0
    const/16 v16, 0x1680

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v3, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-wide v10, v0, Ld2/e$c;->R:J

    invoke-virtual {v3, v10, v11}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-wide v6, v0, Ld2/e$c;->S:J

    invoke-virtual {v3, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v17, "audio/opus"

    move-object v3, v8

    const/4 v4, -0x1

    const/16 v6, 0x1680

    goto/16 :goto_b

    :pswitch_1
    iget-object v1, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v17, "audio/flac"

    goto/16 :goto_7

    :pswitch_2
    const-string v17, "audio/eac3"

    goto/16 :goto_3

    :pswitch_3
    const-string v17, "video/mpeg2"

    goto/16 :goto_3

    :pswitch_4
    move-object/from16 v17, v5

    goto/16 :goto_3

    :pswitch_5
    move-object v1, v8

    move-object v3, v1

    move-object/from16 v17, v14

    goto/16 :goto_4

    :pswitch_6
    new-instance v1, Lp3/a0;

    iget-object v3, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Lp3/a0;-><init>([B)V

    invoke-static {v1}, Lq3/f;->a(Lp3/a0;)Lq3/f;

    move-result-object v1

    iget-object v3, v1, Lq3/f;->a:Ljava/util/List;

    iget v4, v1, Lq3/f;->b:I

    iput v4, v0, Ld2/e$c;->Y:I

    iget-object v1, v1, Lq3/f;->i:Ljava/lang/String;

    const-string v17, "video/hevc"

    goto/16 :goto_6

    :pswitch_7
    invoke-static {}, Ld2/e;->e()[B

    move-result-object v1

    iget-object v3, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/common/collect/q;->B(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object v1

    move-object v3, v8

    move-object/from16 v17, v15

    goto/16 :goto_4

    :pswitch_8
    iget v1, v0, Ld2/e$c;->P:I

    invoke-static {v1}, Lp3/n0;->b0(I)I

    move-result v1

    if-nez v1, :cond_21

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported little endian PCM bit depth: "

    :goto_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Ld2/e$c;->P:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_9

    :cond_21
    move v4, v1

    move-object v1, v8

    move-object v3, v1

    goto :goto_5

    :pswitch_9
    iget v1, v0, Ld2/e$c;->P:I

    if-ne v1, v7, :cond_22

    move-object v1, v8

    move-object v3, v1

    const/4 v4, 0x3

    goto :goto_5

    :cond_22
    if-ne v1, v4, :cond_23

    const/high16 v1, 0x10000000

    move-object v1, v8

    move-object v3, v1

    const/high16 v4, 0x10000000

    goto :goto_5

    :cond_23
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported big endian PCM bit depth: "

    goto :goto_2

    :pswitch_a
    iget v1, v0, Ld2/e$c;->P:I

    if-ne v1, v3, :cond_24

    move-object v1, v8

    move-object v3, v1

    const/4 v4, 0x4

    goto :goto_5

    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported floating point PCM bit depth: "

    goto :goto_2

    :pswitch_b
    const-string v17, "video/x-unknown"

    goto :goto_3

    :pswitch_c
    move-object v1, v8

    move-object v3, v1

    move-object/from16 v17, v12

    goto :goto_4

    :pswitch_d
    const-string v17, "video/x-vnd.on2.vp9"

    goto :goto_3

    :pswitch_e
    const-string v17, "video/x-vnd.on2.vp8"

    :goto_3
    move-object v1, v8

    move-object v3, v1

    :goto_4
    const/4 v4, -0x1

    :goto_5
    const/4 v6, -0x1

    goto/16 :goto_b

    :pswitch_f
    const-string v17, "video/av01"

    goto :goto_3

    :pswitch_10
    const-string v17, "audio/vnd.dts"

    goto :goto_3

    :pswitch_11
    const-string v17, "audio/ac3"

    goto :goto_3

    :pswitch_12
    iget-object v1, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-object v3, v0, Ld2/e$c;->k:[B

    invoke-static {v3}, Lu1/a;->f([B)Lu1/a$b;

    move-result-object v3

    iget v4, v3, Lu1/a$b;->a:I

    iput v4, v0, Ld2/e$c;->Q:I

    iget v4, v3, Lu1/a$b;->b:I

    iput v4, v0, Ld2/e$c;->O:I

    iget-object v3, v3, Lu1/a$b;->c:Ljava/lang/String;

    const-string v17, "audio/mp4a-latm"

    goto :goto_4

    :pswitch_13
    const-string v17, "audio/vnd.dts.hd"

    goto :goto_3

    :pswitch_14
    iget-object v1, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/common/collect/q;->A(Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object v1

    move-object v3, v8

    move-object/from16 v17, v13

    goto :goto_4

    :pswitch_15
    new-instance v1, Lp3/a0;

    iget-object v3, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Lp3/a0;-><init>([B)V

    invoke-static {v1}, Lq3/a;->b(Lp3/a0;)Lq3/a;

    move-result-object v1

    iget-object v3, v1, Lq3/a;->a:Ljava/util/List;

    iget v4, v1, Lq3/a;->b:I

    iput v4, v0, Ld2/e$c;->Y:I

    iget-object v1, v1, Lq3/a;->f:Ljava/lang/String;

    const-string v17, "video/avc"

    :goto_6
    const/4 v4, -0x1

    const/4 v6, -0x1

    move-object/from16 v18, v3

    move-object v3, v1

    move-object/from16 v1, v18

    goto/16 :goto_b

    :pswitch_16
    const/4 v1, 0x4

    new-array v3, v1, [B

    iget-object v4, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v4}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v4, v6, v3, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v3}, Lcom/google/common/collect/q;->A(Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object v1

    move-object/from16 v17, v2

    goto :goto_7

    :pswitch_17
    new-instance v1, Lp3/a0;

    iget-object v3, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Lp3/a0;-><init>([B)V

    invoke-static {v1}, Ld2/e$c;->k(Lp3/a0;)Landroid/util/Pair;

    move-result-object v1

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v17, v3

    check-cast v17, Ljava/lang/String;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    :goto_7
    move-object v3, v8

    goto/16 :goto_4

    :pswitch_18
    const-string v17, "audio/mpeg"

    goto :goto_8

    :pswitch_19
    const-string v17, "audio/mpeg-L2"

    :goto_8
    move-object v1, v8

    move-object v3, v1

    const/4 v4, -0x1

    const/16 v6, 0x1000

    goto :goto_b

    :pswitch_1a
    const/16 v16, 0x2000

    iget-object v1, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ld2/e$c;->m([B)Ljava/util/List;

    move-result-object v1

    const-string v17, "audio/vorbis"

    move-object v3, v8

    const/4 v4, -0x1

    const/16 v6, 0x2000

    goto :goto_b

    :pswitch_1b
    new-instance v1, Lx1/f0;

    invoke-direct {v1}, Lx1/f0;-><init>()V

    iput-object v1, v0, Ld2/e$c;->T:Lx1/f0;

    const-string v17, "audio/true-hd"

    goto/16 :goto_3

    :pswitch_1c
    new-instance v1, Lp3/a0;

    iget-object v3, v0, Ld2/e$c;->b:Ljava/lang/String;

    invoke-direct {v0, v3}, Ld2/e$c;->g(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Lp3/a0;-><init>([B)V

    invoke-static {v1}, Ld2/e$c;->l(Lp3/a0;)Z

    move-result v1

    if-eqz v1, :cond_25

    iget v1, v0, Ld2/e$c;->P:I

    invoke-static {v1}, Lp3/n0;->b0(I)I

    move-result v1

    if-nez v1, :cond_21

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported PCM bit depth: "

    goto/16 :goto_2

    :cond_25
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Non-PCM MS/ACM is unsupported. Setting mimeType to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_9
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v8

    move-object v3, v1

    move-object/from16 v17, v10

    goto/16 :goto_4

    :pswitch_1d
    iget-object v1, v0, Ld2/e$c;->k:[B

    if-nez v1, :cond_26

    move-object v1, v8

    goto :goto_a

    :cond_26
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_a
    const-string v17, "video/mp4v-es"

    goto :goto_7

    :goto_b
    iget-object v7, v0, Ld2/e$c;->N:[B

    if-eqz v7, :cond_27

    new-instance v7, Lp3/a0;

    iget-object v10, v0, Ld2/e$c;->N:[B

    invoke-direct {v7, v10}, Lp3/a0;-><init>([B)V

    invoke-static {v7}, Lq3/d;->a(Lp3/a0;)Lq3/d;

    move-result-object v7

    if-eqz v7, :cond_27

    iget-object v3, v7, Lq3/d;->c:Ljava/lang/String;

    const-string v17, "video/dolby-vision"

    :cond_27
    move-object/from16 v7, v17

    iget-boolean v10, v0, Ld2/e$c;->V:Z

    const/4 v11, 0x0

    or-int/2addr v10, v11

    iget-boolean v9, v0, Ld2/e$c;->U:Z

    if-eqz v9, :cond_28

    const/4 v9, 0x2

    goto :goto_c

    :cond_28
    const/4 v9, 0x0

    :goto_c
    or-int/2addr v9, v10

    new-instance v10, Ls1/n1$b;

    invoke-direct {v10}, Ls1/n1$b;-><init>()V

    invoke-static {v7}, Lp3/v;->o(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_29

    iget v2, v0, Ld2/e$c;->O:I

    invoke-virtual {v10, v2}, Ls1/n1$b;->J(I)Ls1/n1$b;

    move-result-object v2

    iget v5, v0, Ld2/e$c;->Q:I

    invoke-virtual {v2, v5}, Ls1/n1$b;->h0(I)Ls1/n1$b;

    move-result-object v2

    invoke-virtual {v2, v4}, Ls1/n1$b;->a0(I)Ls1/n1$b;

    const/4 v5, 0x1

    goto/16 :goto_11

    :cond_29
    invoke-static {v7}, Lp3/v;->s(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_35

    iget v2, v0, Ld2/e$c;->q:I

    if-nez v2, :cond_2c

    iget v2, v0, Ld2/e$c;->o:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_2a

    iget v2, v0, Ld2/e$c;->m:I

    :cond_2a
    iput v2, v0, Ld2/e$c;->o:I

    iget v2, v0, Ld2/e$c;->p:I

    if-ne v2, v4, :cond_2b

    iget v2, v0, Ld2/e$c;->n:I

    :cond_2b
    iput v2, v0, Ld2/e$c;->p:I

    goto :goto_d

    :cond_2c
    const/4 v4, -0x1

    :goto_d
    const/high16 v2, -0x40800000    # -1.0f

    iget v5, v0, Ld2/e$c;->o:I

    if-eq v5, v4, :cond_2d

    iget v12, v0, Ld2/e$c;->p:I

    if-eq v12, v4, :cond_2d

    iget v2, v0, Ld2/e$c;->n:I

    mul-int v2, v2, v5

    int-to-float v2, v2

    iget v5, v0, Ld2/e$c;->m:I

    mul-int v5, v5, v12

    int-to-float v5, v5

    div-float/2addr v2, v5

    :cond_2d
    iget-boolean v5, v0, Ld2/e$c;->x:Z

    if-eqz v5, :cond_2e

    invoke-direct/range {p0 .. p0}, Ld2/e$c;->h()[B

    move-result-object v5

    new-instance v8, Lq3/c;

    iget v12, v0, Ld2/e$c;->y:I

    iget v13, v0, Ld2/e$c;->A:I

    iget v14, v0, Ld2/e$c;->z:I

    invoke-direct {v8, v12, v13, v14, v5}, Lq3/c;-><init>(III[B)V

    :cond_2e
    iget-object v5, v0, Ld2/e$c;->a:Ljava/lang/String;

    if-eqz v5, :cond_2f

    invoke-static {}, Ld2/e;->f()Ljava/util/Map;

    move-result-object v5

    iget-object v12, v0, Ld2/e$c;->a:Ljava/lang/String;

    invoke-interface {v5, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-static {}, Ld2/e;->f()Ljava/util/Map;

    move-result-object v4

    iget-object v5, v0, Ld2/e$c;->a:Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :cond_2f
    iget v5, v0, Ld2/e$c;->r:I

    if-nez v5, :cond_34

    iget v5, v0, Ld2/e$c;->s:F

    const/4 v12, 0x0

    invoke-static {v5, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-nez v5, :cond_34

    iget v5, v0, Ld2/e$c;->t:F

    invoke-static {v5, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-nez v5, :cond_34

    iget v5, v0, Ld2/e$c;->u:F

    invoke-static {v5, v12}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-nez v5, :cond_30

    const/4 v4, 0x0

    goto :goto_f

    :cond_30
    iget v5, v0, Ld2/e$c;->t:F

    const/high16 v11, 0x42b40000    # 90.0f

    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-nez v5, :cond_31

    const/16 v4, 0x5a

    goto :goto_f

    :cond_31
    iget v5, v0, Ld2/e$c;->t:F

    const/high16 v11, -0x3ccc0000    # -180.0f

    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-eqz v5, :cond_33

    iget v5, v0, Ld2/e$c;->t:F

    const/high16 v11, 0x43340000    # 180.0f

    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-nez v5, :cond_32

    goto :goto_e

    :cond_32
    iget v5, v0, Ld2/e$c;->t:F

    const/high16 v11, -0x3d4c0000    # -90.0f

    invoke-static {v5, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-nez v5, :cond_34

    const/16 v4, 0x10e

    goto :goto_f

    :cond_33
    :goto_e
    const/16 v4, 0xb4

    :cond_34
    :goto_f
    iget v5, v0, Ld2/e$c;->m:I

    invoke-virtual {v10, v5}, Ls1/n1$b;->n0(I)Ls1/n1$b;

    move-result-object v5

    iget v11, v0, Ld2/e$c;->n:I

    invoke-virtual {v5, v11}, Ls1/n1$b;->S(I)Ls1/n1$b;

    move-result-object v5

    invoke-virtual {v5, v2}, Ls1/n1$b;->c0(F)Ls1/n1$b;

    move-result-object v2

    invoke-virtual {v2, v4}, Ls1/n1$b;->f0(I)Ls1/n1$b;

    move-result-object v2

    iget-object v4, v0, Ld2/e$c;->v:[B

    invoke-virtual {v2, v4}, Ls1/n1$b;->d0([B)Ls1/n1$b;

    move-result-object v2

    iget v4, v0, Ld2/e$c;->w:I

    invoke-virtual {v2, v4}, Ls1/n1$b;->j0(I)Ls1/n1$b;

    move-result-object v2

    invoke-virtual {v2, v8}, Ls1/n1$b;->L(Lq3/c;)Ls1/n1$b;

    const/4 v5, 0x2

    goto :goto_11

    :cond_35
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_37

    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_37

    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_37

    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_37

    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_37

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_36

    goto :goto_10

    :cond_36
    const-string v1, "Unexpected MIME type."

    invoke-static {v1, v8}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object v1

    throw v1

    :cond_37
    :goto_10
    const/4 v5, 0x3

    :goto_11
    iget-object v2, v0, Ld2/e$c;->a:Ljava/lang/String;

    if-eqz v2, :cond_38

    invoke-static {}, Ld2/e;->f()Ljava/util/Map;

    move-result-object v2

    iget-object v4, v0, Ld2/e$c;->a:Ljava/lang/String;

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_38

    iget-object v2, v0, Ld2/e$c;->a:Ljava/lang/String;

    invoke-virtual {v10, v2}, Ls1/n1$b;->W(Ljava/lang/String;)Ls1/n1$b;

    :cond_38
    move/from16 v2, p2

    invoke-virtual {v10, v2}, Ls1/n1$b;->T(I)Ls1/n1$b;

    move-result-object v2

    invoke-virtual {v2, v7}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v2

    invoke-virtual {v2, v6}, Ls1/n1$b;->Y(I)Ls1/n1$b;

    move-result-object v2

    iget-object v4, v0, Ld2/e$c;->W:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ls1/n1$b;->X(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v2

    invoke-virtual {v2, v9}, Ls1/n1$b;->i0(I)Ls1/n1$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Ls1/n1$b;->V(Ljava/util/List;)Ls1/n1$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Ls1/n1$b;->K(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v1

    iget-object v2, v0, Ld2/e$c;->l:Lw1/m;

    invoke-virtual {v1, v2}, Ls1/n1$b;->O(Lw1/m;)Ls1/n1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v1

    iget v2, v0, Ld2/e$c;->c:I

    move-object/from16 v3, p1

    invoke-interface {v3, v2, v5}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v2

    iput-object v2, v0, Ld2/e$c;->X:Lx1/e0;

    invoke-interface {v2, v1}, Lx1/e0;->e(Ls1/n1;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_1d
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_10
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j()V
    .locals 3

    iget-object v0, p0, Ld2/e$c;->T:Lx1/f0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ld2/e$c;->X:Lx1/e0;

    iget-object v2, p0, Ld2/e$c;->j:Lx1/e0$a;

    invoke-virtual {v0, v1, v2}, Lx1/f0;->a(Lx1/e0;Lx1/e0$a;)V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Ld2/e$c;->T:Lx1/f0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx1/f0;->b()V

    :cond_0
    return-void
.end method
