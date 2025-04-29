.class final Lcom/google/android/gms/internal/firebase-auth-api/xh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/z9;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/qr;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/yh;

.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/th;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/sh;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/qr;Lcom/google/android/gms/internal/firebase-auth-api/yh;Lcom/google/android/gms/internal/firebase-auth-api/sh;Lcom/google/android/gms/internal/firebase-auth-api/th;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xh;->a:Lcom/google/android/gms/internal/firebase-auth-api/qr;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/xh;->b:Lcom/google/android/gms/internal/firebase-auth-api/yh;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/xh;->d:Lcom/google/android/gms/internal/firebase-auth-api/sh;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/xh;->c:Lcom/google/android/gms/internal/firebase-auth-api/th;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/firebase-auth-api/qr;)Lcom/google/android/gms/internal/firebase-auth-api/xh;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->I()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qr;->D()Lcom/google/android/gms/internal/firebase-auth-api/kr;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->b(Lcom/google/android/gms/internal/firebase-auth-api/kr;)Lcom/google/android/gms/internal/firebase-auth-api/yh;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->c(Lcom/google/android/gms/internal/firebase-auth-api/kr;)Lcom/google/android/gms/internal/firebase-auth-api/sh;

    move-result-object v2

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ai;->a(Lcom/google/android/gms/internal/firebase-auth-api/kr;)Lcom/google/android/gms/internal/firebase-auth-api/th;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/xh;

    invoke-direct {v3, p0, v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/xh;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/qr;Lcom/google/android/gms/internal/firebase-auth-api/yh;Lcom/google/android/gms/internal/firebase-auth-api/sh;Lcom/google/android/gms/internal/firebase-auth-api/th;)V

    return-object v3

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePublicKey.public_key is empty."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
