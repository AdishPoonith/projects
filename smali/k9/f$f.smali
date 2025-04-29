.class final Lk9/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "f"
.end annotation


# instance fields
.field final A:Z

.field private B:Z

.field private final j:Lio/grpc/internal/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/p1<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field final k:Ljava/util/concurrent/Executor;

.field private final l:Lio/grpc/internal/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/p1<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field final m:Ljava/util/concurrent/ScheduledExecutorService;

.field final n:Lio/grpc/internal/o2$b;

.field final o:Ljavax/net/SocketFactory;

.field final p:Ljavax/net/ssl/SSLSocketFactory;

.field final q:Ljavax/net/ssl/HostnameVerifier;

.field final r:Ll9/b;

.field final s:I

.field private final t:Z

.field private final u:J

.field private final v:Lio/grpc/internal/h;

.field private final w:J

.field final x:I

.field private final y:Z

.field final z:I


# direct methods
.method private constructor <init>(Lio/grpc/internal/p1;Lio/grpc/internal/p1;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ll9/b;IZJJIZILio/grpc/internal/o2$b;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/grpc/internal/p1<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lio/grpc/internal/p1<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;",
            "Ljavax/net/SocketFactory;",
            "Ljavax/net/ssl/SSLSocketFactory;",
            "Ljavax/net/ssl/HostnameVerifier;",
            "Ll9/b;",
            "IZJJIZI",
            "Lio/grpc/internal/o2$b;",
            "Z)V"
        }
    .end annotation

    move-object v0, p0

    move-wide v1, p9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v3, p1

    iput-object v3, v0, Lk9/f$f;->j:Lio/grpc/internal/p1;

    invoke-interface {p1}, Lio/grpc/internal/p1;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/Executor;

    iput-object v3, v0, Lk9/f$f;->k:Ljava/util/concurrent/Executor;

    move-object v3, p2

    iput-object v3, v0, Lk9/f$f;->l:Lio/grpc/internal/p1;

    invoke-interface {p2}, Lio/grpc/internal/p1;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v3, v0, Lk9/f$f;->m:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v3, p3

    iput-object v3, v0, Lk9/f$f;->o:Ljavax/net/SocketFactory;

    move-object v3, p4

    iput-object v3, v0, Lk9/f$f;->p:Ljavax/net/ssl/SSLSocketFactory;

    move-object v3, p5

    iput-object v3, v0, Lk9/f$f;->q:Ljavax/net/ssl/HostnameVerifier;

    move-object v3, p6

    iput-object v3, v0, Lk9/f$f;->r:Ll9/b;

    move v3, p7

    iput v3, v0, Lk9/f$f;->s:I

    move v3, p8

    iput-boolean v3, v0, Lk9/f$f;->t:Z

    iput-wide v1, v0, Lk9/f$f;->u:J

    new-instance v3, Lio/grpc/internal/h;

    const-string v4, "keepalive time nanos"

    invoke-direct {v3, v4, p9, p10}, Lio/grpc/internal/h;-><init>(Ljava/lang/String;J)V

    iput-object v3, v0, Lk9/f$f;->v:Lio/grpc/internal/h;

    move-wide/from16 v1, p11

    iput-wide v1, v0, Lk9/f$f;->w:J

    move/from16 v1, p13

    iput v1, v0, Lk9/f$f;->x:I

    move/from16 v1, p14

    iput-boolean v1, v0, Lk9/f$f;->y:Z

    move/from16 v1, p15

    iput v1, v0, Lk9/f$f;->z:I

    move/from16 v1, p17

    iput-boolean v1, v0, Lk9/f$f;->A:Z

    const-string v1, "transportTracerFactory"

    move-object/from16 v2, p16

    invoke-static {v2, v1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/grpc/internal/o2$b;

    iput-object v1, v0, Lk9/f$f;->n:Lio/grpc/internal/o2$b;

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/p1;Lio/grpc/internal/p1;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ll9/b;IZJJIZILio/grpc/internal/o2$b;ZLk9/f$a;)V
    .locals 0

    invoke-direct/range {p0 .. p17}, Lk9/f$f;-><init>(Lio/grpc/internal/p1;Lio/grpc/internal/p1;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ll9/b;IZJJIZILio/grpc/internal/o2$b;Z)V

    return-void
.end method


# virtual methods
.method public S()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lk9/f$f;->m:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public W(Ljava/net/SocketAddress;Lio/grpc/internal/t$a;Li9/f;)Lio/grpc/internal/v;
    .locals 18

    move-object/from16 v8, p0

    iget-boolean v0, v8, Lk9/f$f;->B:Z

    if-nez v0, :cond_1

    iget-object v0, v8, Lk9/f$f;->v:Lio/grpc/internal/h;

    invoke-virtual {v0}, Lio/grpc/internal/h;->d()Lio/grpc/internal/h$b;

    move-result-object v9

    new-instance v7, Lk9/f$f$a;

    invoke-direct {v7, v8, v9}, Lk9/f$f$a;-><init>(Lk9/f$f;Lio/grpc/internal/h$b;)V

    move-object/from16 v2, p1

    check-cast v2, Ljava/net/InetSocketAddress;

    new-instance v17, Lk9/i;

    invoke-virtual/range {p2 .. p2}, Lio/grpc/internal/t$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lio/grpc/internal/t$a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lio/grpc/internal/t$a;->b()Li9/a;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lio/grpc/internal/t$a;->c()Li9/c0;

    move-result-object v6

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v7}, Lk9/i;-><init>(Lk9/f$f;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Li9/a;Li9/c0;Ljava/lang/Runnable;)V

    iget-boolean v0, v8, Lk9/f$f;->t:Z

    if-eqz v0, :cond_0

    const/4 v11, 0x1

    invoke-virtual {v9}, Lio/grpc/internal/h$b;->b()J

    move-result-wide v12

    iget-wide v14, v8, Lk9/f$f;->w:J

    iget-boolean v0, v8, Lk9/f$f;->y:Z

    move-object/from16 v10, v17

    move/from16 v16, v0

    invoke-virtual/range {v10 .. v16}, Lk9/i;->T(ZJJZ)V

    :cond_0
    return-object v17

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The transport factory is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Lk9/f$f;->B:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lk9/f$f;->B:Z

    iget-object v0, p0, Lk9/f$f;->j:Lio/grpc/internal/p1;

    iget-object v1, p0, Lk9/f$f;->k:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Lio/grpc/internal/p1;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lk9/f$f;->l:Lio/grpc/internal/p1;

    iget-object v1, p0, Lk9/f$f;->m:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, v1}, Lio/grpc/internal/p1;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
