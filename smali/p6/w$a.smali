.class Lp6/w$a;
.super Li9/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/w;->i([Li9/g;Lp6/h0;Lcom/google/android/gms/tasks/Task;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp6/h0;

.field final synthetic b:[Li9/g;

.field final synthetic c:Lp6/w;


# direct methods
.method constructor <init>(Lp6/w;Lp6/h0;[Li9/g;)V
    .locals 0

    iput-object p1, p0, Lp6/w$a;->c:Lp6/w;

    iput-object p2, p0, Lp6/w$a;->a:Lp6/h0;

    iput-object p3, p0, Lp6/w$a;->b:[Li9/g;

    invoke-direct {p0}, Li9/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li9/j1;Li9/y0;)V
    .locals 0

    :try_start_0
    iget-object p2, p0, Lp6/w$a;->a:Lp6/h0;

    invoke-interface {p2, p1}, Lp6/h0;->a(Li9/j1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lp6/w$a;->c:Lp6/w;

    invoke-static {p2}, Lp6/w;->d(Lp6/w;)Lq6/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lq6/g;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public b(Li9/y0;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lp6/w$a;->a:Lp6/h0;

    invoke-interface {v0, p1}, Lp6/h0;->c(Li9/y0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lp6/w$a;->c:Lp6/w;

    invoke-static {v0}, Lp6/w;->d(Lp6/w;)Lq6/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq6/g;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lp6/w$a;->a:Lp6/h0;

    invoke-interface {v0, p1}, Lp6/h0;->d(Ljava/lang/Object;)V

    iget-object p1, p0, Lp6/w$a;->b:[Li9/g;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Li9/g;->c(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lp6/w$a;->c:Lp6/w;

    invoke-static {v0}, Lp6/w;->d(Lp6/w;)Lq6/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq6/g;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
