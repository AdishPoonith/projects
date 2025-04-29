.class public final Lc8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;
.implements Lg;
.implements Lj8/a;


# instance fields
.field private j:Lc8/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc8/c;->j:Lc8/b;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lc8/b;->d(Ld;)V

    return-void
.end method

.method public d(Li8/a$b;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg;->a:Lg$a;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    const-string v1, "getBinaryMessenger(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lg$a;->d(Lr8/c;Lg;)V

    iput-object v1, p0, Lc8/c;->j:Lc8/b;

    return-void
.end method

.method public e(Lj8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lc8/c;->f(Lj8/c;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc8/c;->j:Lc8/b;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc8/b;->c(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lc8/c;->j:Lc8/b;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc8/b;->c(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public isEnabled()Lb;
    .locals 1

    iget-object v0, p0, Lc8/c;->j:Lc8/b;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc8/b;->b()Lb;

    move-result-object v0

    return-object v0
.end method

.method public j()V
    .locals 0

    invoke-virtual {p0}, Lc8/c;->g()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 2

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg;->a:Lg$a;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    const-string v1, "getBinaryMessenger(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p0}, Lg$a;->d(Lr8/c;Lg;)V

    new-instance p1, Lc8/b;

    invoke-direct {p1}, Lc8/b;-><init>()V

    iput-object p1, p0, Lc8/c;->j:Lc8/b;

    return-void
.end method
