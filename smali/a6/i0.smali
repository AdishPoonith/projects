.class public final La6/i0;
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
    .locals 6

    invoke-static {p1}, Ld4/b;->z(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v0, :cond_2

    invoke-static {p1}, Ld4/b;->q(Landroid/os/Parcel;)I

    move-result v3

    invoke-static {v3}, Ld4/b;->j(I)I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    invoke-static {p1, v3}, Ld4/b;->y(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/google/firebase/auth/t1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v3, v2}, Ld4/b;->h(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/google/firebase/auth/t0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v3, v1}, Ld4/b;->h(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-static {p1, v0}, Ld4/b;->i(Landroid/os/Parcel;I)V

    new-instance p1, La6/h0;

    invoke-direct {p1, v1, v2}, La6/h0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [La6/h0;

    return-object p1
.end method
