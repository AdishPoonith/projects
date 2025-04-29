.class final Ls1/x0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/j;
.implements Lr3/a;
.implements Ls1/g3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private j:Lq3/j;

.field private k:Lr3/a;

.field private l:Lq3/j;

.field private m:Lr3/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ls1/x0$a;)V
    .locals 0

    invoke-direct {p0}, Ls1/x0$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J[F)V
    .locals 1

    iget-object v0, p0, Ls1/x0$d;->m:Lr3/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lr3/a;->a(J[F)V

    :cond_0
    iget-object v0, p0, Ls1/x0$d;->k:Lr3/a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lr3/a;->a(J[F)V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Ls1/x0$d;->m:Lr3/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr3/a;->c()V

    :cond_0
    iget-object v0, p0, Ls1/x0$d;->k:Lr3/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lr3/a;->c()V

    :cond_1
    return-void
.end method

.method public g(JJLs1/n1;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object v0, p0, Ls1/x0$d;->l:Lq3/j;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lq3/j;->g(JJLs1/n1;Landroid/media/MediaFormat;)V

    :cond_0
    iget-object v1, p0, Ls1/x0$d;->j:Lq3/j;

    if-eqz v1, :cond_1

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lq3/j;->g(JJLs1/n1;Landroid/media/MediaFormat;)V

    :cond_1
    return-void
.end method

.method public m(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p2, Lr3/d;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Ls1/x0$d;->l:Lq3/j;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lr3/d;->getVideoFrameMetadataListener()Lq3/j;

    move-result-object p1

    iput-object p1, p0, Ls1/x0$d;->l:Lq3/j;

    invoke-virtual {p2}, Lr3/d;->getCameraMotionListener()Lr3/a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ls1/x0$d;->m:Lr3/a;

    goto :goto_1

    :cond_2
    check-cast p2, Lr3/a;

    iput-object p2, p0, Ls1/x0$d;->k:Lr3/a;

    goto :goto_1

    :cond_3
    check-cast p2, Lq3/j;

    iput-object p2, p0, Ls1/x0$d;->j:Lq3/j;

    :goto_1
    return-void
.end method
