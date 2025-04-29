.class Lio/flutter/plugins/googlemaps/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/v;


# instance fields
.field private final a:Lw4/o;

.field private final b:Ljava/lang/String;

.field private final c:F

.field private d:Z


# direct methods
.method constructor <init>(Lw4/o;ZF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    iput p3, p0, Lio/flutter/plugins/googlemaps/u;->c:F

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/u;->d:Z

    invoke-virtual {p1}, Lw4/o;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/u;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0, p1}, Lw4/o;->k(F)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/u;->d:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0, p1}, Lw4/o;->c(Z)V

    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0, p1}, Lw4/o;->h(I)V

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0, p1}, Lw4/o;->e(Z)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0, p1}, Lw4/o;->d(I)V

    return-void
.end method

.method public f(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    iget v1, p0, Lio/flutter/plugins/googlemaps/u;->c:F

    mul-float p1, p1, v1

    invoke-virtual {v0, p1}, Lw4/o;->i(F)V

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0, p1}, Lw4/o;->g(Ljava/util/List;)V

    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0, p1}, Lw4/o;->f(Ljava/util/List;)V

    return-void
.end method

.method i()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/u;->d:Z

    return v0
.end method

.method j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->b:Ljava/lang/String;

    return-object v0
.end method

.method k()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0}, Lw4/o;->b()V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/u;->a:Lw4/o;

    invoke-virtual {v0, p1}, Lw4/o;->j(Z)V

    return-void
.end method
