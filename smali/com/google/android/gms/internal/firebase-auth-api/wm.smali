.class public final Lcom/google/android/gms/internal/firebase-auth-api/wm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/rl;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/cl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/cl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/eg;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cl;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CMAC in FIPS-mode."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
