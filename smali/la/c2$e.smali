.class final Lla/c2$e;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lda/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lla/c2;->w()Lja/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lda/p<",
        "Lja/d<",
        "-",
        "Lla/v1;",
        ">;",
        "Lv9/d<",
        "-",
        "Ls9/u;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.JobSupport$children$1"
    f = "JobSupport.kt"
    l = {
        0x3b8,
        0x3ba
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:I

.field private synthetic n:Ljava/lang/Object;

.field final synthetic o:Lla/c2;


# direct methods
.method constructor <init>(Lla/c2;Lv9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/c2;",
            "Lv9/d<",
            "-",
            "Lla/c2$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lla/c2$e;->o:Lla/c2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILv9/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lja/d;Lv9/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lja/d<",
            "-",
            "Lla/v1;",
            ">;",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lla/c2$e;->create(Ljava/lang/Object;Lv9/d;)Lv9/d;

    move-result-object p1

    check-cast p1, Lla/c2$e;

    sget-object p2, Ls9/u;->a:Ls9/u;

    invoke-virtual {p1, p2}, Lla/c2$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lv9/d;)Lv9/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lv9/d<",
            "*>;)",
            "Lv9/d<",
            "Ls9/u;",
            ">;"
        }
    .end annotation

    new-instance v0, Lla/c2$e;

    iget-object v1, p0, Lla/c2$e;->o:Lla/c2;

    invoke-direct {v0, v1, p2}, Lla/c2$e;-><init>(Lla/c2;Lv9/d;)V

    iput-object p1, v0, Lla/c2$e;->n:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lja/d;

    check-cast p2, Lv9/d;

    invoke-virtual {p0, p1, p2}, Lla/c2$e;->a(Lja/d;Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lla/c2$e;->m:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lla/c2$e;->l:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/internal/o;

    iget-object v3, p0, Lla/c2$e;->k:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/internal/m;

    iget-object v4, p0, Lla/c2$e;->n:Ljava/lang/Object;

    check-cast v4, Lja/d;

    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lla/c2$e;->n:Ljava/lang/Object;

    check-cast p1, Lja/d;

    iget-object v1, p0, Lla/c2$e;->o:Lla/c2;

    invoke-virtual {v1}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Lla/s;

    if-eqz v4, :cond_3

    check-cast v1, Lla/s;

    iget-object v1, v1, Lla/s;->n:Lla/t;

    iput v3, p0, Lla/c2$e;->m:I

    invoke-virtual {p1, v1, p0}, Lja/d;->a(Ljava/lang/Object;Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_3
    instance-of v3, v1, Lla/q1;

    if-eqz v3, :cond_5

    check-cast v1, Lla/q1;

    invoke-interface {v1}, Lla/q1;->g()Lla/h2;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lkotlinx/coroutines/internal/o;->p()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/coroutines/internal/o;

    move-object v4, p1

    move-object p1, p0

    move-object v6, v3

    move-object v3, v1

    move-object v1, v6

    :goto_0
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    instance-of v5, v1, Lla/s;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, Lla/s;

    iget-object v5, v5, Lla/s;->n:Lla/t;

    iput-object v4, p1, Lla/c2$e;->n:Ljava/lang/Object;

    iput-object v3, p1, Lla/c2$e;->k:Ljava/lang/Object;

    iput-object v1, p1, Lla/c2$e;->l:Ljava/lang/Object;

    iput v2, p1, Lla/c2$e;->m:I

    invoke-virtual {v4, v5, p1}, Lja/d;->a(Ljava/lang/Object;Lv9/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/o;->q()Lkotlinx/coroutines/internal/o;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_2
    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
