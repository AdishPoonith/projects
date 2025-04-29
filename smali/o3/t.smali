.class public final Lo3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo3/t$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo3/p0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lo3/l;

.field private d:Lo3/l;

.field private e:Lo3/l;

.field private f:Lo3/l;

.field private g:Lo3/l;

.field private h:Lo3/l;

.field private i:Lo3/l;

.field private j:Lo3/l;

.field private k:Lo3/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lo3/t;->a:Landroid/content/Context;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo3/l;

    iput-object p1, p0, Lo3/t;->c:Lo3/l;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lo3/t;->b:Ljava/util/List;

    return-void
.end method

.method private q(Lo3/l;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo3/t;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo3/t;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo3/p0;

    invoke-interface {p1, v1}, Lo3/l;->h(Lo3/p0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private r()Lo3/l;
    .locals 2

    iget-object v0, p0, Lo3/t;->e:Lo3/l;

    if-nez v0, :cond_0

    new-instance v0, Lo3/c;

    iget-object v1, p0, Lo3/t;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo3/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo3/t;->e:Lo3/l;

    invoke-direct {p0, v0}, Lo3/t;->q(Lo3/l;)V

    :cond_0
    iget-object v0, p0, Lo3/t;->e:Lo3/l;

    return-object v0
.end method

.method private s()Lo3/l;
    .locals 2

    iget-object v0, p0, Lo3/t;->f:Lo3/l;

    if-nez v0, :cond_0

    new-instance v0, Lo3/h;

    iget-object v1, p0, Lo3/t;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo3/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo3/t;->f:Lo3/l;

    invoke-direct {p0, v0}, Lo3/t;->q(Lo3/l;)V

    :cond_0
    iget-object v0, p0, Lo3/t;->f:Lo3/l;

    return-object v0
.end method

.method private t()Lo3/l;
    .locals 1

    iget-object v0, p0, Lo3/t;->i:Lo3/l;

    if-nez v0, :cond_0

    new-instance v0, Lo3/j;

    invoke-direct {v0}, Lo3/j;-><init>()V

    iput-object v0, p0, Lo3/t;->i:Lo3/l;

    invoke-direct {p0, v0}, Lo3/t;->q(Lo3/l;)V

    :cond_0
    iget-object v0, p0, Lo3/t;->i:Lo3/l;

    return-object v0
.end method

.method private u()Lo3/l;
    .locals 1

    iget-object v0, p0, Lo3/t;->d:Lo3/l;

    if-nez v0, :cond_0

    new-instance v0, Lo3/y;

    invoke-direct {v0}, Lo3/y;-><init>()V

    iput-object v0, p0, Lo3/t;->d:Lo3/l;

    invoke-direct {p0, v0}, Lo3/t;->q(Lo3/l;)V

    :cond_0
    iget-object v0, p0, Lo3/t;->d:Lo3/l;

    return-object v0
.end method

.method private v()Lo3/l;
    .locals 2

    iget-object v0, p0, Lo3/t;->j:Lo3/l;

    if-nez v0, :cond_0

    new-instance v0, Lo3/k0;

    iget-object v1, p0, Lo3/t;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo3/k0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo3/t;->j:Lo3/l;

    invoke-direct {p0, v0}, Lo3/t;->q(Lo3/l;)V

    :cond_0
    iget-object v0, p0, Lo3/t;->j:Lo3/l;

    return-object v0
.end method

.method private w()Lo3/l;
    .locals 3

    iget-object v0, p0, Lo3/t;->g:Lo3/l;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo3/l;

    iput-object v0, p0, Lo3/t;->g:Lo3/l;

    invoke-direct {p0, v0}, Lo3/t;->q(Lo3/l;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error instantiating RTMP extension"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    const-string v0, "DefaultDataSource"

    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    invoke-static {v0, v1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lo3/t;->g:Lo3/l;

    if-nez v0, :cond_0

    iget-object v0, p0, Lo3/t;->c:Lo3/l;

    iput-object v0, p0, Lo3/t;->g:Lo3/l;

    :cond_0
    iget-object v0, p0, Lo3/t;->g:Lo3/l;

    return-object v0
.end method

.method private x()Lo3/l;
    .locals 1

    iget-object v0, p0, Lo3/t;->h:Lo3/l;

    if-nez v0, :cond_0

    new-instance v0, Lo3/q0;

    invoke-direct {v0}, Lo3/q0;-><init>()V

    iput-object v0, p0, Lo3/t;->h:Lo3/l;

    invoke-direct {p0, v0}, Lo3/t;->q(Lo3/l;)V

    :cond_0
    iget-object v0, p0, Lo3/t;->h:Lo3/l;

    return-object v0
.end method

.method private y(Lo3/l;Lo3/p0;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lo3/l;->h(Lo3/p0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-object v0, p0, Lo3/t;->k:Lo3/l;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Lo3/l;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lo3/t;->k:Lo3/l;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, Lo3/t;->k:Lo3/l;

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lo3/t;->k:Lo3/l;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lo3/l;->e()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public h(Lo3/p0;)V
    .locals 1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo3/t;->c:Lo3/l;

    invoke-interface {v0, p1}, Lo3/l;->h(Lo3/p0;)V

    iget-object v0, p0, Lo3/t;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo3/t;->d:Lo3/l;

    invoke-direct {p0, v0, p1}, Lo3/t;->y(Lo3/l;Lo3/p0;)V

    iget-object v0, p0, Lo3/t;->e:Lo3/l;

    invoke-direct {p0, v0, p1}, Lo3/t;->y(Lo3/l;Lo3/p0;)V

    iget-object v0, p0, Lo3/t;->f:Lo3/l;

    invoke-direct {p0, v0, p1}, Lo3/t;->y(Lo3/l;Lo3/p0;)V

    iget-object v0, p0, Lo3/t;->g:Lo3/l;

    invoke-direct {p0, v0, p1}, Lo3/t;->y(Lo3/l;Lo3/p0;)V

    iget-object v0, p0, Lo3/t;->h:Lo3/l;

    invoke-direct {p0, v0, p1}, Lo3/t;->y(Lo3/l;Lo3/p0;)V

    iget-object v0, p0, Lo3/t;->i:Lo3/l;

    invoke-direct {p0, v0, p1}, Lo3/t;->y(Lo3/l;Lo3/p0;)V

    iget-object v0, p0, Lo3/t;->j:Lo3/l;

    invoke-direct {p0, v0, p1}, Lo3/t;->y(Lo3/l;Lo3/p0;)V

    return-void
.end method

.method public j()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lo3/t;->k:Lo3/l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lo3/l;->j()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public m(Lo3/p;)J
    .locals 2

    iget-object v0, p0, Lo3/t;->k:Lo3/l;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p1, Lo3/p;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lo3/p;->a:Landroid/net/Uri;

    invoke-static {v1}, Lp3/n0;->v0(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p1, Lo3/p;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "/android_asset/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lo3/t;->u()Lo3/l;

    move-result-object v0

    goto :goto_2

    :cond_2
    const-string v1, "asset"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-direct {p0}, Lo3/t;->r()Lo3/l;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lo3/t;->k:Lo3/l;

    goto :goto_4

    :cond_3
    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lo3/t;->s()Lo3/l;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string v1, "rtmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-direct {p0}, Lo3/t;->w()Lo3/l;

    move-result-object v0

    goto :goto_2

    :cond_5
    const-string v1, "udp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-direct {p0}, Lo3/t;->x()Lo3/l;

    move-result-object v0

    goto :goto_2

    :cond_6
    const-string v1, "data"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-direct {p0}, Lo3/t;->t()Lo3/l;

    move-result-object v0

    goto :goto_2

    :cond_7
    const-string v1, "rawresource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "android.resource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lo3/t;->c:Lo3/l;

    goto :goto_2

    :cond_9
    :goto_3
    invoke-direct {p0}, Lo3/t;->v()Lo3/l;

    move-result-object v0

    goto :goto_2

    :goto_4
    iget-object v0, p0, Lo3/t;->k:Lo3/l;

    invoke-interface {v0, p1}, Lo3/l;->m(Lo3/p;)J

    move-result-wide v0

    return-wide v0
.end method

.method public read([BII)I
    .locals 1

    iget-object v0, p0, Lo3/t;->k:Lo3/l;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo3/l;

    invoke-interface {v0, p1, p2, p3}, Lo3/i;->read([BII)I

    move-result p1

    return p1
.end method
