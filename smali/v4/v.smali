.class public abstract Lv4/v;
.super Lr4/o;
.source "SourceFile"

# interfaces
.implements Lv4/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.maps.internal.IOnPolygonClickListener"

    invoke-direct {p0, v0}, Lr4/o;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final p(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p4, 0x1

    if-ne p1, p4, :cond_0

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lr4/d;->x(Landroid/os/IBinder;)Lr4/e;

    move-result-object p1

    invoke-static {p2}, Lr4/p;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lv4/w;->r2(Lr4/e;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return p4

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
