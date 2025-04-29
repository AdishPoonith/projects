.class public final Lr3/b;
.super Ls1/f;
.source "SourceFile"


# instance fields
.field private A:J

.field private final w:Lv1/g;

.field private final x:Lp3/a0;

.field private y:J

.field private z:Lr3/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Ls1/f;-><init>(I)V

    new-instance v0, Lv1/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lv1/g;-><init>(I)V

    iput-object v0, p0, Lr3/b;->w:Lv1/g;

    new-instance v0, Lp3/a0;

    invoke-direct {v0}, Lp3/a0;-><init>()V

    iput-object v0, p0, Lr3/b;->x:Lp3/a0;

    return-void
.end method

.method private R(Ljava/nio/ByteBuffer;)[F
    .locals 3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lr3/b;->x:Lp3/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lp3/a0;->R([BI)V

    iget-object v0, p0, Lr3/b;->x:Lp3/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    invoke-virtual {v0, p1}, Lp3/a0;->T(I)V

    const/4 p1, 0x3

    new-array v0, p1, [F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    iget-object v2, p0, Lr3/b;->x:Lp3/a0;

    invoke-virtual {v2}, Lp3/a0;->t()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private S()V
    .locals 1

    iget-object v0, p0, Lr3/b;->z:Lr3/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr3/a;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected H()V
    .locals 0

    invoke-direct {p0}, Lr3/b;->S()V

    return-void
.end method

.method protected J(JZ)V
    .locals 0

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lr3/b;->A:J

    invoke-direct {p0}, Lr3/b;->S()V

    return-void
.end method

.method protected N([Ls1/n1;JJ)V
    .locals 0

    iput-wide p4, p0, Lr3/b;->y:J

    return-void
.end method

.method public a(Ls1/n1;)I
    .locals 1

    iget-object p1, p1, Ls1/n1;->u:Ljava/lang/String;

    const-string v0, "application/x-camera-motion"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ls1/m3;->a(I)I

    move-result p1

    return p1
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, Ls1/f;->j()Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "CameraMotionRenderer"

    return-object v0
.end method

.method public l(JJ)V
    .locals 4

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ls1/f;->j()Z

    move-result p3

    if-nez p3, :cond_4

    iget-wide p3, p0, Lr3/b;->A:J

    const-wide/32 v0, 0x186a0

    add-long/2addr v0, p1

    cmp-long v2, p3, v0

    if-gez v2, :cond_4

    iget-object p3, p0, Lr3/b;->w:Lv1/g;

    invoke-virtual {p3}, Lv1/g;->l()V

    invoke-virtual {p0}, Ls1/f;->C()Ls1/o1;

    move-result-object p3

    iget-object p4, p0, Lr3/b;->w:Lv1/g;

    const/4 v0, 0x0

    invoke-virtual {p0, p3, p4, v0}, Ls1/f;->O(Ls1/o1;Lv1/g;I)I

    move-result p3

    const/4 p4, -0x4

    if-ne p3, p4, :cond_4

    iget-object p3, p0, Lr3/b;->w:Lv1/g;

    invoke-virtual {p3}, Lv1/a;->r()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    iget-object p3, p0, Lr3/b;->w:Lv1/g;

    iget-wide v0, p3, Lv1/g;->n:J

    iput-wide v0, p0, Lr3/b;->A:J

    iget-object p4, p0, Lr3/b;->z:Lr3/a;

    if-eqz p4, :cond_0

    invoke-virtual {p3}, Lv1/a;->q()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lr3/b;->w:Lv1/g;

    invoke-virtual {p3}, Lv1/g;->y()V

    iget-object p3, p0, Lr3/b;->w:Lv1/g;

    iget-object p3, p3, Lv1/g;->l:Ljava/nio/ByteBuffer;

    invoke-static {p3}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/nio/ByteBuffer;

    invoke-direct {p0, p3}, Lr3/b;->R(Ljava/nio/ByteBuffer;)[F

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    iget-object p4, p0, Lr3/b;->z:Lr3/a;

    invoke-static {p4}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lr3/a;

    iget-wide v0, p0, Lr3/b;->A:J

    iget-wide v2, p0, Lr3/b;->y:J

    sub-long/2addr v0, v2

    invoke-interface {p4, v0, v1, p3}, Lr3/a;->a(J[F)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public m(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    check-cast p2, Lr3/a;

    iput-object p2, p0, Lr3/b;->z:Lr3/a;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Ls1/f;->m(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
