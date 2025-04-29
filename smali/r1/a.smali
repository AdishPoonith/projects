.class public final Lr1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr1/a;

    invoke-direct {v0}, Lr1/a;-><init>()V

    sput-object v0, Lr1/a;->a:Lr1/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lp0/a;Landroid/net/Uri;Lp0/j0$b;)Lp0/j0;
    .locals 11

    const-string v0, "imageUri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lf1/l0;->a:Lf1/l0;

    invoke-static {p1}, Lf1/l0;->V(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lr1/a;->b(Lp0/a;Ljava/io/File;Lp0/j0$b;)Lp0/j0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1}, Lf1/l0;->S(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lp0/j0$g;

    const-string v1, "image/png"

    invoke-direct {v0, p1, v1}, Lp0/j0$g;-><init>(Landroid/os/Parcelable;Ljava/lang/String;)V

    new-instance v5, Landroid/os/Bundle;

    const/4 p1, 0x1

    invoke-direct {v5, p1}, Landroid/os/Bundle;-><init>(I)V

    const-string p1, "file"

    invoke-virtual {v5, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance p1, Lp0/j0;

    sget-object v6, Lp0/p0;->k:Lp0/p0;

    const/4 v8, 0x0

    const/16 v9, 0x20

    const/4 v10, 0x0

    const-string v4, "me/staging_resources"

    move-object v2, p1

    move-object v3, p0

    move-object v7, p2

    invoke-direct/range {v2 .. v10}, Lp0/j0;-><init>(Lp0/a;Ljava/lang/String;Landroid/os/Bundle;Lp0/p0;Lp0/j0$b;Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    return-object p1

    :cond_1
    new-instance p0, Lp0/s;

    const-string p1, "The image Uri must be either a file:// or content:// Uri"

    invoke-direct {p0, p1}, Lp0/s;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lp0/a;Ljava/io/File;Lp0/j0$b;)Lp0/j0;
    .locals 11

    const/high16 v0, 0x10000000

    invoke-static {p1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    new-instance v0, Lp0/j0$g;

    const-string v1, "image/png"

    invoke-direct {v0, p1, v1}, Lp0/j0$g;-><init>(Landroid/os/Parcelable;Ljava/lang/String;)V

    new-instance v5, Landroid/os/Bundle;

    const/4 p1, 0x1

    invoke-direct {v5, p1}, Landroid/os/Bundle;-><init>(I)V

    const-string p1, "file"

    invoke-virtual {v5, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance p1, Lp0/j0;

    sget-object v6, Lp0/p0;->k:Lp0/p0;

    const-string v4, "me/staging_resources"

    const/4 v8, 0x0

    const/16 v9, 0x20

    const/4 v10, 0x0

    move-object v2, p1

    move-object v3, p0

    move-object v7, p2

    invoke-direct/range {v2 .. v10}, Lp0/j0;-><init>(Lp0/a;Ljava/lang/String;Landroid/os/Bundle;Lp0/p0;Lp0/j0$b;Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    return-object p1
.end method
