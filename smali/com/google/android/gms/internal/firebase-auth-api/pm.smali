.class public final Lcom/google/android/gms/internal/firebase-auth-api/pm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lcom/google/android/gms/internal/firebase-auth-api/ft;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

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

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ft;->D()Lcom/google/android/gms/internal/firebase-auth-api/ft;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pm;->a:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pm;->b:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pm;->c:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pm;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/um;->c()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ul;->b()V

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;->l(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fg;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/gl;->m(Z)V

    return-void
.end method
