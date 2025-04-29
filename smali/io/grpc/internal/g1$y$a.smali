.class final Lio/grpc/internal/g1$y$a;
.super Lio/grpc/internal/y0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/g1$y;->g(Li9/r0$j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Li9/r0$j;

.field final synthetic b:Lio/grpc/internal/g1$y;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1$y;Li9/r0$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/g1$y$a;->b:Lio/grpc/internal/g1$y;

    iput-object p2, p0, Lio/grpc/internal/g1$y$a;->a:Li9/r0$j;

    invoke-direct {p0}, Lio/grpc/internal/y0$j;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lio/grpc/internal/y0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/g1$y$a;->b:Lio/grpc/internal/g1$y;

    iget-object v0, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v0, v0, Lio/grpc/internal/g1;->i0:Lio/grpc/internal/w0;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/w0;->e(Ljava/lang/Object;Z)V

    return-void
.end method

.method b(Lio/grpc/internal/y0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/g1$y$a;->b:Lio/grpc/internal/g1$y;

    iget-object v0, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v0, v0, Lio/grpc/internal/g1;->i0:Lio/grpc/internal/w0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/w0;->e(Ljava/lang/Object;Z)V

    return-void
.end method

.method c(Lio/grpc/internal/y0;Li9/q;)V
    .locals 1

    iget-object p1, p0, Lio/grpc/internal/g1$y$a;->a:Li9/r0$j;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "listener is null"

    invoke-static {p1, v0}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-object p1, p0, Lio/grpc/internal/g1$y$a;->a:Li9/r0$j;

    invoke-interface {p1, p2}, Li9/r0$j;->a(Li9/q;)V

    return-void
.end method

.method d(Lio/grpc/internal/y0;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g1$y$a;->b:Lio/grpc/internal/g1$y;

    iget-object v0, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->k0(Lio/grpc/internal/g1;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/grpc/internal/g1$y$a;->b:Lio/grpc/internal/g1$y;

    iget-object v0, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->f0(Lio/grpc/internal/g1;)Li9/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Li9/d0;->k(Li9/i0;)V

    iget-object p1, p0, Lio/grpc/internal/g1$y$a;->b:Lio/grpc/internal/g1$y;

    iget-object p1, p1, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {p1}, Lio/grpc/internal/g1;->g0(Lio/grpc/internal/g1;)V

    return-void
.end method
