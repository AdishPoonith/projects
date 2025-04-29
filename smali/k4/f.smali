.class final Lk4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk4/e;


# instance fields
.field final synthetic a:Lk4/a;


# direct methods
.method constructor <init>(Lk4/a;)V
    .locals 0

    iput-object p1, p0, Lk4/f;->a:Lk4/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk4/c;)V
    .locals 2

    iget-object v0, p0, Lk4/f;->a:Lk4/a;

    invoke-static {v0, p1}, Lk4/a;->l(Lk4/a;Lk4/c;)V

    iget-object p1, p0, Lk4/f;->a:Lk4/a;

    invoke-static {p1}, Lk4/a;->k(Lk4/a;)Ljava/util/LinkedList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk4/k;

    iget-object v1, p0, Lk4/f;->a:Lk4/a;

    invoke-static {v1}, Lk4/a;->j(Lk4/a;)Lk4/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lk4/k;->a(Lk4/c;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lk4/f;->a:Lk4/a;

    invoke-static {p1}, Lk4/a;->k(Lk4/a;)Ljava/util/LinkedList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    iget-object p1, p0, Lk4/f;->a:Lk4/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lk4/a;->m(Lk4/a;Landroid/os/Bundle;)V

    return-void
.end method
