.class public final Lcom/google/android/gms/internal/auth/g;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/auth/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final j:I

.field k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/h;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/auth/g;->j:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/auth/g;->j:I

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/g;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/String;)Lcom/google/android/gms/internal/auth/g;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/g;->k:Ljava/lang/String;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/auth/g;->j:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/g;->k:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
