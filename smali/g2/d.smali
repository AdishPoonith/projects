.class public Lg2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/l;


# static fields
.field public static final d:Lx1/r;


# instance fields
.field private a:Lx1/n;

.field private b:Lg2/i;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lg2/c;->b:Lg2/c;

    sput-object v0, Lg2/d;->d:Lx1/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d()[Lx1/l;
    .locals 1

    invoke-static {}, Lg2/d;->e()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic e()[Lx1/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx1/l;

    new-instance v1, Lg2/d;

    invoke-direct {v1}, Lg2/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private static f(Lp3/a0;)Lp3/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp3/a0;->T(I)V

    return-object p0
.end method

.method private g(Lx1/m;)Z
    .locals 5

    new-instance v0, Lg2/f;

    invoke-direct {v0}, Lg2/f;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lg2/f;->a(Lx1/m;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Lg2/f;->b:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    iget v0, v0, Lg2/f;->i:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Lp3/a0;

    invoke-direct {v2, v0}, Lp3/a0;-><init>(I)V

    invoke-virtual {v2}, Lp3/a0;->e()[B

    move-result-object v4

    invoke-interface {p1, v4, v3, v0}, Lx1/m;->n([BII)V

    invoke-static {v2}, Lg2/d;->f(Lp3/a0;)Lp3/a0;

    move-result-object p1

    invoke-static {p1}, Lg2/b;->p(Lp3/a0;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lg2/b;

    invoke-direct {p1}, Lg2/b;-><init>()V

    :goto_0
    iput-object p1, p0, Lg2/d;->b:Lg2/i;

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lg2/d;->f(Lp3/a0;)Lp3/a0;

    move-result-object p1

    invoke-static {p1}, Lg2/j;->r(Lp3/a0;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lg2/j;

    invoke-direct {p1}, Lg2/j;-><init>()V

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lg2/d;->f(Lp3/a0;)Lp3/a0;

    move-result-object p1

    invoke-static {p1}, Lg2/h;->o(Lp3/a0;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lg2/h;

    invoke-direct {p1}, Lg2/h;-><init>()V

    goto :goto_0

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 1

    iget-object v0, p0, Lg2/d;->b:Lg2/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lg2/i;->m(JJ)V

    :cond_0
    return-void
.end method

.method public c(Lx1/n;)V
    .locals 0

    iput-object p1, p0, Lg2/d;->a:Lx1/n;

    return-void
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 4

    iget-object v0, p0, Lg2/d;->a:Lx1/n;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg2/d;->b:Lg2/i;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lg2/d;->g(Lx1/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lx1/m;->f()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Failed to determine bitstream type"

    invoke-static {p2, p1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lg2/d;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lg2/d;->a:Lx1/n;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v0

    iget-object v1, p0, Lg2/d;->a:Lx1/n;

    invoke-interface {v1}, Lx1/n;->k()V

    iget-object v1, p0, Lg2/d;->b:Lg2/i;

    iget-object v3, p0, Lg2/d;->a:Lx1/n;

    invoke-virtual {v1, v3, v0}, Lg2/i;->d(Lx1/n;Lx1/e0;)V

    iput-boolean v2, p0, Lg2/d;->c:Z

    :cond_2
    iget-object v0, p0, Lg2/d;->b:Lg2/i;

    invoke-virtual {v0, p1, p2}, Lg2/i;->g(Lx1/m;Lx1/a0;)I

    move-result p1

    return p1
.end method

.method public j(Lx1/m;)Z
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Lg2/d;->g(Lx1/m;)Z

    move-result p1
    :try_end_0
    .catch Ls1/u2; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
