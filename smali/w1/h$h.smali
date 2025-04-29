.class Lw1/h$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lw1/h;


# direct methods
.method private constructor <init>(Lw1/h;)V
    .locals 0

    iput-object p1, p0, Lw1/h$h;->a:Lw1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lw1/h;Lw1/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/h$h;-><init>(Lw1/h;)V

    return-void
.end method

.method public static synthetic c(Lw1/g;)V
    .locals 0

    invoke-static {p0}, Lw1/h$h;->d(Lw1/g;)V

    return-void
.end method

.method private static synthetic d(Lw1/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lw1/g;->d(Lw1/w$a;)V

    return-void
.end method


# virtual methods
.method public a(Lw1/g;I)V
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x1

    if-ne p2, v2, :cond_0

    iget-object v2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {v2}, Lw1/h;->r(Lw1/h;)I

    move-result v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {v2}, Lw1/h;->o(Lw1/h;)J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-eqz v4, :cond_0

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->p(Lw1/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->q(Lw1/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    new-instance v0, Lw1/k;

    invoke-direct {v0, p1}, Lw1/k;-><init>(Lw1/g;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {v3}, Lw1/h;->o(Lw1/h;)J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto :goto_0

    :cond_0
    if-nez p2, :cond_3

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->n(Lw1/h;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->s(Lw1/h;)Lw1/g;

    move-result-object p2

    const/4 v2, 0x0

    if-ne p2, p1, :cond_1

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2, v2}, Lw1/h;->t(Lw1/h;Lw1/g;)Lw1/g;

    :cond_1
    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->g(Lw1/h;)Lw1/g;

    move-result-object p2

    if-ne p2, p1, :cond_2

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2, v2}, Lw1/h;->h(Lw1/h;Lw1/g;)Lw1/g;

    :cond_2
    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->i(Lw1/h;)Lw1/h$g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lw1/h$g;->d(Lw1/g;)V

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->o(Lw1/h;)J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-eqz p2, :cond_3

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->q(Lw1/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->p(Lw1/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    iget-object p1, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p1}, Lw1/h;->j(Lw1/h;)V

    return-void
.end method

.method public b(Lw1/g;I)V
    .locals 4

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->o(Lw1/h;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->p(Lw1/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Lw1/h$h;->a:Lw1/h;

    invoke-static {p2}, Lw1/h;->q(Lw1/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
