.class public Lkotlinx/coroutines/internal/z;
.super Lla/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lla/a<",
        "TT;>;",
        "Lkotlin/coroutines/jvm/internal/e;"
    }
.end annotation


# instance fields
.field public final l:Lv9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv9/g;Lv9/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/g;",
            "Lv9/d<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, Lla/a;-><init>(Lv9/g;ZZ)V

    iput-object p2, p0, Lkotlinx/coroutines/internal/z;->l:Lv9/d;

    return-void
.end method


# virtual methods
.method protected B(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lkotlinx/coroutines/internal/z;->l:Lv9/d;

    invoke-static {v0}, Lw9/b;->b(Lv9/d;)Lv9/d;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/coroutines/internal/z;->l:Lv9/d;

    invoke-static {p1, v1}, Lla/d0;->a(Ljava/lang/Object;Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lkotlinx/coroutines/internal/g;->c(Lv9/d;Ljava/lang/Object;Lda/l;ILjava/lang/Object;)V

    return-void
.end method

.method protected P0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/internal/z;->l:Lv9/d;

    invoke-static {p1, v0}, Lla/d0;->a(Ljava/lang/Object;Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lv9/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final T0()Lla/v1;
    .locals 1

    invoke-virtual {p0}, Lla/c2;->h0()Lla/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lla/r;->getParent()Lla/v1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/internal/z;->l:Lv9/d;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected final n0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
