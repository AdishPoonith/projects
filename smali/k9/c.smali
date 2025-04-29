.class abstract Lk9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/c;


# instance fields
.field private final j:Lm9/c;


# direct methods
.method public constructor <init>(Lm9/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/c;

    iput-object p1, p0, Lk9/c;->j:Lm9/c;

    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0}, Lm9/c;->E()V

    return-void
.end method

.method public F(Lm9/i;)V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0, p1}, Lm9/c;->F(Lm9/i;)V

    return-void
.end method

.method public I(Lm9/i;)V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0, p1}, Lm9/c;->I(Lm9/i;)V

    return-void
.end method

.method public K(ZILokio/c;I)V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0, p1, p2, p3, p4}, Lm9/c;->K(ZILokio/c;I)V

    return-void
.end method

.method public R(ILm9/a;[B)V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0, p1, p2, p3}, Lm9/c;->R(ILm9/a;[B)V

    return-void
.end method

.method public V()I
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0}, Lm9/c;->V()I

    move-result v0

    return v0
.end method

.method public X(ZZIILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII",
            "Ljava/util/List<",
            "Lm9/d;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lm9/c;->X(ZZIILjava/util/List;)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public d(ILm9/a;)V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0, p1, p2}, Lm9/c;->d(ILm9/a;)V

    return-void
.end method

.method public f(ZII)V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0, p1, p2, p3}, Lm9/c;->f(ZII)V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0}, Lm9/c;->flush()V

    return-void
.end method

.method public g(IJ)V
    .locals 1

    iget-object v0, p0, Lk9/c;->j:Lm9/c;

    invoke-interface {v0, p1, p2, p3}, Lm9/c;->g(IJ)V

    return-void
.end method
