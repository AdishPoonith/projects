.class public final Lcom/google/android/gms/internal/firebase-auth-api/di;
.super Lcom/google/android/gms/internal/firebase-auth-api/lk;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/fk;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/bi;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/y9;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/bi;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/nr;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/qr;

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/lk;-><init>(Ljava/lang/Class;Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/fk;)V

    return-void
.end method

.method static bridge synthetic l(IIII)Lcom/google/android/gms/internal/firebase-auth-api/fj;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/kr;->C()Lcom/google/android/gms/internal/firebase-auth-api/jr;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/kr;

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/fj;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->C()Lcom/google/android/gms/internal/firebase-auth-api/gr;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/gr;->r(Lcom/google/android/gms/internal/firebase-auth-api/kr;)Lcom/google/android/gms/internal/firebase-auth-api/gr;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/hr;

    invoke-direct {p1, p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/fj;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/gj;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/hr;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ci;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ci;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/di;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->m:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/nr;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/nr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->H()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->y()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->G()Lcom/google/android/gms/internal/firebase-auth-api/qr;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->D()Lcom/google/android/gms/internal/firebase-auth-api/kr;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gi;->a(Lcom/google/android/gms/internal/firebase-auth-api/kr;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Missing public key."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Private key is empty."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic k(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/nr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->G()Lcom/google/android/gms/internal/firebase-auth-api/qr;

    move-result-object p1

    return-object p1
.end method
