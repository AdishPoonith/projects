.class public Landroidx/core/view/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/d0$k;,
        Landroidx/core/view/d0$l;,
        Landroidx/core/view/d0$j;,
        Landroidx/core/view/d0$i;,
        Landroidx/core/view/d0$h;,
        Landroidx/core/view/d0$g;,
        Landroidx/core/view/d0$m;,
        Landroidx/core/view/d0$b;,
        Landroidx/core/view/d0$a;,
        Landroidx/core/view/d0$n;,
        Landroidx/core/view/d0$e;,
        Landroidx/core/view/d0$d;,
        Landroidx/core/view/d0$c;,
        Landroidx/core/view/d0$f;
    }
.end annotation


# static fields
.field public static final b:Landroidx/core/view/d0;


# instance fields
.field private final a:Landroidx/core/view/d0$l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Landroidx/core/view/d0$k;->q:Landroidx/core/view/d0;

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/core/view/d0$l;->b:Landroidx/core/view/d0;

    :goto_0
    sput-object v0, Landroidx/core/view/d0;->b:Landroidx/core/view/d0;

    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/core/view/d0$k;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/d0$k;-><init>(Landroidx/core/view/d0;Landroid/view/WindowInsets;)V

    :goto_0
    iput-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Landroidx/core/view/d0$j;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/d0$j;-><init>(Landroidx/core/view/d0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    new-instance v0, Landroidx/core/view/d0$i;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/d0$i;-><init>(Landroidx/core/view/d0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_2
    new-instance v0, Landroidx/core/view/d0$h;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/d0$h;-><init>(Landroidx/core/view/d0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public constructor <init>(Landroidx/core/view/d0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    iget-object p1, p1, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, Landroidx/core/view/d0$k;

    if-eqz v1, :cond_0

    new-instance v0, Landroidx/core/view/d0$k;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/d0$k;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/d0$k;-><init>(Landroidx/core/view/d0;Landroidx/core/view/d0$k;)V

    :goto_0
    iput-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    instance-of v1, p1, Landroidx/core/view/d0$j;

    if-eqz v1, :cond_1

    new-instance v0, Landroidx/core/view/d0$j;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/d0$j;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/d0$j;-><init>(Landroidx/core/view/d0;Landroidx/core/view/d0$j;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    instance-of v0, p1, Landroidx/core/view/d0$i;

    if-eqz v0, :cond_2

    new-instance v0, Landroidx/core/view/d0$i;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/d0$i;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/d0$i;-><init>(Landroidx/core/view/d0;Landroidx/core/view/d0$i;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Landroidx/core/view/d0$h;

    if-eqz v0, :cond_3

    new-instance v0, Landroidx/core/view/d0$h;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/d0$h;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/d0$h;-><init>(Landroidx/core/view/d0;Landroidx/core/view/d0$h;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Landroidx/core/view/d0$g;

    if-eqz v0, :cond_4

    new-instance v0, Landroidx/core/view/d0$g;

    move-object v1, p1

    check-cast v1, Landroidx/core/view/d0$g;

    invoke-direct {v0, p0, v1}, Landroidx/core/view/d0$g;-><init>(Landroidx/core/view/d0;Landroidx/core/view/d0$g;)V

    goto :goto_0

    :cond_4
    new-instance v0, Landroidx/core/view/d0$l;

    invoke-direct {v0, p0}, Landroidx/core/view/d0$l;-><init>(Landroidx/core/view/d0;)V

    goto :goto_0

    :goto_1
    invoke-virtual {p1, p0}, Landroidx/core/view/d0$l;->e(Landroidx/core/view/d0;)V

    goto :goto_2

    :cond_5
    new-instance p1, Landroidx/core/view/d0$l;

    invoke-direct {p1, p0}, Landroidx/core/view/d0$l;-><init>(Landroidx/core/view/d0;)V

    iput-object p1, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    :goto_2
    return-void
.end method

.method public static r(Landroid/view/WindowInsets;)Landroidx/core/view/d0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/core/view/d0;->s(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/d0;

    move-result-object p0

    return-object p0
.end method

.method public static s(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/d0;
    .locals 1

    new-instance v0, Landroidx/core/view/d0;

    invoke-static {p0}, Landroidx/core/util/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, Landroidx/core/view/d0;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroidx/core/view/t;->t(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Landroidx/core/view/t;->n(Landroid/view/View;)Landroidx/core/view/d0;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/core/view/d0;->o(Landroidx/core/view/d0;)V

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/core/view/d0;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Landroidx/core/view/d0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->a()Landroidx/core/view/d0;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroidx/core/view/d0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->b()Landroidx/core/view/d0;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroidx/core/view/d0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->c()Landroidx/core/view/d0;

    move-result-object v0

    return-object v0
.end method

.method d(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/d0$l;->d(Landroid/view/View;)V

    return-void
.end method

.method public e()Landroidx/core/view/c;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->f()Landroidx/core/view/c;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/core/view/d0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Landroidx/core/view/d0;

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    iget-object p1, p1, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-static {v0, p1}, Landroidx/core/util/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(I)Landroidx/core/graphics/b;
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/d0$l;->g(I)Landroidx/core/graphics/b;

    move-result-object p1

    return-object p1
.end method

.method public g()Landroidx/core/graphics/b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->i()Landroidx/core/graphics/b;

    move-result-object v0

    return-object v0
.end method

.method public h()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->k()Landroidx/core/graphics/b;

    move-result-object v0

    iget v0, v0, Landroidx/core/graphics/b;->d:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/core/view/d0$l;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->k()Landroidx/core/graphics/b;

    move-result-object v0

    iget v0, v0, Landroidx/core/graphics/b;->a:I

    return v0
.end method

.method public j()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->k()Landroidx/core/graphics/b;

    move-result-object v0

    iget v0, v0, Landroidx/core/graphics/b;->c:I

    return v0
.end method

.method public k()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0}, Landroidx/core/view/d0$l;->k()Landroidx/core/graphics/b;

    move-result-object v0

    iget v0, v0, Landroidx/core/graphics/b;->b:I

    return v0
.end method

.method public l(IIII)Landroidx/core/view/d0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Landroidx/core/view/d0$b;

    invoke-direct {v0, p0}, Landroidx/core/view/d0$b;-><init>(Landroidx/core/view/d0;)V

    invoke-static {p1, p2, p3, p4}, Landroidx/core/graphics/b;->b(IIII)Landroidx/core/graphics/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/core/view/d0$b;->c(Landroidx/core/graphics/b;)Landroidx/core/view/d0$b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/view/d0$b;->a()Landroidx/core/view/d0;

    move-result-object p1

    return-object p1
.end method

.method m([Landroidx/core/graphics/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/d0$l;->o([Landroidx/core/graphics/b;)V

    return-void
.end method

.method n(Landroidx/core/graphics/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/d0$l;->p(Landroidx/core/graphics/b;)V

    return-void
.end method

.method o(Landroidx/core/view/d0;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/d0$l;->q(Landroidx/core/view/d0;)V

    return-void
.end method

.method p(Landroidx/core/graphics/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    invoke-virtual {v0, p1}, Landroidx/core/view/d0$l;->r(Landroidx/core/graphics/b;)V

    return-void
.end method

.method public q()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, Landroidx/core/view/d0;->a:Landroidx/core/view/d0$l;

    instance-of v1, v0, Landroidx/core/view/d0$g;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/core/view/d0$g;

    iget-object v0, v0, Landroidx/core/view/d0$g;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
