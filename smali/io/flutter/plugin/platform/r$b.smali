.class Lio/flutter/plugin/platform/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/platform/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final j:Landroid/view/View;

.field k:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/r$b;->j:Landroid/view/View;

    iput-object p2, p0, Lio/flutter/plugin/platform/r$b;->k:Ljava/lang/Runnable;

    return-void
.end method

.method static a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1

    new-instance v0, Lio/flutter/plugin/platform/r$b;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugin/platform/r$b;-><init>(Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    return-void
.end method


# virtual methods
.method public onDraw()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/r$b;->k:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/platform/r$b;->k:Ljava/lang/Runnable;

    iget-object v0, p0, Lio/flutter/plugin/platform/r$b;->j:Landroid/view/View;

    new-instance v1, Lio/flutter/plugin/platform/r$b$a;

    invoke-direct {v1, p0}, Lio/flutter/plugin/platform/r$b$a;-><init>(Lio/flutter/plugin/platform/r$b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
