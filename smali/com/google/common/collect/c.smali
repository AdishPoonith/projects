.class abstract Lcom/google/common/collect/c;
.super Lcom/google/common/collect/d;
.source "SourceFile"

# interfaces
.implements Lcom/google/common/collect/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/d<",
        "TK;TV;>;",
        "Lcom/google/common/collect/v<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/common/collect/d;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    invoke-super {p0}, Lcom/google/common/collect/f;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/google/common/collect/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lcom/google/common/collect/d;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method w(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TE;>;)",
            "Ljava/util/Collection<",
            "TE;>;"
        }
    .end annotation

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method x(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Collection<",
            "TV;>;)",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/common/collect/d;->y(Ljava/lang/Object;Ljava/util/List;Lcom/google/common/collect/d$j;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
