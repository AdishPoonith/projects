.class public final Lx2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ly2/j;Ljava/lang/String;Ly2/i;I)Lo3/p;
    .locals 2

    new-instance v0, Lo3/p$b;

    invoke-direct {v0}, Lo3/p$b;-><init>()V

    invoke-virtual {p2, p1}, Ly2/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo3/p$b;->i(Landroid/net/Uri;)Lo3/p$b;

    move-result-object p1

    iget-wide v0, p2, Ly2/i;->a:J

    invoke-virtual {p1, v0, v1}, Lo3/p$b;->h(J)Lo3/p$b;

    move-result-object p1

    iget-wide v0, p2, Ly2/i;->b:J

    invoke-virtual {p1, v0, v1}, Lo3/p$b;->g(J)Lo3/p$b;

    move-result-object p1

    invoke-static {p0, p2}, Lx2/g;->b(Ly2/j;Ly2/i;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo3/p$b;->f(Ljava/lang/String;)Lo3/p$b;

    move-result-object p0

    invoke-virtual {p0, p3}, Lo3/p$b;->b(I)Lo3/p$b;

    move-result-object p0

    invoke-virtual {p0}, Lo3/p$b;->a()Lo3/p;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ly2/j;Ly2/i;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ly2/j;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ly2/j;->c:Lcom/google/common/collect/q;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly2/b;

    iget-object p0, p0, Ly2/b;->a:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ly2/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
