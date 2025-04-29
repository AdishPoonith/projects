.class Lio/grpc/internal/a0$e;
.super Lio/grpc/internal/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field private final j:Li9/r0$f;

.field private final k:Li9/r;

.field private final l:[Li9/k;

.field final synthetic m:Lio/grpc/internal/a0;


# direct methods
.method private constructor <init>(Lio/grpc/internal/a0;Li9/r0$f;[Li9/k;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-direct {p0}, Lio/grpc/internal/b0;-><init>()V

    invoke-static {}, Li9/r;->e()Li9/r;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/a0$e;->k:Li9/r;

    iput-object p2, p0, Lio/grpc/internal/a0$e;->j:Li9/r0$f;

    iput-object p3, p0, Lio/grpc/internal/a0$e;->l:[Li9/k;

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/a0;Li9/r0$f;[Li9/k;Lio/grpc/internal/a0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/grpc/internal/a0$e;-><init>(Lio/grpc/internal/a0;Li9/r0$f;[Li9/k;)V

    return-void
.end method

.method static synthetic A(Lio/grpc/internal/a0$e;Lio/grpc/internal/s;)Ljava/lang/Runnable;
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/a0$e;->B(Lio/grpc/internal/s;)Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method private B(Lio/grpc/internal/s;)Ljava/lang/Runnable;
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/a0$e;->k:Li9/r;

    invoke-virtual {v0}, Li9/r;->b()Li9/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/a0$e;->j:Li9/r0$f;

    invoke-virtual {v1}, Li9/r0$f;->c()Li9/z0;

    move-result-object v1

    iget-object v2, p0, Lio/grpc/internal/a0$e;->j:Li9/r0$f;

    invoke-virtual {v2}, Li9/r0$f;->b()Li9/y0;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/a0$e;->j:Li9/r0$f;

    invoke-virtual {v3}, Li9/r0$f;->a()Li9/c;

    move-result-object v3

    iget-object v4, p0, Lio/grpc/internal/a0$e;->l:[Li9/k;

    invoke-interface {p1, v1, v2, v3, v4}, Lio/grpc/internal/s;->a(Li9/z0;Li9/y0;Li9/c;[Li9/k;)Lio/grpc/internal/q;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lio/grpc/internal/a0$e;->k:Li9/r;

    invoke-virtual {v1, v0}, Li9/r;->f(Li9/r;)V

    invoke-virtual {p0, p1}, Lio/grpc/internal/b0;->x(Lio/grpc/internal/q;)Ljava/lang/Runnable;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v1, p0, Lio/grpc/internal/a0$e;->k:Li9/r;

    invoke-virtual {v1, v0}, Li9/r;->f(Li9/r;)V

    throw p1
.end method

.method static synthetic y(Lio/grpc/internal/a0$e;)[Li9/k;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/a0$e;->l:[Li9/k;

    return-object p0
.end method

.method static synthetic z(Lio/grpc/internal/a0$e;)Li9/r0$f;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/a0$e;->j:Li9/r0$f;

    return-object p0
.end method


# virtual methods
.method public a(Li9/j1;)V
    .locals 2

    invoke-super {p0, p1}, Lio/grpc/internal/b0;->a(Li9/j1;)V

    iget-object p1, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {p1}, Lio/grpc/internal/a0;->i(Lio/grpc/internal/a0;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {v0}, Lio/grpc/internal/a0;->j(Lio/grpc/internal/a0;)Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {v0}, Lio/grpc/internal/a0;->l(Lio/grpc/internal/a0;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-virtual {v1}, Lio/grpc/internal/a0;->q()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {v0}, Lio/grpc/internal/a0;->n(Lio/grpc/internal/a0;)Li9/n1;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {v1}, Lio/grpc/internal/a0;->m(Lio/grpc/internal/a0;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Li9/n1;->b(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {v0}, Lio/grpc/internal/a0;->e(Lio/grpc/internal/a0;)Li9/j1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {v0}, Lio/grpc/internal/a0;->n(Lio/grpc/internal/a0;)Li9/n1;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {v1}, Lio/grpc/internal/a0;->j(Lio/grpc/internal/a0;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Li9/n1;->b(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/a0;->k(Lio/grpc/internal/a0;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lio/grpc/internal/a0$e;->m:Lio/grpc/internal/a0;

    invoke-static {p1}, Lio/grpc/internal/a0;->n(Lio/grpc/internal/a0;)Li9/n1;

    move-result-object p1

    invoke-virtual {p1}, Li9/n1;->a()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public l(Lio/grpc/internal/x0;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/a0$e;->j:Li9/r0$f;

    invoke-virtual {v0}, Li9/r0$f;->a()Li9/c;

    move-result-object v0

    invoke-virtual {v0}, Li9/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "wait_for_ready"

    invoke-virtual {p1, v0}, Lio/grpc/internal/x0;->a(Ljava/lang/Object;)Lio/grpc/internal/x0;

    :cond_0
    invoke-super {p0, p1}, Lio/grpc/internal/b0;->l(Lio/grpc/internal/x0;)V

    return-void
.end method

.method protected v(Li9/j1;)V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/a0$e;->l:[Li9/k;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Li9/m1;->i(Li9/j1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
