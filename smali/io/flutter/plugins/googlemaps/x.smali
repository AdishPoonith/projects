.class Lio/flutter/plugins/googlemaps/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/z;


# instance fields
.field private final a:Lw4/r;

.field private b:Z

.field private final c:F


# direct methods
.method constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw4/r;

    invoke-direct {v0}, Lw4/r;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    iput p1, p0, Lio/flutter/plugins/googlemaps/x;->c:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->W(F)Lw4/r;

    return-void
.end method

.method public b(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/x;->b:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->C(Z)Lw4/r;

    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw4/n;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->S(Ljava/util/List;)Lw4/r;

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->F(Z)Lw4/r;

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->R(I)Lw4/r;

    return-void
.end method

.method public f(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    iget v1, p0, Lio/flutter/plugins/googlemaps/x;->c:F

    mul-float p1, p1, v1

    invoke-virtual {v0, p1}, Lw4/r;->V(F)Lw4/r;

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->B(Ljava/lang/Iterable;)Lw4/r;

    return-void
.end method

.method public h(Lw4/d;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->E(Lw4/d;)Lw4/r;

    return-void
.end method

.method public i(Lw4/d;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->T(Lw4/d;)Lw4/r;

    return-void
.end method

.method public j(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->D(I)Lw4/r;

    return-void
.end method

.method k()Lw4/r;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    return-object v0
.end method

.method l()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/x;->b:Z

    return v0
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/x;->a:Lw4/r;

    invoke-virtual {v0, p1}, Lw4/r;->U(Z)Lw4/r;

    return-void
.end method
