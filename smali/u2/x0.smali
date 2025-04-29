.class public abstract Lu2/x0;
.super Lu2/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu2/f<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field private static final u:Ljava/lang/Void;


# instance fields
.field protected final t:Lu2/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(Lu2/u;)V
    .locals 0

    invoke-direct {p0}, Lu2/f;-><init>()V

    iput-object p1, p0, Lu2/x0;->t:Lu2/u;

    return-void
.end method


# virtual methods
.method protected final C(Lo3/p0;)V
    .locals 0

    invoke-super {p0, p1}, Lu2/f;->C(Lo3/p0;)V

    invoke-virtual {p0}, Lu2/x0;->V()V

    return-void
.end method

.method protected bridge synthetic G(Ljava/lang/Object;Lu2/u$b;)Lu2/u$b;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lu2/x0;->M(Ljava/lang/Void;Lu2/u$b;)Lu2/u$b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic H(Ljava/lang/Object;J)J
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lu2/x0;->P(Ljava/lang/Void;J)J

    move-result-wide p1

    return-wide p1
.end method

.method protected bridge synthetic I(Ljava/lang/Object;I)I
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lu2/x0;->R(Ljava/lang/Void;I)I

    move-result p1

    return p1
.end method

.method protected bridge synthetic K(Ljava/lang/Object;Lu2/u;Ls1/y3;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lu2/x0;->S(Ljava/lang/Void;Lu2/u;Ls1/y3;)V

    return-void
.end method

.method protected final M(Ljava/lang/Void;Lu2/u$b;)Lu2/u$b;
    .locals 0

    invoke-virtual {p0, p2}, Lu2/x0;->N(Lu2/u$b;)Lu2/u$b;

    move-result-object p1

    return-object p1
.end method

.method protected abstract N(Lu2/u$b;)Lu2/u$b;
.end method

.method protected O(J)J
    .locals 0

    return-wide p1
.end method

.method protected final P(Ljava/lang/Void;J)J
    .locals 0

    invoke-virtual {p0, p2, p3}, Lu2/x0;->O(J)J

    move-result-wide p1

    return-wide p1
.end method

.method protected Q(I)I
    .locals 0

    return p1
.end method

.method protected final R(Ljava/lang/Void;I)I
    .locals 0

    invoke-virtual {p0, p2}, Lu2/x0;->Q(I)I

    move-result p1

    return p1
.end method

.method protected final S(Ljava/lang/Void;Lu2/u;Ls1/y3;)V
    .locals 0

    invoke-virtual {p0, p3}, Lu2/x0;->T(Ls1/y3;)V

    return-void
.end method

.method protected abstract T(Ls1/y3;)V
.end method

.method protected final U()V
    .locals 2

    sget-object v0, Lu2/x0;->u:Ljava/lang/Void;

    iget-object v1, p0, Lu2/x0;->t:Lu2/u;

    invoke-virtual {p0, v0, v1}, Lu2/f;->L(Ljava/lang/Object;Lu2/u;)V

    return-void
.end method

.method protected abstract V()V
.end method

.method public a()Ls1/v1;
    .locals 1

    iget-object v0, p0, Lu2/x0;->t:Lu2/u;

    invoke-interface {v0}, Lu2/u;->a()Ls1/v1;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lu2/x0;->t:Lu2/u;

    invoke-interface {v0}, Lu2/u;->g()Z

    move-result v0

    return v0
.end method

.method public j()Ls1/y3;
    .locals 1

    iget-object v0, p0, Lu2/x0;->t:Lu2/u;

    invoke-interface {v0}, Lu2/u;->j()Ls1/y3;

    move-result-object v0

    return-object v0
.end method
