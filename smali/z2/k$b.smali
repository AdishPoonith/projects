.class Lz2/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic j:Lz2/k;


# direct methods
.method private constructor <init>(Lz2/k;)V
    .locals 0

    iput-object p1, p0, Lz2/k$b;->j:Lz2/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lz2/k;Lz2/k$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lz2/k$b;-><init>(Lz2/k;)V

    return-void
.end method


# virtual methods
.method public a(Lz2/p;)V
    .locals 1

    iget-object p1, p0, Lz2/k$b;->j:Lz2/k;

    invoke-static {p1}, Lz2/k;->o(Lz2/k;)Lu2/r$a;

    move-result-object p1

    iget-object v0, p0, Lz2/k$b;->j:Lz2/k;

    invoke-interface {p1, v0}, Lu2/o0$a;->l(Lu2/o0;)V

    return-void
.end method

.method public b()V
    .locals 11

    iget-object v0, p0, Lz2/k$b;->j:Lz2/k;

    invoke-static {v0}, Lz2/k;->i(Lz2/k;)I

    move-result v0

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz2/k$b;->j:Lz2/k;

    invoke-static {v0}, Lz2/k;->k(Lz2/k;)[Lz2/p;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    invoke-virtual {v5}, Lz2/p;->p()Lu2/v0;

    move-result-object v5

    iget v5, v5, Lu2/v0;->j:I

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v4, [Lu2/t0;

    iget-object v1, p0, Lz2/k$b;->j:Lz2/k;

    invoke-static {v1}, Lz2/k;->k(Lz2/k;)[Lz2/p;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lz2/p;->p()Lu2/v0;

    move-result-object v7

    iget v7, v7, Lu2/v0;->j:I

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_2

    add-int/lit8 v9, v5, 0x1

    invoke-virtual {v6}, Lz2/p;->p()Lu2/v0;

    move-result-object v10

    invoke-virtual {v10, v8}, Lu2/v0;->b(I)Lu2/t0;

    move-result-object v10

    aput-object v10, v0, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v9

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lz2/k$b;->j:Lz2/k;

    new-instance v2, Lu2/v0;

    invoke-direct {v2, v0}, Lu2/v0;-><init>([Lu2/t0;)V

    invoke-static {v1, v2}, Lz2/k;->l(Lz2/k;Lu2/v0;)Lu2/v0;

    iget-object v0, p0, Lz2/k$b;->j:Lz2/k;

    invoke-static {v0}, Lz2/k;->o(Lz2/k;)Lu2/r$a;

    move-result-object v0

    iget-object v1, p0, Lz2/k$b;->j:Lz2/k;

    invoke-interface {v0, v1}, Lu2/r$a;->i(Lu2/r;)V

    return-void
.end method

.method public k(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lz2/k$b;->j:Lz2/k;

    invoke-static {v0}, Lz2/k;->t(Lz2/k;)La3/l;

    move-result-object v0

    invoke-interface {v0, p1}, La3/l;->j(Landroid/net/Uri;)V

    return-void
.end method

.method public bridge synthetic l(Lu2/o0;)V
    .locals 0

    check-cast p1, Lz2/p;

    invoke-virtual {p0, p1}, Lz2/k$b;->a(Lz2/p;)V

    return-void
.end method
