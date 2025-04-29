.class public final Ll6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lp6/l0;


# direct methods
.method public constructor <init>(Lp6/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/o;->a:Lp6/l0;

    return-void
.end method

.method private b(Ld7/i;Z)Lm6/s;
    .locals 3

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Ld7/i;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v0

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Ld7/i;->m0()Lcom/google/protobuf/t1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object v1

    invoke-virtual {p1}, Ld7/i;->j0()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lm6/t;->i(Ljava/util/Map;)Lm6/t;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lm6/s;->p(Lm6/l;Lm6/w;Lm6/t;)Lm6/s;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lm6/s;->t()Lm6/s;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private g(Lo6/b;Z)Lm6/s;
    .locals 2

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/b;->i0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v0

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/b;->j0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object p1

    invoke-static {v0, p1}, Lm6/s;->r(Lm6/l;Lm6/w;)Lm6/s;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lm6/s;->t()Lm6/s;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private i(Lo6/d;)Lm6/s;
    .locals 2

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/d;->i0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v0

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/d;->j0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object p1

    invoke-static {v0, p1}, Lm6/s;->s(Lm6/l;Lm6/w;)Lm6/s;

    move-result-object p1

    return-object p1
.end method

.method private k(Lm6/i;)Ld7/i;
    .locals 3

    invoke-static {}, Ld7/i;->p0()Ld7/i$b;

    move-result-object v0

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-interface {p1}, Lm6/i;->getKey()Lm6/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp6/l0;->L(Lm6/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/i$b;->I(Ljava/lang/String;)Ld7/i$b;

    invoke-interface {p1}, Lm6/i;->k()Lm6/t;

    move-result-object v1

    invoke-virtual {v1}, Lm6/t;->o()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/i$b;->H(Ljava/util/Map;)Ld7/i$b;

    invoke-interface {p1}, Lm6/i;->j()Lm6/w;

    move-result-object p1

    invoke-virtual {p1}, Lm6/w;->g()Lw5/q;

    move-result-object p1

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v1, p1}, Lp6/l0;->W(Lw5/q;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/i$b;->J(Lcom/google/protobuf/t1;)Ld7/i$b;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/i;

    return-object p1
.end method

.method private p(Lm6/i;)Lo6/b;
    .locals 3

    invoke-static {}, Lo6/b;->k0()Lo6/b$b;

    move-result-object v0

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-interface {p1}, Lm6/i;->getKey()Lm6/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp6/l0;->L(Lm6/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo6/b$b;->H(Ljava/lang/String;)Lo6/b$b;

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-interface {p1}, Lm6/i;->j()Lm6/w;

    move-result-object p1

    invoke-virtual {p1}, Lm6/w;->g()Lw5/q;

    move-result-object p1

    invoke-virtual {v1, p1}, Lp6/l0;->W(Lw5/q;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo6/b$b;->I(Lcom/google/protobuf/t1;)Lo6/b$b;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lo6/b;

    return-object p1
.end method

.method private r(Lm6/i;)Lo6/d;
    .locals 3

    invoke-static {}, Lo6/d;->k0()Lo6/d$b;

    move-result-object v0

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-interface {p1}, Lm6/i;->getKey()Lm6/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp6/l0;->L(Lm6/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo6/d$b;->H(Ljava/lang/String;)Lo6/d$b;

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-interface {p1}, Lm6/i;->j()Lm6/w;

    move-result-object p1

    invoke-virtual {p1}, Lm6/w;->g()Lw5/q;

    move-result-object p1

    invoke-virtual {v1, p1}, Lp6/l0;->W(Lw5/q;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo6/d$b;->I(Lcom/google/protobuf/t1;)Lo6/d$b;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lo6/d;

    return-object p1
.end method


# virtual methods
.method public a(Lc7/a;)Li6/i;
    .locals 3

    invoke-virtual {p1}, Lc7/a;->i0()Lc7/a$c;

    move-result-object v0

    sget-object v1, Lc7/a$c;->k:Lc7/a$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lj6/b1$a;->j:Lj6/b1$a;

    goto :goto_0

    :cond_0
    sget-object v0, Lj6/b1$a;->k:Lj6/b1$a;

    :goto_0
    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lc7/a;->j0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lc7/a;->k0()Ld7/x;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lp6/l0;->u(Ljava/lang/String;Ld7/x;)Lj6/g1;

    move-result-object p1

    new-instance v1, Li6/i;

    invoke-direct {v1, p1, v0}, Li6/i;-><init>(Lj6/g1;Lj6/b1$a;)V

    return-object v1
.end method

.method public c(Lb7/a;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb7/a;",
            ")",
            "Ljava/util/List<",
            "Lm6/q$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lb7/a;->j0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb7/a$c;

    invoke-virtual {v1}, Lb7/a$c;->i0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object v2

    invoke-virtual {v1}, Lb7/a$c;->k0()Lb7/a$c$d;

    move-result-object v3

    sget-object v4, Lb7/a$c$d;->l:Lb7/a$c$d;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v1, Lm6/q$c$a;->l:Lm6/q$c$a;

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lb7/a$c;->j0()Lb7/a$c$c;

    move-result-object v1

    sget-object v3, Lb7/a$c$c;->l:Lb7/a$c$c;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lm6/q$c$a;->j:Lm6/q$c$a;

    goto :goto_1

    :cond_1
    sget-object v1, Lm6/q$c$a;->k:Lm6/q$c$a;

    :goto_1
    invoke-static {v2, v1}, Lm6/q$c;->g(Lm6/r;Lm6/q$c$a;)Lm6/q$c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method d(Lo6/a;)Lm6/s;
    .locals 3

    sget-object v0, Ll6/o$a;->a:[I

    invoke-virtual {p1}, Lo6/a;->k0()Lo6/a$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lo6/a;->n0()Lo6/d;

    move-result-object p1

    invoke-direct {p0, p1}, Ll6/o;->i(Lo6/d;)Lm6/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Unknown MaybeDocument %s"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Lo6/a;->m0()Lo6/b;

    move-result-object v0

    invoke-virtual {p1}, Lo6/a;->l0()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Ll6/o;->g(Lo6/b;Z)Lm6/s;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lo6/a;->j0()Ld7/i;

    move-result-object v0

    invoke-virtual {p1}, Lo6/a;->l0()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Ll6/o;->b(Ld7/i;Z)Lm6/s;

    move-result-object p1

    return-object p1
.end method

.method public e(Ld7/c0;)Ln6/f;
    .locals 1

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v0, p1}, Lp6/l0;->o(Ld7/c0;)Ln6/f;

    move-result-object p1

    return-object p1
.end method

.method f(Lo6/e;)Ln6/g;
    .locals 11

    invoke-virtual {p1}, Lo6/e;->p0()I

    move-result v0

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/e;->q0()Lcom/google/protobuf/t1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp6/l0;->w(Lcom/google/protobuf/t1;)Lw5/q;

    move-result-object v1

    invoke-virtual {p1}, Lo6/e;->o0()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    iget-object v6, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1, v5}, Lo6/e;->n0(I)Ld7/c0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lp6/l0;->o(Ld7/c0;)Ln6/f;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lo6/e;->s0()I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_1
    invoke-virtual {p1}, Lo6/e;->s0()I

    move-result v6

    if-ge v5, v6, :cond_4

    invoke-virtual {p1, v5}, Lo6/e;->r0(I)Ld7/c0;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    invoke-virtual {p1}, Lo6/e;->s0()I

    move-result v8

    const/4 v9, 0x1

    if-ge v7, v8, :cond_1

    invoke-virtual {p1, v7}, Lo6/e;->r0(I)Ld7/c0;

    move-result-object v8

    invoke-virtual {v8}, Ld7/c0;->w0()Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_3

    invoke-virtual {p1, v5}, Lo6/e;->r0(I)Ld7/c0;

    move-result-object v5

    invoke-virtual {v5}, Ld7/c0;->x0()Z

    move-result v5

    new-array v8, v4, [Ljava/lang/Object;

    const-string v10, "TransformMutation should be preceded by a patch or set mutation"

    invoke-static {v5, v10, v8}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v6}, Ld7/c0;->A0(Ld7/c0;)Ld7/c0$b;

    move-result-object v5

    invoke-virtual {p1, v7}, Lo6/e;->r0(I)Ld7/c0;

    move-result-object v6

    invoke-virtual {v6}, Ld7/c0;->q0()Ld7/n;

    move-result-object v6

    invoke-virtual {v6}, Ld7/n;->g0()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ld7/n$c;

    invoke-virtual {v5, v8}, Ld7/c0$b;->H(Ld7/n$c;)Ld7/c0$b;

    goto :goto_3

    :cond_2
    iget-object v6, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v5}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v5

    check-cast v5, Ld7/c0;

    invoke-virtual {v6, v5}, Lp6/l0;->o(Ld7/c0;)Ln6/f;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_4

    :cond_3
    iget-object v7, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v7, v6}, Lp6/l0;->o(Ld7/c0;)Ln6/f;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/2addr v5, v9

    goto :goto_1

    :cond_4
    new-instance p1, Ln6/g;

    invoke-direct {p1, v0, v1, v3, v2}, Ln6/g;-><init>(ILw5/q;Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method h(Lo6/c;)Ll6/h4;
    .locals 9

    invoke-virtual {p1}, Lo6/c;->u0()I

    move-result v2

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/c;->t0()Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object v6

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/c;->p0()Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object v7

    invoke-virtual {p1}, Lo6/c;->s0()Lcom/google/protobuf/i;

    move-result-object v8

    invoke-virtual {p1}, Lo6/c;->q0()J

    move-result-wide v3

    sget-object v0, Ll6/o$a;->b:[I

    invoke-virtual {p1}, Lo6/c;->v0()Lo6/c$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v5, 0x2

    if-ne v0, v5, :cond_0

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/c;->r0()Ld7/y$d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp6/l0;->t(Ld7/y$d;)Lj6/g1;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lo6/c;->v0()Lo6/c$c;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unknown targetType %d"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Lo6/c;->o0()Ld7/y$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp6/l0;->e(Ld7/y$c;)Lj6/g1;

    move-result-object p1

    :goto_0
    move-object v1, p1

    new-instance p1, Ll6/h4;

    sget-object v5, Ll6/g1;->j:Ll6/g1;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Ll6/h4;-><init>(Lj6/g1;IJLl6/g1;Lm6/w;Lm6/w;Lcom/google/protobuf/i;)V

    return-object p1
.end method

.method public j(Li6/i;)Lc7/a;
    .locals 3

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Li6/i;->b()Lj6/g1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp6/l0;->S(Lj6/g1;)Ld7/y$d;

    move-result-object v0

    invoke-static {}, Lc7/a;->l0()Lc7/a$b;

    move-result-object v1

    invoke-virtual {p1}, Li6/i;->a()Lj6/b1$a;

    move-result-object p1

    sget-object v2, Lj6/b1$a;->j:Lj6/b1$a;

    invoke-virtual {p1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lc7/a$c;->k:Lc7/a$c;

    goto :goto_0

    :cond_0
    sget-object p1, Lc7/a$c;->l:Lc7/a$c;

    :goto_0
    invoke-virtual {v1, p1}, Lc7/a$b;->H(Lc7/a$c;)Lc7/a$b;

    invoke-virtual {v0}, Ld7/y$d;->i0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lc7/a$b;->I(Ljava/lang/String;)Lc7/a$b;

    invoke-virtual {v0}, Ld7/y$d;->j0()Ld7/x;

    move-result-object p1

    invoke-virtual {v1, p1}, Lc7/a$b;->J(Ld7/x;)Lc7/a$b;

    invoke-virtual {v1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lc7/a;

    return-object p1
.end method

.method public l(Ljava/util/List;)Lb7/a;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm6/q$c;",
            ">;)",
            "Lb7/a;"
        }
    .end annotation

    invoke-static {}, Lb7/a;->k0()Lb7/a$b;

    move-result-object v0

    sget-object v1, Lb7/a$d;->m:Lb7/a$d;

    invoke-virtual {v0, v1}, Lb7/a$b;->I(Lb7/a$d;)Lb7/a$b;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/q$c;

    invoke-static {}, Lb7/a$c;->l0()Lb7/a$c$b;

    move-result-object v2

    invoke-virtual {v1}, Lm6/q$c;->h()Lm6/r;

    move-result-object v3

    invoke-virtual {v3}, Lm6/r;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb7/a$c$b;->I(Ljava/lang/String;)Lb7/a$c$b;

    invoke-virtual {v1}, Lm6/q$c;->i()Lm6/q$c$a;

    move-result-object v3

    sget-object v4, Lm6/q$c$a;->l:Lm6/q$c$a;

    if-ne v3, v4, :cond_0

    sget-object v1, Lb7/a$c$a;->l:Lb7/a$c$a;

    invoke-virtual {v2, v1}, Lb7/a$c$b;->H(Lb7/a$c$a;)Lb7/a$c$b;

    goto :goto_2

    :cond_0
    invoke-virtual {v1}, Lm6/q$c;->i()Lm6/q$c$a;

    move-result-object v1

    sget-object v3, Lm6/q$c$a;->j:Lm6/q$c$a;

    if-ne v1, v3, :cond_1

    sget-object v1, Lb7/a$c$c;->l:Lb7/a$c$c;

    goto :goto_1

    :cond_1
    sget-object v1, Lb7/a$c$c;->m:Lb7/a$c$c;

    :goto_1
    invoke-virtual {v2, v1}, Lb7/a$c$b;->J(Lb7/a$c$c;)Lb7/a$c$b;

    :goto_2
    invoke-virtual {v0, v2}, Lb7/a$b;->H(Lb7/a$c$b;)Lb7/a$b;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lb7/a;

    return-object p1
.end method

.method m(Lm6/i;)Lo6/a;
    .locals 2

    invoke-static {}, Lo6/a;->o0()Lo6/a$b;

    move-result-object v0

    invoke-interface {p1}, Lm6/i;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Ll6/o;->p(Lm6/i;)Lo6/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo6/a$b;->J(Lo6/b;)Lo6/a$b;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lm6/i;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Ll6/o;->k(Lm6/i;)Ld7/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo6/a$b;->H(Ld7/i;)Lo6/a$b;

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lm6/i;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, p1}, Ll6/o;->r(Lm6/i;)Lo6/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo6/a$b;->K(Lo6/d;)Lo6/a$b;

    :goto_0
    invoke-interface {p1}, Lm6/i;->d()Z

    move-result p1

    invoke-virtual {v0, p1}, Lo6/a$b;->I(Z)Lo6/a$b;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lo6/a;

    return-object p1

    :cond_2
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Cannot encode invalid document %s"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public n(Ln6/f;)Ld7/c0;
    .locals 1

    iget-object v0, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v0, p1}, Lp6/l0;->O(Ln6/f;)Ld7/c0;

    move-result-object p1

    return-object p1
.end method

.method o(Ln6/g;)Lo6/e;
    .locals 4

    invoke-static {}, Lo6/e;->t0()Lo6/e$b;

    move-result-object v0

    invoke-virtual {p1}, Ln6/g;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lo6/e$b;->J(I)Lo6/e$b;

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Ln6/g;->g()Lw5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp6/l0;->W(Lw5/q;)Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo6/e$b;->K(Lcom/google/protobuf/t1;)Lo6/e$b;

    invoke-virtual {p1}, Ln6/g;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/f;

    iget-object v3, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v3, v2}, Lp6/l0;->O(Ln6/f;)Ld7/c0;

    move-result-object v2

    invoke-virtual {v0, v2}, Lo6/e$b;->H(Ld7/c0;)Lo6/e$b;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ln6/g;->h()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/f;

    iget-object v2, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v2, v1}, Lp6/l0;->O(Ln6/f;)Ld7/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo6/e$b;->I(Ld7/c0;)Lo6/e$b;

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lo6/e;

    return-object p1
.end method

.method q(Ll6/h4;)Lo6/c;
    .locals 4

    sget-object v0, Ll6/g1;->j:Ll6/g1;

    invoke-virtual {p1}, Ll6/h4;->b()Ll6/g1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {p1}, Ll6/h4;->b()Ll6/g1;

    move-result-object v0

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const-string v0, "Only queries with purpose %s may be stored, got %s"

    invoke-static {v1, v0, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lo6/c;->w0()Lo6/c$b;

    move-result-object v0

    invoke-virtual {p1}, Ll6/h4;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lo6/c$b;->O(I)Lo6/c$b;

    move-result-object v1

    invoke-virtual {p1}, Ll6/h4;->d()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lo6/c$b;->K(J)Lo6/c$b;

    move-result-object v1

    iget-object v2, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Ll6/h4;->a()Lm6/w;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp6/l0;->Y(Lm6/w;)Lcom/google/protobuf/t1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo6/c$b;->J(Lcom/google/protobuf/t1;)Lo6/c$b;

    move-result-object v1

    iget-object v2, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {p1}, Ll6/h4;->e()Lm6/w;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp6/l0;->Y(Lm6/w;)Lcom/google/protobuf/t1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo6/c$b;->N(Lcom/google/protobuf/t1;)Lo6/c$b;

    move-result-object v1

    invoke-virtual {p1}, Ll6/h4;->c()Lcom/google/protobuf/i;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo6/c$b;->M(Lcom/google/protobuf/i;)Lo6/c$b;

    invoke-virtual {p1}, Ll6/h4;->f()Lj6/g1;

    move-result-object p1

    invoke-virtual {p1}, Lj6/g1;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v1, p1}, Lp6/l0;->F(Lj6/g1;)Ld7/y$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo6/c$b;->I(Ld7/y$c;)Lo6/c$b;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll6/o;->a:Lp6/l0;

    invoke-virtual {v1, p1}, Lp6/l0;->S(Lj6/g1;)Ld7/y$d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo6/c$b;->L(Ld7/y$d;)Lo6/c$b;

    :goto_0
    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lo6/c;

    return-object p1
.end method
