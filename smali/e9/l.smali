.class public final synthetic Le9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lr8/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr8/i<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Le9/m$b;->d:Le9/m$b;

    return-object v0
.end method

.method public static synthetic b(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-interface {p0}, Le9/m$a;->a()V

    const/4 p0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    invoke-interface {p2, p1}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$c;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->j(Le9/m$c;)Le9/m$i;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$f;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->k(Le9/m$f;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$i;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->h(Le9/m$i;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$e;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->i(Le9/m$e;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$j;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->c(Le9/m$j;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$g;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->f(Le9/m$g;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$i;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->b(Le9/m$i;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$i;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->g(Le9/m$i;)Le9/m$h;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$h;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->e(Le9/m$h;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Le9/m$a;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/m$i;

    :try_start_0
    invoke-interface {p0, p1}, Le9/m$a;->l(Le9/m$i;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Le9/m;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static m(Lr8/c;Le9/m$a;)V
    .locals 4

    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.AndroidVideoPlayerApi.initialize"

    invoke-direct {v0, p0, v2, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Le9/a;

    invoke-direct {v2, p1}, Le9/a;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_0
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.create"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Le9/c;

    invoke-direct {v2, p1}, Le9/c;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_1
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.dispose"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_2

    new-instance v2, Le9/e;

    invoke-direct {v2, p1}, Le9/e;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_2
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setLooping"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_3

    new-instance v2, Le9/f;

    invoke-direct {v2, p1}, Le9/f;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_3
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setVolume"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_4

    new-instance v2, Le9/g;

    invoke-direct {v2, p1}, Le9/g;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_4
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setPlaybackSpeed"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_5

    new-instance v2, Le9/h;

    invoke-direct {v2, p1}, Le9/h;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_5
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.play"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_6

    new-instance v2, Le9/i;

    invoke-direct {v2, p1}, Le9/i;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_6
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.position"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_7

    new-instance v2, Le9/j;

    invoke-direct {v2, p1}, Le9/j;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_7
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.seekTo"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_8

    new-instance v2, Le9/k;

    invoke-direct {v2, p1}, Le9/k;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_8
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.pause"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_9

    new-instance v2, Le9/b;

    invoke-direct {v2, p1}, Le9/b;-><init>(Le9/m$a;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_9
    new-instance v0, Lr8/a;

    invoke-static {}, Le9/l;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.AndroidVideoPlayerApi.setMixWithOthers"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_a

    new-instance p0, Le9/d;

    invoke-direct {p0, p1}, Le9/d;-><init>(Le9/m$a;)V

    invoke-virtual {v0, p0}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_a

    :cond_a
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_a
    return-void
.end method
