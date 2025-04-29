.class Lw1/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a()V
    .locals 0

    invoke-static {p0}, Lw1/x;->c(Lw1/y;)V

    return-void
.end method

.method public synthetic b()V
    .locals 0

    invoke-static {p0}, Lw1/x;->b(Lw1/y;)V

    return-void
.end method

.method public c(Lw1/w$a;Ls1/n1;)Lw1/o;
    .locals 2

    iget-object p1, p2, Ls1/n1;->x:Lw1/m;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lw1/e0;

    new-instance p2, Lw1/o$a;

    new-instance v0, Lw1/p0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw1/p0;-><init>(I)V

    const/16 v1, 0x1771

    invoke-direct {p2, v0, v1}, Lw1/o$a;-><init>(Ljava/lang/Throwable;I)V

    invoke-direct {p1, p2}, Lw1/e0;-><init>(Lw1/o$a;)V

    return-object p1
.end method

.method public synthetic d(Lw1/w$a;Ls1/n1;)Lw1/y$b;
    .locals 0

    invoke-static {p0, p1, p2}, Lw1/x;->a(Lw1/y;Lw1/w$a;Ls1/n1;)Lw1/y$b;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/os/Looper;Lt1/t1;)V
    .locals 0

    return-void
.end method

.method public f(Ls1/n1;)I
    .locals 0

    iget-object p1, p1, Ls1/n1;->x:Lw1/m;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
