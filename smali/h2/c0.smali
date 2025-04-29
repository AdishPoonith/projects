.class public final Lh2/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/i0;


# instance fields
.field private final a:Lh2/b0;

.field private final b:Lp3/a0;

.field private c:I

.field private d:I

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Lh2/b0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/c0;->a:Lh2/b0;

    new-instance p1, Lp3/a0;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Lp3/a0;-><init>(I)V

    iput-object p1, p0, Lh2/c0;->b:Lp3/a0;

    return-void
.end method


# virtual methods
.method public a(Lp3/a0;I)V
    .locals 6

    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result v3

    invoke-virtual {p1}, Lp3/a0;->f()I

    move-result v4

    add-int/2addr v4, v3

    goto :goto_1

    :cond_1
    const/4 v4, -0x1

    :goto_1
    iget-boolean v3, p0, Lh2/c0;->f:Z

    if-eqz v3, :cond_3

    if-nez p2, :cond_2

    return-void

    :cond_2
    iput-boolean v1, p0, Lh2/c0;->f:Z

    invoke-virtual {p1, v4}, Lp3/a0;->T(I)V

    :goto_2
    iput v1, p0, Lh2/c0;->d:I

    :cond_3
    :goto_3
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result p2

    if-lez p2, :cond_9

    iget p2, p0, Lh2/c0;->d:I

    const/4 v3, 0x3

    if-ge p2, v3, :cond_6

    if-nez p2, :cond_4

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result p2

    invoke-virtual {p1}, Lp3/a0;->f()I

    move-result v4

    sub-int/2addr v4, v0

    invoke-virtual {p1, v4}, Lp3/a0;->T(I)V

    const/16 v4, 0xff

    if-ne p2, v4, :cond_4

    iput-boolean v0, p0, Lh2/c0;->f:Z

    return-void

    :cond_4
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result p2

    iget v4, p0, Lh2/c0;->d:I

    rsub-int/lit8 v4, v4, 0x3

    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v4, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {v4}, Lp3/a0;->e()[B

    move-result-object v4

    iget v5, p0, Lh2/c0;->d:I

    invoke-virtual {p1, v4, v5, p2}, Lp3/a0;->l([BII)V

    iget v4, p0, Lh2/c0;->d:I

    add-int/2addr v4, p2

    iput v4, p0, Lh2/c0;->d:I

    if-ne v4, v3, :cond_3

    iget-object p2, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {p2, v1}, Lp3/a0;->T(I)V

    iget-object p2, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {p2, v3}, Lp3/a0;->S(I)V

    iget-object p2, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {p2, v0}, Lp3/a0;->U(I)V

    iget-object p2, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {p2}, Lp3/a0;->G()I

    move-result p2

    iget-object v4, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {v4}, Lp3/a0;->G()I

    move-result v4

    and-int/lit16 v5, p2, 0x80

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    iput-boolean v5, p0, Lh2/c0;->e:Z

    and-int/lit8 p2, p2, 0xf

    shl-int/lit8 p2, p2, 0x8

    or-int/2addr p2, v4

    add-int/2addr p2, v3

    iput p2, p0, Lh2/c0;->c:I

    iget-object p2, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {p2}, Lp3/a0;->b()I

    move-result p2

    iget v3, p0, Lh2/c0;->c:I

    if-ge p2, v3, :cond_3

    const/16 p2, 0x1002

    iget-object v4, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {v4}, Lp3/a0;->b()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v3, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {v3, p2}, Lp3/a0;->c(I)V

    goto/16 :goto_3

    :cond_6
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result p2

    iget v3, p0, Lh2/c0;->c:I

    iget v4, p0, Lh2/c0;->d:I

    sub-int/2addr v3, v4

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v3, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {v3}, Lp3/a0;->e()[B

    move-result-object v3

    iget v4, p0, Lh2/c0;->d:I

    invoke-virtual {p1, v3, v4, p2}, Lp3/a0;->l([BII)V

    iget v3, p0, Lh2/c0;->d:I

    add-int/2addr v3, p2

    iput v3, p0, Lh2/c0;->d:I

    iget p2, p0, Lh2/c0;->c:I

    if-ne v3, p2, :cond_3

    iget-boolean v3, p0, Lh2/c0;->e:Z

    if-eqz v3, :cond_8

    iget-object p2, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {p2}, Lp3/a0;->e()[B

    move-result-object p2

    iget v3, p0, Lh2/c0;->c:I

    invoke-static {p2, v1, v3, v2}, Lp3/n0;->t([BIII)I

    move-result p2

    if-eqz p2, :cond_7

    iput-boolean v0, p0, Lh2/c0;->f:Z

    return-void

    :cond_7
    iget-object p2, p0, Lh2/c0;->b:Lp3/a0;

    iget v3, p0, Lh2/c0;->c:I

    add-int/lit8 v3, v3, -0x4

    invoke-virtual {p2, v3}, Lp3/a0;->S(I)V

    goto :goto_5

    :cond_8
    iget-object v3, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {v3, p2}, Lp3/a0;->S(I)V

    :goto_5
    iget-object p2, p0, Lh2/c0;->b:Lp3/a0;

    invoke-virtual {p2, v1}, Lp3/a0;->T(I)V

    iget-object p2, p0, Lh2/c0;->a:Lh2/b0;

    iget-object v3, p0, Lh2/c0;->b:Lp3/a0;

    invoke-interface {p2, v3}, Lh2/b0;->a(Lp3/a0;)V

    goto/16 :goto_2

    :cond_9
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh2/c0;->f:Z

    return-void
.end method

.method public c(Lp3/j0;Lx1/n;Lh2/i0$d;)V
    .locals 1

    iget-object v0, p0, Lh2/c0;->a:Lh2/b0;

    invoke-interface {v0, p1, p2, p3}, Lh2/b0;->c(Lp3/j0;Lx1/n;Lh2/i0$d;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh2/c0;->f:Z

    return-void
.end method
