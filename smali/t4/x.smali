.class public abstract Lt4/x;
.super Lq4/e;
.source "SourceFile"

# interfaces
.implements Lt4/y;


# direct methods
.method public static x(Landroid/os/IBinder;)Lt4/y;
    .locals 2

    const-string v0, "com.google.android.gms.location.ILocationListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lt4/y;

    if-eqz v1, :cond_0

    check-cast v0, Lt4/y;

    return-object v0

    :cond_0
    new-instance v0, Lt4/w;

    invoke-direct {v0, p0}, Lt4/w;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
