.class Lq9/e$d;
.super Lq9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private a:Li9/r0$d;

.field final synthetic b:Lq9/e;


# direct methods
.method constructor <init>(Lq9/e;Li9/r0$d;)V
    .locals 0

    iput-object p1, p0, Lq9/e$d;->b:Lq9/e;

    invoke-direct {p0}, Lq9/b;-><init>()V

    iput-object p2, p0, Lq9/e$d;->a:Li9/r0$d;

    return-void
.end method


# virtual methods
.method public a(Li9/r0$b;)Li9/r0$h;
    .locals 4

    new-instance v0, Lq9/e$i;

    iget-object v1, p0, Lq9/e$d;->b:Lq9/e;

    iget-object v2, p0, Lq9/e$d;->a:Li9/r0$d;

    invoke-virtual {v2, p1}, Li9/r0$d;->a(Li9/r0$b;)Li9/r0$h;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lq9/e$i;-><init>(Lq9/e;Li9/r0$h;)V

    invoke-virtual {p1}, Li9/r0$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lq9/e;->j(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lq9/e$d;->b:Lq9/e;

    iget-object v1, v1, Lq9/e;->c:Lq9/e$c;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li9/x;

    invoke-virtual {v3}, Li9/x;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/common/collect/l;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lq9/e$d;->b:Lq9/e;

    iget-object v1, v1, Lq9/e;->c:Lq9/e$c;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/x;

    invoke-virtual {p1}, Li9/x;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/common/collect/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq9/e$b;

    invoke-virtual {p1, v0}, Lq9/e$b;->b(Lq9/e$i;)Z

    invoke-static {p1}, Lq9/e$b;->a(Lq9/e$b;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lq9/e$i;->m()V

    :cond_0
    return-object v0
.end method

.method public f(Li9/p;Li9/r0$i;)V
    .locals 3

    iget-object v0, p0, Lq9/e$d;->a:Li9/r0$d;

    new-instance v1, Lq9/e$h;

    iget-object v2, p0, Lq9/e$d;->b:Lq9/e;

    invoke-direct {v1, v2, p2}, Lq9/e$h;-><init>(Lq9/e;Li9/r0$i;)V

    invoke-virtual {v0, p1, v1}, Li9/r0$d;->f(Li9/p;Li9/r0$i;)V

    return-void
.end method

.method protected g()Li9/r0$d;
    .locals 1

    iget-object v0, p0, Lq9/e$d;->a:Li9/r0$d;

    return-object v0
.end method
