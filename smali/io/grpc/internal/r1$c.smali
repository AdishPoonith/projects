.class final Lio/grpc/internal/r1$c;
.super Li9/r0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Li9/r0$e;


# direct methods
.method constructor <init>(Li9/r0$e;)V
    .locals 1

    invoke-direct {p0}, Li9/r0$i;-><init>()V

    const-string v0, "result"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/r0$e;

    iput-object p1, p0, Lio/grpc/internal/r1$c;->a:Li9/r0$e;

    return-void
.end method


# virtual methods
.method public a(Li9/r0$f;)Li9/r0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/r1$c;->a:Li9/r0$e;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lio/grpc/internal/r1$c;

    invoke-static {v0}, Lb5/h;->b(Ljava/lang/Class;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/r1$c;->a:Li9/r0$e;

    const-string v2, "result"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
