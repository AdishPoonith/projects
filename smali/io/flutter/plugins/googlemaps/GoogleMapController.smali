.class final Lio/flutter/plugins/googlemaps/GoogleMapController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;
.implements Lj8/c$a;
.implements Lio/flutter/plugins/googlemaps/m;
.implements Lr8/k$c;
.implements Lu4/f;
.implements Lio/flutter/plugins/googlemaps/l;
.implements Lio/flutter/plugin/platform/f;


# instance fields
.field private final A:Lio/flutter/plugins/googlemaps/s;

.field private final B:Lio/flutter/plugins/googlemaps/w;

.field private final C:Lio/flutter/plugins/googlemaps/a0;

.field private final D:Lio/flutter/plugins/googlemaps/d;

.field private final E:Lio/flutter/plugins/googlemaps/e0;

.field private F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;>;"
        }
    .end annotation
.end field

.field K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private L:Z

.field private final j:I

.field private final k:Lr8/k;

.field private final l:Lcom/google/android/gms/maps/GoogleMapOptions;

.field private m:Lu4/d;

.field private n:Lu4/c;

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field final w:F

.field private x:Lr8/k$d;

.field private final y:Landroid/content/Context;

.field private final z:Lio/flutter/plugins/googlemaps/o;


# direct methods
.method constructor <init>(ILandroid/content/Context;Lr8/c;Lio/flutter/plugins/googlemaps/o;Lcom/google/android/gms/maps/GoogleMapOptions;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->o:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->p:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->q:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->r:Z

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->s:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->t:Z

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->u:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->L:Z

    iput p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->j:I

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->y:Landroid/content/Context;

    iput-object p5, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->l:Lcom/google/android/gms/maps/GoogleMapOptions;

    new-instance v0, Lu4/d;

    invoke-direct {v0, p2, p5}, Lu4/d;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->w:F

    new-instance p5, Lr8/k;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "plugins.flutter.dev/google_maps_android_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p5, p3, p1}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object p5, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->k:Lr8/k;

    invoke-virtual {p5, p0}, Lr8/k;->e(Lr8/k$c;)V

    iput-object p4, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->z:Lio/flutter/plugins/googlemaps/o;

    new-instance p1, Lio/flutter/plugins/googlemaps/s;

    invoke-direct {p1, p5}, Lio/flutter/plugins/googlemaps/s;-><init>(Lr8/k;)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    new-instance p1, Lio/flutter/plugins/googlemaps/w;

    invoke-direct {p1, p5, p2}, Lio/flutter/plugins/googlemaps/w;-><init>(Lr8/k;F)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->B:Lio/flutter/plugins/googlemaps/w;

    new-instance p1, Lio/flutter/plugins/googlemaps/a0;

    invoke-direct {p1, p5, p2}, Lio/flutter/plugins/googlemaps/a0;-><init>(Lr8/k;F)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->C:Lio/flutter/plugins/googlemaps/a0;

    new-instance p1, Lio/flutter/plugins/googlemaps/d;

    invoke-direct {p1, p5, p2}, Lio/flutter/plugins/googlemaps/d;-><init>(Lr8/k;F)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->D:Lio/flutter/plugins/googlemaps/d;

    new-instance p1, Lio/flutter/plugins/googlemaps/e0;

    invoke-direct {p1, p5}, Lio/flutter/plugins/googlemaps/e0;-><init>(Lr8/k;)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->E:Lio/flutter/plugins/googlemaps/e0;

    return-void
.end method

.method public static synthetic W(Lio/flutter/plugins/googlemaps/GoogleMapController;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->i0()V

    return-void
.end method

.method public static synthetic X(Lio/flutter/plugins/googlemaps/GoogleMapController;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->g0()V

    return-void
.end method

.method public static synthetic Y(Lio/flutter/plugins/googlemaps/GoogleMapController;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->h0()V

    return-void
.end method

.method private Z(Lu4/a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->f(Lu4/a;)V

    return-void
.end method

.method private a0(Ljava/lang/String;)I
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->y:Landroid/content/Context;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "permission is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private b0()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lu4/d;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    return-void
.end method

.method private c0()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private d0()Z
    .locals 1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->a0(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->a0(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private f0()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->L:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->L:Z

    new-instance v1, Lio/flutter/plugins/googlemaps/i;

    invoke-direct {v1, p0}, Lio/flutter/plugins/googlemaps/i;-><init>(Lio/flutter/plugins/googlemaps/GoogleMapController;)V

    invoke-virtual {v0, v1}, Lu4/c;->D(Lu4/c$g;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic g0()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->invalidate()V

    :cond_0
    return-void
.end method

.method private synthetic h0()V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlemaps/g;

    invoke-direct {v0, p0}, Lio/flutter/plugins/googlemaps/g;-><init>(Lio/flutter/plugins/googlemaps/GoogleMapController;)V

    invoke-static {v0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->k0(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic i0()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->L:Z

    new-instance v0, Lio/flutter/plugins/googlemaps/h;

    invoke-direct {v0, p0}, Lio/flutter/plugins/googlemaps/h;-><init>(Lio/flutter/plugins/googlemaps/GoogleMapController;)V

    invoke-static {v0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->k0(Ljava/lang/Runnable;)V

    return-void
.end method

.method private j0(Lu4/a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->n(Lu4/a;)V

    return-void
.end method

.method private static k0(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    new-instance v1, Lio/flutter/plugins/googlemaps/GoogleMapController$a;

    invoke-direct {v1, p0}, Lio/flutter/plugins/googlemaps/GoogleMapController$a;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method private l0(Lio/flutter/plugins/googlemaps/l;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-nez v0, :cond_0

    const-string p1, "GoogleMapController"

    const-string v0, "Controller was disposed before GoogleMap was ready."

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lu4/c;->z(Lu4/c$c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->y(Lu4/c$b;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->x(Lu4/c$a;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->F(Lu4/c$i;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->G(Lu4/c$j;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->H(Lu4/c$k;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->I(Lu4/c$l;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->A(Lu4/c$d;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->C(Lu4/c$f;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->E(Lu4/c$h;)V

    return-void
.end method

.method private s0()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->D:Lio/flutter/plugins/googlemaps/d;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->I:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/d;->c(Ljava/util/List;)V

    return-void
.end method

.method private t0()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->F:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/s;->c(Ljava/util/List;)V

    return-void
.end method

.method private u0()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->B:Lio/flutter/plugins/googlemaps/w;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->G:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/w;->c(Ljava/util/List;)V

    return-void
.end method

.method private v0()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->C:Lio/flutter/plugins/googlemaps/a0;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->H:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/a0;->c(Ljava/util/List;)V

    return-void
.end method

.method private w0()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->E:Lio/flutter/plugins/googlemaps/e0;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->J:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/e0;->b(Ljava/util/List;)V

    return-void
.end method

.method private x0()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->p:Z

    invoke-virtual {v0, v1}, Lu4/c;->w(Z)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->k()Lu4/i;

    move-result-object v0

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->q:Z

    invoke-virtual {v0, v1}, Lu4/i;->k(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "GoogleMapController"

    const-string v1, "Cannot enable MyLocation layer as location permissions are not granted"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public synthetic A(Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugin/platform/e;->a(Lio/flutter/plugin/platform/f;Landroid/view/View;)V

    return-void
.end method

.method public B(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->k()Lu4/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/i;->n(Z)V

    return-void
.end method

.method public C(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->p:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->p:Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->x0()V

    :cond_1
    return-void
.end method

.method public D(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->k()Lu4/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/i;->p(Z)V

    return-void
.end method

.method public E(Lw4/o;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->B:Lio/flutter/plugins/googlemaps/w;

    invoke-virtual {p1}, Lw4/o;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/w;->g(Ljava/lang/String;)Z

    return-void
.end method

.method public F(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->r:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->r:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lu4/c;->k()Lu4/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/i;->o(Z)V

    :cond_1
    return-void
.end method

.method public G(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->t:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lu4/c;->K(Z)V

    return-void
.end method

.method public synthetic H()V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugin/platform/e;->b(Lio/flutter/plugin/platform/f;)V

    return-void
.end method

.method public I(Lr8/j;Lr8/k$d;)V
    .locals 7

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "camera#move"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x1f

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "markers#showInfoWindow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x1e

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "map#isLiteModeEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x1d

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "circles#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x1c

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "tileOverlays#clearTileCache"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x1b

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "tileOverlays#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x1a

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "map#isTrafficEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x19

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "markers#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x18

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "map#isZoomControlsEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "map#isCompassEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "map#isBuildingsEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "map#setStyle"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "polylines#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "map#getLatLng"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "map#takeSnapshot"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "map#isMapToolbarEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "map#waitForMap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "map#isZoomGesturesEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "map#getMinMaxZoomLevels"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "map#getZoomLevel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "markers#hideInfoWindow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_15
    const-string v1, "map#isMyLocationButtonEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "map#isTiltGesturesEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "polygons#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_18
    const-string v1, "map#getTileOverlayInfo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_0

    :cond_18
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_19
    const-string v1, "markers#isInfoWindowShown"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_0

    :cond_19
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1a
    const-string v1, "camera#animate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_0

    :cond_1a
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_1b
    const-string v1, "map#getScreenCoordinate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_1c
    const-string v1, "map#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1d
    const-string v1, "map#isRotateGesturesEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_1e
    const-string v1, "map#isScrollGesturesEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_1f
    const-string v1, "map#getVisibleRegion"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_0

    :cond_1f
    const/4 v3, 0x0

    :goto_0
    const-string v0, "tileOverlayId"

    const-string v1, "cameraUpdate"

    const-string v4, "markerId"

    const-string v5, "GoogleMap uninitialized"

    const/4 v6, 0x0

    packed-switch v3, :pswitch_data_0

    invoke-interface {p2}, Lr8/k$d;->c()V

    goto/16 :goto_7

    :pswitch_0
    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->w:F

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/e;->w(Ljava/lang/Object;F)Lu4/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->j0(Lu4/a;)V

    :goto_1
    invoke-interface {p2, v6}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    invoke-virtual {p1, v4}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/s;->p(Ljava/lang/String;Lr8/k$d;)V

    goto/16 :goto_7

    :pswitch_2
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->l:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->G()Ljava/lang/Boolean;

    move-result-object p1

    goto/16 :goto_5

    :pswitch_3
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->f0()V

    const-string v0, "circlesToAdd"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->D:Lio/flutter/plugins/googlemaps/d;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/d;->c(Ljava/util/List;)V

    const-string v0, "circlesToChange"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->D:Lio/flutter/plugins/googlemaps/d;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/d;->e(Ljava/util/List;)V

    const-string v0, "circleIdsToRemove"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->D:Lio/flutter/plugins/googlemaps/d;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/d;->h(Ljava/util/List;)V

    goto :goto_1

    :pswitch_4
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->f0()V

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->E:Lio/flutter/plugins/googlemaps/e0;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/e0;->e(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_5
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->f0()V

    const-string v0, "tileOverlaysToAdd"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->E:Lio/flutter/plugins/googlemaps/e0;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/e0;->b(Ljava/util/List;)V

    const-string v0, "tileOverlaysToChange"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->E:Lio/flutter/plugins/googlemaps/e0;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/e0;->d(Ljava/util/List;)V

    const-string v0, "tileOverlayIdsToRemove"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->E:Lio/flutter/plugins/googlemaps/e0;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/e0;->i(Ljava/util/List;)V

    goto :goto_1

    :pswitch_6
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->m()Z

    move-result p1

    goto :goto_2

    :pswitch_7
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->f0()V

    const-string v0, "markersToAdd"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/s;->c(Ljava/util/List;)V

    const-string v0, "markersToChange"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/s;->e(Ljava/util/List;)V

    const-string v0, "markerIdsToRemove"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/s;->n(Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_8
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->k()Lu4/i;

    move-result-object p1

    invoke-virtual {p1}, Lu4/i;->g()Z

    move-result p1

    goto :goto_2

    :pswitch_9
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->k()Lu4/i;

    move-result-object p1

    invoke-virtual {p1}, Lu4/i;->a()Z

    move-result p1

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto/16 :goto_5

    :pswitch_a
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->l()Z

    move-result p1

    goto :goto_2

    :pswitch_b
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->f0()V

    iget-object p1, p1, Lr8/j;->b:Ljava/lang/Object;

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_21

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_20

    goto :goto_3

    :cond_20
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    new-instance v1, Lw4/k;

    invoke-direct {v1, p1}, Lw4/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lu4/c;->s(Lw4/k;)Z

    move-result p1

    goto :goto_4

    :cond_21
    :goto_3
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1, v6}, Lu4/c;->s(Lw4/k;)Z

    move-result p1

    :goto_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_22

    const-string p1, "Unable to set the map style. Please check console logs for errors."

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    invoke-interface {p2, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_c
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->f0()V

    const-string v0, "polylinesToAdd"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->C:Lio/flutter/plugins/googlemaps/a0;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/a0;->c(Ljava/util/List;)V

    const-string v0, "polylinesToChange"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->C:Lio/flutter/plugins/googlemaps/a0;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/a0;->e(Ljava/util/List;)V

    const-string v0, "polylineIdsToRemove"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->C:Lio/flutter/plugins/googlemaps/a0;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/a0;->h(Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_d
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz v0, :cond_23

    iget-object p1, p1, Lr8/j;->b:Ljava/lang/Object;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/e;->L(Ljava/lang/Object;)Landroid/graphics/Point;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->j()Lu4/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/h;->a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/e;->l(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_5

    :cond_23
    const-string p1, "getLatLng called prior to map initialization"

    goto/16 :goto_6

    :pswitch_e
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_24

    new-instance v0, Lio/flutter/plugins/googlemaps/GoogleMapController$b;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/googlemaps/GoogleMapController$b;-><init>(Lio/flutter/plugins/googlemaps/GoogleMapController;Lr8/k$d;)V

    invoke-virtual {p1, v0}, Lu4/c;->L(Lu4/c$m;)V

    goto/16 :goto_7

    :cond_24
    const-string p1, "takeSnapshot"

    goto/16 :goto_6

    :pswitch_f
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->k()Lu4/i;

    move-result-object p1

    invoke-virtual {p1}, Lu4/i;->b()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_10
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_25

    invoke-interface {p2, v6}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_25
    iput-object p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->x:Lr8/k$d;

    goto/16 :goto_7

    :pswitch_11
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->k()Lu4/i;

    move-result-object p1

    invoke-virtual {p1}, Lu4/i;->h()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->h()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    :pswitch_13
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->k:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto/16 :goto_5

    :pswitch_14
    invoke-virtual {p1, v4}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/s;->g(Ljava/lang/String;Lr8/k$d;)V

    goto/16 :goto_7

    :pswitch_15
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->k()Lu4/i;

    move-result-object p1

    invoke-virtual {p1}, Lu4/i;->c()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_16
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->k()Lu4/i;

    move-result-object p1

    invoke-virtual {p1}, Lu4/i;->f()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_17
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->f0()V

    const-string v0, "polygonsToAdd"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->B:Lio/flutter/plugins/googlemaps/w;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/w;->c(Ljava/util/List;)V

    const-string v0, "polygonsToChange"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->B:Lio/flutter/plugins/googlemaps/w;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/w;->e(Ljava/util/List;)V

    const-string v0, "polygonIdsToRemove"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->B:Lio/flutter/plugins/googlemaps/w;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/w;->h(Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_18
    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->E:Lio/flutter/plugins/googlemaps/e0;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/e0;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    goto :goto_5

    :pswitch_19
    invoke-virtual {p1, v4}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/s;->h(Ljava/lang/String;Lr8/k$d;)V

    goto/16 :goto_7

    :pswitch_1a
    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->w:F

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/e;->w(Ljava/lang/Object;F)Lu4/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->Z(Lu4/a;)V

    goto/16 :goto_1

    :pswitch_1b
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz v0, :cond_26

    iget-object p1, p1, Lr8/j;->b:Ljava/lang/Object;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/e;->E(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->j()Lu4/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/h;->c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/e;->o(Landroid/graphics/Point;)Ljava/util/Map;

    move-result-object p1

    goto :goto_5

    :cond_26
    const-string p1, "getScreenCoordinate called prior to map initialization"

    goto :goto_6

    :pswitch_1c
    const-string v0, "options"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p0}, Lio/flutter/plugins/googlemaps/e;->e(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/m;)V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->c0()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/e;->a(Lcom/google/android/gms/maps/model/CameraPosition;)Ljava/lang/Object;

    move-result-object p1

    :goto_5
    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_7

    :pswitch_1d
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->k()Lu4/i;

    move-result-object p1

    invoke-virtual {p1}, Lu4/i;->d()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_1e
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Lu4/c;->k()Lu4/i;

    move-result-object p1

    invoke-virtual {p1}, Lu4/i;->e()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_1f
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_27

    invoke-virtual {p1}, Lu4/c;->j()Lu4/h;

    move-result-object p1

    invoke-virtual {p1}, Lu4/h;->b()Lw4/c0;

    move-result-object p1

    iget-object p1, p1, Lw4/c0;->n:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/e;->m(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_5

    :cond_27
    const-string p1, "getVisibleRegion called prior to map initialization"

    :goto_6
    invoke-interface {p2, v5, p1, v6}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_7
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7b4b4569 -> :sswitch_1f
        -0x68801827 -> :sswitch_1e
        -0x63d6bc75 -> :sswitch_1d
        -0x52ced230 -> :sswitch_1c
        -0x51736f2d -> :sswitch_1b
        -0x4b5fdc7d -> :sswitch_1a
        -0x4ace63a1 -> :sswitch_19
        -0x4ab89a1f -> :sswitch_18
        -0x41b409ed -> :sswitch_17
        -0x238d7a57 -> :sswitch_16
        -0x22657943 -> :sswitch_15
        -0x1e4cec96 -> :sswitch_14
        -0x1aefc77e -> :sswitch_13
        0xf9f8443 -> :sswitch_12
        0x10dca5d3 -> :sswitch_11
        0x11956b2f -> :sswitch_10
        0x174d4211 -> :sswitch_f
        0x19decb32 -> :sswitch_e
        0x25216d95 -> :sswitch_d
        0x26623c99 -> :sswitch_c
        0x2a7eadb6 -> :sswitch_b
        0x39fcc9d3 -> :sswitch_a
        0x41768de0 -> :sswitch_9
        0x45de59e7 -> :sswitch_8
        0x4edb3513 -> :sswitch_7
        0x5c275a95 -> :sswitch_6
        0x5d47629b -> :sswitch_5
        0x65d75179 -> :sswitch_4
        0x6fac67a9 -> :sswitch_3
        0x722e9c9f -> :sswitch_2
        0x746e6365 -> :sswitch_1
        0x776bde6f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public J(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->k()Lu4/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/i;->l(Z)V

    return-void
.end method

.method public K(FFFF)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz v0, :cond_0

    iget v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->w:F

    mul-float p2, p2, v1

    float-to-int p2, p2

    mul-float p1, p1, v1

    float-to-int p1, p1

    mul-float p4, p4, v1

    float-to-int p4, p4

    mul-float p3, p3, v1

    float-to-int p3, p3

    invoke-virtual {v0, p2, p1, p4, p3}, Lu4/c;->J(IIII)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/googlemaps/GoogleMapController;->o0(FFFF)V

    :goto_0
    return-void
.end method

.method public L(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->o:Z

    return-void
.end method

.method public M(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->l:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->M(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public N(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->r(Lcom/google/android/gms/maps/model/LatLngBounds;)V

    return-void
.end method

.method public O(Landroidx/lifecycle/i;)V
    .locals 0

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    invoke-virtual {p1}, Lu4/d;->g()V

    return-void
.end method

.method public P(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/e;->l(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "position"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->k:Lr8/k;

    const-string v1, "map#onLongPress"

    invoke-virtual {p1, v1, v0}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public Q()V
    .locals 0

    return-void
.end method

.method public R(Lw4/l;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {p1}, Lw4/l;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/s;->m(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public S(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->o()V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Lu4/c;->v(F)V

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p1, p2}, Lu4/c;->u(F)V

    :cond_1
    return-void
.end method

.method public T(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/e;->l(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "position"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->k:Lr8/k;

    const-string v1, "map#onTap"

    invoke-virtual {p1, v1, v0}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public U(Lw4/l;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {p1}, Lw4/l;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lw4/l;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemaps/s;->k(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public V()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->k:Lr8/k;

    iget v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->j:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "map"

    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "camera#onIdle"

    invoke-virtual {v0, v2, v1}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    invoke-virtual {v0, p1}, Lu4/d;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->k:Lr8/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr8/k;->e(Lr8/k$c;)V

    invoke-direct {p0, v1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->l0(Lio/flutter/plugins/googlemaps/l;)V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->b0()V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->z:Lio/flutter/plugins/googlemaps/o;

    invoke-interface {v0}, Lio/flutter/plugins/googlemaps/o;->a()Landroidx/lifecycle/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroidx/lifecycle/e;->c(Landroidx/lifecycle/h;)V

    :cond_1
    return-void
.end method

.method public c(Lw4/l;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {p1}, Lw4/l;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/s;->i(Ljava/lang/String;)V

    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    invoke-virtual {v0, p1}, Lu4/d;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0, p1}, Lu4/c;->t(I)V

    return-void
.end method

.method e0()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->z:Lio/flutter/plugins/googlemaps/o;

    invoke-interface {v0}, Lio/flutter/plugins/googlemaps/o;->a()Landroidx/lifecycle/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/e;->a(Landroidx/lifecycle/h;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    invoke-virtual {v0, p0}, Lu4/d;->a(Lu4/f;)V

    return-void
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->u:Z

    return-void
.end method

.method public g(Landroidx/lifecycle/i;)V
    .locals 0

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    invoke-virtual {p1}, Lu4/d;->d()V

    return-void
.end method

.method public h(Lw4/q;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->C:Lio/flutter/plugins/googlemaps/a0;

    invoke-virtual {p1}, Lw4/q;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/a0;->g(Ljava/lang/String;)Z

    return-void
.end method

.method public i(Landroidx/lifecycle/i;)V
    .locals 0

    invoke-interface {p1}, Landroidx/lifecycle/i;->a()Landroidx/lifecycle/e;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/e;->c(Landroidx/lifecycle/h;)V

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->b0()V

    return-void
.end method

.method public j(Landroidx/lifecycle/i;)V
    .locals 1

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lu4/d;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public k(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->s:Z

    return-void
.end method

.method public l(I)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "isGesture"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->k:Lr8/k;

    const-string v1, "camera#onMoveStarted"

    invoke-virtual {p1, v1, v0}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public m(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->q:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->q:Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->x0()V

    :cond_1
    return-void
.end method

.method public m0(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->I:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->s0()V

    :cond_1
    return-void
.end method

.method public n(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->k()Lu4/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/i;->i(Z)V

    return-void
.end method

.method public n0(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->F:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->t0()V

    :cond_1
    return-void
.end method

.method public o(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->k()Lu4/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/i;->j(Z)V

    return-void
.end method

.method o0(FFFF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public p(Lw4/l;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {p1}, Lw4/l;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lw4/l;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemaps/s;->l(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public p0(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->G:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->u0()V

    :cond_1
    return-void
.end method

.method public q0(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->H:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->v0()V

    :cond_1
    return-void
.end method

.method public r(Landroidx/lifecycle/i;)V
    .locals 0

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    invoke-virtual {p1}, Lu4/d;->d()V

    return-void
.end method

.method public r0(Ljava/util/List;)V
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

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->J:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->w0()V

    :cond_0
    return-void
.end method

.method public s(Landroidx/lifecycle/i;)V
    .locals 0

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->v:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    invoke-virtual {p1}, Lu4/d;->f()V

    return-void
.end method

.method public t(Lw4/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->D:Lio/flutter/plugins/googlemaps/d;

    invoke-virtual {p1}, Lw4/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/d;->g(Ljava/lang/String;)Z

    return-void
.end method

.method public u(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v0}, Lu4/c;->k()Lu4/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu4/i;->m(Z)V

    return-void
.end method

.method public v(Lu4/c;)V
    .locals 4

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->s:Z

    invoke-virtual {p1, v0}, Lu4/c;->q(Z)Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->t:Z

    invoke-virtual {v0, v1}, Lu4/c;->K(Z)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->u:Z

    invoke-virtual {v0, v1}, Lu4/c;->p(Z)V

    invoke-virtual {p1, p0}, Lu4/c;->B(Lu4/c$e;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->x:Lr8/k$d;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->x:Lr8/k$d;

    :cond_0
    invoke-direct {p0, p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->l0(Lio/flutter/plugins/googlemaps/l;)V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->x0()V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/s;->o(Lu4/c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->B:Lio/flutter/plugins/googlemaps/w;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/w;->i(Lu4/c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->C:Lio/flutter/plugins/googlemaps/a0;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/a0;->i(Lu4/c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->D:Lio/flutter/plugins/googlemaps/d;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/d;->i(Lu4/c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->E:Lio/flutter/plugins/googlemaps/e0;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/e0;->j(Lu4/c;)V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->t0()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->u0()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->v0()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->s0()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->w0()V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->K:Ljava/util/List;

    const/4 v3, 0x3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lio/flutter/plugins/googlemaps/GoogleMapController;->K(FFFF)V

    :cond_1
    return-void
.end method

.method public w()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->m:Lu4/d;

    return-object v0
.end method

.method public x()V
    .locals 0

    return-void
.end method

.method public y(Lw4/l;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->A:Lio/flutter/plugins/googlemaps/s;

    invoke-virtual {p1}, Lw4/l;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lw4/l;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemaps/s;->j(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public z()V
    .locals 3

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->o:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->n:Lu4/c;

    invoke-virtual {v1}, Lu4/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    invoke-static {v1}, Lio/flutter/plugins/googlemaps/e;->a(Lcom/google/android/gms/maps/model/CameraPosition;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "position"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->k:Lr8/k;

    const-string v2, "camera#onMove"

    invoke-virtual {v1, v2, v0}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
