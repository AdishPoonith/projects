.class public abstract Lq4/y0;
.super Lq4/e;
.source "SourceFile"

# interfaces
.implements Lq4/z0;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IFusedLocationProviderCallback"

    invoke-direct {p0, v0}, Lq4/e;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final p(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p0}, Lq4/z0;->zze()V

    goto :goto_0

    :cond_1
    sget-object p1, Lq4/v0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lq4/m;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lq4/v0;

    invoke-static {p2}, Lq4/m;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lq4/z0;->d0(Lq4/v0;)V

    :goto_0
    return p3
.end method
