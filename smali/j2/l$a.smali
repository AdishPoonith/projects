.class public final Lj2/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lj2/n;

.field public final b:Landroid/media/MediaFormat;

.field public final c:Ls1/n1;

.field public final d:Landroid/view/Surface;

.field public final e:Landroid/media/MediaCrypto;

.field public final f:I


# direct methods
.method private constructor <init>(Lj2/n;Landroid/media/MediaFormat;Ls1/n1;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj2/l$a;->a:Lj2/n;

    iput-object p2, p0, Lj2/l$a;->b:Landroid/media/MediaFormat;

    iput-object p3, p0, Lj2/l$a;->c:Ls1/n1;

    iput-object p4, p0, Lj2/l$a;->d:Landroid/view/Surface;

    iput-object p5, p0, Lj2/l$a;->e:Landroid/media/MediaCrypto;

    iput p6, p0, Lj2/l$a;->f:I

    return-void
.end method

.method public static a(Lj2/n;Landroid/media/MediaFormat;Ls1/n1;Landroid/media/MediaCrypto;)Lj2/l$a;
    .locals 8

    new-instance v7, Lj2/l$a;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Lj2/l$a;-><init>(Lj2/n;Landroid/media/MediaFormat;Ls1/n1;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-object v7
.end method

.method public static b(Lj2/n;Landroid/media/MediaFormat;Ls1/n1;Landroid/view/Surface;Landroid/media/MediaCrypto;)Lj2/l$a;
    .locals 8

    new-instance v7, Lj2/l$a;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lj2/l$a;-><init>(Lj2/n;Landroid/media/MediaFormat;Ls1/n1;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-object v7
.end method
