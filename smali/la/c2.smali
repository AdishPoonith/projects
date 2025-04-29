.class public Lla/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lla/v1;
.implements Lla/t;
.implements Lla/k2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lla/c2$c;,
        Lla/c2$b;,
        Lla/c2$a;
    }
.end annotation


# static fields
.field private static final synthetic j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;

.field private volatile synthetic _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lla/c2;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, Lla/d2;->c()Lla/f1;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lla/d2;->d()Lla/f1;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lla/c2;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lla/c2;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method private final A(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eq v1, p1, :cond_1

    if-eq v1, p1, :cond_1

    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v1}, Ls9/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final B0(Lla/f1;)V
    .locals 2

    new-instance v0, Lla/h2;

    invoke-direct {v0}, Lla/h2;-><init>()V

    invoke-virtual {p1}, Lla/f1;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lla/p1;

    invoke-direct {v1, v0}, Lla/p1;-><init>(Lla/h2;)V

    move-object v0, v1

    :goto_0
    sget-object v1, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final C0(Lla/b2;)V
    .locals 2

    new-instance v0, Lla/h2;

    invoke-direct {v0}, Lla/h2;-><init>()V

    invoke-virtual {p1, v0}, Lkotlinx/coroutines/internal/o;->l(Lkotlinx/coroutines/internal/o;)Z

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/o;->q()Lkotlinx/coroutines/internal/o;

    move-result-object v0

    sget-object v1, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final E(Lv9/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lla/c2$a;

    invoke-static {p1}, Lw9/b;->b(Lv9/d;)Lv9/d;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lla/c2$a;-><init>(Lv9/d;Lla/c2;)V

    invoke-virtual {v0}, Lla/m;->z()V

    new-instance v1, Lla/m2;

    invoke-direct {v1, v0}, Lla/m2;-><init>(Lla/m;)V

    invoke-virtual {p0, v1}, Lla/c2;->b0(Lda/l;)Lla/c1;

    move-result-object v1

    invoke-static {v0, v1}, Lla/o;->a(Lla/l;Lla/c1;)V

    invoke-virtual {v0}, Lla/m;->w()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lv9/d;)V

    :cond_0
    return-object v0
.end method

.method private final F0(Ljava/lang/Object;)I
    .locals 4

    instance-of v0, p1, Lla/f1;

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lla/f1;

    invoke-virtual {v0}, Lla/f1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    sget-object v0, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lla/d2;->c()Lla/f1;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lla/c2;->A0()V

    return v2

    :cond_2
    instance-of v0, p1, Lla/p1;

    if-eqz v0, :cond_4

    sget-object v0, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v3, p1

    check-cast v3, Lla/p1;

    invoke-virtual {v3}, Lla/p1;->g()Lla/h2;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lla/c2;->A0()V

    return v2

    :cond_4
    return v3
.end method

.method private final G0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, Lla/c2$c;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, Lla/c2$c;

    invoke-virtual {p1}, Lla/c2$c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lla/c2$c;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lla/q1;

    if-eqz v0, :cond_3

    check-cast p1, Lla/q1;

    invoke-interface {p1}, Lla/q1;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lla/z;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method public static synthetic I0(Lla/c2;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lla/c2;->H0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final J(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/q1;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lla/c2$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lla/c2$c;

    invoke-virtual {v1}, Lla/c2$c;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lla/z;

    invoke-direct {p0, p1}, Lla/c2;->S(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lla/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    invoke-direct {p0, v0, v1}, Lla/c2;->M0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lla/d2;->b()Lkotlinx/coroutines/internal/b0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1
.end method

.method private final K(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lla/c2;->n0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, Lla/c2;->h0()Lla/r;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, Lla/i2;->j:Lla/i2;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lla/r;->k(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method private final K0(Lla/q1;Ljava/lang/Object;)Z
    .locals 2

    sget-object v0, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lla/d2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lla/c2;->y0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, Lla/c2;->z0(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lla/c2;->Q(Lla/q1;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final L0(Lla/q1;Ljava/lang/Throwable;)Z
    .locals 4

    invoke-direct {p0, p1}, Lla/c2;->d0(Lla/q1;)Lla/h2;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, Lla/c2$c;

    invoke-direct {v2, v0, v1, p2}, Lla/c2$c;-><init>(Lla/h2;ZLjava/lang/Throwable;)V

    sget-object v3, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, p1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, v0, p2}, Lla/c2;->w0(Lla/h2;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final M0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lla/q1;

    if-nez v0, :cond_0

    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lla/f1;

    if-nez v0, :cond_1

    instance-of v0, p1, Lla/b2;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Lla/s;

    if-nez v0, :cond_3

    instance-of v0, p2, Lla/z;

    if-nez v0, :cond_3

    check-cast p1, Lla/q1;

    invoke-direct {p0, p1, p2}, Lla/c2;->K0(Lla/q1;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, Lla/d2;->b()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, Lla/q1;

    invoke-direct {p0, p1, p2}, Lla/c2;->N0(Lla/q1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final N0(Lla/q1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-direct {p0, p1}, Lla/c2;->d0(Lla/q1;)Lla/h2;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lla/d2;->b()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, Lla/c2$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lla/c2$c;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_2

    new-instance v1, Lla/c2$c;

    invoke-direct {v1, v0, v3, v2}, Lla/c2$c;-><init>(Lla/h2;ZLjava/lang/Throwable;)V

    :cond_2
    new-instance v4, Lkotlin/jvm/internal/s;

    invoke-direct {v4}, Lkotlin/jvm/internal/s;-><init>()V

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Lla/c2$c;->h()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_3
    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v1, v5}, Lla/c2$c;->k(Z)V

    if-eq v1, p1, :cond_4

    sget-object v6, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v6, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {}, Lla/d2;->b()Lkotlinx/coroutines/internal/b0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-virtual {v1}, Lla/c2$c;->f()Z

    move-result v6

    instance-of v7, p2, Lla/z;

    if-eqz v7, :cond_5

    move-object v7, p2

    check-cast v7, Lla/z;

    goto :goto_1

    :cond_5
    move-object v7, v2

    :goto_1
    if-eqz v7, :cond_6

    iget-object v7, v7, Lla/z;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v7}, Lla/c2$c;->b(Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {v1}, Lla/c2$c;->e()Ljava/lang/Throwable;

    move-result-object v7

    if-nez v6, :cond_7

    const/4 v3, 0x1

    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_8

    move-object v2, v7

    :cond_8
    iput-object v2, v4, Lkotlin/jvm/internal/s;->j:Ljava/lang/Object;

    sget-object v3, Ls9/u;->a:Ls9/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    move-object v3, v2

    check-cast v3, Ljava/lang/Throwable;

    if-eqz v2, :cond_9

    invoke-direct {p0, v0, v2}, Lla/c2;->w0(Lla/h2;Ljava/lang/Throwable;)V

    :cond_9
    invoke-direct {p0, p1}, Lla/c2;->W(Lla/q1;)Lla/s;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-direct {p0, v1, p1, p2}, Lla/c2;->O0(Lla/c2$c;Lla/s;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, Lla/d2;->b:Lkotlinx/coroutines/internal/b0;

    return-object p1

    :cond_a
    invoke-direct {p0, v1, p2}, Lla/c2;->V(Lla/c2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method private final O0(Lla/c2$c;Lla/s;Ljava/lang/Object;)Z
    .locals 6

    :cond_0
    iget-object v0, p2, Lla/s;->n:Lla/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lla/c2$b;

    invoke-direct {v3, p0, p1, p2, p3}, Lla/c2$b;-><init>(Lla/c2;Lla/c2$c;Lla/s;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lla/v1$a;->d(Lla/v1;ZZLda/l;ILjava/lang/Object;)Lla/c1;

    move-result-object v0

    sget-object v1, Lla/i2;->j:Lla/i2;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-direct {p0, p2}, Lla/c2;->v0(Lkotlinx/coroutines/internal/o;)Lla/s;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method private final Q(Lla/q1;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lla/c2;->h0()Lla/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lla/c1;->b()V

    sget-object v0, Lla/i2;->j:Lla/i2;

    invoke-virtual {p0, v0}, Lla/c2;->E0(Lla/r;)V

    :cond_0
    instance-of v0, p2, Lla/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lla/z;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object v1, p2, Lla/z;->a:Ljava/lang/Throwable;

    :cond_2
    instance-of p2, p1, Lla/b2;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, Lla/b2;

    invoke-virtual {p2, v1}, Lla/b0;->A(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    new-instance v0, Lla/c0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lla/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lla/c2;->k0(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lla/q1;->g()Lla/h2;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p1, v1}, Lla/c2;->x0(Lla/h2;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private final R(Lla/c2$c;Lla/s;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p2}, Lla/c2;->v0(Lkotlinx/coroutines/internal/o;)Lla/s;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lla/c2;->O0(Lla/c2$c;Lla/s;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1, p3}, Lla/c2;->V(Lla/c2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lla/c2;->B(Ljava/lang/Object;)V

    return-void
.end method

.method private final S(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    new-instance v0, Lla/w1;

    invoke-static {p0}, Lla/c2;->s(Lla/c2;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lla/w1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lla/v1;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lla/k2;

    invoke-interface {p1}, Lla/k2;->L()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final V(Lla/c2$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lla/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lla/z;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lla/z;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lla/c2$c;->f()Z

    move-result v2

    invoke-virtual {p1, v0}, Lla/c2$c;->j(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lla/c2;->Z(Lla/c2$c;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-direct {p0, v4, v3}, Lla/c2;->A(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p1

    const/4 v3, 0x0

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    if-ne v4, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p2, Lla/z;

    const/4 v0, 0x2

    invoke-direct {p2, v4, v3, v0, v1}, Lla/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    :goto_2
    if-eqz v4, :cond_7

    invoke-direct {p0, v4}, Lla/c2;->K(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, Lla/c2;->j0(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v3, 0x1

    :cond_6
    if-eqz v3, :cond_7

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lla/z;

    invoke-virtual {v0}, Lla/z;->b()Z

    :cond_7
    if-nez v2, :cond_8

    invoke-virtual {p0, v4}, Lla/c2;->y0(Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {p0, p2}, Lla/c2;->z0(Ljava/lang/Object;)V

    sget-object v0, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lla/d2;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-direct {p0, p1, p2}, Lla/c2;->Q(Lla/q1;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method private final W(Lla/q1;)Lla/s;
    .locals 2

    instance-of v0, p1, Lla/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lla/s;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-interface {p1}, Lla/q1;->g()Lla/h2;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Lla/c2;->v0(Lkotlinx/coroutines/internal/o;)Lla/s;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_1
    return-object v1
.end method

.method private final Y(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lla/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lla/z;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, Lla/z;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method private final Z(Lla/c2$c;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/c2$c;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lla/c2$c;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lla/w1;

    invoke-static {p0}, Lla/c2;->s(Lla/c2;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lla/w1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lla/v1;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    instance-of v3, v3, Ljava/util/concurrent/CancellationException;

    xor-int/2addr v3, v2

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    instance-of v3, v0, Lla/v2;

    if-eqz v3, :cond_8

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Throwable;

    if-eq v4, v0, :cond_6

    instance-of v4, v4, Lla/v2;

    if-eqz v4, :cond_6

    const/4 v4, 0x1

    goto :goto_1

    :cond_6
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_5

    move-object v1, v3

    :cond_7
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_8

    return-object v1

    :cond_8
    return-object v0
.end method

.method private final d0(Lla/q1;)Lla/h2;
    .locals 3

    invoke-interface {p1}, Lla/q1;->g()Lla/h2;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lla/f1;

    if-eqz v0, :cond_0

    new-instance v0, Lla/h2;

    invoke-direct {v0}, Lla/h2;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lla/b2;

    if-eqz v0, :cond_1

    check-cast p1, Lla/b2;

    invoke-direct {p0, p1}, Lla/c2;->C0(Lla/b2;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State should have list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private final o0()Z
    .locals 2

    :cond_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/q1;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-direct {p0, v0}, Lla/c2;->F0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method private final p0(Lv9/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lla/m;

    invoke-static {p1}, Lw9/b;->b(Lv9/d;)Lv9/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lla/m;-><init>(Lv9/d;I)V

    invoke-virtual {v0}, Lla/m;->z()V

    new-instance v1, Lla/n2;

    invoke-direct {v1, v0}, Lla/n2;-><init>(Lv9/d;)V

    invoke-virtual {p0, v1}, Lla/c2;->b0(Lda/l;)Lla/c1;

    move-result-object v1

    invoke-static {v0, v1}, Lla/o;->a(Lla/l;Lla/c1;)V

    invoke-virtual {v0}, Lla/m;->w()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lv9/d;)V

    :cond_0
    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_1

    return-object v0

    :cond_1
    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method

.method private final q0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lla/c2$c;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, Lla/c2$c;

    invoke-virtual {v3}, Lla/c2$c;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lla/d2;->f()Lkotlinx/coroutines/internal/b0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lla/c2$c;

    invoke-virtual {v3}, Lla/c2$c;->f()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-direct {p0, p1}, Lla/c2;->S(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, Lla/c2$c;

    invoke-virtual {p1, v1}, Lla/c2$c;->b(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, Lla/c2$c;

    invoke-virtual {p1}, Lla/c2$c;->e()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-eqz v0, :cond_6

    check-cast v2, Lla/c2$c;

    invoke-virtual {v2}, Lla/c2$c;->g()Lla/h2;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lla/c2;->w0(Lla/h2;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, Lla/q1;

    if-eqz v3, :cond_b

    if-nez v1, :cond_8

    invoke-direct {p0, p1}, Lla/c2;->S(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, Lla/q1;

    invoke-interface {v3}, Lla/q1;->a()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-direct {p0, v3, v1}, Lla/c2;->L0(Lla/q1;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, Lla/z;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, Lla/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    invoke-direct {p0, v2, v3}, Lla/c2;->M0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object v4

    if-eq v3, v4, :cond_a

    invoke-static {}, Lla/d2;->b()Lkotlinx/coroutines/internal/b0;

    move-result-object v2

    if-eq v3, v2, :cond_0

    return-object v3

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot happen in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {}, Lla/d2;->f()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic s(Lla/c2;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lla/c2;->M()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final t0(Lda/l;Z)Lla/b2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;Z)",
            "Lla/b2;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    instance-of p2, p1, Lla/x1;

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Lla/x1;

    :cond_0
    if-nez v0, :cond_4

    new-instance v0, Lla/t1;

    invoke-direct {v0, p1}, Lla/t1;-><init>(Lda/l;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lla/b2;

    if-eqz p2, :cond_2

    move-object v0, p1

    check-cast v0, Lla/b2;

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lla/u1;

    invoke-direct {v0, p1}, Lla/u1;-><init>(Lda/l;)V

    :cond_4
    :goto_0
    invoke-virtual {v0, p0}, Lla/b2;->C(Lla/c2;)V

    return-object v0
.end method

.method public static final synthetic u(Lla/c2;Lla/c2$c;Lla/s;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lla/c2;->R(Lla/c2$c;Lla/s;Ljava/lang/Object;)V

    return-void
.end method

.method private final v0(Lkotlinx/coroutines/internal/o;)Lla/s;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/o;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/o;->r()Lkotlinx/coroutines/internal/o;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/o;->q()Lkotlinx/coroutines/internal/o;

    move-result-object p1

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/o;->u()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, Lla/s;

    if-eqz v0, :cond_1

    check-cast p1, Lla/s;

    return-object p1

    :cond_1
    instance-of v0, p1, Lla/h2;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final w0(Lla/h2;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p0, p2}, Lla/c2;->y0(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/o;->p()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/o;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lla/x1;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lla/b2;

    :try_start_0
    invoke-virtual {v2, p2}, Lla/b0;->A(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Ls9/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lla/c0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lla/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Ls9/u;->a:Ls9/u;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/o;->q()Lkotlinx/coroutines/internal/o;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lla/c2;->k0(Ljava/lang/Throwable;)V

    :cond_3
    invoke-direct {p0, p2}, Lla/c2;->K(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final x0(Lla/h2;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/o;->p()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/o;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lla/b2;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lla/b2;

    :try_start_0
    invoke-virtual {v2, p2}, Lla/b0;->A(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Ls9/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lla/c0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lla/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Ls9/u;->a:Ls9/u;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/o;->q()Lkotlinx/coroutines/internal/o;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lla/c2;->k0(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method private final y(Ljava/lang/Object;Lla/h2;Lla/b2;)Z
    .locals 2

    new-instance v0, Lla/c2$d;

    invoke-direct {v0, p3, p0, p1}, Lla/c2$d;-><init>(Lkotlinx/coroutines/internal/o;Lla/c2;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lkotlinx/coroutines/internal/o;->r()Lkotlinx/coroutines/internal/o;

    move-result-object p1

    invoke-virtual {p1, p3, p2, v0}, Lkotlinx/coroutines/internal/o;->z(Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o$a;)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method


# virtual methods
.method protected A0()V
    .locals 0

    return-void
.end method

.method protected B(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final D(Lv9/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/q1;

    if-nez v1, :cond_2

    instance-of p1, v0, Lla/z;

    if-nez p1, :cond_1

    invoke-static {v0}, Lla/d2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast v0, Lla/z;

    iget-object p1, v0, Lla/z;->a:Ljava/lang/Throwable;

    throw p1

    :cond_2
    invoke-direct {p0, v0}, Lla/c2;->F0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-direct {p0, p1}, Lla/c2;->E(Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final D0(Lla/b2;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/b2;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lla/d2;->c()Lla/f1;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, Lla/q1;

    if-eqz v1, :cond_3

    check-cast v0, Lla/q1;

    invoke-interface {v0}, Lla/q1;->g()Lla/h2;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/o;->v()Z

    :cond_3
    return-void
.end method

.method public final E0(Lla/r;)V
    .locals 0

    iput-object p1, p0, Lla/c2;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method public final F(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lla/c2;->G(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final G(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object v0

    invoke-virtual {p0}, Lla/c2;->c0()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lla/c2;->J(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lla/d2;->b:Lkotlinx/coroutines/internal/b0;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, Lla/c2;->q0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lla/d2;->b:Lkotlinx/coroutines/internal/b0;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lla/d2;->f()Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, Lla/c2;->B(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public final H(Lv9/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lla/c2;->o0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lv9/d;->getContext()Lv9/g;

    move-result-object p1

    invoke-static {p1}, Lla/z1;->i(Lv9/g;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lla/c2;->p0(Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method

.method protected final H0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lla/w1;

    if-nez p2, :cond_1

    invoke-static {p0}, Lla/c2;->s(Lla/c2;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lla/w1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lla/v1;)V

    :cond_2
    return-object v0
.end method

.method public I(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lla/c2;->G(Ljava/lang/Object;)Z

    return-void
.end method

.method public final J0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lla/c2;->u0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lla/c2;->G0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public L()Ljava/util/concurrent/CancellationException;
    .locals 5

    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/c2$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lla/c2$c;

    invoke-virtual {v1}, Lla/c2$c;->e()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lla/z;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lla/z;

    iget-object v1, v1, Lla/z;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lla/q1;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lla/w1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Lla/c2;->G0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lla/w1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lla/v1;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected M()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public N(Ljava/lang/Object;Lda/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lda/p<",
            "-TR;-",
            "Lv9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lla/v1$a;->b(Lla/v1;Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final O()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/c2$c;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, Lla/c2$c;

    invoke-virtual {v0}, Lla/c2$c;->e()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lla/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lla/c2;->H0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v1, v0, Lla/q1;

    if-nez v1, :cond_3

    instance-of v1, v0, Lla/z;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lla/z;

    iget-object v0, v0, Lla/z;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, Lla/c2;->I0(Lla/c2;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lla/w1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lla/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lla/w1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lla/v1;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public P(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lla/c2;->G(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lla/c2;->a0()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public T(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-instance v0, Lla/w1;

    invoke-static {p0}, Lla/c2;->s(Lla/c2;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lla/w1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lla/v1;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0, p1}, Lla/c2;->I(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final U(Lla/t;)Lla/r;
    .locals 6

    new-instance v3, Lla/s;

    invoke-direct {v3, p1}, Lla/s;-><init>(Lla/t;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lla/v1$a;->d(Lla/v1;ZZLda/l;ILjava/lang/Object;)Lla/c1;

    move-result-object p1

    check-cast p1, Lla/r;

    return-object p1
.end method

.method public final X()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/q1;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    instance-of v1, v0, Lla/z;

    if-nez v1, :cond_0

    invoke-static {v0}, Lla/d2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Lla/z;

    iget-object v0, v0, Lla/z;->a:Ljava/lang/Throwable;

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()Z
    .locals 2

    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/q1;

    if-eqz v1, :cond_0

    check-cast v0, Lla/q1;

    invoke-interface {v0}, Lla/q1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Lv9/g$c;)Lv9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lv9/g$b;",
            ">(",
            "Lv9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lla/v1$a;->c(Lla/v1;Lv9/g$c;)Lv9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final b0(Lda/l;)Lla/c1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)",
            "Lla/c1;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1}, Lla/c2;->v(ZZLda/l;)Lla/c1;

    move-result-object p1

    return-object p1
.end method

.method public c0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f0(Lv9/g$c;)Lv9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/g$c<",
            "*>;)",
            "Lv9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lla/v1$a;->e(Lla/v1;Lv9/g$c;)Lv9/g;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lv9/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv9/g$c<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lla/v1;->g:Lla/v1$b;

    return-object v0
.end method

.method public final h0()Lla/r;
    .locals 1

    iget-object v0, p0, Lla/c2;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Lla/r;

    return-object v0
.end method

.method public final i0()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, Lla/c2;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lkotlinx/coroutines/internal/w;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lkotlinx/coroutines/internal/w;

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/w;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected j0(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public k0(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method protected final l0(Lla/v1;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lla/i2;->j:Lla/i2;

    invoke-virtual {p0, p1}, Lla/c2;->E0(Lla/r;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lla/v1;->start()Z

    invoke-interface {p1, p0}, Lla/v1;->U(Lla/t;)Lla/r;

    move-result-object p1

    invoke-virtual {p0, p1}, Lla/c2;->E0(Lla/r;)V

    invoke-virtual {p0}, Lla/c2;->m0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lla/c1;->b()V

    sget-object p1, Lla/i2;->j:Lla/i2;

    invoke-virtual {p0, p1}, Lla/c2;->E0(Lla/r;)V

    :cond_1
    return-void
.end method

.method public final m0()Z
    .locals 1

    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lla/q1;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected n0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final q(Lla/k2;)V
    .locals 0

    invoke-virtual {p0, p1}, Lla/c2;->G(Ljava/lang/Object;)Z

    return-void
.end method

.method public r(Lv9/g;)Lv9/g;
    .locals 0

    invoke-static {p0, p1}, Lla/v1$a;->f(Lla/v1;Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1
.end method

.method public final r0(Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lla/c2;->M0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, Lla/d2;->b:Lkotlinx/coroutines/internal/b0;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    invoke-static {}, Lla/d2;->b()Lkotlinx/coroutines/internal/b0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lla/c2;->B(Ljava/lang/Object;)V

    return v2
.end method

.method public final s0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lla/c2;->M0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lla/d2;->a()Lkotlinx/coroutines/internal/b0;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lla/d2;->b()Lkotlinx/coroutines/internal/b0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lla/c2;->Y(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final start()Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lla/c2;->F0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lla/c2;->J0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lla/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u0()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lla/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(ZZLda/l;)Lla/c1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)",
            "Lla/c1;"
        }
    .end annotation

    invoke-direct {p0, p3, p1}, Lla/c2;->t0(Lda/l;Z)Lla/b2;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lla/f1;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Lla/f1;

    invoke-virtual {v2}, Lla/f1;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, Lla/c2;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-direct {p0, v2}, Lla/c2;->B0(Lla/f1;)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Lla/q1;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    move-object v2, v1

    check-cast v2, Lla/q1;

    invoke-interface {v2}, Lla/q1;->g()Lla/h2;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lla/b2;

    invoke-direct {p0, v1}, Lla/c2;->C0(Lla/b2;)V

    goto :goto_0

    :cond_3
    sget-object v4, Lla/i2;->j:Lla/i2;

    if-eqz p1, :cond_8

    instance-of v5, v1, Lla/c2$c;

    if-eqz v5, :cond_8

    monitor-enter v1

    :try_start_0
    move-object v3, v1

    check-cast v3, Lla/c2$c;

    invoke-virtual {v3}, Lla/c2$c;->e()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4

    instance-of v5, p3, Lla/s;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, Lla/c2$c;

    invoke-virtual {v5}, Lla/c2$c;->h()Z

    move-result v5

    if-nez v5, :cond_7

    :cond_4
    invoke-direct {p0, v1, v2, v0}, Lla/c2;->y(Ljava/lang/Object;Lla/h2;Lla/b2;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    monitor-exit v1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    monitor-exit v1

    return-object v0

    :cond_6
    move-object v4, v0

    :cond_7
    :try_start_1
    sget-object v5, Ls9/u;->a:Ls9/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_1
    if-eqz v3, :cond_a

    if-eqz p2, :cond_9

    invoke-interface {p3, v3}, Lda/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object v4

    :cond_a
    invoke-direct {p0, v1, v2, v0}, Lla/c2;->y(Ljava/lang/Object;Lla/h2;Lla/b2;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_b
    if-eqz p2, :cond_e

    instance-of p1, v1, Lla/z;

    if-eqz p1, :cond_c

    check-cast v1, Lla/z;

    goto :goto_2

    :cond_c
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_d

    iget-object v3, v1, Lla/z;->a:Ljava/lang/Throwable;

    :cond_d
    invoke-interface {p3, v3}, Lda/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    sget-object p1, Lla/i2;->j:Lla/i2;

    return-object p1
.end method

.method public final w()Lja/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lja/b<",
            "Lla/v1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lla/c2$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lla/c2$e;-><init>(Lla/c2;Lv9/d;)V

    invoke-static {v0}, Lja/e;->b(Lda/p;)Lja/b;

    move-result-object v0

    return-object v0
.end method

.method public final x()Ljava/lang/Throwable;
    .locals 2

    invoke-virtual {p0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/q1;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lla/c2;->Y(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected y0(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method protected z0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
