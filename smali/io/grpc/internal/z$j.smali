.class final Lio/grpc/internal/z$j;
.super Lio/grpc/internal/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "j"
.end annotation


# instance fields
.field final k:Li9/g$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/g$a<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field final l:Li9/j1;

.field final synthetic m:Lio/grpc/internal/z;


# direct methods
.method constructor <init>(Lio/grpc/internal/z;Li9/g$a;Li9/j1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/g$a<",
            "TRespT;>;",
            "Li9/j1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/z$j;->m:Lio/grpc/internal/z;

    invoke-static {p1}, Lio/grpc/internal/z;->i(Lio/grpc/internal/z;)Li9/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x;-><init>(Li9/r;)V

    iput-object p2, p0, Lio/grpc/internal/z$j;->k:Li9/g$a;

    iput-object p3, p0, Lio/grpc/internal/z$j;->l:Li9/j1;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z$j;->k:Li9/g$a;

    iget-object v1, p0, Lio/grpc/internal/z$j;->l:Li9/j1;

    new-instance v2, Li9/y0;

    invoke-direct {v2}, Li9/y0;-><init>()V

    invoke-virtual {v0, v1, v2}, Li9/g$a;->a(Li9/j1;Li9/y0;)V

    return-void
.end method
