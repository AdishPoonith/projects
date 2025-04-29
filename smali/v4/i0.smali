.class public final Lv4/i0;
.super Lr4/a;
.source "SourceFile"

# interfaces
.implements Lv4/c;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.maps.internal.IMapViewDelegate"

    invoke-direct {p0, p1, v0}, Lr4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final H()V
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p0, v1, v0}, Lr4/a;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final I(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lr4/p;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lr4/a;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final P0(Lv4/p;)V
    .locals 1

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lr4/p;->f(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x9

    invoke-virtual {p0, p1, v0}, Lr4/a;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lr4/p;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 v1, 0x7

    invoke-virtual {p0, v1, v0}, Lr4/a;->p(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lr4/a;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final d()V
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {p0, v1, v0}, Lr4/a;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final r()V
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lr4/a;->M(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final w()Lk4/b;
    .locals 2

    invoke-virtual {p0}, Lr4/a;->x()Landroid/os/Parcel;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lr4/a;->p(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lk4/b$a;->x(Landroid/os/IBinder;)Lk4/b;

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v1
.end method
