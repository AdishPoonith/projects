.class public final Lb4/b;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb4/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Lb4/b;


# instance fields
.field final j:I

.field private final k:I

.field private final l:Landroid/app/PendingIntent;

.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb4/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb4/b;-><init>(I)V

    sput-object v0, Lb4/b;->n:Lb4/b;

    new-instance v0, Lb4/p;

    invoke-direct {v0}, Lb4/p;-><init>()V

    sput-object v0, Lb4/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lb4/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lb4/b;->j:I

    iput p2, p0, Lb4/b;->k:I

    iput-object p3, p0, Lb4/b;->l:Landroid/app/PendingIntent;

    iput-object p4, p0, Lb4/b;->m:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILandroid/app/PendingIntent;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lb4/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2, p3}, Lb4/b;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    return-void
.end method

.method static G(I)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x63

    if-eq p0, v0, :cond_1

    const/16 v0, 0x5dc

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UNKNOWN_ERROR_CODE("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "API_DISABLED_FOR_CONNECTION"

    return-object p0

    :pswitch_1
    const-string p0, "API_DISABLED"

    return-object p0

    :pswitch_2
    const-string p0, "RESOLUTION_ACTIVITY_NOT_FOUND"

    return-object p0

    :pswitch_3
    const-string p0, "API_VERSION_UPDATE_REQUIRED"

    return-object p0

    :pswitch_4
    const-string p0, "RESTRICTED_PROFILE"

    return-object p0

    :pswitch_5
    const-string p0, "SERVICE_MISSING_PERMISSION"

    return-object p0

    :pswitch_6
    const-string p0, "SERVICE_UPDATING"

    return-object p0

    :pswitch_7
    const-string p0, "SIGN_IN_FAILED"

    return-object p0

    :pswitch_8
    const-string p0, "API_UNAVAILABLE"

    return-object p0

    :pswitch_9
    const-string p0, "INTERRUPTED"

    return-object p0

    :pswitch_a
    const-string p0, "TIMEOUT"

    return-object p0

    :pswitch_b
    const-string p0, "CANCELED"

    return-object p0

    :pswitch_c
    const-string p0, "LICENSE_CHECK_FAILED"

    return-object p0

    :pswitch_d
    const-string p0, "DEVELOPER_ERROR"

    return-object p0

    :pswitch_e
    const-string p0, "SERVICE_INVALID"

    return-object p0

    :pswitch_f
    const-string p0, "INTERNAL_ERROR"

    return-object p0

    :pswitch_10
    const-string p0, "NETWORK_ERROR"

    return-object p0

    :pswitch_11
    const-string p0, "RESOLUTION_REQUIRED"

    return-object p0

    :pswitch_12
    const-string p0, "INVALID_ACCOUNT"

    return-object p0

    :pswitch_13
    const-string p0, "SIGN_IN_REQUIRED"

    return-object p0

    :pswitch_14
    const-string p0, "SERVICE_DISABLED"

    return-object p0

    :pswitch_15
    const-string p0, "SERVICE_VERSION_UPDATE_REQUIRED"

    return-object p0

    :pswitch_16
    const-string p0, "SERVICE_MISSING"

    return-object p0

    :pswitch_17
    const-string p0, "SUCCESS"

    return-object p0

    :pswitch_18
    const-string p0, "UNKNOWN"

    return-object p0

    :cond_0
    const-string p0, "DRIVE_EXTERNAL_STORAGE_REQUIRED"

    return-object p0

    :cond_1
    const-string p0, "UNFINISHED"

    return-object p0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xd
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


# virtual methods
.method public B()I
    .locals 1

    iget v0, p0, Lb4/b;->k:I

    return v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb4/b;->m:Ljava/lang/String;

    return-object v0
.end method

.method public D()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lb4/b;->l:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public E()Z
    .locals 1

    iget v0, p0, Lb4/b;->k:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb4/b;->l:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public F()Z
    .locals 1

    iget v0, p0, Lb4/b;->k:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb4/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb4/b;

    iget v1, p0, Lb4/b;->k:I

    iget v3, p1, Lb4/b;->k:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lb4/b;->l:Landroid/app/PendingIntent;

    iget-object v3, p1, Lb4/b;->l:Landroid/app/PendingIntent;

    invoke-static {v1, v3}, Lc4/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lb4/b;->m:Ljava/lang/String;

    iget-object p1, p1, Lb4/b;->m:Ljava/lang/String;

    invoke-static {v1, p1}, Lc4/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lb4/b;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb4/b;->l:Landroid/app/PendingIntent;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lb4/b;->m:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lc4/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lc4/q;->d(Ljava/lang/Object;)Lc4/q$a;

    move-result-object v0

    iget v1, p0, Lb4/b;->k:I

    invoke-static {v1}, Lb4/b;->G(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "statusCode"

    invoke-virtual {v0, v2, v1}, Lc4/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lc4/q$a;

    iget-object v1, p0, Lb4/b;->l:Landroid/app/PendingIntent;

    const-string v2, "resolution"

    invoke-virtual {v0, v2, v1}, Lc4/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lc4/q$a;

    iget-object v1, p0, Lb4/b;->m:Ljava/lang/String;

    const-string v2, "message"

    invoke-virtual {v0, v2, v1}, Lc4/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lc4/q$a;

    invoke-virtual {v0}, Lc4/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lb4/b;->j:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lb4/b;->B()I

    move-result v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lb4/b;->D()Landroid/app/PendingIntent;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lb4/b;->C()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
