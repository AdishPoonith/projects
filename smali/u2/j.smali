.class public final Lu2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/u$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/j$a;
    }
.end annotation


# instance fields
.field private final a:Lu2/j$a;

.field private b:Lo3/l$a;

.field private c:J

.field private d:J

.field private e:J

.field private f:F

.field private g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx1/r;)V
    .locals 1

    new-instance v0, Lo3/t$a;

    invoke-direct {v0, p1}, Lo3/t$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lu2/j;-><init>(Lo3/l$a;Lx1/r;)V

    return-void
.end method

.method public constructor <init>(Lo3/l$a;Lx1/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/j;->b:Lo3/l$a;

    new-instance v0, Lu2/j$a;

    invoke-direct {v0, p2}, Lu2/j$a;-><init>(Lx1/r;)V

    iput-object v0, p0, Lu2/j;->a:Lu2/j$a;

    invoke-virtual {v0, p1}, Lu2/j$a;->a(Lo3/l$a;)V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lu2/j;->c:J

    iput-wide p1, p0, Lu2/j;->d:J

    iput-wide p1, p0, Lu2/j;->e:J

    const p1, -0x800001

    iput p1, p0, Lu2/j;->f:F

    iput p1, p0, Lu2/j;->g:F

    return-void
.end method
