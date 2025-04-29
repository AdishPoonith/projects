.class public final Lh2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/m;


# instance fields
.field private final a:Lp3/a0;

.field private final b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lx1/e0;

.field private e:I

.field private f:I

.field private g:I

.field private h:J

.field private i:Ls1/n1;

.field private j:I

.field private k:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp3/a0;

    const/16 v1, 0x12

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lp3/a0;-><init>([B)V

    iput-object v0, p0, Lh2/k;->a:Lp3/a0;

    const/4 v0, 0x0

    iput v0, p0, Lh2/k;->e:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/k;->k:J

    iput-object p1, p0, Lh2/k;->b:Ljava/lang/String;

    return-void
.end method

.method private f(Lp3/a0;[BI)Z
    .locals 2

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    iget v1, p0, Lh2/k;->f:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lh2/k;->f:I

    invoke-virtual {p1, p2, v1, v0}, Lp3/a0;->l([BII)V

    iget p1, p0, Lh2/k;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Lh2/k;->f:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private g()V
    .locals 5

    iget-object v0, p0, Lh2/k;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    iget-object v1, p0, Lh2/k;->i:Ls1/n1;

    if-nez v1, :cond_0

    iget-object v1, p0, Lh2/k;->c:Ljava/lang/String;

    iget-object v2, p0, Lh2/k;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lu1/e0;->g([BLjava/lang/String;Ljava/lang/String;Lw1/m;)Ls1/n1;

    move-result-object v1

    iput-object v1, p0, Lh2/k;->i:Ls1/n1;

    iget-object v2, p0, Lh2/k;->d:Lx1/e0;

    invoke-interface {v2, v1}, Lx1/e0;->e(Ls1/n1;)V

    :cond_0
    invoke-static {v0}, Lu1/e0;->a([B)I

    move-result v1

    iput v1, p0, Lh2/k;->j:I

    const-wide/32 v1, 0xf4240

    invoke-static {v0}, Lu1/e0;->f([B)I

    move-result v0

    int-to-long v3, v0

    mul-long v3, v3, v1

    iget-object v0, p0, Lh2/k;->i:Ls1/n1;

    iget v0, v0, Ls1/n1;->I:I

    int-to-long v0, v0

    div-long/2addr v3, v0

    long-to-int v0, v3

    int-to-long v0, v0

    iput-wide v0, p0, Lh2/k;->h:J

    return-void
.end method

.method private h(Lp3/a0;)Z
    .locals 5

    :cond_0
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    iget v0, p0, Lh2/k;->g:I

    shl-int/lit8 v0, v0, 0x8

    iput v0, p0, Lh2/k;->g:I

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result v2

    or-int/2addr v0, v2

    iput v0, p0, Lh2/k;->g:I

    invoke-static {v0}, Lu1/e0;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lh2/k;->a:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->e()[B

    move-result-object p1

    iget v0, p0, Lh2/k;->g:I

    shr-int/lit8 v2, v0, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, p1, v1

    shr-int/lit8 v2, v0, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    const/4 v3, 0x1

    aput-byte v2, p1, v3

    const/4 v2, 0x2

    shr-int/lit8 v4, v0, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, p1, v2

    const/4 v2, 0x3

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, p1, v2

    const/4 p1, 0x4

    iput p1, p0, Lh2/k;->f:I

    iput v1, p0, Lh2/k;->g:I

    return v3

    :cond_1
    return v1
.end method


# virtual methods
.method public a(Lp3/a0;)V
    .locals 10

    iget-object v0, p0, Lh2/k;->d:Lx1/e0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    if-lez v0, :cond_5

    iget v0, p0, Lh2/k;->e:I

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v1, :cond_3

    if-ne v0, v3, :cond_2

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    iget v1, p0, Lh2/k;->j:I

    iget v3, p0, Lh2/k;->f:I

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lh2/k;->d:Lx1/e0;

    invoke-interface {v1, p1, v0}, Lx1/e0;->d(Lp3/a0;I)V

    iget v1, p0, Lh2/k;->f:I

    add-int/2addr v1, v0

    iput v1, p0, Lh2/k;->f:I

    iget v7, p0, Lh2/k;->j:I

    if-ne v1, v7, :cond_0

    iget-wide v4, p0, Lh2/k;->k:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v4, v0

    if-eqz v3, :cond_1

    iget-object v3, p0, Lh2/k;->d:Lx1/e0;

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lx1/e0;->c(JIIILx1/e0$a;)V

    iget-wide v0, p0, Lh2/k;->k:J

    iget-wide v3, p0, Lh2/k;->h:J

    add-long/2addr v0, v3

    iput-wide v0, p0, Lh2/k;->k:J

    :cond_1
    iput v2, p0, Lh2/k;->e:I

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_3
    iget-object v0, p0, Lh2/k;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/16 v1, 0x12

    invoke-direct {p0, p1, v0, v1}, Lh2/k;->f(Lp3/a0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lh2/k;->g()V

    iget-object v0, p0, Lh2/k;->a:Lp3/a0;

    invoke-virtual {v0, v2}, Lp3/a0;->T(I)V

    iget-object v0, p0, Lh2/k;->d:Lx1/e0;

    iget-object v2, p0, Lh2/k;->a:Lp3/a0;

    invoke-interface {v0, v2, v1}, Lx1/e0;->d(Lp3/a0;I)V

    iput v3, p0, Lh2/k;->e:I

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1}, Lh2/k;->h(Lp3/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput v1, p0, Lh2/k;->e:I

    goto :goto_0

    :cond_5
    return-void
.end method

.method public b()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lh2/k;->e:I

    iput v0, p0, Lh2/k;->f:I

    iput v0, p0, Lh2/k;->g:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/k;->k:J

    return-void
.end method

.method public c(Lx1/n;Lh2/i0$d;)V
    .locals 1

    invoke-virtual {p2}, Lh2/i0$d;->a()V

    invoke-virtual {p2}, Lh2/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh2/k;->c:Ljava/lang/String;

    invoke-virtual {p2}, Lh2/i0$d;->c()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lx1/n;->d(II)Lx1/e0;

    move-result-object p1

    iput-object p1, p0, Lh2/k;->d:Lx1/e0;

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

    iput-wide p1, p0, Lh2/k;->k:J

    :cond_0
    return-void
.end method
