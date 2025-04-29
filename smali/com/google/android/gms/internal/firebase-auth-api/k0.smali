.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/android/gms/internal/firebase-auth-api/m0;

.field public final synthetic k:Lcom/google/android/gms/internal/firebase-auth-api/l0;

.field public final synthetic l:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/m0;Lcom/google/android/gms/internal/firebase-auth-api/l0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/k0;->j:Lcom/google/android/gms/internal/firebase-auth-api/m0;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/k0;->k:Lcom/google/android/gms/internal/firebase-auth-api/l0;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/k0;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/k0;->j:Lcom/google/android/gms/internal/firebase-auth-api/m0;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/k0;->k:Lcom/google/android/gms/internal/firebase-auth-api/l0;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/k0;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/m0;->a:Lcom/google/android/gms/internal/firebase-auth-api/h;

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/l0;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/internal/firebase-auth-api/h;)V

    return-void
.end method
