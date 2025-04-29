.class public final synthetic Ld9/f;
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

    sget-object v0, Ld9/a$c;->d:Ld9/a$c;

    return-object v0
.end method

.method public static synthetic b(Ld9/a$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-interface {p0, p1}, Ld9/a$b;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Ld9/a$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    :try_start_0
    invoke-interface {p0, v2, p1}, Ld9/a$b;->c(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Ld9/a$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/a$d;

    :try_start_0
    invoke-interface {p0, v2, p1}, Ld9/a$b;->d(Ljava/lang/String;Ld9/a$d;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Ld9/a$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-interface {p0}, Ld9/a$b;->b()V

    const/4 p0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    invoke-interface {p2, p1}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static f(Lr8/c;Ld9/a$b;)V
    .locals 4

    new-instance v0, Lr8/a;

    invoke-static {}, Ld9/f;->a()Lr8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.UrlLauncherApi.canLaunchUrl"

    invoke-direct {v0, p0, v2, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Ld9/b;

    invoke-direct {v2, p1}, Ld9/b;-><init>(Ld9/a$b;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_0
    new-instance v0, Lr8/a;

    invoke-static {}, Ld9/f;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.UrlLauncherApi.launchUrl"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Ld9/c;

    invoke-direct {v2, p1}, Ld9/c;-><init>(Ld9/a$b;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_1
    new-instance v0, Lr8/a;

    invoke-static {}, Ld9/f;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.UrlLauncherApi.openUrlInWebView"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_2

    new-instance v2, Ld9/d;

    invoke-direct {v2, p1}, Ld9/d;-><init>(Ld9/a$b;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_2
    new-instance v0, Lr8/a;

    invoke-static {}, Ld9/f;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.UrlLauncherApi.closeWebView"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_3

    new-instance p0, Ld9/e;

    invoke-direct {p0, p1}, Ld9/e;-><init>(Ld9/a$b;)V

    invoke-virtual {v0, p0}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_3
    return-void
.end method
