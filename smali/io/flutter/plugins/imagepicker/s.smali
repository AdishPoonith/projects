.class public final synthetic Lio/flutter/plugins/imagepicker/s;
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

    sget-object v0, Lio/flutter/plugins/imagepicker/o$f;->d:Lio/flutter/plugins/imagepicker/o$f;

    return-object v0
.end method

.method public static synthetic b(Lio/flutter/plugins/imagepicker/o$e;Ljava/lang/Object;Lr8/a$e;)V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/flutter/plugins/imagepicker/o$j;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/flutter/plugins/imagepicker/o$g;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/Boolean;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/Boolean;

    new-instance v7, Lio/flutter/plugins/imagepicker/s$a;

    invoke-direct {v7, v0, p2}, Lio/flutter/plugins/imagepicker/s$a;-><init>(Ljava/util/ArrayList;Lr8/a$e;)V

    move-object v2, p0

    invoke-interface/range {v2 .. v7}, Lio/flutter/plugins/imagepicker/o$e;->a(Lio/flutter/plugins/imagepicker/o$j;Lio/flutter/plugins/imagepicker/o$g;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/flutter/plugins/imagepicker/o$h;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/imagepicker/o$e;Ljava/lang/Object;Lr8/a$e;)V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/flutter/plugins/imagepicker/o$j;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/flutter/plugins/imagepicker/o$l;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/Boolean;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/Boolean;

    new-instance v7, Lio/flutter/plugins/imagepicker/s$b;

    invoke-direct {v7, v0, p2}, Lio/flutter/plugins/imagepicker/s$b;-><init>(Ljava/util/ArrayList;Lr8/a$e;)V

    move-object v2, p0

    invoke-interface/range {v2 .. v7}, Lio/flutter/plugins/imagepicker/o$e;->c(Lio/flutter/plugins/imagepicker/o$j;Lio/flutter/plugins/imagepicker/o$l;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/flutter/plugins/imagepicker/o$h;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/imagepicker/o$e;Ljava/lang/Object;Lr8/a$e;)V
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-interface {p0}, Lio/flutter/plugins/imagepicker/o$e;->b()Lio/flutter/plugins/imagepicker/o$b;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lio/flutter/plugins/imagepicker/o;->a(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    invoke-interface {p2, p1}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static e(Lr8/c;Lio/flutter/plugins/imagepicker/o$e;)V
    .locals 5

    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v0

    new-instance v1, Lr8/a;

    invoke-static {}, Lio/flutter/plugins/imagepicker/s;->a()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.ImagePickerApi.pickImages"

    invoke-direct {v1, p0, v3, v2, v0}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/imagepicker/p;

    invoke-direct {v2, p1}, Lio/flutter/plugins/imagepicker/p;-><init>(Lio/flutter/plugins/imagepicker/o$e;)V

    invoke-virtual {v1, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_0
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lio/flutter/plugins/imagepicker/s;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.ImagePickerApi.pickVideos"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_1

    new-instance v1, Lio/flutter/plugins/imagepicker/q;

    invoke-direct {v1, p1}, Lio/flutter/plugins/imagepicker/q;-><init>(Lio/flutter/plugins/imagepicker/o$e;)V

    invoke-virtual {v2, v1}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_1
    invoke-interface {p0}, Lr8/c;->d()Lr8/c$c;

    move-result-object v1

    new-instance v2, Lr8/a;

    invoke-static {}, Lio/flutter/plugins/imagepicker/s;->a()Lr8/i;

    move-result-object v3

    const-string v4, "dev.flutter.pigeon.ImagePickerApi.retrieveLostResults"

    invoke-direct {v2, p0, v4, v3, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;Lr8/c$c;)V

    if-eqz p1, :cond_2

    new-instance p0, Lio/flutter/plugins/imagepicker/r;

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/r;-><init>(Lio/flutter/plugins/imagepicker/o$e;)V

    invoke-virtual {v2, p0}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v0}, Lr8/a;->e(Lr8/a$d;)V

    :goto_2
    return-void
.end method
