.class public final Lcom/lyokone/location/FlutterLocationService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lr8/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lyokone/location/FlutterLocationService$a;,
        Lcom/lyokone/location/FlutterLocationService$b;
    }
.end annotation


# static fields
.field public static final p:Lcom/lyokone/location/FlutterLocationService$a;


# instance fields
.field private final j:Lcom/lyokone/location/FlutterLocationService$b;

.field private k:Z

.field private l:Landroid/app/Activity;

.field private m:Lx7/a;

.field private n:Lcom/lyokone/location/a;

.field private o:Lr8/k$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/lyokone/location/FlutterLocationService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/lyokone/location/FlutterLocationService$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/lyokone/location/FlutterLocationService;->p:Lcom/lyokone/location/FlutterLocationService$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/lyokone/location/FlutterLocationService$b;

    invoke-direct {v0, p0}, Lcom/lyokone/location/FlutterLocationService$b;-><init>(Lcom/lyokone/location/FlutterLocationService;)V

    iput-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->j:Lcom/lyokone/location/FlutterLocationService$b;

    return-void
.end method

.method private final m()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->l:Landroid/app/Activity;

    if-eqz v0, :cond_0

    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-static {v0, v1}, Landroidx/core/app/b;->o(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/content/ActivityNotFoundException;

    invoke-direct {v0}, Landroid/content/ActivityNotFoundException;-><init>()V

    throw v0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final a(Lx7/f;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/f;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->m:Lx7/a;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/lyokone/location/FlutterLocationService;->k:Z

    invoke-virtual {v0, p1, v1}, Lx7/a;->f(Lx7/f;Z)V

    :cond_0
    iget-boolean p1, p0, Lcom/lyokone/location/FlutterLocationService;->k:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    new-array p1, p1, [Ls9/m;

    const/4 v0, 0x0

    const-string v1, "channelId"

    const-string v2, "flutter_location_channel_01"

    invoke-static {v1, v2}, Ls9/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Ls9/m;

    move-result-object v1

    aput-object v1, p1, v0

    const/4 v0, 0x1

    const v1, 0x1269a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "notificationId"

    invoke-static {v2, v1}, Ls9/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Ls9/m;

    move-result-object v1

    aput-object v1, p1, v0

    invoke-static {p1}, Lt9/d0;->f([Ls9/m;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final b()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_1

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->l:Landroid/app/Activity;

    if-eqz v0, :cond_0

    const-string v2, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-static {v0, v2}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/content/ActivityNotFoundException;

    invoke-direct {v0}, Landroid/content/ActivityNotFoundException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->n:Lcom/lyokone/location/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/lyokone/location/a;->i()Z

    move-result v1

    :cond_2
    :goto_0
    return v1
.end method

.method public final c()V
    .locals 3

    const-string v0, "FlutterLocationService"

    const-string v1, "Stop service in foreground."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x18

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v1}, Landroid/app/Service;->stopForeground(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Landroid/app/Service;->stopForeground(Z)V

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/lyokone/location/FlutterLocationService;->k:Z

    return-void
.end method

.method public final d()V
    .locals 2

    iget-boolean v0, p0, Lcom/lyokone/location/FlutterLocationService;->k:Z

    const-string v1, "FlutterLocationService"

    if-eqz v0, :cond_0

    const-string v0, "Service already in foreground mode."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string v0, "Start service in foreground mode."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->m:Lx7/a;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lx7/a;->a()Landroid/app/Notification;

    move-result-object v0

    const v1, 0x1269a

    invoke-virtual {p0, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/lyokone/location/FlutterLocationService;->k:Z

    :goto_0
    return-void
.end method

.method public final e()Lcom/lyokone/location/a;
    .locals 1

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->n:Lcom/lyokone/location/a;

    return-object v0
.end method

.method public final f()Lr8/m;
    .locals 1

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->n:Lcom/lyokone/location/a;

    return-object v0
.end method

.method public final g()Lr8/p;
    .locals 1

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->n:Lcom/lyokone/location/a;

    return-object v0
.end method

.method public final h()Lr8/p;
    .locals 0

    return-object p0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/lyokone/location/FlutterLocationService;->k:Z

    return v0
.end method

.method public final j()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_2

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->l:Landroid/app/Activity;

    if-eqz v0, :cond_0

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const-string v2, "android.permission.ACCESS_BACKGROUND_LOCATION"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x281

    invoke-static {v0, v1, v2}, Landroidx/core/app/b;->n(Landroid/app/Activity;[Ljava/lang/String;I)V

    sget-object v1, Ls9/u;->a:Ls9/u;

    :cond_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Landroid/content/ActivityNotFoundException;

    invoke-direct {v0}, Landroid/content/ActivityNotFoundException;-><init>()V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->n:Lcom/lyokone/location/a;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/lyokone/location/FlutterLocationService;->o:Lr8/k$d;

    iput-object v2, v0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/lyokone/location/a;->r()V

    :cond_4
    iput-object v1, p0, Lcom/lyokone/location/FlutterLocationService;->o:Lr8/k$d;

    :goto_1
    return-void
.end method

.method public final k(Landroid/app/Activity;)V
    .locals 1

    iput-object p1, p0, Lcom/lyokone/location/FlutterLocationService;->l:Landroid/app/Activity;

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->n:Lcom/lyokone/location/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/lyokone/location/a;->u(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public final l(Lr8/k$d;)V
    .locals 0

    iput-object p1, p0, Lcom/lyokone/location/FlutterLocationService;->o:Lr8/k$d;

    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string p1, "FlutterLocationService"

    const-string v0, "Binding to location service."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/lyokone/location/FlutterLocationService;->j:Lcom/lyokone/location/FlutterLocationService$b;

    return-object p1
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "FlutterLocationService"

    const-string v1, "Creating service."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/lyokone/location/a;

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/lyokone/location/a;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->n:Lcom/lyokone/location/a;

    new-instance v0, Lx7/a;

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "flutter_location_channel_01"

    const v3, 0x1269a

    invoke-direct {v0, v1, v2, v3}, Lx7/a;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->m:Lx7/a;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "FlutterLocationService"

    const-string v1, "Destroying service."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->n:Lcom/lyokone/location/a;

    iput-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->m:Lx7/a;

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 3

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_3

    const/16 v0, 0x281

    if-ne p1, v0, :cond_3

    array-length p1, p2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    aget-object p1, p2, v1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    aget-object p2, p2, p1

    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    aget p2, p3, v1

    const/4 v0, 0x0

    if-nez p2, :cond_0

    aget p2, p3, p1

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/lyokone/location/FlutterLocationService;->d()V

    iget-object p2, p0, Lcom/lyokone/location/FlutterLocationService;->o:Lr8/k$d;

    if-eqz p2, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lcom/lyokone/location/FlutterLocationService;->m()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/lyokone/location/FlutterLocationService;->o:Lr8/k$d;

    if-eqz p1, :cond_2

    const-string p2, "PERMISSION_DENIED_NEVER_ASK"

    const-string p3, "Background location permission denied forever - please open app settings"

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/lyokone/location/FlutterLocationService;->o:Lr8/k$d;

    if-eqz p1, :cond_2

    const-string p2, "PERMISSION_DENIED"

    const-string p3, "Background location permission denied"

    :goto_0
    invoke-interface {p1, p2, p3, v0}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_1
    iput-object v0, p0, Lcom/lyokone/location/FlutterLocationService;->o:Lr8/k$d;

    :cond_3
    return v1
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 2

    const-string v0, "FlutterLocationService"

    const-string v1, "Unbinding from location service."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method
