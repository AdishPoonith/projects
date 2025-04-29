.class Lio/flutter/plugins/googlemaps/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/r;


# instance fields
.field private final a:Lw4/m;

.field private b:Z


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw4/m;

    invoke-direct {v0}, Lw4/m;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->Z(F)Lw4/m;

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/p;->b:Z

    return-void
.end method

.method public c(Lw4/a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->P(Lw4/a;)Lw4/m;

    return-void
.end method

.method public d(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->B(F)Lw4/m;

    return-void
.end method

.method public e(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->D(Z)Lw4/m;

    return-void
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->E(Z)Lw4/m;

    return-void
.end method

.method public g(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1, p2}, Lw4/m;->Q(FF)Lw4/m;

    return-void
.end method

.method public h(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->V(F)Lw4/m;

    return-void
.end method

.method public i(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1, p2}, Lw4/m;->C(FF)Lw4/m;

    return-void
.end method

.method public j(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->U(Lcom/google/android/gms/maps/model/LatLng;)Lw4/m;

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->X(Ljava/lang/String;)Lw4/m;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {p1, p2}, Lw4/m;->W(Ljava/lang/String;)Lw4/m;

    return-void
.end method

.method l()Lw4/m;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    return-object v0
.end method

.method m()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/p;->b:Z

    return v0
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/p;->a:Lw4/m;

    invoke-virtual {v0, p1}, Lw4/m;->Y(Z)Lw4/m;

    return-void
.end method
