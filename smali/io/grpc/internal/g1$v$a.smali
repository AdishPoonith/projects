.class Lio/grpc/internal/g1$v$a;
.super Li9/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/g1$v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/g1$v;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1$v;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    invoke-direct {p0}, Li9/d;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    invoke-static {v0}, Lio/grpc/internal/g1$v;->j(Lio/grpc/internal/g1$v;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Li9/z0;Li9/c;)Li9/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Li9/z0<",
            "TRequestT;TResponseT;>;",
            "Li9/c;",
            ")",
            "Li9/g<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    new-instance v8, Lio/grpc/internal/p;

    iget-object v0, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0, p2}, Lio/grpc/internal/g1;->B(Lio/grpc/internal/g1;Li9/c;)Ljava/util/concurrent/Executor;

    move-result-object v2

    iget-object v0, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->O(Lio/grpc/internal/g1;)Lio/grpc/internal/p$e;

    move-result-object v4

    iget-object v0, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->Q(Lio/grpc/internal/g1;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->C(Lio/grpc/internal/g1;)Lio/grpc/internal/t;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/t;->S()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    :goto_0
    move-object v5, v0

    iget-object v0, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    iget-object v0, v0, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->E(Lio/grpc/internal/g1;)Lio/grpc/internal/m;

    move-result-object v6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v7}, Lio/grpc/internal/p;-><init>(Li9/z0;Ljava/util/concurrent/Executor;Li9/c;Lio/grpc/internal/p$e;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/m;Li9/f0;)V

    iget-object p1, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    iget-object p1, p1, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {p1}, Lio/grpc/internal/g1;->N(Lio/grpc/internal/g1;)Z

    move-result p1

    invoke-virtual {v8, p1}, Lio/grpc/internal/p;->C(Z)Lio/grpc/internal/p;

    move-result-object p1

    iget-object p2, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    iget-object p2, p2, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {p2}, Lio/grpc/internal/g1;->M(Lio/grpc/internal/g1;)Li9/v;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/grpc/internal/p;->B(Li9/v;)Lio/grpc/internal/p;

    move-result-object p1

    iget-object p2, p0, Lio/grpc/internal/g1$v$a;->a:Lio/grpc/internal/g1$v;

    iget-object p2, p2, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    invoke-static {p2}, Lio/grpc/internal/g1;->L(Lio/grpc/internal/g1;)Li9/o;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/grpc/internal/p;->A(Li9/o;)Lio/grpc/internal/p;

    move-result-object p1

    return-object p1
.end method
