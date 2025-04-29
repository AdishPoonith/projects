.class final Lu2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/n0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field public final j:Lu2/n0;

.field private k:Z

.field final synthetic l:Lu2/d;


# direct methods
.method public constructor <init>(Lu2/d;Lu2/n0;)V
    .locals 0

    iput-object p1, p0, Lu2/d$a;->l:Lu2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu2/d$a;->j:Lu2/n0;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu2/d$a;->k:Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lu2/d$a;->j:Lu2/n0;

    invoke-interface {v0}, Lu2/n0;->b()V

    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lu2/d$a;->l:Lu2/d;

    invoke-virtual {v0}, Lu2/d;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu2/d$a;->j:Lu2/n0;

    invoke-interface {v0}, Lu2/n0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(Ls1/o1;Lv1/g;I)I
    .locals 10

    iget-object v0, p0, Lu2/d$a;->l:Lu2/d;

    invoke-virtual {v0}, Lu2/d;->o()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lu2/d$a;->k:Z

    const/4 v2, 0x4

    const/4 v3, -0x4

    if-eqz v0, :cond_1

    invoke-virtual {p2, v2}, Lv1/a;->v(I)V

    return v3

    :cond_1
    iget-object v0, p0, Lu2/d$a;->j:Lu2/n0;

    invoke-interface {v0, p1, p2, p3}, Lu2/n0;->k(Ls1/o1;Lv1/g;I)I

    move-result p3

    const/4 v0, -0x5

    const-wide/high16 v4, -0x8000000000000000L

    if-ne p3, v0, :cond_6

    iget-object p2, p1, Ls1/o1;->b:Ls1/n1;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ls1/n1;

    iget p3, p2, Ls1/n1;->K:I

    if-nez p3, :cond_2

    iget v1, p2, Ls1/n1;->L:I

    if-eqz v1, :cond_5

    :cond_2
    iget-object v1, p0, Lu2/d$a;->l:Lu2/d;

    iget-wide v2, v1, Lu2/d;->n:J

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    cmp-long v9, v2, v6

    if-eqz v9, :cond_3

    const/4 p3, 0x0

    :cond_3
    iget-wide v1, v1, Lu2/d;->o:J

    cmp-long v3, v1, v4

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    iget v8, p2, Ls1/n1;->L:I

    :goto_0
    invoke-virtual {p2}, Ls1/n1;->b()Ls1/n1$b;

    move-result-object p2

    invoke-virtual {p2, p3}, Ls1/n1$b;->P(I)Ls1/n1$b;

    move-result-object p2

    invoke-virtual {p2, v8}, Ls1/n1$b;->Q(I)Ls1/n1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p2

    iput-object p2, p1, Ls1/o1;->b:Ls1/n1;

    :cond_5
    return v0

    :cond_6
    iget-object p1, p0, Lu2/d$a;->l:Lu2/d;

    iget-wide v6, p1, Lu2/d;->o:J

    cmp-long v0, v6, v4

    if-eqz v0, :cond_9

    if-ne p3, v3, :cond_7

    iget-wide v8, p2, Lv1/g;->n:J

    cmp-long v0, v8, v6

    if-gez v0, :cond_8

    :cond_7
    if-ne p3, v1, :cond_9

    invoke-virtual {p1}, Lu2/d;->f()J

    move-result-wide v0

    cmp-long p1, v0, v4

    if-nez p1, :cond_9

    iget-boolean p1, p2, Lv1/g;->m:Z

    if-nez p1, :cond_9

    :cond_8
    invoke-virtual {p2}, Lv1/g;->l()V

    invoke-virtual {p2, v2}, Lv1/a;->v(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu2/d$a;->k:Z

    return v3

    :cond_9
    return p3
.end method

.method public t(J)I
    .locals 1

    iget-object v0, p0, Lu2/d$a;->l:Lu2/d;

    invoke-virtual {v0}, Lu2/d;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    iget-object v0, p0, Lu2/d$a;->j:Lu2/n0;

    invoke-interface {v0, p1, p2}, Lu2/n0;->t(J)I

    move-result p1

    return p1
.end method
