.class public final Lb4/q;
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
    .locals 8

    invoke-static {p1}, Ld4/b;->z(Landroid/os/Parcel;)I

    move-result v0

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v0, :cond_3

    invoke-static {p1}, Ld4/b;->q(Landroid/os/Parcel;)I

    move-result v5

    invoke-static {v5}, Ld4/b;->j(I)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_2

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    const/4 v7, 0x3

    if-eq v6, v7, :cond_0

    invoke-static {p1, v5}, Ld4/b;->y(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v5}, Ld4/b;->v(Landroid/os/Parcel;I)J

    move-result-wide v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v5}, Ld4/b;->s(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_0

    :cond_2
    invoke-static {p1, v5}, Ld4/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_3
    invoke-static {p1, v0}, Ld4/b;->i(Landroid/os/Parcel;I)V

    new-instance p1, Lb4/d;

    invoke-direct {p1, v4, v3, v1, v2}, Lb4/d;-><init>(Ljava/lang/String;IJ)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lb4/d;

    return-object p1
.end method
