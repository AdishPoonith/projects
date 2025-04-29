.class final Lc2/c;
.super Lx1/w;
.source "SourceFile"


# instance fields
.field private final b:J


# direct methods
.method public constructor <init>(Lx1/m;J)V
    .locals 2

    invoke-direct {p0, p1}, Lx1/w;-><init>(Lx1/m;)V

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp3/a;->a(Z)V

    iput-wide p2, p0, Lc2/c;->b:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    invoke-super {p0}, Lx1/w;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lc2/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public l()J
    .locals 4

    invoke-super {p0}, Lx1/w;->l()J

    move-result-wide v0

    iget-wide v2, p0, Lc2/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public p()J
    .locals 4

    invoke-super {p0}, Lx1/w;->p()J

    move-result-wide v0

    iget-wide v2, p0, Lc2/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
