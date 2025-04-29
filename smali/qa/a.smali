.class public final Lqa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lv9/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Ls9/n;->k:Ls9/n$a;

    invoke-static {p1}, Ls9/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ls9/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lv9/d;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Lda/p;Ljava/lang/Object;Lv9/d;Lda/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lda/p<",
            "-TR;-",
            "Lv9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lv9/d<",
            "-TT;>;",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lw9/b;->a(Lda/p;Ljava/lang/Object;Lv9/d;)Lv9/d;

    move-result-object p0

    invoke-static {p0}, Lw9/b;->b(Lv9/d;)Lv9/d;

    move-result-object p0

    sget-object p1, Ls9/n;->k:Ls9/n$a;

    sget-object p1, Ls9/u;->a:Ls9/u;

    invoke-static {p1}, Ls9/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lkotlinx/coroutines/internal/g;->b(Lv9/d;Ljava/lang/Object;Lda/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lqa/a;->a(Lv9/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final c(Lv9/d;Lv9/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;",
            "Lv9/d<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Lw9/b;->b(Lv9/d;)Lv9/d;

    move-result-object p0

    sget-object v0, Ls9/n;->k:Ls9/n$a;

    sget-object v0, Ls9/u;->a:Ls9/u;

    invoke-static {v0}, Ls9/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lkotlinx/coroutines/internal/g;->c(Lv9/d;Ljava/lang/Object;Lda/l;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lqa/a;->a(Lv9/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic d(Lda/p;Ljava/lang/Object;Lv9/d;Lda/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lqa/a;->b(Lda/p;Ljava/lang/Object;Lv9/d;Lda/l;)V

    return-void
.end method
