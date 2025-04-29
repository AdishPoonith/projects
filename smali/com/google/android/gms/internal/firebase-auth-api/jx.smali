.class final Lcom/google/android/gms/internal/firebase-auth-api/jx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/b;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/zk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jx;->a:Lcom/google/android/gms/internal/firebase-auth-api/zk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/c0;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jx;->a:Lcom/google/android/gms/internal/firebase-auth-api/zk;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zk;->a(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/firebase-auth-api/yj;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/jw;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/jw;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/jx;Lcom/google/android/gms/internal/firebase-auth-api/c0;Ljava/lang/CharSequence;Lcom/google/android/gms/internal/firebase-auth-api/yj;)V

    return-object v1
.end method
