.class final Ln0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$d;


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lr8/k$d;


# direct methods
.method public constructor <init>(Lr8/k$d;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ln0/d;->a:Landroid/os/Handler;

    iput-object p1, p0, Ln0/d;->b:Lr8/k$d;

    return-void
.end method

.method public static synthetic d(Ln0/d;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ln0/d;->i(Ln0/d;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Ln0/d;)V
    .locals 0

    invoke-static {p0}, Ln0/d;->h(Ln0/d;)V

    return-void
.end method

.method public static synthetic f(Ln0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln0/d;->g(Ln0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(Ln0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln0/d;->b:Lr8/k$d;

    invoke-interface {p0, p1, p2, p3}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Ln0/d;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln0/d;->b:Lr8/k$d;

    invoke-interface {p0}, Lr8/k$d;->c()V

    return-void
.end method

.method private static final i(Ln0/d;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln0/d;->b:Lr8/k$d;

    invoke-interface {p0, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ln0/d;->a:Landroid/os/Handler;

    new-instance v1, Ln0/b;

    invoke-direct {v1, p0, p1}, Ln0/b;-><init>(Ln0/d;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln0/d;->a:Landroid/os/Handler;

    new-instance v1, Ln0/c;

    invoke-direct {v1, p0, p1, p2, p3}, Ln0/c;-><init>(Ln0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Ln0/d;->a:Landroid/os/Handler;

    new-instance v1, Ln0/a;

    invoke-direct {v1, p0}, Ln0/a;-><init>(Ln0/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
