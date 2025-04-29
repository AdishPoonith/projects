.class Lcom/google/protobuf/m1$a;
.super Lcom/google/protobuf/i$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/m1;->D()Lcom/google/protobuf/i$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final j:Lcom/google/protobuf/m1$c;

.field k:Lcom/google/protobuf/i$g;

.field final synthetic l:Lcom/google/protobuf/m1;


# direct methods
.method constructor <init>(Lcom/google/protobuf/m1;)V
    .locals 2

    iput-object p1, p0, Lcom/google/protobuf/m1$a;->l:Lcom/google/protobuf/m1;

    invoke-direct {p0}, Lcom/google/protobuf/i$c;-><init>()V

    new-instance v0, Lcom/google/protobuf/m1$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/protobuf/m1$c;-><init>(Lcom/google/protobuf/i;Lcom/google/protobuf/m1$a;)V

    iput-object v0, p0, Lcom/google/protobuf/m1$a;->j:Lcom/google/protobuf/m1$c;

    invoke-direct {p0}, Lcom/google/protobuf/m1$a;->c()Lcom/google/protobuf/i$g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/m1$a;->k:Lcom/google/protobuf/i$g;

    return-void
.end method

.method private c()Lcom/google/protobuf/i$g;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/m1$a;->j:Lcom/google/protobuf/m1$c;

    invoke-virtual {v0}, Lcom/google/protobuf/m1$c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/m1$a;->j:Lcom/google/protobuf/m1$c;

    invoke-virtual {v0}, Lcom/google/protobuf/m1$c;->d()Lcom/google/protobuf/i$i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/i;->D()Lcom/google/protobuf/i$g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public b()B
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/m1$a;->k:Lcom/google/protobuf/i$g;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/protobuf/i$g;->b()B

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/m1$a;->k:Lcom/google/protobuf/i$g;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/google/protobuf/m1$a;->c()Lcom/google/protobuf/i$g;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/m1$a;->k:Lcom/google/protobuf/i$g;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/m1$a;->k:Lcom/google/protobuf/i$g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
