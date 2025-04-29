.class public final Lw4/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr4/h;


# direct methods
.method public constructor <init>(Lr4/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr4/h;

    iput-object p1, p0, Lw4/q;->a:Lr4/h;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0}, Lr4/h;->zzl()Ljava/lang/String;

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

.method public b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0}, Lr4/h;->zzp()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->j(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public d(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->D0(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public e(Lw4/d;)V
    .locals 1

    const-string v0, "endCap must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->N(Lw4/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lw4/q;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    check-cast p1, Lw4/q;

    iget-object p1, p1, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->C1(Lr4/h;)Z

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

.method public f(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->s2(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public g(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->K(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public h(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw4/n;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->zzv(Ljava/util/List;)V
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
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0}, Lr4/h;->zzh()I

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

.method public i(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    const-string v0, "points must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->zzw(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(Lw4/d;)V
    .locals 1

    const-string v0, "startCap must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->z1(Lw4/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public k(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->q2(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public l(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->R(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public m(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/q;->a:Lr4/h;

    invoke-interface {v0, p1}, Lr4/h;->t0(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
