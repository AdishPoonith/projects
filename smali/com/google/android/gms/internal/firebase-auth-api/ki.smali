.class final Lcom/google/android/gms/internal/firebase-auth-api/ki;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ki;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/gv;->b([B)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ki;->b:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-void
.end method

.method static a([B)Lcom/google/android/gms/internal/firebase-auth-api/ki;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ki;

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ev;->b([B)[B

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ki;-><init>([B[B)V

    return-object v0
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ki;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ki;->b:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-object v0
.end method
