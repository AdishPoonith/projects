.class public final synthetic Lio/flutter/plugins/firebase/core/p;
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

.method public static synthetic b(Lio/flutter/plugins/firebase/core/l$c;Ljava/lang/Object;Lr8/a$e;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    sget-boolean v1, Lio/flutter/plugins/firebase/core/l$b;->a:Z

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_2

    new-instance v2, Lio/flutter/plugins/firebase/core/p$a;

    invoke-direct {v2, v0, p2}, Lio/flutter/plugins/firebase/core/p$a;-><init>(Ljava/util/ArrayList;Lr8/a$e;)V

    invoke-interface {p0, v1, p1, v2}, Lio/flutter/plugins/firebase/core/l$c;->e(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/firebase/core/l$h;)V

    goto :goto_2

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "enabledArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "appNameArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    :goto_1
    invoke-static {p0}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-interface {p2, p0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/firebase/core/l$c;Ljava/lang/Object;Lr8/a$e;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    sget-boolean v1, Lio/flutter/plugins/firebase/core/l$b;->a:Z

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_2

    new-instance v2, Lio/flutter/plugins/firebase/core/p$b;

    invoke-direct {v2, v0, p2}, Lio/flutter/plugins/firebase/core/p$b;-><init>(Ljava/util/ArrayList;Lr8/a$e;)V

    invoke-interface {p0, v1, p1, v2}, Lio/flutter/plugins/firebase/core/l$c;->f(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/firebase/core/l$h;)V

    goto :goto_2

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "enabledArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "appNameArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    :goto_1
    invoke-static {p0}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-interface {p2, p0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/firebase/core/l$c;Ljava/lang/Object;Lr8/a$e;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    sget-boolean v1, Lio/flutter/plugins/firebase/core/l$b;->a:Z

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    new-instance v1, Lio/flutter/plugins/firebase/core/p$c;

    invoke-direct {v1, v0, p2}, Lio/flutter/plugins/firebase/core/p$c;-><init>(Ljava/util/ArrayList;Lr8/a$e;)V

    invoke-interface {p0, p1, v1}, Lio/flutter/plugins/firebase/core/l$c;->g(Ljava/lang/String;Lio/flutter/plugins/firebase/core/l$h;)V

    goto :goto_2

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "appNameArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    :goto_1
    invoke-static {p0}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-interface {p2, p0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public static e(Lr8/c;Lio/flutter/plugins/firebase/core/l$c;)V
    .locals 4

    new-instance v0, Lr8/a;

    invoke-static {}, Lio/flutter/plugins/firebase/core/p;->a()Lr8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled"

    invoke-direct {v0, p0, v2, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/firebase/core/m;

    invoke-direct {v2, p1}, Lio/flutter/plugins/firebase/core/m;-><init>(Lio/flutter/plugins/firebase/core/l$c;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_0
    new-instance v0, Lr8/a;

    invoke-static {}, Lio/flutter/plugins/firebase/core/p;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_1

    new-instance v2, Lio/flutter/plugins/firebase/core/n;

    invoke-direct {v2, p1}, Lio/flutter/plugins/firebase/core/n;-><init>(Lio/flutter/plugins/firebase/core/l$c;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_1
    new-instance v0, Lr8/a;

    invoke-static {}, Lio/flutter/plugins/firebase/core/p;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.FirebaseAppHostApi.delete"

    invoke-direct {v0, p0, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p1, :cond_2

    new-instance p0, Lio/flutter/plugins/firebase/core/o;

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/core/o;-><init>(Lio/flutter/plugins/firebase/core/l$c;)V

    invoke-virtual {v0, p0}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_2
    return-void
.end method
