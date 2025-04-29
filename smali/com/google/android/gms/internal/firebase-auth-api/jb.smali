.class public final Lcom/google/android/gms/internal/firebase-auth-api/jb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field static final c:Lcom/google/android/gms/internal/firebase-auth-api/ft;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field static final d:Lcom/google/android/gms/internal/firebase-auth-api/ft;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field static final e:Lcom/google/android/gms/internal/firebase-auth-api/ft;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xb;-><init>()V

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jb;->a:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/kd;-><init>()V

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jb;->b:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ce;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ce;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/tc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/tc;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bf;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ff;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ff;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/qe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/qe;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/jf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jf;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ft;->D()Lcom/google/android/gms/internal/firebase-auth-api/ft;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jb;->c:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jb;->d:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jb;->e:Lcom/google/android/gms/internal/firebase-auth-api/ft;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/jb;->a()V
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

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pb;->c()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pm;->a()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xb;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/ic;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ic;->a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/kd;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/vd;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vd;->a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/tc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/tc;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/dd;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dd;->a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ce;->k(Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/qe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/qe;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/ye;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ye;->a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bf;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ff;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ff;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/jf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jf;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->i(Lcom/google/android/gms/internal/firebase-auth-api/hj;Z)V

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/qf;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->b()Lcom/google/android/gms/internal/firebase-auth-api/rj;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/qf;->a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V

    return-void
.end method
