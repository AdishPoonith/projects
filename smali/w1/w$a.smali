.class public Lw1/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/w$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lu2/u$b;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lw1/w$a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lw1/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu2/u$b;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu2/u$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lw1/w$a$a;",
            ">;I",
            "Lu2/u$b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lw1/w$a;->a:I

    iput-object p3, p0, Lw1/w$a;->b:Lu2/u$b;

    return-void
.end method

.method public static synthetic a(Lw1/w$a;Lw1/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/w$a;->s(Lw1/w;)V

    return-void
.end method

.method public static synthetic b(Lw1/w$a;Lw1/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/w$a;->o(Lw1/w;)V

    return-void
.end method

.method public static synthetic c(Lw1/w$a;Lw1/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/w$a;->n(Lw1/w;)V

    return-void
.end method

.method public static synthetic d(Lw1/w$a;Lw1/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/w$a;->p(Lw1/w;)V

    return-void
.end method

.method public static synthetic e(Lw1/w$a;Lw1/w;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw1/w$a;->r(Lw1/w;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic f(Lw1/w$a;Lw1/w;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw1/w$a;->q(Lw1/w;I)V

    return-void
.end method

.method private synthetic n(Lw1/w;)V
    .locals 2

    iget v0, p0, Lw1/w$a;->a:I

    iget-object v1, p0, Lw1/w$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1}, Lw1/w;->a0(ILu2/u$b;)V

    return-void
.end method

.method private synthetic o(Lw1/w;)V
    .locals 2

    iget v0, p0, Lw1/w$a;->a:I

    iget-object v1, p0, Lw1/w$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1}, Lw1/w;->f0(ILu2/u$b;)V

    return-void
.end method

.method private synthetic p(Lw1/w;)V
    .locals 2

    iget v0, p0, Lw1/w$a;->a:I

    iget-object v1, p0, Lw1/w$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1}, Lw1/w;->P(ILu2/u$b;)V

    return-void
.end method

.method private synthetic q(Lw1/w;I)V
    .locals 2

    iget v0, p0, Lw1/w$a;->a:I

    iget-object v1, p0, Lw1/w$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1}, Lw1/w;->k0(ILu2/u$b;)V

    iget v0, p0, Lw1/w$a;->a:I

    iget-object v1, p0, Lw1/w$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1, p2}, Lw1/w;->C(ILu2/u$b;I)V

    return-void
.end method

.method private synthetic r(Lw1/w;Ljava/lang/Exception;)V
    .locals 2

    iget v0, p0, Lw1/w$a;->a:I

    iget-object v1, p0, Lw1/w$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1, p2}, Lw1/w;->I(ILu2/u$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic s(Lw1/w;)V
    .locals 2

    iget v0, p0, Lw1/w$a;->a:I

    iget-object v1, p0, Lw1/w$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1}, Lw1/w;->G(ILu2/u$b;)V

    return-void
.end method


# virtual methods
.method public g(Landroid/os/Handler;Lw1/w;)V
    .locals 2

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lw1/w$a$a;

    invoke-direct {v1, p1, p2}, Lw1/w$a$a;-><init>(Landroid/os/Handler;Lw1/w;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/w$a$a;

    iget-object v2, v1, Lw1/w$a$a;->b:Lw1/w;

    iget-object v1, v1, Lw1/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw1/s;

    invoke-direct {v3, p0, v2}, Lw1/s;-><init>(Lw1/w$a;Lw1/w;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/w$a$a;

    iget-object v2, v1, Lw1/w$a$a;->b:Lw1/w;

    iget-object v1, v1, Lw1/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw1/r;

    invoke-direct {v3, p0, v2}, Lw1/r;-><init>(Lw1/w$a;Lw1/w;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/w$a$a;

    iget-object v2, v1, Lw1/w$a$a;->b:Lw1/w;

    iget-object v1, v1, Lw1/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw1/t;

    invoke-direct {v3, p0, v2}, Lw1/t;-><init>(Lw1/w$a;Lw1/w;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(I)V
    .locals 4

    iget-object v0, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/w$a$a;

    iget-object v2, v1, Lw1/w$a$a;->b:Lw1/w;

    iget-object v1, v1, Lw1/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw1/u;

    invoke-direct {v3, p0, v2, p1}, Lw1/u;-><init>(Lw1/w$a;Lw1/w;I)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/w$a$a;

    iget-object v2, v1, Lw1/w$a$a;->b:Lw1/w;

    iget-object v1, v1, Lw1/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw1/v;

    invoke-direct {v3, p0, v2, p1}, Lw1/v;-><init>(Lw1/w$a;Lw1/w;Ljava/lang/Exception;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m()V
    .locals 4

    iget-object v0, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/w$a$a;

    iget-object v2, v1, Lw1/w$a$a;->b:Lw1/w;

    iget-object v1, v1, Lw1/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw1/q;

    invoke-direct {v3, p0, v2}, Lw1/q;-><init>(Lw1/w$a;Lw1/w;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lw1/w;)V
    .locals 3

    iget-object v0, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/w$a$a;

    iget-object v2, v1, Lw1/w$a$a;->b:Lw1/w;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public u(ILu2/u$b;)Lw1/w$a;
    .locals 2

    new-instance v0, Lw1/w$a;

    iget-object v1, p0, Lw1/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1, p1, p2}, Lw1/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu2/u$b;)V

    return-object v0
.end method
