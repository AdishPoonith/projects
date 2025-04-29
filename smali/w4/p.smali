.class public final Lw4/p;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Ljava/util/List;

.field private final k:Ljava/util/List;

.field private l:F

.field private m:I

.field private n:I

.field private o:F

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:I

.field private t:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/p0;

    invoke-direct {v0}, Lw4/p0;-><init>()V

    sput-object v0, Lw4/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lw4/p;->l:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lw4/p;->m:I

    const/4 v0, 0x0

    iput v0, p0, Lw4/p;->n:I

    const/4 v1, 0x0

    iput v1, p0, Lw4/p;->o:F

    const/4 v1, 0x1

    iput-boolean v1, p0, Lw4/p;->p:Z

    iput-boolean v0, p0, Lw4/p;->q:Z

    iput-boolean v0, p0, Lw4/p;->r:Z

    iput v0, p0, Lw4/p;->s:I

    const/4 v0, 0x0

    iput-object v0, p0, Lw4/p;->t:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw4/p;->j:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw4/p;->k:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Ljava/util/List;Ljava/util/List;FIIFZZZILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput-object p1, p0, Lw4/p;->j:Ljava/util/List;

    iput-object p2, p0, Lw4/p;->k:Ljava/util/List;

    iput p3, p0, Lw4/p;->l:F

    iput p4, p0, Lw4/p;->m:I

    iput p5, p0, Lw4/p;->n:I

    iput p6, p0, Lw4/p;->o:F

    iput-boolean p7, p0, Lw4/p;->p:Z

    iput-boolean p8, p0, Lw4/p;->q:Z

    iput-boolean p9, p0, Lw4/p;->r:Z

    iput p10, p0, Lw4/p;->s:I

    iput-object p11, p0, Lw4/p;->t:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/Iterable;)Lw4/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lw4/p;"
        }
    .end annotation

    const-string v0, "points must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lw4/p;->j:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public C(Ljava/lang/Iterable;)Lw4/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lw4/p;"
        }
    .end annotation

    const-string v0, "points must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lw4/p;->k:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public D(Z)Lw4/p;
    .locals 0

    iput-boolean p1, p0, Lw4/p;->r:Z

    return-object p0
.end method

.method public E(I)Lw4/p;
    .locals 0

    iput p1, p0, Lw4/p;->n:I

    return-object p0
.end method

.method public F(Z)Lw4/p;
    .locals 0

    iput-boolean p1, p0, Lw4/p;->q:Z

    return-object p0
.end method

.method public G()I
    .locals 1

    iget v0, p0, Lw4/p;->n:I

    return v0
.end method

.method public H()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw4/p;->j:Ljava/util/List;

    return-object v0
.end method

.method public I()I
    .locals 1

    iget v0, p0, Lw4/p;->m:I

    return v0
.end method

.method public J()I
    .locals 1

    iget v0, p0, Lw4/p;->s:I

    return v0
.end method

.method public K()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw4/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw4/p;->t:Ljava/util/List;

    return-object v0
.end method

.method public L()F
    .locals 1

    iget v0, p0, Lw4/p;->l:F

    return v0
.end method

.method public M()F
    .locals 1

    iget v0, p0, Lw4/p;->o:F

    return v0
.end method

.method public N()Z
    .locals 1

    iget-boolean v0, p0, Lw4/p;->r:Z

    return v0
.end method

.method public O()Z
    .locals 1

    iget-boolean v0, p0, Lw4/p;->q:Z

    return v0
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, Lw4/p;->p:Z

    return v0
.end method

.method public Q(I)Lw4/p;
    .locals 0

    iput p1, p0, Lw4/p;->m:I

    return-object p0
.end method

.method public R(F)Lw4/p;
    .locals 0

    iput p1, p0, Lw4/p;->l:F

    return-object p0
.end method

.method public S(Z)Lw4/p;
    .locals 0

    iput-boolean p1, p0, Lw4/p;->p:Z

    return-object p0
.end method

.method public T(F)Lw4/p;
    .locals 0

    iput p1, p0, Lw4/p;->o:F

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lw4/p;->H()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v0, p0, Lw4/p;->k:Ljava/util/List;

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Ld4/c;->o(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lw4/p;->L()F

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lw4/p;->I()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw4/p;->G()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw4/p;->M()F

    move-result v0

    const/4 v1, 0x7

    invoke-static {p1, v1, v0}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lw4/p;->P()Z

    move-result v0

    const/16 v1, 0x8

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/p;->O()Z

    move-result v0

    const/16 v1, 0x9

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/p;->N()Z

    move-result v0

    const/16 v1, 0xa

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/p;->J()I

    move-result v0

    const/16 v1, 0xb

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw4/p;->K()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xc

    invoke-static {p1, v1, v0, v2}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
