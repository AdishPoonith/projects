.class final Li2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/b0;


# instance fields
.field private final a:Li2/c;

.field private final b:I

.field private final c:J

.field private final d:J

.field private final e:J


# direct methods
.method public constructor <init>(Li2/c;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/e;->a:Li2/c;

    iput p2, p0, Li2/e;->b:I

    iput-wide p3, p0, Li2/e;->c:J

    sub-long/2addr p5, p3

    iget p1, p1, Li2/c;->e:I

    int-to-long p1, p1

    div-long/2addr p5, p1

    iput-wide p5, p0, Li2/e;->d:J

    invoke-direct {p0, p5, p6}, Li2/e;->a(J)J

    move-result-wide p1

    iput-wide p1, p0, Li2/e;->e:J

    return-void
.end method

.method private a(J)J
    .locals 8

    iget v0, p0, Li2/e;->b:I

    int-to-long v0, v0

    mul-long v2, p1, v0

    iget-object p1, p0, Li2/e;->a:Li2/c;

    iget p1, p1, Li2/c;->c:I

    int-to-long v6, p1

    const-wide/32 v4, 0xf4240

    invoke-static/range {v2 .. v7}, Lp3/n0;->N0(JJJ)J

    move-result-wide p1

    return-wide p1
.end method


# virtual methods
.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(J)Lx1/b0$a;
    .locals 10

    iget-object v0, p0, Li2/e;->a:Li2/c;

    iget v0, v0, Li2/c;->c:I

    int-to-long v0, v0

    mul-long v0, v0, p1

    iget v2, p0, Li2/e;->b:I

    int-to-long v2, v2

    const-wide/32 v4, 0xf4240

    mul-long v2, v2, v4

    div-long v4, v0, v2

    iget-wide v0, p0, Li2/e;->d:J

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp3/n0;->r(JJJ)J

    move-result-wide v0

    iget-wide v4, p0, Li2/e;->c:J

    iget-object v6, p0, Li2/e;->a:Li2/c;

    iget v6, v6, Li2/c;->e:I

    int-to-long v6, v6

    mul-long v6, v6, v0

    add-long/2addr v4, v6

    invoke-direct {p0, v0, v1}, Li2/e;->a(J)J

    move-result-wide v6

    new-instance v8, Lx1/c0;

    invoke-direct {v8, v6, v7, v4, v5}, Lx1/c0;-><init>(JJ)V

    cmp-long v4, v6, p1

    if-gez v4, :cond_1

    iget-wide p1, p0, Li2/e;->d:J

    sub-long/2addr p1, v2

    cmp-long v4, v0, p1

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    add-long/2addr v0, v2

    iget-wide p1, p0, Li2/e;->c:J

    iget-object v2, p0, Li2/e;->a:Li2/c;

    iget v2, v2, Li2/c;->e:I

    int-to-long v2, v2

    mul-long v2, v2, v0

    add-long/2addr p1, v2

    invoke-direct {p0, v0, v1}, Li2/e;->a(J)J

    move-result-wide v0

    new-instance v2, Lx1/c0;

    invoke-direct {v2, v0, v1, p1, p2}, Lx1/c0;-><init>(JJ)V

    new-instance p1, Lx1/b0$a;

    invoke-direct {p1, v8, v2}, Lx1/b0$a;-><init>(Lx1/c0;Lx1/c0;)V

    return-object p1

    :cond_1
    :goto_0
    new-instance p1, Lx1/b0$a;

    invoke-direct {p1, v8}, Lx1/b0$a;-><init>(Lx1/c0;)V

    return-object p1
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Li2/e;->e:J

    return-wide v0
.end method
