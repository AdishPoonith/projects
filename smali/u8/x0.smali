.class public final synthetic Lu8/x0;
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

    sget-object v0, Lu8/v0$c;->d:Lu8/v0$c;

    return-object v0
.end method

.method public static synthetic b(Lu8/v0$b;Ljava/lang/Object;Lr8/a$e;)V
    .locals 3

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

    move-result-object p1

    check-cast p1, Lu8/v0$h;

    if-eqz p1, :cond_0

    new-instance v2, Lu8/x0$a;

    invoke-direct {v2, v0, p2}, Lu8/x0$a;-><init>(Ljava/util/Map;Lr8/a$e;)V

    invoke-interface {p0, v1, p1, v2}, Lu8/v0$b;->a(Ljava/lang/String;Lu8/v0$h;Lu8/v0$i;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "assertionArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "resolverIdArg unexpectedly null."

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

.method public static c(Lr8/c;Lu8/v0$b;)V
    .locals 3

    new-instance v0, Lr8/a;

    invoke-static {}, Lu8/x0;->a()Lr8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.MultiFactoResolverHostApi.resolveSignIn"

    invoke-direct {v0, p0, v2, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_0

    new-instance p0, Lu8/w0;

    invoke-direct {p0, p1}, Lu8/w0;-><init>(Lu8/v0$b;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Lr8/a;->e(Lr8/a$d;)V

    return-void
.end method
