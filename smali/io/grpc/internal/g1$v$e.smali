.class Lio/grpc/internal/g1$v$e;
.super Li9/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/g1$v;->e(Li9/z0;Li9/c;)Li9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li9/g<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/g1$v;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1$v;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/g1$v$e;->a:Lio/grpc/internal/g1$v;

    invoke-direct {p0}, Li9/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 0

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    return-void
.end method

.method public e(Li9/g$a;Li9/y0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/g$a<",
            "TRespT;>;",
            "Li9/y0;",
            ")V"
        }
    .end annotation

    sget-object p2, Lio/grpc/internal/g1;->q0:Li9/j1;

    new-instance v0, Li9/y0;

    invoke-direct {v0}, Li9/y0;-><init>()V

    invoke-virtual {p1, p2, v0}, Li9/g$a;->a(Li9/j1;Li9/y0;)V

    return-void
.end method
