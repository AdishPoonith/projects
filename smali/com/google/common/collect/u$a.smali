.class Lcom/google/common/collect/u$a;
.super Lcom/google/common/collect/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/u;->g(Ljava/util/Iterator;Lb5/o;)Lcom/google/common/collect/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic l:Ljava/util/Iterator;

.field final synthetic m:Lb5/o;


# direct methods
.method constructor <init>(Ljava/util/Iterator;Lb5/o;)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/collect/u$a;->l:Ljava/util/Iterator;

    iput-object p2, p0, Lcom/google/common/collect/u$a;->m:Lb5/o;

    invoke-direct {p0}, Lcom/google/common/collect/b;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lcom/google/common/collect/u$a;->l:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/common/collect/u$a;->l:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/collect/u$a;->m:Lb5/o;

    invoke-interface {v1, v0}, Lb5/o;->apply(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/common/collect/b;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
