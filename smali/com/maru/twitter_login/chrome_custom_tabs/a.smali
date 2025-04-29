.class public Lcom/maru/twitter_login/chrome_custom_tabs/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/maru/twitter_login/chrome_custom_tabs/a$a;
    }
.end annotation


# instance fields
.field private a:Lq/f;

.field private b:Lq/c;

.field private c:Lq/e;

.field private d:Lcom/maru/twitter_login/chrome_custom_tabs/a$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/app/Activity;)Z
    .locals 0

    invoke-static {p0}, La8/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g(Landroid/app/Activity;Lq/d;Landroid/net/Uri;I)V
    .locals 1

    iget-object v0, p1, Lq/d;->a:Landroid/content/Intent;

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p1, Lq/d;->a:Landroid/content/Intent;

    invoke-virtual {p0, p1, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Lq/c;

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Lq/f;

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/maru/twitter_login/chrome_custom_tabs/a$a;->a()V

    :cond_0
    return-void
.end method

.method public b(Lq/c;)V
    .locals 2

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Lq/c;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lq/c;->f(J)Z

    iget-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a$a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/maru/twitter_login/chrome_custom_tabs/a$a;->b()V

    :cond_0
    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Lq/c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, La8/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v1, La8/c;

    invoke-direct {v1, p0}, La8/c;-><init>(La8/d;)V

    iput-object v1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->c:Lq/e;

    invoke-static {p1, v0, v1}, Lq/c;->a(Landroid/content/Context;Ljava/lang/String;Lq/e;)Z

    return-void
.end method

.method public d()Lq/f;
    .locals 3

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Lq/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Lq/f;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Lq/f;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lq/c;->d(Lq/b;)Lq/f;

    move-result-object v0

    iput-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Lq/f;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Lq/f;

    return-object v0
.end method

.method public f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/os/Bundle;",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Lq/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/maru/twitter_login/chrome_custom_tabs/a;->d()Lq/f;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Lq/f;->f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public h(Lcom/maru/twitter_login/chrome_custom_tabs/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->d:Lcom/maru/twitter_login/chrome_custom_tabs/a$a;

    return-void
.end method

.method public i(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->c:Lq/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->b:Lq/c;

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->a:Lq/f;

    iput-object p1, p0, Lcom/maru/twitter_login/chrome_custom_tabs/a;->c:Lq/e;

    return-void
.end method
