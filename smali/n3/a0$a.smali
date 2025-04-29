.class public Ln3/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Z

.field private l:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:I

.field private p:I

.field private q:I

.field private r:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private s:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:I

.field private u:I

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lu2/t0;",
            "Ln3/y;",
            ">;"
        }
    .end annotation
.end field

.field private z:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Ln3/a0$a;->a:I

    iput v0, p0, Ln3/a0$a;->b:I

    iput v0, p0, Ln3/a0$a;->c:I

    iput v0, p0, Ln3/a0$a;->d:I

    iput v0, p0, Ln3/a0$a;->i:I

    iput v0, p0, Ln3/a0$a;->j:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Ln3/a0$a;->k:Z

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v1

    iput-object v1, p0, Ln3/a0$a;->l:Lcom/google/common/collect/q;

    const/4 v1, 0x0

    iput v1, p0, Ln3/a0$a;->m:I

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v2

    iput-object v2, p0, Ln3/a0$a;->n:Lcom/google/common/collect/q;

    iput v1, p0, Ln3/a0$a;->o:I

    iput v0, p0, Ln3/a0$a;->p:I

    iput v0, p0, Ln3/a0$a;->q:I

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0$a;->r:Lcom/google/common/collect/q;

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0$a;->s:Lcom/google/common/collect/q;

    iput v1, p0, Ln3/a0$a;->t:I

    iput v1, p0, Ln3/a0$a;->u:I

    iput-boolean v1, p0, Ln3/a0$a;->v:Z

    iput-boolean v1, p0, Ln3/a0$a;->w:Z

    iput-boolean v1, p0, Ln3/a0$a;->x:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ln3/a0$a;->y:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ln3/a0$a;->z:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ln3/a0$a;-><init>()V

    invoke-virtual {p0, p1}, Ln3/a0$a;->E(Landroid/content/Context;)Ln3/a0$a;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ln3/a0$a;->H(Landroid/content/Context;Z)Ln3/a0$a;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Bundle;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ln3/a0;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ln3/a0;->J:Ln3/a0;

    iget v2, v1, Ln3/a0;->j:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->a:I

    invoke-static {}, Ln3/a0;->b()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->k:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->b:I

    invoke-static {}, Ln3/a0;->m()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->l:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->c:I

    invoke-static {}, Ln3/a0;->t()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->m:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->d:I

    invoke-static {}, Ln3/a0;->u()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->n:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->e:I

    invoke-static {}, Ln3/a0;->v()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->o:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->f:I

    invoke-static {}, Ln3/a0;->w()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->p:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->g:I

    invoke-static {}, Ln3/a0;->x()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->q:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->h:I

    invoke-static {}, Ln3/a0;->y()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->r:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->i:I

    invoke-static {}, Ln3/a0;->z()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln3/a0;->s:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->j:I

    invoke-static {}, Ln3/a0;->c()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Ln3/a0;->t:Z

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ln3/a0$a;->k:Z

    invoke-static {}, Ln3/a0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lb5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/collect/q;->w([Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0$a;->l:Lcom/google/common/collect/q;

    invoke-static {}, Ln3/a0;->e()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln3/a0;->v:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->m:I

    invoke-static {}, Ln3/a0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lb5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Ln3/a0$a;->C([Ljava/lang/String;)Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0$a;->n:Lcom/google/common/collect/q;

    invoke-static {}, Ln3/a0;->g()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln3/a0;->x:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->o:I

    invoke-static {}, Ln3/a0;->h()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln3/a0;->y:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->p:I

    invoke-static {}, Ln3/a0;->i()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln3/a0;->z:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->q:I

    invoke-static {}, Ln3/a0;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lb5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/collect/q;->w([Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0$a;->r:Lcom/google/common/collect/q;

    invoke-static {}, Ln3/a0;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lb5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Ln3/a0$a;->C([Ljava/lang/String;)Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0$a;->s:Lcom/google/common/collect/q;

    invoke-static {}, Ln3/a0;->l()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln3/a0;->C:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->t:I

    invoke-static {}, Ln3/a0;->n()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln3/a0;->D:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln3/a0$a;->u:I

    invoke-static {}, Ln3/a0;->o()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Ln3/a0;->E:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ln3/a0$a;->v:Z

    invoke-static {}, Ln3/a0;->p()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Ln3/a0;->F:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ln3/a0$a;->w:Z

    invoke-static {}, Ln3/a0;->q()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, v1, Ln3/a0;->G:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ln3/a0$a;->x:Z

    invoke-static {}, Ln3/a0;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Ln3/y;->n:Ls1/h$a;

    invoke-static {v1, v0}, Lp3/c;->b(Ls1/h$a;Ljava/util/List;)Lcom/google/common/collect/q;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ln3/a0$a;->y:Ljava/util/HashMap;

    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln3/y;

    iget-object v4, p0, Ln3/a0$a;->y:Ljava/util/HashMap;

    iget-object v5, v3, Ln3/y;->j:Lu2/t0;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Ln3/a0;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    new-array v0, v2, [I

    invoke-static {p1, v0}, Lb5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ln3/a0$a;->z:Ljava/util/HashSet;

    array-length v0, p1

    :goto_2
    if-ge v2, v0, :cond_2

    aget v1, p1, v2

    iget-object v3, p0, Ln3/a0$a;->z:Ljava/util/HashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method protected constructor <init>(Ln3/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Ln3/a0$a;->B(Ln3/a0;)V

    return-void
.end method

.method private B(Ln3/a0;)V
    .locals 2

    iget v0, p1, Ln3/a0;->j:I

    iput v0, p0, Ln3/a0$a;->a:I

    iget v0, p1, Ln3/a0;->k:I

    iput v0, p0, Ln3/a0$a;->b:I

    iget v0, p1, Ln3/a0;->l:I

    iput v0, p0, Ln3/a0$a;->c:I

    iget v0, p1, Ln3/a0;->m:I

    iput v0, p0, Ln3/a0$a;->d:I

    iget v0, p1, Ln3/a0;->n:I

    iput v0, p0, Ln3/a0$a;->e:I

    iget v0, p1, Ln3/a0;->o:I

    iput v0, p0, Ln3/a0$a;->f:I

    iget v0, p1, Ln3/a0;->p:I

    iput v0, p0, Ln3/a0$a;->g:I

    iget v0, p1, Ln3/a0;->q:I

    iput v0, p0, Ln3/a0$a;->h:I

    iget v0, p1, Ln3/a0;->r:I

    iput v0, p0, Ln3/a0$a;->i:I

    iget v0, p1, Ln3/a0;->s:I

    iput v0, p0, Ln3/a0$a;->j:I

    iget-boolean v0, p1, Ln3/a0;->t:Z

    iput-boolean v0, p0, Ln3/a0$a;->k:Z

    iget-object v0, p1, Ln3/a0;->u:Lcom/google/common/collect/q;

    iput-object v0, p0, Ln3/a0$a;->l:Lcom/google/common/collect/q;

    iget v0, p1, Ln3/a0;->v:I

    iput v0, p0, Ln3/a0$a;->m:I

    iget-object v0, p1, Ln3/a0;->w:Lcom/google/common/collect/q;

    iput-object v0, p0, Ln3/a0$a;->n:Lcom/google/common/collect/q;

    iget v0, p1, Ln3/a0;->x:I

    iput v0, p0, Ln3/a0$a;->o:I

    iget v0, p1, Ln3/a0;->y:I

    iput v0, p0, Ln3/a0$a;->p:I

    iget v0, p1, Ln3/a0;->z:I

    iput v0, p0, Ln3/a0$a;->q:I

    iget-object v0, p1, Ln3/a0;->A:Lcom/google/common/collect/q;

    iput-object v0, p0, Ln3/a0$a;->r:Lcom/google/common/collect/q;

    iget-object v0, p1, Ln3/a0;->B:Lcom/google/common/collect/q;

    iput-object v0, p0, Ln3/a0$a;->s:Lcom/google/common/collect/q;

    iget v0, p1, Ln3/a0;->C:I

    iput v0, p0, Ln3/a0$a;->t:I

    iget v0, p1, Ln3/a0;->D:I

    iput v0, p0, Ln3/a0$a;->u:I

    iget-boolean v0, p1, Ln3/a0;->E:Z

    iput-boolean v0, p0, Ln3/a0$a;->v:Z

    iget-boolean v0, p1, Ln3/a0;->F:Z

    iput-boolean v0, p0, Ln3/a0$a;->w:Z

    iget-boolean v0, p1, Ln3/a0;->G:Z

    iput-boolean v0, p0, Ln3/a0$a;->x:Z

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Ln3/a0;->I:Lcom/google/common/collect/s;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ln3/a0$a;->z:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Ln3/a0;->H:Lcom/google/common/collect/r;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Ln3/a0$a;->y:Ljava/util/HashMap;

    return-void
.end method

.method private static C([Ljava/lang/String;)Lcom/google/common/collect/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/collect/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object v0

    invoke-static {p0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    invoke-static {v3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lp3/n0;->D0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/common/collect/q$a;->f(Ljava/lang/Object;)Lcom/google/common/collect/q$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0
.end method

.method private F(Landroid/content/Context;)V
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "captioning"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x440

    iput v0, p0, Ln3/a0$a;->t:I

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lp3/n0;->X(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/common/collect/q;->A(Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object p1

    iput-object p1, p0, Ln3/a0$a;->s:Lcom/google/common/collect/q;

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic a(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->a:I

    return p0
.end method

.method static synthetic b(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->b:I

    return p0
.end method

.method static synthetic c(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->c:I

    return p0
.end method

.method static synthetic d(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->d:I

    return p0
.end method

.method static synthetic e(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->e:I

    return p0
.end method

.method static synthetic f(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->f:I

    return p0
.end method

.method static synthetic g(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->g:I

    return p0
.end method

.method static synthetic h(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->h:I

    return p0
.end method

.method static synthetic i(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->i:I

    return p0
.end method

.method static synthetic j(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->j:I

    return p0
.end method

.method static synthetic k(Ln3/a0$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln3/a0$a;->k:Z

    return p0
.end method

.method static synthetic l(Ln3/a0$a;)Lcom/google/common/collect/q;
    .locals 0

    iget-object p0, p0, Ln3/a0$a;->l:Lcom/google/common/collect/q;

    return-object p0
.end method

.method static synthetic m(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->m:I

    return p0
.end method

.method static synthetic n(Ln3/a0$a;)Lcom/google/common/collect/q;
    .locals 0

    iget-object p0, p0, Ln3/a0$a;->n:Lcom/google/common/collect/q;

    return-object p0
.end method

.method static synthetic o(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->o:I

    return p0
.end method

.method static synthetic p(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->p:I

    return p0
.end method

.method static synthetic q(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->q:I

    return p0
.end method

.method static synthetic r(Ln3/a0$a;)Lcom/google/common/collect/q;
    .locals 0

    iget-object p0, p0, Ln3/a0$a;->r:Lcom/google/common/collect/q;

    return-object p0
.end method

.method static synthetic s(Ln3/a0$a;)Lcom/google/common/collect/q;
    .locals 0

    iget-object p0, p0, Ln3/a0$a;->s:Lcom/google/common/collect/q;

    return-object p0
.end method

.method static synthetic t(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->t:I

    return p0
.end method

.method static synthetic u(Ln3/a0$a;)I
    .locals 0

    iget p0, p0, Ln3/a0$a;->u:I

    return p0
.end method

.method static synthetic v(Ln3/a0$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln3/a0$a;->v:Z

    return p0
.end method

.method static synthetic w(Ln3/a0$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln3/a0$a;->w:Z

    return p0
.end method

.method static synthetic x(Ln3/a0$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln3/a0$a;->x:Z

    return p0
.end method

.method static synthetic y(Ln3/a0$a;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Ln3/a0$a;->y:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic z(Ln3/a0$a;)Ljava/util/HashSet;
    .locals 0

    iget-object p0, p0, Ln3/a0$a;->z:Ljava/util/HashSet;

    return-object p0
.end method


# virtual methods
.method public A()Ln3/a0;
    .locals 1

    new-instance v0, Ln3/a0;

    invoke-direct {v0, p0}, Ln3/a0;-><init>(Ln3/a0$a;)V

    return-object v0
.end method

.method protected D(Ln3/a0;)Ln3/a0$a;
    .locals 0

    invoke-direct {p0, p1}, Ln3/a0$a;->B(Ln3/a0;)V

    return-object p0
.end method

.method public E(Landroid/content/Context;)Ln3/a0$a;
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-direct {p0, p1}, Ln3/a0$a;->F(Landroid/content/Context;)V

    :cond_0
    return-object p0
.end method

.method public G(IIZ)Ln3/a0$a;
    .locals 0

    iput p1, p0, Ln3/a0$a;->i:I

    iput p2, p0, Ln3/a0$a;->j:I

    iput-boolean p3, p0, Ln3/a0$a;->k:Z

    return-object p0
.end method

.method public H(Landroid/content/Context;Z)Ln3/a0$a;
    .locals 1

    invoke-static {p1}, Lp3/n0;->O(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p1

    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, v0, p1, p2}, Ln3/a0$a;->G(IIZ)Ln3/a0$a;

    move-result-object p1

    return-object p1
.end method
