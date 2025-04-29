.class final Lb2/f;
.super Lb2/e;
.source "SourceFile"


# instance fields
.field private final b:Lp3/a0;

.field private final c:Lp3/a0;

.field private d:I

.field private e:Z

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(Lx1/e0;)V
    .locals 1

    invoke-direct {p0, p1}, Lb2/e;-><init>(Lx1/e0;)V

    new-instance p1, Lp3/a0;

    sget-object v0, Lp3/w;->a:[B

    invoke-direct {p1, v0}, Lp3/a0;-><init>([B)V

    iput-object p1, p0, Lb2/f;->b:Lp3/a0;

    new-instance p1, Lp3/a0;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lp3/a0;-><init>(I)V

    iput-object p1, p0, Lb2/f;->c:Lp3/a0;

    return-void
.end method


# virtual methods
.method protected b(Lp3/a0;)Z
    .locals 3

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    and-int/lit8 p1, p1, 0xf

    const/4 v1, 0x7

    if-ne p1, v1, :cond_1

    iput v0, p0, Lb2/f;->g:I

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    new-instance v0, Lb2/e$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video format not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lb2/e$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected c(Lp3/a0;J)Z
    .locals 10

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result v0

    invoke-virtual {p1}, Lp3/a0;->q()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    add-long v4, p2, v1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-nez v0, :cond_0

    iget-boolean v1, p0, Lb2/f;->e:Z

    if-nez v1, :cond_0

    new-instance v0, Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v1

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lp3/a0;-><init>([B)V

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v1

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v2

    invoke-virtual {p1, v1, p3, v2}, Lp3/a0;->l([BII)V

    invoke-static {v0}, Lq3/a;->b(Lp3/a0;)Lq3/a;

    move-result-object p1

    iget v0, p1, Lq3/a;->b:I

    iput v0, p0, Lb2/f;->d:I

    new-instance v0, Ls1/n1$b;

    invoke-direct {v0}, Ls1/n1$b;-><init>()V

    const-string v1, "video/avc"

    invoke-virtual {v0, v1}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v0

    iget-object v1, p1, Lq3/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls1/n1$b;->K(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v0

    iget v1, p1, Lq3/a;->c:I

    invoke-virtual {v0, v1}, Ls1/n1$b;->n0(I)Ls1/n1$b;

    move-result-object v0

    iget v1, p1, Lq3/a;->d:I

    invoke-virtual {v0, v1}, Ls1/n1$b;->S(I)Ls1/n1$b;

    move-result-object v0

    iget v1, p1, Lq3/a;->e:F

    invoke-virtual {v0, v1}, Ls1/n1$b;->c0(F)Ls1/n1$b;

    move-result-object v0

    iget-object p1, p1, Lq3/a;->a:Ljava/util/List;

    invoke-virtual {v0, p1}, Ls1/n1$b;->V(Ljava/util/List;)Ls1/n1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p1

    iget-object v0, p0, Lb2/e;->a:Lx1/e0;

    invoke-interface {v0, p1}, Lx1/e0;->e(Ls1/n1;)V

    iput-boolean p2, p0, Lb2/f;->e:Z

    return p3

    :cond_0
    if-ne v0, p2, :cond_4

    iget-boolean v0, p0, Lb2/f;->e:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lb2/f;->g:I

    if-ne v0, p2, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    iget-boolean v0, p0, Lb2/f;->f:Z

    if-nez v0, :cond_2

    if-nez v6, :cond_2

    return p3

    :cond_2
    iget-object v0, p0, Lb2/f;->c:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    aput-byte p3, v0, p3

    aput-byte p3, v0, p2

    const/4 v1, 0x2

    aput-byte p3, v0, v1

    iget v0, p0, Lb2/f;->d:I

    const/4 v1, 0x4

    rsub-int/lit8 v0, v0, 0x4

    const/4 v7, 0x0

    :goto_1
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v2

    if-lez v2, :cond_3

    iget-object v2, p0, Lb2/f;->c:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->e()[B

    move-result-object v2

    iget v3, p0, Lb2/f;->d:I

    invoke-virtual {p1, v2, v0, v3}, Lp3/a0;->l([BII)V

    iget-object v2, p0, Lb2/f;->c:Lp3/a0;

    invoke-virtual {v2, p3}, Lp3/a0;->T(I)V

    iget-object v2, p0, Lb2/f;->c:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->K()I

    move-result v2

    iget-object v3, p0, Lb2/f;->b:Lp3/a0;

    invoke-virtual {v3, p3}, Lp3/a0;->T(I)V

    iget-object v3, p0, Lb2/e;->a:Lx1/e0;

    iget-object v8, p0, Lb2/f;->b:Lp3/a0;

    invoke-interface {v3, v8, v1}, Lx1/e0;->d(Lp3/a0;I)V

    add-int/lit8 v7, v7, 0x4

    iget-object v3, p0, Lb2/e;->a:Lx1/e0;

    invoke-interface {v3, p1, v2}, Lx1/e0;->d(Lp3/a0;I)V

    add-int/2addr v7, v2

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lb2/e;->a:Lx1/e0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lx1/e0;->c(JIIILx1/e0$a;)V

    iput-boolean p2, p0, Lb2/f;->f:Z

    return p2

    :cond_4
    return p3
.end method
