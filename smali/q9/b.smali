.class public abstract Lq9/b;
.super Li9/r0$d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li9/r0$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li9/r0$b;)Li9/r0$h;
    .locals 1

    invoke-virtual {p0}, Lq9/b;->g()Li9/r0$d;

    move-result-object v0

    invoke-virtual {v0, p1}, Li9/r0$d;->a(Li9/r0$b;)Li9/r0$h;

    move-result-object p1

    return-object p1
.end method

.method public b()Li9/f;
    .locals 1

    invoke-virtual {p0}, Lq9/b;->g()Li9/r0$d;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$d;->b()Li9/f;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-virtual {p0}, Lq9/b;->g()Li9/r0$d;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$d;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public d()Li9/n1;
    .locals 1

    invoke-virtual {p0}, Lq9/b;->g()Li9/r0$d;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$d;->d()Li9/n1;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Lq9/b;->g()Li9/r0$d;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$d;->e()V

    return-void
.end method

.method protected abstract g()Li9/r0$d;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lq9/b;->g()Li9/r0$d;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
