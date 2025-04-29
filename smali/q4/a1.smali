.class public final Lq4/a1;
.super Lq4/a;
.source "SourceFile"

# interfaces
.implements Lq4/b1;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-direct {p0, p1, v0}, Lq4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final O0(Lt4/f;Lq4/d1;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Lq4/a;->p()Landroid/os/Parcel;

    move-result-object p3

    invoke-static {p3, p1}, Lq4/m;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p3, p2}, Lq4/m;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p1, 0x3f

    invoke-virtual {p0, p1, p3}, Lq4/a;->x(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final T(Lq4/b0;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/common/api/internal/g;)V
    .locals 1

    invoke-virtual {p0}, Lq4/a;->p()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lq4/m;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lq4/m;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lq4/m;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x58

    invoke-virtual {p0, p1, v0}, Lq4/a;->x(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final X(Lq4/b0;Lcom/google/android/gms/common/api/internal/g;)V
    .locals 1

    invoke-virtual {p0}, Lq4/a;->p()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lq4/m;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lq4/m;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x59

    invoke-virtual {p0, p1, v0}, Lq4/a;->x(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final n0(Lq4/f0;)V
    .locals 1

    invoke-virtual {p0}, Lq4/a;->p()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lq4/m;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x3b

    invoke-virtual {p0, p1, v0}, Lq4/a;->x(ILandroid/os/Parcel;)V

    return-void
.end method
