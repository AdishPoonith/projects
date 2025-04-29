.class abstract Lio/grpc/internal/n0;
.super Li9/a1;
.source "SourceFile"


# instance fields
.field private final a:Li9/a1;


# direct methods
.method constructor <init>(Li9/a1;)V
    .locals 1

    invoke-direct {p0}, Li9/a1;-><init>()V

    const-string v0, "delegate can not be null"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lio/grpc/internal/n0;->a:Li9/a1;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Li9/a1;

    invoke-virtual {v0}, Li9/a1;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Li9/a1;

    invoke-virtual {v0}, Li9/a1;->c()V

    return-void
.end method

.method public d(Li9/a1$e;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Li9/a1;

    invoke-virtual {v0, p1}, Li9/a1;->d(Li9/a1$e;)V

    return-void
.end method

.method public e(Li9/a1$f;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Li9/a1;

    invoke-virtual {v0, p1}, Li9/a1;->e(Li9/a1$f;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/n0;->a:Li9/a1;

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
