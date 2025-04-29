.class public final synthetic Lc9/j;
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

    new-instance v0, Lr8/r;

    invoke-direct {v0}, Lr8/r;-><init>()V

    return-object v0
.end method

.method public static synthetic b(Lc9/a$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-interface {p0, p1}, Lc9/a$b;->remove(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lc9/a$b;Ljava/lang/Object;Lr8/a$e;)V
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

    check-cast p1, Ljava/lang/Boolean;

    :try_start_0
    invoke-interface {p0, v2, p1}, Lc9/a$b;->g(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lc9/a$b;Ljava/lang/Object;Lr8/a$e;)V
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

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-interface {p0, v2, p1}, Lc9/a$b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lc9/a$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 5

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

    check-cast p1, Ljava/lang/Number;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_0
    invoke-interface {p0, v2, p1}, Lc9/a$b;->c(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_1
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lc9/a$b;Ljava/lang/Object;Lr8/a$e;)V
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

    check-cast p1, Ljava/lang/Double;

    :try_start_0
    invoke-interface {p0, v2, p1}, Lc9/a$b;->h(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lc9/a$b;Ljava/lang/Object;Lr8/a$e;)V
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

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-interface {p0, v2, p1}, Lc9/a$b;->f(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Lc9/a$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-interface {p0, p1}, Lc9/a$b;->b(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lc9/a$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-interface {p0, p1}, Lc9/a$b;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc9/a;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static j(Lr8/c;Lc9/a$b;)V
    .locals 5

    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v0

    new-instance v1, Lr8/a;

    invoke-static {}, Lc9/j;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.SharedPreferencesApi.remove"

    invoke-direct {v1, p0, v3, v2, v0}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lc9/b;

    invoke-direct {v2, p1}, Lc9/b;-><init>(Lc9/a$b;)V

    invoke-virtual {v1, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_0
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lc9/j;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.SharedPreferencesApi.setBool"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_1

    new-instance v1, Lc9/c;

    invoke-direct {v1, p1}, Lc9/c;-><init>(Lc9/a$b;)V

    invoke-virtual {v2, v1}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_1
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lc9/j;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.SharedPreferencesApi.setString"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_2

    new-instance v1, Lc9/d;

    invoke-direct {v1, p1}, Lc9/d;-><init>(Lc9/a$b;)V

    invoke-virtual {v2, v1}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_2
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lc9/j;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.SharedPreferencesApi.setInt"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_3

    new-instance v1, Lc9/e;

    invoke-direct {v1, p1}, Lc9/e;-><init>(Lc9/a$b;)V

    invoke-virtual {v2, v1}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_3
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lc9/j;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.SharedPreferencesApi.setDouble"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_4

    new-instance v1, Lc9/f;

    invoke-direct {v1, p1}, Lc9/f;-><init>(Lc9/a$b;)V

    invoke-virtual {v2, v1}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_4
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lc9/j;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.SharedPreferencesApi.setStringList"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_5

    new-instance v1, Lc9/g;

    invoke-direct {v1, p1}, Lc9/g;-><init>(Lc9/a$b;)V

    invoke-virtual {v2, v1}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_5
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lc9/j;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.SharedPreferencesApi.clearWithPrefix"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_6

    new-instance v1, Lc9/h;

    invoke-direct {v1, p1}, Lc9/h;-><init>(Lc9/a$b;)V

    invoke-virtual {v2, v1}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_6
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lc9/j;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.SharedPreferencesApi.getAllWithPrefix"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_7

    new-instance p0, Lc9/i;

    invoke-direct {p0, p1}, Lc9/i;-><init>(Lc9/a$b;)V

    invoke-virtual {v2, p0}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_7

    :cond_7
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_7
    return-void
.end method
