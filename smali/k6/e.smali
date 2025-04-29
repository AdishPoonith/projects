.class public abstract Lk6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lk6/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(ILm6/l;[B[B)Lk6/e;
    .locals 1

    new-instance v0, Lk6/a;

    invoke-direct {v0, p0, p1, p2, p3}, Lk6/a;-><init>(ILm6/l;[B[B)V

    return-object v0
.end method


# virtual methods
.method public b(Lk6/e;)I
    .locals 2

    invoke-virtual {p0}, Lk6/e;->l()I

    move-result v0

    invoke-virtual {p1}, Lk6/e;->l()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lk6/e;->k()Lm6/l;

    move-result-object v0

    invoke-virtual {p1}, Lk6/e;->k()Lm6/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm6/l;->g(Lm6/l;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Lk6/e;->h()[B

    move-result-object v0

    invoke-virtual {p1}, Lk6/e;->h()[B

    move-result-object v1

    invoke-static {v0, v1}, Lq6/g0;->i([B[B)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Lk6/e;->i()[B

    move-result-object v0

    invoke-virtual {p1}, Lk6/e;->i()[B

    move-result-object p1

    invoke-static {v0, p1}, Lq6/g0;->i([B[B)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lk6/e;

    invoke-virtual {p0, p1}, Lk6/e;->b(Lk6/e;)I

    move-result p1

    return p1
.end method

.method public abstract h()[B
.end method

.method public abstract i()[B
.end method

.method public abstract k()Lm6/l;
.end method

.method public abstract l()I
.end method
