.class final Lw2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ls1/n1;

.field private final d:Lx1/k;

.field public e:Ls1/n1;

.field private f:Lx1/e0;

.field private g:J


# direct methods
.method public constructor <init>(IILs1/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw2/e$a;->a:I

    iput p2, p0, Lw2/e$a;->b:I

    iput-object p3, p0, Lw2/e$a;->c:Ls1/n1;

    new-instance p1, Lx1/k;

    invoke-direct {p1}, Lx1/k;-><init>()V

    iput-object p1, p0, Lw2/e$a;->d:Lx1/k;

    return-void
.end method


# virtual methods
.method public a(Lo3/i;IZI)I
    .locals 0

    iget-object p4, p0, Lw2/e$a;->f:Lx1/e0;

    invoke-static {p4}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lx1/e0;

    invoke-interface {p4, p1, p2, p3}, Lx1/e0;->f(Lo3/i;IZ)I

    move-result p1

    return p1
.end method

.method public b(Lp3/a0;II)V
    .locals 0

    iget-object p3, p0, Lw2/e$a;->f:Lx1/e0;

    invoke-static {p3}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx1/e0;

    invoke-interface {p3, p1, p2}, Lx1/e0;->d(Lp3/a0;I)V

    return-void
.end method

.method public c(JIIILx1/e0$a;)V
    .locals 8

    iget-wide v0, p0, Lw2/e$a;->g:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    iget-object v0, p0, Lw2/e$a;->d:Lx1/k;

    iput-object v0, p0, Lw2/e$a;->f:Lx1/e0;

    :cond_0
    iget-object v0, p0, Lw2/e$a;->f:Lx1/e0;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lx1/e0;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lx1/e0;->c(JIIILx1/e0$a;)V

    return-void
.end method

.method public synthetic d(Lp3/a0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/d0;->b(Lx1/e0;Lp3/a0;I)V

    return-void
.end method

.method public e(Ls1/n1;)V
    .locals 1

    iget-object v0, p0, Lw2/e$a;->c:Ls1/n1;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ls1/n1;->j(Ls1/n1;)Ls1/n1;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lw2/e$a;->e:Ls1/n1;

    iget-object p1, p0, Lw2/e$a;->f:Lx1/e0;

    invoke-static {p1}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/e0;

    iget-object v0, p0, Lw2/e$a;->e:Ls1/n1;

    invoke-interface {p1, v0}, Lx1/e0;->e(Ls1/n1;)V

    return-void
.end method

.method public synthetic f(Lo3/i;IZ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx1/d0;->a(Lx1/e0;Lo3/i;IZ)I

    move-result p1

    return p1
.end method

.method public g(Lw2/g$b;J)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Lw2/e$a;->d:Lx1/k;

    iput-object p1, p0, Lw2/e$a;->f:Lx1/e0;

    return-void

    :cond_0
    iput-wide p2, p0, Lw2/e$a;->g:J

    iget p2, p0, Lw2/e$a;->a:I

    iget p3, p0, Lw2/e$a;->b:I

    invoke-interface {p1, p2, p3}, Lw2/g$b;->d(II)Lx1/e0;

    move-result-object p1

    iput-object p1, p0, Lw2/e$a;->f:Lx1/e0;

    iget-object p2, p0, Lw2/e$a;->e:Ls1/n1;

    if-eqz p2, :cond_1

    invoke-interface {p1, p2}, Lx1/e0;->e(Ls1/n1;)V

    :cond_1
    return-void
.end method
