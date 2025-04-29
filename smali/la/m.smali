.class public Lla/m;
.super Lla/x0;
.source "SourceFile"

# interfaces
.implements Lla/l;
.implements Lkotlin/coroutines/jvm/internal/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lla/x0<",
        "TT;>;",
        "Lla/l<",
        "TT;>;",
        "Lkotlin/coroutines/jvm/internal/e;"
    }
.end annotation


# static fields
.field private static final synthetic p:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final synthetic q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decision:I

.field private volatile synthetic _state:Ljava/lang/Object;

.field private final m:Lv9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final n:Lv9/g;

.field private o:Lla/c1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lla/m;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lla/m;->p:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v0, Lla/m;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lv9/d;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "-TT;>;I)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lla/x0;-><init>(I)V

    iput-object p1, p0, Lla/m;->m:Lv9/d;

    invoke-interface {p1}, Lv9/d;->getContext()Lv9/g;

    move-result-object p1

    iput-object p1, p0, Lla/m;->n:Lv9/g;

    const/4 p1, 0x0

    iput p1, p0, Lla/m;->_decision:I

    sget-object p1, Lla/d;->j:Lla/d;

    iput-object p1, p0, Lla/m;->_state:Ljava/lang/Object;

    return-void
.end method

.method private final A()Lla/c1;
    .locals 7

    invoke-virtual {p0}, Lla/m;->getContext()Lv9/g;

    move-result-object v0

    sget-object v1, Lla/v1;->g:Lla/v1$b;

    invoke-interface {v0, v1}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lla/v1;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    new-instance v4, Lla/q;

    invoke-direct {v4, p0}, Lla/q;-><init>(Lla/m;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lla/v1$a;->d(Lla/v1;ZZLda/l;ILjava/lang/Object;)Lla/c1;

    move-result-object v0

    iput-object v0, p0, Lla/m;->o:Lla/c1;

    return-object v0
.end method

.method private final C()Z
    .locals 1

    iget v0, p0, Lla/x0;->l:I

    invoke-static {v0}, Lla/y0;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lla/m;->m:Lv9/d;

    check-cast v0, Lkotlinx/coroutines/internal/f;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/f;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final D(Lda/l;)Lla/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)",
            "Lla/j;"
        }
    .end annotation

    instance-of v0, p1, Lla/j;

    if-eqz v0, :cond_0

    check-cast p1, Lla/j;

    goto :goto_0

    :cond_0
    new-instance v0, Lla/s1;

    invoke-direct {v0, p1}, Lla/s1;-><init>(Lda/l;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method private final E(Lda/l;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final H()V
    .locals 2

    iget-object v0, p0, Lla/m;->m:Lv9/d;

    instance-of v1, v0, Lkotlinx/coroutines/internal/f;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/internal/f;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/f;->t(Lla/l;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lla/m;->s()V

    invoke-virtual {p0, v0}, Lla/m;->g(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method private final J(Ljava/lang/Object;ILda/l;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)V"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lla/m;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lla/j2;

    if-eqz v1, :cond_1

    move-object v3, v0

    check-cast v3, Lla/j2;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lla/m;->L(Lla/j2;Ljava/lang/Object;ILda/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lla/m;->t()V

    invoke-direct {p0, p2}, Lla/m;->u(I)V

    return-void

    :cond_1
    instance-of p2, v0, Lla/p;

    if-eqz p2, :cond_3

    check-cast v0, Lla/p;

    invoke-virtual {v0}, Lla/p;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    iget-object p1, v0, Lla/z;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p1}, Lla/m;->q(Lda/l;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0, p1}, Lla/m;->l(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Ls9/e;

    invoke-direct {p1}, Ls9/e;-><init>()V

    throw p1
.end method

.method static synthetic K(Lla/m;Ljava/lang/Object;ILda/l;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lla/m;->J(Ljava/lang/Object;ILda/l;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final L(Lla/j2;Ljava/lang/Object;ILda/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/j2;",
            "Ljava/lang/Object;",
            "I",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lla/z;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p3}, Lla/y0;->b(I)Z

    move-result p3

    if-nez p3, :cond_1

    if-nez p5, :cond_1

    goto :goto_1

    :cond_1
    if-nez p4, :cond_3

    instance-of p3, p1, Lla/j;

    if-eqz p3, :cond_2

    instance-of p3, p1, Lla/f;

    if-eqz p3, :cond_3

    :cond_2
    if-eqz p5, :cond_5

    :cond_3
    new-instance p3, Lla/y;

    instance-of v0, p1, Lla/j;

    if-eqz v0, :cond_4

    check-cast p1, Lla/j;

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p3

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, Lla/y;-><init>(Ljava/lang/Object;Lla/j;Lda/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/g;)V

    move-object p2, p3

    :cond_5
    :goto_1
    return-object p2
.end method

.method private final M()Z
    .locals 4

    :cond_0
    iget v0, p0, Lla/m;->_decision:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, Lla/m;->p:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method private final N(Ljava/lang/Object;Ljava/lang/Object;Lda/l;)Lkotlinx/coroutines/internal/b0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)",
            "Lkotlinx/coroutines/internal/b0;"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lla/m;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lla/j2;

    if-eqz v1, :cond_1

    move-object v3, v0

    check-cast v3, Lla/j2;

    iget v5, p0, Lla/x0;->l:I

    move-object v2, p0

    move-object v4, p1

    move-object v6, p3

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lla/m;->L(Lla/j2;Ljava/lang/Object;ILda/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lla/m;->t()V

    sget-object p1, Lla/n;->a:Lkotlinx/coroutines/internal/b0;

    return-object p1

    :cond_1
    instance-of p1, v0, Lla/y;

    const/4 p3, 0x0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    check-cast v0, Lla/y;

    iget-object p1, v0, Lla/y;->d:Ljava/lang/Object;

    if-ne p1, p2, :cond_2

    sget-object p3, Lla/n;->a:Lkotlinx/coroutines/internal/b0;

    :cond_2
    return-object p3
.end method

.method private final O()Z
    .locals 3

    :cond_0
    iget v0, p0, Lla/m;->_decision:I

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, Lla/m;->p:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already resumed, but proposed with update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final m(Lda/l;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lda/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lla/m;->getContext()Lv9/g;

    move-result-object p2

    new-instance v0, Lla/c0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lla/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lla/j0;->a(Lv9/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private final r(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-direct {p0}, Lla/m;->C()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lla/m;->m:Lv9/d;

    check-cast v0, Lkotlinx/coroutines/internal/f;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/f;->r(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method private final t()V
    .locals 1

    invoke-direct {p0}, Lla/m;->C()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lla/m;->s()V

    :cond_0
    return-void
.end method

.method private final u(I)V
    .locals 1

    invoke-direct {p0}, Lla/m;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, Lla/y0;->a(Lla/x0;I)V

    return-void
.end method

.method private final y()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lla/m;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/j2;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lla/p;

    if-eqz v0, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method


# virtual methods
.method public B()Z
    .locals 1

    invoke-virtual {p0}, Lla/m;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lla/j2;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected F()Ljava/lang/String;
    .locals 1

    const-string v0, "CancellableContinuation"

    return-object v0
.end method

.method public final G(Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0, p1}, Lla/m;->r(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lla/m;->g(Ljava/lang/Throwable;)Z

    invoke-direct {p0}, Lla/m;->t()V

    return-void
.end method

.method public final I()Z
    .locals 3

    iget-object v0, p0, Lla/m;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lla/y;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lla/y;

    iget-object v0, v0, Lla/y;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lla/m;->s()V

    return v2

    :cond_0
    iput v2, p0, Lla/m;->_decision:I

    sget-object v0, Lla/d;->j:Lla/d;

    iput-object v0, p0, Lla/m;->_state:Ljava/lang/Object;

    const/4 v0, 0x1

    return v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 10

    :cond_0
    iget-object p1, p0, Lla/m;->_state:Ljava/lang/Object;

    instance-of v0, p1, Lla/j2;

    if-nez v0, :cond_4

    instance-of v0, p1, Lla/z;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p1, Lla/y;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lla/y;

    invoke-virtual {v0}, Lla/y;->c()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v1, v0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lla/y;->b(Lla/y;Ljava/lang/Object;Lla/j;Lda/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lla/y;

    move-result-object v1

    sget-object v2, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p0, p2}, Lla/y;->d(Lla/m;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    sget-object v8, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v9, Lla/y;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v0, v9

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Lla/y;-><init>(Ljava/lang/Object;Lla/j;Lda/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/g;)V

    invoke-static {v8, p0, p1, v9}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not completed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lv9/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv9/d<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lla/m;->m:Lv9/d;

    return-object v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lla/m;->N(Ljava/lang/Object;Ljava/lang/Object;Lda/l;)Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;Lda/l;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lla/m;->N(Ljava/lang/Object;Ljava/lang/Object;Lda/l;)Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    invoke-super {p0, p1}, Lla/x0;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public f(Ljava/lang/Object;Lda/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lla/x0;->l:I

    invoke-direct {p0, p1, v0, p2}, Lla/m;->J(Ljava/lang/Object;ILda/l;)V

    return-void
.end method

.method public g(Ljava/lang/Throwable;)Z
    .locals 4

    :cond_0
    iget-object v0, p0, Lla/m;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lla/j2;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance v1, Lla/p;

    instance-of v2, v0, Lla/j;

    invoke-direct {v1, p0, p1, v2}, Lla/p;-><init>(Lv9/d;Ljava/lang/Throwable;Z)V

    sget-object v3, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v0, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v2, :cond_2

    check-cast v0, Lla/j;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p0, v0, p1}, Lla/m;->n(Lla/j;Ljava/lang/Throwable;)V

    :cond_3
    invoke-direct {p0}, Lla/m;->t()V

    iget p1, p0, Lla/x0;->l:I

    invoke-direct {p0, p1}, Lla/m;->u(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, Lla/m;->m:Lv9/d;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Lv9/g;
    .locals 1

    iget-object v0, p0, Lla/m;->n:Lv9/g;

    return-object v0
.end method

.method public h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p1, Lla/y;

    if-eqz v0, :cond_0

    check-cast p1, Lla/y;

    iget-object p1, p1, Lla/y;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public j(Lda/l;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lla/m;->D(Lda/l;)Lla/j;

    move-result-object v8

    :cond_0
    :goto_0
    iget-object v9, p0, Lla/m;->_state:Ljava/lang/Object;

    instance-of v0, v9, Lla/d;

    if-eqz v0, :cond_1

    sget-object v0, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v9, v8}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_1
    instance-of v0, v9, Lla/j;

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, v9}, Lla/m;->E(Lda/l;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v0, v9, Lla/z;

    if-eqz v0, :cond_7

    move-object v1, v9

    check-cast v1, Lla/z;

    invoke-virtual {v1}, Lla/z;->b()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-direct {p0, p1, v9}, Lla/m;->E(Lda/l;Ljava/lang/Object;)V

    :cond_3
    instance-of v2, v9, Lla/p;

    if-eqz v2, :cond_6

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_5

    iget-object v2, v1, Lla/z;->a:Ljava/lang/Throwable;

    :cond_5
    invoke-direct {p0, p1, v2}, Lla/m;->m(Lda/l;Ljava/lang/Throwable;)V

    :cond_6
    return-void

    :cond_7
    instance-of v0, v9, Lla/y;

    if-eqz v0, :cond_b

    move-object v0, v9

    check-cast v0, Lla/y;

    iget-object v1, v0, Lla/y;->b:Lla/j;

    if-eqz v1, :cond_8

    invoke-direct {p0, p1, v9}, Lla/m;->E(Lda/l;Ljava/lang/Object;)V

    :cond_8
    instance-of v1, v8, Lla/f;

    if-eqz v1, :cond_9

    return-void

    :cond_9
    invoke-virtual {v0}, Lla/y;->c()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v0, v0, Lla/y;->e:Ljava/lang/Throwable;

    invoke-direct {p0, p1, v0}, Lla/m;->m(Lda/l;Ljava/lang/Throwable;)V

    return-void

    :cond_a
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1d

    const/4 v7, 0x0

    move-object v2, v8

    invoke-static/range {v0 .. v7}, Lla/y;->b(Lla/y;Ljava/lang/Object;Lla/j;Lda/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lla/y;

    move-result-object v0

    sget-object v1, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v9, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_b
    instance-of v0, v8, Lla/f;

    if-eqz v0, :cond_c

    return-void

    :cond_c
    new-instance v10, Lla/y;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    move-object v0, v10

    move-object v1, v9

    move-object v2, v8

    invoke-direct/range {v0 .. v7}, Lla/y;-><init>(Ljava/lang/Object;Lla/j;Lda/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/g;)V

    sget-object v0, Lla/m;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v9, v10}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lla/m;->x()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n(Lla/j;Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1, p2}, Lla/k;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lla/m;->getContext()Lv9/g;

    move-result-object p2

    new-instance v0, Lla/c0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lla/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lla/j0;->a(Lv9/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public o(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lla/z;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lla/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    invoke-direct {p0, v0, v3, v3}, Lla/m;->N(Ljava/lang/Object;Ljava/lang/Object;Lda/l;)Lkotlinx/coroutines/internal/b0;

    move-result-object p1

    return-object p1
.end method

.method public p(Ljava/lang/Object;)V
    .locals 0

    iget p1, p0, Lla/x0;->l:I

    invoke-direct {p0, p1}, Lla/m;->u(I)V

    return-void
.end method

.method public final q(Lda/l;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lda/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lla/m;->getContext()Lv9/g;

    move-result-object p2

    new-instance v0, Lla/c0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in resume onCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lla/c0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lla/j0;->a(Lv9/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1, p0}, Lla/d0;->c(Ljava/lang/Object;Lla/l;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lla/x0;->l:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lla/m;->K(Lla/m;Ljava/lang/Object;ILda/l;ILjava/lang/Object;)V

    return-void
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Lla/m;->o:Lla/c1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lla/c1;->b()V

    sget-object v0, Lla/i2;->j:Lla/i2;

    iput-object v0, p0, Lla/m;->o:Lla/c1;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lla/m;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lla/m;->m:Lv9/d;

    invoke-static {v1}, Lla/o0;->c(Lv9/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lla/m;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lla/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(Lla/v1;)Ljava/lang/Throwable;
    .locals 0

    invoke-interface {p1}, Lla/v1;->O()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public final w()Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, Lla/m;->C()Z

    move-result v0

    invoke-direct {p0}, Lla/m;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lla/m;->o:Lla/c1;

    if-nez v1, :cond_0

    invoke-direct {p0}, Lla/m;->A()Lla/c1;

    :cond_0
    if-eqz v0, :cond_1

    invoke-direct {p0}, Lla/m;->H()V

    :cond_1
    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    invoke-direct {p0}, Lla/m;->H()V

    :cond_3
    invoke-virtual {p0}, Lla/m;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/z;

    if-nez v1, :cond_6

    iget v1, p0, Lla/x0;->l:I

    invoke-static {v1}, Lla/y0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lla/m;->getContext()Lv9/g;

    move-result-object v1

    sget-object v2, Lla/v1;->g:Lla/v1$b;

    invoke-interface {v1, v2}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v1

    check-cast v1, Lla/v1;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Lla/v1;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v1}, Lla/v1;->O()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lla/m;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    throw v1

    :cond_5
    :goto_0
    invoke-virtual {p0, v0}, Lla/m;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_6
    check-cast v0, Lla/z;

    iget-object v0, v0, Lla/z;->a:Ljava/lang/Throwable;

    throw v0
.end method

.method public final x()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lla/m;->_state:Ljava/lang/Object;

    return-object v0
.end method

.method public z()V
    .locals 2

    invoke-direct {p0}, Lla/m;->A()Lla/c1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lla/m;->B()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lla/c1;->b()V

    sget-object v0, Lla/i2;->j:Lla/i2;

    iput-object v0, p0, Lla/m;->o:Lla/c1;

    :cond_1
    return-void
.end method
