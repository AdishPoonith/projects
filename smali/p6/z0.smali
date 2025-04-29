.class public Lp6/z0;
.super Lp6/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/z0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp6/c<",
        "Ld7/d0;",
        "Ld7/e0;",
        "Lp6/z0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final v:Lcom/google/protobuf/i;


# instance fields
.field private final s:Lp6/l0;

.field protected t:Z

.field private u:Lcom/google/protobuf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/protobuf/i;->k:Lcom/google/protobuf/i;

    sput-object v0, Lp6/z0;->v:Lcom/google/protobuf/i;

    return-void
.end method

.method constructor <init>(Lp6/w;Lq6/g;Lp6/l0;Lp6/z0$a;)V
    .locals 8

    invoke-static {}, Ld7/p;->e()Li9/z0;

    move-result-object v2

    sget-object v4, Lq6/g$d;->n:Lq6/g$d;

    sget-object v5, Lq6/g$d;->m:Lq6/g$d;

    sget-object v6, Lq6/g$d;->o:Lq6/g$d;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lp6/c;-><init>(Lp6/w;Li9/z0;Lq6/g;Lq6/g$d;Lq6/g$d;Lq6/g$d;Lp6/r0;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lp6/z0;->t:Z

    sget-object p1, Lp6/z0;->v:Lcom/google/protobuf/i;

    iput-object p1, p0, Lp6/z0;->u:Lcom/google/protobuf/i;

    iput-object p3, p0, Lp6/z0;->s:Lp6/l0;

    return-void
.end method


# virtual methods
.method public A(Ld7/e0;)V
    .locals 6

    invoke-virtual {p1}, Ld7/e0;->h0()Lcom/google/protobuf/i;

    move-result-object v0

    iput-object v0, p0, Lp6/z0;->u:Lcom/google/protobuf/i;

    iget-boolean v0, p0, Lp6/z0;->t:Z

    if-nez v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp6/z0;->t:Z

    iget-object p1, p0, Lp6/c;->m:Lp6/r0;

    check-cast p1, Lp6/z0$a;

    invoke-interface {p1}, Lp6/z0$a;->c()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lp6/c;->l:Lq6/r;

    invoke-virtual {v0}, Lq6/r;->f()V

    iget-object v0, p0, Lp6/z0;->s:Lp6/l0;

    invoke-virtual {p1}, Ld7/e0;->f0()Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object v0

    invoke-virtual {p1}, Ld7/e0;->j0()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {p1, v3}, Ld7/e0;->i0(I)Ld7/f0;

    move-result-object v4

    iget-object v5, p0, Lp6/z0;->s:Lp6/l0;

    invoke-virtual {v5, v4, v0}, Lp6/l0;->p(Ld7/f0;Lm6/w;)Ln6/i;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lp6/c;->m:Lp6/r0;

    check-cast p1, Lp6/z0$a;

    invoke-interface {p1, v0, v2}, Lp6/z0$a;->e(Lm6/w;Ljava/util/List;)V

    :goto_1
    return-void
.end method

.method B(Lcom/google/protobuf/i;)V
    .locals 0

    invoke-static {p1}, Lq6/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/i;

    iput-object p1, p0, Lp6/z0;->u:Lcom/google/protobuf/i;

    return-void
.end method

.method C()V
    .locals 4

    invoke-virtual {p0}, Lp6/z0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Writing handshake requires an opened stream"

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lp6/z0;->t:Z

    xor-int/lit8 v0, v0, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handshake already completed"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ld7/d0;->l0()Ld7/d0$b;

    move-result-object v0

    iget-object v1, p0, Lp6/z0;->s:Lp6/l0;

    invoke-virtual {v1}, Lp6/l0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/d0$b;->I(Ljava/lang/String;)Ld7/d0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v0

    check-cast v0, Ld7/d0;

    invoke-virtual {p0, v0}, Lp6/c;->x(Ljava/lang/Object;)V

    return-void
.end method

.method D(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln6/f;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lp6/z0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Writing mutations requires an opened stream"

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lp6/z0;->t:Z

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handshake must be complete before writing mutations"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ld7/d0;->l0()Ld7/d0$b;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/f;

    iget-object v2, p0, Lp6/z0;->s:Lp6/l0;

    invoke-virtual {v2, v1}, Lp6/l0;->O(Ln6/f;)Ld7/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/d0$b;->H(Ld7/c0;)Ld7/d0$b;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp6/z0;->u:Lcom/google/protobuf/i;

    invoke-virtual {v0, p1}, Ld7/d0$b;->J(Lcom/google/protobuf/i;)Ld7/d0$b;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/d0;

    invoke-virtual {p0, p1}, Lp6/c;->x(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l()V
    .locals 0

    invoke-super {p0}, Lp6/c;->l()V

    return-void
.end method

.method public bridge synthetic m()Z
    .locals 1

    invoke-super {p0}, Lp6/c;->m()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic n()Z
    .locals 1

    invoke-super {p0}, Lp6/c;->n()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic r(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ld7/e0;

    invoke-virtual {p0, p1}, Lp6/z0;->A(Ld7/e0;)V

    return-void
.end method

.method public u()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp6/z0;->t:Z

    invoke-super {p0}, Lp6/c;->u()V

    return-void
.end method

.method public bridge synthetic v()V
    .locals 0

    invoke-super {p0}, Lp6/c;->v()V

    return-void
.end method

.method protected w()V
    .locals 1

    iget-boolean v0, p0, Lp6/z0;->t:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp6/z0;->D(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method y()Lcom/google/protobuf/i;
    .locals 1

    iget-object v0, p0, Lp6/z0;->u:Lcom/google/protobuf/i;

    return-object v0
.end method

.method z()Z
    .locals 1

    iget-boolean v0, p0, Lp6/z0;->t:Z

    return v0
.end method
