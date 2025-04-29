.class Lio/grpc/internal/z1$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z1;->n0(Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Li9/j1;

.field final synthetic k:Lio/grpc/internal/r$a;

.field final synthetic l:Li9/y0;

.field final synthetic m:Lio/grpc/internal/z1;


# direct methods
.method constructor <init>(Lio/grpc/internal/z1;Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z1$q;->m:Lio/grpc/internal/z1;

    iput-object p2, p0, Lio/grpc/internal/z1$q;->j:Li9/j1;

    iput-object p3, p0, Lio/grpc/internal/z1$q;->k:Lio/grpc/internal/r$a;

    iput-object p4, p0, Lio/grpc/internal/z1$q;->l:Li9/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/z1$q;->m:Lio/grpc/internal/z1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lio/grpc/internal/z1;->t(Lio/grpc/internal/z1;Z)Z

    iget-object v0, p0, Lio/grpc/internal/z1$q;->m:Lio/grpc/internal/z1;

    invoke-static {v0}, Lio/grpc/internal/z1;->D(Lio/grpc/internal/z1;)Lio/grpc/internal/r;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/z1$q;->j:Li9/j1;

    iget-object v2, p0, Lio/grpc/internal/z1$q;->k:Lio/grpc/internal/r$a;

    iget-object v3, p0, Lio/grpc/internal/z1$q;->l:Li9/y0;

    invoke-interface {v0, v1, v2, v3}, Lio/grpc/internal/r;->c(Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V

    return-void
.end method
