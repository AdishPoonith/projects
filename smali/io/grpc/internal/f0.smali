.class public final Lio/grpc/internal/f0;
.super Lio/grpc/internal/o1;
.source "SourceFile"


# instance fields
.field private b:Z

.field private final c:Li9/j1;

.field private final d:Lio/grpc/internal/r$a;

.field private final e:[Li9/k;


# direct methods
.method public constructor <init>(Li9/j1;Lio/grpc/internal/r$a;[Li9/k;)V
    .locals 2

    invoke-direct {p0}, Lio/grpc/internal/o1;-><init>()V

    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v0, v1}, Lb5/n;->e(ZLjava/lang/Object;)V

    iput-object p1, p0, Lio/grpc/internal/f0;->c:Li9/j1;

    iput-object p2, p0, Lio/grpc/internal/f0;->d:Lio/grpc/internal/r$a;

    iput-object p3, p0, Lio/grpc/internal/f0;->e:[Li9/k;

    return-void
.end method

.method public constructor <init>(Li9/j1;[Li9/k;)V
    .locals 1

    sget-object v0, Lio/grpc/internal/r$a;->j:Lio/grpc/internal/r$a;

    invoke-direct {p0, p1, v0, p2}, Lio/grpc/internal/f0;-><init>(Li9/j1;Lio/grpc/internal/r$a;[Li9/k;)V

    return-void
.end method


# virtual methods
.method public g(Lio/grpc/internal/r;)V
    .locals 5

    iget-boolean v0, p0, Lio/grpc/internal/f0;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "already started"

    invoke-static {v0, v2}, Lb5/n;->u(ZLjava/lang/Object;)V

    iput-boolean v1, p0, Lio/grpc/internal/f0;->b:Z

    iget-object v0, p0, Lio/grpc/internal/f0;->e:[Li9/k;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, p0, Lio/grpc/internal/f0;->c:Li9/j1;

    invoke-virtual {v3, v4}, Li9/m1;->i(Li9/j1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f0;->c:Li9/j1;

    iget-object v1, p0, Lio/grpc/internal/f0;->d:Lio/grpc/internal/r$a;

    new-instance v2, Li9/y0;

    invoke-direct {v2}, Li9/y0;-><init>()V

    invoke-interface {p1, v0, v1, v2}, Lio/grpc/internal/r;->c(Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V

    return-void
.end method

.method public l(Lio/grpc/internal/x0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f0;->c:Li9/j1;

    const-string v1, "error"

    invoke-virtual {p1, v1, v0}, Lio/grpc/internal/x0;->b(Ljava/lang/String;Ljava/lang/Object;)Lio/grpc/internal/x0;

    move-result-object p1

    iget-object v0, p0, Lio/grpc/internal/f0;->d:Lio/grpc/internal/r$a;

    const-string v1, "progress"

    invoke-virtual {p1, v1, v0}, Lio/grpc/internal/x0;->b(Ljava/lang/String;Ljava/lang/Object;)Lio/grpc/internal/x0;

    return-void
.end method
