.class Ll6/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ll6/k1;

.field private final b:Ll6/b1;

.field private final c:Ll6/b;

.field private final d:Ll6/l;


# direct methods
.method constructor <init>(Ll6/k1;Ll6/b1;Ll6/b;Ll6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/n;->a:Ll6/k1;

    iput-object p2, p0, Ll6/n;->b:Ll6/b1;

    iput-object p3, p0, Ll6/n;->c:Ll6/b;

    iput-object p4, p0, Ll6/n;->d:Ll6/l;

    return-void
.end method

.method private a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/k;",
            ">;",
            "Ljava/util/Set<",
            "Lm6/l;",
            ">;)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ll6/d1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/s;

    invoke-virtual {v3}, Lm6/s;->getKey()Lm6/l;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln6/k;

    invoke-virtual {v3}, Lm6/s;->getKey()Lm6/l;

    move-result-object v5

    invoke-interface {p3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ln6/k;->d()Ln6/f;

    move-result-object v5

    instance-of v5, v5, Ln6/l;

    if-eqz v5, :cond_1

    :cond_0
    invoke-virtual {v3}, Lm6/s;->getKey()Lm6/l;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_2

    invoke-virtual {v3}, Lm6/s;->getKey()Lm6/l;

    move-result-object v5

    invoke-virtual {v4}, Ln6/k;->d()Ln6/f;

    move-result-object v6

    invoke-virtual {v6}, Ln6/f;->e()Ln6/d;

    move-result-object v6

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Ln6/k;->d()Ln6/f;

    move-result-object v5

    invoke-virtual {v4}, Ln6/k;->d()Ln6/f;

    move-result-object v4

    invoke-virtual {v4}, Ln6/f;->e()Ln6/d;

    move-result-object v4

    invoke-static {}, Lw5/q;->p()Lw5/q;

    move-result-object v6

    invoke-virtual {v5, v3, v4, v6}, Ln6/f;->a(Lm6/s;Ln6/d;Lw5/q;)Ln6/d;

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Lm6/s;->getKey()Lm6/l;

    move-result-object v3

    sget-object v4, Ln6/d;->b:Ln6/d;

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-direct {p0, v0}, Ll6/n;->m(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm6/l;

    new-instance v2, Ll6/d1;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/i;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ln6/d;

    invoke-direct {v2, v3, p3}, Ll6/d1;-><init>(Lm6/i;Ln6/d;)V

    invoke-interface {p2, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    return-object p2
.end method

.method private b(Lm6/l;Ln6/k;)Lm6/s;
    .locals 0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ln6/k;->d()Ln6/f;

    move-result-object p2

    instance-of p2, p2, Ln6/l;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lm6/s;->q(Lm6/l;)Lm6/s;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p2, p0, Ll6/n;->a:Ll6/k1;

    invoke-interface {p2, p1}, Ll6/k1;->c(Lm6/l;)Lm6/s;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method private e(Lj6/b1;Lm6/q$a;)Ld6/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Lm6/q$a;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lj6/b1;->n()Lm6/u;

    move-result-object v0

    invoke-virtual {v0}, Lm6/e;->o()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Currently we only support collection group queries at the root."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj6/b1;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lm6/j;->a()Ld6/c;

    move-result-object v1

    iget-object v2, p0, Ll6/n;->d:Ll6/l;

    invoke-interface {v2, v0}, Ll6/l;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/u;

    invoke-virtual {v3, v0}, Lm6/e;->b(Ljava/lang/String;)Lm6/e;

    move-result-object v3

    check-cast v3, Lm6/u;

    invoke-virtual {p1, v3}, Lj6/b1;->a(Lm6/u;)Lj6/b1;

    move-result-object v3

    invoke-direct {p0, v3, p2}, Ll6/n;->f(Lj6/b1;Lm6/q$a;)Ld6/c;

    move-result-object v3

    invoke-virtual {v3}, Ld6/c;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm6/l;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm6/i;

    invoke-virtual {v1, v5, v4}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object v1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private f(Lj6/b1;Lm6/q$a;)Ld6/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Lm6/q$a;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/n;->c:Ll6/b;

    invoke-virtual {p1}, Lj6/b1;->n()Lm6/u;

    move-result-object v1

    invoke-virtual {p2}, Lm6/q$a;->n()I

    move-result v2

    invoke-interface {v0, v1, v2}, Ll6/b;->d(Lm6/u;I)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll6/n;->a:Ll6/k1;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v1, p1, p2, v2}, Ll6/k1;->a(Lj6/b1;Lm6/q$a;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/l;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/l;

    invoke-static {v2}, Lm6/s;->q(Lm6/l;)Lm6/s;

    move-result-object v2

    invoke-interface {p2, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {}, Lm6/j;->a()Ld6/c;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/k;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ln6/k;->d()Ln6/f;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm6/s;

    sget-object v5, Ln6/d;->b:Ln6/d;

    invoke-static {}, Lw5/q;->p()Lw5/q;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Ln6/f;->a(Lm6/s;Ln6/d;Lw5/q;)Ln6/d;

    :cond_3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/i;

    invoke-virtual {p1, v3}, Lj6/b1;->v(Lm6/i;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm6/l;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm6/i;

    invoke-virtual {v1, v3, v2}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object v1

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method private g(Lm6/u;)Ld6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/u;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lm6/j;->a()Ld6/c;

    move-result-object v0

    invoke-static {p1}, Lm6/l;->l(Lm6/u;)Lm6/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll6/n;->c(Lm6/l;)Lm6/i;

    move-result-object p1

    invoke-interface {p1}, Lm6/i;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lm6/i;->getKey()Lm6/l;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private l(Ljava/util/Map;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/k;",
            ">;",
            "Ljava/util/Set<",
            "Lm6/l;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm6/l;

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ll6/n;->c:Ll6/b;

    invoke-interface {p2, v0}, Ll6/b;->a(Ljava/util/SortedSet;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method private m(Ljava/util/Map;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ln6/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/n;->b:Ll6/b1;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ll6/b1;->e(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln6/g;

    invoke-virtual {v3}, Ln6/g;->f()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm6/l;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm6/s;

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln6/d;

    goto :goto_1

    :cond_2
    sget-object v7, Ln6/d;->b:Ln6/d;

    :goto_1
    invoke-virtual {v3, v6, v7}, Ln6/g;->b(Lm6/s;Ln6/d;)Ln6/d;

    move-result-object v6

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Ln6/g;->e()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v2, v7, v8}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Set;

    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v2}, Ljava/util/TreeMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/NavigableMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm6/l;

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm6/s;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ln6/d;

    invoke-static {v7, v8}, Ln6/f;->c(Lm6/s;Ln6/d;)Ln6/f;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    iget-object v5, p0, Ll6/n;->c:Ll6/b;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v5, v3, v4}, Ll6/b;->c(ILjava/util/Map;)V

    goto :goto_2

    :cond_8
    return-object v1
.end method


# virtual methods
.method c(Lm6/l;)Lm6/i;
    .locals 3

    iget-object v0, p0, Ll6/n;->c:Ll6/b;

    invoke-interface {v0, p1}, Ll6/b;->f(Lm6/l;)Ln6/k;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll6/n;->b(Lm6/l;Ln6/k;)Lm6/s;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln6/k;->d()Ln6/f;

    move-result-object v0

    sget-object v1, Ln6/d;->b:Ln6/d;

    invoke-static {}, Lw5/q;->p()Lw5/q;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Ln6/f;->a(Lm6/s;Ln6/d;Lw5/q;)Ln6/d;

    :cond_0
    return-object p1
.end method

.method d(Ljava/lang/Iterable;)Ld6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lm6/l;",
            ">;)",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/n;->a:Ll6/k1;

    invoke-interface {v0, p1}, Ll6/k1;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0, p1, v0}, Ll6/n;->i(Ljava/util/Map;Ljava/util/Set;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method h(Lj6/b1;Lm6/q$a;)Ld6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/b1;",
            "Lm6/q$a;",
            ")",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lj6/b1;->n()Lm6/u;

    move-result-object v0

    invoke-virtual {p1}, Lj6/b1;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Ll6/n;->g(Lm6/u;)Ld6/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lj6/b1;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p2}, Ll6/n;->e(Lj6/b1;Lm6/q$a;)Ld6/c;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p1, p2}, Ll6/n;->f(Lj6/b1;Lm6/q$a;)Ld6/c;

    move-result-object p1

    return-object p1
.end method

.method i(Ljava/util/Map;Ljava/util/Set;)Ld6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;",
            "Ljava/util/Set<",
            "Lm6/l;",
            ">;)",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ll6/n;->l(Ljava/util/Map;Ljava/util/Set;)V

    invoke-static {}, Lm6/j;->a()Ld6/c;

    move-result-object v1

    invoke-direct {p0, p1, v0, p2}, Ll6/n;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm6/l;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll6/d1;

    invoke-virtual {p2}, Ll6/d1;->a()Lm6/i;

    move-result-object p2

    invoke-virtual {v1, v0, p2}, Ld6/c;->p(Ljava/lang/Object;Ljava/lang/Object;)Ld6/c;

    move-result-object v1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method j(Ljava/lang/String;Lm6/q$a;I)Ll6/m;
    .locals 4

    iget-object v0, p0, Ll6/n;->a:Ll6/k1;

    invoke-interface {v0, p1, p2, p3}, Ll6/k1;->e(Ljava/lang/String;Lm6/q$a;I)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    sub-int v1, p3, v1

    if-lez v1, :cond_0

    iget-object v1, p0, Ll6/n;->c:Ll6/b;

    invoke-virtual {p2}, Lm6/q$a;->n()I

    move-result p2

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    sub-int/2addr p3, v2

    invoke-interface {v1, p1, p2, p3}, Ll6/b;->e(Ljava/lang/String;II)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :goto_0
    const/4 p2, -0x1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/k;

    invoke-virtual {v1}, Ln6/k;->b()Lm6/l;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ln6/k;->b()Lm6/l;

    move-result-object v2

    invoke-virtual {v1}, Ln6/k;->b()Lm6/l;

    move-result-object v3

    invoke-direct {p0, v3, v1}, Ll6/n;->b(Lm6/l;Ln6/k;)Lm6/s;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v1}, Ln6/k;->c()I

    move-result v1

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-direct {p0, p1, p3}, Ll6/n;->l(Ljava/util/Map;Ljava/util/Set;)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p3

    invoke-direct {p0, v0, p1, p3}, Ll6/n;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2, p1}, Ll6/m;->a(ILjava/util/Map;)Ll6/m;

    move-result-object p1

    return-object p1
.end method

.method k(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Lm6/s;",
            ">;)",
            "Ljava/util/Map<",
            "Lm6/l;",
            "Ll6/d1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ll6/n;->l(Ljava/util/Map;Ljava/util/Set;)V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Ll6/n;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method n(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lm6/l;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll6/n;->a:Ll6/k1;

    invoke-interface {v0, p1}, Ll6/k1;->f(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Ll6/n;->m(Ljava/util/Map;)Ljava/util/Map;

    return-void
.end method
