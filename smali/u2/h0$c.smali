.class final Lu2/h0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/n0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final j:I

.field final synthetic k:Lu2/h0;


# direct methods
.method public constructor <init>(Lu2/h0;I)V
    .locals 0

    iput-object p1, p0, Lu2/h0$c;->k:Lu2/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lu2/h0$c;->j:I

    return-void
.end method

.method static synthetic a(Lu2/h0$c;)I
    .locals 0

    iget p0, p0, Lu2/h0$c;->j:I

    return p0
.end method


# virtual methods
.method public b()V
    .locals 2

    iget-object v0, p0, Lu2/h0$c;->k:Lu2/h0;

    iget v1, p0, Lu2/h0$c;->j:I

    invoke-virtual {v0, v1}, Lu2/h0;->Y(I)V

    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lu2/h0$c;->k:Lu2/h0;

    iget v1, p0, Lu2/h0$c;->j:I

    invoke-virtual {v0, v1}, Lu2/h0;->Q(I)Z

    move-result v0

    return v0
.end method

.method public k(Ls1/o1;Lv1/g;I)I
    .locals 2

    iget-object v0, p0, Lu2/h0$c;->k:Lu2/h0;

    iget v1, p0, Lu2/h0$c;->j:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lu2/h0;->e0(ILs1/o1;Lv1/g;I)I

    move-result p1

    return p1
.end method

.method public t(J)I
    .locals 2

    iget-object v0, p0, Lu2/h0$c;->k:Lu2/h0;

    iget v1, p0, Lu2/h0$c;->j:I

    invoke-virtual {v0, v1, p1, p2}, Lu2/h0;->i0(IJ)I

    move-result p1

    return p1
.end method
