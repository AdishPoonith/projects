.class final Lio/grpc/internal/r1;
.super Li9/r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/r1$d;,
        Lio/grpc/internal/r1$c;
    }
.end annotation


# instance fields
.field private final c:Li9/r0$d;

.field private d:Li9/r0$h;


# direct methods
.method constructor <init>(Li9/r0$d;)V
    .locals 1

    invoke-direct {p0}, Li9/r0;-><init>()V

    const-string v0, "helper"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/r0$d;

    iput-object p1, p0, Lio/grpc/internal/r1;->c:Li9/r0$d;

    return-void
.end method

.method static synthetic g(Lio/grpc/internal/r1;Li9/r0$h;Li9/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/r1;->i(Li9/r0$h;Li9/q;)V

    return-void
.end method

.method static synthetic h(Lio/grpc/internal/r1;)Li9/r0$d;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/r1;->c:Li9/r0$d;

    return-object p0
.end method

.method private i(Li9/r0$h;Li9/q;)V
    .locals 3

    invoke-virtual {p2}, Li9/q;->c()Li9/p;

    move-result-object v0

    sget-object v1, Li9/p;->n:Li9/p;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Li9/q;->c()Li9/p;

    move-result-object v1

    sget-object v2, Li9/p;->l:Li9/p;

    if-eq v1, v2, :cond_1

    invoke-virtual {p2}, Li9/q;->c()Li9/p;

    move-result-object v1

    sget-object v2, Li9/p;->m:Li9/p;

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/r1;->c:Li9/r0$d;

    invoke-virtual {v1}, Li9/r0$d;->e()V

    :cond_2
    sget-object v1, Lio/grpc/internal/r1$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_5

    const/4 v2, 0x3

    if-eq v1, v2, :cond_4

    const/4 p1, 0x4

    if-ne v1, p1, :cond_3

    new-instance p1, Lio/grpc/internal/r1$c;

    invoke-virtual {p2}, Li9/q;->d()Li9/j1;

    move-result-object p2

    invoke-static {p2}, Li9/r0$e;->f(Li9/j1;)Li9/r0$e;

    move-result-object p2

    invoke-direct {p1, p2}, Lio/grpc/internal/r1$c;-><init>(Li9/r0$e;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported state:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p2, Lio/grpc/internal/r1$c;

    invoke-static {p1}, Li9/r0$e;->h(Li9/r0$h;)Li9/r0$e;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/grpc/internal/r1$c;-><init>(Li9/r0$e;)V

    goto :goto_0

    :cond_5
    new-instance p1, Lio/grpc/internal/r1$c;

    invoke-static {}, Li9/r0$e;->g()Li9/r0$e;

    move-result-object p2

    invoke-direct {p1, p2}, Lio/grpc/internal/r1$c;-><init>(Li9/r0$e;)V

    goto :goto_1

    :cond_6
    new-instance p2, Lio/grpc/internal/r1$d;

    invoke-direct {p2, p0, p1}, Lio/grpc/internal/r1$d;-><init>(Lio/grpc/internal/r1;Li9/r0$h;)V

    :goto_0
    move-object p1, p2

    :goto_1
    iget-object p2, p0, Lio/grpc/internal/r1;->c:Li9/r0$d;

    invoke-virtual {p2, v0, p1}, Li9/r0$d;->f(Li9/p;Li9/r0$i;)V

    return-void
.end method


# virtual methods
.method public a(Li9/r0$g;)Z
    .locals 4

    invoke-virtual {p1}, Li9/r0$g;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Li9/j1;->u:Li9/j1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NameResolver returned no usable address. addrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Li9/r0$g;->a()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", attrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Li9/r0$g;->b()Li9/a;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Li9/j1;->q(Ljava/lang/String;)Li9/j1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/grpc/internal/r1;->c(Li9/j1;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, Lio/grpc/internal/r1;->d:Li9/r0$h;

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/grpc/internal/r1;->c:Li9/r0$d;

    invoke-static {}, Li9/r0$b;->c()Li9/r0$b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Li9/r0$b$a;->e(Ljava/util/List;)Li9/r0$b$a;

    move-result-object v0

    invoke-virtual {v0}, Li9/r0$b$a;->b()Li9/r0$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Li9/r0$d;->a(Li9/r0$b;)Li9/r0$h;

    move-result-object p1

    new-instance v0, Lio/grpc/internal/r1$a;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/r1$a;-><init>(Lio/grpc/internal/r1;Li9/r0$h;)V

    invoke-virtual {p1, v0}, Li9/r0$h;->g(Li9/r0$j;)V

    iput-object p1, p0, Lio/grpc/internal/r1;->d:Li9/r0$h;

    iget-object v0, p0, Lio/grpc/internal/r1;->c:Li9/r0$d;

    sget-object v1, Li9/p;->j:Li9/p;

    new-instance v2, Lio/grpc/internal/r1$c;

    invoke-static {p1}, Li9/r0$e;->h(Li9/r0$h;)Li9/r0$e;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/grpc/internal/r1$c;-><init>(Li9/r0$e;)V

    invoke-virtual {v0, v1, v2}, Li9/r0$d;->f(Li9/p;Li9/r0$i;)V

    invoke-virtual {p1}, Li9/r0$h;->e()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Li9/r0$h;->h(Ljava/util/List;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public c(Li9/j1;)V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/r1;->d:Li9/r0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li9/r0$h;->f()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/r1;->d:Li9/r0$h;

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/r1;->c:Li9/r0$d;

    sget-object v1, Li9/p;->l:Li9/p;

    new-instance v2, Lio/grpc/internal/r1$c;

    invoke-static {p1}, Li9/r0$e;->f(Li9/j1;)Li9/r0$e;

    move-result-object p1

    invoke-direct {v2, p1}, Lio/grpc/internal/r1$c;-><init>(Li9/r0$e;)V

    invoke-virtual {v0, v1, v2}, Li9/r0$d;->f(Li9/p;Li9/r0$i;)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/r1;->d:Li9/r0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li9/r0$h;->e()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/r1;->d:Li9/r0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li9/r0$h;->f()V

    :cond_0
    return-void
.end method
