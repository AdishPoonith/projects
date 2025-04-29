.class public Lv7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;
.implements Li8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/e$b;,
        Lv7/e$a;
    }
.end annotation


# instance fields
.field private j:Lr8/k;

.field private k:Lv7/a;

.field private l:Landroid/os/HandlerThread;

.field private m:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lv7/e;)Lv7/a;
    .locals 0

    iget-object p0, p0, Lv7/e;->k:Lv7/a;

    return-object p0
.end method

.method static synthetic b(Lv7/e;Lr8/j;)Z
    .locals 0

    invoke-direct {p0, p1}, Lv7/e;->h(Lr8/j;)Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lv7/e;Lr8/j;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lv7/e;->g(Lr8/j;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lv7/e;Lr8/j;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lv7/e;->i(Lr8/j;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lv7/e;->k:Lv7/a;

    iget-object v1, v1, Lv7/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private g(Lr8/j;)Ljava/lang/String;
    .locals 1

    iget-object p1, p1, Lr8/j;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "key"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lv7/e;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private h(Lr8/j;)Z
    .locals 2

    iget-object p1, p1, Lr8/j;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "resetOnError"

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "true"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private i(Lr8/j;)Ljava/lang/String;
    .locals 1

    iget-object p1, p1, Lr8/j;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "value"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 2

    new-instance v0, Lv7/e$a;

    invoke-direct {v0, p2}, Lv7/e$a;-><init>(Lr8/k$d;)V

    iget-object p2, p0, Lv7/e;->m:Landroid/os/Handler;

    new-instance v1, Lv7/e$b;

    invoke-direct {v1, p0, p1, v0}, Lv7/e$b;-><init>(Lv7/e;Lr8/j;Lr8/k$d;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public d(Li8/a$b;)V
    .locals 1

    iget-object p1, p0, Lv7/e;->j:Lr8/k;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/e;->l:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->quitSafely()Z

    iput-object v0, p0, Lv7/e;->l:Landroid/os/HandlerThread;

    iget-object p1, p0, Lv7/e;->j:Lr8/k;

    invoke-virtual {p1, v0}, Lr8/k;->e(Lr8/k$c;)V

    iput-object v0, p0, Lv7/e;->j:Lr8/k;

    :cond_0
    iput-object v0, p0, Lv7/e;->k:Lv7/a;

    return-void
.end method

.method public j(Lr8/c;Landroid/content/Context;)V
    .locals 1

    :try_start_0
    new-instance v0, Lv7/a;

    invoke-direct {v0, p2}, Lv7/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lv7/e;->k:Lv7/a;

    new-instance p2, Landroid/os/HandlerThread;

    const-string v0, "com.it_nomads.fluttersecurestorage.worker"

    invoke-direct {p2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lv7/e;->l:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->start()V

    new-instance p2, Landroid/os/Handler;

    iget-object v0, p0, Lv7/e;->l:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lv7/e;->m:Landroid/os/Handler;

    new-instance p2, Lr8/k;

    const-string v0, "plugins.it_nomads.com/flutter_secure_storage"

    invoke-direct {p2, p1, v0}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object p2, p0, Lv7/e;->j:Lr8/k;

    invoke-virtual {p2, p0}, Lr8/k;->e(Lr8/k$c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "FlutterSecureStoragePl"

    const-string v0, "Registration failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 1

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object v0

    invoke-virtual {p1}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lv7/e;->j(Lr8/c;Landroid/content/Context;)V

    return-void
.end method
