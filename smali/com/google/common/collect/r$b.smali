.class Lcom/google/common/collect/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private final j:Ljava/lang/Object;

.field private final k:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/google/common/collect/r;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/collect/r<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/common/collect/r;->g()Lcom/google/common/collect/s;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/common/collect/s;->q()Lcom/google/common/collect/s0;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v0, v2

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/google/common/collect/r$b;->j:Ljava/lang/Object;

    iput-object v1, p0, Lcom/google/common/collect/r$b;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method final a()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/common/collect/r$b;->j:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/common/collect/r$b;->k:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    array-length v2, v0

    invoke-virtual {p0, v2}, Lcom/google/common/collect/r$b;->b(I)Lcom/google/common/collect/r$a;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_0

    aget-object v4, v0, v3

    aget-object v5, v1, v3

    invoke-virtual {v2, v4, v5}, Lcom/google/common/collect/r$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/r$a;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/google/common/collect/r$a;->c()Lcom/google/common/collect/r;

    move-result-object v0

    return-object v0
.end method

.method b(I)Lcom/google/common/collect/r$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/collect/r$a<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/common/collect/r$a;

    invoke-direct {v0, p1}, Lcom/google/common/collect/r$a;-><init>(I)V

    return-object v0
.end method

.method final readResolve()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/common/collect/r$b;->j:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/common/collect/s;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/common/collect/r$b;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Lcom/google/common/collect/s;

    iget-object v1, p0, Lcom/google/common/collect/r$b;->k:Ljava/lang/Object;

    check-cast v1, Lcom/google/common/collect/o;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/google/common/collect/r$b;->b(I)Lcom/google/common/collect/r$a;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/common/collect/s;->q()Lcom/google/common/collect/s0;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/common/collect/o;->q()Lcom/google/common/collect/s0;

    move-result-object v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/common/collect/r$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/r$a;

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/google/common/collect/r$a;->c()Lcom/google/common/collect/r;

    move-result-object v0

    return-object v0
.end method
