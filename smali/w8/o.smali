.class public Lw8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw8/f;
.implements Lr8/d$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw8/o$a;
    }
.end annotation


# instance fields
.field final a:Lw8/o$a;

.field final b:Ljava/util/concurrent/Semaphore;

.field final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lw8/o$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lw8/o;->b:Ljava/util/concurrent/Semaphore;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lw8/o;->c:Ljava/util/Map;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lw8/o;->d:Landroid/os/Handler;

    iput-object p1, p0, Lw8/o;->a:Lw8/o$a;

    return-void
.end method

.method public static synthetic d(Lr8/d$b;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lw8/o;->h(Lr8/d$b;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic e(Lw8/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lw8/o;->k(Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic f(Lw8/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;Ljava/lang/Long;Lcom/google/firebase/firestore/d1;)Lv8/x;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lw8/o;->i(Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;Ljava/lang/Long;Lcom/google/firebase/firestore/d1;)Lv8/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lr8/d$b;Ljava/util/HashMap;)V
    .locals 0

    invoke-static {p0, p1}, Lw8/o;->j(Lr8/d$b;Ljava/util/HashMap;)V

    return-void
.end method

.method private static synthetic h(Lr8/d$b;Ljava/util/Map;)V
    .locals 0

    invoke-interface {p0, p1}, Lr8/d$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic i(Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;Ljava/lang/Long;Lcom/google/firebase/firestore/d1;)Lv8/x;
    .locals 6

    iget-object v0, p0, Lw8/o;->a:Lw8/o$a;

    invoke-interface {v0, p4}, Lw8/o$a;->a(Lcom/google/firebase/firestore/d1;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->r()Lw5/f;

    move-result-object v1

    invoke-virtual {v1}, Lw5/f;->q()Ljava/lang/String;

    move-result-object v1

    const-string v2, "appName"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lw8/o;->d:Landroid/os/Handler;

    new-instance v2, Lw8/n;

    invoke-direct {v2, p2, v0}, Lw8/n;-><init>(Lr8/d$b;Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    iget-object p2, p0, Lw8/o;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, p3}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result p2

    if-nez p2, :cond_0

    new-instance p1, Lcom/google/firebase/firestore/z;

    const-string p2, "timed out"

    sget-object p3, Lcom/google/firebase/firestore/z$a;->o:Lcom/google/firebase/firestore/z$a;

    invoke-direct {p1, p2, p3}, Lcom/google/firebase/firestore/z;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/z$a;)V

    invoke-static {p1}, Lv8/x;->b(Ljava/lang/Exception;)Lv8/x;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    iget-object p2, p0, Lw8/o;->c:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Lv8/x;->a()Lv8/x;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, Lw8/o;->c:Ljava/util/Map;

    const-string p3, "type"

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v0, "ERROR"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Lv8/x;->a()Lv8/x;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p2, p0, Lw8/o;->c:Ljava/util/Map;

    const-string v0, "commands"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "path"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->o(Ljava/lang/String;)Lcom/google/firebase/firestore/m;

    move-result-object v2

    const-string v3, "data"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    const/4 v4, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v5, "DELETE"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x2

    goto :goto_1

    :sswitch_1
    const-string v5, "SET"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    goto :goto_1

    :sswitch_2
    const-string v5, "UPDATE"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p4, v2}, Lcom/google/firebase/firestore/d1;->b(Lcom/google/firebase/firestore/m;)Lcom/google/firebase/firestore/d1;

    goto :goto_0

    :pswitch_1
    const-string v1, "options"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    const/4 v1, 0x0

    const-string v4, "merge"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {}, Lcom/google/firebase/firestore/y0;->c()Lcom/google/firebase/firestore/y0;

    move-result-object v1

    goto :goto_2

    :cond_6
    const-string v4, "mergeFields"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/firebase/firestore/y0;->d(Ljava/util/List;)Lcom/google/firebase/firestore/y0;

    move-result-object v1

    :cond_7
    :goto_2
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v1, :cond_8

    invoke-virtual {p4, v2, v3}, Lcom/google/firebase/firestore/d1;->f(Lcom/google/firebase/firestore/m;Ljava/lang/Object;)Lcom/google/firebase/firestore/d1;

    goto/16 :goto_0

    :cond_8
    invoke-virtual {p4, v2, v3, v1}, Lcom/google/firebase/firestore/d1;->g(Lcom/google/firebase/firestore/m;Ljava/lang/Object;Lcom/google/firebase/firestore/y0;)Lcom/google/firebase/firestore/d1;

    goto/16 :goto_0

    :pswitch_2
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-virtual {p4, v2, v3}, Lcom/google/firebase/firestore/d1;->i(Lcom/google/firebase/firestore/m;Ljava/util/Map;)Lcom/google/firebase/firestore/d1;

    goto/16 :goto_0

    :cond_9
    invoke-static {}, Lv8/x;->a()Lv8/x;

    move-result-object p1

    return-object p1

    :catch_0
    new-instance p1, Lcom/google/firebase/firestore/z;

    sget-object p2, Lcom/google/firebase/firestore/z$a;->o:Lcom/google/firebase/firestore/z$a;

    const-string p3, "interrupted"

    invoke-direct {p1, p3, p2}, Lcom/google/firebase/firestore/z;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/z$a;)V

    invoke-static {p1}, Lv8/x;->b(Ljava/lang/Exception;)Lv8/x;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x6a6cd337 -> :sswitch_2
        0x14042 -> :sswitch_1
        0x77f979ab -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static synthetic j(Lr8/d$b;Ljava/util/HashMap;)V
    .locals 0

    invoke-interface {p0, p1}, Lr8/d$b;->a(Ljava/lang/Object;)V

    invoke-interface {p0}, Lr8/d$b;->c()V

    return-void
.end method

.method private synthetic k(Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv8/x;

    iget-object v1, v1, Lv8/x;->a:Ljava/lang/Exception;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string p3, "complete"

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p3

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lv8/x;

    iget-object p3, p3, Lv8/x;->a:Ljava/lang/Exception;

    :goto_1
    invoke-virtual {p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->r()Lw5/f;

    move-result-object p1

    invoke-virtual {p1}, Lw5/f;->q()Ljava/lang/String;

    move-result-object p1

    const-string v1, "appName"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lx8/a;->a(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p1

    const-string p3, "error"

    :goto_2
    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object p1, p0, Lw8/o;->d:Landroid/os/Handler;

    new-instance p3, Lw8/m;

    invoke-direct {p3, p2, v0}, Lw8/m;-><init>(Lr8/d$b;Ljava/util/HashMap;)V

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lw8/o;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lw8/o;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method

.method public b(Ljava/lang/Object;Lr8/d$b;)V
    .locals 3

    check-cast p1, Ljava/util/Map;

    const-string v0, "firestore"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    const-string v1, "timeout"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Long;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/Long;

    goto :goto_1

    :cond_0
    instance-of v2, v1, Ljava/lang/Integer;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x1388

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_1
    const-string v2, "maxAttempts"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v2, Lcom/google/firebase/firestore/e1$b;

    invoke-direct {v2}, Lcom/google/firebase/firestore/e1$b;-><init>()V

    invoke-virtual {v2, p1}, Lcom/google/firebase/firestore/e1$b;->b(I)Lcom/google/firebase/firestore/e1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/e1$b;->a()Lcom/google/firebase/firestore/e1;

    move-result-object p1

    new-instance v2, Lw8/l;

    invoke-direct {v2, p0, v0, p2, v1}, Lw8/l;-><init>(Lw8/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;Ljava/lang/Long;)V

    invoke-virtual {v0, p1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->I(Lcom/google/firebase/firestore/e1;Lcom/google/firebase/firestore/d1$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v1, Lw8/k;

    invoke-direct {v1, p0, v0, p2}, Lw8/k;-><init>(Lw8/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lw8/o;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method
