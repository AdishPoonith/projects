.class final Lio/grpc/internal/g1$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/g1$m;->c(Li9/r0$f;)Lio/grpc/internal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic j:Lio/grpc/internal/g1$m;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1$m;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/g1$m$a;->j:Lio/grpc/internal/g1$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g1$m$a;->j:Lio/grpc/internal/g1$m;

    iget-object v0, v0, Lio/grpc/internal/g1$m;->a:Lio/grpc/internal/g1;

    invoke-virtual {v0}, Lio/grpc/internal/g1;->D0()V

    return-void
.end method
