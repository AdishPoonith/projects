.class public final Lx1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/e0;


# instance fields
.field private final a:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    iput-object v0, p0, Lx1/k;->a:[B

    return-void
.end method


# virtual methods
.method public a(Lo3/i;IZI)I
    .locals 1

    iget-object p4, p0, Lx1/k;->a:[B

    array-length p4, p4

    invoke-static {p4, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object p4, p0, Lx1/k;->a:[B

    const/4 v0, 0x0

    invoke-interface {p1, p4, v0, p2}, Lo3/i;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    return p1
.end method

.method public b(Lp3/a0;II)V
    .locals 0

    invoke-virtual {p1, p2}, Lp3/a0;->U(I)V

    return-void
.end method

.method public c(JIIILx1/e0$a;)V
    .locals 0

    return-void
.end method

.method public synthetic d(Lp3/a0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/d0;->b(Lx1/e0;Lp3/a0;I)V

    return-void
.end method

.method public e(Ls1/n1;)V
    .locals 0

    return-void
.end method

.method public synthetic f(Lo3/i;IZ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx1/d0;->a(Lx1/e0;Lo3/i;IZ)I

    move-result p1

    return p1
.end method
