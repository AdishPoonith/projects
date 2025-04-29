.class final Ls0/g$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/g;->m(Lp0/j0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lda/p<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Ls9/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ls0/g$b;->j:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Integer;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Ls0/g$b;->c(Ljava/lang/Integer;Ljava/util/List;)V

    return-void
.end method

.method private static final c(Ljava/lang/Integer;Ljava/util/List;)V
    .locals 2

    const-string v0, "$processedEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ls0/g;->b()Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0, p0}, Lt9/n;->m(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ls0/g;->a:Ls0/g;

    const/4 v1, 0x5

    invoke-virtual {v0, p0, p1, v1}, Ls0/g;->g(Ljava/lang/Integer;Ljava/util/List;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    sget-object p1, Lf1/l0;->a:Lf1/l0;

    iget-object p1, p0, Ls0/g$b;->j:Ljava/util/List;

    new-instance v0, Ls0/h;

    invoke-direct {v0, p2, p1}, Ls0/h;-><init>(Ljava/lang/Integer;Ljava/util/List;)V

    invoke-static {v0}, Lf1/l0;->w0(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Ls0/g$b;->b(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
