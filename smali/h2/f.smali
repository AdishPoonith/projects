.class public final Lh2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/m;


# instance fields
.field private final a:Lp3/z;

.field private final b:Lp3/a0;

.field private final c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lx1/e0;

.field private f:I

.field private g:I

.field private h:Z

.field private i:Z

.field private j:J

.field private k:Ls1/n1;

.field private l:I

.field private m:J


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh2/f;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp3/z;

    const/16 v1, 0x10

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lp3/z;-><init>([B)V

    iput-object v0, p0, Lh2/f;->a:Lp3/z;

    new-instance v1, Lp3/a0;

    iget-object v0, v0, Lp3/z;->a:[B

    invoke-direct {v1, v0}, Lp3/a0;-><init>([B)V

    iput-object v1, p0, Lh2/f;->b:Lp3/a0;

    const/4 v0, 0x0

    iput v0, p0, Lh2/f;->f:I

    iput v0, p0, Lh2/f;->g:I

    iput-boolean v0, p0, Lh2/f;->h:Z

    iput-boolean v0, p0, Lh2/f;->i:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/f;->m:J

    iput-object p1, p0, Lh2/f;->c:Ljava/lang/String;

    return-void
.end method

.method private f(Lp3/a0;[BI)Z
    .locals 2

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    iget v1, p0, Lh2/f;->g:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lh2/f;->g:I

    invoke-virtual {p1, p2, v1, v0}, Lp3/a0;->l([BII)V

    iget p1, p0, Lh2/f;->g:I

    add-int/2addr p1, v0

    iput p1, p0, Lh2/f;->g:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private g()V
    .locals 5

    iget-object v0, p0, Lh2/f;->a:Lp3/z;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp3/z;->p(I)V

    iget-object v0, p0, Lh2/f;->a:Lp3/z;

    invoke-static {v0}, Lu1/c;->d(Lp3/z;)Lu1/c$b;

    move-result-object v0

    iget-object v1, p0, Lh2/f;->k:Ls1/n1;

    const-string v2, "audio/ac4"

    if-eqz v1, :cond_0

    iget v3, v0, Lu1/c$b;->c:I

    iget v4, v1, Ls1/n1;->H:I

    if-ne v3, v4, :cond_0

    iget v3, v0, Lu1/c$b;->b:I

    iget v4, v1, Ls1/n1;->I:I

    if-ne v3, v4, :cond_0

    iget-object v1, v1, Ls1/n1;->u:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Ls1/n1$b;

    invoke-direct {v1}, Ls1/n1$b;-><init>()V

    iget-object v3, p0, Lh2/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ls1/n1$b;->U(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v1

    iget v2, v0, Lu1/c$b;->c:I

    invoke-virtual {v1, v2}, Ls1/n1$b;->J(I)Ls1/n1$b;

    move-result-object v1

    iget v2, v0, Lu1/c$b;->b:I

    invoke-virtual {v1, v2}, Ls1/n1$b;->h0(I)Ls1/n1$b;

    move-result-object v1

    iget-object v2, p0, Lh2/f;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ls1/n1$b;->X(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v1

    iput-object v1, p0, Lh2/f;->k:Ls1/n1;

    iget-object v2, p0, Lh2/f;->e:Lx1/e0;

    invoke-interface {v2, v1}, Lx1/e0;->e(Ls1/n1;)V

    :cond_1
    iget v1, v0, Lu1/c$b;->d:I

    iput v1, p0, Lh2/f;->l:I

    const-wide/32 v1, 0xf4240

    iget v0, v0, Lu1/c$b;->e:I

    int-to-long v3, v0

    mul-long v3, v3, v1

    iget-object v0, p0, Lh2/f;->k:Ls1/n1;

    iget v0, v0, Ls1/n1;->I:I

    int-to-long v0, v0

    div-long/2addr v3, v0

    iput-wide v3, p0, Lh2/f;->j:J

    return-void
.end method

.method private h(Lp3/a0;)Z
    .locals 5

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_6

    iget-boolean v0, p0, Lh2/f;->h:Z

    const/16 v2, 0xac

    const/4 v3, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result v0

    if-ne v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p0, Lh2/f;->h:Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result v0

    if-ne v0, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, p0, Lh2/f;->h:Z

    const/16 v2, 0x40

    const/16 v4, 0x41

    if-eq v0, v2, :cond_4

    if-ne v0, v4, :cond_0

    :cond_4
    if-ne v0, v4, :cond_5

    const/4 v1, 0x1

    :cond_5
    iput-boolean v1, p0, Lh2/f;->i:Z

    return v3

    :cond_6
    return v1
.end method


# virtual methods
.method public a(Lp3/a0;)V
    .locals 10

    iget-object v0, p0, Lh2/f;->e:Lx1/e0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    if-lez v0, :cond_6

    iget v0, p0, Lh2/f;->f:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    iget v2, p0, Lh2/f;->l:I

    iget v3, p0, Lh2/f;->g:I

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v2, p0, Lh2/f;->e:Lx1/e0;

    invoke-interface {v2, p1, v0}, Lx1/e0;->d(Lp3/a0;I)V

    iget v2, p0, Lh2/f;->g:I

    add-int/2addr v2, v0

    iput v2, p0, Lh2/f;->g:I

    iget v7, p0, Lh2/f;->l:I

    if-ne v2, v7, :cond_0

    iget-wide v4, p0, Lh2/f;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2

    iget-object v3, p0, Lh2/f;->e:Lx1/e0;

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lx1/e0;->c(JIIILx1/e0$a;)V

    iget-wide v2, p0, Lh2/f;->m:J

    iget-wide v4, p0, Lh2/f;->j:J

    add-long/2addr v2, v4

    iput-wide v2, p0, Lh2/f;->m:J

    :cond_2
    iput v1, p0, Lh2/f;->f:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lh2/f;->b:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/16 v3, 0x10

    invoke-direct {p0, p1, v0, v3}, Lh2/f;->f(Lp3/a0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lh2/f;->g()V

    iget-object v0, p0, Lh2/f;->b:Lp3/a0;

    invoke-virtual {v0, v1}, Lp3/a0;->T(I)V

    iget-object v0, p0, Lh2/f;->e:Lx1/e0;

    iget-object v1, p0, Lh2/f;->b:Lp3/a0;

    invoke-interface {v0, v1, v3}, Lx1/e0;->d(Lp3/a0;I)V

    iput v2, p0, Lh2/f;->f:I

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1}, Lh2/f;->h(Lp3/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput v3, p0, Lh2/f;->f:I

    iget-object v0, p0, Lh2/f;->b:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    const/16 v4, -0x54

    aput-byte v4, v0, v1

    iget-object v0, p0, Lh2/f;->b:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v0

    iget-boolean v1, p0, Lh2/f;->i:Z

    if-eqz v1, :cond_5

    const/16 v1, 0x41

    goto :goto_1

    :cond_5
    const/16 v1, 0x40

    :goto_1
    int-to-byte v1, v1

    aput-byte v1, v0, v3

    iput v2, p0, Lh2/f;->g:I

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public b()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lh2/f;->f:I

    iput v0, p0, Lh2/f;->g:I

    iput-boolean v0, p0, Lh2/f;->h:Z

    iput-boolean v0, p0, Lh2/f;->i:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/f;->m:J

    return-void
.end method

.method public c(Lx1/n;Lh2/i0$d;)V
    .locals 1

    invoke-virtual {p2}, Lh2/i0$d;->a()V

    invoke-virtual {p2}, Lh2/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh2/f;->d:Ljava/lang/String;

    invoke-virtual {p2}, Lh2/i0$d;->c()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lx1/n;->d(II)Lx1/e0;

    move-result-object p1

    iput-object p1, p0, Lh2/f;->e:Lx1/e0;

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lh2/f;->m:J

    :cond_0
    return-void
.end method
