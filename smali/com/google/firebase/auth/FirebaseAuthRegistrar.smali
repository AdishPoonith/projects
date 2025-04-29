.class public Lcom/google/firebase/auth/FirebaseAuthRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$getComponents$0(Lb6/f0;Lb6/f0;Lb6/f0;Lb6/f0;Lb6/f0;Lb6/e;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 10

    const-class v0, Lw5/f;

    invoke-interface {p5, v0}, Lb6/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lw5/f;

    const-class v0, Lr6/i;

    const-class v1, Lz5/b;

    invoke-interface {p5, v1}, Lb6/e;->g(Ljava/lang/Class;)Ls6/b;

    move-result-object v3

    invoke-interface {p5, v0}, Lb6/e;->g(Ljava/lang/Class;)Ls6/b;

    move-result-object v4

    new-instance v0, La6/u1;

    invoke-interface {p5, p0}, Lb6/e;->d(Lb6/f0;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p1}, Lb6/e;->d(Lb6/f0;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p2}, Lb6/e;->d(Lb6/f0;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Ljava/util/concurrent/Executor;

    invoke-interface {p5, p3}, Lb6/e;->d(Lb6/f0;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p5, p4}, Lb6/e;->d(Lb6/f0;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Ljava/util/concurrent/Executor;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, La6/u1;-><init>(Lw5/f;Ls6/b;Ls6/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 16
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb6/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lx5/d;

    const-class v1, Ljava/util/concurrent/Executor;

    const-class v2, Lx5/c;

    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lx5/c;

    const-class v5, Ljava/util/concurrent/Executor;

    const-class v6, Lx5/b;

    const-class v7, Ljava/util/concurrent/Executor;

    const-class v8, Lx5/a;

    const-class v9, Ljava/util/concurrent/Executor;

    invoke-static {v8, v9}, Lb6/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb6/f0;

    move-result-object v11

    invoke-static {v6, v7}, Lb6/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb6/f0;

    move-result-object v12

    invoke-static {v4, v5}, Lb6/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb6/f0;

    move-result-object v13

    invoke-static {v2, v3}, Lb6/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb6/f0;

    move-result-object v14

    invoke-static {v0, v1}, Lb6/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb6/f0;

    move-result-object v15

    const/4 v0, 0x3

    new-array v0, v0, [Lb6/c;

    const-class v1, La6/b;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-class v1, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v1, v3}, Lb6/c;->f(Ljava/lang/Class;[Ljava/lang/Class;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lw5/f;

    invoke-static {v3}, Lb6/r;->k(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lr6/i;

    invoke-static {v3}, Lb6/r;->l(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    invoke-static {v11}, Lb6/r;->j(Lb6/f0;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    invoke-static {v12}, Lb6/r;->j(Lb6/f0;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    invoke-static {v13}, Lb6/r;->j(Lb6/f0;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    invoke-static {v14}, Lb6/r;->j(Lb6/f0;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    invoke-static {v15}, Lb6/r;->j(Lb6/f0;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lz5/b;

    invoke-static {v3}, Lb6/r;->i(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    new-instance v3, Lcom/google/firebase/auth/f1;

    move-object v10, v3

    invoke-direct/range {v10 .. v15}, Lcom/google/firebase/auth/f1;-><init>(Lb6/f0;Lb6/f0;Lb6/f0;Lb6/f0;Lb6/f0;)V

    invoke-virtual {v1, v3}, Lb6/c$b;->d(Lb6/h;)Lb6/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lb6/c$b;->c()Lb6/c;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {}, Lr6/h;->a()Lb6/c;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "fire-auth"

    const-string v2, "22.0.0"

    invoke-static {v1, v2}, Lv6/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb6/c;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
