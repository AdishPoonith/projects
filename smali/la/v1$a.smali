.class public final Lla/v1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lla/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lla/v1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, Lla/v1;->T(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lla/v1;Ljava/lang/Object;Lda/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lla/v1;",
            "TR;",
            "Lda/p<",
            "-TR;-",
            "Lv9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv9/g$b$a;->a(Lv9/g$b;Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lla/v1;Lv9/g$c;)Lv9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lv9/g$b;",
            ">(",
            "Lla/v1;",
            "Lv9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lv9/g$b$a;->b(Lv9/g$b;Lv9/g$c;)Lv9/g$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lla/v1;ZZLda/l;ILjava/lang/Object;)Lla/c1;
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lla/v1;->v(ZZLda/l;)Lla/c1;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: invokeOnCompletion"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lla/v1;Lv9/g$c;)Lv9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/v1;",
            "Lv9/g$c<",
            "*>;)",
            "Lv9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lv9/g$b$a;->c(Lv9/g$b;Lv9/g$c;)Lv9/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lla/v1;Lv9/g;)Lv9/g;
    .locals 0

    invoke-static {p0, p1}, Lv9/g$b$a;->d(Lv9/g$b;Lv9/g;)Lv9/g;

    move-result-object p0

    return-object p0
.end method
