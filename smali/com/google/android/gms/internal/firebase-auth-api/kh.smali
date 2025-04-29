.class public final Lcom/google/android/gms/internal/firebase-auth-api/kh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/cb;


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static final b:Lcom/google/android/gms/internal/firebase-auth-api/kh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/kh;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/kh;->a:Ljava/util/logging/Logger;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/kh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/kh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/kh;->b:Lcom/google/android/gms/internal/firebase-auth-api/kh;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic b()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/kh;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static c()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/kh;->b:Lcom/google/android/gms/internal/firebase-auth-api/kh;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->j(Lcom/google/android/gms/internal/firebase-auth-api/cb;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/bb;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/jh;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/jh;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/bb;)V

    return-object v0
.end method

.method public final zza()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/y9;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/y9;

    return-object v0
.end method
