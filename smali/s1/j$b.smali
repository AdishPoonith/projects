.class public final Ls1/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:J

.field private d:F

.field private e:J

.field private f:J

.field private g:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3f7851ec    # 0.97f

    iput v0, p0, Ls1/j$b;->a:F

    const v0, 0x3f83d70a    # 1.03f

    iput v0, p0, Ls1/j$b;->b:F

    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Ls1/j$b;->c:J

    const v0, 0x33d6bf95    # 1.0E-7f

    iput v0, p0, Ls1/j$b;->d:F

    const-wide/16 v0, 0x14

    invoke-static {v0, v1}, Lp3/n0;->B0(J)J

    move-result-wide v0

    iput-wide v0, p0, Ls1/j$b;->e:J

    const-wide/16 v0, 0x1f4

    invoke-static {v0, v1}, Lp3/n0;->B0(J)J

    move-result-wide v0

    iput-wide v0, p0, Ls1/j$b;->f:J

    const v0, 0x3f7fbe77    # 0.999f

    iput v0, p0, Ls1/j$b;->g:F

    return-void
.end method


# virtual methods
.method public a()Ls1/j;
    .locals 13

    new-instance v12, Ls1/j;

    iget v1, p0, Ls1/j$b;->a:F

    iget v2, p0, Ls1/j$b;->b:F

    iget-wide v3, p0, Ls1/j$b;->c:J

    iget v5, p0, Ls1/j$b;->d:F

    iget-wide v6, p0, Ls1/j$b;->e:J

    iget-wide v8, p0, Ls1/j$b;->f:J

    iget v10, p0, Ls1/j$b;->g:F

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Ls1/j;-><init>(FFJFJJFLs1/j$a;)V

    return-object v12
.end method
