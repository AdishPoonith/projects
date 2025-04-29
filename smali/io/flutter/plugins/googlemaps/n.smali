.class public Lio/flutter/plugins/googlemaps/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;
.implements Lj8/a;


# instance fields
.field j:Landroidx/lifecycle/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Li8/a$b;)V
    .locals 0

    return-void
.end method

.method public e(Lj8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlemaps/n;->f(Lj8/c;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 0

    invoke-static {p1}, Lm8/a;->a(Lj8/c;)Landroidx/lifecycle/e;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/n;->j:Landroidx/lifecycle/e;

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/n;->j:Landroidx/lifecycle/e;

    return-void
.end method

.method public j()V
    .locals 0

    invoke-virtual {p0}, Lio/flutter/plugins/googlemaps/n;->g()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 4

    invoke-virtual {p1}, Li8/a$b;->c()Lio/flutter/plugin/platform/h;

    move-result-object v0

    new-instance v1, Lio/flutter/plugins/googlemaps/j;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object v2

    invoke-virtual {p1}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    new-instance v3, Lio/flutter/plugins/googlemaps/n$a;

    invoke-direct {v3, p0}, Lio/flutter/plugins/googlemaps/n$a;-><init>(Lio/flutter/plugins/googlemaps/n;)V

    invoke-direct {v1, v2, p1, v3}, Lio/flutter/plugins/googlemaps/j;-><init>(Lr8/c;Landroid/content/Context;Lio/flutter/plugins/googlemaps/o;)V

    const-string p1, "plugins.flutter.dev/google_maps_android"

    invoke-interface {v0, p1, v1}, Lio/flutter/plugin/platform/h;->a(Ljava/lang/String;Lio/flutter/plugin/platform/g;)Z

    return-void
.end method
