.class public final Lc4/i1;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc4/i1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field j:Landroid/os/Bundle;

.field k:[Lb4/d;

.field l:I

.field m:Lc4/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc4/j1;

    invoke-direct {v0}, Lc4/j1;-><init>()V

    sput-object v0, Lc4/i1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;[Lb4/d;ILc4/f;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput-object p1, p0, Lc4/i1;->j:Landroid/os/Bundle;

    iput-object p2, p0, Lc4/i1;->k:[Lb4/d;

    iput p3, p0, Lc4/i1;->l:I

    iput-object p4, p0, Lc4/i1;->m:Lc4/f;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lc4/i1;->j:Landroid/os/Bundle;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Ld4/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v1, p0, Lc4/i1;->k:[Lb4/d;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->u(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget v1, p0, Lc4/i1;->l:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lc4/i1;->m:Lc4/f;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
