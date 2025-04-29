.class Lw1/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/y$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field private final b:Lw1/w$a;

.field private c:Lw1/o;

.field private d:Z

.field final synthetic e:Lw1/h;


# direct methods
.method public constructor <init>(Lw1/h;Lw1/w$a;)V
    .locals 0

    iput-object p1, p0, Lw1/h$f;->e:Lw1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw1/h$f;->b:Lw1/w$a;

    return-void
.end method

.method public static synthetic b(Lw1/h$f;)V
    .locals 0

    invoke-direct {p0}, Lw1/h$f;->f()V

    return-void
.end method

.method public static synthetic c(Lw1/h$f;Ls1/n1;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/h$f;->e(Ls1/n1;)V

    return-void
.end method

.method private synthetic e(Ls1/n1;)V
    .locals 4

    iget-object v0, p0, Lw1/h$f;->e:Lw1/h;

    invoke-static {v0}, Lw1/h;->r(Lw1/h;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lw1/h$f;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw1/h$f;->e:Lw1/h;

    invoke-static {v0}, Lw1/h;->l(Lw1/h;)Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Looper;

    iget-object v2, p0, Lw1/h$f;->b:Lw1/w$a;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Lw1/h;->m(Lw1/h;Landroid/os/Looper;Lw1/w$a;Ls1/n1;Z)Lw1/o;

    move-result-object p1

    iput-object p1, p0, Lw1/h$f;->c:Lw1/o;

    iget-object p1, p0, Lw1/h$f;->e:Lw1/h;

    invoke-static {p1}, Lw1/h;->k(Lw1/h;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic f()V
    .locals 2

    iget-boolean v0, p0, Lw1/h$f;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw1/h$f;->c:Lw1/o;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lw1/h$f;->b:Lw1/w$a;

    invoke-interface {v0, v1}, Lw1/o;->d(Lw1/w$a;)V

    :cond_1
    iget-object v0, p0, Lw1/h$f;->e:Lw1/h;

    invoke-static {v0}, Lw1/h;->k(Lw1/h;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw1/h$f;->d:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lw1/h$f;->e:Lw1/h;

    invoke-static {v0}, Lw1/h;->q(Lw1/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lw1/i;

    invoke-direct {v1, p0}, Lw1/i;-><init>(Lw1/h$f;)V

    invoke-static {v0, v1}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    return-void
.end method

.method public d(Ls1/n1;)V
    .locals 2

    iget-object v0, p0, Lw1/h$f;->e:Lw1/h;

    invoke-static {v0}, Lw1/h;->q(Lw1/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lw1/j;

    invoke-direct {v1, p0, p1}, Lw1/j;-><init>(Lw1/h$f;Ls1/n1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
