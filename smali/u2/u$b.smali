.class public final Lu2/u$b;
.super Lu2/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lu2/s;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;IIJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu2/s;-><init>(Ljava/lang/Object;IIJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu2/s;-><init>(Ljava/lang/Object;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lu2/s;-><init>(Ljava/lang/Object;JI)V

    return-void
.end method

.method public constructor <init>(Lu2/s;)V
    .locals 0

    invoke-direct {p0, p1}, Lu2/s;-><init>(Lu2/s;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Lu2/u$b;
    .locals 1

    new-instance v0, Lu2/u$b;

    invoke-super {p0, p1}, Lu2/s;->a(Ljava/lang/Object;)Lu2/s;

    move-result-object p1

    invoke-direct {v0, p1}, Lu2/u$b;-><init>(Lu2/s;)V

    return-object v0
.end method
