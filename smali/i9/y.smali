.class public abstract Li9/y;
.super Li9/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Li9/y<",
        "TT;>;>",
        "Li9/v0<",
        "TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li9/v0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(JLjava/util/concurrent/TimeUnit;)Li9/v0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Li9/y;->f(JLjava/util/concurrent/TimeUnit;)Li9/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Li9/v0;
    .locals 1

    invoke-virtual {p0}, Li9/y;->h()Li9/y;

    move-result-object v0

    return-object v0
.end method

.method protected abstract e()Li9/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/v0<",
            "*>;"
        }
    .end annotation
.end method

.method public f(JLjava/util/concurrent/TimeUnit;)Li9/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0}, Li9/y;->e()Li9/v0;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Li9/v0;->c(JLjava/util/concurrent/TimeUnit;)Li9/v0;

    invoke-virtual {p0}, Li9/y;->g()Li9/y;

    move-result-object p1

    return-object p1
.end method

.method protected final g()Li9/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    return-object p0
.end method

.method public h()Li9/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Li9/y;->e()Li9/v0;

    move-result-object v0

    invoke-virtual {v0}, Li9/v0;->d()Li9/v0;

    invoke-virtual {p0}, Li9/y;->g()Li9/y;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {p0}, Li9/y;->e()Li9/v0;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
