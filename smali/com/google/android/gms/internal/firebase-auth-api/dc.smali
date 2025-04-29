.class public final Lcom/google/android/gms/internal/firebase-auth-api/dc;
.super Lcom/google/android/gms/internal/firebase-auth-api/mb;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Lcom/google/android/gms/internal/firebase-auth-api/bc;

.field private final f:Lcom/google/android/gms/internal/firebase-auth-api/ac;


# direct methods
.method synthetic constructor <init>(IIIILcom/google/android/gms/internal/firebase-auth-api/bc;Lcom/google/android/gms/internal/firebase-auth-api/ac;Lcom/google/android/gms/internal/firebase-auth-api/cc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mb;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->a:I

    iput p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->b:I

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c:I

    iput p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->d:I

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->e:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->f:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->a:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->b:I

    return v0
.end method

.method public final c()Lcom/google/android/gms/internal/firebase-auth-api/bc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->e:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    return-object v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->e:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/bc;->d:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/dc;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/dc;

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/dc;->a:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->a:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/dc;->b:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->b:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/dc;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->d:I

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/dc;->e:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->e:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/dc;->f:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->f:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/dc;

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, v1, v2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x4

    aput-object v0, v1, v2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->e:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    const/4 v2, 0x5

    aput-object v0, v1, v2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->f:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    const/4 v2, 0x6

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->e:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->f:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->c:I

    iget v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->d:I

    iget v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->a:I

    iget v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/dc;->b:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AesCtrHmacAead Parameters (variant: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hashType: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte IV, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte tags, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte AES key, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte HMAC key)"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
