.class final Lq4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/q;
.implements Lq4/u;


# instance fields
.field private final a:Lq4/i;

.field private b:Lcom/google/android/gms/common/api/internal/j;

.field private c:Z

.field final synthetic d:Lq4/k;


# direct methods
.method constructor <init>(Lq4/k;Lcom/google/android/gms/common/api/internal/j;Lq4/i;)V
    .locals 0

    iput-object p1, p0, Lq4/j;->d:Lq4/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lq4/j;->c:Z

    iput-object p2, p0, Lq4/j;->b:Lcom/google/android/gms/common/api/internal/j;

    iput-object p3, p0, Lq4/j;->a:Lq4/i;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/google/android/gms/common/api/internal/j;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq4/j;->b:Lcom/google/android/gms/common/api/internal/j;

    if-eq v0, p1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/j;->a()V

    iput-object p1, p0, Lq4/j;->b:Lcom/google/android/gms/common/api/internal/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lq4/a0;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq4/j;->b:Lcom/google/android/gms/common/api/internal/j;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/j;->b()Lcom/google/android/gms/common/api/internal/j$a;

    move-result-object v0

    iget-boolean v1, p0, Lq4/j;->c:Z

    iget-object v2, p0, Lq4/j;->b:Lcom/google/android/gms/common/api/internal/j;

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/j;->a()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v2, p0, Lq4/j;->a:Lq4/i;

    invoke-interface {v2, p1, v0, v1, p2}, Lq4/i;->a(Lq4/a0;Lcom/google/android/gms/common/api/internal/j$a;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized zza()Lcom/google/android/gms/common/api/internal/j;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lq4/j;->b:Lcom/google/android/gms/common/api/internal/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzb()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lq4/j;->c:Z

    iget-object v0, p0, Lq4/j;->b:Lcom/google/android/gms/common/api/internal/j;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/j;->b()Lcom/google/android/gms/common/api/internal/j$a;

    move-result-object v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lq4/j;->d:Lq4/k;

    const/16 v2, 0x989

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/common/api/e;->m(Lcom/google/android/gms/common/api/internal/j$a;I)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
