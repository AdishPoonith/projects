.class public Lx1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/m;


# instance fields
.field private final a:Lx1/m;


# direct methods
.method public constructor <init>(Lx1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/w;->a:Lx1/m;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0}, Lx1/m;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(I)I
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1}, Lx1/m;->b(I)I

    move-result p1

    return p1
.end method

.method public c([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3, p4}, Lx1/m;->c([BIIZ)Z

    move-result p1

    return p1
.end method

.method public d([BII)I
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3}, Lx1/m;->d([BII)I

    move-result p1

    return p1
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0}, Lx1/m;->f()V

    return-void
.end method

.method public g(I)V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1}, Lx1/m;->g(I)V

    return-void
.end method

.method public i(IZ)Z
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2}, Lx1/m;->i(IZ)Z

    move-result p1

    return p1
.end method

.method public k([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3, p4}, Lx1/m;->k([BIIZ)Z

    move-result p1

    return p1
.end method

.method public l()J
    .locals 2

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0}, Lx1/m;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public n([BII)V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3}, Lx1/m;->n([BII)V

    return-void
.end method

.method public o(I)V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1}, Lx1/m;->o(I)V

    return-void
.end method

.method public p()J
    .locals 2

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0}, Lx1/m;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public read([BII)I
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3}, Lx1/m;->read([BII)I

    move-result p1

    return p1
.end method

.method public readFully([BII)V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3}, Lx1/m;->readFully([BII)V

    return-void
.end method
