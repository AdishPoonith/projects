.class public Lcom/lyokone/location/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;
.implements Lj8/a;


# instance fields
.field private j:Lcom/lyokone/location/c;

.field private k:Lcom/lyokone/location/d;

.field private l:Lcom/lyokone/location/FlutterLocationService;

.field private m:Lj8/c;

.field private final n:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/lyokone/location/b$a;

    invoke-direct {v0, p0}, Lcom/lyokone/location/b$a;-><init>(Lcom/lyokone/location/b;)V

    iput-object v0, p0, Lcom/lyokone/location/b;->n:Landroid/content/ServiceConnection;

    return-void
.end method

.method static synthetic a(Lcom/lyokone/location/b;Lcom/lyokone/location/FlutterLocationService;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lyokone/location/b;->i(Lcom/lyokone/location/FlutterLocationService;)V

    return-void
.end method

.method private b(Lj8/c;)V
    .locals 3

    iput-object p1, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object p1

    const-class v2, Lcom/lyokone/location/FlutterLocationService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p1, p0, Lcom/lyokone/location/b;->n:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method private c()V
    .locals 2

    invoke-direct {p0}, Lcom/lyokone/location/b;->h()V

    iget-object v0, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    invoke-interface {v0}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/lyokone/location/b;->n:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    return-void
.end method

.method private h()V
    .locals 3

    iget-object v0, p0, Lcom/lyokone/location/b;->k:Lcom/lyokone/location/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/lyokone/location/d;->a(Lcom/lyokone/location/a;)V

    iget-object v0, p0, Lcom/lyokone/location/b;->j:Lcom/lyokone/location/c;

    invoke-virtual {v0, v1}, Lcom/lyokone/location/c;->j(Lcom/lyokone/location/FlutterLocationService;)V

    iget-object v0, p0, Lcom/lyokone/location/b;->j:Lcom/lyokone/location/c;

    invoke-virtual {v0, v1}, Lcom/lyokone/location/c;->i(Lcom/lyokone/location/a;)V

    iget-object v0, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    iget-object v2, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v2}, Lcom/lyokone/location/FlutterLocationService;->h()Lr8/p;

    move-result-object v2

    invoke-interface {v0, v2}, Lj8/c;->e(Lr8/p;)V

    iget-object v0, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    iget-object v2, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v2}, Lcom/lyokone/location/FlutterLocationService;->g()Lr8/p;

    move-result-object v2

    invoke-interface {v0, v2}, Lj8/c;->e(Lr8/p;)V

    iget-object v0, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    iget-object v2, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v2}, Lcom/lyokone/location/FlutterLocationService;->f()Lr8/m;

    move-result-object v2

    invoke-interface {v0, v2}, Lj8/c;->g(Lr8/m;)V

    iget-object v0, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v0, v1}, Lcom/lyokone/location/FlutterLocationService;->k(Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    return-void
.end method

.method private i(Lcom/lyokone/location/FlutterLocationService;)V
    .locals 1

    iput-object p1, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    iget-object v0, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    invoke-interface {v0}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/lyokone/location/FlutterLocationService;->k(Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    iget-object v0, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v0}, Lcom/lyokone/location/FlutterLocationService;->f()Lr8/m;

    move-result-object v0

    invoke-interface {p1, v0}, Lj8/c;->b(Lr8/m;)V

    iget-object p1, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    iget-object v0, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v0}, Lcom/lyokone/location/FlutterLocationService;->g()Lr8/p;

    move-result-object v0

    invoke-interface {p1, v0}, Lj8/c;->c(Lr8/p;)V

    iget-object p1, p0, Lcom/lyokone/location/b;->m:Lj8/c;

    iget-object v0, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v0}, Lcom/lyokone/location/FlutterLocationService;->h()Lr8/p;

    move-result-object v0

    invoke-interface {p1, v0}, Lj8/c;->c(Lr8/p;)V

    iget-object p1, p0, Lcom/lyokone/location/b;->j:Lcom/lyokone/location/c;

    iget-object v0, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v0}, Lcom/lyokone/location/FlutterLocationService;->e()Lcom/lyokone/location/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/lyokone/location/c;->i(Lcom/lyokone/location/a;)V

    iget-object p1, p0, Lcom/lyokone/location/b;->j:Lcom/lyokone/location/c;

    iget-object v0, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {p1, v0}, Lcom/lyokone/location/c;->j(Lcom/lyokone/location/FlutterLocationService;)V

    iget-object p1, p0, Lcom/lyokone/location/b;->k:Lcom/lyokone/location/d;

    iget-object v0, p0, Lcom/lyokone/location/b;->l:Lcom/lyokone/location/FlutterLocationService;

    invoke-virtual {v0}, Lcom/lyokone/location/FlutterLocationService;->e()Lcom/lyokone/location/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/lyokone/location/d;->a(Lcom/lyokone/location/a;)V

    return-void
.end method


# virtual methods
.method public d(Li8/a$b;)V
    .locals 1

    iget-object p1, p0, Lcom/lyokone/location/b;->j:Lcom/lyokone/location/c;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/lyokone/location/c;->l()V

    iput-object v0, p0, Lcom/lyokone/location/b;->j:Lcom/lyokone/location/c;

    :cond_0
    iget-object p1, p0, Lcom/lyokone/location/b;->k:Lcom/lyokone/location/d;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/lyokone/location/d;->e()V

    iput-object v0, p0, Lcom/lyokone/location/b;->k:Lcom/lyokone/location/d;

    :cond_1
    return-void
.end method

.method public e(Lj8/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lyokone/location/b;->b(Lj8/c;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lyokone/location/b;->b(Lj8/c;)V

    return-void
.end method

.method public g()V
    .locals 0

    invoke-direct {p0}, Lcom/lyokone/location/b;->c()V

    return-void
.end method

.method public j()V
    .locals 0

    invoke-direct {p0}, Lcom/lyokone/location/b;->c()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 2

    new-instance v0, Lcom/lyokone/location/c;

    invoke-direct {v0}, Lcom/lyokone/location/c;-><init>()V

    iput-object v0, p0, Lcom/lyokone/location/b;->j:Lcom/lyokone/location/c;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/lyokone/location/c;->k(Lr8/c;)V

    new-instance v0, Lcom/lyokone/location/d;

    invoke-direct {v0}, Lcom/lyokone/location/d;-><init>()V

    iput-object v0, p0, Lcom/lyokone/location/b;->k:Lcom/lyokone/location/d;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/lyokone/location/d;->d(Lr8/c;)V

    return-void
.end method
