.class Lcom/google/common/collect/q$d;
.super Lcom/google/common/collect/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/q<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final transient l:I

.field final transient m:I

.field final synthetic n:Lcom/google/common/collect/q;


# direct methods
.method constructor <init>(Lcom/google/common/collect/q;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/collect/q$d;->n:Lcom/google/common/collect/q;

    invoke-direct {p0}, Lcom/google/common/collect/q;-><init>()V

    iput p2, p0, Lcom/google/common/collect/q$d;->l:I

    iput p3, p0, Lcom/google/common/collect/q$d;->m:I

    return-void
.end method


# virtual methods
.method public D(II)Lcom/google/common/collect/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/collect/q<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Lcom/google/common/collect/q$d;->m:I

    invoke-static {p1, p2, v0}, Lb5/n;->s(III)V

    iget-object v0, p0, Lcom/google/common/collect/q$d;->n:Lcom/google/common/collect/q;

    iget v1, p0, Lcom/google/common/collect/q$d;->l:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/common/collect/q;->D(II)Lcom/google/common/collect/q;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lcom/google/common/collect/q$d;->m:I

    invoke-static {p1, v0}, Lb5/n;->l(II)I

    iget-object v0, p0, Lcom/google/common/collect/q$d;->n:Lcom/google/common/collect/q;

    iget v1, p0, Lcom/google/common/collect/q$d;->l:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lcom/google/common/collect/q;->q()Lcom/google/common/collect/s0;

    move-result-object v0

    return-object v0
.end method

.method k()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/q$d;->n:Lcom/google/common/collect/q;

    invoke-virtual {v0}, Lcom/google/common/collect/o;->k()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method l()I
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/q$d;->n:Lcom/google/common/collect/q;

    invoke-virtual {v0}, Lcom/google/common/collect/o;->m()I

    move-result v0

    iget v1, p0, Lcom/google/common/collect/q$d;->l:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/common/collect/q$d;->m:I

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, Lcom/google/common/collect/q;->x()Lcom/google/common/collect/t0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/common/collect/q;->y(I)Lcom/google/common/collect/t0;

    move-result-object p1

    return-object p1
.end method

.method m()I
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/q$d;->n:Lcom/google/common/collect/q;

    invoke-virtual {v0}, Lcom/google/common/collect/o;->m()I

    move-result v0

    iget v1, p0, Lcom/google/common/collect/q$d;->l:I

    add-int/2addr v0, v1

    return v0
.end method

.method p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/q$d;->m:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/q$d;->D(II)Lcom/google/common/collect/q;

    move-result-object p1

    return-object p1
.end method
