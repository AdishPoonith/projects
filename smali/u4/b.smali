.class public final Lu4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lv4/a;


# direct methods
.method public static a(Lcom/google/android/gms/maps/model/CameraPosition;)Lu4/a;
    .locals 2

    const-string v0, "cameraPosition must not be null"

    invoke-static {p0, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lv4/a;->A0(Lcom/google/android/gms/maps/model/CameraPosition;)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lw4/t;

    invoke-direct {v0, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static b(Lcom/google/android/gms/maps/model/LatLng;)Lu4/a;
    .locals 2

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lv4/a;->k1(Lcom/google/android/gms/maps/model/LatLng;)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lw4/t;

    invoke-direct {v0, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static c(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lu4/a;
    .locals 2

    const-string v0, "bounds must not be null"

    invoke-static {p0, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Lv4/a;->S(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lw4/t;

    invoke-direct {p1, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static d(Lcom/google/android/gms/maps/model/LatLng;F)Lu4/a;
    .locals 2

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Lv4/a;->W1(Lcom/google/android/gms/maps/model/LatLng;F)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lw4/t;

    invoke-direct {p1, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static e(FF)Lu4/a;
    .locals 2

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Lv4/a;->Z1(FF)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lw4/t;

    invoke-direct {p1, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static f(F)Lu4/a;
    .locals 2

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lv4/a;->W(F)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lw4/t;

    invoke-direct {v0, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static g(FLandroid/graphics/Point;)Lu4/a;
    .locals 3

    const-string v0, "focus must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    iget v2, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-interface {v1, p0, v2, p1}, Lv4/a;->v2(FII)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lw4/t;

    invoke-direct {p1, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static h()Lu4/a;
    .locals 2

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1}, Lv4/a;->M1()Lk4/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static i()Lu4/a;
    .locals 2

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1}, Lv4/a;->Z0()Lk4/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static j(F)Lu4/a;
    .locals 2

    :try_start_0
    new-instance v0, Lu4/a;

    invoke-static {}, Lu4/b;->l()Lv4/a;

    move-result-object v1

    invoke-interface {v1, p0}, Lv4/a;->L1(F)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lu4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lw4/t;

    invoke-direct {v0, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static k(Lv4/a;)V
    .locals 0

    invoke-static {p0}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv4/a;

    sput-object p0, Lu4/b;->a:Lv4/a;

    return-void
.end method

.method private static l()Lv4/a;
    .locals 2

    sget-object v0, Lu4/b;->a:Lv4/a;

    const-string v1, "CameraUpdateFactory is not initialized"

    invoke-static {v0, v1}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv4/a;

    return-object v0
.end method
