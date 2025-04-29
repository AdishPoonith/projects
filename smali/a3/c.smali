.class public final La3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/l;
.implements Lo3/h0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La3/c$b;,
        La3/c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La3/l;",
        "Lo3/h0$b<",
        "Lo3/j0<",
        "La3/i;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final y:La3/l$a;


# instance fields
.field private final j:Lz2/g;

.field private final k:La3/k;

.field private final l:Lo3/g0;

.field private final m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/net/Uri;",
            "La3/c$c;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "La3/l$b;",
            ">;"
        }
    .end annotation
.end field

.field private final o:D

.field private p:Lu2/b0$a;

.field private q:Lo3/h0;

.field private r:Landroid/os/Handler;

.field private s:La3/l$e;

.field private t:La3/h;

.field private u:Landroid/net/Uri;

.field private v:La3/g;

.field private w:Z

.field private x:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, La3/b;->a:La3/b;

    sput-object v0, La3/c;->y:La3/l$a;

    return-void
.end method

.method public constructor <init>(Lz2/g;Lo3/g0;La3/k;)V
    .locals 6

    const-wide/high16 v4, 0x400c000000000000L    # 3.5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, La3/c;-><init>(Lz2/g;Lo3/g0;La3/k;D)V

    return-void
.end method

.method public constructor <init>(Lz2/g;Lo3/g0;La3/k;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/c;->j:Lz2/g;

    iput-object p3, p0, La3/c;->k:La3/k;

    iput-object p2, p0, La3/c;->l:Lo3/g0;

    iput-wide p4, p0, La3/c;->o:D

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, La3/c;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La3/c;->m:Ljava/util/HashMap;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, La3/c;->x:J

    return-void
.end method

.method static synthetic A(La3/c;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, La3/c;->m:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic B(La3/c;)Lz2/g;
    .locals 0

    iget-object p0, p0, La3/c;->j:Lz2/g;

    return-object p0
.end method

.method static synthetic C(La3/c;)Lu2/b0$a;
    .locals 0

    iget-object p0, p0, La3/c;->p:Lu2/b0$a;

    return-object p0
.end method

.method static synthetic D(La3/c;)Lo3/g0;
    .locals 0

    iget-object p0, p0, La3/c;->l:Lo3/g0;

    return-object p0
.end method

.method private E(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    new-instance v3, La3/c$c;

    invoke-direct {v3, p0, v2}, La3/c$c;-><init>(La3/c;Landroid/net/Uri;)V

    iget-object v4, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static F(La3/g;La3/g;)La3/g$d;
    .locals 4

    iget-wide v0, p1, La3/g;->k:J

    iget-wide v2, p0, La3/g;->k:J

    sub-long/2addr v0, v2

    long-to-int p1, v0

    iget-object p0, p0, La3/g;->r:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La3/g$d;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private G(La3/g;La3/g;)La3/g;
    .locals 2

    invoke-virtual {p2, p1}, La3/g;->f(La3/g;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean p2, p2, La3/g;->o:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, La3/g;->d()La3/g;

    move-result-object p1

    :cond_0
    return-object p1

    :cond_1
    invoke-direct {p0, p1, p2}, La3/c;->I(La3/g;La3/g;)J

    move-result-wide v0

    invoke-direct {p0, p1, p2}, La3/c;->H(La3/g;La3/g;)I

    move-result p1

    invoke-virtual {p2, v0, v1, p1}, La3/g;->c(JI)La3/g;

    move-result-object p1

    return-object p1
.end method

.method private H(La3/g;La3/g;)I
    .locals 3

    iget-boolean v0, p2, La3/g;->i:Z

    if-eqz v0, :cond_0

    iget p1, p2, La3/g;->j:I

    return p1

    :cond_0
    iget-object v0, p0, La3/c;->v:La3/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, La3/g;->j:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    return v0

    :cond_2
    invoke-static {p1, p2}, La3/c;->F(La3/g;La3/g;)La3/g$d;

    move-result-object v2

    if-eqz v2, :cond_3

    iget p1, p1, La3/g;->j:I

    iget v0, v2, La3/g$e;->m:I

    add-int/2addr p1, v0

    iget-object p2, p2, La3/g;->r:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La3/g$d;

    iget p2, p2, La3/g$e;->m:I

    sub-int/2addr p1, p2

    return p1

    :cond_3
    return v0
.end method

.method private I(La3/g;La3/g;)J
    .locals 8

    iget-boolean v0, p2, La3/g;->p:Z

    if-eqz v0, :cond_0

    iget-wide p1, p2, La3/g;->h:J

    return-wide p1

    :cond_0
    iget-object v0, p0, La3/c;->v:La3/g;

    if-eqz v0, :cond_1

    iget-wide v0, v0, La3/g;->h:J

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    return-wide v0

    :cond_2
    iget-object v2, p1, La3/g;->r:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {p1, p2}, La3/c;->F(La3/g;La3/g;)La3/g$d;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-wide p1, p1, La3/g;->h:J

    iget-wide v0, v3, La3/g$e;->n:J

    add-long/2addr p1, v0

    return-wide p1

    :cond_3
    int-to-long v2, v2

    iget-wide v4, p2, La3/g;->k:J

    iget-wide v6, p1, La3/g;->k:J

    sub-long/2addr v4, v6

    cmp-long p2, v2, v4

    if-nez p2, :cond_4

    invoke-virtual {p1}, La3/g;->e()J

    move-result-wide p1

    return-wide p1

    :cond_4
    return-wide v0
.end method

.method private J(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    iget-object v0, p0, La3/c;->v:La3/g;

    if-eqz v0, :cond_1

    iget-object v1, v0, La3/g;->v:La3/g$f;

    iget-boolean v1, v1, La3/g$f;->e:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, La3/g;->t:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/g$c;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    iget-wide v1, v0, La3/g$c;->b:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_HLS_msn"

    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    iget v0, v0, La3/g$c;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "_HLS_part"

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private K(Landroid/net/Uri;)Z
    .locals 4

    iget-object v0, p0, La3/c;->t:La3/h;

    iget-object v0, v0, La3/h;->e:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La3/h$b;

    iget-object v3, v3, La3/h$b;->a:Landroid/net/Uri;

    invoke-virtual {p1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private L()Z
    .locals 10

    iget-object v0, p0, La3/c;->t:La3/h;

    iget-object v0, v0, La3/h;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_1

    iget-object v6, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La3/h$b;

    iget-object v7, v7, La3/h$b;->a:Landroid/net/Uri;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La3/c$c;

    invoke-static {v6}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La3/c$c;

    invoke-static {v6}, La3/c$c;->d(La3/c$c;)J

    move-result-wide v7

    cmp-long v9, v2, v7

    if-lez v9, :cond_0

    invoke-static {v6}, La3/c$c;->e(La3/c$c;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, La3/c;->u:Landroid/net/Uri;

    invoke-direct {p0, v0}, La3/c;->J(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v6, v0}, La3/c$c;->f(La3/c$c;Landroid/net/Uri;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method

.method private M(Landroid/net/Uri;)V
    .locals 3

    iget-object v0, p0, La3/c;->u:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, La3/c;->K(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La3/c;->v:La3/g;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, La3/g;->o:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, La3/c;->u:Landroid/net/Uri;

    iget-object v0, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/c$c;

    invoke-static {v0}, La3/c$c;->g(La3/c$c;)La3/g;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-boolean v2, v1, La3/g;->o:Z

    if-eqz v2, :cond_1

    iput-object v1, p0, La3/c;->v:La3/g;

    iget-object p1, p0, La3/c;->s:La3/l$e;

    invoke-interface {p1, v1}, La3/l$e;->m(La3/g;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, La3/c;->J(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {v0, p1}, La3/c$c;->f(La3/c$c;Landroid/net/Uri;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private N(Landroid/net/Uri;Lo3/g0$c;Z)Z
    .locals 3

    iget-object v0, p0, La3/c;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/l$b;

    invoke-interface {v2, p1, p2, p3}, La3/l$b;->d(Landroid/net/Uri;Lo3/g0$c;Z)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method private R(Landroid/net/Uri;La3/g;)V
    .locals 2

    iget-object v0, p0, La3/c;->u:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La3/c;->v:La3/g;

    if-nez p1, :cond_0

    iget-boolean p1, p2, La3/g;->o:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, La3/c;->w:Z

    iget-wide v0, p2, La3/g;->h:J

    iput-wide v0, p0, La3/c;->x:J

    :cond_0
    iput-object p2, p0, La3/c;->v:La3/g;

    iget-object p1, p0, La3/c;->s:La3/l$e;

    invoke-interface {p1, p2}, La3/l$e;->m(La3/g;)V

    :cond_1
    iget-object p1, p0, La3/c;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La3/l$b;

    invoke-interface {p2}, La3/l$b;->b()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic n(La3/c;Landroid/net/Uri;Lo3/g0$c;Z)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, La3/c;->N(Landroid/net/Uri;Lo3/g0$c;Z)Z

    move-result p0

    return p0
.end method

.method static synthetic p(La3/c;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, La3/c;->r:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic q(La3/c;)La3/h;
    .locals 0

    iget-object p0, p0, La3/c;->t:La3/h;

    return-object p0
.end method

.method static synthetic r(La3/c;)La3/k;
    .locals 0

    iget-object p0, p0, La3/c;->k:La3/k;

    return-object p0
.end method

.method static synthetic s(La3/c;La3/g;La3/g;)La3/g;
    .locals 0

    invoke-direct {p0, p1, p2}, La3/c;->G(La3/g;La3/g;)La3/g;

    move-result-object p0

    return-object p0
.end method

.method static synthetic t(La3/c;Landroid/net/Uri;La3/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La3/c;->R(Landroid/net/Uri;La3/g;)V

    return-void
.end method

.method static synthetic v(La3/c;)D
    .locals 2

    iget-wide v0, p0, La3/c;->o:D

    return-wide v0
.end method

.method static synthetic w(La3/c;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, La3/c;->u:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic x(La3/c;)Z
    .locals 0

    invoke-direct {p0}, La3/c;->L()Z

    move-result p0

    return p0
.end method

.method static synthetic y(La3/c;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, La3/c;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method static synthetic z(La3/c;)La3/g;
    .locals 0

    iget-object p0, p0, La3/c;->v:La3/g;

    return-object p0
.end method


# virtual methods
.method public O(Lo3/j0;JJZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/j0<",
            "La3/i;",
            ">;JJZ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    new-instance v14, Lu2/n;

    iget-wide v3, v1, Lo3/j0;->a:J

    iget-object v5, v1, Lo3/j0;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->a()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, La3/c;->l:Lo3/g0;

    iget-wide v3, v1, Lo3/j0;->a:J

    invoke-interface {v2, v3, v4}, Lo3/g0;->a(J)V

    iget-object v1, v0, La3/c;->p:Lu2/b0$a;

    const/4 v2, 0x4

    invoke-virtual {v1, v14, v2}, Lu2/b0$a;->q(Lu2/n;I)V

    return-void
.end method

.method public P(Lo3/j0;JJ)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/j0<",
            "La3/i;",
            ">;JJ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/i;

    instance-of v3, v2, La3/g;

    if-eqz v3, :cond_0

    iget-object v4, v2, La3/i;->a:Ljava/lang/String;

    invoke-static {v4}, La3/h;->e(Ljava/lang/String;)La3/h;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v2

    check-cast v4, La3/h;

    :goto_0
    iput-object v4, v0, La3/c;->t:La3/h;

    iget-object v5, v4, La3/h;->e:Ljava/util/List;

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La3/h$b;

    iget-object v5, v5, La3/h$b;->a:Landroid/net/Uri;

    iput-object v5, v0, La3/c;->u:Landroid/net/Uri;

    iget-object v5, v0, La3/c;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v6, La3/c$b;

    const/4 v7, 0x0

    invoke-direct {v6, v0, v7}, La3/c$b;-><init>(La3/c;La3/c$a;)V

    invoke-virtual {v5, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v4, La3/h;->d:Ljava/util/List;

    invoke-direct {v0, v4}, La3/c;->E(Ljava/util/List;)V

    new-instance v4, Lu2/n;

    iget-wide v6, v1, Lo3/j0;->a:J

    iget-object v8, v1, Lo3/j0;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->f()Landroid/net/Uri;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->d()Ljava/util/Map;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->a()J

    move-result-wide v15

    move-object v5, v4

    move-wide/from16 v11, p2

    move-wide/from16 v13, p4

    invoke-direct/range {v5 .. v16}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v5, v0, La3/c;->m:Ljava/util/HashMap;

    iget-object v6, v0, La3/c;->u:Landroid/net/Uri;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La3/c$c;

    if-eqz v3, :cond_1

    check-cast v2, La3/g;

    invoke-static {v5, v2, v4}, La3/c$c;->c(La3/c$c;La3/g;Lu2/n;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, La3/c$c;->n()V

    :goto_1
    iget-object v2, v0, La3/c;->l:Lo3/g0;

    iget-wide v5, v1, Lo3/j0;->a:J

    invoke-interface {v2, v5, v6}, Lo3/g0;->a(J)V

    iget-object v1, v0, La3/c;->p:Lu2/b0$a;

    const/4 v2, 0x4

    invoke-virtual {v1, v4, v2}, Lu2/b0$a;->t(Lu2/n;I)V

    return-void
.end method

.method public Q(Lo3/j0;JJLjava/io/IOException;I)Lo3/h0$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/j0<",
            "La3/i;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lo3/h0$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    new-instance v15, Lu2/n;

    iget-wide v4, v1, Lo3/j0;->a:J

    iget-object v6, v1, Lo3/j0;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->d()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lo3/j0;->a()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v3, Lu2/q;

    iget v4, v1, Lo3/j0;->c:I

    invoke-direct {v3, v4}, Lu2/q;-><init>(I)V

    iget-object v4, v0, La3/c;->l:Lo3/g0;

    new-instance v5, Lo3/g0$c;

    move/from16 v6, p7

    invoke-direct {v5, v15, v3, v2, v6}, Lo3/g0$c;-><init>(Lu2/n;Lu2/q;Ljava/io/IOException;I)V

    invoke-interface {v4, v5}, Lo3/g0;->b(Lo3/g0$c;)J

    move-result-wide v3

    const/4 v5, 0x0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v8, v3, v6

    if-nez v8, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    iget-object v7, v0, La3/c;->p:Lu2/b0$a;

    iget v8, v1, Lo3/j0;->c:I

    invoke-virtual {v7, v15, v8, v2, v6}, Lu2/b0$a;->x(Lu2/n;ILjava/io/IOException;Z)V

    if-eqz v6, :cond_1

    iget-object v2, v0, La3/c;->l:Lo3/g0;

    iget-wide v7, v1, Lo3/j0;->a:J

    invoke-interface {v2, v7, v8}, Lo3/g0;->a(J)V

    :cond_1
    if-eqz v6, :cond_2

    sget-object v1, Lo3/h0;->g:Lo3/h0$c;

    goto :goto_1

    :cond_2
    invoke-static {v5, v3, v4}, Lo3/h0;->h(ZJ)Lo3/h0$c;

    move-result-object v1

    :goto_1
    return-object v1
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, La3/c;->w:Z

    return v0
.end method

.method public b()La3/h;
    .locals 1

    iget-object v0, p0, La3/c;->t:La3/h;

    return-object v0
.end method

.method public c(Landroid/net/Uri;J)Z
    .locals 1

    iget-object v0, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/c$c;

    if-eqz p1, :cond_0

    invoke-static {p1, p2, p3}, La3/c$c;->b(La3/c$c;J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(La3/l$b;)V
    .locals 1

    iget-object v0, p0, La3/c;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Landroid/net/Uri;)Z
    .locals 1

    iget-object v0, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/c$c;

    invoke-virtual {p1}, La3/c$c;->l()Z

    move-result p1

    return p1
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, La3/c;->q:Lo3/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo3/h0;->b()V

    :cond_0
    iget-object v0, p0, La3/c;->u:Landroid/net/Uri;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, La3/c;->h(Landroid/net/Uri;)V

    :cond_1
    return-void
.end method

.method public g(Landroid/net/Uri;Lu2/b0$a;La3/l$e;)V
    .locals 7

    invoke-static {}, Lp3/n0;->w()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, La3/c;->r:Landroid/os/Handler;

    iput-object p2, p0, La3/c;->p:Lu2/b0$a;

    iput-object p3, p0, La3/c;->s:La3/l$e;

    new-instance p3, Lo3/j0;

    iget-object v0, p0, La3/c;->j:Lz2/g;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lz2/g;->a(I)Lo3/l;

    move-result-object v0

    iget-object v2, p0, La3/c;->k:La3/k;

    invoke-interface {v2}, La3/k;->b()Lo3/j0$a;

    move-result-object v2

    invoke-direct {p3, v0, p1, v1, v2}, Lo3/j0;-><init>(Lo3/l;Landroid/net/Uri;ILo3/j0$a;)V

    iget-object p1, p0, La3/c;->q:Lo3/h0;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp3/a;->f(Z)V

    new-instance p1, Lo3/h0;

    const-string v0, "DefaultHlsPlaylistTracker:MultivariantPlaylist"

    invoke-direct {p1, v0}, Lo3/h0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, La3/c;->q:Lo3/h0;

    iget-object v0, p0, La3/c;->l:Lo3/g0;

    iget v1, p3, Lo3/j0;->c:I

    invoke-interface {v0, v1}, Lo3/g0;->d(I)I

    move-result v0

    invoke-virtual {p1, p3, p0, v0}, Lo3/h0;->n(Lo3/h0$e;Lo3/h0$b;I)J

    move-result-wide v5

    new-instance p1, Lu2/n;

    iget-wide v2, p3, Lo3/j0;->a:J

    iget-object v4, p3, Lo3/j0;->b:Lo3/p;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lu2/n;-><init>(JLo3/p;J)V

    iget p3, p3, Lo3/j0;->c:I

    invoke-virtual {p2, p1, p3}, Lu2/b0$a;->z(Lu2/n;I)V

    return-void
.end method

.method public h(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/c$c;

    invoke-virtual {p1}, La3/c$c;->r()V

    return-void
.end method

.method public bridge synthetic i(Lo3/h0$e;JJZ)V
    .locals 0

    check-cast p1, Lo3/j0;

    invoke-virtual/range {p0 .. p6}, La3/c;->O(Lo3/j0;JJZ)V

    return-void
.end method

.method public j(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/c$c;

    invoke-virtual {p1}, La3/c$c;->n()V

    return-void
.end method

.method public k(Landroid/net/Uri;Z)La3/g;
    .locals 1

    iget-object v0, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/c$c;

    invoke-virtual {v0}, La3/c$c;->k()La3/g;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, La3/c;->M(Landroid/net/Uri;)V

    :cond_0
    return-object v0
.end method

.method public l(La3/l$b;)V
    .locals 1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La3/c;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public m()J
    .locals 2

    iget-wide v0, p0, La3/c;->x:J

    return-wide v0
.end method

.method public bridge synthetic o(Lo3/h0$e;JJ)V
    .locals 0

    check-cast p1, Lo3/j0;

    invoke-virtual/range {p0 .. p5}, La3/c;->P(Lo3/j0;JJ)V

    return-void
.end method

.method public stop()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, La3/c;->u:Landroid/net/Uri;

    iput-object v0, p0, La3/c;->v:La3/g;

    iput-object v0, p0, La3/c;->t:La3/h;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, La3/c;->x:J

    iget-object v1, p0, La3/c;->q:Lo3/h0;

    invoke-virtual {v1}, Lo3/h0;->l()V

    iput-object v0, p0, La3/c;->q:Lo3/h0;

    iget-object v1, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/c$c;

    invoke-virtual {v2}, La3/c$c;->x()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, La3/c;->r:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v0, p0, La3/c;->r:Landroid/os/Handler;

    iget-object v0, p0, La3/c;->m:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public bridge synthetic u(Lo3/h0$e;JJLjava/io/IOException;I)Lo3/h0$c;
    .locals 0

    check-cast p1, Lo3/j0;

    invoke-virtual/range {p0 .. p7}, La3/c;->Q(Lo3/j0;JJLjava/io/IOException;I)Lo3/h0$c;

    move-result-object p1

    return-object p1
.end method
