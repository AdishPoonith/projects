.class final Ll6/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/b1;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln6/g;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ld6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/e<",
            "Ll6/e;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Lcom/google/protobuf/i;

.field private final e:Ll6/y0;

.field private final f:Ll6/t0;


# direct methods
.method constructor <init>(Ll6/y0;Lh6/j;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/w0;->e:Ll6/y0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    new-instance v0, Ld6/e;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    sget-object v2, Ll6/e;->c:Ljava/util/Comparator;

    invoke-direct {v0, v1, v2}, Ld6/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    iput-object v0, p0, Ll6/w0;->b:Ld6/e;

    const/4 v0, 0x1

    iput v0, p0, Ll6/w0;->c:I

    sget-object v0, Lp6/z0;->v:Lcom/google/protobuf/i;

    iput-object v0, p0, Ll6/w0;->d:Lcom/google/protobuf/i;

    invoke-virtual {p1, p2}, Ll6/y0;->p(Lh6/j;)Ll6/t0;

    move-result-object p1

    iput-object p1, p0, Ll6/w0;->f:Ll6/t0;

    return-void
.end method

.method private n(I)I
    .locals 2

    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/g;

    invoke-virtual {v0}, Ln6/g;->e()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method private o(ILjava/lang/String;)I
    .locals 3

    invoke-direct {p0, p1}, Ll6/w0;->n(I)I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    iget-object v2, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, v1

    const-string p2, "Batches must exist to be %s"

    invoke-static {v2, p2, v0}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return p1
.end method

.method private q(Ld6/e;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/e<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Ln6/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ld6/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Ll6/w0;->g(I)Ln6/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll6/w0;->b:Ld6/e;

    invoke-virtual {v0}, Ld6/e;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Document leak -- detected dangling mutation references when queue is empty."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(I)Ln6/g;
    .locals 1

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Ll6/w0;->n(I)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_1

    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln6/g;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Ll6/w0;->c:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method public d(Ln6/g;)V
    .locals 5

    invoke-virtual {p1}, Ln6/g;->e()I

    move-result v0

    const-string v1, "removed"

    invoke-direct {p0, v0, v1}, Ll6/w0;->o(ILjava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Can only remove the first entry of the mutation queue"

    invoke-static {v0, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget-object v0, p0, Ll6/w0;->b:Ld6/e;

    invoke-virtual {p1}, Ln6/g;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/f;

    invoke-virtual {v2}, Ln6/f;->g()Lm6/l;

    move-result-object v2

    iget-object v3, p0, Ll6/w0;->e:Ll6/y0;

    invoke-virtual {v3}, Ll6/y0;->f()Ll6/i1;

    move-result-object v3

    invoke-interface {v3, v2}, Ll6/i1;->m(Lm6/l;)V

    new-instance v3, Ll6/e;

    invoke-virtual {p1}, Ln6/g;->e()I

    move-result v4

    invoke-direct {v3, v2, v4}, Ll6/e;-><init>(Lm6/l;I)V

    invoke-virtual {v0, v3}, Ld6/e;->m(Ljava/lang/Object;)Ld6/e;

    move-result-object v0

    goto :goto_1

    :cond_1
    iput-object v0, p0, Ll6/w0;->b:Ld6/e;

    return-void
.end method

.method public e(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lm6/l;",
            ">;)",
            "Ljava/util/List<",
            "Ln6/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld6/e;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lq6/g0;->g()Ljava/util/Comparator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ld6/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/l;

    new-instance v2, Ll6/e;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Ll6/e;-><init>(Lm6/l;I)V

    iget-object v3, p0, Ll6/w0;->b:Ld6/e;

    invoke-virtual {v3, v2}, Ld6/e;->l(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll6/e;

    invoke-virtual {v3}, Ll6/e;->d()Lm6/l;

    move-result-object v4

    invoke-virtual {v1, v4}, Lm6/l;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ll6/e;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ld6/e;->k(Ljava/lang/Object;)Ld6/e;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-direct {p0, v0}, Ll6/w0;->q(Ld6/e;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public f(Ln6/g;Lcom/google/protobuf/i;)V
    .locals 6

    invoke-virtual {p1}, Ln6/g;->e()I

    move-result p1

    const-string v0, "acknowledged"

    invoke-direct {p0, p1, v0}, Ll6/w0;->o(ILjava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-array v4, v2, [Ljava/lang/Object;

    const-string v5, "Can only acknowledge the first batch in the mutation queue"

    invoke-static {v3, v5, v4}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/g;

    invoke-virtual {v0}, Ln6/g;->e()I

    move-result v3

    if-ne p1, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-virtual {v0}, Ln6/g;->e()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v1

    const-string p1, "Queue ordering failure: expected batch %d, got batch %d"

    invoke-static {v3, p1, v4}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p2}, Lq6/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/i;

    iput-object p1, p0, Ll6/w0;->d:Lcom/google/protobuf/i;

    return-void
.end method

.method public g(I)Ln6/g;
    .locals 3

    invoke-direct {p0, p1}, Ll6/w0;->n(I)I

    move-result v0

    if-ltz v0, :cond_2

    iget-object v1, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/g;

    invoke-virtual {v0}, Ln6/g;->e()I

    move-result v1

    const/4 v2, 0x0

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "If found batch must match"

    invoke-static {p1, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public h(Lw5/q;Ljava/util/List;Ljava/util/List;)Ln6/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/q;",
            "Ljava/util/List<",
            "Ln6/f;",
            ">;",
            "Ljava/util/List<",
            "Ln6/f;",
            ">;)",
            "Ln6/g;"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Mutation batches should not be empty"

    invoke-static {v0, v4, v3}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget v0, p0, Ll6/w0;->c:I

    add-int/lit8 v3, v0, 0x1

    iput v3, p0, Ll6/w0;->c:I

    iget-object v3, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_1

    iget-object v4, p0, Ll6/w0;->a:Ljava/util/List;

    sub-int/2addr v3, v1

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/g;

    invoke-virtual {v3}, Ln6/g;->e()I

    move-result v3

    if-ge v3, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Mutation batchIds must be monotonically increasing order"

    invoke-static {v1, v3, v2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    new-instance v1, Ln6/g;

    invoke-direct {v1, v0, p1, p2, p3}, Ln6/g;-><init>(ILw5/q;Ljava/util/List;Ljava/util/List;)V

    iget-object p1, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln6/f;

    iget-object p3, p0, Ll6/w0;->b:Ld6/e;

    new-instance v2, Ll6/e;

    invoke-virtual {p2}, Ln6/f;->g()Lm6/l;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ll6/e;-><init>(Lm6/l;I)V

    invoke-virtual {p3, v2}, Ld6/e;->k(Ljava/lang/Object;)Ld6/e;

    move-result-object p3

    iput-object p3, p0, Ll6/w0;->b:Ld6/e;

    iget-object p3, p0, Ll6/w0;->f:Ll6/t0;

    invoke-virtual {p2}, Ln6/f;->g()Lm6/l;

    move-result-object p2

    invoke-virtual {p2}, Lm6/l;->p()Lm6/u;

    move-result-object p2

    invoke-virtual {p3, p2}, Ll6/t0;->g(Lm6/u;)V

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public i()Lcom/google/protobuf/i;
    .locals 1

    iget-object v0, p0, Ll6/w0;->d:Lcom/google/protobuf/i;

    return-object v0
.end method

.method public j(Lcom/google/protobuf/i;)V
    .locals 0

    invoke-static {p1}, Lq6/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/i;

    iput-object p1, p0, Ll6/w0;->d:Lcom/google/protobuf/i;

    return-void
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln6/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method l(Lm6/l;)Z
    .locals 3

    new-instance v0, Ll6/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll6/e;-><init>(Lm6/l;I)V

    iget-object v2, p0, Ll6/w0;->b:Ld6/e;

    invoke-virtual {v2, v0}, Ld6/e;->l(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll6/e;

    invoke-virtual {v0}, Ll6/e;->d()Lm6/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm6/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method m(Ll6/o;)J
    .locals 5

    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/g;

    invoke-virtual {p1, v3}, Ll6/o;->o(Ln6/g;)Lo6/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/protobuf/z;->a()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Ll6/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public start()V
    .locals 1

    invoke-virtual {p0}, Ll6/w0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Ll6/w0;->c:I

    :cond_0
    return-void
.end method
