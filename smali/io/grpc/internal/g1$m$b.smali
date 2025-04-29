.class final Lio/grpc/internal/g1$m$b;
.super Lio/grpc/internal/z1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/g1$m;->a(Li9/z0;Li9/c;Li9/y0;Li9/r;)Lio/grpc/internal/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        ">",
        "Lio/grpc/internal/z1<",
        "TReqT;>;"
    }
.end annotation


# instance fields
.field final synthetic E:Li9/z0;

.field final synthetic F:Li9/y0;

.field final synthetic G:Li9/c;

.field final synthetic H:Lio/grpc/internal/a2;

.field final synthetic I:Lio/grpc/internal/t0;

.field final synthetic J:Lio/grpc/internal/z1$c0;

.field final synthetic K:Li9/r;

.field final synthetic L:Lio/grpc/internal/g1$m;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1$m;Li9/z0;Li9/y0;Li9/c;Lio/grpc/internal/a2;Lio/grpc/internal/t0;Lio/grpc/internal/z1$c0;Li9/r;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    move-object v13, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    iput-object v0, v13, Lio/grpc/internal/g1$m$b;->L:Lio/grpc/internal/g1$m;

    move-object/from16 v2, p2

    iput-object v2, v13, Lio/grpc/internal/g1$m$b;->E:Li9/z0;

    move-object/from16 v3, p3

    iput-object v3, v13, Lio/grpc/internal/g1$m$b;->F:Li9/y0;

    iput-object v1, v13, Lio/grpc/internal/g1$m$b;->G:Li9/c;

    move-object/from16 v10, p5

    iput-object v10, v13, Lio/grpc/internal/g1$m$b;->H:Lio/grpc/internal/a2;

    move-object/from16 v11, p6

    iput-object v11, v13, Lio/grpc/internal/g1$m$b;->I:Lio/grpc/internal/t0;

    move-object/from16 v12, p7

    iput-object v12, v13, Lio/grpc/internal/g1$m$b;->J:Lio/grpc/internal/z1$c0;

    move-object/from16 v4, p8

    iput-object v4, v13, Lio/grpc/internal/g1$m$b;->K:Li9/r;

    iget-object v4, v0, Lio/grpc/internal/g1$m;->a:Lio/grpc/internal/g1;

    invoke-static {v4}, Lio/grpc/internal/g1;->y(Lio/grpc/internal/g1;)Lio/grpc/internal/z1$t;

    move-result-object v4

    iget-object v5, v0, Lio/grpc/internal/g1$m;->a:Lio/grpc/internal/g1;

    invoke-static {v5}, Lio/grpc/internal/g1;->z(Lio/grpc/internal/g1;)J

    move-result-wide v5

    iget-object v7, v0, Lio/grpc/internal/g1$m;->a:Lio/grpc/internal/g1;

    invoke-static {v7}, Lio/grpc/internal/g1;->A(Lio/grpc/internal/g1;)J

    move-result-wide v7

    iget-object v9, v0, Lio/grpc/internal/g1$m;->a:Lio/grpc/internal/g1;

    invoke-static {v9, v1}, Lio/grpc/internal/g1;->B(Lio/grpc/internal/g1;Li9/c;)Ljava/util/concurrent/Executor;

    move-result-object v9

    iget-object v0, v0, Lio/grpc/internal/g1$m;->a:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->C(Lio/grpc/internal/g1;)Lio/grpc/internal/t;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/t;->S()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v14

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object v3, v4

    move-wide v4, v5

    move-wide v6, v7

    move-object v8, v9

    move-object v9, v14

    invoke-direct/range {v0 .. v12}, Lio/grpc/internal/z1;-><init>(Li9/z0;Li9/y0;Lio/grpc/internal/z1$t;JJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/a2;Lio/grpc/internal/t0;Lio/grpc/internal/z1$c0;)V

    return-void
.end method


# virtual methods
.method j0(Li9/y0;Li9/k$a;IZ)Lio/grpc/internal/q;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/g1$m$b;->G:Li9/c;

    invoke-virtual {v0, p2}, Li9/c;->r(Li9/k$a;)Li9/c;

    move-result-object p2

    invoke-static {p2, p1, p3, p4}, Lio/grpc/internal/r0;->f(Li9/c;Li9/y0;IZ)[Li9/k;

    move-result-object p3

    iget-object p4, p0, Lio/grpc/internal/g1$m$b;->L:Lio/grpc/internal/g1$m;

    new-instance v0, Lio/grpc/internal/t1;

    iget-object v1, p0, Lio/grpc/internal/g1$m$b;->E:Li9/z0;

    invoke-direct {v0, v1, p1, p2}, Lio/grpc/internal/t1;-><init>(Li9/z0;Li9/y0;Li9/c;)V

    invoke-static {p4, v0}, Lio/grpc/internal/g1$m;->b(Lio/grpc/internal/g1$m;Li9/r0$f;)Lio/grpc/internal/s;

    move-result-object p4

    iget-object v0, p0, Lio/grpc/internal/g1$m$b;->K:Li9/r;

    invoke-virtual {v0}, Li9/r;->b()Li9/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/g1$m$b;->E:Li9/z0;

    invoke-interface {p4, v1, p1, p2, p3}, Lio/grpc/internal/s;->a(Li9/z0;Li9/y0;Li9/c;[Li9/k;)Lio/grpc/internal/q;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lio/grpc/internal/g1$m$b;->K:Li9/r;

    invoke-virtual {p2, v0}, Li9/r;->f(Li9/r;)V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lio/grpc/internal/g1$m$b;->K:Li9/r;

    invoke-virtual {p2, v0}, Li9/r;->f(Li9/r;)V

    throw p1
.end method

.method k0()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g1$m$b;->L:Lio/grpc/internal/g1$m;

    iget-object v0, v0, Lio/grpc/internal/g1$m;->a:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->D(Lio/grpc/internal/g1;)Lio/grpc/internal/g1$z;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/grpc/internal/g1$z;->d(Lio/grpc/internal/z1;)V

    return-void
.end method

.method l0()Li9/j1;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g1$m$b;->L:Lio/grpc/internal/g1$m;

    iget-object v0, v0, Lio/grpc/internal/g1$m;->a:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->D(Lio/grpc/internal/g1;)Lio/grpc/internal/g1$z;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/grpc/internal/g1$z;->a(Lio/grpc/internal/z1;)Li9/j1;

    move-result-object v0

    return-object v0
.end method
