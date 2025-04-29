.class public abstract Lr4/x;
.super Lr4/o;
.source "SourceFile"

# interfaces
.implements Lr4/b;


# direct methods
.method public static x(Landroid/os/IBinder;)Lr4/b;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.maps.model.internal.IMarkerDelegate"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lr4/b;

    if-eqz v1, :cond_1

    check-cast v0, Lr4/b;

    return-object v0

    :cond_1
    new-instance v0, Lr4/w;

    invoke-direct {v0, p0}, Lr4/w;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
