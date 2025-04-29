.class public final Lf2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/l;
.implements Lx1/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/k$a;
    }
.end annotation


# static fields
.field public static final y:Lx1/r;


# instance fields
.field private final a:I

.field private final b:Lp3/a0;

.field private final c:Lp3/a0;

.field private final d:Lp3/a0;

.field private final e:Lp3/a0;

.field private final f:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lf2/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lf2/m;

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk2/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private i:I

.field private j:I

.field private k:J

.field private l:I

.field private m:Lp3/a0;

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:Lx1/n;

.field private s:[Lf2/k$a;

.field private t:[[J

.field private u:I

.field private v:J

.field private w:I

.field private x:Lq2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lf2/j;->b:Lf2/j;

    sput-object v0, Lf2/k;->y:Lx1/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf2/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf2/k;->a:I

    const/4 v0, 0x4

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lf2/k;->i:I

    new-instance p1, Lf2/m;

    invoke-direct {p1}, Lf2/m;-><init>()V

    iput-object p1, p0, Lf2/k;->g:Lf2/m;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lf2/k;->h:Ljava/util/List;

    new-instance p1, Lp3/a0;

    const/16 v2, 0x10

    invoke-direct {p1, v2}, Lp3/a0;-><init>(I)V

    iput-object p1, p0, Lf2/k;->e:Lp3/a0;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    new-instance p1, Lp3/a0;

    sget-object v2, Lp3/w;->a:[B

    invoke-direct {p1, v2}, Lp3/a0;-><init>([B)V

    iput-object p1, p0, Lf2/k;->b:Lp3/a0;

    new-instance p1, Lp3/a0;

    invoke-direct {p1, v0}, Lp3/a0;-><init>(I)V

    iput-object p1, p0, Lf2/k;->c:Lp3/a0;

    new-instance p1, Lp3/a0;

    invoke-direct {p1}, Lp3/a0;-><init>()V

    iput-object p1, p0, Lf2/k;->d:Lp3/a0;

    const/4 p1, -0x1

    iput p1, p0, Lf2/k;->n:I

    sget-object p1, Lx1/n;->i:Lx1/n;

    iput-object p1, p0, Lf2/k;->r:Lx1/n;

    new-array p1, v1, [Lf2/k$a;

    iput-object p1, p0, Lf2/k;->s:[Lf2/k$a;

    return-void
.end method

.method private A(J)V
    .locals 13

    iget v0, p0, Lf2/k;->j:I

    const v1, 0x6d707664

    if-ne v0, v1, :cond_0

    new-instance v0, Lq2/b;

    const-wide/16 v3, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    iget v1, p0, Lf2/k;->l:I

    int-to-long v5, v1

    add-long v9, p1, v5

    iget-wide v5, p0, Lf2/k;->k:J

    int-to-long v1, v1

    sub-long v11, v5, v1

    move-object v2, v0

    move-wide v5, p1

    invoke-direct/range {v2 .. v12}, Lq2/b;-><init>(JJJJJ)V

    iput-object v0, p0, Lf2/k;->x:Lq2/b;

    :cond_0
    return-void
.end method

.method private B(Lx1/m;)Z
    .locals 8

    iget v0, p0, Lf2/k;->l:I

    const/4 v1, 0x1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/k;->e:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v3, v2, v1}, Lx1/m;->c([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lf2/k;->x()V

    return v3

    :cond_0
    iput v2, p0, Lf2/k;->l:I

    iget-object v0, p0, Lf2/k;->e:Lp3/a0;

    invoke-virtual {v0, v3}, Lp3/a0;->T(I)V

    iget-object v0, p0, Lf2/k;->e:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->I()J

    move-result-wide v4

    iput-wide v4, p0, Lf2/k;->k:J

    iget-object v0, p0, Lf2/k;->e:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->p()I

    move-result v0

    iput v0, p0, Lf2/k;->j:I

    :cond_1
    iget-wide v4, p0, Lf2/k;->k:J

    const-wide/16 v6, 0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Lf2/k;->e:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v2, v2}, Lx1/m;->readFully([BII)V

    iget v0, p0, Lf2/k;->l:I

    add-int/2addr v0, v2

    iput v0, p0, Lf2/k;->l:I

    iget-object v0, p0, Lf2/k;->e:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->L()J

    move-result-wide v4

    :goto_0
    iput-wide v4, p0, Lf2/k;->k:J

    goto :goto_1

    :cond_2
    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    iget-object v0, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/a$a;

    if-eqz v0, :cond_3

    iget-wide v4, v0, Lf2/a$a;->b:J

    :cond_3
    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iget v0, p0, Lf2/k;->l:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    goto :goto_0

    :cond_4
    :goto_1
    iget-wide v4, p0, Lf2/k;->k:J

    iget v0, p0, Lf2/k;->l:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_b

    iget v0, p0, Lf2/k;->j:I

    invoke-static {v0}, Lf2/k;->F(I)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v2

    iget-wide v4, p0, Lf2/k;->k:J

    add-long/2addr v2, v4

    iget v0, p0, Lf2/k;->l:I

    int-to-long v6, v0

    sub-long/2addr v2, v6

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_5

    iget v0, p0, Lf2/k;->j:I

    const v4, 0x6d657461

    if-ne v0, v4, :cond_5

    invoke-direct {p0, p1}, Lf2/k;->v(Lx1/m;)V

    :cond_5
    iget-object p1, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    new-instance v0, Lf2/a$a;

    iget v4, p0, Lf2/k;->j:I

    invoke-direct {v0, v4, v2, v3}, Lf2/a$a;-><init>(IJ)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v4, p0, Lf2/k;->k:J

    iget p1, p0, Lf2/k;->l:I

    int-to-long v6, p1

    cmp-long p1, v4, v6

    if-nez p1, :cond_6

    invoke-direct {p0, v2, v3}, Lf2/k;->w(J)V

    goto :goto_5

    :cond_6
    invoke-direct {p0}, Lf2/k;->o()V

    goto :goto_5

    :cond_7
    iget v0, p0, Lf2/k;->j:I

    invoke-static {v0}, Lf2/k;->G(I)Z

    move-result v0

    if-eqz v0, :cond_a

    iget p1, p0, Lf2/k;->l:I

    if-ne p1, v2, :cond_8

    const/4 p1, 0x1

    goto :goto_2

    :cond_8
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Lp3/a;->f(Z)V

    iget-wide v4, p0, Lf2/k;->k:J

    const-wide/32 v6, 0x7fffffff

    cmp-long p1, v4, v6

    if-gtz p1, :cond_9

    const/4 p1, 0x1

    goto :goto_3

    :cond_9
    const/4 p1, 0x0

    :goto_3
    invoke-static {p1}, Lp3/a;->f(Z)V

    new-instance p1, Lp3/a0;

    iget-wide v4, p0, Lf2/k;->k:J

    long-to-int v0, v4

    invoke-direct {p1, v0}, Lp3/a0;-><init>(I)V

    iget-object v0, p0, Lf2/k;->e:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lp3/a0;->e()[B

    move-result-object v4

    invoke-static {v0, v3, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    :cond_a
    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v2

    iget p1, p0, Lf2/k;->l:I

    int-to-long v4, p1

    sub-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, Lf2/k;->A(J)V

    const/4 p1, 0x0

    :goto_4
    iput-object p1, p0, Lf2/k;->m:Lp3/a0;

    iput v1, p0, Lf2/k;->i:I

    :goto_5
    return v1

    :cond_b
    const-string p1, "Atom size less than header length (unsupported)."

    invoke-static {p1}, Ls1/u2;->d(Ljava/lang/String;)Ls1/u2;

    move-result-object p1

    throw p1
.end method

.method private C(Lx1/m;Lx1/a0;)Z
    .locals 9

    iget-wide v0, p0, Lf2/k;->k:J

    iget v2, p0, Lf2/k;->l:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v2

    add-long/2addr v2, v0

    iget-object v4, p0, Lf2/k;->m:Lp3/a0;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lp3/a0;->e()[B

    move-result-object p2

    iget v7, p0, Lf2/k;->l:I

    long-to-int v1, v0

    invoke-interface {p1, p2, v7, v1}, Lx1/m;->readFully([BII)V

    iget p1, p0, Lf2/k;->j:I

    const p2, 0x66747970

    if-ne p1, p2, :cond_0

    invoke-static {v4}, Lf2/k;->y(Lp3/a0;)I

    move-result p1

    iput p1, p0, Lf2/k;->w:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/a$a;

    new-instance p2, Lf2/a$b;

    iget v0, p0, Lf2/k;->j:I

    invoke-direct {p2, v0, v4}, Lf2/a$b;-><init>(ILp3/a0;)V

    invoke-virtual {p1, p2}, Lf2/a$a;->e(Lf2/a$b;)V

    goto :goto_0

    :cond_1
    const-wide/32 v7, 0x40000

    cmp-long v4, v0, v7

    if-gez v4, :cond_3

    long-to-int p2, v0

    invoke-interface {p1, p2}, Lx1/m;->g(I)V

    :cond_2
    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v7

    add-long/2addr v7, v0

    iput-wide v7, p2, Lx1/a0;->a:J

    const/4 p1, 0x1

    :goto_1
    invoke-direct {p0, v2, v3}, Lf2/k;->w(J)V

    if-eqz p1, :cond_4

    iget p1, p0, Lf2/k;->i:I

    const/4 p2, 0x2

    if-eq p1, p2, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    return v5
.end method

.method private D(Lx1/m;Lx1/a0;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface/range {p1 .. p1}, Lx1/m;->p()J

    move-result-wide v2

    iget v4, v0, Lf2/k;->n:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    invoke-direct {v0, v2, v3}, Lf2/k;->r(J)I

    move-result v4

    iput v4, v0, Lf2/k;->n:I

    if-ne v4, v5, :cond_0

    return v5

    :cond_0
    iget-object v4, v0, Lf2/k;->s:[Lf2/k$a;

    iget v6, v0, Lf2/k;->n:I

    aget-object v4, v4, v6

    iget-object v14, v4, Lf2/k$a;->c:Lx1/e0;

    iget v15, v4, Lf2/k$a;->e:I

    iget-object v6, v4, Lf2/k$a;->b:Lf2/r;

    iget-object v7, v6, Lf2/r;->c:[J

    aget-wide v8, v7, v15

    iget-object v6, v6, Lf2/r;->d:[I

    aget v6, v6, v15

    iget-object v13, v4, Lf2/k$a;->d:Lx1/f0;

    sub-long v2, v8, v2

    iget v7, v0, Lf2/k;->o:I

    int-to-long v10, v7

    add-long/2addr v2, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x1

    cmp-long v7, v2, v10

    if-ltz v7, :cond_c

    const-wide/32 v10, 0x40000

    cmp-long v7, v2, v10

    if-ltz v7, :cond_1

    move-object/from16 v1, p2

    const/16 v17, 0x1

    goto/16 :goto_3

    :cond_1
    iget-object v7, v4, Lf2/k$a;->a:Lf2/o;

    iget v7, v7, Lf2/o;->g:I

    if-ne v7, v12, :cond_2

    const-wide/16 v7, 0x8

    add-long/2addr v2, v7

    add-int/lit8 v6, v6, -0x8

    :cond_2
    long-to-int v3, v2

    invoke-interface {v1, v3}, Lx1/m;->g(I)V

    iget-object v2, v4, Lf2/k$a;->a:Lf2/o;

    iget v3, v2, Lf2/o;->j:I

    const/4 v11, 0x0

    const/4 v10, 0x0

    if-eqz v3, :cond_5

    iget-object v2, v0, Lf2/k;->c:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->e()[B

    move-result-object v2

    aput-byte v10, v2, v10

    aput-byte v10, v2, v12

    const/4 v3, 0x2

    aput-byte v10, v2, v3

    iget-object v3, v4, Lf2/k$a;->a:Lf2/o;

    iget v3, v3, Lf2/o;->j:I

    rsub-int/lit8 v7, v3, 0x4

    :goto_0
    iget v8, v0, Lf2/k;->p:I

    if-ge v8, v6, :cond_9

    iget v8, v0, Lf2/k;->q:I

    if-nez v8, :cond_4

    invoke-interface {v1, v2, v7, v3}, Lx1/m;->readFully([BII)V

    iget v8, v0, Lf2/k;->o:I

    add-int/2addr v8, v3

    iput v8, v0, Lf2/k;->o:I

    iget-object v8, v0, Lf2/k;->c:Lp3/a0;

    invoke-virtual {v8, v10}, Lp3/a0;->T(I)V

    iget-object v8, v0, Lf2/k;->c:Lp3/a0;

    invoke-virtual {v8}, Lp3/a0;->p()I

    move-result v8

    if-ltz v8, :cond_3

    iput v8, v0, Lf2/k;->q:I

    iget-object v8, v0, Lf2/k;->b:Lp3/a0;

    invoke-virtual {v8, v10}, Lp3/a0;->T(I)V

    iget-object v8, v0, Lf2/k;->b:Lp3/a0;

    const/4 v9, 0x4

    invoke-interface {v14, v8, v9}, Lx1/e0;->d(Lp3/a0;I)V

    iget v8, v0, Lf2/k;->p:I

    add-int/2addr v8, v9

    iput v8, v0, Lf2/k;->p:I

    add-int/2addr v6, v7

    goto :goto_0

    :cond_3
    const-string v1, "Invalid NAL length"

    invoke-static {v1, v11}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object v1

    throw v1

    :cond_4
    invoke-interface {v14, v1, v8, v10}, Lx1/e0;->f(Lo3/i;IZ)I

    move-result v8

    iget v9, v0, Lf2/k;->o:I

    add-int/2addr v9, v8

    iput v9, v0, Lf2/k;->o:I

    iget v9, v0, Lf2/k;->p:I

    add-int/2addr v9, v8

    iput v9, v0, Lf2/k;->p:I

    iget v9, v0, Lf2/k;->q:I

    sub-int/2addr v9, v8

    iput v9, v0, Lf2/k;->q:I

    goto :goto_0

    :cond_5
    iget-object v2, v2, Lf2/o;->f:Ls1/n1;

    iget-object v2, v2, Ls1/n1;->u:Ljava/lang/String;

    const-string v3, "audio/ac4"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget v2, v0, Lf2/k;->p:I

    if-nez v2, :cond_6

    iget-object v2, v0, Lf2/k;->d:Lp3/a0;

    invoke-static {v6, v2}, Lu1/c;->a(ILp3/a0;)V

    iget-object v2, v0, Lf2/k;->d:Lp3/a0;

    const/4 v3, 0x7

    invoke-interface {v14, v2, v3}, Lx1/e0;->d(Lp3/a0;I)V

    iget v2, v0, Lf2/k;->p:I

    add-int/2addr v2, v3

    iput v2, v0, Lf2/k;->p:I

    :cond_6
    add-int/lit8 v6, v6, 0x7

    goto :goto_1

    :cond_7
    if-eqz v13, :cond_8

    invoke-virtual {v13, v1}, Lx1/f0;->d(Lx1/m;)V

    :cond_8
    :goto_1
    iget v2, v0, Lf2/k;->p:I

    if-ge v2, v6, :cond_9

    sub-int v2, v6, v2

    invoke-interface {v14, v1, v2, v10}, Lx1/e0;->f(Lo3/i;IZ)I

    move-result v2

    iget v3, v0, Lf2/k;->o:I

    add-int/2addr v3, v2

    iput v3, v0, Lf2/k;->o:I

    iget v3, v0, Lf2/k;->p:I

    add-int/2addr v3, v2

    iput v3, v0, Lf2/k;->p:I

    iget v3, v0, Lf2/k;->q:I

    sub-int/2addr v3, v2

    iput v3, v0, Lf2/k;->q:I

    goto :goto_1

    :cond_9
    move v1, v6

    iget-object v2, v4, Lf2/k$a;->b:Lf2/r;

    iget-object v3, v2, Lf2/r;->f:[J

    aget-wide v8, v3, v15

    iget-object v2, v2, Lf2/r;->g:[I

    aget v2, v2, v15

    if-eqz v13, :cond_a

    const/4 v3, 0x0

    const/16 v16, 0x0

    move-object v6, v13

    move-object v7, v14

    move v10, v2

    move-object v2, v11

    move v11, v1

    const/16 v17, 0x1

    move v12, v3

    move-object v1, v13

    move-object/from16 v13, v16

    invoke-virtual/range {v6 .. v13}, Lx1/f0;->c(Lx1/e0;JIIILx1/e0$a;)V

    add-int/lit8 v15, v15, 0x1

    iget-object v3, v4, Lf2/k$a;->b:Lf2/r;

    iget v3, v3, Lf2/r;->b:I

    if-ne v15, v3, :cond_b

    invoke-virtual {v1, v14, v2}, Lx1/f0;->a(Lx1/e0;Lx1/e0$a;)V

    goto :goto_2

    :cond_a
    const/16 v17, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v6, v14

    move-wide v7, v8

    move v9, v2

    move v10, v1

    invoke-interface/range {v6 .. v12}, Lx1/e0;->c(JIIILx1/e0$a;)V

    :cond_b
    :goto_2
    iget v1, v4, Lf2/k$a;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v4, Lf2/k$a;->e:I

    iput v5, v0, Lf2/k;->n:I

    const/4 v1, 0x0

    iput v1, v0, Lf2/k;->o:I

    iput v1, v0, Lf2/k;->p:I

    iput v1, v0, Lf2/k;->q:I

    return v1

    :cond_c
    const/16 v17, 0x1

    move-object/from16 v1, p2

    :goto_3
    iput-wide v8, v1, Lx1/a0;->a:J

    return v17
.end method

.method private E(Lx1/m;Lx1/a0;)I
    .locals 4

    iget-object v0, p0, Lf2/k;->g:Lf2/m;

    iget-object v1, p0, Lf2/k;->h:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1}, Lf2/m;->c(Lx1/m;Lx1/a0;Ljava/util/List;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-wide v0, p2, Lx1/a0;->a:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    invoke-direct {p0}, Lf2/k;->o()V

    :cond_0
    return p1
.end method

.method private static F(I)Z
    .locals 1

    const v0, 0x6d6f6f76

    if-eq p0, v0, :cond_1

    const v0, 0x7472616b

    if-eq p0, v0, :cond_1

    const v0, 0x6d646961

    if-eq p0, v0, :cond_1

    const v0, 0x6d696e66

    if-eq p0, v0, :cond_1

    const v0, 0x7374626c

    if-eq p0, v0, :cond_1

    const v0, 0x65647473

    if-eq p0, v0, :cond_1

    const v0, 0x6d657461

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static G(I)Z
    .locals 1

    const v0, 0x6d646864

    if-eq p0, v0, :cond_1

    const v0, 0x6d766864

    if-eq p0, v0, :cond_1

    const v0, 0x68646c72    # 4.3148E24f

    if-eq p0, v0, :cond_1

    const v0, 0x73747364

    if-eq p0, v0, :cond_1

    const v0, 0x73747473

    if-eq p0, v0, :cond_1

    const v0, 0x73747373

    if-eq p0, v0, :cond_1

    const v0, 0x63747473

    if-eq p0, v0, :cond_1

    const v0, 0x656c7374

    if-eq p0, v0, :cond_1

    const v0, 0x73747363

    if-eq p0, v0, :cond_1

    const v0, 0x7374737a

    if-eq p0, v0, :cond_1

    const v0, 0x73747a32

    if-eq p0, v0, :cond_1

    const v0, 0x7374636f

    if-eq p0, v0, :cond_1

    const v0, 0x636f3634

    if-eq p0, v0, :cond_1

    const v0, 0x746b6864

    if-eq p0, v0, :cond_1

    const v0, 0x66747970

    if-eq p0, v0, :cond_1

    const v0, 0x75647461

    if-eq p0, v0, :cond_1

    const v0, 0x6b657973

    if-eq p0, v0, :cond_1

    const v0, 0x696c7374

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private H(Lf2/k$a;J)V
    .locals 3

    iget-object v0, p1, Lf2/k$a;->b:Lf2/r;

    invoke-virtual {v0, p2, p3}, Lf2/r;->a(J)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, p2, p3}, Lf2/r;->b(J)I

    move-result v1

    :cond_0
    iput v1, p1, Lf2/k$a;->e:I

    return-void
.end method

.method public static synthetic k(Lf2/o;)Lf2/o;
    .locals 0

    invoke-static {p0}, Lf2/k;->s(Lf2/o;)Lf2/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l()[Lx1/l;
    .locals 1

    invoke-static {}, Lf2/k;->t()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method private static m(I)I
    .locals 1

    const v0, 0x68656963

    if-eq p0, v0, :cond_1

    const v0, 0x71742020

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x2

    return p0
.end method

.method private static n([Lf2/k$a;)[[J
    .locals 15

    array-length v0, p0

    new-array v0, v0, [[J

    array-length v1, p0

    new-array v1, v1, [I

    array-length v2, p0

    new-array v2, v2, [J

    array-length v3, p0

    new-array v3, v3, [Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    array-length v6, p0

    if-ge v5, v6, :cond_0

    aget-object v6, p0, v5

    iget-object v6, v6, Lf2/k$a;->b:Lf2/r;

    iget v6, v6, Lf2/r;->b:I

    new-array v6, v6, [J

    aput-object v6, v0, v5

    aget-object v6, p0, v5

    iget-object v6, v6, Lf2/k$a;->b:Lf2/r;

    iget-object v6, v6, Lf2/r;->f:[J

    aget-wide v7, v6, v4

    aput-wide v7, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    :goto_1
    array-length v8, p0

    if-ge v7, v8, :cond_4

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, -0x1

    const/4 v11, 0x0

    :goto_2
    array-length v12, p0

    if-ge v11, v12, :cond_2

    aget-boolean v12, v3, v11

    if-nez v12, :cond_1

    aget-wide v12, v2, v11

    cmp-long v14, v12, v8

    if-gtz v14, :cond_1

    aget-wide v8, v2, v11

    move v10, v11

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_2
    aget v8, v1, v10

    aget-object v9, v0, v10

    aput-wide v5, v9, v8

    aget-object v9, p0, v10

    iget-object v9, v9, Lf2/k$a;->b:Lf2/r;

    iget-object v9, v9, Lf2/r;->d:[I

    aget v9, v9, v8

    int-to-long v11, v9

    add-long/2addr v5, v11

    const/4 v9, 0x1

    add-int/2addr v8, v9

    aput v8, v1, v10

    aget-object v11, v0, v10

    array-length v11, v11

    if-ge v8, v11, :cond_3

    aget-object v9, p0, v10

    iget-object v9, v9, Lf2/k$a;->b:Lf2/r;

    iget-object v9, v9, Lf2/r;->f:[J

    aget-wide v8, v9, v8

    aput-wide v8, v2, v10

    goto :goto_1

    :cond_3
    aput-boolean v9, v3, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method private o()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf2/k;->i:I

    iput v0, p0, Lf2/k;->l:I

    return-void
.end method

.method private static q(Lf2/r;J)I
    .locals 2

    invoke-virtual {p0, p1, p2}, Lf2/r;->a(J)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lf2/r;->b(J)I

    move-result v0

    :cond_0
    return v0
.end method

.method private r(J)I
    .locals 20

    move-object/from16 v0, p0

    const/4 v2, -0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, 0x1

    const-wide v11, 0x7fffffffffffffffL

    const/4 v13, 0x1

    const-wide v14, 0x7fffffffffffffffL

    :goto_0
    iget-object v1, v0, Lf2/k;->s:[Lf2/k$a;

    array-length v3, v1

    if-ge v7, v3, :cond_7

    aget-object v1, v1, v7

    iget v3, v1, Lf2/k$a;->e:I

    iget-object v1, v1, Lf2/k$a;->b:Lf2/r;

    iget v4, v1, Lf2/r;->b:I

    if-ne v3, v4, :cond_0

    goto :goto_3

    :cond_0
    iget-object v1, v1, Lf2/r;->c:[J

    aget-wide v4, v1, v3

    iget-object v1, v0, Lf2/k;->t:[[J

    invoke-static {v1}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[J

    aget-object v1, v1, v7

    aget-wide v16, v1, v3

    sub-long v4, v4, p1

    const-wide/16 v18, 0x0

    cmp-long v1, v4, v18

    if-ltz v1, :cond_2

    const-wide/32 v18, 0x40000

    cmp-long v1, v4, v18

    if-ltz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x1

    :goto_2
    if-nez v1, :cond_3

    if-nez v13, :cond_4

    :cond_3
    if-ne v1, v13, :cond_5

    cmp-long v3, v4, v14

    if-gez v3, :cond_5

    :cond_4
    move v13, v1

    move-wide v14, v4

    move v6, v7

    move-wide/from16 v11, v16

    :cond_5
    cmp-long v3, v16, v8

    if-gez v3, :cond_6

    move v10, v1

    move v2, v7

    move-wide/from16 v8, v16

    :cond_6
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_7
    const-wide v3, 0x7fffffffffffffffL

    cmp-long v1, v8, v3

    if-eqz v1, :cond_8

    if-eqz v10, :cond_8

    const-wide/32 v3, 0xa00000

    add-long/2addr v8, v3

    cmp-long v1, v11, v8

    if-gez v1, :cond_9

    :cond_8
    move v2, v6

    :cond_9
    return v2
.end method

.method private static synthetic s(Lf2/o;)Lf2/o;
    .locals 0

    return-object p0
.end method

.method private static synthetic t()[Lx1/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx1/l;

    new-instance v1, Lf2/k;

    invoke-direct {v1}, Lf2/k;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private static u(Lf2/r;JJ)J
    .locals 0

    invoke-static {p0, p1, p2}, Lf2/k;->q(Lf2/r;J)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return-wide p3

    :cond_0
    iget-object p0, p0, Lf2/r;->c:[J

    aget-wide p1, p0, p1

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private v(Lx1/m;)V
    .locals 3

    iget-object v0, p0, Lf2/k;->d:Lp3/a0;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lp3/a0;->P(I)V

    iget-object v0, p0, Lf2/k;->d:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx1/m;->n([BII)V

    iget-object v0, p0, Lf2/k;->d:Lp3/a0;

    invoke-static {v0}, Lf2/b;->e(Lp3/a0;)V

    iget-object v0, p0, Lf2/k;->d:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->f()I

    move-result v0

    invoke-interface {p1, v0}, Lx1/m;->g(I)V

    invoke-interface {p1}, Lx1/m;->f()V

    return-void
.end method

.method private w(J)V
    .locals 4

    :cond_0
    :goto_0
    iget-object v0, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_2

    iget-object v0, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/a$a;

    iget-wide v2, v0, Lf2/a$a;->b:J

    cmp-long v0, v2, p1

    if-nez v0, :cond_2

    iget-object v0, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/a$a;

    iget v2, v0, Lf2/a;->a:I

    const v3, 0x6d6f6f76

    if-ne v2, v3, :cond_1

    invoke-direct {p0, v0}, Lf2/k;->z(Lf2/a$a;)V

    iget-object v0, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iput v1, p0, Lf2/k;->i:I

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/a$a;

    invoke-virtual {v1, v0}, Lf2/a$a;->d(Lf2/a$a;)V

    goto :goto_0

    :cond_2
    iget p1, p0, Lf2/k;->i:I

    if-eq p1, v1, :cond_3

    invoke-direct {p0}, Lf2/k;->o()V

    :cond_3
    return-void
.end method

.method private x()V
    .locals 5

    iget v0, p0, Lf2/k;->w:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, Lf2/k;->a:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf2/k;->r:Lx1/n;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v0

    iget-object v1, p0, Lf2/k;->x:Lq2/b;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lk2/a;

    const/4 v3, 0x1

    new-array v3, v3, [Lk2/a$b;

    iget-object v4, p0, Lf2/k;->x:Lq2/b;

    aput-object v4, v3, v2

    invoke-direct {v1, v3}, Lk2/a;-><init>([Lk2/a$b;)V

    :goto_0
    new-instance v2, Ls1/n1$b;

    invoke-direct {v2}, Ls1/n1$b;-><init>()V

    invoke-virtual {v2, v1}, Ls1/n1$b;->Z(Lk2/a;)Ls1/n1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v1

    invoke-interface {v0, v1}, Lx1/e0;->e(Ls1/n1;)V

    iget-object v0, p0, Lf2/k;->r:Lx1/n;

    invoke-interface {v0}, Lx1/n;->k()V

    iget-object v0, p0, Lf2/k;->r:Lx1/n;

    new-instance v1, Lx1/b0$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Lx1/b0$b;-><init>(J)V

    invoke-interface {v0, v1}, Lx1/n;->t(Lx1/b0;)V

    :cond_1
    return-void
.end method

.method private static y(Lp3/a0;)I
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp3/a0;->T(I)V

    invoke-virtual {p0}, Lp3/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf2/k;->m(I)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lp3/a0;->U(I)V

    :cond_1
    invoke-virtual {p0}, Lp3/a0;->a()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lp3/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf2/k;->m(I)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private z(Lf2/a$a;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iget v2, v0, Lf2/k;->w:I

    const/4 v11, 0x1

    if-ne v2, v11, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    new-instance v12, Lx1/x;

    invoke-direct {v12}, Lx1/x;-><init>()V

    const v2, 0x75647461

    invoke-virtual {v1, v2}, Lf2/a$a;->g(I)Lf2/a$b;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lf2/b;->B(Lf2/a$b;)Landroid/util/Pair;

    move-result-object v2

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lk2/a;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lk2/a;

    if-eqz v3, :cond_1

    invoke-virtual {v12, v3}, Lx1/x;->c(Lk2/a;)Z

    :cond_1
    move-object v14, v2

    move-object v15, v3

    goto :goto_1

    :cond_2
    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    const v2, 0x6d657461

    invoke-virtual {v1, v2}, Lf2/a$a;->f(I)Lf2/a$a;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lf2/b;->n(Lf2/a$a;)Lk2/a;

    move-result-object v2

    move-object v8, v2

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    :goto_2
    iget v2, v0, Lf2/k;->a:I

    and-int/2addr v2, v11

    if-eqz v2, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    sget-object v16, Lf2/i;->j:Lf2/i;

    move-object/from16 v1, p1

    move-object v2, v12

    move-object v13, v8

    move-object/from16 v8, v16

    invoke-static/range {v1 .. v8}, Lf2/b;->A(Lf2/a$a;Lx1/x;JLw1/m;ZZLb5/f;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move-wide v10, v3

    const/4 v6, 0x0

    const/4 v7, -0x1

    :goto_4
    if-ge v6, v2, :cond_c

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, Lf2/r;

    iget v5, v8, Lf2/r;->b:I

    if-nez v5, :cond_5

    move-object/from16 v18, v1

    move/from16 v19, v2

    const/4 v1, -0x1

    const/4 v8, 0x1

    goto/16 :goto_9

    :cond_5
    iget-object v5, v8, Lf2/r;->a:Lf2/o;

    move-object/from16 v18, v1

    move/from16 v19, v2

    iget-wide v1, v5, Lf2/o;->e:J

    cmp-long v20, v1, v3

    if-eqz v20, :cond_6

    goto :goto_5

    :cond_6
    iget-wide v1, v8, Lf2/r;->h:J

    :goto_5
    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    new-instance v3, Lf2/k$a;

    iget-object v4, v0, Lf2/k;->r:Lx1/n;

    move-wide/from16 v21, v10

    iget v10, v5, Lf2/o;->b:I

    invoke-interface {v4, v6, v10}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v4

    invoke-direct {v3, v5, v8, v4}, Lf2/k$a;-><init>(Lf2/o;Lf2/r;Lx1/e0;)V

    iget-object v4, v5, Lf2/o;->f:Ls1/n1;

    iget-object v4, v4, Ls1/n1;->u:Ljava/lang/String;

    const-string v10, "audio/true-hd"

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget v4, v8, Lf2/r;->e:I

    mul-int/lit8 v4, v4, 0x10

    goto :goto_6

    :cond_7
    iget v4, v8, Lf2/r;->e:I

    add-int/lit8 v4, v4, 0x1e

    :goto_6
    iget-object v10, v5, Lf2/o;->f:Ls1/n1;

    invoke-virtual {v10}, Ls1/n1;->b()Ls1/n1$b;

    move-result-object v10

    invoke-virtual {v10, v4}, Ls1/n1$b;->Y(I)Ls1/n1$b;

    iget v4, v5, Lf2/o;->b:I

    const/4 v11, 0x2

    if-ne v4, v11, :cond_8

    const-wide/16 v23, 0x0

    cmp-long v4, v1, v23

    if-lez v4, :cond_8

    iget v4, v8, Lf2/r;->b:I

    const/4 v8, 0x1

    if-le v4, v8, :cond_8

    int-to-float v4, v4

    long-to-float v1, v1

    const v2, 0x49742400    # 1000000.0f

    div-float/2addr v1, v2

    div-float/2addr v4, v1

    invoke-virtual {v10, v4}, Ls1/n1$b;->R(F)Ls1/n1$b;

    :cond_8
    iget v1, v5, Lf2/o;->b:I

    invoke-static {v1, v12, v10}, Lf2/h;->k(ILx1/x;Ls1/n1$b;)V

    iget v1, v5, Lf2/o;->b:I

    new-array v2, v11, [Lk2/a;

    const/4 v4, 0x0

    aput-object v14, v2, v4

    iget-object v4, v0, Lf2/k;->h:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, 0x0

    goto :goto_7

    :cond_9
    new-instance v4, Lk2/a;

    iget-object v8, v0, Lf2/k;->h:Ljava/util/List;

    invoke-direct {v4, v8}, Lk2/a;-><init>(Ljava/util/List;)V

    :goto_7
    const/4 v8, 0x1

    aput-object v4, v2, v8

    invoke-static {v1, v15, v13, v10, v2}, Lf2/h;->l(ILk2/a;Lk2/a;Ls1/n1$b;[Lk2/a;)V

    iget-object v1, v3, Lf2/k$a;->c:Lx1/e0;

    invoke-virtual {v10}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v2

    invoke-interface {v1, v2}, Lx1/e0;->e(Ls1/n1;)V

    iget v1, v5, Lf2/o;->b:I

    if-ne v1, v11, :cond_a

    const/4 v1, -0x1

    if-ne v7, v1, :cond_b

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    move v7, v2

    goto :goto_8

    :cond_a
    const/4 v1, -0x1

    :cond_b
    :goto_8
    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-wide/from16 v10, v21

    :goto_9
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, v18

    move/from16 v2, v19

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_4

    :cond_c
    iput v7, v0, Lf2/k;->u:I

    iput-wide v10, v0, Lf2/k;->v:J

    const/4 v1, 0x0

    new-array v1, v1, [Lf2/k$a;

    invoke-interface {v9, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lf2/k$a;

    iput-object v1, v0, Lf2/k;->s:[Lf2/k$a;

    invoke-static {v1}, Lf2/k;->n([Lf2/k$a;)[[J

    move-result-object v1

    iput-object v1, v0, Lf2/k;->t:[[J

    iget-object v1, v0, Lf2/k;->r:Lx1/n;

    invoke-interface {v1}, Lx1/n;->k()V

    iget-object v1, v0, Lf2/k;->r:Lx1/n;

    invoke-interface {v1, v0}, Lx1/n;->t(Lx1/b0;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 4

    iget-object v0, p0, Lf2/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lf2/k;->l:I

    const/4 v1, -0x1

    iput v1, p0, Lf2/k;->n:I

    iput v0, p0, Lf2/k;->o:I

    iput v0, p0, Lf2/k;->p:I

    iput v0, p0, Lf2/k;->q:I

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_1

    iget p1, p0, Lf2/k;->i:I

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    invoke-direct {p0}, Lf2/k;->o()V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lf2/k;->g:Lf2/m;

    invoke-virtual {p1}, Lf2/m;->g()V

    iget-object p1, p0, Lf2/k;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lf2/k;->s:[Lf2/k$a;

    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_3

    aget-object v1, p1, v0

    invoke-direct {p0, v1, p3, p4}, Lf2/k;->H(Lf2/k$a;J)V

    iget-object v1, v1, Lf2/k$a;->d:Lx1/f0;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lx1/f0;->b()V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public c(Lx1/n;)V
    .locals 0

    iput-object p1, p0, Lf2/k;->r:Lx1/n;

    return-void
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)Lx1/b0$a;
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, p2, v0}, Lf2/k;->p(JI)Lx1/b0$a;

    move-result-object p1

    return-object p1
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lf2/k;->v:J

    return-wide v0
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 2

    :cond_0
    iget v0, p0, Lf2/k;->i:I

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1, p2}, Lf2/k;->E(Lx1/m;Lx1/a0;)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-direct {p0, p1, p2}, Lf2/k;->D(Lx1/m;Lx1/a0;)I

    move-result p1

    return p1

    :cond_3
    invoke-direct {p0, p1, p2}, Lf2/k;->C(Lx1/m;Lx1/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_4
    invoke-direct {p0, p1}, Lf2/k;->B(Lx1/m;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1
.end method

.method public j(Lx1/m;)Z
    .locals 1

    iget v0, p0, Lf2/k;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Lf2/n;->d(Lx1/m;Z)Z

    move-result p1

    return p1
.end method

.method public p(JI)Lx1/b0$a;
    .locals 16

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, p3

    iget-object v4, v0, Lf2/k;->s:[Lf2/k$a;

    array-length v5, v4

    if-nez v5, :cond_0

    new-instance v1, Lx1/b0$a;

    sget-object v2, Lx1/c0;->c:Lx1/c0;

    invoke-direct {v1, v2}, Lx1/b0$a;-><init>(Lx1/c0;)V

    return-object v1

    :cond_0
    const-wide/16 v5, -0x1

    const/4 v7, -0x1

    if-eq v3, v7, :cond_1

    move v8, v3

    goto :goto_0

    :cond_1
    iget v8, v0, Lf2/k;->u:I

    :goto_0
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v8, v7, :cond_3

    aget-object v4, v4, v8

    iget-object v4, v4, Lf2/k$a;->b:Lf2/r;

    invoke-static {v4, v1, v2}, Lf2/k;->q(Lf2/r;J)I

    move-result v8

    if-ne v8, v7, :cond_2

    new-instance v1, Lx1/b0$a;

    sget-object v2, Lx1/c0;->c:Lx1/c0;

    invoke-direct {v1, v2}, Lx1/b0$a;-><init>(Lx1/c0;)V

    return-object v1

    :cond_2
    iget-object v11, v4, Lf2/r;->f:[J

    aget-wide v12, v11, v8

    iget-object v11, v4, Lf2/r;->c:[J

    aget-wide v14, v11, v8

    cmp-long v11, v12, v1

    if-gez v11, :cond_4

    iget v11, v4, Lf2/r;->b:I

    add-int/lit8 v11, v11, -0x1

    if-ge v8, v11, :cond_4

    invoke-virtual {v4, v1, v2}, Lf2/r;->b(J)I

    move-result v1

    if-eq v1, v7, :cond_4

    if-eq v1, v8, :cond_4

    iget-object v2, v4, Lf2/r;->f:[J

    aget-wide v5, v2, v1

    iget-object v2, v4, Lf2/r;->c:[J

    aget-wide v1, v2, v1

    goto :goto_1

    :cond_3
    const-wide v14, 0x7fffffffffffffffL

    move-wide v12, v1

    :cond_4
    move-wide v1, v5

    move-wide v5, v9

    :goto_1
    if-ne v3, v7, :cond_6

    const/4 v3, 0x0

    :goto_2
    iget-object v4, v0, Lf2/k;->s:[Lf2/k$a;

    array-length v7, v4

    if-ge v3, v7, :cond_6

    iget v7, v0, Lf2/k;->u:I

    if-eq v3, v7, :cond_5

    aget-object v4, v4, v3

    iget-object v4, v4, Lf2/k$a;->b:Lf2/r;

    invoke-static {v4, v12, v13, v14, v15}, Lf2/k;->u(Lf2/r;JJ)J

    move-result-wide v14

    cmp-long v7, v5, v9

    if-eqz v7, :cond_5

    invoke-static {v4, v5, v6, v1, v2}, Lf2/k;->u(Lf2/r;JJ)J

    move-result-wide v1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    new-instance v3, Lx1/c0;

    invoke-direct {v3, v12, v13, v14, v15}, Lx1/c0;-><init>(JJ)V

    cmp-long v4, v5, v9

    if-nez v4, :cond_7

    new-instance v1, Lx1/b0$a;

    invoke-direct {v1, v3}, Lx1/b0$a;-><init>(Lx1/c0;)V

    return-object v1

    :cond_7
    new-instance v4, Lx1/c0;

    invoke-direct {v4, v5, v6, v1, v2}, Lx1/c0;-><init>(JJ)V

    new-instance v1, Lx1/b0$a;

    invoke-direct {v1, v3, v4}, Lx1/b0$a;-><init>(Lx1/c0;Lx1/c0;)V

    return-object v1
.end method
