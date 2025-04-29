.class final Lio/grpc/internal/g1$e;
.super Li9/r0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/g1;->J0(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation


# instance fields
.field private final a:Li9/r0$e;

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Lio/grpc/internal/g1;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/g1$e;->c:Lio/grpc/internal/g1;

    iput-object p2, p0, Lio/grpc/internal/g1$e;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Li9/r0$i;-><init>()V

    sget-object p1, Li9/j1;->t:Li9/j1;

    const-string v0, "Panic! This is a bug!"

    invoke-virtual {p1, v0}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object p1

    invoke-virtual {p1, p2}, Li9/j1;->p(Ljava/lang/Throwable;)Li9/j1;

    move-result-object p1

    invoke-static {p1}, Li9/r0$e;->e(Li9/j1;)Li9/r0$e;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/g1$e;->a:Li9/r0$e;

    return-void
.end method


# virtual methods
.method public a(Li9/r0$f;)Li9/r0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/g1$e;->a:Li9/r0$e;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lio/grpc/internal/g1$e;

    invoke-static {v0}, Lb5/h;->b(Ljava/lang/Class;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/g1$e;->a:Li9/r0$e;

    const-string v2, "panicPickResult"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
