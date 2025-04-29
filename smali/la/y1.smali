.class public Lla/y1;
.super Lla/c2;
.source "SourceFile"

# interfaces
.implements Lla/x;


# instance fields
.field private final k:Z


# direct methods
.method public constructor <init>(Lla/v1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lla/c2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lla/c2;->l0(Lla/v1;)V

    invoke-direct {p0}, Lla/y1;->P0()Z

    move-result p1

    iput-boolean p1, p0, Lla/y1;->k:Z

    return-void
.end method

.method private final P0()Z
    .locals 4

    invoke-virtual {p0}, Lla/c2;->h0()Lla/r;

    move-result-object v0

    instance-of v1, v0, Lla/s;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lla/s;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lla/b2;->B()Lla/c2;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lla/c2;->a0()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, Lla/c2;->h0()Lla/r;

    move-result-object v0

    instance-of v3, v0, Lla/s;

    if-eqz v3, :cond_3

    check-cast v0, Lla/s;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lla/b2;->B()Lla/c2;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method


# virtual methods
.method public a0()Z
    .locals 1

    iget-boolean v0, p0, Lla/y1;->k:Z

    return v0
.end method

.method public c0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
