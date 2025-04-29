.class Lio/grpc/internal/c0$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/c0$e;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Z

.field final synthetic k:Lio/grpc/internal/c0$e;


# direct methods
.method constructor <init>(Lio/grpc/internal/c0$e;Z)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/c0$e$a;->k:Lio/grpc/internal/c0$e;

    iput-boolean p2, p0, Lio/grpc/internal/c0$e$a;->j:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-boolean v0, p0, Lio/grpc/internal/c0$e$a;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/c0$e$a;->k:Lio/grpc/internal/c0$e;

    iget-object v0, v0, Lio/grpc/internal/c0$e;->k:Lio/grpc/internal/c0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lio/grpc/internal/c0;->l:Z

    invoke-static {v0}, Lio/grpc/internal/c0;->j(Lio/grpc/internal/c0;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v0, p0, Lio/grpc/internal/c0$e$a;->k:Lio/grpc/internal/c0$e;

    iget-object v0, v0, Lio/grpc/internal/c0$e;->k:Lio/grpc/internal/c0;

    invoke-static {v0}, Lio/grpc/internal/c0;->k(Lio/grpc/internal/c0;)Lb5/r;

    move-result-object v0

    invoke-virtual {v0}, Lb5/r;->f()Lb5/r;

    move-result-object v0

    invoke-virtual {v0}, Lb5/r;->g()Lb5/r;

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/c0$e$a;->k:Lio/grpc/internal/c0$e;

    iget-object v0, v0, Lio/grpc/internal/c0$e;->k:Lio/grpc/internal/c0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/c0;->l(Lio/grpc/internal/c0;Z)Z

    return-void
.end method
