.class public final Lcom/google/android/gms/internal/firebase-auth-api/ff;
.super Lcom/google/android/gms/internal/firebase-auth-api/hj;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/fk;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/df;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/df;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/xs;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/fk;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/gj;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/at;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ef;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ef;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ff;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->o:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/xs;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/xs;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/xs;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xs;->C()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->c(II)V

    return-void
.end method
