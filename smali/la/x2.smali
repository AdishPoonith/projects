.class public final Lla/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLla/v1;)Lla/v2;
    .locals 3

    new-instance v0, Lla/v2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Timed out waiting for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p2}, Lla/v2;-><init>(Ljava/lang/String;Lla/v1;)V

    return-object v0
.end method

.method private static final b(Lla/w2;Lda/p;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            "T::TU;>(",
            "Lla/w2<",
            "TU;-TT;>;",
            "Lda/p<",
            "-",
            "Lla/k0;",
            "-",
            "Lv9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/internal/z;->l:Lv9/d;

    invoke-interface {v0}, Lv9/d;->getContext()Lv9/g;

    move-result-object v0

    invoke-static {v0}, Lla/u0;->a(Lv9/g;)Lla/t0;

    move-result-object v0

    iget-wide v1, p0, Lla/w2;->m:J

    invoke-virtual {p0}, Lla/a;->getContext()Lv9/g;

    move-result-object v3

    invoke-interface {v0, v1, v2, p0, v3}, Lla/t0;->c0(JLjava/lang/Runnable;Lv9/g;)Lla/c1;

    move-result-object v0

    invoke-static {p0, v0}, Lla/z1;->g(Lla/v1;Lla/c1;)Lla/c1;

    invoke-static {p0, p0, p1}, Lqa/b;->c(Lkotlinx/coroutines/internal/z;Ljava/lang/Object;Lda/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JLda/p;Lv9/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
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

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-lez v2, :cond_1

    new-instance v0, Lla/w2;

    invoke-direct {v0, p0, p1, p3}, Lla/w2;-><init>(JLv9/d;)V

    invoke-static {v0, p2}, Lla/x2;->b(Lla/w2;Lda/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(Lv9/d;)V

    :cond_0
    return-object p0

    :cond_1
    new-instance p0, Lla/v2;

    const-string p1, "Timed out immediately"

    invoke-direct {p0, p1}, Lla/v2;-><init>(Ljava/lang/String;)V

    throw p0
.end method
