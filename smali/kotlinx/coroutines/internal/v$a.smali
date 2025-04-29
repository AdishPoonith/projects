.class final Lkotlinx/coroutines/internal/v$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/internal/v;->a(Lda/l;Ljava/lang/Object;Lv9/g;)Lda/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lda/l<",
        "Ljava/lang/Throwable;",
        "Ls9/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic j:Lda/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lda/l<",
            "TE;",
            "Ls9/u;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic k:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic l:Lv9/g;


# direct methods
.method constructor <init>(Lda/l;Ljava/lang/Object;Lv9/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-TE;",
            "Ls9/u;",
            ">;TE;",
            "Lv9/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/internal/v$a;->j:Lda/l;

    iput-object p2, p0, Lkotlinx/coroutines/internal/v$a;->k:Ljava/lang/Object;

    iput-object p3, p0, Lkotlinx/coroutines/internal/v$a;->l:Lv9/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lkotlinx/coroutines/internal/v$a;->j:Lda/l;

    iget-object v0, p0, Lkotlinx/coroutines/internal/v$a;->k:Ljava/lang/Object;

    iget-object v1, p0, Lkotlinx/coroutines/internal/v$a;->l:Lv9/g;

    invoke-static {p1, v0, v1}, Lkotlinx/coroutines/internal/v;->b(Lda/l;Ljava/lang/Object;Lv9/g;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/v$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
