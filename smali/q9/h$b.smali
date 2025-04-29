.class final Lq9/h$b;
.super Lq9/h$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final a:Li9/j1;


# direct methods
.method constructor <init>(Li9/j1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lq9/h$e;-><init>(Lq9/h$a;)V

    const-string v0, "status"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/j1;

    iput-object p1, p0, Lq9/h$b;->a:Li9/j1;

    return-void
.end method


# virtual methods
.method public a(Li9/r0$f;)Li9/r0$e;
    .locals 0

    iget-object p1, p0, Lq9/h$b;->a:Li9/j1;

    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Li9/r0$e;->g()Li9/r0$e;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lq9/h$b;->a:Li9/j1;

    invoke-static {p1}, Li9/r0$e;->f(Li9/j1;)Li9/r0$e;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method c(Lq9/h$e;)Z
    .locals 2

    instance-of v0, p1, Lq9/h$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq9/h$b;->a:Li9/j1;

    check-cast p1, Lq9/h$b;

    iget-object v1, p1, Lq9/h$b;->a:Li9/j1;

    invoke-static {v0, v1}, Lb5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lq9/h$b;->a:Li9/j1;

    invoke-virtual {v0}, Li9/j1;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lq9/h$b;->a:Li9/j1;

    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lq9/h$b;

    invoke-static {v0}, Lb5/h;->b(Ljava/lang/Class;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Lq9/h$b;->a:Li9/j1;

    const-string v2, "status"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
