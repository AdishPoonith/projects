.class public abstract Lv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final k(I)V
    .locals 1

    iget v0, p0, Lv1/a;->j:I

    or-int/2addr p1, v0

    iput p1, p0, Lv1/a;->j:I

    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lv1/a;->j:I

    return-void
.end method

.method public final n(I)V
    .locals 1

    iget v0, p0, Lv1/a;->j:I

    not-int p1, p1

    and-int/2addr p1, v0

    iput p1, p0, Lv1/a;->j:I

    return-void
.end method

.method protected final o(I)Z
    .locals 1

    iget v0, p0, Lv1/a;->j:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final p()Z
    .locals 1

    const/high16 v0, 0x10000000

    invoke-virtual {p0, v0}, Lv1/a;->o(I)Z

    move-result v0

    return v0
.end method

.method public final q()Z
    .locals 1

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0}, Lv1/a;->o(I)Z

    move-result v0

    return v0
.end method

.method public final r()Z
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lv1/a;->o(I)Z

    move-result v0

    return v0
.end method

.method public final s()Z
    .locals 1

    const/high16 v0, 0x8000000

    invoke-virtual {p0, v0}, Lv1/a;->o(I)Z

    move-result v0

    return v0
.end method

.method public final t()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lv1/a;->o(I)Z

    move-result v0

    return v0
.end method

.method public final u()Z
    .locals 1

    const/high16 v0, 0x20000000

    invoke-virtual {p0, v0}, Lv1/a;->o(I)Z

    move-result v0

    return v0
.end method

.method public final v(I)V
    .locals 0

    iput p1, p0, Lv1/a;->j:I

    return-void
.end method
