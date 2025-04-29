.class final Lq4/p0;
.super Lq4/q0;
.source "SourceFile"


# instance fields
.field final transient l:I

.field final transient m:I

.field final synthetic n:Lq4/q0;


# direct methods
.method constructor <init>(Lq4/q0;II)V
    .locals 0

    iput-object p1, p0, Lq4/p0;->n:Lq4/q0;

    invoke-direct {p0}, Lq4/q0;-><init>()V

    iput p2, p0, Lq4/p0;->l:I

    iput p3, p0, Lq4/p0;->m:I

    return-void
.end method


# virtual methods
.method final e()I
    .locals 2

    iget-object v0, p0, Lq4/p0;->n:Lq4/q0;

    invoke-virtual {v0}, Lq4/n0;->k()I

    move-result v0

    iget v1, p0, Lq4/p0;->l:I

    add-int/2addr v0, v1

    iget v1, p0, Lq4/p0;->m:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lq4/p0;->m:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lq4/k0;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lq4/p0;->n:Lq4/q0;

    iget v1, p0, Lq4/p0;->l:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final k()I
    .locals 2

    iget-object v0, p0, Lq4/p0;->n:Lq4/q0;

    invoke-virtual {v0}, Lq4/n0;->k()I

    move-result v0

    iget v1, p0, Lq4/p0;->l:I

    add-int/2addr v0, v1

    return v0
.end method

.method final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final q()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq4/p0;->n:Lq4/q0;

    invoke-virtual {v0}, Lq4/n0;->q()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final r(II)Lq4/q0;
    .locals 2

    iget v0, p0, Lq4/p0;->m:I

    invoke-static {p1, p2, v0}, Lq4/k0;->c(III)V

    iget-object v0, p0, Lq4/p0;->n:Lq4/q0;

    iget v1, p0, Lq4/p0;->l:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lq4/q0;->r(II)Lq4/q0;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lq4/p0;->m:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lq4/q0;->r(II)Lq4/q0;

    move-result-object p1

    return-object p1
.end method
