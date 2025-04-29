.class Lio/flutter/plugins/googlemaps/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/r;


# instance fields
.field private final a:Lw4/l;

.field private final b:Ljava/lang/String;

.field private c:Z


# direct methods
.method constructor <init>(Lw4/l;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/q;->c:Z

    invoke-virtual {p1}, Lw4/l;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/q;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->q(F)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/q;->c:Z

    return-void
.end method

.method public c(Lw4/a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->j(Lw4/a;)V

    return-void
.end method

.method public d(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->f(F)V

    return-void
.end method

.method public e(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->h(Z)V

    return-void
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->i(Z)V

    return-void
.end method

.method public g(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1, p2}, Lw4/l;->k(FF)V

    return-void
.end method

.method public h(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->m(F)V

    return-void
.end method

.method public i(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1, p2}, Lw4/l;->g(FF)V

    return-void
.end method

.method public j(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->l(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->o(Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {p1, p2}, Lw4/l;->n(Ljava/lang/String;)V

    return-void
.end method

.method l()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/q;->c:Z

    return v0
.end method

.method m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->b:Ljava/lang/String;

    return-object v0
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0}, Lw4/l;->c()V

    return-void
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0}, Lw4/l;->d()Z

    move-result v0

    return v0
.end method

.method p()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0}, Lw4/l;->e()V

    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0}, Lw4/l;->r()V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/q;->a:Lw4/l;

    invoke-virtual {v0, p1}, Lw4/l;->p(Z)V

    return-void
.end method
