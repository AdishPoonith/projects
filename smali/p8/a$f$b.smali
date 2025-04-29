.class Lp8/a$f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/a$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lp8/a$f;


# direct methods
.method constructor <init>(Lp8/a$f;)V
    .locals 0

    iput-object p1, p0, Lp8/a$f$b;->j:Lp8/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 3

    iget-object p1, p0, Lp8/a$f$b;->j:Lp8/a$f;

    invoke-static {p1}, Lp8/a$f;->g(Lp8/a$f;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lp8/a$f$b;->j:Lp8/a$f;

    iget-object p1, p1, Lp8/a$f;->h:Lp8/a;

    invoke-static {p1}, Lp8/a;->c(Lp8/a;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp8/a$f$b;->j:Lp8/a$f;

    iget-object v0, p1, Lp8/a$f;->h:Lp8/a;

    invoke-static {p1}, Lp8/a$f;->h(Lp8/a$f;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lp8/a;->d(Lp8/a;J)V

    :cond_1
    :goto_0
    return-void
.end method
