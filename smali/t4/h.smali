.class public final Lt4/h;
.super Ld4/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/m;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lt4/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Lcom/google/android/gms/common/api/Status;

.field private final k:Lt4/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt4/l;

    invoke-direct {v0}, Lt4/l;-><init>()V

    sput-object v0, Lt4/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lt4/i;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput-object p1, p0, Lt4/h;->j:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lt4/h;->k:Lt4/i;

    return-void
.end method


# virtual methods
.method public B()Lt4/i;
    .locals 1

    iget-object v0, p0, Lt4/h;->k:Lt4/i;

    return-object v0
.end method

.method public p()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lt4/h;->j:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lt4/h;->p()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lt4/h;->B()Lt4/i;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
