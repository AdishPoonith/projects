.class Lcom/google/common/collect/d$k;
.super Lcom/google/common/collect/d$j;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/collect/d$k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/d<",
        "TK;TV;>.j;",
        "Ljava/util/List<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final synthetic o:Lcom/google/common/collect/d;


# direct methods
.method constructor <init>(Lcom/google/common/collect/d;Ljava/lang/Object;Ljava/util/List;Lcom/google/common/collect/d$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/List<",
            "TV;>;",
            "Lcom/google/common/collect/d<",
            "TK;TV;>.j;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/common/collect/d$k;->o:Lcom/google/common/collect/d;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/common/collect/d$j;-><init>(Lcom/google/common/collect/d;Ljava/lang/Object;Ljava/util/Collection;Lcom/google/common/collect/d$j;)V

    return-void
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->k()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/common/collect/d$k;->q()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/google/common/collect/d$k;->o:Lcom/google/common/collect/d;

    invoke-static {p1}, Lcom/google/common/collect/d;->j(Lcom/google/common/collect/d;)I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->b()V

    :cond_0
    return-void
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TV;>;)Z"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/common/collect/d$k;->q()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->k()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    iget-object v1, p0, Lcom/google/common/collect/d$k;->o:Lcom/google/common/collect/d;

    sub-int/2addr p2, v0

    invoke-static {v1, p2}, Lcom/google/common/collect/d;->l(Lcom/google/common/collect/d;I)I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->b()V

    :cond_1
    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    invoke-virtual {p0}, Lcom/google/common/collect/d$k;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    invoke-virtual {p0}, Lcom/google/common/collect/d$k;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    invoke-virtual {p0}, Lcom/google/common/collect/d$k;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    new-instance v0, Lcom/google/common/collect/d$k$a;

    invoke-direct {v0, p0}, Lcom/google/common/collect/d$k$a;-><init>(Lcom/google/common/collect/d$k;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    new-instance v0, Lcom/google/common/collect/d$k$a;

    invoke-direct {v0, p0, p1}, Lcom/google/common/collect/d$k$a;-><init>(Lcom/google/common/collect/d$k;I)V

    return-object v0
.end method

.method q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->k()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    invoke-virtual {p0}, Lcom/google/common/collect/d$k;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/google/common/collect/d$k;->o:Lcom/google/common/collect/d;

    invoke-static {v0}, Lcom/google/common/collect/d;->k(Lcom/google/common/collect/d;)I

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->p()V

    return-object p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    invoke-virtual {p0}, Lcom/google/common/collect/d$k;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public subList(II)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->m()V

    iget-object v0, p0, Lcom/google/common/collect/d$k;->o:Lcom/google/common/collect/d;

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->l()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/common/collect/d$k;->q()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->e()Lcom/google/common/collect/d$j;

    move-result-object p2

    if-nez p2, :cond_0

    move-object p2, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/common/collect/d$j;->e()Lcom/google/common/collect/d$j;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, v1, p1, p2}, Lcom/google/common/collect/d;->y(Ljava/lang/Object;Ljava/util/List;Lcom/google/common/collect/d$j;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
