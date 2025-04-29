.class public final Lw4/f;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private j:Lcom/google/android/gms/maps/model/LatLng;

.field private k:D

.field private l:F

.field private m:I

.field private n:I

.field private o:F

.field private p:Z

.field private q:Z

.field private r:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/j0;

    invoke-direct {v0}, Lw4/j0;-><init>()V

    sput-object v0, Lw4/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lw4/f;->j:Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lw4/f;->k:D

    const/high16 v1, 0x41200000    # 10.0f

    iput v1, p0, Lw4/f;->l:F

    const/high16 v1, -0x1000000

    iput v1, p0, Lw4/f;->m:I

    const/4 v1, 0x0

    iput v1, p0, Lw4/f;->n:I

    const/4 v2, 0x0

    iput v2, p0, Lw4/f;->o:F

    const/4 v2, 0x1

    iput-boolean v2, p0, Lw4/f;->p:Z

    iput-boolean v1, p0, Lw4/f;->q:Z

    iput-object v0, p0, Lw4/f;->r:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/maps/model/LatLng;DFIIFZZLjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput-object p1, p0, Lw4/f;->j:Lcom/google/android/gms/maps/model/LatLng;

    iput-wide p2, p0, Lw4/f;->k:D

    iput p4, p0, Lw4/f;->l:F

    iput p5, p0, Lw4/f;->m:I

    iput p6, p0, Lw4/f;->n:I

    iput p7, p0, Lw4/f;->o:F

    iput-boolean p8, p0, Lw4/f;->p:Z

    iput-boolean p9, p0, Lw4/f;->q:Z

    iput-object p10, p0, Lw4/f;->r:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public B(Lcom/google/android/gms/maps/model/LatLng;)Lw4/f;
    .locals 1

    const-string v0, "center must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lw4/f;->j:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method public C(Z)Lw4/f;
    .locals 0

    iput-boolean p1, p0, Lw4/f;->q:Z

    return-object p0
.end method

.method public D(I)Lw4/f;
    .locals 0

    iput p1, p0, Lw4/f;->n:I

    return-object p0
.end method

.method public E()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lw4/f;->j:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Lw4/f;->n:I

    return v0
.end method

.method public G()D
    .locals 2

    iget-wide v0, p0, Lw4/f;->k:D

    return-wide v0
.end method

.method public H()I
    .locals 1

    iget v0, p0, Lw4/f;->m:I

    return v0
.end method

.method public I()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw4/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw4/f;->r:Ljava/util/List;

    return-object v0
.end method

.method public J()F
    .locals 1

    iget v0, p0, Lw4/f;->l:F

    return v0
.end method

.method public K()F
    .locals 1

    iget v0, p0, Lw4/f;->o:F

    return v0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lw4/f;->q:Z

    return v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, Lw4/f;->p:Z

    return v0
.end method

.method public N(D)Lw4/f;
    .locals 0

    iput-wide p1, p0, Lw4/f;->k:D

    return-object p0
.end method

.method public O(I)Lw4/f;
    .locals 0

    iput p1, p0, Lw4/f;->m:I

    return-object p0
.end method

.method public P(F)Lw4/f;
    .locals 0

    iput p1, p0, Lw4/f;->l:F

    return-object p0
.end method

.method public Q(Z)Lw4/f;
    .locals 0

    iput-boolean p1, p0, Lw4/f;->p:Z

    return-object p0
.end method

.method public R(F)Lw4/f;
    .locals 0

    iput p1, p0, Lw4/f;->o:F

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lw4/f;->E()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lw4/f;->G()D

    move-result-wide v1

    const/4 p2, 0x3

    invoke-static {p1, p2, v1, v2}, Ld4/c;->h(Landroid/os/Parcel;ID)V

    invoke-virtual {p0}, Lw4/f;->J()F

    move-result p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lw4/f;->H()I

    move-result p2

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw4/f;->F()I

    move-result p2

    const/4 v1, 0x6

    invoke-static {p1, v1, p2}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw4/f;->K()F

    move-result p2

    const/4 v1, 0x7

    invoke-static {p1, v1, p2}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lw4/f;->M()Z

    move-result p2

    const/16 v1, 0x8

    invoke-static {p1, v1, p2}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/f;->L()Z

    move-result p2

    const/16 v1, 0x9

    invoke-static {p1, v1, p2}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/f;->I()Ljava/util/List;

    move-result-object p2

    const/16 v1, 0xa

    invoke-static {p1, v1, p2, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
