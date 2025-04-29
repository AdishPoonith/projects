.class public Lc4/u;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc4/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:I

.field private final k:Z

.field private final l:Z

.field private final m:I

.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc4/b1;

    invoke-direct {v0}, Lc4/b1;-><init>()V

    sput-object v0, Lc4/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lc4/u;->j:I

    iput-boolean p2, p0, Lc4/u;->k:Z

    iput-boolean p3, p0, Lc4/u;->l:Z

    iput p4, p0, Lc4/u;->m:I

    iput p5, p0, Lc4/u;->n:I

    return-void
.end method


# virtual methods
.method public B()I
    .locals 1

    iget v0, p0, Lc4/u;->m:I

    return v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lc4/u;->n:I

    return v0
.end method

.method public D()Z
    .locals 1

    iget-boolean v0, p0, Lc4/u;->k:Z

    return v0
.end method

.method public E()Z
    .locals 1

    iget-boolean v0, p0, Lc4/u;->l:Z

    return v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Lc4/u;->j:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lc4/u;->F()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lc4/u;->D()Z

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lc4/u;->E()Z

    move-result v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lc4/u;->B()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lc4/u;->C()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
