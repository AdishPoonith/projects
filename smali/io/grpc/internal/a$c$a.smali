.class Lio/grpc/internal/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/a$c;->M(Li9/j1;Lio/grpc/internal/r$a;ZLi9/y0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Li9/j1;

.field final synthetic k:Lio/grpc/internal/r$a;

.field final synthetic l:Li9/y0;

.field final synthetic m:Lio/grpc/internal/a$c;


# direct methods
.method constructor <init>(Lio/grpc/internal/a$c;Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/a$c$a;->m:Lio/grpc/internal/a$c;

    iput-object p2, p0, Lio/grpc/internal/a$c$a;->j:Li9/j1;

    iput-object p3, p0, Lio/grpc/internal/a$c$a;->k:Lio/grpc/internal/r$a;

    iput-object p4, p0, Lio/grpc/internal/a$c$a;->l:Li9/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/a$c$a;->m:Lio/grpc/internal/a$c;

    iget-object v1, p0, Lio/grpc/internal/a$c$a;->j:Li9/j1;

    iget-object v2, p0, Lio/grpc/internal/a$c$a;->k:Lio/grpc/internal/r$a;

    iget-object v3, p0, Lio/grpc/internal/a$c$a;->l:Li9/y0;

    invoke-static {v0, v1, v2, v3}, Lio/grpc/internal/a$c;->B(Lio/grpc/internal/a$c;Li9/j1;Lio/grpc/internal/r$a;Li9/y0;)V

    return-void
.end method
