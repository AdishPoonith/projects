.class public final Lla/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/Collection;Lv9/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lla/v1;",
            ">;",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lla/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lla/e$a;

    iget v1, v0, Lla/e$a;->l:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lla/e$a;->l:I

    goto :goto_0

    :cond_0
    new-instance v0, Lla/e$a;

    invoke-direct {v0, p1}, Lla/e$a;-><init>(Lv9/d;)V

    :goto_0
    iget-object p1, v0, Lla/e$a;->k:Ljava/lang/Object;

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lla/e$a;->l:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lla/e$a;->j:Ljava/lang/Object;

    check-cast p0, Ljava/util/Iterator;

    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lla/v1;

    iput-object p0, v0, Lla/e$a;->j:Ljava/lang/Object;

    iput v3, v0, Lla/e$a;->l:I

    invoke-interface {p1, v0}, Lla/v1;->H(Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p0, Ls9/u;->a:Ls9/u;

    return-object p0
.end method
