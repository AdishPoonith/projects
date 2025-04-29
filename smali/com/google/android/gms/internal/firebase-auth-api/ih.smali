.class public final Lcom/google/android/gms/internal/firebase-auth-api/ih;
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

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/hh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hh;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/fh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/fh;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ft;->D()Lcom/google/android/gms/internal/firebase-auth-api/ft;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ih;->a:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ft;->D()Lcom/google/android/gms/internal/firebase-auth-api/ft;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ih;->b:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ft;->D()Lcom/google/android/gms/internal/firebase-auth-api/ft;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ih;->c:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ih;->a()V
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
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/kh;->c()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/mh;->b()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/jb;->a()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/fh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/fh;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/hh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hh;-><init>()V

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->h(Lcom/google/android/gms/internal/firebase-auth-api/lk;Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/di;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/di;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/fi;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/fi;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->h(Lcom/google/android/gms/internal/firebase-auth-api/lk;Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    return-void
.end method
