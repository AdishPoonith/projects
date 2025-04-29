.class public final Lw4/m;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private j:Lcom/google/android/gms/maps/model/LatLng;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Lw4/a;

.field private n:F

.field private o:F

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:F

.field private t:F

.field private u:F

.field private v:F

.field private w:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/n0;

    invoke-direct {v0}, Lw4/n0;-><init>()V

    sput-object v0, Lw4/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lw4/m;->n:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lw4/m;->o:F

    const/4 v2, 0x1

    iput-boolean v2, p0, Lw4/m;->q:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lw4/m;->r:Z

    const/4 v2, 0x0

    iput v2, p0, Lw4/m;->s:F

    iput v0, p0, Lw4/m;->t:F

    iput v2, p0, Lw4/m;->u:F

    iput v1, p0, Lw4/m;->v:F

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;FFZZZFFFFF)V
    .locals 4

    move-object v0, p0

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v0, Lw4/m;->n:F

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lw4/m;->o:F

    const/4 v3, 0x1

    iput-boolean v3, v0, Lw4/m;->q:Z

    const/4 v3, 0x0

    iput-boolean v3, v0, Lw4/m;->r:Z

    const/4 v3, 0x0

    iput v3, v0, Lw4/m;->s:F

    iput v1, v0, Lw4/m;->t:F

    iput v3, v0, Lw4/m;->u:F

    iput v2, v0, Lw4/m;->v:F

    move-object v1, p1

    iput-object v1, v0, Lw4/m;->j:Lcom/google/android/gms/maps/model/LatLng;

    move-object v1, p2

    iput-object v1, v0, Lw4/m;->k:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lw4/m;->l:Ljava/lang/String;

    if-nez p4, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lw4/a;

    invoke-static {p4}, Lk4/b$a;->x(Landroid/os/IBinder;)Lk4/b;

    move-result-object v2

    invoke-direct {v1, v2}, Lw4/a;-><init>(Lk4/b;)V

    :goto_0
    iput-object v1, v0, Lw4/m;->m:Lw4/a;

    move v1, p5

    iput v1, v0, Lw4/m;->n:F

    move v1, p6

    iput v1, v0, Lw4/m;->o:F

    move v1, p7

    iput-boolean v1, v0, Lw4/m;->p:Z

    move v1, p8

    iput-boolean v1, v0, Lw4/m;->q:Z

    move v1, p9

    iput-boolean v1, v0, Lw4/m;->r:Z

    move v1, p10

    iput v1, v0, Lw4/m;->s:F

    move v1, p11

    iput v1, v0, Lw4/m;->t:F

    move/from16 v1, p12

    iput v1, v0, Lw4/m;->u:F

    move/from16 v1, p13

    iput v1, v0, Lw4/m;->v:F

    move/from16 v1, p14

    iput v1, v0, Lw4/m;->w:F

    return-void
.end method


# virtual methods
.method public B(F)Lw4/m;
    .locals 0

    iput p1, p0, Lw4/m;->v:F

    return-object p0
.end method

.method public C(FF)Lw4/m;
    .locals 0

    iput p1, p0, Lw4/m;->n:F

    iput p2, p0, Lw4/m;->o:F

    return-object p0
.end method

.method public D(Z)Lw4/m;
    .locals 0

    iput-boolean p1, p0, Lw4/m;->p:Z

    return-object p0
.end method

.method public E(Z)Lw4/m;
    .locals 0

    iput-boolean p1, p0, Lw4/m;->r:Z

    return-object p0
.end method

.method public F()F
    .locals 1

    iget v0, p0, Lw4/m;->v:F

    return v0
.end method

.method public G()F
    .locals 1

    iget v0, p0, Lw4/m;->n:F

    return v0
.end method

.method public H()F
    .locals 1

    iget v0, p0, Lw4/m;->o:F

    return v0
.end method

.method public I()F
    .locals 1

    iget v0, p0, Lw4/m;->t:F

    return v0
.end method

.method public J()F
    .locals 1

    iget v0, p0, Lw4/m;->u:F

    return v0
.end method

.method public K()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lw4/m;->j:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public L()F
    .locals 1

    iget v0, p0, Lw4/m;->s:F

    return v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw4/m;->l:Ljava/lang/String;

    return-object v0
.end method

.method public N()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw4/m;->k:Ljava/lang/String;

    return-object v0
.end method

.method public O()F
    .locals 1

    iget v0, p0, Lw4/m;->w:F

    return v0
.end method

.method public P(Lw4/a;)Lw4/m;
    .locals 0

    iput-object p1, p0, Lw4/m;->m:Lw4/a;

    return-object p0
.end method

.method public Q(FF)Lw4/m;
    .locals 0

    iput p1, p0, Lw4/m;->t:F

    iput p2, p0, Lw4/m;->u:F

    return-object p0
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, Lw4/m;->p:Z

    return v0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lw4/m;->r:Z

    return v0
.end method

.method public T()Z
    .locals 1

    iget-boolean v0, p0, Lw4/m;->q:Z

    return v0
.end method

.method public U(Lcom/google/android/gms/maps/model/LatLng;)Lw4/m;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lw4/m;->j:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "latlng cannot be null - a position is required."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public V(F)Lw4/m;
    .locals 0

    iput p1, p0, Lw4/m;->s:F

    return-object p0
.end method

.method public W(Ljava/lang/String;)Lw4/m;
    .locals 0

    iput-object p1, p0, Lw4/m;->l:Ljava/lang/String;

    return-object p0
.end method

.method public X(Ljava/lang/String;)Lw4/m;
    .locals 0

    iput-object p1, p0, Lw4/m;->k:Ljava/lang/String;

    return-object p0
.end method

.method public Y(Z)Lw4/m;
    .locals 0

    iput-boolean p1, p0, Lw4/m;->q:Z

    return-object p0
.end method

.method public Z(F)Lw4/m;
    .locals 0

    iput p1, p0, Lw4/m;->w:F

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lw4/m;->K()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lw4/m;->N()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x3

    invoke-static {p1, v1, p2, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lw4/m;->M()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object p2, p0, Lw4/m;->m:Lw4/a;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lw4/a;->a()Lk4/b;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_0
    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Ld4/c;->k(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 p2, 0x6

    invoke-virtual {p0}, Lw4/m;->G()F

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    const/4 p2, 0x7

    invoke-virtual {p0}, Lw4/m;->H()F

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    const/16 p2, 0x8

    invoke-virtual {p0}, Lw4/m;->R()Z

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x9

    invoke-virtual {p0}, Lw4/m;->T()Z

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xa

    invoke-virtual {p0}, Lw4/m;->S()Z

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xb

    invoke-virtual {p0}, Lw4/m;->L()F

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    const/16 p2, 0xc

    invoke-virtual {p0}, Lw4/m;->I()F

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    const/16 p2, 0xd

    invoke-virtual {p0}, Lw4/m;->J()F

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    const/16 p2, 0xe

    invoke-virtual {p0}, Lw4/m;->F()F

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    const/16 p2, 0xf

    invoke-virtual {p0}, Lw4/m;->O()F

    move-result v1

    invoke-static {p1, p2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
