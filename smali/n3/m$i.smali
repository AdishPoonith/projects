.class final Ln3/m$i;
.super Ln3/m$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln3/m$h<",
        "Ln3/m$i;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:I

.field private final n:Z

.field private final o:Ln3/m$d;

.field private final p:Z

.field private final q:Z

.field private final r:I

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:Z

.field private final w:Z

.field private final x:I

.field private final y:Z

.field private final z:Z


# direct methods
.method public constructor <init>(ILu2/t0;ILn3/m$d;IIZ)V
    .locals 4

    invoke-direct {p0, p1, p2, p3}, Ln3/m$h;-><init>(ILu2/t0;I)V

    iput-object p4, p0, Ln3/m$i;->o:Ln3/m$d;

    iget-boolean p1, p4, Ln3/m$d;->o0:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x18

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    iget-boolean p2, p4, Ln3/m$d;->n0:Z

    const/4 p3, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    and-int p2, p6, p1

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    iput-boolean p2, p0, Ln3/m$i;->w:Z

    const/high16 p2, -0x40800000    # -1.0f

    const/4 p6, -0x1

    if-eqz p7, :cond_6

    iget-object v1, p0, Ln3/m$h;->m:Ls1/n1;

    iget v2, v1, Ls1/n1;->z:I

    if-eq v2, p6, :cond_2

    iget v3, p4, Ln3/a0;->j:I

    if-gt v2, v3, :cond_6

    :cond_2
    iget v2, v1, Ls1/n1;->A:I

    if-eq v2, p6, :cond_3

    iget v3, p4, Ln3/a0;->k:I

    if-gt v2, v3, :cond_6

    :cond_3
    iget v2, v1, Ls1/n1;->B:F

    cmpl-float v3, v2, p2

    if-eqz v3, :cond_4

    iget v3, p4, Ln3/a0;->l:I

    int-to-float v3, v3

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_6

    :cond_4
    iget v1, v1, Ls1/n1;->q:I

    if-eq v1, p6, :cond_5

    iget v2, p4, Ln3/a0;->m:I

    if-gt v1, v2, :cond_6

    :cond_5
    const/4 v1, 0x1

    goto :goto_2

    :cond_6
    const/4 v1, 0x0

    :goto_2
    iput-boolean v1, p0, Ln3/m$i;->n:Z

    if-eqz p7, :cond_b

    iget-object p7, p0, Ln3/m$h;->m:Ls1/n1;

    iget v1, p7, Ls1/n1;->z:I

    if-eq v1, p6, :cond_7

    iget v2, p4, Ln3/a0;->n:I

    if-lt v1, v2, :cond_b

    :cond_7
    iget v1, p7, Ls1/n1;->A:I

    if-eq v1, p6, :cond_8

    iget v2, p4, Ln3/a0;->o:I

    if-lt v1, v2, :cond_b

    :cond_8
    iget v1, p7, Ls1/n1;->B:F

    cmpl-float p2, v1, p2

    if-eqz p2, :cond_9

    iget p2, p4, Ln3/a0;->p:I

    int-to-float p2, p2

    cmpl-float p2, v1, p2

    if-ltz p2, :cond_b

    :cond_9
    iget p2, p7, Ls1/n1;->q:I

    if-eq p2, p6, :cond_a

    iget p6, p4, Ln3/a0;->q:I

    if-lt p2, p6, :cond_b

    :cond_a
    const/4 p2, 0x1

    goto :goto_3

    :cond_b
    const/4 p2, 0x0

    :goto_3
    iput-boolean p2, p0, Ln3/m$i;->p:Z

    invoke-static {p5, v0}, Ln3/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ln3/m$i;->q:Z

    iget-object p2, p0, Ln3/m$h;->m:Ls1/n1;

    iget p6, p2, Ls1/n1;->q:I

    iput p6, p0, Ln3/m$i;->r:I

    invoke-virtual {p2}, Ls1/n1;->f()I

    move-result p2

    iput p2, p0, Ln3/m$i;->s:I

    iget-object p2, p0, Ln3/m$h;->m:Ls1/n1;

    iget p2, p2, Ls1/n1;->n:I

    iget p6, p4, Ln3/a0;->v:I

    invoke-static {p2, p6}, Ln3/m;->t(II)I

    move-result p2

    iput p2, p0, Ln3/m$i;->u:I

    iget-object p2, p0, Ln3/m$h;->m:Ls1/n1;

    iget p2, p2, Ls1/n1;->n:I

    if-eqz p2, :cond_d

    and-int/2addr p2, p3

    if-eqz p2, :cond_c

    goto :goto_4

    :cond_c
    const/4 p2, 0x0

    goto :goto_5

    :cond_d
    :goto_4
    const/4 p2, 0x1

    :goto_5
    iput-boolean p2, p0, Ln3/m$i;->v:Z

    const p2, 0x7fffffff

    const/4 p6, 0x0

    :goto_6
    iget-object p7, p4, Ln3/a0;->u:Lcom/google/common/collect/q;

    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p7

    if-ge p6, p7, :cond_f

    iget-object p7, p0, Ln3/m$h;->m:Ls1/n1;

    iget-object p7, p7, Ls1/n1;->u:Ljava/lang/String;

    if-eqz p7, :cond_e

    iget-object v1, p4, Ln3/a0;->u:Lcom/google/common/collect/q;

    invoke-interface {v1, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p7

    if-eqz p7, :cond_e

    move p2, p6

    goto :goto_7

    :cond_e
    add-int/lit8 p6, p6, 0x1

    goto :goto_6

    :cond_f
    :goto_7
    iput p2, p0, Ln3/m$i;->t:I

    invoke-static {p5}, Ls1/m3;->e(I)I

    move-result p2

    const/16 p4, 0x80

    if-ne p2, p4, :cond_10

    const/4 p2, 0x1

    goto :goto_8

    :cond_10
    const/4 p2, 0x0

    :goto_8
    iput-boolean p2, p0, Ln3/m$i;->y:Z

    invoke-static {p5}, Ls1/m3;->g(I)I

    move-result p2

    const/16 p4, 0x40

    if-ne p2, p4, :cond_11

    goto :goto_9

    :cond_11
    const/4 p3, 0x0

    :goto_9
    iput-boolean p3, p0, Ln3/m$i;->z:Z

    iget-object p2, p0, Ln3/m$h;->m:Ls1/n1;

    iget-object p2, p2, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {p2}, Ln3/m;->u(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ln3/m$i;->A:I

    invoke-direct {p0, p5, p1}, Ln3/m$i;->p(II)I

    move-result p1

    iput p1, p0, Ln3/m$i;->x:I

    return-void
.end method

.method public static synthetic h(Ln3/m$i;Ln3/m$i;)I
    .locals 0

    invoke-static {p0, p1}, Ln3/m$i;->k(Ln3/m$i;Ln3/m$i;)I

    move-result p0

    return p0
.end method

.method public static synthetic i(Ln3/m$i;Ln3/m$i;)I
    .locals 0

    invoke-static {p0, p1}, Ln3/m$i;->l(Ln3/m$i;Ln3/m$i;)I

    move-result p0

    return p0
.end method

.method private static k(Ln3/m$i;Ln3/m$i;)I
    .locals 4

    invoke-static {}, Lcom/google/common/collect/k;->j()Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->q:Z

    iget-boolean v2, p1, Ln3/m$i;->q:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget v1, p0, Ln3/m$i;->u:I

    iget v2, p1, Ln3/m$i;->u:I

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->v:Z

    iget-boolean v2, p1, Ln3/m$i;->v:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->n:Z

    iget-boolean v2, p1, Ln3/m$i;->n:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->p:Z

    iget-boolean v2, p1, Ln3/m$i;->p:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget v1, p0, Ln3/m$i;->t:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Ln3/m$i;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lcom/google/common/collect/h0;->b()Lcom/google/common/collect/h0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/collect/h0;->d()Lcom/google/common/collect/h0;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->y:Z

    iget-boolean v2, p1, Ln3/m$i;->y:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->z:Z

    iget-boolean v2, p1, Ln3/m$i;->z:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->y:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ln3/m$i;->z:Z

    if-eqz v1, :cond_0

    iget p0, p0, Ln3/m$i;->A:I

    iget p1, p1, Ln3/m$i;->A:I

    invoke-virtual {v0, p0, p1}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/k;->i()I

    move-result p0

    return p0
.end method

.method private static l(Ln3/m$i;Ln3/m$i;)I
    .locals 5

    iget-boolean v0, p0, Ln3/m$i;->n:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ln3/m$i;->q:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ln3/m;->v()Lcom/google/common/collect/h0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ln3/m;->v()Lcom/google/common/collect/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/h0;->d()Lcom/google/common/collect/h0;

    move-result-object v0

    :goto_0
    invoke-static {}, Lcom/google/common/collect/k;->j()Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$i;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$i;->r:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ln3/m$i;->o:Ln3/m$d;

    iget-boolean v4, v4, Ln3/a0;->F:Z

    if-eqz v4, :cond_1

    invoke-static {}, Ln3/m;->v()Lcom/google/common/collect/h0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/collect/h0;->d()Lcom/google/common/collect/h0;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-static {}, Ln3/m;->w()Lcom/google/common/collect/h0;

    move-result-object v4

    :goto_1
    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$i;->s:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$i;->s:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v1

    iget p0, p0, Ln3/m$i;->r:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iget p1, p1, Ln3/m$i;->r:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p0, p1, v0}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/common/collect/k;->i()I

    move-result p0

    return p0
.end method

.method public static n(Ljava/util/List;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln3/m$i;",
            ">;",
            "Ljava/util/List<",
            "Ln3/m$i;",
            ">;)I"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/k;->j()Lcom/google/common/collect/k;

    move-result-object v0

    sget-object v1, Ln3/q;->j:Ln3/q;

    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln3/m$i;

    sget-object v2, Ln3/q;->j:Ln3/q;

    invoke-static {p1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln3/m$i;

    sget-object v3, Ln3/q;->j:Ln3/q;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v0

    sget-object v1, Ln3/r;->j:Ln3/r;

    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln3/m$i;

    sget-object v1, Ln3/r;->j:Ln3/r;

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln3/m$i;

    sget-object v1, Ln3/r;->j:Ln3/r;

    invoke-virtual {v0, p0, p1, v1}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/common/collect/k;->i()I

    move-result p0

    return p0
.end method

.method public static o(ILu2/t0;Ln3/m$d;[II)Lcom/google/common/collect/q;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu2/t0;",
            "Ln3/m$d;",
            "[II)",
            "Lcom/google/common/collect/q<",
            "Ln3/m$i;",
            ">;"
        }
    .end annotation

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    iget v0, v9, Ln3/a0;->r:I

    iget v1, v9, Ln3/a0;->s:I

    iget-boolean v2, v9, Ln3/a0;->t:Z

    invoke-static {v8, v0, v1, v2}, Ln3/m;->s(Lu2/t0;IIZ)I

    move-result v10

    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    iget v0, v8, Lu2/t0;->j:I

    if-ge v13, v0, :cond_2

    invoke-virtual {v8, v13}, Lu2/t0;->b(I)Ls1/n1;

    move-result-object v0

    invoke-virtual {v0}, Ls1/n1;->f()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v10, v1, :cond_1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-gt v0, v10, :cond_0

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v0, 0x1

    const/4 v7, 0x1

    :goto_2
    new-instance v14, Ln3/m$i;

    aget v5, p3, v13

    move-object v0, v14

    move v1, p0

    move-object/from16 v2, p1

    move v3, v13

    move-object/from16 v4, p2

    move/from16 v6, p4

    invoke-direct/range {v0 .. v7}, Ln3/m$i;-><init>(ILu2/t0;ILn3/m$d;IIZ)V

    invoke-virtual {v11, v14}, Lcom/google/common/collect/q$a;->f(Ljava/lang/Object;)Lcom/google/common/collect/q$a;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v11}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object v0

    return-object v0
.end method

.method private p(II)I
    .locals 2

    iget-object v0, p0, Ln3/m$h;->m:Ls1/n1;

    iget v0, v0, Ls1/n1;->n:I

    and-int/lit16 v0, v0, 0x4000

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ln3/m$i;->o:Ln3/m$d;

    iget-boolean v0, v0, Ln3/m$d;->w0:Z

    invoke-static {p1, v0}, Ln3/m;->I(IZ)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Ln3/m$i;->n:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ln3/m$i;->o:Ln3/m$d;

    iget-boolean v0, v0, Ln3/m$d;->m0:Z

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-static {p1, v1}, Ln3/m;->I(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ln3/m$i;->p:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ln3/m$i;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln3/m$h;->m:Ls1/n1;

    iget v0, v0, Ls1/n1;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Ln3/m$i;->o:Ln3/m$d;

    iget-boolean v1, v0, Ln3/a0;->G:Z

    if-nez v1, :cond_3

    iget-boolean v0, v0, Ln3/a0;->F:Z

    if-nez v0, :cond_3

    and-int/2addr p1, p2

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    :goto_0
    return p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ln3/m$i;->x:I

    return v0
.end method

.method public bridge synthetic g(Ln3/m$h;)Z
    .locals 0

    check-cast p1, Ln3/m$i;

    invoke-virtual {p0, p1}, Ln3/m$i;->q(Ln3/m$i;)Z

    move-result p1

    return p1
.end method

.method public q(Ln3/m$i;)Z
    .locals 2

    iget-boolean v0, p0, Ln3/m$i;->w:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ln3/m$h;->m:Ls1/n1;

    iget-object v0, v0, Ls1/n1;->u:Ljava/lang/String;

    iget-object v1, p1, Ln3/m$h;->m:Ls1/n1;

    iget-object v1, v1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0, v1}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ln3/m$i;->o:Ln3/m$d;

    iget-boolean v0, v0, Ln3/m$d;->p0:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ln3/m$i;->y:Z

    iget-boolean v1, p1, Ln3/m$i;->y:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Ln3/m$i;->z:Z

    iget-boolean p1, p1, Ln3/m$i;->z:Z

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
