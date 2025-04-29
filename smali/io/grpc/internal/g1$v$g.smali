.class final Lio/grpc/internal/g1$v$g;
.super Lio/grpc/internal/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/g1$v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/g1$v$g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lio/grpc/internal/z<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final l:Li9/r;

.field final m:Li9/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/z0<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field

.field final n:Li9/c;

.field final synthetic o:Lio/grpc/internal/g1$v;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1$v;Li9/r;Li9/z0;Li9/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/r;",
            "Li9/z0<",
            "TReqT;TRespT;>;",
            "Li9/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, p1, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0, p4}, Lio/grpc/internal/g1;->B(Lio/grpc/internal/g1;Li9/c;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object p1, p1, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {p1}, Lio/grpc/internal/g1;->U(Lio/grpc/internal/g1;)Lio/grpc/internal/g1$x;

    move-result-object p1

    invoke-virtual {p4}, Li9/c;->d()Li9/t;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lio/grpc/internal/z;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Li9/t;)V

    iput-object p2, p0, Lio/grpc/internal/g1$v$g;->l:Li9/r;

    iput-object p3, p0, Lio/grpc/internal/g1$v$g;->m:Li9/z0;

    iput-object p4, p0, Lio/grpc/internal/g1$v$g;->n:Li9/c;

    return-void
.end method


# virtual methods
.method protected j()V
    .locals 2

    invoke-super {p0}, Lio/grpc/internal/z;->j()V

    iget-object v0, p0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    iget-object v0, v0, Lio/grpc/internal/g1;->s:Li9/n1;

    new-instance v1, Lio/grpc/internal/g1$v$g$b;

    invoke-direct {v1, p0}, Lio/grpc/internal/g1$v$g$b;-><init>(Lio/grpc/internal/g1$v$g;)V

    invoke-virtual {v0, v1}, Li9/n1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method r()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/g1$v$g;->l:Li9/r;

    invoke-virtual {v0}, Li9/r;->b()Li9/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v2, p0, Lio/grpc/internal/g1$v$g;->m:Li9/z0;

    iget-object v3, p0, Lio/grpc/internal/g1$v$g;->n:Li9/c;

    invoke-static {v1, v2, v3}, Lio/grpc/internal/g1$v;->k(Lio/grpc/internal/g1$v;Li9/z0;Li9/c;)Li9/g;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lio/grpc/internal/g1$v$g;->l:Li9/r;

    invoke-virtual {v2, v0}, Li9/r;->f(Li9/r;)V

    invoke-virtual {p0, v1}, Lio/grpc/internal/z;->p(Li9/g;)Ljava/lang/Runnable;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    iget-object v0, v0, Lio/grpc/internal/g1;->s:Li9/n1;

    new-instance v1, Lio/grpc/internal/g1$v$g$b;

    invoke-direct {v1, p0}, Lio/grpc/internal/g1$v$g$b;-><init>(Lio/grpc/internal/g1$v$g;)V

    invoke-virtual {v0, v1}, Li9/n1;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v1, v1, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    iget-object v2, p0, Lio/grpc/internal/g1$v$g;->n:Li9/c;

    invoke-static {v1, v2}, Lio/grpc/internal/g1;->B(Lio/grpc/internal/g1;Li9/c;)Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lio/grpc/internal/g1$v$g$a;

    invoke-direct {v2, p0, v0}, Lio/grpc/internal/g1$v$g$a;-><init>(Lio/grpc/internal/g1$v$g;Ljava/lang/Runnable;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lio/grpc/internal/g1$v$g;->l:Li9/r;

    invoke-virtual {v2, v0}, Li9/r;->f(Li9/r;)V

    throw v1
.end method
