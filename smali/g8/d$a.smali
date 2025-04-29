.class Lg8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/d;->n(Landroid/content/Context;Lg8/d$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lg8/d$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lg8/d;


# direct methods
.method constructor <init>(Lg8/d;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lg8/d$a;->b:Lg8/d;

    iput-object p2, p0, Lg8/d$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lg8/d$a;)V
    .locals 0

    invoke-direct {p0}, Lg8/d$a;->c()V

    return-void
.end method

.method private synthetic c()V
    .locals 1

    iget-object v0, p0, Lg8/d$a;->b:Lg8/d;

    invoke-static {v0}, Lg8/d;->b(Lg8/d;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->prefetchDefaultFontManager()V

    return-void
.end method


# virtual methods
.method public b()Lg8/d$b;
    .locals 5

    const-string v0, "FlutterLoader initTask"

    invoke-static {v0}, Lf9/e;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lg8/d$a;->b:Lg8/d;

    iget-object v1, p0, Lg8/d$a;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lg8/d;->a(Lg8/d;Landroid/content/Context;)Lg8/e;

    iget-object v0, p0, Lg8/d$a;->b:Lg8/d;

    invoke-static {v0}, Lg8/d;->b(Lg8/d;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->loadLibrary()V

    iget-object v0, p0, Lg8/d$a;->b:Lg8/d;

    invoke-static {v0}, Lg8/d;->b(Lg8/d;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->updateRefreshRate()V

    iget-object v0, p0, Lg8/d$a;->b:Lg8/d;

    invoke-static {v0}, Lg8/d;->c(Lg8/d;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lg8/c;

    invoke-direct {v1, p0}, Lg8/c;-><init>(Lg8/d$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    new-instance v0, Lg8/d$b;

    iget-object v1, p0, Lg8/d$a;->a:Landroid/content/Context;

    invoke-static {v1}, Lf9/b;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lg8/d$a;->a:Landroid/content/Context;

    invoke-static {v2}, Lf9/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lg8/d$a;->a:Landroid/content/Context;

    invoke-static {v3}, Lf9/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lg8/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lg8/d$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lf9/e;->d()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {}, Lf9/e;->d()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg8/d$a;->b()Lg8/d$b;

    move-result-object v0

    return-object v0
.end method
