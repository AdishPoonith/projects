.class final Lcom/google/android/gms/internal/firebase-auth-api/vh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/y9;


# static fields
.field private static final f:[B


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/zh;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/yh;

.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/th;

.field private final d:I

.field private final e:Lcom/google/android/gms/internal/firebase-auth-api/sh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->f:[B

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zh;Lcom/google/android/gms/internal/firebase-auth-api/yh;Lcom/google/android/gms/internal/firebase-auth-api/sh;Lcom/google/android/gms/internal/firebase-auth-api/th;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->a:Lcom/google/android/gms/internal/firebase-auth-api/zh;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->b:Lcom/google/android/gms/internal/firebase-auth-api/yh;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->e:Lcom/google/android/gms/internal/firebase-auth-api/sh;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->c:Lcom/google/android/gms/internal/firebase-auth-api/th;

    iput p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->d:I

    return-void
.end method

.method static b(Lcom/google/android/gms/internal/firebase-auth-api/nr;)Lcom/google/android/gms/internal/firebase-auth-api/vh;
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->L()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->G()Lcom/google/android/gms/internal/firebase-auth-api/qr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->M()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->H()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->y()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->G()Lcom/google/android/gms/internal/firebase-auth-api/qr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->D()Lcom/google/android/gms/internal/firebase-auth-api/kr;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->b(Lcom/google/android/gms/internal/firebase-auth-api/kr;)Lcom/google/android/gms/internal/firebase-auth-api/yh;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->c(Lcom/google/android/gms/internal/firebase-auth-api/kr;)Lcom/google/android/gms/internal/firebase-auth-api/sh;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->a(Lcom/google/android/gms/internal/firebase-auth-api/kr;)Lcom/google/android/gms/internal/firebase-auth-api/th;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/kr;->H()I

    move-result v0

    add-int/lit8 v1, v0, -0x2

    const/4 v2, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v1, v8, :cond_3

    if-eq v1, v7, :cond_2

    if-eq v1, v6, :cond_1

    if-ne v1, v2, :cond_0

    const/16 v0, 0x85

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dr;->a(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unable to determine KEM-encoding length for "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 v0, 0x61

    goto :goto_0

    :cond_2
    const/16 v0, 0x41

    goto :goto_0

    :cond_3
    const/16 v0, 0x20

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->G()Lcom/google/android/gms/internal/firebase-auth-api/qr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->D()Lcom/google/android/gms/internal/firebase-auth-api/kr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/kr;->H()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    if-eq v1, v8, :cond_6

    if-eq v1, v7, :cond_5

    if-eq v1, v6, :cond_5

    if-ne v1, v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->H()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->G()Lcom/google/android/gms/internal/firebase-auth-api/qr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->I()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->G()Lcom/google/android/gms/internal/firebase-auth-api/qr;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->D()Lcom/google/android/gms/internal/firebase-auth-api/kr;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/kr;->H()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/gi;->g(I)I

    move-result p0

    invoke-static {v1, v2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/ii;->a([B[BI)Lcom/google/android/gms/internal/firebase-auth-api/ii;

    move-result-object p0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->H()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ki;->a([B)Lcom/google/android/gms/internal/firebase-auth-api/ki;

    move-result-object p0

    :goto_2
    move-object v2, p0

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;

    move-object v1, p0

    move v6, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/vh;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zh;Lcom/google/android/gms/internal/firebase-auth-api/yh;Lcom/google/android/gms/internal/firebase-auth-api/sh;Lcom/google/android/gms/internal/firebase-auth-api/th;I)V

    return-object p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey.private_key is empty."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey.public_key is missing params field."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey is missing public_key field."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 8

    array-length p2, p1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->d:I

    if-lt p2, v0, :cond_0

    const/4 v1, 0x0

    new-array v7, v1, [B

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->d:I

    invoke-static {p1, v0, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->a:Lcom/google/android/gms/internal/firebase-auth-api/zh;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->b:Lcom/google/android/gms/internal/firebase-auth-api/yh;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->e:Lcom/google/android/gms/internal/firebase-auth-api/sh;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->c:Lcom/google/android/gms/internal/firebase-auth-api/th;

    invoke-interface {v4, v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/yh;->a([BLcom/google/android/gms/internal/firebase-auth-api/zh;)[B

    move-result-object v3

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/uh;->b([B[BLcom/google/android/gms/internal/firebase-auth-api/yh;Lcom/google/android/gms/internal/firebase-auth-api/sh;Lcom/google/android/gms/internal/firebase-auth-api/th;[B)Lcom/google/android/gms/internal/firebase-auth-api/uh;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/vh;->f:[B

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/uh;->a([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Ciphertext is too short."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
