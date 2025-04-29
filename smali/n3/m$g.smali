.class final Ln3/m$g;
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
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln3/m$h<",
        "Ln3/m$g;",
        ">;",
        "Ljava/lang/Comparable<",
        "Ln3/m$g;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:I

.field private final o:Z

.field private final p:Z

.field private final q:Z

.field private final r:I

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:Z


# direct methods
.method public constructor <init>(ILu2/t0;ILn3/m$d;ILjava/lang/String;)V
    .locals 5

    invoke-direct {p0, p1, p2, p3}, Ln3/m$h;-><init>(ILu2/t0;I)V

    const/4 p1, 0x0

    invoke-static {p5, p1}, Ln3/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ln3/m$g;->o:Z

    iget-object p2, p0, Ln3/m$h;->m:Ls1/n1;

    iget p2, p2, Ls1/n1;->m:I

    iget p3, p4, Ln3/a0;->D:I

    not-int p3, p3

    and-int/2addr p2, p3

    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput-boolean p3, p0, Ln3/m$g;->p:Z

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    iput-boolean p2, p0, Ln3/m$g;->q:Z

    const p2, 0x7fffffff

    iget-object p3, p4, Ln3/a0;->B:Lcom/google/common/collect/q;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_2

    const-string p3, ""

    invoke-static {p3}, Lcom/google/common/collect/q;->A(Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object p3

    goto :goto_2

    :cond_2
    iget-object p3, p4, Ln3/a0;->B:Lcom/google/common/collect/q;

    :goto_2
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Ln3/m$h;->m:Ls1/n1;

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-boolean v4, p4, Ln3/a0;->E:Z

    invoke-static {v2, v3, v4}, Ln3/m;->B(Ls1/n1;Ljava/lang/String;Z)I

    move-result v2

    if-lez v2, :cond_3

    move p2, v1

    goto :goto_4

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_4
    iput p2, p0, Ln3/m$g;->r:I

    iput v2, p0, Ln3/m$g;->s:I

    iget-object p2, p0, Ln3/m$h;->m:Ls1/n1;

    iget p2, p2, Ls1/n1;->n:I

    iget p3, p4, Ln3/a0;->C:I

    invoke-static {p2, p3}, Ln3/m;->t(II)I

    move-result p2

    iput p2, p0, Ln3/m$g;->t:I

    iget-object p3, p0, Ln3/m$h;->m:Ls1/n1;

    iget p3, p3, Ls1/n1;->n:I

    and-int/lit16 p3, p3, 0x440

    if-eqz p3, :cond_5

    const/4 p3, 0x1

    goto :goto_5

    :cond_5
    const/4 p3, 0x0

    :goto_5
    iput-boolean p3, p0, Ln3/m$g;->v:Z

    invoke-static {p6}, Ln3/m;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_6

    const/4 p3, 0x1

    goto :goto_6

    :cond_6
    const/4 p3, 0x0

    :goto_6
    iget-object v1, p0, Ln3/m$h;->m:Ls1/n1;

    invoke-static {v1, p6, p3}, Ln3/m;->B(Ls1/n1;Ljava/lang/String;Z)I

    move-result p3

    iput p3, p0, Ln3/m$g;->u:I

    if-gtz v2, :cond_9

    iget-object p6, p4, Ln3/a0;->B:Lcom/google/common/collect/q;

    invoke-virtual {p6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p6

    if-eqz p6, :cond_7

    if-gtz p2, :cond_9

    :cond_7
    iget-boolean p2, p0, Ln3/m$g;->p:Z

    if-nez p2, :cond_9

    iget-boolean p2, p0, Ln3/m$g;->q:Z

    if-eqz p2, :cond_8

    if-lez p3, :cond_8

    goto :goto_7

    :cond_8
    const/4 p2, 0x0

    goto :goto_8

    :cond_9
    :goto_7
    const/4 p2, 0x1

    :goto_8
    iget-boolean p3, p4, Ln3/m$d;->w0:Z

    invoke-static {p5, p3}, Ln3/m;->I(IZ)Z

    move-result p3

    if-eqz p3, :cond_a

    if-eqz p2, :cond_a

    const/4 p1, 0x1

    :cond_a
    iput p1, p0, Ln3/m$g;->n:I

    return-void
.end method

.method public static h(Ljava/util/List;Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln3/m$g;",
            ">;",
            "Ljava/util/List<",
            "Ln3/m$g;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln3/m$g;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln3/m$g;

    invoke-virtual {p0, p1}, Ln3/m$g;->i(Ln3/m$g;)I

    move-result p0

    return p0
.end method

.method public static k(ILu2/t0;Ln3/m$d;[ILjava/lang/String;)Lcom/google/common/collect/q;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu2/t0;",
            "Ln3/m$d;",
            "[I",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/collect/q<",
            "Ln3/m$g;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p1, Lu2/t0;->j:I

    if-ge v1, v2, :cond_0

    new-instance v9, Ln3/m$g;

    aget v7, p3, v1

    move-object v2, v9

    move v3, p0

    move-object v4, p1

    move v5, v1

    move-object v6, p2

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, Ln3/m$g;-><init>(ILu2/t0;ILn3/m$d;ILjava/lang/String;)V

    invoke-virtual {v0, v9}, Lcom/google/common/collect/q$a;->f(Ljava/lang/Object;)Lcom/google/common/collect/q$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ln3/m$g;->n:I

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ln3/m$g;

    invoke-virtual {p0, p1}, Ln3/m$g;->i(Ln3/m$g;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic g(Ln3/m$h;)Z
    .locals 0

    check-cast p1, Ln3/m$g;

    invoke-virtual {p0, p1}, Ln3/m$g;->l(Ln3/m$g;)Z

    move-result p1

    return p1
.end method

.method public i(Ln3/m$g;)I
    .locals 4

    invoke-static {}, Lcom/google/common/collect/k;->j()Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$g;->o:Z

    iget-boolean v2, p1, Ln3/m$g;->o:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget v1, p0, Ln3/m$g;->r:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Ln3/m$g;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lcom/google/common/collect/h0;->b()Lcom/google/common/collect/h0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/collect/h0;->d()Lcom/google/common/collect/h0;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v0

    iget v1, p0, Ln3/m$g;->s:I

    iget v2, p1, Ln3/m$g;->s:I

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v0

    iget v1, p0, Ln3/m$g;->t:I

    iget v2, p1, Ln3/m$g;->t:I

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$g;->p:Z

    iget-boolean v2, p1, Ln3/m$g;->p:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$g;->q:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p1, Ln3/m$g;->q:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget v3, p0, Ln3/m$g;->s:I

    if-nez v3, :cond_0

    invoke-static {}, Lcom/google/common/collect/h0;->b()Lcom/google/common/collect/h0;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/common/collect/h0;->b()Lcom/google/common/collect/h0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/collect/h0;->d()Lcom/google/common/collect/h0;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/collect/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/k;

    move-result-object v0

    iget v1, p0, Ln3/m$g;->u:I

    iget v2, p1, Ln3/m$g;->u:I

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->d(II)Lcom/google/common/collect/k;

    move-result-object v0

    iget v1, p0, Ln3/m$g;->t:I

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ln3/m$g;->v:Z

    iget-boolean p1, p1, Ln3/m$g;->v:Z

    invoke-virtual {v0, v1, p1}, Lcom/google/common/collect/k;->h(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    :cond_1
    invoke-virtual {v0}, Lcom/google/common/collect/k;->i()I

    move-result p1

    return p1
.end method

.method public l(Ln3/m$g;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
