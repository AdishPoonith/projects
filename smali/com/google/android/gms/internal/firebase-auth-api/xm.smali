.class public final Lcom/google/android/gms/internal/firebase-auth-api/xm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/rl;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/yl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/yl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/eg;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xm;->a:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
