.class final Ln3/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ln3/m$c;",
        ">;"
    }
.end annotation


# instance fields
.field private final j:Z

.field private final k:Z


# direct methods
.method public constructor <init>(Ls1/n1;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p1, p1, Ls1/n1;->m:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ln3/m$c;->j:Z

    invoke-static {p2, v1}, Ln3/m;->I(IZ)Z

    move-result p1

    iput-boolean p1, p0, Ln3/m$c;->k:Z

    return-void
.end method


# virtual methods
.method public b(Ln3/m$c;)I
    .locals 3

    invoke-static {}, Lcom/google/common/collect/k;->j()Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$c;->k:Z

    iget-boolean v2, p1, Ln3/m$c;->k:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$c;->j:Z

    iget-boolean p1, p1, Ln3/m$c;->j:Z

    invoke-virtual {v0, v1, p1}, Lcom/google/common/collect/k;->g(ZZ)Lcom/google/common/collect/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/common/collect/k;->i()I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ln3/m$c;

    invoke-virtual {p0, p1}, Ln3/m$c;->b(Ln3/m$c;)I

    move-result p1

    return p1
.end method
