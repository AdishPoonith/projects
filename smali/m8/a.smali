.class public Lm8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lj8/c;)Landroidx/lifecycle/e;
    .locals 0

    invoke-interface {p0}, Lj8/c;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;

    invoke-virtual {p0}, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;->getLifecycle()Landroidx/lifecycle/e;

    move-result-object p0

    return-object p0
.end method
