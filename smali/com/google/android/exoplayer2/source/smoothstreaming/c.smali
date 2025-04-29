.class final Lcom/google/android/exoplayer2/source/smoothstreaming/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/r;
.implements Lu2/o0$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu2/r;",
        "Lu2/o0$a<",
        "Lw2/i<",
        "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final j:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

.field private final k:Lo3/p0;

.field private final l:Lo3/i0;

.field private final m:Lw1/y;

.field private final n:Lw1/w$a;

.field private final o:Lo3/g0;

.field private final p:Lu2/b0$a;

.field private final q:Lo3/b;

.field private final r:Lu2/v0;

.field private final s:Lu2/h;

.field private t:Lu2/r$a;

.field private u:Lc3/a;

.field private v:[Lw2/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lw2/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation
.end field

.field private w:Lu2/o0;


# direct methods
.method public constructor <init>(Lc3/a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lo3/p0;Lu2/h;Lw1/y;Lw1/w$a;Lo3/g0;Lu2/b0$a;Lo3/i0;Lo3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lc3/a;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->j:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->k:Lo3/p0;

    iput-object p9, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->l:Lo3/i0;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->m:Lw1/y;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->n:Lw1/w$a;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->o:Lo3/g0;

    iput-object p8, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->p:Lu2/b0$a;

    iput-object p10, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->q:Lo3/b;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->s:Lu2/h;

    invoke-static {p1, p5}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->o(Lc3/a;Lw1/y;)Lu2/v0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lu2/v0;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t(I)[Lw2/i;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:[Lw2/i;

    invoke-interface {p4, p1}, Lu2/h;->a([Lu2/o0;)Lu2/o0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lu2/o0;

    return-void
.end method

.method private d(Ln3/t;J)Lw2/i;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/t;",
            "J)",
            "Lw2/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation

    move-object v13, p0

    iget-object v0, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lu2/v0;

    invoke-interface/range {p1 .. p1}, Ln3/w;->c()Lu2/t0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu2/v0;->c(Lu2/t0;)I

    move-result v0

    iget-object v2, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->j:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iget-object v3, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->l:Lo3/i0;

    iget-object v4, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lc3/a;

    iget-object v7, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->k:Lo3/p0;

    move v5, v0

    move-object/from16 v6, p1

    invoke-interface/range {v2 .. v7}, Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;->a(Lo3/i0;Lc3/a;ILn3/t;Lo3/p0;)Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    move-result-object v4

    new-instance v14, Lw2/i;

    iget-object v1, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lc3/a;

    iget-object v1, v1, Lc3/a;->f:[Lc3/a$b;

    aget-object v0, v1, v0

    iget v1, v0, Lc3/a$b;->a:I

    iget-object v6, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->q:Lo3/b;

    iget-object v9, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->m:Lw1/y;

    iget-object v10, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->n:Lw1/w$a;

    iget-object v11, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->o:Lo3/g0;

    iget-object v12, v13, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->p:Lu2/b0$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v14

    move-object v5, p0

    move-wide/from16 v7, p2

    invoke-direct/range {v0 .. v12}, Lw2/i;-><init>(I[I[Ls1/n1;Lw2/j;Lu2/o0$a;Lo3/b;JLw1/y;Lw1/w$a;Lo3/g0;Lu2/b0$a;)V

    return-object v14
.end method

.method private static o(Lc3/a;Lw1/y;)Lu2/v0;
    .locals 8

    iget-object v0, p0, Lc3/a;->f:[Lc3/a$b;

    array-length v0, v0

    new-array v0, v0, [Lu2/t0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lc3/a;->f:[Lc3/a$b;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    aget-object v3, v3, v2

    iget-object v3, v3, Lc3/a$b;->j:[Ls1/n1;

    array-length v4, v3

    new-array v4, v4, [Ls1/n1;

    const/4 v5, 0x0

    :goto_1
    array-length v6, v3

    if-ge v5, v6, :cond_0

    aget-object v6, v3, v5

    invoke-interface {p1, v6}, Lw1/y;->f(Ls1/n1;)I

    move-result v7

    invoke-virtual {v6, v7}, Ls1/n1;->c(I)Ls1/n1;

    move-result-object v6

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    new-instance v3, Lu2/t0;

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Lu2/t0;-><init>(Ljava/lang/String;[Ls1/n1;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lu2/v0;

    invoke-direct {p0, v0}, Lu2/v0;-><init>([Lu2/t0;)V

    return-object p0
.end method

.method private static t(I)[Lw2/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lw2/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;"
        }
    .end annotation

    new-array p0, p0, [Lw2/i;

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lu2/o0;

    invoke-interface {v0}, Lu2/o0;->a()Z

    move-result v0

    return v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lu2/o0;

    invoke-interface {v0}, Lu2/o0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public e(JLs1/q3;)J
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:[Lw2/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lw2/i;->j:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    invoke-virtual {v3, p1, p2, p3}, Lw2/i;->e(JLs1/q3;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-wide p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lu2/o0;

    invoke-interface {v0}, Lu2/o0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lu2/o0;

    invoke-interface {v0, p1, p2}, Lu2/o0;->g(J)Z

    move-result p1

    return p1
.end method

.method public h(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lu2/o0;

    invoke-interface {v0, p1, p2}, Lu2/o0;->h(J)V

    return-void
.end method

.method public j(Lu2/r$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:Lu2/r$a;

    invoke-interface {p1, p0}, Lu2/r$a;->i(Lu2/r;)V

    return-void
.end method

.method public bridge synthetic l(Lu2/o0;)V
    .locals 0

    check-cast p1, Lw2/i;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u(Lw2/i;)V

    return-void
.end method

.method public m([Ln3/t;[Z[Lu2/n0;[ZJ)J
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_4

    aget-object v2, p3, v1

    if-eqz v2, :cond_2

    aget-object v2, p3, v1

    check-cast v2, Lw2/i;

    aget-object v3, p1, v1

    if-eqz v3, :cond_1

    aget-boolean v3, p2, v1

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lw2/i;->E()Lw2/j;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    aget-object v4, p1, v1

    invoke-interface {v3, v4}, Lcom/google/android/exoplayer2/source/smoothstreaming/b;->c(Ln3/t;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v2}, Lw2/i;->P()V

    const/4 v2, 0x0

    aput-object v2, p3, v1

    :cond_2
    :goto_2
    aget-object v2, p3, v1

    if-nez v2, :cond_3

    aget-object v2, p1, v1

    if-eqz v2, :cond_3

    aget-object v2, p1, v1

    invoke-direct {p0, v2, p5, p6}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->d(Ln3/t;J)Lw2/i;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    aput-object v2, p3, v1

    const/4 v2, 0x1

    aput-boolean v2, p4, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t(I)[Lw2/i;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:[Lw2/i;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->s:Lu2/h;

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:[Lw2/i;

    invoke-interface {p1, p2}, Lu2/h;->a([Lu2/o0;)Lu2/o0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w:Lu2/o0;

    return-wide p5
.end method

.method public n()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public p()Lu2/v0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->r:Lu2/v0;

    return-object v0
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->l:Lo3/i0;

    invoke-interface {v0}, Lo3/i0;->b()V

    return-void
.end method

.method public r(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:[Lw2/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Lw2/i;->r(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public s(J)J
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:[Lw2/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lw2/i;->S(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide p1
.end method

.method public u(Lw2/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw2/i<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:Lu2/r$a;

    invoke-interface {p1, p0}, Lu2/o0$a;->l(Lu2/o0;)V

    return-void
.end method

.method public v()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:[Lw2/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lw2/i;->P()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:Lu2/r$a;

    return-void
.end method

.method public w(Lc3/a;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u:Lc3/a;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v:[Lw2/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lw2/i;->E()Lw2/j;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/smoothstreaming/b;

    invoke-interface {v3, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/b;->f(Lc3/a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->t:Lu2/r$a;

    invoke-interface {p1, p0}, Lu2/o0$a;->l(Lu2/o0;)V

    return-void
.end method
