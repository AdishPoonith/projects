.class public final Lcom/google/android/gms/internal/firebase-auth-api/ce;
.super Lcom/google/android/gms/internal/firebase-auth-api/hj;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/fk;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ae;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ae;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/ap;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/fk;)V

    return-void
.end method

.method public static k(Z)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ce;->m()Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/ce;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ce;-><init>()V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget p0, Lcom/google/android/gms/internal/firebase-auth-api/me;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/me;->a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V

    :cond_0
    return-void
.end method

.method static bridge synthetic l(II)Lcom/google/android/gms/internal/firebase-auth-api/fj;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ep;->D()Lcom/google/android/gms/internal/firebase-auth-api/cp;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/cp;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/cp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/ep;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/fj;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fj;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static m()Z
    .locals 1

    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/gj;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/ep;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/be;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/be;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ce;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->l:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ap;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/ap;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ap;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ap;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ap;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->b(I)V

    return-void
.end method
