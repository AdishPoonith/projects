.class public final Lx1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/m;


# instance fields
.field private final a:[B

.field private final b:Lo3/i;

.field private final c:J

.field private d:J

.field private e:[B

.field private f:I

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.extractor"

    invoke-static {v0}, Ls1/k1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lo3/i;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/f;->b:Lo3/i;

    iput-wide p2, p0, Lx1/f;->d:J

    iput-wide p4, p0, Lx1/f;->c:J

    const/high16 p1, 0x10000

    new-array p1, p1, [B

    iput-object p1, p0, Lx1/f;->e:[B

    const/16 p1, 0x1000

    new-array p1, p1, [B

    iput-object p1, p0, Lx1/f;->a:[B

    return-void
.end method

.method private q(I)V
    .locals 4

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-wide v0, p0, Lx1/f;->d:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lx1/f;->d:J

    :cond_0
    return-void
.end method

.method private r(I)V
    .locals 3

    iget v0, p0, Lx1/f;->f:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lx1/f;->e:[B

    array-length v1, p1

    if-le v0, v1, :cond_0

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x2

    const/high16 v1, 0x10000

    add-int/2addr v1, v0

    const/high16 v2, 0x80000

    add-int/2addr v0, v2

    invoke-static {p1, v1, v0}, Lp3/n0;->q(III)I

    move-result p1

    iget-object v0, p0, Lx1/f;->e:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lx1/f;->e:[B

    :cond_0
    return-void
.end method

.method private s([BII)I
    .locals 2

    iget v0, p0, Lx1/f;->g:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v0, p0, Lx1/f;->e:[B

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {p0, p3}, Lx1/f;->w(I)V

    return p3
.end method

.method private t([BIIIZ)I
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lx1/f;->b:Lo3/i;

    add-int/2addr p2, p4

    sub-int/2addr p3, p4

    invoke-interface {v0, p1, p2, p3}, Lo3/i;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-nez p4, :cond_0

    if-eqz p5, :cond_0

    return p2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    add-int/2addr p4, p1

    return p4

    :cond_2
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
.end method

.method private u(I)I
    .locals 1

    iget v0, p0, Lx1/f;->g:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {p0, p1}, Lx1/f;->w(I)V

    return p1
.end method

.method private w(I)V
    .locals 5

    iget v0, p0, Lx1/f;->g:I

    sub-int/2addr v0, p1

    iput v0, p0, Lx1/f;->g:I

    const/4 v1, 0x0

    iput v1, p0, Lx1/f;->f:I

    iget-object v2, p0, Lx1/f;->e:[B

    array-length v3, v2

    const/high16 v4, 0x80000

    sub-int/2addr v3, v4

    if-ge v0, v3, :cond_0

    const/high16 v3, 0x10000

    add-int/2addr v3, v0

    new-array v3, v3, [B

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-static {v2, p1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v3, p0, Lx1/f;->e:[B

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lx1/f;->c:J

    return-wide v0
.end method

.method public b(I)I
    .locals 7

    invoke-direct {p0, p1}, Lx1/f;->u(I)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v2, p0, Lx1/f;->a:[B

    const/4 v3, 0x0

    array-length v0, v2

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lx1/f;->t([BIIIZ)I

    move-result v0

    :cond_0
    invoke-direct {p0, v0}, Lx1/f;->q(I)V

    return v0
.end method

.method public c([BIIZ)Z
    .locals 7

    invoke-direct {p0, p1, p2, p3}, Lx1/f;->s([BII)I

    move-result v0

    move v5, v0

    :goto_0
    const/4 v0, -0x1

    if-ge v5, p3, :cond_0

    if-eq v5, v0, :cond_0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lx1/f;->t([BIIIZ)I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-direct {p0, v5}, Lx1/f;->q(I)V

    if-eq v5, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public d([BII)I
    .locals 7

    invoke-direct {p0, p3}, Lx1/f;->r(I)V

    iget v0, p0, Lx1/f;->g:I

    iget v3, p0, Lx1/f;->f:I

    sub-int/2addr v0, v3

    if-nez v0, :cond_1

    iget-object v2, p0, Lx1/f;->e:[B

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    move v4, p3

    invoke-direct/range {v1 .. v6}, Lx1/f;->t([BIIIZ)I

    move-result p3

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lx1/f;->g:I

    add-int/2addr v0, p3

    iput v0, p0, Lx1/f;->g:I

    goto :goto_0

    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    iget-object v0, p0, Lx1/f;->e:[B

    iget v1, p0, Lx1/f;->f:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lx1/f;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lx1/f;->f:I

    return p3
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx1/f;->f:I

    return-void
.end method

.method public g(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lx1/f;->v(IZ)Z

    return-void
.end method

.method public i(IZ)Z
    .locals 7

    invoke-direct {p0, p1}, Lx1/f;->r(I)V

    iget v0, p0, Lx1/f;->g:I

    iget v1, p0, Lx1/f;->f:I

    sub-int/2addr v0, v1

    move v5, v0

    :goto_0
    if-ge v5, p1, :cond_1

    iget-object v2, p0, Lx1/f;->e:[B

    iget v3, p0, Lx1/f;->f:I

    move-object v1, p0

    move v4, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lx1/f;->t([BIIIZ)I

    move-result v5

    const/4 v0, -0x1

    if-ne v5, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, Lx1/f;->f:I

    add-int/2addr v0, v5

    iput v0, p0, Lx1/f;->g:I

    goto :goto_0

    :cond_1
    iget p2, p0, Lx1/f;->f:I

    add-int/2addr p2, p1

    iput p2, p0, Lx1/f;->f:I

    const/4 p1, 0x1

    return p1
.end method

.method public k([BIIZ)Z
    .locals 1

    invoke-virtual {p0, p3, p4}, Lx1/f;->i(IZ)Z

    move-result p4

    if-nez p4, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p4, p0, Lx1/f;->e:[B

    iget v0, p0, Lx1/f;->f:I

    sub-int/2addr v0, p3

    invoke-static {p4, v0, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x1

    return p1
.end method

.method public l()J
    .locals 4

    iget-wide v0, p0, Lx1/f;->d:J

    iget v2, p0, Lx1/f;->f:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public n([BII)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lx1/f;->k([BIIZ)Z

    return-void
.end method

.method public o(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lx1/f;->i(IZ)Z

    return-void
.end method

.method public p()J
    .locals 2

    iget-wide v0, p0, Lx1/f;->d:J

    return-wide v0
.end method

.method public read([BII)I
    .locals 7

    invoke-direct {p0, p1, p2, p3}, Lx1/f;->s([BII)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v6}, Lx1/f;->t([BIIIZ)I

    move-result v0

    :cond_0
    invoke-direct {p0, v0}, Lx1/f;->q(I)V

    return v0
.end method

.method public readFully([BII)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lx1/f;->c([BIIZ)Z

    return-void
.end method

.method public v(IZ)Z
    .locals 7

    invoke-direct {p0, p1}, Lx1/f;->u(I)I

    move-result v0

    move v5, v0

    :goto_0
    const/4 v0, -0x1

    if-ge v5, p1, :cond_0

    if-eq v5, v0, :cond_0

    iget-object v0, p0, Lx1/f;->a:[B

    array-length v0, v0

    add-int/2addr v0, v5

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget-object v2, p0, Lx1/f;->a:[B

    neg-int v3, v5

    move-object v1, p0

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lx1/f;->t([BIIIZ)I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-direct {p0, v5}, Lx1/f;->q(I)V

    if-eq v5, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
