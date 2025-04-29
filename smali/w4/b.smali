.class public final Lw4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lr4/s;


# direct methods
.method public static a()Lw4/a;
    .locals 2

    :try_start_0
    new-instance v0, Lw4/a;

    invoke-static {}, Lw4/b;->f()Lr4/s;

    move-result-object v1

    invoke-interface {v1}, Lr4/s;->zzd()Lk4/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lw4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static b(F)Lw4/a;
    .locals 2

    :try_start_0
    new-instance v0, Lw4/a;

    invoke-static {}, Lw4/b;->f()Lr4/s;

    move-result-object v1

    invoke-interface {v1, p0}, Lr4/s;->v0(F)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lw4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lw4/t;

    invoke-direct {v0, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static c(Ljava/lang/String;)Lw4/a;
    .locals 2

    const-string v0, "assetName must not be null"

    invoke-static {p0, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lw4/a;

    invoke-static {}, Lw4/b;->f()Lr4/s;

    move-result-object v1

    invoke-interface {v1, p0}, Lr4/s;->L0(Ljava/lang/String;)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lw4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lw4/t;

    invoke-direct {v0, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static d(Landroid/graphics/Bitmap;)Lw4/a;
    .locals 2

    const-string v0, "image must not be null"

    invoke-static {p0, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lw4/a;

    invoke-static {}, Lw4/b;->f()Lr4/s;

    move-result-object v1

    invoke-interface {v1, p0}, Lr4/s;->Y0(Landroid/graphics/Bitmap;)Lk4/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lw4/a;-><init>(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lw4/t;

    invoke-direct {v0, p0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static e(Lr4/s;)V
    .locals 1

    sget-object v0, Lw4/b;->a:Lr4/s;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "delegate must not be null"

    invoke-static {p0, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr4/s;

    sput-object p0, Lw4/b;->a:Lr4/s;

    return-void
.end method

.method private static f()Lr4/s;
    .locals 2

    sget-object v0, Lw4/b;->a:Lr4/s;

    const-string v1, "IBitmapDescriptorFactory is not initialized"

    invoke-static {v0, v1}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr4/s;

    return-object v0
.end method
