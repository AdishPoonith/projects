.class public final Lcom/google/android/gms/internal/firebase-auth-api/up;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vp;->D()Lcom/google/android/gms/internal/firebase-auth-api/vp;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/tp;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vp;->D()Lcom/google/android/gms/internal/firebase-auth-api/vp;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r(Lcom/google/android/gms/internal/firebase-auth-api/as;)Lcom/google/android/gms/internal/firebase-auth-api/up;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/vp;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/vp;->G(Lcom/google/android/gms/internal/firebase-auth-api/vp;Lcom/google/android/gms/internal/firebase-auth-api/as;)V

    return-object p0
.end method
