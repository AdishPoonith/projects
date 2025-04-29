.class public final Ln3/u;
.super Ln3/c;
.source "SourceFile"


# instance fields
.field private final h:I

.field private final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu2/t0;II)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Ln3/u;-><init>(Lu2/t0;IIILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu2/t0;IIILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p2, v0, v1

    invoke-direct {p0, p1, v0, p3}, Ln3/c;-><init>(Lu2/t0;[II)V

    iput p4, p0, Ln3/u;->h:I

    iput-object p5, p0, Ln3/u;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public n()I
    .locals 1

    iget v0, p0, Ln3/u;->h:I

    return v0
.end method

.method public o()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p(JJJLjava/util/List;[Lw2/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "+",
            "Lw2/n;",
            ">;[",
            "Lw2/o;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public r()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln3/u;->i:Ljava/lang/Object;

    return-object v0
.end method
