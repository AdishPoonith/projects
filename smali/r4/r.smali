.class public abstract Lr4/r;
.super Lr4/o;
.source "SourceFile"

# interfaces
.implements Lr4/s;


# direct methods
.method public static x(Landroid/os/IBinder;)Lr4/s;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lr4/s;

    if-eqz v1, :cond_1

    check-cast v0, Lr4/s;

    return-object v0

    :cond_1
    new-instance v0, Lr4/q;

    invoke-direct {v0, p0}, Lr4/q;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
