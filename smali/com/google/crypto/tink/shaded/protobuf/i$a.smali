.class Lcom/google/crypto/tink/shaded/protobuf/i$a;
.super Lcom/google/crypto/tink/shaded/protobuf/i$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/crypto/tink/shaded/protobuf/i;->u()Lcom/google/crypto/tink/shaded/protobuf/i$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private j:I

.field private final k:I

.field final synthetic l:Lcom/google/crypto/tink/shaded/protobuf/i;


# direct methods
.method constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/i;)V
    .locals 1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->l:Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/i$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->j:I

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p1

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->k:I

    return-void
.end method


# virtual methods
.method public b()B
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->j:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->k:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->j:I

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->l:Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->s(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->j:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/i$a;->k:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
