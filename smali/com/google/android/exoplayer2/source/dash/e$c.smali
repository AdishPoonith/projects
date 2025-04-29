.class public final Lcom/google/android/exoplayer2/source/dash/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/dash/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final a:Lu2/m0;

.field private final b:Ls1/o1;

.field private final c:Lk2/e;

.field private d:J

.field final synthetic e:Lcom/google/android/exoplayer2/source/dash/e;


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/source/dash/e;Lo3/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->e:Lcom/google/android/exoplayer2/source/dash/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lu2/m0;->l(Lo3/b;)Lu2/m0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    new-instance p1, Ls1/o1;

    invoke-direct {p1}, Ls1/o1;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->b:Ls1/o1;

    new-instance p1, Lk2/e;

    invoke-direct {p1}, Lk2/e;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->c:Lk2/e;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->d:J

    return-void
.end method

.method private g()Lk2/e;
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->c:Lk2/e;

    invoke-virtual {v0}, Lv1/g;->l()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->b:Ls1/o1;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->c:Lk2/e;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v3}, Lu2/m0;->S(Ls1/o1;Lv1/g;IZ)I

    move-result v0

    const/4 v1, -0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->c:Lk2/e;

    invoke-virtual {v0}, Lv1/g;->y()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->c:Lk2/e;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private k(JJ)V
    .locals 1

    new-instance v0, Lcom/google/android/exoplayer2/source/dash/e$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/source/dash/e$a;-><init>(JJ)V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->e:Lcom/google/android/exoplayer2/source/dash/e;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/dash/e;->d(Lcom/google/android/exoplayer2/source/dash/e;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->e:Lcom/google/android/exoplayer2/source/dash/e;

    invoke-static {p2}, Lcom/google/android/exoplayer2/source/dash/e;->d(Lcom/google/android/exoplayer2/source/dash/e;)Landroid/os/Handler;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method private l()V
    .locals 5

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lu2/m0;->K(Z)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/dash/e$c;->g()Lk2/e;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v2, v0, Lv1/g;->n:J

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->e:Lcom/google/android/exoplayer2/source/dash/e;

    invoke-static {v4}, Lcom/google/android/exoplayer2/source/dash/e;->a(Lcom/google/android/exoplayer2/source/dash/e;)Lm2/b;

    move-result-object v4

    invoke-virtual {v4, v0}, Lk2/h;->a(Lk2/e;)Lk2/a;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1}, Lk2/a;->d(I)Lk2/a$b;

    move-result-object v0

    check-cast v0, Lm2/a;

    iget-object v1, v0, Lm2/a;->j:Ljava/lang/String;

    iget-object v4, v0, Lm2/a;->k:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/google/android/exoplayer2/source/dash/e;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v2, v3, v0}, Lcom/google/android/exoplayer2/source/dash/e$c;->m(JLm2/a;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    invoke-virtual {v0}, Lu2/m0;->s()V

    return-void
.end method

.method private m(JLm2/a;)V
    .locals 4

    invoke-static {p3}, Lcom/google/android/exoplayer2/source/dash/e;->c(Lm2/a;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/exoplayer2/source/dash/e$c;->k(JJ)V

    return-void
.end method


# virtual methods
.method public a(Lo3/i;IZI)I
    .locals 0

    iget-object p4, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    invoke-virtual {p4, p1, p2, p3}, Lu2/m0;->f(Lo3/i;IZ)I

    move-result p1

    return p1
.end method

.method public b(Lp3/a0;II)V
    .locals 0

    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    invoke-virtual {p3, p1, p2}, Lu2/m0;->d(Lp3/a0;I)V

    return-void
.end method

.method public c(JIIILx1/e0$a;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lu2/m0;->c(JIIILx1/e0$a;)V

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/dash/e$c;->l()V

    return-void
.end method

.method public synthetic d(Lp3/a0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/d0;->b(Lx1/e0;Lp3/a0;I)V

    return-void
.end method

.method public e(Ls1/n1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    invoke-virtual {v0, p1}, Lu2/m0;->e(Ls1/n1;)V

    return-void
.end method

.method public synthetic f(Lo3/i;IZ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx1/d0;->a(Lx1/e0;Lo3/i;IZ)I

    move-result p1

    return p1
.end method

.method public h(J)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->e:Lcom/google/android/exoplayer2/source/dash/e;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/e;->j(J)Z

    move-result p1

    return p1
.end method

.method public i(Lw2/f;)V
    .locals 5

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v2, p1, Lw2/f;->h:J

    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    :cond_0
    iget-wide v0, p1, Lw2/f;->h:J

    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->d:J

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->e:Lcom/google/android/exoplayer2/source/dash/e;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/e;->m(Lw2/f;)V

    return-void
.end method

.method public j(Lw2/f;)Z
    .locals 5

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v2, p1, Lw2/f;->g:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->e:Lcom/google/android/exoplayer2/source/dash/e;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/e;->n(Z)Z

    move-result p1

    return p1
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/e$c;->a:Lu2/m0;

    invoke-virtual {v0}, Lu2/m0;->T()V

    return-void
.end method
