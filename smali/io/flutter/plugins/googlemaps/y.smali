.class Lio/flutter/plugins/googlemaps/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/z;


# instance fields
.field private final a:Lw4/q;

.field private final b:Ljava/lang/String;

.field private c:Z

.field private final d:F


# direct methods
.method constructor <init>(Lw4/q;ZF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/y;->c:Z

    iput p3, p0, Lio/flutter/plugins/googlemaps/y;->d:F

    invoke-virtual {p1}, Lw4/q;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/y;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->m(F)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/y;->c:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->c(Z)V

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->h(Ljava/util/List;)V

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->f(Z)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->g(I)V

    return-void
.end method

.method public f(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    iget v1, p0, Lio/flutter/plugins/googlemaps/y;->d:F

    mul-float p1, p1, v1

    invoke-virtual {v0, p1}, Lw4/q;->l(F)V

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->i(Ljava/util/List;)V

    return-void
.end method

.method public h(Lw4/d;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->e(Lw4/d;)V

    return-void
.end method

.method public i(Lw4/d;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->j(Lw4/d;)V

    return-void
.end method

.method public j(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->d(I)V

    return-void
.end method

.method k()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/y;->c:Z

    return v0
.end method

.method l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->b:Ljava/lang/String;

    return-object v0
.end method

.method m()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0}, Lw4/q;->b()V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/y;->a:Lw4/q;

    invoke-virtual {v0, p1}, Lw4/q;->k(Z)V

    return-void
.end method
