.class public final Lcom/google/android/gms/internal/firebase-auth-api/qs;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rs;->E()Lcom/google/android/gms/internal/firebase-auth-api/rs;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ps;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rs;->E()Lcom/google/android/gms/internal/firebase-auth-api/rs;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r(Lcom/google/android/gms/internal/firebase-auth-api/us;)Lcom/google/android/gms/internal/firebase-auth-api/qs;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/rs;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/rs;->I(Lcom/google/android/gms/internal/firebase-auth-api/rs;Lcom/google/android/gms/internal/firebase-auth-api/us;)V

    return-object p0
.end method

.method public final s(I)Lcom/google/android/gms/internal/firebase-auth-api/qs;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/rs;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rs;->H(Lcom/google/android/gms/internal/firebase-auth-api/rs;I)V

    return-object p0
.end method
