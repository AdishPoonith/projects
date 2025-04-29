.class public Lp6/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/w$e;
    }
.end annotation


# static fields
.field private static final g:Li9/y0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/y0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Li9/y0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/y0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Li9/y0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/y0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile j:Ljava/lang/String;


# instance fields
.field private final a:Lq6/g;

.field private final b:Lh6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh6/a<",
            "Lh6/j;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lh6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh6/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lp6/f0;

.field private final e:Ljava/lang/String;

.field private final f:Lp6/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Li9/y0;->e:Li9/y0$d;

    const-string v1, "x-goog-api-client"

    invoke-static {v1, v0}, Li9/y0$g;->e(Ljava/lang/String;Li9/y0$d;)Li9/y0$g;

    move-result-object v1

    sput-object v1, Lp6/w;->g:Li9/y0$g;

    const-string v1, "google-cloud-resource-prefix"

    invoke-static {v1, v0}, Li9/y0$g;->e(Ljava/lang/String;Li9/y0$d;)Li9/y0$g;

    move-result-object v1

    sput-object v1, Lp6/w;->h:Li9/y0$g;

    const-string v1, "x-goog-request-params"

    invoke-static {v1, v0}, Li9/y0$g;->e(Ljava/lang/String;Li9/y0$d;)Li9/y0$g;

    move-result-object v0

    sput-object v0, Lp6/w;->i:Li9/y0$g;

    const-string v0, "gl-java/"

    sput-object v0, Lp6/w;->j:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lq6/g;Landroid/content/Context;Lh6/a;Lh6/a;Lj6/m;Lp6/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/g;",
            "Landroid/content/Context;",
            "Lh6/a<",
            "Lh6/j;",
            ">;",
            "Lh6/a<",
            "Ljava/lang/String;",
            ">;",
            "Lj6/m;",
            "Lp6/g0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/w;->a:Lq6/g;

    iput-object p6, p0, Lp6/w;->f:Lp6/g0;

    iput-object p3, p0, Lp6/w;->b:Lh6/a;

    iput-object p4, p0, Lp6/w;->c:Lh6/a;

    new-instance p6, Lp6/s;

    invoke-direct {p6, p3, p4}, Lp6/s;-><init>(Lh6/a;Lh6/a;)V

    new-instance p3, Lp6/f0;

    invoke-direct {p3, p1, p2, p5, p6}, Lp6/f0;-><init>(Lq6/g;Landroid/content/Context;Lj6/m;Li9/b;)V

    iput-object p3, p0, Lp6/w;->d:Lp6/f0;

    invoke-virtual {p5}, Lj6/m;->a()Lm6/f;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lm6/f;->k()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x0

    aput-object p3, p2, p4

    invoke-virtual {p1}, Lm6/f;->i()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x1

    aput-object p1, p2, p3

    const-string p1, "projects/%s/databases/%s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lp6/w;->e:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lp6/w;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lp6/w;->j(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic b(Lp6/w;[Li9/g;Lp6/h0;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lp6/w;->i([Li9/g;Lp6/h0;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic c(Lp6/w;Lp6/w$e;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lp6/w;->k(Lp6/w$e;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method static synthetic d(Lp6/w;)Lq6/g;
    .locals 0

    iget-object p0, p0, Lp6/w;->a:Lq6/g;

    return-object p0
.end method

.method static synthetic e(Lp6/w;Li9/j1;)Lcom/google/firebase/firestore/z;
    .locals 0

    invoke-direct {p0, p1}, Lp6/w;->f(Li9/j1;)Lcom/google/firebase/firestore/z;

    move-result-object p0

    return-object p0
.end method

.method private f(Li9/j1;)Lcom/google/firebase/firestore/z;
    .locals 3

    invoke-static {p1}, Lp6/o;->i(Li9/j1;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/z;

    invoke-virtual {p1}, Li9/j1;->m()Li9/j1$b;

    move-result-object v1

    invoke-virtual {v1}, Li9/j1$b;->h()I

    move-result v1

    invoke-static {v1}, Lcom/google/firebase/firestore/z$a;->g(I)Lcom/google/firebase/firestore/z$a;

    move-result-object v1

    invoke-virtual {p1}, Li9/j1;->l()Ljava/lang/Throwable;

    move-result-object p1

    const-string v2, "The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices."

    invoke-direct {v0, v2, v1, p1}, Lcom/google/firebase/firestore/z;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/z$a;Ljava/lang/Throwable;)V

    return-object v0

    :cond_0
    invoke-static {p1}, Lq6/g0;->t(Li9/j1;)Lcom/google/firebase/firestore/z;

    move-result-object p1

    return-object p1
.end method

.method private g()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lp6/w;->j:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v2, "24.6.0"

    aput-object v2, v0, v1

    const-string v1, "%s fire/%s grpc/"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private synthetic i([Li9/g;Lp6/h0;Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li9/g;

    const/4 v0, 0x0

    aput-object p3, p1, v0

    aget-object p3, p1, v0

    new-instance v1, Lp6/w$a;

    invoke-direct {v1, p0, p2, p1}, Lp6/w$a;-><init>(Lp6/w;Lp6/h0;[Li9/g;)V

    invoke-direct {p0}, Lp6/w;->l()Li9/y0;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Li9/g;->e(Li9/g$a;Li9/y0;)V

    invoke-interface {p2}, Lp6/h0;->b()V

    aget-object p1, p1, v0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Li9/g;->c(I)V

    return-void
.end method

.method private synthetic j(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li9/g;

    new-instance v0, Lp6/w$d;

    invoke-direct {v0, p0, p1}, Lp6/w$d;-><init>(Lp6/w;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-direct {p0}, Lp6/w;->l()Li9/y0;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Li9/g;->e(Li9/g$a;Li9/y0;)V

    const/4 p1, 0x2

    invoke-virtual {p3, p1}, Li9/g;->c(I)V

    invoke-virtual {p3, p2}, Li9/g;->d(Ljava/lang/Object;)V

    invoke-virtual {p3}, Li9/g;->b()V

    return-void
.end method

.method private synthetic k(Lp6/w$e;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li9/g;

    new-instance v0, Lp6/w$c;

    invoke-direct {v0, p0, p1, p3}, Lp6/w$c;-><init>(Lp6/w;Lp6/w$e;Li9/g;)V

    invoke-direct {p0}, Lp6/w;->l()Li9/y0;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Li9/g;->e(Li9/g$a;Li9/y0;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Li9/g;->c(I)V

    invoke-virtual {p3, p2}, Li9/g;->d(Ljava/lang/Object;)V

    invoke-virtual {p3}, Li9/g;->b()V

    return-void
.end method

.method private l()Li9/y0;
    .locals 3

    new-instance v0, Li9/y0;

    invoke-direct {v0}, Li9/y0;-><init>()V

    sget-object v1, Lp6/w;->g:Li9/y0$g;

    invoke-direct {p0}, Lp6/w;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    sget-object v1, Lp6/w;->h:Li9/y0$g;

    iget-object v2, p0, Lp6/w;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    sget-object v1, Lp6/w;->i:Li9/y0$g;

    iget-object v2, p0, Lp6/w;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Li9/y0;->p(Li9/y0$g;Ljava/lang/Object;)V

    iget-object v1, p0, Lp6/w;->f:Lp6/g0;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lp6/g0;->a(Li9/y0;)V

    :cond_0
    return-object v0
.end method

.method public static p(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lp6/w;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public h()V
    .locals 1

    iget-object v0, p0, Lp6/w;->b:Lh6/a;

    invoke-virtual {v0}, Lh6/a;->b()V

    iget-object v0, p0, Lp6/w;->c:Lh6/a;

    invoke-virtual {v0}, Lh6/a;->b()V

    return-void
.end method

.method m(Li9/z0;Lp6/h0;)Li9/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Li9/z0<",
            "TReqT;TRespT;>;",
            "Lp6/h0<",
            "TRespT;>;)",
            "Li9/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Li9/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    iget-object v1, p0, Lp6/w;->d:Lp6/f0;

    invoke-virtual {v1, p1}, Lp6/f0;->i(Li9/z0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object v1, p0, Lp6/w;->a:Lq6/g;

    invoke-virtual {v1}, Lq6/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lp6/v;

    invoke-direct {v2, p0, v0, p2}, Lp6/v;-><init>(Lp6/w;[Li9/g;Lp6/h0;)V

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    new-instance p2, Lp6/w$b;

    invoke-direct {p2, p0, v0, p1}, Lp6/w$b;-><init>(Lp6/w;[Li9/g;Lcom/google/android/gms/tasks/Task;)V

    return-object p2
.end method

.method n(Li9/z0;Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Li9/z0<",
            "TReqT;TRespT;>;TReqT;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TRespT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v1, p0, Lp6/w;->d:Lp6/f0;

    invoke-virtual {v1, p1}, Lp6/f0;->i(Li9/z0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object v1, p0, Lp6/w;->a:Lq6/g;

    invoke-virtual {v1}, Lq6/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lp6/t;

    invoke-direct {v2, p0, v0, p2}, Lp6/t;-><init>(Lp6/w;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method o(Li9/z0;Ljava/lang/Object;Lp6/w$e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Li9/z0<",
            "TReqT;TRespT;>;TReqT;",
            "Lp6/w$e<",
            "TRespT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lp6/w;->d:Lp6/f0;

    invoke-virtual {v0, p1}, Lp6/f0;->i(Li9/z0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object v0, p0, Lp6/w;->a:Lq6/g;

    invoke-virtual {v0}, Lq6/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lp6/u;

    invoke-direct {v1, p0, p3, p2}, Lp6/u;-><init>(Lp6/w;Lp6/w$e;Ljava/lang/Object;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lp6/w;->d:Lp6/f0;

    invoke-virtual {v0}, Lp6/f0;->u()V

    return-void
.end method
