.class public final Lcom/google/android/gms/internal/firebase-auth-api/xp;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->D()Lcom/google/android/gms/internal/firebase-auth-api/yp;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/wp;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->D()Lcom/google/android/gms/internal/firebase-auth-api/yp;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r(Lcom/google/android/gms/internal/firebase-auth-api/bq;)Lcom/google/android/gms/internal/firebase-auth-api/xp;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/yp;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->G(Lcom/google/android/gms/internal/firebase-auth-api/yp;Lcom/google/android/gms/internal/firebase-auth-api/bq;)V

    return-object p0
.end method
