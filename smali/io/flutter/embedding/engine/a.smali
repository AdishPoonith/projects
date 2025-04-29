.class public Lio/flutter/embedding/engine/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/a$b;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/embedding/engine/FlutterJNI;

.field private final b:Lp8/a;

.field private final c:Le8/a;

.field private final d:Lio/flutter/embedding/engine/c;

.field private final e:Ls8/a;

.field private final f:Lq8/a;

.field private final g:Lq8/b;

.field private final h:Lq8/e;

.field private final i:Lq8/f;

.field private final j:Lq8/g;

.field private final k:Lq8/h;

.field private final l:Lq8/l;

.field private final m:Lq8/i;

.field private final n:Lq8/m;

.field private final o:Lq8/n;

.field private final p:Lq8/o;

.field private final q:Lq8/p;

.field private final r:Lio/flutter/plugin/platform/q;

.field private final s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/flutter/embedding/engine/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Lio/flutter/embedding/engine/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg8/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Lg8/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZLio/flutter/embedding/engine/d;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg8/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZLio/flutter/embedding/engine/d;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    new-instance v0, Lio/flutter/embedding/engine/a$a;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/a$a;-><init>(Lio/flutter/embedding/engine/a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    :goto_0
    invoke-static {}, Ld8/a;->e()Ld8/a;

    move-result-object v1

    if-nez p3, :cond_0

    invoke-virtual {v1}, Ld8/a;->d()Lio/flutter/embedding/engine/FlutterJNI$c;

    move-result-object p3

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI$c;->a()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    new-instance v2, Le8/a;

    invoke-direct {v2, p3, v0}, Le8/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V

    iput-object v2, p0, Lio/flutter/embedding/engine/a;->c:Le8/a;

    invoke-virtual {v2}, Le8/a;->n()V

    invoke-static {}, Ld8/a;->e()Ld8/a;

    move-result-object v0

    invoke-virtual {v0}, Ld8/a;->a()Lf8/a;

    move-result-object v0

    new-instance v3, Lq8/a;

    invoke-direct {v3, v2, p3}, Lq8/a;-><init>(Le8/a;Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->f:Lq8/a;

    new-instance v3, Lq8/b;

    invoke-direct {v3, v2}, Lq8/b;-><init>(Le8/a;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->g:Lq8/b;

    new-instance v4, Lq8/e;

    invoke-direct {v4, v2}, Lq8/e;-><init>(Le8/a;)V

    iput-object v4, p0, Lio/flutter/embedding/engine/a;->h:Lq8/e;

    new-instance v4, Lq8/f;

    invoke-direct {v4, v2}, Lq8/f;-><init>(Le8/a;)V

    iput-object v4, p0, Lio/flutter/embedding/engine/a;->i:Lq8/f;

    new-instance v5, Lq8/g;

    invoke-direct {v5, v2}, Lq8/g;-><init>(Le8/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->j:Lq8/g;

    new-instance v5, Lq8/h;

    invoke-direct {v5, v2}, Lq8/h;-><init>(Le8/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->k:Lq8/h;

    new-instance v5, Lq8/i;

    invoke-direct {v5, v2}, Lq8/i;-><init>(Le8/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->m:Lq8/i;

    new-instance v5, Lq8/l;

    invoke-direct {v5, v2, p7}, Lq8/l;-><init>(Le8/a;Z)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->l:Lq8/l;

    new-instance p7, Lq8/m;

    invoke-direct {p7, v2}, Lq8/m;-><init>(Le8/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->n:Lq8/m;

    new-instance p7, Lq8/n;

    invoke-direct {p7, v2}, Lq8/n;-><init>(Le8/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->o:Lq8/n;

    new-instance p7, Lq8/o;

    invoke-direct {p7, v2}, Lq8/o;-><init>(Le8/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->p:Lq8/o;

    new-instance p7, Lq8/p;

    invoke-direct {p7, v2}, Lq8/p;-><init>(Le8/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->q:Lq8/p;

    if-eqz v0, :cond_1

    invoke-interface {v0, v3}, Lf8/a;->e(Lq8/b;)V

    :cond_1
    new-instance p7, Ls8/a;

    invoke-direct {p7, p1, v4}, Ls8/a;-><init>(Landroid/content/Context;Lq8/f;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->e:Ls8/a;

    if-nez p2, :cond_2

    invoke-virtual {v1}, Ld8/a;->c()Lg8/d;

    move-result-object p2

    :cond_2
    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lg8/d;->m(Landroid/content/Context;)V

    invoke-virtual {p2, p1, p5}, Lg8/d;->e(Landroid/content/Context;[Ljava/lang/String;)V

    :cond_3
    iget-object p5, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    invoke-virtual {p3, p4}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/q;)V

    invoke-virtual {p3, p7}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(Ls8/a;)V

    invoke-virtual {v1}, Ld8/a;->a()Lf8/a;

    move-result-object p5

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lf8/a;)V

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p5

    if-nez p5, :cond_4

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->e()V

    :cond_4
    new-instance p5, Lp8/a;

    invoke-direct {p5, p3}, Lp8/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p5, p0, Lio/flutter/embedding/engine/a;->b:Lp8/a;

    iput-object p4, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/q;

    invoke-virtual {p4}, Lio/flutter/plugin/platform/q;->V()V

    new-instance p3, Lio/flutter/embedding/engine/c;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p4, p0, p2, p8}, Lio/flutter/embedding/engine/c;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/a;Lg8/d;Lio/flutter/embedding/engine/d;)V

    iput-object p3, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p7, p1}, Ls8/a;->d(Landroid/content/res/Configuration;)V

    if-eqz p6, :cond_5

    invoke-virtual {p2}, Lg8/d;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {p0}, Lo8/a;->a(Lio/flutter/embedding/engine/a;)V

    :cond_5
    return-void
.end method

.method static synthetic a(Lio/flutter/embedding/engine/a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic b(Lio/flutter/embedding/engine/a;)Lio/flutter/plugin/platform/q;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/q;

    return-object p0
.end method

.method static synthetic c(Lio/flutter/embedding/engine/a;)Lq8/l;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->l:Lq8/l;

    return-object p0
.end method

.method private e()V
    .locals 2

    const-string v0, "FlutterEngine"

    const-string v1, "Attaching to JNI."

    invoke-static {v0, v1}, Ld8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "FlutterEngine failed to attach to its native Object reference."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private w()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public d(Lio/flutter/embedding/engine/a$b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f()V
    .locals 2

    const-string v0, "FlutterEngine"

    const-string v1, "Destroying."

    invoke-static {v0, v1}, Ld8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/a$b;

    invoke-interface {v1}, Lio/flutter/embedding/engine/a$b;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/c;->k()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/q;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/q;->X()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Le8/a;

    invoke-virtual {v0}, Le8/a;->o()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v1, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lf8/a;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    invoke-static {}, Ld8/a;->e()Ld8/a;

    move-result-object v0

    invoke-virtual {v0}, Ld8/a;->a()Lf8/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Ld8/a;->e()Ld8/a;

    move-result-object v0

    invoke-virtual {v0}, Ld8/a;->a()Lf8/a;

    move-result-object v0

    invoke-interface {v0}, Lf8/a;->d()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->g:Lq8/b;

    invoke-virtual {v0, v1}, Lq8/b;->c(Lf8/a;)V

    :cond_1
    return-void
.end method

.method public g()Lq8/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->f:Lq8/a;

    return-object v0
.end method

.method public h()Lj8/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    return-object v0
.end method

.method public i()Le8/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Le8/a;

    return-object v0
.end method

.method public j()Lq8/e;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->h:Lq8/e;

    return-object v0
.end method

.method public k()Ls8/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->e:Ls8/a;

    return-object v0
.end method

.method public l()Lq8/g;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->j:Lq8/g;

    return-object v0
.end method

.method public m()Lq8/h;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->k:Lq8/h;

    return-object v0
.end method

.method public n()Lq8/i;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->m:Lq8/i;

    return-object v0
.end method

.method public o()Lio/flutter/plugin/platform/q;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/q;

    return-object v0
.end method

.method public p()Li8/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    return-object v0
.end method

.method public q()Lp8/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->b:Lp8/a;

    return-object v0
.end method

.method public r()Lq8/l;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->l:Lq8/l;

    return-object v0
.end method

.method public s()Lq8/m;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->n:Lq8/m;

    return-object v0
.end method

.method public t()Lq8/n;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->o:Lq8/n;

    return-object v0
.end method

.method public u()Lq8/o;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->p:Lq8/o;

    return-object v0
.end method

.method public v()Lq8/p;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->q:Lq8/p;

    return-object v0
.end method

.method x(Landroid/content/Context;Le8/a$b;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugin/platform/q;ZZ)Lio/flutter/embedding/engine/a;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le8/a$b;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugin/platform/q;",
            "ZZ)",
            "Lio/flutter/embedding/engine/a;"
        }
    .end annotation

    move-object v0, p2

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, p0

    iget-object v2, v1, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v3, v0, Le8/a$b;->c:Ljava/lang/String;

    iget-object v0, v0, Le8/a$b;->b:Ljava/lang/String;

    move-object v4, p3

    move-object/from16 v5, p4

    invoke-virtual {v2, v3, v0, p3, v5}, Lio/flutter/embedding/engine/FlutterJNI;->spawn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v7

    new-instance v0, Lio/flutter/embedding/engine/a;

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p1

    move-object/from16 v8, p5

    move/from16 v10, p6

    move/from16 v11, p7

    invoke-direct/range {v4 .. v11}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Lg8/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V

    return-object v0

    :cond_0
    move-object v1, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Spawn can only be called on a fully constructed FlutterEngine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
