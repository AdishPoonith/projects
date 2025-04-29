.class final Lz2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/h0$b;
.implements Lo3/h0$f;
.implements Lu2/o0;
.implements Lx1/n;
.implements Lu2/m0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/p$c;,
        Lz2/p$d;,
        Lz2/p$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo3/h0$b<",
        "Lw2/f;",
        ">;",
        "Lo3/h0$f;",
        "Lu2/o0;",
        "Lx1/n;",
        "Lu2/m0$d;"
    }
.end annotation


# static fields
.field private static final h0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Landroid/os/Handler;

.field private final B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lz2/l;",
            ">;"
        }
    .end annotation
.end field

.field private final C:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw1/m;",
            ">;"
        }
    .end annotation
.end field

.field private D:Lw2/f;

.field private E:[Lz2/p$d;

.field private F:[I

.field private G:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private H:Landroid/util/SparseIntArray;

.field private I:Lx1/e0;

.field private J:I

.field private K:I

.field private L:Z

.field private M:Z

.field private N:I

.field private O:Ls1/n1;

.field private P:Ls1/n1;

.field private Q:Z

.field private R:Lu2/v0;

.field private S:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lu2/t0;",
            ">;"
        }
    .end annotation
.end field

.field private T:[I

.field private U:I

.field private V:Z

.field private W:[Z

.field private X:[Z

.field private Y:J

.field private Z:J

.field private a0:Z

.field private b0:Z

.field private c0:Z

.field private d0:Z

.field private e0:J

.field private f0:Lw1/m;

.field private g0:Lz2/i;

.field private final j:Ljava/lang/String;

.field private final k:I

.field private final l:Lz2/p$b;

.field private final m:Lz2/f;

.field private final n:Lo3/b;

.field private final o:Ls1/n1;

.field private final p:Lw1/y;

.field private final q:Lw1/w$a;

.field private final r:Lo3/g0;

.field private final s:Lo3/h0;

.field private final t:Lu2/b0$a;

.field private final u:I

.field private final v:Lz2/f$b;

.field private final w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lz2/i;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz2/i;",
            ">;"
        }
    .end annotation
.end field

.field private final y:Ljava/lang/Runnable;

.field private final z:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lz2/p;->h0:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILz2/p$b;Lz2/f;Ljava/util/Map;Lo3/b;JLs1/n1;Lw1/y;Lw1/w$a;Lo3/g0;Lu2/b0$a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lz2/p$b;",
            "Lz2/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw1/m;",
            ">;",
            "Lo3/b;",
            "J",
            "Ls1/n1;",
            "Lw1/y;",
            "Lw1/w$a;",
            "Lo3/g0;",
            "Lu2/b0$a;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/p;->j:Ljava/lang/String;

    iput p2, p0, Lz2/p;->k:I

    iput-object p3, p0, Lz2/p;->l:Lz2/p$b;

    iput-object p4, p0, Lz2/p;->m:Lz2/f;

    iput-object p5, p0, Lz2/p;->C:Ljava/util/Map;

    iput-object p6, p0, Lz2/p;->n:Lo3/b;

    iput-object p9, p0, Lz2/p;->o:Ls1/n1;

    iput-object p10, p0, Lz2/p;->p:Lw1/y;

    iput-object p11, p0, Lz2/p;->q:Lw1/w$a;

    iput-object p12, p0, Lz2/p;->r:Lo3/g0;

    iput-object p13, p0, Lz2/p;->t:Lu2/b0$a;

    iput p14, p0, Lz2/p;->u:I

    new-instance p1, Lo3/h0;

    const-string p2, "Loader:HlsSampleStreamWrapper"

    invoke-direct {p1, p2}, Lo3/h0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lz2/p;->s:Lo3/h0;

    new-instance p1, Lz2/f$b;

    invoke-direct {p1}, Lz2/f$b;-><init>()V

    iput-object p1, p0, Lz2/p;->v:Lz2/f$b;

    const/4 p1, 0x0

    new-array p2, p1, [I

    iput-object p2, p0, Lz2/p;->F:[I

    new-instance p2, Ljava/util/HashSet;

    sget-object p3, Lz2/p;->h0:Ljava/util/Set;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/HashSet;-><init>(I)V

    iput-object p2, p0, Lz2/p;->G:Ljava/util/Set;

    new-instance p2, Landroid/util/SparseIntArray;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/util/SparseIntArray;-><init>(I)V

    iput-object p2, p0, Lz2/p;->H:Landroid/util/SparseIntArray;

    new-array p2, p1, [Lz2/p$d;

    iput-object p2, p0, Lz2/p;->E:[Lz2/p$d;

    new-array p2, p1, [Z

    iput-object p2, p0, Lz2/p;->X:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Lz2/p;->W:[Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lz2/p;->x:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lz2/p;->B:Ljava/util/ArrayList;

    new-instance p1, Lz2/o;

    invoke-direct {p1, p0}, Lz2/o;-><init>(Lz2/p;)V

    iput-object p1, p0, Lz2/p;->y:Ljava/lang/Runnable;

    new-instance p1, Lz2/n;

    invoke-direct {p1, p0}, Lz2/n;-><init>(Lz2/p;)V

    iput-object p1, p0, Lz2/p;->z:Ljava/lang/Runnable;

    invoke-static {}, Lp3/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lz2/p;->A:Landroid/os/Handler;

    iput-wide p7, p0, Lz2/p;->Y:J

    iput-wide p7, p0, Lz2/p;->Z:J

    return-void
.end method

.method private A(I)Z
    .locals 4

    move v0, p1

    :goto_0
    iget-object v1, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/i;

    iget-boolean v1, v1, Lz2/i;->n:Z

    if-eqz v1, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/i;

    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    invoke-virtual {p1, v0}, Lz2/i;->m(I)I

    move-result v1

    iget-object v3, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Lu2/m0;->C()I

    move-result v3

    if-le v3, v1, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private static C(II)Lx1/k;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unmapped track with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "HlsSampleStreamWrapper"

    invoke-static {p1, p0}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lx1/k;

    invoke-direct {p0}, Lx1/k;-><init>()V

    return-object p0
.end method

.method private D(II)Lu2/m0;
    .locals 9

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v0, v0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    new-instance v8, Lz2/p$d;

    iget-object v3, p0, Lz2/p;->n:Lo3/b;

    iget-object v4, p0, Lz2/p;->p:Lw1/y;

    iget-object v5, p0, Lz2/p;->q:Lw1/w$a;

    iget-object v6, p0, Lz2/p;->C:Ljava/util/Map;

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lz2/p$d;-><init>(Lo3/b;Lw1/y;Lw1/w$a;Ljava/util/Map;Lz2/p$a;)V

    iget-wide v2, p0, Lz2/p;->Y:J

    invoke-virtual {v8, v2, v3}, Lu2/m0;->b0(J)V

    if-eqz v1, :cond_2

    iget-object v2, p0, Lz2/p;->f0:Lw1/m;

    invoke-virtual {v8, v2}, Lz2/p$d;->i0(Lw1/m;)V

    :cond_2
    iget-wide v2, p0, Lz2/p;->e0:J

    invoke-virtual {v8, v2, v3}, Lu2/m0;->a0(J)V

    iget-object v2, p0, Lz2/p;->g0:Lz2/i;

    if-eqz v2, :cond_3

    invoke-virtual {v8, v2}, Lz2/p$d;->j0(Lz2/i;)V

    :cond_3
    invoke-virtual {v8, p0}, Lu2/m0;->d0(Lu2/m0$d;)V

    iget-object v2, p0, Lz2/p;->F:[I

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lz2/p;->F:[I

    aput p1, v2, v0

    iget-object p1, p0, Lz2/p;->E:[Lz2/p$d;

    invoke-static {p1, v8}, Lp3/n0;->E0([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lz2/p$d;

    iput-object p1, p0, Lz2/p;->E:[Lz2/p$d;

    iget-object p1, p0, Lz2/p;->X:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lz2/p;->X:[Z

    aput-boolean v1, p1, v0

    iget-boolean v1, p0, Lz2/p;->V:Z

    aget-boolean p1, p1, v0

    or-int/2addr p1, v1

    iput-boolean p1, p0, Lz2/p;->V:Z

    iget-object p1, p0, Lz2/p;->G:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lz2/p;->H:Landroid/util/SparseIntArray;

    invoke-virtual {p1, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    invoke-static {p2}, Lz2/p;->M(I)I

    move-result p1

    iget v1, p0, Lz2/p;->J:I

    invoke-static {v1}, Lz2/p;->M(I)I

    move-result v1

    if-le p1, v1, :cond_4

    iput v0, p0, Lz2/p;->K:I

    iput p2, p0, Lz2/p;->J:I

    :cond_4
    iget-object p1, p0, Lz2/p;->W:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lz2/p;->W:[Z

    return-object v8
.end method

.method private E([Lu2/t0;)Lu2/v0;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    iget v3, v2, Lu2/t0;->j:I

    new-array v3, v3, [Ls1/n1;

    const/4 v4, 0x0

    :goto_1
    iget v5, v2, Lu2/t0;->j:I

    if-ge v4, v5, :cond_0

    invoke-virtual {v2, v4}, Lu2/t0;->b(I)Ls1/n1;

    move-result-object v5

    iget-object v6, p0, Lz2/p;->p:Lw1/y;

    invoke-interface {v6, v5}, Lw1/y;->f(Ls1/n1;)I

    move-result v6

    invoke-virtual {v5, v6}, Ls1/n1;->c(I)Ls1/n1;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    new-instance v4, Lu2/t0;

    iget-object v2, v2, Lu2/t0;->k:Ljava/lang/String;

    invoke-direct {v4, v2, v3}, Lu2/t0;-><init>(Ljava/lang/String;[Ls1/n1;)V

    aput-object v4, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lu2/v0;

    invoke-direct {v0, p1}, Lu2/v0;-><init>([Lu2/t0;)V

    return-object v0
.end method

.method private static F(Ls1/n1;Ls1/n1;Z)Ls1/n1;
    .locals 7

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0}, Lp3/v;->k(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Ls1/n1;->r:Ljava/lang/String;

    invoke-static {v1, v0}, Lp3/n0;->K(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls1/n1;->r:Ljava/lang/String;

    invoke-static {v1, v0}, Lp3/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lp3/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ls1/n1;->r:Ljava/lang/String;

    iget-object v3, p1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v1, v3}, Lp3/v;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p1, Ls1/n1;->u:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Ls1/n1;->b()Ls1/n1$b;

    move-result-object v4

    iget-object v5, p0, Ls1/n1;->j:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ls1/n1$b;->U(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v4

    iget-object v5, p0, Ls1/n1;->k:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ls1/n1$b;->W(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v4

    iget-object v5, p0, Ls1/n1;->l:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ls1/n1$b;->X(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v4

    iget v5, p0, Ls1/n1;->m:I

    invoke-virtual {v4, v5}, Ls1/n1$b;->i0(I)Ls1/n1$b;

    move-result-object v4

    iget v5, p0, Ls1/n1;->n:I

    invoke-virtual {v4, v5}, Ls1/n1$b;->e0(I)Ls1/n1$b;

    move-result-object v4

    const/4 v5, -0x1

    if-eqz p2, :cond_2

    iget v6, p0, Ls1/n1;->o:I

    goto :goto_1

    :cond_2
    const/4 v6, -0x1

    :goto_1
    invoke-virtual {v4, v6}, Ls1/n1$b;->I(I)Ls1/n1$b;

    move-result-object v4

    if-eqz p2, :cond_3

    iget p2, p0, Ls1/n1;->p:I

    goto :goto_2

    :cond_3
    const/4 p2, -0x1

    :goto_2
    invoke-virtual {v4, p2}, Ls1/n1$b;->b0(I)Ls1/n1$b;

    move-result-object p2

    invoke-virtual {p2, v1}, Ls1/n1$b;->K(Ljava/lang/String;)Ls1/n1$b;

    move-result-object p2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget v1, p0, Ls1/n1;->z:I

    invoke-virtual {p2, v1}, Ls1/n1$b;->n0(I)Ls1/n1$b;

    move-result-object v1

    iget v4, p0, Ls1/n1;->A:I

    invoke-virtual {v1, v4}, Ls1/n1$b;->S(I)Ls1/n1$b;

    move-result-object v1

    iget v4, p0, Ls1/n1;->B:F

    invoke-virtual {v1, v4}, Ls1/n1$b;->R(F)Ls1/n1$b;

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {p2, v3}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    :cond_5
    iget v1, p0, Ls1/n1;->H:I

    if-eq v1, v5, :cond_6

    if-ne v0, v2, :cond_6

    invoke-virtual {p2, v1}, Ls1/n1$b;->J(I)Ls1/n1$b;

    :cond_6
    iget-object p0, p0, Ls1/n1;->s:Lk2/a;

    if-eqz p0, :cond_8

    iget-object p1, p1, Ls1/n1;->s:Lk2/a;

    if-eqz p1, :cond_7

    invoke-virtual {p1, p0}, Lk2/a;->b(Lk2/a;)Lk2/a;

    move-result-object p0

    :cond_7
    invoke-virtual {p2, p0}, Ls1/n1$b;->Z(Lk2/a;)Ls1/n1$b;

    :cond_8
    invoke-virtual {p2}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p0

    return-object p0
.end method

.method private G(I)V
    .locals 7

    iget-object v0, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->j()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp3/a;->f(Z)V

    :goto_0
    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, -0x1

    if-ge p1, v0, :cond_1

    invoke-direct {p0, p1}, Lz2/p;->A(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_1
    if-ne p1, v1, :cond_2

    return-void

    :cond_2
    invoke-direct {p0}, Lz2/p;->K()Lz2/i;

    move-result-object v0

    iget-wide v5, v0, Lw2/f;->h:J

    invoke-direct {p0, p1}, Lz2/p;->H(I)Lz2/i;

    move-result-object p1

    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, Lz2/p;->Y:J

    iput-wide v0, p0, Lz2/p;->Z:J

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/common/collect/t;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/i;

    invoke-virtual {v0}, Lz2/i;->o()V

    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lz2/p;->c0:Z

    iget-object v1, p0, Lz2/p;->t:Lu2/b0$a;

    iget v2, p0, Lz2/p;->J:I

    iget-wide v3, p1, Lw2/f;->g:J

    invoke-virtual/range {v1 .. v6}, Lu2/b0$a;->D(IJJ)V

    return-void
.end method

.method private H(I)Lz2/i;
    .locals 3

    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/i;

    iget-object v1, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, p1, v2}, Lp3/n0;->M0(Ljava/util/List;II)V

    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v1, v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, Lz2/i;->m(I)I

    move-result v1

    iget-object v2, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v2, v2, p1

    invoke-virtual {v2, v1}, Lu2/m0;->u(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private I(Lz2/i;)Z
    .locals 4

    iget p1, p1, Lz2/i;->k:I

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lz2/p;->W:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_0

    iget-object v3, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lu2/m0;->Q()I

    move-result v3

    if-ne v3, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private static J(Ls1/n1;Ls1/n1;)Z
    .locals 6

    iget-object v0, p0, Ls1/n1;->u:Ljava/lang/String;

    iget-object v1, p1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0}, Lp3/v;->k(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1

    invoke-static {v1}, Lp3/v;->k(Ljava/lang/String;)I

    move-result p0

    if-ne v2, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3

    :cond_1
    invoke-static {v0, v1}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v4

    :cond_2
    const-string v1, "application/cea-608"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "application/cea-708"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    return v3

    :cond_4
    :goto_1
    iget p0, p0, Ls1/n1;->M:I

    iget p1, p1, Ls1/n1;->M:I

    if-ne p0, p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    return v3
.end method

.method private K()Lz2/i;
    .locals 2

    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/i;

    return-object v0
.end method

.method private L(II)Lx1/e0;
    .locals 3

    sget-object v0, Lz2/p;->h0:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lp3/a;->a(Z)V

    iget-object v0, p0, Lz2/p;->H:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Lz2/p;->G:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lz2/p;->F:[I

    aput p1, v1, v0

    :cond_1
    iget-object v1, p0, Lz2/p;->F:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_2

    iget-object p1, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object p1, p1, v0

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, Lz2/p;->C(II)Lx1/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private static M(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method private N(Lz2/i;)V
    .locals 6

    iput-object p1, p0, Lz2/p;->g0:Lz2/i;

    iget-object v0, p1, Lw2/f;->d:Ls1/n1;

    iput-object v0, p0, Lz2/p;->O:Ls1/n1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lz2/p;->Z:J

    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object v0

    iget-object v1, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    invoke-virtual {v5}, Lu2/m0;->G()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/google/common/collect/q$a;->f(Ljava/lang/Object;)Lcom/google/common/collect/q$a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lz2/i;->n(Lz2/p;Lcom/google/common/collect/q;)V

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v1, v0

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v2, v0, v3

    invoke-virtual {v2, p1}, Lz2/p$d;->j0(Lz2/i;)V

    iget-boolean v4, p1, Lz2/i;->n:Z

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lu2/m0;->g0()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private static O(Lw2/f;)Z
    .locals 0

    instance-of p0, p0, Lz2/i;

    return p0
.end method

.method private P()Z
    .locals 5

    iget-wide v0, p0, Lz2/p;->Z:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private S()V
    .locals 6

    iget-object v0, p0, Lz2/p;->R:Lu2/v0;

    iget v0, v0, Lu2/v0;->j:I

    new-array v1, v0, [I

    iput-object v1, p0, Lz2/p;->T:[I

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    const/4 v3, 0x0

    :goto_1
    iget-object v4, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lu2/m0;->F()Ls1/n1;

    move-result-object v4

    invoke-static {v4}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls1/n1;

    iget-object v5, p0, Lz2/p;->R:Lu2/v0;

    invoke-virtual {v5, v2}, Lu2/v0;->b(I)Lu2/t0;

    move-result-object v5

    invoke-virtual {v5, v1}, Lu2/t0;->b(I)Ls1/n1;

    move-result-object v5

    invoke-static {v4, v5}, Lz2/p;->J(Ls1/n1;Ls1/n1;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lz2/p;->T:[I

    aput v3, v4, v2

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lz2/p;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/l;

    invoke-virtual {v1}, Lz2/l;->a()V

    goto :goto_3

    :cond_3
    return-void
.end method

.method private T()V
    .locals 4

    iget-boolean v0, p0, Lz2/p;->Q:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lz2/p;->T:[I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lz2/p;->L:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu2/m0;->F()Ls1/n1;

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lz2/p;->R:Lu2/v0;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lz2/p;->S()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lz2/p;->z()V

    invoke-direct {p0}, Lz2/p;->l0()V

    iget-object v0, p0, Lz2/p;->l:Lz2/p$b;

    invoke-interface {v0}, Lz2/p$b;->b()V

    :cond_4
    :goto_1
    return-void
.end method

.method private c0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/p;->L:Z

    invoke-direct {p0}, Lz2/p;->T()V

    return-void
.end method

.method private g0()V
    .locals 6

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-boolean v5, p0, Lz2/p;->a0:Z

    invoke-virtual {v4, v5}, Lu2/m0;->W(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Lz2/p;->a0:Z

    return-void
.end method

.method private h0(J)Z
    .locals 4

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, Lu2/m0;->Z(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lz2/p;->X:[Z

    aget-boolean v3, v3, v2

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lz2/p;->V:Z

    if-nez v3, :cond_1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private l0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/p;->M:Z

    return-void
.end method

.method private q0([Lu2/n0;)V
    .locals 4

    iget-object v0, p0, Lz2/p;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    iget-object v3, p0, Lz2/p;->B:Ljava/util/ArrayList;

    check-cast v2, Lz2/l;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic v(Lz2/p;)V
    .locals 0

    invoke-direct {p0}, Lz2/p;->c0()V

    return-void
.end method

.method public static synthetic w(Lz2/p;)V
    .locals 0

    invoke-direct {p0}, Lz2/p;->T()V

    return-void
.end method

.method private x()V
    .locals 1

    iget-boolean v0, p0, Lz2/p;->M:Z

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Lz2/p;->R:Lu2/v0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/p;->S:Ljava/util/Set;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private z()V
    .locals 15

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v0, v0

    const/4 v1, -0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x2

    const/4 v6, -0x1

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ge v4, v0, :cond_5

    iget-object v9, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v9, v9, v4

    invoke-virtual {v9}, Lu2/m0;->F()Ls1/n1;

    move-result-object v9

    invoke-static {v9}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ls1/n1;

    iget-object v9, v9, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v9}, Lp3/v;->s(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v9}, Lp3/v;->o(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v9}, Lp3/v;->r(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x3

    goto :goto_1

    :cond_2
    const/4 v7, -0x2

    :goto_1
    invoke-static {v7}, Lz2/p;->M(I)I

    move-result v8

    invoke-static {v5}, Lz2/p;->M(I)I

    move-result v9

    if-le v8, v9, :cond_3

    move v6, v4

    move v5, v7

    goto :goto_2

    :cond_3
    if-ne v7, v5, :cond_4

    if-eq v6, v2, :cond_4

    const/4 v6, -0x1

    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v1}, Lz2/f;->j()Lu2/t0;

    move-result-object v1

    iget v4, v1, Lu2/t0;->j:I

    iput v2, p0, Lz2/p;->U:I

    new-array v2, v0, [I

    iput-object v2, p0, Lz2/p;->T:[I

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v0, :cond_6

    iget-object v9, p0, Lz2/p;->T:[I

    aput v2, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    new-array v2, v0, [Lu2/t0;

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v0, :cond_d

    iget-object v10, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v10, v10, v9

    invoke-virtual {v10}, Lu2/m0;->F()Ls1/n1;

    move-result-object v10

    invoke-static {v10}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ls1/n1;

    if-ne v9, v6, :cond_a

    new-array v11, v4, [Ls1/n1;

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v4, :cond_9

    invoke-virtual {v1, v12}, Lu2/t0;->b(I)Ls1/n1;

    move-result-object v13

    if-ne v5, v8, :cond_7

    iget-object v14, p0, Lz2/p;->o:Ls1/n1;

    if-eqz v14, :cond_7

    invoke-virtual {v13, v14}, Ls1/n1;->j(Ls1/n1;)Ls1/n1;

    move-result-object v13

    :cond_7
    if-ne v4, v8, :cond_8

    invoke-virtual {v10, v13}, Ls1/n1;->j(Ls1/n1;)Ls1/n1;

    move-result-object v13

    goto :goto_6

    :cond_8
    invoke-static {v13, v10, v8}, Lz2/p;->F(Ls1/n1;Ls1/n1;Z)Ls1/n1;

    move-result-object v13

    :goto_6
    aput-object v13, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_9
    new-instance v10, Lu2/t0;

    iget-object v12, p0, Lz2/p;->j:Ljava/lang/String;

    invoke-direct {v10, v12, v11}, Lu2/t0;-><init>(Ljava/lang/String;[Ls1/n1;)V

    aput-object v10, v2, v9

    iput v9, p0, Lz2/p;->U:I

    goto :goto_9

    :cond_a
    if-ne v5, v7, :cond_b

    iget-object v11, v10, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v11}, Lp3/v;->o(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b

    iget-object v11, p0, Lz2/p;->o:Ls1/n1;

    goto :goto_7

    :cond_b
    const/4 v11, 0x0

    :goto_7
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, p0, Lz2/p;->j:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ":muxed:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v9, v6, :cond_c

    move v13, v9

    goto :goto_8

    :cond_c
    add-int/lit8 v13, v9, -0x1

    :goto_8
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lu2/t0;

    new-array v14, v8, [Ls1/n1;

    invoke-static {v11, v10, v3}, Lz2/p;->F(Ls1/n1;Ls1/n1;Z)Ls1/n1;

    move-result-object v10

    aput-object v10, v14, v3

    invoke-direct {v13, v12, v14}, Lu2/t0;-><init>(Ljava/lang/String;[Ls1/n1;)V

    aput-object v13, v2, v9

    :goto_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_d
    invoke-direct {p0, v2}, Lz2/p;->E([Lu2/t0;)Lu2/v0;

    move-result-object v0

    iput-object v0, p0, Lz2/p;->R:Lu2/v0;

    iget-object v0, p0, Lz2/p;->S:Ljava/util/Set;

    if-nez v0, :cond_e

    const/4 v3, 0x1

    :cond_e
    invoke-static {v3}, Lp3/a;->f(Z)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lz2/p;->S:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public B()V
    .locals 2

    iget-boolean v0, p0, Lz2/p;->M:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lz2/p;->Y:J

    invoke-virtual {p0, v0, v1}, Lz2/p;->g(J)Z

    :cond_0
    return-void
.end method

.method public Q(I)Z
    .locals 1

    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lz2/p;->c0:Z

    invoke-virtual {p1, v0}, Lu2/m0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public R()Z
    .locals 2

    iget v0, p0, Lz2/p;->J:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public U()V
    .locals 1

    iget-object v0, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->b()V

    iget-object v0, p0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v0}, Lz2/f;->n()V

    return-void
.end method

.method public V(I)V
    .locals 1

    invoke-virtual {p0}, Lz2/p;->U()V

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lu2/m0;->N()V

    return-void
.end method

.method public W(Lw2/f;JJZ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Lz2/p;->D:Lw2/f;

    new-instance v2, Lu2/n;

    iget-wide v4, v1, Lw2/f;->a:J

    iget-object v6, v1, Lw2/f;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lw2/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lw2/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lw2/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Lz2/p;->r:Lo3/g0;

    iget-wide v4, v1, Lw2/f;->a:J

    invoke-interface {v3, v4, v5}, Lo3/g0;->a(J)V

    iget-object v3, v0, Lz2/p;->t:Lu2/b0$a;

    iget v5, v1, Lw2/f;->c:I

    iget v6, v0, Lz2/p;->k:I

    iget-object v7, v1, Lw2/f;->d:Ls1/n1;

    iget v8, v1, Lw2/f;->e:I

    iget-object v9, v1, Lw2/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lw2/f;->g:J

    iget-wide v12, v1, Lw2/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lu2/b0$a;->r(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, v0, Lz2/p;->N:I

    if-nez v1, :cond_1

    :cond_0
    invoke-direct {p0}, Lz2/p;->g0()V

    :cond_1
    iget v1, v0, Lz2/p;->N:I

    if-lez v1, :cond_2

    iget-object v1, v0, Lz2/p;->l:Lz2/p$b;

    invoke-interface {v1, p0}, Lu2/o0$a;->l(Lu2/o0;)V

    :cond_2
    return-void
.end method

.method public X(Lw2/f;JJ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Lz2/p;->D:Lw2/f;

    iget-object v2, v0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v2, v1}, Lz2/f;->p(Lw2/f;)V

    new-instance v2, Lu2/n;

    iget-wide v4, v1, Lw2/f;->a:J

    iget-object v6, v1, Lw2/f;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lw2/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lw2/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lw2/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Lz2/p;->r:Lo3/g0;

    iget-wide v4, v1, Lw2/f;->a:J

    invoke-interface {v3, v4, v5}, Lo3/g0;->a(J)V

    iget-object v3, v0, Lz2/p;->t:Lu2/b0$a;

    iget v5, v1, Lw2/f;->c:I

    iget v6, v0, Lz2/p;->k:I

    iget-object v7, v1, Lw2/f;->d:Ls1/n1;

    iget v8, v1, Lw2/f;->e:I

    iget-object v9, v1, Lw2/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lw2/f;->g:J

    iget-wide v12, v1, Lw2/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lu2/b0$a;->u(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V

    iget-boolean v1, v0, Lz2/p;->M:Z

    if-nez v1, :cond_0

    iget-wide v1, v0, Lz2/p;->Y:J

    invoke-virtual {p0, v1, v2}, Lz2/p;->g(J)Z

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lz2/p;->l:Lz2/p$b;

    invoke-interface {v1, p0}, Lu2/o0$a;->l(Lu2/o0;)V

    :goto_0
    return-void
.end method

.method public Y(Lw2/f;JJLjava/io/IOException;I)Lo3/h0$c;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p6

    invoke-static/range {p1 .. p1}, Lz2/p;->O(Lw2/f;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v3, v1

    check-cast v3, Lz2/i;

    invoke-virtual {v3}, Lz2/i;->q()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v13, Lo3/c0;

    if-eqz v3, :cond_1

    move-object v3, v13

    check-cast v3, Lo3/c0;

    iget v3, v3, Lo3/c0;->m:I

    const/16 v4, 0x19a

    if-eq v3, v4, :cond_0

    const/16 v4, 0x194

    if-ne v3, v4, :cond_1

    :cond_0
    sget-object v1, Lo3/h0;->d:Lo3/h0$c;

    return-object v1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lw2/f;->a()J

    move-result-wide v3

    new-instance v5, Lu2/n;

    iget-wide v6, v1, Lw2/f;->a:J

    iget-object v8, v1, Lw2/f;->b:Lo3/p;

    invoke-virtual/range {p1 .. p1}, Lw2/f;->f()Landroid/net/Uri;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lw2/f;->e()Ljava/util/Map;

    move-result-object v19

    move-object v14, v5

    move-wide v15, v6

    move-object/from16 v17, v8

    move-wide/from16 v20, p2

    move-wide/from16 v22, p4

    move-wide/from16 v24, v3

    invoke-direct/range {v14 .. v25}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v6, Lu2/q;

    iget v7, v1, Lw2/f;->c:I

    iget v8, v0, Lz2/p;->k:I

    iget-object v9, v1, Lw2/f;->d:Ls1/n1;

    iget v10, v1, Lw2/f;->e:I

    iget-object v11, v1, Lw2/f;->f:Ljava/lang/Object;

    iget-wide v14, v1, Lw2/f;->g:J

    invoke-static {v14, v15}, Lp3/n0;->Y0(J)J

    move-result-wide v26

    iget-wide v14, v1, Lw2/f;->h:J

    invoke-static {v14, v15}, Lp3/n0;->Y0(J)J

    move-result-wide v28

    move-object/from16 v20, v6

    move/from16 v21, v7

    move/from16 v22, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    move-object/from16 v25, v11

    invoke-direct/range {v20 .. v29}, Lu2/q;-><init>(IILs1/n1;ILjava/lang/Object;JJ)V

    new-instance v7, Lo3/g0$c;

    move/from16 v8, p7

    invoke-direct {v7, v5, v6, v13, v8}, Lo3/g0$c;-><init>(Lu2/n;Lu2/q;Ljava/io/IOException;I)V

    iget-object v6, v0, Lz2/p;->r:Lo3/g0;

    iget-object v8, v0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v8}, Lz2/f;->k()Ln3/t;

    move-result-object v8

    invoke-static {v8}, Ln3/b0;->c(Ln3/t;)Lo3/g0$a;

    move-result-object v8

    invoke-interface {v6, v8, v7}, Lo3/g0;->c(Lo3/g0$a;Lo3/g0$c;)Lo3/g0$b;

    move-result-object v6

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    iget v9, v6, Lo3/g0$b;->a:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_2

    iget-object v9, v0, Lz2/p;->m:Lz2/f;

    iget-wide v10, v6, Lo3/g0$b;->b:J

    invoke-virtual {v9, v1, v10, v11}, Lz2/f;->m(Lw2/f;J)Z

    move-result v6

    move v15, v6

    goto :goto_0

    :cond_2
    const/4 v15, 0x0

    :goto_0
    const/4 v6, 0x1

    if-eqz v15, :cond_6

    if-eqz v2, :cond_5

    const-wide/16 v9, 0x0

    cmp-long v2, v3, v9

    if-nez v2, :cond_5

    iget-object v2, v0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz2/i;

    if-ne v2, v1, :cond_3

    const/4 v8, 0x1

    :cond_3
    invoke-static {v8}, Lp3/a;->f(Z)V

    iget-object v2, v0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-wide v2, v0, Lz2/p;->Y:J

    iput-wide v2, v0, Lz2/p;->Z:J

    goto :goto_1

    :cond_4
    iget-object v2, v0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-static {v2}, Lcom/google/common/collect/t;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz2/i;

    invoke-virtual {v2}, Lz2/i;->o()V

    :cond_5
    :goto_1
    sget-object v2, Lo3/h0;->f:Lo3/h0$c;

    :goto_2
    move-object/from16 v16, v2

    goto :goto_3

    :cond_6
    iget-object v2, v0, Lz2/p;->r:Lo3/g0;

    invoke-interface {v2, v7}, Lo3/g0;->b(Lo3/g0$c;)J

    move-result-wide v2

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v9

    if-eqz v4, :cond_7

    invoke-static {v8, v2, v3}, Lo3/h0;->h(ZJ)Lo3/h0$c;

    move-result-object v2

    goto :goto_2

    :cond_7
    sget-object v2, Lo3/h0;->g:Lo3/h0$c;

    goto :goto_2

    :goto_3
    invoke-virtual/range {v16 .. v16}, Lo3/h0$c;->c()Z

    move-result v2

    xor-int/lit8 v17, v2, 0x1

    iget-object v2, v0, Lz2/p;->t:Lu2/b0$a;

    iget v4, v1, Lw2/f;->c:I

    iget v6, v0, Lz2/p;->k:I

    iget-object v7, v1, Lw2/f;->d:Ls1/n1;

    iget v8, v1, Lw2/f;->e:I

    iget-object v9, v1, Lw2/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lw2/f;->g:J

    iget-wide v12, v1, Lw2/f;->h:J

    move-object v3, v5

    move v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move-wide v9, v10

    move-wide v11, v12

    move-object/from16 v13, p6

    move/from16 v14, v17

    invoke-virtual/range {v2 .. v14}, Lu2/b0$a;->w(Lu2/n;IILs1/n1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v17, :cond_8

    const/4 v2, 0x0

    iput-object v2, v0, Lz2/p;->D:Lw2/f;

    iget-object v2, v0, Lz2/p;->r:Lo3/g0;

    iget-wide v3, v1, Lw2/f;->a:J

    invoke-interface {v2, v3, v4}, Lo3/g0;->a(J)V

    :cond_8
    if-eqz v15, :cond_a

    iget-boolean v1, v0, Lz2/p;->M:Z

    if-nez v1, :cond_9

    iget-wide v1, v0, Lz2/p;->Y:J

    invoke-virtual {v0, v1, v2}, Lz2/p;->g(J)Z

    goto :goto_4

    :cond_9
    iget-object v1, v0, Lz2/p;->l:Lz2/p$b;

    invoke-interface {v1, v0}, Lu2/o0$a;->l(Lu2/o0;)V

    :cond_a
    :goto_4
    return-object v16
.end method

.method public Z()V
    .locals 1

    iget-object v0, p0, Lz2/p;->G:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->j()Z

    move-result v0

    return v0
.end method

.method public a0(Landroid/net/Uri;Lo3/g0$c;Z)Z
    .locals 4

    iget-object v0, p0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v0, p1}, Lz2/f;->o(Landroid/net/Uri;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez p3, :cond_1

    iget-object p3, p0, Lz2/p;->r:Lo3/g0;

    iget-object v0, p0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v0}, Lz2/f;->k()Ln3/t;

    move-result-object v0

    invoke-static {v0}, Ln3/b0;->c(Ln3/t;)Lo3/g0$a;

    move-result-object v0

    invoke-interface {p3, v0, p2}, Lo3/g0;->c(Lo3/g0$a;Lo3/g0$c;)Lo3/g0$b;

    move-result-object p2

    if-eqz p2, :cond_1

    iget p3, p2, Lo3/g0$b;->a:I

    const/4 v0, 0x2

    if-ne p3, v0, :cond_1

    iget-wide p2, p2, Lo3/g0$b;->b:J

    goto :goto_0

    :cond_1
    move-wide p2, v2

    :goto_0
    iget-object v0, p0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v0, p1, p2, p3}, Lz2/f;->q(Landroid/net/Uri;J)Z

    move-result p1

    if-eqz p1, :cond_2

    cmp-long p1, p2, v2

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public b(Ls1/n1;)V
    .locals 1

    iget-object p1, p0, Lz2/p;->A:Landroid/os/Handler;

    iget-object v0, p0, Lz2/p;->y:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b0()V
    .locals 3

    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/common/collect/t;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/i;

    iget-object v1, p0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v1, v0}, Lz2/f;->c(Lz2/i;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lz2/i;->v()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    iget-boolean v0, p0, Lz2/p;->c0:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->f()V

    :cond_2
    :goto_0
    return-void
.end method

.method public c()J
    .locals 2

    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lz2/p;->Z:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lz2/p;->c0:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lz2/p;->K()Lz2/i;

    move-result-object v0

    iget-wide v0, v0, Lw2/f;->h:J

    :goto_0
    return-wide v0
.end method

.method public d(II)Lx1/e0;
    .locals 3

    sget-object v0, Lz2/p;->h0:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lz2/p;->L(II)Lx1/e0;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lz2/p;->F:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_1

    aget-object v0, v1, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    iget-boolean v0, p0, Lz2/p;->d0:Z

    if-eqz v0, :cond_3

    invoke-static {p1, p2}, Lz2/p;->C(II)Lx1/k;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-direct {p0, p1, p2}, Lz2/p;->D(II)Lu2/m0;

    move-result-object v0

    :cond_4
    const/4 p1, 0x5

    if-ne p2, p1, :cond_6

    iget-object p1, p0, Lz2/p;->I:Lx1/e0;

    if-nez p1, :cond_5

    new-instance p1, Lz2/p$c;

    iget p2, p0, Lz2/p;->u:I

    invoke-direct {p1, v0, p2}, Lz2/p$c;-><init>(Lx1/e0;I)V

    iput-object p1, p0, Lz2/p;->I:Lx1/e0;

    :cond_5
    iget-object p1, p0, Lz2/p;->I:Lx1/e0;

    return-object p1

    :cond_6
    return-object v0
.end method

.method public varargs d0([Lu2/t0;I[I)V
    .locals 4

    invoke-direct {p0, p1}, Lz2/p;->E([Lu2/t0;)Lu2/v0;

    move-result-object p1

    iput-object p1, p0, Lz2/p;->R:Lu2/v0;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lz2/p;->S:Ljava/util/Set;

    array-length p1, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget v1, p3, v0

    iget-object v2, p0, Lz2/p;->S:Ljava/util/Set;

    iget-object v3, p0, Lz2/p;->R:Lu2/v0;

    invoke-virtual {v3, v1}, Lu2/v0;->b(I)Lu2/t0;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput p2, p0, Lz2/p;->U:I

    iget-object p1, p0, Lz2/p;->A:Landroid/os/Handler;

    iget-object p2, p0, Lz2/p;->l:Lz2/p$b;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Lz2/m;

    invoke-direct {p3, p2}, Lz2/m;-><init>(Lz2/p$b;)V

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0}, Lz2/p;->l0()V

    return-void
.end method

.method public e(JLs1/q3;)J
    .locals 1

    iget-object v0, p0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v0, p1, p2, p3}, Lz2/f;->b(JLs1/q3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public e0(ILs1/o1;Lv1/g;I)I
    .locals 11

    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz2/i;

    invoke-direct {p0, v3}, Lz2/p;->I(Lz2/i;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-static {v3, v2, v0}, Lp3/n0;->M0(Ljava/util/List;II)V

    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/i;

    iget-object v10, v0, Lw2/f;->d:Ls1/n1;

    iget-object v3, p0, Lz2/p;->P:Ls1/n1;

    invoke-virtual {v10, v3}, Ls1/n1;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, Lz2/p;->t:Lu2/b0$a;

    iget v4, p0, Lz2/p;->k:I

    iget v6, v0, Lw2/f;->e:I

    iget-object v7, v0, Lw2/f;->f:Ljava/lang/Object;

    iget-wide v8, v0, Lw2/f;->g:J

    move-object v5, v10

    invoke-virtual/range {v3 .. v9}, Lu2/b0$a;->i(ILs1/n1;ILjava/lang/Object;J)V

    :cond_2
    iput-object v10, p0, Lz2/p;->P:Ls1/n1;

    :cond_3
    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/i;

    invoke-virtual {v0}, Lz2/i;->q()Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Lz2/p;->c0:Z

    invoke-virtual {v0, p2, p3, p4, v1}, Lu2/m0;->S(Ls1/o1;Lv1/g;IZ)I

    move-result p3

    const/4 p4, -0x5

    if-ne p3, p4, :cond_8

    iget-object p4, p2, Ls1/o1;->b:Ls1/n1;

    invoke-static {p4}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ls1/n1;

    iget v0, p0, Lz2/p;->K:I

    if-ne p1, v0, :cond_7

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lu2/m0;->Q()I

    move-result p1

    :goto_1
    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    iget-object v0, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/i;

    iget v0, v0, Lz2/i;->k:I

    if-eq v0, p1, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/i;

    iget-object p1, p1, Lw2/f;->d:Ls1/n1;

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lz2/p;->O:Ls1/n1;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls1/n1;

    :goto_2
    invoke-virtual {p4, p1}, Ls1/n1;->j(Ls1/n1;)Ls1/n1;

    move-result-object p4

    :cond_7
    iput-object p4, p2, Ls1/o1;->b:Ls1/n1;

    :cond_8
    return p3
.end method

.method public f()J
    .locals 7

    iget-boolean v0, p0, Lz2/p;->c0:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lz2/p;->Z:J

    return-wide v0

    :cond_1
    iget-wide v0, p0, Lz2/p;->Y:J

    invoke-direct {p0}, Lz2/p;->K()Lz2/i;

    move-result-object v2

    invoke-virtual {v2}, Lz2/i;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz2/i;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    iget-wide v2, v2, Lw2/f;->h:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_4
    iget-boolean v2, p0, Lz2/p;->L:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v2, v4

    invoke-virtual {v5}, Lu2/m0;->z()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-wide v0
.end method

.method public f0()V
    .locals 4

    iget-boolean v0, p0, Lz2/p;->M:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu2/m0;->R()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v0, p0}, Lo3/h0;->m(Lo3/h0$f;)V

    iget-object v0, p0, Lz2/p;->A:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/p;->Q:Z

    iget-object v0, p0, Lz2/p;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public g(J)Z
    .locals 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lz2/p;->c0:Z

    const/4 v2, 0x0

    if-nez v1, :cond_a

    iget-object v1, v0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v1}, Lo3/h0;->j()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v1}, Lo3/h0;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-direct/range {p0 .. p0}, Lz2/p;->P()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iget-wide v3, v0, Lz2/p;->Z:J

    iget-object v5, v0, Lz2/p;->E:[Lz2/p$d;

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    iget-wide v9, v0, Lz2/p;->Z:J

    invoke-virtual {v8, v9, v10}, Lu2/m0;->b0(J)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lz2/p;->x:Ljava/util/List;

    invoke-direct/range {p0 .. p0}, Lz2/p;->K()Lz2/i;

    move-result-object v3

    invoke-virtual {v3}, Lz2/i;->h()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-wide v3, v3, Lw2/f;->h:J

    goto :goto_1

    :cond_2
    iget-wide v4, v0, Lz2/p;->Y:J

    iget-wide v6, v3, Lw2/f;->g:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_3
    :goto_1
    move-object v10, v1

    move-wide v8, v3

    iget-object v1, v0, Lz2/p;->v:Lz2/f$b;

    invoke-virtual {v1}, Lz2/f$b;->a()V

    iget-object v5, v0, Lz2/p;->m:Lz2/f;

    iget-boolean v1, v0, Lz2/p;->M:Z

    const/4 v3, 0x1

    if-nez v1, :cond_5

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v11, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v11, 0x1

    :goto_3
    iget-object v12, v0, Lz2/p;->v:Lz2/f$b;

    move-wide/from16 v6, p1

    invoke-virtual/range {v5 .. v12}, Lz2/f;->e(JJLjava/util/List;ZLz2/f$b;)V

    iget-object v1, v0, Lz2/p;->v:Lz2/f$b;

    iget-boolean v4, v1, Lz2/f$b;->b:Z

    iget-object v5, v1, Lz2/f$b;->a:Lw2/f;

    iget-object v1, v1, Lz2/f$b;->c:Landroid/net/Uri;

    if-eqz v4, :cond_6

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, Lz2/p;->Z:J

    iput-boolean v3, v0, Lz2/p;->c0:Z

    return v3

    :cond_6
    if-nez v5, :cond_8

    if-eqz v1, :cond_7

    iget-object v3, v0, Lz2/p;->l:Lz2/p$b;

    invoke-interface {v3, v1}, Lz2/p$b;->k(Landroid/net/Uri;)V

    :cond_7
    return v2

    :cond_8
    invoke-static {v5}, Lz2/p;->O(Lw2/f;)Z

    move-result v1

    if-eqz v1, :cond_9

    move-object v1, v5

    check-cast v1, Lz2/i;

    invoke-direct {v0, v1}, Lz2/p;->N(Lz2/i;)V

    :cond_9
    iput-object v5, v0, Lz2/p;->D:Lw2/f;

    iget-object v1, v0, Lz2/p;->s:Lo3/h0;

    iget-object v2, v0, Lz2/p;->r:Lo3/g0;

    iget v4, v5, Lw2/f;->c:I

    invoke-interface {v2, v4}, Lo3/g0;->d(I)I

    move-result v2

    invoke-virtual {v1, v5, v0, v2}, Lo3/h0;->n(Lo3/h0$e;Lo3/h0$b;I)J

    move-result-wide v10

    iget-object v12, v0, Lz2/p;->t:Lu2/b0$a;

    new-instance v13, Lu2/n;

    iget-wide v7, v5, Lw2/f;->a:J

    iget-object v9, v5, Lw2/f;->b:Lo3/p;

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lu2/n;-><init>(JLo3/p;J)V

    iget v14, v5, Lw2/f;->c:I

    iget v15, v0, Lz2/p;->k:I

    iget-object v1, v5, Lw2/f;->d:Ls1/n1;

    iget v2, v5, Lw2/f;->e:I

    iget-object v4, v5, Lw2/f;->f:Ljava/lang/Object;

    iget-wide v6, v5, Lw2/f;->g:J

    iget-wide v8, v5, Lw2/f;->h:J

    move-object/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v18, v4

    move-wide/from16 v19, v6

    move-wide/from16 v21, v8

    invoke-virtual/range {v12 .. v22}, Lu2/b0$a;->A(Lu2/n;IILs1/n1;ILjava/lang/Object;JJ)V

    return v3

    :cond_a
    :goto_4
    return v2
.end method

.method public h(J)V
    .locals 4

    iget-object v0, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->i()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v0}, Lo3/h0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lz2/p;->D:Lw2/f;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/p;->m:Lz2/f;

    iget-object v1, p0, Lz2/p;->D:Lw2/f;

    iget-object v2, p0, Lz2/p;->x:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1, v2}, Lz2/f;->v(JLw2/f;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {p1}, Lo3/h0;->f()V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lz2/p;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_3

    iget-object v1, p0, Lz2/p;->m:Lz2/f;

    iget-object v2, p0, Lz2/p;->x:Ljava/util/List;

    add-int/lit8 v3, v0, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz2/i;

    invoke-virtual {v1, v2}, Lz2/f;->c(Lz2/i;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lz2/p;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-direct {p0, v0}, Lz2/p;->G(I)V

    :cond_4
    iget-object v0, p0, Lz2/p;->m:Lz2/f;

    iget-object v1, p0, Lz2/p;->x:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1}, Lz2/f;->h(JLjava/util/List;)I

    move-result p1

    iget-object p2, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_5

    invoke-direct {p0, p1}, Lz2/p;->G(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic i(Lo3/h0$e;JJZ)V
    .locals 0

    check-cast p1, Lw2/f;

    invoke-virtual/range {p0 .. p6}, Lz2/p;->W(Lw2/f;JJZ)V

    return-void
.end method

.method public i0(JZ)Z
    .locals 3

    iput-wide p1, p0, Lz2/p;->Y:J

    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lz2/p;->Z:J

    return v1

    :cond_0
    iget-boolean v0, p0, Lz2/p;->L:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p3, :cond_1

    invoke-direct {p0, p1, p2}, Lz2/p;->h0(J)Z

    move-result p3

    if-eqz p3, :cond_1

    return v2

    :cond_1
    iput-wide p1, p0, Lz2/p;->Z:J

    iput-boolean v2, p0, Lz2/p;->c0:Z

    iget-object p1, p0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {p1}, Lo3/h0;->j()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lz2/p;->L:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lz2/p;->E:[Lz2/p$d;

    array-length p2, p1

    :goto_0
    if-ge v2, p2, :cond_2

    aget-object p3, p1, v2

    invoke-virtual {p3}, Lu2/m0;->r()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {p1}, Lo3/h0;->f()V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {p1}, Lo3/h0;->g()V

    invoke-direct {p0}, Lz2/p;->g0()V

    :goto_1
    return v1
.end method

.method public j0([Ln3/t;[Z[Lu2/n0;[ZJZ)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-wide/from16 v12, p5

    invoke-direct/range {p0 .. p0}, Lz2/p;->x()V

    iget v3, v0, Lz2/p;->N:I

    const/4 v14, 0x0

    const/4 v4, 0x0

    :goto_0
    array-length v5, v1

    const/4 v6, 0x0

    const/4 v15, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, v2, v4

    check-cast v5, Lz2/l;

    if-eqz v5, :cond_1

    aget-object v7, v1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    :cond_0
    iget v7, v0, Lz2/p;->N:I

    sub-int/2addr v7, v15

    iput v7, v0, Lz2/p;->N:I

    invoke-virtual {v5}, Lz2/l;->e()V

    aput-object v6, v2, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-nez p7, :cond_5

    iget-boolean v4, v0, Lz2/p;->b0:Z

    if-eqz v4, :cond_3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_3
    iget-wide v3, v0, Lz2/p;->Y:J

    cmp-long v5, v12, v3

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v3, 0x1

    :goto_2
    iget-object v4, v0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v4}, Lz2/f;->k()Ln3/t;

    move-result-object v4

    move/from16 v16, v3

    move-object v11, v4

    const/4 v3, 0x0

    :goto_3
    array-length v5, v1

    if-ge v3, v5, :cond_a

    aget-object v5, v1, v3

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    iget-object v7, v0, Lz2/p;->R:Lu2/v0;

    invoke-interface {v5}, Ln3/w;->c()Lu2/t0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lu2/v0;->c(Lu2/t0;)I

    move-result v7

    iget v8, v0, Lz2/p;->U:I

    if-ne v7, v8, :cond_7

    iget-object v8, v0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v8, v5}, Lz2/f;->u(Ln3/t;)V

    move-object v11, v5

    :cond_7
    aget-object v5, v2, v3

    if-nez v5, :cond_9

    iget v5, v0, Lz2/p;->N:I

    add-int/2addr v5, v15

    iput v5, v0, Lz2/p;->N:I

    new-instance v5, Lz2/l;

    invoke-direct {v5, v0, v7}, Lz2/l;-><init>(Lz2/p;I)V

    aput-object v5, v2, v3

    aput-boolean v15, p4, v3

    iget-object v5, v0, Lz2/p;->T:[I

    if-eqz v5, :cond_9

    aget-object v5, v2, v3

    check-cast v5, Lz2/l;

    invoke-virtual {v5}, Lz2/l;->a()V

    if-nez v16, :cond_9

    iget-object v5, v0, Lz2/p;->E:[Lz2/p$d;

    iget-object v8, v0, Lz2/p;->T:[I

    aget v7, v8, v7

    aget-object v5, v5, v7

    invoke-virtual {v5, v12, v13, v15}, Lu2/m0;->Z(JZ)Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v5}, Lu2/m0;->C()I

    move-result v5

    if-eqz v5, :cond_8

    const/4 v5, 0x1

    goto :goto_4

    :cond_8
    const/4 v5, 0x0

    :goto_4
    move/from16 v16, v5

    :cond_9
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    iget v1, v0, Lz2/p;->N:I

    if-nez v1, :cond_d

    iget-object v1, v0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v1}, Lz2/f;->r()V

    iput-object v6, v0, Lz2/p;->P:Ls1/n1;

    iput-boolean v15, v0, Lz2/p;->a0:Z

    iget-object v1, v0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v1}, Lo3/h0;->j()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-boolean v1, v0, Lz2/p;->L:Z

    if-eqz v1, :cond_b

    iget-object v1, v0, Lz2/p;->E:[Lz2/p$d;

    array-length v3, v1

    :goto_6
    if-ge v14, v3, :cond_b

    aget-object v4, v1, v14

    invoke-virtual {v4}, Lu2/m0;->r()V

    add-int/lit8 v14, v14, 0x1

    goto :goto_6

    :cond_b
    iget-object v1, v0, Lz2/p;->s:Lo3/h0;

    invoke-virtual {v1}, Lo3/h0;->f()V

    goto/16 :goto_b

    :cond_c
    invoke-direct/range {p0 .. p0}, Lz2/p;->g0()V

    goto/16 :goto_b

    :cond_d
    iget-object v1, v0, Lz2/p;->w:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-static {v11, v4}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    iget-boolean v1, v0, Lz2/p;->b0:Z

    if-nez v1, :cond_10

    const-wide/16 v3, 0x0

    cmp-long v1, v12, v3

    if-gez v1, :cond_e

    neg-long v3, v12

    :cond_e
    move-wide v6, v3

    invoke-direct/range {p0 .. p0}, Lz2/p;->K()Lz2/i;

    move-result-object v1

    iget-object v3, v0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v3, v1, v12, v13}, Lz2/f;->a(Lz2/i;J)[Lw2/o;

    move-result-object v17

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v10, v0, Lz2/p;->x:Ljava/util/List;

    move-object v3, v11

    move-wide/from16 v4, p5

    move-object/from16 v18, v11

    move-object/from16 v11, v17

    invoke-interface/range {v3 .. v11}, Ln3/t;->p(JJJLjava/util/List;[Lw2/o;)V

    iget-object v3, v0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v3}, Lz2/f;->j()Lu2/t0;

    move-result-object v3

    iget-object v1, v1, Lw2/f;->d:Ls1/n1;

    invoke-virtual {v3, v1}, Lu2/t0;->c(Ls1/n1;)I

    move-result v1

    invoke-interface/range {v18 .. v18}, Ln3/t;->k()I

    move-result v3

    if-eq v3, v1, :cond_f

    goto :goto_7

    :cond_f
    const/4 v1, 0x0

    goto :goto_8

    :cond_10
    :goto_7
    const/4 v1, 0x1

    :goto_8
    if-eqz v1, :cond_11

    iput-boolean v15, v0, Lz2/p;->a0:Z

    const/4 v1, 0x1

    const/16 v16, 0x1

    goto :goto_9

    :cond_11
    move/from16 v1, p7

    :goto_9
    if-eqz v16, :cond_13

    invoke-virtual {v0, v12, v13, v1}, Lz2/p;->i0(JZ)Z

    :goto_a
    array-length v1, v2

    if-ge v14, v1, :cond_13

    aget-object v1, v2, v14

    if-eqz v1, :cond_12

    aput-boolean v15, p4, v14

    :cond_12
    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_13
    :goto_b
    invoke-direct {v0, v2}, Lz2/p;->q0([Lu2/n0;)V

    iput-boolean v15, v0, Lz2/p;->b0:Z

    return v16
.end method

.method public k()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/p;->d0:Z

    iget-object v0, p0, Lz2/p;->A:Landroid/os/Handler;

    iget-object v1, p0, Lz2/p;->z:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public k0(Lw1/m;)V
    .locals 3

    iget-object v0, p0, Lz2/p;->f0:Lw1/m;

    invoke-static {v0, p1}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Lz2/p;->f0:Lw1/m;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lz2/p;->X:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Lz2/p$d;->i0(Lw1/m;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public l()V
    .locals 4

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu2/m0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m0(Z)V
    .locals 1

    iget-object v0, p0, Lz2/p;->m:Lz2/f;

    invoke-virtual {v0, p1}, Lz2/f;->t(Z)V

    return-void
.end method

.method public n0(J)V
    .locals 4

    iget-wide v0, p0, Lz2/p;->e0:J

    cmp-long v2, v0, p1

    if-eqz v2, :cond_0

    iput-wide p1, p0, Lz2/p;->e0:J

    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lu2/m0;->a0(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic o(Lo3/h0$e;JJ)V
    .locals 0

    check-cast p1, Lw2/f;

    invoke-virtual/range {p0 .. p5}, Lz2/p;->X(Lw2/f;JJ)V

    return-void
.end method

.method public o0(IJ)I
    .locals 2

    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Lz2/p;->c0:Z

    invoke-virtual {v0, p2, p3, v1}, Lu2/m0;->E(JZ)I

    move-result p2

    iget-object p3, p0, Lz2/p;->w:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {p3, v1}, Lcom/google/common/collect/t;->d(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lz2/i;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lz2/i;->q()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lu2/m0;->C()I

    move-result v1

    invoke-virtual {p3, p1}, Lz2/i;->m(I)I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_1
    invoke-virtual {v0, p2}, Lu2/m0;->e0(I)V

    return p2
.end method

.method public p()Lu2/v0;
    .locals 1

    invoke-direct {p0}, Lz2/p;->x()V

    iget-object v0, p0, Lz2/p;->R:Lu2/v0;

    return-object v0
.end method

.method public p0(I)V
    .locals 2

    invoke-direct {p0}, Lz2/p;->x()V

    iget-object v0, p0, Lz2/p;->T:[I

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/p;->T:[I

    aget p1, v0, p1

    iget-object v0, p0, Lz2/p;->W:[Z

    aget-boolean v0, v0, p1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Lz2/p;->W:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p1

    return-void
.end method

.method public q()V
    .locals 2

    invoke-virtual {p0}, Lz2/p;->U()V

    iget-boolean v0, p0, Lz2/p;->c0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lz2/p;->M:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "Loading finished before preparation is complete."

    invoke-static {v1, v0}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public r(JZ)V
    .locals 4

    iget-boolean v0, p0, Lz2/p;->L:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lz2/p;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lz2/p;->E:[Lz2/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lz2/p;->E:[Lz2/p$d;

    aget-object v2, v2, v1

    iget-object v3, p0, Lz2/p;->W:[Z

    aget-boolean v3, v3, v1

    invoke-virtual {v2, p1, p2, p3, v3}, Lu2/m0;->q(JZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public t(Lx1/b0;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic u(Lo3/h0$e;JJLjava/io/IOException;I)Lo3/h0$c;
    .locals 0

    check-cast p1, Lw2/f;

    invoke-virtual/range {p0 .. p7}, Lz2/p;->Y(Lw2/f;JJLjava/io/IOException;I)Lo3/h0$c;

    move-result-object p1

    return-object p1
.end method

.method public y(I)I
    .locals 3

    invoke-direct {p0}, Lz2/p;->x()V

    iget-object v0, p0, Lz2/p;->T:[I

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/p;->T:[I

    aget v0, v0, p1

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lz2/p;->S:Ljava/util/Set;

    iget-object v2, p0, Lz2/p;->R:Lu2/v0;

    invoke-virtual {v2, p1}, Lu2/v0;->b(I)Lu2/t0;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, -0x3

    :cond_0
    return v1

    :cond_1
    iget-object p1, p0, Lz2/p;->W:[Z

    aget-boolean v2, p1, v0

    if-eqz v2, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x1

    aput-boolean v1, p1, v0

    return v0
.end method
