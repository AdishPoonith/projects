.class public final Lw4/n0;
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
    .locals 22

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Ld4/b;->z(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v8, v3

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/high16 v18, 0x3f000000    # 0.5f

    const/16 v19, 0x0

    const/high16 v20, 0x3f800000    # 1.0f

    const/16 v21, 0x0

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
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move/from16 v21, v2

    goto :goto_0

    :pswitch_1
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move/from16 v20, v2

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move/from16 v19, v2

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move/from16 v18, v2

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move/from16 v17, v2

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Ld4/b;->k(Landroid/os/Parcel;I)Z

    move-result v2

    move/from16 v16, v2

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Ld4/b;->k(Landroid/os/Parcel;I)Z

    move-result v2

    move v15, v2

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Ld4/b;->k(Landroid/os/Parcel;I)Z

    move-result v2

    move v14, v2

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move v13, v2

    goto :goto_0

    :pswitch_9
    invoke-static {v0, v2}, Ld4/b;->o(Landroid/os/Parcel;I)F

    move-result v2

    move v12, v2

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Ld4/b;->r(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v2

    move-object v11, v2

    goto :goto_0

    :pswitch_b
    invoke-static {v0, v2}, Ld4/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v10, v2

    goto :goto_0

    :pswitch_c
    invoke-static {v0, v2}, Ld4/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    goto :goto_0

    :pswitch_d
    sget-object v3, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Ld4/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/LatLng;

    move-object v8, v2

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Ld4/b;->i(Landroid/os/Parcel;I)V

    new-instance v0, Lw4/m;

    move-object v7, v0

    invoke-direct/range {v7 .. v21}, Lw4/m;-><init>(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;FFZZZFFFFF)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_d
        :pswitch_c
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

    new-array p1, p1, [Lw4/m;

    return-object p1
.end method
