.class Lio/grpc/internal/y0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y0;->P()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lio/grpc/internal/y0;


# direct methods
.method constructor <init>(Lio/grpc/internal/y0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y0$f;->j:Lio/grpc/internal/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/y0$f;->j:Lio/grpc/internal/y0;

    invoke-static {v0}, Lio/grpc/internal/y0;->y(Lio/grpc/internal/y0;)Li9/f;

    move-result-object v0

    sget-object v1, Li9/f$a;->k:Li9/f$a;

    const-string v2, "Terminated"

    invoke-virtual {v0, v1, v2}, Li9/f;->a(Li9/f$a;Ljava/lang/String;)V

    iget-object v0, p0, Lio/grpc/internal/y0$f;->j:Lio/grpc/internal/y0;

    invoke-static {v0}, Lio/grpc/internal/y0;->e(Lio/grpc/internal/y0;)Lio/grpc/internal/y0$j;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/y0$f;->j:Lio/grpc/internal/y0;

    invoke-virtual {v0, v1}, Lio/grpc/internal/y0$j;->d(Lio/grpc/internal/y0;)V

    return-void
.end method
