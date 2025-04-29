.class public final Lq0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq0/n;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq0/n;

    invoke-direct {v0}, Lq0/n;-><init>()V

    sput-object v0, Lq0/n;->a:Lq0/n;

    const-class v0, Lq0/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq0/n;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final declared-synchronized a(Lq0/a;Lq0/e0;)V
    .locals 2

    const-class v0, Lq0/n;

    monitor-enter v0

    :try_start_0
    invoke-static {v0}, Lk1/a;->d(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "accessTokenAppIdPair"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "appEvents"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ly0/g;->a:Ly0/g;

    invoke-static {}, Ly0/g;->b()V

    sget-object v1, Lq0/f;->a:Lq0/f;

    invoke-static {}, Lq0/f;->a()Lq0/d0;

    move-result-object v1

    invoke-virtual {p1}, Lq0/e0;->d()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Lq0/d0;->a(Lq0/a;Ljava/util/List;)V

    invoke-static {v1}, Lq0/f;->b(Lq0/d0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    invoke-static {p0, v0}, Lk1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final declared-synchronized b(Lq0/e;)V
    .locals 5

    const-class v0, Lq0/n;

    monitor-enter v0

    :try_start_0
    invoke-static {v0}, Lk1/a;->d(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "eventsToPersist"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ly0/g;->a:Ly0/g;

    invoke-static {}, Ly0/g;->b()V

    sget-object v1, Lq0/f;->a:Lq0/f;

    invoke-static {}, Lq0/f;->a()Lq0/d0;

    move-result-object v1

    invoke-virtual {p0}, Lq0/e;->f()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq0/a;

    invoke-virtual {p0, v3}, Lq0/e;->c(Lq0/a;)Lq0/e0;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lq0/e0;->d()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lq0/d0;->a(Lq0/a;Ljava/util/List;)V

    goto :goto_0

    :cond_1
    const-string p0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    sget-object p0, Lq0/f;->a:Lq0/f;

    invoke-static {v1}, Lq0/f;->b(Lq0/d0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    invoke-static {p0, v0}, Lk1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method
