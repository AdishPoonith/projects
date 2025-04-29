.class public final synthetic Lu8/c1;
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

    sget-object v0, Lu8/v0$e;->d:Lu8/v0$e;

    return-object v0
.end method

.method public static synthetic b(Lu8/v0$d;Ljava/lang/Object;Lr8/a$e;)V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu8/v0$h;

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v3, Lu8/c1$a;

    invoke-direct {v3, v0, p2}, Lu8/c1$a;-><init>(Ljava/util/Map;Lr8/a$e;)V

    invoke-interface {p0, v1, v2, p1, v3}, Lu8/v0$d;->b(Ljava/lang/String;Lu8/v0$h;Ljava/lang/String;Lu8/v0$i;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "assertionArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "appNameArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lu8/v0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic c(Lu8/v0$d;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    new-instance v1, Lu8/c1$b;

    invoke-direct {v1, v0, p2}, Lu8/c1$b;-><init>(Ljava/util/Map;Lr8/a$e;)V

    invoke-interface {p0, p1, v1}, Lu8/v0$d;->c(Ljava/lang/String;Lu8/v0$i;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "appNameArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lu8/v0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic d(Lu8/v0$d;Ljava/lang/Object;Lr8/a$e;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v2, Lu8/c1$c;

    invoke-direct {v2, v0, p2}, Lu8/c1$c;-><init>(Ljava/util/Map;Lr8/a$e;)V

    invoke-interface {p0, v1, p1, v2}, Lu8/v0$d;->h(Ljava/lang/String;Ljava/lang/String;Lu8/v0$i;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "appNameArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lu8/v0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic e(Lu8/v0$d;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    new-instance v1, Lu8/c1$d;

    invoke-direct {v1, v0, p2}, Lu8/c1$d;-><init>(Ljava/util/Map;Lr8/a$e;)V

    invoke-interface {p0, p1, v1}, Lu8/v0$d;->i(Ljava/lang/String;Lu8/v0$i;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "appNameArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lu8/v0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static f(Lr8/c;Lu8/v0$d;)V
    .locals 4

    new-instance v0, Lr8/a;

    invoke-static {}, Lu8/c1;->a()Lr8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.MultiFactorUserHostApi.enrollPhone"

    invoke-direct {v0, p0, v2, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lu8/y0;

    invoke-direct {v2, p1}, Lu8/y0;-><init>(Lu8/v0$d;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_0
    new-instance v0, Lr8/a;

    invoke-static {}, Lu8/c1;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.MultiFactorUserHostApi.getSession"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Lu8/z0;

    invoke-direct {v2, p1}, Lu8/z0;-><init>(Lu8/v0$d;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_1
    new-instance v0, Lr8/a;

    invoke-static {}, Lu8/c1;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.MultiFactorUserHostApi.unenroll"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_2

    new-instance v2, Lu8/a1;

    invoke-direct {v2, p1}, Lu8/a1;-><init>(Lu8/v0$d;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_2
    new-instance v0, Lr8/a;

    invoke-static {}, Lu8/c1;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.MultiFactorUserHostApi.getEnrolledFactors"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_3

    new-instance p0, Lu8/b1;

    invoke-direct {p0, p1}, Lu8/b1;-><init>(Lu8/v0$d;)V

    invoke-virtual {v0, p0}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_3
    return-void
.end method
