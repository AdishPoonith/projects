.class final Lcom/google/android/gms/internal/firebase-auth-api/ii;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zh;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/gv;


# direct methods
.method private constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->b([B)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ii;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->b([B)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ii;->b:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-void
.end method

.method static a([B[BI)Lcom/google/android/gms/internal/firebase-auth-api/ii;
    .locals 2

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->i(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->h(Ljava/security/spec/ECParameterSpec;I[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    invoke-static {p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->g(I[B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->d(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;)V

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/ii;

    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ii;-><init>([B[B)V

    return-object p2
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ii;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ii;->b:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-object v0
.end method
