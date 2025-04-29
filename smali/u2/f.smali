.class public abstract Lu2/f;
.super Lu2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/f$a;,
        Lu2/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lu2/a;"
    }
.end annotation


# instance fields
.field private final q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TT;",
            "Lu2/f$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private r:Landroid/os/Handler;

.field private s:Lo3/p0;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lu2/a;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu2/f;->q:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic F(Lu2/f;Ljava/lang/Object;Lu2/u;Ls1/y3;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu2/f;->J(Ljava/lang/Object;Lu2/u;Ls1/y3;)V

    return-void
.end method

.method private synthetic J(Ljava/lang/Object;Lu2/u;Ls1/y3;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lu2/f;->K(Ljava/lang/Object;Lu2/u;Ls1/y3;)V

    return-void
.end method


# virtual methods
.method protected C(Lo3/p0;)V
    .locals 0

    iput-object p1, p0, Lu2/f;->s:Lo3/p0;

    invoke-static {}, Lp3/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lu2/f;->r:Landroid/os/Handler;

    return-void
.end method

.method protected E()V
    .locals 4

    iget-object v0, p0, Lu2/f;->q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/f$b;

    iget-object v2, v1, Lu2/f$b;->a:Lu2/u;

    iget-object v3, v1, Lu2/f$b;->b:Lu2/u$c;

    invoke-interface {v2, v3}, Lu2/u;->c(Lu2/u$c;)V

    iget-object v2, v1, Lu2/f$b;->a:Lu2/u;

    iget-object v3, v1, Lu2/f$b;->c:Lu2/f$a;

    invoke-interface {v2, v3}, Lu2/u;->e(Lu2/b0;)V

    iget-object v2, v1, Lu2/f$b;->a:Lu2/u;

    iget-object v1, v1, Lu2/f$b;->c:Lu2/f$a;

    invoke-interface {v2, v1}, Lu2/u;->q(Lw1/w;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu2/f;->q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method protected abstract G(Ljava/lang/Object;Lu2/u$b;)Lu2/u$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lu2/u$b;",
            ")",
            "Lu2/u$b;"
        }
    .end annotation
.end method

.method protected abstract H(Ljava/lang/Object;J)J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)J"
        }
    .end annotation
.end method

.method protected abstract I(Ljava/lang/Object;I)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)I"
        }
    .end annotation
.end method

.method protected abstract K(Ljava/lang/Object;Lu2/u;Ls1/y3;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lu2/u;",
            "Ls1/y3;",
            ")V"
        }
    .end annotation
.end method

.method protected final L(Ljava/lang/Object;Lu2/u;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lu2/u;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lu2/f;->q:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp3/a;->a(Z)V

    new-instance v0, Lu2/e;

    invoke-direct {v0, p0, p1}, Lu2/e;-><init>(Lu2/f;Ljava/lang/Object;)V

    new-instance v1, Lu2/f$a;

    invoke-direct {v1, p0, p1}, Lu2/f$a;-><init>(Lu2/f;Ljava/lang/Object;)V

    iget-object v2, p0, Lu2/f;->q:Ljava/util/HashMap;

    new-instance v3, Lu2/f$b;

    invoke-direct {v3, p2, v0, v1}, Lu2/f$b;-><init>(Lu2/u;Lu2/u$c;Lu2/f$a;)V

    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu2/f;->r:Landroid/os/Handler;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lu2/u;->l(Landroid/os/Handler;Lu2/b0;)V

    iget-object p1, p0, Lu2/f;->r:Landroid/os/Handler;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lu2/u;->p(Landroid/os/Handler;Lw1/w;)V

    iget-object p1, p0, Lu2/f;->s:Lo3/p0;

    invoke-virtual {p0}, Lu2/a;->A()Lt1/t1;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lu2/u;->h(Lu2/u$c;Lo3/p0;Lt1/t1;)V

    invoke-virtual {p0}, Lu2/a;->B()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2, v0}, Lu2/u;->k(Lu2/u$c;)V

    :cond_0
    return-void
.end method

.method protected y()V
    .locals 3

    iget-object v0, p0, Lu2/f;->q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/f$b;

    iget-object v2, v1, Lu2/f$b;->a:Lu2/u;

    iget-object v1, v1, Lu2/f$b;->b:Lu2/u$c;

    invoke-interface {v2, v1}, Lu2/u;->k(Lu2/u$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected z()V
    .locals 3

    iget-object v0, p0, Lu2/f;->q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/f$b;

    iget-object v2, v1, Lu2/f$b;->a:Lu2/u;

    iget-object v1, v1, Lu2/f$b;->b:Lu2/u$c;

    invoke-interface {v2, v1}, Lu2/u;->d(Lu2/u$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method
