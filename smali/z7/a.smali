.class public Lz7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;


# static fields
.field public static final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lz7/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public j:Lr8/k;

.field public k:Ly7/b;

.field public l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lz7/a;->m:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ly7/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lz7/a;->l:Ljava/lang/String;

    iput-object p1, p0, Lz7/a;->k:Ly7/b;

    new-instance v0, Lr8/k;

    invoke-virtual {p1}, Ly7/b;->b()Lr8/c;

    move-result-object p1

    const-string v1, "twitter_login/auth_browser"

    invoke-direct {v0, p1, v1}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lz7/a;->j:Lr8/k;

    invoke-virtual {v0, p0}, Lr8/k;->e(Lr8/k$c;)V

    sget-object p1, Lz7/a;->m:Ljava/util/Map;

    iget-object v0, p0, Lz7/a;->l:Ljava/lang/String;

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 2

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    const-string v1, "open"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "url"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lz7/a;->k:Ly7/b;

    invoke-virtual {v1}, Ly7/b;->h()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0, v1, v0, p1, p2}, Lz7/a;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lr8/k$d;)V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lr8/j;->a:Ljava/lang/String;

    const-string v0, "isAvailable"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lz7/a;->k:Ly7/b;

    invoke-virtual {p1}, Ly7/b;->h()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/maru/twitter_login/chrome_custom_tabs/a;->e(Landroid/app/Activity;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lr8/k$d;->c()V

    :goto_0
    return-void
.end method

.method public a()V
    .locals 3

    iget-object v0, p0, Lz7/a;->j:Lr8/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr8/k;->e(Lr8/k$c;)V

    sget-object v0, Lz7/a;->m:Ljava/util/Map;

    iget-object v2, p0, Lz7/a;->l:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v1, p0, Lz7/a;->k:Ly7/b;

    return-void
.end method

.method public b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lr8/k$d;)V
    .locals 2

    invoke-static {p1}, Lcom/maru/twitter_login/chrome_custom_tabs/a;->e(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-interface {p4, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "url"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "id"

    invoke-virtual {v0, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lz7/a;->l:Ljava/lang/String;

    const-string p3, "managerId"

    invoke-virtual {v0, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    const-class p3, Lcom/maru/twitter_login/chrome_custom_tabs/ChromeCustomTabsActivity;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0
.end method
