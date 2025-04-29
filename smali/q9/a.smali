.class public abstract Lq9/a;
.super Li9/r0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li9/r0;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    invoke-virtual {p0}, Lq9/a;->g()Li9/r0;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0;->b()Z

    move-result v0

    return v0
.end method

.method public c(Li9/j1;)V
    .locals 1

    invoke-virtual {p0}, Lq9/a;->g()Li9/r0;

    move-result-object v0

    invoke-virtual {v0, p1}, Li9/r0;->c(Li9/j1;)V

    return-void
.end method

.method public d(Li9/r0$g;)V
    .locals 1

    invoke-virtual {p0}, Lq9/a;->g()Li9/r0;

    move-result-object v0

    invoke-virtual {v0, p1}, Li9/r0;->d(Li9/r0$g;)V

    return-void
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Lq9/a;->g()Li9/r0;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0;->e()V

    return-void
.end method

.method protected abstract g()Li9/r0;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lq9/a;->g()Li9/r0;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
