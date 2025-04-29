.class public abstract Lkotlin/coroutines/jvm/internal/d;
.super Lkotlin/coroutines/jvm/internal/a;
.source "SourceFile"


# instance fields
.field private final _context:Lv9/g;

.field private transient intercepted:Lv9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv9/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lv9/d;->getContext()Lv9/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lv9/d;Lv9/g;)V

    return-void
.end method

.method public constructor <init>(Lv9/d;Lv9/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "Ljava/lang/Object;",
            ">;",
            "Lv9/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/a;-><init>(Lv9/d;)V

    iput-object p2, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Lv9/g;

    return-void
.end method


# virtual methods
.method public getContext()Lv9/g;
    .locals 1

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Lv9/g;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Lv9/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv9/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lv9/d;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Lv9/g;

    move-result-object v0

    sget-object v1, Lv9/e;->h:Lv9/e$b;

    invoke-interface {v0, v1}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v0

    check-cast v0, Lv9/e;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lv9/e;->g0(Lv9/d;)Lv9/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lv9/d;

    :cond_2
    return-object v0
.end method

.method protected releaseIntercepted()V
    .locals 3

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lv9/d;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Lv9/g;

    move-result-object v1

    sget-object v2, Lv9/e;->h:Lv9/e$b;

    invoke-interface {v1, v2}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    check-cast v1, Lv9/e;

    invoke-interface {v1, v0}, Lv9/e;->e(Lv9/d;)V

    :cond_0
    sget-object v0, Lkotlin/coroutines/jvm/internal/c;->j:Lkotlin/coroutines/jvm/internal/c;

    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lv9/d;

    return-void
.end method
