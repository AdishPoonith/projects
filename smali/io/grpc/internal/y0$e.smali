.class Lio/grpc/internal/y0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y0;->c(Li9/j1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Li9/j1;

.field final synthetic k:Lio/grpc/internal/y0;


# direct methods
.method constructor <init>(Lio/grpc/internal/y0;Li9/j1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    iput-object p2, p0, Lio/grpc/internal/y0$e;->j:Li9/j1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v0}, Lio/grpc/internal/y0;->i(Lio/grpc/internal/y0;)Li9/q;

    move-result-object v0

    invoke-virtual {v0}, Li9/q;->c()Li9/p;

    move-result-object v0

    sget-object v1, Li9/p;->n:Li9/p;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    iget-object v2, p0, Lio/grpc/internal/y0$e;->j:Li9/j1;

    invoke-static {v0, v2}, Lio/grpc/internal/y0;->u(Lio/grpc/internal/y0;Li9/j1;)Li9/j1;

    iget-object v0, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v0}, Lio/grpc/internal/y0;->j(Lio/grpc/internal/y0;)Lio/grpc/internal/k1;

    move-result-object v0

    iget-object v2, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v2}, Lio/grpc/internal/y0;->l(Lio/grpc/internal/y0;)Lio/grpc/internal/v;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lio/grpc/internal/y0;->k(Lio/grpc/internal/y0;Lio/grpc/internal/k1;)Lio/grpc/internal/k1;

    iget-object v3, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v3, v4}, Lio/grpc/internal/y0;->m(Lio/grpc/internal/y0;Lio/grpc/internal/v;)Lio/grpc/internal/v;

    iget-object v3, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v3, v1}, Lio/grpc/internal/y0;->E(Lio/grpc/internal/y0;Li9/p;)V

    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1}, Lio/grpc/internal/y0;->I(Lio/grpc/internal/y0;)Lio/grpc/internal/y0$k;

    move-result-object v1

    invoke-virtual {v1}, Lio/grpc/internal/y0$k;->f()V

    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1}, Lio/grpc/internal/y0;->v(Lio/grpc/internal/y0;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1}, Lio/grpc/internal/y0;->w(Lio/grpc/internal/y0;)V

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1}, Lio/grpc/internal/y0;->H(Lio/grpc/internal/y0;)V

    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1}, Lio/grpc/internal/y0;->n(Lio/grpc/internal/y0;)Li9/n1$d;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1}, Lio/grpc/internal/y0;->n(Lio/grpc/internal/y0;)Li9/n1$d;

    move-result-object v1

    invoke-virtual {v1}, Li9/n1$d;->a()V

    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1}, Lio/grpc/internal/y0;->p(Lio/grpc/internal/y0;)Lio/grpc/internal/k1;

    move-result-object v1

    iget-object v3, p0, Lio/grpc/internal/y0$e;->j:Li9/j1;

    invoke-interface {v1, v3}, Lio/grpc/internal/k1;->c(Li9/j1;)V

    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1, v4}, Lio/grpc/internal/y0;->o(Lio/grpc/internal/y0;Li9/n1$d;)Li9/n1$d;

    iget-object v1, p0, Lio/grpc/internal/y0$e;->k:Lio/grpc/internal/y0;

    invoke-static {v1, v4}, Lio/grpc/internal/y0;->q(Lio/grpc/internal/y0;Lio/grpc/internal/k1;)Lio/grpc/internal/k1;

    :cond_2
    if-eqz v0, :cond_3

    iget-object v1, p0, Lio/grpc/internal/y0$e;->j:Li9/j1;

    invoke-interface {v0, v1}, Lio/grpc/internal/k1;->c(Li9/j1;)V

    :cond_3
    if-eqz v2, :cond_4

    iget-object v0, p0, Lio/grpc/internal/y0$e;->j:Li9/j1;

    invoke-interface {v2, v0}, Lio/grpc/internal/k1;->c(Li9/j1;)V

    :cond_4
    return-void
.end method
