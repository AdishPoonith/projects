.class final Lp1/y$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp1/y;->Q1(Landroidx/fragment/app/e;)Lda/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lda/l<",
        "Landroidx/activity/result/a;",
        "Ls9/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic j:Lp1/y;

.field final synthetic k:Landroidx/fragment/app/e;


# direct methods
.method constructor <init>(Lp1/y;Landroidx/fragment/app/e;)V
    .locals 0

    iput-object p1, p0, Lp1/y$b;->j:Lp1/y;

    iput-object p2, p0, Lp1/y$b;->k:Landroidx/fragment/app/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/activity/result/a;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/activity/result/a;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lp1/y$b;->j:Lp1/y;

    invoke-virtual {v0}, Lp1/y;->P1()Lp1/u;

    move-result-object v0

    sget-object v1, Lp1/u;->v:Lp1/u$c;

    invoke-virtual {v1}, Lp1/u$c;->b()I

    move-result v1

    invoke-virtual {p1}, Landroidx/activity/result/a;->b()I

    move-result v2

    invoke-virtual {p1}, Landroidx/activity/result/a;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lp1/u;->G(IILandroid/content/Intent;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp1/y$b;->k:Landroidx/fragment/app/e;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/activity/result/a;

    invoke-virtual {p0, p1}, Lp1/y$b;->a(Landroidx/activity/result/a;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
