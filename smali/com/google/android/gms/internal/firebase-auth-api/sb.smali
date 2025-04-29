.class public final Lcom/google/android/gms/internal/firebase-auth-api/sb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

.field private b:Lcom/google/android/gms/internal/firebase-auth-api/hv;

.field private c:Lcom/google/android/gms/internal/firebase-auth-api/hv;

.field private d:Ljava/lang/Integer;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/rb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->b:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->c:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->d:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/hv;)Lcom/google/android/gms/internal/firebase-auth-api/sb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->b:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    return-object p0
.end method

.method public final b(Lcom/google/android/gms/internal/firebase-auth-api/hv;)Lcom/google/android/gms/internal/firebase-auth-api/sb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->c:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    return-object p0
.end method

.method public final c(Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/sb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public final d(Lcom/google/android/gms/internal/firebase-auth-api/dc;)Lcom/google/android/gms/internal/firebase-auth-api/sb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    return-object p0
.end method

.method public final e()Lcom/google/android/gms/internal/firebase-auth-api/ub;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    if-eqz v0, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->b:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    if-eqz v1, :cond_9

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->c:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dc;->a()I

    move-result v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hv;->a()I

    move-result v1

    if-ne v2, v1, :cond_8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dc;->b()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->c:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hv;->a()I

    move-result v1

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dc;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dc;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->d:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c()Lcom/google/android/gms/internal/firebase-auth-api/bc;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/bc;->d:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_4

    new-array v0, v2, [B

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->b([B)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object v0

    :goto_2
    move-object v5, v0

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c()Lcom/google/android/gms/internal/firebase-auth-api/bc;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/bc;->c:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    const/4 v3, 0x5

    if-ne v0, v1, :cond_5

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->b([B)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object v0

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c()Lcom/google/android/gms/internal/firebase-auth-api/bc;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/bc;->b:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    if-ne v0, v1, :cond_6

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->b([B)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object v0

    goto :goto_2

    :goto_3
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ub;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->b:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->c:Lcom/google/android/gms/internal/firebase-auth-api/hv;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->d:Ljava/lang/Integer;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/ub;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/dc;Lcom/google/android/gms/internal/firebase-auth-api/hv;Lcom/google/android/gms/internal/firebase-auth-api/hv;Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Integer;Lcom/google/android/gms/internal/firebase-auth-api/tb;)V

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a:Lcom/google/android/gms/internal/firebase-auth-api/dc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c()Lcom/google/android/gms/internal/firebase-auth-api/bc;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unknown AesCtrHmacAeadParameters.Variant: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HMAC key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "AES key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
