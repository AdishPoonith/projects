.class Lio/grpc/internal/z$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z$k;->b(Li9/y0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Li9/y0;

.field final synthetic k:Lio/grpc/internal/z$k;


# direct methods
.method constructor <init>(Lio/grpc/internal/z$k;Li9/y0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z$k$a;->k:Lio/grpc/internal/z$k;

    iput-object p2, p0, Lio/grpc/internal/z$k$a;->j:Li9/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/z$k$a;->k:Lio/grpc/internal/z$k;

    invoke-static {v0}, Lio/grpc/internal/z$k;->e(Lio/grpc/internal/z$k;)Li9/g$a;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/z$k$a;->j:Li9/y0;

    invoke-virtual {v0, v1}, Li9/g$a;->b(Li9/y0;)V

    return-void
.end method
