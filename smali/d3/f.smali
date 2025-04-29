.class public final Ld3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/f$b;
    }
.end annotation


# instance fields
.field private final a:Ld3/c;

.field private final b:Ld3/l;

.field private final c:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ld3/m;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld3/c;

    invoke-direct {v0}, Ld3/c;-><init>()V

    iput-object v0, p0, Ld3/f;->a:Ld3/c;

    new-instance v0, Ld3/l;

    invoke-direct {v0}, Ld3/l;-><init>()V

    iput-object v0, p0, Ld3/f;->b:Ld3/l;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ld3/f;->c:Ljava/util/Deque;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Ld3/f;->c:Ljava/util/Deque;

    new-instance v3, Ld3/f$a;

    invoke-direct {v3, p0}, Ld3/f$a;-><init>(Ld3/f;)V

    invoke-interface {v2, v3}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Ld3/f;->d:I

    return-void
.end method

.method static synthetic f(Ld3/f;Ld3/m;)V
    .locals 0

    invoke-direct {p0, p1}, Ld3/f;->j(Ld3/m;)V

    return-void
.end method

.method private j(Ld3/m;)V
    .locals 3

    iget-object v0, p0, Ld3/f;->c:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Ld3/f;->c:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp3/a;->a(Z)V

    invoke-virtual {p1}, Ld3/m;->l()V

    iget-object v0, p0, Ld3/f;->c:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld3/f;->e:Z

    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ld3/l;

    invoke-virtual {p0, p1}, Ld3/f;->i(Ld3/l;)V

    return-void
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld3/f;->h()Ld3/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld3/f;->g()Ld3/l;

    move-result-object v0

    return-object v0
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, Ld3/f;->e:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Ld3/f;->b:Ld3/l;

    invoke-virtual {v0}, Lv1/g;->l()V

    const/4 v0, 0x0

    iput v0, p0, Ld3/f;->d:I

    return-void
.end method

.method public g()Ld3/l;
    .locals 2

    iget-boolean v0, p0, Ld3/f;->e:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget v0, p0, Ld3/f;->d:I

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iput v1, p0, Ld3/f;->d:I

    iget-object v0, p0, Ld3/f;->b:Ld3/l;

    return-object v0
.end method

.method public h()Ld3/m;
    .locals 7

    iget-boolean v0, p0, Ld3/f;->e:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget v0, p0, Ld3/f;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ld3/f;->c:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ld3/f;->c:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/m;

    iget-object v1, p0, Ld3/f;->b:Ld3/l;

    invoke-virtual {v1}, Lv1/a;->r()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lv1/a;->k(I)V

    goto :goto_0

    :cond_1
    new-instance v4, Ld3/f$b;

    iget-object v1, p0, Ld3/f;->b:Ld3/l;

    iget-wide v2, v1, Lv1/g;->n:J

    iget-object v5, p0, Ld3/f;->a:Ld3/c;

    iget-object v1, v1, Lv1/g;->l:Ljava/nio/ByteBuffer;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v5, v1}, Ld3/c;->a([B)Lcom/google/common/collect/q;

    move-result-object v1

    invoke-direct {v4, v2, v3, v1}, Ld3/f$b;-><init>(JLcom/google/common/collect/q;)V

    iget-object v1, p0, Ld3/f;->b:Ld3/l;

    iget-wide v2, v1, Lv1/g;->n:J

    const-wide/16 v5, 0x0

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Ld3/m;->x(JLd3/h;J)V

    :goto_0
    iget-object v1, p0, Ld3/f;->b:Ld3/l;

    invoke-virtual {v1}, Lv1/g;->l()V

    const/4 v1, 0x0

    iput v1, p0, Ld3/f;->d:I

    return-object v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public i(Ld3/l;)V
    .locals 3

    iget-boolean v0, p0, Ld3/f;->e:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget v0, p0, Ld3/f;->d:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Ld3/f;->b:Ld3/l;

    if-ne v0, p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Lp3/a;->a(Z)V

    const/4 p1, 0x2

    iput p1, p0, Ld3/f;->d:I

    return-void
.end method
