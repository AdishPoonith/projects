.class final Lcom/google/android/gms/internal/firebase-auth-api/lh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/z9;


# instance fields
.field final a:Lcom/google/android/gms/internal/firebase-auth-api/bb;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/cn;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/bb;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/lh;->a:Lcom/google/android/gms/internal/firebase-auth-api/bb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bb;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pj;->a()Lcom/google/android/gms/internal/firebase-auth-api/pj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/pj;->b()Lcom/google/android/gms/internal/firebase-auth-api/dn;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mj;->a(Lcom/google/android/gms/internal/firebase-auth-api/bb;)Lcom/google/android/gms/internal/firebase-auth-api/in;

    move-result-object p1

    const-string v1, "hybrid_encrypt"

    const-string v2, "encrypt"

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/dn;->a(Lcom/google/android/gms/internal/firebase-auth-api/in;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/cn;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/lh;->b:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    return-void

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/mj;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    goto :goto_0
.end method
