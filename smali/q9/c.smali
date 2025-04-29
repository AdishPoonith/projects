.class public abstract Lq9/c;
.super Li9/r0$h;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li9/r0$h;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li9/x;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lq9/c;->i()Li9/r0$h;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$h;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq9/c;->i()Li9/r0$h;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$h;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Lq9/c;->i()Li9/r0$h;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$h;->e()V

    return-void
.end method

.method public f()V
    .locals 1

    invoke-virtual {p0}, Lq9/c;->i()Li9/r0$h;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$h;->f()V

    return-void
.end method

.method public g(Li9/r0$j;)V
    .locals 1

    invoke-virtual {p0}, Lq9/c;->i()Li9/r0$h;

    move-result-object v0

    invoke-virtual {v0, p1}, Li9/r0$h;->g(Li9/r0$j;)V

    return-void
.end method

.method protected abstract i()Li9/r0$h;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lq9/c;->i()Li9/r0$h;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
