.class public final Lv4/f0;
.super Lr4/a;
.source "SourceFile"

# interfaces
.implements Lv4/g0;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.maps.internal.ICreator"

    invoke-direct {p0, p1, v0}, Lr4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final D1(Lk4/b;I)V
    .locals 1

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lr4/p;->f(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lr4/a;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final J0(Lk4/b;I)V
    .locals 1

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lr4/p;->f(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p1, 0xa

    invoke-virtual {p0, p1, v0}, Lr4/a;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final R0(Lk4/b;Lcom/google/android/gms/maps/GoogleMapOptions;)Lv4/c;
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lr4/p;->f(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lr4/p;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lr4/a;->p(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.maps.internal.IMapViewDelegate"

    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lv4/c;

    if-eqz v1, :cond_1

    move-object p2, v0

    check-cast p2, Lv4/c;

    goto :goto_0

    :cond_1
    new-instance v0, Lv4/i0;

    invoke-direct {v0, p2}, Lv4/i0;-><init>(Landroid/os/IBinder;)V

    move-object p2, v0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

.method public final zzd()I
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {p0, v1, v0}, Lr4/a;->p(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v1
.end method

.method public final zze()Lv4/a;
    .locals 4

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Lr4/a;->p(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, Lv4/a;

    if-eqz v3, :cond_1

    move-object v1, v2

    check-cast v1, Lv4/a;

    goto :goto_0

    :cond_1
    new-instance v2, Lv4/u;

    invoke-direct {v2, v1}, Lv4/u;-><init>(Landroid/os/IBinder;)V

    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method

.method public final zzj()Lr4/s;
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p0, v1, v0}, Lr4/a;->p(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lr4/r;->x(Landroid/os/IBinder;)Lr4/s;

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method
