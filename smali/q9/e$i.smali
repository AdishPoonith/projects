.class Lq9/e$i;
.super Lq9/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq9/e$i$a;
    }
.end annotation


# instance fields
.field private final a:Li9/r0$h;

.field private b:Lq9/e$b;

.field private c:Z

.field private d:Li9/q;

.field private e:Li9/r0$j;

.field final synthetic f:Lq9/e;


# direct methods
.method constructor <init>(Lq9/e;Li9/r0$h;)V
    .locals 0

    iput-object p1, p0, Lq9/e$i;->f:Lq9/e;

    invoke-direct {p0}, Lq9/c;-><init>()V

    iput-object p2, p0, Lq9/e$i;->a:Li9/r0$h;

    return-void
.end method

.method static synthetic j(Lq9/e$i;Li9/q;)Li9/q;
    .locals 0

    iput-object p1, p0, Lq9/e$i;->d:Li9/q;

    return-object p1
.end method

.method static synthetic k(Lq9/e$i;)Z
    .locals 0

    iget-boolean p0, p0, Lq9/e$i;->c:Z

    return p0
.end method


# virtual methods
.method public c()Li9/a;
    .locals 3

    iget-object v0, p0, Lq9/e$i;->b:Lq9/e$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq9/e$i;->a:Li9/r0$h;

    invoke-virtual {v0}, Li9/r0$h;->c()Li9/a;

    move-result-object v0

    invoke-virtual {v0}, Li9/a;->d()Li9/a$b;

    move-result-object v0

    invoke-static {}, Lq9/e;->k()Li9/a$c;

    move-result-object v1

    iget-object v2, p0, Lq9/e$i;->b:Lq9/e$b;

    invoke-virtual {v0, v1, v2}, Li9/a$b;->d(Li9/a$c;Ljava/lang/Object;)Li9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Li9/a$b;->a()Li9/a;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lq9/e$i;->a:Li9/r0$h;

    invoke-virtual {v0}, Li9/r0$h;->c()Li9/a;

    move-result-object v0

    return-object v0
.end method

.method public g(Li9/r0$j;)V
    .locals 1

    iput-object p1, p0, Lq9/e$i;->e:Li9/r0$j;

    new-instance v0, Lq9/e$i$a;

    invoke-direct {v0, p0, p1}, Lq9/e$i$a;-><init>(Lq9/e$i;Li9/r0$j;)V

    invoke-super {p0, v0}, Lq9/c;->g(Li9/r0$j;)V

    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li9/x;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lq9/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lq9/e;->j(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lq9/e;->j(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq9/e$i;->f:Lq9/e;

    iget-object v0, v0, Lq9/e;->c:Lq9/e$c;

    iget-object v2, p0, Lq9/e$i;->b:Lq9/e$b;

    invoke-virtual {v0, v2}, Lcom/google/common/collect/l;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq9/e$i;->b:Lq9/e$b;

    invoke-virtual {v0, p0}, Lq9/e$b;->i(Lq9/e$i;)Z

    :cond_0
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/x;

    invoke-virtual {v0}, Li9/x;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/SocketAddress;

    iget-object v1, p0, Lq9/e$i;->f:Lq9/e;

    iget-object v1, v1, Lq9/e;->c:Lq9/e$c;

    invoke-virtual {v1, v0}, Lcom/google/common/collect/l;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lq9/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lq9/e;->j(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lq9/e;->j(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lq9/e$i;->f:Lq9/e;

    iget-object v0, v0, Lq9/e;->c:Lq9/e$c;

    invoke-virtual {p0}, Li9/r0$h;->a()Li9/x;

    move-result-object v2

    invoke-virtual {v2}, Li9/x;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/collect/l;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lq9/e$i;->f:Lq9/e;

    iget-object v0, v0, Lq9/e;->c:Lq9/e$c;

    invoke-virtual {p0}, Li9/r0$h;->a()Li9/x;

    move-result-object v2

    invoke-virtual {v2}, Li9/x;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/collect/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq9/e$b;

    invoke-virtual {v0, p0}, Lq9/e$b;->i(Lq9/e$i;)Z

    invoke-virtual {v0}, Lq9/e$b;->j()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lq9/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lq9/e;->j(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1}, Lq9/e;->j(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/x;

    invoke-virtual {v0}, Li9/x;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/SocketAddress;

    iget-object v1, p0, Lq9/e$i;->f:Lq9/e;

    iget-object v1, v1, Lq9/e;->c:Lq9/e$c;

    invoke-virtual {v1, v0}, Lcom/google/common/collect/l;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lq9/e$i;->f:Lq9/e;

    iget-object v1, v1, Lq9/e;->c:Lq9/e$c;

    invoke-virtual {v1, v0}, Lcom/google/common/collect/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq9/e$b;

    invoke-virtual {v0, p0}, Lq9/e$b;->b(Lq9/e$i;)Z

    :cond_3
    :goto_1
    iget-object v0, p0, Lq9/e$i;->a:Li9/r0$h;

    invoke-virtual {v0, p1}, Li9/r0$h;->h(Ljava/util/List;)V

    return-void
.end method

.method protected i()Li9/r0$h;
    .locals 1

    iget-object v0, p0, Lq9/e$i;->a:Li9/r0$h;

    return-object v0
.end method

.method l()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lq9/e$i;->b:Lq9/e$b;

    return-void
.end method

.method m()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq9/e$i;->c:Z

    iget-object v0, p0, Lq9/e$i;->e:Li9/r0$j;

    sget-object v1, Li9/j1;->u:Li9/j1;

    invoke-static {v1}, Li9/q;->b(Li9/j1;)Li9/q;

    move-result-object v1

    invoke-interface {v0, v1}, Li9/r0$j;->a(Li9/q;)V

    return-void
.end method

.method n()Z
    .locals 1

    iget-boolean v0, p0, Lq9/e$i;->c:Z

    return v0
.end method

.method o(Lq9/e$b;)V
    .locals 0

    iput-object p1, p0, Lq9/e$i;->b:Lq9/e$b;

    return-void
.end method

.method p()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq9/e$i;->c:Z

    iget-object v0, p0, Lq9/e$i;->d:Li9/q;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lq9/e$i;->e:Li9/r0$j;

    invoke-interface {v1, v0}, Li9/r0$j;->a(Li9/q;)V

    :cond_0
    return-void
.end method
