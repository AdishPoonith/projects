.class Lio/flutter/plugins/googlemaps/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/c;


# instance fields
.field private final a:Lw4/f;

.field private final b:F

.field private c:Z


# direct methods
.method constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw4/f;

    invoke-direct {v0}, Lw4/f;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    iput p1, p0, Lio/flutter/plugins/googlemaps/a;->b:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    invoke-virtual {v0, p1}, Lw4/f;->R(F)Lw4/f;

    return-void
.end method

.method public b(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/a;->c:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    invoke-virtual {v0, p1}, Lw4/f;->C(Z)Lw4/f;

    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    invoke-virtual {v0, p1}, Lw4/f;->O(I)Lw4/f;

    return-void
.end method

.method d()Lw4/f;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    return-object v0
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    invoke-virtual {v0, p1}, Lw4/f;->D(I)Lw4/f;

    return-void
.end method

.method public f(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    iget v1, p0, Lio/flutter/plugins/googlemaps/a;->b:F

    mul-float p1, p1, v1

    invoke-virtual {v0, p1}, Lw4/f;->P(F)Lw4/f;

    return-void
.end method

.method public g(D)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    invoke-virtual {v0, p1, p2}, Lw4/f;->N(D)Lw4/f;

    return-void
.end method

.method public h(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    invoke-virtual {v0, p1}, Lw4/f;->B(Lcom/google/android/gms/maps/model/LatLng;)Lw4/f;

    return-void
.end method

.method i()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/a;->c:Z

    return v0
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/a;->a:Lw4/f;

    invoke-virtual {v0, p1}, Lw4/f;->Q(Z)Lw4/f;

    return-void
.end method
