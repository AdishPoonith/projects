.class final Lio/grpc/internal/g1$y;
.super Lio/grpc/internal/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "y"
.end annotation


# instance fields
.field final a:Li9/r0$b;

.field final b:Lio/grpc/internal/g1$t;

.field final c:Li9/j0;

.field final d:Lio/grpc/internal/n;

.field final e:Lio/grpc/internal/o;

.field f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li9/x;",
            ">;"
        }
    .end annotation
.end field

.field g:Lio/grpc/internal/y0;

.field h:Z

.field i:Z

.field j:Li9/n1$d;

.field final synthetic k:Lio/grpc/internal/g1;


# direct methods
.method constructor <init>(Lio/grpc/internal/g1;Li9/r0$b;Lio/grpc/internal/g1$t;)V
    .locals 7

    iput-object p1, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-direct {p0}, Lio/grpc/internal/e;-><init>()V

    const-string v0, "args"

    invoke-static {p2, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Li9/r0$b;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/g1$y;->f:Ljava/util/List;

    invoke-static {p1}, Lio/grpc/internal/g1;->w0(Lio/grpc/internal/g1;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Li9/r0$b;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/grpc/internal/g1$y;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Li9/r0$b;->d()Li9/r0$b$a;

    move-result-object p2

    invoke-virtual {p2, v0}, Li9/r0$b$a;->e(Ljava/util/List;)Li9/r0$b$a;

    move-result-object p2

    invoke-virtual {p2}, Li9/r0$b$a;->b()Li9/r0$b;

    move-result-object p2

    :cond_0
    iput-object p2, p0, Lio/grpc/internal/g1$y;->a:Li9/r0$b;

    const-string v0, "helper"

    invoke-static {p3, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/grpc/internal/g1$t;

    iput-object p3, p0, Lio/grpc/internal/g1$y;->b:Lio/grpc/internal/g1$t;

    invoke-virtual {p1}, Lio/grpc/internal/g1;->b()Ljava/lang/String;

    move-result-object p3

    const-string v0, "Subchannel"

    invoke-static {v0, p3}, Li9/j0;->b(Ljava/lang/String;Ljava/lang/String;)Li9/j0;

    move-result-object v2

    iput-object v2, p0, Lio/grpc/internal/g1$y;->c:Li9/j0;

    new-instance p3, Lio/grpc/internal/o;

    invoke-static {p1}, Lio/grpc/internal/g1;->d0(Lio/grpc/internal/g1;)I

    move-result v3

    invoke-static {p1}, Lio/grpc/internal/g1;->c0(Lio/grpc/internal/g1;)Lio/grpc/internal/l2;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/l2;->a()J

    move-result-wide v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subchannel for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Li9/r0$b;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, Lio/grpc/internal/o;-><init>(Li9/j0;IJLjava/lang/String;)V

    iput-object p3, p0, Lio/grpc/internal/g1$y;->e:Lio/grpc/internal/o;

    new-instance p2, Lio/grpc/internal/n;

    invoke-static {p1}, Lio/grpc/internal/g1;->c0(Lio/grpc/internal/g1;)Lio/grpc/internal/l2;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lio/grpc/internal/n;-><init>(Lio/grpc/internal/o;Lio/grpc/internal/l2;)V

    iput-object p2, p0, Lio/grpc/internal/g1$y;->d:Lio/grpc/internal/n;

    return-void
.end method

.method private i(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li9/x;",
            ">;)",
            "Ljava/util/List<",
            "Li9/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/x;

    new-instance v2, Li9/x;

    invoke-virtual {v1}, Li9/x;->a()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Li9/x;->b()Li9/a;

    move-result-object v1

    invoke-virtual {v1}, Li9/a;->d()Li9/a$b;

    move-result-object v1

    sget-object v4, Li9/x;->d:Li9/a$c;

    invoke-virtual {v1, v4}, Li9/a$b;->c(Li9/a$c;)Li9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Li9/a$b;->a()Li9/a;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Li9/x;-><init>(Ljava/util/List;Li9/a;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li9/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v0, v0, Lio/grpc/internal/g1;->s:Li9/n1;

    invoke-virtual {v0}, Li9/n1;->e()V

    iget-boolean v0, p0, Lio/grpc/internal/g1$y;->h:Z

    const-string v1, "not started"

    invoke-static {v0, v1}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/g1$y;->f:Ljava/util/List;

    return-object v0
.end method

.method public c()Li9/a;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g1$y;->a:Li9/r0$b;

    invoke-virtual {v0}, Li9/r0$b;->b()Li9/a;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Lio/grpc/internal/g1$y;->h:Z

    const-string v1, "Subchannel is not started"

    invoke-static {v0, v1}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/g1$y;->g:Lio/grpc/internal/y0;

    return-object v0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v0, v0, Lio/grpc/internal/g1;->s:Li9/n1;

    invoke-virtual {v0}, Li9/n1;->e()V

    iget-boolean v0, p0, Lio/grpc/internal/g1$y;->h:Z

    const-string v1, "not started"

    invoke-static {v0, v1}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/g1$y;->g:Lio/grpc/internal/y0;

    invoke-virtual {v0}, Lio/grpc/internal/y0;->b()Lio/grpc/internal/s;

    return-void
.end method

.method public f()V
    .locals 7

    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v0, v0, Lio/grpc/internal/g1;->s:Li9/n1;

    invoke-virtual {v0}, Li9/n1;->e()V

    iget-object v0, p0, Lio/grpc/internal/g1$y;->g:Lio/grpc/internal/y0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lio/grpc/internal/g1$y;->i:Z

    return-void

    :cond_0
    iget-boolean v0, p0, Lio/grpc/internal/g1$y;->i:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->Z(Lio/grpc/internal/g1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/g1$y;->j:Li9/n1$d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li9/n1$d;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/g1$y;->j:Li9/n1$d;

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    iput-boolean v1, p0, Lio/grpc/internal/g1$y;->i:Z

    :goto_0
    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->Z(Lio/grpc/internal/g1;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v1, v0, Lio/grpc/internal/g1;->s:Li9/n1;

    new-instance v2, Lio/grpc/internal/d1;

    new-instance v0, Lio/grpc/internal/g1$y$b;

    invoke-direct {v0, p0}, Lio/grpc/internal/g1$y$b;-><init>(Lio/grpc/internal/g1$y;)V

    invoke-direct {v2, v0}, Lio/grpc/internal/d1;-><init>(Ljava/lang/Runnable;)V

    const-wide/16 v3, 0x5

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->C(Lio/grpc/internal/g1;)Lio/grpc/internal/t;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/t;->S()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Li9/n1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Li9/n1$d;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/g1$y;->j:Li9/n1$d;

    return-void

    :cond_3
    iget-object v0, p0, Lio/grpc/internal/g1$y;->g:Lio/grpc/internal/y0;

    sget-object v1, Lio/grpc/internal/g1;->q0:Li9/j1;

    invoke-virtual {v0, v1}, Lio/grpc/internal/y0;->c(Li9/j1;)V

    return-void
.end method

.method public g(Li9/r0$j;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v1, v1, Lio/grpc/internal/g1;->s:Li9/n1;

    invoke-virtual {v1}, Li9/n1;->e()V

    iget-boolean v1, v0, Lio/grpc/internal/g1$y;->h:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const-string v3, "already started"

    invoke-static {v1, v3}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-boolean v1, v0, Lio/grpc/internal/g1$y;->i:Z

    xor-int/2addr v1, v2

    const-string v3, "already shutdown"

    invoke-static {v1, v3}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-object v1, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v1}, Lio/grpc/internal/g1;->Z(Lio/grpc/internal/g1;)Z

    move-result v1

    xor-int/2addr v1, v2

    const-string v3, "Channel is being terminated"

    invoke-static {v1, v3}, Lb5/n;->u(ZLjava/lang/Object;)V

    iput-boolean v2, v0, Lio/grpc/internal/g1$y;->h:Z

    new-instance v1, Lio/grpc/internal/y0;

    iget-object v2, v0, Lio/grpc/internal/g1$y;->a:Li9/r0$b;

    invoke-virtual {v2}, Li9/r0$b;->a()Ljava/util/List;

    move-result-object v5

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-virtual {v2}, Lio/grpc/internal/g1;->b()Ljava/lang/String;

    move-result-object v6

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->h0(Lio/grpc/internal/g1;)Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->i0(Lio/grpc/internal/g1;)Lio/grpc/internal/k$a;

    move-result-object v8

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->C(Lio/grpc/internal/g1;)Lio/grpc/internal/t;

    move-result-object v9

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->C(Lio/grpc/internal/g1;)Lio/grpc/internal/t;

    move-result-object v2

    invoke-interface {v2}, Lio/grpc/internal/t;->S()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v10

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->j0(Lio/grpc/internal/g1;)Lb5/t;

    move-result-object v11

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v12, v2, Lio/grpc/internal/g1;->s:Li9/n1;

    new-instance v13, Lio/grpc/internal/g1$y$a;

    move-object/from16 v2, p1

    invoke-direct {v13, v0, v2}, Lio/grpc/internal/g1$y$a;-><init>(Lio/grpc/internal/g1$y;Li9/r0$j;)V

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->f0(Lio/grpc/internal/g1;)Li9/d0;

    move-result-object v14

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->e0(Lio/grpc/internal/g1;)Lio/grpc/internal/m$b;

    move-result-object v2

    invoke-interface {v2}, Lio/grpc/internal/m$b;->a()Lio/grpc/internal/m;

    move-result-object v15

    iget-object v2, v0, Lio/grpc/internal/g1$y;->e:Lio/grpc/internal/o;

    iget-object v3, v0, Lio/grpc/internal/g1$y;->c:Li9/j0;

    iget-object v4, v0, Lio/grpc/internal/g1$y;->d:Lio/grpc/internal/n;

    move-object/from16 v18, v4

    move-object v4, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    invoke-direct/range {v4 .. v18}, Lio/grpc/internal/y0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/grpc/internal/k$a;Lio/grpc/internal/t;Ljava/util/concurrent/ScheduledExecutorService;Lb5/t;Li9/n1;Lio/grpc/internal/y0$j;Li9/d0;Lio/grpc/internal/m;Lio/grpc/internal/o;Li9/j0;Li9/f;)V

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->P(Lio/grpc/internal/g1;)Lio/grpc/internal/o;

    move-result-object v2

    new-instance v3, Li9/e0$a;

    invoke-direct {v3}, Li9/e0$a;-><init>()V

    const-string v4, "Child Subchannel started"

    invoke-virtual {v3, v4}, Li9/e0$a;->b(Ljava/lang/String;)Li9/e0$a;

    move-result-object v3

    sget-object v4, Li9/e0$b;->k:Li9/e0$b;

    invoke-virtual {v3, v4}, Li9/e0$a;->c(Li9/e0$b;)Li9/e0$a;

    move-result-object v3

    iget-object v4, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v4}, Lio/grpc/internal/g1;->c0(Lio/grpc/internal/g1;)Lio/grpc/internal/l2;

    move-result-object v4

    invoke-interface {v4}, Lio/grpc/internal/l2;->a()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Li9/e0$a;->e(J)Li9/e0$a;

    move-result-object v3

    invoke-virtual {v3, v1}, Li9/e0$a;->d(Li9/p0;)Li9/e0$a;

    move-result-object v3

    invoke-virtual {v3}, Li9/e0$a;->a()Li9/e0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/grpc/internal/o;->e(Li9/e0;)V

    iput-object v1, v0, Lio/grpc/internal/g1$y;->g:Lio/grpc/internal/y0;

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->f0(Lio/grpc/internal/g1;)Li9/d0;

    move-result-object v2

    invoke-virtual {v2, v1}, Li9/d0;->e(Li9/i0;)V

    iget-object v2, v0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v2}, Lio/grpc/internal/g1;->k0(Lio/grpc/internal/g1;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li9/x;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    iget-object v0, v0, Lio/grpc/internal/g1;->s:Li9/n1;

    invoke-virtual {v0}, Li9/n1;->e()V

    iput-object p1, p0, Lio/grpc/internal/g1$y;->f:Ljava/util/List;

    iget-object v0, p0, Lio/grpc/internal/g1$y;->k:Lio/grpc/internal/g1;

    invoke-static {v0}, Lio/grpc/internal/g1;->w0(Lio/grpc/internal/g1;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/grpc/internal/g1$y;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/g1$y;->g:Lio/grpc/internal/y0;

    invoke-virtual {v0, p1}, Lio/grpc/internal/y0;->U(Ljava/util/List;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g1$y;->c:Li9/j0;

    invoke-virtual {v0}, Li9/j0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
