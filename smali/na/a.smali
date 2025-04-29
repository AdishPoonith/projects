.class public abstract Lna/a;
.super Lna/c;
.source "SourceFile"

# interfaces
.implements Lna/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lna/a$c;,
        Lna/a$a;,
        Lna/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lna/c<",
        "TE;>;",
        "Lna/f<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lda/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-TE;",
            "Ls9/u;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lna/c;-><init>(Lda/l;)V

    return-void
.end method

.method public static final synthetic n(Lna/a;Lna/o;)Z
    .locals 0

    invoke-direct {p0, p1}, Lna/a;->p(Lna/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic o(Lna/a;Lla/l;Lna/o;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lna/a;->w(Lla/l;Lna/o;)V

    return-void
.end method

.method private final p(Lna/o;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lna/a;->q(Lna/o;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lna/a;->u()V

    :cond_0
    return p1
.end method

.method private final w(Lla/l;Lna/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/l<",
            "*>;",
            "Lna/o<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Lna/a$c;

    invoke-direct {v0, p0, p2}, Lna/a$c;-><init>(Lna/a;Lna/o;)V

    invoke-interface {p1, v0}, Lla/l;->j(Lda/l;)V

    return-void
.end method


# virtual methods
.method public final iterator()Lna/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lna/g<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lna/a$a;

    invoke-direct {v0, p0}, Lna/a$a;-><init>(Lna/a;)V

    return-object v0
.end method

.method protected l()Lna/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lna/q<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0}, Lna/c;->l()Lna/q;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lna/j;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lna/a;->t()V

    :cond_0
    return-object v0
.end method

.method protected q(Lna/o;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lna/a;->r()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lna/c;->e()Lkotlinx/coroutines/internal/m;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/o;->r()Lkotlinx/coroutines/internal/o;

    move-result-object v3

    instance-of v4, v3, Lna/s;

    xor-int/2addr v4, v2

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3, p1, v0}, Lkotlinx/coroutines/internal/o;->j(Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lna/c;->e()Lkotlinx/coroutines/internal/m;

    move-result-object v0

    new-instance v3, Lna/a$d;

    invoke-direct {v3, p1, p0}, Lna/a$d;-><init>(Lkotlinx/coroutines/internal/o;Lna/a;)V

    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/o;->r()Lkotlinx/coroutines/internal/o;

    move-result-object v4

    instance-of v5, v4, Lna/s;

    xor-int/2addr v5, v2

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4, p1, v0, v3}, Lkotlinx/coroutines/internal/o;->z(Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o;Lkotlinx/coroutines/internal/o$a;)I

    move-result v4

    if-eq v4, v2, :cond_4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5

    goto :goto_0

    :cond_4
    :goto_1
    const/4 v1, 0x1

    :cond_5
    :goto_2
    return v1
.end method

.method protected abstract r()Z
.end method

.method protected abstract s()Z
.end method

.method protected t()V
    .locals 0

    return-void
.end method

.method protected u()V
    .locals 0

    return-void
.end method

.method protected v()Ljava/lang/Object;
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lna/c;->m()Lna/s;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lna/b;->d:Lkotlinx/coroutines/internal/b0;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lna/s;->C(Lkotlinx/coroutines/internal/o$b;)Lkotlinx/coroutines/internal/b0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lna/s;->A()V

    invoke-virtual {v0}, Lna/s;->B()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {v0}, Lna/s;->D()V

    goto :goto_0
.end method
