.class Lio/grpc/internal/z1$y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/z1$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "y"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/z1;


# direct methods
.method constructor <init>(Lio/grpc/internal/z1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z1$y;->a:Lio/grpc/internal/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/grpc/internal/z1$b0;)V
    .locals 3

    iget-object v0, p1, Lio/grpc/internal/z1$b0;->a:Lio/grpc/internal/q;

    new-instance v1, Lio/grpc/internal/z1$a0;

    iget-object v2, p0, Lio/grpc/internal/z1$y;->a:Lio/grpc/internal/z1;

    invoke-direct {v1, v2, p1}, Lio/grpc/internal/z1$a0;-><init>(Lio/grpc/internal/z1;Lio/grpc/internal/z1$b0;)V

    invoke-interface {v0, v1}, Lio/grpc/internal/q;->g(Lio/grpc/internal/r;)V

    return-void
.end method
