.class Lcom/google/firebase/storage/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final j:Lcom/google/firebase/storage/l;

.field private final k:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/storage/k;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/google/firebase/storage/k;

.field private m:Lcom/google/firebase/storage/k;

.field private n:Lx6/c;


# direct methods
.method public constructor <init>(Lcom/google/firebase/storage/l;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/storage/k;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/l;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/storage/k;",
            ">;",
            "Lcom/google/firebase/storage/k;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/storage/z;->m:Lcom/google/firebase/storage/k;

    iput-object p1, p0, Lcom/google/firebase/storage/z;->j:Lcom/google/firebase/storage/l;

    iput-object p2, p0, Lcom/google/firebase/storage/z;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lcom/google/firebase/storage/z;->l:Lcom/google/firebase/storage/k;

    invoke-virtual {p1}, Lcom/google/firebase/storage/l;->v()Lcom/google/firebase/storage/d;

    move-result-object p1

    new-instance p2, Lx6/c;

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->a()Lw5/f;

    move-result-object p3

    invoke-virtual {p3}, Lw5/f;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->c()La6/b;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->b()Lz5/b;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->k()J

    move-result-wide v4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lx6/c;-><init>(Landroid/content/Context;La6/b;Lz5/b;J)V

    iput-object p2, p0, Lcom/google/firebase/storage/z;->n:Lx6/c;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    new-instance v0, Ly6/k;

    iget-object v1, p0, Lcom/google/firebase/storage/z;->j:Lcom/google/firebase/storage/l;

    invoke-virtual {v1}, Lcom/google/firebase/storage/l;->w()Lx6/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/z;->j:Lcom/google/firebase/storage/l;

    invoke-virtual {v2}, Lcom/google/firebase/storage/l;->k()Lw5/f;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/z;->l:Lcom/google/firebase/storage/k;

    invoke-virtual {v3}, Lcom/google/firebase/storage/k;->q()Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ly6/k;-><init>(Lx6/h;Lw5/f;Lorg/json/JSONObject;)V

    iget-object v1, p0, Lcom/google/firebase/storage/z;->n:Lx6/c;

    invoke-virtual {v1, v0}, Lx6/c;->d(Ly6/e;)V

    invoke-virtual {v0}, Ly6/e;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    new-instance v1, Lcom/google/firebase/storage/k$b;

    invoke-virtual {v0}, Ly6/e;->o()Lorg/json/JSONObject;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/z;->j:Lcom/google/firebase/storage/l;

    invoke-direct {v1, v2, v3}, Lcom/google/firebase/storage/k$b;-><init>(Lorg/json/JSONObject;Lcom/google/firebase/storage/l;)V

    invoke-virtual {v1}, Lcom/google/firebase/storage/k$b;->a()Lcom/google/firebase/storage/k;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/storage/z;->m:Lcom/google/firebase/storage/k;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to parse a valid JSON object from resulting metadata:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ly6/e;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "UpdateMetadataTask"

    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lcom/google/firebase/storage/z;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1}, Lcom/google/firebase/storage/j;->d(Ljava/lang/Throwable;)Lcom/google/firebase/storage/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/firebase/storage/z;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/google/firebase/storage/z;->m:Lcom/google/firebase/storage/k;

    invoke-virtual {v0, v1, v2}, Ly6/e;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
