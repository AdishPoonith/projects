.class final Lio/grpc/internal/g1$v$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/g1$v$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic j:Lio/grpc/internal/g1$v$g;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1$v$g;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    iget-object v0, v0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->R(Lio/grpc/internal/g1;)Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    iget-object v0, v0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->R(Lio/grpc/internal/g1;)Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    iget-object v0, v0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->R(Lio/grpc/internal/g1;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    iget-object v0, v0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    iget-object v1, v0, Lio/grpc/internal/g1;->i0:Lio/grpc/internal/w0;

    invoke-static {v0}, Lio/grpc/internal/g1;->T(Lio/grpc/internal/g1;)Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lio/grpc/internal/w0;->e(Ljava/lang/Object;Z)V

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    iget-object v0, v0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/g1;->S(Lio/grpc/internal/g1;Ljava/util/Collection;)Ljava/util/Collection;

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    iget-object v0, v0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->t(Lio/grpc/internal/g1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$b;->j:Lio/grpc/internal/g1$v$g;

    iget-object v0, v0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->D(Lio/grpc/internal/g1;)Lio/grpc/internal/g1$z;

    move-result-object v0

    sget-object v1, Lio/grpc/internal/g1;->q0:Li9/j1;

    invoke-virtual {v0, v1}, Lio/grpc/internal/g1$z;->b(Li9/j1;)V

    :cond_0
    return-void
.end method
