.class Lj0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/p;
.implements Lr8/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp0/p<",
        "Lp1/g0;",
        ">;",
        "Lr8/m;"
    }
.end annotation


# instance fields
.field private final j:Lp0/n;

.field private k:Lr8/k$d;


# direct methods
.method constructor <init>(Lp0/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/b;->j:Lp0/n;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "CANCELLED"

    const-string v1, "User has cancelled login with facebook"

    invoke-virtual {p0, v0, v1}, Lj0/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(IILandroid/content/Intent;)Z
    .locals 1

    iget-object v0, p0, Lj0/b;->j:Lp0/n;

    invoke-interface {v0, p1, p2, p3}, Lp0/n;->b(IILandroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public c(Lp0/s;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FAILED"

    invoke-virtual {p0, v0, p1}, Lj0/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lj0/b;->k:Lr8/k$d;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v1, p0, Lj0/b;->k:Lr8/k$d;

    :cond_0
    return-void
.end method

.method e(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj0/b;->k:Lr8/k$d;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lj0/b;->k:Lr8/k$d;

    :cond_0
    return-void
.end method

.method public f(Lp1/g0;)V
    .locals 0

    invoke-virtual {p1}, Lp1/g0;->a()Lp0/a;

    move-result-object p1

    invoke-static {p1}, Lj0/a;->b(Lp0/a;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj0/b;->e(Ljava/lang/Object;)V

    return-void
.end method

.method g(Lr8/k$d;)Z
    .locals 3

    iget-object v0, p0, Lj0/b;->k:Lr8/k$d;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const-string v1, "OPERATION_IN_PROGRESS"

    const-string v2, "The method login was called while another Facebook operation was in progress."

    invoke-interface {p1, v1, v2, v0}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    iput-object p1, p0, Lj0/b;->k:Lr8/k$d;

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lp1/g0;

    invoke-virtual {p0, p1}, Lj0/b;->f(Lp1/g0;)V

    return-void
.end method
