.class public final Lw4/q0;
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
    .locals 18

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Ld4/b;->z(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, v4

    move-object v13, v6

    move-object v14, v13

    move-object/from16 v16, v14

    move-object/from16 v17, v16

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static/range {p1 .. p1}, Ld4/b;->q(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Ld4/b;->j(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    invoke-static {v0, v2}, Ld4/b;->y(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    sget-object v3, Lw4/x;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Ld4/b;->h(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    move-object/from16 v17, v2

    goto :goto_0

    :pswitch_1
    sget-object v3, Lw4/n;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Ld4/b;->h(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Ld4/b;->s(Landroid/os/Parcel;I)I

    move-result v2

    move v15, v2

    goto :goto_0

    :pswitch_3
    sget-object v3, Lw4/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Ld4/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lw4/d;

    move-object v14, v2

    goto :goto_0

    :pswitch_4
    sget-object v3, Lw4/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Ld4/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lw4/d;

    move-object v13, v2

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Ld4/b;->k(Landroid/os/Parcel;I)Z

    move-result v2

    move v12, v2

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Ld4/b;->k(Landroid/os/Parcel;I)Z

    move-result v2

    move v11, v2

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Ld4/b;->k(Landroid/os/Parcel;I)Z

    move-result v2

    move v10, v2

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move v9, v2

    goto :goto_0

    :pswitch_9
    invoke-static {v0, v2}, Ld4/b;->s(Landroid/os/Parcel;I)I

    move-result v2

    move v8, v2

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move v7, v2

    goto :goto_0

    :pswitch_b
    sget-object v3, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Ld4/b;->h(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    move-object v6, v2

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Ld4/b;->i(Landroid/os/Parcel;I)V

    new-instance v0, Lw4/r;

    move-object v5, v0

    invoke-direct/range {v5 .. v17}, Lw4/r;-><init>(Ljava/util/List;FIFZZZLw4/d;Lw4/d;ILjava/util/List;Ljava/util/List;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lw4/r;

    return-object p1
.end method
