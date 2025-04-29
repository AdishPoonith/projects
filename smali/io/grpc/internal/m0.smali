.class abstract Lio/grpc/internal/m0;
.super Li9/u0;
.source "SourceFile"


# instance fields
.field private final a:Li9/u0;


# direct methods
.method constructor <init>(Li9/u0;)V
    .locals 0

    invoke-direct {p0}, Li9/u0;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    invoke-virtual {v0}, Li9/d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Li9/z0;Li9/c;)Li9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Li9/z0<",
            "TRequestT;TResponseT;>;",
            "Li9/c;",
            ")",
            "Li9/g<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    invoke-virtual {v0, p1, p2}, Li9/d;->e(Li9/z0;Li9/c;)Li9/g;

    move-result-object p1

    return-object p1
.end method

.method public i(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    invoke-virtual {v0, p1, p2, p3}, Li9/u0;->i(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    invoke-virtual {v0}, Li9/u0;->j()V

    return-void
.end method

.method public k(Z)Li9/p;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    invoke-virtual {v0, p1}, Li9/u0;->k(Z)Li9/p;

    move-result-object p1

    return-object p1
.end method

.method public l(Li9/p;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    invoke-virtual {v0, p1, p2}, Li9/u0;->l(Li9/p;Ljava/lang/Runnable;)V

    return-void
.end method

.method public m()Li9/u0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    invoke-virtual {v0}, Li9/u0;->m()Li9/u0;

    move-result-object v0

    return-object v0
.end method

.method public n()Li9/u0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    invoke-virtual {v0}, Li9/u0;->n()Li9/u0;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/m0;->a:Li9/u0;

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
