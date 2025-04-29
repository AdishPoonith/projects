.class public final Le2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/l;


# static fields
.field public static final u:Lx1/r;

.field private static final v:Lp2/h$a;


# instance fields
.field private final a:I

.field private final b:J

.field private final c:Lp3/a0;

.field private final d:Lu1/h0$a;

.field private final e:Lx1/x;

.field private final f:Lx1/y;

.field private final g:Lx1/e0;

.field private h:Lx1/n;

.field private i:Lx1/e0;

.field private j:Lx1/e0;

.field private k:I

.field private l:Lk2/a;

.field private m:J

.field private n:J

.field private o:J

.field private p:I

.field private q:Le2/g;

.field private r:Z

.field private s:Z

.field private t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Le2/e;->b:Le2/e;

    sput-object v0, Le2/f;->u:Lx1/r;

    sget-object v0, Le2/d;->a:Le2/d;

    sput-object v0, Le2/f;->v:Lp2/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Le2/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p0, p1, v0, v1}, Le2/f;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Le2/f;->a:I

    iput-wide p2, p0, Le2/f;->b:J

    new-instance p1, Lp3/a0;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lp3/a0;-><init>(I)V

    iput-object p1, p0, Le2/f;->c:Lp3/a0;

    new-instance p1, Lu1/h0$a;

    invoke-direct {p1}, Lu1/h0$a;-><init>()V

    iput-object p1, p0, Le2/f;->d:Lu1/h0$a;

    new-instance p1, Lx1/x;

    invoke-direct {p1}, Lx1/x;-><init>()V

    iput-object p1, p0, Le2/f;->e:Lx1/x;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Le2/f;->m:J

    new-instance p1, Lx1/y;

    invoke-direct {p1}, Lx1/y;-><init>()V

    iput-object p1, p0, Le2/f;->f:Lx1/y;

    new-instance p1, Lx1/k;

    invoke-direct {p1}, Lx1/k;-><init>()V

    iput-object p1, p0, Le2/f;->g:Lx1/e0;

    iput-object p1, p0, Le2/f;->j:Lx1/e0;

    return-void
.end method

.method public static synthetic d()[Lx1/l;
    .locals 1

    invoke-static {}, Le2/f;->p()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(IIIII)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Le2/f;->q(IIIII)Z

    move-result p0

    return p0
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Le2/f;->i:Lx1/e0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le2/f;->h:Lx1/n;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g(Lx1/m;)Le2/g;
    .locals 11

    invoke-direct {p0, p1}, Le2/f;->s(Lx1/m;)Le2/g;

    move-result-object v0

    iget-object v1, p0, Le2/f;->l:Lk2/a;

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Le2/f;->r(Lk2/a;J)Le2/c;

    move-result-object v1

    iget-boolean v2, p0, Le2/f;->r:Z

    if-eqz v2, :cond_0

    new-instance p1, Le2/g$a;

    invoke-direct {p1}, Le2/g$a;-><init>()V

    return-object p1

    :cond_0
    const/4 v2, 0x0

    iget v3, p0, Le2/f;->a:I

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_3

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lx1/b0;->h()J

    move-result-wide v2

    invoke-interface {v1}, Le2/g;->e()J

    move-result-wide v0

    :goto_0
    move-wide v9, v0

    move-wide v5, v2

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lx1/b0;->h()J

    move-result-wide v2

    invoke-interface {v0}, Le2/g;->e()J

    move-result-wide v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le2/f;->l:Lk2/a;

    invoke-static {v0}, Le2/f;->m(Lk2/a;)J

    move-result-wide v0

    move-wide v5, v0

    move-wide v9, v2

    :goto_1
    new-instance v0, Le2/b;

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v7

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Le2/b;-><init>(JJJ)V

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, v2

    :goto_2
    const/4 v1, 0x1

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lx1/b0;->f()Z

    move-result v2

    if-nez v2, :cond_8

    iget v2, p0, Le2/f;->a:I

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    :cond_6
    iget v0, p0, Le2/f;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_3
    invoke-direct {p0, p1, v1}, Le2/f;->l(Lx1/m;Z)Le2/g;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method private h(J)J
    .locals 4

    iget-wide v0, p0, Le2/f;->m:J

    const-wide/32 v2, 0xf4240

    mul-long p1, p1, v2

    iget-object v2, p0, Le2/f;->d:Lu1/h0$a;

    iget v2, v2, Lu1/h0$a;->d:I

    int-to-long v2, v2

    div-long/2addr p1, v2

    add-long/2addr v0, p1

    return-wide v0
.end method

.method private l(Lx1/m;Z)Le2/g;
    .locals 9

    iget-object v0, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lx1/m;->n([BII)V

    iget-object v0, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v0, v1}, Lp3/a0;->T(I)V

    iget-object v0, p0, Le2/f;->d:Lu1/h0$a;

    iget-object v1, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v1}, Lp3/a0;->p()I

    move-result v1

    invoke-virtual {v0, v1}, Lu1/h0$a;->a(I)Z

    new-instance v0, Le2/a;

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v3

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v5

    iget-object v7, p0, Le2/f;->d:Lu1/h0$a;

    move-object v2, v0

    move v8, p2

    invoke-direct/range {v2 .. v8}, Le2/a;-><init>(JJLu1/h0$a;Z)V

    return-object v0
.end method

.method private static m(Lk2/a;)J
    .locals 6

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lk2/a;->e()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lk2/a;->d(I)Lk2/a$b;

    move-result-object v3

    instance-of v4, v3, Lp2/m;

    if-eqz v4, :cond_0

    check-cast v3, Lp2/m;

    iget-object v4, v3, Lp2/i;->j:Ljava/lang/String;

    const-string v5, "TLEN"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object p0, v3, Lp2/m;->m:Lcom/google/common/collect/q;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp3/n0;->B0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method private static n(Lp3/a0;I)I
    .locals 2

    invoke-virtual {p0}, Lp3/a0;->g()I

    move-result v0

    add-int/lit8 v1, p1, 0x4

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lp3/a0;->T(I)V

    invoke-virtual {p0}, Lp3/a0;->p()I

    move-result p1

    const v0, 0x58696e67

    if-eq p1, v0, :cond_0

    const v0, 0x496e666f

    if-ne p1, v0, :cond_1

    :cond_0
    return p1

    :cond_1
    invoke-virtual {p0}, Lp3/a0;->g()I

    move-result p1

    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    const/16 p1, 0x24

    invoke-virtual {p0, p1}, Lp3/a0;->T(I)V

    invoke-virtual {p0}, Lp3/a0;->p()I

    move-result p0

    const p1, 0x56425249

    if-ne p0, p1, :cond_2

    return p1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static o(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long p0, p1, v2

    cmp-long p2, v0, p0

    if-nez p2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic p()[Lx1/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx1/l;

    new-instance v1, Le2/f;

    invoke-direct {v1}, Le2/f;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private static synthetic q(IIIII)Z
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x4d

    const/16 v2, 0x43

    if-ne p1, v2, :cond_0

    const/16 v2, 0x4f

    if-ne p2, v2, :cond_0

    if-ne p3, v1, :cond_0

    if-eq p4, v1, :cond_1

    if-eq p0, v0, :cond_1

    :cond_0
    if-ne p1, v1, :cond_2

    const/16 p1, 0x4c

    if-ne p2, p1, :cond_2

    if-ne p3, p1, :cond_2

    const/16 p1, 0x54

    if-eq p4, p1, :cond_1

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static r(Lk2/a;J)Le2/c;
    .locals 4

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lk2/a;->e()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lk2/a;->d(I)Lk2/a$b;

    move-result-object v2

    instance-of v3, v2, Lp2/k;

    if-eqz v3, :cond_0

    check-cast v2, Lp2/k;

    invoke-static {p0}, Le2/f;->m(Lk2/a;)J

    move-result-wide v0

    invoke-static {p1, p2, v2, v0, v1}, Le2/c;->a(JLp2/k;J)Le2/c;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private s(Lx1/m;)Le2/g;
    .locals 10

    new-instance v5, Lp3/a0;

    iget-object v0, p0, Le2/f;->d:Lu1/h0$a;

    iget v0, v0, Lu1/h0$a;->c:I

    invoke-direct {v5, v0}, Lp3/a0;-><init>(I)V

    invoke-virtual {v5}, Lp3/a0;->e()[B

    move-result-object v0

    iget-object v1, p0, Le2/f;->d:Lu1/h0$a;

    iget v1, v1, Lu1/h0$a;->c:I

    const/4 v6, 0x0

    invoke-interface {p1, v0, v6, v1}, Lx1/m;->n([BII)V

    iget-object v0, p0, Le2/f;->d:Lu1/h0$a;

    iget v1, v0, Lu1/h0$a;->a:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/16 v3, 0x15

    iget v0, v0, Lu1/h0$a;->e:I

    if-eqz v1, :cond_0

    if-eq v0, v2, :cond_1

    const/16 v3, 0x24

    const/16 v7, 0x24

    goto :goto_0

    :cond_0
    if-eq v0, v2, :cond_2

    :cond_1
    const/16 v7, 0x15

    goto :goto_0

    :cond_2
    const/16 v3, 0xd

    const/16 v7, 0xd

    :goto_0
    invoke-static {v5, v7}, Le2/f;->n(Lp3/a0;I)I

    move-result v8

    const v0, 0x58696e67

    const v9, 0x496e666f

    if-eq v8, v0, :cond_5

    if-ne v8, v9, :cond_3

    goto :goto_1

    :cond_3
    const v0, 0x56425249

    if-ne v8, v0, :cond_4

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v0

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v2

    iget-object v4, p0, Le2/f;->d:Lu1/h0$a;

    invoke-static/range {v0 .. v5}, Le2/h;->a(JJLu1/h0$a;Lp3/a0;)Le2/h;

    move-result-object v0

    iget-object v1, p0, Le2/f;->d:Lu1/h0$a;

    iget v1, v1, Lu1/h0$a;->c:I

    invoke-interface {p1, v1}, Lx1/m;->g(I)V

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p1}, Lx1/m;->f()V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v0

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v2

    iget-object v4, p0, Le2/f;->d:Lu1/h0$a;

    invoke-static/range {v0 .. v5}, Le2/i;->a(JJLu1/h0$a;Lp3/a0;)Le2/i;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Le2/f;->e:Lx1/x;

    invoke-virtual {v1}, Lx1/x;->a()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {p1}, Lx1/m;->f()V

    add-int/lit16 v7, v7, 0x8d

    invoke-interface {p1, v7}, Lx1/m;->o(I)V

    iget-object v1, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v1}, Lp3/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {p1, v1, v6, v2}, Lx1/m;->n([BII)V

    iget-object v1, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v1, v6}, Lp3/a0;->T(I)V

    iget-object v1, p0, Le2/f;->e:Lx1/x;

    iget-object v2, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->J()I

    move-result v2

    invoke-virtual {v1, v2}, Lx1/x;->d(I)Z

    :cond_6
    iget-object v1, p0, Le2/f;->d:Lu1/h0$a;

    iget v1, v1, Lu1/h0$a;->c:I

    invoke-interface {p1, v1}, Lx1/m;->g(I)V

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lx1/b0;->f()Z

    move-result v1

    if-nez v1, :cond_7

    if-ne v8, v9, :cond_7

    invoke-direct {p0, p1, v6}, Le2/f;->l(Lx1/m;Z)Le2/g;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_2
    return-object v0
.end method

.method private t(Lx1/m;)Z
    .locals 8

    iget-object v0, p0, Le2/f;->q:Le2/g;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Le2/g;->e()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    sub-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-lez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-interface {p1, v0, v2, v3, v1}, Lx1/m;->k([BIIZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p1, v1

    return p1

    :catch_0
    return v1
.end method

.method private u(Lx1/m;)I
    .locals 5

    iget v0, p0, Le2/f;->k:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, v0}, Le2/f;->w(Lx1/m;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, -0x1

    return p1

    :cond_0
    :goto_0
    iget-object v0, p0, Le2/f;->q:Le2/g;

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Le2/f;->g(Lx1/m;)Le2/g;

    move-result-object v0

    iput-object v0, p0, Le2/f;->q:Le2/g;

    iget-object v1, p0, Le2/f;->h:Lx1/n;

    invoke-interface {v1, v0}, Lx1/n;->t(Lx1/b0;)V

    iget-object v0, p0, Le2/f;->j:Lx1/e0;

    new-instance v1, Ls1/n1$b;

    invoke-direct {v1}, Ls1/n1$b;-><init>()V

    iget-object v2, p0, Le2/f;->d:Lu1/h0$a;

    iget-object v2, v2, Lu1/h0$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v1

    const/16 v2, 0x1000

    invoke-virtual {v1, v2}, Ls1/n1$b;->Y(I)Ls1/n1$b;

    move-result-object v1

    iget-object v2, p0, Le2/f;->d:Lu1/h0$a;

    iget v2, v2, Lu1/h0$a;->e:I

    invoke-virtual {v1, v2}, Ls1/n1$b;->J(I)Ls1/n1$b;

    move-result-object v1

    iget-object v2, p0, Le2/f;->d:Lu1/h0$a;

    iget v2, v2, Lu1/h0$a;->d:I

    invoke-virtual {v1, v2}, Ls1/n1$b;->h0(I)Ls1/n1$b;

    move-result-object v1

    iget-object v2, p0, Le2/f;->e:Lx1/x;

    iget v2, v2, Lx1/x;->a:I

    invoke-virtual {v1, v2}, Ls1/n1$b;->P(I)Ls1/n1$b;

    move-result-object v1

    iget-object v2, p0, Le2/f;->e:Lx1/x;

    iget v2, v2, Lx1/x;->b:I

    invoke-virtual {v1, v2}, Ls1/n1$b;->Q(I)Ls1/n1$b;

    move-result-object v1

    iget v2, p0, Le2/f;->a:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget-object v2, p0, Le2/f;->l:Lk2/a;

    :goto_1
    invoke-virtual {v1, v2}, Ls1/n1$b;->Z(Lk2/a;)Ls1/n1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v1

    invoke-interface {v0, v1}, Lx1/e0;->e(Ls1/n1;)V

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v0

    iput-wide v0, p0, Le2/f;->o:J

    goto :goto_2

    :cond_2
    iget-wide v0, p0, Le2/f;->o:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v0

    iget-wide v2, p0, Le2/f;->o:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    sub-long/2addr v2, v0

    long-to-int v0, v2

    invoke-interface {p1, v0}, Lx1/m;->g(I)V

    :cond_3
    :goto_2
    invoke-direct {p0, p1}, Le2/f;->v(Lx1/m;)I

    move-result p1

    return p1
.end method

.method private v(Lx1/m;)I
    .locals 11

    iget v0, p0, Le2/f;->p:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-nez v0, :cond_4

    invoke-interface {p1}, Lx1/m;->f()V

    invoke-direct {p0, p1}, Le2/f;->t(Lx1/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v0, v3}, Lp3/a0;->T(I)V

    iget-object v0, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->p()I

    move-result v0

    iget v4, p0, Le2/f;->k:I

    int-to-long v4, v4

    invoke-static {v0, v4, v5}, Le2/f;->o(IJ)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v0}, Lu1/h0;->j(I)I

    move-result v4

    if-ne v4, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v4, p0, Le2/f;->d:Lu1/h0$a;

    invoke-virtual {v4, v0}, Lu1/h0$a;->a(I)Z

    iget-wide v4, p0, Le2/f;->m:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Le2/f;->q:Le2/g;

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, Le2/g;->d(J)J

    move-result-wide v4

    iput-wide v4, p0, Le2/f;->m:J

    iget-wide v4, p0, Le2/f;->b:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_2

    iget-object v0, p0, Le2/f;->q:Le2/g;

    const-wide/16 v4, 0x0

    invoke-interface {v0, v4, v5}, Le2/g;->d(J)J

    move-result-wide v4

    iget-wide v6, p0, Le2/f;->m:J

    iget-wide v8, p0, Le2/f;->b:J

    sub-long/2addr v8, v4

    add-long/2addr v6, v8

    iput-wide v6, p0, Le2/f;->m:J

    :cond_2
    iget-object v0, p0, Le2/f;->d:Lu1/h0$a;

    iget v4, v0, Lu1/h0$a;->c:I

    iput v4, p0, Le2/f;->p:I

    iget-object v4, p0, Le2/f;->q:Le2/g;

    instance-of v5, v4, Le2/b;

    if-eqz v5, :cond_4

    check-cast v4, Le2/b;

    iget-wide v5, p0, Le2/f;->n:J

    iget v0, v0, Lu1/h0$a;->g:I

    int-to-long v7, v0

    add-long/2addr v5, v7

    invoke-direct {p0, v5, v6}, Le2/f;->h(J)J

    move-result-wide v5

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v7

    iget-object v0, p0, Le2/f;->d:Lu1/h0$a;

    iget v0, v0, Lu1/h0$a;->c:I

    int-to-long v9, v0

    add-long/2addr v7, v9

    invoke-virtual {v4, v5, v6, v7, v8}, Le2/b;->b(JJ)V

    iget-boolean v0, p0, Le2/f;->s:Z

    if-eqz v0, :cond_4

    iget-wide v5, p0, Le2/f;->t:J

    invoke-virtual {v4, v5, v6}, Le2/b;->a(J)Z

    move-result v0

    if-eqz v0, :cond_4

    iput-boolean v3, p0, Le2/f;->s:Z

    iget-object v0, p0, Le2/f;->i:Lx1/e0;

    iput-object v0, p0, Le2/f;->j:Lx1/e0;

    goto :goto_1

    :cond_3
    :goto_0
    invoke-interface {p1, v1}, Lx1/m;->g(I)V

    iput v3, p0, Le2/f;->k:I

    return v3

    :cond_4
    :goto_1
    iget-object v0, p0, Le2/f;->j:Lx1/e0;

    iget v4, p0, Le2/f;->p:I

    invoke-interface {v0, p1, v4, v1}, Lx1/e0;->f(Lo3/i;IZ)I

    move-result p1

    if-ne p1, v2, :cond_5

    return v2

    :cond_5
    iget v0, p0, Le2/f;->p:I

    sub-int/2addr v0, p1

    iput v0, p0, Le2/f;->p:I

    if-lez v0, :cond_6

    return v3

    :cond_6
    iget-object v4, p0, Le2/f;->j:Lx1/e0;

    iget-wide v0, p0, Le2/f;->n:J

    invoke-direct {p0, v0, v1}, Le2/f;->h(J)J

    move-result-wide v5

    const/4 v7, 0x1

    iget-object p1, p0, Le2/f;->d:Lu1/h0$a;

    iget v8, p1, Lu1/h0$a;->c:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lx1/e0;->c(JIIILx1/e0$a;)V

    iget-wide v0, p0, Le2/f;->n:J

    iget-object p1, p0, Le2/f;->d:Lu1/h0$a;

    iget p1, p1, Lu1/h0$a;->g:I

    int-to-long v4, p1

    add-long/2addr v0, v4

    iput-wide v0, p0, Le2/f;->n:J

    iput v3, p0, Le2/f;->p:I

    return v3
.end method

.method private w(Lx1/m;Z)Z
    .locals 11

    if-eqz p2, :cond_0

    const v0, 0x8000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x20000

    :goto_0
    invoke-interface {p1}, Lx1/m;->f()V

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    cmp-long v8, v1, v3

    if-nez v8, :cond_5

    iget v1, p0, Le2/f;->a:I

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    move-object v1, v5

    goto :goto_2

    :cond_2
    sget-object v1, Le2/f;->v:Lp2/h$a;

    :goto_2
    iget-object v2, p0, Le2/f;->f:Lx1/y;

    invoke-virtual {v2, p1, v1}, Lx1/y;->a(Lx1/m;Lp2/h$a;)Lk2/a;

    move-result-object v1

    iput-object v1, p0, Le2/f;->l:Lk2/a;

    if-eqz v1, :cond_3

    iget-object v2, p0, Le2/f;->e:Lx1/x;

    invoke-virtual {v2, v1}, Lx1/x;->c(Lk2/a;)Z

    :cond_3
    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v1

    long-to-int v2, v1

    if-nez p2, :cond_4

    invoke-interface {p1, v2}, Lx1/m;->g(I)V

    :cond_4
    const/4 v1, 0x0

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_4
    invoke-direct {p0, p1}, Le2/f;->t(Lx1/m;)Z

    move-result v8

    if-eqz v8, :cond_7

    if-lez v3, :cond_6

    goto :goto_6

    :cond_6
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_7
    iget-object v8, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v8, v7}, Lp3/a0;->T(I)V

    iget-object v8, p0, Le2/f;->c:Lp3/a0;

    invoke-virtual {v8}, Lp3/a0;->p()I

    move-result v8

    if-eqz v1, :cond_8

    int-to-long v9, v1

    invoke-static {v8, v9, v10}, Le2/f;->o(IJ)Z

    move-result v9

    if-eqz v9, :cond_9

    :cond_8
    invoke-static {v8}, Lu1/h0;->j(I)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_d

    :cond_9
    add-int/lit8 v1, v4, 0x1

    if-ne v4, v0, :cond_b

    if-eqz p2, :cond_a

    return v7

    :cond_a
    const-string p1, "Searched too many bytes."

    invoke-static {p1, v5}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p1

    throw p1

    :cond_b
    if-eqz p2, :cond_c

    invoke-interface {p1}, Lx1/m;->f()V

    add-int v3, v2, v1

    invoke-interface {p1, v3}, Lx1/m;->o(I)V

    goto :goto_5

    :cond_c
    invoke-interface {p1, v6}, Lx1/m;->g(I)V

    :goto_5
    move v4, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    goto :goto_4

    :cond_d
    add-int/lit8 v3, v3, 0x1

    if-ne v3, v6, :cond_e

    iget-object v1, p0, Le2/f;->d:Lu1/h0$a;

    invoke-virtual {v1, v8}, Lu1/h0$a;->a(I)Z

    move v1, v8

    goto :goto_8

    :cond_e
    const/4 v8, 0x4

    if-ne v3, v8, :cond_10

    :goto_6
    if-eqz p2, :cond_f

    add-int/2addr v2, v4

    invoke-interface {p1, v2}, Lx1/m;->g(I)V

    goto :goto_7

    :cond_f
    invoke-interface {p1}, Lx1/m;->f()V

    :goto_7
    iput v1, p0, Le2/f;->k:I

    return v6

    :cond_10
    :goto_8
    add-int/lit8 v9, v9, -0x4

    invoke-interface {p1, v9}, Lx1/m;->o(I)V

    goto :goto_4
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 2

    const/4 p1, 0x0

    iput p1, p0, Le2/f;->k:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Le2/f;->m:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Le2/f;->n:J

    iput p1, p0, Le2/f;->p:I

    iput-wide p3, p0, Le2/f;->t:J

    iget-object p1, p0, Le2/f;->q:Le2/g;

    instance-of p2, p1, Le2/b;

    if-eqz p2, :cond_0

    check-cast p1, Le2/b;

    invoke-virtual {p1, p3, p4}, Le2/b;->a(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Le2/f;->s:Z

    iget-object p1, p0, Le2/f;->g:Lx1/e0;

    iput-object p1, p0, Le2/f;->j:Lx1/e0;

    :cond_0
    return-void
.end method

.method public c(Lx1/n;)V
    .locals 2

    iput-object p1, p0, Le2/f;->h:Lx1/n;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx1/n;->d(II)Lx1/e0;

    move-result-object p1

    iput-object p1, p0, Le2/f;->i:Lx1/e0;

    iput-object p1, p0, Le2/f;->j:Lx1/e0;

    iget-object p1, p0, Le2/f;->h:Lx1/n;

    invoke-interface {p1}, Lx1/n;->k()V

    return-void
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 4

    invoke-direct {p0}, Le2/f;->f()V

    invoke-direct {p0, p1}, Le2/f;->u(Lx1/m;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    iget-object p2, p0, Le2/f;->q:Le2/g;

    instance-of p2, p2, Le2/b;

    if-eqz p2, :cond_0

    iget-wide v0, p0, Le2/f;->n:J

    invoke-direct {p0, v0, v1}, Le2/f;->h(J)J

    move-result-wide v0

    iget-object p2, p0, Le2/f;->q:Le2/g;

    invoke-interface {p2}, Lx1/b0;->h()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-eqz p2, :cond_0

    iget-object p2, p0, Le2/f;->q:Le2/g;

    check-cast p2, Le2/b;

    invoke-virtual {p2, v0, v1}, Le2/b;->c(J)V

    iget-object p2, p0, Le2/f;->h:Lx1/n;

    iget-object v0, p0, Le2/f;->q:Le2/g;

    invoke-interface {p2, v0}, Lx1/n;->t(Lx1/b0;)V

    :cond_0
    return p1
.end method

.method public j(Lx1/m;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Le2/f;->w(Lx1/m;Z)Z

    move-result p1

    return p1
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Le2/f;->r:Z

    return-void
.end method
