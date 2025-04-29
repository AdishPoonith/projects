.class final Lio/grpc/internal/j$d;
.super Li9/r0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final a:Li9/j1;


# direct methods
.method constructor <init>(Li9/j1;)V
    .locals 0

    invoke-direct {p0}, Li9/r0$i;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/j$d;->a:Li9/j1;

    return-void
.end method


# virtual methods
.method public a(Li9/r0$f;)Li9/r0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/j$d;->a:Li9/j1;

    invoke-static {p1}, Li9/r0$e;->f(Li9/j1;)Li9/r0$e;

    move-result-object p1

    return-object p1
.end method
