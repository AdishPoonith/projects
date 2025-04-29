.class public final Lp0/y0;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"

# interfaces
.implements Lp0/z0;


# instance fields
.field private final j:Lp0/n0;

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lp0/j0;",
            "Lp0/b1;",
            ">;"
        }
    .end annotation
.end field

.field private final l:J

.field private final m:J

.field private n:J

.field private o:J

.field private p:Lp0/b1;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lp0/n0;Ljava/util/Map;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/OutputStream;",
            "Lp0/n0;",
            "Ljava/util/Map<",
            "Lp0/j0;",
            "Lp0/b1;",
            ">;J)V"
        }
    .end annotation

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requests"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p2, p0, Lp0/y0;->j:Lp0/n0;

    iput-object p3, p0, Lp0/y0;->k:Ljava/util/Map;

    iput-wide p4, p0, Lp0/y0;->l:J

    sget-object p1, Lp0/f0;->a:Lp0/f0;

    invoke-static {}, Lp0/f0;->A()J

    move-result-wide p1

    iput-wide p1, p0, Lp0/y0;->m:J

    return-void
.end method

.method public static synthetic b(Lp0/n0$a;Lp0/y0;)V
    .locals 0

    invoke-static {p0, p1}, Lp0/y0;->l(Lp0/n0$a;Lp0/y0;)V

    return-void
.end method

.method private final e(J)V
    .locals 4

    iget-object v0, p0, Lp0/y0;->p:Lp0/b1;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Lp0/b1;->b(J)V

    :goto_0
    iget-wide v0, p0, Lp0/y0;->n:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lp0/y0;->n:J

    iget-wide p1, p0, Lp0/y0;->o:J

    iget-wide v2, p0, Lp0/y0;->m:J

    add-long/2addr p1, v2

    cmp-long v2, v0, p1

    if-gez v2, :cond_1

    iget-wide p1, p0, Lp0/y0;->l:J

    cmp-long v2, v0, p1

    if-ltz v2, :cond_2

    :cond_1
    invoke-direct {p0}, Lp0/y0;->k()V

    :cond_2
    return-void
.end method

.method private final k()V
    .locals 9

    iget-wide v0, p0, Lp0/y0;->n:J

    iget-wide v2, p0, Lp0/y0;->o:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    iget-object v0, p0, Lp0/y0;->j:Lp0/n0;

    invoke-virtual {v0}, Lp0/n0;->v()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp0/n0$a;

    instance-of v2, v1, Lp0/n0$c;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lp0/y0;->j:Lp0/n0;

    invoke-virtual {v2}, Lp0/n0;->u()Landroid/os/Handler;

    move-result-object v2

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    new-instance v3, Lp0/x0;

    invoke-direct {v3, v1, p0}, Lp0/x0;-><init>(Lp0/n0$a;Lp0/y0;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_0

    move-object v3, v1

    check-cast v3, Lp0/n0$c;

    iget-object v4, p0, Lp0/y0;->j:Lp0/n0;

    iget-wide v5, p0, Lp0/y0;->n:J

    iget-wide v7, p0, Lp0/y0;->l:J

    invoke-interface/range {v3 .. v8}, Lp0/n0$c;->a(Lp0/n0;JJ)V

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Lp0/y0;->n:J

    iput-wide v0, p0, Lp0/y0;->o:J

    :cond_3
    return-void
.end method

.method private static final l(Lp0/n0$a;Lp0/y0;)V
    .locals 7

    const-string v0, "$callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Lp0/n0$c;

    iget-object v2, p1, Lp0/y0;->j:Lp0/n0;

    invoke-virtual {p1}, Lp0/y0;->h()J

    move-result-wide v3

    invoke-virtual {p1}, Lp0/y0;->i()J

    move-result-wide v5

    invoke-interface/range {v1 .. v6}, Lp0/n0$c;->a(Lp0/n0;JJ)V

    return-void
.end method


# virtual methods
.method public a(Lp0/j0;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lp0/y0;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp0/b1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lp0/y0;->p:Lp0/b1;

    return-void
.end method

.method public close()V
    .locals 2

    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    iget-object v0, p0, Lp0/y0;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp0/b1;

    invoke-virtual {v1}, Lp0/b1;->d()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lp0/y0;->k()V

    return-void
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lp0/y0;->n:J

    return-wide v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lp0/y0;->l:J

    return-wide v0
.end method

.method public write(I)V
    .locals 2

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    const-wide/16 v0, 0x1

    invoke-direct {p0, v0, v1}, Lp0/y0;->e(J)V

    return-void
.end method

.method public write([B)V
    .locals 2

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    array-length p1, p1

    int-to-long v0, p1

    invoke-direct {p0, v0, v1}, Lp0/y0;->e(J)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    int-to-long p1, p3

    invoke-direct {p0, p1, p2}, Lp0/y0;->e(J)V

    return-void
.end method
