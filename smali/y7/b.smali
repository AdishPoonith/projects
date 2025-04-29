.class public final Ly7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;
.implements Lr8/k$c;
.implements Lj8/a;
.implements Lr8/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/b$a;
    }
.end annotation


# static fields
.field public static final r:Ly7/b$a;


# instance fields
.field private j:Lr8/k;

.field private k:Lr8/d;

.field private l:Lr8/d$b;

.field private m:Lj8/c;

.field private n:Ljava/lang/String;

.field private o:Lz7/a;

.field private p:Lr8/c;

.field private q:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ly7/b;->r:Ly7/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Ly7/b;->n:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a(Ly7/b;Lr8/d$b;)V
    .locals 0

    iput-object p1, p0, Ly7/b;->l:Lr8/d$b;

    return-void
.end method

.method private final i(Lr8/c;)V
    .locals 2

    iput-object p1, p0, Ly7/b;->p:Lr8/c;

    new-instance v0, Lz7/a;

    invoke-direct {v0, p0}, Lz7/a;-><init>(Ly7/b;)V

    iput-object v0, p0, Ly7/b;->o:Lz7/a;

    new-instance v0, Lr8/k;

    const-string v1, "twitter_login"

    invoke-direct {v0, p1, v1}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object v0, p0, Ly7/b;->j:Lr8/k;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Lr8/k;->e(Lr8/k$c;)V

    new-instance v0, Lr8/d;

    const-string v1, "twitter_login/event"

    invoke-direct {v0, p1, v1}, Lr8/d;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object v0, p0, Ly7/b;->k:Lr8/d;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    new-instance p1, Ly7/b$b;

    invoke-direct {p1, p0}, Ly7/b$b;-><init>(Ly7/b;)V

    invoke-virtual {v0, p1}, Lr8/d;->d(Lr8/d$d;)V

    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    const-string v1, "setScheme"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lr8/j;->b:Ljava/lang/Object;

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Ly7/b;->n:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lr8/k$d;->c()V

    :goto_0
    return-void
.end method

.method public final b()Lr8/c;
    .locals 1

    iget-object v0, p0, Ly7/b;->p:Lr8/c;

    return-object v0
.end method

.method public c(Landroid/content/Intent;)Z
    .locals 7

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7/b;->n:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ly7/b;->l:Lr8/d$b;

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    const/4 v4, 0x2

    new-array v4, v4, [Ls9/m;

    const-string v5, "type"

    const-string v6, "url"

    invoke-static {v5, v6}, Ls9/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Ls9/m;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-static {v6, v2}, Ls9/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Ls9/m;

    move-result-object p1

    aput-object p1, v4, v3

    invoke-static {v4}, Lt9/d0;->f([Ls9/m;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Lr8/d$b;->a(Ljava/lang/Object;)V

    :cond_2
    return v3

    :cond_3
    return v1
.end method

.method public d(Li8/a$b;)V
    .locals 1

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ly7/b;->o:Lz7/a;

    invoke-static {p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lz7/a;->a()V

    const/4 p1, 0x0

    iput-object p1, p0, Ly7/b;->o:Lz7/a;

    iget-object v0, p0, Ly7/b;->j:Lr8/k;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lr8/k;->e(Lr8/k$c;)V

    iput-object p1, p0, Ly7/b;->j:Lr8/k;

    iget-object v0, p0, Ly7/b;->k:Lr8/d;

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lr8/d;->d(Lr8/d$d;)V

    iput-object p1, p0, Ly7/b;->k:Lr8/d;

    return-void
.end method

.method public e(Lj8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly7/b;->m:Lj8/c;

    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Ly7/b;->q:Landroid/app/Activity;

    invoke-interface {p1, p0}, Lj8/c;->f(Lr8/n;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly7/b;->m:Lj8/c;

    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Ly7/b;->q:Landroid/app/Activity;

    invoke-interface {p1, p0}, Lj8/c;->f(Lr8/n;)V

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Ly7/b;->m:Lj8/c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lj8/c;->h(Lr8/n;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ly7/b;->m:Lj8/c;

    iput-object v0, p0, Ly7/b;->q:Landroid/app/Activity;

    return-void
.end method

.method public final h()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Ly7/b;->q:Landroid/app/Activity;

    return-object v0
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Ly7/b;->m:Lj8/c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lj8/c;->h(Lr8/n;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ly7/b;->m:Lj8/c;

    iput-object v0, p0, Ly7/b;->q:Landroid/app/Activity;

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 1

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    const-string v0, "getBinaryMessenger(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ly7/b;->i(Lr8/c;)V

    return-void
.end method
