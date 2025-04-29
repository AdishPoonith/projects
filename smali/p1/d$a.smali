.class public final Lp1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lp1/d$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lp1/d$a;)V
    .locals 0

    invoke-direct {p0}, Lp1/d$a;->d()V

    return-void
.end method

.method private final d()V
    .locals 2

    invoke-static {}, Lp1/d;->d()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    invoke-static {}, Lp1/d;->e()Lq/f;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lp1/d;->c()Lq/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lp1/d;->k:Lp1/d$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq/c;->d(Lq/b;)Lq/f;

    move-result-object v0

    invoke-static {v0}, Lp1/d;->f(Lq/f;)V

    :cond_1
    :goto_0
    invoke-static {}, Lp1/d;->d()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method


# virtual methods
.method public final b()Lq/f;
    .locals 2

    invoke-static {}, Lp1/d;->d()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    invoke-static {}, Lp1/d;->e()Lq/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lp1/d;->f(Lq/f;)V

    invoke-static {}, Lp1/d;->d()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0
.end method

.method public final c(Landroid/net/Uri;)V
    .locals 2

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lp1/d$a;->d()V

    invoke-static {}, Lp1/d;->d()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    invoke-static {}, Lp1/d;->e()Lq/f;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1}, Lq/f;->f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z

    :goto_0
    invoke-static {}, Lp1/d;->d()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method
