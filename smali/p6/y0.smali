.class public Lp6/y0;
.super Lp6/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/y0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp6/c<",
        "Ld7/q;",
        "Ld7/r;",
        "Lp6/y0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final t:Lcom/google/protobuf/i;


# instance fields
.field private final s:Lp6/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/protobuf/i;->k:Lcom/google/protobuf/i;

    sput-object v0, Lp6/y0;->t:Lcom/google/protobuf/i;

    return-void
.end method

.method constructor <init>(Lp6/w;Lq6/g;Lp6/l0;Lp6/y0$a;)V
    .locals 8

    invoke-static {}, Ld7/p;->c()Li9/z0;

    move-result-object v2

    sget-object v4, Lq6/g$d;->l:Lq6/g$d;

    sget-object v5, Lq6/g$d;->k:Lq6/g$d;

    sget-object v6, Lq6/g$d;->o:Lq6/g$d;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lp6/c;-><init>(Lp6/w;Li9/z0;Lq6/g;Lq6/g$d;Lq6/g$d;Lq6/g$d;Lp6/r0;)V

    iput-object p3, p0, Lp6/y0;->s:Lp6/l0;

    return-void
.end method


# virtual methods
.method public A(Ll6/h4;)V
    .locals 3

    invoke-virtual {p0}, Lp6/y0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Watching queries requires an open stream"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ld7/q;->m0()Ld7/q$b;

    move-result-object v0

    iget-object v1, p0, Lp6/y0;->s:Lp6/l0;

    invoke-virtual {v1}, Lp6/l0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/q$b;->J(Ljava/lang/String;)Ld7/q$b;

    move-result-object v0

    iget-object v1, p0, Lp6/y0;->s:Lp6/l0;

    invoke-virtual {v1, p1}, Lp6/l0;->V(Ll6/h4;)Ld7/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/q$b;->I(Ld7/y;)Ld7/q$b;

    move-result-object v0

    iget-object v1, p0, Lp6/y0;->s:Lp6/l0;

    invoke-virtual {v1, p1}, Lp6/l0;->N(Ll6/h4;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ld7/q$b;->H(Ljava/util/Map;)Ld7/q$b;

    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/q;

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

    check-cast p1, Ld7/r;

    invoke-virtual {p0, p1}, Lp6/y0;->y(Ld7/r;)V

    return-void
.end method

.method public bridge synthetic u()V
    .locals 0

    invoke-super {p0}, Lp6/c;->u()V

    return-void
.end method

.method public bridge synthetic v()V
    .locals 0

    invoke-super {p0}, Lp6/c;->v()V

    return-void
.end method

.method public y(Ld7/r;)V
    .locals 2

    iget-object v0, p0, Lp6/c;->l:Lq6/r;

    invoke-virtual {v0}, Lq6/r;->f()V

    iget-object v0, p0, Lp6/y0;->s:Lp6/l0;

    invoke-virtual {v0, p1}, Lp6/l0;->A(Ld7/r;)Lp6/w0;

    move-result-object v0

    iget-object v1, p0, Lp6/y0;->s:Lp6/l0;

    invoke-virtual {v1, p1}, Lp6/l0;->z(Ld7/r;)Lm6/w;

    move-result-object p1

    iget-object v1, p0, Lp6/c;->m:Lp6/r0;

    check-cast v1, Lp6/y0$a;

    invoke-interface {v1, p1, v0}, Lp6/y0$a;->d(Lm6/w;Lp6/w0;)V

    return-void
.end method

.method public z(I)V
    .locals 3

    invoke-virtual {p0}, Lp6/y0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unwatching targets requires an open stream"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ld7/q;->m0()Ld7/q$b;

    move-result-object v0

    iget-object v1, p0, Lp6/y0;->s:Lp6/l0;

    invoke-virtual {v1}, Lp6/l0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/q$b;->J(Ljava/lang/String;)Ld7/q$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ld7/q$b;->K(I)Ld7/q$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/q;

    invoke-virtual {p0, p1}, Lp6/c;->x(Ljava/lang/Object;)V

    return-void
.end method
