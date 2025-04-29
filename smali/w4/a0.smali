.class public final Lw4/a0;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private j:Lr4/n;

.field private k:Lw4/b0;

.field private l:Z

.field private m:F

.field private n:Z

.field private o:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/g0;

    invoke-direct {v0}, Lw4/g0;-><init>()V

    sput-object v0, Lw4/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw4/a0;->l:Z

    iput-boolean v0, p0, Lw4/a0;->n:Z

    const/4 v0, 0x0

    iput v0, p0, Lw4/a0;->o:F

    return-void
.end method

.method constructor <init>(Landroid/os/IBinder;ZFZF)V
    .locals 1

    invoke-direct {p0}, Ld4/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw4/a0;->l:Z

    iput-boolean v0, p0, Lw4/a0;->n:Z

    const/4 v0, 0x0

    iput v0, p0, Lw4/a0;->o:F

    invoke-static {p1}, Lr4/m;->x(Landroid/os/IBinder;)Lr4/n;

    move-result-object p1

    iput-object p1, p0, Lw4/a0;->j:Lr4/n;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lw4/e0;

    invoke-direct {p1, p0}, Lw4/e0;-><init>(Lw4/a0;)V

    :goto_0
    iput-object p1, p0, Lw4/a0;->k:Lw4/b0;

    iput-boolean p2, p0, Lw4/a0;->l:Z

    iput p3, p0, Lw4/a0;->m:F

    iput-boolean p4, p0, Lw4/a0;->n:Z

    iput p5, p0, Lw4/a0;->o:F

    return-void
.end method

.method static bridge synthetic K(Lw4/a0;)Lr4/n;
    .locals 0

    iget-object p0, p0, Lw4/a0;->j:Lr4/n;

    return-object p0
.end method


# virtual methods
.method public B(Z)Lw4/a0;
    .locals 0

    iput-boolean p1, p0, Lw4/a0;->n:Z

    return-object p0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lw4/a0;->n:Z

    return v0
.end method

.method public D()F
    .locals 1

    iget v0, p0, Lw4/a0;->o:F

    return v0
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lw4/a0;->m:F

    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Lw4/a0;->l:Z

    return v0
.end method

.method public G(Lw4/b0;)Lw4/a0;
    .locals 1

    const-string v0, "tileProvider must not be null."

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw4/b0;

    iput-object v0, p0, Lw4/a0;->k:Lw4/b0;

    new-instance v0, Lw4/f0;

    invoke-direct {v0, p0, p1}, Lw4/f0;-><init>(Lw4/a0;Lw4/b0;)V

    iput-object v0, p0, Lw4/a0;->j:Lr4/n;

    return-object p0
.end method

.method public H(F)Lw4/a0;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    const-string v1, "Transparency must be in the range [0..1]"

    invoke-static {v0, v1}, Lc4/s;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lw4/a0;->o:F

    return-object p0
.end method

.method public I(Z)Lw4/a0;
    .locals 0

    iput-boolean p1, p0, Lw4/a0;->l:Z

    return-object p0
.end method

.method public J(F)Lw4/a0;
    .locals 0

    iput p1, p0, Lw4/a0;->m:F

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lw4/a0;->j:Lr4/n;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ld4/c;->k(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lw4/a0;->F()Z

    move-result v1

    invoke-static {p1, v0, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lw4/a0;->E()F

    move-result v1

    invoke-static {p1, v0, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lw4/a0;->C()Z

    move-result v1

    invoke-static {p1, v0, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    invoke-virtual {p0}, Lw4/a0;->D()F

    move-result v1

    invoke-static {p1, v0, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
