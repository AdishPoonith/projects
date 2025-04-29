.class public final Lj6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/f1$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj6/p$a;,
        Lj6/p$b;
    }
.end annotation


# instance fields
.field private final a:Lj6/f1;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj6/b1;",
            "Lj6/p$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/firebase/firestore/o<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:Lj6/z0;


# direct methods
.method public constructor <init>(Lj6/f1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lj6/p;->c:Ljava/util/Set;

    sget-object v0, Lj6/z0;->j:Lj6/z0;

    iput-object v0, p0, Lj6/p;->d:Lj6/z0;

    iput-object p1, p0, Lj6/p;->a:Lj6/f1;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-virtual {p1, p0}, Lj6/f1;->x(Lj6/f1$c;)V

    return-void
.end method

.method private f()V
    .locals 3

    iget-object v0, p0, Lj6/p;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/firestore/o;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v2}, Lcom/google/firebase/firestore/o;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/z;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lj6/z0;)V
    .locals 4

    iput-object p1, p0, Lj6/p;->d:Lj6/z0;

    iget-object v0, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj6/p$b;

    invoke-static {v2}, Lj6/p$b;->a(Lj6/p$b;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj6/c1;

    invoke-virtual {v3, p1}, Lj6/c1;->c(Lj6/z0;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-direct {p0}, Lj6/p;->f()V

    :cond_3
    return-void
.end method

.method public b(Lj6/b1;Li9/j1;)V
    .locals 3

    iget-object v0, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj6/p$b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lj6/p$b;->a(Lj6/p$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/c1;

    invoke-static {p2}, Lq6/g0;->t(Li9/j1;)Lcom/google/firebase/firestore/z;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj6/c1;->b(Lcom/google/firebase/firestore/z;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj6/y1;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/y1;

    invoke-virtual {v1}, Lj6/y1;->h()Lj6/b1;

    move-result-object v2

    iget-object v3, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj6/p$b;

    if-eqz v2, :cond_0

    invoke-static {v2}, Lj6/p$b;->a(Lj6/p$b;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj6/c1;

    invoke-virtual {v4, v1}, Lj6/c1;->d(Lj6/y1;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v2, v1}, Lj6/p$b;->c(Lj6/p$b;Lj6/y1;)Lj6/y1;

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_4

    invoke-direct {p0}, Lj6/p;->f()V

    :cond_4
    return-void
.end method

.method public d(Lj6/c1;)I
    .locals 6

    invoke-virtual {p1}, Lj6/c1;->a()Lj6/b1;

    move-result-object v0

    iget-object v1, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/p$b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    new-instance v1, Lj6/p$b;

    invoke-direct {v1}, Lj6/p$b;-><init>()V

    iget-object v5, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {v1}, Lj6/p$b;->a(Lj6/p$b;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Lj6/p;->d:Lj6/z0;

    invoke-virtual {p1, v5}, Lj6/c1;->c(Lj6/z0;)Z

    move-result v5

    xor-int/2addr v2, v5

    new-array v3, v3, [Ljava/lang/Object;

    const-string v5, "onOnlineStateChanged() shouldn\'t raise an event for brand-new listeners."

    invoke-static {v2, v5, v3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v1}, Lj6/p$b;->b(Lj6/p$b;)Lj6/y1;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Lj6/p$b;->b(Lj6/p$b;)Lj6/y1;

    move-result-object v2

    invoke-virtual {p1, v2}, Lj6/c1;->d(Lj6/y1;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lj6/p;->f()V

    :cond_2
    if-eqz v4, :cond_3

    iget-object p1, p0, Lj6/p;->a:Lj6/f1;

    invoke-virtual {p1, v0}, Lj6/f1;->n(Lj6/b1;)I

    move-result p1

    invoke-static {v1, p1}, Lj6/p$b;->e(Lj6/p$b;I)I

    :cond_3
    invoke-static {v1}, Lj6/p$b;->d(Lj6/p$b;)I

    move-result p1

    return p1
.end method

.method public e(Lcom/google/firebase/firestore/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/o<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lj6/p;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0}, Lcom/google/firebase/firestore/o;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/z;)V

    return-void
.end method

.method public g(Lj6/c1;)V
    .locals 3

    invoke-virtual {p1}, Lj6/c1;->a()Lj6/b1;

    move-result-object v0

    iget-object v1, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/p$b;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lj6/p$b;->a(Lj6/p$b;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-static {v1}, Lj6/p$b;->a(Lj6/p$b;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lj6/p;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lj6/p;->a:Lj6/f1;

    invoke-virtual {p1, v0}, Lj6/f1;->y(Lj6/b1;)V

    :cond_1
    return-void
.end method

.method public h(Lcom/google/firebase/firestore/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/o<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lj6/p;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
