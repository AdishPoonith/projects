.class public final Lla/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lla/l;Lla/c1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/l<",
            "*>;",
            "Lla/c1;",
            ")V"
        }
    .end annotation

    new-instance v0, Lla/d1;

    invoke-direct {v0, p1}, Lla/d1;-><init>(Lla/c1;)V

    invoke-interface {p0, v0}, Lla/l;->j(Lda/l;)V

    return-void
.end method

.method public static final b(Lv9/d;)Lla/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv9/d<",
            "-TT;>;)",
            "Lla/m<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lkotlinx/coroutines/internal/f;

    if-nez v0, :cond_0

    new-instance v0, Lla/m;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lla/m;-><init>(Lv9/d;I)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/f;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/f;->m()Lla/m;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lla/m;->I()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, Lla/m;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lla/m;-><init>(Lv9/d;I)V

    return-object v0
.end method

.method public static final c(Lla/l;Lkotlinx/coroutines/internal/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/l<",
            "*>;",
            "Lkotlinx/coroutines/internal/o;",
            ")V"
        }
    .end annotation

    new-instance v0, Lla/l2;

    invoke-direct {v0, p1}, Lla/l2;-><init>(Lkotlinx/coroutines/internal/o;)V

    invoke-interface {p0, v0}, Lla/l;->j(Lda/l;)V

    return-void
.end method
