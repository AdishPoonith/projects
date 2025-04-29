.class public final Lq3/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lq3/x;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lq3/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lq3/x$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lq3/x$a;->b:Lq3/x;

    return-void
.end method

.method public static synthetic a(Lq3/x$a;Lv1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lq3/x$a;->s(Lv1/e;)V

    return-void
.end method

.method public static synthetic b(Lq3/x$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lq3/x$a;->r(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lq3/x$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lq3/x$a;->y(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lq3/x$a;Lv1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lq3/x$a;->u(Lv1/e;)V

    return-void
.end method

.method public static synthetic e(Lq3/x$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq3/x$a;->w(Ljava/lang/Object;J)V

    return-void
.end method

.method public static synthetic f(Lq3/x$a;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq3/x$a;->t(IJ)V

    return-void
.end method

.method public static synthetic g(Lq3/x$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lq3/x$a;->q(Ljava/lang/String;JJ)V

    return-void
.end method

.method public static synthetic h(Lq3/x$a;Lq3/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lq3/x$a;->z(Lq3/z;)V

    return-void
.end method

.method public static synthetic i(Lq3/x$a;Ls1/n1;Lv1/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq3/x$a;->v(Ls1/n1;Lv1/i;)V

    return-void
.end method

.method public static synthetic j(Lq3/x$a;JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq3/x$a;->x(JI)V

    return-void
.end method

.method private synthetic q(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lq3/x;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lq3/x;->g(Ljava/lang/String;JJ)V

    return-void
.end method

.method private synthetic r(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1}, Lq3/x;->e(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic s(Lv1/e;)V
    .locals 1

    invoke-virtual {p1}, Lv1/e;->c()V

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1}, Lq3/x;->t(Lv1/e;)V

    return-void
.end method

.method private synthetic t(IJ)V
    .locals 1

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1, p2, p3}, Lq3/x;->v(IJ)V

    return-void
.end method

.method private synthetic u(Lv1/e;)V
    .locals 1

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1}, Lq3/x;->z(Lv1/e;)V

    return-void
.end method

.method private synthetic v(Ls1/n1;Lv1/i;)V
    .locals 1

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1}, Lq3/x;->D(Ls1/n1;)V

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1, p2}, Lq3/x;->w(Ls1/n1;Lv1/i;)V

    return-void
.end method

.method private synthetic w(Ljava/lang/Object;J)V
    .locals 1

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1, p2, p3}, Lq3/x;->f(Ljava/lang/Object;J)V

    return-void
.end method

.method private synthetic x(JI)V
    .locals 1

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1, p2, p3}, Lq3/x;->y(JI)V

    return-void
.end method

.method private synthetic y(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1}, Lq3/x;->m(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic z(Lq3/z;)V
    .locals 1

    iget-object v0, p0, Lq3/x$a;->b:Lq3/x;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/x;

    invoke-interface {v0, p1}, Lq3/x;->o(Lq3/z;)V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lq3/x$a;->a:Landroid/os/Handler;

    new-instance v3, Lq3/q;

    invoke-direct {v3, p0, p1, v0, v1}, Lq3/q;-><init>(Lq3/x$a;Ljava/lang/Object;J)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public B(JI)V
    .locals 2

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq3/o;

    invoke-direct {v1, p0, p1, p2, p3}, Lq3/o;-><init>(Lq3/x$a;JI)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public C(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq3/p;

    invoke-direct {v1, p0, p1}, Lq3/p;-><init>(Lq3/x$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public D(Lq3/z;)V
    .locals 2

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq3/t;

    invoke-direct {v1, p0, p1}, Lq3/t;-><init>(Lq3/x$a;Lq3/z;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public k(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lq3/s;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lq3/s;-><init>(Lq3/x$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq3/r;

    invoke-direct {v1, p0, p1}, Lq3/r;-><init>(Lq3/x$a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public m(Lv1/e;)V
    .locals 2

    invoke-virtual {p1}, Lv1/e;->c()V

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq3/v;

    invoke-direct {v1, p0, p1}, Lq3/v;-><init>(Lq3/x$a;Lv1/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public n(IJ)V
    .locals 2

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq3/n;

    invoke-direct {v1, p0, p1, p2, p3}, Lq3/n;-><init>(Lq3/x$a;IJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public o(Lv1/e;)V
    .locals 2

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq3/w;

    invoke-direct {v1, p0, p1}, Lq3/w;-><init>(Lq3/x$a;Lv1/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public p(Ls1/n1;Lv1/i;)V
    .locals 2

    iget-object v0, p0, Lq3/x$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq3/u;

    invoke-direct {v1, p0, p1, p2}, Lq3/u;-><init>(Lq3/x$a;Ls1/n1;Lv1/i;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
