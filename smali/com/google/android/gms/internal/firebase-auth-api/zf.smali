.class public final Lcom/google/android/gms/internal/firebase-auth-api/zf;
.super Lcom/google/android/gms/internal/firebase-auth-api/wf;
.source "SourceFile"


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/wf;-><init>([BI)V

    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    const/16 v0, 0x18

    return v0
.end method

.method final b([II)[I
    .locals 12

    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x6

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    const/16 v0, 0x10

    new-array v4, v0, [I

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/wf;->a:[I

    const/4 v6, 0x7

    new-array v0, v0, [I

    invoke-static {v0, v5}, Lcom/google/android/gms/internal/firebase-auth-api/rf;->b([I[I)V

    aget v5, p1, v3

    const/16 v7, 0xc

    aput v5, v0, v7

    aget v1, p1, v1

    const/16 v5, 0xd

    aput v1, v0, v5

    const/4 v1, 0x2

    aget v1, p1, v1

    const/16 v8, 0xe

    aput v1, v0, v8

    const/4 v1, 0x3

    aget v1, p1, v1

    const/16 v9, 0xf

    aput v1, v0, v9

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/rf;->c([I)V

    aget v1, v0, v7

    const/4 v10, 0x4

    aput v1, v0, v10

    aget v1, v0, v5

    const/4 v11, 0x5

    aput v1, v0, v11

    aget v1, v0, v8

    aput v1, v0, v2

    aget v1, v0, v9

    aput v1, v0, v6

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rf;->b([I[I)V

    aput p2, v4, v7

    aput v3, v4, v5

    aget p2, p1, v10

    aput p2, v4, v8

    aget p1, p1, v11

    aput p1, v4, v9

    return-object v4

    :cond_0
    mul-int/lit8 v0, v0, 0x20

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v3

    const-string v0, "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
