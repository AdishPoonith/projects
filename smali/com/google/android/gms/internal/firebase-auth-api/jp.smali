.class public final Lcom/google/android/gms/internal/firebase-auth-api/jp;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/kp;->E()Lcom/google/android/gms/internal/firebase-auth-api/kp;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ip;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/kp;->E()Lcom/google/android/gms/internal/firebase-auth-api/kp;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r(I)Lcom/google/android/gms/internal/firebase-auth-api/jp;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/kp;

    const/16 v0, 0x40

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/kp;->G(Lcom/google/android/gms/internal/firebase-auth-api/kp;I)V

    return-object p0
.end method
