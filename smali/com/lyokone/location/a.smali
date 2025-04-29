.class public Lcom/lyokone/location/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/p;
.implements Lr8/m;


# instance fields
.field public A:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public j:Landroid/app/Activity;

.field public k:Lt4/b;

.field private l:Lt4/k;

.field private m:Lcom/google/android/gms/location/LocationRequest;

.field private n:Lt4/f;

.field public o:Lt4/d;

.field private p:Landroid/location/OnNmeaMessageListener;

.field private q:Ljava/lang/Double;

.field private r:J

.field private s:J

.field private t:Ljava/lang/Integer;

.field private u:F

.field public v:Lr8/d$b;

.field public w:Lr8/k$d;

.field private x:Lr8/k$d;

.field public y:Lr8/k$d;

.field private final z:Landroid/location/LocationManager;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/app/Activity;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/lyokone/location/a;->r:J

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/lyokone/location/a;->s:J

    const/16 v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/lyokone/location/a;->t:Ljava/lang/Integer;

    const/4 v0, 0x0

    iput v0, p0, Lcom/lyokone/location/a;->u:F

    new-instance v0, Lcom/lyokone/location/a$a;

    invoke-direct {v0, p0}, Lcom/lyokone/location/a$a;-><init>(Lcom/lyokone/location/a;)V

    iput-object v0, p0, Lcom/lyokone/location/a;->A:Landroid/util/SparseArray;

    iput-object p2, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    const-string p2, "location"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/LocationManager;

    iput-object p1, p0, Lcom/lyokone/location/a;->z:Landroid/location/LocationManager;

    return-void
.end method

.method public static synthetic a(Lcom/lyokone/location/a;Lt4/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lyokone/location/a;->o(Lt4/g;)V

    return-void
.end method

.method public static synthetic c(Lcom/lyokone/location/a;Lr8/k$d;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lyokone/location/a;->n(Lr8/k$d;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lcom/lyokone/location/a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lyokone/location/a;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic e(Lcom/lyokone/location/a;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/lyokone/location/a;->m(Ljava/lang/String;J)V

    return-void
.end method

.method static synthetic f(Lcom/lyokone/location/a;)Ljava/lang/Double;
    .locals 0

    iget-object p0, p0, Lcom/lyokone/location/a;->q:Ljava/lang/Double;

    return-object p0
.end method

.method private g()V
    .locals 2

    new-instance v0, Lt4/f$a;

    invoke-direct {v0}, Lt4/f$a;-><init>()V

    iget-object v1, p0, Lcom/lyokone/location/a;->m:Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {v0, v1}, Lt4/f$a;->a(Lcom/google/android/gms/location/LocationRequest;)Lt4/f$a;

    invoke-virtual {v0}, Lt4/f$a;->b()Lt4/f;

    move-result-object v0

    iput-object v0, p0, Lcom/lyokone/location/a;->n:Lt4/f;

    return-void
.end method

.method private k()V
    .locals 2

    iget-object v0, p0, Lcom/lyokone/location/a;->o:Lt4/d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/lyokone/location/a;->k:Lt4/b;

    invoke-interface {v1, v0}, Lt4/b;->e(Lt4/d;)Lcom/google/android/gms/tasks/Task;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/lyokone/location/a;->o:Lt4/d;

    :cond_0
    new-instance v0, Lcom/lyokone/location/a$b;

    invoke-direct {v0, p0}, Lcom/lyokone/location/a$b;-><init>(Lcom/lyokone/location/a;)V

    iput-object v0, p0, Lcom/lyokone/location/a;->o:Lt4/d;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    new-instance v0, Lx7/b;

    invoke-direct {v0, p0}, Lx7/b;-><init>(Lcom/lyokone/location/a;)V

    iput-object v0, p0, Lcom/lyokone/location/a;->p:Landroid/location/OnNmeaMessageListener;

    :cond_1
    return-void
.end method

.method private l()V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->B()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/lyokone/location/a;->m:Lcom/google/android/gms/location/LocationRequest;

    iget-wide v1, p0, Lcom/lyokone/location/a;->r:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->P(J)Lcom/google/android/gms/location/LocationRequest;

    iget-object v0, p0, Lcom/lyokone/location/a;->m:Lcom/google/android/gms/location/LocationRequest;

    iget-wide v1, p0, Lcom/lyokone/location/a;->s:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->O(J)Lcom/google/android/gms/location/LocationRequest;

    iget-object v0, p0, Lcom/lyokone/location/a;->m:Lcom/google/android/gms/location/LocationRequest;

    iget-object v1, p0, Lcom/lyokone/location/a;->t:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->Q(I)Lcom/google/android/gms/location/LocationRequest;

    iget-object v0, p0, Lcom/lyokone/location/a;->m:Lcom/google/android/gms/location/LocationRequest;

    iget v1, p0, Lcom/lyokone/location/a;->u:F

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->R(F)Lcom/google/android/gms/location/LocationRequest;

    return-void
.end method

.method private synthetic m(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "$"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, ","

    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    aget-object p2, p1, p2

    const-string p3, "$GPGGA"

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    array-length p2, p1

    const/16 p3, 0x9

    if-le p2, p3, :cond_0

    aget-object p2, p1, p3

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    aget-object p1, p1, p3

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/lyokone/location/a;->q:Ljava/lang/Double;

    :cond_0
    return-void
.end method

.method private synthetic n(Lr8/k$d;Ljava/lang/Exception;)V
    .locals 4

    instance-of v0, p2, Lcom/google/android/gms/common/api/k;

    const-string v1, "SERVICE_STATUS_ERROR"

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/common/api/k;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/b;->getStatusCode()I

    move-result v0

    const/4 v3, 0x6

    if-eq v0, v3, :cond_1

    const/16 p2, 0x2136

    if-eq v0, p2, :cond_0

    goto :goto_1

    :cond_0
    const-string p2, "SERVICE_STATUS_DISABLED"

    const-string v0, "Failed to get location. Location services disabled"

    invoke-interface {p1, p2, v0, v2}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    const/16 v3, 0x1001

    invoke-virtual {p2, v0, v3}, Lcom/google/android/gms/common/api/k;->a(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p2, "Could not resolve location request"

    goto :goto_0

    :cond_2
    const-string p2, "Unexpected error type received"

    :goto_0
    invoke-interface {p1, v1, p2, v2}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private synthetic o(Lt4/g;)V
    .locals 3

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Lcom/lyokone/location/a;->z:Landroid/location/LocationManager;

    iget-object v0, p0, Lcom/lyokone/location/a;->p:Landroid/location/OnNmeaMessageListener;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/location/LocationManager;->addNmeaListener(Landroid/location/OnNmeaMessageListener;Landroid/os/Handler;)Z

    :cond_0
    iget-object p1, p0, Lcom/lyokone/location/a;->k:Lt4/b;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/lyokone/location/a;->m:Lcom/google/android/gms/location/LocationRequest;

    iget-object v1, p0, Lcom/lyokone/location/a;->o:Lt4/d;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lt4/b;->f(Lcom/google/android/gms/location/LocationRequest;Lt4/d;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    :cond_1
    return-void
.end method

.method private synthetic p(Ljava/lang/Exception;)V
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/common/api/k;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/common/api/k;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/b;->getStatusCode()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/common/api/k;->a(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "FlutterLocation"

    const-string v0, "PendingIntent unable to execute request."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/common/api/b;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/b;->getStatusCode()I

    move-result v0

    const/16 v1, 0x2136

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p1, v0, :cond_1

    iget-object p1, p0, Lcom/lyokone/location/a;->z:Landroid/location/LocationManager;

    iget-object v0, p0, Lcom/lyokone/location/a;->p:Landroid/location/OnNmeaMessageListener;

    invoke-virtual {p1, v0, v2}, Landroid/location/LocationManager;->addNmeaListener(Landroid/location/OnNmeaMessageListener;Landroid/os/Handler;)Z

    :cond_1
    iget-object p1, p0, Lcom/lyokone/location/a;->k:Lt4/b;

    iget-object v0, p0, Lcom/lyokone/location/a;->m:Lcom/google/android/gms/location/LocationRequest;

    iget-object v1, p0, Lcom/lyokone/location/a;->o:Lt4/d;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lt4/b;->f(Lcom/google/android/gms/location/LocationRequest;Lt4/d;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "UNEXPECTED_ERROR"

    invoke-direct {p0, v0, p1, v2}, Lcom/lyokone/location/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/lyokone/location/a;->y:Lr8/k$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/lyokone/location/a;->y:Lr8/k$d;

    :cond_0
    iget-object v0, p0, Lcom/lyokone/location/a;->v:Lr8/d$b;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lr8/d$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/lyokone/location/a;->v:Lr8/d$b;

    :cond_1
    return-void
.end method


# virtual methods
.method public b(IILandroid/content/Intent;)Z
    .locals 4

    const/4 p3, -0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_3

    const/16 v3, 0x1001

    if-eq p1, v3, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lcom/lyokone/location/a;->x:Lr8/k$d;

    if-nez p1, :cond_1

    return v1

    :cond_1
    if-ne p2, p3, :cond_2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_0
    invoke-interface {p1, p2}, Lr8/k$d;->a(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/lyokone/location/a;->x:Lr8/k$d;

    return v2

    :cond_3
    iget-object p1, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    if-nez p1, :cond_4

    return v1

    :cond_4
    if-ne p2, p3, :cond_5

    invoke-virtual {p0}, Lcom/lyokone/location/a;->w()V

    return v2

    :cond_5
    const-string p2, "SERVICE_STATUS_DISABLED"

    const-string p3, "Failed to get location. Location services disabled"

    invoke-interface {p1, p2, p3, v0}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    return v2
.end method

.method public h(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Lcom/lyokone/location/a;->t:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/lyokone/location/a;->r:J

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/lyokone/location/a;->s:J

    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/lyokone/location/a;->u:F

    invoke-direct {p0}, Lcom/lyokone/location/a;->k()V

    invoke-direct {p0}, Lcom/lyokone/location/a;->l()V

    invoke-direct {p0}, Lcom/lyokone/location/a;->g()V

    invoke-virtual {p0}, Lcom/lyokone/location/a;->w()V

    return-void
.end method

.method public i()Z
    .locals 4

    iget-object v0, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    if-eqz v0, :cond_1

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0, v1}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    const/4 v1, 0x0

    const-string v2, "MISSING_ACTIVITY"

    const-string v3, "You should not checkPermissions activation outside of an activity."

    invoke-interface {v0, v2, v3, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Landroid/content/ActivityNotFoundException;

    invoke-direct {v0}, Landroid/content/ActivityNotFoundException;-><init>()V

    throw v0
.end method

.method public j()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/lyokone/location/a;->z:Landroid/location/LocationManager;

    invoke-virtual {v0}, Landroid/location/LocationManager;->isLocationEnabled()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/lyokone/location/a;->z:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/lyokone/location/a;->z:Landroid/location/LocationManager;

    const-string v2, "network"

    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    if-nez v0, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/lyokone/location/a;->q(I[Ljava/lang/String;[I)Z

    move-result p1

    return p1
.end method

.method public q(I[Ljava/lang/String;[I)Z
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x22

    if-ne p1, v1, :cond_5

    array-length p1, p2

    const/4 v1, 0x1

    if-ne p1, v1, :cond_5

    aget-object p1, p2, v0

    const-string p2, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    aget p1, p3, v0

    const/4 p2, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/lyokone/location/a;->y:Lr8/k$d;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/lyokone/location/a;->v:Lr8/d$b;

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/lyokone/location/a;->w()V

    :cond_1
    iget-object p1, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    if-eqz p1, :cond_4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/lyokone/location/a;->v()Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "PERMISSION_DENIED_NEVER_ASK"

    const-string p3, "Location permission denied forever - please open app settings"

    invoke-direct {p0, p1, p3, p2}, Lcom/lyokone/location/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_0

    :cond_3
    const-string p1, "PERMISSION_DENIED"

    const-string p3, "Location permission denied"

    invoke-direct {p0, p1, p3, p2}, Lcom/lyokone/location/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    if-eqz p1, :cond_4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :goto_0
    invoke-interface {p1, p3}, Lr8/k$d;->a(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    :cond_4
    return v1

    :cond_5
    return v0
.end method

.method public r()V
    .locals 4

    iget-object v0, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/lyokone/location/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x22

    invoke-static {v0, v1, v2}, Landroidx/core/app/b;->n(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    const/4 v1, 0x0

    const-string v2, "MISSING_ACTIVITY"

    const-string v3, "You should not requestPermissions activation outside of an activity."

    invoke-interface {v0, v2, v3, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Landroid/content/ActivityNotFoundException;

    invoke-direct {v0}, Landroid/content/ActivityNotFoundException;-><init>()V

    throw v0
.end method

.method public s(Lr8/k$d;)V
    .locals 3

    iget-object v0, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lcom/lyokone/location/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/lyokone/location/a;->x:Lr8/k$d;

    iget-object v0, p0, Lcom/lyokone/location/a;->l:Lt4/k;

    iget-object v1, p0, Lcom/lyokone/location/a;->n:Lt4/f;

    invoke-interface {v0, v1}, Lt4/k;->b(Lt4/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    new-instance v2, Lx7/d;

    invoke-direct {v2, p0, p1}, Lx7/d;-><init>(Lcom/lyokone/location/a;Lr8/k$d;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Landroid/app/Activity;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :catch_0
    const-string v0, "SERVICE_STATUS_ERROR"

    const-string v2, "Location service status couldn\'t be determined"

    invoke-interface {p1, v0, v2, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string v0, "MISSING_ACTIVITY"

    const-string v2, "You should not requestService activation outside of an activity."

    invoke-interface {p1, v0, v2, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Landroid/content/ActivityNotFoundException;

    invoke-direct {p1}, Landroid/content/ActivityNotFoundException;-><init>()V

    throw p1
.end method

.method u(Landroid/app/Activity;)V
    .locals 2

    iput-object p1, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lt4/e;->a(Landroid/app/Activity;)Lt4/b;

    move-result-object v0

    iput-object v0, p0, Lcom/lyokone/location/a;->k:Lt4/b;

    invoke-static {p1}, Lt4/e;->b(Landroid/app/Activity;)Lt4/k;

    move-result-object p1

    iput-object p1, p0, Lcom/lyokone/location/a;->l:Lt4/k;

    invoke-direct {p0}, Lcom/lyokone/location/a;->k()V

    invoke-direct {p0}, Lcom/lyokone/location/a;->l()V

    invoke-direct {p0}, Lcom/lyokone/location/a;->g()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/lyokone/location/a;->k:Lt4/b;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/lyokone/location/a;->o:Lt4/d;

    invoke-interface {p1, v0}, Lt4/b;->e(Lt4/d;)Lcom/google/android/gms/tasks/Task;

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/lyokone/location/a;->k:Lt4/b;

    iput-object p1, p0, Lcom/lyokone/location/a;->l:Lt4/k;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lcom/lyokone/location/a;->z:Landroid/location/LocationManager;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/lyokone/location/a;->p:Landroid/location/OnNmeaMessageListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeNmeaListener(Landroid/location/OnNmeaMessageListener;)V

    iput-object p1, p0, Lcom/lyokone/location/a;->p:Landroid/location/OnNmeaMessageListener;

    :cond_2
    :goto_0
    return-void
.end method

.method public v()Z
    .locals 2

    iget-object v0, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0, v1}, Landroidx/core/app/b;->o(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public w()V
    .locals 4

    iget-object v0, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/lyokone/location/a;->l:Lt4/k;

    iget-object v1, p0, Lcom/lyokone/location/a;->n:Lt4/f;

    invoke-interface {v0, v1}, Lt4/k;->b(Lt4/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    new-instance v2, Lx7/e;

    invoke-direct {v2, p0}, Lx7/e;-><init>(Lcom/lyokone/location/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Landroid/app/Activity;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    new-instance v2, Lx7/c;

    invoke-direct {v2, p0}, Lx7/c;-><init>(Lcom/lyokone/location/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Landroid/app/Activity;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/lyokone/location/a;->w:Lr8/k$d;

    const/4 v1, 0x0

    const-string v2, "MISSING_ACTIVITY"

    const-string v3, "You should not requestLocation activation outside of an activity."

    invoke-interface {v0, v2, v3, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Landroid/content/ActivityNotFoundException;

    invoke-direct {v0}, Landroid/content/ActivityNotFoundException;-><init>()V

    throw v0
.end method
