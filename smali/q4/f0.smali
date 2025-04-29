.class public final Lq4/f0;
.super Ld4/a;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lq4/f0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:I

.field private final k:Lq4/d0;

.field private final l:Lt4/y;

.field private final m:Lt4/v;

.field private final n:Landroid/app/PendingIntent;

.field private final o:Lq4/z0;

.field private final p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq4/g0;

    invoke-direct {v0}, Lq4/g0;-><init>()V

    sput-object v0, Lq4/f0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILq4/d0;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lq4/f0;->j:I

    iput-object p2, p0, Lq4/f0;->k:Lq4/d0;

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    invoke-static {p3}, Lt4/x;->x(Landroid/os/IBinder;)Lt4/y;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p0, Lq4/f0;->l:Lt4/y;

    iput-object p5, p0, Lq4/f0;->n:Landroid/app/PendingIntent;

    if-eqz p4, :cond_1

    invoke-static {p4}, Lt4/u;->x(Landroid/os/IBinder;)Lt4/v;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, p1

    :goto_1
    iput-object p2, p0, Lq4/f0;->m:Lt4/v;

    if-eqz p6, :cond_3

    const-string p1, "com.google.android.gms.location.internal.IFusedLocationProviderCallback"

    invoke-interface {p6, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    instance-of p2, p1, Lq4/z0;

    if-eqz p2, :cond_2

    check-cast p1, Lq4/z0;

    goto :goto_2

    :cond_2
    new-instance p1, Lq4/x0;

    invoke-direct {p1, p6}, Lq4/x0;-><init>(Landroid/os/IBinder;)V

    :cond_3
    :goto_2
    iput-object p1, p0, Lq4/f0;->o:Lq4/z0;

    iput-object p7, p0, Lq4/f0;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lq4/f0;->j:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lq4/f0;->k:Lq4/d0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lq4/f0;->l:Lt4/y;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    :goto_0
    const/4 v4, 0x3

    invoke-static {p1, v4, v1, v3}, Ld4/c;->k(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v1, 0x4

    iget-object v4, p0, Lq4/f0;->n:Landroid/app/PendingIntent;

    invoke-static {p1, v1, v4, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lq4/f0;->m:Lt4/v;

    if-nez p2, :cond_1

    move-object p2, v2

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_1
    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Ld4/c;->k(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object p2, p0, Lq4/f0;->o:Lq4/z0;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    :goto_2
    const/4 p2, 0x6

    invoke-static {p1, p2, v2, v3}, Ld4/c;->k(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/16 p2, 0x8

    iget-object v1, p0, Lq4/f0;->p:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
