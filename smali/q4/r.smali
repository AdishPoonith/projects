.class final Lq4/r;
.super Lq4/y0;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, Lq4/r;->a:Ljava/lang/Object;

    iput-object p2, p0, Lq4/r;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Lq4/y0;-><init>()V

    return-void
.end method


# virtual methods
.method public final d0(Lq4/v0;)V
    .locals 2

    invoke-virtual {p1}, Lq4/v0;->p()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lq4/r;->a:Ljava/lang/Object;

    iget-object v1, p0, Lq4/r;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/api/internal/v;->b(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final zze()V
    .locals 0

    return-void
.end method
