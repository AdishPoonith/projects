.class Lio/flutter/plugin/platform/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/k$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/platform/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/plugin/platform/q;


# direct methods
.method constructor <init>(Lio/flutter/plugin/platform/q;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugin/platform/q$a;Lq8/k$d;Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugin/platform/q$a;->s(Lq8/k$d;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic k(Lio/flutter/plugin/platform/q$a;Lq8/k$d;Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugin/platform/q$a;->t(Lq8/k$d;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugin/platform/q$a;Lio/flutter/plugin/platform/r;FLq8/k$b;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugin/platform/q$a;->u(Lio/flutter/plugin/platform/r;FLq8/k$b;)V

    return-void
.end method

.method private m(Lio/flutter/plugin/platform/f;Lq8/k$d;)V
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Using hybrid composition for platform view: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p2, Lq8/k$d;->a:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "PlatformViewsController"

    invoke-static {p2, p1}, Ld8/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private n(Lio/flutter/plugin/platform/f;Lq8/k$d;)J
    .locals 10

    const/16 v0, 0x17

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/q$a;->q(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Hosting view in view hierarchy for platform view: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p2, Lq8/k$d;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PlatformViewsController"

    invoke-static {v1, v0}, Ld8/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-wide v1, p2, Lq8/k$d;->c:D

    invoke-static {v0, v1, v2}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-wide v2, p2, Lq8/k$d;->d:D

    invoke-static {v1, v2, v3}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result v1

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->v(Lio/flutter/plugin/platform/q;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lio/flutter/plugin/platform/j;

    iget-object v3, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v3}, Lio/flutter/plugin/platform/q;->j(Lio/flutter/plugin/platform/q;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/flutter/plugin/platform/j;-><init>(Landroid/content/Context;)V

    const-wide/16 v3, -0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->h(Lio/flutter/plugin/platform/q;)Lio/flutter/view/e;

    move-result-object v2

    invoke-interface {v2}, Lio/flutter/view/e;->a()Lio/flutter/view/e$c;

    move-result-object v2

    new-instance v3, Lio/flutter/plugin/platform/j;

    iget-object v4, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v4}, Lio/flutter/plugin/platform/q;->j(Lio/flutter/plugin/platform/q;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lio/flutter/plugin/platform/j;-><init>(Landroid/content/Context;Lio/flutter/view/e$c;)V

    invoke-interface {v2}, Lio/flutter/view/e$c;->e()J

    move-result-wide v4

    move-object v2, v3

    move-wide v3, v4

    :goto_0
    iget-object v5, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v5}, Lio/flutter/plugin/platform/q;->n(Lio/flutter/plugin/platform/q;)Lio/flutter/embedding/android/a;

    move-result-object v5

    invoke-virtual {v2, v5}, Lio/flutter/plugin/platform/j;->m(Lio/flutter/embedding/android/a;)V

    invoke-virtual {v2, v0, v1}, Lio/flutter/plugin/platform/j;->i(II)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iget-object v6, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-wide v7, p2, Lq8/k$d;->e:D

    invoke-static {v6, v7, v8}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result v6

    iget-object v7, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-wide v8, p2, Lq8/k$d;->f:D

    invoke-static {v7, v8, v9}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result v7

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput v7, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v2, v5}, Lio/flutter/plugin/platform/j;->j(Landroid/widget/FrameLayout$LayoutParams;)V

    invoke-interface {p1}, Lio/flutter/plugin/platform/f;->w()Landroid/view/View;

    move-result-object p1

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance p1, Lio/flutter/plugin/platform/n;

    invoke-direct {p1, p0, p2}, Lio/flutter/plugin/platform/n;-><init>(Lio/flutter/plugin/platform/q$a;Lq8/k$d;)V

    invoke-virtual {v2, p1}, Lio/flutter/plugin/platform/j;->k(Landroid/view/View$OnFocusChangeListener;)V

    iget-object p1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {p1}, Lio/flutter/plugin/platform/q;->s(Lio/flutter/plugin/platform/q;)Lio/flutter/embedding/android/k;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {p1}, Lio/flutter/plugin/platform/q;->g(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object p1

    iget p2, p2, Lq8/k$d;->a:I

    invoke-virtual {p1, p2, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-wide v3
.end method

.method private o(Lio/flutter/plugin/platform/f;Lq8/k$d;)J
    .locals 10

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/q$a;->q(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Hosting view in a virtual display for platform view: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p2, Lq8/k$d;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PlatformViewsController"

    invoke-static {v1, v0}, Ld8/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->h(Lio/flutter/plugin/platform/q;)Lio/flutter/view/e;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/view/e;->a()Lio/flutter/view/e$c;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-wide v2, p2, Lq8/k$d;->c:D

    invoke-static {v1, v2, v3}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result v5

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-wide v2, p2, Lq8/k$d;->d:D

    invoke-static {v1, v2, v3}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result v6

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v1}, Lio/flutter/plugin/platform/q;->j(Lio/flutter/plugin/platform/q;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->m(Lio/flutter/plugin/platform/q;)Lio/flutter/plugin/platform/a;

    move-result-object v2

    iget v7, p2, Lq8/k$d;->a:I

    new-instance v9, Lio/flutter/plugin/platform/o;

    invoke-direct {v9, p0, p2}, Lio/flutter/plugin/platform/o;-><init>(Lio/flutter/plugin/platform/q$a;Lq8/k$d;)V

    const/4 v8, 0x0

    move-object v3, p1

    move-object v4, v0

    invoke-static/range {v1 .. v9}, Lio/flutter/plugin/platform/r;->a(Landroid/content/Context;Lio/flutter/plugin/platform/a;Lio/flutter/plugin/platform/f;Lio/flutter/view/e$c;IIILjava/lang/Object;Landroid/view/View$OnFocusChangeListener;)Lio/flutter/plugin/platform/r;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->s(Lio/flutter/plugin/platform/q;)Lio/flutter/embedding/android/k;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->s(Lio/flutter/plugin/platform/q;)Lio/flutter/embedding/android/k;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugin/platform/r;->f(Landroid/view/View;)V

    :cond_0
    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object v2, v2, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    iget p2, p2, Lq8/k$d;->a:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v2, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lio/flutter/plugin/platform/f;->w()Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object p2, p2, Lio/flutter/plugin/platform/q;->j:Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lio/flutter/view/e$c;->e()J

    move-result-wide p1

    return-wide p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed creating virtual display for a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p2, Lq8/k$d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " with id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p2, Lq8/k$d;->a:I

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private p(Lq8/k$d;Z)Lio/flutter/plugin/platform/f;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->l(Lio/flutter/plugin/platform/q;)Lio/flutter/plugin/platform/i;

    move-result-object v0

    iget-object v1, p1, Lq8/k$d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/i;->b(Ljava/lang/String;)Lio/flutter/plugin/platform/g;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    iget-object v2, p1, Lq8/k$d;->i:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugin/platform/g;->b()Lr8/i;

    move-result-object v1

    iget-object v2, p1, Lq8/k$d;->i:Ljava/nio/ByteBuffer;

    invoke-interface {v1, v2}, Lr8/i;->b(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    :cond_0
    if-eqz p2, :cond_1

    new-instance p2, Landroid/content/MutableContextWrapper;

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->j(Lio/flutter/plugin/platform/q;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {p2, v2}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {p2}, Lio/flutter/plugin/platform/q;->j(Lio/flutter/plugin/platform/q;)Landroid/content/Context;

    move-result-object p2

    :goto_0
    iget v2, p1, Lq8/k$d;->a:I

    invoke-virtual {v0, p2, v2, v1}, Lio/flutter/plugin/platform/g;->a(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/f;

    move-result-object p2

    invoke-interface {p2}, Lio/flutter/plugin/platform/f;->w()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    iget v1, p1, Lq8/k$d;->g:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->w(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    iget p1, p1, Lq8/k$d;->a:I

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "PlatformView#getView() returned null, but an Android view reference was expected."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trying to create a platform view of unregistered type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lq8/k$d;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private q(I)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to use platform views with API "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", required API level is: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private r(Lq8/k$d;)V
    .locals 3

    iget v0, p1, Lq8/k$d;->g:I

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to create a view with unknown direction value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Lq8/k$d;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "(view id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lq8/k$d;->a:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private synthetic s(Lq8/k$d;Landroid/view/View;Z)V
    .locals 0

    iget-object p2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    if-eqz p3, :cond_0

    invoke-static {p2}, Lio/flutter/plugin/platform/q;->p(Lio/flutter/plugin/platform/q;)Lq8/k;

    move-result-object p2

    iget p1, p1, Lq8/k$d;->a:I

    invoke-virtual {p2, p1}, Lq8/k;->d(I)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lio/flutter/plugin/platform/q;->q(Lio/flutter/plugin/platform/q;)Lio/flutter/plugin/editing/f;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {p2}, Lio/flutter/plugin/platform/q;->q(Lio/flutter/plugin/platform/q;)Lio/flutter/plugin/editing/f;

    move-result-object p2

    iget p1, p1, Lq8/k$d;->a:I

    invoke-virtual {p2, p1}, Lio/flutter/plugin/editing/f;->l(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic t(Lq8/k$d;Landroid/view/View;Z)V
    .locals 0

    if-eqz p3, :cond_0

    iget-object p2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {p2}, Lio/flutter/plugin/platform/q;->p(Lio/flutter/plugin/platform/q;)Lq8/k;

    move-result-object p2

    iget p1, p1, Lq8/k$d;->a:I

    invoke-virtual {p2, p1}, Lq8/k;->d(I)V

    :cond_0
    return-void
.end method

.method private synthetic u(Lio/flutter/plugin/platform/r;FLq8/k$b;)V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0, p1}, Lio/flutter/plugin/platform/q;->r(Lio/flutter/plugin/platform/q;Lio/flutter/plugin/platform/r;)V

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->j(Lio/flutter/plugin/platform/q;)Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {p2}, Lio/flutter/plugin/platform/q;->z(Lio/flutter/plugin/platform/q;)F

    move-result p2

    :goto_0
    new-instance v0, Lq8/k$c;

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {p1}, Lio/flutter/plugin/platform/r;->d()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v1, v2, v3, p2}, Lio/flutter/plugin/platform/q;->t(Lio/flutter/plugin/platform/q;DF)I

    move-result v1

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {p1}, Lio/flutter/plugin/platform/r;->c()I

    move-result p1

    int-to-double v3, p1

    invoke-static {v2, v3, v4, p2}, Lio/flutter/plugin/platform/q;->t(Lio/flutter/plugin/platform/q;DF)I

    move-result p1

    invoke-direct {v0, v1, p1}, Lq8/k$c;-><init>(II)V

    invoke-interface {p3, v0}, Lq8/k$b;->a(Lq8/k$c;)V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0, p1}, Lio/flutter/plugin/platform/q;->o(Lio/flutter/plugin/platform/q;Z)Z

    return-void
.end method

.method public b(IDD)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->g(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/j;

    if-nez v0, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Setting offset for unknown platform view with id: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "PlatformViewsController"

    invoke-static {p2, p1}, Ld8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {p1, p2, p3}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result p1

    iget-object p2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {p2, p4, p5}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result p2

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroid/widget/FrameLayout$LayoutParams;

    iput p1, p3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v0, p3}, Lio/flutter/plugin/platform/j;->j(Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method public c(II)V
    .locals 3

    invoke-static {p2}, Lio/flutter/plugin/platform/q;->k(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->b(I)Z

    move-result v0

    const-string v1, "PlatformViewsController"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object v0, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/r;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/r;->e()Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->w(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/f;

    if-nez v0, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setting direction to an unknown view with id: "

    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ld8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface {v0}, Lio/flutter/plugin/platform/f;->w()Landroid/view/View;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setting direction to a null view with id: "

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to set unknown direction value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "(view id: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lq8/k$d;)J
    .locals 5

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/q$a;->r(Lq8/k$d;)V

    iget v0, p1, Lq8/k$d;->a:I

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v1}, Lio/flutter/plugin/platform/q;->g(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v1}, Lio/flutter/plugin/platform/q;->h(Lio/flutter/plugin/platform/q;)Lio/flutter/view/e;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v1}, Lio/flutter/plugin/platform/q;->s(Lio/flutter/plugin/platform/q;)Lio/flutter/embedding/android/k;

    move-result-object v1

    if-eqz v1, :cond_4

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lio/flutter/plugin/platform/q$a;->p(Lq8/k$d;Z)Lio/flutter/plugin/platform/f;

    move-result-object v1

    invoke-interface {v1}, Lio/flutter/plugin/platform/f;->w()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_3

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_0

    invoke-static {}, Lio/flutter/plugin/platform/q;->u()[Ljava/lang/Class;

    move-result-object v3

    invoke-static {v2, v3}, Lf9/h;->f(Landroid/view/View;[Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p1, Lq8/k$d;->h:Lq8/k$d$a;

    sget-object v2, Lq8/k$d$a;->k:Lq8/k$d$a;

    if-ne v0, v2, :cond_1

    invoke-direct {p0, v1, p1}, Lio/flutter/plugin/platform/q$a;->m(Lio/flutter/plugin/platform/f;Lq8/k$d;)V

    const-wide/16 v0, -0x2

    return-wide v0

    :cond_1
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->v(Lio/flutter/plugin/platform/q;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, v1, p1}, Lio/flutter/plugin/platform/q$a;->o(Lio/flutter/plugin/platform/f;Lq8/k$d;)J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-direct {p0, v1, p1}, Lio/flutter/plugin/platform/q$a;->n(Lio/flutter/plugin/platform/f;Lq8/k$d;)J

    move-result-wide v0

    return-wide v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The Android view returned from PlatformView#getView() was already added to a parent view."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Flutter view is null. This means the platform views controller doesn\'t have an attached view, view id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Texture registry is null. This means that platform views controller was detached, view id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to create an already created platform view, view id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lq8/k$f;)V
    .locals 4

    iget v0, p1, Lq8/k$f;->a:I

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v1}, Lio/flutter/plugin/platform/q;->j(Lio/flutter/plugin/platform/q;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/q;->b(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object v2, v2, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/r;

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, p1, v3}, Lio/flutter/plugin/platform/q;->k0(FLq8/k$f;Z)Landroid/view/MotionEvent;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/r;->b(Landroid/view/MotionEvent;)V

    return-void

    :cond_0
    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->w(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugin/platform/f;

    const-string v3, "PlatformViewsController"

    if-nez v2, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending touch to an unknown view with id: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Ld8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface {v2}, Lio/flutter/plugin/platform/f;->w()Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending touch to a null view with id: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Ld8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, p1, v3}, Lio/flutter/plugin/platform/q;->k0(FLq8/k$f;Z)Landroid/view/MotionEvent;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public f(Lq8/k$e;Lq8/k$b;)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-wide v1, p1, Lq8/k$e;->b:D

    invoke-static {v0, v1, v2}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-wide v2, p1, Lq8/k$e;->c:D

    invoke-static {v1, v2, v3}, Lio/flutter/plugin/platform/q;->y(Lio/flutter/plugin/platform/q;D)I

    move-result v1

    iget p1, p1, Lq8/k$e;->a:I

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {v2, p1}, Lio/flutter/plugin/platform/q;->b(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->z(Lio/flutter/plugin/platform/q;)F

    move-result v2

    iget-object v3, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object v3, v3, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugin/platform/r;

    iget-object v3, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v3, p1}, Lio/flutter/plugin/platform/q;->A(Lio/flutter/plugin/platform/q;Lio/flutter/plugin/platform/r;)V

    new-instance v3, Lio/flutter/plugin/platform/p;

    invoke-direct {v3, p0, p1, v2, p2}, Lio/flutter/plugin/platform/p;-><init>(Lio/flutter/plugin/platform/q$a;Lio/flutter/plugin/platform/r;FLq8/k$b;)V

    invoke-virtual {p1, v0, v1, v3}, Lio/flutter/plugin/platform/r;->i(IILjava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->w(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugin/platform/f;

    iget-object v3, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v3}, Lio/flutter/plugin/platform/q;->g(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/plugin/platform/j;

    if-eqz v2, :cond_5

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lio/flutter/plugin/platform/j;->e()I

    move-result p1

    if-gt v0, p1, :cond_2

    invoke-virtual {v3}, Lio/flutter/plugin/platform/j;->d()I

    move-result p1

    if-le v1, p1, :cond_3

    :cond_2
    invoke-virtual {v3, v0, v1}, Lio/flutter/plugin/platform/j;->i(II)V

    :cond_3
    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v3, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-interface {v2}, Lio/flutter/plugin/platform/f;->w()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    new-instance p1, Lq8/k$c;

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {v3}, Lio/flutter/plugin/platform/j;->e()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v0, v1, v2}, Lio/flutter/plugin/platform/q;->i(Lio/flutter/plugin/platform/q;D)I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {v3}, Lio/flutter/plugin/platform/j;->d()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v1, v2, v3}, Lio/flutter/plugin/platform/q;->i(Lio/flutter/plugin/platform/q;D)I

    move-result v1

    invoke-direct {p1, v0, v1}, Lq8/k$c;-><init>(II)V

    invoke-interface {p2, p1}, Lq8/k$b;->a(Lq8/k$c;)V

    return-void

    :cond_5
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Resizing unknown platform view with id: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "PlatformViewsController"

    invoke-static {p2, p1}, Ld8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public g(I)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->b(I)Z

    move-result v0

    const-string v1, "PlatformViewsController"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object v0, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/r;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/r;->e()Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->w(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/f;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Clearing focus on an unknown view with id: "

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ld8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface {v0}, Lio/flutter/plugin/platform/f;->w()Landroid/view/View;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Clearing focus on a null view with id: "

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    return-void
.end method

.method public h(Lq8/k$d;)V
    .locals 1

    const/16 v0, 0x13

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/q$a;->q(I)V

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/q$a;->r(Lq8/k$d;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/flutter/plugin/platform/q$a;->p(Lq8/k$d;Z)Lio/flutter/plugin/platform/f;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lio/flutter/plugin/platform/q$a;->m(Lio/flutter/plugin/platform/f;Lq8/k$d;)V

    return-void
.end method

.method public i(I)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->w(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/f;

    const-string v1, "PlatformViewsController"

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Disposing unknown platform view with id: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ld8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v2}, Lio/flutter/plugin/platform/q;->w(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->remove(I)V

    :try_start_0
    invoke-interface {v0}, Lio/flutter/plugin/platform/f;->b()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Disposing platform view threw an exception"

    invoke-static {v1, v2, v0}, Ld8/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object v0, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/r;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/r;->e()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object v1, v1, Lio/flutter/plugin/platform/q;->j:Ljava/util/HashMap;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    iget-object v0, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->g(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/j;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    invoke-virtual {v0}, Lio/flutter/plugin/platform/j;->h()V

    invoke-virtual {v0}, Lio/flutter/plugin/platform/j;->o()V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->g(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void

    :cond_4
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->x(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/a;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    invoke-virtual {v0}, Lh8/a;->b()V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_5

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_5
    iget-object v0, p0, Lio/flutter/plugin/platform/q$a;->a:Lio/flutter/plugin/platform/q;

    invoke-static {v0}, Lio/flutter/plugin/platform/q;->x(Lio/flutter/plugin/platform/q;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    :cond_6
    return-void
.end method
