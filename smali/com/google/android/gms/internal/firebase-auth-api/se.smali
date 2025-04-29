.class public final Lcom/google/android/gms/internal/firebase-auth-api/se;
.super Lcom/google/android/gms/internal/firebase-auth-api/mb;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/re;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/re;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mb;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/se;->a:Lcom/google/android/gms/internal/firebase-auth-api/re;

    return-void
.end method

.method public static b(Lcom/google/android/gms/internal/firebase-auth-api/re;)Lcom/google/android/gms/internal/firebase-auth-api/se;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/se;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/se;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/re;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/re;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/se;->a:Lcom/google/android/gms/internal/firebase-auth-api/re;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/se;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/se;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/se;->a:Lcom/google/android/gms/internal/firebase-auth-api/re;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/se;->a:Lcom/google/android/gms/internal/firebase-auth-api/re;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/se;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/se;->a:Lcom/google/android/gms/internal/firebase-auth-api/re;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/se;->a:Lcom/google/android/gms/internal/firebase-auth-api/re;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ChaCha20Poly1305 Parameters (variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
