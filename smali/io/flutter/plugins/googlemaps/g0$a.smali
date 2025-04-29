.class final Lio/flutter/plugins/googlemaps/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemaps/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/CountDownLatch;

.field private final b:I

.field private final c:I

.field private final d:I

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation
.end field

.field final synthetic f:Lio/flutter/plugins/googlemaps/g0;


# direct methods
.method constructor <init>(Lio/flutter/plugins/googlemaps/g0;III)V
    .locals 1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/g0$a;->f:Lio/flutter/plugins/googlemaps/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/g0$a;->a:Ljava/util/concurrent/CountDownLatch;

    iput p2, p0, Lio/flutter/plugins/googlemaps/g0$a;->b:I

    iput p3, p0, Lio/flutter/plugins/googlemaps/g0$a;->c:I

    iput p4, p0, Lio/flutter/plugins/googlemaps/g0$a;->d:I

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/googlemaps/g0$a;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/g0$a;->f()V

    return-void
.end method

.method private synthetic f()V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/g0$a;->f:Lio/flutter/plugins/googlemaps/g0;

    iget-object v1, v0, Lio/flutter/plugins/googlemaps/g0;->c:Lr8/k;

    iget-object v0, v0, Lio/flutter/plugins/googlemaps/g0;->b:Ljava/lang/String;

    iget v2, p0, Lio/flutter/plugins/googlemaps/g0$a;->b:I

    iget v3, p0, Lio/flutter/plugins/googlemaps/g0$a;->c:I

    iget v4, p0, Lio/flutter/plugins/googlemaps/g0$a;->d:I

    invoke-static {v0, v2, v3, v4}, Lio/flutter/plugins/googlemaps/e;->r(Ljava/lang/String;III)Ljava/util/Map;

    move-result-object v0

    const-string v2, "tileOverlay#getTile"

    invoke-virtual {v1, v2, v0, p0}, Lr8/k;->d(Ljava/lang/String;Ljava/lang/Object;Lr8/k$d;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/g0$a;->e:Ljava/util/Map;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/g0$a;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Can\'t get tile: errorCode = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", date = "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TileProviderController"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/g0$a;->e:Ljava/util/Map;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/g0$a;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "TileProviderController"

    const-string v1, "Can\'t get tile: notImplemented"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/g0$a;->e:Ljava/util/Map;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/g0$a;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method e()Lw4/y;
    .locals 5

    const-string v0, "TileProviderController"

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/g0$a;->f:Lio/flutter/plugins/googlemaps/g0;

    iget-object v1, v1, Lio/flutter/plugins/googlemaps/g0;->d:Landroid/os/Handler;

    new-instance v2, Lio/flutter/plugins/googlemaps/f0;

    invoke-direct {v2, p0}, Lio/flutter/plugins/googlemaps/f0;-><init>(Lio/flutter/plugins/googlemaps/g0$a;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/googlemaps/g0$a;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v1, p0, Lio/flutter/plugins/googlemaps/g0$a;->e:Ljava/util/Map;

    invoke-static {v1}, Lio/flutter/plugins/googlemaps/e;->j(Ljava/util/Map;)Lw4/y;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Can\'t parse tile data"

    :goto_0
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object v0, Lw4/b0;->a:Lw4/y;

    return-object v0

    :catch_1
    move-exception v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lio/flutter/plugins/googlemaps/g0$a;->b:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget v4, p0, Lio/flutter/plugins/googlemaps/g0$a;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget v4, p0, Lio/flutter/plugins/googlemaps/g0$a;->d:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "countDownLatch: can\'t get tile: x = %d, y= %d, zoom = %d"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method
