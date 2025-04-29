.class final synthetic Lla/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lla/v1;)Lla/x;
    .locals 1

    new-instance v0, Lla/y1;

    invoke-direct {v0, p0}, Lla/y1;-><init>(Lla/v1;)V

    return-object v0
.end method

.method public static synthetic b(Lla/v1;ILjava/lang/Object;)Lla/x;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lla/z1;->a(Lla/v1;)Lla/x;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lv9/g;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lla/v1;->g:Lla/v1$b;

    invoke-interface {p0, v0}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object p0

    check-cast p0, Lla/v1;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lla/v1;->T(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static synthetic d(Lv9/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lla/z1;->c(Lv9/g;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final e(Lv9/g;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lla/v1;->g:Lla/v1$b;

    invoke-interface {p0, v0}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object p0

    check-cast p0, Lla/v1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lla/v1;->w()Lja/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lja/b;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lla/v1;

    invoke-interface {v0, p1}, Lla/v1;->T(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic f(Lv9/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lla/z1;->e(Lv9/g;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final g(Lla/v1;Lla/c1;)Lla/c1;
    .locals 1

    new-instance v0, Lla/e1;

    invoke-direct {v0, p1}, Lla/e1;-><init>(Lla/c1;)V

    invoke-interface {p0, v0}, Lla/v1;->b0(Lda/l;)Lla/c1;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lla/v1;)V
    .locals 1

    invoke-interface {p0}, Lla/v1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lla/v1;->O()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final i(Lv9/g;)V
    .locals 1

    sget-object v0, Lla/v1;->g:Lla/v1$b;

    invoke-interface {p0, v0}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object p0

    check-cast p0, Lla/v1;

    if-eqz p0, :cond_0

    invoke-static {p0}, Lla/z1;->h(Lla/v1;)V

    :cond_0
    return-void
.end method

.method public static final j(Lv9/g;)Lla/v1;
    .locals 3

    sget-object v0, Lla/v1;->g:Lla/v1$b;

    invoke-interface {p0, v0}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v0

    check-cast v0, Lla/v1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
