.class public final Lla/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv9/g;)Lla/k0;
    .locals 3

    new-instance v0, Lkotlinx/coroutines/internal/e;

    sget-object v1, Lla/v1;->g:Lla/v1$b;

    invoke-interface {p0, v1}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lla/z1;->b(Lla/v1;ILjava/lang/Object;)Lla/x;

    move-result-object v1

    invoke-interface {p0, v1}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lkotlinx/coroutines/internal/e;-><init>(Lv9/g;)V

    return-object v0
.end method

.method public static final b()Lla/k0;
    .locals 3

    new-instance v0, Lkotlinx/coroutines/internal/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lla/q2;->b(Lla/v1;ILjava/lang/Object;)Lla/x;

    move-result-object v1

    invoke-static {}, Lla/a1;->c()Lla/g2;

    move-result-object v2

    invoke-interface {v1, v2}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/e;-><init>(Lv9/g;)V

    return-object v0
.end method

.method public static final c(Lda/p;Lv9/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lda/p<",
            "-",
            "Lla/k0;",
            "-",
            "Lv9/d<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv9/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/internal/z;

    invoke-interface {p1}, Lv9/d;->getContext()Lv9/g;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lkotlinx/coroutines/internal/z;-><init>(Lv9/g;Lv9/d;)V

    invoke-static {v0, v0, p0}, Lqa/b;->b(Lkotlinx/coroutines/internal/z;Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lv9/d;)V

    :cond_0
    return-object p0
.end method

.method public static final d(Lla/k0;)Z
    .locals 1

    invoke-interface {p0}, Lla/k0;->n()Lv9/g;

    move-result-object p0

    sget-object v0, Lla/v1;->g:Lla/v1$b;

    invoke-interface {p0, v0}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object p0

    check-cast p0, Lla/v1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lla/v1;->a()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method
