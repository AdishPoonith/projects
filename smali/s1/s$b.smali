.class public final Ls1/s$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field A:Z

.field B:Landroid/os/Looper;

.field C:Z

.field final a:Landroid/content/Context;

.field b:Lp3/d;

.field c:J

.field d:Lb5/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/t<",
            "Ls1/p3;",
            ">;"
        }
    .end annotation
.end field

.field e:Lb5/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/t<",
            "Lu2/u$a;",
            ">;"
        }
    .end annotation
.end field

.field f:Lb5/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/t<",
            "Ln3/c0;",
            ">;"
        }
    .end annotation
.end field

.field g:Lb5/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/t<",
            "Ls1/t1;",
            ">;"
        }
    .end annotation
.end field

.field h:Lb5/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/t<",
            "Lo3/f;",
            ">;"
        }
    .end annotation
.end field

.field i:Lb5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/f<",
            "Lp3/d;",
            "Lt1/a;",
            ">;"
        }
    .end annotation
.end field

.field j:Landroid/os/Looper;

.field k:Lp3/c0;

.field l:Lu1/e;

.field m:Z

.field n:I

.field o:Z

.field p:Z

.field q:I

.field r:I

.field s:Z

.field t:Ls1/q3;

.field u:J

.field v:J

.field w:Ls1/s1;

.field x:J

.field y:J

.field z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Ls1/v;

    invoke-direct {v0, p1}, Ls1/v;-><init>(Landroid/content/Context;)V

    new-instance v1, Ls1/x;

    invoke-direct {v1, p1}, Ls1/x;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, v1}, Ls1/s$b;-><init>(Landroid/content/Context;Lb5/t;Lb5/t;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lb5/t;Lb5/t;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lb5/t<",
            "Ls1/p3;",
            ">;",
            "Lb5/t<",
            "Lu2/u$a;",
            ">;)V"
        }
    .end annotation

    new-instance v4, Ls1/w;

    invoke-direct {v4, p1}, Ls1/w;-><init>(Landroid/content/Context;)V

    sget-object v5, Ls1/y;->j:Ls1/y;

    new-instance v6, Ls1/u;

    invoke-direct {v6, p1}, Ls1/u;-><init>(Landroid/content/Context;)V

    sget-object v7, Ls1/t;->j:Ls1/t;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Ls1/s$b;-><init>(Landroid/content/Context;Lb5/t;Lb5/t;Lb5/t;Lb5/t;Lb5/t;Lb5/f;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lb5/t;Lb5/t;Lb5/t;Lb5/t;Lb5/t;Lb5/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lb5/t<",
            "Ls1/p3;",
            ">;",
            "Lb5/t<",
            "Lu2/u$a;",
            ">;",
            "Lb5/t<",
            "Ln3/c0;",
            ">;",
            "Lb5/t<",
            "Ls1/t1;",
            ">;",
            "Lb5/t<",
            "Lo3/f;",
            ">;",
            "Lb5/f<",
            "Lp3/d;",
            "Lt1/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Ls1/s$b;->a:Landroid/content/Context;

    iput-object p2, p0, Ls1/s$b;->d:Lb5/t;

    iput-object p3, p0, Ls1/s$b;->e:Lb5/t;

    iput-object p4, p0, Ls1/s$b;->f:Lb5/t;

    iput-object p5, p0, Ls1/s$b;->g:Lb5/t;

    iput-object p6, p0, Ls1/s$b;->h:Lb5/t;

    iput-object p7, p0, Ls1/s$b;->i:Lb5/f;

    invoke-static {}, Lp3/n0;->Q()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Ls1/s$b;->j:Landroid/os/Looper;

    sget-object p1, Lu1/e;->p:Lu1/e;

    iput-object p1, p0, Ls1/s$b;->l:Lu1/e;

    const/4 p1, 0x0

    iput p1, p0, Ls1/s$b;->n:I

    const/4 p2, 0x1

    iput p2, p0, Ls1/s$b;->q:I

    iput p1, p0, Ls1/s$b;->r:I

    iput-boolean p2, p0, Ls1/s$b;->s:Z

    sget-object p1, Ls1/q3;->g:Ls1/q3;

    iput-object p1, p0, Ls1/s$b;->t:Ls1/q3;

    const-wide/16 p3, 0x1388

    iput-wide p3, p0, Ls1/s$b;->u:J

    const-wide/16 p3, 0x3a98

    iput-wide p3, p0, Ls1/s$b;->v:J

    new-instance p1, Ls1/j$b;

    invoke-direct {p1}, Ls1/j$b;-><init>()V

    invoke-virtual {p1}, Ls1/j$b;->a()Ls1/j;

    move-result-object p1

    iput-object p1, p0, Ls1/s$b;->w:Ls1/s1;

    sget-object p1, Lp3/d;->a:Lp3/d;

    iput-object p1, p0, Ls1/s$b;->b:Lp3/d;

    const-wide/16 p3, 0x1f4

    iput-wide p3, p0, Ls1/s$b;->x:J

    const-wide/16 p3, 0x7d0

    iput-wide p3, p0, Ls1/s$b;->y:J

    iput-boolean p2, p0, Ls1/s$b;->A:Z

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Lo3/f;
    .locals 0

    invoke-static {p0}, Ls1/s$b;->i(Landroid/content/Context;)Lo3/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Ls1/p3;
    .locals 0

    invoke-static {p0}, Ls1/s$b;->f(Landroid/content/Context;)Ls1/p3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;)Ln3/c0;
    .locals 0

    invoke-static {p0}, Ls1/s$b;->h(Landroid/content/Context;)Ln3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;)Lu2/u$a;
    .locals 0

    invoke-static {p0}, Ls1/s$b;->g(Landroid/content/Context;)Lu2/u$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f(Landroid/content/Context;)Ls1/p3;
    .locals 1

    new-instance v0, Ls1/m;

    invoke-direct {v0, p0}, Ls1/m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static synthetic g(Landroid/content/Context;)Lu2/u$a;
    .locals 2

    new-instance v0, Lu2/j;

    new-instance v1, Lx1/i;

    invoke-direct {v1}, Lx1/i;-><init>()V

    invoke-direct {v0, p0, v1}, Lu2/j;-><init>(Landroid/content/Context;Lx1/r;)V

    return-object v0
.end method

.method private static synthetic h(Landroid/content/Context;)Ln3/c0;
    .locals 1

    new-instance v0, Ln3/m;

    invoke-direct {v0, p0}, Ln3/m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static synthetic i(Landroid/content/Context;)Lo3/f;
    .locals 0

    invoke-static {p0}, Lo3/s;->n(Landroid/content/Context;)Lo3/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e()Ls1/s;
    .locals 2

    iget-boolean v0, p0, Ls1/s$b;->C:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iput-boolean v1, p0, Ls1/s$b;->C:Z

    new-instance v0, Ls1/x0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/x0;-><init>(Ls1/s$b;Ls1/c3;)V

    return-object v0
.end method
