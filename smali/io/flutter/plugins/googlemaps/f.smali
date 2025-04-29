.class Lio/flutter/plugins/googlemaps/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/m;


# instance fields
.field private final j:Lcom/google/android/gms/maps/GoogleMapOptions;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Ljava/lang/Object;

.field private r:Ljava/lang/Object;

.field private s:Ljava/lang/Object;

.field private t:Ljava/lang/Object;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;>;"
        }
    .end annotation
.end field

.field private v:Landroid/graphics/Rect;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/GoogleMapOptions;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/f;->k:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/f;->l:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/f;->m:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/f;->n:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/f;->o:Z

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/f;->p:Z

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, v0, v0, v0, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, p0, Lio/flutter/plugins/googlemaps/f;->v:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public B(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->T(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public C(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->l:Z

    return-void
.end method

.method public D(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->V(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public F(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->U(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public G(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->o:Z

    return-void
.end method

.method public J(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->R(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public K(FFFF)V
    .locals 1

    new-instance v0, Landroid/graphics/Rect;

    float-to-int p2, p2

    float-to-int p1, p1

    float-to-int p4, p4

    float-to-int p3, p3

    invoke-direct {v0, p2, p1, p4, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/f;->v:Landroid/graphics/Rect;

    return-void
.end method

.method public L(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->k:Z

    return-void
.end method

.method public M(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->M(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public N(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->L(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public S(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->Q(F)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/maps/GoogleMapOptions;->P(F)Lcom/google/android/gms/maps/GoogleMapOptions;

    :cond_1
    return-void
.end method

.method a(ILandroid/content/Context;Lr8/c;Lio/flutter/plugins/googlemaps/o;)Lio/flutter/plugins/googlemaps/GoogleMapController;
    .locals 7

    new-instance v6, Lio/flutter/plugins/googlemaps/GoogleMapController;

    iget-object v5, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    move-object v0, v6

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lio/flutter/plugins/googlemaps/GoogleMapController;-><init>(ILandroid/content/Context;Lr8/c;Lio/flutter/plugins/googlemaps/o;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    invoke-virtual {v6}, Lio/flutter/plugins/googlemaps/GoogleMapController;->e0()V

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->l:Z

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->C(Z)V

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->m:Z

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->m(Z)V

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->n:Z

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->k(Z)V

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->o:Z

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->G(Z)V

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->p:Z

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->f(Z)V

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->k:Z

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->L(Z)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/f;->q:Ljava/lang/Object;

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->n0(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/f;->r:Ljava/lang/Object;

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->p0(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/f;->s:Ljava/lang/Object;

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->q0(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/f;->t:Ljava/lang/Object;

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/f;->v:Landroid/graphics/Rect;

    iget p2, p1, Landroid/graphics/Rect;->top:I

    int-to-float p2, p2

    iget p3, p1, Landroid/graphics/Rect;->left:I

    int-to-float p3, p3

    iget p4, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p4, p4

    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    invoke-virtual {v6, p2, p3, p4, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->K(FFFF)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/f;->u:Ljava/util/List;

    invoke-virtual {v6, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->r0(Ljava/util/List;)V

    return-object v6
.end method

.method b(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->B(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/f;->t:Ljava/lang/Object;

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/f;->q:Ljava/lang/Object;

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->O(I)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->p:Z

    return-void
.end method

.method public g(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/f;->r:Ljava/lang/Object;

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/f;->s:Ljava/lang/Object;

    return-void
.end method

.method public i(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/f;->u:Ljava/util/List;

    return-void
.end method

.method public k(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->n:Z

    return-void
.end method

.method public m(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/f;->m:Z

    return-void
.end method

.method public n(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->C(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public o(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->N(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public u(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/f;->j:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->S(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method
