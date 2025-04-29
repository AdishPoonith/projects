.class public final Lp6/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lm6/f;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lm6/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/l0;->a:Lm6/f;

    invoke-static {p1}, Lp6/l0;->Z(Lm6/f;)Lm6/u;

    move-result-object p1

    invoke-virtual {p1}, Lm6/u;->h()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lp6/l0;->b:Ljava/lang/String;

    return-void
.end method

.method private E(Ln6/d;)Ld7/l;
    .locals 2

    invoke-static {}, Ld7/l;->l0()Ld7/l$b;

    move-result-object v0

    invoke-virtual {p1}, Ln6/d;->c()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/r;

    invoke-virtual {v1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/l$b;->H(Ljava/lang/String;)Ld7/l$b;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/l;

    return-object p1
.end method

.method private G(Lj6/q$b;)Ld7/x$f$b;
    .locals 2

    sget-object v0, Lp6/l0$a;->i:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Unknown operator %d"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :pswitch_0
    sget-object p1, Ld7/x$f$b;->u:Ld7/x$f$b;

    return-object p1

    :pswitch_1
    sget-object p1, Ld7/x$f$b;->t:Ld7/x$f$b;

    return-object p1

    :pswitch_2
    sget-object p1, Ld7/x$f$b;->s:Ld7/x$f$b;

    return-object p1

    :pswitch_3
    sget-object p1, Ld7/x$f$b;->r:Ld7/x$f$b;

    return-object p1

    :pswitch_4
    sget-object p1, Ld7/x$f$b;->o:Ld7/x$f$b;

    return-object p1

    :pswitch_5
    sget-object p1, Ld7/x$f$b;->n:Ld7/x$f$b;

    return-object p1

    :pswitch_6
    sget-object p1, Ld7/x$f$b;->q:Ld7/x$f$b;

    return-object p1

    :pswitch_7
    sget-object p1, Ld7/x$f$b;->p:Ld7/x$f$b;

    return-object p1

    :pswitch_8
    sget-object p1, Ld7/x$f$b;->m:Ld7/x$f$b;

    return-object p1

    :pswitch_9
    sget-object p1, Ld7/x$f$b;->l:Ld7/x$f$b;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private H(Lm6/r;)Ld7/x$g;
    .locals 1

    invoke-static {}, Ld7/x$g;->i0()Ld7/x$g$a;

    move-result-object v0

    invoke-virtual {p1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/x$g$a;->H(Ljava/lang/String;)Ld7/x$g$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/x$g;

    return-object p1
.end method

.method private I(Ln6/e;)Ld7/n$c;
    .locals 2

    invoke-virtual {p1}, Ln6/e;->b()Ln6/p;

    move-result-object v0

    instance-of v1, v0, Ln6/n;

    if-eqz v1, :cond_0

    invoke-static {}, Ld7/n$c;->q0()Ld7/n$c$a;

    move-result-object v0

    invoke-virtual {p1}, Ln6/e;->a()Lm6/r;

    move-result-object p1

    invoke-virtual {p1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/n$c$a;->I(Ljava/lang/String;)Ld7/n$c$a;

    move-result-object p1

    sget-object v0, Ld7/n$c$b;->l:Ld7/n$c$b;

    invoke-virtual {p1, v0}, Ld7/n$c$a;->L(Ld7/n$c$b;)Ld7/n$c$a;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/n$c;

    return-object p1

    :cond_0
    instance-of v1, v0, Ln6/a$b;

    if-eqz v1, :cond_1

    check-cast v0, Ln6/a$b;

    invoke-static {}, Ld7/n$c;->q0()Ld7/n$c$a;

    move-result-object v1

    invoke-virtual {p1}, Ln6/e;->a()Lm6/r;

    move-result-object p1

    invoke-virtual {p1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ld7/n$c$a;->I(Ljava/lang/String;)Ld7/n$c$a;

    move-result-object p1

    invoke-static {}, Ld7/b;->o0()Ld7/b$b;

    move-result-object v1

    invoke-virtual {v0}, Ln6/a;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ld7/b$b;->H(Ljava/lang/Iterable;)Ld7/b$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld7/n$c$a;->H(Ld7/b$b;)Ld7/n$c$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Ln6/a$a;

    if-eqz v1, :cond_2

    check-cast v0, Ln6/a$a;

    invoke-static {}, Ld7/n$c;->q0()Ld7/n$c$a;

    move-result-object v1

    invoke-virtual {p1}, Ln6/e;->a()Lm6/r;

    move-result-object p1

    invoke-virtual {p1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ld7/n$c$a;->I(Ljava/lang/String;)Ld7/n$c$a;

    move-result-object p1

    invoke-static {}, Ld7/b;->o0()Ld7/b$b;

    move-result-object v1

    invoke-virtual {v0}, Ln6/a;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ld7/b$b;->H(Ljava/lang/Iterable;)Ld7/b$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld7/n$c$a;->K(Ld7/b$b;)Ld7/n$c$a;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v1, v0, Ln6/j;

    if-eqz v1, :cond_3

    check-cast v0, Ln6/j;

    invoke-static {}, Ld7/n$c;->q0()Ld7/n$c$a;

    move-result-object v1

    invoke-virtual {p1}, Ln6/e;->a()Lm6/r;

    move-result-object p1

    invoke-virtual {p1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ld7/n$c$a;->I(Ljava/lang/String;)Ld7/n$c$a;

    move-result-object p1

    invoke-virtual {v0}, Ln6/j;->d()Ld7/b0;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld7/n$c$a;->J(Ld7/b0;)Ld7/n$c$a;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    const-string v0, "Unknown transform: %s"

    invoke-static {v0, p1}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private K(Ljava/util/List;)Ld7/x$h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj6/r;",
            ">;)",
            "Ld7/x$h;"
        }
    .end annotation

    new-instance v0, Lj6/l;

    sget-object v1, Lj6/l$a;->k:Lj6/l$a;

    invoke-direct {v0, p1, v1}, Lj6/l;-><init>(Ljava/util/List;Lj6/l$a;)V

    invoke-virtual {p0, v0}, Lp6/l0;->J(Lj6/r;)Ld7/x$h;

    move-result-object p1

    return-object p1
.end method

.method private M(Ll6/g1;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lp6/l0$a;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    const-string p1, "limbo-document"

    return-object p1

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Unrecognized query purpose: %s"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    const-string p1, "existence-filter-mismatch"

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private P(Lj6/a1;)Ld7/x$i;
    .locals 3

    invoke-static {}, Ld7/x$i;->j0()Ld7/x$i$a;

    move-result-object v0

    invoke-virtual {p1}, Lj6/a1;->b()Lj6/a1$a;

    move-result-object v1

    sget-object v2, Lj6/a1$a;->k:Lj6/a1$a;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ld7/x$e;->l:Ld7/x$e;

    goto :goto_0

    :cond_0
    sget-object v1, Ld7/x$e;->m:Ld7/x$e;

    :goto_0
    invoke-virtual {v0, v1}, Ld7/x$i$a;->H(Ld7/x$e;)Ld7/x$i$a;

    invoke-virtual {p1}, Lj6/a1;->c()Lm6/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/l0;->H(Lm6/r;)Ld7/x$g;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/x$i$a;->I(Ld7/x$g;)Ld7/x$i$a;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/x$i;

    return-object p1
.end method

.method private Q(Ln6/m;)Ld7/t;
    .locals 4

    invoke-virtual {p1}, Ln6/m;->d()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Can\'t serialize an empty precondition"

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ld7/t;->l0()Ld7/t$b;

    move-result-object v0

    invoke-virtual {p1}, Ln6/m;->c()Lm6/w;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ln6/m;->c()Lm6/w;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->Y(Lm6/w;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/t$b;->I(Lcom/google/protobuf/t1;)Ld7/t$b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/t;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ln6/m;->b()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ln6/m;->b()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Ld7/t$b;->H(Z)Ld7/t$b;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "Unknown Precondition"

    invoke-static {v0, p1}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method private R(Lm6/u;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp6/l0;->a:Lm6/f;

    invoke-direct {p0, v0, p1}, Lp6/l0;->T(Lm6/f;Lm6/u;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private T(Lm6/f;Lm6/u;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Lp6/l0;->Z(Lm6/f;)Lm6/u;

    move-result-object p1

    const-string v0, "documents"

    invoke-virtual {p1, v0}, Lm6/e;->b(Ljava/lang/String;)Lm6/e;

    move-result-object p1

    check-cast p1, Lm6/u;

    invoke-virtual {p1, p2}, Lm6/e;->g(Lm6/e;)Lm6/e;

    move-result-object p1

    check-cast p1, Lm6/u;

    invoke-virtual {p1}, Lm6/u;->h()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static Z(Lm6/f;)Lm6/u;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "projects"

    aput-object v2, v0, v1

    invoke-virtual {p0}, Lm6/f;->k()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    const-string v2, "databases"

    aput-object v2, v0, v1

    invoke-virtual {p0}, Lm6/f;->i()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x3

    aput-object p0, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm6/u;->u(Ljava/util/List;)Lm6/u;

    move-result-object p0

    return-object p0
.end method

.method private static a0(Lm6/u;)Lm6/u;
    .locals 4

    invoke-virtual {p0}, Lm6/e;->q()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-le v0, v3, :cond_0

    invoke-virtual {p0, v3}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "documents"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v2

    const-string v2, "Tried to deserialize invalid key %s"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lm6/e;->r(I)Lm6/e;

    move-result-object p0

    check-cast p0, Lm6/u;

    return-object p0
.end method

.method private b0(Lg7/a;)Li9/j1;
    .locals 1

    invoke-virtual {p1}, Lg7/a;->f0()I

    move-result v0

    invoke-static {v0}, Li9/j1;->h(I)Li9/j1;

    move-result-object v0

    invoke-virtual {p1}, Lg7/a;->h0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object p1

    return-object p1
.end method

.method private d(Ld7/l;)Ln6/d;
    .locals 4

    invoke-virtual {p1}, Ld7/l;->k0()I

    move-result v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Ld7/l;->j0(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ln6/d;->b(Ljava/util/Set;)Ln6/d;

    move-result-object p1

    return-object p1
.end method

.method private static d0(Lm6/u;)Z
    .locals 3

    invoke-virtual {p0}, Lm6/e;->q()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-lt v0, v2, :cond_0

    invoke-virtual {p0, v1}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "projects"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "databases"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private g(Ld7/x$f$b;)Lj6/q$b;
    .locals 2

    sget-object v0, Lp6/l0$a;->j:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Unhandled FieldFilter.operator %d"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :pswitch_0
    sget-object p1, Lj6/q$b;->t:Lj6/q$b;

    return-object p1

    :pswitch_1
    sget-object p1, Lj6/q$b;->r:Lj6/q$b;

    return-object p1

    :pswitch_2
    sget-object p1, Lj6/q$b;->s:Lj6/q$b;

    return-object p1

    :pswitch_3
    sget-object p1, Lj6/q$b;->q:Lj6/q$b;

    return-object p1

    :pswitch_4
    sget-object p1, Lj6/q$b;->o:Lj6/q$b;

    return-object p1

    :pswitch_5
    sget-object p1, Lj6/q$b;->p:Lj6/q$b;

    return-object p1

    :pswitch_6
    sget-object p1, Lj6/q$b;->n:Lj6/q$b;

    return-object p1

    :pswitch_7
    sget-object p1, Lj6/q$b;->m:Lj6/q$b;

    return-object p1

    :pswitch_8
    sget-object p1, Lj6/q$b;->l:Lj6/q$b;

    return-object p1

    :pswitch_9
    sget-object p1, Lj6/q$b;->k:Lj6/q$b;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private h(Ld7/n$c;)Ln6/e;
    .locals 4

    sget-object v0, Lp6/l0$a;->c:[I

    invoke-virtual {p1}, Ld7/n$c;->p0()Ld7/n$c$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    new-instance v0, Ln6/e;

    invoke-virtual {p1}, Ld7/n$c;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object v1

    new-instance v2, Ln6/j;

    invoke-virtual {p1}, Ld7/n$c;->m0()Ld7/b0;

    move-result-object p1

    invoke-direct {v2, p1}, Ln6/j;-><init>(Ld7/b0;)V

    invoke-direct {v0, v1, v2}, Ln6/e;-><init>(Lm6/r;Ln6/p;)V

    return-object v0

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "Unknown FieldTransform proto: %s"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    new-instance v0, Ln6/e;

    invoke-virtual {p1}, Ld7/n$c;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object v1

    new-instance v2, Ln6/a$a;

    invoke-virtual {p1}, Ld7/n$c;->n0()Ld7/b;

    move-result-object p1

    invoke-virtual {p1}, Ld7/b;->o()Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1}, Ln6/a$a;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, v2}, Ln6/e;-><init>(Lm6/r;Ln6/p;)V

    return-object v0

    :cond_2
    new-instance v0, Ln6/e;

    invoke-virtual {p1}, Ld7/n$c;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object v1

    new-instance v2, Ln6/a$b;

    invoke-virtual {p1}, Ld7/n$c;->k0()Ld7/b;

    move-result-object p1

    invoke-virtual {p1}, Ld7/b;->o()Ljava/util/List;

    move-result-object p1

    invoke-direct {v2, p1}, Ln6/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, v2}, Ln6/e;-><init>(Lm6/r;Ln6/p;)V

    return-object v0

    :cond_3
    invoke-virtual {p1}, Ld7/n$c;->o0()Ld7/n$c$b;

    move-result-object v0

    sget-object v3, Ld7/n$c$b;->l:Ld7/n$c$b;

    if-ne v0, v3, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ld7/n$c;->o0()Ld7/n$c$b;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "Unknown transform setToServerValue: %s"

    invoke-static {v0, v1, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ln6/e;

    invoke-virtual {p1}, Ld7/n$c;->l0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object p1

    invoke-static {}, Ln6/n;->d()Ln6/n;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ln6/e;-><init>(Lm6/r;Ln6/p;)V

    return-object v0
.end method

.method private j(Ld7/x$h;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld7/x$h;",
            ")",
            "Ljava/util/List<",
            "Lj6/r;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lp6/l0;->i(Ld7/x$h;)Lj6/r;

    move-result-object p1

    instance-of v0, p1, Lj6/l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lj6/l;

    invoke-virtual {v0}, Lj6/l;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lj6/l;->b()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private k(Ld7/e;)Lm6/s;
    .locals 5

    invoke-virtual {p1}, Ld7/e;->j0()Ld7/e$c;

    move-result-object v0

    sget-object v1, Ld7/e$c;->k:Ld7/e$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Tried to deserialize a found document from a missing document."

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ld7/e;->g0()Ld7/i;

    move-result-object v0

    invoke-virtual {v0}, Ld7/i;->l0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v0

    invoke-virtual {p1}, Ld7/e;->g0()Ld7/i;

    move-result-object v2

    invoke-virtual {v2}, Ld7/i;->j0()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Lm6/t;->i(Ljava/util/Map;)Lm6/t;

    move-result-object v2

    invoke-virtual {p1}, Ld7/e;->g0()Ld7/i;

    move-result-object p1

    invoke-virtual {p1}, Ld7/i;->m0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object p1

    sget-object v3, Lm6/w;->k:Lm6/w;

    invoke-virtual {p1, v3}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v4, "Got a document response with no snapshot version"

    invoke-static {v3, v4, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0, p1, v2}, Lm6/s;->p(Lm6/l;Lm6/w;Lm6/t;)Lm6/s;

    move-result-object p1

    return-object p1
.end method

.method private n(Ld7/e;)Lm6/s;
    .locals 4

    invoke-virtual {p1}, Ld7/e;->j0()Ld7/e$c;

    move-result-object v0

    sget-object v1, Ld7/e$c;->l:Ld7/e$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Tried to deserialize a missing document from a found document."

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ld7/e;->h0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v0

    invoke-virtual {p1}, Ld7/e;->i0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object p1

    sget-object v2, Lm6/w;->k:Lm6/w;

    invoke-virtual {p1, v2}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Got a no document response with no snapshot version"

    invoke-static {v2, v3, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lm6/s;->r(Lm6/l;Lm6/w;)Lm6/s;

    move-result-object p1

    return-object p1
.end method

.method private q(Ld7/x$i;)Lj6/a1;
    .locals 4

    invoke-virtual {p1}, Ld7/x$i;->i0()Ld7/x$g;

    move-result-object v0

    invoke-virtual {v0}, Ld7/x$g;->h0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object v0

    sget-object v1, Lp6/l0$a;->k:[I

    invoke-virtual {p1}, Ld7/x$i;->h0()Ld7/x$e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    sget-object p1, Lj6/a1$a;->l:Lj6/a1$a;

    goto :goto_0

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ld7/x$i;->h0()Ld7/x$e;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unrecognized direction %d"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, Lj6/a1$a;->k:Lj6/a1$a;

    :goto_0
    invoke-static {p1, v0}, Lj6/a1;->d(Lj6/a1$a;Lm6/r;)Lj6/a1;

    move-result-object p1

    return-object p1
.end method

.method private r(Ld7/t;)Ln6/m;
    .locals 2

    sget-object v0, Lp6/l0$a;->b:[I

    invoke-virtual {p1}, Ld7/t;->h0()Ld7/t$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    sget-object p1, Ln6/m;->c:Ln6/m;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Unknown precondition"

    invoke-static {v0, p1}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Ld7/t;->j0()Z

    move-result p1

    invoke-static {p1}, Ln6/m;->a(Z)Ln6/m;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ld7/t;->k0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object p1

    invoke-static {p1}, Ln6/m;->f(Lm6/w;)Ln6/m;

    move-result-object p1

    return-object p1
.end method

.method private s(Ljava/lang/String;)Lm6/u;
    .locals 2

    invoke-direct {p0, p1}, Lp6/l0;->v(Ljava/lang/String;)Lm6/u;

    move-result-object p1

    invoke-virtual {p1}, Lm6/e;->q()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p1, Lm6/u;->k:Lm6/u;

    return-object p1

    :cond_0
    invoke-static {p1}, Lp6/l0;->a0(Lm6/u;)Lm6/u;

    move-result-object p1

    return-object p1
.end method

.method private v(Ljava/lang/String;)Lm6/u;
    .locals 3

    invoke-static {p1}, Lm6/u;->v(Ljava/lang/String;)Lm6/u;

    move-result-object p1

    invoke-static {p1}, Lp6/l0;->d0(Lm6/u;)Z

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "Tried to deserialize invalid key %s"

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method private x(Ld7/x$k;)Lj6/r;
    .locals 4

    invoke-virtual {p1}, Ld7/x$k;->i0()Ld7/x$g;

    move-result-object v0

    invoke-virtual {v0}, Ld7/x$g;->h0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object v0

    sget-object v1, Lp6/l0$a;->h:[I

    invoke-virtual {p1}, Ld7/x$k;->j0()Ld7/x$k$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    const/4 v3, 0x3

    if-eq v1, v3, :cond_1

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    sget-object p1, Lj6/q$b;->n:Lj6/q$b;

    :goto_0
    sget-object v1, Lm6/y;->b:Ld7/b0;

    :goto_1
    invoke-static {v0, p1, v1}, Lj6/q;->f(Lm6/r;Lj6/q$b;Ld7/b0;)Lj6/q;

    move-result-object p1

    return-object p1

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ld7/x$k;->j0()Ld7/x$k$b;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unrecognized UnaryFilter.operator %d"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, Lj6/q$b;->n:Lj6/q$b;

    :goto_2
    sget-object v1, Lm6/y;->a:Ld7/b0;

    goto :goto_1

    :cond_2
    sget-object p1, Lj6/q$b;->m:Lj6/q$b;

    goto :goto_0

    :cond_3
    sget-object p1, Lj6/q$b;->m:Lj6/q$b;

    goto :goto_2
.end method


# virtual methods
.method public A(Ld7/r;)Lp6/w0;
    .locals 8

    sget-object v0, Lp6/l0$a;->m:[I

    invoke-virtual {p1}, Ld7/r;->k0()Ld7/r$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v0, v6, :cond_4

    if-eq v0, v5, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Ld7/r;->j0()Ld7/o;

    move-result-object p1

    new-instance v0, Lp6/p;

    invoke-virtual {p1}, Ld7/o;->f0()I

    move-result v1

    invoke-direct {v0, v1}, Lp6/p;-><init>(I)V

    invoke-virtual {p1}, Ld7/o;->h0()I

    move-result p1

    new-instance v1, Lp6/w0$c;

    invoke-direct {v1, p1, v0}, Lp6/w0$c;-><init>(ILp6/p;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown change type set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Ld7/r;->i0()Ld7/m;

    move-result-object p1

    invoke-virtual {p1}, Ld7/m;->h0()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Ld7/m;->g0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object p1

    new-instance v2, Lp6/w0$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3, v0, p1, v1}, Lp6/w0$b;-><init>(Ljava/util/List;Ljava/util/List;Lm6/l;Lm6/s;)V

    :goto_0
    move-object v1, v2

    goto/16 :goto_2

    :cond_2
    invoke-virtual {p1}, Ld7/r;->h0()Ld7/k;

    move-result-object p1

    invoke-virtual {p1}, Ld7/k;->i0()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Ld7/k;->g0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v1

    invoke-virtual {p1}, Ld7/k;->h0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object p1

    invoke-static {v1, p1}, Lm6/s;->r(Lm6/l;Lm6/w;)Lm6/s;

    move-result-object p1

    new-instance v1, Lp6/w0$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lm6/s;->getKey()Lm6/l;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3, p1}, Lp6/w0$b;-><init>(Ljava/util/List;Ljava/util/List;Lm6/l;Lm6/s;)V

    goto/16 :goto_2

    :cond_3
    invoke-virtual {p1}, Ld7/r;->g0()Ld7/j;

    move-result-object p1

    invoke-virtual {p1}, Ld7/j;->i0()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Ld7/j;->h0()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Ld7/j;->g0()Ld7/i;

    move-result-object v2

    invoke-virtual {v2}, Ld7/i;->l0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v2

    invoke-virtual {p1}, Ld7/j;->g0()Ld7/i;

    move-result-object v3

    invoke-virtual {v3}, Ld7/i;->m0()Lcom/google/protobuf/t1;

    move-result-object v3

    invoke-virtual {p0, v3}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object v3

    sget-object v4, Lm6/w;->k:Lm6/w;

    invoke-virtual {v3, v4}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v6

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "Got a document change without an update time"

    invoke-static {v4, v6, v5}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ld7/j;->g0()Ld7/i;

    move-result-object p1

    invoke-virtual {p1}, Ld7/i;->j0()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lm6/t;->i(Ljava/util/Map;)Lm6/t;

    move-result-object p1

    invoke-static {v2, v3, p1}, Lm6/s;->p(Lm6/l;Lm6/w;Lm6/t;)Lm6/s;

    move-result-object p1

    new-instance v2, Lp6/w0$b;

    invoke-virtual {p1}, Lm6/s;->getKey()Lm6/l;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3, p1}, Lp6/w0$b;-><init>(Ljava/util/List;Ljava/util/List;Lm6/l;Lm6/s;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Ld7/r;->l0()Ld7/z;

    move-result-object p1

    sget-object v0, Lp6/l0$a;->l:[I

    invoke-virtual {p1}, Ld7/z;->j0()Ld7/z$c;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v0, v0, v7

    if-eq v0, v6, :cond_9

    if-eq v0, v5, :cond_8

    if-eq v0, v4, :cond_7

    if-eq v0, v3, :cond_6

    if-ne v0, v2, :cond_5

    sget-object v0, Lp6/w0$e;->n:Lp6/w0$e;

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown target change type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    sget-object v0, Lp6/w0$e;->m:Lp6/w0$e;

    goto :goto_1

    :cond_7
    sget-object v0, Lp6/w0$e;->l:Lp6/w0$e;

    invoke-virtual {p1}, Ld7/z;->f0()Lg7/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lp6/l0;->b0(Lg7/a;)Li9/j1;

    move-result-object v1

    goto :goto_1

    :cond_8
    sget-object v0, Lp6/w0$e;->k:Lp6/w0$e;

    goto :goto_1

    :cond_9
    sget-object v0, Lp6/w0$e;->j:Lp6/w0$e;

    :goto_1
    new-instance v2, Lp6/w0$d;

    invoke-virtual {p1}, Ld7/z;->l0()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Ld7/z;->i0()Lcom/google/protobuf/i;

    move-result-object p1

    invoke-direct {v2, v0, v3, p1, v1}, Lp6/w0$d;-><init>(Lp6/w0$e;Ljava/util/List;Lcom/google/protobuf/i;Li9/j1;)V

    goto/16 :goto_0

    :goto_2
    return-object v1
.end method

.method B(Lj6/l;)Ld7/x$h;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lj6/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Lj6/l;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj6/r;

    invoke-virtual {p0, v2}, Lp6/l0;->J(Lj6/r;)Ld7/x$h;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    check-cast p1, Ld7/x$h;

    return-object p1

    :cond_1
    invoke-static {}, Ld7/x$d;->m0()Ld7/x$d$a;

    move-result-object v1

    invoke-virtual {p1}, Lj6/l;->h()Lj6/l$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->C(Lj6/l$a;)Ld7/x$d$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Ld7/x$d$a;->I(Ld7/x$d$b;)Ld7/x$d$a;

    invoke-virtual {v1, v0}, Ld7/x$d$a;->H(Ljava/lang/Iterable;)Ld7/x$d$a;

    invoke-static {}, Ld7/x$h;->n0()Ld7/x$h$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Ld7/x$h$a;->H(Ld7/x$d$a;)Ld7/x$h$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    goto :goto_1
.end method

.method C(Lj6/l$a;)Ld7/x$d$b;
    .locals 1

    sget-object v0, Lp6/l0$a;->e:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Ld7/x$d$b;->m:Ld7/x$d$b;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Unrecognized composite filter type."

    invoke-static {v0, p1}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, Ld7/x$d$b;->l:Ld7/x$d$b;

    return-object p1
.end method

.method public D(Lm6/l;Lm6/t;)Ld7/i;
    .locals 1

    invoke-static {}, Ld7/i;->p0()Ld7/i$b;

    move-result-object v0

    invoke-virtual {p0, p1}, Lp6/l0;->L(Lm6/l;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/i$b;->I(Ljava/lang/String;)Ld7/i$b;

    invoke-virtual {p2}, Lm6/t;->o()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/i$b;->H(Ljava/util/Map;)Ld7/i$b;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/i;

    return-object p1
.end method

.method public F(Lj6/g1;)Ld7/y$c;
    .locals 1

    invoke-static {}, Ld7/y$c;->l0()Ld7/y$c$a;

    move-result-object v0

    invoke-virtual {p1}, Lj6/g1;->n()Lm6/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/l0;->R(Lm6/u;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/y$c$a;->H(Ljava/lang/String;)Ld7/y$c$a;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/y$c;

    return-object p1
.end method

.method J(Lj6/r;)Ld7/x$h;
    .locals 2

    instance-of v0, p1, Lj6/q;

    if-eqz v0, :cond_0

    check-cast p1, Lj6/q;

    invoke-virtual {p0, p1}, Lp6/l0;->X(Lj6/q;)Ld7/x$h;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lj6/l;

    if-eqz v0, :cond_1

    check-cast p1, Lj6/l;

    invoke-virtual {p0, p1}, Lp6/l0;->B(Lj6/l;)Ld7/x$h;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unrecognized filter type %s"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public L(Lm6/l;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp6/l0;->a:Lm6/f;

    invoke-virtual {p1}, Lm6/l;->r()Lm6/u;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lp6/l0;->T(Lm6/f;Lm6/u;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public N(Ll6/h4;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll6/h4;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ll6/h4;->b()Ll6/g1;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/l0;->M(Ll6/g1;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "goog-listen-tags"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public O(Ln6/f;)Ld7/c0;
    .locals 3

    invoke-static {}, Ld7/c0;->z0()Ld7/c0$b;

    move-result-object v0

    instance-of v1, p1, Ln6/o;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ln6/f;->g()Lm6/l;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Ln6/o;

    invoke-virtual {v2}, Ln6/o;->o()Lm6/t;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lp6/l0;->D(Lm6/l;Lm6/t;)Ld7/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/c0$b;->K(Ld7/i;)Ld7/c0$b;

    goto :goto_0

    :cond_0
    instance-of v1, p1, Ln6/l;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ln6/f;->g()Lm6/l;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Ln6/l;

    invoke-virtual {v2}, Ln6/l;->q()Lm6/t;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lp6/l0;->D(Lm6/l;Lm6/t;)Ld7/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/c0$b;->K(Ld7/i;)Ld7/c0$b;

    invoke-virtual {p1}, Ln6/f;->e()Ln6/d;

    move-result-object v1

    invoke-direct {p0, v1}, Lp6/l0;->E(Ln6/d;)Ld7/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/c0$b;->L(Ld7/l;)Ld7/c0$b;

    goto :goto_0

    :cond_1
    instance-of v1, p1, Ln6/c;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ln6/f;->g()Lm6/l;

    move-result-object v1

    invoke-virtual {p0, v1}, Lp6/l0;->L(Lm6/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/c0$b;->J(Ljava/lang/String;)Ld7/c0$b;

    goto :goto_0

    :cond_2
    instance-of v1, p1, Ln6/q;

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Ln6/f;->g()Lm6/l;

    move-result-object v1

    invoke-virtual {p0, v1}, Lp6/l0;->L(Lm6/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/c0$b;->M(Ljava/lang/String;)Ld7/c0$b;

    :goto_0
    invoke-virtual {p1}, Ln6/f;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/e;

    invoke-direct {p0, v2}, Lp6/l0;->I(Ln6/e;)Ld7/n$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Ld7/c0$b;->H(Ld7/n$c;)Ld7/c0$b;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ln6/f;->h()Ln6/m;

    move-result-object v1

    invoke-virtual {v1}, Ln6/m;->d()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Ln6/f;->h()Ln6/m;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/l0;->Q(Ln6/m;)Ld7/t;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/c0$b;->I(Ld7/t;)Ld7/c0$b;

    :cond_4
    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/c0;

    return-object p1

    :cond_5
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "unknown mutation type %s"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public S(Lj6/g1;)Ld7/y$d;
    .locals 7

    invoke-static {}, Ld7/y$d;->k0()Ld7/y$d$a;

    move-result-object v0

    invoke-static {}, Ld7/x;->C0()Ld7/x$b;

    move-result-object v1

    invoke-virtual {p1}, Lj6/g1;->n()Lm6/u;

    move-result-object v2

    invoke-virtual {p1}, Lj6/g1;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lm6/e;->q()I

    move-result v3

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "Collection Group queries should be within a document path or root."

    invoke-static {v3, v6, v5}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, v2}, Lp6/l0;->R(Lm6/u;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ld7/y$d$a;->H(Ljava/lang/String;)Ld7/y$d$a;

    invoke-static {}, Ld7/x$c;->j0()Ld7/x$c$a;

    move-result-object v2

    invoke-virtual {p1}, Lj6/g1;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ld7/x$c$a;->I(Ljava/lang/String;)Ld7/x$c$a;

    invoke-virtual {v2, v4}, Ld7/x$c$a;->H(Z)Ld7/x$c$a;

    invoke-virtual {v1, v2}, Ld7/x$b;->H(Ld7/x$c$a;)Ld7/x$b;

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Lm6/e;->q()I

    move-result v3

    rem-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "Document queries with filters are not supported."

    invoke-static {v3, v6, v5}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm6/e;->s()Lm6/e;

    move-result-object v3

    check-cast v3, Lm6/u;

    invoke-direct {p0, v3}, Lp6/l0;->R(Lm6/u;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ld7/y$d$a;->H(Ljava/lang/String;)Ld7/y$d$a;

    invoke-static {}, Ld7/x$c;->j0()Ld7/x$c$a;

    move-result-object v3

    invoke-virtual {v2}, Lm6/e;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ld7/x$c$a;->I(Ljava/lang/String;)Ld7/x$c$a;

    invoke-virtual {v1, v3}, Ld7/x$b;->H(Ld7/x$c$a;)Ld7/x$b;

    :goto_2
    invoke-virtual {p1}, Lj6/g1;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {p1}, Lj6/g1;->h()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2}, Lp6/l0;->K(Ljava/util/List;)Ld7/x$h;

    move-result-object v2

    invoke-virtual {v1, v2}, Ld7/x$b;->M(Ld7/x$h;)Ld7/x$b;

    :cond_3
    invoke-virtual {p1}, Lj6/g1;->m()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj6/a1;

    invoke-direct {p0, v3}, Lp6/l0;->P(Lj6/a1;)Ld7/x$i;

    move-result-object v3

    invoke-virtual {v1, v3}, Ld7/x$b;->I(Ld7/x$i;)Ld7/x$b;

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lj6/g1;->r()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, Lcom/google/protobuf/a0;->i0()Lcom/google/protobuf/a0$b;

    move-result-object v2

    invoke-virtual {p1}, Lj6/g1;->j()J

    move-result-wide v5

    long-to-int v3, v5

    invoke-virtual {v2, v3}, Lcom/google/protobuf/a0$b;->H(I)Lcom/google/protobuf/a0$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ld7/x$b;->K(Lcom/google/protobuf/a0$b;)Ld7/x$b;

    :cond_5
    invoke-virtual {p1}, Lj6/g1;->p()Lj6/i;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {}, Ld7/h;->l0()Ld7/h$b;

    move-result-object v2

    invoke-virtual {p1}, Lj6/g1;->p()Lj6/i;

    move-result-object v3

    invoke-virtual {v3}, Lj6/i;->b()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ld7/h$b;->H(Ljava/lang/Iterable;)Ld7/h$b;

    invoke-virtual {p1}, Lj6/g1;->p()Lj6/i;

    move-result-object v3

    invoke-virtual {v3}, Lj6/i;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ld7/h$b;->I(Z)Ld7/h$b;

    invoke-virtual {v1, v2}, Ld7/x$b;->L(Ld7/h$b;)Ld7/x$b;

    :cond_6
    invoke-virtual {p1}, Lj6/g1;->f()Lj6/i;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {}, Ld7/h;->l0()Ld7/h$b;

    move-result-object v2

    invoke-virtual {p1}, Lj6/g1;->f()Lj6/i;

    move-result-object v3

    invoke-virtual {v3}, Lj6/i;->b()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ld7/h$b;->H(Ljava/lang/Iterable;)Ld7/h$b;

    invoke-virtual {p1}, Lj6/g1;->f()Lj6/i;

    move-result-object p1

    invoke-virtual {p1}, Lj6/i;->c()Z

    move-result p1

    xor-int/2addr p1, v4

    invoke-virtual {v2, p1}, Ld7/h$b;->I(Z)Ld7/h$b;

    invoke-virtual {v1, v2}, Ld7/x$b;->J(Ld7/h$b;)Ld7/x$b;

    :cond_7
    invoke-virtual {v0, v1}, Ld7/y$d$a;->I(Ld7/x$b;)Ld7/y$d$a;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/y$d;

    return-object p1
.end method

.method U(Ld7/y$d;Ljava/util/List;)Ld7/w;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld7/y$d;",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/a;",
            ">;)",
            "Ld7/w;"
        }
    .end annotation

    invoke-static {}, Ld7/w;->j0()Ld7/w$c;

    move-result-object v0

    invoke-virtual {p1}, Ld7/y$d;->j0()Ld7/x;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/w$c;->I(Ld7/x;)Ld7/w$c;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/firestore/a;

    invoke-static {}, Ld7/w$b;->h0()Ld7/w$b$b;

    move-result-object v2

    invoke-static {}, Ld7/x$g;->i0()Ld7/x$g$a;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/firebase/firestore/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ld7/x$g$a;->H(Ljava/lang/String;)Ld7/x$g$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v3

    check-cast v3, Ld7/x$g;

    instance-of v3, v1, Lcom/google/firebase/firestore/a$b;

    if-eqz v3, :cond_0

    invoke-static {}, Ld7/w$b$c;->f0()Ld7/w$b$c;

    move-result-object v3

    invoke-virtual {v2, v3}, Ld7/w$b$b;->I(Ld7/w$b$c;)Ld7/w$b$b;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ld7/w$b$b;->H(Ljava/lang/String;)Ld7/w$b$b;

    invoke-virtual {v2}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v1

    check-cast v1, Ld7/w$b;

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unsupported aggregation"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, p1}, Ld7/w$c;->H(Ljava/lang/Iterable;)Ld7/w$c;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/w;

    return-object p1
.end method

.method public V(Ll6/h4;)Ld7/y;
    .locals 3

    invoke-static {}, Ld7/y;->k0()Ld7/y$b;

    move-result-object v0

    invoke-virtual {p1}, Ll6/h4;->f()Lj6/g1;

    move-result-object v1

    invoke-virtual {v1}, Lj6/g1;->s()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lp6/l0;->F(Lj6/g1;)Ld7/y$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/y$b;->H(Ld7/y$c;)Ld7/y$b;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lp6/l0;->S(Lj6/g1;)Ld7/y$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/y$b;->I(Ld7/y$d;)Ld7/y$b;

    :goto_0
    invoke-virtual {p1}, Ll6/h4;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Ld7/y$b;->L(I)Ld7/y$b;

    invoke-virtual {p1}, Ll6/h4;->c()Lcom/google/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/i;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ll6/h4;->e()Lm6/w;

    move-result-object v1

    sget-object v2, Lm6/w;->k:Lm6/w;

    invoke-virtual {v1, v2}, Lm6/w;->b(Lm6/w;)I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, Ll6/h4;->e()Lm6/w;

    move-result-object p1

    invoke-virtual {p1}, Lm6/w;->g()Lw5/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->W(Lw5/q;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/y$b;->J(Lcom/google/protobuf/t1;)Ld7/y$b;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ll6/h4;->c()Lcom/google/protobuf/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/y$b;->K(Lcom/google/protobuf/i;)Ld7/y$b;

    :goto_1
    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/y;

    return-object p1
.end method

.method public W(Lw5/q;)Lcom/google/protobuf/t1;
    .locals 3

    invoke-static {}, Lcom/google/protobuf/t1;->k0()Lcom/google/protobuf/t1$b;

    move-result-object v0

    invoke-virtual {p1}, Lw5/q;->l()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/t1$b;->I(J)Lcom/google/protobuf/t1$b;

    invoke-virtual {p1}, Lw5/q;->k()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/t1$b;->H(I)Lcom/google/protobuf/t1$b;

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/t1;

    return-object p1
.end method

.method X(Lj6/q;)Ld7/x$h;
    .locals 3

    invoke-virtual {p1}, Lj6/q;->h()Lj6/q$b;

    move-result-object v0

    sget-object v1, Lj6/q$b;->m:Lj6/q$b;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lj6/q;->h()Lj6/q$b;

    move-result-object v0

    sget-object v2, Lj6/q$b;->n:Lj6/q$b;

    if-ne v0, v2, :cond_4

    :cond_0
    invoke-static {}, Ld7/x$k;->k0()Ld7/x$k$a;

    move-result-object v0

    invoke-virtual {p1}, Lj6/q;->g()Lm6/r;

    move-result-object v2

    invoke-direct {p0, v2}, Lp6/l0;->H(Lm6/r;)Ld7/x$g;

    move-result-object v2

    invoke-virtual {v0, v2}, Ld7/x$k$a;->H(Ld7/x$g;)Ld7/x$k$a;

    invoke-virtual {p1}, Lj6/q;->i()Ld7/b0;

    move-result-object v2

    invoke-static {v2}, Lm6/y;->y(Ld7/b0;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lj6/q;->h()Lj6/q$b;

    move-result-object p1

    if-ne p1, v1, :cond_1

    sget-object p1, Ld7/x$k$b;->l:Ld7/x$k$b;

    goto :goto_0

    :cond_1
    sget-object p1, Ld7/x$k$b;->n:Ld7/x$k$b;

    :goto_0
    invoke-virtual {v0, p1}, Ld7/x$k$a;->I(Ld7/x$k$b;)Ld7/x$k$a;

    invoke-static {}, Ld7/x$h;->n0()Ld7/x$h$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Ld7/x$h$a;->J(Ld7/x$k$a;)Ld7/x$h$a;

    move-result-object p1

    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/x$h;

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lj6/q;->i()Ld7/b0;

    move-result-object v2

    invoke-static {v2}, Lm6/y;->z(Ld7/b0;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lj6/q;->h()Lj6/q$b;

    move-result-object p1

    if-ne p1, v1, :cond_3

    sget-object p1, Ld7/x$k$b;->m:Ld7/x$k$b;

    goto :goto_0

    :cond_3
    sget-object p1, Ld7/x$k$b;->o:Ld7/x$k$b;

    goto :goto_0

    :cond_4
    invoke-static {}, Ld7/x$f;->m0()Ld7/x$f$a;

    move-result-object v0

    invoke-virtual {p1}, Lj6/q;->g()Lm6/r;

    move-result-object v1

    invoke-direct {p0, v1}, Lp6/l0;->H(Lm6/r;)Ld7/x$g;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/x$f$a;->H(Ld7/x$g;)Ld7/x$f$a;

    invoke-virtual {p1}, Lj6/q;->h()Lj6/q$b;

    move-result-object v1

    invoke-direct {p0, v1}, Lp6/l0;->G(Lj6/q$b;)Ld7/x$f$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld7/x$f$a;->I(Ld7/x$f$b;)Ld7/x$f$a;

    invoke-virtual {p1}, Lj6/q;->i()Ld7/b0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld7/x$f$a;->J(Ld7/b0;)Ld7/x$f$a;

    invoke-static {}, Ld7/x$h;->n0()Ld7/x$h$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Ld7/x$h$a;->I(Ld7/x$f$a;)Ld7/x$h$a;

    move-result-object p1

    goto :goto_1
.end method

.method public Y(Lm6/w;)Lcom/google/protobuf/t1;
    .locals 0

    invoke-virtual {p1}, Lm6/w;->g()Lw5/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->W(Lw5/q;)Lcom/google/protobuf/t1;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp6/l0;->b:Ljava/lang/String;

    return-object v0
.end method

.method b(Ld7/x$d;)Lj6/l;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ld7/x$d;->k0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld7/x$h;

    invoke-virtual {p0, v2}, Lp6/l0;->i(Ld7/x$h;)Lj6/r;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lj6/l;

    invoke-virtual {p1}, Ld7/x$d;->l0()Ld7/x$d$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->c(Ld7/x$d$b;)Lj6/l$a;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lj6/l;-><init>(Ljava/util/List;Lj6/l$a;)V

    return-object v1
.end method

.method c(Ld7/x$d$b;)Lj6/l$a;
    .locals 1

    sget-object v0, Lp6/l0$a;->f:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lj6/l$a;->l:Lj6/l$a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Only AND and OR composite filter types are supported."

    invoke-static {v0, p1}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, Lj6/l$a;->k:Lj6/l$a;

    return-object p1
.end method

.method public c0(Lm6/u;)Z
    .locals 3

    invoke-static {p1}, Lp6/l0;->d0(Lm6/u;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lp6/l0;->a:Lm6/f;

    invoke-virtual {v2}, Lm6/f;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lp6/l0;->a:Lm6/f;

    invoke-virtual {v0}, Lm6/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public e(Ld7/y$c;)Lj6/g1;
    .locals 4

    invoke-virtual {p1}, Ld7/y$c;->k0()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v1

    const-string v0, "DocumentsTarget contained other than 1 document %d"

    invoke-static {v3, v0, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Ld7/y$c;->j0(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/l0;->s(Ljava/lang/String;)Lm6/u;

    move-result-object p1

    invoke-static {p1}, Lj6/b1;->b(Lm6/u;)Lj6/b1;

    move-result-object p1

    invoke-virtual {p1}, Lj6/b1;->D()Lj6/g1;

    move-result-object p1

    return-object p1
.end method

.method f(Ld7/x$f;)Lj6/q;
    .locals 2

    invoke-virtual {p1}, Ld7/x$f;->j0()Ld7/x$g;

    move-result-object v0

    invoke-virtual {v0}, Ld7/x$g;->h0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm6/r;->v(Ljava/lang/String;)Lm6/r;

    move-result-object v0

    invoke-virtual {p1}, Ld7/x$f;->k0()Ld7/x$f$b;

    move-result-object v1

    invoke-direct {p0, v1}, Lp6/l0;->g(Ld7/x$f$b;)Lj6/q$b;

    move-result-object v1

    invoke-virtual {p1}, Ld7/x$f;->l0()Ld7/b0;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lj6/q;->f(Lm6/r;Lj6/q$b;Ld7/b0;)Lj6/q;

    move-result-object p1

    return-object p1
.end method

.method i(Ld7/x$h;)Lj6/r;
    .locals 3

    sget-object v0, Lp6/l0$a;->g:[I

    invoke-virtual {p1}, Ld7/x$h;->l0()Ld7/x$h$b;

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

    invoke-virtual {p1}, Ld7/x$h;->m0()Ld7/x$k;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/l0;->x(Ld7/x$k;)Lj6/r;

    move-result-object p1

    return-object p1

    :cond_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ld7/x$h;->l0()Ld7/x$h$b;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unrecognized Filter.filterType %d"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Ld7/x$h;->k0()Ld7/x$f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->f(Ld7/x$f;)Lj6/q;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ld7/x$h;->i0()Ld7/x$d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->b(Ld7/x$d;)Lj6/l;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;)Lm6/l;
    .locals 4

    invoke-direct {p0, p1}, Lp6/l0;->v(Ljava/lang/String;)Lm6/u;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lp6/l0;->a:Lm6/f;

    invoke-virtual {v1}, Lm6/f;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Tried to deserialize key from different project."

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lm6/e;->n(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lp6/l0;->a:Lm6/f;

    invoke-virtual {v2}, Lm6/f;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Tried to deserialize key from different database."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lp6/l0;->a0(Lm6/u;)Lm6/u;

    move-result-object p1

    invoke-static {p1}, Lm6/l;->l(Lm6/u;)Lm6/l;

    move-result-object p1

    return-object p1
.end method

.method public m(Ld7/e;)Lm6/s;
    .locals 3

    invoke-virtual {p1}, Ld7/e;->j0()Ld7/e$c;

    move-result-object v0

    sget-object v1, Ld7/e$c;->k:Ld7/e$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lp6/l0;->k(Ld7/e;)Lm6/s;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ld7/e;->j0()Ld7/e$c;

    move-result-object v0

    sget-object v1, Ld7/e$c;->l:Ld7/e$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lp6/l0;->n(Ld7/e;)Lm6/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown result case: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ld7/e;->j0()Ld7/e$c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o(Ld7/c0;)Ln6/f;
    .locals 7

    invoke-virtual {p1}, Ld7/c0;->v0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ld7/c0;->n0()Ld7/t;

    move-result-object v0

    invoke-direct {p0, v0}, Lp6/l0;->r(Ld7/t;)Ln6/m;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ln6/m;->c:Ln6/m;

    :goto_0
    move-object v5, v0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ld7/c0;->t0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld7/n$c;

    invoke-direct {p0, v1}, Lp6/l0;->h(Ld7/n$c;)Ln6/e;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v0, Lp6/l0$a;->a:[I

    invoke-virtual {p1}, Ld7/c0;->p0()Ld7/c0$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    new-instance v0, Ln6/q;

    invoke-virtual {p1}, Ld7/c0;->u0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object p1

    invoke-direct {v0, p1, v5}, Ln6/q;-><init>(Lm6/l;Ln6/m;)V

    return-object v0

    :cond_2
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ld7/c0;->p0()Ld7/c0$c;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Unknown mutation operation: %d"

    invoke-static {p1, v0}, Lq6/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_3
    new-instance v0, Ln6/c;

    invoke-virtual {p1}, Ld7/c0;->o0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object p1

    invoke-direct {v0, p1, v5}, Ln6/c;-><init>(Lm6/l;Ln6/m;)V

    return-object v0

    :cond_4
    invoke-virtual {p1}, Ld7/c0;->y0()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ln6/l;

    invoke-virtual {p1}, Ld7/c0;->r0()Ld7/i;

    move-result-object v1

    invoke-virtual {v1}, Ld7/i;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v2

    invoke-virtual {p1}, Ld7/c0;->r0()Ld7/i;

    move-result-object v1

    invoke-virtual {v1}, Ld7/i;->j0()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lm6/t;->i(Ljava/util/Map;)Lm6/t;

    move-result-object v3

    invoke-virtual {p1}, Ld7/c0;->s0()Ld7/l;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/l0;->d(Ld7/l;)Ln6/d;

    move-result-object v4

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ln6/l;-><init>(Lm6/l;Lm6/t;Ln6/d;Ln6/m;Ljava/util/List;)V

    return-object v0

    :cond_5
    new-instance v0, Ln6/o;

    invoke-virtual {p1}, Ld7/c0;->r0()Ld7/i;

    move-result-object v1

    invoke-virtual {v1}, Ld7/i;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lp6/l0;->l(Ljava/lang/String;)Lm6/l;

    move-result-object v1

    invoke-virtual {p1}, Ld7/c0;->r0()Ld7/i;

    move-result-object p1

    invoke-virtual {p1}, Ld7/i;->j0()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lm6/t;->i(Ljava/util/Map;)Lm6/t;

    move-result-object p1

    invoke-direct {v0, v1, p1, v5, v6}, Ln6/o;-><init>(Lm6/l;Lm6/t;Ln6/m;Ljava/util/List;)V

    return-object v0
.end method

.method public p(Ld7/f0;Lm6/w;)Ln6/i;
    .locals 4

    invoke-virtual {p1}, Ld7/f0;->h0()Lcom/google/protobuf/t1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object v0

    sget-object v1, Lm6/w;->k:Lm6/w;

    invoke-virtual {v1, v0}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    invoke-virtual {p1}, Ld7/f0;->g0()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    invoke-virtual {p1, v2}, Ld7/f0;->f0(I)Ld7/b0;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Ln6/i;

    invoke-direct {p1, p2, v1}, Ln6/i;-><init>(Lm6/w;Ljava/util/List;)V

    return-object p1
.end method

.method public t(Ld7/y$d;)Lj6/g1;
    .locals 1

    invoke-virtual {p1}, Ld7/y$d;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ld7/y$d;->j0()Ld7/x;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lp6/l0;->u(Ljava/lang/String;Ld7/x;)Lj6/g1;

    move-result-object p1

    return-object p1
.end method

.method public u(Ljava/lang/String;Ld7/x;)Lj6/g1;
    .locals 13

    invoke-direct {p0, p1}, Lp6/l0;->s(Ljava/lang/String;)Lm6/u;

    move-result-object p1

    invoke-virtual {p2}, Ld7/x;->s0()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v0, :cond_2

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v4, v2, [Ljava/lang/Object;

    const-string v5, "StructuredQuery.from with more than one collection is not supported."

    invoke-static {v0, v5, v4}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2, v2}, Ld7/x;->r0(I)Ld7/x$c;

    move-result-object v0

    invoke-virtual {v0}, Ld7/x$c;->h0()Z

    move-result v4

    invoke-virtual {v0}, Ld7/x$c;->i0()Ljava/lang/String;

    move-result-object v0

    if-eqz v4, :cond_1

    move-object v5, p1

    move-object v6, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Lm6/e;->b(Ljava/lang/String;)Lm6/e;

    move-result-object p1

    check-cast p1, Lm6/u;

    :cond_2
    move-object v5, p1

    move-object v6, v1

    :goto_1
    invoke-virtual {p2}, Ld7/x;->B0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Ld7/x;->x0()Ld7/x$h;

    move-result-object p1

    invoke-direct {p0, p1}, Lp6/l0;->j(Ld7/x$h;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_2
    move-object v7, p1

    invoke-virtual {p2}, Ld7/x;->v0()I

    move-result p1

    if-lez p1, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_3
    if-ge v2, p1, :cond_4

    invoke-virtual {p2, v2}, Ld7/x;->u0(I)Ld7/x$i;

    move-result-object v4

    invoke-direct {p0, v4}, Lp6/l0;->q(Ld7/x$i;)Lj6/a1;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    move-object v8, v0

    goto :goto_4

    :cond_5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    move-object v8, p1

    :goto_4
    const-wide/16 v9, -0x1

    invoke-virtual {p2}, Ld7/x;->z0()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p2}, Ld7/x;->t0()Lcom/google/protobuf/a0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0;->h0()I

    move-result p1

    int-to-long v9, p1

    :cond_6
    invoke-virtual {p2}, Ld7/x;->A0()Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lj6/i;

    invoke-virtual {p2}, Ld7/x;->w0()Ld7/h;

    move-result-object v0

    invoke-virtual {v0}, Ld7/h;->o()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Ld7/x;->w0()Ld7/h;

    move-result-object v2

    invoke-virtual {v2}, Ld7/h;->j0()Z

    move-result v2

    invoke-direct {p1, v0, v2}, Lj6/i;-><init>(Ljava/util/List;Z)V

    move-object v11, p1

    goto :goto_5

    :cond_7
    move-object v11, v1

    :goto_5
    invoke-virtual {p2}, Ld7/x;->y0()Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance v1, Lj6/i;

    invoke-virtual {p2}, Ld7/x;->q0()Ld7/h;

    move-result-object p1

    invoke-virtual {p1}, Ld7/h;->o()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, Ld7/x;->q0()Ld7/h;

    move-result-object p2

    invoke-virtual {p2}, Ld7/h;->j0()Z

    move-result p2

    xor-int/2addr p2, v3

    invoke-direct {v1, p1, p2}, Lj6/i;-><init>(Ljava/util/List;Z)V

    :cond_8
    move-object v12, v1

    new-instance p1, Lj6/g1;

    move-object v4, p1

    invoke-direct/range {v4 .. v12}, Lj6/g1;-><init>(Lm6/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLj6/i;Lj6/i;)V

    return-object p1
.end method

.method public w(Lcom/google/protobuf/t1;)Lw5/q;
    .locals 3

    new-instance v0, Lw5/q;

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->j0()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->i0()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lw5/q;-><init>(JI)V

    return-object v0
.end method

.method public y(Lcom/google/protobuf/t1;)Lm6/w;
    .locals 5

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->j0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->i0()I

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lm6/w;->k:Lm6/w;

    return-object p1

    :cond_0
    new-instance v0, Lm6/w;

    invoke-virtual {p0, p1}, Lp6/l0;->w(Lcom/google/protobuf/t1;)Lw5/q;

    move-result-object p1

    invoke-direct {v0, p1}, Lm6/w;-><init>(Lw5/q;)V

    return-object v0
.end method

.method public z(Ld7/r;)Lm6/w;
    .locals 2

    invoke-virtual {p1}, Ld7/r;->k0()Ld7/r$c;

    move-result-object v0

    sget-object v1, Ld7/r$c;->k:Ld7/r$c;

    if-eq v0, v1, :cond_0

    sget-object p1, Lm6/w;->k:Lm6/w;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ld7/r;->l0()Ld7/z;

    move-result-object v0

    invoke-virtual {v0}, Ld7/z;->k0()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lm6/w;->k:Lm6/w;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ld7/r;->l0()Ld7/z;

    move-result-object p1

    invoke-virtual {p1}, Ld7/z;->h0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp6/l0;->y(Lcom/google/protobuf/t1;)Lm6/w;

    move-result-object p1

    return-object p1
.end method
