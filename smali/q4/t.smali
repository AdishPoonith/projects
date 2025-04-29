.class final Lq4/t;
.super Lq4/c1;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, Lq4/t;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Lq4/c1;-><init>()V

    return-void
.end method


# virtual methods
.method public final Y1(Lt4/h;)V
    .locals 2

    invoke-virtual {p1}, Lt4/h;->p()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    new-instance v1, Lt4/g;

    invoke-direct {v1, p1}, Lt4/g;-><init>(Lt4/h;)V

    iget-object p1, p0, Lq4/t;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/common/api/internal/v;->b(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
