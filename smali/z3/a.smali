.class public Lz3/a;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz3/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final j:I

.field private k:I

.field private l:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz3/d;

    invoke-direct {v0}, Lz3/d;-><init>()V

    sput-object v0, Lz3/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lz3/a;->j:I

    iput p2, p0, Lz3/a;->k:I

    iput-object p3, p0, Lz3/a;->l:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public B()I
    .locals 1

    iget v0, p0, Lz3/a;->k:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lz3/a;->j:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz3/a;->B()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lz3/a;->l:Landroid/os/Bundle;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ld4/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
