.class Lio/grpc/internal/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/d$a;->u(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic j:Lr9/b;

.field final synthetic k:I

.field final synthetic l:Lio/grpc/internal/d$a;


# direct methods
.method constructor <init>(Lio/grpc/internal/d$a;Lr9/b;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/d$a$a;->l:Lio/grpc/internal/d$a;

    iput-object p2, p0, Lio/grpc/internal/d$a$a;->j:Lr9/b;

    iput p3, p0, Lio/grpc/internal/d$a$a;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "AbstractStream.request"

    invoke-static {v0}, Lr9/c;->f(Ljava/lang/String;)V

    iget-object v1, p0, Lio/grpc/internal/d$a$a;->j:Lr9/b;

    invoke-static {v1}, Lr9/c;->d(Lr9/b;)V

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/d$a$a;->l:Lio/grpc/internal/d$a;

    invoke-static {v1}, Lio/grpc/internal/d$a;->j(Lio/grpc/internal/d$a;)Lio/grpc/internal/y;

    move-result-object v1

    iget v2, p0, Lio/grpc/internal/d$a$a;->k:I

    invoke-interface {v1, v2}, Lio/grpc/internal/y;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    iget-object v2, p0, Lio/grpc/internal/d$a$a;->l:Lio/grpc/internal/d$a;

    invoke-interface {v2, v1}, Lio/grpc/internal/l1$b;->b(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    invoke-static {v0}, Lr9/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_1
    move-exception v1

    invoke-static {v0}, Lr9/c;->h(Ljava/lang/String;)V

    throw v1
.end method
