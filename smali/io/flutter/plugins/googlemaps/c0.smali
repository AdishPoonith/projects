.class Lio/flutter/plugins/googlemaps/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/d0;


# instance fields
.field private final a:Lw4/z;


# direct methods
.method constructor <init>(Lw4/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v0, p1}, Lw4/z;->k(F)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v0, p1}, Lw4/z;->h(Z)V

    return-void
.end method

.method public c(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v0, p1}, Lw4/z;->i(F)V

    return-void
.end method

.method d()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v0}, Lw4/z;->a()V

    return-void
.end method

.method e()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v1}, Lw4/z;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "fadeIn"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v1}, Lw4/z;->d()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "transparency"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v1}, Lw4/z;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v1}, Lw4/z;->e()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "zIndex"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v1}, Lw4/z;->f()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "visible"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method f()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v0}, Lw4/z;->g()V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/c0;->a:Lw4/z;

    invoke-virtual {v0, p1}, Lw4/z;->j(Z)V

    return-void
.end method
