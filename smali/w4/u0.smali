.class public final Lw4/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 7

    invoke-static {p1}, Ld4/b;->z(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v0, :cond_3

    invoke-static {p1}, Ld4/b;->q(Landroid/os/Parcel;)I

    move-result v4

    invoke-static {v4}, Ld4/b;->j(I)I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_2

    const/4 v6, 0x3

    if-eq v5, v6, :cond_1

    const/4 v6, 0x4

    if-eq v5, v6, :cond_0

    invoke-static {p1, v4}, Ld4/b;->y(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v4}, Ld4/b;->b(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-static {p1, v4}, Ld4/b;->s(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_0

    :cond_2
    invoke-static {p1, v4}, Ld4/b;->s(Landroid/os/Parcel;I)I

    move-result v1

    goto :goto_0

    :cond_3
    invoke-static {p1, v0}, Ld4/b;->i(Landroid/os/Parcel;I)V

    new-instance p1, Lw4/y;

    invoke-direct {p1, v1, v2, v3}, Lw4/y;-><init>(II[B)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lw4/y;

    return-object p1
.end method
