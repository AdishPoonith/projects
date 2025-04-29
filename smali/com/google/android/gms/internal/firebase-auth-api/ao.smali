.class public final Lcom/google/android/gms/internal/firebase-auth-api/ao;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->E()Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zn;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->E()Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/ao;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/bo;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->L(Lcom/google/android/gms/internal/firebase-auth-api/bo;Lcom/google/android/gms/internal/firebase-auth-api/m4;)V

    return-object p0
.end method

.method public final s(Lcom/google/android/gms/internal/firebase-auth-api/io;)Lcom/google/android/gms/internal/firebase-auth-api/ao;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/bo;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->K(Lcom/google/android/gms/internal/firebase-auth-api/bo;Lcom/google/android/gms/internal/firebase-auth-api/io;)V

    return-object p0
.end method

.method public final t(I)Lcom/google/android/gms/internal/firebase-auth-api/ao;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bo;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->J(Lcom/google/android/gms/internal/firebase-auth-api/bo;I)V

    return-object p0
.end method
