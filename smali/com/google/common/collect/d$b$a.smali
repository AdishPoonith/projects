.class Lcom/google/common/collect/d$b$a;
.super Lcom/google/common/collect/y$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/y$c<",
        "TK;",
        "Ljava/util/Collection<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic j:Lcom/google/common/collect/d$b;


# direct methods
.method constructor <init>(Lcom/google/common/collect/d$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/collect/d$b$a;->j:Lcom/google/common/collect/d$b;

    invoke-direct {p0}, Lcom/google/common/collect/y$c;-><init>()V

    return-void
.end method


# virtual methods
.method b()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/google/common/collect/d$b$a;->j:Lcom/google/common/collect/d$b;

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/d$b$a;->j:Lcom/google/common/collect/d$b;

    iget-object v0, v0, Lcom/google/common/collect/d$b;->l:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/collect/i;->c(Ljava/util/Collection;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/common/collect/d$b$b;

    iget-object v1, p0, Lcom/google/common/collect/d$b$a;->j:Lcom/google/common/collect/d$b;

    invoke-direct {v0, v1}, Lcom/google/common/collect/d$b$b;-><init>(Lcom/google/common/collect/d$b;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/common/collect/d$b$a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/google/common/collect/d$b$a;->j:Lcom/google/common/collect/d$b;

    iget-object v0, v0, Lcom/google/common/collect/d$b;->m:Lcom/google/common/collect/d;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/common/collect/d;->n(Lcom/google/common/collect/d;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
