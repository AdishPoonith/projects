.class final Lcom/lyokone/location/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;


# instance fields
.field private j:Lcom/lyokone/location/a;

.field private k:Lcom/lyokone/location/FlutterLocationService;

.field private l:Lr8/k;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lr8/j;Lr8/k$d;)V
    .locals 2

    const-string v0, "enable"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/lyokone/location/c;->k:Lcom/lyokone/location/FlutterLocationService;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lcom/lyokone/location/FlutterLocationService;->b()Z

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/lyokone/location/c;->k:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {p1}, Lcom/lyokone/location/FlutterLocationService;->d()V

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/lyokone/location/c;->k:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {p1, p2}, Lcom/lyokone/location/FlutterLocationService;->l(Lr8/k$d;)V

    iget-object p1, p0, Lcom/lyokone/location/c;->k:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {p1}, Lcom/lyokone/location/FlutterLocationService;->j()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/lyokone/location/c;->k:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {p1}, Lcom/lyokone/location/FlutterLocationService;->c()V

    :cond_2
    invoke-interface {p2, v1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private b(Lr8/k$d;)V
    .locals 1

    iget-object v0, p0, Lcom/lyokone/location/c;->k:Lcom/lyokone/location/FlutterLocationService;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/lyokone/location/FlutterLocationService;->i()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private c(Lr8/j;Lr8/k$d;)V
    .locals 10

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "channelName"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Location background service"

    :goto_0
    move-object v3, v1

    const-string v1, "title"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "Location background service running"

    :goto_1
    move-object v4, v1

    const-string v1, "iconName"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "navigation_empty_icon"

    :goto_2
    move-object v5, v1

    const-string v1, "subtitle"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    const-string v1, "description"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    const-string v1, "onTapBringToFront"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_3

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_3
    const-string v2, "color"

    invoke-virtual {p1, v2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v8, p1

    goto :goto_3

    :cond_4
    move-object v8, v0

    :goto_3
    new-instance p1, Lx7/f;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Lx7/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V

    iget-object v1, p0, Lcom/lyokone/location/c;->k:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v1, p1}, Lcom/lyokone/location/FlutterLocationService;->a(Lx7/f;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "An unexpected error happened during notification options change:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "CHANGE_NOTIFICATION_OPTIONS_ERROR"

    invoke-interface {p2, v1, p1, v0}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method private d(Lr8/j;Lr8/k$d;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    iget-object v0, v0, Lcom/lyokone/location/a;->A:Landroid/util/SparseArray;

    const-string v1, "accuracy"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    new-instance v1, Ljava/lang/Long;

    const-string v2, "interval"

    invoke-virtual {p1, v2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x2

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ljava/lang/Float;

    const-string v4, "distanceFilter"

    invoke-virtual {p1, v4}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/lang/Float;-><init>(D)V

    iget-object p1, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/lyokone/location/a;->h(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)V

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An unexcepted error happened during location settings change:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "CHANGE_SETTINGS_ERROR"

    invoke-interface {p2, v1, p1, v0}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private e(Lr8/k$d;)V
    .locals 1

    iget-object v0, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    iput-object p1, v0, Lcom/lyokone/location/a;->y:Lr8/k$d;

    invoke-virtual {v0}, Lcom/lyokone/location/a;->i()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    invoke-virtual {p1}, Lcom/lyokone/location/a;->r()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    invoke-virtual {p1}, Lcom/lyokone/location/a;->w()V

    :goto_0
    return-void
.end method

.method private f(Lr8/k$d;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    invoke-interface {p1, v1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    invoke-virtual {v0}, Lcom/lyokone/location/a;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, v1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private g(Lr8/k$d;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    iput-object p1, v0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    invoke-virtual {v0}, Lcom/lyokone/location/a;->r()V

    return-void
.end method

.method private h(Lr8/k$d;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    invoke-virtual {v0}, Lcom/lyokone/location/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v0, 0x0

    const-string v1, "SERVICE_STATUS_ERROR"

    const-string v2, "Location service status couldn\'t be determined"

    invoke-interface {p1, v1, v2, v0}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 3

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "changeSettings"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "requestPermission"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_2
    const-string v1, "serviceEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_3
    const-string v1, "changeNotificationOptions"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_4
    const-string v1, "hasPermission"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_5
    const-string v1, "requestService"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_6
    const-string v1, "getLocation"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_7
    const-string v1, "enableBackgroundMode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_8
    const-string v1, "isBackgroundModeEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lr8/k$d;->c()V

    goto :goto_1

    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/lyokone/location/c;->d(Lr8/j;Lr8/k$d;)V

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p2}, Lcom/lyokone/location/c;->g(Lr8/k$d;)V

    goto :goto_1

    :pswitch_2
    invoke-direct {p0, p2}, Lcom/lyokone/location/c;->h(Lr8/k$d;)V

    goto :goto_1

    :pswitch_3
    invoke-direct {p0, p1, p2}, Lcom/lyokone/location/c;->c(Lr8/j;Lr8/k$d;)V

    goto :goto_1

    :pswitch_4
    invoke-direct {p0, p2}, Lcom/lyokone/location/c;->f(Lr8/k$d;)V

    goto :goto_1

    :pswitch_5
    iget-object p1, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    invoke-virtual {p1, p2}, Lcom/lyokone/location/a;->s(Lr8/k$d;)V

    goto :goto_1

    :pswitch_6
    invoke-direct {p0, p2}, Lcom/lyokone/location/c;->e(Lr8/k$d;)V

    goto :goto_1

    :pswitch_7
    invoke-direct {p0, p1, p2}, Lcom/lyokone/location/c;->a(Lr8/j;Lr8/k$d;)V

    goto :goto_1

    :pswitch_8
    invoke-direct {p0, p2}, Lcom/lyokone/location/c;->b(Lr8/k$d;)V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x39fbb8fa -> :sswitch_8
        -0x2b2eb3ac -> :sswitch_7
        -0x12d622d5 -> :sswitch_6
        0x7a13d26 -> :sswitch_5
        0xa3e3c09 -> :sswitch_4
        0x1c38fd63 -> :sswitch_3
        0x268e56cc -> :sswitch_2
        0x2c7fedbe -> :sswitch_1
        0x447d83f3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method i(Lcom/lyokone/location/a;)V
    .locals 0

    iput-object p1, p0, Lcom/lyokone/location/c;->j:Lcom/lyokone/location/a;

    return-void
.end method

.method j(Lcom/lyokone/location/FlutterLocationService;)V
    .locals 0

    iput-object p1, p0, Lcom/lyokone/location/c;->k:Lcom/lyokone/location/FlutterLocationService;

    return-void
.end method

.method k(Lr8/c;)V
    .locals 2

    iget-object v0, p0, Lcom/lyokone/location/c;->l:Lr8/k;

    if-eqz v0, :cond_0

    const-string v0, "MethodCallHandlerImpl"

    const-string v1, "Setting a method call handler before the last was disposed."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/lyokone/location/c;->l()V

    :cond_0
    new-instance v0, Lr8/k;

    const-string v1, "lyokone/location"

    invoke-direct {v0, p1, v1}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/lyokone/location/c;->l:Lr8/k;

    invoke-virtual {v0, p0}, Lr8/k;->e(Lr8/k$c;)V

    return-void
.end method

.method l()V
    .locals 2

    iget-object v0, p0, Lcom/lyokone/location/c;->l:Lr8/k;

    if-nez v0, :cond_0

    const-string v0, "MethodCallHandlerImpl"

    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr8/k;->e(Lr8/k$c;)V

    iput-object v1, p0, Lcom/lyokone/location/c;->l:Lr8/k;

    return-void
.end method
