.class public final Lu4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lv4/d;


# direct methods
.method constructor <init>(Lv4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/h;->a:Lv4/d;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lu4/h;->a:Lv4/d;

    invoke-static {p1}, Lk4/d;->H2(Ljava/lang/Object;)Lk4/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lv4/d;->f1(Lk4/b;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public b()Lw4/c0;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/h;->a:Lv4/d;

    invoke-interface {v0}, Lv4/d;->S1()Lw4/c0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;
    .locals 1

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lu4/h;->a:Lv4/d;

    invoke-interface {v0, p1}, Lv4/d;->o1(Lcom/google/android/gms/maps/model/LatLng;)Lk4/b;

    move-result-object p1

    invoke-static {p1}, Lk4/d;->M(Lk4/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Point;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
