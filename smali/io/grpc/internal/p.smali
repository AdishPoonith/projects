.class final Lio/grpc/internal/p;
.super Li9/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/p$d;,
        Lio/grpc/internal/p$g;,
        Lio/grpc/internal/p$e;,
        Lio/grpc/internal/p$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Li9/g<",
        "TReqT;TRespT;>;"
    }
.end annotation


# static fields
.field private static final t:Ljava/util/logging/Logger;

.field private static final u:[B

.field private static final v:D


# instance fields
.field private final a:Li9/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/z0<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field

.field private final b:Lr9/d;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Z

.field private final e:Lio/grpc/internal/m;

.field private final f:Li9/r;

.field private volatile g:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private final h:Z

.field private i:Li9/c;

.field private j:Lio/grpc/internal/q;

.field private volatile k:Z

.field private l:Z

.field private m:Z

.field private final n:Lio/grpc/internal/p$e;

.field private final o:Lio/grpc/internal/p$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/p<",
            "TReqT;TRespT;>.f;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/concurrent/ScheduledExecutorService;

.field private q:Z

.field private r:Li9/v;

.field private s:Li9/o;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-class v0, Lio/grpc/internal/p;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/p;->t:Ljava/util/logging/Logger;

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "gzip"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lio/grpc/internal/p;->u:[B

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double v0, v0, v2

    sput-wide v0, Lio/grpc/internal/p;->v:D

    return-void
.end method

.method constructor <init>(Li9/z0;Ljava/util/concurrent/Executor;Li9/c;Lio/grpc/internal/p$e;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/m;Li9/f0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/z0<",
            "TReqT;TRespT;>;",
            "Ljava/util/concurrent/Executor;",
            "Li9/c;",
            "Lio/grpc/internal/p$e;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Lio/grpc/internal/m;",
            "Li9/f0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Li9/g;-><init>()V

    new-instance p7, Lio/grpc/internal/p$f;

    const/4 v0, 0x0

    invoke-direct {p7, p0, v0}, Lio/grpc/internal/p$f;-><init>(Lio/grpc/internal/p;Lio/grpc/internal/p$a;)V

    iput-object p7, p0, Lio/grpc/internal/p;->o:Lio/grpc/internal/p$f;

    invoke-static {}, Li9/v;->c()Li9/v;

    move-result-object p7

    iput-object p7, p0, Lio/grpc/internal/p;->r:Li9/v;

    invoke-static {}, Li9/o;->a()Li9/o;

    move-result-object p7

    iput-object p7, p0, Lio/grpc/internal/p;->s:Li9/o;

    iput-object p1, p0, Lio/grpc/internal/p;->a:Li9/z0;

    invoke-virtual {p1}, Li9/z0;->c()Ljava/lang/String;

    move-result-object p7

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p7, v0, v1}, Lr9/c;->b(Ljava/lang/String;J)Lr9/d;

    move-result-object p7

    iput-object p7, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {}, Lcom/google/common/util/concurrent/e;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p2, v0, :cond_0

    new-instance p2, Lio/grpc/internal/c2;

    invoke-direct {p2}, Lio/grpc/internal/c2;-><init>()V

    iput-object p2, p0, Lio/grpc/internal/p;->c:Ljava/util/concurrent/Executor;

    iput-boolean v1, p0, Lio/grpc/internal/p;->d:Z

    goto :goto_0

    :cond_0
    new-instance v0, Lio/grpc/internal/d2;

    invoke-direct {v0, p2}, Lio/grpc/internal/d2;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lio/grpc/internal/p;->c:Ljava/util/concurrent/Executor;

    iput-boolean v2, p0, Lio/grpc/internal/p;->d:Z

    :goto_0
    iput-object p6, p0, Lio/grpc/internal/p;->e:Lio/grpc/internal/m;

    invoke-static {}, Li9/r;->e()Li9/r;

    move-result-object p2

    iput-object p2, p0, Lio/grpc/internal/p;->f:Li9/r;

    invoke-virtual {p1}, Li9/z0;->e()Li9/z0$d;

    move-result-object p2

    sget-object p6, Li9/z0$d;->j:Li9/z0$d;

    if-eq p2, p6, :cond_2

    invoke-virtual {p1}, Li9/z0;->e()Li9/z0$d;

    move-result-object p1

    sget-object p2, Li9/z0$d;->l:Li9/z0$d;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_1
    iput-boolean v1, p0, Lio/grpc/internal/p;->h:Z

    iput-object p3, p0, Lio/grpc/internal/p;->i:Li9/c;

    iput-object p4, p0, Lio/grpc/internal/p;->n:Lio/grpc/internal/p$e;

    iput-object p5, p0, Lio/grpc/internal/p;->p:Ljava/util/concurrent/ScheduledExecutorService;

    const-string p1, "ClientCall.<init>"

    invoke-static {p1, p7}, Lr9/c;->c(Ljava/lang/String;Lr9/d;)V

    return-void
.end method

.method private D(Li9/t;)Ljava/util/concurrent/ScheduledFuture;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/t;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0}, Li9/t;->p(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    iget-object p1, p0, Lio/grpc/internal/p;->p:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Lio/grpc/internal/d1;

    new-instance v4, Lio/grpc/internal/p$g;

    invoke-direct {v4, p0, v1, v2}, Lio/grpc/internal/p$g;-><init>(Lio/grpc/internal/p;J)V

    invoke-direct {v3, v4}, Lio/grpc/internal/d1;-><init>(Ljava/lang/Runnable;)V

    invoke-interface {p1, v3, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method private E(Li9/g$a;Li9/y0;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/g$a<",
            "TRespT;>;",
            "Li9/y0;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v3, "Already started"

    invoke-static {v0, v3}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lio/grpc/internal/p;->l:Z

    xor-int/2addr v0, v1

    const-string v3, "call was cancelled"

    invoke-static {v0, v3}, Lb5/n;->u(ZLjava/lang/Object;)V

    const-string v0, "observer"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "headers"

    invoke-static {p2, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/grpc/internal/p;->f:Li9/r;

    invoke-virtual {v0}, Li9/r;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Lio/grpc/internal/o1;->a:Lio/grpc/internal/o1;

    iput-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    iget-object p2, p0, Lio/grpc/internal/p;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Lio/grpc/internal/p$b;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/p$b;-><init>(Lio/grpc/internal/p;Li9/g$a;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lio/grpc/internal/p;->p()V

    iget-object v0, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v0}, Li9/c;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v3, p0, Lio/grpc/internal/p;->s:Li9/o;

    invoke-virtual {v3, v0}, Li9/o;->b(Ljava/lang/String;)Li9/n;

    move-result-object v3

    if-nez v3, :cond_3

    sget-object p2, Lio/grpc/internal/o1;->a:Lio/grpc/internal/o1;

    iput-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    iget-object p2, p0, Lio/grpc/internal/p;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lio/grpc/internal/p$c;

    invoke-direct {v1, p0, p1, v0}, Lio/grpc/internal/p$c;-><init>(Lio/grpc/internal/p;Li9/g$a;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    sget-object v3, Li9/l$b;->a:Li9/l;

    :cond_3
    iget-object v0, p0, Lio/grpc/internal/p;->r:Li9/v;

    iget-boolean v4, p0, Lio/grpc/internal/p;->q:Z

    invoke-static {p2, v0, v3, v4}, Lio/grpc/internal/p;->x(Li9/y0;Li9/v;Li9/n;Z)V

    invoke-direct {p0}, Lio/grpc/internal/p;->s()Li9/t;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Li9/t;->n()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_5

    iget-object v1, p0, Lio/grpc/internal/p;->f:Li9/r;

    invoke-virtual {v1}, Li9/r;->g()Li9/t;

    move-result-object v1

    iget-object v2, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v2}, Li9/c;->d()Li9/t;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lio/grpc/internal/p;->v(Li9/t;Li9/t;Li9/t;)V

    iget-object v1, p0, Lio/grpc/internal/p;->n:Lio/grpc/internal/p$e;

    iget-object v2, p0, Lio/grpc/internal/p;->a:Li9/z0;

    iget-object v4, p0, Lio/grpc/internal/p;->i:Li9/c;

    iget-object v5, p0, Lio/grpc/internal/p;->f:Li9/r;

    invoke-interface {v1, v2, v4, p2, v5}, Lio/grpc/internal/p$e;->a(Li9/z0;Li9/c;Li9/y0;Li9/r;)Lio/grpc/internal/q;

    move-result-object p2

    iput-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    goto :goto_3

    :cond_5
    iget-object v4, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-static {v4, p2, v2, v2}, Lio/grpc/internal/r0;->f(Li9/c;Li9/y0;IZ)[Li9/k;

    move-result-object p2

    iget-object v4, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v4}, Li9/c;->d()Li9/t;

    move-result-object v4

    iget-object v5, p0, Lio/grpc/internal/p;->f:Li9/r;

    invoke-virtual {v5}, Li9/r;->g()Li9/t;

    move-result-object v5

    invoke-static {v4, v5}, Lio/grpc/internal/p;->u(Li9/t;Li9/t;)Z

    move-result v4

    if-eqz v4, :cond_6

    const-string v4, "CallOptions"

    goto :goto_2

    :cond_6
    const-string v4, "Context"

    :goto_2
    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2}, Li9/t;->p(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v6

    long-to-double v6, v6

    sget-wide v8, Lio/grpc/internal/p;->v:D

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v5, v1

    const-string v1, "ClientCall started after %s deadline was exceeded .9%f seconds ago"

    invoke-static {v1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lio/grpc/internal/f0;

    sget-object v4, Li9/j1;->j:Li9/j1;

    invoke-virtual {v4, v1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object v1

    invoke-direct {v2, v1, p2}, Lio/grpc/internal/f0;-><init>(Li9/j1;[Li9/k;)V

    iput-object v2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    :goto_3
    iget-boolean p2, p0, Lio/grpc/internal/p;->d:Z

    if-eqz p2, :cond_7

    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    invoke-interface {p2}, Lio/grpc/internal/j2;->m()V

    :cond_7
    iget-object p2, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {p2}, Li9/c;->a()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_8

    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Li9/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Lio/grpc/internal/q;->k(Ljava/lang/String;)V

    :cond_8
    iget-object p2, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {p2}, Li9/c;->f()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Li9/c;->f()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p2, v1}, Lio/grpc/internal/q;->e(I)V

    :cond_9
    iget-object p2, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {p2}, Li9/c;->g()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_a

    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Li9/c;->g()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p2, v1}, Lio/grpc/internal/q;->f(I)V

    :cond_a
    if-eqz v0, :cond_b

    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    invoke-interface {p2, v0}, Lio/grpc/internal/q;->h(Li9/t;)V

    :cond_b
    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    invoke-interface {p2, v3}, Lio/grpc/internal/j2;->c(Li9/n;)V

    iget-boolean p2, p0, Lio/grpc/internal/p;->q:Z

    if-eqz p2, :cond_c

    iget-object v1, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    invoke-interface {v1, p2}, Lio/grpc/internal/q;->q(Z)V

    :cond_c
    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    iget-object v1, p0, Lio/grpc/internal/p;->r:Li9/v;

    invoke-interface {p2, v1}, Lio/grpc/internal/q;->i(Li9/v;)V

    iget-object p2, p0, Lio/grpc/internal/p;->e:Lio/grpc/internal/m;

    invoke-virtual {p2}, Lio/grpc/internal/m;->b()V

    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    new-instance v1, Lio/grpc/internal/p$d;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/p$d;-><init>(Lio/grpc/internal/p;Li9/g$a;)V

    invoke-interface {p2, v1}, Lio/grpc/internal/q;->g(Lio/grpc/internal/r;)V

    iget-object p1, p0, Lio/grpc/internal/p;->f:Li9/r;

    iget-object p2, p0, Lio/grpc/internal/p;->o:Lio/grpc/internal/p$f;

    invoke-static {}, Lcom/google/common/util/concurrent/e;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Li9/r;->a(Li9/r$a;Ljava/util/concurrent/Executor;)V

    if-eqz v0, :cond_d

    iget-object p1, p0, Lio/grpc/internal/p;->f:Li9/r;

    invoke-virtual {p1}, Li9/r;->g()Li9/t;

    move-result-object p1

    invoke-virtual {v0, p1}, Li9/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    iget-object p1, p0, Lio/grpc/internal/p;->p:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz p1, :cond_d

    invoke-direct {p0, v0}, Lio/grpc/internal/p;->D(Li9/t;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/p;->g:Ljava/util/concurrent/ScheduledFuture;

    :cond_d
    iget-boolean p1, p0, Lio/grpc/internal/p;->k:Z

    if-eqz p1, :cond_e

    invoke-direct {p0}, Lio/grpc/internal/p;->y()V

    :cond_e
    return-void
.end method

.method static synthetic f(Lio/grpc/internal/p;)Lio/grpc/internal/q;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    return-object p0
.end method

.method static synthetic g(Lio/grpc/internal/p;)Li9/t;
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/p;->s()Li9/t;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lio/grpc/internal/p;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/grpc/internal/p;->k:Z

    return p1
.end method

.method static synthetic i(Lio/grpc/internal/p;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/p;->y()V

    return-void
.end method

.method static synthetic j(Lio/grpc/internal/p;)Lio/grpc/internal/m;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/p;->e:Lio/grpc/internal/m;

    return-object p0
.end method

.method static synthetic k(Lio/grpc/internal/p;)Li9/r;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/p;->f:Li9/r;

    return-object p0
.end method

.method static synthetic l(Lio/grpc/internal/p;Li9/g$a;Li9/j1;Li9/y0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/grpc/internal/p;->r(Li9/g$a;Li9/j1;Li9/y0;)V

    return-void
.end method

.method static synthetic m(Lio/grpc/internal/p;)Lr9/d;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    return-object p0
.end method

.method static synthetic n(Lio/grpc/internal/p;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/p;->c:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic o(Lio/grpc/internal/p;)Li9/z0;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/p;->a:Li9/z0;

    return-object p0
.end method

.method private p()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/p;->i:Li9/c;

    sget-object v1, Lio/grpc/internal/j1$b;->g:Li9/c$c;

    invoke-virtual {v0, v1}, Li9/c;->h(Li9/c$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/j1$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lio/grpc/internal/j1$b;->a:Ljava/lang/Long;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v2, v3}, Li9/t;->b(JLjava/util/concurrent/TimeUnit;)Li9/t;

    move-result-object v1

    iget-object v2, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v2}, Li9/c;->d()Li9/t;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Li9/t;->k(Li9/t;)I

    move-result v2

    if-gez v2, :cond_2

    :cond_1
    iget-object v2, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v2, v1}, Li9/c;->m(Li9/t;)Li9/c;

    move-result-object v1

    iput-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    :cond_2
    iget-object v1, v0, Lio/grpc/internal/j1$b;->b:Ljava/lang/Boolean;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Li9/c;->s()Li9/c;

    move-result-object v1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Li9/c;->t()Li9/c;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    :cond_4
    iget-object v1, v0, Lio/grpc/internal/j1$b;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Li9/c;->f()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v2, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v3, v0, Lio/grpc/internal/j1$b;->c:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v2, v1}, Li9/c;->o(I)Li9/c;

    move-result-object v1

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    iget-object v2, v0, Lio/grpc/internal/j1$b;->c:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Li9/c;->o(I)Li9/c;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    :cond_6
    iget-object v1, v0, Lio/grpc/internal/j1$b;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Li9/c;->g()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v2, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v0, v0, Lio/grpc/internal/j1$b;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v2, v0}, Li9/c;->p(I)Li9/c;

    move-result-object v0

    goto :goto_2

    :cond_7
    iget-object v1, p0, Lio/grpc/internal/p;->i:Li9/c;

    iget-object v0, v0, Lio/grpc/internal/j1$b;->d:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Li9/c;->p(I)Li9/c;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lio/grpc/internal/p;->i:Li9/c;

    :cond_8
    return-void
.end method

.method private q(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/concurrent/CancellationException;

    const-string v0, "Cancelled without a message or cause"

    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    sget-object v0, Lio/grpc/internal/p;->t:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Cancelling without a message or cause is suboptimal"

    invoke-virtual {v0, v1, v2, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-boolean v0, p0, Lio/grpc/internal/p;->l:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/p;->l:Z

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    if-eqz v0, :cond_4

    sget-object v0, Li9/j1;->g:Li9/j1;

    if-eqz p1, :cond_2

    :goto_0
    invoke-virtual {v0, p1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-string p1, "Call cancelled without message"

    goto :goto_0

    :goto_1
    if-eqz p2, :cond_3

    invoke-virtual {p1, p2}, Li9/j1;->p(Ljava/lang/Throwable;)Li9/j1;

    move-result-object p1

    :cond_3
    iget-object p2, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    invoke-interface {p2, p1}, Lio/grpc/internal/q;->a(Li9/j1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    invoke-direct {p0}, Lio/grpc/internal/p;->y()V

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Lio/grpc/internal/p;->y()V

    throw p1
.end method

.method private r(Li9/g$a;Li9/j1;Li9/y0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/g$a<",
            "TRespT;>;",
            "Li9/j1;",
            "Li9/y0;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1, p2, p3}, Li9/g$a;->a(Li9/j1;Li9/y0;)V

    return-void
.end method

.method private s()Li9/t;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/p;->i:Li9/c;

    invoke-virtual {v0}, Li9/c;->d()Li9/t;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/p;->f:Li9/r;

    invoke-virtual {v1}, Li9/r;->g()Li9/t;

    move-result-object v1

    invoke-static {v0, v1}, Lio/grpc/internal/p;->w(Li9/t;Li9/t;)Li9/t;

    move-result-object v0

    return-object v0
.end method

.method private t()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, "Not started"

    invoke-static {v0, v2}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lio/grpc/internal/p;->l:Z

    xor-int/2addr v0, v1

    const-string v2, "call was cancelled"

    invoke-static {v0, v2}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lio/grpc/internal/p;->m:Z

    xor-int/2addr v0, v1

    const-string v2, "call already half-closed"

    invoke-static {v0, v2}, Lb5/n;->u(ZLjava/lang/Object;)V

    iput-boolean v1, p0, Lio/grpc/internal/p;->m:Z

    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    invoke-interface {v0}, Lio/grpc/internal/q;->n()V

    return-void
.end method

.method private static u(Li9/t;Li9/t;)Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-nez p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-virtual {p0, p1}, Li9/t;->l(Li9/t;)Z

    move-result p0

    return p0
.end method

.method private static v(Li9/t;Li9/t;Li9/t;)V
    .locals 6

    sget-object v0, Lio/grpc/internal/p;->t:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p0, :cond_2

    invoke-virtual {p0, p1}, Li9/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1}, Li9/t;->p(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    new-instance p0, Ljava/lang/StringBuilder;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v5, v2

    const-string v1, "Call timeout set to \'%d\' ns, due to context deadline."

    invoke-static {v3, v1, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p2, :cond_1

    const-string p1, " Explicit call timeout was not set."

    goto :goto_0

    :cond_1
    invoke-virtual {p2, p1}, Li9/t;->p(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide p1

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, " Explicit call timeout was \'%d\' ns."

    invoke-static {v3, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private static w(Li9/t;Li9/t;)Li9/t;
    .locals 0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {p0, p1}, Li9/t;->o(Li9/t;)Li9/t;

    move-result-object p0

    return-object p0
.end method

.method static x(Li9/y0;Li9/v;Li9/n;Z)V
    .locals 2

    sget-object v0, Lio/grpc/internal/r0;->i:Li9/y0$g;

    invoke-virtual {p0, v0}, Li9/y0;->e(Li9/y0$g;)V

    sget-object v0, Lio/grpc/internal/r0;->e:Li9/y0$g;

    invoke-virtual {p0, v0}, Li9/y0;->e(Li9/y0$g;)V

    sget-object v1, Li9/l$b;->a:Li9/l;

    if-eq p2, v1, :cond_0

    invoke-interface {p2}, Li9/n;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    :cond_0
    sget-object p2, Lio/grpc/internal/r0;->f:Li9/y0$g;

    invoke-virtual {p0, p2}, Li9/y0;->e(Li9/y0$g;)V

    invoke-static {p1}, Li9/g0;->a(Li9/v;)[B

    move-result-object p1

    array-length v0, p1

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2, p1}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lio/grpc/internal/r0;->g:Li9/y0$g;

    invoke-virtual {p0, p1}, Li9/y0;->e(Li9/y0$g;)V

    sget-object p1, Lio/grpc/internal/r0;->h:Li9/y0$g;

    invoke-virtual {p0, p1}, Li9/y0;->e(Li9/y0$g;)V

    if-eqz p3, :cond_2

    sget-object p2, Lio/grpc/internal/p;->u:[B

    invoke-virtual {p0, p1, p2}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private y()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/p;->f:Li9/r;

    iget-object v1, p0, Lio/grpc/internal/p;->o:Lio/grpc/internal/p$f;

    invoke-virtual {v0, v1}, Li9/r;->i(Li9/r$a;)V

    iget-object v0, p0, Lio/grpc/internal/p;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method private z(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, "Not started"

    invoke-static {v0, v2}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lio/grpc/internal/p;->l:Z

    xor-int/2addr v0, v1

    const-string v2, "call was cancelled"

    invoke-static {v0, v2}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lio/grpc/internal/p;->m:Z

    xor-int/2addr v0, v1

    const-string v1, "call was half-closed"

    invoke-static {v0, v1}, Lb5/n;->u(ZLjava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    instance-of v1, v0, Lio/grpc/internal/z1;

    if-eqz v1, :cond_1

    check-cast v0, Lio/grpc/internal/z1;

    invoke-virtual {v0, p1}, Lio/grpc/internal/z1;->o0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/p;->a:Li9/z0;

    invoke-virtual {v1, p1}, Li9/z0;->j(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/grpc/internal/j2;->j(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-boolean p1, p0, Lio/grpc/internal/p;->h:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    invoke-interface {p1}, Lio/grpc/internal/j2;->flush()V

    :cond_2
    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    sget-object v1, Li9/j1;->g:Li9/j1;

    const-string v2, "Client sendMessage() failed with Error"

    invoke-virtual {v1, v2}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/grpc/internal/q;->a(Li9/j1;)V

    throw p1

    :catch_1
    move-exception p1

    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    sget-object v1, Li9/j1;->g:Li9/j1;

    invoke-virtual {v1, p1}, Li9/j1;->p(Ljava/lang/Throwable;)Li9/j1;

    move-result-object p1

    const-string v1, "Failed to stream message"

    invoke-virtual {p1, v1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->a(Li9/j1;)V

    return-void
.end method


# virtual methods
.method A(Li9/o;)Lio/grpc/internal/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/o;",
            ")",
            "Lio/grpc/internal/p<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/p;->s:Li9/o;

    return-object p0
.end method

.method B(Li9/v;)Lio/grpc/internal/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/v;",
            ")",
            "Lio/grpc/internal/p<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/p;->r:Li9/v;

    return-object p0
.end method

.method C(Z)Lio/grpc/internal/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/grpc/internal/p<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iput-boolean p1, p0, Lio/grpc/internal/p;->q:Z

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    const-string v1, "ClientCall.cancel"

    invoke-static {v1, v0}, Lr9/c;->g(Ljava/lang/String;Lr9/d;)V

    :try_start_0
    invoke-direct {p0, p1, p2}, Lio/grpc/internal/p;->q(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, p1}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, p2}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    throw p1
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    const-string v1, "ClientCall.halfClose"

    invoke-static {v1, v0}, Lr9/c;->g(Ljava/lang/String;Lr9/d;)V

    :try_start_0
    invoke-direct {p0}, Lio/grpc/internal/p;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, v0}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, v2}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    throw v0
.end method

.method public c(I)V
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    const-string v1, "ClientCall.request"

    invoke-static {v1, v0}, Lr9/c;->g(Ljava/lang/String;Lr9/d;)V

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v4, "Not started"

    invoke-static {v0, v4}, Lb5/n;->u(ZLjava/lang/Object;)V

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const-string v0, "Number requested must be non-negative"

    invoke-static {v2, v0}, Lb5/n;->e(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/p;->j:Lio/grpc/internal/q;

    invoke-interface {v0, p1}, Lio/grpc/internal/j2;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, p1}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, v0}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    throw p1
.end method

.method public d(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    const-string v1, "ClientCall.sendMessage"

    invoke-static {v1, v0}, Lr9/c;->g(Ljava/lang/String;Lr9/d;)V

    :try_start_0
    invoke-direct {p0, p1}, Lio/grpc/internal/p;->z(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, p1}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, v0}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    throw p1
.end method

.method public e(Li9/g$a;Li9/y0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/g$a<",
            "TRespT;>;",
            "Li9/y0;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/p;->b:Lr9/d;

    const-string v1, "ClientCall.start"

    invoke-static {v1, v0}, Lr9/c;->g(Ljava/lang/String;Lr9/d;)V

    :try_start_0
    invoke-direct {p0, p1, p2}, Lio/grpc/internal/p;->E(Li9/g$a;Li9/y0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, p1}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lio/grpc/internal/p;->b:Lr9/d;

    invoke-static {v1, p2}, Lr9/c;->i(Ljava/lang/String;Lr9/d;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/p;->a:Li9/z0;

    const-string v2, "method"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
