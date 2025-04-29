.class public final Ll6/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:Ld6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ld6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IZLd6/e;Ld6/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ld6/e<",
            "Lm6/l;",
            ">;",
            "Ld6/e<",
            "Lm6/l;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll6/j0;->a:I

    iput-boolean p2, p0, Ll6/j0;->b:Z

    iput-object p3, p0, Ll6/j0;->c:Ld6/e;

    iput-object p4, p0, Ll6/j0;->d:Ld6/e;

    return-void
.end method

.method public static a(ILj6/y1;)Ll6/j0;
    .locals 6

    new-instance v0, Ld6/e;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lm6/l;->b()Ljava/util/Comparator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ld6/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v1, Ld6/e;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lm6/l;->b()Ljava/util/Comparator;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ld6/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {p1}, Lj6/y1;->d()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj6/n;

    sget-object v4, Ll6/j0$a;->a:[I

    invoke-virtual {v3}, Lj6/n;->c()Lj6/n$a;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lj6/n;->b()Lm6/i;

    move-result-object v3

    invoke-interface {v3}, Lm6/i;->getKey()Lm6/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Ld6/e;->k(Ljava/lang/Object;)Ld6/e;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lj6/n;->b()Lm6/i;

    move-result-object v3

    invoke-interface {v3}, Lm6/i;->getKey()Lm6/l;

    move-result-object v3

    invoke-virtual {v0, v3}, Ld6/e;->k(Ljava/lang/Object;)Ld6/e;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v2, Ll6/j0;

    invoke-virtual {p1}, Lj6/y1;->k()Z

    move-result p1

    invoke-direct {v2, p0, p1, v0, v1}, Ll6/j0;-><init>(IZLd6/e;Ld6/e;)V

    return-object v2
.end method


# virtual methods
.method public b()Ld6/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/j0;->c:Ld6/e;

    return-object v0
.end method

.method public c()Ld6/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/j0;->d:Ld6/e;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Ll6/j0;->a:I

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Ll6/j0;->b:Z

    return v0
.end method
