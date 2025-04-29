.class public final Lla/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lv9/g;Lv9/g;Z)Lv9/g;
    .locals 3

    invoke-static {p0}, Lla/f0;->c(Lv9/g;)Z

    move-result v0

    invoke-static {p1}, Lla/f0;->c(Lv9/g;)Z

    move-result v1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    invoke-interface {p0, p1}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/s;

    invoke-direct {v0}, Lkotlin/jvm/internal/s;-><init>()V

    iput-object p1, v0, Lkotlin/jvm/internal/s;->j:Ljava/lang/Object;

    sget-object p1, Lv9/h;->j:Lv9/h;

    new-instance v2, Lla/f0$b;

    invoke-direct {v2, v0, p2}, Lla/f0$b;-><init>(Lkotlin/jvm/internal/s;Z)V

    invoke-interface {p0, p1, v2}, Lv9/g;->N(Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv9/g;

    if-eqz v1, :cond_1

    iget-object p2, v0, Lkotlin/jvm/internal/s;->j:Ljava/lang/Object;

    check-cast p2, Lv9/g;

    sget-object v1, Lla/f0$a;->j:Lla/f0$a;

    invoke-interface {p2, p1, v1}, Lv9/g;->N(Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/s;->j:Ljava/lang/Object;

    :cond_1
    iget-object p1, v0, Lkotlin/jvm/internal/s;->j:Ljava/lang/Object;

    check-cast p1, Lv9/g;

    invoke-interface {p0, p1}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lv9/g;)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final c(Lv9/g;)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lla/f0$c;->j:Lla/f0$c;

    invoke-interface {p0, v0, v1}, Lv9/g;->N(Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final d(Lla/k0;Lv9/g;)Lv9/g;
    .locals 1

    invoke-interface {p0}, Lla/k0;->n()Lv9/g;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lla/f0;->a(Lv9/g;Lv9/g;Z)Lv9/g;

    move-result-object p0

    invoke-static {}, Lla/a1;->a()Lla/g0;

    move-result-object p1

    if-eq p0, p1, :cond_0

    sget-object p1, Lv9/e;->h:Lv9/e$b;

    invoke-interface {p0, p1}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lla/a1;->a()Lla/g0;

    move-result-object p1

    invoke-interface {p0, p1}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final e(Lv9/g;Lv9/g;)Lv9/g;
    .locals 1

    invoke-static {p1}, Lla/f0;->c(Lv9/g;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lla/f0;->a(Lv9/g;Lv9/g;Z)Lv9/g;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/coroutines/jvm/internal/e;)Lla/z2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/jvm/internal/e;",
            ")",
            "Lla/z2<",
            "*>;"
        }
    .end annotation

    :cond_0
    instance-of v0, p0, Lla/w0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/e;->getCallerFrame()Lkotlin/coroutines/jvm/internal/e;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, Lla/z2;

    if-eqz v0, :cond_0

    check-cast p0, Lla/z2;

    return-object p0
.end method

.method public static final g(Lv9/d;Lv9/g;Ljava/lang/Object;)Lla/z2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "*>;",
            "Lv9/g;",
            "Ljava/lang/Object;",
            ")",
            "Lla/z2<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lla/a3;->j:Lla/a3;

    invoke-interface {p1, v0}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    invoke-static {p0}, Lla/f0;->f(Lkotlin/coroutines/jvm/internal/e;)Lla/z2;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0, p1, p2}, Lla/z2;->V0(Lv9/g;Ljava/lang/Object;)V

    :cond_3
    return-object p0
.end method
