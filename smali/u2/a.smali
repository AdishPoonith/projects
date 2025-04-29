.class public abstract Lu2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/u;


# instance fields
.field private final j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lu2/u$c;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lu2/u$c;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lu2/b0$a;

.field private final m:Lw1/w$a;

.field private n:Landroid/os/Looper;

.field private o:Ls1/y3;

.field private p:Lt1/t1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lu2/a;->j:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lu2/a;->k:Ljava/util/HashSet;

    new-instance v0, Lu2/b0$a;

    invoke-direct {v0}, Lu2/b0$a;-><init>()V

    iput-object v0, p0, Lu2/a;->l:Lu2/b0$a;

    new-instance v0, Lw1/w$a;

    invoke-direct {v0}, Lw1/w$a;-><init>()V

    iput-object v0, p0, Lu2/a;->m:Lw1/w$a;

    return-void
.end method


# virtual methods
.method protected final A()Lt1/t1;
    .locals 1

    iget-object v0, p0, Lu2/a;->p:Lt1/t1;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt1/t1;

    return-object v0
.end method

.method protected final B()Z
    .locals 1

    iget-object v0, p0, Lu2/a;->k:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected abstract C(Lo3/p0;)V
.end method

.method protected final D(Ls1/y3;)V
    .locals 2

    iput-object p1, p0, Lu2/a;->o:Ls1/y3;

    iget-object v0, p0, Lu2/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/u$c;

    invoke-interface {v1, p0, p1}, Lu2/u$c;->a(Lu2/u;Ls1/y3;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected abstract E()V
.end method

.method public final c(Lu2/u$c;)V
    .locals 1

    iget-object v0, p0, Lu2/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lu2/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lu2/a;->n:Landroid/os/Looper;

    iput-object p1, p0, Lu2/a;->o:Ls1/y3;

    iput-object p1, p0, Lu2/a;->p:Lt1/t1;

    iget-object p1, p0, Lu2/a;->k:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    invoke-virtual {p0}, Lu2/a;->E()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lu2/a;->k(Lu2/u$c;)V

    :goto_0
    return-void
.end method

.method public final d(Lu2/u$c;)V
    .locals 2

    iget-object v0, p0, Lu2/a;->n:Landroid/os/Looper;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu2/a;->k:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Lu2/a;->k:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu2/a;->z()V

    :cond_0
    return-void
.end method

.method public final e(Lu2/b0;)V
    .locals 1

    iget-object v0, p0, Lu2/a;->l:Lu2/b0$a;

    invoke-virtual {v0, p1}, Lu2/b0$a;->C(Lu2/b0;)V

    return-void
.end method

.method public synthetic g()Z
    .locals 1

    invoke-static {p0}, Lu2/t;->b(Lu2/u;)Z

    move-result v0

    return v0
.end method

.method public final h(Lu2/u$c;Lo3/p0;Lt1/t1;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lu2/a;->n:Landroid/os/Looper;

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lp3/a;->a(Z)V

    iput-object p3, p0, Lu2/a;->p:Lt1/t1;

    iget-object p3, p0, Lu2/a;->o:Ls1/y3;

    iget-object v1, p0, Lu2/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lu2/a;->n:Landroid/os/Looper;

    if-nez v1, :cond_2

    iput-object v0, p0, Lu2/a;->n:Landroid/os/Looper;

    iget-object p3, p0, Lu2/a;->k:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lu2/a;->C(Lo3/p0;)V

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, Lu2/a;->d(Lu2/u$c;)V

    invoke-interface {p1, p0, p3}, Lu2/u$c;->a(Lu2/u;Ls1/y3;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public synthetic j()Ls1/y3;
    .locals 1

    invoke-static {p0}, Lu2/t;->a(Lu2/u;)Ls1/y3;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lu2/u$c;)V
    .locals 2

    iget-object v0, p0, Lu2/a;->k:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lu2/a;->k:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lu2/a;->k:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lu2/a;->y()V

    :cond_0
    return-void
.end method

.method public final l(Landroid/os/Handler;Lu2/b0;)V
    .locals 1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu2/a;->l:Lu2/b0$a;

    invoke-virtual {v0, p1, p2}, Lu2/b0$a;->g(Landroid/os/Handler;Lu2/b0;)V

    return-void
.end method

.method public final p(Landroid/os/Handler;Lw1/w;)V
    .locals 1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu2/a;->m:Lw1/w$a;

    invoke-virtual {v0, p1, p2}, Lw1/w$a;->g(Landroid/os/Handler;Lw1/w;)V

    return-void
.end method

.method public final q(Lw1/w;)V
    .locals 1

    iget-object v0, p0, Lu2/a;->m:Lw1/w$a;

    invoke-virtual {v0, p1}, Lw1/w$a;->t(Lw1/w;)V

    return-void
.end method

.method protected final s(ILu2/u$b;)Lw1/w$a;
    .locals 1

    iget-object v0, p0, Lu2/a;->m:Lw1/w$a;

    invoke-virtual {v0, p1, p2}, Lw1/w$a;->u(ILu2/u$b;)Lw1/w$a;

    move-result-object p1

    return-object p1
.end method

.method protected final t(Lu2/u$b;)Lw1/w$a;
    .locals 2

    iget-object v0, p0, Lu2/a;->m:Lw1/w$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lw1/w$a;->u(ILu2/u$b;)Lw1/w$a;

    move-result-object p1

    return-object p1
.end method

.method protected final v(ILu2/u$b;J)Lu2/b0$a;
    .locals 1

    iget-object v0, p0, Lu2/a;->l:Lu2/b0$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lu2/b0$a;->F(ILu2/u$b;J)Lu2/b0$a;

    move-result-object p1

    return-object p1
.end method

.method protected final w(Lu2/u$b;)Lu2/b0$a;
    .locals 4

    iget-object v0, p0, Lu2/a;->l:Lu2/b0$a;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lu2/b0$a;->F(ILu2/u$b;J)Lu2/b0$a;

    move-result-object p1

    return-object p1
.end method

.method protected final x(Lu2/u$b;J)Lu2/b0$a;
    .locals 2

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu2/a;->l:Lu2/b0$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lu2/b0$a;->F(ILu2/u$b;J)Lu2/b0$a;

    move-result-object p1

    return-object p1
.end method

.method protected y()V
    .locals 0

    return-void
.end method

.method protected z()V
    .locals 0

    return-void
.end method
