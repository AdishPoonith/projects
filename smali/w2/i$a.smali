.class public final Lw2/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/n0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final j:Lw2/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw2/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final k:Lu2/m0;

.field private final l:I

.field private m:Z

.field final synthetic n:Lw2/i;


# direct methods
.method public constructor <init>(Lw2/i;Lw2/i;Lu2/m0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw2/i<",
            "TT;>;",
            "Lu2/m0;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lw2/i$a;->n:Lw2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw2/i$a;->j:Lw2/i;

    iput-object p3, p0, Lw2/i$a;->k:Lu2/m0;

    iput p4, p0, Lw2/i$a;->l:I

    return-void
.end method

.method private a()V
    .locals 8

    iget-boolean v0, p0, Lw2/i$a;->m:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {v0}, Lw2/i;->A(Lw2/i;)Lu2/b0$a;

    move-result-object v1

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {v0}, Lw2/i;->x(Lw2/i;)[I

    move-result-object v0

    iget v2, p0, Lw2/i$a;->l:I

    aget v2, v0, v2

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {v0}, Lw2/i;->y(Lw2/i;)[Ls1/n1;

    move-result-object v0

    iget v3, p0, Lw2/i$a;->l:I

    aget-object v3, v0, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {v0}, Lw2/i;->z(Lw2/i;)J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lu2/b0$a;->i(ILs1/n1;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw2/i$a;->m:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {v0}, Lw2/i;->w(Lw2/i;)[Z

    move-result-object v0

    iget v1, p0, Lw2/i$a;->l:I

    aget-boolean v0, v0, v1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {v0}, Lw2/i;->w(Lw2/i;)[Z

    move-result-object v0

    iget v1, p0, Lw2/i$a;->l:I

    const/4 v2, 0x0

    aput-boolean v2, v0, v1

    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-virtual {v0}, Lw2/i;->I()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw2/i$a;->k:Lu2/m0;

    iget-object v1, p0, Lw2/i$a;->n:Lw2/i;

    iget-boolean v1, v1, Lw2/i;->F:Z

    invoke-virtual {v0, v1}, Lu2/m0;->K(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(Ls1/o1;Lv1/g;I)I
    .locals 3

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-virtual {v0}, Lw2/i;->I()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {v0}, Lw2/i;->v(Lw2/i;)Lw2/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {v0}, Lw2/i;->v(Lw2/i;)Lw2/a;

    move-result-object v0

    iget v2, p0, Lw2/i$a;->l:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Lw2/a;->i(I)I

    move-result v0

    iget-object v2, p0, Lw2/i$a;->k:Lu2/m0;

    invoke-virtual {v2}, Lu2/m0;->C()I

    move-result v2

    if-gt v0, v2, :cond_1

    return v1

    :cond_1
    invoke-direct {p0}, Lw2/i$a;->a()V

    iget-object v0, p0, Lw2/i$a;->k:Lu2/m0;

    iget-object v1, p0, Lw2/i$a;->n:Lw2/i;

    iget-boolean v1, v1, Lw2/i;->F:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lu2/m0;->S(Ls1/o1;Lv1/g;IZ)I

    move-result p1

    return p1
.end method

.method public t(J)I
    .locals 2

    iget-object v0, p0, Lw2/i$a;->n:Lw2/i;

    invoke-virtual {v0}, Lw2/i;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lw2/i$a;->k:Lu2/m0;

    iget-object v1, p0, Lw2/i$a;->n:Lw2/i;

    iget-boolean v1, v1, Lw2/i;->F:Z

    invoke-virtual {v0, p1, p2, v1}, Lu2/m0;->E(JZ)I

    move-result p1

    iget-object p2, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {p2}, Lw2/i;->v(Lw2/i;)Lw2/a;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lw2/i$a;->n:Lw2/i;

    invoke-static {p2}, Lw2/i;->v(Lw2/i;)Lw2/a;

    move-result-object p2

    iget v0, p0, Lw2/i$a;->l:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lw2/a;->i(I)I

    move-result p2

    iget-object v0, p0, Lw2/i$a;->k:Lu2/m0;

    invoke-virtual {v0}, Lu2/m0;->C()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    iget-object p2, p0, Lw2/i$a;->k:Lu2/m0;

    invoke-virtual {p2, p1}, Lu2/m0;->e0(I)V

    if-lez p1, :cond_2

    invoke-direct {p0}, Lw2/i$a;->a()V

    :cond_2
    return p1
.end method
