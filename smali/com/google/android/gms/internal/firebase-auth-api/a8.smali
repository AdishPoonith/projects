.class public final Lcom/google/android/gms/internal/firebase-auth-api/a8;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/b8;->F()Lcom/google/android/gms/internal/firebase-auth-api/b8;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/z7;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/b8;->F()Lcom/google/android/gms/internal/firebase-auth-api/b8;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r(I)Lcom/google/android/gms/internal/firebase-auth-api/a8;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->p()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/b8;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/b8;->H(Lcom/google/android/gms/internal/firebase-auth-api/b8;I)V

    return-object p0
.end method

.method public final s(J)Lcom/google/android/gms/internal/firebase-auth-api/a8;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->p()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/b8;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/b8;->G(Lcom/google/android/gms/internal/firebase-auth-api/b8;J)V

    return-object p0
.end method
