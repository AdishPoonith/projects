.class Lcom/google/common/collect/d$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/d$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final j:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation
.end field

.field final k:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end field

.field final synthetic l:Lcom/google/common/collect/d$j;


# direct methods
.method constructor <init>(Lcom/google/common/collect/d$j;)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/collect/d$j$a;->l:Lcom/google/common/collect/d$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lcom/google/common/collect/d$j;->k:Ljava/util/Collection;

    iput-object p1, p0, Lcom/google/common/collect/d$j$a;->k:Ljava/util/Collection;

    invoke-static {p1}, Lcom/google/common/collect/d;->i(Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lcom/google/common/collect/d$j$a;->j:Ljava/util/Iterator;

    return-void
.end method

.method constructor <init>(Lcom/google/common/collect/d$j;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/common/collect/d$j$a;->l:Lcom/google/common/collect/d$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lcom/google/common/collect/d$j;->k:Ljava/util/Collection;

    iput-object p1, p0, Lcom/google/common/collect/d$j$a;->k:Ljava/util/Collection;

    iput-object p2, p0, Lcom/google/common/collect/d$j$a;->j:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method a()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j$a;->c()V

    iget-object v0, p0, Lcom/google/common/collect/d$j$a;->j:Ljava/util/Iterator;

    return-object v0
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Lcom/google/common/collect/d$j$a;->l:Lcom/google/common/collect/d$j;

    invoke-virtual {v0}, Lcom/google/common/collect/d$j;->m()V

    iget-object v0, p0, Lcom/google/common/collect/d$j$a;->l:Lcom/google/common/collect/d$j;

    iget-object v0, v0, Lcom/google/common/collect/d$j;->k:Ljava/util/Collection;

    iget-object v1, p0, Lcom/google/common/collect/d$j$a;->k:Ljava/util/Collection;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/d$j$a;->c()V

    iget-object v0, p0, Lcom/google/common/collect/d$j$a;->j:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/d$j$a;->c()V

    iget-object v0, p0, Lcom/google/common/collect/d$j$a;->j:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/d$j$a;->j:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    iget-object v0, p0, Lcom/google/common/collect/d$j$a;->l:Lcom/google/common/collect/d$j;

    iget-object v0, v0, Lcom/google/common/collect/d$j;->n:Lcom/google/common/collect/d;

    invoke-static {v0}, Lcom/google/common/collect/d;->k(Lcom/google/common/collect/d;)I

    iget-object v0, p0, Lcom/google/common/collect/d$j$a;->l:Lcom/google/common/collect/d$j;

    invoke-virtual {v0}, Lcom/google/common/collect/d$j;->p()V

    return-void
.end method
