.class public final Lcom/google/android/gms/internal/firebase-auth-api/li;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/s9;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/x9;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/s9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/li;->a:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/li;->b:Lcom/google/android/gms/internal/firebase-auth-api/x9;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/x9;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/li;->a:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/li;->b:Lcom/google/android/gms/internal/firebase-auth-api/x9;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/li;->a:Lcom/google/android/gms/internal/firebase-auth-api/s9;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/s9;->a([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/li;->b:Lcom/google/android/gms/internal/firebase-auth-api/x9;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/x9;->a([B[B)[B

    move-result-object p1

    return-object p1
.end method
