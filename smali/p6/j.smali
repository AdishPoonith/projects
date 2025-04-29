.class public final Lp6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/j$d;,
        Lp6/j$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/net/ConnectivityManager;

.field private c:Ljava/lang/Runnable;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq6/n<",
            "Lp6/l$a;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp6/j;->d:Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Context must be non-null"

    invoke-static {v1, v2, v0}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lp6/j;->a:Landroid/content/Context;

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lp6/j;->b:Landroid/net/ConnectivityManager;

    invoke-direct {p0}, Lp6/j;->f()V

    invoke-direct {p0}, Lp6/j;->g()V

    return-void
.end method

.method public static synthetic b(Lp6/j;Lp6/j$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lp6/j;->j(Lp6/j$d;)V

    return-void
.end method

.method public static synthetic c(Lp6/j;Lp6/j$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lp6/j;->i(Lp6/j$c;)V

    return-void
.end method

.method static synthetic d(Lp6/j;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lp6/j;->k(Z)V

    return-void
.end method

.method static synthetic e(Lp6/j;)Z
    .locals 0

    invoke-direct {p0}, Lp6/j;->h()Z

    move-result p0

    return p0
.end method

.method private f()V
    .locals 3

    iget-object v0, p0, Lp6/j;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    new-instance v2, Lp6/j$a;

    invoke-direct {v2, p0, v1}, Lp6/j$a;-><init>(Lp6/j;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {v0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    new-instance v2, Lp6/j$b;

    invoke-direct {v2, p0, v1}, Lp6/j$b;-><init>(Lp6/j;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {v0, v2}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method private g()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x18

    if-lt v0, v2, :cond_0

    iget-object v0, p0, Lp6/j;->b:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    new-instance v0, Lp6/j$c;

    invoke-direct {v0, p0, v1}, Lp6/j$c;-><init>(Lp6/j;Lp6/j$a;)V

    iget-object v1, p0, Lp6/j;->b:Landroid/net/ConnectivityManager;

    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    new-instance v1, Lp6/h;

    invoke-direct {v1, p0, v0}, Lp6/h;-><init>(Lp6/j;Lp6/j$c;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/j$d;

    invoke-direct {v0, p0, v1}, Lp6/j$d;-><init>(Lp6/j;Lp6/j$a;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lp6/j;->a:Landroid/content/Context;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v1, Lp6/i;

    invoke-direct {v1, p0, v0}, Lp6/i;-><init>(Lp6/j;Lp6/j$d;)V

    :goto_0
    iput-object v1, p0, Lp6/j;->c:Ljava/lang/Runnable;

    return-void
.end method

.method private h()Z
    .locals 2

    iget-object v0, p0, Lp6/j;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic i(Lp6/j$c;)V
    .locals 1

    iget-object v0, p0, Lp6/j;->b:Landroid/net/ConnectivityManager;

    invoke-virtual {v0, p1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method private synthetic j(Lp6/j$d;)V
    .locals 1

    iget-object v0, p0, Lp6/j;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method private k(Z)V
    .locals 4

    iget-object v0, p0, Lp6/j;->d:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp6/j;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq6/n;

    if-eqz p1, :cond_0

    sget-object v3, Lp6/l$a;->k:Lp6/l$a;

    goto :goto_1

    :cond_0
    sget-object v3, Lp6/l$a;->j:Lp6/l$a;

    :goto_1
    invoke-interface {v2, v3}, Lq6/n;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(Lq6/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/n<",
            "Lp6/l$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lp6/j;->d:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp6/j;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public l()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "AndroidConnectivityMonitor"

    const-string v2, "App has entered the foreground."

    invoke-static {v1, v2, v0}, Lq6/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lp6/j;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lp6/j;->k(Z)V

    :cond_0
    return-void
.end method

.method public shutdown()V
    .locals 1

    iget-object v0, p0, Lp6/j;->c:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp6/j;->c:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method
