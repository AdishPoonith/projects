.class public Lw4/v;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw4/v;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final j:Lw4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw4/r0;

    invoke-direct {v0}, Lw4/r0;-><init>()V

    sput-object v0, Lw4/v;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Ld4/a;-><init>()V

    new-instance v0, Lw4/a;

    invoke-static {p1}, Lk4/b$a;->x(Landroid/os/IBinder;)Lk4/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lw4/a;-><init>(Lk4/b;)V

    iput-object v0, p0, Lw4/v;->j:Lw4/a;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lw4/v;->j:Lw4/a;

    invoke-virtual {v0}, Lw4/a;->a()Lk4/b;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Ld4/c;->k(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, p2}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
