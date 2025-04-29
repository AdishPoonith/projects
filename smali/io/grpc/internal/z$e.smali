.class Lio/grpc/internal/z$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z;->k(Li9/j1;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Li9/j1;

.field final synthetic k:Lio/grpc/internal/z;


# direct methods
.method constructor <init>(Lio/grpc/internal/z;Li9/j1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z$e;->k:Lio/grpc/internal/z;

    iput-object p2, p0, Lio/grpc/internal/z$e;->j:Li9/j1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z$e;->k:Lio/grpc/internal/z;

    invoke-static {v0}, Lio/grpc/internal/z;->h(Lio/grpc/internal/z;)Li9/g;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/z$e;->j:Li9/j1;

    invoke-virtual {v1}, Li9/j1;->n()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/grpc/internal/z$e;->j:Li9/j1;

    invoke-virtual {v2}, Li9/j1;->l()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Li9/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
