.class public Lk/f;
.super Landroid/view/ActionMode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk/f$a;
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lk/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lk/b;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Lk/f;->a:Landroid/content/Context;

    iput-object p2, p0, Lk/f;->b:Lk/b;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->c()V

    return-void
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, Ll/d;

    iget-object v1, p0, Lk/f;->a:Landroid/content/Context;

    iget-object v2, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v2}, Lk/b;->e()Landroid/view/Menu;

    move-result-object v2

    check-cast v2, Lu/a;

    invoke-direct {v0, v1, v2}, Ll/d;-><init>(Landroid/content/Context;Lu/a;)V

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->f()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->h()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->i()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->j()Z

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->k()V

    return-void
.end method

.method public isTitleOptional()Z
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0}, Lk/b;->l()Z

    move-result v0

    return v0
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0, p1}, Lk/b;->m(Landroid/view/View;)V

    return-void
.end method

.method public setSubtitle(I)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0, p1}, Lk/b;->n(I)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0, p1}, Lk/b;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0, p1}, Lk/b;->p(Ljava/lang/Object;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0, p1}, Lk/b;->q(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0, p1}, Lk/b;->r(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Lk/b;

    invoke-virtual {v0, p1}, Lk/b;->s(Z)V

    return-void
.end method
