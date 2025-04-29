.class public final Lcom/google/android/gms/internal/firebase-auth-api/yg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field static final b:Lcom/google/android/gms/internal/firebase-auth-api/ft;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field static final c:Lcom/google/android/gms/internal/firebase-auth-api/ft;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/mg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mg;-><init>()V

    const-string v0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/yg;->a:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ft;->D()Lcom/google/android/gms/internal/firebase-auth-api/ft;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/yg;->b:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ft;->D()Lcom/google/android/gms/internal/firebase-auth-api/ft;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/yg;->c:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ch;->c()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/mg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mg;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/xg;->h:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xg;->b(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
