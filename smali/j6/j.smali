.class public abstract Lj6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj6/j$a;
    }
.end annotation


# instance fields
.field private a:Ll6/e1;

.field private b:Ll6/i0;

.field private c:Lj6/f1;

.field private d:Lp6/p0;

.field private e:Lj6/p;

.field private f:Lp6/l;

.field private g:Ll6/k;

.field private h:Ll6/f4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Lj6/j$a;)Lp6/l;
.end method

.method protected abstract b(Lj6/j$a;)Lj6/p;
.end method

.method protected abstract c(Lj6/j$a;)Ll6/f4;
.end method

.method protected abstract d(Lj6/j$a;)Ll6/k;
.end method

.method protected abstract e(Lj6/j$a;)Ll6/i0;
.end method

.method protected abstract f(Lj6/j$a;)Ll6/e1;
.end method

.method protected abstract g(Lj6/j$a;)Lp6/p0;
.end method

.method protected abstract h(Lj6/j$a;)Lj6/f1;
.end method

.method protected i()Lp6/l;
    .locals 3

    iget-object v0, p0, Lj6/j;->f:Lp6/l;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectivityMonitor not initialized yet"

    invoke-static {v0, v2, v1}, Lq6/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp6/l;

    return-object v0
.end method

.method public j()Lj6/p;
    .locals 3

    iget-object v0, p0, Lj6/j;->e:Lj6/p;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "eventManager not initialized yet"

    invoke-static {v0, v2, v1}, Lq6/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj6/p;

    return-object v0
.end method

.method public k()Ll6/f4;
    .locals 1

    iget-object v0, p0, Lj6/j;->h:Ll6/f4;

    return-object v0
.end method

.method public l()Ll6/k;
    .locals 1

    iget-object v0, p0, Lj6/j;->g:Ll6/k;

    return-object v0
.end method

.method public m()Ll6/i0;
    .locals 3

    iget-object v0, p0, Lj6/j;->b:Ll6/i0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localStore not initialized yet"

    invoke-static {v0, v2, v1}, Lq6/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll6/i0;

    return-object v0
.end method

.method public n()Ll6/e1;
    .locals 3

    iget-object v0, p0, Lj6/j;->a:Ll6/e1;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "persistence not initialized yet"

    invoke-static {v0, v2, v1}, Lq6/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll6/e1;

    return-object v0
.end method

.method public o()Lp6/p0;
    .locals 3

    iget-object v0, p0, Lj6/j;->d:Lp6/p0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remoteStore not initialized yet"

    invoke-static {v0, v2, v1}, Lq6/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp6/p0;

    return-object v0
.end method

.method public p()Lj6/f1;
    .locals 3

    iget-object v0, p0, Lj6/j;->c:Lj6/f1;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncEngine not initialized yet"

    invoke-static {v0, v2, v1}, Lq6/b;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj6/f1;

    return-object v0
.end method

.method public q(Lj6/j$a;)V
    .locals 1

    invoke-virtual {p0, p1}, Lj6/j;->f(Lj6/j$a;)Ll6/e1;

    move-result-object v0

    iput-object v0, p0, Lj6/j;->a:Ll6/e1;

    invoke-virtual {v0}, Ll6/e1;->m()V

    invoke-virtual {p0, p1}, Lj6/j;->e(Lj6/j$a;)Ll6/i0;

    move-result-object v0

    iput-object v0, p0, Lj6/j;->b:Ll6/i0;

    invoke-virtual {p0, p1}, Lj6/j;->a(Lj6/j$a;)Lp6/l;

    move-result-object v0

    iput-object v0, p0, Lj6/j;->f:Lp6/l;

    invoke-virtual {p0, p1}, Lj6/j;->g(Lj6/j$a;)Lp6/p0;

    move-result-object v0

    iput-object v0, p0, Lj6/j;->d:Lp6/p0;

    invoke-virtual {p0, p1}, Lj6/j;->h(Lj6/j$a;)Lj6/f1;

    move-result-object v0

    iput-object v0, p0, Lj6/j;->c:Lj6/f1;

    invoke-virtual {p0, p1}, Lj6/j;->b(Lj6/j$a;)Lj6/p;

    move-result-object v0

    iput-object v0, p0, Lj6/j;->e:Lj6/p;

    iget-object v0, p0, Lj6/j;->b:Ll6/i0;

    invoke-virtual {v0}, Ll6/i0;->m0()V

    iget-object v0, p0, Lj6/j;->d:Lp6/p0;

    invoke-virtual {v0}, Lp6/p0;->P()V

    invoke-virtual {p0, p1}, Lj6/j;->c(Lj6/j$a;)Ll6/f4;

    move-result-object v0

    iput-object v0, p0, Lj6/j;->h:Ll6/f4;

    invoke-virtual {p0, p1}, Lj6/j;->d(Lj6/j$a;)Ll6/k;

    move-result-object p1

    iput-object p1, p0, Lj6/j;->g:Ll6/k;

    return-void
.end method
