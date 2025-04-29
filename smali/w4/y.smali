.class public final Lw4/y;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:I

.field public final k:I

.field public final l:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/u0;

    invoke-direct {v0}, Lw4/u0;-><init>()V

    sput-object v0, Lw4/y;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II[B)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lw4/y;->j:I

    iput p2, p0, Lw4/y;->k:I

    iput-object p3, p0, Lw4/y;->l:[B

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lw4/y;->j:I

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget v0, p0, Lw4/y;->k:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lw4/y;->l:[B

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ld4/c;->g(Landroid/os/Parcel;I[BZ)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
