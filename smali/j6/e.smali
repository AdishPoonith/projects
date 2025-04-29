.class public Lj6/e;
.super Lj6/q;
.source "SourceFile"


# direct methods
.method constructor <init>(Lm6/r;Ld7/b0;)V
    .locals 1

    sget-object v0, Lj6/q$b;->r:Lj6/q$b;

    invoke-direct {p0, p1, v0, p2}, Lj6/q;-><init>(Lm6/r;Lj6/q$b;Ld7/b0;)V

    invoke-static {p2}, Lm6/y;->t(Ld7/b0;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "ArrayContainsAnyFilter expects an ArrayValue"

    invoke-static {p1, v0, p2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public e(Lm6/i;)Z
    .locals 3

    invoke-virtual {p0}, Lj6/q;->g()Lm6/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lm6/i;->b(Lm6/r;)Ld7/b0;

    move-result-object p1

    invoke-static {p1}, Lm6/y;->t(Ld7/b0;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Ld7/b0;->q0()Ld7/b;

    move-result-object p1

    invoke-virtual {p1}, Ld7/b;->o()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld7/b0;

    invoke-virtual {p0}, Lj6/q;->i()Ld7/b0;

    move-result-object v2

    invoke-virtual {v2}, Ld7/b0;->q0()Ld7/b;

    move-result-object v2

    invoke-static {v2, v0}, Lm6/y;->p(Ld7/c;Ld7/b0;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method
