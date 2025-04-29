.class public final Lp0/v0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/v0;
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

    invoke-direct {p0}, Lp0/v0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lp0/v0;
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lp0/v0;->a()Lp0/v0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lp0/f0;->a:Lp0/f0;

    invoke-static {}, Lp0/f0;->l()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le0/a;->b(Landroid/content/Context;)Le0/a;

    move-result-object v0

    const-string v1, "getInstance(applicationContext)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lp0/v0;

    new-instance v2, Lp0/u0;

    invoke-direct {v2}, Lp0/u0;-><init>()V

    invoke-direct {v1, v0, v2}, Lp0/v0;-><init>(Le0/a;Lp0/u0;)V

    invoke-static {v1}, Lp0/v0;->b(Lp0/v0;)V

    :cond_0
    invoke-static {}, Lp0/v0;->a()Lp0/v0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    return-object v0

    :cond_1
    :try_start_1
    const-string v0, "instance"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
