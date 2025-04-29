.class public Lc4/f;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc4/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Lc4/u;

.field private final k:Z

.field private final l:Z

.field private final m:[I

.field private final n:I

.field private final o:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc4/k1;

    invoke-direct {v0}, Lc4/k1;-><init>()V

    sput-object v0, Lc4/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lc4/u;ZZ[II[I)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput-object p1, p0, Lc4/f;->j:Lc4/u;

    iput-boolean p2, p0, Lc4/f;->k:Z

    iput-boolean p3, p0, Lc4/f;->l:Z

    iput-object p4, p0, Lc4/f;->m:[I

    iput p5, p0, Lc4/f;->n:I

    iput-object p6, p0, Lc4/f;->o:[I

    return-void
.end method


# virtual methods
.method public B()I
    .locals 1

    iget v0, p0, Lc4/f;->n:I

    return v0
.end method

.method public C()[I
    .locals 1

    iget-object v0, p0, Lc4/f;->m:[I

    return-object v0
.end method

.method public D()[I
    .locals 1

    iget-object v0, p0, Lc4/f;->o:[I

    return-object v0
.end method

.method public E()Z
    .locals 1

    iget-boolean v0, p0, Lc4/f;->k:Z

    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Lc4/f;->l:Z

    return v0
.end method

.method public final G()Lc4/u;
    .locals 1

    iget-object v0, p0, Lc4/f;->j:Lc4/u;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lc4/f;->j:Lc4/u;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lc4/f;->E()Z

    move-result p2

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lc4/f;->F()Z

    move-result p2

    const/4 v1, 0x3

    invoke-static {p1, v1, p2}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lc4/f;->C()[I

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Ld4/c;->m(Landroid/os/Parcel;I[IZ)V

    invoke-virtual {p0}, Lc4/f;->B()I

    move-result p2

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lc4/f;->D()[I

    move-result-object p2

    const/4 v1, 0x6

    invoke-static {p1, v1, p2, v3}, Ld4/c;->m(Landroid/os/Parcel;I[IZ)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
