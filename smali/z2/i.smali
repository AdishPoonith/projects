.class final Lz2/i;
.super Lw2/n;
.source "SourceFile"


# static fields
.field private static final M:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final A:Z

.field private final B:Z

.field private final C:Lt1/t1;

.field private D:Lz2/j;

.field private E:Lz2/p;

.field private F:I

.field private G:Z

.field private volatile H:Z

.field private I:Z

.field private J:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private K:Z

.field private L:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field private final p:Lo3/l;

.field private final q:Lo3/p;

.field private final r:Lz2/j;

.field private final s:Z

.field private final t:Z

.field private final u:Lp3/j0;

.field private final v:Lz2/h;

.field private final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls1/n1;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Lw1/m;

.field private final y:Lp2/h;

.field private final z:Lp3/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lz2/i;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>(Lz2/h;Lo3/l;Lo3/p;Ls1/n1;ZLo3/l;Lo3/p;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLp3/j0;Lw1/m;Lz2/j;Lp2/h;Lp3/a0;ZLt1/t1;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/h;",
            "Lo3/l;",
            "Lo3/p;",
            "Ls1/n1;",
            "Z",
            "Lo3/l;",
            "Lo3/p;",
            "Z",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Ls1/n1;",
            ">;I",
            "Ljava/lang/Object;",
            "JJJIZIZZ",
            "Lp3/j0;",
            "Lw1/m;",
            "Lz2/j;",
            "Lp2/h;",
            "Lp3/a0;",
            "Z",
            "Lt1/t1;",
            ")V"
        }
    .end annotation

    move-object v12, p0

    move-object/from16 v13, p7

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p11

    move-object/from16 v5, p12

    move-wide/from16 v6, p13

    move-wide/from16 v8, p15

    move-wide/from16 v10, p17

    invoke-direct/range {v0 .. v11}, Lw2/n;-><init>(Lo3/l;Lo3/p;Ls1/n1;ILjava/lang/Object;JJJ)V

    move/from16 v0, p5

    iput-boolean v0, v12, Lz2/i;->A:Z

    move/from16 v0, p19

    iput v0, v12, Lz2/i;->o:I

    move/from16 v0, p20

    iput-boolean v0, v12, Lz2/i;->L:Z

    move/from16 v0, p21

    iput v0, v12, Lz2/i;->l:I

    iput-object v13, v12, Lz2/i;->q:Lo3/p;

    move-object/from16 v0, p6

    iput-object v0, v12, Lz2/i;->p:Lo3/l;

    if-eqz v13, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v12, Lz2/i;->G:Z

    move/from16 v0, p8

    iput-boolean v0, v12, Lz2/i;->B:Z

    move-object/from16 v0, p9

    iput-object v0, v12, Lz2/i;->m:Landroid/net/Uri;

    move/from16 v0, p23

    iput-boolean v0, v12, Lz2/i;->s:Z

    move-object/from16 v0, p24

    iput-object v0, v12, Lz2/i;->u:Lp3/j0;

    move/from16 v0, p22

    iput-boolean v0, v12, Lz2/i;->t:Z

    move-object v0, p1

    iput-object v0, v12, Lz2/i;->v:Lz2/h;

    move-object/from16 v0, p10

    iput-object v0, v12, Lz2/i;->w:Ljava/util/List;

    move-object/from16 v0, p25

    iput-object v0, v12, Lz2/i;->x:Lw1/m;

    move-object/from16 v0, p26

    iput-object v0, v12, Lz2/i;->r:Lz2/j;

    move-object/from16 v0, p27

    iput-object v0, v12, Lz2/i;->y:Lp2/h;

    move-object/from16 v0, p28

    iput-object v0, v12, Lz2/i;->z:Lp3/a0;

    move/from16 v0, p29

    iput-boolean v0, v12, Lz2/i;->n:Z

    move-object/from16 v0, p30

    iput-object v0, v12, Lz2/i;->C:Lt1/t1;

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, v12, Lz2/i;->J:Lcom/google/common/collect/q;

    sget-object v0, Lz2/i;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, v12, Lz2/i;->k:I

    return-void
.end method

.method private static i(Lo3/l;[B[B)Lo3/l;
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lz2/a;

    invoke-direct {v0, p0, p1, p2}, Lz2/a;-><init>(Lo3/l;[B[B)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public static j(Lz2/h;Lo3/l;Ls1/n1;JLa3/g;Lz2/f$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLz2/s;Lz2/i;[B[BZLt1/t1;)Lz2/i;
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/h;",
            "Lo3/l;",
            "Ls1/n1;",
            "J",
            "La3/g;",
            "Lz2/f$e;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Ls1/n1;",
            ">;I",
            "Ljava/lang/Object;",
            "Z",
            "Lz2/s;",
            "Lz2/i;",
            "[B[BZ",
            "Lt1/t1;",
            ")",
            "Lz2/i;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p13

    move-object/from16 v4, p14

    move-object/from16 v5, p15

    iget-object v6, v2, Lz2/f$e;->a:La3/g$e;

    new-instance v7, Lo3/p$b;

    invoke-direct {v7}, Lo3/p$b;-><init>()V

    iget-object v8, v1, La3/i;->a:Ljava/lang/String;

    iget-object v9, v6, La3/g$e;->j:Ljava/lang/String;

    invoke-static {v8, v9}, Lp3/l0;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v7, v8}, Lo3/p$b;->i(Landroid/net/Uri;)Lo3/p$b;

    move-result-object v7

    iget-wide v8, v6, La3/g$e;->r:J

    invoke-virtual {v7, v8, v9}, Lo3/p$b;->h(J)Lo3/p$b;

    move-result-object v7

    iget-wide v8, v6, La3/g$e;->s:J

    invoke-virtual {v7, v8, v9}, Lo3/p$b;->g(J)Lo3/p$b;

    move-result-object v7

    iget-boolean v8, v2, Lz2/f$e;->d:Z

    if-eqz v8, :cond_0

    const/16 v8, 0x8

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7, v8}, Lo3/p$b;->b(I)Lo3/p$b;

    move-result-object v7

    invoke-virtual {v7}, Lo3/p$b;->a()Lo3/p;

    move-result-object v13

    const/4 v7, 0x1

    if-eqz v4, :cond_1

    const/4 v15, 0x1

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    if-eqz v15, :cond_2

    iget-object v10, v6, La3/g$e;->q:Ljava/lang/String;

    invoke-static {v10}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Lz2/i;->l(Ljava/lang/String;)[B

    move-result-object v10

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    :goto_2
    invoke-static {v0, v4, v10}, Lz2/i;->i(Lo3/l;[B[B)Lo3/l;

    move-result-object v12

    iget-object v4, v6, La3/g$e;->k:La3/g$d;

    if-eqz v4, :cond_5

    if-eqz v5, :cond_3

    const/4 v10, 0x1

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_4

    iget-object v11, v4, La3/g$e;->q:Ljava/lang/String;

    invoke-static {v11}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Lz2/i;->l(Ljava/lang/String;)[B

    move-result-object v11

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    :goto_4
    iget-object v14, v1, La3/i;->a:Ljava/lang/String;

    iget-object v8, v4, La3/g$e;->j:Ljava/lang/String;

    invoke-static {v14, v8}, Lp3/l0;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v18

    new-instance v8, Lo3/p;

    move/from16 p14, v10

    iget-wide v9, v4, La3/g$e;->r:J

    move/from16 v23, v15

    iget-wide v14, v4, La3/g$e;->s:J

    move-object/from16 v17, v8

    move-wide/from16 v19, v9

    move-wide/from16 v21, v14

    invoke-direct/range {v17 .. v22}, Lo3/p;-><init>(Landroid/net/Uri;JJ)V

    invoke-static {v0, v5, v11}, Lz2/i;->i(Lo3/l;[B[B)Lo3/l;

    move-result-object v0

    move/from16 v18, p14

    goto :goto_5

    :cond_5
    move/from16 v23, v15

    const/4 v0, 0x0

    const/4 v8, 0x0

    const/16 v18, 0x0

    :goto_5
    iget-wide v4, v6, La3/g$e;->n:J

    add-long v4, p3, v4

    iget-wide v9, v6, La3/g$e;->l:J

    add-long v25, v4, v9

    iget v1, v1, La3/g;->j:I

    iget v9, v6, La3/g$e;->m:I

    add-int/2addr v1, v9

    if-eqz v3, :cond_a

    iget-object v9, v3, Lz2/i;->q:Lo3/p;

    if-eq v8, v9, :cond_7

    if-eqz v8, :cond_6

    if-eqz v9, :cond_6

    iget-object v10, v8, Lo3/p;->a:Landroid/net/Uri;

    iget-object v9, v9, Lo3/p;->a:Landroid/net/Uri;

    invoke-virtual {v10, v9}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    iget-wide v9, v8, Lo3/p;->g:J

    iget-object v11, v3, Lz2/i;->q:Lo3/p;

    iget-wide v14, v11, Lo3/p;->g:J

    cmp-long v11, v9, v14

    if-nez v11, :cond_6

    goto :goto_6

    :cond_6
    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    :goto_6
    const/4 v9, 0x1

    :goto_7
    iget-object v10, v3, Lz2/i;->m:Landroid/net/Uri;

    move-object/from16 v15, p7

    invoke-virtual {v15, v10}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-boolean v10, v3, Lz2/i;->I:Z

    if-eqz v10, :cond_8

    const/16 v24, 0x1

    goto :goto_8

    :cond_8
    const/16 v24, 0x0

    :goto_8
    iget-object v10, v3, Lz2/i;->y:Lp2/h;

    iget-object v11, v3, Lz2/i;->z:Lp3/a0;

    if-eqz v9, :cond_9

    if-eqz v24, :cond_9

    iget-boolean v9, v3, Lz2/i;->K:Z

    if-nez v9, :cond_9

    iget v9, v3, Lz2/i;->l:I

    if-ne v9, v1, :cond_9

    iget-object v3, v3, Lz2/i;->D:Lz2/j;

    move-object/from16 v16, v3

    goto :goto_9

    :cond_9
    const/16 v16, 0x0

    :goto_9
    move-object/from16 v37, v10

    move-object/from16 v38, v11

    move-object/from16 v36, v16

    goto :goto_a

    :cond_a
    move-object/from16 v15, p7

    new-instance v3, Lp2/h;

    invoke-direct {v3}, Lp2/h;-><init>()V

    new-instance v9, Lp3/a0;

    const/16 v10, 0xa

    invoke-direct {v9, v10}, Lp3/a0;-><init>(I)V

    move-object/from16 v37, v3

    move-object/from16 v38, v9

    const/16 v36, 0x0

    :goto_a
    new-instance v3, Lz2/i;

    iget-wide v9, v2, Lz2/f$e;->b:J

    iget v14, v2, Lz2/f$e;->c:I

    iget-boolean v2, v2, Lz2/f$e;->d:Z

    xor-int/lit8 v30, v2, 0x1

    iget-boolean v2, v6, La3/g$e;->t:Z

    move/from16 v32, v2

    move-object/from16 v2, p12

    invoke-virtual {v2, v1}, Lz2/s;->a(I)Lp3/j0;

    move-result-object v34

    iget-object v2, v6, La3/g$e;->o:Lw1/m;

    move-object/from16 v35, v2

    move-wide v6, v9

    move-object v10, v3

    move-object/from16 v11, p0

    move v2, v14

    move-object/from16 v14, p2

    move/from16 v15, v23

    move-object/from16 v16, v0

    move-object/from16 v17, v8

    move-object/from16 v19, p7

    move-object/from16 v20, p8

    move/from16 v21, p9

    move-object/from16 v22, p10

    move-wide/from16 v23, v4

    move-wide/from16 v27, v6

    move/from16 v29, v2

    move/from16 v31, v1

    move/from16 v33, p11

    move/from16 v39, p16

    move-object/from16 v40, p17

    invoke-direct/range {v10 .. v40}, Lz2/i;-><init>(Lz2/h;Lo3/l;Lo3/p;Ls1/n1;ZLo3/l;Lo3/p;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLp3/j0;Lw1/m;Lz2/j;Lp2/h;Lp3/a0;ZLt1/t1;)V

    return-object v3
.end method

.method private k(Lo3/l;Lo3/p;ZZ)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget p3, p0, Lz2/i;->F:I

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    const/4 v0, 0x1

    :cond_0
    move-object p3, p2

    goto :goto_0

    :cond_1
    iget p3, p0, Lz2/i;->F:I

    int-to-long v1, p3

    invoke-virtual {p2, v1, v2}, Lo3/p;->e(J)Lo3/p;

    move-result-object p3

    :goto_0
    :try_start_0
    invoke-direct {p0, p1, p3, p4}, Lz2/i;->u(Lo3/l;Lo3/p;Z)Lx1/f;

    move-result-object p3

    if-eqz v0, :cond_2

    iget p4, p0, Lz2/i;->F:I

    invoke-interface {p3, p4}, Lx1/m;->g(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_2
    :goto_1
    :try_start_1
    iget-boolean p4, p0, Lz2/i;->H:Z

    if-nez p4, :cond_3

    iget-object p4, p0, Lz2/i;->D:Lz2/j;

    invoke-interface {p4, p3}, Lz2/j;->b(Lx1/m;)Z

    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p4, :cond_3

    goto :goto_1

    :cond_3
    :try_start_2
    invoke-interface {p3}, Lx1/m;->p()J

    move-result-wide p3

    iget-wide v0, p2, Lo3/p;->g:J

    :goto_2
    sub-long/2addr p3, v0

    long-to-int p2, p3

    iput p2, p0, Lz2/i;->F:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_0
    move-exception p4

    goto :goto_4

    :catch_0
    move-exception p4

    :try_start_3
    iget-object v0, p0, Lw2/f;->d:Ls1/n1;

    iget v0, v0, Ls1/n1;->n:I

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_4

    iget-object p4, p0, Lz2/i;->D:Lz2/j;

    invoke-interface {p4}, Lz2/j;->d()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {p3}, Lx1/m;->p()J

    move-result-wide p3

    iget-wide v0, p2, Lo3/p;->g:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :goto_3
    invoke-static {p1}, Lo3/o;->a(Lo3/l;)V

    return-void

    :cond_4
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_4
    :try_start_6
    invoke-interface {p3}, Lx1/m;->p()J

    move-result-wide v0

    iget-wide p2, p2, Lo3/p;->g:J

    sub-long/2addr v0, p2

    long-to-int p2, v0

    iput p2, p0, Lz2/i;->F:I

    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {p1}, Lo3/o;->a(Lo3/l;)V

    throw p2
.end method

.method private static l(Ljava/lang/String;)[B
    .locals 4

    invoke-static {p0}, Lb5/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    new-array v0, v1, [B

    array-length v2, p0

    if-le v2, v1, :cond_1

    array-length v2, p0

    sub-int/2addr v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    sub-int/2addr v1, v3

    add-int/2addr v1, v2

    array-length v3, p0

    sub-int/2addr v3, v2

    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method private static p(Lz2/f$e;La3/g;)Z
    .locals 2

    iget-object v0, p0, Lz2/f$e;->a:La3/g$e;

    instance-of v1, v0, La3/g$b;

    if-eqz v1, :cond_2

    check-cast v0, La3/g$b;

    iget-boolean v0, v0, La3/g$b;->u:Z

    if-nez v0, :cond_1

    iget p0, p0, Lz2/f$e;->c:I

    if-nez p0, :cond_0

    iget-boolean p0, p1, La3/i;->c:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0

    :cond_2
    iget-boolean p0, p1, La3/i;->c:Z

    return p0
.end method

.method private r()V
    .locals 4

    iget-object v0, p0, Lw2/f;->i:Lo3/o0;

    iget-object v1, p0, Lw2/f;->b:Lo3/p;

    iget-boolean v2, p0, Lz2/i;->A:Z

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lz2/i;->k(Lo3/l;Lo3/p;ZZ)V

    return-void
.end method

.method private s()V
    .locals 4

    iget-boolean v0, p0, Lz2/i;->G:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz2/i;->p:Lo3/l;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/i;->q:Lo3/p;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/i;->p:Lo3/l;

    iget-object v1, p0, Lz2/i;->q:Lo3/p;

    iget-boolean v2, p0, Lz2/i;->B:Z

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lz2/i;->k(Lo3/l;Lo3/p;ZZ)V

    iput v3, p0, Lz2/i;->F:I

    iput-boolean v3, p0, Lz2/i;->G:Z

    return-void
.end method

.method private t(Lx1/m;)J
    .locals 8

    invoke-interface {p1}, Lx1/m;->f()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :try_start_0
    iget-object v2, p0, Lz2/i;->z:Lp3/a0;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Lp3/a0;->P(I)V

    iget-object v2, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->e()[B

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {p1, v2, v4, v3}, Lx1/m;->n([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->J()I

    move-result v2

    const v5, 0x494433

    if-eq v2, v5, :cond_0

    return-wide v0

    :cond_0
    iget-object v2, p0, Lz2/i;->z:Lp3/a0;

    const/4 v5, 0x3

    invoke-virtual {v2, v5}, Lp3/a0;->U(I)V

    iget-object v2, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->F()I

    move-result v2

    add-int/lit8 v5, v2, 0xa

    iget-object v6, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v6}, Lp3/a0;->b()I

    move-result v6

    if-le v5, v6, :cond_1

    iget-object v6, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v6}, Lp3/a0;->e()[B

    move-result-object v6

    iget-object v7, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v7, v5}, Lp3/a0;->P(I)V

    iget-object v5, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v5}, Lp3/a0;->e()[B

    move-result-object v5

    invoke-static {v6, v4, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iget-object v5, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v5}, Lp3/a0;->e()[B

    move-result-object v5

    invoke-interface {p1, v5, v3, v2}, Lx1/m;->n([BII)V

    iget-object p1, p0, Lz2/i;->y:Lp2/h;

    iget-object v3, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v3}, Lp3/a0;->e()[B

    move-result-object v3

    invoke-virtual {p1, v3, v2}, Lp2/h;->e([BI)Lk2/a;

    move-result-object p1

    if-nez p1, :cond_2

    return-wide v0

    :cond_2
    invoke-virtual {p1}, Lk2/a;->e()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    invoke-virtual {p1, v3}, Lk2/a;->d(I)Lk2/a$b;

    move-result-object v5

    instance-of v6, v5, Lp2/l;

    if-eqz v6, :cond_3

    check-cast v5, Lp2/l;

    iget-object v6, v5, Lp2/l;->k:Ljava/lang/String;

    const-string v7, "com.apple.streaming.transportStreamTimestamp"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object p1, v5, Lp2/l;->l:[B

    iget-object v0, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {p1, v4, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {p1, v4}, Lp3/a0;->T(I)V

    iget-object p1, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {p1, v1}, Lp3/a0;->S(I)V

    iget-object p1, p0, Lz2/i;->z:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->z()J

    move-result-wide v0

    const-wide v2, 0x1ffffffffL

    and-long/2addr v0, v2

    return-wide v0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    :cond_4
    return-wide v0
.end method

.method private u(Lo3/l;Lo3/p;Z)Lx1/f;
    .locals 10

    invoke-interface {p1, p2}, Lo3/l;->m(Lo3/p;)J

    move-result-wide v4

    if-eqz p3, :cond_0

    :try_start_0
    iget-object p3, p0, Lz2/i;->u:Lp3/j0;

    iget-boolean v0, p0, Lz2/i;->s:Z

    iget-wide v1, p0, Lw2/f;->g:J

    invoke-virtual {p3, v0, v1, v2}, Lp3/j0;->h(ZJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    :cond_0
    :goto_0
    new-instance p3, Lx1/f;

    iget-wide v2, p2, Lo3/p;->g:J

    move-object v0, p3

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lx1/f;-><init>(Lo3/i;JJ)V

    iget-object v0, p0, Lz2/i;->D:Lz2/j;

    if-nez v0, :cond_4

    invoke-direct {p0, p3}, Lz2/i;->t(Lx1/m;)J

    move-result-wide v8

    invoke-virtual {p3}, Lx1/f;->f()V

    iget-object v0, p0, Lz2/i;->r:Lz2/j;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lz2/j;->f()Lz2/j;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lz2/i;->v:Lz2/h;

    iget-object v1, p2, Lo3/p;->a:Landroid/net/Uri;

    iget-object v2, p0, Lw2/f;->d:Ls1/n1;

    iget-object v3, p0, Lz2/i;->w:Ljava/util/List;

    iget-object v4, p0, Lz2/i;->u:Lp3/j0;

    invoke-interface {p1}, Lo3/l;->e()Ljava/util/Map;

    move-result-object v5

    iget-object v7, p0, Lz2/i;->C:Lt1/t1;

    move-object v6, p3

    invoke-interface/range {v0 .. v7}, Lz2/h;->a(Landroid/net/Uri;Ls1/n1;Ljava/util/List;Lp3/j0;Ljava/util/Map;Lx1/m;Lt1/t1;)Lz2/j;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lz2/i;->D:Lz2/j;

    invoke-interface {p1}, Lz2/j;->a()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lz2/i;->E:Lz2/p;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v8, v0

    if-eqz p2, :cond_2

    iget-object p2, p0, Lz2/i;->u:Lp3/j0;

    invoke-virtual {p2, v8, v9}, Lp3/j0;->b(J)J

    move-result-wide v0

    goto :goto_2

    :cond_2
    iget-wide v0, p0, Lw2/f;->g:J

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lz2/i;->E:Lz2/p;

    const-wide/16 v0, 0x0

    :goto_2
    invoke-virtual {p1, v0, v1}, Lz2/p;->n0(J)V

    iget-object p1, p0, Lz2/i;->E:Lz2/p;

    invoke-virtual {p1}, Lz2/p;->Z()V

    iget-object p1, p0, Lz2/i;->D:Lz2/j;

    iget-object p2, p0, Lz2/i;->E:Lz2/p;

    invoke-interface {p1, p2}, Lz2/j;->c(Lx1/n;)V

    :cond_4
    iget-object p1, p0, Lz2/i;->E:Lz2/p;

    iget-object p2, p0, Lz2/i;->x:Lw1/m;

    invoke-virtual {p1, p2}, Lz2/p;->k0(Lw1/m;)V

    return-object p3
.end method

.method public static w(Lz2/i;Landroid/net/Uri;La3/g;Lz2/f$e;J)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lz2/i;->m:Landroid/net/Uri;

    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lz2/i;->I:Z

    if-eqz p1, :cond_1

    return v0

    :cond_1
    iget-object p1, p3, Lz2/f$e;->a:La3/g$e;

    iget-wide v1, p1, La3/g$e;->n:J

    add-long/2addr p4, v1

    invoke-static {p3, p2}, Lz2/i;->p(Lz2/f$e;La3/g;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-wide p0, p0, Lw2/f;->h:J

    cmp-long p2, p4, p0

    if-gez p2, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    return v0
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lz2/i;->E:Lz2/p;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/i;->D:Lz2/j;

    if-nez v0, :cond_0

    iget-object v0, p0, Lz2/i;->r:Lz2/j;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz2/j;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/i;->r:Lz2/j;

    iput-object v0, p0, Lz2/i;->D:Lz2/j;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz2/i;->G:Z

    :cond_0
    invoke-direct {p0}, Lz2/i;->s()V

    iget-boolean v0, p0, Lz2/i;->H:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lz2/i;->t:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lz2/i;->r()V

    :cond_1
    iget-boolean v0, p0, Lz2/i;->H:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lz2/i;->I:Z

    :cond_2
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/i;->H:Z

    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lz2/i;->I:Z

    return v0
.end method

.method public m(I)I
    .locals 1

    iget-boolean v0, p0, Lz2/i;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Lz2/i;->J:Lcom/google/common/collect/q;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lz2/i;->J:Lcom/google/common/collect/q;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public n(Lz2/p;Lcom/google/common/collect/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/p;",
            "Lcom/google/common/collect/q<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz2/i;->E:Lz2/p;

    iput-object p2, p0, Lz2/i;->J:Lcom/google/common/collect/q;

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/i;->K:Z

    return-void
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lz2/i;->L:Z

    return v0
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/i;->L:Z

    return-void
.end method
