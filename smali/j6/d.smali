.class public Lj6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj6/d$c;,
        Lj6/d$d;,
        Lj6/d$b;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, Lj6/d;->e(Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Landroidx/fragment/app/e;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, Lj6/d;->f(Landroidx/fragment/app/e;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static c(Landroid/app/Activity;Lcom/google/firebase/firestore/f0;)Lcom/google/firebase/firestore/f0;
    .locals 1

    if-eqz p0, :cond_1

    instance-of v0, p0, Landroidx/fragment/app/e;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/e;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lj6/c;

    invoke-direct {v0, p1}, Lj6/c;-><init>(Lcom/google/firebase/firestore/f0;)V

    invoke-static {p0, v0}, Lj6/d;->h(Landroidx/fragment/app/e;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lj6/c;

    invoke-direct {v0, p1}, Lj6/c;-><init>(Lcom/google/firebase/firestore/f0;)V

    invoke-static {p0, v0}, Lj6/d;->g(Landroid/app/Activity;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-object p1
.end method

.method private static d(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment with tag \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' is a "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " but should be a "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static synthetic e(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 3

    const-class v0, Lj6/d$c;

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const-string v2, "FirestoreOnStopObserverFragment"

    invoke-virtual {v1, v2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lj6/d;->d(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj6/d$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Fragment;->isRemoving()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v0, Lj6/d$c;

    invoke-direct {v0}, Lj6/d$c;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_1
    iget-object p0, v0, Lj6/d$c;->j:Lj6/d$b;

    invoke-virtual {p0, p1}, Lj6/d$b;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static synthetic f(Landroidx/fragment/app/e;Ljava/lang/Runnable;)V
    .locals 3

    const-class v0, Lj6/d$d;

    invoke-virtual {p0}, Landroidx/fragment/app/e;->F()Landroidx/fragment/app/n;

    move-result-object v1

    const-string v2, "FirestoreOnStopObserverSupportFragment"

    invoke-virtual {v1, v2}, Landroidx/fragment/app/n;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lj6/d;->d(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj6/d$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v0, Lj6/d$d;

    invoke-direct {v0}, Lj6/d$d;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/e;->F()Landroidx/fragment/app/n;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/n;->m()Landroidx/fragment/app/w;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/w;->d(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/w;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/w;->g()I

    invoke-virtual {p0}, Landroidx/fragment/app/e;->F()Landroidx/fragment/app/n;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/n;->f0()Z

    :cond_1
    iget-object p0, v0, Lj6/d$d;->j0:Lj6/d$b;

    invoke-virtual {p0, p1}, Lj6/d$b;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static g(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 3

    instance-of v0, p0, Landroidx/fragment/app/e;

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lj6/a;

    invoke-direct {v0, p0, p1}, Lj6/a;-><init>(Landroid/app/Activity;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static h(Landroidx/fragment/app/e;Ljava/lang/Runnable;)V
    .locals 1

    new-instance v0, Lj6/b;

    invoke-direct {v0, p0, p1}, Lj6/b;-><init>(Landroidx/fragment/app/e;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
