.class final La6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(La6/a0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, La6/w;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, La6/w;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, La6/w;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    iget-object p1, p0, La6/w;->b:Landroid/content/Context;

    invoke-static {p1}, La6/a0;->e(Landroid/content/Context;)V

    return-void
.end method
