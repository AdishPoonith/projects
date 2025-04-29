.class public final La6/j;
.super Lcom/google/firebase/auth/l0;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La6/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/util/List;

.field private m:Ljava/util/List;

.field private n:La6/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La6/k;

    invoke-direct {v0}, La6/k;-><init>()V

    sput-object v0, La6/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/l0;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La6/w1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/l0;-><init>()V

    iput-object p1, p0, La6/j;->j:Ljava/lang/String;

    iput-object p2, p0, La6/j;->k:Ljava/lang/String;

    iput-object p3, p0, La6/j;->l:Ljava/util/List;

    iput-object p4, p0, La6/j;->m:Ljava/util/List;

    iput-object p5, p0, La6/j;->n:La6/w1;

    return-void
.end method

.method public static B(Ljava/lang/String;La6/w1;)La6/j;
    .locals 1

    invoke-static {p0}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, La6/j;

    invoke-direct {v0}, La6/j;-><init>()V

    iput-object p0, v0, La6/j;->j:Ljava/lang/String;

    iput-object p1, v0, La6/j;->n:La6/w1;

    return-object v0
.end method

.method public static C(Ljava/util/List;Ljava/lang/String;)La6/j;
    .locals 3

    invoke-static {p0}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, La6/j;

    invoke-direct {v0}, La6/j;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, La6/j;->l:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, La6/j;->m:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/auth/j0;

    instance-of v2, v1, Lcom/google/firebase/auth/t0;

    if-eqz v2, :cond_0

    iget-object v2, v0, La6/j;->l:Ljava/util/List;

    check-cast v1, Lcom/google/firebase/auth/t0;

    :goto_1
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lcom/google/firebase/auth/t1;

    if-eqz v2, :cond_1

    iget-object v2, v0, La6/j;->m:Ljava/util/List;

    check-cast v1, Lcom/google/firebase/auth/t1;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Lcom/google/firebase/auth/j0;->C()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iput-object p1, v0, La6/j;->k:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/j;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/j;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final F()Z
    .locals 1

    iget-object v0, p0, La6/j;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, La6/j;->j:Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, La6/j;->k:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, La6/j;->l:Ljava/util/List;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, La6/j;->m:Ljava/util/List;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, La6/j;->n:La6/w1;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
