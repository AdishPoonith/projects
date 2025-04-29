.class public abstract Lla/a;
.super Lla/c2;
.source "SourceFile"

# interfaces
.implements Lv9/d;
.implements Lla/k0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lla/c2;",
        "Lv9/d<",
        "TT;>;",
        "Lla/k0;"
    }
.end annotation


# instance fields
.field private final k:Lv9/g;


# direct methods
.method public constructor <init>(Lv9/g;ZZ)V
    .locals 0

    invoke-direct {p0, p3}, Lla/c2;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, Lla/v1;->g:Lla/v1$b;

    invoke-interface {p1, p2}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object p2

    check-cast p2, Lla/v1;

    invoke-virtual {p0, p2}, Lla/c2;->l0(Lla/v1;)V

    :cond_0
    invoke-interface {p1, p0}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p1

    iput-object p1, p0, Lla/a;->k:Lv9/g;

    return-void
.end method


# virtual methods
.method protected M()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lla/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected P0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lla/c2;->B(Ljava/lang/Object;)V

    return-void
.end method

.method protected Q0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method protected R0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public final S0(Lla/m0;Ljava/lang/Object;Lda/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lla/m0;",
            "TR;",
            "Lda/p<",
            "-TR;-",
            "Lv9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p3, p2, p0}, Lla/m0;->g(Lda/p;Ljava/lang/Object;Lv9/d;)V

    return-void
.end method

.method public a()Z
    .locals 1

    invoke-super {p0}, Lla/c2;->a()Z

    move-result v0

    return v0
.end method

.method public final getContext()Lv9/g;
    .locals 1

    iget-object v0, p0, Lla/a;->k:Lv9/g;

    return-object v0
.end method

.method public final k0(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lla/a;->k:Lv9/g;

    invoke-static {v0, p1}, Lla/j0;->a(Lv9/g;Ljava/lang/Throwable;)V

    return-void
.end method

.method public n()Lv9/g;
    .locals 1

    iget-object v0, p0, Lla/a;->k:Lv9/g;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lla/d0;->d(Ljava/lang/Object;Lda/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lla/c2;->s0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lla/d2;->b:Lkotlinx/coroutines/internal/b0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lla/a;->P0(Ljava/lang/Object;)V

    return-void
.end method

.method public u0()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lla/a;->k:Lv9/g;

    invoke-static {v0}, Lla/f0;->b(Lv9/g;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lla/c2;->u0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lla/c2;->u0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final z0(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lla/z;

    if-eqz v0, :cond_0

    check-cast p1, Lla/z;

    iget-object v0, p1, Lla/z;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lla/z;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lla/a;->Q0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lla/a;->R0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
