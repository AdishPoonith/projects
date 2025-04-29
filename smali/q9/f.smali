.class public final synthetic Lq9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lq9/e$g;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq9/e$g;",
            ")",
            "Ljava/util/List<",
            "Lq9/e$j;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/q;->t()Lcom/google/common/collect/q$a;

    move-result-object v0

    iget-object v1, p0, Lq9/e$g;->e:Lq9/e$g$c;

    if-eqz v1, :cond_0

    new-instance v1, Lq9/e$k;

    invoke-direct {v1, p0}, Lq9/e$k;-><init>(Lq9/e$g;)V

    invoke-virtual {v0, v1}, Lcom/google/common/collect/q$a;->f(Ljava/lang/Object;)Lcom/google/common/collect/q$a;

    :cond_0
    iget-object v1, p0, Lq9/e$g;->f:Lq9/e$g$b;

    if-eqz v1, :cond_1

    new-instance v1, Lq9/e$f;

    invoke-direct {v1, p0}, Lq9/e$f;-><init>(Lq9/e$g;)V

    invoke-virtual {v0, v1}, Lcom/google/common/collect/q$a;->f(Ljava/lang/Object;)Lcom/google/common/collect/q$a;

    :cond_1
    invoke-virtual {v0}, Lcom/google/common/collect/q$a;->h()Lcom/google/common/collect/q;

    move-result-object p0

    return-object p0
.end method
