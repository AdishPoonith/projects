.class Lio/grpc/internal/c1$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/c1$c;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/c1$c;


# direct methods
.method constructor <init>(Lio/grpc/internal/c1$c;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/c1$c$a;->a:Lio/grpc/internal/c1$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lio/grpc/internal/c1$c$a;->a:Lio/grpc/internal/c1$c;

    invoke-static {p1}, Lio/grpc/internal/c1$c;->c(Lio/grpc/internal/c1$c;)Lio/grpc/internal/v;

    move-result-object p1

    sget-object v0, Li9/j1;->u:Li9/j1;

    const-string v1, "Keepalive failed. The connection is likely gone"

    invoke-virtual {v0, v1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/grpc/internal/k1;->g(Li9/j1;)V

    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method
