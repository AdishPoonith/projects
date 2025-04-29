.class public final Ld8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld8/a$b;
    }
.end annotation


# static fields
.field private static e:Ld8/a;

.field private static f:Z


# instance fields
.field private a:Lg8/d;

.field private b:Lf8/a;

.field private c:Lio/flutter/embedding/engine/FlutterJNI$c;

.field private d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>(Lg8/d;Lf8/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8/a;->a:Lg8/d;

    iput-object p2, p0, Ld8/a;->b:Lf8/a;

    iput-object p3, p0, Ld8/a;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    iput-object p4, p0, Ld8/a;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method synthetic constructor <init>(Lg8/d;Lf8/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;Ld8/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ld8/a;-><init>(Lg8/d;Lf8/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public static e()Ld8/a;
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Ld8/a;->f:Z

    sget-object v0, Ld8/a;->e:Ld8/a;

    if-nez v0, :cond_0

    new-instance v0, Ld8/a$b;

    invoke-direct {v0}, Ld8/a$b;-><init>()V

    invoke-virtual {v0}, Ld8/a$b;->a()Ld8/a;

    move-result-object v0

    sput-object v0, Ld8/a;->e:Ld8/a;

    :cond_0
    sget-object v0, Ld8/a;->e:Ld8/a;

    return-object v0
.end method


# virtual methods
.method public a()Lf8/a;
    .locals 1

    iget-object v0, p0, Ld8/a;->b:Lf8/a;

    return-object v0
.end method

.method public b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Ld8/a;->d:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public c()Lg8/d;
    .locals 1

    iget-object v0, p0, Ld8/a;->a:Lg8/d;

    return-object v0
.end method

.method public d()Lio/flutter/embedding/engine/FlutterJNI$c;
    .locals 1

    iget-object v0, p0, Ld8/a;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    return-object v0
.end method
