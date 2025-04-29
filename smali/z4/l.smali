.class public final Lz4/l;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz4/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final j:I

.field private final k:Lb4/b;

.field private final l:Lc4/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz4/m;

    invoke-direct {v0}, Lz4/m;-><init>()V

    sput-object v0, Lz4/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILb4/b;Lc4/t0;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lz4/l;->j:I

    iput-object p2, p0, Lz4/l;->k:Lb4/b;

    iput-object p3, p0, Lz4/l;->l:Lc4/t0;

    return-void
.end method


# virtual methods
.method public final B()Lb4/b;
    .locals 1

    iget-object v0, p0, Lz4/l;->k:Lb4/b;

    return-object v0
.end method

.method public final C()Lc4/t0;
    .locals 1

    iget-object v0, p0, Lz4/l;->l:Lc4/t0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lz4/l;->j:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lz4/l;->k:Lb4/b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lz4/l;->l:Lc4/t0;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
