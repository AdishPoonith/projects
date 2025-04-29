.class public final Lw4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr4/b;


# direct methods
.method public constructor <init>(Lr4/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr4/b;

    iput-object p1, p0, Lw4/l;->a:Lr4/b;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0}, Lr4/b;->zzj()Ljava/lang/String;

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

.method public b()Lcom/google/android/gms/maps/model/LatLng;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0}, Lr4/b;->zzi()Lcom/google/android/gms/maps/model/LatLng;

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

.method public c()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0}, Lr4/b;->zzm()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public d()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0}, Lr4/b;->g0()Z

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

.method public e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0}, Lr4/b;->zzn()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lw4/l;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    check-cast p1, Lw4/l;

    iget-object p1, p1, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->p2(Lr4/b;)Z

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

.method public f(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->n1(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public g(FF)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1, p2}, Lr4/b;->b2(FF)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lw4/t;

    invoke-direct {p2, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public h(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->j(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public hashCode()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0}, Lr4/b;->zzg()I

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

.method public i(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->t(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(Lw4/a;)V
    .locals 1

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lw4/l;->a:Lr4/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lr4/b;->N1(Lk4/b;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lw4/a;->a()Lk4/b;

    move-result-object p1

    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->N1(Lk4/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public k(FF)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1, p2}, Lr4/b;->U1(FF)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lw4/t;

    invoke-direct {p2, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public l(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->d2(Lcom/google/android/gms/maps/model/LatLng;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "latlng cannot be null - a position is required."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->x0(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public n(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->K1(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public o(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->m0(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public p(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->q(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public q(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0, p1}, Lr4/b;->E(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public r()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/l;->a:Lr4/b;

    invoke-interface {v0}, Lr4/b;->q0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
