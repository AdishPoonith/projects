.class abstract Lcom/google/common/collect/o$a;
.super Lcom/google/common/collect/o$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/o$b<",
        "TE;>;"
    }
.end annotation


# instance fields
.field a:[Ljava/lang/Object;

.field b:I

.field c:Z


# direct methods
.method constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Lcom/google/common/collect/o$b;-><init>()V

    const-string v0, "initialCapacity"

    invoke-static {p1, v0}, Lcom/google/common/collect/h;->b(ILjava/lang/String;)I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/common/collect/o$a;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/common/collect/o$a;->b:I

    return-void
.end method

.method private e(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/common/collect/o$a;->a:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    invoke-static {v1, p1}, Lcom/google/common/collect/o$b;->c(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/google/common/collect/o$a;->a:[Ljava/lang/Object;

    :goto_0
    iput-boolean v2, p0, Lcom/google/common/collect/o$a;->c:Z

    goto :goto_1

    :cond_0
    iget-boolean p1, p0, Lcom/google/common/collect/o$a;->c:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/common/collect/o$a;->a:[Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)Lcom/google/common/collect/o$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lcom/google/common/collect/o$b<",
            "TE;>;"
        }
    .end annotation

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    iget v1, p0, Lcom/google/common/collect/o$a;->b:I

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {p0, v1}, Lcom/google/common/collect/o$a;->e(I)V

    instance-of v1, v0, Lcom/google/common/collect/o;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/common/collect/o;

    iget-object p1, p0, Lcom/google/common/collect/o$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/common/collect/o$a;->b:I

    invoke-virtual {v0, p1, v1}, Lcom/google/common/collect/o;->e([Ljava/lang/Object;I)I

    move-result p1

    iput p1, p0, Lcom/google/common/collect/o$a;->b:I

    return-object p0

    :cond_0
    invoke-super {p0, p1}, Lcom/google/common/collect/o$b;->b(Ljava/lang/Iterable;)Lcom/google/common/collect/o$b;

    return-object p0
.end method

.method public d(Ljava/lang/Object;)Lcom/google/common/collect/o$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/common/collect/o$a<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lb5/n;->n(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lcom/google/common/collect/o$a;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/common/collect/o$a;->e(I)V

    iget-object v0, p0, Lcom/google/common/collect/o$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/common/collect/o$a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/common/collect/o$a;->b:I

    aput-object p1, v0, v1

    return-object p0
.end method
