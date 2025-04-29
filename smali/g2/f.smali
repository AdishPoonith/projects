.class final Lg2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:I

.field public h:I

.field public i:I

.field public final j:[I

.field private final k:Lp3/a0;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xff

    new-array v1, v0, [I

    iput-object v1, p0, Lg2/f;->j:[I

    new-instance v1, Lp3/a0;

    invoke-direct {v1, v0}, Lp3/a0;-><init>(I)V

    iput-object v1, p0, Lg2/f;->k:Lp3/a0;

    return-void
.end method


# virtual methods
.method public a(Lx1/m;Z)Z
    .locals 6

    invoke-virtual {p0}, Lg2/f;->b()V

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    const/16 v1, 0x1b

    invoke-virtual {v0, v1}, Lp3/a0;->P(I)V

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, p2}, Lx1/o;->b(Lx1/m;[BIIZ)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->I()J

    move-result-wide v0

    const-wide/32 v3, 0x4f676753

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->G()I

    move-result v0

    iput v0, p0, Lg2/f;->a:I

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    return v2

    :cond_1
    const-string p1, "unsupported bit stream revision"

    invoke-static {p1}, Ls1/u2;->d(Ljava/lang/String;)Ls1/u2;

    move-result-object p1

    throw p1

    :cond_2
    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->G()I

    move-result v0

    iput v0, p0, Lg2/f;->b:I

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->u()J

    move-result-wide v0

    iput-wide v0, p0, Lg2/f;->c:J

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->w()J

    move-result-wide v0

    iput-wide v0, p0, Lg2/f;->d:J

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->w()J

    move-result-wide v0

    iput-wide v0, p0, Lg2/f;->e:J

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->w()J

    move-result-wide v0

    iput-wide v0, p0, Lg2/f;->f:J

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->G()I

    move-result v0

    iput v0, p0, Lg2/f;->g:I

    add-int/lit8 v1, v0, 0x1b

    iput v1, p0, Lg2/f;->h:I

    iget-object v1, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v1, v0}, Lp3/a0;->P(I)V

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    iget v1, p0, Lg2/f;->g:I

    invoke-static {p1, v0, v2, v1, p2}, Lx1/o;->b(Lx1/m;[BIIZ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    :goto_0
    iget p1, p0, Lg2/f;->g:I

    if-ge v2, p1, :cond_4

    iget-object p1, p0, Lg2/f;->j:[I

    iget-object p2, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {p2}, Lp3/a0;->G()I

    move-result p2

    aput p2, p1, v2

    iget p1, p0, Lg2/f;->i:I

    iget-object p2, p0, Lg2/f;->j:[I

    aget p2, p2, v2

    add-int/2addr p1, p2

    iput p1, p0, Lg2/f;->i:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_1
    return v2
.end method

.method public b()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lg2/f;->a:I

    iput v0, p0, Lg2/f;->b:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lg2/f;->c:J

    iput-wide v1, p0, Lg2/f;->d:J

    iput-wide v1, p0, Lg2/f;->e:J

    iput-wide v1, p0, Lg2/f;->f:J

    iput v0, p0, Lg2/f;->g:I

    iput v0, p0, Lg2/f;->h:I

    iput v0, p0, Lg2/f;->i:I

    return-void
.end method

.method public c(Lx1/m;)Z
    .locals 2

    const-wide/16 v0, -0x1

    invoke-virtual {p0, p1, v0, v1}, Lg2/f;->d(Lx1/m;J)Z

    move-result p1

    return p1
.end method

.method public d(Lx1/m;J)Z
    .locals 8

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v0

    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    cmp-long v6, v0, v2

    if-nez v6, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lp3/a0;->P(I)V

    :goto_1
    const-wide/16 v2, -0x1

    cmp-long v0, p2, v2

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v2

    const-wide/16 v6, 0x4

    add-long/2addr v2, v6

    cmp-long v6, v2, p2

    if-gez v6, :cond_3

    :cond_1
    iget-object v2, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->e()[B

    move-result-object v2

    invoke-static {p1, v2, v4, v1, v5}, Lx1/o;->b(Lx1/m;[BIIZ)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0, v4}, Lp3/a0;->T(I)V

    iget-object v0, p0, Lg2/f;->k:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->I()J

    move-result-wide v2

    const-wide/32 v6, 0x4f676753

    cmp-long v0, v2, v6

    if-nez v0, :cond_2

    invoke-interface {p1}, Lx1/m;->f()V

    return v5

    :cond_2
    invoke-interface {p1, v5}, Lx1/m;->g(I)V

    goto :goto_1

    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v1

    cmp-long v3, v1, p2

    if-gez v3, :cond_5

    :cond_4
    invoke-interface {p1, v5}, Lx1/m;->b(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_5

    goto :goto_2

    :cond_5
    return v4
.end method
