.class public final Lcom/google/android/gms/internal/firebase-auth-api/on;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pn;->E()Lcom/google/android/gms/internal/firebase-auth-api/pn;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/nn;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pn;->E()Lcom/google/android/gms/internal/firebase-auth-api/pn;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r(I)Lcom/google/android/gms/internal/firebase-auth-api/on;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/pn;

    const/16 v0, 0x20

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/pn;->H(Lcom/google/android/gms/internal/firebase-auth-api/pn;I)V

    return-object p0
.end method

.method public final s(Lcom/google/android/gms/internal/firebase-auth-api/sn;)Lcom/google/android/gms/internal/firebase-auth-api/on;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/pn;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/pn;->I(Lcom/google/android/gms/internal/firebase-auth-api/pn;Lcom/google/android/gms/internal/firebase-auth-api/sn;)V

    return-object p0
.end method
