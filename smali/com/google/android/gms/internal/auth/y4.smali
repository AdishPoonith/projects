.class final Lcom/google/android/gms/internal/auth/y4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/auth/w4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/auth/u4;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/auth/u4;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/auth/c1;->a:I

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/auth/x4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/x4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/y4;->a:Lcom/google/android/gms/internal/auth/w4;

    return-void
.end method

.method static bridge synthetic a([BII)I
    .locals 6

    add-int/lit8 v0, p1, -0x1

    aget-byte v0, p0, v0

    sub-int/2addr p2, p1

    const/16 v1, -0xc

    const/4 v2, -0x1

    if-eqz p2, :cond_4

    const/4 v3, 0x1

    const/16 v4, -0x41

    if-eq p2, v3, :cond_2

    const/4 v5, 0x2

    if-ne p2, v5, :cond_1

    aget-byte p2, p0, p1

    add-int/2addr p1, v3

    aget-byte p0, p0, p1

    if-gt v0, v1, :cond_5

    if-gt p2, v4, :cond_5

    if-le p0, v4, :cond_0

    goto :goto_0

    :cond_0
    shl-int/lit8 p1, p2, 0x8

    xor-int/2addr p1, v0

    shl-int/lit8 p0, p0, 0x10

    xor-int v0, p1, p0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :cond_2
    aget-byte p0, p0, p1

    if-gt v0, v1, :cond_5

    if-le p0, v4, :cond_3

    goto :goto_0

    :cond_3
    shl-int/lit8 p0, p0, 0x8

    xor-int/2addr v0, p0

    goto :goto_1

    :cond_4
    if-le v0, v1, :cond_6

    :cond_5
    :goto_0
    const/4 v0, -0x1

    :cond_6
    :goto_1
    return v0
.end method

.method static b([BII)Ljava/lang/String;
    .locals 10

    array-length v0, p0

    or-int v1, p1, p2

    sub-int v2, v0, p1

    sub-int/2addr v2, p2

    or-int/2addr v1, v2

    const/4 v2, 0x0

    if-ltz v1, :cond_a

    add-int v0, p1, p2

    new-array p2, p2, [C

    const/4 v1, 0x0

    :goto_0
    if-ge p1, v0, :cond_1

    aget-byte v3, p0, p1

    invoke-static {v3}, Lcom/google/android/gms/internal/auth/v4;->d(B)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v4, v1, 0x1

    int-to-char v3, v3

    aput-char v3, p2, v1

    move v1, v4

    goto :goto_0

    :cond_1
    :goto_1
    if-ge p1, v0, :cond_9

    add-int/lit8 v3, p1, 0x1

    aget-byte p1, p0, p1

    invoke-static {p1}, Lcom/google/android/gms/internal/auth/v4;->d(B)Z

    move-result v4

    if-eqz v4, :cond_3

    add-int/lit8 v4, v1, 0x1

    int-to-char p1, p1

    aput-char p1, p2, v1

    move p1, v3

    :goto_2
    move v1, v4

    if-ge p1, v0, :cond_1

    aget-byte v3, p0, p1

    invoke-static {v3}, Lcom/google/android/gms/internal/auth/v4;->d(B)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v4, v1, 0x1

    int-to-char v3, v3

    aput-char v3, p2, v1

    goto :goto_2

    :cond_3
    const/16 v4, -0x20

    if-ge p1, v4, :cond_5

    if-ge v3, v0, :cond_4

    add-int/lit8 v4, v3, 0x1

    add-int/lit8 v5, v1, 0x1

    aget-byte v3, p0, v3

    invoke-static {p1, v3, p2, v1}, Lcom/google/android/gms/internal/auth/v4;->c(BB[CI)V

    move p1, v4

    move v1, v5

    goto :goto_1

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/auth/m2;->b()Lcom/google/android/gms/internal/auth/m2;

    move-result-object p0

    throw p0

    :cond_5
    const/16 v4, -0x10

    if-ge p1, v4, :cond_7

    add-int/lit8 v4, v0, -0x1

    if-ge v3, v4, :cond_6

    add-int/lit8 v4, v3, 0x1

    add-int/lit8 v5, v4, 0x1

    add-int/lit8 v6, v1, 0x1

    aget-byte v3, p0, v3

    aget-byte v4, p0, v4

    invoke-static {p1, v3, v4, p2, v1}, Lcom/google/android/gms/internal/auth/v4;->b(BBB[CI)V

    move p1, v5

    move v1, v6

    goto :goto_1

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/auth/m2;->b()Lcom/google/android/gms/internal/auth/m2;

    move-result-object p0

    throw p0

    :cond_7
    add-int/lit8 v4, v0, -0x2

    if-ge v3, v4, :cond_8

    add-int/lit8 v4, v3, 0x1

    add-int/lit8 v5, v4, 0x1

    add-int/lit8 v9, v5, 0x1

    aget-byte v6, p0, v3

    aget-byte v7, p0, v4

    aget-byte v8, p0, v5

    move v3, p1

    move v4, v6

    move v5, v7

    move v6, v8

    move-object v7, p2

    move v8, v1

    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/auth/v4;->a(BBBB[CI)V

    add-int/lit8 v1, v1, 0x2

    move p1, v9

    goto :goto_1

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/auth/m2;->b()Lcom/google/android/gms/internal/auth/m2;

    move-result-object p0

    throw p0

    :cond_9
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p2, v2, v1}, Ljava/lang/String;-><init>([CII)V

    return-object p0

    :cond_a
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    const-string p1, "buffer length=%d, index=%d, size=%d"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static c([B)Z
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth/y4;->a:Lcom/google/android/gms/internal/auth/w4;

    array-length v1, p0

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v1}, Lcom/google/android/gms/internal/auth/w4;->b([BII)Z

    move-result p0

    return p0
.end method

.method static d([BII)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/y4;->a:Lcom/google/android/gms/internal/auth/w4;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/w4;->b([BII)Z

    move-result p0

    return p0
.end method
