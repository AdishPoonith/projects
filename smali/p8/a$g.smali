.class public final Lp8/a$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public a:F

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp8/a$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lp8/a$g;->a:F

    const/4 v0, 0x0

    iput v0, p0, Lp8/a$g;->b:I

    iput v0, p0, Lp8/a$g;->c:I

    iput v0, p0, Lp8/a$g;->d:I

    iput v0, p0, Lp8/a$g;->e:I

    iput v0, p0, Lp8/a$g;->f:I

    iput v0, p0, Lp8/a$g;->g:I

    iput v0, p0, Lp8/a$g;->h:I

    iput v0, p0, Lp8/a$g;->i:I

    iput v0, p0, Lp8/a$g;->j:I

    iput v0, p0, Lp8/a$g;->k:I

    iput v0, p0, Lp8/a$g;->l:I

    iput v0, p0, Lp8/a$g;->m:I

    iput v0, p0, Lp8/a$g;->n:I

    iput v0, p0, Lp8/a$g;->o:I

    const/4 v0, -0x1

    iput v0, p0, Lp8/a$g;->p:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp8/a$g;->q:Ljava/util/List;

    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    iget v0, p0, Lp8/a$g;->b:I

    if-lez v0, :cond_0

    iget v0, p0, Lp8/a$g;->c:I

    if-lez v0, :cond_0

    iget v0, p0, Lp8/a$g;->a:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
