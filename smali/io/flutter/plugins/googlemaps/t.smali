.class Lio/flutter/plugins/googlemaps/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/v;


# instance fields
.field private final a:Lw4/p;

.field private final b:F

.field private c:Z


# direct methods
.method constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw4/p;

    invoke-direct {v0}, Lw4/p;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    iput p1, p0, Lio/flutter/plugins/googlemaps/t;->b:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    invoke-virtual {v0, p1}, Lw4/p;->T(F)Lw4/p;

    return-void
.end method

.method public b(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/t;->c:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    invoke-virtual {v0, p1}, Lw4/p;->D(Z)Lw4/p;

    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    invoke-virtual {v0, p1}, Lw4/p;->Q(I)Lw4/p;

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    invoke-virtual {v0, p1}, Lw4/p;->F(Z)Lw4/p;

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    invoke-virtual {v0, p1}, Lw4/p;->E(I)Lw4/p;

    return-void
.end method

.method public f(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    iget v1, p0, Lio/flutter/plugins/googlemaps/t;->b:F

    mul-float p1, p1, v1

    invoke-virtual {v0, p1}, Lw4/p;->R(F)Lw4/p;

    return-void
.end method

.method public g(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    invoke-virtual {v0, p1}, Lw4/p;->B(Ljava/lang/Iterable;)Lw4/p;

    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    invoke-virtual {v1, v0}, Lw4/p;->C(Ljava/lang/Iterable;)Lw4/p;

    goto :goto_0

    :cond_0
    return-void
.end method

.method i()Lw4/p;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    return-object v0
.end method

.method j()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/t;->c:Z

    return v0
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/t;->a:Lw4/p;

    invoke-virtual {v0, p1}, Lw4/p;->S(Z)Lw4/p;

    return-void
.end method
