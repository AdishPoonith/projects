.class public final Lu1/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/media/AudioAttributes;


# direct methods
.method private constructor <init>(Lu1/e;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iget v1, p1, Lu1/e;->j:I

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    iget v1, p1, Lu1/e;->k:I

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    iget v1, p1, Lu1/e;->l:I

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    sget v1, Lp3/n0;->a:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    iget v2, p1, Lu1/e;->m:I

    invoke-static {v0, v2}, Lu1/e$b;->a(Landroid/media/AudioAttributes$Builder;I)V

    :cond_0
    const/16 v2, 0x20

    if-lt v1, v2, :cond_1

    iget p1, p1, Lu1/e;->n:I

    invoke-static {v0, p1}, Lu1/e$c;->a(Landroid/media/AudioAttributes$Builder;I)V

    :cond_1
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, p0, Lu1/e$d;->a:Landroid/media/AudioAttributes;

    return-void
.end method

.method synthetic constructor <init>(Lu1/e;Lu1/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu1/e$d;-><init>(Lu1/e;)V

    return-void
.end method
