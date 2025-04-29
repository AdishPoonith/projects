.class public final synthetic Lp6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lp6/w;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lp6/w;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/t;->a:Lp6/w;

    iput-object p2, p0, Lp6/t;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lp6/t;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lp6/t;->a:Lp6/w;

    iget-object v1, p0, Lp6/t;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Lp6/t;->c:Ljava/lang/Object;

    invoke-static {v0, v1, v2, p1}, Lp6/w;->a(Lp6/w;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
