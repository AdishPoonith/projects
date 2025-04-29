.class final Ls1/t2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/b0;
.implements Lw1/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/t2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ls1/t2$c;

.field final synthetic b:Ls1/t2;


# direct methods
.method public constructor <init>(Ls1/t2;Ls1/t2$c;)V
    .locals 0

    iput-object p1, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ls1/t2$a;->a:Ls1/t2$c;

    return-void
.end method

.method public static synthetic A(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ls1/t2$a;->c0(Landroid/util/Pair;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic B(Ls1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/t2$a;->O(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic D(Ls1/t2$a;Landroid/util/Pair;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->R(Landroid/util/Pair;I)V

    return-void
.end method

.method public static synthetic E(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls1/t2$a;->X(Landroid/util/Pair;Lu2/n;Lu2/q;)V

    return-void
.end method

.method public static synthetic F(Ls1/t2$a;Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->S(Landroid/util/Pair;Ljava/lang/Exception;)V

    return-void
.end method

.method private K(ILu2/u$b;)Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu2/u$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lu2/u$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget-object v1, p0, Ls1/t2$a;->a:Ls1/t2$c;

    invoke-static {v1, p2}, Ls1/t2;->c(Ls1/t2$c;Lu2/u$b;)Lu2/u$b;

    move-result-object p2

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    move-object v0, p2

    :cond_1
    iget-object p2, p0, Ls1/t2$a;->a:Ls1/t2$c;

    invoke-static {p2, p1}, Ls1/t2;->d(Ls1/t2$c;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private synthetic L(Landroid/util/Pair;Lu2/q;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1, p2}, Lu2/b0;->T(ILu2/u$b;Lu2/q;)V

    return-void
.end method

.method private synthetic M(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1}, Lw1/w;->a0(ILu2/u$b;)V

    return-void
.end method

.method private synthetic N(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1}, Lw1/w;->f0(ILu2/u$b;)V

    return-void
.end method

.method private synthetic O(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1}, Lw1/w;->P(ILu2/u$b;)V

    return-void
.end method

.method private synthetic R(Landroid/util/Pair;I)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1, p2}, Lw1/w;->C(ILu2/u$b;I)V

    return-void
.end method

.method private synthetic S(Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1, p2}, Lw1/w;->I(ILu2/u$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic W(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1}, Lw1/w;->G(ILu2/u$b;)V

    return-void
.end method

.method private synthetic X(Landroid/util/Pair;Lu2/n;Lu2/q;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lu2/b0;->Y(ILu2/u$b;Lu2/n;Lu2/q;)V

    return-void
.end method

.method public static synthetic b(Ls1/t2$a;Landroid/util/Pair;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->L(Landroid/util/Pair;Lu2/q;)V

    return-void
.end method

.method private synthetic b0(Landroid/util/Pair;Lu2/n;Lu2/q;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lu2/b0;->V(ILu2/u$b;Lu2/n;Lu2/q;)V

    return-void
.end method

.method private synthetic c0(Landroid/util/Pair;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 8

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v1

    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lu2/u$b;

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-interface/range {v1 .. v7}, Lu2/b0;->m0(ILu2/u$b;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic d(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls1/t2$a;->d0(Landroid/util/Pair;Lu2/n;Lu2/q;)V

    return-void
.end method

.method private synthetic d0(Landroid/util/Pair;Lu2/n;Lu2/q;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lu2/b0;->U(ILu2/u$b;Lu2/n;Lu2/q;)V

    return-void
.end method

.method private synthetic g0(Landroid/util/Pair;Lu2/q;)V
    .locals 2

    iget-object v0, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {v0}, Ls1/t2;->e(Ls1/t2;)Lt1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu2/u$b;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu2/u$b;

    invoke-interface {v0, v1, p1, p2}, Lu2/b0;->Q(ILu2/u$b;Lu2/q;)V

    return-void
.end method

.method public static synthetic i(Ls1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/t2$a;->W(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic l(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls1/t2$a;->b0(Landroid/util/Pair;Lu2/n;Lu2/q;)V

    return-void
.end method

.method public static synthetic o(Ls1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/t2$a;->M(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic p(Ls1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/t2$a;->N(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic x(Ls1/t2$a;Landroid/util/Pair;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->g0(Landroid/util/Pair;Lu2/q;)V

    return-void
.end method


# virtual methods
.method public C(ILu2/u$b;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/n2;

    invoke-direct {v0, p0, p1, p3}, Ls1/n2;-><init>(Ls1/t2$a;Landroid/util/Pair;I)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public G(ILu2/u$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/h2;

    invoke-direct {v0, p0, p1}, Ls1/h2;-><init>(Ls1/t2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public I(ILu2/u$b;Ljava/lang/Exception;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/o2;

    invoke-direct {v0, p0, p1, p3}, Ls1/o2;-><init>(Ls1/t2$a;Landroid/util/Pair;Ljava/lang/Exception;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public P(ILu2/u$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/m2;

    invoke-direct {v0, p0, p1}, Ls1/m2;-><init>(Ls1/t2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public Q(ILu2/u$b;Lu2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/j2;

    invoke-direct {v0, p0, p1, p3}, Ls1/j2;-><init>(Ls1/t2$a;Landroid/util/Pair;Lu2/q;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public T(ILu2/u$b;Lu2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/i2;

    invoke-direct {v0, p0, p1, p3}, Ls1/i2;-><init>(Ls1/t2$a;Landroid/util/Pair;Lu2/q;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public U(ILu2/u$b;Lu2/n;Lu2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/p2;

    invoke-direct {v0, p0, p1, p3, p4}, Ls1/p2;-><init>(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public V(ILu2/u$b;Lu2/n;Lu2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/q2;

    invoke-direct {v0, p0, p1, p3, p4}, Ls1/q2;-><init>(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public Y(ILu2/u$b;Lu2/n;Lu2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/r2;

    invoke-direct {v0, p0, p1, p3, p4}, Ls1/r2;-><init>(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public a0(ILu2/u$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/k2;

    invoke-direct {v0, p0, p1}, Ls1/k2;-><init>(Ls1/t2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public f0(ILu2/u$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p2}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p2

    new-instance v0, Ls1/l2;

    invoke-direct {v0, p0, p1}, Ls1/l2;-><init>(Ls1/t2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public synthetic k0(ILu2/u$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw1/p;->a(Lw1/w;ILu2/u$b;)V

    return-void
.end method

.method public m0(ILu2/u$b;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 7

    invoke-direct {p0, p1, p2}, Ls1/t2$a;->K(ILu2/u$b;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Ls1/t2$a;->b:Ls1/t2;

    invoke-static {p1}, Ls1/t2;->b(Ls1/t2;)Lp3/n;

    move-result-object p1

    new-instance p2, Ls1/s2;

    move-object v0, p2

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Ls1/s2;-><init>(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    invoke-interface {p1, p2}, Lp3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
