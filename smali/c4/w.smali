.class public Lc4/w;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc4/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:I

.field private k:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc4/b0;

    invoke-direct {v0}, Lc4/b0;-><init>()V

    sput-object v0, Lc4/w;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    iput p1, p0, Lc4/w;->j:I

    iput-object p2, p0, Lc4/w;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final B()I
    .locals 1

    iget v0, p0, Lc4/w;->j:I

    return v0
.end method

.method public final C()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lc4/w;->k:Ljava/util/List;

    return-object v0
.end method

.method public final D(Lc4/p;)V
    .locals 1

    iget-object v0, p0, Lc4/w;->k:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc4/w;->k:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lc4/w;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lc4/w;->j:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Ld4/c;->l(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lc4/w;->k:Ljava/util/List;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
