.class public final Lcom/google/android/gms/internal/firebase-auth-api/mr;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->E()Lcom/google/android/gms/internal/firebase-auth-api/nr;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/lr;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->E()Lcom/google/android/gms/internal/firebase-auth-api/nr;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/mr;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/nr;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->K(Lcom/google/android/gms/internal/firebase-auth-api/nr;Lcom/google/android/gms/internal/firebase-auth-api/m4;)V

    return-object p0
.end method

.method public final s(Lcom/google/android/gms/internal/firebase-auth-api/qr;)Lcom/google/android/gms/internal/firebase-auth-api/mr;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/nr;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->J(Lcom/google/android/gms/internal/firebase-auth-api/nr;Lcom/google/android/gms/internal/firebase-auth-api/qr;)V

    return-object p0
.end method

.method public final t(I)Lcom/google/android/gms/internal/firebase-auth-api/mr;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/nr;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/nr;->I(Lcom/google/android/gms/internal/firebase-auth-api/nr;I)V

    return-object p0
.end method
