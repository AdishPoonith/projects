.class final Lio/grpc/internal/n;
.super Li9/f;
.source "SourceFile"


# instance fields
.field private final a:Lio/grpc/internal/o;

.field private final b:Lio/grpc/internal/l2;


# direct methods
.method constructor <init>(Lio/grpc/internal/o;Lio/grpc/internal/l2;)V
    .locals 1

    invoke-direct {p0}, Li9/f;-><init>()V

    const-string v0, "tracer"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/o;

    iput-object p1, p0, Lio/grpc/internal/n;->a:Lio/grpc/internal/o;

    const-string p1, "time"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/l2;

    iput-object p1, p0, Lio/grpc/internal/n;->b:Lio/grpc/internal/l2;

    return-void
.end method

.method private c(Li9/f$a;)Z
    .locals 1

    sget-object v0, Li9/f$a;->j:Li9/f$a;

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lio/grpc/internal/n;->a:Lio/grpc/internal/o;

    invoke-virtual {p1}, Lio/grpc/internal/o;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static d(Li9/j0;Li9/f$a;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lio/grpc/internal/n;->f(Li9/f$a;)Ljava/util/logging/Level;

    move-result-object p1

    sget-object v0, Lio/grpc/internal/o;->f:Ljava/util/logging/Logger;

    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lio/grpc/internal/o;->d(Li9/j0;Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static varargs e(Li9/j0;Li9/f$a;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-static {p1}, Lio/grpc/internal/n;->f(Li9/f$a;)Ljava/util/logging/Level;

    move-result-object p1

    sget-object v0, Lio/grpc/internal/o;->f:Ljava/util/logging/Logger;

    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lio/grpc/internal/o;->d(Li9/j0;Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static f(Li9/f$a;)Ljava/util/logging/Level;
    .locals 1

    sget-object v0, Lio/grpc/internal/n$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    return-object p0

    :cond_0
    sget-object p0, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    return-object p0

    :cond_1
    sget-object p0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    return-object p0
.end method

.method private static g(Li9/f$a;)Li9/e0$b;
    .locals 1

    sget-object v0, Lio/grpc/internal/n$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    sget-object p0, Li9/e0$b;->k:Li9/e0$b;

    return-object p0

    :cond_0
    sget-object p0, Li9/e0$b;->l:Li9/e0$b;

    return-object p0

    :cond_1
    sget-object p0, Li9/e0$b;->m:Li9/e0$b;

    return-object p0
.end method

.method private h(Li9/f$a;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Li9/f$a;->j:Li9/f$a;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/n;->a:Lio/grpc/internal/o;

    new-instance v1, Li9/e0$a;

    invoke-direct {v1}, Li9/e0$a;-><init>()V

    invoke-virtual {v1, p2}, Li9/e0$a;->b(Ljava/lang/String;)Li9/e0$a;

    move-result-object p2

    invoke-static {p1}, Lio/grpc/internal/n;->g(Li9/f$a;)Li9/e0$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Li9/e0$a;->c(Li9/e0$b;)Li9/e0$a;

    move-result-object p1

    iget-object p2, p0, Lio/grpc/internal/n;->b:Lio/grpc/internal/l2;

    invoke-interface {p2}, Lio/grpc/internal/l2;->a()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Li9/e0$a;->e(J)Li9/e0$a;

    move-result-object p1

    invoke-virtual {p1}, Li9/e0$a;->a()Li9/e0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/grpc/internal/o;->f(Li9/e0;)V

    return-void
.end method


# virtual methods
.method public a(Li9/f$a;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n;->a:Lio/grpc/internal/o;

    invoke-virtual {v0}, Lio/grpc/internal/o;->b()Li9/j0;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lio/grpc/internal/n;->d(Li9/j0;Li9/f$a;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/grpc/internal/n;->c(Li9/f$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/n;->h(Li9/f$a;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public varargs b(Li9/f$a;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, Lio/grpc/internal/n;->f(Li9/f$a;)Ljava/util/logging/Level;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/grpc/internal/n;->c(Li9/f$a;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lio/grpc/internal/o;->f:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p2, p3}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-virtual {p0, p1, p2}, Lio/grpc/internal/n;->a(Li9/f$a;Ljava/lang/String;)V

    return-void
.end method
