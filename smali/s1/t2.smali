.class final Ls1/t2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/t2$a;,
        Ls1/t2$b;,
        Ls1/t2$c;,
        Ls1/t2$d;
    }
.end annotation


# instance fields
.field private final a:Lt1/t1;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls1/t2$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lu2/r;",
            "Ls1/t2$c;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ls1/t2$c;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ls1/t2$d;

.field private final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ls1/t2$c;",
            "Ls1/t2$b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ls1/t2$c;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lt1/a;

.field private final i:Lp3/n;

.field private j:Lu2/p0;

.field private k:Z

.field private l:Lo3/p0;


# direct methods
.method public constructor <init>(Ls1/t2$d;Lt1/a;Lp3/n;Lt1/t1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ls1/t2;->a:Lt1/t1;

    iput-object p1, p0, Ls1/t2;->e:Ls1/t2$d;

    new-instance p1, Lu2/p0$a;

    const/4 p4, 0x0

    invoke-direct {p1, p4}, Lu2/p0$a;-><init>(I)V

    iput-object p1, p0, Ls1/t2;->j:Lu2/p0;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ls1/t2;->c:Ljava/util/IdentityHashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ls1/t2;->d:Ljava/util/Map;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ls1/t2;->b:Ljava/util/List;

    iput-object p2, p0, Ls1/t2;->h:Lt1/a;

    iput-object p3, p0, Ls1/t2;->i:Lp3/n;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ls1/t2;->f:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ls1/t2;->g:Ljava/util/Set;

    return-void
.end method

.method private B(II)V
    .locals 4

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    :goto_0
    if-lt p2, p1, :cond_1

    iget-object v1, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/t2$c;

    iget-object v2, p0, Ls1/t2;->d:Ljava/util/Map;

    iget-object v3, v1, Ls1/t2$c;->b:Ljava/lang/Object;

    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Ls1/t2$c;->a:Lu2/p;

    invoke-virtual {v2}, Lu2/p;->Z()Ls1/y3;

    move-result-object v2

    invoke-virtual {v2}, Ls1/y3;->t()I

    move-result v2

    neg-int v2, v2

    invoke-direct {p0, p2, v2}, Ls1/t2;->g(II)V

    iput-boolean v0, v1, Ls1/t2$c;->e:Z

    iget-boolean v2, p0, Ls1/t2;->k:Z

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Ls1/t2;->u(Ls1/t2$c;)V

    :cond_0
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic a(Ls1/t2;Lu2/u;Ls1/y3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/t2;->t(Lu2/u;Ls1/y3;)V

    return-void
.end method

.method static synthetic b(Ls1/t2;)Lp3/n;
    .locals 0

    iget-object p0, p0, Ls1/t2;->i:Lp3/n;

    return-object p0
.end method

.method static synthetic c(Ls1/t2$c;Lu2/u$b;)Lu2/u$b;
    .locals 0

    invoke-static {p0, p1}, Ls1/t2;->n(Ls1/t2$c;Lu2/u$b;)Lu2/u$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Ls1/t2$c;I)I
    .locals 0

    invoke-static {p0, p1}, Ls1/t2;->r(Ls1/t2$c;I)I

    move-result p0

    return p0
.end method

.method static synthetic e(Ls1/t2;)Lt1/a;
    .locals 0

    iget-object p0, p0, Ls1/t2;->h:Lt1/a;

    return-object p0
.end method

.method private g(II)V
    .locals 2

    :goto_0
    iget-object v0, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$c;

    iget v1, v0, Ls1/t2$c;->d:I

    add-int/2addr v1, p2

    iput v1, v0, Ls1/t2$c;->d:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private j(Ls1/t2$c;)V
    .locals 1

    iget-object v0, p0, Ls1/t2;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls1/t2$b;

    if-eqz p1, :cond_0

    iget-object v0, p1, Ls1/t2$b;->a:Lu2/u;

    iget-object p1, p1, Ls1/t2$b;->b:Lu2/u$c;

    invoke-interface {v0, p1}, Lu2/u;->k(Lu2/u$c;)V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 3

    iget-object v0, p0, Ls1/t2;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/t2$c;

    iget-object v2, v1, Ls1/t2$c;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Ls1/t2;->j(Ls1/t2$c;)V

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private l(Ls1/t2$c;)V
    .locals 1

    iget-object v0, p0, Ls1/t2;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls1/t2;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls1/t2$b;

    if-eqz p1, :cond_0

    iget-object v0, p1, Ls1/t2$b;->a:Lu2/u;

    iget-object p1, p1, Ls1/t2$b;->b:Lu2/u$c;

    invoke-interface {v0, p1}, Lu2/u;->d(Lu2/u$c;)V

    :cond_0
    return-void
.end method

.method private static m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Ls1/a;->z(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static n(Ls1/t2$c;Lu2/u$b;)Lu2/u$b;
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ls1/t2$c;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ls1/t2$c;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/u$b;

    iget-wide v1, v1, Lu2/s;->d:J

    iget-wide v3, p1, Lu2/s;->d:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    iget-object v0, p1, Lu2/s;->a:Ljava/lang/Object;

    invoke-static {p0, v0}, Ls1/t2;->p(Ls1/t2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lu2/u$b;->c(Ljava/lang/Object;)Lu2/u$b;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Ls1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static p(Ls1/t2$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ls1/t2$c;->b:Ljava/lang/Object;

    invoke-static {p0, p1}, Ls1/a;->C(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static r(Ls1/t2$c;I)I
    .locals 0

    iget p0, p0, Ls1/t2$c;->d:I

    add-int/2addr p1, p0

    return p1
.end method

.method private synthetic t(Lu2/u;Ls1/y3;)V
    .locals 0

    iget-object p1, p0, Ls1/t2;->e:Ls1/t2$d;

    invoke-interface {p1}, Ls1/t2$d;->c()V

    return-void
.end method

.method private u(Ls1/t2$c;)V
    .locals 3

    iget-boolean v0, p1, Ls1/t2$c;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ls1/t2$c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/t2;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$b;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$b;

    iget-object v1, v0, Ls1/t2$b;->a:Lu2/u;

    iget-object v2, v0, Ls1/t2$b;->b:Lu2/u$c;

    invoke-interface {v1, v2}, Lu2/u;->c(Lu2/u$c;)V

    iget-object v1, v0, Ls1/t2$b;->a:Lu2/u;

    iget-object v2, v0, Ls1/t2$b;->c:Ls1/t2$a;

    invoke-interface {v1, v2}, Lu2/u;->e(Lu2/b0;)V

    iget-object v1, v0, Ls1/t2$b;->a:Lu2/u;

    iget-object v0, v0, Ls1/t2$b;->c:Ls1/t2$a;

    invoke-interface {v1, v0}, Lu2/u;->q(Lw1/w;)V

    iget-object v0, p0, Ls1/t2;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private x(Ls1/t2$c;)V
    .locals 5

    iget-object v0, p1, Ls1/t2$c;->a:Lu2/p;

    new-instance v1, Ls1/g2;

    invoke-direct {v1, p0}, Ls1/g2;-><init>(Ls1/t2;)V

    new-instance v2, Ls1/t2$a;

    invoke-direct {v2, p0, p1}, Ls1/t2$a;-><init>(Ls1/t2;Ls1/t2$c;)V

    iget-object v3, p0, Ls1/t2;->f:Ljava/util/HashMap;

    new-instance v4, Ls1/t2$b;

    invoke-direct {v4, v0, v1, v2}, Ls1/t2$b;-><init>(Lu2/u;Lu2/u$c;Ls1/t2$a;)V

    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lp3/n0;->y()Landroid/os/Handler;

    move-result-object p1

    invoke-interface {v0, p1, v2}, Lu2/u;->l(Landroid/os/Handler;Lu2/b0;)V

    invoke-static {}, Lp3/n0;->y()Landroid/os/Handler;

    move-result-object p1

    invoke-interface {v0, p1, v2}, Lu2/u;->p(Landroid/os/Handler;Lw1/w;)V

    iget-object p1, p0, Ls1/t2;->l:Lo3/p0;

    iget-object v2, p0, Ls1/t2;->a:Lt1/t1;

    invoke-interface {v0, v1, p1, v2}, Lu2/u;->h(Lu2/u$c;Lo3/p0;Lt1/t1;)V

    return-void
.end method


# virtual methods
.method public A(IILu2/p0;)Ls1/y3;
    .locals 1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Ls1/t2;->q()I

    move-result v0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    iput-object p3, p0, Ls1/t2;->j:Lu2/p0;

    invoke-direct {p0, p1, p2}, Ls1/t2;->B(II)V

    invoke-virtual {p0}, Ls1/t2;->i()Ls1/y3;

    move-result-object p1

    return-object p1
.end method

.method public C(Ljava/util/List;Lu2/p0;)Ls1/y3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls1/t2$c;",
            ">;",
            "Lu2/p0;",
            ")",
            "Ls1/y3;"
        }
    .end annotation

    iget-object v0, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Ls1/t2;->B(II)V

    iget-object v0, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Ls1/t2;->f(ILjava/util/List;Lu2/p0;)Ls1/y3;

    move-result-object p1

    return-object p1
.end method

.method public D(Lu2/p0;)Ls1/y3;
    .locals 2

    invoke-virtual {p0}, Ls1/t2;->q()I

    move-result v0

    invoke-interface {p1}, Lu2/p0;->a()I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-interface {p1}, Lu2/p0;->h()Lu2/p0;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lu2/p0;->d(II)Lu2/p0;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Ls1/t2;->j:Lu2/p0;

    invoke-virtual {p0}, Ls1/t2;->i()Ls1/y3;

    move-result-object p1

    return-object p1
.end method

.method public f(ILjava/util/List;Lu2/p0;)Ls1/y3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ls1/t2$c;",
            ">;",
            "Lu2/p0;",
            ")",
            "Ls1/y3;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p3, p0, Ls1/t2;->j:Lu2/p0;

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p1

    if-ge p3, v0, :cond_3

    sub-int v0, p3, p1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$c;

    if-lez p3, :cond_0

    iget-object v1, p0, Ls1/t2;->b:Ljava/util/List;

    add-int/lit8 v2, p3, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/t2$c;

    iget-object v2, v1, Ls1/t2$c;->a:Lu2/p;

    invoke-virtual {v2}, Lu2/p;->Z()Ls1/y3;

    move-result-object v2

    iget v1, v1, Ls1/t2$c;->d:I

    invoke-virtual {v2}, Ls1/y3;->t()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Ls1/t2$c;->c(I)V

    iget-object v1, v0, Ls1/t2$c;->a:Lu2/p;

    invoke-virtual {v1}, Lu2/p;->Z()Ls1/y3;

    move-result-object v1

    invoke-virtual {v1}, Ls1/y3;->t()I

    move-result v1

    invoke-direct {p0, p3, v1}, Ls1/t2;->g(II)V

    iget-object v1, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v1, p3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object v1, p0, Ls1/t2;->d:Ljava/util/Map;

    iget-object v2, v0, Ls1/t2$c;->b:Ljava/lang/Object;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Ls1/t2;->k:Z

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Ls1/t2;->x(Ls1/t2$c;)V

    iget-object v1, p0, Ls1/t2;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls1/t2;->g:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-direct {p0, v0}, Ls1/t2;->j(Ls1/t2$c;)V

    :cond_2
    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ls1/t2;->i()Ls1/y3;

    move-result-object p1

    return-object p1
.end method

.method public h(Lu2/u$b;Lo3/b;J)Lu2/r;
    .locals 2

    iget-object v0, p1, Lu2/s;->a:Ljava/lang/Object;

    invoke-static {v0}, Ls1/t2;->o(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Lu2/s;->a:Ljava/lang/Object;

    invoke-static {v1}, Ls1/t2;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lu2/u$b;->c(Ljava/lang/Object;)Lu2/u$b;

    move-result-object p1

    iget-object v1, p0, Ls1/t2;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$c;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$c;

    invoke-direct {p0, v0}, Ls1/t2;->l(Ls1/t2$c;)V

    iget-object v1, v0, Ls1/t2$c;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Ls1/t2$c;->a:Lu2/p;

    invoke-virtual {v1, p1, p2, p3, p4}, Lu2/p;->W(Lu2/u$b;Lo3/b;J)Lu2/o;

    move-result-object p1

    iget-object p2, p0, Ls1/t2;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ls1/t2;->k()V

    return-object p1
.end method

.method public i()Ls1/y3;
    .locals 3

    iget-object v0, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ls1/y3;->j:Ls1/y3;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1/t2$c;

    iput v1, v2, Ls1/t2$c;->d:I

    iget-object v2, v2, Ls1/t2$c;->a:Lu2/p;

    invoke-virtual {v2}, Lu2/p;->Z()Ls1/y3;

    move-result-object v2

    invoke-virtual {v2}, Ls1/y3;->t()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ls1/h3;

    iget-object v1, p0, Ls1/t2;->b:Ljava/util/List;

    iget-object v2, p0, Ls1/t2;->j:Lu2/p0;

    invoke-direct {v0, v1, v2}, Ls1/h3;-><init>(Ljava/util/Collection;Lu2/p0;)V

    return-object v0
.end method

.method public q()I
    .locals 1

    iget-object v0, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Ls1/t2;->k:Z

    return v0
.end method

.method public v(IIILu2/p0;)Ls1/y3;
    .locals 3

    const/4 v0, 0x1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Ls1/t2;->q()I

    move-result v1

    if-gt p2, v1, :cond_0

    if-ltz p3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lp3/a;->a(Z)V

    iput-object p4, p0, Ls1/t2;->j:Lu2/p0;

    if-eq p1, p2, :cond_3

    if-ne p1, p3, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p4

    sub-int v1, p2, p1

    add-int/2addr v1, p3

    sub-int/2addr v1, v0

    add-int/lit8 v0, p2, -0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v1, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/t2$c;

    iget v1, v1, Ls1/t2$c;->d:I

    iget-object v2, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-static {v2, p1, p2, p3}, Lp3/n0;->A0(Ljava/util/List;III)V

    :goto_1
    if-gt p4, v0, :cond_2

    iget-object p1, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls1/t2$c;

    iput v1, p1, Ls1/t2$c;->d:I

    iget-object p1, p1, Ls1/t2$c;->a:Lu2/p;

    invoke-virtual {p1}, Lu2/p;->Z()Ls1/y3;

    move-result-object p1

    invoke-virtual {p1}, Ls1/y3;->t()I

    move-result p1

    add-int/2addr v1, p1

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ls1/t2;->i()Ls1/y3;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_2
    invoke-virtual {p0}, Ls1/t2;->i()Ls1/y3;

    move-result-object p1

    return-object p1
.end method

.method public w(Lo3/p0;)V
    .locals 3

    iget-boolean v0, p0, Ls1/t2;->k:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iput-object p1, p0, Ls1/t2;->l:Lo3/p0;

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ls1/t2;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$c;

    invoke-direct {p0, v0}, Ls1/t2;->x(Ls1/t2$c;)V

    iget-object v2, p0, Ls1/t2;->g:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Ls1/t2;->k:Z

    return-void
.end method

.method public y()V
    .locals 5

    iget-object v0, p0, Ls1/t2;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/t2$b;

    :try_start_0
    iget-object v2, v1, Ls1/t2$b;->a:Lu2/u;

    iget-object v3, v1, Ls1/t2$b;->b:Lu2/u$c;

    invoke-interface {v2, v3}, Lu2/u;->c(Lu2/u$c;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v3, "MediaSourceList"

    const-string v4, "Failed to release child source."

    invoke-static {v3, v4, v2}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object v2, v1, Ls1/t2$b;->a:Lu2/u;

    iget-object v3, v1, Ls1/t2$b;->c:Ls1/t2$a;

    invoke-interface {v2, v3}, Lu2/u;->e(Lu2/b0;)V

    iget-object v2, v1, Ls1/t2$b;->a:Lu2/u;

    iget-object v1, v1, Ls1/t2$b;->c:Ls1/t2$a;

    invoke-interface {v2, v1}, Lu2/u;->q(Lw1/w;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/t2;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Ls1/t2;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls1/t2;->k:Z

    return-void
.end method

.method public z(Lu2/r;)V
    .locals 2

    iget-object v0, p0, Ls1/t2;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$c;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/t2$c;

    iget-object v1, v0, Ls1/t2$c;->a:Lu2/p;

    invoke-virtual {v1, p1}, Lu2/p;->b(Lu2/r;)V

    iget-object v1, v0, Ls1/t2$c;->c:Ljava/util/List;

    check-cast p1, Lu2/o;

    iget-object p1, p1, Lu2/o;->j:Lu2/u$b;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Ls1/t2;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Ls1/t2;->k()V

    :cond_0
    invoke-direct {p0, v0}, Ls1/t2;->u(Ls1/t2$c;)V

    return-void
.end method
