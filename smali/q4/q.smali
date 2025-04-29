.class final Lq4/q;
.super Lcom/google/android/gms/common/api/internal/g$a;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method constructor <init>(Lq4/a0;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p2, p0, Lq4/q;->a:Ljava/lang/Object;

    iput-object p3, p0, Lq4/q;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final p1(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lq4/q;->a:Ljava/lang/Object;

    iget-object v1, p0, Lq4/q;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/api/internal/v;->b(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
