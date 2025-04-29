.class public final Lcom/google/android/gms/internal/firebase-auth-api/fi;
.super Lcom/google/android/gms/internal/firebase-auth-api/hj;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/fk;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ei;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/z9;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ei;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/qr;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/fk;)V

    return-void
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->n:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->H(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/qr;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HpkePublicKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/qr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->D()Lcom/google/android/gms/internal/firebase-auth-api/kr;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gi;->a(Lcom/google/android/gms/internal/firebase-auth-api/kr;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Missing HPKE key params."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
