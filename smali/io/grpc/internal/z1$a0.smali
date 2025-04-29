.class final Lio/grpc/internal/z1$a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a0"
.end annotation


# instance fields
.field final a:Lio/grpc/internal/z1$b0;

.field final synthetic b:Lio/grpc/internal/z1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lio/grpc/internal/z1;Lio/grpc/internal/z1$b0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    return-void
.end method

.method private e(Li9/y0;)Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lio/grpc/internal/z1;->B:Li9/y0$g;

    invoke-virtual {p1, v0}, Li9/y0;->g(Li9/y0$g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private f(Li9/j1;Li9/y0;)Lio/grpc/internal/z1$v;
    .locals 4

    invoke-direct {p0, p2}, Lio/grpc/internal/z1$a0;->e(Li9/y0;)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->b0(Lio/grpc/internal/z1;)Lio/grpc/internal/t0;

    move-result-object v0

    iget-object v0, v0, Lio/grpc/internal/t0;->c:Ljava/util/Set;

    invoke-virtual {p1}, Li9/j1;->m()Li9/j1$b;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1}, Lio/grpc/internal/z1;->Z(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$c0;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gez v1, :cond_1

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1}, Lio/grpc/internal/z1;->Z(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$c0;

    move-result-object v1

    invoke-virtual {v1}, Lio/grpc/internal/z1$c0;->b()Z

    move-result v1

    xor-int/2addr v1, v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-instance v3, Lio/grpc/internal/z1$v;

    if-nez p1, :cond_2

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-direct {v3, v0, p2}, Lio/grpc/internal/z1$v;-><init>(ZLjava/lang/Integer;)V

    return-object v3
.end method

.method private g(Li9/j1;Li9/y0;)Lio/grpc/internal/z1$x;
    .locals 9

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->H(Lio/grpc/internal/z1;)Lio/grpc/internal/a2;

    move-result-object v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    new-instance p1, Lio/grpc/internal/z1$x;

    invoke-direct {p1, v3, v1, v2}, Lio/grpc/internal/z1$x;-><init>(ZJ)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->H(Lio/grpc/internal/z1;)Lio/grpc/internal/a2;

    move-result-object v0

    iget-object v0, v0, Lio/grpc/internal/a2;->f:Ljava/util/Set;

    invoke-virtual {p1}, Li9/j1;->m()Li9/j1$b;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-direct {p0, p2}, Lio/grpc/internal/z1$a0;->e(Li9/y0;)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Z(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$c0;

    move-result-object v0

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Z(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$c0;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/z1$c0;->b()Z

    move-result v0

    xor-int/2addr v0, v4

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v5, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v5}, Lio/grpc/internal/z1;->H(Lio/grpc/internal/z1;)Lio/grpc/internal/a2;

    move-result-object v5

    iget v5, v5, Lio/grpc/internal/a2;->a:I

    iget-object v6, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    iget v6, v6, Lio/grpc/internal/z1$b0;->d:I

    add-int/2addr v6, v4

    if-le v5, v6, :cond_4

    if-nez v0, :cond_4

    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p1}, Lio/grpc/internal/z1;->L(Lio/grpc/internal/z1;)J

    move-result-wide p1

    long-to-double p1, p1

    invoke-static {}, Lio/grpc/internal/z1;->N()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v0

    mul-double p1, p1, v0

    double-to-long v1, p1

    iget-object p1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p1}, Lio/grpc/internal/z1;->L(Lio/grpc/internal/z1;)J

    move-result-wide v5

    long-to-double v5, v5

    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->H(Lio/grpc/internal/z1;)Lio/grpc/internal/a2;

    move-result-object p2

    iget-wide v7, p2, Lio/grpc/internal/a2;->d:D

    mul-double v5, v5, v7

    double-to-long v5, v5

    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->H(Lio/grpc/internal/z1;)Lio/grpc/internal/a2;

    move-result-object p2

    iget-wide v7, p2, Lio/grpc/internal/a2;->c:J

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ltz p1, :cond_4

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    iget-object p1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p1}, Lio/grpc/internal/z1;->H(Lio/grpc/internal/z1;)Lio/grpc/internal/a2;

    move-result-object p2

    iget-wide v5, p2, Lio/grpc/internal/a2;->b:J

    :goto_1
    invoke-static {p1, v5, v6}, Lio/grpc/internal/z1;->M(Lio/grpc/internal/z1;J)J

    const/4 v3, 0x1

    :cond_4
    new-instance p1, Lio/grpc/internal/z1$x;

    invoke-direct {p1, v3, v1, v2}, Lio/grpc/internal/z1$x;-><init>(ZJ)V

    return-object p1
.end method


# virtual methods
.method public a(Lio/grpc/internal/k2$a;)V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v0

    iget-object v1, v0, Lio/grpc/internal/z1$z;->f:Lio/grpc/internal/z1$b0;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Headers should be received prior to messages."

    invoke-static {v1, v2}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-object v0, v0, Lio/grpc/internal/z1$z;->f:Lio/grpc/internal/z1$b0;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->y(Lio/grpc/internal/z1;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/z1$a0$d;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/z1$a0$d;-><init>(Lio/grpc/internal/z1$a0;Lio/grpc/internal/k2$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-virtual {v0}, Lio/grpc/internal/z1;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->y(Lio/grpc/internal/z1;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/z1$a0$e;

    invoke-direct {v1, p0}, Lio/grpc/internal/z1$a0$e;-><init>(Lio/grpc/internal/z1$a0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->X(Lio/grpc/internal/z1;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    invoke-virtual {v2, v3}, Lio/grpc/internal/z1$z;->g(Lio/grpc/internal/z1$b0;)Lio/grpc/internal/z1$z;

    move-result-object v2

    invoke-static {v1, v2}, Lio/grpc/internal/z1;->S(Lio/grpc/internal/z1;Lio/grpc/internal/z1$z;)Lio/grpc/internal/z1$z;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1}, Lio/grpc/internal/z1;->z(Lio/grpc/internal/z1;)Lio/grpc/internal/x0;

    move-result-object v1

    invoke-virtual {p1}, Li9/j1;->m()Li9/j1$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/grpc/internal/x0;->a(Ljava/lang/Object;)Lio/grpc/internal/x0;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->A(Lio/grpc/internal/z1;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p1}, Lio/grpc/internal/z1;->B(Lio/grpc/internal/z1;)Li9/j1;

    move-result-object p2

    sget-object p3, Lio/grpc/internal/r$a;->j:Lio/grpc/internal/r$a;

    new-instance v0, Li9/y0;

    invoke-direct {v0}, Li9/y0;-><init>()V

    invoke-static {p1, p2, p3, v0}, Lio/grpc/internal/z1;->C(Lio/grpc/internal/z1;Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    iget-boolean v1, v0, Lio/grpc/internal/z1$b0;->c:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1, v0}, Lio/grpc/internal/z1;->x(Lio/grpc/internal/z1;Lio/grpc/internal/z1$b0;)V

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v0

    iget-object v0, v0, Lio/grpc/internal/z1$z;->f:Lio/grpc/internal/z1$b0;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0, p1, p2, p3}, Lio/grpc/internal/z1;->C(Lio/grpc/internal/z1;Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V

    :cond_1
    return-void

    :cond_2
    sget-object v0, Lio/grpc/internal/r$a;->m:Lio/grpc/internal/r$a;

    if-ne p2, v0, :cond_4

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1}, Lio/grpc/internal/z1;->E(Lio/grpc/internal/z1;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    const/16 v2, 0x3e8

    if-le v1, v2, :cond_4

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    invoke-static {v0, v1}, Lio/grpc/internal/z1;->x(Lio/grpc/internal/z1;Lio/grpc/internal/z1$b0;)V

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v0

    iget-object v0, v0, Lio/grpc/internal/z1$z;->f:Lio/grpc/internal/z1$b0;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    if-ne v0, v1, :cond_3

    sget-object v0, Li9/j1;->t:Li9/j1;

    const-string v1, "Too many transparent retries. Might be a bug in gRPC"

    invoke-virtual {v0, v1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object v0

    invoke-virtual {p1}, Li9/j1;->d()Li9/l1;

    move-result-object p1

    invoke-virtual {v0, p1}, Li9/j1;->p(Ljava/lang/Throwable;)Li9/j1;

    move-result-object p1

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0, p1, p2, p3}, Lio/grpc/internal/z1;->C(Lio/grpc/internal/z1;Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V

    :cond_3
    return-void

    :cond_4
    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v1

    iget-object v1, v1, Lio/grpc/internal/z1$z;->f:Lio/grpc/internal/z1$b0;

    if-nez v1, :cond_12

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_c

    sget-object v0, Lio/grpc/internal/r$a;->k:Lio/grpc/internal/r$a;

    if-ne p2, v0, :cond_5

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->F(Lio/grpc/internal/z1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object v0, Lio/grpc/internal/r$a;->l:Lio/grpc/internal/r$a;

    if-ne p2, v0, :cond_6

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->G(Lio/grpc/internal/z1;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->I(Lio/grpc/internal/z1;)V

    goto/16 :goto_2

    :cond_6
    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->F(Lio/grpc/internal/z1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->G(Lio/grpc/internal/z1;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-direct {p0, p1, p3}, Lio/grpc/internal/z1$a0;->f(Li9/j1;Li9/y0;)Lio/grpc/internal/z1$v;

    move-result-object v0

    iget-boolean v1, v0, Lio/grpc/internal/z1$v;->a:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    iget-object v2, v0, Lio/grpc/internal/z1$v;->b:Ljava/lang/Integer;

    invoke-static {v1, v2}, Lio/grpc/internal/z1;->J(Lio/grpc/internal/z1;Ljava/lang/Integer;)V

    :cond_7
    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1}, Lio/grpc/internal/z1;->X(Lio/grpc/internal/z1;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_1
    iget-object v1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v1}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v2

    iget-object v4, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    invoke-virtual {v2, v4}, Lio/grpc/internal/z1$z;->e(Lio/grpc/internal/z1$b0;)Lio/grpc/internal/z1$z;

    move-result-object v2

    invoke-static {v1, v2}, Lio/grpc/internal/z1;->S(Lio/grpc/internal/z1;Lio/grpc/internal/z1$z;)Lio/grpc/internal/z1$z;

    iget-boolean v0, v0, Lio/grpc/internal/z1$v;->a:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v1

    invoke-static {v0, v1}, Lio/grpc/internal/z1;->Y(Lio/grpc/internal/z1;Lio/grpc/internal/z1$z;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v0

    iget-object v0, v0, Lio/grpc/internal/z1$z;->d:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    monitor-exit v3

    return-void

    :cond_9
    monitor-exit v3

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_a
    invoke-direct {p0, p1, p3}, Lio/grpc/internal/z1$a0;->g(Li9/j1;Li9/y0;)Lio/grpc/internal/z1$x;

    move-result-object v0

    iget-boolean v3, v0, Lio/grpc/internal/z1$x;->a:Z

    if-eqz v3, :cond_12

    iget-object p1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    iget-object p2, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    iget p2, p2, Lio/grpc/internal/z1$b0;->d:I

    add-int/2addr p2, v2

    invoke-static {p1, p2, v1}, Lio/grpc/internal/z1;->W(Lio/grpc/internal/z1;IZ)Lio/grpc/internal/z1$b0;

    move-result-object p1

    if-nez p1, :cond_b

    return-void

    :cond_b
    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->X(Lio/grpc/internal/z1;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_2
    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    new-instance p3, Lio/grpc/internal/z1$u;

    invoke-static {p2}, Lio/grpc/internal/z1;->X(Lio/grpc/internal/z1;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p3, v2}, Lio/grpc/internal/z1$u;-><init>(Ljava/lang/Object;)V

    invoke-static {p2, p3}, Lio/grpc/internal/z1;->K(Lio/grpc/internal/z1;Lio/grpc/internal/z1$u;)Lio/grpc/internal/z1$u;

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->s(Lio/grpc/internal/z1;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    new-instance v1, Lio/grpc/internal/z1$a0$b;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/z1$a0$b;-><init>(Lio/grpc/internal/z1$a0;Lio/grpc/internal/z1$b0;)V

    iget-wide v2, v0, Lio/grpc/internal/z1$x;->b:J

    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p2, v1, v2, v3, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-virtual {p3, p1}, Lio/grpc/internal/z1$u;->c(Ljava/util/concurrent/Future;)V

    return-void

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_c
    :goto_0
    iget-object p1, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    iget-object p2, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    iget p2, p2, Lio/grpc/internal/z1$b0;->d:I

    invoke-static {p1, p2, v2}, Lio/grpc/internal/z1;->W(Lio/grpc/internal/z1;IZ)Lio/grpc/internal/z1$b0;

    move-result-object p1

    if-nez p1, :cond_d

    return-void

    :cond_d
    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->G(Lio/grpc/internal/z1;)Z

    move-result p2

    if-eqz p2, :cond_f

    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->X(Lio/grpc/internal/z1;)Ljava/lang/Object;

    move-result-object p2

    monitor-enter p2

    :try_start_4
    iget-object p3, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p3}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v0

    iget-object v3, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    invoke-virtual {v0, v3, p1}, Lio/grpc/internal/z1$z;->f(Lio/grpc/internal/z1$b0;Lio/grpc/internal/z1$b0;)Lio/grpc/internal/z1$z;

    move-result-object v0

    invoke-static {p3, v0}, Lio/grpc/internal/z1;->S(Lio/grpc/internal/z1;Lio/grpc/internal/z1$z;)Lio/grpc/internal/z1$z;

    iget-object p3, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p3}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v0

    invoke-static {p3, v0}, Lio/grpc/internal/z1;->Y(Lio/grpc/internal/z1;Lio/grpc/internal/z1$z;)Z

    move-result p3

    if-nez p3, :cond_e

    iget-object p3, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p3}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object p3

    iget-object p3, p3, Lio/grpc/internal/z1$z;->d:Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result p3

    if-ne p3, v2, :cond_e

    const/4 v1, 0x1

    :cond_e
    monitor-exit p2

    if-eqz v1, :cond_11

    goto :goto_1

    :catchall_2
    move-exception p1

    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    :cond_f
    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->H(Lio/grpc/internal/z1;)Lio/grpc/internal/a2;

    move-result-object p2

    if-eqz p2, :cond_10

    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->H(Lio/grpc/internal/z1;)Lio/grpc/internal/a2;

    move-result-object p2

    iget p2, p2, Lio/grpc/internal/a2;->a:I

    if-ne p2, v2, :cond_11

    :cond_10
    :goto_1
    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2, p1}, Lio/grpc/internal/z1;->x(Lio/grpc/internal/z1;Lio/grpc/internal/z1$b0;)V

    :cond_11
    iget-object p2, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {p2}, Lio/grpc/internal/z1;->v(Lio/grpc/internal/z1;)Ljava/util/concurrent/Executor;

    move-result-object p2

    new-instance p3, Lio/grpc/internal/z1$a0$c;

    invoke-direct {p3, p0, p1}, Lio/grpc/internal/z1$a0$c;-><init>(Lio/grpc/internal/z1$a0;Lio/grpc/internal/z1$b0;)V

    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_12
    :goto_2
    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    invoke-static {v0, v1}, Lio/grpc/internal/z1;->x(Lio/grpc/internal/z1;Lio/grpc/internal/z1$b0;)V

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v0

    iget-object v0, v0, Lio/grpc/internal/z1$z;->f:Lio/grpc/internal/z1$b0;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    if-ne v0, v1, :cond_13

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0, p1, p2, p3}, Lio/grpc/internal/z1;->C(Lio/grpc/internal/z1;Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V

    :cond_13
    return-void

    :catchall_3
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw p1
.end method

.method public d(Li9/y0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    invoke-static {v0, v1}, Lio/grpc/internal/z1;->x(Lio/grpc/internal/z1;Lio/grpc/internal/z1$b0;)V

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Q(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$z;

    move-result-object v0

    iget-object v0, v0, Lio/grpc/internal/z1$z;->f:Lio/grpc/internal/z1$b0;

    iget-object v1, p0, Lio/grpc/internal/z1$a0;->a:Lio/grpc/internal/z1$b0;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Z(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$c0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->Z(Lio/grpc/internal/z1;)Lio/grpc/internal/z1$c0;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/z1$c0;->c()V

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/z1$a0;->b:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->y(Lio/grpc/internal/z1;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/z1$a0$a;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/z1$a0$a;-><init>(Lio/grpc/internal/z1$a0;Li9/y0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
