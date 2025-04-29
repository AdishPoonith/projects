.class Ly8/a;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private j:I


# direct methods
.method constructor <init>(Ljava/lang/Exception;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    instance-of p2, p1, Lcom/google/firebase/storage/j;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/google/firebase/storage/j;

    invoke-virtual {p1}, Lcom/google/firebase/storage/j;->f()I

    move-result p1

    iput p1, p0, Ly8/a;->j:I

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget v0, p0, Ly8/a;->j:I

    const/16 v1, -0x32f0

    if-eq v0, v1, :cond_4

    const/16 v1, -0x32e7

    if-eq v0, v1, :cond_3

    const/16 v1, -0x32e6

    if-eq v0, v1, :cond_2

    const/16 v1, -0x32dd

    if-eq v0, v1, :cond_1

    const/16 v1, -0x32dc

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    const-string v0, "unknown"

    return-object v0

    :pswitch_0
    const-string v0, "object-not-found"

    return-object v0

    :pswitch_1
    const-string v0, "bucket-not-found"

    return-object v0

    :pswitch_2
    const-string v0, "project-not-found"

    return-object v0

    :pswitch_3
    const-string v0, "quota-exceeded"

    return-object v0

    :cond_0
    const-string v0, "unauthenticated"

    return-object v0

    :cond_1
    const-string v0, "unauthorized"

    return-object v0

    :cond_2
    const-string v0, "retry-limit-exceeded"

    return-object v0

    :cond_3
    const-string v0, "invalid-checksum"

    return-object v0

    :cond_4
    const-string v0, "canceled"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x32d5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    iget v0, p0, Ly8/a;->j:I

    const/16 v1, -0x32f0

    if-eq v0, v1, :cond_4

    const/16 v1, -0x32e7

    if-eq v0, v1, :cond_3

    const/16 v1, -0x32e6

    if-eq v0, v1, :cond_2

    const/16 v1, -0x32dd

    if-eq v0, v1, :cond_1

    const/16 v1, -0x32dc

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    const-string v0, "An unknown error occurred"

    return-object v0

    :pswitch_0
    const-string v0, "No object exists at the desired reference."

    return-object v0

    :pswitch_1
    const-string v0, "No bucket is configured for Firebase Storage."

    return-object v0

    :pswitch_2
    const-string v0, "No project is configured for Firebase Storage."

    return-object v0

    :pswitch_3
    const-string v0, "Quota on your Firebase Storage bucket has been exceeded."

    return-object v0

    :cond_0
    const-string v0, "User is unauthenticated. Authenticate and try again."

    return-object v0

    :cond_1
    const-string v0, "User is not authorized to perform the desired action."

    return-object v0

    :cond_2
    const-string v0, "The maximum time limit on an operation (upload, download, delete, etc.) has been exceeded."

    return-object v0

    :cond_3
    const-string v0, "File on the client does not match the checksum of the file received by the server."

    return-object v0

    :cond_4
    const-string v0, "User cancelled the operation."

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x32d5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
