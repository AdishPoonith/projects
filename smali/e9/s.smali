.class public Le9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;
.implements Le9/m$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/s$a;,
        Le9/s$b;,
        Le9/s$c;
    }
.end annotation


# instance fields
.field private final j:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Le9/o;",
            ">;"
        }
    .end annotation
.end field

.field private k:Le9/s$a;

.field private final l:Le9/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    new-instance v0, Le9/p;

    invoke-direct {v0}, Le9/p;-><init>()V

    iput-object v0, p0, Le9/s;->l:Le9/p;

    return-void
.end method

.method private n()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {v1, v0}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le9/o;

    invoke-virtual {v1}, Le9/o;->c()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/util/LongSparseArray;->clear()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Le9/s;->n()V

    return-void
.end method

.method public b(Le9/m$i;)V
    .locals 3

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$i;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/o;

    invoke-virtual {p1}, Le9/o;->f()V

    return-void
.end method

.method public c(Le9/m$j;)V
    .locals 3

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$j;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/o;

    invoke-virtual {p1}, Le9/m$j;->c()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le9/o;->n(D)V

    return-void
.end method

.method public d(Li8/a$b;)V
    .locals 2

    iget-object v0, p0, Le9/s;->k:Le9/s$a;

    if-nez v0, :cond_0

    const-string v0, "VideoPlayerPlugin"

    const-string v1, "Detached from the engine before registering to it."

    invoke-static {v0, v1}, Ld8/b;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Le9/s;->k:Le9/s$a;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Le9/s$a;->b(Lr8/c;)V

    const/4 p1, 0x0

    iput-object p1, p0, Le9/s;->k:Le9/s$a;

    invoke-virtual {p0}, Le9/s;->a()V

    return-void
.end method

.method public e(Le9/m$h;)V
    .locals 3

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$h;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/o;

    invoke-virtual {p1}, Le9/m$h;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Le9/o;->g(I)V

    return-void
.end method

.method public f(Le9/m$g;)V
    .locals 3

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$g;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/o;

    invoke-virtual {p1}, Le9/m$g;->b()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le9/o;->l(D)V

    return-void
.end method

.method public g(Le9/m$i;)Le9/m$h;
    .locals 4

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$i;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/o;

    new-instance v1, Le9/m$h$a;

    invoke-direct {v1}, Le9/m$h$a;-><init>()V

    invoke-virtual {v0}, Le9/o;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Le9/m$h$a;->b(Ljava/lang/Long;)Le9/m$h$a;

    move-result-object v1

    invoke-virtual {p1}, Le9/m$i;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, Le9/m$h$a;->c(Ljava/lang/Long;)Le9/m$h$a;

    move-result-object p1

    invoke-virtual {p1}, Le9/m$h$a;->a()Le9/m$h;

    move-result-object p1

    invoke-virtual {v0}, Le9/o;->h()V

    return-object p1
.end method

.method public h(Le9/m$i;)V
    .locals 3

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$i;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/o;

    invoke-virtual {v0}, Le9/o;->c()V

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$i;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->remove(J)V

    return-void
.end method

.method public i(Le9/m$e;)V
    .locals 3

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$e;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/o;

    invoke-virtual {p1}, Le9/m$e;->b()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Le9/o;->k(Z)V

    return-void
.end method

.method public j(Le9/m$c;)Le9/m$i;
    .locals 10

    iget-object v0, p0, Le9/s;->k:Le9/s$a;

    iget-object v0, v0, Le9/s$a;->e:Lio/flutter/view/e;

    invoke-interface {v0}, Lio/flutter/view/e;->a()Lio/flutter/view/e$c;

    move-result-object v0

    new-instance v3, Lr8/d;

    iget-object v1, p0, Le9/s;->k:Le9/s$a;

    iget-object v1, v1, Le9/s$a;->b:Lr8/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "flutter.io/videoPlayer/videoEvents"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Lio/flutter/view/e$c;->e()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Lr8/d;-><init>(Lr8/c;Ljava/lang/String;)V

    invoke-virtual {p1}, Le9/m$c;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Le9/m$c;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le9/s;->k:Le9/s$a;

    iget-object v1, v1, Le9/s$a;->d:Le9/s$b;

    invoke-virtual {p1}, Le9/m$c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Le9/m$c;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Le9/s$b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Le9/s;->k:Le9/s$a;

    iget-object v1, v1, Le9/s$a;->c:Le9/s$c;

    invoke-virtual {p1}, Le9/m$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Le9/s$c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    new-instance v9, Le9/o;

    iget-object v1, p0, Le9/s;->k:Le9/s$a;

    iget-object v2, v1, Le9/s$a;->a:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "asset:///"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iget-object v8, p0, Le9/s;->l:Le9/p;

    move-object v1, v9

    move-object v4, v0

    invoke-direct/range {v1 .. v8}, Le9/o;-><init>(Landroid/content/Context;Lr8/d;Lio/flutter/view/e$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Le9/p;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Le9/m$c;->d()Ljava/util/Map;

    move-result-object v7

    new-instance v9, Le9/o;

    iget-object v1, p0, Le9/s;->k:Le9/s$a;

    iget-object v2, v1, Le9/s$a;->a:Landroid/content/Context;

    invoke-virtual {p1}, Le9/m$c;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Le9/m$c;->c()Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, Le9/s;->l:Le9/p;

    move-object v1, v9

    move-object v4, v0

    invoke-direct/range {v1 .. v8}, Le9/o;-><init>(Landroid/content/Context;Lr8/d;Lio/flutter/view/e$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Le9/p;)V

    :goto_1
    iget-object p1, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-interface {v0}, Lio/flutter/view/e$c;->e()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, v9}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    new-instance p1, Le9/m$i$a;

    invoke-direct {p1}, Le9/m$i$a;-><init>()V

    invoke-interface {v0}, Lio/flutter/view/e$c;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Le9/m$i$a;->b(Ljava/lang/Long;)Le9/m$i$a;

    move-result-object p1

    invoke-virtual {p1}, Le9/m$i$a;->a()Le9/m$i;

    move-result-object p1

    return-object p1
.end method

.method public k(Le9/m$f;)V
    .locals 1

    iget-object v0, p0, Le9/s;->l:Le9/p;

    invoke-virtual {p1}, Le9/m$f;->b()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Le9/p;->a:Z

    return-void
.end method

.method public l(Le9/m$i;)V
    .locals 3

    iget-object v0, p0, Le9/s;->j:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Le9/m$i;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/o;

    invoke-virtual {p1}, Le9/o;->e()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 8

    invoke-static {}, Ld8/a;->e()Ld8/a;

    move-result-object v0

    new-instance v7, Le9/s$a;

    invoke-virtual {p1}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object v3

    invoke-virtual {v0}, Ld8/a;->c()Lg8/d;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Le9/r;

    invoke-direct {v4, v1}, Le9/r;-><init>(Lg8/d;)V

    invoke-virtual {v0}, Ld8/a;->c()Lg8/d;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Le9/q;

    invoke-direct {v5, v0}, Le9/q;-><init>(Lg8/d;)V

    invoke-virtual {p1}, Li8/a$b;->d()Lio/flutter/view/e;

    move-result-object v6

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Le9/s$a;-><init>(Landroid/content/Context;Lr8/c;Le9/s$c;Le9/s$b;Lio/flutter/view/e;)V

    iput-object v7, p0, Le9/s;->k:Le9/s$a;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    invoke-virtual {v7, p0, p1}, Le9/s$a;->a(Le9/s;Lr8/c;)V

    return-void
.end method
