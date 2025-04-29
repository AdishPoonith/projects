.class public final Lx7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:I

.field private d:Lx7/f;

.field private e:Landroidx/core/app/k$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lx7/a;->b:Ljava/lang/String;

    iput p3, p0, Lx7/a;->c:I

    new-instance p3, Lx7/f;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7f

    const/4 v10, 0x0

    move-object v1, p3

    invoke-direct/range {v1 .. v10}, Lx7/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILkotlin/jvm/internal/g;)V

    iput-object p3, p0, Lx7/a;->d:Lx7/f;

    new-instance p3, Landroidx/core/app/k$d;

    invoke-direct {p3, p1, p2}, Landroidx/core/app/k$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Landroidx/core/app/k$d;->n(I)Landroidx/core/app/k$d;

    move-result-object p1

    const-string p2, "setPriority(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    iget-object p1, p0, Lx7/a;->d:Lx7/f;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lx7/a;->e(Lx7/f;Z)V

    return-void
.end method

.method private final b()Landroid/app/PendingIntent;
    .locals 3

    iget-object v0, p0, Lx7/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lx7/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/high16 v2, 0x10200000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lx7/a;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method private final c(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Lx7/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lx7/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "drawable"

    invoke-virtual {v0, p1, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method private final d(Ljava/lang/String;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lx7/a;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/n;->c(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, Lx7/a;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    invoke-virtual {v0, v1}, Landroidx/core/app/n;->b(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method private final e(Lx7/f;Z)V
    .locals 3

    invoke-virtual {p1}, Lx7/f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lx7/a;->c(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "navigation_empty_icon"

    invoke-direct {p0, v0}, Lx7/a;->c(Ljava/lang/String;)I

    move-result v0

    :goto_0
    iget-object v1, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    invoke-virtual {p1}, Lx7/f;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/core/app/k$d;->k(Ljava/lang/CharSequence;)Landroidx/core/app/k$d;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/core/app/k$d;->o(I)Landroidx/core/app/k$d;

    move-result-object v0

    invoke-virtual {p1}, Lx7/f;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$d;->j(Ljava/lang/CharSequence;)Landroidx/core/app/k$d;

    move-result-object v0

    invoke-virtual {p1}, Lx7/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$d;->q(Ljava/lang/CharSequence;)Landroidx/core/app/k$d;

    move-result-object v0

    const-string v1, "setSubText(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    invoke-virtual {p1}, Lx7/f;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    invoke-virtual {p1}, Lx7/f;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/k$d;->g(I)Landroidx/core/app/k$d;

    move-result-object v0

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/app/k$d;->g(I)Landroidx/core/app/k$d;

    move-result-object v0

    :goto_1
    invoke-virtual {v0, v1}, Landroidx/core/app/k$d;->h(Z)Landroidx/core/app/k$d;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    iput-object v0, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    invoke-virtual {p1}, Lx7/f;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    invoke-direct {p0}, Lx7/a;->b()Landroid/app/PendingIntent;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1, v0}, Landroidx/core/app/k$d;->i(Landroid/app/PendingIntent;)Landroidx/core/app/k$d;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    iput-object p1, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    if-eqz p2, :cond_3

    iget-object p1, p0, Lx7/a;->a:Landroid/content/Context;

    invoke-static {p1}, Landroidx/core/app/n;->c(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object p1

    const-string p2, "from(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lx7/a;->c:I

    iget-object v0, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    invoke-virtual {v0}, Landroidx/core/app/k$d;->b()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/core/app/n;->e(ILandroid/app/Notification;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Notification;
    .locals 2

    iget-object v0, p0, Lx7/a;->d:Lx7/f;

    invoke-virtual {v0}, Lx7/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lx7/a;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lx7/a;->e:Landroidx/core/app/k$d;

    invoke-virtual {v0}, Landroidx/core/app/k$d;->b()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final f(Lx7/f;Z)V
    .locals 2

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx7/f;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lx7/a;->d:Lx7/f;

    invoke-virtual {v1}, Lx7/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lx7/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lx7/a;->d(Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lx7/a;->e(Lx7/f;Z)V

    iput-object p1, p0, Lx7/a;->d:Lx7/f;

    return-void
.end method
