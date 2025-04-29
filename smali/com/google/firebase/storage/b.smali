.class Lcom/google/firebase/storage/b;
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
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lx6/c;


# direct methods
.method public constructor <init>(Lcom/google/firebase/storage/l;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/l;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/firebase/storage/b;->j:Lcom/google/firebase/storage/l;

    iput-object p2, p0, Lcom/google/firebase/storage/b;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

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

    iput-object p2, p0, Lcom/google/firebase/storage/b;->l:Lx6/c;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Ly6/a;

    iget-object v1, p0, Lcom/google/firebase/storage/b;->j:Lcom/google/firebase/storage/l;

    invoke-virtual {v1}, Lcom/google/firebase/storage/l;->w()Lx6/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/b;->j:Lcom/google/firebase/storage/l;

    invoke-virtual {v2}, Lcom/google/firebase/storage/l;->k()Lw5/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ly6/a;-><init>(Lx6/h;Lw5/f;)V

    iget-object v1, p0, Lcom/google/firebase/storage/b;->l:Lx6/c;

    invoke-virtual {v1, v0}, Lx6/c;->d(Ly6/e;)V

    iget-object v1, p0, Lcom/google/firebase/storage/b;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ly6/e;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V

    return-void
.end method
