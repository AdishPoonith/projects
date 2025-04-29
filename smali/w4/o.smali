.class public final Lw4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr4/e;


# direct methods
.method public constructor <init>(Lr4/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr4/e;

    iput-object p1, p0, Lw4/o;->a:Lr4/e;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0}, Lr4/e;->zzk()Ljava/lang/String;

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
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0}, Lr4/e;->zzo()V
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
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->L(Z)V
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
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->g(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public e(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->t(Z)V
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

    instance-of v0, p1, Lw4/o;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    check-cast p1, Lw4/o;

    iget-object p1, p1, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->U0(Lr4/e;)Z

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

.method public f(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->b1(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
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

    :try_start_0
    const-string v0, "points must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->k0(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public h(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->K(I)V
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
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0}, Lr4/e;->zzi()I

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

.method public i(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->A(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->q(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public k(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lw4/o;->a:Lr4/e;

    invoke-interface {v0, p1}, Lr4/e;->E(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
