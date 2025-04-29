.class public final Lw4/w;
.super Ld4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw4/w$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:F

.field private final k:I

.field private final l:I

.field private final m:Z

.field private final n:Lw4/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/s0;

    invoke-direct {v0}, Lw4/s0;-><init>()V

    sput-object v0, Lw4/w;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(FIIZLw4/v;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lw4/w;->j:F

    iput p2, p0, Lw4/w;->k:I

    iput p3, p0, Lw4/w;->l:I

    iput-boolean p4, p0, Lw4/w;->m:Z

    iput-object p5, p0, Lw4/w;->n:Lw4/v;

    return-void
.end method


# virtual methods
.method public B()Lw4/v;
    .locals 1

    iget-object v0, p0, Lw4/w;->n:Lw4/v;

    return-object v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lw4/w;->m:Z

    return v0
.end method

.method public final D()F
    .locals 1

    iget v0, p0, Lw4/w;->j:F

    return v0
.end method

.method public final E()Landroid/util/Pair;
    .locals 3

    new-instance v0, Landroid/util/Pair;

    iget v1, p0, Lw4/w;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lw4/w;->l:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lw4/w;->j:F

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Ld4/c;->i(Landroid/os/Parcel;IF)V

    iget v1, p0, Lw4/w;->k:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget v1, p0, Lw4/w;->l:I

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Ld4/c;->l(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw4/w;->C()Z

    move-result v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw4/w;->B()Lw4/v;

    move-result-object v1

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
