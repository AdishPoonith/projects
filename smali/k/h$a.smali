.class Lk/h$a;
.super Landroidx/core/view/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field final synthetic c:Lk/h;


# direct methods
.method constructor <init>(Lk/h;)V
    .locals 0

    iput-object p1, p0, Lk/h$a;->c:Lk/h;

    invoke-direct {p0}, Landroidx/core/view/b0;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk/h$a;->a:Z

    iput p1, p0, Lk/h$a;->b:I

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lk/h$a;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lk/h$a;->b:I

    iget-object v0, p0, Lk/h$a;->c:Lk/h;

    iget-object v0, v0, Lk/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lk/h$a;->c:Lk/h;

    iget-object p1, p1, Lk/h;->d:Landroidx/core/view/a0;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/core/view/a0;->b(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, Lk/h$a;->d()V

    :cond_1
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lk/h$a;->a:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lk/h$a;->a:Z

    iget-object p1, p0, Lk/h$a;->c:Lk/h;

    iget-object p1, p1, Lk/h;->d:Landroidx/core/view/a0;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/core/view/a0;->c(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method d()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk/h$a;->b:I

    iput-boolean v0, p0, Lk/h$a;->a:Z

    iget-object v0, p0, Lk/h$a;->c:Lk/h;

    invoke-virtual {v0}, Lk/h;->b()V

    return-void
.end method
