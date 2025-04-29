.class Lio/flutter/plugins/googlemaps/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/c;


# instance fields
.field private final a:Lw4/e;

.field private final b:Ljava/lang/String;

.field private final c:F

.field private d:Z


# direct methods
.method constructor <init>(Lw4/e;ZF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/b;->d:Z

    iput p3, p0, Lio/flutter/plugins/googlemaps/b;->c:F

    invoke-virtual {p1}, Lw4/e;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    invoke-virtual {v0, p1}, Lw4/e;->j(F)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/b;->d:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    invoke-virtual {v0, p1}, Lw4/e;->d(Z)V

    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    invoke-virtual {v0, p1}, Lw4/e;->g(I)V

    return-void
.end method

.method d()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/b;->d:Z

    return v0
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    invoke-virtual {v0, p1}, Lw4/e;->e(I)V

    return-void
.end method

.method public f(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    iget v1, p0, Lio/flutter/plugins/googlemaps/b;->c:F

    mul-float p1, p1, v1

    invoke-virtual {v0, p1}, Lw4/e;->h(F)V

    return-void
.end method

.method public g(D)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    invoke-virtual {v0, p1, p2}, Lw4/e;->f(D)V

    return-void
.end method

.method public h(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    invoke-virtual {v0, p1}, Lw4/e;->c(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method j()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    invoke-virtual {v0}, Lw4/e;->b()V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/b;->a:Lw4/e;

    invoke-virtual {v0, p1}, Lw4/e;->i(Z)V

    return-void
.end method
