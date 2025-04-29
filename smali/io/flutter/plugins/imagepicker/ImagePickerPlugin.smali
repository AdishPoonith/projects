.class public Lio/flutter/plugins/imagepicker/ImagePickerPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;
.implements Lj8/a;
.implements Lio/flutter/plugins/imagepicker/o$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;,
        Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;
    }
.end annotation


# instance fields
.field private j:Li8/a$b;

.field k:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private i()Lio/flutter/plugins/imagepicker/k;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->k:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->a()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->k:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->b()Lio/flutter/plugins/imagepicker/k;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private k(Lio/flutter/plugins/imagepicker/k;Lio/flutter/plugins/imagepicker/o$j;)V
    .locals 1

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/o$j;->b()Lio/flutter/plugins/imagepicker/o$i;

    move-result-object p2

    if-eqz p2, :cond_1

    sget-object v0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    sget-object p2, Lio/flutter/plugins/imagepicker/k$c;->j:Lio/flutter/plugins/imagepicker/k$c;

    goto :goto_0

    :cond_0
    sget-object p2, Lio/flutter/plugins/imagepicker/k$c;->k:Lio/flutter/plugins/imagepicker/k$c;

    :goto_0
    invoke-virtual {p1, p2}, Lio/flutter/plugins/imagepicker/k;->P(Lio/flutter/plugins/imagepicker/k$c;)V

    :cond_1
    return-void
.end method

.method private l(Lr8/c;Landroid/app/Application;Landroid/app/Activity;Lr8/o;Lj8/c;)V
    .locals 9

    new-instance v8, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p1

    move-object v5, p0

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;Landroid/app/Application;Landroid/app/Activity;Lr8/c;Lio/flutter/plugins/imagepicker/o$e;Lr8/o;Lj8/c;)V

    iput-object v8, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->k:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    return-void
.end method

.method private n()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->k:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->k:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lio/flutter/plugins/imagepicker/o$j;Lio/flutter/plugins/imagepicker/o$g;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/flutter/plugins/imagepicker/o$h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/o$j;",
            "Lio/flutter/plugins/imagepicker/o$g;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lio/flutter/plugins/imagepicker/o$h<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->i()Lio/flutter/plugins/imagepicker/k;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Lio/flutter/plugins/imagepicker/o$d;

    const/4 p2, 0x0

    const-string p3, "no_activity"

    const-string p4, "image_picker plugin requires a foreground activity."

    invoke-direct {p1, p3, p4, p2}, Lio/flutter/plugins/imagepicker/o$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p5, p1}, Lio/flutter/plugins/imagepicker/o$h;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->k(Lio/flutter/plugins/imagepicker/k;Lio/flutter/plugins/imagepicker/o$j;)V

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p2, p1, p5}, Lio/flutter/plugins/imagepicker/k;->i(Lio/flutter/plugins/imagepicker/o$g;ZLio/flutter/plugins/imagepicker/o$h;)V

    goto :goto_0

    :cond_1
    sget-object p3, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->b:[I

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/o$j;->c()Lio/flutter/plugins/imagepicker/o$k;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x1

    if-eq p1, p3, :cond_3

    const/4 p3, 0x2

    if-eq p1, p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p2, p5}, Lio/flutter/plugins/imagepicker/k;->R(Lio/flutter/plugins/imagepicker/o$g;Lio/flutter/plugins/imagepicker/o$h;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p2, p1, p5}, Lio/flutter/plugins/imagepicker/k;->h(Lio/flutter/plugins/imagepicker/o$g;ZLio/flutter/plugins/imagepicker/o$h;)V

    :goto_0
    return-void
.end method

.method public b()Lio/flutter/plugins/imagepicker/o$b;
    .locals 4

    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->i()Lio/flutter/plugins/imagepicker/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/k;->N()Lio/flutter/plugins/imagepicker/o$b;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lio/flutter/plugins/imagepicker/o$d;

    const/4 v1, 0x0

    const-string v2, "no_activity"

    const-string v3, "image_picker plugin requires a foreground activity."

    invoke-direct {v0, v2, v3, v1}, Lio/flutter/plugins/imagepicker/o$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
.end method

.method public c(Lio/flutter/plugins/imagepicker/o$j;Lio/flutter/plugins/imagepicker/o$l;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/flutter/plugins/imagepicker/o$h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/o$j;",
            "Lio/flutter/plugins/imagepicker/o$l;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lio/flutter/plugins/imagepicker/o$h<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->i()Lio/flutter/plugins/imagepicker/k;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Lio/flutter/plugins/imagepicker/o$d;

    const/4 p2, 0x0

    const-string p3, "no_activity"

    const-string p4, "image_picker plugin requires a foreground activity."

    invoke-direct {p1, p3, p4, p2}, Lio/flutter/plugins/imagepicker/o$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p5, p1}, Lio/flutter/plugins/imagepicker/o$h;->b(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->k(Lio/flutter/plugins/imagepicker/k;Lio/flutter/plugins/imagepicker/o$j;)V

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Multi-video selection is not implemented"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-interface {p5, p1}, Lio/flutter/plugins/imagepicker/o$h;->b(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    sget-object p3, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->b:[I

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/o$j;->c()Lio/flutter/plugins/imagepicker/o$k;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x1

    if-eq p1, p3, :cond_3

    const/4 p3, 0x2

    if-eq p1, p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p2, p5}, Lio/flutter/plugins/imagepicker/k;->S(Lio/flutter/plugins/imagepicker/o$l;Lio/flutter/plugins/imagepicker/o$h;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p2, p1, p5}, Lio/flutter/plugins/imagepicker/k;->j(Lio/flutter/plugins/imagepicker/o$l;ZLio/flutter/plugins/imagepicker/o$h;)V

    :goto_0
    return-void
.end method

.method public d(Li8/a$b;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->j:Li8/a$b;

    return-void
.end method

.method public e(Lj8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->f(Lj8/c;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 7

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->j:Li8/a$b;

    invoke-virtual {v0}, Li8/a$b;->b()Lr8/c;

    move-result-object v2

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->j:Li8/a$b;

    invoke-virtual {v0}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/app/Application;

    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->l(Lr8/c;Landroid/app/Application;Landroid/app/Activity;Lr8/o;Lj8/c;)V

    return-void
.end method

.method public g()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->n()V

    return-void
.end method

.method final h(Landroid/app/Activity;)Lio/flutter/plugins/imagepicker/k;
    .locals 3

    new-instance v0, Lio/flutter/plugins/imagepicker/c;

    invoke-direct {v0, p1}, Lio/flutter/plugins/imagepicker/c;-><init>(Landroid/content/Context;)V

    new-instance v1, Lio/flutter/plugins/imagepicker/a;

    invoke-direct {v1}, Lio/flutter/plugins/imagepicker/a;-><init>()V

    new-instance v2, Lio/flutter/plugins/imagepicker/n;

    invoke-direct {v2, p1, v1}, Lio/flutter/plugins/imagepicker/n;-><init>(Landroid/content/Context;Lio/flutter/plugins/imagepicker/a;)V

    new-instance v1, Lio/flutter/plugins/imagepicker/k;

    invoke-direct {v1, p1, v2, v0}, Lio/flutter/plugins/imagepicker/k;-><init>(Landroid/app/Activity;Lio/flutter/plugins/imagepicker/n;Lio/flutter/plugins/imagepicker/c;)V

    return-object v1
.end method

.method public j()V
    .locals 0

    invoke-virtual {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->g()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->j:Li8/a$b;

    return-void
.end method
