.class public final Lc2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/l;


# instance fields
.field private final a:Lp3/a0;

.field private b:Lx1/n;

.field private c:I

.field private d:I

.field private e:I

.field private f:J

.field private g:Lq2/b;

.field private h:Lx1/m;

.field private i:Lc2/c;

.field private j:Lf2/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp3/a0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    iput-object v0, p0, Lc2/a;->a:Lp3/a0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lc2/a;->f:J

    return-void
.end method

.method private d(Lx1/m;)V
    .locals 3

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp3/a0;->P(I)V

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx1/m;->n([BII)V

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->M()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {p1, v0}, Lx1/m;->o(I)V

    return-void
.end method

.method private e()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Lk2/a$b;

    invoke-direct {p0, v0}, Lc2/a;->g([Lk2/a$b;)V

    iget-object v0, p0, Lc2/a;->b:Lx1/n;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/n;

    invoke-interface {v0}, Lx1/n;->k()V

    iget-object v0, p0, Lc2/a;->b:Lx1/n;

    new-instance v1, Lx1/b0$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Lx1/b0$b;-><init>(J)V

    invoke-interface {v0, v1}, Lx1/n;->t(Lx1/b0;)V

    const/4 v0, 0x6

    iput v0, p0, Lc2/a;->c:I

    return-void
.end method

.method private static f(Ljava/lang/String;J)Lq2/b;
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, -0x1

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lc2/e;->a(Ljava/lang/String;)Lc2/b;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lc2/b;->a(J)Lq2/b;

    move-result-object p0

    return-object p0
.end method

.method private varargs g([Lk2/a$b;)V
    .locals 3

    iget-object v0, p0, Lc2/a;->b:Lx1/n;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/n;

    const/16 v1, 0x400

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v0

    new-instance v1, Ls1/n1$b;

    invoke-direct {v1}, Ls1/n1$b;-><init>()V

    const-string v2, "image/jpeg"

    invoke-virtual {v1, v2}, Ls1/n1$b;->M(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v1

    new-instance v2, Lk2/a;

    invoke-direct {v2, p1}, Lk2/a;-><init>([Lk2/a$b;)V

    invoke-virtual {v1, v2}, Ls1/n1$b;->Z(Lk2/a;)Ls1/n1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p1

    invoke-interface {v0, p1}, Lx1/e0;->e(Ls1/n1;)V

    return-void
.end method

.method private h(Lx1/m;)I
    .locals 3

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp3/a0;->P(I)V

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx1/m;->n([BII)V

    iget-object p1, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->M()I

    move-result p1

    return p1
.end method

.method private k(Lx1/m;)V
    .locals 4

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp3/a0;->P(I)V

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx1/m;->readFully([BII)V

    iget-object p1, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->M()I

    move-result p1

    iput p1, p0, Lc2/a;->d:I

    const v0, 0xffda

    if-ne p1, v0, :cond_1

    iget-wide v0, p0, Lc2/a;->f:J

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    :goto_0
    iput p1, p0, Lc2/a;->c:I

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lc2/a;->e()V

    goto :goto_1

    :cond_1
    const v0, 0xffd0

    if-lt p1, v0, :cond_2

    const v0, 0xffd9

    if-le p1, v0, :cond_3

    :cond_2
    const v0, 0xff01

    if-eq p1, v0, :cond_3

    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private l(Lx1/m;)V
    .locals 4

    iget v0, p0, Lc2/a;->d:I

    const/4 v1, 0x0

    const v2, 0xffe1

    if-ne v0, v2, :cond_0

    new-instance v0, Lp3/a0;

    iget v2, p0, Lc2/a;->e:I

    invoke-direct {v0, v2}, Lp3/a0;-><init>(I)V

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v2

    iget v3, p0, Lc2/a;->e:I

    invoke-interface {p1, v2, v1, v3}, Lx1/m;->readFully([BII)V

    iget-object v2, p0, Lc2/a;->g:Lq2/b;

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lp3/a0;->A()Ljava/lang/String;

    move-result-object v2

    const-string v3, "http://ns.adobe.com/xap/1.0/"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lp3/a0;->A()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lc2/a;->f(Ljava/lang/String;J)Lq2/b;

    move-result-object p1

    iput-object p1, p0, Lc2/a;->g:Lq2/b;

    if-eqz p1, :cond_1

    iget-wide v2, p1, Lq2/b;->m:J

    iput-wide v2, p0, Lc2/a;->f:J

    goto :goto_0

    :cond_0
    iget v0, p0, Lc2/a;->e:I

    invoke-interface {p1, v0}, Lx1/m;->g(I)V

    :cond_1
    :goto_0
    iput v1, p0, Lc2/a;->c:I

    return-void
.end method

.method private m(Lx1/m;)V
    .locals 3

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp3/a0;->P(I)V

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx1/m;->readFully([BII)V

    iget-object p1, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->M()I

    move-result p1

    sub-int/2addr p1, v1

    iput p1, p0, Lc2/a;->e:I

    iput v1, p0, Lc2/a;->c:I

    return-void
.end method

.method private n(Lx1/m;)V
    .locals 4

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2, v2}, Lx1/m;->k([BIIZ)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lc2/a;->e()V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lx1/m;->f()V

    iget-object v0, p0, Lc2/a;->j:Lf2/k;

    if-nez v0, :cond_2

    new-instance v0, Lf2/k;

    invoke-direct {v0}, Lf2/k;-><init>()V

    iput-object v0, p0, Lc2/a;->j:Lf2/k;

    :cond_2
    new-instance v0, Lc2/c;

    iget-wide v1, p0, Lc2/a;->f:J

    invoke-direct {v0, p1, v1, v2}, Lc2/c;-><init>(Lx1/m;J)V

    iput-object v0, p0, Lc2/a;->i:Lc2/c;

    iget-object p1, p0, Lc2/a;->j:Lf2/k;

    invoke-virtual {p1, v0}, Lf2/k;->j(Lx1/m;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc2/a;->j:Lf2/k;

    new-instance v0, Lc2/d;

    iget-wide v1, p0, Lc2/a;->f:J

    iget-object v3, p0, Lc2/a;->b:Lx1/n;

    invoke-static {v3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx1/n;

    invoke-direct {v0, v1, v2, v3}, Lc2/d;-><init>(JLx1/n;)V

    invoke-virtual {p1, v0}, Lf2/k;->c(Lx1/n;)V

    invoke-direct {p0}, Lc2/a;->o()V

    :goto_0
    return-void
.end method

.method private o()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lk2/a$b;

    iget-object v1, p0, Lc2/a;->g:Lq2/b;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk2/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lc2/a;->g([Lk2/a$b;)V

    const/4 v0, 0x5

    iput v0, p0, Lc2/a;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lc2/a;->j:Lf2/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf2/k;->a()V

    :cond_0
    return-void
.end method

.method public b(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lc2/a;->c:I

    const/4 p1, 0x0

    iput-object p1, p0, Lc2/a;->j:Lf2/k;

    goto :goto_0

    :cond_0
    iget v0, p0, Lc2/a;->c:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lc2/a;->j:Lf2/k;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf2/k;->b(JJ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Lx1/n;)V
    .locals 0

    iput-object p1, p0, Lc2/a;->b:Lx1/n;

    return-void
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 7

    iget v0, p0, Lc2/a;->c:I

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    if-eq v0, v2, :cond_8

    const/4 v3, 0x2

    if-eq v0, v3, :cond_7

    const/4 v3, 0x4

    if-eq v0, v3, :cond_5

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 p1, 0x6

    if-ne v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-object v0, p0, Lc2/a;->i:Lc2/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc2/a;->h:Lx1/m;

    if-eq p1, v0, :cond_3

    :cond_2
    iput-object p1, p0, Lc2/a;->h:Lx1/m;

    new-instance v0, Lc2/c;

    iget-wide v3, p0, Lc2/a;->f:J

    invoke-direct {v0, p1, v3, v4}, Lc2/c;-><init>(Lx1/m;J)V

    iput-object v0, p0, Lc2/a;->i:Lc2/c;

    :cond_3
    iget-object p1, p0, Lc2/a;->j:Lf2/k;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/k;

    iget-object v0, p0, Lc2/a;->i:Lc2/c;

    invoke-virtual {p1, v0, p2}, Lf2/k;->i(Lx1/m;Lx1/a0;)I

    move-result p1

    if-ne p1, v2, :cond_4

    iget-wide v0, p2, Lx1/a0;->a:J

    iget-wide v2, p0, Lc2/a;->f:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lx1/a0;->a:J

    :cond_4
    return p1

    :cond_5
    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v3

    iget-wide v5, p0, Lc2/a;->f:J

    cmp-long v0, v3, v5

    if-eqz v0, :cond_6

    iput-wide v5, p2, Lx1/a0;->a:J

    return v2

    :cond_6
    invoke-direct {p0, p1}, Lc2/a;->n(Lx1/m;)V

    return v1

    :cond_7
    invoke-direct {p0, p1}, Lc2/a;->l(Lx1/m;)V

    return v1

    :cond_8
    invoke-direct {p0, p1}, Lc2/a;->m(Lx1/m;)V

    return v1

    :cond_9
    invoke-direct {p0, p1}, Lc2/a;->k(Lx1/m;)V

    return v1
.end method

.method public j(Lx1/m;)Z
    .locals 6

    invoke-direct {p0, p1}, Lc2/a;->h(Lx1/m;)I

    move-result v0

    const/4 v1, 0x0

    const v2, 0xffd8

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Lc2/a;->h(Lx1/m;)I

    move-result v0

    iput v0, p0, Lc2/a;->d:I

    const v2, 0xffe0

    if-ne v0, v2, :cond_1

    invoke-direct {p0, p1}, Lc2/a;->d(Lx1/m;)V

    invoke-direct {p0, p1}, Lc2/a;->h(Lx1/m;)I

    move-result v0

    iput v0, p0, Lc2/a;->d:I

    :cond_1
    iget v0, p0, Lc2/a;->d:I

    const v2, 0xffe1

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Lx1/m;->o(I)V

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Lp3/a0;->P(I)V

    iget-object v0, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v1, v2}, Lx1/m;->n([BII)V

    iget-object p1, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->I()J

    move-result-wide v2

    const-wide/32 v4, 0x45786966    # 5.758429993E-315

    cmp-long p1, v2, v4

    if-nez p1, :cond_3

    iget-object p1, p0, Lc2/a;->a:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->M()I

    move-result p1

    if-nez p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method
