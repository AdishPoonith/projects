.class final Lz2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/n0;


# instance fields
.field private final j:I

.field private final k:Lz2/p;

.field private l:I


# direct methods
.method public constructor <init>(Lz2/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/l;->k:Lz2/p;

    iput p2, p0, Lz2/l;->j:I

    const/4 p1, -0x1

    iput p1, p0, Lz2/l;->l:I

    return-void
.end method

.method private c()Z
    .locals 2

    iget v0, p0, Lz2/l;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget v0, p0, Lz2/l;->l:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    iget-object v0, p0, Lz2/l;->k:Lz2/p;

    iget v1, p0, Lz2/l;->j:I

    invoke-virtual {v0, v1}, Lz2/p;->y(I)I

    move-result v0

    iput v0, p0, Lz2/l;->l:I

    return-void
.end method

.method public b()V
    .locals 3

    iget v0, p0, Lz2/l;->l:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_2

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lz2/l;->k:Lz2/p;

    invoke-virtual {v0}, Lz2/p;->U()V

    goto :goto_0

    :cond_0
    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lz2/l;->k:Lz2/p;

    invoke-virtual {v1, v0}, Lz2/p;->V(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v0, Lz2/r;

    iget-object v1, p0, Lz2/l;->k:Lz2/p;

    invoke-virtual {v1}, Lz2/p;->p()Lu2/v0;

    move-result-object v1

    iget v2, p0, Lz2/l;->j:I

    invoke-virtual {v1, v2}, Lu2/v0;->b(I)Lu2/t0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lu2/t0;->b(I)Ls1/n1;

    move-result-object v1

    iget-object v1, v1, Ls1/n1;->u:Ljava/lang/String;

    invoke-direct {v0, v1}, Lz2/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Lz2/l;->l:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    invoke-direct {p0}, Lz2/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/l;->k:Lz2/p;

    iget v1, p0, Lz2/l;->l:I

    invoke-virtual {v0, v1}, Lz2/p;->Q(I)Z

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

.method public e()V
    .locals 3

    iget v0, p0, Lz2/l;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lz2/l;->k:Lz2/p;

    iget v2, p0, Lz2/l;->j:I

    invoke-virtual {v0, v2}, Lz2/p;->p0(I)V

    iput v1, p0, Lz2/l;->l:I

    :cond_0
    return-void
.end method

.method public k(Ls1/o1;Lv1/g;I)I
    .locals 2

    iget v0, p0, Lz2/l;->l:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, Lv1/a;->k(I)V

    const/4 p1, -0x4

    return p1

    :cond_0
    invoke-direct {p0}, Lz2/l;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz2/l;->k:Lz2/p;

    iget v1, p0, Lz2/l;->l:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lz2/p;->e0(ILs1/o1;Lv1/g;I)I

    move-result v1

    :cond_1
    return v1
.end method

.method public t(J)I
    .locals 2

    invoke-direct {p0}, Lz2/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/l;->k:Lz2/p;

    iget v1, p0, Lz2/l;->l:I

    invoke-virtual {v0, v1, p1, p2}, Lz2/p;->o0(IJ)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
