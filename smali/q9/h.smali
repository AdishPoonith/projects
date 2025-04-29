.class final Lq9/h;
.super Li9/r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq9/h$d;,
        Lq9/h$b;,
        Lq9/h$c;,
        Lq9/h$e;
    }
.end annotation


# static fields
.field static final h:Li9/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/a$c<",
            "Lq9/h$d<",
            "Li9/q;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final i:Li9/j1;


# instance fields
.field private final c:Li9/r0$d;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Li9/x;",
            "Li9/r0$h;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Random;

.field private f:Li9/p;

.field private g:Lq9/h$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "state-info"

    invoke-static {v0}, Li9/a$c;->a(Ljava/lang/String;)Li9/a$c;

    move-result-object v0

    sput-object v0, Lq9/h;->h:Li9/a$c;

    sget-object v0, Li9/j1;->f:Li9/j1;

    const-string v1, "no subchannels ready"

    invoke-virtual {v0, v1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object v0

    sput-object v0, Lq9/h;->i:Li9/j1;

    return-void
.end method

.method constructor <init>(Li9/r0$d;)V
    .locals 2

    invoke-direct {p0}, Li9/r0;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lq9/h;->d:Ljava/util/Map;

    new-instance v0, Lq9/h$b;

    sget-object v1, Lq9/h;->i:Li9/j1;

    invoke-direct {v0, v1}, Lq9/h$b;-><init>(Li9/j1;)V

    iput-object v0, p0, Lq9/h;->g:Lq9/h$e;

    const-string v0, "helper"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/r0$d;

    iput-object p1, p0, Lq9/h;->c:Li9/r0$d;

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lq9/h;->e:Ljava/util/Random;

    return-void
.end method

.method static synthetic g(Lq9/h;Li9/r0$h;Li9/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq9/h;->l(Li9/r0$h;Li9/q;)V

    return-void
.end method

.method private static h(Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Li9/r0$h;",
            ">;)",
            "Ljava/util/List<",
            "Li9/r0$h;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/r0$h;

    invoke-static {v1}, Lq9/h;->k(Li9/r0$h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static i(Li9/r0$h;)Lq9/h$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/r0$h;",
            ")",
            "Lq9/h$d<",
            "Li9/q;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Li9/r0$h;->c()Li9/a;

    move-result-object p0

    sget-object v0, Lq9/h;->h:Li9/a$c;

    invoke-virtual {p0, v0}, Li9/a;->b(Li9/a$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq9/h$d;

    const-string v0, "STATE_INFO"

    invoke-static {p0, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq9/h$d;

    return-object p0
.end method

.method static k(Li9/r0$h;)Z
    .locals 1

    invoke-static {p0}, Lq9/h;->i(Li9/r0$h;)Lq9/h$d;

    move-result-object p0

    iget-object p0, p0, Lq9/h$d;->a:Ljava/lang/Object;

    check-cast p0, Li9/q;

    invoke-virtual {p0}, Li9/q;->c()Li9/p;

    move-result-object p0

    sget-object v0, Li9/p;->k:Li9/p;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private l(Li9/r0$h;Li9/q;)V
    .locals 3

    iget-object v0, p0, Lq9/h;->d:Ljava/util/Map;

    invoke-virtual {p1}, Li9/r0$h;->a()Li9/x;

    move-result-object v1

    invoke-static {v1}, Lq9/h;->o(Li9/x;)Li9/x;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Li9/q;->c()Li9/p;

    move-result-object v0

    sget-object v1, Li9/p;->l:Li9/p;

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Li9/q;->c()Li9/p;

    move-result-object v0

    sget-object v2, Li9/p;->m:Li9/p;

    if-ne v0, v2, :cond_2

    :cond_1
    iget-object v0, p0, Lq9/h;->c:Li9/r0$d;

    invoke-virtual {v0}, Li9/r0$d;->e()V

    :cond_2
    invoke-virtual {p2}, Li9/q;->c()Li9/p;

    move-result-object v0

    sget-object v2, Li9/p;->m:Li9/p;

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Li9/r0$h;->e()V

    :cond_3
    invoke-static {p1}, Lq9/h;->i(Li9/r0$h;)Lq9/h$d;

    move-result-object p1

    iget-object v0, p1, Lq9/h$d;->a:Ljava/lang/Object;

    check-cast v0, Li9/q;

    invoke-virtual {v0}, Li9/q;->c()Li9/p;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Li9/q;->c()Li9/p;

    move-result-object v0

    sget-object v1, Li9/p;->j:Li9/p;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p2}, Li9/q;->c()Li9/p;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    return-void

    :cond_5
    iput-object p2, p1, Lq9/h$d;->a:Ljava/lang/Object;

    invoke-direct {p0}, Lq9/h;->q()V

    return-void
.end method

.method private static m(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "TT;>;",
            "Ljava/util/Set<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method private n(Li9/r0$h;)V
    .locals 1

    invoke-virtual {p1}, Li9/r0$h;->f()V

    invoke-static {p1}, Lq9/h;->i(Li9/r0$h;)Lq9/h$d;

    move-result-object p1

    sget-object v0, Li9/p;->n:Li9/p;

    invoke-static {v0}, Li9/q;->a(Li9/p;)Li9/q;

    move-result-object v0

    iput-object v0, p1, Lq9/h$d;->a:Ljava/lang/Object;

    return-void
.end method

.method private static o(Li9/x;)Li9/x;
    .locals 1

    new-instance v0, Li9/x;

    invoke-virtual {p0}, Li9/x;->a()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Li9/x;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private static p(Ljava/util/List;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li9/x;",
            ">;)",
            "Ljava/util/Map<",
            "Li9/x;",
            "Li9/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/x;

    invoke-static {v1}, Lq9/h;->o(Li9/x;)Li9/x;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private q()V
    .locals 6

    invoke-virtual {p0}, Lq9/h;->j()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lq9/h;->h(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v0, 0x0

    sget-object v1, Lq9/h;->i:Li9/j1;

    invoke-virtual {p0}, Lq9/h;->j()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li9/r0$h;

    invoke-static {v3}, Lq9/h;->i(Li9/r0$h;)Lq9/h$d;

    move-result-object v3

    iget-object v3, v3, Lq9/h$d;->a:Ljava/lang/Object;

    check-cast v3, Li9/q;

    invoke-virtual {v3}, Li9/q;->c()Li9/p;

    move-result-object v4

    sget-object v5, Li9/p;->j:Li9/p;

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, Li9/q;->c()Li9/p;

    move-result-object v4

    sget-object v5, Li9/p;->m:Li9/p;

    if-ne v4, v5, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    sget-object v4, Lq9/h;->i:Li9/j1;

    if-eq v1, v4, :cond_3

    invoke-virtual {v1}, Li9/j1;->o()Z

    move-result v4

    if-nez v4, :cond_0

    :cond_3
    invoke-virtual {v3}, Li9/q;->d()Li9/j1;

    move-result-object v1

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    sget-object v0, Li9/p;->j:Li9/p;

    goto :goto_1

    :cond_5
    sget-object v0, Li9/p;->l:Li9/p;

    :goto_1
    new-instance v2, Lq9/h$b;

    invoke-direct {v2, v1}, Lq9/h$b;-><init>(Li9/j1;)V

    invoke-direct {p0, v0, v2}, Lq9/h;->r(Li9/p;Lq9/h$e;)V

    goto :goto_2

    :cond_6
    iget-object v1, p0, Lq9/h;->e:Ljava/util/Random;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    sget-object v2, Li9/p;->k:Li9/p;

    new-instance v3, Lq9/h$c;

    invoke-direct {v3, v0, v1}, Lq9/h$c;-><init>(Ljava/util/List;I)V

    invoke-direct {p0, v2, v3}, Lq9/h;->r(Li9/p;Lq9/h$e;)V

    :goto_2
    return-void
.end method

.method private r(Li9/p;Lq9/h$e;)V
    .locals 1

    iget-object v0, p0, Lq9/h;->f:Li9/p;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lq9/h;->g:Lq9/h$e;

    invoke-virtual {p2, v0}, Lq9/h$e;->c(Lq9/h$e;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lq9/h;->c:Li9/r0$d;

    invoke-virtual {v0, p1, p2}, Li9/r0$d;->f(Li9/p;Li9/r0$i;)V

    iput-object p1, p0, Lq9/h;->f:Li9/p;

    iput-object p2, p0, Lq9/h;->g:Lq9/h$e;

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Li9/r0$g;)Z
    .locals 7

    invoke-virtual {p1}, Li9/r0$g;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Li9/j1;->u:Li9/j1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NameResolver returned no usable address. addrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Li9/r0$g;->a()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", attrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Li9/r0$g;->b()Li9/a;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq9/h;->c(Li9/j1;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Li9/r0$g;->a()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lq9/h;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Lq9/h;->p(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lq9/h;->m(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li9/x;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/x;

    iget-object v3, p0, Lq9/h;->d:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li9/r0$h;

    if-eqz v3, :cond_1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, v1}, Li9/r0$h;->h(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Li9/a;->c()Li9/a$b;

    move-result-object v3

    sget-object v4, Lq9/h;->h:Li9/a$c;

    new-instance v5, Lq9/h$d;

    sget-object v6, Li9/p;->m:Li9/p;

    invoke-static {v6}, Li9/q;->a(Li9/p;)Li9/q;

    move-result-object v6

    invoke-direct {v5, v6}, Lq9/h$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v4, v5}, Li9/a$b;->d(Li9/a$c;Ljava/lang/Object;)Li9/a$b;

    move-result-object v3

    iget-object v4, p0, Lq9/h;->c:Li9/r0$d;

    invoke-static {}, Li9/r0$b;->c()Li9/r0$b$a;

    move-result-object v5

    invoke-virtual {v5, v1}, Li9/r0$b$a;->d(Li9/x;)Li9/r0$b$a;

    move-result-object v1

    invoke-virtual {v3}, Li9/a$b;->a()Li9/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Li9/r0$b$a;->f(Li9/a;)Li9/r0$b$a;

    move-result-object v1

    invoke-virtual {v1}, Li9/r0$b$a;->b()Li9/r0$b;

    move-result-object v1

    invoke-virtual {v4, v1}, Li9/r0$d;->a(Li9/r0$b;)Li9/r0$h;

    move-result-object v1

    const-string v3, "subchannel"

    invoke-static {v1, v3}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/r0$h;

    new-instance v3, Lq9/h$a;

    invoke-direct {v3, p0, v1}, Lq9/h$a;-><init>(Lq9/h;Li9/r0$h;)V

    invoke-virtual {v1, v3}, Li9/r0$h;->g(Li9/r0$j;)V

    iget-object v3, p0, Lq9/h;->d:Ljava/util/Map;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Li9/r0$h;->e()V

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/x;

    iget-object v2, p0, Lq9/h;->d:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/r0$h;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lq9/h;->q()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/r0$h;

    invoke-direct {p0, v0}, Lq9/h;->n(Li9/r0$h;)V

    goto :goto_2

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public c(Li9/j1;)V
    .locals 2

    iget-object v0, p0, Lq9/h;->f:Li9/p;

    sget-object v1, Li9/p;->k:Li9/p;

    if-eq v0, v1, :cond_0

    sget-object v0, Li9/p;->l:Li9/p;

    new-instance v1, Lq9/h$b;

    invoke-direct {v1, p1}, Lq9/h$b;-><init>(Li9/j1;)V

    invoke-direct {p0, v0, v1}, Lq9/h;->r(Li9/p;Lq9/h$e;)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    invoke-virtual {p0}, Lq9/h;->j()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/r0$h;

    invoke-direct {p0, v1}, Lq9/h;->n(Li9/r0$h;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq9/h;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method j()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Li9/r0$h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq9/h;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
