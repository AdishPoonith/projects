.class public Lu1/c0$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field private final a:[Lu1/g;

.field private final b:Lu1/k0;

.field private final c:Lu1/m0;


# direct methods
.method public varargs constructor <init>([Lu1/g;)V
    .locals 2

    new-instance v0, Lu1/k0;

    invoke-direct {v0}, Lu1/k0;-><init>()V

    new-instance v1, Lu1/m0;

    invoke-direct {v1}, Lu1/m0;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lu1/c0$h;-><init>([Lu1/g;Lu1/k0;Lu1/m0;)V

    return-void
.end method

.method public constructor <init>([Lu1/g;Lu1/k0;Lu1/m0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lu1/g;

    iput-object v0, p0, Lu1/c0$h;->a:[Lu1/g;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p2, p0, Lu1/c0$h;->b:Lu1/k0;

    iput-object p3, p0, Lu1/c0$h;->c:Lu1/m0;

    array-length v1, p1

    aput-object p2, v0, v1

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lu1/c0$h;->b:Lu1/k0;

    invoke-virtual {v0}, Lu1/k0;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Z)Z
    .locals 1

    iget-object v0, p0, Lu1/c0$h;->b:Lu1/k0;

    invoke-virtual {v0, p1}, Lu1/k0;->v(Z)V

    return p1
.end method

.method public c(J)J
    .locals 1

    iget-object v0, p0, Lu1/c0$h;->c:Lu1/m0;

    invoke-virtual {v0, p1, p2}, Lu1/m0;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()[Lu1/g;
    .locals 1

    iget-object v0, p0, Lu1/c0$h;->a:[Lu1/g;

    return-object v0
.end method

.method public e(Ls1/b3;)Ls1/b3;
    .locals 2

    iget-object v0, p0, Lu1/c0$h;->c:Lu1/m0;

    iget v1, p1, Ls1/b3;->j:F

    invoke-virtual {v0, v1}, Lu1/m0;->i(F)V

    iget-object v0, p0, Lu1/c0$h;->c:Lu1/m0;

    iget v1, p1, Ls1/b3;->k:F

    invoke-virtual {v0, v1}, Lu1/m0;->h(F)V

    return-object p1
.end method
