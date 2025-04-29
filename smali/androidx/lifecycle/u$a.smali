.class final Landroidx/lifecycle/u$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/u;-><init>(Landroidx/savedstate/a;Landroidx/lifecycle/b0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lda/a<",
        "Landroidx/lifecycle/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic j:Landroidx/lifecycle/b0;


# direct methods
.method constructor <init>(Landroidx/lifecycle/b0;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/u$a;->j:Landroidx/lifecycle/b0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/v;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/u$a;->j:Landroidx/lifecycle/b0;

    invoke-static {v0}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/b0;)Landroidx/lifecycle/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/lifecycle/u$a;->a()Landroidx/lifecycle/v;

    move-result-object v0

    return-object v0
.end method
