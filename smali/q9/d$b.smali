.class Lq9/d$b;
.super Lq9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/d;->r(Li9/r0$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Li9/r0;

.field final synthetic b:Lq9/d;


# direct methods
.method constructor <init>(Lq9/d;)V
    .locals 0

    iput-object p1, p0, Lq9/d$b;->b:Lq9/d;

    invoke-direct {p0}, Lq9/b;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Li9/p;Li9/r0$i;)V
    .locals 2

    iget-object v0, p0, Lq9/d$b;->a:Li9/r0;

    iget-object v1, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v1}, Lq9/d;->i(Lq9/d;)Li9/r0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v0}, Lq9/d;->j(Lq9/d;)Z

    move-result v0

    const-string v1, "there\'s pending lb while current lb has been out of READY"

    invoke-static {v0, v1}, Lb5/n;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v0, p1}, Lq9/d;->l(Lq9/d;Li9/p;)Li9/p;

    iget-object v0, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v0, p2}, Lq9/d;->m(Lq9/d;Li9/r0$i;)Li9/r0$i;

    sget-object p2, Li9/p;->k:Li9/p;

    if-ne p1, p2, :cond_3

    :goto_0
    iget-object p1, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {p1}, Lq9/d;->n(Lq9/d;)V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lq9/d$b;->a:Li9/r0;

    iget-object v1, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v1}, Lq9/d;->o(Lq9/d;)Li9/r0;

    move-result-object v1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lq9/d$b;->b:Lq9/d;

    sget-object v1, Li9/p;->k:Li9/p;

    if-ne p1, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v0, v1}, Lq9/d;->k(Lq9/d;Z)Z

    iget-object v0, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v0}, Lq9/d;->j(Lq9/d;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v0}, Lq9/d;->i(Lq9/d;)Li9/r0;

    move-result-object v0

    iget-object v1, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v1}, Lq9/d;->p(Lq9/d;)Li9/r0;

    move-result-object v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v0}, Lq9/d;->h(Lq9/d;)Li9/r0$d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Li9/r0$d;->f(Li9/p;Li9/r0$i;)V

    :cond_3
    :goto_2
    return-void
.end method

.method protected g()Li9/r0$d;
    .locals 1

    iget-object v0, p0, Lq9/d$b;->b:Lq9/d;

    invoke-static {v0}, Lq9/d;->h(Lq9/d;)Li9/r0$d;

    move-result-object v0

    return-object v0
.end method
