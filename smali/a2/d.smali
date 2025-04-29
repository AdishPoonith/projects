.class public final La2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/l;


# static fields
.field public static final o:Lx1/r;


# instance fields
.field private final a:[B

.field private final b:Lp3/a0;

.field private final c:Z

.field private final d:Lx1/s$a;

.field private e:Lx1/n;

.field private f:Lx1/e0;

.field private g:I

.field private h:Lk2/a;

.field private i:Lx1/v;

.field private j:I

.field private k:I

.field private l:La2/b;

.field private m:I

.field private n:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, La2/c;->b:La2/c;

    sput-object v0, La2/d;->o:Lx1/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La2/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    new-array v0, v0, [B

    iput-object v0, p0, La2/d;->a:[B

    new-instance v0, Lp3/a0;

    const v1, 0x8000

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp3/a0;-><init>([BI)V

    iput-object v0, p0, La2/d;->b:Lp3/a0;

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, La2/d;->c:Z

    new-instance p1, Lx1/s$a;

    invoke-direct {p1}, Lx1/s$a;-><init>()V

    iput-object p1, p0, La2/d;->d:Lx1/s$a;

    iput v2, p0, La2/d;->g:I

    return-void
.end method

.method public static synthetic d()[Lx1/l;
    .locals 1

    invoke-static {}, La2/d;->k()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method private e(Lp3/a0;Z)J
    .locals 4

    iget-object v0, p0, La2/d;->i:Lx1/v;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lp3/a0;->f()I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Lp3/a0;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x10

    if-gt v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lp3/a0;->T(I)V

    iget-object v1, p0, La2/d;->i:Lx1/v;

    iget v2, p0, La2/d;->k:I

    iget-object v3, p0, La2/d;->d:Lx1/s$a;

    invoke-static {p1, v1, v2, v3}, Lx1/s;->d(Lp3/a0;Lx1/v;ILx1/s$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-virtual {p1, v0}, Lp3/a0;->T(I)V

    iget-object p1, p0, La2/d;->d:Lx1/s$a;

    iget-wide p1, p1, Lx1/s$a;->a:J

    return-wide p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_5

    :goto_2
    invoke-virtual {p1}, Lp3/a0;->g()I

    move-result p2

    iget v1, p0, La2/d;->j:I

    sub-int/2addr p2, v1

    if-gt v0, p2, :cond_4

    invoke-virtual {p1, v0}, Lp3/a0;->T(I)V

    const/4 p2, 0x0

    :try_start_0
    iget-object v1, p0, La2/d;->i:Lx1/v;

    iget v2, p0, La2/d;->k:I

    iget-object v3, p0, La2/d;->d:Lx1/s$a;

    invoke-static {p1, v1, v2, v3}, Lx1/s;->d(Lp3/a0;Lx1/v;ILx1/s$a;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {p1}, Lp3/a0;->f()I

    move-result v2

    invoke-virtual {p1}, Lp3/a0;->g()I

    move-result v3

    if-le v2, v3, :cond_2

    goto :goto_4

    :cond_2
    move p2, v1

    :goto_4
    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp3/a0;->g()I

    move-result p2

    invoke-virtual {p1, p2}, Lp3/a0;->T(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Lp3/a0;->T(I)V

    :goto_5
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method private f(Lx1/m;)V
    .locals 5

    invoke-static {p1}, Lx1/t;->b(Lx1/m;)I

    move-result v0

    iput v0, p0, La2/d;->k:I

    iget-object v0, p0, La2/d;->e:Lx1/n;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/n;

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v1

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v3

    invoke-direct {p0, v1, v2, v3, v4}, La2/d;->g(JJ)Lx1/b0;

    move-result-object p1

    invoke-interface {v0, p1}, Lx1/n;->t(Lx1/b0;)V

    const/4 p1, 0x5

    iput p1, p0, La2/d;->g:I

    return-void
.end method

.method private g(JJ)Lx1/b0;
    .locals 8

    iget-object v0, p0, La2/d;->i:Lx1/v;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, La2/d;->i:Lx1/v;

    iget-object v0, v2, Lx1/v;->k:Lx1/v$a;

    if-eqz v0, :cond_0

    new-instance p3, Lx1/u;

    invoke-direct {p3, v2, p1, p2}, Lx1/u;-><init>(Lx1/v;J)V

    return-object p3

    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v3, p3, v0

    if-eqz v3, :cond_1

    iget-wide v0, v2, Lx1/v;->j:J

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-lez v5, :cond_1

    new-instance v0, La2/b;

    iget v3, p0, La2/d;->k:I

    move-object v1, v0

    move-wide v4, p1

    move-wide v6, p3

    invoke-direct/range {v1 .. v7}, La2/b;-><init>(Lx1/v;IJJ)V

    iput-object v0, p0, La2/d;->l:La2/b;

    invoke-virtual {v0}, Lx1/a;->b()Lx1/b0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lx1/b0$b;

    invoke-virtual {v2}, Lx1/v;->f()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Lx1/b0$b;-><init>(J)V

    return-object p1
.end method

.method private h(Lx1/m;)V
    .locals 3

    iget-object v0, p0, La2/d;->a:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx1/m;->n([BII)V

    invoke-interface {p1}, Lx1/m;->f()V

    const/4 p1, 0x2

    iput p1, p0, La2/d;->g:I

    return-void
.end method

.method private static synthetic k()[Lx1/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx1/l;

    new-instance v1, La2/d;

    invoke-direct {v1}, La2/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private l()V
    .locals 11

    iget-wide v0, p0, La2/d;->n:J

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    iget-object v2, p0, La2/d;->i:Lx1/v;

    invoke-static {v2}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/v;

    iget v2, v2, Lx1/v;->e:I

    int-to-long v2, v2

    div-long v5, v0, v2

    iget-object v0, p0, La2/d;->f:Lx1/e0;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lx1/e0;

    iget v8, p0, La2/d;->m:I

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lx1/e0;->c(JIIILx1/e0$a;)V

    return-void
.end method

.method private m(Lx1/m;Lx1/a0;)I
    .locals 6

    iget-object v0, p0, La2/d;->f:Lx1/e0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La2/d;->i:Lx1/v;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La2/d;->l:La2/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx1/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La2/d;->l:La2/b;

    invoke-virtual {v0, p1, p2}, Lx1/a;->c(Lx1/m;Lx1/a0;)I

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, La2/d;->n:J

    const-wide/16 v2, -0x1

    const/4 p2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    iget-object v0, p0, La2/d;->i:Lx1/v;

    invoke-static {p1, v0}, Lx1/s;->i(Lx1/m;Lx1/v;)J

    move-result-wide v0

    iput-wide v0, p0, La2/d;->n:J

    return p2

    :cond_1
    iget-object v0, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->g()I

    move-result v0

    const v1, 0x8000

    if-ge v0, v1, :cond_4

    iget-object v4, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v4}, Lp3/a0;->e()[B

    move-result-object v4

    sub-int/2addr v1, v0

    invoke-interface {p1, v4, v0, v1}, Lx1/m;->read([BII)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_3

    iget-object v1, p0, La2/d;->b:Lp3/a0;

    add-int/2addr v0, p1

    invoke-virtual {v1, v0}, Lp3/a0;->S(I)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result p1

    if-nez p1, :cond_5

    invoke-direct {p0}, La2/d;->l()V

    return v1

    :cond_4
    const/4 v4, 0x0

    :cond_5
    :goto_1
    iget-object p1, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->f()I

    move-result p1

    iget v0, p0, La2/d;->m:I

    iget v1, p0, La2/d;->j:I

    if-ge v0, v1, :cond_6

    iget-object v5, p0, La2/d;->b:Lp3/a0;

    sub-int/2addr v1, v0

    invoke-virtual {v5}, Lp3/a0;->a()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v5, v0}, Lp3/a0;->U(I)V

    :cond_6
    iget-object v0, p0, La2/d;->b:Lp3/a0;

    invoke-direct {p0, v0, v4}, La2/d;->e(Lp3/a0;Z)J

    move-result-wide v0

    iget-object v4, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v4}, Lp3/a0;->f()I

    move-result v4

    sub-int/2addr v4, p1

    iget-object v5, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v5, p1}, Lp3/a0;->T(I)V

    iget-object p1, p0, La2/d;->f:Lx1/e0;

    iget-object v5, p0, La2/d;->b:Lp3/a0;

    invoke-interface {p1, v5, v4}, Lx1/e0;->d(Lp3/a0;I)V

    iget p1, p0, La2/d;->m:I

    add-int/2addr p1, v4

    iput p1, p0, La2/d;->m:I

    cmp-long p1, v0, v2

    if-eqz p1, :cond_7

    invoke-direct {p0}, La2/d;->l()V

    iput p2, p0, La2/d;->m:I

    iput-wide v0, p0, La2/d;->n:J

    :cond_7
    iget-object p1, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result p1

    const/16 v0, 0x10

    if-ge p1, v0, :cond_8

    iget-object p1, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result p1

    iget-object v0, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    iget-object v1, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v1}, Lp3/a0;->f()I

    move-result v1

    iget-object v2, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->e()[B

    move-result-object v2

    invoke-static {v0, v1, v2, p2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v0, p2}, Lp3/a0;->T(I)V

    iget-object v0, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {v0, p1}, Lp3/a0;->S(I)V

    :cond_8
    return p2
.end method

.method private n(Lx1/m;)V
    .locals 2

    iget-boolean v0, p0, La2/d;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {p1, v0}, Lx1/t;->d(Lx1/m;Z)Lk2/a;

    move-result-object p1

    iput-object p1, p0, La2/d;->h:Lk2/a;

    iput v1, p0, La2/d;->g:I

    return-void
.end method

.method private o(Lx1/m;)V
    .locals 3

    new-instance v0, Lx1/t$a;

    iget-object v1, p0, La2/d;->i:Lx1/v;

    invoke-direct {v0, v1}, Lx1/t$a;-><init>(Lx1/v;)V

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_0

    invoke-static {p1, v0}, Lx1/t;->e(Lx1/m;Lx1/t$a;)Z

    move-result v1

    iget-object v2, v0, Lx1/t$a;->a:Lx1/v;

    invoke-static {v2}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/v;

    iput-object v2, p0, La2/d;->i:Lx1/v;

    goto :goto_0

    :cond_0
    iget-object p1, p0, La2/d;->i:Lx1/v;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, La2/d;->i:Lx1/v;

    iget p1, p1, Lx1/v;->c:I

    const/4 v0, 0x6

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, La2/d;->j:I

    iget-object p1, p0, La2/d;->f:Lx1/e0;

    invoke-static {p1}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/e0;

    iget-object v0, p0, La2/d;->i:Lx1/v;

    iget-object v1, p0, La2/d;->a:[B

    iget-object v2, p0, La2/d;->h:Lk2/a;

    invoke-virtual {v0, v1, v2}, Lx1/v;->g([BLk2/a;)Ls1/n1;

    move-result-object v0

    invoke-interface {p1, v0}, Lx1/e0;->e(Ls1/n1;)V

    const/4 p1, 0x4

    iput p1, p0, La2/d;->g:I

    return-void
.end method

.method private p(Lx1/m;)V
    .locals 0

    invoke-static {p1}, Lx1/t;->i(Lx1/m;)V

    const/4 p1, 0x3

    iput p1, p0, La2/d;->g:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    iput v0, p0, La2/d;->g:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, La2/d;->l:La2/b;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3, p4}, Lx1/a;->h(J)V

    :cond_1
    :goto_0
    cmp-long p1, p3, v1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v1, -0x1

    :goto_1
    iput-wide v1, p0, La2/d;->n:J

    iput v0, p0, La2/d;->m:I

    iget-object p1, p0, La2/d;->b:Lp3/a0;

    invoke-virtual {p1, v0}, Lp3/a0;->P(I)V

    return-void
.end method

.method public c(Lx1/n;)V
    .locals 2

    iput-object p1, p0, La2/d;->e:Lx1/n;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v0

    iput-object v0, p0, La2/d;->f:Lx1/e0;

    invoke-interface {p1}, Lx1/n;->k()V

    return-void
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 3

    iget v0, p0, La2/d;->g:I

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p2}, La2/d;->m(Lx1/m;Lx1/a0;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1}, La2/d;->f(Lx1/m;)V

    return v1

    :cond_2
    invoke-direct {p0, p1}, La2/d;->o(Lx1/m;)V

    return v1

    :cond_3
    invoke-direct {p0, p1}, La2/d;->p(Lx1/m;)V

    return v1

    :cond_4
    invoke-direct {p0, p1}, La2/d;->h(Lx1/m;)V

    return v1

    :cond_5
    invoke-direct {p0, p1}, La2/d;->n(Lx1/m;)V

    return v1
.end method

.method public j(Lx1/m;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lx1/t;->c(Lx1/m;Z)Lk2/a;

    invoke-static {p1}, Lx1/t;->a(Lx1/m;)Z

    move-result p1

    return p1
.end method
