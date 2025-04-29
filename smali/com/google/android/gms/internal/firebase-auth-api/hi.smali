.class final Lcom/google/android/gms/internal/firebase-auth-api/hi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/yh;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/sh;

.field private final b:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/sh;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sh;

    iput p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;->b:I

    return-void
.end method

.method static b(I)Lcom/google/android/gms/internal/firebase-auth-api/hi;
    .locals 3

    add-int/lit8 p0, p0, -0x1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sh;

    const-string v1, "HmacSha512"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sh;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hi;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/sh;I)V

    return-object p0

    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sh;

    const-string v1, "HmacSha384"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sh;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hi;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/sh;I)V

    return-object p0

    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/sh;

    const-string v2, "HmacSha256"

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/sh;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hi;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/sh;I)V

    return-object p0
.end method


# virtual methods
.method public final a([BLcom/google/android/gms/internal/firebase-auth-api/zh;)[B
    .locals 11

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;->b:I

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zh;->zza()Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->c()[B

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->g(I[B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;->b:I

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->i(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->h(Ljava/security/spec/ECParameterSpec;I[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->f(Ljava/security/interfaces/ECPrivateKey;Ljava/security/interfaces/ECPublicKey;)[B

    move-result-object v5

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zh;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->c()[B

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [[B

    const/4 v1, 0x0

    aput-object p1, v0, v1

    aput-object p2, v0, v2

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ut;->b([[B)[B

    move-result-object v7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hi;->zzb()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gi;->d([B)[B

    move-result-object v9

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sh;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/sh;->a()I

    move-result v10

    const/4 v4, 0x0

    const-string v6, "eae_prk"

    const-string v8, "shared_secret"

    invoke-virtual/range {v3 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/sh;->b([B[BLjava/lang/String;[BLjava/lang/String;[BI)[B

    move-result-object p1

    return-object p1
.end method

.method public final zzb()[B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hi;->b:I

    add-int/lit8 v0, v0, -0x1

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/gi;->e:[B

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/gi;->d:[B

    return-object v0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/gi;->c:[B

    return-object v0
.end method
