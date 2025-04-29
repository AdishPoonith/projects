.class public final synthetic Lb6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lb6/e;Lb6/f0;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lb6/e;->b(Lb6/f0;)Ls6/b;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ls6/b;->get()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lb6/e;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lb6/f0;->b(Ljava/lang/Class;)Lb6/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lb6/e;->d(Lb6/f0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lb6/e;Ljava/lang/Class;)Ls6/a;
    .locals 0

    invoke-static {p1}, Lb6/f0;->b(Ljava/lang/Class;)Lb6/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lb6/e;->h(Lb6/f0;)Ls6/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lb6/e;Ljava/lang/Class;)Ls6/b;
    .locals 0

    invoke-static {p1}, Lb6/f0;->b(Ljava/lang/Class;)Lb6/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lb6/e;->b(Lb6/f0;)Ls6/b;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lb6/e;Lb6/f0;)Ljava/util/Set;
    .locals 0

    invoke-interface {p0, p1}, Lb6/e;->e(Lb6/f0;)Ls6/b;

    move-result-object p0

    invoke-interface {p0}, Ls6/b;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method public static f(Lb6/e;Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    invoke-static {p1}, Lb6/f0;->b(Ljava/lang/Class;)Lb6/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lb6/e;->f(Lb6/f0;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
