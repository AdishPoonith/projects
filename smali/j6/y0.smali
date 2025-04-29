.class public Lj6/y0;
.super Lj6/q;
.source "SourceFile"


# direct methods
.method constructor <init>(Lm6/r;Ld7/b0;)V
    .locals 1

    sget-object v0, Lj6/q$b;->t:Lj6/q$b;

    invoke-direct {p0, p1, v0, p2}, Lj6/q;-><init>(Lm6/r;Lj6/q$b;Ld7/b0;)V

    invoke-static {p2}, Lm6/y;->t(Ld7/b0;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "NotInFilter expects an ArrayValue"

    invoke-static {p1, v0, p2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public e(Lm6/i;)Z
    .locals 2

    invoke-virtual {p0}, Lj6/q;->i()Ld7/b0;

    move-result-object v0

    invoke-virtual {v0}, Ld7/b0;->q0()Ld7/b;

    move-result-object v0

    sget-object v1, Lm6/y;->b:Ld7/b0;

    invoke-static {v0, v1}, Lm6/y;->p(Ld7/c;Ld7/b0;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lj6/q;->g()Lm6/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lm6/i;->b(Lm6/r;)Ld7/b0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lj6/q;->i()Ld7/b0;

    move-result-object v0

    invoke-virtual {v0}, Ld7/b0;->q0()Ld7/b;

    move-result-object v0

    invoke-static {v0, p1}, Lm6/y;->p(Ld7/c;Ld7/b0;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
