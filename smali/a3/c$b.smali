.class La3/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic j:La3/c;


# direct methods
.method private constructor <init>(La3/c;)V
    .locals 0

    iput-object p1, p0, La3/c$b;->j:La3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(La3/c;La3/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, La3/c$b;-><init>(La3/c;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, La3/c$b;->j:La3/c;

    invoke-static {v0}, La3/c;->y(La3/c;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Landroid/net/Uri;Lo3/g0$c;Z)Z
    .locals 8

    iget-object p3, p0, La3/c$b;->j:La3/c;

    invoke-static {p3}, La3/c;->z(La3/c;)La3/g;

    move-result-object p3

    const/4 v0, 0x0

    if-nez p3, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-object p3, p0, La3/c$b;->j:La3/c;

    invoke-static {p3}, La3/c;->q(La3/c;)La3/h;

    move-result-object p3

    invoke-static {p3}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, La3/h;

    iget-object p3, p3, La3/h;->e:Ljava/util/List;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_1

    iget-object v5, p0, La3/c$b;->j:La3/c;

    invoke-static {v5}, La3/c;->A(La3/c;)Ljava/util/HashMap;

    move-result-object v5

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La3/h$b;

    iget-object v6, v6, La3/h$b;->a:Landroid/net/Uri;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La3/c$c;

    if-eqz v5, :cond_0

    invoke-static {v5}, La3/c$c;->d(La3/c$c;)J

    move-result-wide v5

    cmp-long v7, v1, v5

    if-gez v7, :cond_0

    add-int/lit8 v4, v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance p3, Lo3/g0$a;

    iget-object v1, p0, La3/c$b;->j:La3/c;

    invoke-static {v1}, La3/c;->q(La3/c;)La3/h;

    move-result-object v1

    iget-object v1, v1, La3/h;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p3, v2, v0, v1, v4}, Lo3/g0$a;-><init>(IIII)V

    iget-object v1, p0, La3/c$b;->j:La3/c;

    invoke-static {v1}, La3/c;->D(La3/c;)Lo3/g0;

    move-result-object v1

    invoke-interface {v1, p3, p2}, Lo3/g0;->c(Lo3/g0$a;Lo3/g0$c;)Lo3/g0$b;

    move-result-object p2

    if-eqz p2, :cond_2

    iget p3, p2, Lo3/g0$b;->a:I

    const/4 v1, 0x2

    if-ne p3, v1, :cond_2

    iget-object p3, p0, La3/c$b;->j:La3/c;

    invoke-static {p3}, La3/c;->A(La3/c;)Ljava/util/HashMap;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/c$c;

    if-eqz p1, :cond_2

    iget-wide p2, p2, Lo3/g0$b;->b:J

    invoke-static {p1, p2, p3}, La3/c$c;->b(La3/c$c;J)Z

    :cond_2
    return v0
.end method
