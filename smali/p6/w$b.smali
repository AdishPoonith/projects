.class Lp6/w$b;
.super Li9/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/w;->m(Li9/z0;Lp6/h0;)Li9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li9/z<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:[Li9/g;

.field final synthetic b:Lcom/google/android/gms/tasks/Task;

.field final synthetic c:Lp6/w;


# direct methods
.method constructor <init>(Lp6/w;[Li9/g;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Lp6/w$b;->c:Lp6/w;

    iput-object p2, p0, Lp6/w$b;->a:[Li9/g;

    iput-object p3, p0, Lp6/w$b;->b:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Li9/z;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    iget-object v0, p0, Lp6/w$b;->a:[Li9/g;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lp6/w$b;->b:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lp6/w$b;->c:Lp6/w;

    invoke-static {v1}, Lp6/w;->d(Lp6/w;)Lq6/g;

    move-result-object v1

    invoke-virtual {v1}, Lq6/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    sget-object v2, Lp6/x;->a:Lp6/x;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Li9/z;->b()V

    :goto_0
    return-void
.end method

.method protected f()Li9/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lp6/w$b;->a:[Li9/g;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "ClientCall used before onOpen() callback"

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/w$b;->a:[Li9/g;

    aget-object v0, v0, v1

    return-object v0
.end method
