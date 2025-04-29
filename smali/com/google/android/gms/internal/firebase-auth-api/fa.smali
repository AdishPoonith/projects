.class final Lcom/google/android/gms/internal/firebase-auth-api/fa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/ga;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/lk;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/hj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/lk;Lcom/google/android/gms/internal/firebase-auth-api/hj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->a:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->b:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/ba;
    .locals 3

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/eb;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->a:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->b:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/eb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/lk;Lcom/google/android/gms/internal/firebase-auth-api/hj;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Primitive type not supported"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/ba;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/eb;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->a:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->b:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->g()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/eb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/lk;Lcom/google/android/gms/internal/firebase-auth-api/hj;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final zzc()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->a:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->b:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final zze()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fa;->a:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->j()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
