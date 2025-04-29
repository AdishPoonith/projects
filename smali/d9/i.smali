.class public final Ld9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;
.implements Lj8/a;


# instance fields
.field private j:Ld9/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Li8/a$b;)V
    .locals 1

    iget-object v0, p0, Ld9/i;->j:Ld9/h;

    if-nez v0, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "Already detached from the engine."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ld9/f;->f(Lr8/c;Ld9/a$b;)V

    iput-object v0, p0, Ld9/i;->j:Ld9/h;

    return-void
.end method

.method public e(Lj8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Ld9/i;->f(Lj8/c;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 1

    iget-object v0, p0, Ld9/i;->j:Ld9/h;

    if-nez v0, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "urlLauncher was never set."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld9/h;->i(Landroid/app/Activity;)V

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Ld9/i;->j:Ld9/h;

    if-nez v0, :cond_0

    const-string v0, "UrlLauncherPlugin"

    const-string v1, "urlLauncher was never set."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld9/h;->i(Landroid/app/Activity;)V

    return-void
.end method

.method public j()V
    .locals 0

    invoke-virtual {p0}, Ld9/i;->g()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 2

    new-instance v0, Ld9/h;

    invoke-virtual {p1}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ld9/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ld9/i;->j:Ld9/h;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    iget-object v0, p0, Ld9/i;->j:Ld9/h;

    invoke-static {p1, v0}, Ld9/f;->f(Lr8/c;Ld9/a$b;)V

    return-void
.end method
