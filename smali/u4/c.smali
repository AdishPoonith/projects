.class public Lu4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/c$c;,
        Lu4/c$b;,
        Lu4/c$a;,
        Lu4/c$f;,
        Lu4/c$h;,
        Lu4/c$i;,
        Lu4/c$j;,
        Lu4/c$e;,
        Lu4/c$g;,
        Lu4/c$d;,
        Lu4/c$k;,
        Lu4/c$l;,
        Lu4/c$m;
    }
.end annotation


# instance fields
.field private final a:Lv4/b;

.field private final b:Ljava/util/HashMap;

.field private c:Lu4/i;


# direct methods
.method public constructor <init>(Lv4/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu4/c;->b:Ljava/util/HashMap;

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv4/b;

    iput-object p1, p0, Lu4/c;->a:Lv4/b;

    return-void
.end method


# virtual methods
.method public final A(Lu4/c$d;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->w0(Lv4/q0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/q;

    invoke-direct {v1, p0, p1}, Lu4/q;-><init>(Lu4/c;Lu4/c$d;)V

    invoke-interface {v0, v1}, Lv4/b;->w0(Lv4/q0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final B(Lu4/c$e;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->A1(Lv4/h;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/o;

    invoke-direct {v1, p0, p1}, Lu4/o;-><init>(Lu4/c;Lu4/c$e;)V

    invoke-interface {v0, v1}, Lv4/b;->A1(Lv4/h;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final C(Lu4/c$f;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->u2(Lv4/j;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/x;

    invoke-direct {v1, p0, p1}, Lu4/x;-><init>(Lu4/c;Lu4/c$f;)V

    invoke-interface {v0, v1}, Lv4/b;->u2(Lv4/j;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public D(Lu4/c$g;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->l2(Lv4/l;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/p;

    invoke-direct {v1, p0, p1}, Lu4/p;-><init>(Lu4/c;Lu4/c$g;)V

    invoke-interface {v0, v1}, Lv4/b;->l2(Lv4/l;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final E(Lu4/c$h;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->H0(Lv4/n;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/y;

    invoke-direct {v1, p0, p1}, Lu4/y;-><init>(Lu4/c;Lu4/c$h;)V

    invoke-interface {v0, v1}, Lv4/b;->H0(Lv4/n;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final F(Lu4/c$i;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->p0(Lv4/r;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/j;

    invoke-direct {v1, p0, p1}, Lu4/j;-><init>(Lu4/c;Lu4/c$i;)V

    invoke-interface {v0, v1}, Lv4/b;->p0(Lv4/r;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final G(Lu4/c$j;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->N0(Lv4/t;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/n;

    invoke-direct {v1, p0, p1}, Lu4/n;-><init>(Lu4/c;Lu4/c$j;)V

    invoke-interface {v0, v1}, Lv4/b;->N0(Lv4/t;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final H(Lu4/c$k;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->c0(Lv4/w;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/r;

    invoke-direct {v1, p0, p1}, Lu4/r;-><init>(Lu4/c;Lu4/c$k;)V

    invoke-interface {v0, v1}, Lv4/b;->c0(Lv4/w;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final I(Lu4/c$l;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->t2(Lv4/y;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/s;

    invoke-direct {v1, p0, p1}, Lu4/s;-><init>(Lu4/c;Lu4/c$l;)V

    invoke-interface {v0, v1}, Lv4/b;->t2(Lv4/y;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final J(IIII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lv4/b;->W0(IIII)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lw4/t;

    invoke-direct {p2, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final K(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->G(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final L(Lu4/c$m;)V
    .locals 1

    const-string v0, "Callback must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lu4/c;->M(Lu4/c$m;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final M(Lu4/c$m;Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "Callback must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    invoke-static {p2}, Lk4/d;->H2(Ljava/lang/Object;)Lk4/b;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Lk4/d;

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/t;

    invoke-direct {v1, p0, p1}, Lu4/t;-><init>(Lu4/c;Lu4/c$m;)V

    invoke-interface {v0, v1, p2}, Lv4/b;->i0(Lv4/b0;Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lw4/t;

    invoke-direct {p2, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final a(Lw4/f;)Lw4/e;
    .locals 2

    :try_start_0
    const-string v0, "CircleOptions must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lw4/e;

    iget-object v1, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v1, p1}, Lv4/b;->E0(Lw4/f;)Lr4/v;

    move-result-object p1

    invoke-direct {v0, p1}, Lw4/e;-><init>(Lr4/v;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final b(Lw4/m;)Lw4/l;
    .locals 1

    :try_start_0
    const-string v0, "MarkerOptions must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->o0(Lw4/m;)Lr4/b;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lw4/l;

    invoke-direct {v0, p1}, Lw4/l;-><init>(Lr4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final c(Lw4/p;)Lw4/o;
    .locals 2

    :try_start_0
    const-string v0, "PolygonOptions must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lw4/o;

    iget-object v1, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v1, p1}, Lv4/b;->J1(Lw4/p;)Lr4/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lw4/o;-><init>(Lr4/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final d(Lw4/r;)Lw4/q;
    .locals 2

    :try_start_0
    const-string v0, "PolylineOptions must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lw4/q;

    iget-object v1, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v1, p1}, Lv4/b;->r1(Lw4/r;)Lr4/h;

    move-result-object p1

    invoke-direct {v0, p1}, Lw4/q;-><init>(Lr4/h;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final e(Lw4/a0;)Lw4/z;
    .locals 1

    :try_start_0
    const-string v0, "TileOverlayOptions must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->h1(Lw4/a0;)Lr4/k;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lw4/z;

    invoke-direct {v0, p1}, Lw4/z;-><init>(Lr4/k;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final f(Lu4/a;)V
    .locals 1

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-virtual {p1}, Lu4/a;->a()Lk4/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lv4/b;->X1(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final g()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0}, Lv4/b;->s1()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final h()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0}, Lv4/b;->Q1()F

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final i()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0}, Lv4/b;->Y()F

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final j()Lu4/h;
    .locals 2

    :try_start_0
    new-instance v0, Lu4/h;

    iget-object v1, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v1}, Lv4/b;->X0()Lv4/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lu4/h;-><init>(Lv4/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final k()Lu4/i;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/c;->c:Lu4/i;

    if-nez v0, :cond_0

    new-instance v0, Lu4/i;

    iget-object v1, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v1}, Lv4/b;->s0()Lv4/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lu4/i;-><init>(Lv4/e;)V

    iput-object v0, p0, Lu4/c;->c:Lu4/i;

    :cond_0
    iget-object v0, p0, Lu4/c;->c:Lu4/i;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final l()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0}, Lv4/b;->G0()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final m()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0}, Lv4/b;->f2()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final n(Lu4/a;)V
    .locals 1

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-virtual {p1}, Lu4/a;->a()Lk4/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lv4/b;->f0(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public o()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0}, Lv4/b;->U()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final p(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->f(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final q(Z)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->k(Z)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public r(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->z0(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public s(Lw4/k;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->j2(Lw4/k;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final t(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->e(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public u(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->o2(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public v(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->A2(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final w(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    invoke-interface {v0, p1}, Lv4/b;->C(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final x(Lu4/c$a;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->G1(Lv4/k0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/w;

    invoke-direct {v1, p0, p1}, Lu4/w;-><init>(Lu4/c;Lu4/c$a;)V

    invoke-interface {v0, v1}, Lv4/b;->G1(Lv4/k0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final y(Lu4/c$b;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->E1(Lv4/m0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/v;

    invoke-direct {v1, p0, p1}, Lu4/v;-><init>(Lu4/c;Lu4/c$b;)V

    invoke-interface {v0, v1}, Lv4/b;->E1(Lv4/m0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final z(Lu4/c$c;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lu4/c;->a:Lv4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lv4/b;->g2(Lv4/o0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lu4/c;->a:Lv4/b;

    new-instance v1, Lu4/u;

    invoke-direct {v1, p0, p1}, Lu4/u;-><init>(Lu4/c;Lu4/c$c;)V

    invoke-interface {v0, v1}, Lv4/b;->g2(Lv4/o0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
