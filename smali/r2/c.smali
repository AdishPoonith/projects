.class public final Lr2/c;
.super Lk2/h;
.source "SourceFile"


# instance fields
.field private final a:Lp3/a0;

.field private final b:Lp3/z;

.field private c:Lp3/j0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lk2/h;-><init>()V

    new-instance v0, Lp3/a0;

    invoke-direct {v0}, Lp3/a0;-><init>()V

    iput-object v0, p0, Lr2/c;->a:Lp3/a0;

    new-instance v0, Lp3/z;

    invoke-direct {v0}, Lp3/z;-><init>()V

    iput-object v0, p0, Lr2/c;->b:Lp3/z;

    return-void
.end method


# virtual methods
.method protected b(Lk2/e;Ljava/nio/ByteBuffer;)Lk2/a;
    .locals 6

    iget-object v0, p0, Lr2/c;->c:Lp3/j0;

    if-eqz v0, :cond_0

    iget-wide v1, p1, Lk2/e;->r:J

    invoke-virtual {v0}, Lp3/j0;->e()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Lp3/j0;

    iget-wide v1, p1, Lv1/g;->n:J

    invoke-direct {v0, v1, v2}, Lp3/j0;-><init>(J)V

    iput-object v0, p0, Lr2/c;->c:Lp3/j0;

    iget-wide v1, p1, Lv1/g;->n:J

    iget-wide v3, p1, Lk2/e;->r:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lp3/j0;->a(J)J

    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    iget-object v0, p0, Lr2/c;->a:Lp3/a0;

    invoke-virtual {v0, p1, p2}, Lp3/a0;->R([BI)V

    iget-object v0, p0, Lr2/c;->b:Lp3/z;

    invoke-virtual {v0, p1, p2}, Lp3/z;->o([BI)V

    iget-object p1, p0, Lr2/c;->b:Lp3/z;

    const/16 p2, 0x27

    invoke-virtual {p1, p2}, Lp3/z;->r(I)V

    iget-object p1, p0, Lr2/c;->b:Lp3/z;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lp3/z;->h(I)I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    iget-object v2, p0, Lr2/c;->b:Lp3/z;

    invoke-virtual {v2, p1}, Lp3/z;->h(I)I

    move-result p1

    int-to-long v2, p1

    or-long/2addr v0, v2

    iget-object p1, p0, Lr2/c;->b:Lp3/z;

    const/16 v2, 0x14

    invoke-virtual {p1, v2}, Lp3/z;->r(I)V

    iget-object p1, p0, Lr2/c;->b:Lp3/z;

    const/16 v2, 0xc

    invoke-virtual {p1, v2}, Lp3/z;->h(I)I

    move-result p1

    iget-object v2, p0, Lr2/c;->b:Lp3/z;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lp3/z;->h(I)I

    move-result v2

    const/4 v3, 0x0

    iget-object v4, p0, Lr2/c;->a:Lp3/a0;

    const/16 v5, 0xe

    invoke-virtual {v4, v5}, Lp3/a0;->U(I)V

    if-eqz v2, :cond_6

    const/16 v4, 0xff

    if-eq v2, v4, :cond_5

    const/4 p1, 0x4

    if-eq v2, p1, :cond_4

    const/4 p1, 0x5

    if-eq v2, p1, :cond_3

    const/4 p1, 0x6

    if-eq v2, p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lr2/c;->a:Lp3/a0;

    iget-object v2, p0, Lr2/c;->c:Lp3/j0;

    invoke-static {p1, v0, v1, v2}, Lr2/g;->a(Lp3/a0;JLp3/j0;)Lr2/g;

    move-result-object v3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lr2/c;->a:Lp3/a0;

    iget-object v2, p0, Lr2/c;->c:Lp3/j0;

    invoke-static {p1, v0, v1, v2}, Lr2/d;->a(Lp3/a0;JLp3/j0;)Lr2/d;

    move-result-object v3

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lr2/c;->a:Lp3/a0;

    invoke-static {p1}, Lr2/f;->a(Lp3/a0;)Lr2/f;

    move-result-object v3

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lr2/c;->a:Lp3/a0;

    invoke-static {v2, p1, v0, v1}, Lr2/a;->a(Lp3/a0;IJ)Lr2/a;

    move-result-object v3

    goto :goto_0

    :cond_6
    new-instance v3, Lr2/e;

    invoke-direct {v3}, Lr2/e;-><init>()V

    :goto_0
    const/4 p1, 0x0

    if-nez v3, :cond_7

    new-instance p2, Lk2/a;

    new-array p1, p1, [Lk2/a$b;

    invoke-direct {p2, p1}, Lk2/a;-><init>([Lk2/a$b;)V

    goto :goto_1

    :cond_7
    new-instance v0, Lk2/a;

    new-array p2, p2, [Lk2/a$b;

    aput-object v3, p2, p1

    invoke-direct {v0, p2}, Lk2/a;-><init>([Lk2/a$b;)V

    move-object p2, v0

    :goto_1
    return-object p2
.end method
