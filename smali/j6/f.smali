.class public Lj6/f;
.super Lj6/q;
.source "SourceFile"


# direct methods
.method constructor <init>(Lm6/r;Ld7/b0;)V
    .locals 1

    sget-object v0, Lj6/q$b;->q:Lj6/q$b;

    invoke-direct {p0, p1, v0, p2}, Lj6/q;-><init>(Lm6/r;Lj6/q$b;Ld7/b0;)V

    return-void
.end method


# virtual methods
.method public e(Lm6/i;)Z
    .locals 1

    invoke-virtual {p0}, Lj6/q;->g()Lm6/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lm6/i;->b(Lm6/r;)Ld7/b0;

    move-result-object p1

    invoke-static {p1}, Lm6/y;->t(Ld7/b0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ld7/b0;->q0()Ld7/b;

    move-result-object p1

    invoke-virtual {p0}, Lj6/q;->i()Ld7/b0;

    move-result-object v0

    invoke-static {p1, v0}, Lm6/y;->p(Ld7/c;Ld7/b0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
