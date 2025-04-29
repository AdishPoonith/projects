.class Lcom/google/firebase/storage/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private j:Lcom/google/firebase/storage/l;

.field private k:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/storage/k;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/google/firebase/storage/k;

.field private m:Lx6/c;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/l;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/l;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lcom/google/firebase/storage/k;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/firebase/storage/g;->j:Lcom/google/firebase/storage/l;

    iput-object p2, p0, Lcom/google/firebase/storage/g;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/firebase/storage/l;->u()Lcom/google/firebase/storage/l;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/storage/l;->r()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/firebase/storage/l;->r()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/firebase/storage/g;->j:Lcom/google/firebase/storage/l;

    invoke-virtual {p1}, Lcom/google/firebase/storage/l;->v()Lcom/google/firebase/storage/d;

    move-result-object p1

    new-instance p2, Lx6/c;

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->a()Lw5/f;

    move-result-object v0

    invoke-virtual {v0}, Lw5/f;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->c()La6/b;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->b()Lz5/b;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->j()J

    move-result-wide v4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lx6/c;-><init>(Landroid/content/Context;La6/b;Lz5/b;J)V

    iput-object p2, p0, Lcom/google/firebase/storage/g;->m:Lx6/c;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "getMetadata() is not supported at the root of the bucket."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public run()V
    .locals 4

    new-instance v0, Ly6/b;

    iget-object v1, p0, Lcom/google/firebase/storage/g;->j:Lcom/google/firebase/storage/l;

    invoke-virtual {v1}, Lcom/google/firebase/storage/l;->w()Lx6/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/g;->j:Lcom/google/firebase/storage/l;

    invoke-virtual {v2}, Lcom/google/firebase/storage/l;->k()Lw5/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ly6/b;-><init>(Lx6/h;Lw5/f;)V

    iget-object v1, p0, Lcom/google/firebase/storage/g;->m:Lx6/c;

    invoke-virtual {v1, v0}, Lx6/c;->d(Ly6/e;)V

    invoke-virtual {v0}, Ly6/e;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    new-instance v1, Lcom/google/firebase/storage/k$b;

    invoke-virtual {v0}, Ly6/e;->o()Lorg/json/JSONObject;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/g;->j:Lcom/google/firebase/storage/l;

    invoke-direct {v1, v2, v3}, Lcom/google/firebase/storage/k$b;-><init>(Lorg/json/JSONObject;Lcom/google/firebase/storage/l;)V

    invoke-virtual {v1}, Lcom/google/firebase/storage/k$b;->a()Lcom/google/firebase/storage/k;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/storage/g;->l:Lcom/google/firebase/storage/k;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to parse resulting metadata. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ly6/e;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "GetMetadataTask"

    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lcom/google/firebase/storage/g;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1}, Lcom/google/firebase/storage/j;->d(Ljava/lang/Throwable;)Lcom/google/firebase/storage/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/firebase/storage/g;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/google/firebase/storage/g;->l:Lcom/google/firebase/storage/k;

    invoke-virtual {v0, v1, v2}, Ly6/e;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
