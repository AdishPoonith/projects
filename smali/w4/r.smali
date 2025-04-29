.class public final Lw4/r;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Ljava/util/List;

.field private k:F

.field private l:I

.field private m:F

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Lw4/d;

.field private r:Lw4/d;

.field private s:I

.field private t:Ljava/util/List;

.field private u:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/q0;

    invoke-direct {v0}, Lw4/q0;-><init>()V

    sput-object v0, Lw4/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lw4/r;->k:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lw4/r;->l:I

    const/4 v0, 0x0

    iput v0, p0, Lw4/r;->m:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw4/r;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lw4/r;->o:Z

    iput-boolean v0, p0, Lw4/r;->p:Z

    new-instance v1, Lw4/c;

    invoke-direct {v1}, Lw4/c;-><init>()V

    iput-object v1, p0, Lw4/r;->q:Lw4/d;

    new-instance v1, Lw4/c;

    invoke-direct {v1}, Lw4/c;-><init>()V

    iput-object v1, p0, Lw4/r;->r:Lw4/d;

    iput v0, p0, Lw4/r;->s:I

    const/4 v0, 0x0

    iput-object v0, p0, Lw4/r;->t:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw4/r;->u:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw4/r;->j:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Ljava/util/List;FIFZZZLw4/d;Lw4/d;ILjava/util/List;Ljava/util/List;)V
    .locals 2

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lw4/r;->k:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lw4/r;->l:I

    const/4 v0, 0x0

    iput v0, p0, Lw4/r;->m:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw4/r;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lw4/r;->o:Z

    iput-boolean v0, p0, Lw4/r;->p:Z

    new-instance v1, Lw4/c;

    invoke-direct {v1}, Lw4/c;-><init>()V

    iput-object v1, p0, Lw4/r;->q:Lw4/d;

    new-instance v1, Lw4/c;

    invoke-direct {v1}, Lw4/c;-><init>()V

    iput-object v1, p0, Lw4/r;->r:Lw4/d;

    iput v0, p0, Lw4/r;->s:I

    const/4 v0, 0x0

    iput-object v0, p0, Lw4/r;->t:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw4/r;->u:Ljava/util/List;

    iput-object p1, p0, Lw4/r;->j:Ljava/util/List;

    iput p2, p0, Lw4/r;->k:F

    iput p3, p0, Lw4/r;->l:I

    iput p4, p0, Lw4/r;->m:F

    iput-boolean p5, p0, Lw4/r;->n:Z

    iput-boolean p6, p0, Lw4/r;->o:Z

    iput-boolean p7, p0, Lw4/r;->p:Z

    if-eqz p8, :cond_0

    iput-object p8, p0, Lw4/r;->q:Lw4/d;

    :cond_0
    if-eqz p9, :cond_1

    iput-object p9, p0, Lw4/r;->r:Lw4/d;

    :cond_1
    iput p10, p0, Lw4/r;->s:I

    iput-object p11, p0, Lw4/r;->t:Ljava/util/List;

    if-eqz p12, :cond_2

    iput-object p12, p0, Lw4/r;->u:Ljava/util/List;

    :cond_2
    return-void
.end method


# virtual methods
.method public B(Ljava/lang/Iterable;)Lw4/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lw4/r;"
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

    iget-object v1, p0, Lw4/r;->j:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public C(Z)Lw4/r;
    .locals 0

    iput-boolean p1, p0, Lw4/r;->p:Z

    return-object p0
.end method

.method public D(I)Lw4/r;
    .locals 0

    iput p1, p0, Lw4/r;->l:I

    return-object p0
.end method

.method public E(Lw4/d;)Lw4/r;
    .locals 1

    const-string v0, "endCap must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw4/d;

    iput-object p1, p0, Lw4/r;->r:Lw4/d;

    return-object p0
.end method

.method public F(Z)Lw4/r;
    .locals 0

    iput-boolean p1, p0, Lw4/r;->o:Z

    return-object p0
.end method

.method public G()I
    .locals 1

    iget v0, p0, Lw4/r;->l:I

    return v0
.end method

.method public H()Lw4/d;
    .locals 1

    iget-object v0, p0, Lw4/r;->r:Lw4/d;

    invoke-virtual {v0}, Lw4/d;->B()Lw4/d;

    move-result-object v0

    return-object v0
.end method

.method public I()I
    .locals 1

    iget v0, p0, Lw4/r;->s:I

    return v0
.end method

.method public J()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw4/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw4/r;->t:Ljava/util/List;

    return-object v0
.end method

.method public K()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw4/r;->j:Ljava/util/List;

    return-object v0
.end method

.method public L()Lw4/d;
    .locals 1

    iget-object v0, p0, Lw4/r;->q:Lw4/d;

    invoke-virtual {v0}, Lw4/d;->B()Lw4/d;

    move-result-object v0

    return-object v0
.end method

.method public M()F
    .locals 1

    iget v0, p0, Lw4/r;->k:F

    return v0
.end method

.method public N()F
    .locals 1

    iget v0, p0, Lw4/r;->m:F

    return v0
.end method

.method public O()Z
    .locals 1

    iget-boolean v0, p0, Lw4/r;->p:Z

    return v0
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, Lw4/r;->o:Z

    return v0
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, Lw4/r;->n:Z

    return v0
.end method

.method public R(I)Lw4/r;
    .locals 0

    iput p1, p0, Lw4/r;->s:I

    return-object p0
.end method

.method public S(Ljava/util/List;)Lw4/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw4/n;",
            ">;)",
            "Lw4/r;"
        }
    .end annotation

    iput-object p1, p0, Lw4/r;->t:Ljava/util/List;

    return-object p0
.end method

.method public T(Lw4/d;)Lw4/r;
    .locals 1

    const-string v0, "startCap must not be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw4/d;

    iput-object p1, p0, Lw4/r;->q:Lw4/d;

    return-object p0
.end method

.method public U(Z)Lw4/r;
    .locals 0

    iput-boolean p1, p0, Lw4/r;->n:Z

    return-object p0
.end method

.method public V(F)Lw4/r;
    .locals 0

    iput p1, p0, Lw4/r;->k:F

    return-object p0
.end method

.method public W(F)Lw4/r;
    .locals 0

    iput p1, p0, Lw4/r;->m:F

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 8

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lw4/r;->K()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lw4/r;->M()F

    move-result v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lw4/r;->G()I

    move-result v1

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw4/r;->N()F

    move-result v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lw4/r;->Q()Z

    move-result v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/r;->P()Z

    move-result v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/r;->O()Z

    move-result v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/r;->L()Lw4/d;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lw4/r;->H()Lw4/d;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lw4/r;->I()I

    move-result p2

    const/16 v1, 0xb

    invoke-static {p1, v1, p2}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw4/r;->J()Ljava/util/List;

    move-result-object p2

    const/16 v1, 0xc

    invoke-static {p1, v1, p2, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    new-instance p2, Ljava/util/ArrayList;

    iget-object v1, p0, Lw4/r;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lw4/r;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw4/x;

    new-instance v4, Lw4/x;

    new-instance v5, Lw4/w$a;

    invoke-virtual {v2}, Lw4/x;->C()Lw4/w;

    move-result-object v6

    invoke-direct {v5, v6}, Lw4/w$a;-><init>(Lw4/w;)V

    iget v6, p0, Lw4/r;->k:F

    invoke-virtual {v5, v6}, Lw4/w$a;->c(F)Lw4/w$a;

    iget-boolean v6, p0, Lw4/r;->n:Z

    invoke-virtual {v5, v6}, Lw4/w$a;->b(Z)Lw4/w$a;

    invoke-virtual {v5}, Lw4/w$a;->a()Lw4/w;

    move-result-object v5

    invoke-virtual {v2}, Lw4/x;->B()D

    move-result-wide v6

    invoke-direct {v4, v5, v6, v7}, Lw4/x;-><init>(Lw4/w;D)V

    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/16 v1, 0xd

    invoke-static {p1, v1, p2, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
