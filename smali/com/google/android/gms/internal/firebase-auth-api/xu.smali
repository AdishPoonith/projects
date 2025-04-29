.class final Lcom/google/android/gms/internal/firebase-auth-api/xu;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/yu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/yu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xu;->a:Lcom/google/android/gms/internal/firebase-auth-api/yu;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Ljavax/crypto/Mac;
    .locals 2

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/lu;->c:Lcom/google/android/gms/internal/firebase-auth-api/lu;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xu;->a:Lcom/google/android/gms/internal/firebase-auth-api/yu;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/yu;->b(Lcom/google/android/gms/internal/firebase-auth-api/yu;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lu;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Mac;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xu;->a:Lcom/google/android/gms/internal/firebase-auth-api/yu;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/yu;->c(Lcom/google/android/gms/internal/firebase-auth-api/yu;)Ljava/security/Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected final bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/xu;->a()Ljavax/crypto/Mac;

    move-result-object v0

    return-object v0
.end method
