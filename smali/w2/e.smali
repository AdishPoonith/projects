.class public final Lw2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/n;
.implements Lw2/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw2/e$a;
    }
.end annotation


# static fields
.field public static final s:Lw2/g$a;

.field private static final t:Lx1/a0;


# instance fields
.field private final j:Lx1/l;

.field private final k:I

.field private final l:Ls1/n1;

.field private final m:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lw2/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:Lw2/g$b;

.field private p:J

.field private q:Lx1/b0;

.field private r:[Ls1/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lw2/d;->a:Lw2/d;

    sput-object v0, Lw2/e;->s:Lw2/g$a;

    new-instance v0, Lx1/a0;

    invoke-direct {v0}, Lx1/a0;-><init>()V

    sput-object v0, Lw2/e;->t:Lx1/a0;

    return-void
.end method

.method public constructor <init>(Lx1/l;ILs1/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/e;->j:Lx1/l;

    iput p2, p0, Lw2/e;->k:I

    iput-object p3, p0, Lw2/e;->l:Ls1/n1;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lw2/e;->m:Landroid/util/SparseArray;

    return-void
.end method

.method public static synthetic g(ILs1/n1;ZLjava/util/List;Lx1/e0;Lt1/t1;)Lw2/g;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw2/e;->h(ILs1/n1;ZLjava/util/List;Lx1/e0;Lt1/t1;)Lw2/g;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic h(ILs1/n1;ZLjava/util/List;Lx1/e0;Lt1/t1;)Lw2/g;
    .locals 6

    iget-object p5, p1, Ls1/n1;->t:Ljava/lang/String;

    invoke-static {p5}, Lp3/v;->r(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p5}, Lp3/v;->q(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_1

    new-instance p2, Ld2/e;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ld2/e;-><init>(I)V

    goto :goto_1

    :cond_1
    const/4 p5, 0x0

    if-eqz p2, :cond_2

    const/4 p5, 0x4

    const/4 v1, 0x4

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    new-instance p2, Lf2/g;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lf2/g;-><init>(ILp3/j0;Lf2/o;Ljava/util/List;Lx1/e0;)V

    :goto_1
    new-instance p3, Lw2/e;

    invoke-direct {p3, p2, p0, p1}, Lw2/e;-><init>(Lx1/l;ILs1/n1;)V

    return-object p3
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lw2/e;->j:Lx1/l;

    invoke-interface {v0}, Lx1/l;->a()V

    return-void
.end method

.method public b(Lx1/m;)Z
    .locals 3

    iget-object v0, p0, Lw2/e;->j:Lx1/l;

    sget-object v1, Lw2/e;->t:Lx1/a0;

    invoke-interface {v0, p1, v1}, Lx1/l;->i(Lx1/m;Lx1/a0;)I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lp3/a;->f(Z)V

    if-nez p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public c(Lw2/g$b;JJ)V
    .locals 6

    iput-object p1, p0, Lw2/e;->o:Lw2/g$b;

    iput-wide p4, p0, Lw2/e;->p:J

    iget-boolean v0, p0, Lw2/e;->n:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v3, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lw2/e;->j:Lx1/l;

    invoke-interface {p1, p0}, Lx1/l;->c(Lx1/n;)V

    cmp-long p1, p2, v1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw2/e;->j:Lx1/l;

    invoke-interface {p1, v3, v4, p2, p3}, Lx1/l;->b(JJ)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lw2/e;->n:Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lw2/e;->j:Lx1/l;

    cmp-long v5, p2, v1

    if-nez v5, :cond_2

    move-wide p2, v3

    :cond_2
    invoke-interface {v0, v3, v4, p2, p3}, Lx1/l;->b(JJ)V

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p0, Lw2/e;->m:Landroid/util/SparseArray;

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p2, p3, :cond_3

    iget-object p3, p0, Lw2/e;->m:Landroid/util/SparseArray;

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lw2/e$a;

    invoke-virtual {p3, p1, p4, p5}, Lw2/e$a;->g(Lw2/g$b;J)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public d(II)Lx1/e0;
    .locals 3

    iget-object v0, p0, Lw2/e;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw2/e$a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lw2/e;->r:[Ls1/n1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    new-instance v0, Lw2/e$a;

    iget v1, p0, Lw2/e;->k:I

    if-ne p2, v1, :cond_1

    iget-object v1, p0, Lw2/e;->l:Ls1/n1;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, p1, p2, v1}, Lw2/e$a;-><init>(IILs1/n1;)V

    iget-object p2, p0, Lw2/e;->o:Lw2/g$b;

    iget-wide v1, p0, Lw2/e;->p:J

    invoke-virtual {v0, p2, v1, v2}, Lw2/e$a;->g(Lw2/g$b;J)V

    iget-object p2, p0, Lw2/e;->m:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public e()Lx1/d;
    .locals 2

    iget-object v0, p0, Lw2/e;->q:Lx1/b0;

    instance-of v1, v0, Lx1/d;

    if-eqz v1, :cond_0

    check-cast v0, Lx1/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public f()[Ls1/n1;
    .locals 1

    iget-object v0, p0, Lw2/e;->r:[Ls1/n1;

    return-object v0
.end method

.method public k()V
    .locals 3

    iget-object v0, p0, Lw2/e;->m:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    new-array v0, v0, [Ls1/n1;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lw2/e;->m:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lw2/e;->m:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw2/e$a;

    iget-object v2, v2, Lw2/e$a;->e:Ls1/n1;

    invoke-static {v2}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1/n1;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lw2/e;->r:[Ls1/n1;

    return-void
.end method

.method public t(Lx1/b0;)V
    .locals 0

    iput-object p1, p0, Lw2/e;->q:Lx1/b0;

    return-void
.end method
