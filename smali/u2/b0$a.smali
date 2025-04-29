.class public Lu2/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/b0$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lu2/u$b;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lu2/b0$a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:J


# direct methods
.method public constructor <init>()V
    .locals 6

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lu2/b0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu2/u$b;J)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu2/u$b;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lu2/b0$a$a;",
            ">;I",
            "Lu2/u$b;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lu2/b0$a;->a:I

    iput-object p3, p0, Lu2/b0$a;->b:Lu2/u$b;

    iput-wide p4, p0, Lu2/b0$a;->d:J

    return-void
.end method

.method public static synthetic a(Lu2/b0$a;Lu2/b0;Lu2/u$b;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu2/b0$a;->p(Lu2/b0;Lu2/u$b;Lu2/q;)V

    return-void
.end method

.method public static synthetic b(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu2/b0$a;->n(Lu2/b0;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic c(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu2/b0$a;->m(Lu2/b0;Lu2/n;Lu2/q;)V

    return-void
.end method

.method public static synthetic d(Lu2/b0$a;Lu2/b0;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu2/b0$a;->k(Lu2/b0;Lu2/q;)V

    return-void
.end method

.method public static synthetic e(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu2/b0$a;->o(Lu2/b0;Lu2/n;Lu2/q;)V

    return-void
.end method

.method public static synthetic f(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu2/b0$a;->l(Lu2/b0;Lu2/n;Lu2/q;)V

    return-void
.end method

.method private h(J)J
    .locals 3

    invoke-static {p1, p2}, Lp3/n0;->Y0(J)J

    move-result-wide p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lu2/b0$a;->d:J

    add-long/2addr v0, p1

    :goto_0
    return-wide v0
.end method

.method private synthetic k(Lu2/b0;Lu2/q;)V
    .locals 2

    iget v0, p0, Lu2/b0$a;->a:I

    iget-object v1, p0, Lu2/b0$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1, p2}, Lu2/b0;->T(ILu2/u$b;Lu2/q;)V

    return-void
.end method

.method private synthetic l(Lu2/b0;Lu2/n;Lu2/q;)V
    .locals 2

    iget v0, p0, Lu2/b0$a;->a:I

    iget-object v1, p0, Lu2/b0$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lu2/b0;->Y(ILu2/u$b;Lu2/n;Lu2/q;)V

    return-void
.end method

.method private synthetic m(Lu2/b0;Lu2/n;Lu2/q;)V
    .locals 2

    iget v0, p0, Lu2/b0$a;->a:I

    iget-object v1, p0, Lu2/b0$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lu2/b0;->V(ILu2/u$b;Lu2/n;Lu2/q;)V

    return-void
.end method

.method private synthetic n(Lu2/b0;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 7

    iget v1, p0, Lu2/b0$a;->a:I

    iget-object v2, p0, Lu2/b0$a;->b:Lu2/u$b;

    move-object v0, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Lu2/b0;->m0(ILu2/u$b;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method private synthetic o(Lu2/b0;Lu2/n;Lu2/q;)V
    .locals 2

    iget v0, p0, Lu2/b0$a;->a:I

    iget-object v1, p0, Lu2/b0$a;->b:Lu2/u$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lu2/b0;->U(ILu2/u$b;Lu2/n;Lu2/q;)V

    return-void
.end method

.method private synthetic p(Lu2/b0;Lu2/u$b;Lu2/q;)V
    .locals 1

    iget v0, p0, Lu2/b0$a;->a:I

    invoke-interface {p1, v0, p2, p3}, Lu2/b0;->Q(ILu2/u$b;Lu2/q;)V

    return-void
.end method


# virtual methods
.method public A(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu2/q;

    move-wide/from16 v1, p7

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lu2/q;-><init>(IILs1/n1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lu2/b0$a;->B(Lu2/n;Lu2/q;)V

    return-void
.end method

.method public B(Lu2/n;Lu2/q;)V
    .locals 4

    iget-object v0, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/b0$a$a;

    iget-object v2, v1, Lu2/b0$a$a;->b:Lu2/b0;

    iget-object v1, v1, Lu2/b0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lu2/w;

    invoke-direct {v3, p0, v2, p1, p2}, Lu2/w;-><init>(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public C(Lu2/b0;)V
    .locals 3

    iget-object v0, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/b0$a$a;

    iget-object v2, v1, Lu2/b0$a$a;->b:Lu2/b0;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public D(IJJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu2/q;

    move-wide v1, p2

    invoke-direct {p0, p2, p3}, Lu2/b0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p4

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v9

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, v11

    move v3, p1

    invoke-direct/range {v1 .. v10}, Lu2/q;-><init>(IILs1/n1;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lu2/b0$a;->E(Lu2/q;)V

    return-void
.end method

.method public E(Lu2/q;)V
    .locals 5

    iget-object v0, p0, Lu2/b0$a;->b:Lu2/u$b;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/u$b;

    iget-object v1, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/b0$a$a;

    iget-object v3, v2, Lu2/b0$a$a;->b:Lu2/b0;

    iget-object v2, v2, Lu2/b0$a$a;->a:Landroid/os/Handler;

    new-instance v4, Lu2/a0;

    invoke-direct {v4, p0, v3, v0, p1}, Lu2/a0;-><init>(Lu2/b0$a;Lu2/b0;Lu2/u$b;Lu2/q;)V

    invoke-static {v2, v4}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public F(ILu2/u$b;J)Lu2/b0$a;
    .locals 7

    new-instance v6, Lu2/b0$a;

    iget-object v1, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    move-object v0, v6

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lu2/b0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu2/u$b;J)V

    return-object v6
.end method

.method public g(Landroid/os/Handler;Lu2/b0;)V
    .locals 2

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lu2/b0$a$a;

    invoke-direct {v1, p1, p2}, Lu2/b0$a$a;-><init>(Landroid/os/Handler;Lu2/b0;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public i(ILs1/n1;ILjava/lang/Object;J)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu2/q;

    move-wide/from16 v1, p5

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v7

    const/4 v2, 0x1

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v11

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v10}, Lu2/q;-><init>(IILs1/n1;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lu2/b0$a;->j(Lu2/q;)V

    return-void
.end method

.method public j(Lu2/q;)V
    .locals 4

    iget-object v0, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/b0$a$a;

    iget-object v2, v1, Lu2/b0$a$a;->b:Lu2/b0;

    iget-object v1, v1, Lu2/b0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lu2/z;

    invoke-direct {v3, p0, v2, p1}, Lu2/z;-><init>(Lu2/b0$a;Lu2/b0;Lu2/q;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q(Lu2/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lu2/b0$a;->r(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public r(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu2/q;

    move-wide/from16 v1, p7

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lu2/q;-><init>(IILs1/n1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lu2/b0$a;->s(Lu2/n;Lu2/q;)V

    return-void
.end method

.method public s(Lu2/n;Lu2/q;)V
    .locals 4

    iget-object v0, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/b0$a$a;

    iget-object v2, v1, Lu2/b0$a$a;->b:Lu2/b0;

    iget-object v1, v1, Lu2/b0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lu2/x;

    invoke-direct {v3, p0, v2, p1, p2}, Lu2/x;-><init>(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lu2/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lu2/b0$a;->u(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public u(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu2/q;

    move-wide/from16 v1, p7

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lu2/q;-><init>(IILs1/n1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lu2/b0$a;->v(Lu2/n;Lu2/q;)V

    return-void
.end method

.method public v(Lu2/n;Lu2/q;)V
    .locals 4

    iget-object v0, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/b0$a$a;

    iget-object v2, v1, Lu2/b0$a$a;->b:Lu2/b0;

    iget-object v1, v1, Lu2/b0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lu2/v;

    invoke-direct {v3, p0, v2, p1, p2}, Lu2/v;-><init>(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;)V

    invoke-static {v1, v3}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w(Lu2/n;IILs1/n1;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu2/q;

    move-wide/from16 v1, p7

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-direct {p0, v1, v2}, Lu2/b0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lu2/q;-><init>(IILs1/n1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    move-object/from16 v2, p11

    move/from16 v3, p12

    invoke-virtual {p0, p1, v11, v2, v3}, Lu2/b0$a;->y(Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public x(Lu2/n;ILjava/io/IOException;Z)V
    .locals 13

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object/from16 v11, p3

    move/from16 v12, p4

    invoke-virtual/range {v0 .. v12}, Lu2/b0$a;->w(Lu2/n;IILs1/n1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-void
.end method

.method public y(Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 10

    iget-object v0, p0, Lu2/b0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/b0$a$a;

    iget-object v4, v1, Lu2/b0$a$a;->b:Lu2/b0;

    iget-object v1, v1, Lu2/b0$a$a;->a:Landroid/os/Handler;

    new-instance v9, Lu2/y;

    move-object v2, v9

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lu2/y;-><init>(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    invoke-static {v1, v9}, Lp3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z(Lu2/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lu2/b0$a;->A(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V

    return-void
.end method
