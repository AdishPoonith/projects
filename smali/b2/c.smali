.class public final Lb2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/l;


# static fields
.field public static final q:Lx1/r;


# instance fields
.field private final a:Lp3/a0;

.field private final b:Lp3/a0;

.field private final c:Lp3/a0;

.field private final d:Lp3/a0;

.field private final e:Lb2/d;

.field private f:Lx1/n;

.field private g:I

.field private h:Z

.field private i:J

.field private j:I

.field private k:I

.field private l:I

.field private m:J

.field private n:Z

.field private o:Lb2/a;

.field private p:Lb2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lb2/b;->b:Lb2/b;

    sput-object v0, Lb2/c;->q:Lx1/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp3/a0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    iput-object v0, p0, Lb2/c;->a:Lp3/a0;

    new-instance v0, Lp3/a0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    iput-object v0, p0, Lb2/c;->b:Lp3/a0;

    new-instance v0, Lp3/a0;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    iput-object v0, p0, Lb2/c;->c:Lp3/a0;

    new-instance v0, Lp3/a0;

    invoke-direct {v0}, Lp3/a0;-><init>()V

    iput-object v0, p0, Lb2/c;->d:Lp3/a0;

    new-instance v0, Lb2/d;

    invoke-direct {v0}, Lb2/d;-><init>()V

    iput-object v0, p0, Lb2/c;->e:Lb2/d;

    const/4 v0, 0x1

    iput v0, p0, Lb2/c;->g:I

    return-void
.end method

.method public static synthetic d()[Lx1/l;
    .locals 1

    invoke-static {}, Lb2/c;->g()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 4

    iget-boolean v0, p0, Lb2/c;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb2/c;->f:Lx1/n;

    new-instance v1, Lx1/b0$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Lx1/b0$b;-><init>(J)V

    invoke-interface {v0, v1}, Lx1/n;->t(Lx1/b0;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb2/c;->n:Z

    :cond_0
    return-void
.end method

.method private f()J
    .locals 5

    iget-boolean v0, p0, Lb2/c;->h:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lb2/c;->i:J

    iget-wide v2, p0, Lb2/c;->m:J

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb2/c;->e:Lb2/d;

    invoke-virtual {v0}, Lb2/d;->d()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lb2/c;->m:J

    :goto_0
    return-wide v0
.end method

.method private static synthetic g()[Lx1/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx1/l;

    new-instance v1, Lb2/c;

    invoke-direct {v1}, Lb2/c;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private h(Lx1/m;)Lp3/a0;
    .locals 4

    iget v0, p0, Lb2/c;->l:I

    iget-object v1, p0, Lb2/c;->d:Lp3/a0;

    invoke-virtual {v1}, Lp3/a0;->b()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lb2/c;->d:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    iget v3, p0, Lb2/c;->l:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1, v2}, Lp3/a0;->R([BI)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb2/c;->d:Lp3/a0;

    invoke-virtual {v0, v2}, Lp3/a0;->T(I)V

    :goto_0
    iget-object v0, p0, Lb2/c;->d:Lp3/a0;

    iget v1, p0, Lb2/c;->l:I

    invoke-virtual {v0, v1}, Lp3/a0;->S(I)V

    iget-object v0, p0, Lb2/c;->d:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    iget v1, p0, Lb2/c;->l:I

    invoke-interface {p1, v0, v2, v1}, Lx1/m;->readFully([BII)V

    iget-object p1, p0, Lb2/c;->d:Lp3/a0;

    return-object p1
.end method

.method private k(Lx1/m;)Z
    .locals 6

    iget-object v0, p0, Lb2/c;->b:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lx1/m;->c([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lb2/c;->b:Lp3/a0;

    invoke-virtual {p1, v1}, Lp3/a0;->T(I)V

    iget-object p1, p0, Lb2/c;->b:Lp3/a0;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lp3/a0;->U(I)V

    iget-object p1, p0, Lb2/c;->b:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result p1

    and-int/lit8 v4, p1, 0x4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    and-int/2addr p1, v3

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    if-eqz v4, :cond_3

    iget-object p1, p0, Lb2/c;->o:Lb2/a;

    if-nez p1, :cond_3

    new-instance p1, Lb2/a;

    iget-object v4, p0, Lb2/c;->f:Lx1/n;

    const/16 v5, 0x8

    invoke-interface {v4, v5, v3}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v4

    invoke-direct {p1, v4}, Lb2/a;-><init>(Lx1/e0;)V

    iput-object p1, p0, Lb2/c;->o:Lb2/a;

    :cond_3
    const/4 p1, 0x2

    if-eqz v1, :cond_4

    iget-object v1, p0, Lb2/c;->p:Lb2/f;

    if-nez v1, :cond_4

    new-instance v1, Lb2/f;

    iget-object v4, p0, Lb2/c;->f:Lx1/n;

    invoke-interface {v4, v2, p1}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v4

    invoke-direct {v1, v4}, Lb2/f;-><init>(Lx1/e0;)V

    iput-object v1, p0, Lb2/c;->p:Lb2/f;

    :cond_4
    iget-object v1, p0, Lb2/c;->f:Lx1/n;

    invoke-interface {v1}, Lx1/n;->k()V

    iget-object v1, p0, Lb2/c;->b:Lp3/a0;

    invoke-virtual {v1}, Lp3/a0;->p()I

    move-result v1

    sub-int/2addr v1, v2

    add-int/2addr v1, v0

    iput v1, p0, Lb2/c;->j:I

    iput p1, p0, Lb2/c;->g:I

    return v3
.end method

.method private l(Lx1/m;)Z
    .locals 9

    invoke-direct {p0}, Lb2/c;->f()J

    move-result-wide v0

    iget v2, p0, Lb2/c;->k:I

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/16 v7, 0x8

    if-ne v2, v7, :cond_1

    iget-object v7, p0, Lb2/c;->o:Lb2/a;

    if-eqz v7, :cond_1

    invoke-direct {p0}, Lb2/c;->e()V

    iget-object v2, p0, Lb2/c;->o:Lb2/a;

    :goto_0
    invoke-direct {p0, p1}, Lb2/c;->h(Lx1/m;)Lp3/a0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lb2/e;->a(Lp3/a0;J)Z

    move-result v5

    :cond_0
    :goto_1
    const/4 p1, 0x1

    goto :goto_2

    :cond_1
    const/16 v7, 0x9

    if-ne v2, v7, :cond_2

    iget-object v7, p0, Lb2/c;->p:Lb2/f;

    if-eqz v7, :cond_2

    invoke-direct {p0}, Lb2/c;->e()V

    iget-object v2, p0, Lb2/c;->p:Lb2/f;

    goto :goto_0

    :cond_2
    const/16 v7, 0x12

    if-ne v2, v7, :cond_3

    iget-boolean v2, p0, Lb2/c;->n:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lb2/c;->e:Lb2/d;

    invoke-direct {p0, p1}, Lb2/c;->h(Lx1/m;)Lp3/a0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lb2/e;->a(Lp3/a0;J)Z

    move-result v5

    iget-object p1, p0, Lb2/c;->e:Lb2/d;

    invoke-virtual {p1}, Lb2/d;->d()J

    move-result-wide v0

    cmp-long p1, v0, v3

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb2/c;->f:Lx1/n;

    new-instance v2, Lx1/z;

    iget-object v7, p0, Lb2/c;->e:Lb2/d;

    invoke-virtual {v7}, Lb2/d;->e()[J

    move-result-object v7

    iget-object v8, p0, Lb2/c;->e:Lb2/d;

    invoke-virtual {v8}, Lb2/d;->f()[J

    move-result-object v8

    invoke-direct {v2, v7, v8, v0, v1}, Lx1/z;-><init>([J[JJ)V

    invoke-interface {p1, v2}, Lx1/n;->t(Lx1/b0;)V

    iput-boolean v6, p0, Lb2/c;->n:Z

    goto :goto_1

    :cond_3
    iget v0, p0, Lb2/c;->l:I

    invoke-interface {p1, v0}, Lx1/m;->g(I)V

    const/4 p1, 0x0

    :goto_2
    iget-boolean v0, p0, Lb2/c;->h:Z

    if-nez v0, :cond_5

    if-eqz v5, :cond_5

    iput-boolean v6, p0, Lb2/c;->h:Z

    iget-object v0, p0, Lb2/c;->e:Lb2/d;

    invoke-virtual {v0}, Lb2/d;->d()J

    move-result-wide v0

    cmp-long v2, v0, v3

    if-nez v2, :cond_4

    iget-wide v0, p0, Lb2/c;->m:J

    neg-long v0, v0

    goto :goto_3

    :cond_4
    const-wide/16 v0, 0x0

    :goto_3
    iput-wide v0, p0, Lb2/c;->i:J

    :cond_5
    const/4 v0, 0x4

    iput v0, p0, Lb2/c;->j:I

    const/4 v0, 0x2

    iput v0, p0, Lb2/c;->g:I

    return p1
.end method

.method private m(Lx1/m;)Z
    .locals 6

    iget-object v0, p0, Lb2/c;->c:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xb

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lx1/m;->c([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lb2/c;->c:Lp3/a0;

    invoke-virtual {p1, v1}, Lp3/a0;->T(I)V

    iget-object p1, p0, Lb2/c;->c:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result p1

    iput p1, p0, Lb2/c;->k:I

    iget-object p1, p0, Lb2/c;->c:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->J()I

    move-result p1

    iput p1, p0, Lb2/c;->l:I

    iget-object p1, p0, Lb2/c;->c:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->J()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lb2/c;->m:J

    iget-object p1, p0, Lb2/c;->c:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result p1

    shl-int/lit8 p1, p1, 0x18

    int-to-long v0, p1

    iget-wide v4, p0, Lb2/c;->m:J

    or-long/2addr v0, v4

    const-wide/16 v4, 0x3e8

    mul-long v0, v0, v4

    iput-wide v0, p0, Lb2/c;->m:J

    iget-object p1, p0, Lb2/c;->c:Lp3/a0;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lp3/a0;->U(I)V

    const/4 p1, 0x4

    iput p1, p0, Lb2/c;->g:I

    return v3
.end method

.method private n(Lx1/m;)V
    .locals 1

    iget v0, p0, Lb2/c;->j:I

    invoke-interface {p1, v0}, Lx1/m;->g(I)V

    const/4 p1, 0x0

    iput p1, p0, Lb2/c;->j:I

    const/4 p1, 0x3

    iput p1, p0, Lb2/c;->g:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 2

    const/4 p3, 0x0

    const-wide/16 v0, 0x0

    cmp-long p4, p1, v0

    if-nez p4, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lb2/c;->g:I

    iput-boolean p3, p0, Lb2/c;->h:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Lb2/c;->g:I

    :goto_0
    iput p3, p0, Lb2/c;->j:I

    return-void
.end method

.method public c(Lx1/n;)V
    .locals 0

    iput-object p1, p0, Lb2/c;->f:Lx1/n;

    return-void
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 2

    iget-object p2, p0, Lb2/c;->f:Lx1/n;

    invoke-static {p2}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    iget p2, p0, Lb2/c;->g:I

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    invoke-direct {p0, p1}, Lb2/c;->l(Lx1/m;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-direct {p0, p1}, Lb2/c;->m(Lx1/m;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1

    :cond_3
    invoke-direct {p0, p1}, Lb2/c;->n(Lx1/m;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1}, Lb2/c;->k(Lx1/m;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1
.end method

.method public j(Lx1/m;)Z
    .locals 3

    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {p1, v0, v1, v2}, Lx1/m;->n([BII)V

    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0, v1}, Lp3/a0;->T(I)V

    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->J()I

    move-result v0

    const v2, 0x464c56

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x2

    invoke-interface {p1, v0, v1, v2}, Lx1/m;->n([BII)V

    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0, v1}, Lp3/a0;->T(I)V

    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->M()I

    move-result v0

    and-int/lit16 v0, v0, 0xfa

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lx1/m;->n([BII)V

    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0, v1}, Lp3/a0;->T(I)V

    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->p()I

    move-result v0

    invoke-interface {p1}, Lx1/m;->f()V

    invoke-interface {p1, v0}, Lx1/m;->o(I)V

    iget-object v0, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v1, v2}, Lx1/m;->n([BII)V

    iget-object p1, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {p1, v1}, Lp3/a0;->T(I)V

    iget-object p1, p0, Lb2/c;->a:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->p()I

    move-result p1

    if-nez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method
