.class Lio/grpc/internal/g1$v$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/g1$v$g;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Ljava/lang/Runnable;

.field final synthetic k:Lio/grpc/internal/g1$v$g;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1$v$g;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/g1$v$g$a;->k:Lio/grpc/internal/g1$v$g;

    iput-object p2, p0, Lio/grpc/internal/g1$v$g$a;->j:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$a;->j:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lio/grpc/internal/g1$v$g$a;->k:Lio/grpc/internal/g1$v$g;

    iget-object v1, v0, Lio/grpc/internal/g1$v$g;->o:Lio/grpc/internal/g1$v;

    iget-object v1, v1, Lio/grpc/internal/g1$v;->d:Lio/grpc/internal/g1;

    iget-object v1, v1, Lio/grpc/internal/g1;->s:Li9/n1;

    new-instance v2, Lio/grpc/internal/g1$v$g$b;

    invoke-direct {v2, v0}, Lio/grpc/internal/g1$v$g$b;-><init>(Lio/grpc/internal/g1$v$g;)V

    invoke-virtual {v1, v2}, Li9/n1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
