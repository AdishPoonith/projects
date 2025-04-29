.class Landroidx/fragment/app/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/d;


# instance fields
.field private j:Landroidx/lifecycle/j;

.field private k:Lf0/c;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/a0;->j:Landroidx/lifecycle/j;

    iput-object v0, p0, Landroidx/fragment/app/a0;->k:Lf0/c;

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/e;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/a0;->c()V

    iget-object v0, p0, Landroidx/fragment/app/a0;->j:Landroidx/lifecycle/j;

    return-object v0
.end method

.method b(Landroidx/lifecycle/e$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->j:Landroidx/lifecycle/j;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/j;->h(Landroidx/lifecycle/e$a;)V

    return-void
.end method

.method c()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->j:Landroidx/lifecycle/j;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/j;

    invoke-direct {v0, p0}, Landroidx/lifecycle/j;-><init>(Landroidx/lifecycle/i;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->j:Landroidx/lifecycle/j;

    invoke-static {p0}, Lf0/c;->a(Lf0/d;)Lf0/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/a0;->k:Lf0/c;

    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->j:Landroidx/lifecycle/j;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method e(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->k:Lf0/c;

    invoke-virtual {v0, p1}, Lf0/c;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method f(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->k:Lf0/c;

    invoke-virtual {v0, p1}, Lf0/c;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method g(Landroidx/lifecycle/e$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->j:Landroidx/lifecycle/j;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/j;->n(Landroidx/lifecycle/e$b;)V

    return-void
.end method

.method public j()Landroidx/savedstate/a;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->k:Lf0/c;

    invoke-virtual {v0}, Lf0/c;->b()Landroidx/savedstate/a;

    move-result-object v0

    return-object v0
.end method
