.class public final synthetic Lcom/google/android/gms/internal/auth/n5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/q;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/auth/b;

.field public final synthetic b:Lcom/google/android/gms/internal/auth/g;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth/b;Lcom/google/android/gms/internal/auth/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/n5;->a:Lcom/google/android/gms/internal/auth/b;

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/n5;->b:Lcom/google/android/gms/internal/auth/g;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/n5;->a:Lcom/google/android/gms/internal/auth/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/n5;->b:Lcom/google/android/gms/internal/auth/g;

    check-cast p1, Lcom/google/android/gms/internal/auth/i5;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/auth/l5;

    new-instance v2, Lcom/google/android/gms/internal/auth/q5;

    invoke-direct {v2, v0, p2}, Lcom/google/android/gms/internal/auth/q5;-><init>(Lcom/google/android/gms/internal/auth/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/auth/l5;->H2(Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/internal/auth/g;)V

    return-void
.end method
