.class public Lw1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/h$f;,
        Lw1/h$c;,
        Lw1/h$h;,
        Lw1/h$g;,
        Lw1/h$d;,
        Lw1/h$e;,
        Lw1/h$b;
    }
.end annotation


# instance fields
.field private final c:Ljava/util/UUID;

.field private final d:Lw1/g0$c;

.field private final e:Lw1/n0;

.field private final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Z

.field private final h:[I

.field private final i:Z

.field private final j:Lw1/h$g;

.field private final k:Lo3/g0;

.field private final l:Lw1/h$h;

.field private final m:J

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw1/g;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw1/h$f;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw1/g;",
            ">;"
        }
    .end annotation
.end field

.field private q:I

.field private r:Lw1/g0;

.field private s:Lw1/g;

.field private t:Lw1/g;

.field private u:Landroid/os/Looper;

.field private v:Landroid/os/Handler;

.field private w:I

.field private x:[B

.field private y:Lt1/t1;

.field volatile z:Lw1/h$d;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Lw1/g0$c;Lw1/n0;Ljava/util/HashMap;Z[IZLo3/g0;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lw1/g0$c;",
            "Lw1/n0;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z[IZ",
            "Lo3/g0;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ls1/i;->b:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Use C.CLEARKEY_UUID instead"

    invoke-static {v0, v1}, Lp3/a;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lw1/h;->c:Ljava/util/UUID;

    iput-object p2, p0, Lw1/h;->d:Lw1/g0$c;

    iput-object p3, p0, Lw1/h;->e:Lw1/n0;

    iput-object p4, p0, Lw1/h;->f:Ljava/util/HashMap;

    iput-boolean p5, p0, Lw1/h;->g:Z

    iput-object p6, p0, Lw1/h;->h:[I

    iput-boolean p7, p0, Lw1/h;->i:Z

    iput-object p8, p0, Lw1/h;->k:Lo3/g0;

    new-instance p1, Lw1/h$g;

    invoke-direct {p1, p0}, Lw1/h$g;-><init>(Lw1/h;)V

    iput-object p1, p0, Lw1/h;->j:Lw1/h$g;

    new-instance p1, Lw1/h$h;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lw1/h$h;-><init>(Lw1/h;Lw1/h$a;)V

    iput-object p1, p0, Lw1/h;->l:Lw1/h$h;

    const/4 p1, 0x0

    iput p1, p0, Lw1/h;->w:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lw1/h;->n:Ljava/util/List;

    invoke-static {}, Lcom/google/common/collect/p0;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lw1/h;->o:Ljava/util/Set;

    invoke-static {}, Lcom/google/common/collect/p0;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lw1/h;->p:Ljava/util/Set;

    iput-wide p9, p0, Lw1/h;->m:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/UUID;Lw1/g0$c;Lw1/n0;Ljava/util/HashMap;Z[IZLo3/g0;JLw1/h$a;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lw1/h;-><init>(Ljava/util/UUID;Lw1/g0$c;Lw1/n0;Ljava/util/HashMap;Z[IZLo3/g0;J)V

    return-void
.end method

.method private declared-synchronized A(Landroid/os/Looper;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lw1/h;->u:Landroid/os/Looper;

    if-nez v0, :cond_0

    iput-object p1, p0, Lw1/h;->u:Landroid/os/Looper;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lw1/h;->v:Landroid/os/Handler;

    goto :goto_1

    :cond_0
    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp3/a;->f(Z)V

    iget-object p1, p0, Lw1/h;->v:Landroid/os/Handler;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private B(IZ)Lw1/o;
    .locals 4

    iget-object v0, p0, Lw1/h;->r:Lw1/g0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/g0;

    invoke-interface {v0}, Lw1/g0;->k()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    sget-boolean v1, Lw1/h0;->d:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_3

    iget-object v1, p0, Lw1/h;->h:[I

    invoke-static {v1, p1}, Lp3/n0;->y0([II)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    invoke-interface {v0}, Lw1/g0;->k()I

    move-result p1

    if-ne p1, v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lw1/h;->s:Lw1/g;

    if-nez p1, :cond_2

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object p1

    invoke-direct {p0, p1, v2, v3, p2}, Lw1/h;->y(Ljava/util/List;ZLw1/w$a;Z)Lw1/g;

    move-result-object p1

    iget-object p2, p0, Lw1/h;->n:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, Lw1/h;->s:Lw1/g;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v3}, Lw1/g;->f(Lw1/w$a;)V

    :goto_1
    iget-object p1, p0, Lw1/h;->s:Lw1/g;

    return-object p1

    :cond_3
    :goto_2
    return-object v3
.end method

.method private C(Landroid/os/Looper;)V
    .locals 1

    iget-object v0, p0, Lw1/h;->z:Lw1/h$d;

    if-nez v0, :cond_0

    new-instance v0, Lw1/h$d;

    invoke-direct {v0, p0, p1}, Lw1/h$d;-><init>(Lw1/h;Landroid/os/Looper;)V

    iput-object v0, p0, Lw1/h;->z:Lw1/h$d;

    :cond_0
    return-void
.end method

.method private D()V
    .locals 1

    iget-object v0, p0, Lw1/h;->r:Lw1/g0;

    if-eqz v0, :cond_0

    iget v0, p0, Lw1/h;->q:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lw1/h;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw1/h;->o:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw1/h;->r:Lw1/g0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/g0;

    invoke-interface {v0}, Lw1/g0;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lw1/h;->r:Lw1/g0;

    :cond_0
    return-void
.end method

.method private E()V
    .locals 3

    iget-object v0, p0, Lw1/h;->p:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/collect/s;->t(Ljava/util/Collection;)Lcom/google/common/collect/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/s;->q()Lcom/google/common/collect/s0;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/o;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lw1/o;->d(Lw1/w$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private F()V
    .locals 2

    iget-object v0, p0, Lw1/h;->o:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/collect/s;->t(Ljava/util/Collection;)Lcom/google/common/collect/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/s;->q()Lcom/google/common/collect/s0;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/h$f;

    invoke-virtual {v1}, Lw1/h$f;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private H(Lw1/o;Lw1/w$a;)V
    .locals 4

    invoke-interface {p1, p2}, Lw1/o;->d(Lw1/w$a;)V

    iget-wide v0, p0, Lw1/h;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lw1/o;->d(Lw1/w$a;)V

    :cond_0
    return-void
.end method

.method private I(Z)V
    .locals 2

    const-string v0, "DefaultDrmSessionMgr"

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw1/h;->u:Landroid/os/Looper;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v1, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread."

    invoke-static {v0, v1, p1}, Lp3/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v1, p0, Lw1/h;->u:Landroid/os/Looper;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq p1, v1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nExpected thread: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw1/h;->u:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-static {v0, p1, v1}, Lp3/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic g(Lw1/h;)Lw1/g;
    .locals 0

    iget-object p0, p0, Lw1/h;->t:Lw1/g;

    return-object p0
.end method

.method static synthetic h(Lw1/h;Lw1/g;)Lw1/g;
    .locals 0

    iput-object p1, p0, Lw1/h;->t:Lw1/g;

    return-object p1
.end method

.method static synthetic i(Lw1/h;)Lw1/h$g;
    .locals 0

    iget-object p0, p0, Lw1/h;->j:Lw1/h$g;

    return-object p0
.end method

.method static synthetic j(Lw1/h;)V
    .locals 0

    invoke-direct {p0}, Lw1/h;->D()V

    return-void
.end method

.method static synthetic k(Lw1/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lw1/h;->o:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic l(Lw1/h;)Landroid/os/Looper;
    .locals 0

    iget-object p0, p0, Lw1/h;->u:Landroid/os/Looper;

    return-object p0
.end method

.method static synthetic m(Lw1/h;Landroid/os/Looper;Lw1/w$a;Ls1/n1;Z)Lw1/o;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lw1/h;->u(Landroid/os/Looper;Lw1/w$a;Ls1/n1;Z)Lw1/o;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lw1/h;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lw1/h;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic o(Lw1/h;)J
    .locals 2

    iget-wide v0, p0, Lw1/h;->m:J

    return-wide v0
.end method

.method static synthetic p(Lw1/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lw1/h;->p:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic q(Lw1/h;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lw1/h;->v:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic r(Lw1/h;)I
    .locals 0

    iget p0, p0, Lw1/h;->q:I

    return p0
.end method

.method static synthetic s(Lw1/h;)Lw1/g;
    .locals 0

    iget-object p0, p0, Lw1/h;->s:Lw1/g;

    return-object p0
.end method

.method static synthetic t(Lw1/h;Lw1/g;)Lw1/g;
    .locals 0

    iput-object p1, p0, Lw1/h;->s:Lw1/g;

    return-object p1
.end method

.method private u(Landroid/os/Looper;Lw1/w$a;Ls1/n1;Z)Lw1/o;
    .locals 4

    invoke-direct {p0, p1}, Lw1/h;->C(Landroid/os/Looper;)V

    iget-object p1, p3, Ls1/n1;->x:Lw1/m;

    if-nez p1, :cond_0

    iget-object p1, p3, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {p1}, Lp3/v;->k(Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0, p1, p4}, Lw1/h;->B(IZ)Lw1/o;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p3, p0, Lw1/h;->x:[B

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p3, :cond_2

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw1/m;

    iget-object p3, p0, Lw1/h;->c:Ljava/util/UUID;

    invoke-static {p1, p3, v0}, Lw1/h;->z(Lw1/m;Ljava/util/UUID;Z)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    new-instance p1, Lw1/h$e;

    iget-object p3, p0, Lw1/h;->c:Ljava/util/UUID;

    invoke-direct {p1, p3, v1}, Lw1/h$e;-><init>(Ljava/util/UUID;Lw1/h$a;)V

    const-string p3, "DefaultDrmSessionMgr"

    const-string p4, "DRM error"

    invoke-static {p3, p4, p1}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lw1/w$a;->l(Ljava/lang/Exception;)V

    :cond_1
    new-instance p2, Lw1/e0;

    new-instance p3, Lw1/o$a;

    const/16 p4, 0x1773

    invoke-direct {p3, p1, p4}, Lw1/o$a;-><init>(Ljava/lang/Throwable;I)V

    invoke-direct {p2, p3}, Lw1/e0;-><init>(Lw1/o$a;)V

    return-object p2

    :cond_2
    move-object p1, v1

    :cond_3
    iget-boolean p3, p0, Lw1/h;->g:Z

    if-nez p3, :cond_4

    iget-object v1, p0, Lw1/h;->t:Lw1/g;

    goto :goto_0

    :cond_4
    iget-object p3, p0, Lw1/h;->n:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw1/g;

    iget-object v3, v2, Lw1/g;->a:Ljava/util/List;

    invoke-static {v3, p1}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v1, v2

    :cond_6
    :goto_0
    if-nez v1, :cond_8

    invoke-direct {p0, p1, v0, p2, p4}, Lw1/h;->y(Ljava/util/List;ZLw1/w$a;Z)Lw1/g;

    move-result-object v1

    iget-boolean p1, p0, Lw1/h;->g:Z

    if-nez p1, :cond_7

    iput-object v1, p0, Lw1/h;->t:Lw1/g;

    :cond_7
    iget-object p1, p0, Lw1/h;->n:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-virtual {v1, p2}, Lw1/g;->f(Lw1/w$a;)V

    :goto_1
    return-object v1
.end method

.method private static v(Lw1/o;)Z
    .locals 3

    invoke-interface {p0}, Lw1/o;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget v0, Lp3/n0;->a:I

    const/16 v2, 0x13

    if-lt v0, v2, :cond_1

    invoke-interface {p0}, Lw1/o;->a()Lw1/o$a;

    move-result-object p0

    invoke-static {p0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw1/o$a;

    invoke-virtual {p0}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Landroid/media/ResourceBusyException;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private w(Lw1/m;)Z
    .locals 4

    iget-object v0, p0, Lw1/h;->x:[B

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lw1/h;->c:Ljava/util/UUID;

    invoke-static {p1, v0, v1}, Lw1/h;->z(Lw1/m;Ljava/util/UUID;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget v0, p1, Lw1/m;->m:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, v2}, Lw1/m;->e(I)Lw1/m$b;

    move-result-object v0

    sget-object v3, Ls1/i;->b:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Lw1/m$b;->d(Ljava/util/UUID;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lw1/h;->c:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "DefaultDrmSessionMgr"

    invoke-static {v3, v0}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_0
    iget-object p1, p1, Lw1/m;->l:Ljava/lang/String;

    if-eqz p1, :cond_8

    const-string v0, "cenc"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    const-string v0, "cbcs"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget p1, Lp3/n0;->a:I

    const/16 v0, 0x19

    if-lt p1, v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    return v1

    :cond_5
    const-string v0, "cbc1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "cens"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    return v1

    :cond_7
    :goto_2
    return v2

    :cond_8
    :goto_3
    return v1
.end method

.method private x(Ljava/util/List;ZLw1/w$a;)Lw1/g;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw1/m$b;",
            ">;Z",
            "Lw1/w$a;",
            ")",
            "Lw1/g;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lw1/h;->r:Lw1/g0;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, v0, Lw1/h;->i:Z

    or-int v9, v1, p2

    new-instance v1, Lw1/g;

    iget-object v3, v0, Lw1/h;->c:Ljava/util/UUID;

    iget-object v4, v0, Lw1/h;->r:Lw1/g0;

    iget-object v5, v0, Lw1/h;->j:Lw1/h$g;

    iget-object v6, v0, Lw1/h;->l:Lw1/h$h;

    iget v8, v0, Lw1/h;->w:I

    iget-object v11, v0, Lw1/h;->x:[B

    iget-object v12, v0, Lw1/h;->f:Ljava/util/HashMap;

    iget-object v13, v0, Lw1/h;->e:Lw1/n0;

    iget-object v2, v0, Lw1/h;->u:Landroid/os/Looper;

    invoke-static {v2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/os/Looper;

    iget-object v15, v0, Lw1/h;->k:Lo3/g0;

    iget-object v2, v0, Lw1/h;->y:Lt1/t1;

    invoke-static {v2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lt1/t1;

    move-object v2, v1

    move-object/from16 v7, p1

    move/from16 v10, p2

    invoke-direct/range {v2 .. v16}, Lw1/g;-><init>(Ljava/util/UUID;Lw1/g0;Lw1/g$a;Lw1/g$b;Ljava/util/List;IZZ[BLjava/util/HashMap;Lw1/n0;Landroid/os/Looper;Lo3/g0;Lt1/t1;)V

    move-object/from16 v2, p3

    invoke-virtual {v1, v2}, Lw1/g;->f(Lw1/w$a;)V

    iget-wide v2, v0, Lw1/h;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lw1/g;->f(Lw1/w$a;)V

    :cond_0
    return-object v1
.end method

.method private y(Ljava/util/List;ZLw1/w$a;Z)Lw1/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw1/m$b;",
            ">;Z",
            "Lw1/w$a;",
            "Z)",
            "Lw1/g;"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lw1/h;->x(Ljava/util/List;ZLw1/w$a;)Lw1/g;

    move-result-object v0

    invoke-static {v0}, Lw1/h;->v(Lw1/o;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lw1/h;->p:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lw1/h;->E()V

    invoke-direct {p0, v0, p3}, Lw1/h;->H(Lw1/o;Lw1/w$a;)V

    invoke-direct {p0, p1, p2, p3}, Lw1/h;->x(Ljava/util/List;ZLw1/w$a;)Lw1/g;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lw1/h;->v(Lw1/o;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p4, :cond_2

    iget-object p4, p0, Lw1/h;->o:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_2

    invoke-direct {p0}, Lw1/h;->F()V

    iget-object p4, p0, Lw1/h;->p:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-direct {p0}, Lw1/h;->E()V

    :cond_1
    invoke-direct {p0, v0, p3}, Lw1/h;->H(Lw1/o;Lw1/w$a;)V

    invoke-direct {p0, p1, p2, p3}, Lw1/h;->x(Ljava/util/List;ZLw1/w$a;)Lw1/g;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method private static z(Lw1/m;Ljava/util/UUID;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/m;",
            "Ljava/util/UUID;",
            "Z)",
            "Ljava/util/List<",
            "Lw1/m$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lw1/m;->m:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lw1/m;->m:I

    if-ge v2, v3, :cond_4

    invoke-virtual {p0, v2}, Lw1/m;->e(I)Lw1/m$b;

    move-result-object v3

    invoke-virtual {v3, p1}, Lw1/m$b;->d(Ljava/util/UUID;)Z

    move-result v4

    if-nez v4, :cond_1

    sget-object v4, Ls1/i;->c:Ljava/util/UUID;

    invoke-virtual {v4, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Ls1/i;->b:Ljava/util/UUID;

    invoke-virtual {v3, v4}, Lw1/m$b;->d(Ljava/util/UUID;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, 0x1

    :goto_2
    if-eqz v4, :cond_3

    iget-object v4, v3, Lw1/m$b;->n:[B

    if-nez v4, :cond_2

    if-eqz p2, :cond_3

    :cond_2
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method


# virtual methods
.method public G(I[B)V
    .locals 1

    iget-object v0, p0, Lw1/h;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lp3/a;->f(Z)V

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iput p1, p0, Lw1/h;->w:I

    iput-object p2, p0, Lw1/h;->x:[B

    return-void
.end method

.method public final a()V
    .locals 5

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw1/h;->I(Z)V

    iget v1, p0, Lw1/h;->q:I

    sub-int/2addr v1, v0

    iput v1, p0, Lw1/h;->q:I

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lw1/h;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lw1/h;->n:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw1/g;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lw1/g;->d(Lw1/w$a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lw1/h;->F()V

    invoke-direct {p0}, Lw1/h;->D()V

    return-void
.end method

.method public final b()V
    .locals 6

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw1/h;->I(Z)V

    iget v0, p0, Lw1/h;->q:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lw1/h;->q:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw1/h;->r:Lw1/g0;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lw1/h;->d:Lw1/g0$c;

    iget-object v2, p0, Lw1/h;->c:Ljava/util/UUID;

    invoke-interface {v0, v2}, Lw1/g0$c;->a(Ljava/util/UUID;)Lw1/g0;

    move-result-object v0

    iput-object v0, p0, Lw1/h;->r:Lw1/g0;

    new-instance v2, Lw1/h$c;

    invoke-direct {v2, p0, v1}, Lw1/h$c;-><init>(Lw1/h;Lw1/h$a;)V

    invoke-interface {v0, v2}, Lw1/g0;->l(Lw1/g0$b;)V

    goto :goto_1

    :cond_1
    iget-wide v2, p0, Lw1/h;->m:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lw1/h;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lw1/h;->n:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw1/g;

    invoke-virtual {v2, v1}, Lw1/g;->f(Lw1/w$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public c(Lw1/w$a;Ls1/n1;)Lw1/o;
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw1/h;->I(Z)V

    iget v1, p0, Lw1/h;->q:I

    const/4 v2, 0x1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Lw1/h;->u:Landroid/os/Looper;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lw1/h;->u:Landroid/os/Looper;

    invoke-direct {p0, v0, p1, p2, v2}, Lw1/h;->u(Landroid/os/Looper;Lw1/w$a;Ls1/n1;Z)Lw1/o;

    move-result-object p1

    return-object p1
.end method

.method public d(Lw1/w$a;Ls1/n1;)Lw1/y$b;
    .locals 1

    iget v0, p0, Lw1/h;->q:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Lw1/h;->u:Landroid/os/Looper;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lw1/h$f;

    invoke-direct {v0, p0, p1}, Lw1/h$f;-><init>(Lw1/h;Lw1/w$a;)V

    invoke-virtual {v0, p2}, Lw1/h$f;->d(Ls1/n1;)V

    return-object v0
.end method

.method public e(Landroid/os/Looper;Lt1/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/h;->A(Landroid/os/Looper;)V

    iput-object p2, p0, Lw1/h;->y:Lt1/t1;

    return-void
.end method

.method public f(Ls1/n1;)I
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw1/h;->I(Z)V

    iget-object v1, p0, Lw1/h;->r:Lw1/g0;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw1/g0;

    invoke-interface {v1}, Lw1/g0;->k()I

    move-result v1

    iget-object v2, p1, Ls1/n1;->x:Lw1/m;

    if-nez v2, :cond_1

    iget-object p1, p1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {p1}, Lp3/v;->k(Ljava/lang/String;)I

    move-result p1

    iget-object v2, p0, Lw1/h;->h:[I

    invoke-static {v2, p1}, Lp3/n0;->y0([II)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_0

    move v0, v1

    :cond_0
    return v0

    :cond_1
    invoke-direct {p0, v2}, Lw1/h;->w(Lw1/m;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    :goto_0
    return v1
.end method
