.class public abstract Lp1/k0;
.super Lp1/f0;
.source "SourceFile"


# instance fields
.field private final m:Lp0/h;


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lp1/f0;-><init>(Landroid/os/Parcel;)V

    sget-object p1, Lp0/h;->l:Lp0/h;

    iput-object p1, p0, Lp1/k0;->m:Lp0/h;

    return-void
.end method

.method public constructor <init>(Lp1/u;)V
    .locals 1

    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lp1/f0;-><init>(Lp1/u;)V

    sget-object p1, Lp0/h;->l:Lp0/h;

    iput-object p1, p0, Lp1/k0;->m:Lp0/h;

    return-void
.end method

.method public static synthetic B(Lp1/k0;Lp1/u$e;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lp1/k0;->L(Lp1/k0;Lp1/u$e;Landroid/os/Bundle;)V

    return-void
.end method

.method private final C(Lp1/u$f;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lp1/f0;->d()Lp1/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/u;->j(Lp1/u$f;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp1/f0;->d()Lp1/u;

    move-result-object p1

    invoke-virtual {p1}, Lp1/u;->M()V

    :goto_0
    return-void
.end method

.method private final J(Landroid/content/Intent;)Z
    .locals 2

    sget-object v0, Lp0/f0;->a:Lp0/f0;

    invoke-static {}, Lp0/f0;->l()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/high16 v1, 0x10000

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    const-string v0, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final K(Lp1/u$e;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "code"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lf1/l0;->a:Lf1/l0;

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf1/l0;->X(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lp0/f0;->a:Lp0/f0;

    invoke-static {}, Lp0/f0;->t()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lp1/j0;

    invoke-direct {v1, p0, p1, p2}, Lp1/j0;-><init>(Lp1/k0;Lp1/u$e;Landroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lp1/k0;->I(Lp1/u$e;Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method

.method private static final L(Lp1/k0;Lp1/u$e;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lp1/f0;->p(Lp1/u$e;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lp1/k0;->I(Lp1/u$e;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lp0/h0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lp0/s; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2, v0}, Lp1/k0;->H(Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception p2

    invoke-virtual {p2}, Lp0/h0;->c()Lp0/v;

    move-result-object p2

    invoke-virtual {p2}, Lp0/v;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lp0/v;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lp0/v;->b()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, v1, p2}, Lp1/k0;->H(Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected D(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    const-string v1, "error"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "error_type"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method protected E(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    const-string v1, "error_message"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "error_description"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method public F()Lp0/h;
    .locals 1

    iget-object v0, p0, Lp1/k0;->m:Lp0/h;

    return-object v0
.end method

.method protected G(Lp1/u$e;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p0, p2}, Lp1/k0;->D(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "error_code"

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    sget-object v2, Lf1/h0;->a:Lf1/h0;

    invoke-static {}, Lf1/h0;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p2}, Lp1/k0;->E(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lp1/u$f;->r:Lp1/u$f$c;

    invoke-virtual {v2, p1, v0, p2, v1}, Lp1/u$f$c;->c(Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lp1/u$f;

    move-result-object p1

    :goto_1
    invoke-direct {p0, p1}, Lp1/k0;->C(Lp1/u$f;)V

    return-void

    :cond_2
    sget-object p2, Lp1/u$f;->r:Lp1/u$f$c;

    invoke-virtual {p2, p1, v0}, Lp1/u$f$c;->a(Lp1/u$e;Ljava/lang/String;)Lp1/u$f;

    move-result-object p1

    goto :goto_1
.end method

.method protected H(Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const-string v1, "logged_out"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lp1/c;->t:Lp1/c$b;

    const/4 p1, 0x1

    sput-boolean p1, Lp1/c;->u:Z

    goto :goto_0

    :cond_0
    sget-object v1, Lf1/h0;->a:Lf1/h0;

    invoke-static {}, Lf1/h0;->d()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1, p2}, Lt9/n;->m(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    invoke-direct {p0, v0}, Lp1/k0;->C(Lp1/u$f;)V

    goto :goto_2

    :cond_1
    invoke-static {}, Lf1/h0;->e()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1, p2}, Lt9/n;->m(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p2, Lp1/u$f;->r:Lp1/u$f$c;

    invoke-virtual {p2, p1, v0}, Lp1/u$f$c;->a(Lp1/u$e;Ljava/lang/String;)Lp1/u$f;

    move-result-object p1

    goto :goto_1

    :cond_2
    sget-object v0, Lp1/u$f;->r:Lp1/u$f$c;

    invoke-virtual {v0, p1, p2, p3, p4}, Lp1/u$f$c;->c(Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lp1/u$f;

    move-result-object p1

    :goto_1
    invoke-direct {p0, p1}, Lp1/k0;->C(Lp1/u$f;)V

    :goto_2
    return-void
.end method

.method protected I(Lp1/u$e;Landroid/os/Bundle;)V
    .locals 7

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lp1/f0;->l:Lp1/f0$a;

    invoke-virtual {p1}, Lp1/u$e;->x()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p0}, Lp1/k0;->F()Lp0/h;

    move-result-object v2

    invoke-virtual {p1}, Lp1/u$e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, p2, v2, v3}, Lp1/f0$a;->b(Ljava/util/Collection;Landroid/os/Bundle;Lp0/h;Ljava/lang/String;)Lp0/a;

    move-result-object v1

    invoke-virtual {p1}, Lp1/u$e;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p2, v2}, Lp1/f0$a;->d(Landroid/os/Bundle;Ljava/lang/String;)Lp0/i;

    move-result-object p2

    sget-object v0, Lp1/u$f;->r:Lp1/u$f$c;

    invoke-virtual {v0, p1, v1, p2}, Lp1/u$f$c;->b(Lp1/u$e;Lp0/a;Lp0/i;)Lp1/u$f;

    move-result-object p2

    invoke-direct {p0, p2}, Lp1/k0;->C(Lp1/u$f;)V
    :try_end_0
    .catch Lp0/s; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    sget-object v0, Lp1/u$f;->r:Lp1/u$f$c;

    const/4 v2, 0x0

    invoke-virtual {p2}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lp1/u$f$c;->d(Lp1/u$f$c;Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lp1/u$f;

    move-result-object p1

    invoke-direct {p0, p1}, Lp1/k0;->C(Lp1/u$f;)V

    :goto_0
    return-void
.end method

.method protected M(Landroid/content/Intent;I)Z
    .locals 3

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    invoke-direct {p0, p1}, Lp1/k0;->J(Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lp1/f0;->d()Lp1/u;

    move-result-object v0

    invoke-virtual {v0}, Lp1/u;->p()Landroidx/fragment/app/Fragment;

    move-result-object v0

    instance-of v1, v0, Lp1/y;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lp1/y;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lp1/y;->N1()Landroidx/activity/result/c;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0, p1}, Landroidx/activity/result/c;->a(Ljava/lang/Object;)V

    sget-object v2, Ls9/u;->a:Ls9/u;

    :goto_1
    if-nez v2, :cond_4

    return p2

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    return p2
.end method

.method public m(IILandroid/content/Intent;)Z
    .locals 7

    invoke-virtual {p0}, Lp1/f0;->d()Lp1/u;

    move-result-object p1

    invoke-virtual {p1}, Lp1/u;->z()Lp1/u$e;

    move-result-object v1

    const/4 p1, 0x1

    if-nez p3, :cond_0

    sget-object p2, Lp1/u$f;->r:Lp1/u$f$c;

    const-string p3, "Operation canceled"

    invoke-virtual {p2, v1, p3}, Lp1/u$f$c;->a(Lp1/u$e;Ljava/lang/String;)Lp1/u$f;

    move-result-object p2

    :goto_0
    invoke-direct {p0, p2}, Lp1/k0;->C(Lp1/u$f;)V

    goto :goto_2

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0, v1, p3}, Lp1/k0;->G(Lp1/u$e;Landroid/content/Intent;)V

    goto :goto_2

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    sget-object v0, Lp1/u$f;->r:Lp1/u$f$c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v2, "Unexpected resultCode from authorization."

    invoke-static/range {v0 .. v6}, Lp1/u$f$c;->d(Lp1/u$f$c;Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lp1/u$f;

    move-result-object p2

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_3

    sget-object v0, Lp1/u$f;->r:Lp1/u$f$c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v2, "Unexpected null from returned authorization data."

    invoke-static/range {v0 .. v6}, Lp1/u$f$c;->d(Lp1/u$f$c;Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lp1/u$f;

    move-result-object p2

    invoke-direct {p0, p2}, Lp1/k0;->C(Lp1/u$f;)V

    return p1

    :cond_3
    invoke-virtual {p0, p2}, Lp1/k0;->D(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "error_code"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p0, p2}, Lp1/k0;->E(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "e2e"

    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lf1/l0;->a:Lf1/l0;

    invoke-static {v3}, Lf1/l0;->X(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {p0, v3}, Lp1/f0;->k(Ljava/lang/String;)V

    :cond_5
    if-nez p3, :cond_6

    if-nez v0, :cond_6

    if-nez v2, :cond_6

    if-eqz v1, :cond_6

    invoke-direct {p0, v1, p2}, Lp1/k0;->K(Lp1/u$e;Landroid/os/Bundle;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0, v1, p3, v2, v0}, Lp1/k0;->H(Lp1/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return p1
.end method
