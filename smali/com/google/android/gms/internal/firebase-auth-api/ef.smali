.class final Lcom/google/android/gms/internal/firebase-auth-api/ef;
.super Lcom/google/android/gms/internal/firebase-auth-api/gj;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/ff;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ff;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ef;->b:Lcom/google/android/gms/internal/firebase-auth-api/ff;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/gj;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/at;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xs;->D()Lcom/google/android/gms/internal/firebase-auth-api/ws;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ws;->r(Lcom/google/android/gms/internal/firebase-auth-api/at;)Lcom/google/android/gms/internal/firebase-auth-api/ws;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ws;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/ws;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/xs;

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/at;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/at;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/at;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/at;->G()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/at;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid key format: missing KEK URI or DEK template"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
