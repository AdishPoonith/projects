.class final Lcom/google/crypto/tink/shaded/protobuf/s;
.super Lcom/google/crypto/tink/shaded/protobuf/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/r<",
        "Lcom/google/crypto/tink/shaded/protobuf/z$d;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/r;-><init>()V

    return-void
.end method


# virtual methods
.method a(Ljava/util/Map$Entry;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "**>;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result p1

    return p1
.end method

.method b(Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/s0;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/q;->a(Lcom/google/crypto/tink/shaded/protobuf/s0;I)Lcom/google/crypto/tink/shaded/protobuf/z$e;

    move-result-object p1

    return-object p1
.end method

.method c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/crypto/tink/shaded/protobuf/v<",
            "Lcom/google/crypto/tink/shaded/protobuf/z$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/z$c;

    iget-object p1, p1, Lcom/google/crypto/tink/shaded/protobuf/z$c;->extensions:Lcom/google/crypto/tink/shaded/protobuf/v;

    return-object p1
.end method

.method d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/crypto/tink/shaded/protobuf/v<",
            "Lcom/google/crypto/tink/shaded/protobuf/z$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/z$c;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$c;->N()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object p1

    return-object p1
.end method

.method e(Lcom/google/crypto/tink/shaded/protobuf/s0;)Z
    .locals 0

    instance-of p1, p1, Lcom/google/crypto/tink/shaded/protobuf/z$c;

    return p1
.end method

.method f(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/s;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/v;->s()V

    return-void
.end method

.method g(Lcom/google/crypto/tink/shaded/protobuf/g1;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/v;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/o1;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/q;",
            "Lcom/google/crypto/tink/shaded/protobuf/v<",
            "Lcom/google/crypto/tink/shaded/protobuf/z$d;",
            ">;TUB;",
            "Lcom/google/crypto/tink/shaded/protobuf/o1<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->c()I

    move-result v0

    iget-object v1, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p3, Lcom/google/crypto/tink/shaded/protobuf/s$a;->a:[I

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->a()Lcom/google/crypto/tink/shaded/protobuf/u1$b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p3, p3, v1

    packed-switch p3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Type cannot be packed: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->d()Lcom/google/crypto/tink/shaded/protobuf/u1$b;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->I(Ljava/util/List;)V

    iget-object p1, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->g()Lcom/google/crypto/tink/shaded/protobuf/b0$d;

    move-result-object p1

    invoke-static {v0, p3, p1, p5, p6}, Lcom/google/crypto/tink/shaded/protobuf/j1;->z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/b0$d;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/o1;)Ljava/lang/Object;

    move-result-object p5

    goto/16 :goto_0

    :pswitch_1
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->i(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->a(Ljava/util/List;)V

    goto :goto_0

    :pswitch_3
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->D(Ljava/util/List;)V

    goto :goto_0

    :pswitch_4
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->g(Ljava/util/List;)V

    goto :goto_0

    :pswitch_5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->k(Ljava/util/List;)V

    goto :goto_0

    :pswitch_6
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->l(Ljava/util/List;)V

    goto :goto_0

    :pswitch_7
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->e(Ljava/util/List;)V

    goto :goto_0

    :pswitch_8
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->G(Ljava/util/List;)V

    goto :goto_0

    :pswitch_9
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->H(Ljava/util/List;)V

    goto :goto_0

    :pswitch_a
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->s(Ljava/util/List;)V

    goto :goto_0

    :pswitch_b
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->C(Ljava/util/List;)V

    goto :goto_0

    :pswitch_c
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->v(Ljava/util/List;)V

    goto :goto_0

    :pswitch_d
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->B(Ljava/util/List;)V

    :goto_0
    iget-object p1, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p4, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/v;->w(Lcom/google/crypto/tink/shaded/protobuf/v$b;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->a()Lcom/google/crypto/tink/shaded/protobuf/u1$b;

    move-result-object v2

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/u1$b;->y:Lcom/google/crypto/tink/shaded/protobuf/u1$b;

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->x()I

    move-result p1

    iget-object p3, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->g()Lcom/google/crypto/tink/shaded/protobuf/b0$d;

    move-result-object p3

    invoke-interface {p3, p1}, Lcom/google/crypto/tink/shaded/protobuf/b0$d;->a(I)Lcom/google/crypto/tink/shaded/protobuf/b0$c;

    move-result-object p3

    if-nez p3, :cond_2

    invoke-static {v0, p1, p5, p6}, Lcom/google/crypto/tink/shaded/protobuf/j1;->L(IILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/o1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p6, Lcom/google/crypto/tink/shaded/protobuf/s$a;->a:[I

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->a()Lcom/google/crypto/tink/shaded/protobuf/u1$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p6, p6, v0

    packed-switch p6, :pswitch_data_1

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    invoke-interface {p1, p6, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->N(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q;)Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    invoke-interface {p1, p6, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->L(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q;)Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_3

    :pswitch_10
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->m()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :pswitch_11
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->u()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    goto :goto_3

    :pswitch_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Shouldn\'t reach here."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_13
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->j()J

    move-result-wide v0

    goto :goto_2

    :pswitch_14
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->h()I

    move-result p1

    goto :goto_1

    :pswitch_15
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->r()J

    move-result-wide v0

    goto :goto_2

    :pswitch_16
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->z()I

    move-result p1

    goto :goto_1

    :pswitch_17
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->w()I

    move-result p1

    goto :goto_1

    :pswitch_18
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->o()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_3

    :pswitch_19
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->n()I

    move-result p1

    goto :goto_1

    :pswitch_1a
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->f()J

    move-result-wide v0

    goto :goto_2

    :pswitch_1b
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->x()I

    move-result p1

    :cond_2
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_3

    :pswitch_1c
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->d()J

    move-result-wide v0

    goto :goto_2

    :pswitch_1d
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->E()J

    move-result-wide v0

    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_3

    :pswitch_1e
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto :goto_3

    :pswitch_1f
    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->readDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :goto_3
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p4, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->a(Lcom/google/crypto/tink/shaded/protobuf/v$b;Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/s$a;->a:[I

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->a()Lcom/google/crypto/tink/shaded/protobuf/u1$b;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p1, p1, p3

    const/16 p3, 0x11

    if-eq p1, p3, :cond_4

    const/16 p3, 0x12

    if-eq p1, p3, :cond_4

    goto :goto_4

    :cond_4
    iget-object p1, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p4, p1}, Lcom/google/crypto/tink/shaded/protobuf/v;->i(Lcom/google/crypto/tink/shaded/protobuf/v$b;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_5
    :goto_4
    iget-object p1, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p4, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->w(Lcom/google/crypto/tink/shaded/protobuf/v$b;Ljava/lang/Object;)V

    :goto_5
    return-object p5

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch
.end method

.method h(Lcom/google/crypto/tink/shaded/protobuf/g1;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/v;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/q;",
            "Lcom/google/crypto/tink/shaded/protobuf/v<",
            "Lcom/google/crypto/tink/shaded/protobuf/z$d;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1, v0, p3}, Lcom/google/crypto/tink/shaded/protobuf/g1;->N(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/q;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p4, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/v;->w(Lcom/google/crypto/tink/shaded/protobuf/v$b;Ljava/lang/Object;)V

    return-void
.end method

.method i(Lcom/google/crypto/tink/shaded/protobuf/i;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/q;Lcom/google/crypto/tink/shaded/protobuf/v;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/i;",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/q;",
            "Lcom/google/crypto/tink/shaded/protobuf/v<",
            "Lcom/google/crypto/tink/shaded/protobuf/z$d;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->g()Lcom/google/crypto/tink/shaded/protobuf/s0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/s0$a;->e()Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->A()[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/f;->Q(Ljava/nio/ByteBuffer;Z)Lcom/google/crypto/tink/shaded/protobuf/f;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v1

    invoke-virtual {v1, v0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/d1;->b(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;Lcom/google/crypto/tink/shaded/protobuf/q;)V

    iget-object p2, p2, Lcom/google/crypto/tink/shaded/protobuf/z$e;->b:Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {p4, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->w(Lcom/google/crypto/tink/shaded/protobuf/v$b;Ljava/lang/Object;)V

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/g1;->p()I

    move-result p1

    const p2, 0x7fffffff

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/c0;->b()Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p1

    throw p1
.end method

.method j(Lcom/google/crypto/tink/shaded/protobuf/v1;Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/crypto/tink/shaded/protobuf/v1;",
            "Ljava/util/Map$Entry<",
            "**>;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z$d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/s$a;->a:[I

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->d()Lcom/google/crypto/tink/shaded/protobuf/u1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v1

    invoke-static {v0, p2, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Lcom/google/crypto/tink/shaded/protobuf/h1;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v1

    invoke-static {v0, p2, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Lcom/google/crypto/tink/shaded/protobuf/h1;)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j1;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->b0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->N(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->e0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->W(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->T(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/v1;Z)V

    goto/16 :goto_0

    :cond_0
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/s$a;->a:[I

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->d()Lcom/google/crypto/tink/shaded/protobuf/u1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->L(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/h1;)V

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/d1;->d(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->O(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/h1;)V

    goto/16 :goto_0

    :pswitch_13
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->A(ILjava/lang/String;)V

    goto/16 :goto_0

    :pswitch_14
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->M(ILcom/google/crypto/tink/shaded/protobuf/i;)V

    goto/16 :goto_0

    :pswitch_15
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->w(IJ)V

    goto/16 :goto_0

    :pswitch_16
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->H(II)V

    goto/16 :goto_0

    :pswitch_17
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->n(IJ)V

    goto/16 :goto_0

    :pswitch_18
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->g(II)V

    goto/16 :goto_0

    :pswitch_19
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->e(II)V

    goto/16 :goto_0

    :pswitch_1a
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->d(IZ)V

    goto/16 :goto_0

    :pswitch_1b
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->l(II)V

    goto :goto_0

    :pswitch_1c
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->u(IJ)V

    goto :goto_0

    :pswitch_1d
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->i(II)V

    goto :goto_0

    :pswitch_1e
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->C(IJ)V

    goto :goto_0

    :pswitch_1f
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->c(IJ)V

    goto :goto_0

    :pswitch_20
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->x(IF)V

    goto :goto_0

    :pswitch_21
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/v1;->m(ID)V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_1d
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method
