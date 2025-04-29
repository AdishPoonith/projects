.class Lk9/i$a;
.super Lio/grpc/internal/w0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/grpc/internal/w0<",
        "Lk9/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lk9/i;


# direct methods
.method constructor <init>(Lk9/i;)V
    .locals 0

    iput-object p1, p0, Lk9/i$a;->b:Lk9/i;

    invoke-direct {p0}, Lio/grpc/internal/w0;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 2

    iget-object v0, p0, Lk9/i$a;->b:Lk9/i;

    invoke-static {v0}, Lk9/i;->i(Lk9/i;)Lio/grpc/internal/k1$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lio/grpc/internal/k1$a;->c(Z)V

    return-void
.end method

.method protected c()V
    .locals 2

    iget-object v0, p0, Lk9/i$a;->b:Lk9/i;

    invoke-static {v0}, Lk9/i;->i(Lk9/i;)Lio/grpc/internal/k1$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/grpc/internal/k1$a;->c(Z)V

    return-void
.end method
