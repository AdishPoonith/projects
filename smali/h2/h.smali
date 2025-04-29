.class public final Lh2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/l;


# static fields
.field public static final m:Lx1/r;


# instance fields
.field private final a:I

.field private final b:Lh2/i;

.field private final c:Lp3/a0;

.field private final d:Lp3/a0;

.field private final e:Lp3/z;

.field private f:Lx1/n;

.field private g:J

.field private h:J

.field private i:I

.field private j:Z

.field private k:Z

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lh2/g;->b:Lh2/g;

    sput-object v0, Lh2/h;->m:Lx1/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh2/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Lh2/h;->a:I

    new-instance p1, Lh2/i;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lh2/i;-><init>(Z)V

    iput-object p1, p0, Lh2/h;->b:Lh2/i;

    new-instance p1, Lp3/a0;

    const/16 v0, 0x800

    invoke-direct {p1, v0}, Lp3/a0;-><init>(I)V

    iput-object p1, p0, Lh2/h;->c:Lp3/a0;

    const/4 p1, -0x1

    iput p1, p0, Lh2/h;->i:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lh2/h;->h:J

    new-instance p1, Lp3/a0;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lp3/a0;-><init>(I)V

    iput-object p1, p0, Lh2/h;->d:Lp3/a0;

    new-instance v0, Lp3/z;

    invoke-virtual {p1}, Lp3/a0;->e()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lp3/z;-><init>([B)V

    iput-object v0, p0, Lh2/h;->e:Lp3/z;

    return-void
.end method

.method public static synthetic d()[Lx1/l;
    .locals 1

    invoke-static {}, Lh2/h;->h()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method private e(Lx1/m;)V
    .locals 9

    iget-boolean v0, p0, Lh2/h;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lh2/h;->i:I

    invoke-interface {p1}, Lx1/m;->f()V

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    invoke-direct {p0, p1}, Lh2/h;->l(Lx1/m;)I

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_2
    const/4 v5, 0x1

    :try_start_0
    iget-object v6, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v6}, Lp3/a0;->e()[B

    move-result-object v6

    const/4 v7, 0x2

    invoke-interface {p1, v6, v1, v7, v5}, Lx1/m;->k([BIIZ)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v6, v1}, Lp3/a0;->T(I)V

    iget-object v6, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v6}, Lp3/a0;->M()I

    move-result v6

    invoke-static {v6}, Lh2/i;->m(I)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    iget-object v6, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v6}, Lp3/a0;->e()[B

    move-result-object v6

    const/4 v7, 0x4

    invoke-interface {p1, v6, v1, v7, v5}, Lx1/m;->k([BIIZ)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    iget-object v6, p0, Lh2/h;->e:Lp3/z;

    const/16 v7, 0xe

    invoke-virtual {v6, v7}, Lp3/z;->p(I)V

    iget-object v6, p0, Lh2/h;->e:Lp3/z;

    const/16 v7, 0xd

    invoke-virtual {v6, v7}, Lp3/z;->h(I)I

    move-result v6

    const/4 v7, 0x6

    if-le v6, v7, :cond_6

    int-to-long v7, v6

    add-long/2addr v3, v7

    add-int/lit8 v2, v2, 0x1

    const/16 v7, 0x3e8

    if-ne v2, v7, :cond_5

    goto :goto_0

    :cond_5
    add-int/lit8 v6, v6, -0x6

    invoke-interface {p1, v6, v5}, Lx1/m;->i(IZ)Z

    move-result v6

    if-nez v6, :cond_2

    :goto_0
    goto :goto_1

    :cond_6
    iput-boolean v5, p0, Lh2/h;->j:Z

    const-string v1, "Malformed ADTS stream"

    const/4 v6, 0x0

    invoke-static {v1, v6}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object v1

    throw v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_7
    :goto_1
    move v1, v2

    :goto_2
    invoke-interface {p1}, Lx1/m;->f()V

    if-lez v1, :cond_8

    int-to-long v0, v1

    div-long/2addr v3, v0

    long-to-int p1, v3

    iput p1, p0, Lh2/h;->i:I

    goto :goto_3

    :cond_8
    iput v0, p0, Lh2/h;->i:I

    :goto_3
    iput-boolean v5, p0, Lh2/h;->j:Z

    return-void
.end method

.method private static f(IJ)I
    .locals 4

    int-to-long v0, p0

    const-wide/16 v2, 0x8

    mul-long v0, v0, v2

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    div-long/2addr v0, p1

    long-to-int p0, v0

    return p0
.end method

.method private g(JZ)Lx1/b0;
    .locals 11

    iget v0, p0, Lh2/h;->i:I

    iget-object v1, p0, Lh2/h;->b:Lh2/i;

    invoke-virtual {v1}, Lh2/i;->k()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lh2/h;->f(IJ)I

    move-result v8

    new-instance v0, Lx1/e;

    iget-wide v6, p0, Lh2/h;->h:J

    iget v9, p0, Lh2/h;->i:I

    move-object v3, v0

    move-wide v4, p1

    move v10, p3

    invoke-direct/range {v3 .. v10}, Lx1/e;-><init>(JJIIZ)V

    return-object v0
.end method

.method private static synthetic h()[Lx1/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx1/l;

    new-instance v1, Lh2/h;

    invoke-direct {v1}, Lh2/h;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private k(JZ)V
    .locals 8

    iget-boolean v0, p0, Lh2/h;->l:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lh2/h;->a:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, Lh2/h;->i:I

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_2

    iget-object v5, p0, Lh2/h;->b:Lh2/i;

    invoke-virtual {v5}, Lh2/i;->k()J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-nez v7, :cond_2

    if-nez p3, :cond_2

    return-void

    :cond_2
    if-eqz v0, :cond_4

    iget-object p3, p0, Lh2/h;->b:Lh2/i;

    invoke-virtual {p3}, Lh2/i;->k()J

    move-result-wide v5

    cmp-long p3, v5, v3

    if-eqz p3, :cond_4

    iget-object p3, p0, Lh2/h;->f:Lx1/n;

    iget v0, p0, Lh2/h;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-direct {p0, p1, p2, v2}, Lh2/h;->g(JZ)Lx1/b0;

    move-result-object p1

    invoke-interface {p3, p1}, Lx1/n;->t(Lx1/b0;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lh2/h;->f:Lx1/n;

    new-instance p2, Lx1/b0$b;

    invoke-direct {p2, v3, v4}, Lx1/b0$b;-><init>(J)V

    invoke-interface {p1, p2}, Lx1/n;->t(Lx1/b0;)V

    :goto_1
    iput-boolean v1, p0, Lh2/h;->l:Z

    return-void
.end method

.method private l(Lx1/m;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->e()[B

    move-result-object v2

    const/16 v3, 0xa

    invoke-interface {p1, v2, v0, v3}, Lx1/m;->n([BII)V

    iget-object v2, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v2, v0}, Lp3/a0;->T(I)V

    iget-object v2, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->J()I

    move-result v2

    const v3, 0x494433

    if-eq v2, v3, :cond_1

    invoke-interface {p1}, Lx1/m;->f()V

    invoke-interface {p1, v1}, Lx1/m;->o(I)V

    iget-wide v2, p0, Lh2/h;->h:J

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    int-to-long v2, v1

    iput-wide v2, p0, Lh2/h;->h:J

    :cond_0
    return v1

    :cond_1
    iget-object v2, p0, Lh2/h;->d:Lp3/a0;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Lp3/a0;->U(I)V

    iget-object v2, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->F()I

    move-result v2

    add-int/lit8 v3, v2, 0xa

    add-int/2addr v1, v3

    invoke-interface {p1, v2}, Lx1/m;->o(I)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lh2/h;->k:Z

    iget-object p1, p0, Lh2/h;->b:Lh2/i;

    invoke-virtual {p1}, Lh2/i;->b()V

    iput-wide p3, p0, Lh2/h;->g:J

    return-void
.end method

.method public c(Lx1/n;)V
    .locals 4

    iput-object p1, p0, Lh2/h;->f:Lx1/n;

    iget-object v0, p0, Lh2/h;->b:Lh2/i;

    new-instance v1, Lh2/i0$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lh2/i0$d;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Lh2/i;->c(Lx1/n;Lh2/i0$d;)V

    invoke-interface {p1}, Lx1/n;->k()V

    return-void
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 7

    iget-object p2, p0, Lh2/h;->f:Lx1/n;

    invoke-static {p2}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v0

    iget p2, p0, Lh2/h;->a:I

    and-int/lit8 v2, p2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    and-int/2addr p2, v3

    if-eqz p2, :cond_0

    const-wide/16 v5, -0x1

    cmp-long p2, v0, v5

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_2

    invoke-direct {p0, p1}, Lh2/h;->e(Lx1/m;)V

    :cond_2
    iget-object p2, p0, Lh2/h;->c:Lp3/a0;

    invoke-virtual {p2}, Lp3/a0;->e()[B

    move-result-object p2

    const/16 v2, 0x800

    invoke-interface {p1, p2, v4, v2}, Lx1/m;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    invoke-direct {p0, v0, v1, v2}, Lh2/h;->k(JZ)V

    if-eqz v2, :cond_4

    return p2

    :cond_4
    iget-object p2, p0, Lh2/h;->c:Lp3/a0;

    invoke-virtual {p2, v4}, Lp3/a0;->T(I)V

    iget-object p2, p0, Lh2/h;->c:Lp3/a0;

    invoke-virtual {p2, p1}, Lp3/a0;->S(I)V

    iget-boolean p1, p0, Lh2/h;->k:Z

    if-nez p1, :cond_5

    iget-object p1, p0, Lh2/h;->b:Lh2/i;

    iget-wide v0, p0, Lh2/h;->g:J

    const/4 p2, 0x4

    invoke-virtual {p1, v0, v1, p2}, Lh2/i;->e(JI)V

    iput-boolean v3, p0, Lh2/h;->k:Z

    :cond_5
    iget-object p1, p0, Lh2/h;->b:Lh2/i;

    iget-object p2, p0, Lh2/h;->c:Lp3/a0;

    invoke-virtual {p1, p2}, Lh2/i;->a(Lp3/a0;)V

    return v4
.end method

.method public j(Lx1/m;)Z
    .locals 8

    invoke-direct {p0, p1}, Lh2/h;->l(Lx1/m;)I

    move-result v0

    const/4 v1, 0x0

    move v3, v0

    const/4 v2, 0x0

    const/4 v4, 0x0

    :cond_0
    iget-object v5, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v5}, Lp3/a0;->e()[B

    move-result-object v5

    const/4 v6, 0x2

    invoke-interface {p1, v5, v1, v6}, Lx1/m;->n([BII)V

    iget-object v5, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v5, v1}, Lp3/a0;->T(I)V

    iget-object v5, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v5}, Lp3/a0;->M()I

    move-result v5

    invoke-static {v5}, Lh2/i;->m(I)Z

    move-result v5

    if-nez v5, :cond_1

    :goto_0
    add-int/lit8 v3, v3, 0x1

    invoke-interface {p1}, Lx1/m;->f()V

    invoke-interface {p1, v3}, Lx1/m;->o(I)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    add-int/2addr v2, v5

    const/4 v6, 0x4

    if-lt v2, v6, :cond_2

    const/16 v7, 0xbc

    if-le v4, v7, :cond_2

    return v5

    :cond_2
    iget-object v5, p0, Lh2/h;->d:Lp3/a0;

    invoke-virtual {v5}, Lp3/a0;->e()[B

    move-result-object v5

    invoke-interface {p1, v5, v1, v6}, Lx1/m;->n([BII)V

    iget-object v5, p0, Lh2/h;->e:Lp3/z;

    const/16 v6, 0xe

    invoke-virtual {v5, v6}, Lp3/z;->p(I)V

    iget-object v5, p0, Lh2/h;->e:Lp3/z;

    const/16 v6, 0xd

    invoke-virtual {v5, v6}, Lp3/z;->h(I)I

    move-result v5

    const/4 v6, 0x6

    if-gt v5, v6, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v6, v5, -0x6

    invoke-interface {p1, v6}, Lx1/m;->o(I)V

    add-int/2addr v4, v5

    :goto_1
    sub-int v5, v3, v0

    const/16 v6, 0x2000

    if-lt v5, v6, :cond_0

    return v1
.end method
