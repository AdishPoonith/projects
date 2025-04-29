.class Lp6/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/j0$a;
    }
.end annotation


# instance fields
.field private a:Lj6/z0;

.field private b:I

.field private c:Lq6/g$b;

.field private d:Z

.field private final e:Lq6/g;

.field private final f:Lp6/j0$a;


# direct methods
.method constructor <init>(Lq6/g;Lp6/j0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/j0;->e:Lq6/g;

    iput-object p2, p0, Lp6/j0;->f:Lp6/j0$a;

    sget-object p1, Lj6/z0;->j:Lj6/z0;

    iput-object p1, p0, Lp6/j0;->a:Lj6/z0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp6/j0;->d:Z

    return-void
.end method

.method public static synthetic a(Lp6/j0;)V
    .locals 0

    invoke-direct {p0}, Lp6/j0;->f()V

    return-void
.end method

.method private b()V
    .locals 1

    iget-object v0, p0, Lp6/j0;->c:Lq6/g$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq6/g$b;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp6/j0;->c:Lq6/g$b;

    :cond_0
    return-void
.end method

.method private synthetic f()V
    .locals 5

    const/4 v0, 0x0

    iput-object v0, p0, Lp6/j0;->c:Lq6/g$b;

    iget-object v0, p0, Lp6/j0;->a:Lj6/z0;

    sget-object v1, Lj6/z0;->j:Lj6/z0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v3, [Ljava/lang/Object;

    const-string v4, "Timer should be canceled if we transitioned to a different state."

    invoke-static {v0, v4, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v1, v2, [Ljava/lang/Object;

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    const-string v2, "Backend didn\'t respond within %d seconds\n"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lp6/j0;->g(Ljava/lang/String;)V

    sget-object v0, Lj6/z0;->l:Lj6/z0;

    invoke-direct {p0, v0}, Lp6/j0;->h(Lj6/z0;)V

    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-boolean v1, p0, Lp6/j0;->d:Z

    const-string v3, "%s"

    const-string v4, "OnlineStateTracker"

    new-array v0, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_0

    aput-object p1, v0, v2

    invoke-static {v4, v3, v0}, Lq6/v;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v2, p0, Lp6/j0;->d:Z

    goto :goto_0

    :cond_0
    aput-object p1, v0, v2

    invoke-static {v4, v3, v0}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private h(Lj6/z0;)V
    .locals 1

    iget-object v0, p0, Lp6/j0;->a:Lj6/z0;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lp6/j0;->a:Lj6/z0;

    iget-object v0, p0, Lp6/j0;->f:Lp6/j0$a;

    invoke-interface {v0, p1}, Lp6/j0$a;->a(Lj6/z0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method c()Lj6/z0;
    .locals 1

    iget-object v0, p0, Lp6/j0;->a:Lj6/z0;

    return-object v0
.end method

.method d(Li9/j1;)V
    .locals 5

    iget-object v0, p0, Lp6/j0;->a:Lj6/z0;

    sget-object v1, Lj6/z0;->k:Lj6/z0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_2

    sget-object p1, Lj6/z0;->j:Lj6/z0;

    invoke-direct {p0, p1}, Lp6/j0;->h(Lj6/z0;)V

    iget p1, p0, Lp6/j0;->b:I

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "watchStreamFailures must be 0"

    invoke-static {p1, v1, v0}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lp6/j0;->c:Lq6/g$b;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "onlineStateTimer must be null"

    invoke-static {v3, v0, p1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget v0, p0, Lp6/j0;->b:I

    add-int/2addr v0, v3

    iput v0, p0, Lp6/j0;->b:I

    if-lt v0, v3, :cond_3

    invoke-direct {p0}, Lp6/j0;->b()V

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    aput-object p1, v1, v3

    const-string p1, "Connection failed %d times. Most recent error: %s"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/j0;->g(Ljava/lang/String;)V

    sget-object p1, Lj6/z0;->l:Lj6/z0;

    invoke-direct {p0, p1}, Lp6/j0;->h(Lj6/z0;)V

    :cond_3
    :goto_2
    return-void
.end method

.method e()V
    .locals 5

    iget v0, p0, Lp6/j0;->b:I

    if-nez v0, :cond_1

    sget-object v0, Lj6/z0;->j:Lj6/z0;

    invoke-direct {p0, v0}, Lp6/j0;->h(Lj6/z0;)V

    iget-object v0, p0, Lp6/j0;->c:Lq6/g$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onlineStateTimer shouldn\'t be started yet"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/j0;->e:Lq6/g;

    sget-object v1, Lq6/g$d;->p:Lq6/g$d;

    const-wide/16 v2, 0x2710

    new-instance v4, Lp6/i0;

    invoke-direct {v4, p0}, Lp6/i0;-><init>(Lp6/j0;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lq6/g;->k(Lq6/g$d;JLjava/lang/Runnable;)Lq6/g$b;

    move-result-object v0

    iput-object v0, p0, Lp6/j0;->c:Lq6/g$b;

    :cond_1
    return-void
.end method

.method i(Lj6/z0;)V
    .locals 2

    invoke-direct {p0}, Lp6/j0;->b()V

    const/4 v0, 0x0

    iput v0, p0, Lp6/j0;->b:I

    sget-object v1, Lj6/z0;->k:Lj6/z0;

    if-ne p1, v1, :cond_0

    iput-boolean v0, p0, Lp6/j0;->d:Z

    :cond_0
    invoke-direct {p0, p1}, Lp6/j0;->h(Lj6/z0;)V

    return-void
.end method
