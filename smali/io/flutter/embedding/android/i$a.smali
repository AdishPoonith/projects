.class Lio/flutter/embedding/android/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lio/flutter/embedding/android/i;


# direct methods
.method constructor <init>(Lio/flutter/embedding/android/i;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    const-string p1, "FlutterTextureView"

    const-string p2, "SurfaceTextureListener.onSurfaceTextureAvailable()"

    invoke-static {p1, p2}, Ld8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lio/flutter/embedding/android/i;->a(Lio/flutter/embedding/android/i;Z)Z

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-static {p1}, Lio/flutter/embedding/android/i;->b(Lio/flutter/embedding/android/i;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-static {p1}, Lio/flutter/embedding/android/i;->c(Lio/flutter/embedding/android/i;)V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    const-string p1, "FlutterTextureView"

    const-string v0, "SurfaceTextureListener.onSurfaceTextureDestroyed()"

    invoke-static {p1, v0}, Ld8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/flutter/embedding/android/i;->a(Lio/flutter/embedding/android/i;Z)Z

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-static {p1}, Lio/flutter/embedding/android/i;->b(Lio/flutter/embedding/android/i;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-static {p1}, Lio/flutter/embedding/android/i;->h(Lio/flutter/embedding/android/i;)V

    :cond_0
    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-static {p1}, Lio/flutter/embedding/android/i;->i(Lio/flutter/embedding/android/i;)Landroid/view/Surface;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-static {p1}, Lio/flutter/embedding/android/i;->i(Lio/flutter/embedding/android/i;)Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/flutter/embedding/android/i;->j(Lio/flutter/embedding/android/i;Landroid/view/Surface;)Landroid/view/Surface;

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    const-string p1, "FlutterTextureView"

    const-string v0, "SurfaceTextureListener.onSurfaceTextureSizeChanged()"

    invoke-static {p1, v0}, Ld8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-static {p1}, Lio/flutter/embedding/android/i;->b(Lio/flutter/embedding/android/i;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/embedding/android/i$a;->j:Lio/flutter/embedding/android/i;

    invoke-static {p1, p2, p3}, Lio/flutter/embedding/android/i;->g(Lio/flutter/embedding/android/i;II)V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method
