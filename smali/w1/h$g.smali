.class Lw1/h$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw1/g;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lw1/g;


# direct methods
.method public constructor <init>(Lw1/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lw1/h$g;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a(Lw1/g;)V
    .locals 1

    iget-object v0, p0, Lw1/h$g;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lw1/h$g;->b:Lw1/g;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lw1/h$g;->b:Lw1/g;

    invoke-virtual {p1}, Lw1/g;->H()V

    return-void
.end method

.method public b()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lw1/h$g;->b:Lw1/g;

    iget-object v0, p0, Lw1/h$g;->a:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object v0

    iget-object v1, p0, Lw1/h$g;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    invoke-virtual {v0}, Lcom/google/common/collect/q;->q()Lcom/google/common/collect/s0;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/g;

    invoke-virtual {v1}, Lw1/g;->C()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Exception;Z)V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lw1/h$g;->b:Lw1/g;

    iget-object v0, p0, Lw1/h$g;->a:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object v0

    iget-object v1, p0, Lw1/h$g;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    invoke-virtual {v0}, Lcom/google/common/collect/q;->q()Lcom/google/common/collect/s0;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/g;

    invoke-virtual {v1, p1, p2}, Lw1/g;->D(Ljava/lang/Exception;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Lw1/g;)V
    .locals 1

    iget-object v0, p0, Lw1/h$g;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lw1/h$g;->b:Lw1/g;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lw1/h$g;->b:Lw1/g;

    iget-object p1, p0, Lw1/h$g;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lw1/h$g;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw1/g;

    iput-object p1, p0, Lw1/h$g;->b:Lw1/g;

    invoke-virtual {p1}, Lw1/g;->H()V

    :cond_0
    return-void
.end method
