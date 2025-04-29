.class Lv7/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Lr8/k$d;

.field private final b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lr8/k$d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lv7/e$a;->b:Landroid/os/Handler;

    iput-object p1, p0, Lv7/e$a;->a:Lr8/k$d;

    return-void
.end method

.method public static synthetic d(Lv7/e$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv7/e$a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lv7/e$a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lv7/e$a;->g(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lv7/e$a;->a:Lr8/k$d;

    invoke-interface {v0, p1, p2, p3}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lv7/e$a;->a:Lr8/k$d;

    invoke-interface {v0, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lv7/e$a;->b:Landroid/os/Handler;

    new-instance v1, Lv7/c;

    invoke-direct {v1, p0, p1}, Lv7/c;-><init>(Lv7/e$a;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lv7/e$a;->b:Landroid/os/Handler;

    new-instance v1, Lv7/d;

    invoke-direct {v1, p0, p1, p2, p3}, Lv7/d;-><init>(Lv7/e$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lv7/e$a;->b:Landroid/os/Handler;

    iget-object v1, p0, Lv7/e$a;->a:Lr8/k$d;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lv7/b;

    invoke-direct {v2, v1}, Lv7/b;-><init>(Lr8/k$d;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
