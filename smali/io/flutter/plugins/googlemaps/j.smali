.class public Lio/flutter/plugins/googlemaps/j;
.super Lio/flutter/plugin/platform/g;
.source "SourceFile"


# instance fields
.field private final b:Lr8/c;

.field private final c:Lio/flutter/plugins/googlemaps/o;

.field private final d:Lio/flutter/plugins/googlemaps/k;


# direct methods
.method constructor <init>(Lr8/c;Landroid/content/Context;Lio/flutter/plugins/googlemaps/o;)V
    .locals 1

    sget-object v0, Lr8/r;->a:Lr8/r;

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/g;-><init>(Lr8/i;)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/j;->b:Lr8/c;

    iput-object p3, p0, Lio/flutter/plugins/googlemaps/j;->c:Lio/flutter/plugins/googlemaps/o;

    new-instance p3, Lio/flutter/plugins/googlemaps/k;

    invoke-direct {p3, p2, p1}, Lio/flutter/plugins/googlemaps/k;-><init>(Landroid/content/Context;Lr8/c;)V

    iput-object p3, p0, Lio/flutter/plugins/googlemaps/j;->d:Lio/flutter/plugins/googlemaps/k;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/f;
    .locals 3

    check-cast p3, Ljava/util/Map;

    new-instance v0, Lio/flutter/plugins/googlemaps/f;

    invoke-direct {v0}, Lio/flutter/plugins/googlemaps/f;-><init>()V

    const-string v1, "options"

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Lio/flutter/plugins/googlemaps/e;->e(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/m;)V

    const-string v1, "initialCameraPosition"

    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lio/flutter/plugins/googlemaps/e;->v(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/f;->b(Lcom/google/android/gms/maps/model/CameraPosition;)V

    :cond_0
    const-string v1, "markersToAdd"

    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/f;->d(Ljava/lang/Object;)V

    :cond_1
    const-string v1, "polygonsToAdd"

    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/f;->g(Ljava/lang/Object;)V

    :cond_2
    const-string v1, "polylinesToAdd"

    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/f;->h(Ljava/lang/Object;)V

    :cond_3
    const-string v1, "circlesToAdd"

    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/f;->c(Ljava/lang/Object;)V

    :cond_4
    const-string v1, "tileOverlaysToAdd"

    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-virtual {v0, p3}, Lio/flutter/plugins/googlemaps/f;->i(Ljava/util/List;)V

    :cond_5
    iget-object p3, p0, Lio/flutter/plugins/googlemaps/j;->b:Lr8/c;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/j;->c:Lio/flutter/plugins/googlemaps/o;

    invoke-virtual {v0, p2, p1, p3, v1}, Lio/flutter/plugins/googlemaps/f;->a(ILandroid/content/Context;Lr8/c;Lio/flutter/plugins/googlemaps/o;)Lio/flutter/plugins/googlemaps/GoogleMapController;

    move-result-object p1

    return-object p1
.end method
