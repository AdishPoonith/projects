.class final Lq4/s;
.super Lq4/y0;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic b:Lt4/v;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lt4/v;)V
    .locals 0

    iput-object p1, p0, Lq4/s;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Lq4/s;->b:Lt4/v;

    invoke-direct {p0}, Lq4/y0;-><init>()V

    return-void
.end method


# virtual methods
.method public final d0(Lq4/v0;)V
    .locals 1

    invoke-virtual {p1}, Lq4/v0;->p()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lq4/s;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1, v0}, Lcom/google/android/gms/common/api/internal/v;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final zze()V
    .locals 1

    iget-object v0, p0, Lq4/s;->b:Lt4/v;

    invoke-interface {v0}, Lt4/v;->zzf()V

    return-void
.end method
