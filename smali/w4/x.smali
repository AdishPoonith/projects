.class public final Lw4/x;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Lw4/w;

.field private final k:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/t0;

    invoke-direct {v0}, Lw4/t0;-><init>()V

    sput-object v0, Lw4/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lw4/w;D)V
    .locals 3

    invoke-direct {p0}, Ld4/a;-><init>()V

    const-wide/16 v0, 0x0

    cmpg-double v2, p2, v0

    if-lez v2, :cond_0

    iput-object p1, p0, Lw4/x;->j:Lw4/w;

    iput-wide p2, p0, Lw4/x;->k:D

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A style must be applied to some segments on a polyline."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public B()D
    .locals 2

    iget-wide v0, p0, Lw4/x;->k:D

    return-wide v0
.end method

.method public C()Lw4/w;
    .locals 1

    iget-object v0, p0, Lw4/x;->j:Lw4/w;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lw4/x;->C()Lw4/w;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lw4/x;->B()D

    move-result-wide v1

    const/4 p2, 0x3

    invoke-static {p1, p2, v1, v2}, Ld4/c;->h(Landroid/os/Parcel;ID)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
