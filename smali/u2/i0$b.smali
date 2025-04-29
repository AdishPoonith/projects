.class public final Lu2/i0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/u$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lo3/l$a;

.field private b:Lu2/c0$a;

.field private c:Lw1/b0;

.field private d:Lo3/g0;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo3/l$a;)V
    .locals 1

    new-instance v0, Lx1/i;

    invoke-direct {v0}, Lx1/i;-><init>()V

    invoke-direct {p0, p1, v0}, Lu2/i0$b;-><init>(Lo3/l$a;Lx1/r;)V

    return-void
.end method

.method public constructor <init>(Lo3/l$a;Lu2/c0$a;)V
    .locals 6

    new-instance v3, Lw1/l;

    invoke-direct {v3}, Lw1/l;-><init>()V

    new-instance v4, Lo3/x;

    invoke-direct {v4}, Lo3/x;-><init>()V

    const/high16 v5, 0x100000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lu2/i0$b;-><init>(Lo3/l$a;Lu2/c0$a;Lw1/b0;Lo3/g0;I)V

    return-void
.end method

.method public constructor <init>(Lo3/l$a;Lu2/c0$a;Lw1/b0;Lo3/g0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/i0$b;->a:Lo3/l$a;

    iput-object p2, p0, Lu2/i0$b;->b:Lu2/c0$a;

    iput-object p3, p0, Lu2/i0$b;->c:Lw1/b0;

    iput-object p4, p0, Lu2/i0$b;->d:Lo3/g0;

    iput p5, p0, Lu2/i0$b;->e:I

    return-void
.end method

.method public constructor <init>(Lo3/l$a;Lx1/r;)V
    .locals 1

    new-instance v0, Lu2/j0;

    invoke-direct {v0, p2}, Lu2/j0;-><init>(Lx1/r;)V

    invoke-direct {p0, p1, v0}, Lu2/i0$b;-><init>(Lo3/l$a;Lu2/c0$a;)V

    return-void
.end method

.method public static synthetic a(Lx1/r;Lt1/t1;)Lu2/c0;
    .locals 0

    invoke-static {p0, p1}, Lu2/i0$b;->c(Lx1/r;Lt1/t1;)Lu2/c0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Lx1/r;Lt1/t1;)Lu2/c0;
    .locals 0

    new-instance p1, Lu2/c;

    invoke-direct {p1, p0}, Lu2/c;-><init>(Lx1/r;)V

    return-object p1
.end method


# virtual methods
.method public b(Ls1/v1;)Lu2/i0;
    .locals 8

    iget-object v0, p1, Ls1/v1;->k:Ls1/v1$h;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Ls1/v1;->k:Ls1/v1$h;

    iget-object v1, v0, Ls1/v1$h;->h:Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lu2/i0$b;->g:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v0, v0, Ls1/v1$h;->e:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lu2/i0$b;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ls1/v1;->b()Ls1/v1$c;

    move-result-object p1

    iget-object v0, p0, Lu2/i0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ls1/v1$c;->d(Ljava/lang/Object;)Ls1/v1$c;

    move-result-object p1

    :goto_2
    iget-object v0, p0, Lu2/i0$b;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ls1/v1$c;->b(Ljava/lang/String;)Ls1/v1$c;

    move-result-object p1

    goto :goto_3

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ls1/v1;->b()Ls1/v1$c;

    move-result-object p1

    iget-object v0, p0, Lu2/i0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ls1/v1$c;->d(Ljava/lang/Object;)Ls1/v1$c;

    move-result-object p1

    :goto_3
    invoke-virtual {p1}, Ls1/v1$c;->a()Ls1/v1;

    move-result-object p1

    goto :goto_4

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {p1}, Ls1/v1;->b()Ls1/v1$c;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_4
    move-object v1, p1

    new-instance p1, Lu2/i0;

    iget-object v2, p0, Lu2/i0$b;->a:Lo3/l$a;

    iget-object v3, p0, Lu2/i0$b;->b:Lu2/c0$a;

    iget-object v0, p0, Lu2/i0$b;->c:Lw1/b0;

    invoke-interface {v0, v1}, Lw1/b0;->a(Ls1/v1;)Lw1/y;

    move-result-object v4

    iget-object v5, p0, Lu2/i0$b;->d:Lo3/g0;

    iget v6, p0, Lu2/i0$b;->e:I

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lu2/i0;-><init>(Ls1/v1;Lo3/l$a;Lu2/c0$a;Lw1/y;Lo3/g0;ILu2/i0$a;)V

    return-object p1
.end method
