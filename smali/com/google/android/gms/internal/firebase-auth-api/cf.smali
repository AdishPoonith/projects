.class public final Lcom/google/android/gms/internal/firebase-auth-api/cf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/s9;


# static fields
.field private static final c:[B


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/s9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/cf;->c:[B

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/as;Lcom/google/android/gms/internal/firebase-auth-api/s9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cf;->a:Lcom/google/android/gms/internal/firebase-auth-api/as;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/cf;->b:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 6

    const-string v0, "invalid ciphertext"

    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    if-lez v2, :cond_0

    array-length p1, p1

    add-int/lit8 p1, p1, -0x4

    if-gt v2, p1, :cond_0

    new-array p1, v2, [B

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cf;->b:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/cf;->c:[B

    invoke-interface {v1, p1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/s9;->a([B[B)[B

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cf;->a:Lcom/google/android/gms/internal/firebase-auth-api/as;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/as;->H()Ljava/lang/String;

    move-result-object v1

    const-class v4, Lcom/google/android/gms/internal/firebase-auth-api/s9;

    sget v5, Lcom/google/android/gms/internal/firebase-auth-api/gb;->g:I

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    array-length v5, p1

    invoke-static {p1, v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-static {v1, p1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->e(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/m4;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-interface {p1, v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/s9;->a([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    new-instance p2, Ljava/security/GeneralSecurityException;

    invoke-direct {p2, v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final b([B[B)[B
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
