.class final synthetic Lla/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lla/k0;Lv9/g;Lla/m0;Lda/p;)Lla/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lla/k0;",
            "Lv9/g;",
            "Lla/m0;",
            "Lda/p<",
            "-",
            "Lla/k0;",
            "-",
            "Lv9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lla/r0<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lla/f0;->d(Lla/k0;Lv9/g;)Lv9/g;

    move-result-object p0

    invoke-virtual {p2}, Lla/m0;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lla/e2;

    invoke-direct {p1, p0, p3}, Lla/e2;-><init>(Lv9/g;Lda/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lla/s0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lla/s0;-><init>(Lv9/g;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lla/a;->S0(Lla/m0;Ljava/lang/Object;Lda/p;)V

    return-object p1
.end method

.method public static synthetic b(Lla/k0;Lv9/g;Lla/m0;Lda/p;ILjava/lang/Object;)Lla/r0;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lv9/h;->j:Lv9/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lla/m0;->j:Lla/m0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lla/h;->a(Lla/k0;Lv9/g;Lla/m0;Lda/p;)Lla/r0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lla/k0;Lv9/g;Lla/m0;Lda/p;)Lla/v1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/k0;",
            "Lv9/g;",
            "Lla/m0;",
            "Lda/p<",
            "-",
            "Lla/k0;",
            "-",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lla/v1;"
        }
    .end annotation

    invoke-static {p0, p1}, Lla/f0;->d(Lla/k0;Lv9/g;)Lv9/g;

    move-result-object p0

    invoke-virtual {p2}, Lla/m0;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lla/f2;

    invoke-direct {p1, p0, p3}, Lla/f2;-><init>(Lv9/g;Lda/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lla/o2;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lla/o2;-><init>(Lv9/g;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lla/a;->S0(Lla/m0;Ljava/lang/Object;Lda/p;)V

    return-object p1
.end method

.method public static synthetic d(Lla/k0;Lv9/g;Lla/m0;Lda/p;ILjava/lang/Object;)Lla/v1;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lv9/h;->j:Lv9/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lla/m0;->j:Lla/m0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lla/h;->c(Lla/k0;Lv9/g;Lla/m0;Lda/p;)Lla/v1;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lv9/g;Lda/p;Lv9/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv9/g;",
            "Lda/p<",
            "-",
            "Lla/k0;",
            "-",
            "Lv9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv9/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p2}, Lv9/d;->getContext()Lv9/g;

    move-result-object v0

    invoke-static {v0, p0}, Lla/f0;->e(Lv9/g;Lv9/g;)Lv9/g;

    move-result-object p0

    invoke-static {p0}, Lla/z1;->i(Lv9/g;)V

    if-ne p0, v0, :cond_0

    new-instance v0, Lkotlinx/coroutines/internal/z;

    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/internal/z;-><init>(Lv9/g;Lv9/d;)V

    invoke-static {v0, v0, p1}, Lqa/b;->b(Lkotlinx/coroutines/internal/z;Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v1, Lv9/e;->h:Lv9/e$b;

    invoke-interface {p0, v1}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v2

    invoke-interface {v0, v1}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lla/z2;

    invoke-direct {v0, p0, p2}, Lla/z2;-><init>(Lv9/g;Lv9/d;)V

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lkotlinx/coroutines/internal/f0;->c(Lv9/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    invoke-static {v0, v0, p1}, Lqa/b;->b(Lkotlinx/coroutines/internal/z;Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v1}, Lkotlinx/coroutines/internal/f0;->a(Lv9/g;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p0, v1}, Lkotlinx/coroutines/internal/f0;->a(Lv9/g;Ljava/lang/Object;)V

    throw p1

    :cond_1
    new-instance v0, Lla/w0;

    invoke-direct {v0, p0, p2}, Lla/w0;-><init>(Lv9/g;Lv9/d;)V

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, v0

    move-object v4, v0

    invoke-static/range {v2 .. v7}, Lqa/a;->d(Lda/p;Ljava/lang/Object;Lv9/d;Lda/l;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lla/w0;->U0()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lv9/d;)V

    :cond_2
    return-object p0
.end method
