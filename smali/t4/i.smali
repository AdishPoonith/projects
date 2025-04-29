.class public final Lt4/i;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lt4/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Z

.field private final k:Z

.field private final l:Z

.field private final m:Z

.field private final n:Z

.field private final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt4/m;

    invoke-direct {v0}, Lt4/m;-><init>()V

    sput-object v0, Lt4/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput-boolean p1, p0, Lt4/i;->j:Z

    iput-boolean p2, p0, Lt4/i;->k:Z

    iput-boolean p3, p0, Lt4/i;->l:Z

    iput-boolean p4, p0, Lt4/i;->m:Z

    iput-boolean p5, p0, Lt4/i;->n:Z

    iput-boolean p6, p0, Lt4/i;->o:Z

    return-void
.end method


# virtual methods
.method public B()Z
    .locals 1

    iget-boolean v0, p0, Lt4/i;->o:Z

    return v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lt4/i;->l:Z

    return v0
.end method

.method public D()Z
    .locals 1

    iget-boolean v0, p0, Lt4/i;->m:Z

    return v0
.end method

.method public E()Z
    .locals 1

    iget-boolean v0, p0, Lt4/i;->j:Z

    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Lt4/i;->n:Z

    return v0
.end method

.method public G()Z
    .locals 1

    iget-boolean v0, p0, Lt4/i;->k:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lt4/i;->E()Z

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lt4/i;->G()Z

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lt4/i;->C()Z

    move-result v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lt4/i;->D()Z

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lt4/i;->F()Z

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lt4/i;->B()Z

    move-result v0

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
