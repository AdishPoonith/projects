.class public Lx6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static c:Z = false


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/g;->b:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    sget-boolean p1, Lx6/g;->c:Z

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lx6/g;->a:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lx6/g;->a:Landroid/os/Handler;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx6/g;->a:Landroid/os/Handler;

    if-nez v0, :cond_1

    iget-object v0, p0, Lx6/g;->b:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lw6/m;->b()Lw6/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw6/m;->c(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
