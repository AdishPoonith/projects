.class final Ln3/m$b;
.super Ln3/m$h;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln3/m$h<",
        "Ln3/m$b;",
        ">;",
        "Ljava/lang/Comparable<",
        "Ln3/m$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:I

.field private final B:I

.field private final C:I

.field private final D:Z

.field private final E:Z

.field private final n:I

.field private final o:Z

.field private final p:Ljava/lang/String;

.field private final q:Ln3/m$d;

.field private final r:Z

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:Z

.field private final w:I

.field private final x:I

.field private final y:Z

.field private final z:I


# direct methods
.method public constructor <init>(ILu2/t0;ILn3/m$d;IZLb5/o;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu2/t0;",
            "I",
            "Ln3/m$d;",
            "IZ",
            "Lb5/o<",
            "Ls1/n1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Ln3/m$h;-><init>(ILu2/t0;I)V

    iput-object p4, p0, Ln3/m$b;->q:Ln3/m$d;

    iget-object p1, p0, Ln3/m$h;->m:Ls1/n1;

    iget-object p1, p1, Ls1/n1;->l:Ljava/lang/String;

    invoke-static {p1}, Ln3/m;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ln3/m$b;->p:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p5, p1}, Ln3/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ln3/m$b;->r:Z

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p4, Ln3/a0;->w:Lcom/google/common/collect/q;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    const v0, 0x7fffffff

    if-ge p2, p3, :cond_1

    iget-object p3, p0, Ln3/m$h;->m:Ls1/n1;

    iget-object v1, p4, Ln3/a0;->w:Lcom/google/common/collect/q;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p3, v1, p1}, Ln3/m;->B(Ls1/n1;Ljava/lang/String;Z)I

    move-result p3

    if-lez p3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const p2, 0x7fffffff

    const/4 p3, 0x0

    :goto_1
    iput p2, p0, Ln3/m$b;->t:I

    iput p3, p0, Ln3/m$b;->s:I

    iget-object p2, p0, Ln3/m$h;->m:Ls1/n1;

    iget p2, p2, Ls1/n1;->n:I

    iget p3, p4, Ln3/a0;->x:I

    invoke-static {p2, p3}, Ln3/m;->t(II)I

    move-result p2

    iput p2, p0, Ln3/m$b;->u:I

    iget-object p2, p0, Ln3/m$h;->m:Ls1/n1;

    iget p3, p2, Ls1/n1;->n:I

    const/4 v1, 0x1

    if-eqz p3, :cond_3

    and-int/2addr p3, v1

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    const/4 p3, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 p3, 0x1

    :goto_3
    iput-boolean p3, p0, Ln3/m$b;->v:Z

    iget p3, p2, Ls1/n1;->m:I

    and-int/2addr p3, v1

    if-eqz p3, :cond_4

    const/4 p3, 0x1

    goto :goto_4

    :cond_4
    const/4 p3, 0x0

    :goto_4
    iput-boolean p3, p0, Ln3/m$b;->y:Z

    iget p3, p2, Ls1/n1;->H:I

    iput p3, p0, Ln3/m$b;->z:I

    iget v2, p2, Ls1/n1;->I:I

    iput v2, p0, Ln3/m$b;->A:I

    iget v2, p2, Ls1/n1;->q:I

    iput v2, p0, Ln3/m$b;->B:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    iget v4, p4, Ln3/a0;->z:I

    if-gt v2, v4, :cond_7

    :cond_5
    if-eq p3, v3, :cond_6

    iget v2, p4, Ln3/a0;->y:I

    if-gt p3, v2, :cond_7

    :cond_6
    invoke-interface {p7, p2}, Lb5/o;->apply(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    const/4 p2, 0x1

    goto :goto_5

    :cond_7
    const/4 p2, 0x0

    :goto_5
    iput-boolean p2, p0, Ln3/m$b;->o:Z

    invoke-static {}, Lp3/n0;->g0()[Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    :goto_6
    array-length p7, p2

    if-ge p3, p7, :cond_9

    iget-object p7, p0, Ln3/m$h;->m:Ls1/n1;

    aget-object v2, p2, p3

    invoke-static {p7, v2, p1}, Ln3/m;->B(Ls1/n1;Ljava/lang/String;Z)I

    move-result p7

    if-lez p7, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    :cond_9
    const p3, 0x7fffffff

    const/4 p7, 0x0

    :goto_7
    iput p3, p0, Ln3/m$b;->w:I

    iput p7, p0, Ln3/m$b;->x:I

    const/4 p2, 0x0

    :goto_8
    iget-object p3, p4, Ln3/a0;->A:Lcom/google/common/collect/q;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_b

    iget-object p3, p0, Ln3/m$h;->m:Ls1/n1;

    iget-object p3, p3, Ls1/n1;->u:Ljava/lang/String;

    if-eqz p3, :cond_a

    iget-object p7, p4, Ln3/a0;->A:Lcom/google/common/collect/q;

    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    invoke-virtual {p3, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    move v0, p2

    goto :goto_9

    :cond_a
    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    iput v0, p0, Ln3/m$b;->C:I

    invoke-static {p5}, Ls1/m3;->e(I)I

    move-result p2

    const/16 p3, 0x80

    if-ne p2, p3, :cond_c

    const/4 p2, 0x1

    goto :goto_a

    :cond_c
    const/4 p2, 0x0

    :goto_a
    iput-boolean p2, p0, Ln3/m$b;->D:Z

    invoke-static {p5}, Ls1/m3;->g(I)I

    move-result p2

    const/16 p3, 0x40

    if-ne p2, p3, :cond_d

    const/4 p1, 0x1

    :cond_d
    iput-boolean p1, p0, Ln3/m$b;->E:Z

    invoke-direct {p0, p5, p6}, Ln3/m$b;->l(IZ)I

    move-result p1

    iput p1, p0, Ln3/m$b;->n:I

    return-void
.end method

.method public static h(Ljava/util/List;Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln3/m$b;",
            ">;",
            "Ljava/util/List<",
            "Ln3/m$b;",
            ">;)I"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln3/m$b;

    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln3/m$b;

    invoke-virtual {p0, p1}, Ln3/m$b;->i(Ln3/m$b;)I

    move-result p0

    return p0
.end method

.method public static k(ILu2/t0;Ln3/m$d;[IZLb5/o;)Lcom/google/common/collect/q;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu2/t0;",
            "Ln3/m$d;",
            "[IZ",
            "Lb5/o<",
            "Ls1/n1;",
            ">;)",
            "Lcom/google/common/collect/q<",
            "Ln3/m$b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object v0

    const/4 v1, 0x0

    move-object v10, p1

    :goto_0
    iget v2, v10, Lu2/t0;->j:I

    if-ge v1, v2, :cond_0

    new-instance v11, Ln3/m$b;

    aget v7, p3, v1

    move-object v2, v11

    move v3, p0

    move-object v4, p1

    move v5, v1

    move-object v6, p2

    move/from16 v8, p4

    move-object/from16 v9, p5

    invoke-direct/range {v2 .. v9}, Ln3/m$b;-><init>(ILu2/t0;ILn3/m$d;IZLb5/o;)V

    invoke-virtual {v0, v11}, Lcom/google/common/collect/q$a;->f(Ljava/lang/Object;)Lcom/google/common/collect/q$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object v0

    return-object v0
.end method

.method private l(IZ)I
    .locals 2

    iget-object v0, p0, Ln3/m$b;->q:Ln3/m$d;

    iget-boolean v0, v0, Ln3/m$d;->w0:Z

    invoke-static {p1, v0}, Ln3/m;->I(IZ)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Ln3/m$b;->o:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ln3/m$b;->q:Ln3/m$d;

    iget-boolean v0, v0, Ln3/m$d;->q0:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {p1, v1}, Ln3/m;->I(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Ln3/m$b;->o:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ln3/m$h;->m:Ls1/n1;

    iget p1, p1, Ls1/n1;->q:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Ln3/m$b;->q:Ln3/m$d;

    iget-boolean v0, p1, Ln3/a0;->G:Z

    if-nez v0, :cond_3

    iget-boolean v0, p1, Ln3/a0;->F:Z

    if-nez v0, :cond_3

    iget-boolean p1, p1, Ln3/m$d;->y0:Z

    if-nez p1, :cond_2

    if-nez p2, :cond_3

    :cond_2
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

    iget v0, p0, Ln3/m$b;->n:I

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ln3/m$b;

    invoke-virtual {p0, p1}, Ln3/m$b;->i(Ln3/m$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic g(Ln3/m$h;)Z
    .locals 0

    check-cast p1, Ln3/m$b;

    invoke-virtual {p0, p1}, Ln3/m$b;->n(Ln3/m$b;)Z

    move-result p1

    return p1
.end method

.method public i(Ln3/m$b;)I
    .locals 5

    iget-boolean v0, p0, Ln3/m$b;->o:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ln3/m$b;->r:Z

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

    iget-boolean v2, p0, Ln3/m$b;->r:Z

    iget-boolean v3, p1, Ln3/m$b;->r:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$b;->t:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/common/collect/h0;->b()Lcom/google/common/collect/h0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/collect/h0;->d()Lcom/google/common/collect/h0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->s:I

    iget v3, p1, Ln3/m$b;->s:I

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->u:I

    iget v3, p1, Ln3/m$b;->u:I

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v1

    iget-boolean v2, p0, Ln3/m$b;->y:Z

    iget-boolean v3, p1, Ln3/m$b;->y:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v1

    iget-boolean v2, p0, Ln3/m$b;->v:Z

    iget-boolean v3, p1, Ln3/m$b;->v:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$b;->w:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/common/collect/h0;->b()Lcom/google/common/collect/h0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/collect/h0;->d()Lcom/google/common/collect/h0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->x:I

    iget v3, p1, Ln3/m$b;->x:I

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v1

    iget-boolean v2, p0, Ln3/m$b;->o:Z

    iget-boolean v3, p1, Ln3/m$b;->o:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->C:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$b;->C:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/common/collect/h0;->b()Lcom/google/common/collect/h0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/collect/h0;->d()Lcom/google/common/collect/h0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->B:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$b;->B:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ln3/m$b;->q:Ln3/m$d;

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

    iget-boolean v2, p0, Ln3/m$b;->D:Z

    iget-boolean v3, p1, Ln3/m$b;->D:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v1

    iget-boolean v2, p0, Ln3/m$b;->E:Z

    iget-boolean v3, p1, Ln3/m$b;->E:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$b;->z:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->A:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$b;->A:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v1

    iget v2, p0, Ln3/m$b;->B:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$b;->B:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ln3/m$b;->p:Ljava/lang/String;

    iget-object p1, p1, Ln3/m$b;->p:Ljava/lang/String;

    invoke-static {v4, p1}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {}, Ln3/m;->w()Lcom/google/common/collect/h0;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/common/collect/k;->i()I

    move-result p1

    return p1
.end method

.method public n(Ln3/m$b;)Z
    .locals 4

    iget-object v0, p0, Ln3/m$b;->q:Ln3/m$d;

    iget-boolean v1, v0, Ln3/m$d;->t0:Z

    const/4 v2, -0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Ln3/m$h;->m:Ls1/n1;

    iget v1, v1, Ls1/n1;->H:I

    if-eq v1, v2, :cond_3

    iget-object v3, p1, Ln3/m$h;->m:Ls1/n1;

    iget v3, v3, Ls1/n1;->H:I

    if-ne v1, v3, :cond_3

    :cond_0
    iget-boolean v0, v0, Ln3/m$d;->r0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ln3/m$h;->m:Ls1/n1;

    iget-object v0, v0, Ls1/n1;->u:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v1, p1, Ln3/m$h;->m:Ls1/n1;

    iget-object v1, v1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Ln3/m$b;->q:Ln3/m$d;

    iget-boolean v1, v0, Ln3/m$d;->s0:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Ln3/m$h;->m:Ls1/n1;

    iget v1, v1, Ls1/n1;->I:I

    if-eq v1, v2, :cond_3

    iget-object v2, p1, Ln3/m$h;->m:Ls1/n1;

    iget v2, v2, Ls1/n1;->I:I

    if-ne v1, v2, :cond_3

    :cond_2
    iget-boolean v0, v0, Ln3/m$d;->u0:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ln3/m$b;->D:Z

    iget-boolean v1, p1, Ln3/m$b;->D:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Ln3/m$b;->E:Z

    iget-boolean p1, p1, Ln3/m$b;->E:Z

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
